package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1214s {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC1175l f5191a;

    /* JADX INFO: renamed from: b */
    public int f5192b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Rect f5193c = new Rect();

    public AbstractC1214s(RecyclerView.AbstractC1175l abstractC1175l) {
        this.f5191a = abstractC1175l;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1214s m2993a(RecyclerView.AbstractC1175l abstractC1175l, int i) {
        if (i == 0) {
            return new C1212q(abstractC1175l);
        }
        if (i == 1) {
            return new C1213r(abstractC1175l);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2979b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo2980c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo2981d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo2982e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo2983f();

    /* JADX INFO: renamed from: g */
    public abstract int mo2984g();

    /* JADX INFO: renamed from: h */
    public abstract int mo2985h();

    /* JADX INFO: renamed from: i */
    public abstract int mo2986i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2987j();

    /* JADX INFO: renamed from: k */
    public abstract int mo2988k();

    /* JADX INFO: renamed from: l */
    public abstract int mo2989l();

    /* JADX INFO: renamed from: m */
    public abstract int mo2990m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo2991n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo2992o(int i);
}
