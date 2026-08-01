package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4892;
import io.ktor.util.C5041;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import p075.C7686;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4983 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12921;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C6008.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C6008.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12921 = new C5041("IgnoreTrailingSlashAttributeKey", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        AbstractC5228.f13320.mo9476(AbstractC4892.class);
        try {
            AbstractC5228.m9471(AbstractC4892.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5976.m10731("IgnoreTrailingSlash")) {
            C6755.m11869("Name can't be blank");
        }
    }
}
