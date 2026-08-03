package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC6604 extends android.app.Service {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String f23025 = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.InterfaceC3209.AbstractBinderC3211 f23026;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ, reason: contains not printable characters */
    public class BinderC6605 extends Yue.InterfaceC3209.AbstractBinderC3211 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractServiceC6604 f23027;

        public BinderC6605(Yue.AbstractServiceC6604 r1) {
                r0 = this;
                r0.f23027 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC3209
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo13622(@Yue.InterfaceC4544 Yue.InterfaceC3205 r2) throws android.os.RemoteException {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                Yue.ۥۣۢۡ۠ r0 = new Yue.ۥۣۢۡ۠
                r0.<init>(r2)
                Yue.ۥۣۢۡۡ r2 = r1.f23027
                r2.m25407(r0)
                return
        }
    }

    public AbstractServiceC6604() {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢۡۡ$ۥ r0 = new Yue.ۥۣۢۡۡ$ۥ
            r0.<init>(r1)
            r1.f23026 = r0
            return
    }

    @Override // android.app.Service
    @Yue.InterfaceC4544
    public android.os.IBinder onBind(@Yue.InterfaceC4544 android.content.Intent r1) {
            r0 = this;
            Yue.ۥ۠ۥ۟ۨ$ۥ۟ r1 = r0.f23026
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void m25407(@Yue.InterfaceC4410 Yue.C6603 r1);
}
