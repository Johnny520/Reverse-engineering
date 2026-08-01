package androidx.activity;

import p052.InterfaceC6543;
import p144.C7552;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0051 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f106;

    public /* synthetic */ C0051(Object obj, int i) {
        this.f106 = i;
        this.f105 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f106;
        Object obj = this.f105;
        switch (i) {
            case 0:
                C7552 c7552 = new C7552();
                ((DialogC0043) obj).getNavigationEventDispatcher().m12786(c7552);
                return c7552;
            case 1:
                return new C0023(new RunnableC0049((DialogC0043) obj, 1));
            default:
                return new C0030((C0023) obj);
        }
    }
}
