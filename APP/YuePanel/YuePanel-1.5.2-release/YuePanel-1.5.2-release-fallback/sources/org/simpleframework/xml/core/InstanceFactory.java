package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class InstanceFactory {
    private final org.simpleframework.xml.util.Cache<java.lang.reflect.Constructor> cache;

    public class ClassInstance implements org.simpleframework.xml.core.Instance {
        final /* synthetic */ org.simpleframework.xml.core.InstanceFactory this$0;
        private java.lang.Class type;
        private java.lang.Object value;

        public ClassInstance(org.simpleframework.xml.core.InstanceFactory r1, java.lang.Class r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.type = r2
                return
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Object getInstance() throws java.lang.Exception {
                r2 = this;
                java.lang.Object r0 = r2.value
                if (r0 != 0) goto Le
                org.simpleframework.xml.core.InstanceFactory r0 = r2.this$0
                java.lang.Class r1 = r2.type
                java.lang.Object r0 = r0.getObject(r1)
                r2.value = r0
            Le:
                java.lang.Object r0 = r2.value
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Class getType() {
                r1 = this;
                java.lang.Class r0 = r1.type
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Object setInstance(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                r0.value = r1
                return r1
        }
    }

    public class ValueInstance implements org.simpleframework.xml.core.Instance {
        final /* synthetic */ org.simpleframework.xml.core.InstanceFactory this$0;
        private final java.lang.Class type;
        private final org.simpleframework.xml.strategy.Value value;

        public ValueInstance(org.simpleframework.xml.core.InstanceFactory r1, org.simpleframework.xml.strategy.Value r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Class r1 = r2.getType()
                r0.type = r1
                r0.value = r2
                return
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Object getInstance() throws java.lang.Exception {
                r2 = this;
                org.simpleframework.xml.strategy.Value r0 = r2.value
                boolean r0 = r0.isReference()
                if (r0 == 0) goto Lf
                org.simpleframework.xml.strategy.Value r0 = r2.value
                java.lang.Object r0 = r0.getValue()
                return r0
            Lf:
                org.simpleframework.xml.core.InstanceFactory r0 = r2.this$0
                java.lang.Class r1 = r2.type
                java.lang.Object r0 = r0.getObject(r1)
                org.simpleframework.xml.strategy.Value r1 = r2.value
                if (r1 == 0) goto L1e
                r1.setValue(r0)
            L1e:
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Class getType() {
                r1 = this;
                java.lang.Class r0 = r1.type
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
                r1 = this;
                org.simpleframework.xml.strategy.Value r0 = r1.value
                boolean r0 = r0.isReference()
                return r0
        }

        @Override // org.simpleframework.xml.core.Instance
        public java.lang.Object setInstance(java.lang.Object r2) {
                r1 = this;
                org.simpleframework.xml.strategy.Value r0 = r1.value
                if (r0 == 0) goto L7
                r0.setValue(r2)
            L7:
                return r2
        }
    }

    public InstanceFactory() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            return
    }

    public org.simpleframework.xml.core.Instance getInstance(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.InstanceFactory$ClassInstance r0 = new org.simpleframework.xml.core.InstanceFactory$ClassInstance
            r0.<init>(r1, r2)
            return r0
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r2) {
            r1 = this;
            org.simpleframework.xml.core.InstanceFactory$ValueInstance r0 = new org.simpleframework.xml.core.InstanceFactory$ValueInstance
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.Object getObject(java.lang.Class r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.util.Cache<java.lang.reflect.Constructor> r0 = r3.cache
            java.lang.Object r0 = r0.fetch(r4)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r1 = 0
            if (r0 != 0) goto L1e
            java.lang.reflect.Constructor r0 = r4.getDeclaredConstructor(r1)
            boolean r2 = r0.isAccessible()
            if (r2 != 0) goto L19
            r2 = 1
            r0.setAccessible(r2)
        L19:
            org.simpleframework.xml.util.Cache<java.lang.reflect.Constructor> r2 = r3.cache
            r2.cache(r4, r0)
        L1e:
            java.lang.Object r4 = r0.newInstance(r1)
            return r4
    }
}
