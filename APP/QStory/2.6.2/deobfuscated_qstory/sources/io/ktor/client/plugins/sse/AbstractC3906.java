package io.ktor.client.plugins.sse;

import io.ktor.util.C4208;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.time.C5156;
import p059.C6856;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4208 f12110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4208 f12111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4208 f12112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12113;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5086 interfaceC5086M89222;
        InterfaceC5086 interfaceC5086M89223;
        Class cls = Boolean.TYPE;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(Boolean.class);
        InterfaceC5086 interfaceC5086M89224 = null;
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(cls);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12113 = new C4208("SSERequestFlag", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(C5156.class);
        try {
            interfaceC5086M89222 = AbstractC4395.m8922(C5156.class);
        } catch (Throwable unused2) {
            interfaceC5086M89222 = null;
        }
        f12112 = new C4208("SSEReconnectionTime", new C6856(interfaceC5092Mo89272, interfaceC5086M89222));
        InterfaceC5092 interfaceC5092Mo89273 = AbstractC4395.f12971.mo8927(Boolean.class);
        try {
            interfaceC5086M89223 = AbstractC4395.m8922(cls);
        } catch (Throwable unused3) {
            interfaceC5086M89223 = null;
        }
        f12111 = new C4208("SSEShowCommentEvents", new C6856(interfaceC5092Mo89273, interfaceC5086M89223));
        InterfaceC5092 interfaceC5092Mo89274 = AbstractC4395.f12971.mo8927(Boolean.class);
        try {
            interfaceC5086M89224 = AbstractC4395.m8922(cls);
        } catch (Throwable unused4) {
        }
        f12110 = new C4208("SSEShowRetryEvents", new C6856(interfaceC5092Mo89274, interfaceC5086M89224));
    }
}
