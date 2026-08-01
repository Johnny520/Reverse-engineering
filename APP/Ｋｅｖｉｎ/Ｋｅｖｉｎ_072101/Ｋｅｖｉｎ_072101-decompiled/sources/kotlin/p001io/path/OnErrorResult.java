package kotlin.p001io.path;

/* JADX INFO: compiled from: OnErrorResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m115d2 = {"Lkotlin/io/path/OnErrorResult;", "", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public enum OnErrorResult extends java.lang.Enum<kotlin.p001io.path.OnErrorResult> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.p001io.path.OnErrorResult[] $VALUES = null;
    public static final kotlin.p001io.path.OnErrorResult SKIP_SUBTREE = null;
    public static final kotlin.p001io.path.OnErrorResult TERMINATE = null;

    private static final /* synthetic */ kotlin.p001io.path.OnErrorResult[] $values() {
            kotlin.io.path.OnErrorResult r0 = kotlin.p001io.path.OnErrorResult.SKIP_SUBTREE
            kotlin.io.path.OnErrorResult r1 = kotlin.p001io.path.OnErrorResult.TERMINATE
            kotlin.io.path.OnErrorResult[] r0 = new kotlin.p001io.path.OnErrorResult[]{r0, r1}
            return r0
    }

    static {
            kotlin.io.path.OnErrorResult r0 = new kotlin.io.path.OnErrorResult
            java.lang.String r1 = "SKIP_SUBTREE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.p001io.path.OnErrorResult.SKIP_SUBTREE = r0
            kotlin.io.path.OnErrorResult r0 = new kotlin.io.path.OnErrorResult
            java.lang.String r1 = "TERMINATE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.p001io.path.OnErrorResult.TERMINATE = r0
            kotlin.io.path.OnErrorResult[] r0 = $values()
            kotlin.p001io.path.OnErrorResult.$VALUES = r0
            kotlin.io.path.OnErrorResult[] r0 = kotlin.p001io.path.OnErrorResult.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.p001io.path.OnErrorResult.$ENTRIES = r0
            return
    }

    OnErrorResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.p001io.path.OnErrorResult> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.p001io.path.OnErrorResult.$ENTRIES
            return r0
    }

    public static kotlin.p001io.path.OnErrorResult valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.path.OnErrorResult> r0 = kotlin.p001io.path.OnErrorResult.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.path.OnErrorResult r0 = (kotlin.p001io.path.OnErrorResult) r0
            return r0
    }

    public static kotlin.p001io.path.OnErrorResult[] values() {
            kotlin.io.path.OnErrorResult[] r0 = kotlin.p001io.path.OnErrorResult.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.path.OnErrorResult[] r0 = (kotlin.p001io.path.OnErrorResult[]) r0
            return r0
    }
}
