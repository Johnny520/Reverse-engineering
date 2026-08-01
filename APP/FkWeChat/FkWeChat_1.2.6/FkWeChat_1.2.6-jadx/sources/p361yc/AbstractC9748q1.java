package p361yc;

import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5081g0;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9748q1 extends AbstractC9680c3 {
    /* JADX INFO: renamed from: d0 */
    public abstract String mo676d0(String str, String str2);

    /* JADX INFO: renamed from: e0 */
    public String mo839e0(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return interfaceC9218f.mo35892f(i10);
    }

    @Override // p361yc.AbstractC9680c3
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final String mo37836Y(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return m38018g0(mo839e0(interfaceC9218f, i10));
    }

    /* JADX INFO: renamed from: g0 */
    public final String m38018g0(String str) {
        str.getClass();
        String str2 = (String) m37835X();
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return mo676d0(str2, str);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m38019h0() {
        return m37837Z().isEmpty() ? "$" : AbstractC5081g0.m20585s0(m37837Z(), ".", "$.", null, 0, null, null, 60, null);
    }
}
