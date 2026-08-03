package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1212q extends AbstractC1214s {
    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: b */
    public final int mo2979b(View view) {
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        this.f5191a.getClass();
        return view.getRight() + ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.right + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: c */
    public final int mo2980c(View view) {
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        this.f5191a.getClass();
        return RecyclerView.AbstractC1175l.m2826A(view) + ((ViewGroup.MarginLayoutParams) c1176m).leftMargin + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: d */
    public final int mo2981d(View view) {
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        this.f5191a.getClass();
        return RecyclerView.AbstractC1175l.m2833z(view) + ((ViewGroup.MarginLayoutParams) c1176m).topMargin + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: e */
    public final int mo2982e(View view) {
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        this.f5191a.getClass();
        return (view.getLeft() - ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.left) - ((ViewGroup.MarginLayoutParams) c1176m).leftMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: f */
    public final int mo2983f() {
        return this.f5191a.f4939n;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: g */
    public final int mo2984g() {
        RecyclerView.AbstractC1175l abstractC1175l = this.f5191a;
        return abstractC1175l.f4939n - abstractC1175l.m2839F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: h */
    public final int mo2985h() {
        return this.f5191a.m2839F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: i */
    public final int mo2986i() {
        return this.f5191a.f4937l;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: j */
    public final int mo2987j() {
        return this.f5191a.f4938m;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: k */
    public final int mo2988k() {
        return this.f5191a.m2838E();
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: l */
    public final int mo2989l() {
        RecyclerView.AbstractC1175l abstractC1175l = this.f5191a;
        return (abstractC1175l.f4939n - abstractC1175l.m2838E()) - abstractC1175l.m2839F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: m */
    public final int mo2990m(View view) {
        RecyclerView.AbstractC1175l abstractC1175l = this.f5191a;
        Rect rect = this.f5193c;
        abstractC1175l.m2841K(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: n */
    public final int mo2991n(View view) {
        RecyclerView.AbstractC1175l abstractC1175l = this.f5191a;
        Rect rect = this.f5193c;
        abstractC1175l.m2841K(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.AbstractC1214s
    /* JADX INFO: renamed from: o */
    public final void mo2992o(int i) {
        this.f5191a.mo2842O(i);
    }
}
