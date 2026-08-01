package p296;

import bsh.util.ValueReferenceMap$Type;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f23456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ValueReferenceMap$Type f23460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f23461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f23459 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f23458 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ReferenceQueue f23457 = new ReferenceQueue();

    public C9200(Function function, ValueReferenceMap$Type valueReferenceMap$Type) {
        Objects.requireNonNull(valueReferenceMap$Type, "type must not be null");
        this.f23461 = function;
        this.f23460 = valueReferenceMap$Type;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized Object m14429(Object obj) {
        Object obj2;
        try {
            Objects.requireNonNull(obj, "key must not be null");
            int i = this.f23456 + 1;
            this.f23456 = i;
            if (i == 1000) {
                HashMap map = this.f23458;
                while (true) {
                    Reference referencePoll = this.f23457.poll();
                    if (referencePoll == null) {
                        break;
                    }
                    Object obj3 = map.get(referencePoll);
                    if (obj3 != null) {
                        this.f23459.remove(obj3);
                    }
                    map.remove(referencePoll);
                }
                this.f23456 = 0;
            }
            Reference reference = (Reference) this.f23459.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                return obj2;
            }
            Object objApply = this.f23461.apply(obj);
            Objects.requireNonNull(objApply, "ValueReference cache create value may not return null.");
            Reference weakReference = this.f23460 == ValueReferenceMap$Type.Weak ? new WeakReference(objApply, this.f23457) : new SoftReference(objApply, this.f23457);
            this.f23459.put(obj, weakReference);
            this.f23458.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }
}
