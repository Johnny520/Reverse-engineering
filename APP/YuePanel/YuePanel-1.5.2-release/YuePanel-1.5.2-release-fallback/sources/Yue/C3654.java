package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3654<D> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f11658;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C3654.InterfaceC3657<D> f11659;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C3654.InterfaceC3656<D> f11660;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.Context f11661;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f11662;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f11663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f11664;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f11665;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f11666;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ, reason: contains not printable characters */
    public final class C3655 extends android.database.ContentObserver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3654 f11667;

        public C3655(Yue.C3654 r1) {
                r0 = this;
                r0.f11667 = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
                r0 = this;
                Yue.ۥۣ۠ۧۥ r1 = r0.f11667
                r1.m14788()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC3656<D> {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m14798(@Yue.InterfaceC4410 Yue.C3654<D> r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۥ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC3657<D> {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo14799(@Yue.InterfaceC4410 Yue.C3654<D> r1, @Yue.InterfaceC4544 D r2);
    }

    public C3654(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f11662 = r0
            r2.f11663 = r0
            r1 = 1
            r2.f11664 = r1
            r2.f11665 = r0
            r2.f11666 = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.f11661 = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            Yue.C1759.m8353(r2, r0)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r2.f11658
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m14776() {
            r1 = this;
            r0 = 1
            r1.f11663 = r0
            r1.m14787()
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m14777() {
            r1 = this;
            boolean r0 = r1.mo4129()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m14778() {
            r1 = this;
            r0 = 0
            r1.f11666 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m14779(@Yue.InterfaceC4544 D r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            Yue.C1759.m8353(r3, r0)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m14780() {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟<D> r0 = r1.f11660
            if (r0 == 0) goto L7
            r0.m14798(r1)
        L7:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo8075(@Yue.InterfaceC4544 D r2) {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟۟<D> r0 = r1.f11659
            if (r0 == 0) goto L7
            r0.mo14799(r1, r2)
        L7:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo4128(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            r3.print(r1)
            java.lang.String r2 = "mId="
            r3.print(r2)
            int r2 = r0.f11658
            r3.print(r2)
            java.lang.String r2 = " mListener="
            r3.print(r2)
            Yue.ۥۣ۠ۧۥ$ۥ۟۟<D> r2 = r0.f11659
            r3.println(r2)
            boolean r2 = r0.f11662
            if (r2 != 0) goto L23
            boolean r2 = r0.f11665
            if (r2 != 0) goto L23
            boolean r2 = r0.f11666
            if (r2 == 0) goto L44
        L23:
            r3.print(r1)
            java.lang.String r2 = "mStarted="
            r3.print(r2)
            boolean r2 = r0.f11662
            r3.print(r2)
            java.lang.String r2 = " mContentChanged="
            r3.print(r2)
            boolean r2 = r0.f11665
            r3.print(r2)
            java.lang.String r2 = " mProcessingChange="
            r3.print(r2)
            boolean r2 = r0.f11666
            r3.println(r2)
        L44:
            boolean r2 = r0.f11663
            if (r2 != 0) goto L4c
            boolean r2 = r0.f11664
            if (r2 == 0) goto L63
        L4c:
            r3.print(r1)
            java.lang.String r1 = "mAbandoned="
            r3.print(r1)
            boolean r1 = r0.f11663
            r3.print(r1)
            java.lang.String r1 = " mReset="
            r3.print(r1)
            boolean r1 = r0.f11664
            r3.println(r1)
        L63:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m14781() {
            r0 = this;
            r0.mo4130()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.content.Context m14782() {
            r1 = this;
            android.content.Context r0 = r1.f11661
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m14783() {
            r1 = this;
            int r0 = r1.f11658
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m14784() {
            r1 = this;
            boolean r0 = r1.f11663
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m14785() {
            r1 = this;
            boolean r0 = r1.f11664
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m14786() {
            r1 = this;
            boolean r0 = r1.f11662
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m14787() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo4129() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m14788() {
            r1 = this;
            boolean r0 = r1.f11662
            if (r0 == 0) goto L8
            r1.m14781()
            goto Lb
        L8:
            r0 = 1
            r1.f11665 = r0
        Lb:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo4130() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo8076() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo8077() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo8078() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m14789(int r2, @Yue.InterfaceC4410 Yue.C3654.InterfaceC3657<D> r3) {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟۟<D> r0 = r1.f11659
            if (r0 != 0) goto L9
            r1.f11659 = r3
            r1.f11658 = r2
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "There is already a listener registered"
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m14790(@Yue.InterfaceC4410 Yue.C3654.InterfaceC3656<D> r2) {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟<D> r0 = r1.f11660
            if (r0 != 0) goto L7
            r1.f11660 = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "There is already a listener registered"
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m14791() {
            r1 = this;
            r1.mo8076()
            r0 = 1
            r1.f11664 = r0
            r0 = 0
            r1.f11662 = r0
            r1.f11663 = r0
            r1.f11665 = r0
            r1.f11666 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m14792() {
            r1 = this;
            boolean r0 = r1.f11666
            if (r0 == 0) goto L7
            r1.m14788()
        L7:
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m14793() {
            r1 = this;
            r0 = 1
            r1.f11662 = r0
            r0 = 0
            r1.f11664 = r0
            r1.f11663 = r0
            r1.mo8077()
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m14794() {
            r1 = this;
            r0 = 0
            r1.f11662 = r0
            r1.mo8078()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m14795() {
            r2 = this;
            boolean r0 = r2.f11665
            r1 = 0
            r2.f11665 = r1
            boolean r1 = r2.f11666
            r1 = r1 | r0
            r2.f11666 = r1
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m14796(@Yue.InterfaceC4410 Yue.C3654.InterfaceC3657<D> r2) {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟۟<D> r0 = r1.f11659
            if (r0 == 0) goto L12
            if (r0 != r2) goto La
            r2 = 0
            r1.f11659 = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempting to unregister the wrong listener"
            r2.<init>(r0)
            throw r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "No listener register"
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m14797(@Yue.InterfaceC4410 Yue.C3654.InterfaceC3656<D> r2) {
            r1 = this;
            Yue.ۥۣ۠ۧۥ$ۥ۟<D> r0 = r1.f11660
            if (r0 == 0) goto L12
            if (r0 != r2) goto La
            r2 = 0
            r1.f11660 = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempting to unregister the wrong listener"
            r2.<init>(r0)
            throw r2
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "No listener register"
            r2.<init>(r0)
            throw r2
    }
}
