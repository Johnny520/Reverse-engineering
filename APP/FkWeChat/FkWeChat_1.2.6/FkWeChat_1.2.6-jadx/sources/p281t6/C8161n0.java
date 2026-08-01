package p281t6;

/* JADX INFO: renamed from: t6.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8161n0 extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8161n0(String str) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        str.getClass();
    }
}
