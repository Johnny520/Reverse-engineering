package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4666 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f14840 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f14841 = -2;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.database.DataSetObservable f14842;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.database.DataSetObserver f14843;

    public AbstractC4666() {
            r1 = this;
            r1.<init>()
            android.database.DataSetObservable r0 = new android.database.DataSetObservable
            r0.<init>()
            r1.f14842 = r0
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m18513(@Yue.InterfaceC4410 android.view.View r1, int r2, @Yue.InterfaceC4410 java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method destroyItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo12134(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2, @Yue.InterfaceC4410 java.lang.Object r3) {
            r0 = this;
            r0.m18513(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m18514(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo12135(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            r0 = this;
            r0.m18514(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract int m18515();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m18516(@Yue.InterfaceC4410 java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.CharSequence m18517(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m18518(int r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.Object m18519(@Yue.InterfaceC4410 android.view.View r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Required method instantiateItem was not overridden"
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.Object mo12136(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.m18519(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract boolean mo12137(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.Object r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m18520() {
            r1 = this;
            monitor-enter(r1)
            android.database.DataSetObserver r0 = r1.f14843     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.onChanged()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto L12
        Lb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            android.database.DataSetObservable r0 = r1.f14842
            r0.notifyChanged()
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m18521(@Yue.InterfaceC4410 android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.f14842
            r0.registerObserver(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo12138(@Yue.InterfaceC4544 android.os.Parcelable r1, @Yue.InterfaceC4544 java.lang.ClassLoader r2) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public android.os.Parcelable mo12139() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m18522(@Yue.InterfaceC4410 android.view.View r1, int r2, @Yue.InterfaceC4410 java.lang.Object r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo12140(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2, @Yue.InterfaceC4410 java.lang.Object r3) {
            r0 = this;
            r0.m18522(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m18523(android.database.DataSetObserver r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f14843 = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m18524(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo12141(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            r0 = this;
            r0.m18524(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m18525(@Yue.InterfaceC4410 android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.f14842
            r0.unregisterObserver(r2)
            return
    }
}
