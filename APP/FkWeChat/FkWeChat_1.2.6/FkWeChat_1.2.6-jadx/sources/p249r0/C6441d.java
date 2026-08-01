package p249r0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p165l1.AbstractC4510p;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: r0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6441d extends ViewGroup {

    /* JADX INFO: renamed from: q */
    public final int f20256q;

    /* JADX INFO: renamed from: r */
    public final List f20257r;

    /* JADX INFO: renamed from: s */
    public final List f20258s;

    /* JADX INFO: renamed from: t */
    public final C6443f f20259t;

    /* JADX INFO: renamed from: u */
    public int f20260u;

    public C6441d(Context context) {
        super(context);
        this.f20256q = 5;
        ArrayList arrayList = new ArrayList();
        this.f20257r = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f20258s = arrayList2;
        this.f20259t = new C6443f();
        setClipChildren(false);
        C6445h c6445h = new C6445h(context);
        addView(c6445h);
        arrayList.add(c6445h);
        arrayList2.add(c6445h);
        this.f20260u = 1;
        setTag(AbstractC4510p.f13109K, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m25484a(InterfaceC6442e interfaceC6442e) {
        interfaceC6442e.mo25472I0();
        C6445h c6445hM25487b = this.f20259t.m25487b(interfaceC6442e);
        if (c6445hM25487b != null) {
            c6445hM25487b.m25493d();
            this.f20259t.m25488c(interfaceC6442e);
            this.f20258s.add(c6445hM25487b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C6445h m25485b(InterfaceC6442e interfaceC6442e) {
        C6445h c6445hM25487b = this.f20259t.m25487b(interfaceC6442e);
        if (c6445hM25487b != null) {
            return c6445hM25487b;
        }
        C6445h c6445h = (C6445h) AbstractC5070c0.m20498K(this.f20258s);
        if (c6445h == null) {
            if (this.f20260u > AbstractC5114x.m20802q(this.f20257r)) {
                c6445h = new C6445h(getContext());
                addView(c6445h);
                this.f20257r.add(c6445h);
            } else {
                c6445h = (C6445h) this.f20257r.get(this.f20260u);
                InterfaceC6442e interfaceC6442eM25486a = this.f20259t.m25486a(c6445h);
                if (interfaceC6442eM25486a != null) {
                    interfaceC6442eM25486a.mo25472I0();
                    this.f20259t.m25488c(interfaceC6442eM25486a);
                    c6445h.m25493d();
                }
            }
            int i10 = this.f20260u;
            if (i10 < this.f20256q - 1) {
                this.f20260u = i10 + 1;
            } else {
                this.f20260u = 0;
            }
        }
        this.f20259t.m25489d(interfaceC6442e, c6445h);
        return c6445h;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
