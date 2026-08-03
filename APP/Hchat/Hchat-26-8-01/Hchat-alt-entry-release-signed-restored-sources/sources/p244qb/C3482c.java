package p244qb;

import android.app.Activity;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: qb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3482c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11299g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3490k f11300h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f11301i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3482c(C3490k c3490k, Activity activity, int i9) {
        this.f11299g = i9;
        this.f11300h = c3490k;
        this.f11301i = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f11299g) {
            case 0:
                this.f11300h.f11341l.remove(this.f11301i);
                break;
            default:
                this.f11300h.f11341l.remove(this.f11301i);
                break;
        }
        return C3967n.f12976a;
    }
}
