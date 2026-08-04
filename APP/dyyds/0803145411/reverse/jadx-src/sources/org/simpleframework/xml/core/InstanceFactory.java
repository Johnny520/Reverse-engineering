package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class InstanceFactory {
    private final Cache<Constructor> cache = new ConcurrentCache();

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class ClassInstance implements Instance {
        private Class type;
        private Object value;

        public ClassInstance(Class cls) {
            this.type = cls;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() throws NoSuchMethodException {
            Object obj = this.value;
            if (obj != null) {
                return obj;
            }
            Object object = InstanceFactory.this.getObject(this.type);
            this.value = object;
            return object;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
            return false;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object setInstance(Object obj) {
            this.value = obj;
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class ValueInstance implements Instance {
        private final Class type;
        private final Value value;

        public ValueInstance(Value value) {
            this.type = value.getType();
            this.value = value;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() throws NoSuchMethodException {
            if (this.value.isReference()) {
                return this.value.getValue();
            }
            Object object = InstanceFactory.this.getObject(this.type);
            Value value = this.value;
            if (value != null) {
                value.setValue(object);
            }
            return object;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
            return this.value.isReference();
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object setInstance(Object obj) {
            Value value = this.value;
            if (value != null) {
                value.setValue(obj);
            }
            return obj;
        }
    }

    public Instance getInstance(Value value) {
        return new ValueInstance(value);
    }

    public Object getObject(Class cls) throws NoSuchMethodException {
        Constructor constructorFetch = this.cache.fetch(cls);
        if (constructorFetch == null) {
            constructorFetch = cls.getDeclaredConstructor(null);
            if (!constructorFetch.isAccessible()) {
                constructorFetch.setAccessible(true);
            }
            this.cache.cache(cls, constructorFetch);
        }
        return constructorFetch.newInstance(null);
    }

    public Instance getInstance(Class cls) {
        return new ClassInstance(cls);
    }
}
