package androidx.compose.runtime.snapshots;

import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1288 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f3769;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f3770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3771;

    public /* synthetic */ C1288(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, int i) {
        this.f3771 = i;
        this.f3769 = interfaceC6558;
        this.f3770 = interfaceC65582;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f3771;
        C5176 c5176 = C5176.f14739;
        InterfaceC6558 interfaceC6558 = this.f3770;
        InterfaceC6558 interfaceC65582 = this.f3769;
        switch (i) {
            case 0:
                interfaceC65582.invoke(obj);
                interfaceC6558.invoke(obj);
                break;
            default:
                interfaceC65582.invoke(obj);
                interfaceC6558.invoke(obj);
                break;
        }
        return c5176;
    }
}
