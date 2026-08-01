package p167;

import java.util.ArrayList;
import java.util.List;
import p180.C8494;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20901;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8494 f20903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8494 f20904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8414 f20905;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f20906 = new ArrayList();

    public C8416(C8414 c8414, ArrayList arrayList) {
        C8494 c8494 = C8494.f21151;
        this.f20904 = c8494;
        this.f20903 = c8494;
        m13377(arrayList, false);
        m13377(arrayList, true);
        ArrayList arrayList2 = c8414.f20897;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            C8494 c84942 = c8414.f20896;
            C8494 c84943 = c8414.f20895;
            this.f20904 = c84942;
            this.f20903 = c84943;
            m13375();
            m13376(c8414.f20894);
        }
        this.f20905 = c8414;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13375() {
        ArrayList arrayList = this.f20906;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        AbstractC8418 abstractC8418 = (AbstractC8418) arrayList.get(size);
        C8494 c8494 = this.f20904;
        C8494 c84942 = this.f20903;
        abstractC8418.f20917 = c8494;
        abstractC8418.f20916 = c84942;
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13376(int i) {
        ArrayList arrayList = this.f20906;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC8418 abstractC8418 = (AbstractC8418) arrayList.get(size);
            if (!abstractC8418.f20914 && abstractC8418.f20913 != i) {
                abstractC8418.f20913 = i;
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13377(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC8418 abstractC8418 = (AbstractC8418) list.get(i);
            abstractC8418.getClass();
            if (true == z) {
                C8416 c8416 = abstractC8418.f20915;
                if (c8416 != null) {
                    throw new IllegalStateException(abstractC8418 + " (" + (i + 1) + "/" + size + ") is already controlled by " + c8416 + " but is still added to " + this);
                }
                abstractC8418.f20915 = this;
                this.f20906.add(abstractC8418);
            }
        }
    }
}
