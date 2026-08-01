package io.ktor.util;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6563;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4217 implements Map.Entry, InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f12702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f12703;

    public C4217(Object obj, Object obj2) {
        this.f12703 = obj;
        this.f12702 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC4394.m8917(entry.getKey(), this.f12703) && AbstractC4394.m8917(entry.getValue(), this.f12702)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12703;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12702;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12703;
        obj.getClass();
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f12702;
        obj2.getClass();
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12702 = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12703);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f12702);
        return sb.toString();
    }
}
