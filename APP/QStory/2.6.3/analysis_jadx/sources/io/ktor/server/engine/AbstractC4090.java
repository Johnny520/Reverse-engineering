package io.ktor.server.engine;

import androidx.appcompat.app.C0109;
import io.ktor.server.application.AbstractC4054;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.DuplicatePluginException;
import io.ktor.server.response.C4135;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5438;
import p230.C8049;
import p230.C8053;
import p243.AbstractC8150;
import p252.C8188;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4090 implements InterfaceC4094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5438 f12428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4103 f12429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8049 f12430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4092 f12431;

    public AbstractC4090(C4092 c4092, C8049 c8049, boolean z) throws InvalidPhaseException, DuplicatePluginException {
        C8053 c8053 = c4092.f12436;
        c8053.getClass();
        C4103 c4103 = new C4103(z);
        C8053 c8053M13542 = c8053.m13542("ktor.deployment.shutdown.url");
        int i = 0;
        if (c8053M13542 != null) {
            Object obj = ((Map) c8053M13542.f22225).get((String) c8053M13542.f22224);
            obj.getClass();
            AbstractC4054.m8456(c4103, C4100.f12448, new C8188((String) obj, i));
        }
        c4103.m8579(C4103.f12467, new DefaultEnginePipelineKt$defaultEnginePipeline$1(null));
        c8049.getClass();
        this.f12431 = c4092;
        this.f12430 = c8049;
        this.f12429 = c4103;
        this.f12428 = AbstractC5399.m10490();
        C0109 c0109 = new C0109();
        c0109.f323 = true;
        TimeZone timeZone = AbstractC8150.f22474;
        c0109.f322 = System.currentTimeMillis();
        C4209 c4209 = AbstractC4108.f12478;
        C4135 c4135 = c4103.f12469;
        c4135.getClass();
        c4135.m8579(C4135.f12529, new BaseApplicationResponse$Companion$setupSendPipeline$1(null));
        c8049.m13534(AbstractC4060.f12358, new C4091(c0109, i, c4103));
        c8049.m13534(AbstractC4060.f12357, new C4091(c0109, 1, c4092));
    }
}
