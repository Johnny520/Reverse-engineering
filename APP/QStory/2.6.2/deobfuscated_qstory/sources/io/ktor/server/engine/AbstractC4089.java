package io.ktor.server.engine;

import androidx.appcompat.app.C0109;
import io.ktor.server.application.AbstractC4053;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.DuplicatePluginException;
import io.ktor.server.response.C4134;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;
import p230.C8048;
import p230.C8052;
import p243.AbstractC8149;
import p252.C8187;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4089 implements InterfaceC4093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5437 f12424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4102 f12425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8048 f12426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4091 f12427;

    public AbstractC4089(C4091 c4091, C8048 c8048, boolean z) throws InvalidPhaseException, DuplicatePluginException {
        C8052 c8052 = c4091.f12432;
        c8052.getClass();
        C4102 c4102 = new C4102(z);
        C8052 c8052M13513 = c8052.m13513("ktor.deployment.shutdown.url");
        int i = 0;
        if (c8052M13513 != null) {
            Object obj = ((Map) c8052M13513.f22227).get((String) c8052M13513.f22226);
            obj.getClass();
            AbstractC4053.m8466(c4102, C4099.f12444, new C8187((String) obj, i));
        }
        c4102.m8589(C4102.f12463, new DefaultEnginePipelineKt$defaultEnginePipeline$1(null));
        c8048.getClass();
        this.f12427 = c4091;
        this.f12426 = c8048;
        this.f12425 = c4102;
        this.f12424 = AbstractC5398.m10486();
        C0109 c0109 = new C0109();
        c0109.f323 = true;
        TimeZone timeZone = AbstractC8149.f22476;
        c0109.f322 = System.currentTimeMillis();
        C4208 c4208 = AbstractC4107.f12474;
        C4134 c4134 = c4102.f12465;
        c4134.getClass();
        c4134.m8589(C4134.f12525, new BaseApplicationResponse$Companion$setupSendPipeline$1(null));
        c8048.m13504(AbstractC4059.f12354, new C4090(c0109, i, c4102));
        c8048.m13504(AbstractC4059.f12353, new C4090(c0109, 1, c4091));
    }
}
