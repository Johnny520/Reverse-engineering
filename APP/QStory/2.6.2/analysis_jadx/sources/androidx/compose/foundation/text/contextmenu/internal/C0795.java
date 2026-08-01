package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6542;
import p112.C7327;
import p121.C7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0795 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0814 f2273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0827 f2274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2275;

    public /* synthetic */ C0795(C0814 c0814, InterfaceC0827 interfaceC0827, int i) {
        this.f2275 = i;
        this.f2273 = c0814;
        this.f2274 = interfaceC0827;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2275;
        int i2 = 0;
        InterfaceC0827 interfaceC0827 = this.f2274;
        C0814 c0814 = this.f2273;
        switch (i) {
            case 0:
                C0796 c0796 = c0814.f2319;
                C0794 c0794 = new C0794(interfaceC0827, 0);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                c0814.f2320.m2236("dataBuilder", c0796, new C0793(ref$ObjectRef, i2, c0794));
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    return (C7387) t;
                }
                AbstractC4394.m8918("result");
                throw null;
            case 1:
                C0796 c07962 = c0814.f2326;
                C0795 c0795 = new C0795(c0814, interfaceC0827, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                c0814.f2320.m2236("positioner", c07962, new C0793(ref$ObjectRef2, i2, c0795));
                T t2 = ref$ObjectRef2.element;
                if (t2 != 0) {
                    return (C7327) t2;
                }
                AbstractC4394.m8918("result");
                throw null;
            default:
                Object objInvoke = c0814.f2322.invoke();
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) (((InterfaceC1695) objInvoke).mo3076() ? objInvoke : null);
                return interfaceC1695 == null ? C7327.f19541 : interfaceC0827.mo1631(interfaceC1695).m12497(interfaceC1695.mo3066(0L));
        }
    }
}
