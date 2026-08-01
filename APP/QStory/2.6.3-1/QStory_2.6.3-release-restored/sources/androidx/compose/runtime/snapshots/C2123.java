package androidx.compose.runtime.snapshots;

import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2123 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f4114;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f4115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4116;

    public /* synthetic */ C2123(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, int i) {
        this.f4116 = i;
        this.f4114 = interfaceC7387;
        this.f4115 = interfaceC73872;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f4116;
        C6008 c6008 = C6008.f15084;
        InterfaceC7387 interfaceC7387 = this.f4115;
        InterfaceC7387 interfaceC73872 = this.f4114;
        switch (i) {
            case 0:
                interfaceC73872.invoke(obj);
                interfaceC7387.invoke(obj);
                break;
            default:
                interfaceC73872.invoke(obj);
                interfaceC7387.invoke(obj);
                break;
        }
        return c6008;
    }
}
