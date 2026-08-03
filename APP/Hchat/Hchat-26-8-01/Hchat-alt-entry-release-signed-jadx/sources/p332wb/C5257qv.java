package p332wb;

import ac.AbstractC0063p;
import java.util.Set;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.qv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5257qv implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5026jv f20312g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f20313h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20314i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5257qv(C5026jv c5026jv, boolean z9, InterfaceC1809a1 interfaceC1809a1) {
        this.f20312g = c5026jv;
        this.f20313h = z9;
        this.f20314i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        InterfaceC1809a1 interfaceC1809a1 = this.f20314i;
        Set set = (Set) interfaceC1809a1.getValue();
        String str = this.f20312g.f18249a;
        interfaceC1809a1.setValue(set.contains(str) ? AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str) : this.f20313h ? AbstractC0063p.m404N(str) : AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str));
        return C3967n.f12976a;
    }
}
