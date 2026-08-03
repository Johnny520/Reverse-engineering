package Yue;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5236 extends AbstractC5237 implements InterfaceC4364 {

    @InterfaceC6489
    private volatile C5236 _immediate;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Handler f12470;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f12471;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f12472;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final C5236 f12473;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ$ۥ */
    public static final class RunnableC0675 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3665 f12474;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C5236 f12475;

        public RunnableC0675(InterfaceC3665 interfaceC3665, C5236 c5236) {
            this.f12474 = interfaceC3665;
            this.f12475 = c5236;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12474.mo10016(this.f12475, C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ۠ۦ$ۥ۟ */
    public static final class C0676 extends AbstractC5673 implements InterfaceC5124<Throwable, C8107> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Runnable f12477;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0676(Runnable runnable) {
            super(1);
            this.f12477 = runnable;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            m16043(th);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m16043(@InterfaceC6489 Throwable th) {
            C5236.this.f12470.removeCallbacks(this.f12477);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5236(Handler handler, String str, boolean z) {
        super(null);
        this.f12470 = handler;
        this.f12471 = str;
        this.f12472 = z;
        this._immediate = z ? this : null;
        C5236 c5236 = this._immediate;
        if (c5236 == null) {
            c5236 = new C5236(handler, str, true);
            this._immediate = c5236;
        }
        this.f12473 = c5236;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final void m16038(C5236 c5236, Runnable runnable) {
        c5236.f12470.removeCallbacks(runnable);
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        if (this.f12470.post(runnable)) {
            return;
        }
        m16041(interfaceC4225, runnable);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C5236) && ((C5236) obj).f12470 == this.f12470;
    }

    public int hashCode() {
        return System.identityHashCode(this.f12470);
    }

    @Override // Yue.AbstractC4232
    public boolean isDispatchNeeded(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return (this.f12472 && C5499.m17094(Looper.myLooper(), this.f12470.getLooper())) ? false : true;
    }

    @Override // Yue.AbstractC5912, Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        String strM18478 = m18478();
        if (strM18478 != null) {
            return strM18478;
        }
        String string = this.f12471;
        if (string == null) {
            string = this.f12470.toString();
        }
        if (!this.f12472) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // Yue.AbstractC5237, Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 final Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        if (this.f12470.postDelayed(runnable, C7007.m21669(j, 4611686018427387903L))) {
            return new InterfaceC4433() { // from class: Yue.ۥ۠ۤ۠ۥ
                @Override // Yue.InterfaceC4433
                /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
                public final void mo5757() {
                    C5236.m16038(this.f12468, runnable);
                }
            };
        }
        m16041(interfaceC4225, runnable);
        return C6389.f16164;
    }

    @Override // Yue.InterfaceC4364
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        RunnableC0675 runnableC0675 = new RunnableC0675(interfaceC3665, this);
        if (this.f12470.postDelayed(runnableC0675, C7007.m21669(j, 4611686018427387903L))) {
            interfaceC3665.mo10021(new C0676(runnableC0675));
        } else {
            m16041(interfaceC3665.getContext(), runnableC0675);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m16041(InterfaceC4225 interfaceC4225, Runnable runnable) {
        C5553.m17191(interfaceC4225, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C4423.m12870().dispatch(interfaceC4225, runnable);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۧۡ()LYue/ۥ۠ۤ۠ۧ; */
    @Override // Yue.AbstractC5237
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5236 mo16040() {
        return this.f12473;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.os.Handler)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(android.os.Handler, java.lang.String):void (m)] (LINE:9) call: Yue.ۥ۠ۤ۠ۦ.<init>(android.os.Handler, java.lang.String):void type: THIS */
    public /* synthetic */ C5236(Handler handler, String str, int i, C4335 c4335) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C5236(@InterfaceC6399 Handler handler, @InterfaceC6489 String str) {
        this(handler, str, false);
    }
}
