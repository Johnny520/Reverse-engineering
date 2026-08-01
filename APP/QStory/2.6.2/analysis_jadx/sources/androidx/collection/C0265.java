package androidx.collection;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p054.InterfaceC6566;
import p236.C8102;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0265 implements Map.Entry, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f955;

    public C0265(C8102 c8102) {
        this.f955 = 2;
        this.f953 = c8102.f22390;
        this.f954 = c8102.f22389;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        int i = this.f955;
        Object obj2 = this.f953;
        switch (i) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC4394.m8917(entry.getKey(), obj2) && AbstractC4394.m8917(entry.getValue(), getValue());
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return AbstractC4394.m8917(entry2.getKey(), (String) obj2) && AbstractC4394.m8917(entry2.getValue(), (List) this.f954);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.f955;
        Object obj = this.f953;
        switch (i) {
            case 0:
            case 1:
                return obj;
            default:
                return (String) obj;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        int i = this.f955;
        Object obj = this.f954;
        switch (i) {
            case 0:
            case 1:
                return obj;
            default:
                return (List) obj;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i = this.f955;
        Object obj = this.f953;
        switch (i) {
            case 1:
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 2:
                return ((List) this.f954).hashCode() ^ ((String) obj).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f955) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.f955;
        Object obj = this.f953;
        switch (i) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(getValue());
                return sb.toString();
            case 2:
                return ((String) obj) + SignatureVisitor.INSTANCEOF + ((List) this.f954);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0265(Object obj, int i, Object obj2) {
        this.f955 = i;
        this.f953 = obj;
        this.f954 = obj2;
    }
}
