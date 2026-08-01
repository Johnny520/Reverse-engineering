package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.request.InterfaceC4129;
import io.ktor.util.C4204;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p052.InterfaceC6543;
import p059.C6857;
import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4163 implements InterfaceC4057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4058 f12612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4204 f12613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC8095 f12614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f12615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f12616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4156 f12617;

    public C4163(C4156 c4156) {
        c4156.getClass();
        this.f12617 = c4156;
        final int i = 0;
        this.f12615 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4163 f12610;

            {
                this.f12610 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i2 = i;
                C4163 c4163 = this.f12610;
                switch (i2) {
                    case 0:
                        C4156 c41562 = c4163.f12617;
                        return new C4157(c41562.f12585, c41562.f12584, c4163);
                    default:
                        return new C4147(c4163, c4163.f12617.f12586);
                }
            }
        });
        final int i2 = 1;
        this.f12616 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4163 f12610;

            {
                this.f12610 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i22 = i2;
                C4163 c4163 = this.f12610;
                switch (i22) {
                    case 0:
                        C4156 c41562 = c4163.f12617;
                        return new C4157(c41562.f12585, c41562.f12584, c4163);
                    default:
                        return new C4147(c4163, c4163.f12617.f12586);
                }
            }
        });
        InterfaceC4065 interfaceC4065 = c4156.f12590;
        this.f12613 = interfaceC4065.getAttributes();
        this.f12612 = interfaceC4065.mo8460();
        this.f12614 = c4156.getParameters();
        interfaceC4065.getParameters();
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final C4204 getAttributes() {
        return this.f12613;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final InterfaceC8095 getParameters() {
        return this.f12614;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12617.f12589;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4129 mo8459() {
        return (C4157) this.f12615.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4147 mo8461() {
        return (C4147) this.f12616.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4058 mo8460() {
        return this.f12612;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8462(Object obj, C6857 c6857, InterfaceC4357 interfaceC4357) {
        C4156 c4156 = this.f12617;
        c4156.getClass();
        Object objM8464 = AbstractC4060.m8464(c4156, obj, c6857, interfaceC4357);
        return objM8464 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8464 : C5176.f14739;
    }
}
