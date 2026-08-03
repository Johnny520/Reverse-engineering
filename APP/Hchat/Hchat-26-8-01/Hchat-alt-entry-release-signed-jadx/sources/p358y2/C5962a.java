package p358y2;

import gg.AbstractC1417m;
import p015b0.C0147m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5962a extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24237g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DialogC5987v f24238h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5962a(DialogC5987v dialogC5987v, int i9) {
        super(1);
        this.f24237g = i9;
        this.f24238h = dialogC5987v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f24237g) {
            case 0:
                DialogC5987v dialogC5987v = this.f24238h;
                dialogC5987v.show();
                return new C0147m(dialogC5987v, 8);
            default:
                DialogC5987v dialogC5987v2 = this.f24238h;
                if (dialogC5987v2.f24314k.f24307a) {
                    dialogC5987v2.f24313j.invoke();
                }
                return C3967n.f12976a;
        }
    }
}
