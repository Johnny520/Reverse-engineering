package p091g3;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p018b3.C0171a;
import p136j8.C2104o;

/* JADX INFO: renamed from: g3.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1324n0 {

    /* JADX INFO: renamed from: b */
    public static final C1332r0 f4393b;

    /* JADX INFO: renamed from: a */
    public final C1332r0 f4394a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = Build.VERSION.SDK_INT;
        f4393b = (i9 >= 34 ? new C1308f0() : i9 >= 30 ? new C1306e0() : i9 >= 29 ? new C1304d0() : new C1302c0()).mo3453b().f4398a.mo3517a().f4398a.mo3512b().f4398a.mo3513c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1324n0(C1332r0 c1332r0) {
        this.f4394a = c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1332r0 mo3517a() {
        return this.f4394a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C1332r0 mo3512b() {
        return this.f4394a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public C1332r0 mo3513c() {
        return this.f4394a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1324n0)) {
            return false;
        }
        C1324n0 c1324n0 = (C1324n0) obj;
        return mo3505p() == c1324n0.mo3505p() && mo3515o() == c1324n0.mo3515o() && Objects.equals(mo3503l(), c1324n0.mo3503l()) && Objects.equals(mo3514j(), c1324n0.mo3514j()) && Objects.equals(mo3518f(), c1324n0.mo3518f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public C1303d mo3518f() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C0171a mo3501g(int i9) {
        return C0171a.f444e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C0171a mo3502h(int i9) {
        if ((i9 & 8) == 0) {
            return C0171a.f444e;
        }
        C2104o.m5294t("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo3505p()), Boolean.valueOf(mo3515o()), mo3503l(), mo3514j(), mo3518f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public C0171a mo3520i() {
        return mo3503l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public C0171a mo3514j() {
        return C0171a.f444e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public C0171a mo3521k() {
        return mo3503l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C0171a mo3503l() {
        return C0171a.f444e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public C0171a mo3522m() {
        return mo3503l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public C1332r0 mo3504n(int i9, int i10, int i11, int i12) {
        return f4393b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public boolean mo3515o() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public boolean mo3505p() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public boolean mo3506q(int i9) {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void mo3499d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo3500e(C1332r0 c1332r0) {
    }

    /* JADX INFO: renamed from: r */
    public void mo3507r(C0171a[] c0171aArr) {
    }

    /* JADX INFO: renamed from: s */
    public void mo3508s(C0171a c0171a) {
    }

    /* JADX INFO: renamed from: t */
    public void mo3509t(C1332r0 c1332r0) {
    }

    /* JADX INFO: renamed from: u */
    public void mo3516u(C0171a c0171a) {
    }

    /* JADX INFO: renamed from: v */
    public void mo3510v(int i9) {
    }
}
