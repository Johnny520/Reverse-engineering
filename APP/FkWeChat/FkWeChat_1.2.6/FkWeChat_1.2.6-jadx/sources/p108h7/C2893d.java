package p108h7;

import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2893d implements InterfaceC2890a {

    /* JADX INFO: renamed from: c */
    public static final a f7640c = new a(null);

    /* JADX INFO: renamed from: a */
    public final Map f7641a;

    /* JADX INFO: renamed from: b */
    public final String f7642b;

    public C2893d(Map map, String str) {
        map.getClass();
        str.getClass();
        this.f7641a = map;
        this.f7642b = str;
    }

    @Override // p108h7.InterfaceC2890a
    /* JADX INFO: renamed from: a */
    public InterfaceC2891b mo10537a(String str) {
        str.getClass();
        String strM10543d = AbstractC2894e.m10543d(this.f7642b, str);
        if (AbstractC2897h.m10545a(this.f7641a, strM10543d)) {
            return new C2896g(this.f7641a, strM10543d);
        }
        return null;
    }

    /* JADX INFO: renamed from: h7.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C2893d() {
        this(new LinkedHashMap(), _UrlKt.FRAGMENT_ENCODE_SET);
    }
}
