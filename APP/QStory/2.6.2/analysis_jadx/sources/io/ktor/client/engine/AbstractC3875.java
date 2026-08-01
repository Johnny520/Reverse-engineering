package io.ktor.client.engine;

import androidx.compose.foundation.layout.C0640;
import io.ktor.http.content.AbstractC3986;
import io.ktor.util.AbstractC4209;
import java.util.Set;
import kotlin.collections.AbstractC4346;
import p236.AbstractC8114;
import p236.C8115;
import p236.C8116;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.client.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f12086;

    static {
        String[] strArr = AbstractC8114.f22415;
        f12086 = AbstractC4346.m8852(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8271(C8116 c8116, AbstractC3986 abstractC3986, C0640 c0640) {
        String strMo8366;
        String strMo83662;
        C8115 c8115 = new C8115(2);
        c8115.m2415(c8116);
        c8115.m2415(abstractC3986.mo8292());
        c8115.m13556().mo8365(new C0640(c0640, 5));
        String[] strArr = AbstractC8114.f22415;
        if (c8116.mo8366("User-Agent") == null && abstractC3986.mo8292().mo8366("User-Agent") == null) {
            boolean z = AbstractC4209.f12696;
            c0640.invoke("User-Agent", "ktor-client");
        }
        C8124 c8124Mo8293 = abstractC3986.mo8293();
        if ((c8124Mo8293 == null || (strMo8366 = c8124Mo8293.toString()) == null) && (strMo8366 = abstractC3986.mo8292().mo8366("Content-Type")) == null) {
            strMo8366 = c8116.mo8366("Content-Type");
        }
        Long lMo8294 = abstractC3986.mo8294();
        if ((lMo8294 == null || (strMo83662 = lMo8294.toString()) == null) && (strMo83662 = abstractC3986.mo8292().mo8366("Content-Length")) == null) {
            strMo83662 = c8116.mo8366("Content-Length");
        }
        if (strMo8366 != null) {
            c0640.invoke("Content-Type", strMo8366);
        }
        if (strMo83662 != null) {
            c0640.invoke("Content-Length", strMo83662);
        }
    }
}
