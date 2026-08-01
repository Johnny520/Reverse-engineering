package io.ktor.client.plugins;

import com.materialkolor.dynamiccolor.C4639;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.util.C5041;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p075.C7686;
import p191.AbstractC8568;
import p257.C8969;
import p257.InterfaceC8970;
import p414.AbstractC9968;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4764 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5041 f12489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5041 f12490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5041 f12491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5041 f12492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5041 f12493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9970 f12494;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5919 interfaceC5919M9469;
        InterfaceC5919 interfaceC5919M94692;
        InterfaceC5919 interfaceC5919M94693;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.client.plugins.HttpRequestRetry");
        interfaceC9970M15262.getClass();
        f12494 = interfaceC9970M15262;
        AbstractC8568.m13644("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new C4639(5));
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(Integer.class);
        InterfaceC5919 interfaceC5919M94694 = null;
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(cls2);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12493 = new C5041("MaxRetriesPerRequestAttributeKey", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(InterfaceC7380.class);
        try {
            C5917 c5917 = C5917.f14981;
            interfaceC5919M9469 = AbstractC5228.m9469(InterfaceC7380.class, AbstractC5922.m10659(AbstractC5228.m9471(C4756.class)), AbstractC5922.m10659(AbstractC5228.m9471(InterfaceC8970.class)), AbstractC5922.m10659(AbstractC5228.m9471(AbstractC4778.class)), AbstractC5922.m10659(AbstractC5228.m9471(cls)));
        } catch (Throwable unused2) {
            interfaceC5919M9469 = null;
        }
        f12492 = new C5041("ShouldRetryPerRequestAttributeKey", new C7686(interfaceC5925Mo94762, interfaceC5919M9469));
        InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(InterfaceC7380.class);
        try {
            C5917 c59172 = C5917.f14981;
            interfaceC5919M94692 = AbstractC5228.m9469(InterfaceC7380.class, AbstractC5922.m10659(AbstractC5228.m9471(C4756.class)), AbstractC5922.m10659(AbstractC5228.m9471(C8969.class)), AbstractC5922.m10659(AbstractC5228.m9471(Throwable.class)), AbstractC5922.m10659(AbstractC5228.m9471(cls)));
        } catch (Throwable unused3) {
            interfaceC5919M94692 = null;
        }
        f12491 = new C5041("ShouldRetryOnExceptionPerRequestAttributeKey", new C7686(interfaceC5925Mo94763, interfaceC5919M94692));
        InterfaceC5925 interfaceC5925Mo94764 = AbstractC5228.f13320.mo9476(InterfaceC7383.class);
        try {
            C5917 c59173 = C5917.f14981;
            interfaceC5919M94693 = AbstractC5228.m9469(InterfaceC7383.class, AbstractC5922.m10659(AbstractC5228.m9471(AbstractC4757.class)), AbstractC5922.m10659(AbstractC5228.m9471(C8969.class)), AbstractC5922.m10659(AbstractC5228.m9471(C6008.class)));
        } catch (Throwable unused4) {
            interfaceC5919M94693 = null;
        }
        f12490 = new C5041("ModifyRequestPerRequestAttributeKey", new C7686(interfaceC5925Mo94764, interfaceC5919M94693));
        InterfaceC5925 interfaceC5925Mo94765 = AbstractC5228.f13320.mo9476(InterfaceC7383.class);
        try {
            C5917 c59174 = C5917.f14981;
            interfaceC5919M94694 = AbstractC5228.m9469(InterfaceC7383.class, AbstractC5922.m10659(AbstractC5228.m9471(AbstractC4765.class)), AbstractC5922.m10659(AbstractC5228.m9471(cls2)), AbstractC5922.m10659(AbstractC5228.m9471(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f12489 = new C5041("RetryDelayPerRequestAttributeKey", new C7686(interfaceC5925Mo94765, interfaceC5919M94694));
    }
}
