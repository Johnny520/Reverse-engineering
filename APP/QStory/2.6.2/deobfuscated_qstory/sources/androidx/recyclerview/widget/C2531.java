package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2246;
import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f7631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f7632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f7633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2528 f7636;

    public C2531(RecyclerView recyclerView) {
        this.f7635 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7634 = arrayList;
        this.f7633 = null;
        this.f7632 = new ArrayList();
        this.f7631 = Collections.unmodifiableList(arrayList);
        this.f7630 = 2;
        this.f7629 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5019(AbstractC2450 abstractC2450, boolean z) {
        C2528 c2528 = this.f7636;
        if (c2528 != null) {
            SparseArray sparseArray = c2528.f7624;
            Set set = c2528.f7622;
            set.remove(abstractC2450);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2529) sparseArray.get(sparseArray.keyAt(i))).f7628;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC0455.m1148(((AbstractC2484) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5020() {
        RecyclerView recyclerView;
        AbstractC2450 abstractC2450;
        C2528 c2528 = this.f7636;
        if (c2528 == null || (abstractC2450 = (recyclerView = this.f7635).f7193) == null || !recyclerView.f7199) {
            return;
        }
        c2528.f7622.add(abstractC2450);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View m5021(int i) {
        return m5030(i, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2528 m5022() {
        if (this.f7636 == null) {
            C2528 c2528 = new C2528();
            c2528.f7624 = new SparseArray();
            c2528.f7623 = 0;
            c2528.f7622 = Collections.newSetFromMap(new IdentityHashMap());
            this.f7636 = c2528;
            m5020();
        }
        return this.f7636;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5023(int i) {
        RecyclerView recyclerView = this.f7635;
        C2525 c2525 = recyclerView.f7240;
        if (i >= 0 && i < c2525.m5015()) {
            return !c2525.f7616 ? i : recyclerView.f7223.m682(i, 0);
        }
        StringBuilder sbM148 = AbstractC0053.m148(i, "invalid position ", ". State item count is ");
        sbM148.append(c2525.m5015());
        sbM148.append(recyclerView.m4700());
        throw new IndexOutOfBoundsException(sbM148.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5024(AbstractC2484 abstractC2484, boolean z) {
        RecyclerView.m4685(abstractC2484);
        View view = abstractC2484.itemView;
        RecyclerView recyclerView = this.f7635;
        C2482 c2482 = recyclerView.f7206;
        if (c2482 != null) {
            C2485 c2485 = c2482.f7433;
            AbstractC2270.m4234(view, c2485 != null ? (C2246) c2485.f7437.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f7191;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                C2941.m6336();
                return;
            }
            AbstractC2450 abstractC2450 = recyclerView.f7193;
            if (abstractC2450 != null) {
                abstractC2450.mo4790(abstractC2484);
            }
            if (recyclerView.f7240 != null) {
                recyclerView.f7228.m4913(abstractC2484);
            }
            if (RecyclerView.f7176) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC2484);
            }
        }
        abstractC2484.mBindingAdapter = null;
        abstractC2484.mOwnerRecyclerView = null;
        C2528 c2528M5022 = m5022();
        c2528M5022.getClass();
        int itemViewType = abstractC2484.getItemViewType();
        ArrayList arrayList2 = c2528M5022.m5018(itemViewType).f7628;
        if (((C2529) c2528M5022.f7624.get(itemViewType)).f7627 <= arrayList2.size()) {
            AbstractC0455.m1148(abstractC2484.itemView);
        } else if (RecyclerView.f7175 && arrayList2.contains(abstractC2484)) {
            C5919.m11249("this scrap item already exists");
        } else {
            abstractC2484.resetInternal();
            arrayList2.add(abstractC2484);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5025() {
        AbstractC2519 abstractC2519 = this.f7635.f7192;
        this.f7629 = this.f7630 + (abstractC2519 != null ? abstractC2519.f7584 : 0);
        ArrayList arrayList = this.f7632;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7629; size--) {
            m5027(size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5026(AbstractC2484 abstractC2484) {
        if (abstractC2484.mInChangeScrap) {
            this.f7633.remove(abstractC2484);
        } else {
            this.f7634.remove(abstractC2484);
        }
        abstractC2484.mScrapContainer = null;
        abstractC2484.mInChangeScrap = false;
        abstractC2484.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5027(int i) {
        if (RecyclerView.f7176) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f7632;
        AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i);
        if (RecyclerView.f7176) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC2484);
        }
        m5024(abstractC2484, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5028() {
        ArrayList arrayList = this.f7632;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m5027(size);
        }
        arrayList.clear();
        if (RecyclerView.f7170) {
            C0920 c0920 = this.f7635.f7241;
            int[] iArr = (int[]) c0920.f2609;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0920.f2610 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5029(View view) {
        AbstractC2536 abstractC2536;
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        boolean zHasAnyOfTheFlags = abstractC2484M4679.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f7635;
        if (!zHasAnyOfTheFlags && abstractC2484M4679.isUpdated() && (abstractC2536 = recyclerView.f7253) != null) {
            C2505 c2505 = (C2505) abstractC2536;
            if (abstractC2484M4679.getUnmodifiedPayloads().isEmpty() && c2505.f7505 && !abstractC2484M4679.isInvalid()) {
                if (this.f7633 == null) {
                    this.f7633 = new ArrayList();
                }
                abstractC2484M4679.setScrapContainer(this, true);
                this.f7633.add(abstractC2484M4679);
                return;
            }
        }
        if (abstractC2484M4679.isInvalid() && !abstractC2484M4679.isRemoved() && !recyclerView.f7193.f7296) {
            C5919.m11249("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m4700()));
        } else {
            abstractC2484M4679.setScrapContainer(this, false);
            this.f7634.add(abstractC2484M4679);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0574 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.AbstractC2484 m5030(int r30, long r31) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2531.m5030(int, long):androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5031(View view) {
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        boolean zIsTmpDetached = abstractC2484M4679.isTmpDetached();
        RecyclerView recyclerView = this.f7635;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2484M4679.isScrap()) {
            abstractC2484M4679.unScrap();
        } else if (abstractC2484M4679.wasReturnedFromScrap()) {
            abstractC2484M4679.clearReturnedFromScrapFlag();
        }
        m5032(abstractC2484M4679);
        if (recyclerView.f7253 == null || abstractC2484M4679.isRecyclable()) {
            return;
        }
        recyclerView.f7253.mo4959(abstractC2484M4679);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5032(androidx.recyclerview.widget.AbstractC2484 r12) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2531.m5032(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰):void");
    }
}
