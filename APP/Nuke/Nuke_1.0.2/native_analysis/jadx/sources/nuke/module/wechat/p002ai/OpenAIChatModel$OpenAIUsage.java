package nuke.module.wechat.p002ai;

import p000.c50;
import p000.fp2;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIUsage {

    @fp2("completion_tokens")
    private final Integer completionTokens;

    @fp2("prompt_tokens")
    private final Integer promptTokens;

    @fp2("total_tokens")
    private final Integer totalTokens;

    public /* synthetic */ OpenAIChatModel$OpenAIUsage(Integer num, Integer num2, Integer num3, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }

    public static /* synthetic */ OpenAIChatModel$OpenAIUsage copy$default(OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = openAIChatModel$OpenAIUsage.promptTokens;
        }
        if ((i & 2) != 0) {
            num2 = openAIChatModel$OpenAIUsage.completionTokens;
        }
        if ((i & 4) != 0) {
            num3 = openAIChatModel$OpenAIUsage.totalTokens;
        }
        return openAIChatModel$OpenAIUsage.copy(num, num2, num3);
    }

    public final Integer component1() {
        return this.promptTokens;
    }

    public final Integer component2() {
        return this.completionTokens;
    }

    public final Integer component3() {
        return this.totalTokens;
    }

    public final OpenAIChatModel$OpenAIUsage copy(Integer num, Integer num2, Integer num3) {
        return new OpenAIChatModel$OpenAIUsage(num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIUsage)) {
            return false;
        }
        OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage = (OpenAIChatModel$OpenAIUsage) obj;
        return t11.m5086l(this.promptTokens, openAIChatModel$OpenAIUsage.promptTokens) && t11.m5086l(this.completionTokens, openAIChatModel$OpenAIUsage.completionTokens) && t11.m5086l(this.totalTokens, openAIChatModel$OpenAIUsage.totalTokens);
    }

    public final Integer getCompletionTokens() {
        return this.completionTokens;
    }

    public final Integer getPromptTokens() {
        return this.promptTokens;
    }

    public final Integer getTotalTokens() {
        return this.totalTokens;
    }

    public int hashCode() {
        Integer num = this.promptTokens;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.completionTokens;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalTokens;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "OpenAIUsage(promptTokens=" + this.promptTokens + ", completionTokens=" + this.completionTokens + ", totalTokens=" + this.totalTokens + ")";
    }

    public OpenAIChatModel$OpenAIUsage(Integer num, Integer num2, Integer num3) {
        this.promptTokens = num;
        this.completionTokens = num2;
        this.totalTokens = num3;
    }

    public OpenAIChatModel$OpenAIUsage() {
        this(null, null, null, 7, null);
    }
}
