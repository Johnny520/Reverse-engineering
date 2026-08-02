package nuke.module.wechat.p002ai;

import java.util.List;
import p000.be0;
import p000.c50;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIModelsResponse {
    private final List<OpenAIChatModel$OpenAIModelInfo> data;

    public /* synthetic */ OpenAIChatModel$OpenAIModelsResponse(List list, int i, c50 c50Var) {
        this((i & 1) != 0 ? be0.f819h : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenAIChatModel$OpenAIModelsResponse copy$default(OpenAIChatModel$OpenAIModelsResponse openAIChatModel$OpenAIModelsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = openAIChatModel$OpenAIModelsResponse.data;
        }
        return openAIChatModel$OpenAIModelsResponse.copy(list);
    }

    public final List<OpenAIChatModel$OpenAIModelInfo> component1() {
        return this.data;
    }

    public final OpenAIChatModel$OpenAIModelsResponse copy(List<OpenAIChatModel$OpenAIModelInfo> list) {
        list.getClass();
        return new OpenAIChatModel$OpenAIModelsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenAIChatModel$OpenAIModelsResponse) && t11.m5086l(this.data, ((OpenAIChatModel$OpenAIModelsResponse) obj).data);
    }

    public final List<OpenAIChatModel$OpenAIModelInfo> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "OpenAIModelsResponse(data=" + this.data + ")";
    }

    public OpenAIChatModel$OpenAIModelsResponse(List<OpenAIChatModel$OpenAIModelInfo> list) {
        list.getClass();
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIModelsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
