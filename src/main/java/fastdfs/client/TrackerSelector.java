package fastdfs.client;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 选择tracker策略
 */
public enum TrackerSelector {

    ROUND_ROBIN {
        private final ThreadLocalIndex threadLocalIndex = new ThreadLocalIndex();

        @Override
        public TrackerServer select(List<TrackerServer> list) {
            return list.get(threadLocalIndex.getAndIncrement(list.size()));
        }

    },
    ROUND_ROBIN1 {
        private int idx;

        @Override
        public TrackerServer select(List<TrackerServer> list) {
            idx %= list.size();
            return list.get(idx++);
        }
    },
    RANDOM {
        private final ThreadLocalRandom random = ThreadLocalRandom.current();

        @Override
        public TrackerServer select(List<TrackerServer> list) {
            return list.get(random.nextInt(list.size()));
        }

    },
    FIRST {
        @Override
        TrackerServer select(List<TrackerServer> list) {
            return list.get(0);
        }

    };

    abstract TrackerServer select(List<TrackerServer> list);
}