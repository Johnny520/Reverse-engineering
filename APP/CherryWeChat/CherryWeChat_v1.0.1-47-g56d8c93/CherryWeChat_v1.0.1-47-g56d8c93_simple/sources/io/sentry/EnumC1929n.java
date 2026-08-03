package io.sentry;

/* JADX INFO: renamed from: io.sentry.n */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1929n extends Enum {
    private static final /* synthetic */ EnumC1929n[] $VALUES = null;
    public static final EnumC1929n All = null;
    public static final EnumC1929n Attachment = null;
    public static final EnumC1929n Default = null;
    public static final EnumC1929n Error = null;
    public static final EnumC1929n Feedback = null;
    public static final EnumC1929n LogItem = null;
    public static final EnumC1929n Monitor = null;
    public static final EnumC1929n Profile = null;
    public static final EnumC1929n ProfileChunkUi = null;
    public static final EnumC1929n Replay = null;
    public static final EnumC1929n Security = null;
    public static final EnumC1929n Session = null;
    public static final EnumC1929n Span = null;
    public static final EnumC1929n Transaction = null;
    public static final EnumC1929n Unknown = null;
    public static final EnumC1929n UserReport = null;
    private final String category;

    private static /* synthetic */ EnumC1929n[] $values() {
        return new EnumC1929n[]{All, Default, Error, Feedback, Session, Attachment, LogItem, Monitor, Profile, ProfileChunkUi, Transaction, Replay, Span, Security, UserReport, Unknown};
    }

    static {
        All = new EnumC1929n("All", 0, "__all__");
        Default = new EnumC1929n("Default", 1, "default");
        Error = new EnumC1929n("Error", 2, "error");
        Feedback = new EnumC1929n("Feedback", 3, "feedback");
        Session = new EnumC1929n("Session", 4, "session");
        Attachment = new EnumC1929n("Attachment", 5, "attachment");
        LogItem = new EnumC1929n("LogItem", 6, "log_item");
        Monitor = new EnumC1929n("Monitor", 7, "monitor");
        Profile = new EnumC1929n("Profile", 8, "profile");
        ProfileChunkUi = new EnumC1929n("ProfileChunkUi", 9, "profile_chunk_ui");
        Transaction = new EnumC1929n("Transaction", 10, "transaction");
        Replay = new EnumC1929n("Replay", 11, "replay");
        Span = new EnumC1929n("Span", 12, "span");
        Security = new EnumC1929n("Security", 13, "security");
        UserReport = new EnumC1929n("UserReport", 14, "user_report");
        Unknown = new EnumC1929n("Unknown", 15, "unknown");
        $VALUES = $values();
    }

    EnumC1929n(String r1, int r2, String r3) {
        this.category = r3;
    }

    public static EnumC1929n valueOf(String r1) {
        return (EnumC1929n) Enum.valueOf(EnumC1929n.class, r1);
    }

    public static EnumC1929n[] values() {
        return (EnumC1929n[]) $VALUES.clone();
    }

    public String getCategory() {
        return this.category;
    }
}
