package io.ktor.client.engine;

import androidx.compose.foundation.layout.C1481;
import io.ktor.http.content.AbstractC4819;
import io.ktor.util.AbstractC5042;
import java.util.Set;
import kotlin.collections.AbstractC5179;
import p252.AbstractC8944;
import p252.C8945;
import p252.C8946;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.client.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f12436;

    static {
        String[] strArr = AbstractC8944.f22758;
        f12436 = AbstractC5179.m9404(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8817(C8946 c8946, AbstractC4819 abstractC4819, C1481 c1481) {
        String strMo8915;
        String strMo89152;
        C8945 c8945 = new C8945(2);
        c8945.m2985(c8946);
        c8945.m2985(abstractC4819.mo8841());
        c8945.m14144().mo8914(new C1481(c1481, 5));
        String[] strArr = AbstractC8944.f22758;
        if (c8946.mo8915("User-Agent") == null && abstractC4819.mo8841().mo8915("User-Agent") == null) {
            boolean z = AbstractC5042.f13045;
            c1481.invoke("User-Agent", "ktor-client");
        }
        C8954 c8954Mo8842 = abstractC4819.mo8842();
        if ((c8954Mo8842 == null || (strMo8915 = c8954Mo8842.toString()) == null) && (strMo8915 = abstractC4819.mo8841().mo8915("Content-Type")) == null) {
            strMo8915 = c8946.mo8915("Content-Type");
        }
        Long lMo8843 = abstractC4819.mo8843();
        if ((lMo8843 == null || (strMo89152 = lMo8843.toString()) == null) && (strMo89152 = abstractC4819.mo8841().mo8915("Content-Length")) == null) {
            strMo89152 = c8946.mo8915("Content-Length");
        }
        if (strMo8915 != null) {
            c1481.invoke("Content-Type", strMo8915);
        }
        if (strMo89152 != null) {
            c1481.invoke("Content-Length", strMo89152);
        }
    }
}
