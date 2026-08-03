package p331wa;

/* JADX INFO: renamed from: wa.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4695f {

    /* JADX INFO: renamed from: a */
    public final String f15679a;

    /* JADX INFO: renamed from: b */
    public final int f15680b;

    /* JADX INFO: renamed from: c */
    public final Object f15681c;

    /* JADX INFO: renamed from: d */
    public final Object f15682d;

    /* JADX INFO: renamed from: e */
    public final byte[] f15683e;

    /* JADX INFO: renamed from: f */
    public final long f15684f = System.currentTimeMillis();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4695f(String str, int i9, Object obj, Object obj2, byte[] bArr) {
        this.f15679a = str;
        this.f15680b = i9;
        this.f15681c = obj;
        this.f15682d = obj2;
        this.f15683e = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m9214a() {
        return this.f15680b + "|" + this.f15679a + "|" + this.f15684f;
    }
}
