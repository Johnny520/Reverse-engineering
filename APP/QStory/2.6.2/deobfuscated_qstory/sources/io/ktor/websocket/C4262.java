package io.ktor.websocket;

import androidx.activity.AbstractC0053;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f12793;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4262(CloseReason$Codes closeReason$Codes, String str) {
        this(str, closeReason$Codes.getCode());
        closeReason$Codes.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4262)) {
            return false;
        }
        C4262 c4262 = (C4262) obj;
        return this.f12793 == c4262.f12793 && AbstractC4394.m8917(this.f12792, c4262.f12792);
    }

    public final int hashCode() {
        return this.f12792.hashCode() + (Short.hashCode(this.f12793) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        CloseReason$Codes.Companion.getClass();
        Map map = CloseReason$Codes.byCodeMap;
        short s = this.f12793;
        Object objValueOf = (CloseReason$Codes) map.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return AbstractC0053.m155(sb, this.f12792, ')');
    }

    public C4262(String str, short s) {
        str.getClass();
        this.f12793 = s;
        this.f12792 = str;
    }
}
