package nuke.module.wechat.p002ai;

import java.util.List;
import p000.be0;
import p000.c50;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIResponse {
    private final List<OpenAIChatModel$OpenAIChoice> choices;
    private final String model;
    private final OpenAIChatModel$OpenAIUsage usage;

    public /* synthetic */ OpenAIChatModel$OpenAIResponse(String str, List list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? be0.f819h : list, (i & 4) != 0 ? null : openAIChatModel$OpenAIUsage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenAIChatModel$OpenAIResponse copy$default(OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse, String str, List list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIResponse.model;
        }
        if ((i & 2) != 0) {
            list = openAIChatModel$OpenAIResponse.choices;
        }
        if ((i & 4) != 0) {
            openAIChatModel$OpenAIUsage = openAIChatModel$OpenAIResponse.usage;
        }
        return openAIChatModel$OpenAIResponse.copy(str, list, openAIChatModel$OpenAIUsage);
    }

    public final String component1() {
        return this.model;
    }

    public final List<OpenAIChatModel$OpenAIChoice> component2() {
        return this.choices;
    }

    public final OpenAIChatModel$OpenAIUsage component3() {
        return this.usage;
    }

    public final OpenAIChatModel$OpenAIResponse copy(String str, List<OpenAIChatModel$OpenAIChoice> list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage) {
        list.getClass();
        return new OpenAIChatModel$OpenAIResponse(str, list, openAIChatModel$OpenAIUsage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIResponse)) {
            return false;
        }
        OpenAIChatModel$OpenAIResponse openAIChatModel$OpenAIResponse = (OpenAIChatModel$OpenAIResponse) obj;
        return t11.m5086l(this.model, openAIChatModel$OpenAIResponse.model) && t11.m5086l(this.choices, openAIChatModel$OpenAIResponse.choices) && t11.m5086l(this.usage, openAIChatModel$OpenAIResponse.usage);
    }

    public final List<OpenAIChatModel$OpenAIChoice> getChoices() {
        return this.choices;
    }

    public final String getModel() {
        return this.model;
    }

    public final OpenAIChatModel$OpenAIUsage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        String str = this.model;
        int iHashCode = (this.choices.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage = this.usage;
        return iHashCode + (openAIChatModel$OpenAIUsage != null ? openAIChatModel$OpenAIUsage.hashCode() : 0);
    }

    public String toString() {
        return "OpenAIResponse(model=" + this.model + ", choices=" + this.choices + ", usage=" + this.usage + ")";
    }

    public OpenAIChatModel$OpenAIResponse(String str, List<OpenAIChatModel$OpenAIChoice> list, OpenAIChatModel$OpenAIUsage openAIChatModel$OpenAIUsage) {
        list.getClass();
        this.model = str;
        this.choices = list;
        this.usage = openAIChatModel$OpenAIUsage;
    }

    public OpenAIChatModel$OpenAIResponse() {
        this(null, null, null, 7, null);
    }
}
