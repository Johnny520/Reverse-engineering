package io.ktor.server.engine;

import androidx.appcompat.app.C0109;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4056;
import io.ktor.server.application.C4058;
import io.ktor.server.request.C4130;
import io.ktor.server.response.C4135;
import io.ktor.util.pipeline.C4192;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.TimeZone;
import kotlin.C5176;
import p052.InterfaceC6558;
import p243.AbstractC8150;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4091 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12434;

    public /* synthetic */ C4091(Object obj, int i, Object obj2) {
        this.f12434 = i;
        this.f12432 = obj;
        this.f12433 = obj2;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) throws InvalidPhaseException {
        int i = this.f12434;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f12433;
        Object obj3 = this.f12432;
        switch (i) {
            case 0:
                C0109 c0109 = (C0109) obj3;
                C4103 c4103 = (C4103) obj2;
                C4058 c4058 = (C4058) obj;
                c4058.getClass();
                C4130 c4130 = c4058.f12338;
                C4135 c4135 = c4058.f12339;
                if (!c0109.f323) {
                    TimeZone timeZone = AbstractC8150.f22474;
                    c0109.f322 = System.currentTimeMillis();
                }
                c4130.m8577(c4103.f12471);
                c4135.m8577(c4103.f12469);
                InterfaceC9141 interfaceC9141 = AbstractC4111.f12490;
                DefaultTransformKt$installDefaultTransformations$2 defaultTransformKt$installDefaultTransformations$2 = new DefaultTransformKt$installDefaultTransformations$2(null);
                C4192 c4192 = C4130.f12522;
                c4130.m8579(c4192, defaultTransformKt$installDefaultTransformations$2);
                C4192 c41922 = new C4192("AfterTransform");
                c4130.m8576(c4192, c41922);
                c4130.m8579(c41922, new DefaultTransformKt$installDefaultTransformations$3(null));
                DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(null);
                C4192 c41923 = C4135.f12534;
                c4135.m8579(c41923, defaultTransformKt$installDefaultTransformations$1);
                c4058.m8579(C4056.f12333, new BaseApplicationEngineKt$installDefaultInterceptors$1(null));
                c4058.m8579(C4056.f12334, new BaseApplicationEngineKt$installDefaultInterceptors$2(null));
                c4058.m8579(C4056.f12335, new BaseApplicationEngineKt$installDefaultTransformationChecker$1(null));
                C4192 c41924 = new C4192("BodyTransformationCheckPostRender");
                c4135.m8576(c41923, c41924);
                c4135.m8579(c41924, new BaseApplicationEngineKt$installDefaultTransformationChecker$2(null));
                break;
            case 1:
                C0109 c01092 = (C0109) obj3;
                ((C4058) obj).getClass();
                TimeZone timeZone2 = AbstractC8150.f22474;
                double dCurrentTimeMillis = (System.currentTimeMillis() - c01092.f322) / 1000.0d;
                boolean z = c01092.f323;
                InterfaceC9141 interfaceC91412 = ((C4092) obj2).f12437;
                if (!z) {
                    interfaceC91412.info("Application auto-reloaded in " + dCurrentTimeMillis + " seconds.");
                } else {
                    interfaceC91412.info("Application started in " + dCurrentTimeMillis + " seconds.");
                    c01092.f323 = false;
                }
                break;
            default:
                ((C4058) obj).getClass();
                boolean z2 = AbstractC4088.f12424;
                C4098 c4098 = new C4098((C1030) obj2);
                ((C4102) obj3).f12456.m13534(AbstractC4060.f12354, new C1067(c4098, 16));
                Runtime.getRuntime().addShutdownHook(c4098);
                break;
        }
        return c5176;
    }
}
