package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2246;
import com.alibaba.fastjson2.C2942;
import com.bumptech.glide.AbstractC3057;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f7632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f7633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f7634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2528 f7637;

    public C2531(RecyclerView recyclerView) {
        this.f7636 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7635 = arrayList;
        this.f7634 = null;
        this.f7633 = new ArrayList();
        this.f7632 = Collections.unmodifiableList(arrayList);
        this.f7631 = 2;
        this.f7630 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5029(AbstractC2450 abstractC2450, boolean z) {
        C2528 c2528 = this.f7637;
        if (c2528 != null) {
            SparseArray sparseArray = c2528.f7625;
            Set set = c2528.f7623;
            set.remove(abstractC2450);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2529) sparseArray.get(sparseArray.keyAt(i))).f7629;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC3057.m6741(((AbstractC2484) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5030() {
        RecyclerView recyclerView;
        AbstractC2450 abstractC2450;
        C2528 c2528 = this.f7637;
        if (c2528 == null || (abstractC2450 = (recyclerView = this.f7636).f7194) == null || !recyclerView.f7200) {
            return;
        }
        c2528.f7623.add(abstractC2450);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View m5031(int i) {
        return m5040(i, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2528 m5032() {
        if (this.f7637 == null) {
            C2528 c2528 = new C2528();
            c2528.f7625 = new SparseArray();
            c2528.f7624 = 0;
            c2528.f7623 = Collections.newSetFromMap(new IdentityHashMap());
            this.f7637 = c2528;
            m5030();
        }
        return this.f7637;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5033(int i) {
        RecyclerView recyclerView = this.f7636;
        C2525 c2525 = recyclerView.f7241;
        if (i >= 0 && i < c2525.m5025()) {
            return !c2525.f7617 ? i : recyclerView.f7224.m683(i, 0);
        }
        StringBuilder sbM150 = AbstractC0053.m150(i, "invalid position ", ". State item count is ");
        sbM150.append(c2525.m5025());
        sbM150.append(recyclerView.m4710());
        throw new IndexOutOfBoundsException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5034(AbstractC2484 abstractC2484, boolean z) {
        RecyclerView.m4695(abstractC2484);
        View view = abstractC2484.itemView;
        RecyclerView recyclerView = this.f7636;
        C2482 c2482 = recyclerView.f7207;
        if (c2482 != null) {
            C2485 c2485 = c2482.f7434;
            AbstractC2270.m4244(view, c2485 != null ? (C2246) c2485.f7438.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f7192;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                C2942.m6394();
                return;
            }
            AbstractC2450 abstractC2450 = recyclerView.f7194;
            if (abstractC2450 != null) {
                abstractC2450.mo4800(abstractC2484);
            }
            if (recyclerView.f7241 != null) {
                recyclerView.f7229.m4923(abstractC2484);
            }
            if (RecyclerView.f7177) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC2484);
            }
        }
        abstractC2484.mBindingAdapter = null;
        abstractC2484.mOwnerRecyclerView = null;
        C2528 c2528M5032 = m5032();
        c2528M5032.getClass();
        int itemViewType = abstractC2484.getItemViewType();
        ArrayList arrayList2 = c2528M5032.m5028(itemViewType).f7629;
        if (((C2529) c2528M5032.f7625.get(itemViewType)).f7628 <= arrayList2.size()) {
            AbstractC3057.m6741(abstractC2484.itemView);
        } else if (RecyclerView.f7176 && arrayList2.contains(abstractC2484)) {
            C5925.m11310("this scrap item already exists");
        } else {
            abstractC2484.resetInternal();
            arrayList2.add(abstractC2484);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5035() {
        AbstractC2519 abstractC2519 = this.f7636.f7193;
        this.f7630 = this.f7631 + (abstractC2519 != null ? abstractC2519.f7585 : 0);
        ArrayList arrayList = this.f7633;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7630; size--) {
            m5037(size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5036(AbstractC2484 abstractC2484) {
        if (abstractC2484.mInChangeScrap) {
            this.f7634.remove(abstractC2484);
        } else {
            this.f7635.remove(abstractC2484);
        }
        abstractC2484.mScrapContainer = null;
        abstractC2484.mInChangeScrap = false;
        abstractC2484.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5037(int i) {
        if (RecyclerView.f7177) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f7633;
        AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i);
        if (RecyclerView.f7177) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC2484);
        }
        m5034(abstractC2484, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5038() {
        ArrayList arrayList = this.f7633;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m5037(size);
        }
        arrayList.clear();
        if (RecyclerView.f7171) {
            C0920 c0920 = this.f7636.f7242;
            int[] iArr = (int[]) c0920.f2610;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0920.f2611 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5039(View view) {
        AbstractC2536 abstractC2536;
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        boolean zHasAnyOfTheFlags = abstractC2484M4689.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f7636;
        if (!zHasAnyOfTheFlags && abstractC2484M4689.isUpdated() && (abstractC2536 = recyclerView.f7254) != null) {
            C2505 c2505 = (C2505) abstractC2536;
            if (abstractC2484M4689.getUnmodifiedPayloads().isEmpty() && c2505.f7506 && !abstractC2484M4689.isInvalid()) {
                if (this.f7634 == null) {
                    this.f7634 = new ArrayList();
                }
                abstractC2484M4689.setScrapContainer(this, true);
                this.f7634.add(abstractC2484M4689);
                return;
            }
        }
        if (abstractC2484M4689.isInvalid() && !abstractC2484M4689.isRemoved() && !recyclerView.f7194.f7297) {
            C5925.m11310("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m4710()));
        } else {
            abstractC2484M4689.setScrapContainer(this, false);
            this.f7635.add(abstractC2484M4689);
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
    public final androidx.recyclerview.widget.AbstractC2484 m5040(int r30, long r31) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2531.m5040(int, long):androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5041(View view) {
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        boolean zIsTmpDetached = abstractC2484M4689.isTmpDetached();
        RecyclerView recyclerView = this.f7636;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2484M4689.isScrap()) {
            abstractC2484M4689.unScrap();
        } else if (abstractC2484M4689.wasReturnedFromScrap()) {
            abstractC2484M4689.clearReturnedFromScrapFlag();
        }
        m5042(abstractC2484M4689);
        if (recyclerView.f7254 == null || abstractC2484M4689.isRecyclable()) {
            return;
        }
        recyclerView.f7254.mo4969(abstractC2484M4689);
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
    public final void m5042(androidx.recyclerview.widget.AbstractC2484 r12) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2531.m5042(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰):void");
    }
}
