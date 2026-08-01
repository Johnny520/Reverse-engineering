package io.ktor.server.application;

import io.ktor.server.engine.C4092;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import java.io.Closeable;
import java.io.IOException;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.C5422;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p230.C8049;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4058 extends C4056 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String f12342;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC4360 f12343;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C5422 f12344;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC4360 f12345;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C8049 f12346;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058(C4092 c4092, boolean z, String str, C8049 c8049, InterfaceC4360 interfaceC4360, PropertyReference0Impl propertyReference0Impl) {
        super(z, c4092);
        str.getClass();
        c8049.getClass();
        interfaceC4360.getClass();
        this.f12342 = str;
        this.f12346 = c8049;
        this.f12345 = interfaceC4360;
        C5422 c5422 = new C5422((InterfaceC5452) interfaceC4360.get(C5453.f15105));
        this.f12344 = c5422;
        this.f12343 = interfaceC4360.plus(c5422);
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12343;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m8463() throws IOException {
        Object obj;
        this.f12344.mo10256(null);
        for (C4209 c4209 : AbstractC4344.m8797(AbstractC4054.m8457(this).m8588().keySet())) {
            c4209.getClass();
            C4204 c4204 = (C4204) this.f12669.m8587(AbstractC4054.f12332);
            if (c4204 != null && (obj = c4204.m8588().get(c4209)) != null) {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                }
                c4204.m8588().remove(c4209);
            }
        }
    }
}
