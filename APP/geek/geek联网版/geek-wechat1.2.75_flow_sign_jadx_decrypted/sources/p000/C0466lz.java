package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: lz */
/* JADX INFO: loaded from: classes.dex */
public final class C0466lz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f3055a;

    public /* synthetic */ C0466lz(RecyclerView recyclerView) {
        this.f3055a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m1781a(C0877x1 c0877x1) {
        int i = c0877x1.f5152a;
        RecyclerView recyclerView = this.f3055a;
        if (i == 1) {
            recyclerView.f568l.mo278U(c0877x1.f5153b, c0877x1.f5154c);
            return;
        }
        if (i == 2) {
            recyclerView.f568l.mo281X(c0877x1.f5153b, c0877x1.f5154c);
        } else if (i == 4) {
            recyclerView.f568l.mo282Y(c0877x1.f5153b, c0877x1.f5154c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f568l.mo280W(c0877x1.f5153b, c0877x1.f5154c);
        }
    }

    /* JADX INFO: renamed from: b */
    public i00 m1782b(int i) {
        RecyclerView recyclerView = this.f3055a;
        int iM2247t = recyclerView.f554e.m2247t();
        int i2 = 0;
        i00 i00Var = null;
        while (true) {
            if (i2 >= iM2247t) {
                break;
            }
            i00 i00VarM352I = RecyclerView.m352I(recyclerView.f554e.m2246s(i2));
            if (i00VarM352I != null && !i00VarM352I.m1426h() && i00VarM352I.f2298c == i) {
                if (!((ArrayList) recyclerView.f554e.f4066d).contains(i00VarM352I.f2296a)) {
                    i00Var = i00VarM352I;
                    break;
                }
                i00Var = i00VarM352I;
            }
            i2++;
        }
        if (i00Var != null) {
            if (!((ArrayList) recyclerView.f554e.f4066d).contains(i00Var.f2296a)) {
                return i00Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m1783c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3055a;
        int iM2247t = recyclerView.f554e.m2247t();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2247t; i6++) {
            View viewM2246s = recyclerView.f554e.m2246s(i6);
            i00 i00VarM352I = RecyclerView.m352I(viewM2246s);
            if (i00VarM352I != null && !i00VarM352I.m1433o() && (i4 = i00VarM352I.f2298c) >= i && i4 < i5) {
                i00VarM352I.m1419a(2);
                i00VarM352I.m1419a(1024);
                ((C0836vz) viewM2246s.getLayoutParams()).f5019c = true;
            }
        }
        a00 a00Var = recyclerView.f548b;
        ArrayList arrayList = a00Var.f5c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i00 i00Var = (i00) arrayList.get(size);
            if (i00Var != null && (i3 = i00Var.f2298c) >= i && i3 < i5) {
                i00Var.m1419a(2);
                a00Var.m7e(size);
            }
        }
        recyclerView.f559g0 = true;
    }

    /* JADX INFO: renamed from: d */
    public void m1784d(int i, int i2) {
        RecyclerView recyclerView = this.f3055a;
        int iM2247t = recyclerView.f554e.m2247t();
        for (int i3 = 0; i3 < iM2247t; i3++) {
            i00 i00VarM352I = RecyclerView.m352I(recyclerView.f554e.m2246s(i3));
            if (i00VarM352I != null && !i00VarM352I.m1433o() && i00VarM352I.f2298c >= i) {
                i00VarM352I.m1430l(i2, false);
                recyclerView.f551c0.f1710f = true;
            }
        }
        ArrayList arrayList = recyclerView.f548b.f5c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i00 i00Var = (i00) arrayList.get(i4);
            if (i00Var != null && i00Var.f2298c >= i) {
                i00Var.m1430l(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f557f0 = true;
    }

    /* JADX INFO: renamed from: e */
    public void m1785e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3055a;
        int iM2247t = recyclerView.f554e.m2247t();
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
        for (int i11 = 0; i11 < iM2247t; i11++) {
            i00 i00VarM352I = RecyclerView.m352I(recyclerView.f554e.m2246s(i11));
            if (i00VarM352I != null && (i9 = i00VarM352I.f2298c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    i00VarM352I.m1430l(i2 - i, false);
                } else {
                    i00VarM352I.m1430l(i5, false);
                }
                recyclerView.f551c0.f1710f = true;
            }
        }
        ArrayList arrayList = recyclerView.f548b.f5c;
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
            i00 i00Var = (i00) arrayList.get(i12);
            if (i00Var != null && (i8 = i00Var.f2298c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    i00Var.m1430l(i2 - i, false);
                } else {
                    i00Var.m1430l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f557f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1786f(p000.i00 r9, p000.C0759tw r10, p000.C0759tw r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3055a
            r0.getClass()
            r1 = 0
            r9.m1432n(r1)
            qz r1 = r0.f530H
            r2 = r1
            vf r2 = (p000.C0816vf) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f4593a
            int r6 = r11.f4593a
            if (r4 != r6) goto L22
            int r1 = r10.f4594b
            int r3 = r11.f4594b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f4594b
            int r7 = r11.f4594b
            r3 = r9
            boolean r9 = r2.m2565g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.m2569l(r3)
            android.view.View r9 = r3.f2296a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f4944i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.m374S()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0466lz.m1786f(i00, tw, tw):void");
    }

    /* JADX INFO: renamed from: g */
    public void m1787g(i00 i00Var, C0759tw c0759tw, C0759tw c0759tw2) {
        boolean zM2565g;
        RecyclerView recyclerView = this.f3055a;
        recyclerView.f548b.m12j(i00Var);
        recyclerView.m385f(i00Var);
        i00Var.m1432n(false);
        C0816vf c0816vf = (C0816vf) recyclerView.f530H;
        c0816vf.getClass();
        int i = c0759tw.f4593a;
        int i2 = c0759tw.f4594b;
        View view = i00Var.f2296a;
        int left = c0759tw2 == null ? view.getLeft() : c0759tw2.f4593a;
        int top = c0759tw2 == null ? view.getTop() : c0759tw2.f4594b;
        if (i00Var.m1426h() || (i == left && i2 == top)) {
            c0816vf.m2569l(i00Var);
            c0816vf.f4943h.add(i00Var);
            zM2565g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2565g = c0816vf.m2565g(i00Var, i, i2, left, top);
        }
        if (zM2565g) {
            recyclerView.m374S();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1788h(int i) {
        RecyclerView recyclerView = this.f3055a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m352I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
