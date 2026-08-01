package io.ktor.websocket;

import androidx.activity.AbstractC0900;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f13142;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5095(CloseReason$Codes closeReason$Codes, String str) {
        this(str, closeReason$Codes.getCode());
        closeReason$Codes.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5095)) {
            return false;
        }
        C5095 c5095 = (C5095) obj;
        return this.f13142 == c5095.f13142 && AbstractC5227.m9466(this.f13141, c5095.f13141);
    }

    public final int hashCode() {
        return this.f13141.hashCode() + (Short.hashCode(this.f13142) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        CloseReason$Codes.Companion.getClass();
        Map map = CloseReason$Codes.byCodeMap;
        short s = this.f13142;
        Object objValueOf = (CloseReason$Codes) map.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return AbstractC0900.m708(sb, this.f13141, ')');
    }

    public C5095(String str, short s) {
        str.getClass();
        this.f13142 = s;
        this.f13141 = str;
    }
}
