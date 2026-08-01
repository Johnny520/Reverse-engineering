package io.ktor.client.plugins.sse;

import io.ktor.util.C4209;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.time.C5157;
import p059.C6857;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4209 f12115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4209 f12116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4209 f12117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12118;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5087 interfaceC5087M89122;
        InterfaceC5087 interfaceC5087M89123;
        Class cls = Boolean.TYPE;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(Boolean.class);
        InterfaceC5087 interfaceC5087M89124 = null;
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(cls);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12118 = new C4209("SSERequestFlag", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(C5157.class);
        try {
            interfaceC5087M89122 = AbstractC4396.m8912(C5157.class);
        } catch (Throwable unused2) {
            interfaceC5087M89122 = null;
        }
        f12117 = new C4209("SSEReconnectionTime", new C6857(interfaceC5093Mo89172, interfaceC5087M89122));
        InterfaceC5093 interfaceC5093Mo89173 = AbstractC4396.f12975.mo8917(Boolean.class);
        try {
            interfaceC5087M89123 = AbstractC4396.m8912(cls);
        } catch (Throwable unused3) {
            interfaceC5087M89123 = null;
        }
        f12116 = new C4209("SSEShowCommentEvents", new C6857(interfaceC5093Mo89173, interfaceC5087M89123));
        InterfaceC5093 interfaceC5093Mo89174 = AbstractC4396.f12975.mo8917(Boolean.class);
        try {
            interfaceC5087M89124 = AbstractC4396.m8912(cls);
        } catch (Throwable unused4) {
        }
        f12115 = new C4209("SSEShowRetryEvents", new C6857(interfaceC5093Mo89174, interfaceC5087M89124));
    }
}
