package p070f0;

import gg.AbstractC1415k;
import gg.C1414j;
import p071f1.C1008i0;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0969a extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0984p f3051n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0969a(C0984p c0984p) {
        super(1, AbstractC1415k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f3051n = c0984p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        float[] fArr = ((C1008i0) obj).f3190a;
        InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f3051n.f3103x.getValue();
        if (interfaceC4428t != null) {
            if (!interfaceC4428t.mo8856C()) {
                interfaceC4428t = null;
            }
            if (interfaceC4428t != null) {
                interfaceC4428t.mo8857E(fArr);
            }
        }
        return C3967n.f12976a;
    }
}
