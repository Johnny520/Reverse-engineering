package nuke.module.wechat.p002ai;

import p000.c50;
import p000.fp2;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIChoice {

    @fp2("finish_reason")
    private final String finishReason;
    private final OpenAIChatModel$OpenAIResponseMessage message;

    public /* synthetic */ OpenAIChatModel$OpenAIChoice(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : openAIChatModel$OpenAIResponseMessage, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ OpenAIChatModel$OpenAIChoice copy$default(OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice, OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            openAIChatModel$OpenAIResponseMessage = openAIChatModel$OpenAIChoice.message;
        }
        if ((i & 2) != 0) {
            str = openAIChatModel$OpenAIChoice.finishReason;
        }
        return openAIChatModel$OpenAIChoice.copy(openAIChatModel$OpenAIResponseMessage, str);
    }

    public final OpenAIChatModel$OpenAIResponseMessage component1() {
        return this.message;
    }

    public final String component2() {
        return this.finishReason;
    }

    public final OpenAIChatModel$OpenAIChoice copy(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str) {
        return new OpenAIChatModel$OpenAIChoice(openAIChatModel$OpenAIResponseMessage, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIChoice)) {
            return false;
        }
        OpenAIChatModel$OpenAIChoice openAIChatModel$OpenAIChoice = (OpenAIChatModel$OpenAIChoice) obj;
        return t11.m5086l(this.message, openAIChatModel$OpenAIChoice.message) && t11.m5086l(this.finishReason, openAIChatModel$OpenAIChoice.finishReason);
    }

    public final String getFinishReason() {
        return this.finishReason;
    }

    public final OpenAIChatModel$OpenAIResponseMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage = this.message;
        int iHashCode = (openAIChatModel$OpenAIResponseMessage == null ? 0 : openAIChatModel$OpenAIResponseMessage.hashCode()) * 31;
        String str = this.finishReason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OpenAIChoice(message=" + this.message + ", finishReason=" + this.finishReason + ")";
    }

    public OpenAIChatModel$OpenAIChoice(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str) {
        this.message = openAIChatModel$OpenAIResponseMessage;
        this.finishReason = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIChoice() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
