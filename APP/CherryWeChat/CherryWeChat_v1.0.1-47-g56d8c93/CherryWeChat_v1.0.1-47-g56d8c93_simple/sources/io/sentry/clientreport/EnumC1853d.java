package io.sentry.clientreport;

/* JADX INFO: renamed from: io.sentry.clientreport.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1853d extends Enum {
    private static final /* synthetic */ EnumC1853d[] $VALUES = null;
    public static final EnumC1853d BACKPRESSURE = null;
    public static final EnumC1853d BEFORE_SEND = null;
    public static final EnumC1853d CACHE_OVERFLOW = null;
    public static final EnumC1853d EVENT_PROCESSOR = null;
    public static final EnumC1853d NETWORK_ERROR = null;
    public static final EnumC1853d QUEUE_OVERFLOW = null;
    public static final EnumC1853d RATELIMIT_BACKOFF = null;
    public static final EnumC1853d SAMPLE_RATE = null;
    private final String reason;

    private static /* synthetic */ EnumC1853d[] $values() {
        return new EnumC1853d[]{QUEUE_OVERFLOW, CACHE_OVERFLOW, RATELIMIT_BACKOFF, NETWORK_ERROR, SAMPLE_RATE, BEFORE_SEND, EVENT_PROCESSOR, BACKPRESSURE};
    }

    static {
        QUEUE_OVERFLOW = new EnumC1853d("QUEUE_OVERFLOW", 0, "queue_overflow");
        CACHE_OVERFLOW = new EnumC1853d("CACHE_OVERFLOW", 1, "cache_overflow");
        RATELIMIT_BACKOFF = new EnumC1853d("RATELIMIT_BACKOFF", 2, "ratelimit_backoff");
        NETWORK_ERROR = new EnumC1853d("NETWORK_ERROR", 3, "network_error");
        SAMPLE_RATE = new EnumC1853d("SAMPLE_RATE", 4, "sample_rate");
        BEFORE_SEND = new EnumC1853d("BEFORE_SEND", 5, "before_send");
        EVENT_PROCESSOR = new EnumC1853d("EVENT_PROCESSOR", 6, "event_processor");
        BACKPRESSURE = new EnumC1853d("BACKPRESSURE", 7, "backpressure");
        $VALUES = $values();
    }

    EnumC1853d(String r1, int r2, String r3) {
        this.reason = r3;
    }

    public static EnumC1853d valueOf(String r1) {
        return (EnumC1853d) Enum.valueOf(EnumC1853d.class, r1);
    }

    public static EnumC1853d[] values() {
        return (EnumC1853d[]) $VALUES.clone();
    }

    public String getReason() {
        return this.reason;
    }
}
