package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4060;
import io.ktor.util.C4209;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.text.AbstractC5144;
import p059.C6857;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12576;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C5176.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C5176.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12576 = new C4209("IgnoreTrailingSlashAttributeKey", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        AbstractC4396.f12975.mo8917(AbstractC4060.class);
        try {
            AbstractC4396.m8912(AbstractC4060.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5144.m10172("IgnoreTrailingSlash")) {
            C5925.m11310("Name can't be blank");
        }
    }
}
