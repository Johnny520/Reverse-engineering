package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2764<E> extends Yue.AbstractC2762 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.app.Activity f9050;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.content.Context f9051;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.os.Handler f9052;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f9053;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f9054;

    public AbstractC2764(@Yue.InterfaceC4544 android.app.Activity r2, @Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.os.Handler r4, int r5) {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠ۢۨۤ r0 = new Yue.ۥ۠ۢۨۤ
            r0.<init>()
            r1.f9054 = r0
            r1.f9050 = r2
            java.lang.String r2 = "context == null"
            java.lang.Object r2 = Yue.C4868.m19182(r3, r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.f9051 = r2
            java.lang.String r2 = "handler == null"
            java.lang.Object r2 = Yue.C4868.m19182(r4, r2)
            android.os.Handler r2 = (android.os.Handler) r2
            r1.f9052 = r2
            r1.f9053 = r5
            return
    }

    public AbstractC2764(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.os.Handler r3, int r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L8
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L9
        L8:
            r0 = 0
        L9:
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public AbstractC2764(@Yue.InterfaceC4410 androidx.fragment.app.FragmentActivity r3) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1 = 0
            r2.<init>(r3, r3, r0, r1)
            return
    }

    @Override // Yue.AbstractC2762
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ */
    public android.view.View mo12069(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC2762
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo12070() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.app.Activity m12113() {
            r1 = this;
            android.app.Activity r0 = r1.f9050
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.content.Context m12114() {
            r1 = this;
            android.content.Context r0 = r1.f9051
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.os.Handler m12115() {
            r1 = this;
            android.os.Handler r0 = r1.f9052
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo12116(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4544 java.io.FileDescriptor r2, @Yue.InterfaceC4410 java.io.PrintWriter r3, @Yue.InterfaceC4544 java.lang.String[] r4) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract E mo12117();

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.view.LayoutInflater mo12118() {
            r1 = this;
            android.content.Context r0 = r1.f9051
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int mo12119() {
            r1 = this;
            int r0 = r1.f9053
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo12120() {
            r1 = this;
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m12121(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4410 java.lang.String[] r2, int r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo12122(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo12123(@Yue.InterfaceC4410 java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m12124(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.content.Intent r3, int r4) {
            r1 = this;
            r0 = 0
            r1.m12125(r2, r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m12125(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r0 = this;
            r1 = -1
            if (r3 != r1) goto L9
            android.content.Context r1 = r0.f9051
            Yue.C1584.m7781(r1, r2, r4)
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Starting activity with a requestCode requires a FragmentActivity host"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m12126(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r10, @Yue.InterfaceC4410 android.content.IntentSender r11, int r12, @Yue.InterfaceC4544 android.content.Intent r13, int r14, int r15, int r16, @Yue.InterfaceC4544 android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r0 = -1
            r3 = r12
            if (r3 != r0) goto L14
            r0 = r9
            android.app.Activity r1 = r0.f9050
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            Yue.C0188.m1056(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L14:
            r0 = r9
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Starting intent sender with a requestCode requires a FragmentActivity host"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo12127() {
            r0 = this;
            return
    }
}
