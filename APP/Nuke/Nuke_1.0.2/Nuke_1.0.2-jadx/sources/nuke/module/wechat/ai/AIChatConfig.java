package nuke.module.wechat.ai;

import defpackage.c0;
import defpackage.c1;
import defpackage.c50;
import defpackage.c80;
import defpackage.cg;
import defpackage.dp2;
import defpackage.dv2;
import defpackage.e0;
import defpackage.fe0;
import defpackage.hk1;
import defpackage.i91;
import defpackage.j71;
import defpackage.nv2;
import defpackage.p7;
import defpackage.pv2;
import defpackage.t11;
import defpackage.vi0;
import defpackage.w41;
import defpackage.wx;
import defpackage.yo2;
import defpackage.z41;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatConfig {
    private static final j71[] $childSerializers;
    public static final int $stable = 8;
    public static final e0 Companion = new e0();
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
    private final c1 listMode;
    private final int maxTokens;
    private final String model;
    private final long replyDelayMs;
    private final String systemPrompt;
    private final Set<String> targetIds;
    private final float temperature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c0 c0Var = new c0(0);
        i91 i91Var = i91.h;
        $childSerializers = new j71[]{null, null, null, null, null, null, null, null, p7.B(i91Var, c0Var), p7.B(i91Var, new c0(1))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AIChatConfig(int i, String str, String str2, String str3, String str4, float f, int i2, int i3, long j, c1 c1Var, Set set, dp2 dp2Var) {
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
            this.listMode = c1.j;
        } else {
            this.listMode = c1Var;
        }
        if ((i & DefaultMaxTokens) == 0) {
            this.targetIds = fe0.h;
        } else {
            this.targetIds = set;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ w41 _childSerializers$_anonymous_() {
        return c1.Companion.serializer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ w41 _childSerializers$_anonymous_$0() {
        nv2 nv2Var = nv2.a;
        return new cg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: nuke.module.wechat.ai.AIChatConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIChatConfig copy$default(AIChatConfig aIChatConfig, String str, String str2, String str3, String str4, float f, int i, int i2, long j, c1 c1Var, Set set, int i3, Object obj) {
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
            c1Var = aIChatConfig.listMode;
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
        return aIChatConfig.copy(str, str2, str6, str5, f2, i4, i5, j2, c1Var, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void write$Self$app(AIChatConfig aIChatConfig, wx wxVar, yo2 yo2Var) {
        j71[] j71VarArr = $childSerializers;
        if (wxVar.d(yo2Var) || !t11.l(aIChatConfig.baseUrl, DefaultBaseUrl)) {
            ((dv2) wxVar).x(yo2Var, 0, aIChatConfig.baseUrl);
        }
        if (wxVar.d(yo2Var) || !t11.l(aIChatConfig.apiKey, "")) {
            ((dv2) wxVar).x(yo2Var, 1, aIChatConfig.apiKey);
        }
        if (wxVar.d(yo2Var) || !t11.l(aIChatConfig.model, "")) {
            ((dv2) wxVar).x(yo2Var, 2, aIChatConfig.model);
        }
        if (wxVar.d(yo2Var) || !t11.l(aIChatConfig.systemPrompt, "")) {
            ((dv2) wxVar).x(yo2Var, 3, aIChatConfig.systemPrompt);
        }
        if (wxVar.d(yo2Var) || Float.compare(aIChatConfig.temperature, 0.7f) != 0) {
            float f = aIChatConfig.temperature;
            dv2 dv2Var = (dv2) wxVar;
            dv2Var.s(yo2Var, 4);
            dv2Var.m(f);
        }
        if (wxVar.d(yo2Var) || aIChatConfig.maxTokens != 512) {
            ((dv2) wxVar).u(5, aIChatConfig.maxTokens, yo2Var);
        }
        if (wxVar.d(yo2Var) || aIChatConfig.contextRounds != 6) {
            ((dv2) wxVar).u(6, aIChatConfig.contextRounds, yo2Var);
        }
        if (wxVar.d(yo2Var) || aIChatConfig.replyDelayMs != 0) {
            ((dv2) wxVar).v(yo2Var, 7, aIChatConfig.replyDelayMs);
        }
        if (wxVar.d(yo2Var) || aIChatConfig.listMode != c1.j) {
            ((dv2) wxVar).w(yo2Var, 8, (w41) j71VarArr[8].getValue(), aIChatConfig.listMode);
        }
        if (!wxVar.d(yo2Var) && t11.l(aIChatConfig.targetIds, fe0.h)) {
            return;
        }
        ((dv2) wxVar).w(yo2Var, 9, (w41) j71VarArr[9].getValue(), aIChatConfig.targetIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean allowsTalker(String str) {
        str.getClass();
        int iOrdinal = this.listMode.ordinal();
        if (iOrdinal == 0) {
            return !this.targetIds.contains(str);
        }
        if (iOrdinal == 1) {
            return this.targetIds.contains(str);
        }
        c80.s();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component1() {
        return this.baseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> component10() {
        return this.targetIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.apiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component3() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component4() {
        return this.systemPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float component5() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component6() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component7() {
        return this.contextRounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long component8() {
        return this.replyDelayMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c1 component9() {
        return this.listMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AIChatConfig copy(String str, String str2, String str3, String str4, float f, int i, int i2, long j, c1 c1Var, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        c1Var.getClass();
        set.getClass();
        return new AIChatConfig(str, str2, str3, str4, f, i, i2, j, c1Var, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatConfig)) {
            return false;
        }
        AIChatConfig aIChatConfig = (AIChatConfig) obj;
        return t11.l(this.baseUrl, aIChatConfig.baseUrl) && t11.l(this.apiKey, aIChatConfig.apiKey) && t11.l(this.model, aIChatConfig.model) && t11.l(this.systemPrompt, aIChatConfig.systemPrompt) && Float.compare(this.temperature, aIChatConfig.temperature) == 0 && this.maxTokens == aIChatConfig.maxTokens && this.contextRounds == aIChatConfig.contextRounds && this.replyDelayMs == aIChatConfig.replyDelayMs && this.listMode == aIChatConfig.listMode && t11.l(this.targetIds, aIChatConfig.targetIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getContextRounds() {
        return this.contextRounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c1 getListMode() {
        return this.listMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMaxTokens() {
        return this.maxTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getReplyDelayMs() {
        return this.replyDelayMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSystemPrompt() {
        return this.systemPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> getTargetIds() {
        return this.targetIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getTemperature() {
        return this.temperature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.targetIds.hashCode() + ((this.listMode.hashCode() + hk1.c(vi0.d(this.contextRounds, vi0.d(this.maxTokens, vi0.c(this.temperature, hk1.f(this.systemPrompt, hk1.f(this.model, hk1.f(this.apiKey, this.baseUrl.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.replyDelayMs)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isReady() {
        return (pv2.s0(this.baseUrl) || pv2.s0(this.apiKey) || pv2.s0(this.model)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.baseUrl;
        String str2 = this.apiKey;
        String str3 = this.model;
        String str4 = this.systemPrompt;
        float f = this.temperature;
        int i = this.maxTokens;
        int i2 = this.contextRounds;
        long j = this.replyDelayMs;
        c1 c1Var = this.listMode;
        Set<String> set = this.targetIds;
        StringBuilder sbO = vi0.o("AIChatConfig(baseUrl=", str, ", apiKey=", str2, ", model=");
        hk1.o(sbO, str3, ", systemPrompt=", str4, ", temperature=");
        sbO.append(f);
        sbO.append(", maxTokens=");
        sbO.append(i);
        sbO.append(", contextRounds=");
        sbO.append(i2);
        sbO.append(", replyDelayMs=");
        sbO.append(j);
        sbO.append(", listMode=");
        sbO.append(c1Var);
        sbO.append(", targetIds=");
        sbO.append(set);
        sbO.append(")");
        return sbO.toString();
    }

    public AIChatConfig() {
        this((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0L, (c1) null, (Set) null, 1023, (c50) null);
    }

    public AIChatConfig(String str, String str2, String str3, String str4, float f, int i, int i2, long j, c1 c1Var, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        c1Var.getClass();
        set.getClass();
        this.baseUrl = str;
        this.apiKey = str2;
        this.model = str3;
        this.systemPrompt = str4;
        this.temperature = f;
        this.maxTokens = i;
        this.contextRounds = i2;
        this.replyDelayMs = j;
        this.listMode = c1Var;
        this.targetIds = set;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] (LINE:119) nuke.module.wechat.ai.AIChatConfig.DefaultBaseUrl java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.7f float) : (r6v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (512 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r8v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:c1:?: TERNARY null = ((wrap:int:0x0030: ARITH (r13v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:c1:0x0034: SGET  A[WRAPPED] (LINE:121) c1.j c1) : (r11v0 c1))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0036: ARITH (r13v0 int) & (wrap:??:SGET  A[WRAPPED] nuke.module.wechat.ai.AIChatConfig.DefaultMaxTokens int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Set:0x0039: SGET  A[WRAPPED] (LINE:122) fe0.h fe0) : (r12v0 java.util.Set))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, int, int, long, c1, java.util.Set<java.lang.String>):void (m)] (LINE:123) call: nuke.module.wechat.ai.AIChatConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, int, int, long, c1, java.util.Set):void type: THIS */
    public /* synthetic */ AIChatConfig(String str, String str2, String str3, String str4, float f, int i, int i2, long j, c1 c1Var, Set set, int i3, c50 c50Var) {
        this((i3 & 1) != 0 ? DefaultBaseUrl : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0.7f : f, (i3 & 32) != 0 ? 512 : i, (i3 & 64) != 0 ? 6 : i2, (i3 & 128) != 0 ? 0L : j, (i3 & 256) != 0 ? c1.j : c1Var, (i3 & DefaultMaxTokens) != 0 ? fe0.h : set);
    }
}
