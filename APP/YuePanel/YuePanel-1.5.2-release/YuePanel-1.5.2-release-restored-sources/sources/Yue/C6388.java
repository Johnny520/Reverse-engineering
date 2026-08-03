package Yue;

import Yue.InterfaceC5542;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۡۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6388 extends AbstractC2981 implements InterfaceC5542 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6388 f16162 = new C6388();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f16163 = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public C6388() {
        super(InterfaceC5542.f13507);
    }

    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static /* synthetic */ void m19944() {
    }

    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ void m19945() {
    }

    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ void m19946() {
    }

    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static /* synthetic */ void m19947() {
    }

    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m19948() {
    }

    @Override // Yue.InterfaceC5542, Yue.InterfaceC7042
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo6939(null);
    }

    @Override // Yue.InterfaceC5542
    public boolean isCancelled() {
        return false;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    public boolean start() {
        return false;
    }

    @InterfaceC6399
    public String toString() {
        return "NonCancellable";
    }

    @Override // Yue.InterfaceC5542, Yue.InterfaceC3592
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* synthetic */ boolean mo6938(Throwable th) {
        return false;
    }

    @Override // Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo5773() {
        return true;
    }

    @Override // Yue.InterfaceC5542, Yue.InterfaceC3592
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo6939(@InterfaceC6489 CancellationException cancellationException) {
    }

    @Override // Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo17157() {
        return false;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public InterfaceC5542 mo17158(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        return InterfaceC5542.C0790.m17172(this, interfaceC5542);
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public InterfaceC7326<InterfaceC5542> mo17159() {
        return C7332.m22871();
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public InterfaceC4433 mo17160(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return C6389.f16164;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public CancellationException mo17161() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public InterfaceC4433 mo17162(boolean z, boolean z2, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        return C6389.f16164;
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public Object mo17163(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public InterfaceC7286 mo17164() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Yue.InterfaceC5542
    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = f16163)
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public InterfaceC3814 mo17165(@InterfaceC6399 InterfaceC3816 interfaceC3816) {
        return C6389.f16164;
    }
}
