package p165;

import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p251.AbstractC8175;
import p305.InterfaceC8619;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7671 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC8175 f20820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8619 f20821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f20824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C7674 f20816 = new C7674(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C7674 f20817 = new C7674(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C7674 f20813 = new C7674(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7674 f20812 = new C7674(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C7674 f20814 = new C7674(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7674 f20815 = new C7674(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f20823 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f20822 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20819 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f20818 = -3.4028235E38f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f20825 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f20826 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f20827 = new ArrayList();

    public AbstractC7671(InterfaceC8619 interfaceC8619, AbstractC8175 abstractC8175) {
        this.f20821 = interfaceC8619;
        this.f20820 = abstractC8175;
        if (abstractC8175 == f20813 || abstractC8175 == f20812 || abstractC8175 == f20814) {
            this.f20824 = 0.1f;
            return;
        }
        if (abstractC8175 == f20815) {
            this.f20824 = 0.00390625f;
        } else if (abstractC8175 == f20816 || abstractC8175 == f20817) {
            this.f20824 = 0.002f;
        } else {
            this.f20824 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7675 m12981() {
        ThreadLocal threadLocal = C7675.f20829;
        if (threadLocal.get() == null) {
            threadLocal.set(new C7675(new C4871(19)));
        }
        return (C7675) threadLocal.get();
    }

    public void removeEndListener(InterfaceC7673 interfaceC7673) {
        ArrayList arrayList = this.f20826;
        int iIndexOf = arrayList.indexOf(interfaceC7673);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(InterfaceC7672 interfaceC7672) {
        ArrayList arrayList = this.f20827;
        int iIndexOf = arrayList.indexOf(interfaceC7672);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12982(float f) {
        this.f20820.mo7060(this.f20821, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20827;
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
                C2942.m6394();
                return;
            }
            i++;
        }
    }
}
