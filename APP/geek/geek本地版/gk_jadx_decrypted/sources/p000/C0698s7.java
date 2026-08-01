package p000;

import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: s7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0698s7 extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0852wd f4391b;

    public /* synthetic */ C0698s7(AbstractC0852wd abstractC0852wd, int i) {
        this.f4390a = i;
        this.f4391b = abstractC0852wd;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1320H(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f4390a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            wd r6 = r4.f4391b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f1152h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f1160p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            wd r0 = r4.f4391b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f1024L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f1040a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f1037Y
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f1034V
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
            java.lang.ref.WeakReference r6 = r0.f1033U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0698s7.mo1320H(android.view.View, int):boolean");
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: b */
    public final int mo1321b(View view, int i) {
        switch (this.f4390a) {
            case Base64.DEFAULT /* 0 */:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4391b;
                return AbstractC0126ct.m810d(i, sideSheetBehavior.f1145a.mo1063o(), sideSheetBehavior.f1145a.mo1062n());
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: c */
    public final int mo1322c(View view, int i) {
        switch (this.f4390a) {
            case Base64.DEFAULT /* 0 */:
                return AbstractC0126ct.m810d(i, ((BottomSheetBehavior) this.f4391b).m731x(), mo1324m());
            default:
                return view.getTop();
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: l */
    public int mo1323l(View view) {
        switch (this.f4390a) {
            case Base64.NO_PADDING /* 1 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4391b;
                return sideSheetBehavior.f1156l + sideSheetBehavior.f1159o;
            default:
                return super.mo1323l(view);
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: m */
    public int mo1324m() {
        switch (this.f4390a) {
            case Base64.DEFAULT /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4391b;
                return bottomSheetBehavior.f1021I ? bottomSheetBehavior.f1032T : bottomSheetBehavior.f1019G;
            default:
                return super.mo1324m();
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: s */
    public final void mo1326s(int i) {
        switch (this.f4390a) {
            case Base64.DEFAULT /* 0 */:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4391b;
                    if (bottomSheetBehavior.f1023K) {
                        bottomSheetBehavior.m717C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4391b;
                    if (sideSheetBehavior.f1151g) {
                        sideSheetBehavior.m762r(1);
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: t */
    public final void mo1327t(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f4390a) {
            case Base64.DEFAULT /* 0 */:
                ((BottomSheetBehavior) this.f4391b).m730u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4391b;
                WeakReference weakReference = sideSheetBehavior.f1161q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1145a.mo1057R(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1165u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1145a.mo1059b(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw z30.m2763h(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1328u(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0698s7.mo1328u(android.view.View, float, float):void");
    }
}
