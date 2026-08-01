package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: cj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094cj extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: e */
    public static final C0094cj f819e;

    /* JADX INFO: renamed from: f */
    public static final C0094cj f820f;

    /* JADX INFO: renamed from: g */
    public static final C0094cj f821g;

    /* JADX INFO: renamed from: h */
    public static final C0094cj f822h;

    /* JADX INFO: renamed from: i */
    public static final C0094cj f823i;

    /* JADX INFO: renamed from: j */
    public static final C0094cj f824j;

    /* JADX INFO: renamed from: k */
    public static final C0094cj f825k;

    /* JADX INFO: renamed from: l */
    public static final C0094cj f826l;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f827d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f819e = new C0094cj(i, 0);
        f820f = new C0094cj(i, 1);
        f821g = new C0094cj(i, 2);
        f822h = new C0094cj(i, 3);
        f823i = new C0094cj(i, 4);
        f824j = new C0094cj(i, 5);
        f825k = new C0094cj(i, 6);
        f826l = new C0094cj(i, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0094cj(int i, int i2) {
        super(i);
        this.f827d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        switch (this.f827d) {
            case 0:
                AbstractC0131dj.m716b("LocalViewConfiguration");
                throw null;
            case 1:
                AbstractC0131dj.m716b("LocalWindowInfo");
                throw null;
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.FALSE;
            case 4:
                return new b60(3);
            case 5:
                return new C0161e6(new PathMeasure());
            case 6:
                return null;
            default:
                return na1.f4229a;
        }
    }
}
