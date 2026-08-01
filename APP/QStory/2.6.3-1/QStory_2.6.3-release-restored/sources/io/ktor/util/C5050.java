package io.ktor.util;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p070.InterfaceC7393;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5050 implements Map.Entry, InterfaceC7393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f13051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f13052;

    public C5050(Object obj, Object obj2) {
        this.f13052 = obj;
        this.f13051 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC5227.m9466(entry.getKey(), this.f13052) && AbstractC5227.m9466(entry.getValue(), this.f13051)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13052;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13051;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f13052;
        obj.getClass();
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f13051;
        obj2.getClass();
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13051 = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13052);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f13051);
        return sb.toString();
    }
}
