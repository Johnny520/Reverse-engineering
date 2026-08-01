package io.ktor.websocket;

import androidx.activity.AbstractC0053;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4263 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f12797;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4263(CloseReason$Codes closeReason$Codes, String str) {
        this(str, closeReason$Codes.getCode());
        closeReason$Codes.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4263)) {
            return false;
        }
        C4263 c4263 = (C4263) obj;
        return this.f12797 == c4263.f12797 && AbstractC4395.m8907(this.f12796, c4263.f12796);
    }

    public final int hashCode() {
        return this.f12796.hashCode() + (Short.hashCode(this.f12797) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        CloseReason$Codes.Companion.getClass();
        Map map = CloseReason$Codes.byCodeMap;
        short s = this.f12797;
        Object objValueOf = (CloseReason$Codes) map.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return AbstractC0053.m148(sb, this.f12796, ')');
    }

    public C4263(String str, short s) {
        str.getClass();
        this.f12797 = s;
        this.f12796 = str;
    }
}
