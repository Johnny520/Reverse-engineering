package p029F0;

import me.dartcv.nuke.BuildConfig;
import p041H0.C0564I;
import p056K2.C0891q;
import p095T.AbstractC1391v;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p154e2.C2023b;

/* JADX INFO: renamed from: F0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411l0 extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1238e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0413m0 f1239f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0411l0(C0413m0 c0413m0, int i5) {
        super(2);
        this.f1238e = i5;
        this.f1239f = c0413m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1238e) {
            case 0:
                this.f1239f.m675a().f1172e = (AbstractC1391v) obj2;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0373K c0373kM675a = this.f1239f.m675a();
                ((C0564I) obj).m819c0(new C0369G(c0373kM675a, (InterfaceC1603e) obj2, c0373kM675a.f1186s));
                break;
            default:
                C0564I c0564i = (C0564I) obj;
                C0413m0 c0413m0 = this.f1239f;
                C2023b c2023b = c0413m0.f1242a;
                C0373K c0373k = c0564i.f1701L;
                if (c0373k == null) {
                    c0373k = new C0373K(c0564i, c2023b);
                    c0564i.f1701L = c0373k;
                }
                c0413m0.f1243b = c0373k;
                c0413m0.m675a().m622g();
                C0373K c0373kM675a2 = c0413m0.m675a();
                if (c0373kM675a2.f1173f != c2023b) {
                    c0373kM675a2.f1173f = c2023b;
                    c0373kM675a2.m623h(false);
                    C0564I.m790V(c0373kM675a2.f1171d, false, 7);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
