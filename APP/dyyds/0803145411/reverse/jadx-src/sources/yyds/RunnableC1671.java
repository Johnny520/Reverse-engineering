package yyds;

import com.p000ss.android.ugc.awemes.MainActivity;

/* JADX INFO: renamed from: yyds.ᛷᲇᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1671 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8525;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8526 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f8527;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f8528;

    public /* synthetic */ RunnableC1671(int i, MainActivity mainActivity, Throwable th) {
        this.f8528 = i;
        this.f8525 = mainActivity;
        this.f8527 = th;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String strM4341;
        switch (this.f8526) {
            case 0:
                ((C0918) this.f8525).f4213.mo1274(this.f8528, this.f8527);
                break;
            default:
                int i = this.f8528;
                MainActivity mainActivity = (MainActivity) this.f8525;
                Throwable th = (Throwable) this.f8527;
                if (i == mainActivity.f483 && !mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    mainActivity.f459 = null;
                    C0156 c0156 = mainActivity.f475;
                    String strM43412 = AbstractC2328.m4341(-272897499890542L);
                    String message = th.getMessage();
                    if (message == null) {
                        strM4341 = AbstractC2328.m4341(-272927564661614L);
                    } else {
                        strM4341 = AbstractC0473.m1313(message) ? null : message;
                        if (strM4341 == null) {
                        }
                    }
                    c0156.m704(new C2471(strM43412, strM4341, AbstractC2328.m4341(-272996284138350L), new C0685(mainActivity, 1)));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1671(C0918 c0918, int i, Object obj) {
        this.f8525 = c0918;
        this.f8528 = i;
        this.f8527 = obj;
    }
}
