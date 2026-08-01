package p029F0;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: F0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397e0 extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1219e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0391b0 f1220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0397e0(AbstractC0391b0 abstractC0391b0, int i5) {
        super(1);
        this.f1219e = i5;
        this.f1220f = abstractC0391b0;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1219e) {
            case 0:
                AbstractC0389a0.m661l((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            case 2:
                AbstractC0389a0.m660k((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            case 3:
                AbstractC0389a0.m660k((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            case 4:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            case 5:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
            default:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, this.f1220f, 0, 0);
                break;
        }
        return C0891q.f2780a;
    }
}
