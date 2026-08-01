package androidx.collection;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p070.InterfaceC7396;
import p252.C8932;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1112 implements Map.Entry, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f1298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f1299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1300;

    public C1112(C8932 c8932) {
        this.f1300 = 2;
        this.f1298 = c8932.f22733;
        this.f1299 = c8932.f22732;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        int i = this.f1300;
        Object obj2 = this.f1298;
        switch (i) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC5227.m9466(entry.getKey(), obj2) && AbstractC5227.m9466(entry.getValue(), getValue());
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return AbstractC5227.m9466(entry2.getKey(), (String) obj2) && AbstractC5227.m9466(entry2.getValue(), (List) this.f1299);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.f1300;
        Object obj = this.f1298;
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
        int i = this.f1300;
        Object obj = this.f1299;
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
        int i = this.f1300;
        Object obj = this.f1298;
        switch (i) {
            case 1:
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 2:
                return ((List) this.f1299).hashCode() ^ ((String) obj).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f1300) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.f1300;
        Object obj = this.f1298;
        switch (i) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(getValue());
                return sb.toString();
            case 2:
                return ((String) obj) + SignatureVisitor.INSTANCEOF + ((List) this.f1299);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1112(Object obj, int i, Object obj2) {
        this.f1300 = i;
        this.f1298 = obj;
        this.f1299 = obj2;
    }
}
