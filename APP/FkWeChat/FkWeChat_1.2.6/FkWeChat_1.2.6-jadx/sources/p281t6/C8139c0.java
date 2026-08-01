package p281t6;

/* JADX INFO: renamed from: t6.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8139c0 extends IllegalArgumentException {

    /* JADX INFO: renamed from: q */
    public final String f27218q;

    /* JADX INFO: renamed from: r */
    public final int f27219r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8139c0(String str, int i10) {
        super("Header value '" + str + "' contains illegal character '" + str.charAt(i10) + "' (code " + (str.charAt(i10) & 255) + ')');
        str.getClass();
        this.f27218q = str;
        this.f27219r = i10;
    }
}
