package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0954;
import androidx.appcompat.widget.C1037;
import androidx.compose.animation.core.C1171;
import androidx.fragment.app.C3141;
import com.alibaba.fastjson2.C3775;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import p050.AbstractC7173;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3326 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3325 f7810;

    public C3326(C3327 c3327, AbstractC3283... abstractC3283Arr) {
        List listAsList = Arrays.asList(abstractC3283Arr);
        this.f7810 = new C3325(this, c3327);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            m5497((AbstractC3283) it.next());
        }
        boolean z = ((ConcatAdapter$Config$StableIdMode) this.f7810.f7809) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS;
        if (this.f7643.m5374()) {
            C6755.m11870("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7642 = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5352(int i) {
        int iValueAt;
        C3325 c3325 = this.f7810;
        C1037 c1037M5492 = c3325.m5492(i);
        C3294 c3294 = (C3294) c1037M5492.f1088;
        int i2 = c1037M5492.f1090;
        C1171 c1171 = c3294.f7679;
        int iMo5352 = c3294.f7677.mo5352(i2);
        SparseIntArray sparseIntArray = (SparseIntArray) c1171.f1440;
        int iIndexOfKey = sparseIntArray.indexOfKey(iMo5352);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            C0954 c0954 = (C0954) c1171.f1438;
            C3294 c32942 = (C3294) c1171.f1439;
            int i3 = c0954.f659;
            c0954.f659 = i3 + 1;
            ((SparseArray) c0954.f660).put(i3, c32942);
            sparseIntArray.put(iMo5352, i3);
            ((SparseIntArray) c1171.f1441).put(i3, iMo5352);
            iValueAt = i3;
        }
        c1037M5492.f1089 = false;
        c1037M5492.f1088 = null;
        c1037M5492.f1090 = -1;
        c3325.f7802 = c1037M5492;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo5353(int i) {
        C3325 c3325 = this.f7810;
        C1037 c1037M5492 = c3325.m5492(i);
        C3294 c3294 = (C3294) c1037M5492.f1088;
        long jMo5454 = c3294.f7678.mo5454(c3294.f7677.mo5353(c1037M5492.f1090));
        c1037M5492.f1089 = false;
        c1037M5492.f1088 = null;
        c1037M5492.f1090 = -1;
        c3325.f7802 = c1037M5492;
        return jMo5454;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        Iterator it = ((ArrayList) this.f7810.f7804).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C3294) it.next()).f7675;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo5355(AbstractC3283 abstractC3283, AbstractC3317 abstractC3317, int i) {
        C3325 c3325 = this.f7810;
        C3294 c3294 = (C3294) ((IdentityHashMap) c3325.f7803).get(abstractC3317);
        if (c3294 == null) {
            return -1;
        }
        AbstractC3283 abstractC32832 = c3294.f7677;
        int iM5494 = i - c3325.m5494(c3294);
        int iMo5354 = abstractC32832.mo5354();
        if (iM5494 >= 0 && iM5494 < iMo5354) {
            return abstractC32832.mo5355(abstractC3283, abstractC3317, iM5494);
        }
        C3141.m4912(AbstractC0900.m709(iM5494, iMo5354, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"), abstractC3317, "adapter:", abstractC3283);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m5497(AbstractC3283 abstractC3283) {
        C3325 c3325 = this.f7810;
        ArrayList arrayList = (ArrayList) c3325.f7804;
        int size = arrayList.size();
        if (size < 0 || size > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
        }
        if (((ConcatAdapter$Config$StableIdMode) c3325.f7809) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            AbstractC7173.m12431("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", abstractC3283.f7642);
        } else if (abstractC3283.f7642) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int size2 = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                i = -1;
                break;
            } else if (((C3294) arrayList.get(i)).f7677 == abstractC3283) {
                break;
            } else {
                i++;
            }
        }
        if ((i == -1 ? null : (C3294) arrayList.get(i)) != null) {
            return;
        }
        C3294 c3294 = new C3294(abstractC3283, c3325, (C0954) c3325.f7806, ((InterfaceC3311) c3325.f7808).mo5423());
        arrayList.add(size, c3294);
        Iterator it = ((ArrayList) c3325.f7805).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                abstractC3283.mo5368(recyclerView);
            }
        }
        if (c3294.f7675 > 0) {
            ((C3326) c3325.f7807).m5367(c3325.m5494(c3294), c3294.f7675);
        }
        c3325.m5495();
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo5357(RecyclerView recyclerView) {
        C3325 c3325 = this.f7810;
        ArrayList arrayList = (ArrayList) c3325.f7805;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = ((ArrayList) c3325.f7804).iterator();
        while (it.hasNext()) {
            ((C3294) it.next()).f7677.mo5357(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        C3294 c3294 = (C3294) ((SparseArray) ((C0954) this.f7810.f7806).f660).get(i);
        if (c3294 == null) {
            C6755.m11869(AbstractC7012.m12147(i, "Cannot find the wrapper for global view type "));
            return null;
        }
        C1171 c1171 = c3294.f7679;
        SparseIntArray sparseIntArray = (SparseIntArray) c1171.f1441;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return c3294.f7677.mo5358(sparseIntArray.valueAt(iIndexOfKey), viewGroup);
        }
        C3775.m6967(((C3294) c1171.f1439).f7677, AbstractC0900.m710(i, "requested global type ", " does not belong to the adapter:"));
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5359(AbstractC3317 abstractC3317) {
        this.f7810.m5490(abstractC3317).f7677.mo5359(abstractC3317);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo5360(AbstractC3317 abstractC3317) {
        C3325 c3325 = this.f7810;
        IdentityHashMap identityHashMap = (IdentityHashMap) c3325.f7803;
        C3294 c3294 = (C3294) identityHashMap.get(abstractC3317);
        if (c3294 == null) {
            C6385.m11446("Cannot find wrapper for ", abstractC3317, ", seems like it is not bound by this adapter: ", c3325);
        } else {
            c3294.f7677.mo5360(abstractC3317);
            identityHashMap.remove(abstractC3317);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo5361(AbstractC3317 abstractC3317) {
        C3325 c3325 = this.f7810;
        IdentityHashMap identityHashMap = (IdentityHashMap) c3325.f7803;
        C3294 c3294 = (C3294) identityHashMap.get(abstractC3317);
        if (c3294 == null) {
            C6385.m11446("Cannot find wrapper for ", abstractC3317, ", seems like it is not bound by this adapter: ", c3325);
            return false;
        }
        boolean zMo5361 = c3294.f7677.mo5361(abstractC3317);
        identityHashMap.remove(abstractC3317);
        return zMo5361;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo5362(AbstractC3317 abstractC3317) {
        this.f7810.m5490(abstractC3317).f7677.mo5362(abstractC3317);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        C3325 c3325 = this.f7810;
        C1037 c1037M5492 = c3325.m5492(i);
        ((IdentityHashMap) c3325.f7803).put(abstractC3317, (C3294) c1037M5492.f1088);
        C3294 c3294 = (C3294) c1037M5492.f1088;
        c3294.f7677.m5356(abstractC3317, c1037M5492.f1090);
        c1037M5492.f1089 = false;
        c1037M5492.f1088 = null;
        c1037M5492.f1090 = -1;
        c3325.f7802 = c1037M5492;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo5368(RecyclerView recyclerView) {
        C3325 c3325 = this.f7810;
        ArrayList arrayList = (ArrayList) c3325.f7805;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) c3325.f7804).iterator();
        while (it2.hasNext()) {
            ((C3294) it2.next()).f7677.mo5368(recyclerView);
        }
    }
}
