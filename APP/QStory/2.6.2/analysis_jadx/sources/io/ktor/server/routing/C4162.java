package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.util.C4203;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p052.InterfaceC6542;
import p059.C6856;
import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4162 implements InterfaceC4056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4057 f12608;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4203 f12609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC8094 f12610;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5183 f12611;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5183 f12612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4155 f12613;

    public C4162(C4155 c4155) {
        c4155.getClass();
        this.f12613 = c4155;
        final int i = 0;
        this.f12611 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4162 f12606;

            {
                this.f12606 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i2 = i;
                C4162 c4162 = this.f12606;
                switch (i2) {
                    case 0:
                        C4155 c41552 = c4162.f12613;
                        return new C4156(c41552.f12581, c41552.f12580, c4162);
                    default:
                        return new C4146(c4162, c4162.f12613.f12582);
                }
            }
        });
        final int i2 = 1;
        this.f12612 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4162 f12606;

            {
                this.f12606 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i22 = i2;
                C4162 c4162 = this.f12606;
                switch (i22) {
                    case 0:
                        C4155 c41552 = c4162.f12613;
                        return new C4156(c41552.f12581, c41552.f12580, c4162);
                    default:
                        return new C4146(c4162, c4162.f12613.f12582);
                }
            }
        });
        InterfaceC4064 interfaceC4064 = c4155.f12586;
        this.f12609 = interfaceC4064.getAttributes();
        this.f12608 = interfaceC4064.mo8470();
        this.f12610 = c4155.getParameters();
        interfaceC4064.getParameters();
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final C4203 getAttributes() {
        return this.f12609;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final InterfaceC8094 getParameters() {
        return this.f12610;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12613.f12585;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4128 mo8469() {
        return (C4156) this.f12611.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4146 mo8471() {
        return (C4146) this.f12612.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C4057 mo8470() {
        return this.f12608;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8472(Object obj, C6856 c6856, InterfaceC4356 interfaceC4356) {
        C4155 c4155 = this.f12613;
        c4155.getClass();
        Object objM8474 = AbstractC4059.m8474(c4155, obj, c6856, interfaceC4356);
        return objM8474 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8474 : C5175.f14739;
    }
}
