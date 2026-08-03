package Yue;

import Yue.C7148;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5239 {

    @InterfaceC6489
    private static volatile Choreographer choreographer = null;

    /* JADX INFO: renamed from: ۥ */
    public static final long f1360 = 4611686018427387903L;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    @InterfaceC6489
    public static final AbstractC5237 f1361;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ$ۥ */
    public static final class RunnableC0677 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3665 f12478;

        public RunnableC0677(InterfaceC3665 interfaceC3665) {
            this.f12478 = interfaceC3665;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5239.m16053(this.f12478);
        }
    }

    static {
        Object objM3438;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(new C5236(m16045(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        f1361 = (AbstractC5237) (C7148.m22407(objM3438) ? null : objM3438);
    }

    @InterfaceC6399
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Handler m16045(@InterfaceC6399 Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Object m16046(@InterfaceC6399 InterfaceC4199<? super Long> interfaceC4199) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
            c3666.mo10020();
            m16051(choreographer2, c3666);
            Object objM10039 = c3666.m10039();
            if (objM10039 == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            return objM10039;
        }
        C3666 c36662 = new C3666(C5501.m17135(interfaceC4199), 1);
        c36662.mo10020();
        C4423.m12872().dispatch(C4629.f9940, new RunnableC0677(c36662));
        Object objM100392 = c36662.m10039();
        if (objM100392 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM100392;
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final AbstractC5237 m16047(@InterfaceC6399 Handler handler) {
        return m16049(handler, null, 1, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC5237 m16048(@InterfaceC6399 Handler handler, @InterfaceC6489 String str) {
        return new C5236(handler, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ AbstractC5237 m16049(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m16048(handler, str);
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Use Dispatchers.Main instead")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m16050() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m16051(Choreographer choreographer2, final InterfaceC3665<? super Long> interfaceC3665) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: Yue.ۥ۠ۤ۠ۨ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C5239.m16052(interfaceC3665, j);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m16052(InterfaceC3665 interfaceC3665, long j) {
        interfaceC3665.mo10016(C4423.m12872(), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m16053(InterfaceC3665<? super Long> interfaceC3665) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            C5499.m17100(choreographer2);
            choreographer = choreographer2;
        }
        m16051(choreographer2, interfaceC3665);
    }
}
