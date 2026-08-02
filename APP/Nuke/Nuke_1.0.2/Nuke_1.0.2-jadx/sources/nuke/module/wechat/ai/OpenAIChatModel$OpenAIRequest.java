package nuke.module.wechat.ai;

import defpackage.fp2;
import defpackage.t11;
import defpackage.vi0;
import defpackage.z41;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIRequest {

    @fp2("max_tokens")
    private final int maxTokens;
    private final List<OpenAIChatModel$OpenAIMessage> messages;
    private final String model;
    private final float temperature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OpenAIChatModel$OpenAIRequest(String str, List<OpenAIChatModel$OpenAIMessage> list, float f, int i) {
        str.getClass();
        list.getClass();
        this.model = str;
        this.messages = list;
        this.temperature = f;
        this.maxTokens = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: nuke.module.wechat.ai.OpenAIChatModel$OpenAIRequest */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIMessage> component2() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float component3() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component4() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpenAIChatModel$OpenAIRequest copy(String str, List<OpenAIChatModel$OpenAIMessage> list, float f, int i) {
        str.getClass();
        list.getClass();
        return new OpenAIChatModel$OpenAIRequest(str, list, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIRequest)) {
            return false;
        }
        OpenAIChatModel$OpenAIRequest openAIChatModel$OpenAIRequest = (OpenAIChatModel$OpenAIRequest) obj;
        return t11.l(this.model, openAIChatModel$OpenAIRequest.model) && t11.l(this.messages, openAIChatModel$OpenAIRequest.messages) && Float.compare(this.temperature, openAIChatModel$OpenAIRequest.temperature) == 0 && this.maxTokens == openAIChatModel$OpenAIRequest.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMaxTokens() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<OpenAIChatModel$OpenAIMessage> getMessages() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getTemperature() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.maxTokens) + vi0.c(this.temperature, (this.messages.hashCode() + (this.model.hashCode() * 31)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "OpenAIRequest(model=" + this.model + ", messages=" + this.messages + ", temperature=" + this.temperature + ", maxTokens=" + this.maxTokens + ")";
    }
}
