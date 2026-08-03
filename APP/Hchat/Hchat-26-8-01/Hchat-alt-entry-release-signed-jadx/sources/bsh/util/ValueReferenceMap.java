package bsh.util;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ValueReferenceMap<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int counter;
    private Function<K, V> creator;
    private int found;
    private int missed;
    private Type type;
    private HashMap<K, Reference<V>> map = new HashMap<>();
    private HashMap<Reference<V>, K> reverse = new HashMap<>();
    private ReferenceQueue<V> queue = new ReferenceQueue<>();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type {
        Weak,
        Soft
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ValueReferenceMap(Function<K, V> function, Type type) {
        Objects.requireNonNull(function, "creator must not be null");
        Objects.requireNonNull(type, "type must not be null");
        this.creator = function;
        this.type = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void clean() {
        while (true) {
            Reference<? extends V> referencePoll = this.queue.poll();
            if (referencePoll == null) {
                return;
            }
            K k10 = this.reverse.get(referencePoll);
            if (k10 != null) {
                this.map.remove(k10);
            }
            this.reverse.remove(referencePoll);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void clear() {
        clean();
        this.map.clear();
        this.reverse.clear();
        this.missed = 0;
        this.found = 0;
        this.counter = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized V get(K k10) {
        V v10;
        try {
            Objects.requireNonNull(k10, "key must not be null");
            int i9 = this.counter + 1;
            this.counter = i9;
            if (i9 == 1000) {
                clean();
                this.missed = 0;
                this.found = 0;
                this.counter = 0;
            }
            Reference<V> reference = this.map.get(k10);
            if (reference != null && (v10 = reference.get()) != null) {
                this.found++;
                return v10;
            }
            this.missed++;
            V vApply = this.creator.apply(k10);
            Objects.requireNonNull(vApply, "ValueReference cache create value may not return null.");
            Reference<V> weakReference = this.type == Type.Weak ? new WeakReference<>(vApply, this.queue) : new SoftReference<>(vApply, this.queue);
            this.map.put(k10, weakReference);
            this.reverse.put(weakReference, k10);
            return vApply;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized boolean remove(K k10) {
        boolean z9;
        Reference<V> referenceRemove = this.map.remove(k10);
        z9 = referenceRemove != null;
        if (z9) {
            this.reverse.remove(referenceRemove);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized int size() {
        clean();
        return this.map.size();
    }
}
