package io.ktor.util;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6564;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4218 implements Map.Entry, InterfaceC6564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f12706;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f12707;

    public C4218(Object obj, Object obj2) {
        this.f12707 = obj;
        this.f12706 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC4395.m8907(entry.getKey(), this.f12707) && AbstractC4395.m8907(entry.getValue(), this.f12706)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12707;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12706;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12707;
        obj.getClass();
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f12706;
        obj2.getClass();
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12706 = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12707);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f12706);
        return sb.toString();
    }
}
