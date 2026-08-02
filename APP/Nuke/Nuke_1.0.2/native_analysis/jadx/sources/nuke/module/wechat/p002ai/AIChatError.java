package nuke.module.wechat.p002ai;

import p000.EnumC0002a1;
import p000.c50;
import p000.hk1;
import p000.t11;
import p000.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatError {
    public static final int $stable = 0;
    private final EnumC0002a1 code;
    private final Integer httpCode;
    private final String message;

    public AIChatError(EnumC0002a1 enumC0002a1, String str, Integer num) {
        enumC0002a1.getClass();
        str.getClass();
        this.code = enumC0002a1;
        this.message = str;
        this.httpCode = num;
    }

    public static /* synthetic */ AIChatError copy$default(AIChatError aIChatError, EnumC0002a1 enumC0002a1, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC0002a1 = aIChatError.code;
        }
        if ((i & 2) != 0) {
            str = aIChatError.message;
        }
        if ((i & 4) != 0) {
            num = aIChatError.httpCode;
        }
        return aIChatError.copy(enumC0002a1, str, num);
    }

    public final EnumC0002a1 component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Integer component3() {
        return this.httpCode;
    }

    public final AIChatError copy(EnumC0002a1 enumC0002a1, String str, Integer num) {
        enumC0002a1.getClass();
        str.getClass();
        return new AIChatError(enumC0002a1, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatError)) {
            return false;
        }
        AIChatError aIChatError = (AIChatError) obj;
        return this.code == aIChatError.code && t11.m5086l(this.message, aIChatError.message) && t11.m5086l(this.httpCode, aIChatError.httpCode);
    }

    public final EnumC0002a1 getCode() {
        return this.code;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iM2207f = hk1.m2207f(this.message, this.code.hashCode() * 31, 31);
        Integer num = this.httpCode;
        return iM2207f + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "AIChatError(code=" + this.code + ", message=" + this.message + ", httpCode=" + this.httpCode + ")";
    }

    public /* synthetic */ AIChatError(EnumC0002a1 enumC0002a1, String str, Integer num, int i, c50 c50Var) {
        this(enumC0002a1, str, (i & 4) != 0 ? null : num);
    }
}
