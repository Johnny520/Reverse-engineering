package p280;

import bsh.util.ValueReferenceMap$Type;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f23112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ValueReferenceMap$Type f23116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f23117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f23115 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f23114 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ReferenceQueue f23113 = new ReferenceQueue();

    public C8370(Function function, ValueReferenceMap$Type valueReferenceMap$Type) {
        Objects.requireNonNull(valueReferenceMap$Type, "type must not be null");
        this.f23117 = function;
        this.f23116 = valueReferenceMap$Type;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized Object m13853(Object obj) {
        Object obj2;
        try {
            Objects.requireNonNull(obj, "key must not be null");
            int i = this.f23112 + 1;
            this.f23112 = i;
            if (i == 1000) {
                HashMap map = this.f23114;
                while (true) {
                    Reference referencePoll = this.f23113.poll();
                    if (referencePoll == null) {
                        break;
                    }
                    Object obj3 = map.get(referencePoll);
                    if (obj3 != null) {
                        this.f23115.remove(obj3);
                    }
                    map.remove(referencePoll);
                }
                this.f23112 = 0;
            }
            Reference reference = (Reference) this.f23115.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                return obj2;
            }
            Object objApply = this.f23117.apply(obj);
            Objects.requireNonNull(objApply, "ValueReference cache create value may not return null.");
            Reference weakReference = this.f23116 == ValueReferenceMap$Type.Weak ? new WeakReference(objApply, this.f23113) : new SoftReference(objApply, this.f23113);
            this.f23115.put(obj, weakReference);
            this.f23114.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }
}
