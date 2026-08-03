package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Collector implements org.simpleframework.xml.core.Criteria {
    private final org.simpleframework.xml.core.Collector.Registry alias;
    private final org.simpleframework.xml.core.Collector.Registry registry;

    /* JADX INFO: renamed from: org.simpleframework.xml.core.Collector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Registry extends java.util.LinkedHashMap<java.lang.Object, org.simpleframework.xml.core.Variable> {
        private Registry() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Registry(org.simpleframework.xml.core.Collector.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.Iterator<java.lang.Object> iterator() {
                r1 = this;
                java.util.Set r0 = r1.keySet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    public Collector() {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.Collector$Registry r0 = new org.simpleframework.xml.core.Collector$Registry
            r1 = 0
            r0.<init>(r1)
            r2.registry = r0
            org.simpleframework.xml.core.Collector$Registry r0 = new org.simpleframework.xml.core.Collector$Registry
            r0.<init>(r1)
            r2.alias = r0
            return
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void commit(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r3.registry
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.Variable r1 = (org.simpleframework.xml.core.Variable) r1
            org.simpleframework.xml.core.Contact r2 = r1.getContact()
            java.lang.Object r1 = r1.getValue()
            r2.set(r4, r1)
            goto La
        L22:
            return
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable get(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r1.registry
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Variable r2 = (org.simpleframework.xml.core.Variable) r2
            return r2
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable get(org.simpleframework.xml.core.Label r2) throws java.lang.Exception {
            r1 = this;
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            org.simpleframework.xml.core.Collector$Registry r0 = r1.registry
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Variable r2 = (org.simpleframework.xml.core.Variable) r2
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Object> iterator() {
            r1 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r1.registry
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable remove(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r1.registry
            java.lang.Object r2 = r0.remove(r2)
            org.simpleframework.xml.core.Variable r2 = (org.simpleframework.xml.core.Variable) r2
            return r2
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable resolve(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r1.alias
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Variable r2 = (org.simpleframework.xml.core.Variable) r2
            return r2
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void set(org.simpleframework.xml.core.Label r6, java.lang.Object r7) throws java.lang.Exception {
            r5 = this;
            org.simpleframework.xml.core.Variable r0 = new org.simpleframework.xml.core.Variable
            r0.<init>(r6, r7)
            if (r6 == 0) goto L22
            java.lang.String[] r7 = r6.getPaths()
            java.lang.Object r6 = r6.getKey()
            int r1 = r7.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L1d
            r3 = r7[r2]
            org.simpleframework.xml.core.Collector$Registry r4 = r5.alias
            r4.put(r3, r0)
            int r2 = r2 + 1
            goto L11
        L1d:
            org.simpleframework.xml.core.Collector$Registry r7 = r5.registry
            r7.put(r6, r0)
        L22:
            return
    }
}
