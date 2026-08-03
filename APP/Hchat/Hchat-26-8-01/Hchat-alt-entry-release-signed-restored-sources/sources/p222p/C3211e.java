package p222p;

import p308v1.InterfaceC4418p0;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3211e implements InterfaceC3223i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10261a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3223i
    /* JADX INFO: renamed from: c */
    public final void mo6893c(int i9, InterfaceC4418p0 interfaceC4418p0, int[] iArr, int[] iArr2) {
        switch (this.f10261a) {
            case 0:
                AbstractC3226j.m6917c(i9, iArr, iArr2, false);
                break;
            default:
                AbstractC3226j.m6916b(iArr, iArr2, false);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f10261a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
