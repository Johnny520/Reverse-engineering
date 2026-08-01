package p197m;

import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p203n.AbstractC2649d;
import p203n.C2665l;
import p203n.C2669n;
import p211o0.AbstractC2767z;
import p211o0.C2741P;
import p211o0.C2762u;
import p217p0.C2873d;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2543c extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C2543c f8115f;

    /* JADX INFO: renamed from: g */
    public static final C2543c f8116g;

    /* JADX INFO: renamed from: h */
    public static final C2543c f8117h;

    /* JADX INFO: renamed from: i */
    public static final C2543c f8118i;

    /* JADX INFO: renamed from: j */
    public static final C2543c f8119j;

    /* JADX INFO: renamed from: k */
    public static final C2543c f8120k;

    /* JADX INFO: renamed from: l */
    public static final C2543c f8121l;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8122e;

    static {
        int i5 = 1;
        f8115f = new C2543c(i5, 0);
        f8116g = new C2543c(i5, 1);
        f8117h = new C2543c(i5, 2);
        f8118i = new C2543c(i5, 3);
        f8119j = new C2543c(i5, 4);
        f8120k = new C2543c(i5, 5);
        f8121l = new C2543c(i5, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2543c(int i5, int i6) {
        super(i5);
        this.f8122e = i6;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f8122e) {
            case 0:
                return obj;
            case BuildConfig.VERSION_CODE /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                long jM4919a = C2762u.m4919a(((C2762u) obj).f8764a, C2873d.f9094x);
                return new C2669n(C2762u.m4922d(jM4919a), C2762u.m4926h(jM4919a), C2762u.m4925g(jM4919a), C2762u.m4923e(jM4919a));
            case 3:
                long j5 = ((C2741P) obj).f8722a;
                return new C2665l(C2741P.m4807b(j5), C2741P.m4808c(j5));
            case 4:
                C2665l c2665l = (C2665l) obj;
                return new C2741P(AbstractC2767z.m4938h(c2665l.f8486a, c2665l.f8487b));
            case 5:
                return AbstractC2649d.m4617j(0.0f, 0.0f, null, 7);
            default:
                return AbstractC2523H.f8065c;
        }
    }
}
