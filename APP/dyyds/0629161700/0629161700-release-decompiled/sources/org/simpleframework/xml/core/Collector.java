package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Collector implements org.simpleframework.xml.core.Criteria {
    private final org.simpleframework.xml.core.Collector.Registry alias;
    private final org.simpleframework.xml.core.Collector.Registry registry;

    /* JADX INFO: renamed from: org.simpleframework.xml.core.Collector$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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
                r0 = this;
                java.util.Set r0 = r0.keySet()
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
    public void commit(java.lang.Object r3) {
            r2 = this;
            org.simpleframework.xml.core.Collector$Registry r2 = r2.registry
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.Variable r0 = (org.simpleframework.xml.core.Variable) r0
            org.simpleframework.xml.core.Contact r1 = r0.getContact()
            java.lang.Object r0 = r0.getValue()
            r1.set(r3, r0)
            goto La
        L22:
            return
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable get(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r0.registry
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Variable r0 = (org.simpleframework.xml.core.Variable) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable get(org.simpleframework.xml.core.Label r1) {
            r0 = this;
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r1.getKey()
            org.simpleframework.xml.core.Collector$Registry r0 = r0.registry
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Variable r0 = (org.simpleframework.xml.core.Variable) r0
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Object> iterator() {
            r0 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r0.registry
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable remove(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r0.registry
            java.lang.Object r0 = r0.remove(r1)
            org.simpleframework.xml.core.Variable r0 = (org.simpleframework.xml.core.Variable) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Criteria
    public org.simpleframework.xml.core.Variable resolve(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.Collector$Registry r0 = r0.alias
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Variable r0 = (org.simpleframework.xml.core.Variable) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Criteria
    public void set(org.simpleframework.xml.core.Label r6, java.lang.Object r7) {
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
            org.simpleframework.xml.core.Collector$Registry r5 = r5.registry
            r5.put(r6, r0)
        L22:
            return
    }
}
