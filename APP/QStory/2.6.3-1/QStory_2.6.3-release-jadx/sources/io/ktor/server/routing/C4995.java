package io.ktor.server.routing;

import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.util.C5036;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p068.InterfaceC7372;
import p075.C7686;
import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4995 implements InterfaceC4889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4890 f12957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5036 f12958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC8924 f12959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f12960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f12961;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4988 f12962;

    public C4995(C4988 c4988) {
        c4988.getClass();
        this.f12962 = c4988;
        final int i = 0;
        this.f12960 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4995 f12955;

            {
                this.f12955 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i2 = i;
                C4995 c4995 = this.f12955;
                switch (i2) {
                    case 0:
                        C4988 c49882 = c4995.f12962;
                        return new C4989(c49882.f12930, c49882.f12929, c4995);
                    default:
                        return new C4979(c4995, c4995.f12962.f12931);
                }
            }
        });
        final int i2 = 1;
        this.f12961 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: io.ktor.server.routing.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4995 f12955;

            {
                this.f12955 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i22 = i2;
                C4995 c4995 = this.f12955;
                switch (i22) {
                    case 0:
                        C4988 c49882 = c4995.f12962;
                        return new C4989(c49882.f12930, c49882.f12929, c4995);
                    default:
                        return new C4979(c4995, c4995.f12962.f12931);
                }
            }
        });
        InterfaceC4897 interfaceC4897 = c4988.f12935;
        this.f12958 = interfaceC4897.getAttributes();
        this.f12957 = interfaceC4897.mo9019();
        this.f12959 = c4988.getParameters();
        interfaceC4897.getParameters();
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final C5036 getAttributes() {
        return this.f12958;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final InterfaceC8924 getParameters() {
        return this.f12959;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12962.f12934;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4961 mo9018() {
        return (C4989) this.f12960.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4979 mo9020() {
        return (C4979) this.f12961.getValue();
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4890 mo9019() {
        return this.f12957;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo9021(Object obj, C7686 c7686, InterfaceC5189 interfaceC5189) {
        C4988 c4988 = this.f12962;
        c4988.getClass();
        Object objM9023 = AbstractC4892.m9023(c4988, obj, c7686, interfaceC5189);
        return objM9023 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9023 : C6008.f15084;
    }
}
