package p000;

import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: c8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c8 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0889xd f831b;

    public /* synthetic */ C0095c8(AbstractC0889xd abstractC0889xd, int i) {
        this.f830a = i;
        this.f831b = abstractC0889xd;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: A */
    public final void mo588A(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f830a) {
            case Base64.DEFAULT /* 0 */:
                ((BottomSheetBehavior) this.f831b).m688u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f831b;
                WeakReference weakReference = sideSheetBehavior.f1086q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1070a.mo1327N(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1090u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1070a.mo1329b(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g40.m1145h(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo589B(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0095c8.mo589B(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo590I(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f830a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            xd r6 = r4.f831b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f1077h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f1085p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            xd r0 = r4.f831b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f949L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f965a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f962Y
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f959V
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f958U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0095c8.mo590I(android.view.View, int):boolean");
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: e */
    public final int mo591e(View view, int i) {
        switch (this.f830a) {
            case Base64.DEFAULT /* 0 */:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f831b;
                return AbstractC0274gu.m1309c(i, sideSheetBehavior.f1070a.mo1333o(), sideSheetBehavior.f1070a.mo1332n());
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: f */
    public final int mo592f(View view, int i) {
        switch (this.f830a) {
            case Base64.DEFAULT /* 0 */:
                return AbstractC0274gu.m1309c(i, ((BottomSheetBehavior) this.f831b).m689x(), mo594r());
            default:
                return view.getTop();
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: q */
    public int mo593q(View view) {
        switch (this.f830a) {
            case Base64.NO_PADDING /* 1 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f831b;
                return sideSheetBehavior.f1081l + sideSheetBehavior.f1084o;
            default:
                return super.mo593q(view);
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: r */
    public int mo594r() {
        switch (this.f830a) {
            case Base64.DEFAULT /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f831b;
                return bottomSheetBehavior.f946I ? bottomSheetBehavior.f957T : bottomSheetBehavior.f944G;
            default:
                return super.mo594r();
        }
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: z */
    public final void mo595z(int i) {
        switch (this.f830a) {
            case Base64.DEFAULT /* 0 */:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f831b;
                    if (bottomSheetBehavior.f948K) {
                        bottomSheetBehavior.m675C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f831b;
                    if (sideSheetBehavior.f1076g) {
                        sideSheetBehavior.m720r(1);
                    }
                }
                break;
        }
    }
}
