package p165;

import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p033.AbstractC6325;
import p305.InterfaceC8627;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC6325 f20825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8627 f20826;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f20829;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C7673 f20821 = new C7673(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C7673 f20822 = new C7673(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C7673 f20818 = new C7673(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7673 f20817 = new C7673(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C7673 f20819 = new C7673(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7673 f20820 = new C7673(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f20828 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f20827 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20824 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f20823 = -3.4028235E38f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f20830 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f20831 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f20832 = new ArrayList();

    public AbstractC7670(InterfaceC8627 interfaceC8627, AbstractC6325 abstractC6325) {
        this.f20826 = interfaceC8627;
        this.f20825 = abstractC6325;
        if (abstractC6325 == f20818 || abstractC6325 == f20817 || abstractC6325 == f20819) {
            this.f20829 = 0.1f;
            return;
        }
        if (abstractC6325 == f20820) {
            this.f20829 = 0.00390625f;
        } else if (abstractC6325 == f20821 || abstractC6325 == f20822) {
            this.f20829 = 0.002f;
        } else {
            this.f20829 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7674 m12952() {
        ThreadLocal threadLocal = C7674.f20834;
        if (threadLocal.get() == null) {
            threadLocal.set(new C7674(new C4870(19)));
        }
        return (C7674) threadLocal.get();
    }

    public void removeEndListener(InterfaceC7672 interfaceC7672) {
        ArrayList arrayList = this.f20831;
        int iIndexOf = arrayList.indexOf(interfaceC7672);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(InterfaceC7671 interfaceC7671) {
        ArrayList arrayList = this.f20832;
        int iIndexOf = arrayList.indexOf(interfaceC7671);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12953(float f) {
        this.f20825.mo7073(this.f20826, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20832;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                C2941.m6336();
                return;
            }
            i++;
        }
    }
}
