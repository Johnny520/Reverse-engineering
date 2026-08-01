package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;
import p112.C7328;
import p121.C7388;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0795 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0814 f2274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0827 f2275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2276;

    public /* synthetic */ C0795(C0814 c0814, InterfaceC0827 interfaceC0827, int i) {
        this.f2276 = i;
        this.f2274 = c0814;
        this.f2275 = interfaceC0827;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2276;
        int i2 = 0;
        InterfaceC0827 interfaceC0827 = this.f2275;
        C0814 c0814 = this.f2274;
        switch (i) {
            case 0:
                C0796 c0796 = c0814.f2320;
                C0794 c0794 = new C0794(interfaceC0827, 0);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c0814.f2321.m2246("dataBuilder", c0796, new C0793(ref$ObjectRef, i2, c0794));
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    return (C7388) t;
                }
                AbstractC4395.m8908("result");
                throw null;
            case 1:
                C0796 c07962 = c0814.f2327;
                C0795 c0795 = new C0795(c0814, interfaceC0827, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                c0814.f2321.m2246("positioner", c07962, new C0793(ref$ObjectRef2, i2, c0795));
                T t2 = ref$ObjectRef2.element;
                if (t2 != 0) {
                    return (C7328) t2;
                }
                AbstractC4395.m8908("result");
                throw null;
            default:
                Object objInvoke = c0814.f2323.invoke();
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) (((InterfaceC1695) objInvoke).mo3086() ? objInvoke : null);
                return interfaceC1695 == null ? C7328.f19536 : interfaceC0827.mo1641(interfaceC1695).m12524(interfaceC1695.mo3076(0L));
        }
    }
}
