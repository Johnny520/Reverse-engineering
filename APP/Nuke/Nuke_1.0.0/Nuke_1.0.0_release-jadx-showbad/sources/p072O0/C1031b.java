package p072O0;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p153e1.C2015k;

/* JADX INFO: renamed from: O0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1031b extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C1031b f3211f;

    /* JADX INFO: renamed from: g */
    public static final C1031b f3212g;

    /* JADX INFO: renamed from: h */
    public static final C1031b f3213h;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3214e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 1;
        f3211f = new C1031b(i5, 0);
        f3212g = new C1031b(i5, 1);
        f3213h = new C1031b(i5, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1031b(int i5, int i6) {
        super(i5);
        this.f3214e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f3214e) {
            case 0:
                ((Number) obj).longValue();
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                return Integer.valueOf(((C1038i) obj).f3232b);
            default:
                C2015k c2015k = ((C1038i) obj).f3233c;
                return Integer.valueOf(c2015k.f6740d - c2015k.f6738b);
        }
    }
}
