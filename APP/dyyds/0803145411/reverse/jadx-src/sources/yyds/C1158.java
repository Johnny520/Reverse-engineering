package yyds;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᛵᛸᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1158 extends AbstractC0974 implements InterfaceC2800 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f5339;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1158 f5340;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Handler f5341;

    public C1158(Handler handler, boolean z) {
        this.f5341 = handler;
        this.f5339 = z;
        this.f5340 = z ? this : new C1158(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1158)) {
            return false;
        }
        C1158 c1158 = (C1158) obj;
        return c1158.f5341 == this.f5341 && c1158.f5339 == this.f5339;
    }

    public final int hashCode() {
        return (this.f5339 ? 1231 : 1237) ^ System.identityHashCode(this.f5341);
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        C1158 c1158;
        String str;
        C1206 c1206 = AbstractC0221.f1238;
        C1158 c11582 = AbstractC1353.f6250;
        if (this == c11582) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1158 = c11582.f5340;
            } catch (UnsupportedOperationException unused) {
                c1158 = null;
            }
            str = this == c1158 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f5341.toString();
        if (!this.f5339) {
            return string;
        }
        return string + ".immediate";
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final void m2348(InterfaceC2213 interfaceC2213, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC2798 interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
        if (interfaceC2798 != null) {
            interfaceC2798.mo2093(cancellationException);
        }
        C1206 c1206 = AbstractC0221.f1238;
        ExecutorC2482.f12272.mo1251(interfaceC2213, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public final void mo1247(long j, C1853 c1853) {
        Object[] objArr = 0;
        RunnableC2660 runnableC2660 = new RunnableC2660(4, c1853, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.f5341.postDelayed(runnableC2660, j)) {
            m2348(c1853.f9326, runnableC2660);
        } else {
            c1853.m3636(new C0385(1, new C2001((Object) this, (int) (objArr == true ? 1 : 0), (Object) runnableC2660)));
        }
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        if (this.f5341.post(runnable)) {
            return;
        }
        m2348(interfaceC2213, runnable);
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final InterfaceC0970 mo1253(long j, final RunnableC1993 runnableC1993, InterfaceC2213 interfaceC2213) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f5341.postDelayed(runnableC1993, j)) {
            return new InterfaceC0970() { // from class: yyds.ᲀᲈᲀᛱ
                @Override // yyds.InterfaceC0970
                /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
                public final void mo1720() {
                    this.f10565.f5341.removeCallbacks(runnableC1993);
                }
            };
        }
        m2348(interfaceC2213, runnableC1993);
        return C2329.f11479;
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᲈᛷᲈᛶ */
    public final boolean mo2117(InterfaceC2213 interfaceC2213) {
        return (this.f5339 && AbstractC1544.m3188(Looper.myLooper(), this.f5341.getLooper())) ? false : true;
    }
}
