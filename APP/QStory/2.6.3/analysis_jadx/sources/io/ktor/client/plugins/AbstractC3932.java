package io.ktor.client.plugins;

import com.materialkolor.dynamiccolor.C3807;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.util.C4209;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p059.C6857;
import p175.AbstractC7739;
import p241.C8140;
import p241.InterfaceC8141;
import p398.AbstractC9139;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4209 f12144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4209 f12145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4209 f12146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4209 f12147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4209 f12148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9141 f12149;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5087 interfaceC5087M8910;
        InterfaceC5087 interfaceC5087M89102;
        InterfaceC5087 interfaceC5087M89103;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703("io.ktor.client.plugins.HttpRequestRetry");
        interfaceC9141M14703.getClass();
        f12149 = interfaceC9141M14703;
        AbstractC7739.m13085("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new C3807(5));
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(Integer.class);
        InterfaceC5087 interfaceC5087M89104 = null;
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(cls2);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12148 = new C4209("MaxRetriesPerRequestAttributeKey", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(InterfaceC6551.class);
        try {
            C5085 c5085 = C5085.f14636;
            interfaceC5087M8910 = AbstractC4396.m8910(InterfaceC6551.class, AbstractC5090.m10100(AbstractC4396.m8912(C3924.class)), AbstractC5090.m10100(AbstractC4396.m8912(InterfaceC8141.class)), AbstractC5090.m10100(AbstractC4396.m8912(AbstractC3946.class)), AbstractC5090.m10100(AbstractC4396.m8912(cls)));
        } catch (Throwable unused2) {
            interfaceC5087M8910 = null;
        }
        f12147 = new C4209("ShouldRetryPerRequestAttributeKey", new C6857(interfaceC5093Mo89172, interfaceC5087M8910));
        InterfaceC5093 interfaceC5093Mo89173 = AbstractC4396.f12975.mo8917(InterfaceC6551.class);
        try {
            C5085 c50852 = C5085.f14636;
            interfaceC5087M89102 = AbstractC4396.m8910(InterfaceC6551.class, AbstractC5090.m10100(AbstractC4396.m8912(C3924.class)), AbstractC5090.m10100(AbstractC4396.m8912(C8140.class)), AbstractC5090.m10100(AbstractC4396.m8912(Throwable.class)), AbstractC5090.m10100(AbstractC4396.m8912(cls)));
        } catch (Throwable unused3) {
            interfaceC5087M89102 = null;
        }
        f12146 = new C4209("ShouldRetryOnExceptionPerRequestAttributeKey", new C6857(interfaceC5093Mo89173, interfaceC5087M89102));
        InterfaceC5093 interfaceC5093Mo89174 = AbstractC4396.f12975.mo8917(InterfaceC6554.class);
        try {
            C5085 c50853 = C5085.f14636;
            interfaceC5087M89103 = AbstractC4396.m8910(InterfaceC6554.class, AbstractC5090.m10100(AbstractC4396.m8912(AbstractC3925.class)), AbstractC5090.m10100(AbstractC4396.m8912(C8140.class)), AbstractC5090.m10100(AbstractC4396.m8912(C5176.class)));
        } catch (Throwable unused4) {
            interfaceC5087M89103 = null;
        }
        f12145 = new C4209("ModifyRequestPerRequestAttributeKey", new C6857(interfaceC5093Mo89174, interfaceC5087M89103));
        InterfaceC5093 interfaceC5093Mo89175 = AbstractC4396.f12975.mo8917(InterfaceC6554.class);
        try {
            C5085 c50854 = C5085.f14636;
            interfaceC5087M89104 = AbstractC4396.m8910(InterfaceC6554.class, AbstractC5090.m10100(AbstractC4396.m8912(AbstractC3933.class)), AbstractC5090.m10100(AbstractC4396.m8912(cls2)), AbstractC5090.m10100(AbstractC4396.m8912(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f12144 = new C4209("RetryDelayPerRequestAttributeKey", new C6857(interfaceC5093Mo89175, interfaceC5087M89104));
    }
}
