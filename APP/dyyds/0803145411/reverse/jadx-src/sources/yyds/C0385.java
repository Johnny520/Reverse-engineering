package yyds;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: yyds.ᛲᛶᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0385 implements InterfaceC0230 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1967;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f1968;

    public /* synthetic */ C0385(int i, Object obj) {
        this.f1967 = i;
        this.f1968 = obj;
    }

    public final String toString() {
        int i = this.f1967;
        Object obj = this.f1968;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + C2001.class.getSimpleName() + '@' + AbstractC2408.m4457(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0970) obj) + ']';
        }
    }

    @Override // yyds.InterfaceC0230
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo884(Throwable th) {
        int i = this.f1967;
        Object obj = this.f1968;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((C2001) obj).mo371(th);
                break;
            default:
                ((InterfaceC0970) obj).mo1720();
                break;
        }
    }
}
