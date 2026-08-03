package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1380<T> extends androidx.recyclerview.widget.RecyclerView.AbstractC7678<Yue.C1383> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.util.SparseArray<Yue.C1383> f4480;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.List<T> f4481;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC1380.InterfaceC1381<T> f4482;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC1380.InterfaceC1382<T> f4483;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ$ۥ, reason: contains not printable characters */
    public interface InterfaceC1381<T> {
        /* JADX INFO: renamed from: ۥ */
        void mo1243(T r1, int r2);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡۢ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC1382<T> {
        /* JADX INFO: renamed from: ۥ */
        boolean mo1242(T r1, int r2);
    }

    static {
            r0 = 678(0x2a6, float:9.5E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public AbstractC1380() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f4480 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f4481 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6898(Yue.AbstractC1380 r0, java.lang.Object r1, int r2, android.view.View r3);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m6899(Yue.AbstractC1380 r0, java.lang.Object r1, int r2, android.view.View r3);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public native int getItemCount();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public native /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, int r2);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    @Yue.InterfaceC4410
    public native /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7716 onCreateViewHolder(android.view.ViewGroup r1, int r2);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public native /* bridge */ /* synthetic */ void onViewRecycled(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public native void m6900(int r1, T r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native void m6901(java.util.List<T> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract void mo4690(Yue.C1383 r1, T r2, int r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native void m6902(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public native void m6903();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m6904();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native java.util.List<T> m6905();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native T m6906(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public abstract int mo4691();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public native android.view.View m6907(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native /* synthetic */ void m6908(java.lang.Object r1, int r2, android.view.View r3);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ boolean m6909(java.lang.Object r1, int r2, android.view.View r3);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public native void m6910(Yue.C1383 r1, int r2);

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public native Yue.C1383 m6911(android.view.ViewGroup r1, int r2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public native void m6912(Yue.C1383 r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public native void m6913(java.util.List<T> r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public native void m6914(Yue.AbstractC1380.InterfaceC1381<T> r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public native void m6915(Yue.AbstractC1380.InterfaceC1382<T> r1);
}
