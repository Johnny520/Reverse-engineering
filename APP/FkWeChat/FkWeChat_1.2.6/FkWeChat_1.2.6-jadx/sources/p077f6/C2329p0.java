package p077f6;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: f6.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2329p0 implements InterfaceC2327o0 {

    /* JADX INFO: renamed from: a */
    public final Map f6372a = new LinkedHashMap();

    @Override // p077f6.InterfaceC2327o0
    /* JADX INFO: renamed from: a */
    public void mo8489a(String str, String str2) {
        str.getClass();
        Map map = this.f6372a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        map.put(lowerCase, str2);
    }

    @Override // p077f6.InterfaceC2327o0
    /* JADX INFO: renamed from: b */
    public String mo8490b(String str) {
        str.getClass();
        Map map = this.f6372a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) map.get(lowerCase);
        return str2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
    }
}
