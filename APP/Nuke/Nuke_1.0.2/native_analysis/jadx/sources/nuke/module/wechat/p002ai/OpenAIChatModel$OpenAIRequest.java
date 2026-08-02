package nuke.module.wechat.p002ai;

import java.util.List;
import p000.fp2;
import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIRequest {

    @fp2("max_tokens")
    private final int maxTokens;
    private final List<OpenAIChatModel$OpenAIMessage> messages;
    private final String model;
    private final float temperature;

    public OpenAIChatModel$OpenAIRequest(String str, List<OpenAIChatModel$OpenAIMessage> list, float f, int i) {
        str.getClass();
        list.getClass();
        this.model = str;
        this.messages = list;
        this.temperature = f;
        this.maxTokens = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenAIChatModel$OpenAIRequest copy$default(OpenAIChatModel$OpenAIRequest openAIChatModel$OpenAIRequest, String str, List list, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = openAIChatModel$OpenAIRequest.model;
        }
        if ((i2 & 2) != 0) {
            list = openAIChatModel$OpenAIRequest.messages;
        }
        if ((i2 & 4) != 0) {
            f = openAIChatModel$OpenAIRequest.temperature;
        }
        if ((i2 & 8) != 0) {
            i = openAIChatModel$OpenAIRequest.maxTokens;
        }
        return openAIChatModel$OpenAIRequest.copy(str, list, f, i);
    }

    public final String component1() {
        return this.model;
    }

    public final List<OpenAIChatModel$OpenAIMessage> component2() {
        return this.messages;
    }

    public final float component3() {
        return this.temperature;
    }

    public final int component4() {
        return this.maxTokens;
    }

    public final OpenAIChatModel$OpenAIRequest copy(String str, List<OpenAIChatModel$OpenAIMessage> list, float f, int i) {
        str.getClass();
        list.getClass();
        return new OpenAIChatModel$OpenAIRequest(str, list, f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIRequest)) {
            return false;
        }
        OpenAIChatModel$OpenAIRequest openAIChatModel$OpenAIRequest = (OpenAIChatModel$OpenAIRequest) obj;
        return t11.m5086l(this.model, openAIChatModel$OpenAIRequest.model) && t11.m5086l(this.messages, openAIChatModel$OpenAIRequest.messages) && Float.compare(this.temperature, openAIChatModel$OpenAIRequest.temperature) == 0 && this.maxTokens == openAIChatModel$OpenAIRequest.maxTokens;
    }

    public final int getMaxTokens() {
        return this.maxTokens;
    }

    public final List<OpenAIChatModel$OpenAIMessage> getMessages() {
        return this.messages;
    }

    public final String getModel() {
        return this.model;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxTokens) + vi0.m5684c(this.temperature, (this.messages.hashCode() + (this.model.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        return "OpenAIRequest(model=" + this.model + ", messages=" + this.messages + ", temperature=" + this.temperature + ", maxTokens=" + this.maxTokens + ")";
    }
}
