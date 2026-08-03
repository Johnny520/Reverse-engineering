package p376z4;

import p060e4.C0824a;

/* JADX INFO: renamed from: z4.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6096j {

    /* JADX INFO: renamed from: g */
    public boolean f24613g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6096j() {
        this.f24613g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10854e() {
        return this.f24613g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void mo4882i() {
        this.f24613g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m10855j() {
        if (!this.f24613g) {
            throw new C0824a("immutable instance", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m10856k() {
        if (this.f24613g) {
            throw new C0824a("mutable instance", null);
        }
    }

    public AbstractC6096j(boolean z9) {
        this.f24613g = z9;
    }
}
