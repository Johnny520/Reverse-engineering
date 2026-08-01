package p136b0;

import p013C0.C0236c;
import p095T.AbstractC1384r0;
import p095T.InterfaceC1345W0;
import p095T.InterfaceC1378o0;
import p119Y.C1719c;
import p119Y.C1728l;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1847i extends C1719c implements InterfaceC1378o0 {

    /* JADX INFO: renamed from: g */
    public static final C1847i f6255g = new C1847i(C1728l.f5976e, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1847i m3311b(AbstractC1384r0 abstractC1384r0, InterfaceC1345W0 interfaceC1345W0) {
        C0236c c0236cM3080u = this.f5959d.m3080u(abstractC1384r0.hashCode(), 0, abstractC1384r0, interfaceC1345W0);
        return c0236cM3080u == null ? this : new C1847i((C1728l) c0236cM3080u.f794f, this.f5960e + c0236cM3080u.f793e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119Y.C1719c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1384r0) {
            return super.containsKey((AbstractC1384r0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0966f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC1345W0) {
            return super.containsValue((InterfaceC1345W0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119Y.C1719c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1384r0) {
            return (InterfaceC1345W0) super.get((AbstractC1384r0) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1384r0) ? obj2 : (InterfaceC1345W0) super.getOrDefault((AbstractC1384r0) obj, (InterfaceC1345W0) obj2);
    }
}
