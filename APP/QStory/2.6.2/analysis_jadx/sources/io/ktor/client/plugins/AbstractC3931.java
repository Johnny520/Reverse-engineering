package io.ktor.client.plugins;

import com.materialkolor.dynamiccolor.C3806;
import io.ktor.client.statement.AbstractC3945;
import io.ktor.util.C4208;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p059.C6856;
import p241.C8139;
import p241.InterfaceC8140;
import p392.AbstractC9124;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3931 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4208 f12139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4208 f12140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4208 f12141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4208 f12142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4208 f12143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9156 f12144;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5086 interfaceC5086M8920;
        InterfaceC5086 interfaceC5086M89202;
        InterfaceC5086 interfaceC5086M89203;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712("io.ktor.client.plugins.HttpRequestRetry");
        interfaceC9156M14712.getClass();
        f12144 = interfaceC9156M14712;
        AbstractC9124.m14674("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new C3806(5));
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(Integer.class);
        InterfaceC5086 interfaceC5086M89204 = null;
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(cls2);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12143 = new C4208("MaxRetriesPerRequestAttributeKey", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(InterfaceC6550.class);
        try {
            C5084 c5084 = C5084.f14636;
            interfaceC5086M8920 = AbstractC4395.m8920(InterfaceC6550.class, AbstractC5089.m10096(AbstractC4395.m8922(C3923.class)), AbstractC5089.m10096(AbstractC4395.m8922(InterfaceC8140.class)), AbstractC5089.m10096(AbstractC4395.m8922(AbstractC3945.class)), AbstractC5089.m10096(AbstractC4395.m8922(cls)));
        } catch (Throwable unused2) {
            interfaceC5086M8920 = null;
        }
        f12142 = new C4208("ShouldRetryPerRequestAttributeKey", new C6856(interfaceC5092Mo89272, interfaceC5086M8920));
        InterfaceC5092 interfaceC5092Mo89273 = AbstractC4395.f12971.mo8927(InterfaceC6550.class);
        try {
            C5084 c50842 = C5084.f14636;
            interfaceC5086M89202 = AbstractC4395.m8920(InterfaceC6550.class, AbstractC5089.m10096(AbstractC4395.m8922(C3923.class)), AbstractC5089.m10096(AbstractC4395.m8922(C8139.class)), AbstractC5089.m10096(AbstractC4395.m8922(Throwable.class)), AbstractC5089.m10096(AbstractC4395.m8922(cls)));
        } catch (Throwable unused3) {
            interfaceC5086M89202 = null;
        }
        f12141 = new C4208("ShouldRetryOnExceptionPerRequestAttributeKey", new C6856(interfaceC5092Mo89273, interfaceC5086M89202));
        InterfaceC5092 interfaceC5092Mo89274 = AbstractC4395.f12971.mo8927(InterfaceC6553.class);
        try {
            C5084 c50843 = C5084.f14636;
            interfaceC5086M89203 = AbstractC4395.m8920(InterfaceC6553.class, AbstractC5089.m10096(AbstractC4395.m8922(AbstractC3924.class)), AbstractC5089.m10096(AbstractC4395.m8922(C8139.class)), AbstractC5089.m10096(AbstractC4395.m8922(C5175.class)));
        } catch (Throwable unused4) {
            interfaceC5086M89203 = null;
        }
        f12140 = new C4208("ModifyRequestPerRequestAttributeKey", new C6856(interfaceC5092Mo89274, interfaceC5086M89203));
        InterfaceC5092 interfaceC5092Mo89275 = AbstractC4395.f12971.mo8927(InterfaceC6553.class);
        try {
            C5084 c50844 = C5084.f14636;
            interfaceC5086M89204 = AbstractC4395.m8920(InterfaceC6553.class, AbstractC5089.m10096(AbstractC4395.m8922(AbstractC3932.class)), AbstractC5089.m10096(AbstractC4395.m8922(cls2)), AbstractC5089.m10096(AbstractC4395.m8922(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f12139 = new C4208("RetryDelayPerRequestAttributeKey", new C6856(interfaceC5092Mo89275, interfaceC5086M89204));
    }
}
