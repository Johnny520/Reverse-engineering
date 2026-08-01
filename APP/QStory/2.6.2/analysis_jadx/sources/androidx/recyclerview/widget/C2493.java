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
import com.alibaba.fastjson2.C2941;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.javaplugin.C5553;
import p007.AbstractC6136;
import p053.AbstractC6560;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2493 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2492 f7464;

    public C2493(C2494 c2494, AbstractC2450... abstractC2450Arr) {
        List listAsList = Arrays.asList(abstractC2450Arr);
        this.f7464 = new C2492(this, c2494);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            m4927((AbstractC2450) it.next());
        }
        boolean z = ((ConcatAdapter$Config$StableIdMode) this.f7464.f7463) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS;
        if (this.f7297.m4804()) {
            C5919.m11250("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7296 = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4782(int i) {
        int iValueAt;
        C2492 c2492 = this.f7464;
        C0190 c0190M4922 = c2492.m4922(i);
        C2461 c2461 = (C2461) c0190M4922.f743;
        int i2 = c0190M4922.f745;
        C0325 c0325 = c2461.f7333;
        int iMo4782 = c2461.f7331.mo4782(i2);
        SparseIntArray sparseIntArray = (SparseIntArray) c0325.f1095;
        int iIndexOfKey = sparseIntArray.indexOfKey(iMo4782);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            C0107 c0107 = (C0107) c0325.f1093;
            C2461 c24612 = (C2461) c0325.f1094;
            int i3 = c0107.f314;
            c0107.f314 = i3 + 1;
            ((SparseArray) c0107.f315).put(i3, c24612);
            sparseIntArray.put(iMo4782, i3);
            ((SparseIntArray) c0325.f1096).put(i3, iMo4782);
            iValueAt = i3;
        }
        c0190M4922.f744 = false;
        c0190M4922.f743 = null;
        c0190M4922.f745 = -1;
        c2492.f7456 = c0190M4922;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4783(int i) {
        C2492 c2492 = this.f7464;
        C0190 c0190M4922 = c2492.m4922(i);
        C2461 c2461 = (C2461) c0190M4922.f743;
        long jMo4884 = c2461.f7332.mo4884(c2461.f7331.mo4783(c0190M4922.f745));
        c0190M4922.f744 = false;
        c0190M4922.f743 = null;
        c0190M4922.f745 = -1;
        c2492.f7456 = c0190M4922;
        return jMo4884;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        Iterator it = ((ArrayList) this.f7464.f7458).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C2461) it.next()).f7329;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo4785(AbstractC2450 abstractC2450, AbstractC2484 abstractC2484, int i) {
        C2492 c2492 = this.f7464;
        C2461 c2461 = (C2461) ((IdentityHashMap) c2492.f7457).get(abstractC2484);
        if (c2461 == null) {
            return -1;
        }
        AbstractC2450 abstractC24502 = c2461.f7331;
        int iM4924 = i - c2492.m4924(c2461);
        int iMo4784 = abstractC24502.mo4784();
        if (iM4924 >= 0 && iM4924 < iMo4784) {
            return abstractC24502.mo4785(abstractC2450, abstractC2484, iM4924);
        }
        C2308.m4342(AbstractC0053.m151(iM4924, iMo4784, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"), abstractC2484, "adapter:", abstractC2450);
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m4927(AbstractC2450 abstractC2450) {
        C2492 c2492 = this.f7464;
        ArrayList arrayList = (ArrayList) c2492.f7458;
        int size = arrayList.size();
        if (size < 0 || size > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
        }
        if (((ConcatAdapter$Config$StableIdMode) c2492.f7463) != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            AbstractC6560.m12019("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", abstractC2450.f7296);
        } else if (abstractC2450.f7296) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int size2 = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                i = -1;
                break;
            } else if (((C2461) arrayList.get(i)).f7331 == abstractC2450) {
                break;
            } else {
                i++;
            }
        }
        if ((i == -1 ? null : (C2461) arrayList.get(i)) != null) {
            return;
        }
        C2461 c2461 = new C2461(abstractC2450, c2492, (C0107) c2492.f7460, ((InterfaceC2478) c2492.f7462).mo4853());
        arrayList.add(size, c2461);
        Iterator it = ((ArrayList) c2492.f7459).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                abstractC2450.mo4798(recyclerView);
            }
        }
        if (c2461.f7329 > 0) {
            ((C2493) c2492.f7461).m4797(c2492.m4924(c2461), c2461.f7329);
        }
        c2492.m4925();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4787(RecyclerView recyclerView) {
        C2492 c2492 = this.f7464;
        ArrayList arrayList = (ArrayList) c2492.f7459;
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
        Iterator it = ((ArrayList) c2492.f7458).iterator();
        while (it.hasNext()) {
            ((C2461) it.next()).f7331.mo4787(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        C2461 c2461 = (C2461) ((SparseArray) ((C0107) this.f7464.f7460).f315).get(i);
        if (c2461 == null) {
            C5919.m11249(AbstractC6136.m11556(i, "Cannot find the wrapper for global view type "));
            return null;
        }
        C0325 c0325 = c2461.f7333;
        SparseIntArray sparseIntArray = (SparseIntArray) c0325.f1096;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return c2461.f7331.mo4788(sparseIntArray.valueAt(iIndexOfKey), viewGroup);
        }
        C2941.m6349(((C2461) c0325.f1094).f7331, AbstractC0053.m148(i, "requested global type ", " does not belong to the adapter:"));
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4789(AbstractC2484 abstractC2484) {
        this.f7464.m4920(abstractC2484).f7331.mo4789(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo4790(AbstractC2484 abstractC2484) {
        C2492 c2492 = this.f7464;
        IdentityHashMap identityHashMap = (IdentityHashMap) c2492.f7457;
        C2461 c2461 = (C2461) identityHashMap.get(abstractC2484);
        if (c2461 == null) {
            C5553.m10830("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", c2492);
        } else {
            c2461.f7331.mo4790(abstractC2484);
            identityHashMap.remove(abstractC2484);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo4791(AbstractC2484 abstractC2484) {
        C2492 c2492 = this.f7464;
        IdentityHashMap identityHashMap = (IdentityHashMap) c2492.f7457;
        C2461 c2461 = (C2461) identityHashMap.get(abstractC2484);
        if (c2461 == null) {
            C5553.m10830("Cannot find wrapper for ", abstractC2484, ", seems like it is not bound by this adapter: ", c2492);
            return false;
        }
        boolean zMo4791 = c2461.f7331.mo4791(abstractC2484);
        identityHashMap.remove(abstractC2484);
        return zMo4791;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4792(AbstractC2484 abstractC2484) {
        this.f7464.m4920(abstractC2484).f7331.mo4792(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        C2492 c2492 = this.f7464;
        C0190 c0190M4922 = c2492.m4922(i);
        ((IdentityHashMap) c2492.f7457).put(abstractC2484, (C2461) c0190M4922.f743);
        C2461 c2461 = (C2461) c0190M4922.f743;
        c2461.f7331.m4786(abstractC2484, c0190M4922.f745);
        c0190M4922.f744 = false;
        c0190M4922.f743 = null;
        c0190M4922.f745 = -1;
        c2492.f7456 = c0190M4922;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4798(RecyclerView recyclerView) {
        C2492 c2492 = this.f7464;
        ArrayList arrayList = (ArrayList) c2492.f7459;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) c2492.f7458).iterator();
        while (it2.hasNext()) {
            ((C2461) it2.next()).f7331.mo4798(recyclerView);
        }
    }
}
