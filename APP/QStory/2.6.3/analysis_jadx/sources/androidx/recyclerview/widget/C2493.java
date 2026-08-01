package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.C0190;
import androidx.compose.animation.core.C0325;
import androidx.fragment.app.C2308;
import com.alibaba.fastjson2.C2942;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import p034.AbstractC6344;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2493 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2492 f7465;

    public C2493(C2494 c2494, AbstractC2450... abstractC2450Arr) {
        List listAsList = Arrays.asList(abstractC2450Arr);
        this.f7465 = new C2492(this, c2494);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            m4937((AbstractC2450) it.next());
        }
        boolean z = ((ConcatAdapter$Config$StableIdMode) this.f7465.f7464) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS;
        if (this.f7298.m4814()) {
            C5925.m11311("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7297 = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4792(int i) {
        int iValueAt;
        C2492 c2492 = this.f7465;
        C0190 c0190M4932 = c2492.m4932(i);
        C2461 c2461 = (C2461) c0190M4932.f743;
        int i2 = c0190M4932.f745;
        C0325 c0325 = c2461.f7334;
        int iMo4792 = c2461.f7332.mo4792(i2);
        SparseIntArray sparseIntArray = (SparseIntArray) c0325.f1095;
        int iIndexOfKey = sparseIntArray.indexOfKey(iMo4792);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            C0107 c0107 = (C0107) c0325.f1093;
            C2461 c24612 = (C2461) c0325.f1094;
            int i3 = c0107.f314;
            c0107.f314 = i3 + 1;
            ((SparseArray) c0107.f315).put(i3, c24612);
            sparseIntArray.put(iMo4792, i3);
            ((SparseIntArray) c0325.f1096).put(i3, iMo4792);
            iValueAt = i3;
        }
        c0190M4932.f744 = false;
        c0190M4932.f743 = null;
        c0190M4932.f745 = -1;
        c2492.f7457 = c0190M4932;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4793(int i) {
        C2492 c2492 = this.f7465;
        C0190 c0190M4932 = c2492.m4932(i);
        C2461 c2461 = (C2461) c0190M4932.f743;
        long jMo4894 = c2461.f7333.mo4894(c2461.f7332.mo4793(c0190M4932.f745));
        c0190M4932.f744 = false;
        c0190M4932.f743 = null;
        c0190M4932.f745 = -1;
        c2492.f7457 = c0190M4932;
        return jMo4894;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        Iterator it = ((ArrayList) this.f7465.f7459).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C2461) it.next()).f7330;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo4795(AbstractC2450 abstractC2450, AbstractC2484 abstractC2484, int i) {
        C2492 c2492 = this.f7465;
        C2461 c2461 = (C2461) ((IdentityHashMap) c2492.f7458).get(abstractC2484);
        if (c2461 == null) {
            return -1;
        }
        AbstractC2450 abstractC24502 = c2461.f7332;
        int iM4934 = i - c2492.m4934(c2461);
        int iMo4794 = abstractC24502.mo4794();
        if (iM4934 >= 0 && iM4934 < iMo4794) {
            return abstractC24502.mo4795(abstractC2450, abstractC2484, iM4934);
        }
        C2308.m4352(AbstractC0053.m149(iM4934, iMo4794, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"), abstractC2484, "adapter:", abstractC2450);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m4937(AbstractC2450 abstractC2450) {
        C2492 c2492 = this.f7465;
        ArrayList arrayList = (ArrayList) c2492.f7459;
        int size = arrayList.size();
        if (size < 0 || size > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
        }
        if (((ConcatAdapter$Config$StableIdMode) c2492.f7464) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            AbstractC6344.m11872("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", abstractC2450.f7297);
        } else if (abstractC2450.f7297) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int size2 = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                i = -1;
                break;
            } else if (((C2461) arrayList.get(i)).f7332 == abstractC2450) {
                break;
            } else {
                i++;
            }
        }
        if ((i == -1 ? null : (C2461) arrayList.get(i)) != null) {
            return;
        }
        C2461 c2461 = new C2461(abstractC2450, c2492, (C0107) c2492.f7461, ((InterfaceC2478) c2492.f7463).mo4863());
        arrayList.add(size, c2461);
        Iterator it = ((ArrayList) c2492.f7460).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                abstractC2450.mo4808(recyclerView);
            }
        }
        if (c2461.f7330 > 0) {
            ((C2493) c2492.f7462).m4807(c2492.m4934(c2461), c2461.f7330);
        }
        c2492.m4935();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4797(RecyclerView recyclerView) {
        C2492 c2492 = this.f7465;
        ArrayList arrayList = (ArrayList) c2492.f7460;
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
        Iterator it = ((ArrayList) c2492.f7459).iterator();
        while (it.hasNext()) {
            ((C2461) it.next()).f7332.mo4797(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        C2461 c2461 = (C2461) ((SparseArray) ((C0107) this.f7465.f7461).f315).get(i);
        if (c2461 == null) {
            C5925.m11310(AbstractC6183.m11588(i, "Cannot find the wrapper for global view type "));
            return null;
        }
        C0325 c0325 = c2461.f7334;
        SparseIntArray sparseIntArray = (SparseIntArray) c0325.f1096;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return c2461.f7332.mo4798(sparseIntArray.valueAt(iIndexOfKey), viewGroup);
        }
        C2942.m6407(((C2461) c0325.f1094).f7332, AbstractC0053.m150(i, "requested global type ", " does not belong to the adapter:"));
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4799(AbstractC2484 abstractC2484) {
        this.f7465.m4930(abstractC2484).f7332.mo4799(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo4800(AbstractC2484 abstractC2484) {
        C2492 c2492 = this.f7465;
        IdentityHashMap identityHashMap = (IdentityHashMap) c2492.f7458;
        C2461 c2461 = (C2461) identityHashMap.get(abstractC2484);
        if (c2461 == null) {
            C5554.m10887("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", c2492);
        } else {
            c2461.f7332.mo4800(abstractC2484);
            identityHashMap.remove(abstractC2484);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo4801(AbstractC2484 abstractC2484) {
        C2492 c2492 = this.f7465;
        IdentityHashMap identityHashMap = (IdentityHashMap) c2492.f7458;
        C2461 c2461 = (C2461) identityHashMap.get(abstractC2484);
        if (c2461 == null) {
            C5554.m10887("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", c2492);
            return false;
        }
        boolean zMo4801 = c2461.f7332.mo4801(abstractC2484);
        identityHashMap.remove(abstractC2484);
        return zMo4801;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4802(AbstractC2484 abstractC2484) {
        this.f7465.m4930(abstractC2484).f7332.mo4802(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        C2492 c2492 = this.f7465;
        C0190 c0190M4932 = c2492.m4932(i);
        ((IdentityHashMap) c2492.f7458).put(abstractC2484, (C2461) c0190M4932.f743);
        C2461 c2461 = (C2461) c0190M4932.f743;
        c2461.f7332.m4796(abstractC2484, c0190M4932.f745);
        c0190M4932.f744 = false;
        c0190M4932.f743 = null;
        c0190M4932.f745 = -1;
        c2492.f7457 = c0190M4932;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4808(RecyclerView recyclerView) {
        C2492 c2492 = this.f7465;
        ArrayList arrayList = (ArrayList) c2492.f7460;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) c2492.f7459).iterator();
        while (it2.hasNext()) {
            ((C2461) it2.next()).f7332.mo4808(recyclerView);
        }
    }
}
