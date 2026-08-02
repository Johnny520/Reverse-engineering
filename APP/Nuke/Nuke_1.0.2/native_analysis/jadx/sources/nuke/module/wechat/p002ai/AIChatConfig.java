package nuke.module.wechat.p002ai;

import java.util.Set;
import p000.AbstractC0570p7;
import p000.C0074c0;
import p000.C0090cg;
import p000.C0149e0;
import p000.EnumC0075c1;
import p000.InterfaceC0863wx;
import p000.c50;
import p000.c80;
import p000.dp2;
import p000.dv2;
import p000.fe0;
import p000.hk1;
import p000.i91;
import p000.j71;
import p000.nv2;
import p000.pv2;
import p000.t11;
import p000.vi0;
import p000.w41;
import p000.yo2;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatConfig {
    private static final j71[] $childSerializers;
    public static final int $stable = 8;
    public static final C0149e0 Companion = new C0149e0();
    public static final String DefaultBaseUrl = "https://api.openai.com/v1";
    public static final int DefaultContextRounds = 6;
    public static final int DefaultMaxTokens = 512;
    public static final float DefaultTemperature = 0.7f;
    public static final int MaxContextRounds = 20;
    public static final int MaxOutputTokens = 32768;
    public static final long MaxReplyDelayMs = 60000;
    private final String apiKey;
    private final String baseUrl;
    private final int contextRounds;
    private final EnumC0075c1 listMode;
    private final int maxTokens;
    private final String model;
    private final long replyDelayMs;
    private final String systemPrompt;
    private final Set<String> targetIds;
    private final float temperature;

    static {
        C0074c0 c0074c0 = new C0074c0(0);
        i91 i91Var = i91.f4497h;
        $childSerializers = new j71[]{null, null, null, null, null, null, null, null, AbstractC0570p7.m3746B(i91Var, c0074c0), AbstractC0570p7.m3746B(i91Var, new C0074c0(1))};
    }

    public /* synthetic */ AIChatConfig(int i, String str, String str2, String str3, String str4, float f, int i2, int i3, long j, EnumC0075c1 enumC0075c1, Set set, dp2 dp2Var) {
        this.baseUrl = (i & 1) == 0 ? DefaultBaseUrl : str;
        if ((i & 2) == 0) {
            this.apiKey = "";
        } else {
            this.apiKey = str2;
        }
        if ((i & 4) == 0) {
            this.model = "";
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.systemPrompt = "";
        } else {
            this.systemPrompt = str4;
        }
        if ((i & 16) == 0) {
            this.temperature = 0.7f;
        } else {
            this.temperature = f;
        }
        if ((i & 32) == 0) {
            this.maxTokens = DefaultMaxTokens;
        } else {
            this.maxTokens = i2;
        }
        if ((i & 64) == 0) {
            this.contextRounds = 6;
        } else {
            this.contextRounds = i3;
        }
        if ((i & 128) == 0) {
            this.replyDelayMs = 0L;
        } else {
            this.replyDelayMs = j;
        }
        if ((i & 256) == 0) {
            this.listMode = EnumC0075c1.f1101j;
        } else {
            this.listMode = enumC0075c1;
        }
        if ((i & DefaultMaxTokens) == 0) {
            this.targetIds = fe0.f2918h;
        } else {
            this.targetIds = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ w41 _childSerializers$_anonymous_() {
        return EnumC0075c1.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ w41 _childSerializers$_anonymous_$0() {
        nv2 nv2Var = nv2.f7346a;
        return new C0090cg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIChatConfig copy$default(AIChatConfig aIChatConfig, String str, String str2, String str3, String str4, float f, int i, int i2, long j, EnumC0075c1 enumC0075c1, Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = aIChatConfig.baseUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = aIChatConfig.apiKey;
        }
        if ((i3 & 4) != 0) {
            str3 = aIChatConfig.model;
        }
        if ((i3 & 8) != 0) {
            str4 = aIChatConfig.systemPrompt;
        }
        if ((i3 & 16) != 0) {
            f = aIChatConfig.temperature;
        }
        if ((i3 & 32) != 0) {
            i = aIChatConfig.maxTokens;
        }
        if ((i3 & 64) != 0) {
            i2 = aIChatConfig.contextRounds;
        }
        if ((i3 & 128) != 0) {
            j = aIChatConfig.replyDelayMs;
        }
        if ((i3 & 256) != 0) {
            enumC0075c1 = aIChatConfig.listMode;
        }
        if ((i3 & DefaultMaxTokens) != 0) {
            set = aIChatConfig.targetIds;
        }
        long j2 = j;
        int i4 = i;
        int i5 = i2;
        String str5 = str4;
        float f2 = f;
        String str6 = str3;
        return aIChatConfig.copy(str, str2, str6, str5, f2, i4, i5, j2, enumC0075c1, set);
    }

    public static final void write$Self$app(AIChatConfig aIChatConfig, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        j71[] j71VarArr = $childSerializers;
        if (interfaceC0863wx.mo1179d(yo2Var) || !t11.m5086l(aIChatConfig.baseUrl, DefaultBaseUrl)) {
            ((dv2) interfaceC0863wx).m1199x(yo2Var, 0, aIChatConfig.baseUrl);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || !t11.m5086l(aIChatConfig.apiKey, "")) {
            ((dv2) interfaceC0863wx).m1199x(yo2Var, 1, aIChatConfig.apiKey);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || !t11.m5086l(aIChatConfig.model, "")) {
            ((dv2) interfaceC0863wx).m1199x(yo2Var, 2, aIChatConfig.model);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || !t11.m5086l(aIChatConfig.systemPrompt, "")) {
            ((dv2) interfaceC0863wx).m1199x(yo2Var, 3, aIChatConfig.systemPrompt);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || Float.compare(aIChatConfig.temperature, 0.7f) != 0) {
            float f = aIChatConfig.temperature;
            dv2 dv2Var = (dv2) interfaceC0863wx;
            dv2Var.m1194s(yo2Var, 4);
            dv2Var.mo1188m(f);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || aIChatConfig.maxTokens != 512) {
            ((dv2) interfaceC0863wx).m1196u(5, aIChatConfig.maxTokens, yo2Var);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || aIChatConfig.contextRounds != 6) {
            ((dv2) interfaceC0863wx).m1196u(6, aIChatConfig.contextRounds, yo2Var);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || aIChatConfig.replyDelayMs != 0) {
            ((dv2) interfaceC0863wx).m1197v(yo2Var, 7, aIChatConfig.replyDelayMs);
        }
        if (interfaceC0863wx.mo1179d(yo2Var) || aIChatConfig.listMode != EnumC0075c1.f1101j) {
            ((dv2) interfaceC0863wx).m1198w(yo2Var, 8, (w41) j71VarArr[8].getValue(), aIChatConfig.listMode);
        }
        if (!interfaceC0863wx.mo1179d(yo2Var) && t11.m5086l(aIChatConfig.targetIds, fe0.f2918h)) {
            return;
        }
        ((dv2) interfaceC0863wx).m1198w(yo2Var, 9, (w41) j71VarArr[9].getValue(), aIChatConfig.targetIds);
    }

    public final boolean allowsTalker(String str) {
        str.getClass();
        int iOrdinal = this.listMode.ordinal();
        if (iOrdinal == 0) {
            return !this.targetIds.contains(str);
        }
        if (iOrdinal == 1) {
            return this.targetIds.contains(str);
        }
        c80.m675s();
        return false;
    }

    public final String component1() {
        return this.baseUrl;
    }

    public final Set<String> component10() {
        return this.targetIds;
    }

    public final String component2() {
        return this.apiKey;
    }

    public final String component3() {
        return this.model;
    }

    public final String component4() {
        return this.systemPrompt;
    }

    public final float component5() {
        return this.temperature;
    }

    public final int component6() {
        return this.maxTokens;
    }

    public final int component7() {
        return this.contextRounds;
    }

    public final long component8() {
        return this.replyDelayMs;
    }

    public final EnumC0075c1 component9() {
        return this.listMode;
    }

    public final AIChatConfig copy(String str, String str2, String str3, String str4, float f, int i, int i2, long j, EnumC0075c1 enumC0075c1, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        enumC0075c1.getClass();
        set.getClass();
        return new AIChatConfig(str, str2, str3, str4, f, i, i2, j, enumC0075c1, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatConfig)) {
            return false;
        }
        AIChatConfig aIChatConfig = (AIChatConfig) obj;
        return t11.m5086l(this.baseUrl, aIChatConfig.baseUrl) && t11.m5086l(this.apiKey, aIChatConfig.apiKey) && t11.m5086l(this.model, aIChatConfig.model) && t11.m5086l(this.systemPrompt, aIChatConfig.systemPrompt) && Float.compare(this.temperature, aIChatConfig.temperature) == 0 && this.maxTokens == aIChatConfig.maxTokens && this.contextRounds == aIChatConfig.contextRounds && this.replyDelayMs == aIChatConfig.replyDelayMs && this.listMode == aIChatConfig.listMode && t11.m5086l(this.targetIds, aIChatConfig.targetIds);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final int getContextRounds() {
        return this.contextRounds;
    }

    public final EnumC0075c1 getListMode() {
        return this.listMode;
    }

    public final int getMaxTokens() {
        return this.maxTokens;
    }

    public final String getModel() {
        return this.model;
    }

    public final long getReplyDelayMs() {
        return this.replyDelayMs;
    }

    public final String getSystemPrompt() {
        return this.systemPrompt;
    }

    public final Set<String> getTargetIds() {
        return this.targetIds;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public int hashCode() {
        return this.targetIds.hashCode() + ((this.listMode.hashCode() + hk1.m2204c(vi0.m5685d(this.contextRounds, vi0.m5685d(this.maxTokens, vi0.m5684c(this.temperature, hk1.m2207f(this.systemPrompt, hk1.m2207f(this.model, hk1.m2207f(this.apiKey, this.baseUrl.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.replyDelayMs)) * 31);
    }

    public final boolean isReady() {
        return (pv2.m4006s0(this.baseUrl) || pv2.m4006s0(this.apiKey) || pv2.m4006s0(this.model)) ? false : true;
    }

    public String toString() {
        String str = this.baseUrl;
        String str2 = this.apiKey;
        String str3 = this.model;
        String str4 = this.systemPrompt;
        float f = this.temperature;
        int i = this.maxTokens;
        int i2 = this.contextRounds;
        long j = this.replyDelayMs;
        EnumC0075c1 enumC0075c1 = this.listMode;
        Set<String> set = this.targetIds;
        StringBuilder sbM5696o = vi0.m5696o("AIChatConfig(baseUrl=", str, ", apiKey=", str2, ", model=");
        hk1.m2216o(sbM5696o, str3, ", systemPrompt=", str4, ", temperature=");
        sbM5696o.append(f);
        sbM5696o.append(", maxTokens=");
        sbM5696o.append(i);
        sbM5696o.append(", contextRounds=");
        sbM5696o.append(i2);
        sbM5696o.append(", replyDelayMs=");
        sbM5696o.append(j);
        sbM5696o.append(", listMode=");
        sbM5696o.append(enumC0075c1);
        sbM5696o.append(", targetIds=");
        sbM5696o.append(set);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    public AIChatConfig() {
        this((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (EnumC0075c1) null, (Set) null, 1023, (c50) null);
    }

    public AIChatConfig(String str, String str2, String str3, String str4, float f, int i, int i2, long j, EnumC0075c1 enumC0075c1, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        enumC0075c1.getClass();
        set.getClass();
        this.baseUrl = str;
        this.apiKey = str2;
        this.model = str3;
        this.systemPrompt = str4;
        this.temperature = f;
        this.maxTokens = i;
        this.contextRounds = i2;
        this.replyDelayMs = j;
        this.listMode = enumC0075c1;
        this.targetIds = set;
    }

    public /* synthetic */ AIChatConfig(String str, String str2, String str3, String str4, float f, int i, int i2, long j, EnumC0075c1 enumC0075c1, Set set, int i3, c50 c50Var) {
        this((i3 & 1) != 0 ? DefaultBaseUrl : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0.7f : f, (i3 & 32) != 0 ? 512 : i, (i3 & 64) != 0 ? 6 : i2, (i3 & 128) != 0 ? 0L : j, (i3 & 256) != 0 ? EnumC0075c1.f1101j : enumC0075c1, (i3 & DefaultMaxTokens) != 0 ? fe0.f2918h : set);
    }
}
