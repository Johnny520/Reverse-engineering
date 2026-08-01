package p361yc;

import okhttp3.internal.url._UrlKt;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9753r1 extends AbstractC9685d3 {
    /* JADX INFO: renamed from: Z */
    public abstract String mo722Z(String str, String str2);

    /* JADX INFO: renamed from: a0 */
    public abstract String mo723a0(InterfaceC9218f interfaceC9218f, int i10);

    @Override // p361yc.AbstractC9685d3
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String mo37863W(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return m38033c0(mo723a0(interfaceC9218f, i10));
    }

    /* JADX INFO: renamed from: c0 */
    public final String m38033c0(String str) {
        str.getClass();
        String str2 = (String) m37862V();
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return mo722Z(str2, str);
    }
}
