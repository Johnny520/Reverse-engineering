package io.ktor.server.engine;

import androidx.appcompat.app.C0956;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.C1905;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4888;
import io.ktor.server.application.C4890;
import io.ktor.server.request.C4962;
import io.ktor.server.response.C4967;
import io.ktor.util.pipeline.C5024;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.TimeZone;
import kotlin.C6008;
import p068.InterfaceC7387;
import p259.AbstractC8979;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4923 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12779;

    public /* synthetic */ C4923(Object obj, int i, Object obj2) {
        this.f12779 = i;
        this.f12777 = obj;
        this.f12778 = obj2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) throws InvalidPhaseException {
        int i = this.f12779;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f12778;
        Object obj3 = this.f12777;
        switch (i) {
            case 0:
                C0956 c0956 = (C0956) obj3;
                C4935 c4935 = (C4935) obj2;
                C4890 c4890 = (C4890) obj;
                c4890.getClass();
                C4962 c4962 = c4890.f12683;
                C4967 c4967 = c4890.f12684;
                if (!c0956.f668) {
                    TimeZone timeZone = AbstractC8979.f22819;
                    c0956.f667 = System.currentTimeMillis();
                }
                c4962.m9136(c4935.f12816);
                c4967.m9136(c4935.f12814);
                InterfaceC9970 interfaceC9970 = AbstractC4943.f12835;
                DefaultTransformKt$installDefaultTransformations$2 defaultTransformKt$installDefaultTransformations$2 = new DefaultTransformKt$installDefaultTransformations$2(null);
                C5024 c5024 = C4962.f12867;
                c4962.m9138(c5024, defaultTransformKt$installDefaultTransformations$2);
                C5024 c50242 = new C5024("AfterTransform");
                c4962.m9135(c5024, c50242);
                c4962.m9138(c50242, new DefaultTransformKt$installDefaultTransformations$3(null));
                DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(null);
                C5024 c50243 = C4967.f12879;
                c4967.m9138(c50243, defaultTransformKt$installDefaultTransformations$1);
                c4890.m9138(C4888.f12678, new BaseApplicationEngineKt$installDefaultInterceptors$1(null));
                c4890.m9138(C4888.f12679, new BaseApplicationEngineKt$installDefaultInterceptors$2(null));
                c4890.m9138(C4888.f12680, new BaseApplicationEngineKt$installDefaultTransformationChecker$1(null));
                C5024 c50244 = new C5024("BodyTransformationCheckPostRender");
                c4967.m9135(c50243, c50244);
                c4967.m9138(c50244, new BaseApplicationEngineKt$installDefaultTransformationChecker$2(null));
                break;
            case 1:
                C0956 c09562 = (C0956) obj3;
                ((C4890) obj).getClass();
                TimeZone timeZone2 = AbstractC8979.f22819;
                double dCurrentTimeMillis = (System.currentTimeMillis() - c09562.f667) / 1000.0d;
                boolean z = c09562.f668;
                InterfaceC9970 interfaceC99702 = ((C4924) obj2).f12782;
                if (!z) {
                    interfaceC99702.info("Application auto-reloaded in " + dCurrentTimeMillis + " seconds.");
                } else {
                    interfaceC99702.info("Application started in " + dCurrentTimeMillis + " seconds.");
                    c09562.f668 = false;
                }
                break;
            default:
                ((C4890) obj).getClass();
                boolean z2 = AbstractC4920.f12769;
                C4930 c4930 = new C4930((C1868) obj2);
                ((C4934) obj3).f12801.m14093(AbstractC4892.f12699, new C1905(c4930, 16));
                Runtime.getRuntime().addShutdownHook(c4930);
                break;
        }
        return c6008;
    }
}
