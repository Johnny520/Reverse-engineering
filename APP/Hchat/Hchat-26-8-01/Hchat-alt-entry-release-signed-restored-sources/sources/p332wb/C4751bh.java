package p332wb;

import java.util.Set;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.bh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4751bh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16031g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16032h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16033i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4751bh(String str, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f16031g = i9;
        this.f16032h = str;
        this.f16033i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f16031g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f16033i;
                Set set = (Set) interfaceC1809a1.getValue();
                String str = this.f16032h;
                interfaceC1809a1.setValue(set.contains(str) ? AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str) : AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str));
                break;
            default:
                this.f16033i.setValue(this.f16032h);
                break;
        }
        return C3967n.f12976a;
    }
}
