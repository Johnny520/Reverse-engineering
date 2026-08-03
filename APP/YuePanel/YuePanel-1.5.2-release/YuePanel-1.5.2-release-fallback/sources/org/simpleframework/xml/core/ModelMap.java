package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ModelMap extends java.util.LinkedHashMap<java.lang.String, org.simpleframework.xml.core.ModelList> implements java.lang.Iterable<org.simpleframework.xml.core.ModelList> {
    private final org.simpleframework.xml.core.Detail detail;

    public ModelMap(org.simpleframework.xml.core.Detail r1) {
            r0 = this;
            r0.<init>()
            r0.detail = r1
            return
    }

    public org.simpleframework.xml.core.ModelMap getModels() throws java.lang.Exception {
            r5 = this;
            org.simpleframework.xml.core.ModelMap r0 = new org.simpleframework.xml.core.ModelMap
            org.simpleframework.xml.core.Detail r1 = r5.detail
            r0.<init>(r1)
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            org.simpleframework.xml.core.ModelList r3 = (org.simpleframework.xml.core.ModelList) r3
            if (r3 == 0) goto L27
            org.simpleframework.xml.core.ModelList r3 = r3.build()
        L27:
            boolean r4 = r0.containsKey(r2)
            if (r4 != 0) goto L31
            r0.put(r2, r3)
            goto Lf
        L31:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r1 = r5.detail
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "Path with name '%s' is a duplicate in %s "
            r0.<init>(r2, r1)
            throw r0
        L3f:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.ModelList> iterator() {
            r1 = this;
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public org.simpleframework.xml.core.Model lookup(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            org.simpleframework.xml.core.ModelList r1 = (org.simpleframework.xml.core.ModelList) r1
            if (r1 == 0) goto Ld
            org.simpleframework.xml.core.Model r1 = r1.lookup(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public void register(java.lang.String r2, org.simpleframework.xml.core.Model r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            org.simpleframework.xml.core.ModelList r0 = (org.simpleframework.xml.core.ModelList) r0
            if (r0 != 0) goto L10
            org.simpleframework.xml.core.ModelList r0 = new org.simpleframework.xml.core.ModelList
            r0.<init>()
            r1.put(r2, r0)
        L10:
            r0.register(r3)
            return
    }
}
