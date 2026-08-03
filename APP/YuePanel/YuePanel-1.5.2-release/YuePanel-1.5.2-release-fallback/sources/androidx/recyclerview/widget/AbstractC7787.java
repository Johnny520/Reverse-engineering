package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.AbstractC7716;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7787<T, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC7716> extends androidx.recyclerview.widget.RecyclerView.AbstractC7678<VH> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7732<T> f30053;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7732.InterfaceC7736<T> f30054;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠$ۥ, reason: contains not printable characters */
    public class C7788 implements androidx.recyclerview.widget.C7732.InterfaceC7736<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.AbstractC7787 f30055;

        public C7788(androidx.recyclerview.widget.AbstractC7787 r1) {
                r0 = this;
                r0.f30055 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C7732.InterfaceC7736
        /* JADX INFO: renamed from: ۥ */
        public void mo30041(@Yue.InterfaceC4410 java.util.List<T> r2, @Yue.InterfaceC4410 java.util.List<T> r3) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ r0 = r1.f30055
                r0.m30230(r2, r3)
                return
        }
    }

    public AbstractC7787(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7730<T> r4) {
            r3 = this;
            r3.<init>()
            androidx.recyclerview.widget.ۥ۟۟۠$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۠$ۥ
            r0.<init>(r3)
            r3.f30054 = r0
            androidx.recyclerview.widget.ۥ۟۟۟ r1 = new androidx.recyclerview.widget.ۥ۟۟۟
            androidx.recyclerview.widget.ۥ۟ r2 = new androidx.recyclerview.widget.ۥ۟
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r3.f30053 = r1
            r1.m30029(r0)
            return
    }

    public AbstractC7787(@Yue.InterfaceC4410 androidx.recyclerview.widget.C7752.AbstractC7756<T> r5) {
            r4 = this;
            r4.<init>()
            androidx.recyclerview.widget.ۥ۟۟۠$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۠$ۥ
            r0.<init>(r4)
            r4.f30054 = r0
            androidx.recyclerview.widget.ۥ۟۟۟ r1 = new androidx.recyclerview.widget.ۥ۟۟۟
            androidx.recyclerview.widget.ۥ۟ r2 = new androidx.recyclerview.widget.ۥ۟
            r2.<init>(r4)
            androidx.recyclerview.widget.ۥ۟۟$ۥ r3 = new androidx.recyclerview.widget.ۥ۟۟$ۥ
            r3.<init>(r5)
            androidx.recyclerview.widget.ۥ۟۟ r5 = r3.m30026()
            r1.<init>(r2, r5)
            r4.f30053 = r1
            r1.m30029(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public int getItemCount() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟<T> r0 = r1.f30053
            java.util.List r0 = r0.m30030()
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.List<T> m30228() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟<T> r0 = r1.f30053
            java.util.List r0 = r0.m30030()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public T m30229(int r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟<T> r0 = r1.f30053
            java.util.List r0 = r0.m30030()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30230(@Yue.InterfaceC4410 java.util.List<T> r1, @Yue.InterfaceC4410 java.util.List<T> r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30231(@Yue.InterfaceC4544 java.util.List<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟<T> r0 = r1.f30053
            r0.m30034(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30232(@Yue.InterfaceC4544 java.util.List<T> r2, @Yue.InterfaceC4544 java.lang.Runnable r3) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟<T> r0 = r1.f30053
            r0.m30035(r2, r3)
            return
    }
}
