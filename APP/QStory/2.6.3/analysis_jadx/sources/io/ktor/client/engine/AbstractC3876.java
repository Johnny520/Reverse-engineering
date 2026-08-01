package io.ktor.client.engine;

import androidx.compose.foundation.layout.C0640;
import io.ktor.http.content.AbstractC3987;
import io.ktor.util.AbstractC4210;
import java.util.Set;
import kotlin.collections.AbstractC4347;
import p236.AbstractC8115;
import p236.C8116;
import p236.C8117;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.client.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f12091;

    static {
        String[] strArr = AbstractC8115.f22413;
        f12091 = AbstractC4347.m8845(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8258(C8117 c8117, AbstractC3987 abstractC3987, C0640 c0640) {
        String strMo8356;
        String strMo83562;
        C8116 c8116 = new C8116(2);
        c8116.m2425(c8117);
        c8116.m2425(abstractC3987.mo8282());
        c8116.m13585().mo8355(new C0640(c0640, 5));
        String[] strArr = AbstractC8115.f22413;
        if (c8117.mo8356("User-Agent") == null && abstractC3987.mo8282().mo8356("User-Agent") == null) {
            boolean z = AbstractC4210.f12700;
            c0640.invoke("User-Agent", "ktor-client");
        }
        C8125 c8125Mo8283 = abstractC3987.mo8283();
        if ((c8125Mo8283 == null || (strMo8356 = c8125Mo8283.toString()) == null) && (strMo8356 = abstractC3987.mo8282().mo8356("Content-Type")) == null) {
            strMo8356 = c8117.mo8356("Content-Type");
        }
        Long lMo8284 = abstractC3987.mo8284();
        if ((lMo8284 == null || (strMo83562 = lMo8284.toString()) == null) && (strMo83562 = abstractC3987.mo8282().mo8356("Content-Length")) == null) {
            strMo83562 = c8117.mo8356("Content-Length");
        }
        if (strMo8356 != null) {
            c0640.invoke("Content-Type", strMo8356);
        }
        if (strMo83562 != null) {
            c0640.invoke("Content-Length", strMo83562);
        }
    }
}
