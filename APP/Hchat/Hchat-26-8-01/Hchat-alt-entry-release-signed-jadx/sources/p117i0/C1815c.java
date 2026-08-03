package p117i0;

import java.util.ArrayList;
import p071f1.C1008i0;
import p085fg.InterfaceC1231l;
import p267s1.C3884a0;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815c implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6034g;

    /* JADX INFO: renamed from: h */
    public Object f6035h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1815c(Object obj, int i9) {
        this.f6034g = i9;
        this.f6035h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f6034g) {
            case 0:
                ((InterfaceC1827f) this.f6035h).cancel();
                return C3967n.f12976a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C3884a0 c3884a0 = (C3884a0) this.f6035h;
                if (c3884a0 != null) {
                    c3884a0.f12743c = zBooleanValue;
                }
                return C3967n.f12976a;
            case 2:
                float[] fArr = ((C1008i0) obj).f3190a;
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f6035h;
                if (interfaceC4428t.mo8856C()) {
                    AbstractC4434w.m8884h(interfaceC4428t).mo8864g0(interfaceC4428t, fArr);
                }
                return C3967n.f12976a;
            default:
                ((ArrayList) this.f6035h).get(((Number) obj).intValue());
                return null;
        }
    }
}
