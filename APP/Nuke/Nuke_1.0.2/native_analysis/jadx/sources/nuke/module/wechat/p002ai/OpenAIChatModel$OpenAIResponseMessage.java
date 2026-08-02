package nuke.module.wechat.p002ai;

import p000.c50;
import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIResponseMessage {
    private final String content;

    public /* synthetic */ OpenAIChatModel$OpenAIResponseMessage(String str, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ OpenAIChatModel$OpenAIResponseMessage copy$default(OpenAIChatModel$OpenAIResponseMessage openAIChatModel$OpenAIResponseMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIResponseMessage.content;
        }
        return openAIChatModel$OpenAIResponseMessage.copy(str);
    }

    public final String component1() {
        return this.content;
    }

    public final OpenAIChatModel$OpenAIResponseMessage copy(String str) {
        return new OpenAIChatModel$OpenAIResponseMessage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenAIChatModel$OpenAIResponseMessage) && t11.m5086l(this.content, ((OpenAIChatModel$OpenAIResponseMessage) obj).content);
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return vi0.m5691j("OpenAIResponseMessage(content=", this.content, ")");
    }

    public OpenAIChatModel$OpenAIResponseMessage(String str) {
        this.content = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenAIChatModel$OpenAIResponseMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
