package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ez */
/* JADX INFO: loaded from: classes.dex */
public final class C0205ez {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f1865a;

    public /* synthetic */ C0205ez(RecyclerView recyclerView) {
        this.f1865a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m1093a(C0877x1 c0877x1) {
        int i = c0877x1.f5080a;
        RecyclerView recyclerView = this.f1865a;
        if (i == 1) {
            recyclerView.f605l.mo293U(c0877x1.f5081b, c0877x1.f5082c);
            return;
        }
        if (i == 2) {
            recyclerView.f605l.mo296X(c0877x1.f5081b, c0877x1.f5082c);
        } else if (i == 4) {
            recyclerView.f605l.mo297Y(c0877x1.f5081b, c0877x1.f5082c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f605l.mo295W(c0877x1.f5081b, c0877x1.f5082c);
        }
    }

    /* JADX INFO: renamed from: b */
    public b00 m1094b(int i) {
        RecyclerView recyclerView = this.f1865a;
        int iM2240t = recyclerView.f591e.m2240t();
        int i2 = 0;
        b00 b00Var = null;
        while (true) {
            if (i2 >= iM2240t) {
                break;
            }
            b00 b00VarM367I = RecyclerView.m367I(recyclerView.f591e.m2239s(i2));
            if (b00VarM367I != null && !b00VarM367I.m488h() && b00VarM367I.f699c == i) {
                if (!((ArrayList) recyclerView.f591e.f4211d).contains(b00VarM367I.f697a)) {
                    b00Var = b00VarM367I;
                    break;
                }
                b00Var = b00VarM367I;
            }
            i2++;
        }
        if (b00Var != null) {
            if (!((ArrayList) recyclerView.f591e.f4211d).contains(b00Var.f697a)) {
                return b00Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m1095c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f1865a;
        int iM2240t = recyclerView.f591e.m2240t();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2240t; i6++) {
            View viewM2239s = recyclerView.f591e.m2239s(i6);
            b00 b00VarM367I = RecyclerView.m367I(viewM2239s);
            if (b00VarM367I != null && !b00VarM367I.m495o() && (i4 = b00VarM367I.f699c) >= i && i4 < i5) {
                b00VarM367I.m481a(2);
                b00VarM367I.m481a(1024);
                ((C0577oz) viewM2239s.getLayoutParams()).f3623c = true;
            }
        }
        C0763tz c0763tz = recyclerView.f585b;
        ArrayList arrayList = c0763tz.f4635c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b00 b00Var = (b00) arrayList.get(size);
            if (b00Var != null && (i3 = b00Var.f699c) >= i && i3 < i5) {
                b00Var.m481a(2);
                c0763tz.m2397e(size);
            }
        }
        recyclerView.f596g0 = true;
    }

    /* JADX INFO: renamed from: d */
    public void m1096d(int i, int i2) {
        RecyclerView recyclerView = this.f1865a;
        int iM2240t = recyclerView.f591e.m2240t();
        for (int i3 = 0; i3 < iM2240t; i3++) {
            b00 b00VarM367I = RecyclerView.m367I(recyclerView.f591e.m2239s(i3));
            if (b00VarM367I != null && !b00VarM367I.m495o() && b00VarM367I.f699c >= i) {
                b00VarM367I.m492l(i2, false);
                recyclerView.f588c0.f5420f = true;
            }
        }
        ArrayList arrayList = recyclerView.f585b.f4635c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b00 b00Var = (b00) arrayList.get(i4);
            if (b00Var != null && b00Var.f699c >= i) {
                b00Var.m492l(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f594f0 = true;
    }

    /* JADX INFO: renamed from: e */
    public void m1097e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f1865a;
        int iM2240t = recyclerView.f591e.m2240t();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM2240t; i11++) {
            b00 b00VarM367I = RecyclerView.m367I(recyclerView.f591e.m2239s(i11));
            if (b00VarM367I != null && (i9 = b00VarM367I.f699c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    b00VarM367I.m492l(i2 - i, false);
                } else {
                    b00VarM367I.m492l(i5, false);
                }
                recyclerView.f588c0.f5420f = true;
            }
        }
        ArrayList arrayList = recyclerView.f585b.f4635c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b00 b00Var = (b00) arrayList.get(i12);
            if (b00Var != null && (i8 = b00Var.f699c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    b00Var.m492l(i2 - i, false);
                } else {
                    b00Var.m492l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f594f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1098f(p000.b00 r9, p000.C0463lw r10, p000.C0463lw r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1865a
            r0.getClass()
            r1 = 0
            r9.m494n(r1)
            jz r1 = r0.f567H
            r2 = r1
            uf r2 = (p000.C0780uf) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f3117a
            int r6 = r11.f3117a
            if (r4 != r6) goto L22
            int r1 = r10.f3118b
            int r3 = r11.f3118b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f3118b
            int r7 = r11.f3118b
            r3 = r9
            boolean r9 = r2.m2449g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.m2453l(r3)
            android.view.View r9 = r3.f697a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f4719i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.m389S()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0205ez.m1098f(b00, lw, lw):void");
    }

    /* JADX INFO: renamed from: g */
    public void m1099g(b00 b00Var, C0463lw c0463lw, C0463lw c0463lw2) {
        boolean zM2449g;
        RecyclerView recyclerView = this.f1865a;
        recyclerView.f585b.m2402j(b00Var);
        recyclerView.m400f(b00Var);
        b00Var.m494n(false);
        C0780uf c0780uf = (C0780uf) recyclerView.f567H;
        c0780uf.getClass();
        int i = c0463lw.f3117a;
        int i2 = c0463lw.f3118b;
        View view = b00Var.f697a;
        int left = c0463lw2 == null ? view.getLeft() : c0463lw2.f3117a;
        int top = c0463lw2 == null ? view.getTop() : c0463lw2.f3118b;
        if (b00Var.m488h() || (i == left && i2 == top)) {
            c0780uf.m2453l(b00Var);
            c0780uf.f4718h.add(b00Var);
            zM2449g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2449g = c0780uf.m2449g(b00Var, i, i2, left, top);
        }
        if (zM2449g) {
            recyclerView.m389S();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1100h(int i) {
        RecyclerView recyclerView = this.f1865a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m367I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
