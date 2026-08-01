package io.ktor.server.application;

import io.ktor.server.engine.C4924;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import java.io.Closeable;
import java.io.IOException;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p246.C8878;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4890 extends C4888 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String f12687;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC5192 f12688;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C6254 f12689;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC5192 f12690;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C8878 f12691;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4890(C4924 c4924, boolean z, String str, C8878 c8878, InterfaceC5192 interfaceC5192, PropertyReference0Impl propertyReference0Impl) {
        super(z, c4924);
        str.getClass();
        c8878.getClass();
        interfaceC5192.getClass();
        this.f12687 = str;
        this.f12691 = c8878;
        this.f12690 = interfaceC5192;
        C6254 c6254 = new C6254((InterfaceC6284) interfaceC5192.get(C6285.f15450));
        this.f12689 = c6254;
        this.f12688 = interfaceC5192.plus(c6254);
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12688;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m9022() throws IOException {
        Object obj;
        this.f12689.mo10815(null);
        for (C5041 c5041 : AbstractC5176.m9356(AbstractC4886.m9016(this).m9147().keySet())) {
            c5041.getClass();
            C5036 c5036 = (C5036) this.f13014.m9146(AbstractC4886.f12677);
            if (c5036 != null && (obj = c5036.m9147().get(c5041)) != null) {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                }
                c5036.m9147().remove(c5041);
            }
        }
    }
}
