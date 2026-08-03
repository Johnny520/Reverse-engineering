package p255r4;

import bsh.C0353j;
import java.util.Collection;
import p136j8.C2104o;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3688o0 {

    /* JADX INFO: renamed from: a */
    public final String f11994a;

    /* JADX INFO: renamed from: b */
    public final C3689p f11995b;

    /* JADX INFO: renamed from: c */
    public final int f11996c;

    /* JADX INFO: renamed from: d */
    public int f11997d;

    /* JADX INFO: renamed from: e */
    public boolean f11998e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3688o0(String str, C3689p c3689p, int i9) {
        if (c3689p == null) {
            C0353j.m1305c("file == null");
            throw null;
        }
        if (i9 <= 0 || ((i9 - 1) & i9) != 0) {
            C2104o.m5294t("invalid alignment");
            throw null;
        }
        this.f11994a = str;
        this.f11995b = c3689p;
        this.f11996c = i9;
        this.f11997d = -1;
        this.f11998e = false;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo7674a(AbstractC3660a0 abstractC3660a0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m7696b() {
        int i9 = this.f11997d;
        if (i9 >= 0) {
            return i9;
        }
        C0353j.m1309g("fileOffset not set");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public abstract Collection mo7652c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7697d() {
        m7699g();
        mo7675e();
        this.f11998e = true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo7675e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7698f() {
        if (this.f11998e) {
            return;
        }
        C0353j.m1309g("not prepared");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m7699g() {
        if (this.f11998e) {
            C0353j.m1309g("already prepared");
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo7676h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7700i(C6090d c6090d) {
        m7698f();
        c6090d.m10826a(this.f11996c);
        int i9 = c6090d.f24596c;
        int i10 = this.f11997d;
        if (i10 < 0) {
            this.f11997d = i9;
        } else if (i10 != i9) {
            StringBuilder sb2 = new StringBuilder("alignment mismatch: for ");
            sb2.append(this);
            int i11 = this.f11997d;
            sb2.append(", at ");
            sb2.append(i9);
            sb2.append(", but expected ");
            sb2.append(i11);
            throw new RuntimeException(sb2.toString());
        }
        if (c6090d.m10829d()) {
            String str = this.f11994a;
            if (str != null) {
                c6090d.m10827b(0, "\n" + str + ":");
            } else if (i9 != 0) {
                c6090d.m10827b(0, "\n");
            }
        }
        mo7677j(c6090d);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo7677j(C6090d c6090d);
}
