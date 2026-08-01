package androidx.activity;

import p068.InterfaceC7372;
import p160.C8381;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0898 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f450;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f451;

    public /* synthetic */ C0898(Object obj, int i) {
        this.f451 = i;
        this.f450 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f451;
        Object obj = this.f450;
        switch (i) {
            case 0:
                C8381 c8381 = new C8381();
                ((DialogC0890) obj).getNavigationEventDispatcher().m13345(c8381);
                return c8381;
            case 1:
                return new C0870(new RunnableC0896((DialogC0890) obj, 1));
            default:
                return new C0877((C0870) obj);
        }
    }
}
