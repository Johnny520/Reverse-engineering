package io.sentry;

/* JADX INFO: renamed from: io.sentry.n */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1929n {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC1929n(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
