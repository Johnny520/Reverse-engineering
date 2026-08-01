package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: e */
    public static final g70 f1875e = new g70(0);

    /* JADX INFO: renamed from: f */
    public static final g70 f1876f = new g70(1);

    /* JADX INFO: renamed from: g */
    public static final g70 f1877g = new g70(2);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1878d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [g70.<clinit>():void] */
    public /* synthetic */ g70(int i) {
        this.f1878d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        switch (this.f1878d) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                if (p30.m3002l(obj, Boolean.FALSE)) {
                    return new C0207ff(C0207ff.f1707g);
                }
                obj.getClass();
                return new C0207ff(p30.m2992b(((Integer) obj).intValue()));
        }
    }
}
