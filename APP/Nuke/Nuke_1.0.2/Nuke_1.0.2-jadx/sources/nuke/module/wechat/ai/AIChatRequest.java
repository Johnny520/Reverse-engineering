package nuke.module.wechat.ai;

import defpackage.c50;
import defpackage.t11;
import defpackage.vi0;
import defpackage.z41;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatRequest {
    public static final int $stable = 8;
    private final int maxTokens;
    private final List<AIChatMessage> messages;
    private final float temperature;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (0.7f float) : (r2v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (4 int) A[WRAPPED] (LINE:8)) != (0 int)) ? (wrap:int:0x000b: SGET  A[WRAPPED] (LINE:12) nuke.module.wechat.ai.AIChatConfig.DefaultMaxTokens int) : (r3v0 int))
 A[MD:(java.util.List<nuke.module.wechat.ai.AIChatMessage>, float, int):void (m)] (LINE:14) call: nuke.module.wechat.ai.AIChatRequest.<init>(java.util.List, float, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AIChatRequest(List list, float f, int i, int i2, c50 c50Var) {
        this(list, (i2 & 2) != 0 ? 0.7f : f, (i2 & 4) != 0 ? AIChatConfig.DefaultMaxTokens : i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: nuke.module.wechat.ai.AIChatRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIChatRequest copy$default(AIChatRequest aIChatRequest, List list, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aIChatRequest.messages;
        }
        if ((i2 & 2) != 0) {
            f = aIChatRequest.temperature;
        }
        if ((i2 & 4) != 0) {
            i = aIChatRequest.maxTokens;
        }
        return aIChatRequest.copy(list, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AIChatMessage> component1() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float component2() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component3() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AIChatRequest copy(List<AIChatMessage> list, float f, int i) {
        list.getClass();
        return new AIChatRequest(list, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatRequest)) {
            return false;
        }
        AIChatRequest aIChatRequest = (AIChatRequest) obj;
        return t11.l(this.messages, aIChatRequest.messages) && Float.compare(this.temperature, aIChatRequest.temperature) == 0 && this.maxTokens == aIChatRequest.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMaxTokens() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AIChatMessage> getMessages() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getTemperature() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.maxTokens) + vi0.c(this.temperature, this.messages.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "AIChatRequest(messages=" + this.messages + ", temperature=" + this.temperature + ", maxTokens=" + this.maxTokens + ")";
    }

    public AIChatRequest(List<AIChatMessage> list, float f, int i) {
        list.getClass();
        this.messages = list;
        this.temperature = f;
        this.maxTokens = i;
    }
}
