package io.ktor.server.application;

import io.ktor.server.engine.C4091;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import java.io.Closeable;
import java.io.IOException;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.C5421;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p230.C8048;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4057 extends C4055 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String f12338;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC4359 f12339;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C5421 f12340;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC4359 f12341;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C8048 f12342;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057(C4091 c4091, boolean z, String str, C8048 c8048, InterfaceC4359 interfaceC4359, PropertyReference0Impl propertyReference0Impl) {
        super(z, c4091);
        str.getClass();
        c8048.getClass();
        interfaceC4359.getClass();
        this.f12338 = str;
        this.f12342 = c8048;
        this.f12341 = interfaceC4359;
        C5421 c5421 = new C5421((InterfaceC5451) interfaceC4359.get(C5452.f15105));
        this.f12340 = c5421;
        this.f12339 = interfaceC4359.plus(c5421);
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12339;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m8473() throws IOException {
        Object obj;
        this.f12340.mo10252(null);
        for (C4208 c4208 : AbstractC4343.m8804(AbstractC4053.m8467(this).m8598().keySet())) {
            c4208.getClass();
            C4203 c4203 = (C4203) this.f12665.m8597(AbstractC4053.f12328);
            if (c4203 != null && (obj = c4203.m8598().get(c4208)) != null) {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                }
                c4203.m8598().remove(c4208);
            }
        }
    }
}
