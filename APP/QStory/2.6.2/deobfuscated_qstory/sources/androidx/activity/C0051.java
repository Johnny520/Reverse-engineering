package androidx.activity;

import p052.InterfaceC6542;
import p144.C7551;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0051 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f106;

    public /* synthetic */ C0051(Object obj, int i) {
        this.f106 = i;
        this.f105 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f106;
        Object obj = this.f105;
        switch (i) {
            case 0:
                C7551 c7551 = new C7551();
                ((DialogC0043) obj).getNavigationEventDispatcher().m12757(c7551);
                return c7551;
            case 1:
                return new C0023(new RunnableC0049((DialogC0043) obj, 1));
            default:
                return new C0030((C0023) obj);
        }
    }
}
