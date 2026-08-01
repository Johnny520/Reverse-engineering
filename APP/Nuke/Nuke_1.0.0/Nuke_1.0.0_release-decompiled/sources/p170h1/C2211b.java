package p170h1;

import me.dartcv.nuke.BuildConfig;
import p028F.RunnableC0342c;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: h1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2211b extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C2211b f7204f;

    /* JADX INFO: renamed from: g */
    public static final C2211b f7205g;

    /* JADX INFO: renamed from: h */
    public static final C2211b f7206h;

    /* JADX INFO: renamed from: i */
    public static final C2211b f7207i;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7208e;

    static {
        int i5 = 1;
        f7204f = new C2211b(i5, 0);
        f7205g = new C2211b(i5, 1);
        f7206h = new C2211b(i5, 2);
        f7207i = new C2211b(i5, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2211b(int i5, int i6) {
        super(i5);
        this.f7208e = i6;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f7208e) {
            case 0:
                AbstractC2218i abstractC2218i = (AbstractC2218i) obj;
                abstractC2218i.getHandler().post(new RunnableC0342c(abstractC2218i.f7248u, 4));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C0891q.f2780a;
    }
}
