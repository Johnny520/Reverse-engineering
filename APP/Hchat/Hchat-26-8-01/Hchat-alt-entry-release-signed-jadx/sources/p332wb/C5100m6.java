package p332wb;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.m6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5100m6 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18839g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f18840h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5100m6(int i9, boolean z9) {
        this.f18839g = i9;
        this.f18840h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f18839g;
        int iIntValue = ((Integer) obj).intValue();
        switch (i9) {
            case 0:
                if (!this.f18840h) {
                    iIntValue = (-iIntValue) / 4;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                if (this.f18840h) {
                    iIntValue = (-iIntValue) / 4;
                }
                return Integer.valueOf(iIntValue);
            case 2:
                if (!this.f18840h) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue / 3);
            case 3:
                if (this.f18840h) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue / 5);
            case 4:
                if (!this.f18840h) {
                    iIntValue = (-iIntValue) / 4;
                }
                return Integer.valueOf(iIntValue);
            default:
                if (this.f18840h) {
                    iIntValue = (-iIntValue) / 4;
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
