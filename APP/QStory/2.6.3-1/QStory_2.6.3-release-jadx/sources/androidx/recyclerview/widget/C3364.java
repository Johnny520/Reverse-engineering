package androidx.recyclerview.widget;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.C1804;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.os.AbstractC3010;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3079;
import androidx.core.view.C3080;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3889;
import com.google.protobuf.C4515;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3364 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f7977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f7978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f7979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f7980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7981;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C3361 f7982;

    public C3364(RecyclerView recyclerView) {
        this.f7981 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7980 = arrayList;
        this.f7979 = null;
        this.f7978 = new ArrayList();
        this.f7977 = Collections.unmodifiableList(arrayList);
        this.f7976 = 2;
        this.f7975 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5589(AbstractC3283 abstractC3283, boolean z) {
        C3361 c3361 = this.f7982;
        if (c3361 != null) {
            SparseArray sparseArray = c3361.f7970;
            Set set = c3361.f7968;
            set.remove(abstractC3283);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C3362) sparseArray.get(sparseArray.keyAt(i))).f7974;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC3889.m7301(((AbstractC3317) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5590() {
        RecyclerView recyclerView;
        AbstractC3283 abstractC3283;
        C3361 c3361 = this.f7982;
        if (c3361 == null || (abstractC3283 = (recyclerView = this.f7981).f7539) == null || !recyclerView.f7545) {
            return;
        }
        c3361.f7968.add(abstractC3283);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View m5591(int i) {
        return m5600(i, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3361 m5592() {
        if (this.f7982 == null) {
            C3361 c3361 = new C3361();
            c3361.f7970 = new SparseArray();
            c3361.f7969 = 0;
            c3361.f7968 = Collections.newSetFromMap(new IdentityHashMap());
            this.f7982 = c3361;
            m5590();
        }
        return this.f7982;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5593(int i) {
        RecyclerView recyclerView = this.f7981;
        C3358 c3358 = recyclerView.f7586;
        if (i >= 0 && i < c3358.m5585()) {
            return !c3358.f7962 ? i : recyclerView.f7569.m1243(i, 0);
        }
        StringBuilder sbM710 = AbstractC0900.m710(i, "invalid position ", ". State item count is ");
        sbM710.append(c3358.m5585());
        sbM710.append(recyclerView.m5270());
        throw new IndexOutOfBoundsException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5594(AbstractC3317 abstractC3317, boolean z) {
        RecyclerView.m5255(abstractC3317);
        View view = abstractC3317.itemView;
        RecyclerView recyclerView = this.f7981;
        C3315 c3315 = recyclerView.f7552;
        if (c3315 != null) {
            C3318 c3318 = c3315.f7779;
            AbstractC3103.m4804(view, c3318 != null ? (C3079) c3318.f7783.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f7537;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                C3775.m6954();
                return;
            }
            AbstractC3283 abstractC3283 = recyclerView.f7539;
            if (abstractC3283 != null) {
                abstractC3283.mo5360(abstractC3317);
            }
            if (recyclerView.f7586 != null) {
                recyclerView.f7574.m5483(abstractC3317);
            }
            if (RecyclerView.f7522) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC3317);
            }
        }
        abstractC3317.mBindingAdapter = null;
        abstractC3317.mOwnerRecyclerView = null;
        C3361 c3361M5592 = m5592();
        c3361M5592.getClass();
        int itemViewType = abstractC3317.getItemViewType();
        ArrayList arrayList2 = c3361M5592.m5588(itemViewType).f7974;
        if (((C3362) c3361M5592.f7970.get(itemViewType)).f7973 <= arrayList2.size()) {
            AbstractC3889.m7301(abstractC3317.itemView);
        } else if (RecyclerView.f7521 && arrayList2.contains(abstractC3317)) {
            C6755.m11869("this scrap item already exists");
        } else {
            abstractC3317.resetInternal();
            arrayList2.add(abstractC3317);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5595() {
        AbstractC3352 abstractC3352 = this.f7981.f7538;
        this.f7975 = this.f7976 + (abstractC3352 != null ? abstractC3352.f7930 : 0);
        ArrayList arrayList = this.f7978;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7975; size--) {
            m5597(size);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5596(AbstractC3317 abstractC3317) {
        if (abstractC3317.mInChangeScrap) {
            this.f7979.remove(abstractC3317);
        } else {
            this.f7980.remove(abstractC3317);
        }
        abstractC3317.mScrapContainer = null;
        abstractC3317.mInChangeScrap = false;
        abstractC3317.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5597(int i) {
        if (RecyclerView.f7522) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f7978;
        AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(i);
        if (RecyclerView.f7522) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC3317);
        }
        m5594(abstractC3317, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5598() {
        ArrayList arrayList = this.f7978;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m5597(size);
        }
        arrayList.clear();
        if (RecyclerView.f7516) {
            C1758 c1758 = this.f7981.f7587;
            int[] iArr = (int[]) c1758.f2955;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1758.f2956 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5599(View view) {
        AbstractC3369 abstractC3369;
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        boolean zHasAnyOfTheFlags = abstractC3317M5249.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f7981;
        if (!zHasAnyOfTheFlags && abstractC3317M5249.isUpdated() && (abstractC3369 = recyclerView.f7599) != null) {
            C3338 c3338 = (C3338) abstractC3369;
            if (abstractC3317M5249.getUnmodifiedPayloads().isEmpty() && c3338.f7851 && !abstractC3317M5249.isInvalid()) {
                if (this.f7979 == null) {
                    this.f7979 = new ArrayList();
                }
                abstractC3317M5249.setScrapContainer(this, true);
                this.f7979.add(abstractC3317M5249);
                return;
            }
        }
        if (abstractC3317M5249.isInvalid() && !abstractC3317M5249.isRemoved() && !recyclerView.f7539.f7642) {
            C6755.m11869("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m5270()));
        } else {
            abstractC3317M5249.setScrapContainer(this, false);
            this.f7980.add(abstractC3317M5249);
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
    */
    public final AbstractC3317 m5600(int i, long j) {
        AbstractC3317 abstractC3317Mo5358;
        int i2;
        int i3;
        long j2;
        long j3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        ViewGroup.LayoutParams layoutParams;
        C3351 c3351;
        RecyclerView recyclerViewM5251;
        AbstractC3317 abstractC3317;
        AbstractC3317 abstractC33172;
        View view;
        ?? r7;
        int size;
        int iM1243;
        RecyclerView recyclerView = this.f7981;
        C3358 c3358 = recyclerView.f7586;
        if (i < 0 || i >= c3358.m5585()) {
            StringBuilder sbM709 = AbstractC0900.m709(i, i, "Invalid item position ", "(", "). Item count:");
            sbM709.append(c3358.m5585());
            sbM709.append(recyclerView.m5270());
            throw new IndexOutOfBoundsException(sbM709.toString());
        }
        int i8 = 32;
        if (c3358.f7962) {
            ArrayList arrayList = this.f7979;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                abstractC3317Mo5358 = null;
                i2 = abstractC3317Mo5358 == null ? 1 : 0;
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        abstractC3317Mo5358 = (AbstractC3317) this.f7979.get(i9);
                        if (!abstractC3317Mo5358.wasReturnedFromScrap() && abstractC3317Mo5358.getLayoutPosition() == i) {
                            abstractC3317Mo5358.addFlags(32);
                            break;
                        }
                        i9++;
                    } else if (recyclerView.f7539.f7642 && (iM1243 = recyclerView.f7569.m1243(i, 0)) > 0 && iM1243 < recyclerView.f7539.mo5354()) {
                        long jMo5353 = recyclerView.f7539.mo5353(iM1243);
                        for (int i10 = 0; i10 < size; i10++) {
                            AbstractC3317 abstractC33173 = (AbstractC3317) this.f7979.get(i10);
                            if (!abstractC33173.wasReturnedFromScrap() && abstractC33173.getItemId() == jMo5353) {
                                abstractC33173.addFlags(32);
                                abstractC3317Mo5358 = abstractC33173;
                                break;
                            }
                        }
                    }
                }
                abstractC3317Mo5358 = null;
                if (abstractC3317Mo5358 == null) {
                }
            }
            ArrayList arrayList2 = this.f7980;
            ArrayList arrayList3 = this.f7978;
            if (abstractC3317Mo5358 != null) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    AbstractC3317 abstractC33174 = (AbstractC3317) arrayList2.get(i11);
                    if (!abstractC33174.wasReturnedFromScrap() && abstractC33174.getLayoutPosition() == i && !abstractC33174.isInvalid() && (c3358.f7962 || !abstractC33174.isRemoved())) {
                        abstractC33174.addFlags(32);
                        abstractC3317Mo5358 = abstractC33174;
                        i3 = 1;
                        break;
                    }
                }
                ArrayList arrayList4 = (ArrayList) recyclerView.f7573.f7814;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        i3 = 1;
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i12);
                    AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
                    i3 = 1;
                    if (abstractC3317M5249.getLayoutPosition() == i && !abstractC3317M5249.isInvalid() && !abstractC3317M5249.isRemoved()) {
                        break;
                    }
                    i12++;
                }
                if (view == null) {
                    int size4 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size4) {
                            abstractC3317Mo5358 = null;
                            break;
                        }
                        AbstractC3317 abstractC33175 = (AbstractC3317) arrayList3.get(i13);
                        if (abstractC33175.isInvalid() || abstractC33175.getLayoutPosition() != i || abstractC33175.isAttachedToTransitionOverlay()) {
                            i13++;
                        } else {
                            arrayList3.remove(i13);
                            if (RecyclerView.f7522) {
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC33175);
                            }
                            abstractC3317Mo5358 = abstractC33175;
                        }
                    }
                } else {
                    AbstractC3317 abstractC3317M52492 = RecyclerView.m5249(view);
                    C3328 c3328 = recyclerView.f7573;
                    C3329 c3329 = (C3329) c3328.f7815;
                    int iIndexOfChild = ((C3287) c3328.f7816).f7649.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        C5043.m9163(view, "view is not a child, cannot hide ");
                        return null;
                    }
                    if (!c3329.m5512(iIndexOfChild)) {
                        C4515.m8484(view, "trying to unhide a view that was not hidden");
                        return null;
                    }
                    c3329.m5515(iIndexOfChild);
                    c3328.m5507(view);
                    C3328 c33282 = recyclerView.f7573;
                    C3329 c33292 = (C3329) c33282.f7815;
                    int iIndexOfChild2 = ((C3287) c33282.f7816).f7649.indexOfChild(view);
                    int iM5514 = (iIndexOfChild2 == -1 || c33292.m5512(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c33292.m5514(iIndexOfChild2);
                    if (iM5514 == -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(abstractC3317M52492);
                        C3775.m6967(recyclerView.m5270(), sb);
                        return null;
                    }
                    recyclerView.f7573.m5500(iM5514);
                    m5599(view);
                    abstractC3317M52492.addFlags(8224);
                    abstractC3317Mo5358 = abstractC3317M52492;
                }
                if (abstractC3317Mo5358 != null) {
                    if (!abstractC3317Mo5358.isRemoved()) {
                        int i14 = abstractC3317Mo5358.mPosition;
                        if (i14 < 0 || i14 >= recyclerView.f7539.mo5354()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC3317Mo5358 + recyclerView.m5270());
                        }
                        r7 = ((c3358.f7962 || recyclerView.f7539.mo5352(abstractC3317Mo5358.mPosition) == abstractC3317Mo5358.getItemViewType()) && (!recyclerView.f7539.f7642 || abstractC3317Mo5358.getItemId() == recyclerView.f7539.mo5353(abstractC3317Mo5358.mPosition))) ? i3 : 0;
                    } else {
                        if (RecyclerView.f7521 && !c3358.f7962) {
                            C6755.m11870("should not receive a removed view unless it is pre layout".concat(recyclerView.m5270()));
                            return null;
                        }
                        r7 = c3358.f7962;
                    }
                    if (r7 == 0) {
                        abstractC3317Mo5358.addFlags(4);
                        if (abstractC3317Mo5358.isScrap()) {
                            recyclerView.removeDetachedView(abstractC3317Mo5358.itemView, false);
                            abstractC3317Mo5358.unScrap();
                        } else if (abstractC3317Mo5358.wasReturnedFromScrap()) {
                            abstractC3317Mo5358.clearReturnedFromScrapFlag();
                        }
                        m5602(abstractC3317Mo5358);
                        abstractC3317Mo5358 = null;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i3 = 1;
            }
            if (abstractC3317Mo5358 != null) {
                int iM12432 = recyclerView.f7569.m1243(i, 0);
                if (iM12432 >= 0) {
                    j2 = 3;
                    if (iM12432 < recyclerView.f7539.mo5354()) {
                        int iMo5352 = recyclerView.f7539.mo5352(iM12432);
                        AbstractC3283 abstractC3283 = recyclerView.f7539;
                        j3 = 4;
                        if (abstractC3283.f7642) {
                            long jMo53532 = abstractC3283.mo5353(iM12432);
                            int size5 = arrayList2.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    abstractC33172 = (AbstractC3317) arrayList2.get(size5);
                                    if (abstractC33172.getItemId() == jMo53532 && !abstractC33172.wasReturnedFromScrap()) {
                                        if (iMo5352 == abstractC33172.getItemViewType()) {
                                            abstractC33172.addFlags(i8);
                                            if (abstractC33172.isRemoved() && !c3358.f7962) {
                                                abstractC33172.setFlags(2, 14);
                                            }
                                        } else {
                                            arrayList2.remove(size5);
                                            recyclerView.removeDetachedView(abstractC33172.itemView, false);
                                            AbstractC3317 abstractC3317M52493 = RecyclerView.m5249(abstractC33172.itemView);
                                            abstractC3317M52493.mScrapContainer = null;
                                            abstractC3317M52493.mInChangeScrap = false;
                                            abstractC3317M52493.clearReturnedFromScrapFlag();
                                            m5602(abstractC3317M52493);
                                        }
                                    }
                                    size5--;
                                    i8 = 32;
                                } else {
                                    int size6 = arrayList3.size() - 1;
                                    while (true) {
                                        if (size6 < 0) {
                                            break;
                                        }
                                        abstractC33172 = (AbstractC3317) arrayList3.get(size6);
                                        if (abstractC33172.getItemId() != jMo53532 || abstractC33172.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else if (iMo5352 == abstractC33172.getItemViewType()) {
                                            arrayList3.remove(size6);
                                        } else {
                                            m5597(size6);
                                        }
                                    }
                                    abstractC3317Mo5358 = null;
                                }
                            }
                            abstractC3317Mo5358 = abstractC33172;
                            if (abstractC3317Mo5358 != null) {
                                abstractC3317Mo5358.mPosition = iM12432;
                                i2 = i3;
                            }
                        }
                        if (abstractC3317Mo5358 == null) {
                            if (RecyclerView.f7522) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            C3362 c3362 = (C3362) m5592().f7970.get(iMo5352);
                            if (c3362 != null) {
                                ArrayList arrayList5 = c3362.f7974;
                                if (arrayList5.isEmpty()) {
                                    abstractC3317 = null;
                                    if (abstractC3317 != null) {
                                    }
                                    abstractC3317Mo5358 = abstractC3317;
                                } else {
                                    for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                        if (!((AbstractC3317) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                            abstractC3317 = (AbstractC3317) arrayList5.remove(size7);
                                            break;
                                        }
                                    }
                                    abstractC3317 = null;
                                    if (abstractC3317 != null) {
                                        abstractC3317.resetInternal();
                                        boolean z2 = RecyclerView.f7521;
                                    }
                                    abstractC3317Mo5358 = abstractC3317;
                                }
                            }
                        }
                        if (abstractC3317Mo5358 == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j4 = this.f7982.m5588(iMo5352).f7972;
                                if (j4 != 0 && j4 + nanoTime >= j) {
                                    return null;
                                }
                            }
                            AbstractC3283 abstractC32832 = recyclerView.f7539;
                            abstractC32832.getClass();
                            try {
                                if (AbstractC3010.m4533()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo5352)));
                                }
                                abstractC3317Mo5358 = abstractC32832.mo5358(iMo5352, recyclerView);
                                if (abstractC3317Mo5358.itemView.getParent() != null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                abstractC3317Mo5358.mItemViewType = iMo5352;
                                Trace.endSection();
                                if (RecyclerView.f7516 && (recyclerViewM5251 = RecyclerView.m5251(abstractC3317Mo5358.itemView)) != null) {
                                    abstractC3317Mo5358.mNestedRecyclerView = new WeakReference<>(recyclerViewM5251);
                                }
                                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                C3362 c3362M5588 = this.f7982.m5588(iMo5352);
                                long j5 = c3362M5588.f7972;
                                if (j5 != 0) {
                                    nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                                }
                                c3362M5588.f7972 = nanoTime2;
                                if (RecyclerView.f7522) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbM7092 = AbstractC0900.m709(i, iM12432, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbM7092.append(c3358.m5585());
                sbM7092.append(recyclerView.m5270());
                throw new IndexOutOfBoundsException(sbM7092.toString());
            }
            j2 = 3;
            j3 = 4;
            if (i2 != 0 && !c3358.f7962 && abstractC3317Mo5358.hasAnyOfTheFlags(8192)) {
                abstractC3317Mo5358.setFlags(0, 8192);
                if (c3358.f7966) {
                    AbstractC3369.m5604(abstractC3317Mo5358);
                    AbstractC3369 abstractC3369 = recyclerView.f7599;
                    abstractC3317Mo5358.getUnmodifiedPayloads();
                    abstractC3369.getClass();
                    C1804 c1804 = new C1804();
                    c1804.m2441(abstractC3317Mo5358);
                    recyclerView.m5299(abstractC3317Mo5358, c1804);
                }
            }
            if (c3358.f7962 || !abstractC3317Mo5358.isBound()) {
                if (abstractC3317Mo5358.isBound() || abstractC3317Mo5358.needsUpdate() || abstractC3317Mo5358.isInvalid()) {
                    if (!RecyclerView.f7521 && abstractC3317Mo5358.isRemoved()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(abstractC3317Mo5358);
                        C3775.m6967(recyclerView.m5270(), sb2);
                        return null;
                    }
                    z = false;
                    int iM12433 = recyclerView.f7569.m1243(i, 0);
                    abstractC3317Mo5358.mBindingAdapter = null;
                    abstractC3317Mo5358.mOwnerRecyclerView = recyclerView;
                    int itemViewType = abstractC3317Mo5358.getItemViewType();
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j == Long.MAX_VALUE) {
                        long j6 = this.f7982.m5588(itemViewType).f7971;
                        if (j6 == 0 || j6 + nanoTime3 < j) {
                            if (abstractC3317Mo5358.isTmpDetached()) {
                                recyclerView.attachViewToParent(abstractC3317Mo5358.itemView, recyclerView.getChildCount(), abstractC3317Mo5358.itemView.getLayoutParams());
                                i4 = i3;
                            } else {
                                i4 = 0;
                            }
                            recyclerView.f7539.m5356(abstractC3317Mo5358, iM12433);
                            if (i4 != 0) {
                                recyclerView.detachViewFromParent(abstractC3317Mo5358.itemView);
                            }
                            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                            C3362 c3362M55882 = this.f7982.m5588(abstractC3317Mo5358.getItemViewType());
                            long j7 = c3362M55882.f7971;
                            if (j7 != 0) {
                                nanoTime4 = (nanoTime4 / j3) + ((j7 / j3) * j2);
                            }
                            c3362M55882.f7971 = nanoTime4;
                            AccessibilityManager accessibilityManager = recyclerView.f7528;
                            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                                i5 = i3;
                            } else {
                                View view2 = abstractC3317Mo5358.itemView;
                                if (view2.getImportantForAccessibility() == 0) {
                                    i5 = i3;
                                    view2.setImportantForAccessibility(i5);
                                } else {
                                    i5 = i3;
                                }
                                C3315 c3315 = recyclerView.f7552;
                                if (c3315 != null) {
                                    C3318 c3318 = c3315.f7779;
                                    if (c3318 != null) {
                                        View.AccessibilityDelegate accessibilityDelegateM4794 = AbstractC3103.m4794(view2);
                                        C3079 c3079 = accessibilityDelegateM4794 != null ? accessibilityDelegateM4794 instanceof C3080 ? ((C3080) accessibilityDelegateM4794).f6893 : new C3079(accessibilityDelegateM4794) : null;
                                        if (c3079 != null && c3079 != c3318) {
                                            c3318.f7783.put(view2, c3079);
                                        }
                                    }
                                    AbstractC3103.m4804(view2, c3318);
                                }
                            }
                            if (c3358.f7962) {
                                abstractC3317Mo5358.mPreLayoutPosition = i;
                            }
                            i6 = i5;
                        } else {
                            i6 = 0;
                            i5 = i3;
                        }
                        i7 = i6;
                    }
                }
                layoutParams = abstractC3317Mo5358.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c3351 = (C3351) recyclerView.generateDefaultLayoutParams();
                    abstractC3317Mo5358.itemView.setLayoutParams(c3351);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c3351 = (C3351) layoutParams;
                } else {
                    c3351 = (C3351) recyclerView.generateLayoutParams(layoutParams);
                    abstractC3317Mo5358.itemView.setLayoutParams(c3351);
                }
                c3351.f7924 = abstractC3317Mo5358;
                c3351.f7921 = (i2 == 0 || i7 == 0) ? z : i5;
                return abstractC3317Mo5358;
            }
            abstractC3317Mo5358.mPreLayoutPosition = i;
            i5 = i3;
            z = false;
            i7 = 0;
            layoutParams = abstractC3317Mo5358.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            c3351.f7924 = abstractC3317Mo5358;
            c3351.f7921 = (i2 == 0 || i7 == 0) ? z : i5;
            return abstractC3317Mo5358;
        }
        abstractC3317Mo5358 = null;
        ArrayList arrayList22 = this.f7980;
        ArrayList arrayList32 = this.f7978;
        if (abstractC3317Mo5358 != null) {
        }
        if (abstractC3317Mo5358 != null) {
        }
        if (i2 != 0) {
            abstractC3317Mo5358.setFlags(0, 8192);
            if (c3358.f7966) {
            }
        }
        if (c3358.f7962) {
            if (abstractC3317Mo5358.isBound()) {
            }
            if (!RecyclerView.f7521) {
            }
            z = false;
            int iM124332 = recyclerView.f7569.m1243(i, 0);
            abstractC3317Mo5358.mBindingAdapter = null;
            abstractC3317Mo5358.mOwnerRecyclerView = recyclerView;
            int itemViewType2 = abstractC3317Mo5358.getItemViewType();
            long nanoTime32 = recyclerView.getNanoTime();
            if (j == Long.MAX_VALUE) {
            }
        }
        layoutParams = abstractC3317Mo5358.itemView.getLayoutParams();
        if (layoutParams == null) {
        }
        c3351.f7924 = abstractC3317Mo5358;
        c3351.f7921 = (i2 == 0 || i7 == 0) ? z : i5;
        return abstractC3317Mo5358;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5601(View view) {
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        boolean zIsTmpDetached = abstractC3317M5249.isTmpDetached();
        RecyclerView recyclerView = this.f7981;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC3317M5249.isScrap()) {
            abstractC3317M5249.unScrap();
        } else if (abstractC3317M5249.wasReturnedFromScrap()) {
            abstractC3317M5249.clearReturnedFromScrapFlag();
        }
        m5602(abstractC3317M5249);
        if (recyclerView.f7599 == null || abstractC3317M5249.isRecyclable()) {
            return;
        }
        recyclerView.f7599.mo5529(abstractC3317M5249);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5602(AbstractC3317 abstractC3317) {
        boolean z;
        int i;
        RecyclerView recyclerView = this.f7981;
        C1758 c1758 = recyclerView.f7587;
        boolean z2 = true;
        if (abstractC3317.isScrap() || abstractC3317.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC3317.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC3317.itemView.getParent() != null);
            sb.append(recyclerView.m5270());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC3317.isTmpDetached()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC3317);
            C5043.m9162(recyclerView.m5270(), sb2);
            return;
        }
        if (abstractC3317.shouldIgnore()) {
            C6755.m11869("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.m5270()));
            return;
        }
        boolean zDoesTransientStatePreventRecycling = abstractC3317.doesTransientStatePreventRecycling();
        AbstractC3283 abstractC3283 = recyclerView.f7539;
        boolean z3 = abstractC3283 != null && zDoesTransientStatePreventRecycling && abstractC3283.mo5361(abstractC3317);
        boolean z4 = RecyclerView.f7521;
        ArrayList arrayList = this.f7978;
        if (z4 && arrayList.contains(abstractC3317)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC3317);
            C5043.m9162(recyclerView.m5270(), sb3);
            return;
        }
        if (z3 || abstractC3317.isRecyclable()) {
            if (this.f7975 <= 0 || abstractC3317.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f7975 && size > 0) {
                    m5597(0);
                    size--;
                }
                if (RecyclerView.f7516 && size > 0) {
                    int i2 = abstractC3317.mPosition;
                    if (((int[]) c1758.f2955) != null) {
                        int i3 = c1758.f2956 * 2;
                        for (int i4 = 0; i4 < i3; i4 += 2) {
                            if (((int[]) c1758.f2955)[i4] == i2) {
                                break;
                            }
                        }
                        i = size - 1;
                        loop1: while (i >= 0) {
                            int i5 = ((AbstractC3317) arrayList.get(i)).mPosition;
                            if (((int[]) c1758.f2955) == null) {
                                break;
                            }
                            int i6 = c1758.f2956 * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (((int[]) c1758.f2955)[i7] == i5) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i + 1;
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC3317);
                z = true;
            }
            if (z) {
                z2 = false;
            } else {
                m5594(abstractC3317, true);
            }
            z = z;
        } else {
            if (RecyclerView.f7522) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.m5270()));
            }
            z2 = false;
        }
        recyclerView.f7574.m5483(abstractC3317);
        if (z || z2 || !zDoesTransientStatePreventRecycling) {
            return;
        }
        AbstractC3889.m7301(abstractC3317.itemView);
        abstractC3317.mBindingAdapter = null;
        abstractC3317.mOwnerRecyclerView = null;
    }
}
