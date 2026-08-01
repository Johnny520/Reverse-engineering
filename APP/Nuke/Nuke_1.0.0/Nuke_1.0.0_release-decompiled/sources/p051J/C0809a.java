package p051J;

import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1664i;
import p117X2.C1663h;
import p211o0.C2730E;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0809a extends C1663h implements InterfaceC1601c {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0824p f2599k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809a(C0824p c0824p) {
        super(1, AbstractC1664i.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f2599k = c0824p;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        float[] fArr = ((C2730E) obj).f8675a;
        InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f2599k.f2648u.getValue();
        if (interfaceC0430v != null) {
            if (!interfaceC0430v.mo632D()) {
                interfaceC0430v = null;
            }
            if (interfaceC0430v != null) {
                interfaceC0430v.mo633I(fArr);
            }
        }
        return C0891q.f2780a;
    }
}
