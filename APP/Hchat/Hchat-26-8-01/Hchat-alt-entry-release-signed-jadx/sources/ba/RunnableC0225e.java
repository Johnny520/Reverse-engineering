package ba;

import p049d9.C0744e;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: ba.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0225e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f559g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f560h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f561i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0225e(Object obj, boolean z9, int i9) {
        this.f559g = i9;
        this.f561i = obj;
        this.f560h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f559g) {
            case 0:
                ((C0224d) this.f561i).f558c.invoke(this.f560h ? EnumC0222b.f551g : EnumC0222b.f553i);
                break;
            case 1:
                ((C0744e) this.f561i).f2215d.invoke(Boolean.valueOf(this.f560h));
                break;
            default:
                ((InterfaceC1231l) this.f561i).invoke(Boolean.valueOf(this.f560h));
                break;
        }
    }
}
