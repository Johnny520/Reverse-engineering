package Yue;

import Yue.InterfaceC4225;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5542 extends InterfaceC4225.InterfaceC0357 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0791 f13507 = C0791.f13508;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ$ۥ */
    public static final class C0790 {
        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ void m2276(InterfaceC5542 interfaceC5542, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC5542.mo6939(cancellationException);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m17166(InterfaceC5542 interfaceC5542, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC5542.mo6938(th);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <R> R m17167(@InterfaceC6399 InterfaceC5542 interfaceC5542, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
            return (R) InterfaceC4225.InterfaceC0357.C4227.m1191(interfaceC5542, r, interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static <E extends InterfaceC4225.InterfaceC0357> E m17168(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
            return (E) InterfaceC4225.InterfaceC0357.C4227.m1192(interfaceC5542, interfaceC4228);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ InterfaceC4433 m17169(InterfaceC5542 interfaceC5542, boolean z, boolean z2, InterfaceC5124 interfaceC5124, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return interfaceC5542.mo17162(z, z2, interfaceC5124);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC4225 m17170(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
            return InterfaceC4225.InterfaceC0357.C4227.m12161(interfaceC5542, interfaceC4228);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static InterfaceC4225 m17171(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            return InterfaceC4225.InterfaceC0357.C4227.m12162(interfaceC5542, interfaceC4225);
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static InterfaceC5542 m17172(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC5542 interfaceC55422) {
            return interfaceC55422;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۡ$ۥ۟ */
    public static final class C0791 implements InterfaceC4225.InterfaceC4228<InterfaceC5542> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final /* synthetic */ C0791 f13508 = new C0791();
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isCancelled();

    boolean start();

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo6938(Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    boolean mo5773();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo6939(@InterfaceC6489 CancellationException cancellationException);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    boolean mo17157();

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    InterfaceC5542 mo17158(@InterfaceC6399 InterfaceC5542 interfaceC5542);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    InterfaceC7326<InterfaceC5542> mo17159();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    InterfaceC4433 mo17160(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    CancellationException mo17161();

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    InterfaceC4433 mo17162(boolean z, boolean z2, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    Object mo17163(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    InterfaceC7286 mo17164();

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    InterfaceC3814 mo17165(@InterfaceC6399 InterfaceC3816 interfaceC3816);
}
