package nuke.module.wechat.p002ai;

import p000.t11;
import p000.vi0;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
final class OpenAIChatModel$OpenAIMessage {
    private final String content;
    private final String role;

    public OpenAIChatModel$OpenAIMessage(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.role = str;
        this.content = str2;
    }

    public static /* synthetic */ OpenAIChatModel$OpenAIMessage copy$default(OpenAIChatModel$OpenAIMessage openAIChatModel$OpenAIMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAIChatModel$OpenAIMessage.role;
        }
        if ((i & 2) != 0) {
            str2 = openAIChatModel$OpenAIMessage.content;
        }
        return openAIChatModel$OpenAIMessage.copy(str, str2);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.content;
    }

    public final OpenAIChatModel$OpenAIMessage copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new OpenAIChatModel$OpenAIMessage(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAIChatModel$OpenAIMessage)) {
            return false;
        }
        OpenAIChatModel$OpenAIMessage openAIChatModel$OpenAIMessage = (OpenAIChatModel$OpenAIMessage) obj;
        return t11.m5086l(this.role, openAIChatModel$OpenAIMessage.role) && t11.m5086l(this.content, openAIChatModel$OpenAIMessage.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.role.hashCode() * 31);
    }

    public String toString() {
        return vi0.m5692k("OpenAIMessage(role=", this.role, ", content=", this.content, ")");
    }
}
