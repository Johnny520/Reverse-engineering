package nuke.module.wechat.p002ai;

import java.util.List;
import p000.c50;
import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatRequest {
    public static final int $stable = 8;
    private final int maxTokens;
    private final List<AIChatMessage> messages;
    private final float temperature;

    public /* synthetic */ AIChatRequest(List list, float f, int i, int i2, c50 c50Var) {
        this(list, (i2 & 2) != 0 ? 0.7f : f, (i2 & 4) != 0 ? AIChatConfig.DefaultMaxTokens : i);
    }

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

    public final List<AIChatMessage> component1() {
        return this.messages;
    }

    public final float component2() {
        return this.temperature;
    }

    public final int component3() {
        return this.maxTokens;
    }

    public final AIChatRequest copy(List<AIChatMessage> list, float f, int i) {
        list.getClass();
        return new AIChatRequest(list, f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatRequest)) {
            return false;
        }
        AIChatRequest aIChatRequest = (AIChatRequest) obj;
        return t11.m5086l(this.messages, aIChatRequest.messages) && Float.compare(this.temperature, aIChatRequest.temperature) == 0 && this.maxTokens == aIChatRequest.maxTokens;
    }

    public final int getMaxTokens() {
        return this.maxTokens;
    }

    public final List<AIChatMessage> getMessages() {
        return this.messages;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxTokens) + vi0.m5684c(this.temperature, this.messages.hashCode() * 31, 31);
    }

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
