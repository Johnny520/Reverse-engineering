package io.ktor.server.engine;

import androidx.appcompat.app.C0109;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4055;
import io.ktor.server.application.C4057;
import io.ktor.server.request.C4129;
import io.ktor.server.response.C4134;
import io.ktor.util.pipeline.C4191;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.TimeZone;
import kotlin.C5175;
import p052.InterfaceC6557;
import p243.AbstractC8149;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4090 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12430;

    public /* synthetic */ C4090(Object obj, int i, Object obj2) {
        this.f12430 = i;
        this.f12428 = obj;
        this.f12429 = obj2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) throws InvalidPhaseException {
        int i = this.f12430;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f12429;
        Object obj3 = this.f12428;
        switch (i) {
            case 0:
                C0109 c0109 = (C0109) obj3;
                C4102 c4102 = (C4102) obj2;
                C4057 c4057 = (C4057) obj;
                c4057.getClass();
                C4129 c4129 = c4057.f12334;
                C4134 c4134 = c4057.f12335;
                if (!c0109.f323) {
                    TimeZone timeZone = AbstractC8149.f22476;
                    c0109.f322 = System.currentTimeMillis();
                }
                c4129.m8587(c4102.f12467);
                c4134.m8587(c4102.f12465);
                InterfaceC9156 interfaceC9156 = AbstractC4110.f12486;
                DefaultTransformKt$installDefaultTransformations$2 defaultTransformKt$installDefaultTransformations$2 = new DefaultTransformKt$installDefaultTransformations$2(null);
                C4191 c4191 = C4129.f12518;
                c4129.m8589(c4191, defaultTransformKt$installDefaultTransformations$2);
                C4191 c41912 = new C4191("AfterTransform");
                c4129.m8586(c4191, c41912);
                c4129.m8589(c41912, new DefaultTransformKt$installDefaultTransformations$3(null));
                DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(null);
                C4191 c41913 = C4134.f12530;
                c4134.m8589(c41913, defaultTransformKt$installDefaultTransformations$1);
                c4057.m8589(C4055.f12329, new BaseApplicationEngineKt$installDefaultInterceptors$1(null));
                c4057.m8589(C4055.f12330, new BaseApplicationEngineKt$installDefaultInterceptors$2(null));
                c4057.m8589(C4055.f12331, new BaseApplicationEngineKt$installDefaultTransformationChecker$1(null));
                C4191 c41914 = new C4191("BodyTransformationCheckPostRender");
                c4134.m8586(c41913, c41914);
                c4134.m8589(c41914, new BaseApplicationEngineKt$installDefaultTransformationChecker$2(null));
                break;
            case 1:
                C0109 c01092 = (C0109) obj3;
                ((C4057) obj).getClass();
                TimeZone timeZone2 = AbstractC8149.f22476;
                double dCurrentTimeMillis = (System.currentTimeMillis() - c01092.f322) / 1000.0d;
                boolean z = c01092.f323;
                InterfaceC9156 interfaceC91562 = ((C4091) obj2).f12433;
                if (!z) {
                    interfaceC91562.info("Application auto-reloaded in " + dCurrentTimeMillis + " seconds.");
                } else {
                    interfaceC91562.info("Application started in " + dCurrentTimeMillis + " seconds.");
                    c01092.f323 = false;
                }
                break;
            default:
                ((C4057) obj).getClass();
                boolean z2 = AbstractC4087.f12420;
                C4097 c4097 = new C4097((C1030) obj2);
                ((C4101) obj3).f12452.m13504(AbstractC4059.f12350, new C1067(c4097, 16));
                Runtime.getRuntime().addShutdownHook(c4097);
                break;
        }
        return c5175;
    }
}
