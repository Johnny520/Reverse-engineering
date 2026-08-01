package io.ktor.server.engine;

import androidx.appcompat.app.C0956;
import io.ktor.server.application.AbstractC4886;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.DuplicatePluginException;
import io.ktor.server.response.C4967;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import p246.C8878;
import p246.C8882;
import p259.AbstractC8979;
import p268.C9017;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4922 implements InterfaceC4926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6270 f12773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4935 f12774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8878 f12775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4924 f12776;

    public AbstractC4922(C4924 c4924, C8878 c8878, boolean z) throws InvalidPhaseException, DuplicatePluginException {
        C8882 c8882 = c4924.f12781;
        c8882.getClass();
        C4935 c4935 = new C4935(z);
        C8882 c8882M14101 = c8882.m14101("ktor.deployment.shutdown.url");
        int i = 0;
        if (c8882M14101 != null) {
            Object obj = ((Map) c8882M14101.f22570).get((String) c8882M14101.f22569);
            obj.getClass();
            AbstractC4886.m9015(c4935, C4932.f12793, new C9017((String) obj, i));
        }
        c4935.m9138(C4935.f12812, new DefaultEnginePipelineKt$defaultEnginePipeline$1(null));
        c8878.getClass();
        this.f12776 = c4924;
        this.f12775 = c8878;
        this.f12774 = c4935;
        this.f12773 = AbstractC6231.m11049();
        C0956 c0956 = new C0956();
        c0956.f668 = true;
        TimeZone timeZone = AbstractC8979.f22819;
        c0956.f667 = System.currentTimeMillis();
        C5041 c5041 = AbstractC4940.f12823;
        C4967 c4967 = c4935.f12814;
        c4967.getClass();
        c4967.m9138(C4967.f12874, new BaseApplicationResponse$Companion$setupSendPipeline$1(null));
        c8878.m14093(AbstractC4892.f12703, new C4923(c0956, i, c4935));
        c8878.m14093(AbstractC4892.f12702, new C4923(c0956, 1, c4924));
    }
}
