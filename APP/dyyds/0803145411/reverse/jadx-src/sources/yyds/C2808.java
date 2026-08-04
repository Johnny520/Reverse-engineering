package yyds;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲈᲈᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2808 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f13687;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f13688;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f13689;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ArrayList f13690;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2773 f13691;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f13692;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f13693;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f13694;

    public C2808(C1213 c1213) {
        this.f13687 = c1213;
        ArrayList arrayList = new ArrayList();
        this.f13689 = arrayList;
        this.f13690 = null;
        this.f13692 = new ArrayList();
        this.f13694 = Collections.unmodifiableList(arrayList);
        this.f13688 = 2;
        this.f13693 = 2;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4927(View view) {
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        boolean zM781 = abstractC0185M2412.m781();
        C1213 c1213 = this.f13687;
        if (zM781) {
            c1213.removeDetachedView(view, false);
        }
        if (abstractC0185M2412.m783()) {
            abstractC0185M2412.f1090.m4935(abstractC0185M2412);
        } else if (abstractC0185M2412.m779()) {
            abstractC0185M2412.f1091 &= -33;
        }
        m4929(abstractC0185M2412);
        if (c1213.f5532 == null || abstractC0185M2412.m772()) {
            return;
        }
        c1213.f5532.mo4467(abstractC0185M2412);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m4928() {
        AbstractC2551 abstractC2551 = this.f13687.f5583;
        this.f13693 = this.f13688 + (abstractC2551 != null ? abstractC2551.f12604 : 0);
        ArrayList arrayList = this.f13692;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f13693; size--) {
            m4933(size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4929(AbstractC0185 abstractC0185) {
        boolean z;
        boolean z2;
        int i;
        C1213 c1213 = this.f13687;
        C2347 c2347 = c1213.f22;
        boolean zM783 = abstractC0185.m783();
        View view = abstractC0185.f1093;
        boolean z3 = true;
        if (zM783 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0185.m783());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(c1213.m2454());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0185.m781()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC0185);
            C1693.m3440(sb2, c1213.m2454());
            return;
        }
        if (abstractC0185.m785()) {
            C0188.m798("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(c1213.m2454()));
            return;
        }
        if ((abstractC0185.f1091 & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            z = view.hasTransientState();
        }
        boolean z4 = C1213.f5511;
        ArrayList arrayList = this.f13692;
        if (z4 && arrayList.contains(abstractC0185)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC0185);
            C1693.m3440(sb3, c1213.m2454());
            return;
        }
        if (abstractC0185.m772()) {
            if (this.f13693 <= 0 || (abstractC0185.f1091 & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f13693 && size > 0) {
                    m4933(0);
                    size--;
                }
                if (C1213.f5514 && size > 0) {
                    int i2 = abstractC0185.f1102;
                    if (c2347.f11527 != null) {
                        int i3 = c2347.f11529 * 2;
                        for (int i4 = 0; i4 < i3; i4 += 2) {
                            if (c2347.f11527[i4] == i2) {
                                break;
                            }
                        }
                        i = size - 1;
                        loop1: while (i >= 0) {
                            int i5 = ((AbstractC0185) arrayList.get(i)).f1102;
                            if (c2347.f11527 == null) {
                                break;
                            }
                            int i6 = c2347.f11529 * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (c2347.f11527[i7] == i5) {
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
                arrayList.add(size, abstractC0185);
                z2 = true;
            }
            if (z2) {
                z3 = false;
            } else {
                m4931(abstractC0185, true);
            }
            z = z2;
        } else {
            if (C1213.f5512) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(c1213.m2454()));
            }
            z3 = false;
        }
        c1213.f5528.m540(abstractC0185);
        if (z || z3 || !z) {
            return;
        }
        AbstractC1579.m3236(view);
        abstractC0185.f1095 = null;
        abstractC0185.f1097 = null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4930(AbstractC0359 abstractC0359, boolean z) {
        C2773 c2773 = this.f13691;
        if (c2773 != null) {
            SparseArray sparseArray = c2773.f13522;
            Set set = c2773.f13524;
            set.remove(abstractC0359);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2118) sparseArray.get(sparseArray.keyAt(i))).f10462;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AbstractC1579.m3236(((AbstractC0185) arrayList.get(i2)).f1093);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4931(AbstractC0185 abstractC0185, boolean z) {
        C1213.m2410(abstractC0185);
        View view = abstractC0185.f1093;
        C1213 c1213 = this.f13687;
        C1566 c1566 = c1213.f5552;
        if (c1566 != null) {
            C1669 c1669 = c1566.f7961;
            AbstractC1640.m3346(view, c1669 != null ? (C2060) c1669.f8521.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = c1213.f5549;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                C0188.m794();
                return;
            }
            AbstractC0359 abstractC0359 = c1213.f5537;
            if (abstractC0359 != null) {
                abstractC0359.mo706(abstractC0185);
            }
            if (c1213.f5568 != null) {
                c1213.f5528.m540(abstractC0185);
            }
            if (C1213.f5512) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC0185);
            }
        }
        abstractC0185.f1095 = null;
        abstractC0185.f1097 = null;
        C2773 c2773M4937 = m4937();
        c2773M4937.getClass();
        int i = abstractC0185.f1092;
        ArrayList arrayList2 = c2773M4937.m4889(i).f10462;
        ((C2118) c2773M4937.f13522.get(i)).getClass();
        if (5 <= arrayList2.size()) {
            AbstractC1579.m3236(view);
        } else if (C1213.f5511 && arrayList2.contains(abstractC0185)) {
            C0188.m798("this scrap item already exists");
        } else {
            abstractC0185.m771();
            arrayList2.add(abstractC0185);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m4932(int i) {
        C1213 c1213 = this.f13687;
        C2637 c2637 = c1213.f5568;
        if (i >= 0 && i < c2637.m4742()) {
            return !c2637.f12977 ? i : c1213.f5553.m2515(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + c2637.m4742() + c1213.m2454());
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4933(int i) {
        if (C1213.f5512) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f13692;
        AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(i);
        if (C1213.f5512) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC0185);
        }
        m4931(abstractC0185, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0560  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0185 m4934(int i, long j) {
        AbstractC0185 abstractC0185;
        boolean z;
        long j2;
        long j3;
        long j4;
        boolean z2;
        AbstractC0185 abstractC01852;
        ViewGroup.LayoutParams layoutParams;
        C2526 c2526;
        int i2;
        C1213 c1213M2411;
        View view;
        boolean z3;
        int size;
        C1213 c1213 = this.f13687;
        C2637 c2637 = c1213.f5568;
        if (i < 0 || i >= c2637.m4742()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + c2637.m4742() + c1213.m2454());
        }
        boolean z4 = false;
        if (c2637.f12977) {
            ArrayList arrayList = this.f13690;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                abstractC0185 = null;
                z = abstractC0185 == null;
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    abstractC0185 = (AbstractC0185) this.f13690.get(i3);
                    if (!abstractC0185.m779() && abstractC0185.m787() == i) {
                        abstractC0185.m776(32);
                        break;
                    }
                }
                c1213.f5537.getClass();
                abstractC0185 = null;
                if (abstractC0185 == null) {
                }
            }
            if (abstractC0185 == null) {
                ArrayList arrayList2 = this.f13689;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0185 abstractC01853 = (AbstractC0185) arrayList2.get(i4);
                    if (!abstractC01853.m779() && abstractC01853.m787() == i && !abstractC01853.m780() && (c2637.f12977 || !abstractC01853.m774())) {
                        abstractC01853.m776(32);
                        abstractC0185 = abstractC01853;
                        break;
                    }
                }
                ArrayList arrayList3 = (ArrayList) c1213.f5523.f13647;
                int size3 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        view = null;
                        break;
                    }
                    view = (View) arrayList3.get(i5);
                    AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
                    if (abstractC0185M2412.m787() == i && !abstractC0185M2412.m780() && !abstractC0185M2412.m774()) {
                        break;
                    }
                    i5++;
                }
                if (view != null) {
                    AbstractC0185 abstractC0185M24122 = C1213.m2412(view);
                    C2791 c2791 = c1213.f5523;
                    C1641 c1641 = (C1641) c2791.f13645;
                    int iIndexOfChild = ((C2378) c2791.f13650).f11724.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        C0188.m795(view, "view is not a child, cannot hide ");
                        return null;
                    }
                    if (!c1641.m3355(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    c1641.m3350(iIndexOfChild);
                    c2791.m4914(view);
                    C2791 c27912 = c1213.f5523;
                    C1641 c16412 = (C1641) c27912.f13645;
                    int iIndexOfChild2 = ((C2378) c27912.f13650).f11724.indexOfChild(view);
                    int iM3351 = (iIndexOfChild2 == -1 || c16412.m3355(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c16412.m3351(iIndexOfChild2);
                    if (iM3351 == -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC0185M24122 + c1213.m2454());
                    }
                    c1213.f5523.m4920(iM3351);
                    m4936(view);
                    abstractC0185M24122.m776(8224);
                    abstractC0185 = abstractC0185M24122;
                } else {
                    ArrayList arrayList4 = this.f13692;
                    int size4 = arrayList4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        AbstractC0185 abstractC01854 = (AbstractC0185) arrayList4.get(i6);
                        if (!abstractC01854.m780() && abstractC01854.m787() == i) {
                            View view2 = abstractC01854.f1093;
                            if (view2.getParent() == null || view2.getParent() == abstractC01854.f1097) {
                                arrayList4.remove(i6);
                                if (C1213.f5512) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC01854);
                                }
                                abstractC0185 = abstractC01854;
                            }
                        }
                    }
                    abstractC0185 = null;
                }
                if (abstractC0185 != null) {
                    if (!abstractC0185.m774()) {
                        int i7 = abstractC0185.f1102;
                        if (i7 < 0 || i7 >= c1213.f5537.mo531()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0185 + c1213.m2454());
                        }
                        if (c2637.f12977 || c1213.f5537.mo705() == abstractC0185.f1092) {
                            c1213.f5537.getClass();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        if (C1213.f5511 && !c2637.f12977) {
                            C0188.m800("should not receive a removed view unless it is pre layout".concat(c1213.m2454()));
                            return null;
                        }
                        z3 = c2637.f12977;
                    }
                    if (z3) {
                        z = true;
                    } else {
                        abstractC0185.m776(4);
                        if (abstractC0185.m783()) {
                            c1213.removeDetachedView(abstractC0185.f1093, false);
                            abstractC0185.f1090.m4935(abstractC0185);
                        } else if (abstractC0185.m779()) {
                            abstractC0185.f1091 &= -33;
                        }
                        m4929(abstractC0185);
                        abstractC0185 = null;
                    }
                }
            }
            if (abstractC0185 != null) {
                int iM2515 = c1213.f5553.m2515(i, 0);
                if (iM2515 >= 0) {
                    j3 = 3;
                    if (iM2515 < c1213.f5537.mo531()) {
                        int iMo705 = c1213.f5537.mo705();
                        c1213.f5537.getClass();
                        if (abstractC0185 == null) {
                            if (C1213.f5512) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            C2118 c2118 = (C2118) m4937().f13522.get(iMo705);
                            if (c2118 != null) {
                                ArrayList arrayList5 = c2118.f10462;
                                if (arrayList5.isEmpty()) {
                                    j4 = 4;
                                    abstractC0185 = null;
                                    if (abstractC0185 != null) {
                                    }
                                } else {
                                    for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                                        AbstractC0185 abstractC01855 = (AbstractC0185) arrayList5.get(size5);
                                        j4 = 4;
                                        View view3 = abstractC01855.f1093;
                                        if (view3.getParent() == null || view3.getParent() == abstractC01855.f1097) {
                                            abstractC0185 = (AbstractC0185) arrayList5.remove(size5);
                                            break;
                                        }
                                    }
                                    j4 = 4;
                                    abstractC0185 = null;
                                    if (abstractC0185 != null) {
                                        abstractC0185.m771();
                                        boolean z5 = C1213.f5511;
                                    }
                                }
                            }
                        } else {
                            j4 = 4;
                        }
                        if (abstractC0185 == null) {
                            long nanoTime = c1213.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j5 = this.f13691.m4889(iMo705).f10463;
                                if (j5 != 0 && j5 + nanoTime >= j) {
                                    return null;
                                }
                            }
                            AbstractC0359 abstractC0359 = c1213.f5537;
                            abstractC0359.getClass();
                            try {
                                if (Trace.isEnabled()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo705)));
                                }
                                AbstractC0185 abstractC0185Mo473 = abstractC0359.mo473(c1213, iMo705);
                                View view4 = abstractC0185Mo473.f1093;
                                if (view4.getParent() != null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                abstractC0185Mo473.f1092 = iMo705;
                                Trace.endSection();
                                if (C1213.f5514 && (c1213M2411 = C1213.m2411(view4)) != null) {
                                    abstractC0185Mo473.f1096 = new WeakReference(c1213M2411);
                                }
                                j2 = 0;
                                long nanoTime2 = c1213.getNanoTime() - nanoTime;
                                C2118 c2118M4889 = this.f13691.m4889(iMo705);
                                long j6 = c2118M4889.f10463;
                                if (j6 != 0) {
                                    nanoTime2 = (nanoTime2 / j4) + ((j6 / j4) * 3);
                                }
                                c2118M4889.f10463 = nanoTime2;
                                if (C1213.f5512) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                                abstractC0185 = abstractC0185Mo473;
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            j2 = 0;
                        }
                    }
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM2515 + ").state:" + c2637.m4742() + c1213.m2454());
            }
            j2 = 0;
            j3 = 3;
            j4 = 4;
            View view5 = abstractC0185.f1093;
            if (z && !c2637.f12977) {
                i2 = abstractC0185.f1091;
                if ((i2 & 8192) != 0) {
                    abstractC0185.f1091 = i2 & (-8193);
                    if (c2637.f12980) {
                        AbstractC2411.m4462(abstractC0185);
                        AbstractC2411 abstractC2411 = c1213.f5532;
                        abstractC0185.m775();
                        abstractC2411.getClass();
                        C2292 c2292 = new C2292();
                        c2292.m4295(abstractC0185);
                        c1213.m2468(abstractC0185, c2292);
                    }
                }
            }
            if (!c2637.f12977 && abstractC0185.m786()) {
                abstractC0185.f1104 = i;
            } else if (abstractC0185.m786() || (abstractC0185.f1091 & 2) != 0 || abstractC0185.m780()) {
                if (!C1213.f5511 && abstractC0185.m774()) {
                    throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC0185 + c1213.m2454());
                }
                int iM25152 = c1213.f5553.m2515(i, 0);
                abstractC0185.f1095 = null;
                abstractC0185.f1097 = c1213;
                int i8 = abstractC0185.f1092;
                long nanoTime3 = c1213.getNanoTime();
                if (j == Long.MAX_VALUE) {
                    long j7 = this.f13691.m4889(i8).f10464;
                    if (j7 == j2 || j7 + nanoTime3 < j) {
                        if (abstractC0185.m781()) {
                            c1213.attachViewToParent(view5, c1213.getChildCount(), view5.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC0359 abstractC03592 = c1213.f5537;
                        abstractC03592.getClass();
                        boolean z6 = abstractC0185.f1095 == null;
                        if (z6) {
                            abstractC0185.f1102 = iM25152;
                            abstractC01852 = null;
                            abstractC0185.f1091 = (abstractC0185.f1091 & (-520)) | 1;
                            if (Trace.isEnabled()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(abstractC0185.f1092)));
                            }
                        } else {
                            abstractC01852 = null;
                        }
                        abstractC0185.f1095 = abstractC03592;
                        if (C1213.f5511) {
                            if (view5.getParent() == null && view5.isAttachedToWindow() != abstractC0185.m781()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC0185.m781() + ", attached to window: " + view5.isAttachedToWindow() + ", holder: " + abstractC0185);
                            }
                            if (view5.getParent() == null && view5.isAttachedToWindow()) {
                                C0188.m799(abstractC0185, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return abstractC01852;
                            }
                        }
                        abstractC0185.m775();
                        abstractC03592.mo472(abstractC0185, iM25152);
                        if (z6) {
                            ArrayList arrayList6 = abstractC0185.f1101;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            abstractC0185.f1091 &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                            if (layoutParams2 instanceof C2526) {
                                ((C2526) layoutParams2).f12450 = true;
                            }
                        }
                        if (z2) {
                            c1213.detachViewFromParent(view5);
                        }
                        long nanoTime4 = c1213.getNanoTime() - nanoTime3;
                        C2118 c2118M48892 = this.f13691.m4889(abstractC0185.f1092);
                        long j8 = c2118M48892.f10464;
                        if (j8 != j2) {
                            nanoTime4 = (nanoTime4 / j4) + ((j8 / j4) * j3);
                        }
                        c2118M48892.f10464 = nanoTime4;
                        AccessibilityManager accessibilityManager = c1213.f5567;
                        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                            if (view5.getImportantForAccessibility() == 0) {
                                view5.setImportantForAccessibility(1);
                            }
                            C1566 c1566 = c1213.f5552;
                            if (c1566 != null) {
                                C1669 c1669 = c1566.f7961;
                                if (c1669 != null) {
                                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                                    View.AccessibilityDelegate accessibilityDelegateM2534 = AbstractC1256.m2534(view5);
                                    Object c2060 = accessibilityDelegateM2534 == null ? abstractC01852 : accessibilityDelegateM2534 instanceof C1862 ? ((C1862) accessibilityDelegateM2534).f9347 : new C2060(accessibilityDelegateM2534);
                                    if (c2060 != null && c2060 != c1669) {
                                        c1669.f8521.put(view5, c2060);
                                    }
                                }
                                AbstractC1640.m3346(view5, c1669);
                            }
                        }
                        if (c2637.f12977) {
                            abstractC0185.f1104 = i;
                        }
                        z4 = true;
                    }
                }
            }
            layoutParams = view5.getLayoutParams();
            if (layoutParams != null) {
                c2526 = (C2526) c1213.generateDefaultLayoutParams();
                view5.setLayoutParams(c2526);
            } else if (c1213.checkLayoutParams(layoutParams)) {
                c2526 = (C2526) layoutParams;
            } else {
                c2526 = (C2526) c1213.generateLayoutParams(layoutParams);
                view5.setLayoutParams(c2526);
            }
            c2526.f12448 = abstractC0185;
            c2526.f12451 = !z && z4;
            return abstractC0185;
        }
        abstractC0185 = null;
        if (abstractC0185 == null) {
        }
        if (abstractC0185 != null) {
        }
        View view52 = abstractC0185.f1093;
        if (z) {
            i2 = abstractC0185.f1091;
            if ((i2 & 8192) != 0) {
            }
        }
        if (!c2637.f12977) {
            if (abstractC0185.m786()) {
                if (!C1213.f5511) {
                }
                int iM251522 = c1213.f5553.m2515(i, 0);
                abstractC0185.f1095 = null;
                abstractC0185.f1097 = c1213;
                int i82 = abstractC0185.f1092;
                long nanoTime32 = c1213.getNanoTime();
                if (j == Long.MAX_VALUE) {
                }
            }
        }
        layoutParams = view52.getLayoutParams();
        if (layoutParams != null) {
        }
        c2526.f12448 = abstractC0185;
        c2526.f12451 = !z && z4;
        return abstractC0185;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m4935(AbstractC0185 abstractC0185) {
        if (abstractC0185.f1088) {
            this.f13690.remove(abstractC0185);
        } else {
            this.f13689.remove(abstractC0185);
        }
        abstractC0185.f1090 = null;
        abstractC0185.f1088 = false;
        abstractC0185.f1091 &= -33;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4936(View view) {
        AbstractC2411 abstractC2411;
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        int i = abstractC0185M2412.f1091 & 12;
        C1213 c1213 = this.f13687;
        if (i == 0 && abstractC0185M2412.m782() && (abstractC2411 = c1213.f5532) != null) {
            C2446 c2446 = (C2446) abstractC2411;
            if (abstractC0185M2412.m775().isEmpty() && c2446.f12050 && !abstractC0185M2412.m780()) {
                ArrayList arrayList = this.f13690;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f13690 = arrayList;
                }
                abstractC0185M2412.f1090 = this;
                abstractC0185M2412.f1088 = true;
                arrayList.add(abstractC0185M2412);
                return;
            }
        }
        if (abstractC0185M2412.m780() && !abstractC0185M2412.m774()) {
            c1213.f5537.getClass();
            C0188.m798("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(c1213.m2454()));
        } else {
            abstractC0185M2412.f1090 = this;
            abstractC0185M2412.f1088 = false;
            this.f13689.add(abstractC0185M2412);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2773 m4937() {
        if (this.f13691 == null) {
            C2773 c2773 = new C2773();
            c2773.f13522 = new SparseArray();
            c2773.f13523 = 0;
            c2773.f13524 = Collections.newSetFromMap(new IdentityHashMap());
            this.f13691 = c2773;
            m4939();
        }
        return this.f13691;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4938() {
        ArrayList arrayList = this.f13692;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4933(size);
        }
        arrayList.clear();
        if (C1213.f5514) {
            C2347 c2347 = this.f13687.f22;
            int[] iArr = c2347.f11527;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c2347.f11529 = 0;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4939() {
        C1213 c1213;
        AbstractC0359 abstractC0359;
        C2773 c2773 = this.f13691;
        if (c2773 == null || (abstractC0359 = (c1213 = this.f13687).f5537) == null || !c1213.f5557) {
            return;
        }
        c2773.f13524.add(abstractC0359);
    }
}
