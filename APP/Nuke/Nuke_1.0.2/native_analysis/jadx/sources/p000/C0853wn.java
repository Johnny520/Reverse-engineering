package p000;

/* JADX INFO: renamed from: wn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853wn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12594a;

    /* JADX INFO: renamed from: a */
    public final int m5944a(Object obj) {
        switch (this.f12594a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5945b() {
        switch (this.f12594a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5946c() {
        switch (this.f12594a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
