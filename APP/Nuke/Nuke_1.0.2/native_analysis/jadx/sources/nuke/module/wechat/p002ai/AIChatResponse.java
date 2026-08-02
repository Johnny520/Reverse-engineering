package nuke.module.wechat.p002ai;

import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatResponse {
    public static final int $stable = 0;
    private final Integer completionTokens;
    private final String content;
    private final String finishReason;
    private final String model;
    private final Integer promptTokens;
    private final Integer totalTokens;

    public AIChatResponse(String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
        str.getClass();
        this.content = str;
        this.model = str2;
        this.finishReason = str3;
        this.promptTokens = num;
        this.completionTokens = num2;
        this.totalTokens = num3;
    }

    public static /* synthetic */ AIChatResponse copy$default(AIChatResponse aIChatResponse, String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIChatResponse.content;
        }
        if ((i & 2) != 0) {
            str2 = aIChatResponse.model;
        }
        if ((i & 4) != 0) {
            str3 = aIChatResponse.finishReason;
        }
        if ((i & 8) != 0) {
            num = aIChatResponse.promptTokens;
        }
        if ((i & 16) != 0) {
            num2 = aIChatResponse.completionTokens;
        }
        if ((i & 32) != 0) {
            num3 = aIChatResponse.totalTokens;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return aIChatResponse.copy(str, str2, str3, num, num4, num5);
    }

    public final String component1() {
        return this.content;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.finishReason;
    }

    public final Integer component4() {
        return this.promptTokens;
    }

    public final Integer component5() {
        return this.completionTokens;
    }

    public final Integer component6() {
        return this.totalTokens;
    }

    public final AIChatResponse copy(String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
        str.getClass();
        return new AIChatResponse(str, str2, str3, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatResponse)) {
            return false;
        }
        AIChatResponse aIChatResponse = (AIChatResponse) obj;
        return t11.m5086l(this.content, aIChatResponse.content) && t11.m5086l(this.model, aIChatResponse.model) && t11.m5086l(this.finishReason, aIChatResponse.finishReason) && t11.m5086l(this.promptTokens, aIChatResponse.promptTokens) && t11.m5086l(this.completionTokens, aIChatResponse.completionTokens) && t11.m5086l(this.totalTokens, aIChatResponse.totalTokens);
    }

    public final Integer getCompletionTokens() {
        return this.completionTokens;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getFinishReason() {
        return this.finishReason;
    }

    public final String getModel() {
        return this.model;
    }

    public final Integer getPromptTokens() {
        return this.promptTokens;
    }

    public final Integer getTotalTokens() {
        return this.totalTokens;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        String str = this.model;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.finishReason;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.promptTokens;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.completionTokens;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalTokens;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        String str = this.content;
        String str2 = this.model;
        String str3 = this.finishReason;
        Integer num = this.promptTokens;
        Integer num2 = this.completionTokens;
        Integer num3 = this.totalTokens;
        StringBuilder sbM5696o = vi0.m5696o("AIChatResponse(content=", str, ", model=", str2, ", finishReason=");
        sbM5696o.append(str3);
        sbM5696o.append(", promptTokens=");
        sbM5696o.append(num);
        sbM5696o.append(", completionTokens=");
        sbM5696o.append(num2);
        sbM5696o.append(", totalTokens=");
        sbM5696o.append(num3);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
