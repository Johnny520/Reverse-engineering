package io.fastkv;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class WeakCache {
    private final Map<String, ValueReference> cache = new HashMap();
    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();

    public static class ValueReference extends WeakReference<Object> {
        private final String key;

        public ValueReference(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.key = str;
        }
    }

    private void cleanQueue() {
        ValueReference valueReference = (ValueReference) this.queue.poll();
        while (valueReference != null) {
            ValueReference valueReference2 = this.cache.get(valueReference.key);
            if (valueReference2 != null && valueReference2.get() == null) {
                this.cache.remove(valueReference.key);
            }
            valueReference = (ValueReference) this.queue.poll();
        }
    }

    public synchronized void clear() {
        this.cache.clear();
        cleanQueue();
    }

    public synchronized Object get(String str) {
        ValueReference valueReference;
        cleanQueue();
        valueReference = this.cache.get(str);
        return valueReference != null ? valueReference.get() : null;
    }

    public synchronized void put(String str, Object obj) {
        ValueReference valueReference;
        try {
            cleanQueue();
            if (obj != null && ((valueReference = this.cache.get(str)) == null || valueReference.get() != obj)) {
                this.cache.put(str, new ValueReference(str, obj, this.queue));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        this.cache.remove(str);
    }
}
