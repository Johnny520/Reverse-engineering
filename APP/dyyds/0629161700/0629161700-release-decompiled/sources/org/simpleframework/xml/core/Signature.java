package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Signature implements java.lang.Iterable<org.simpleframework.xml.core.Parameter> {
    private final java.lang.reflect.Constructor factory;
    private final org.simpleframework.xml.core.ParameterMap parameters;
    private final java.lang.Class type;

    public Signature(java.lang.reflect.Constructor r2) {
            r1 = this;
            java.lang.Class r0 = r2.getDeclaringClass()
            r1.<init>(r2, r0)
            return
    }

    public Signature(java.lang.reflect.Constructor r2, java.lang.Class r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ParameterMap r0 = new org.simpleframework.xml.core.ParameterMap
            r0.<init>()
            r1.parameters = r0
            r1.factory = r2
            r1.type = r3
            return
    }

    public Signature(org.simpleframework.xml.core.Signature r2) {
            r1 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            java.lang.Class r2 = r2.type
            r1.<init>(r0, r2)
            return
    }

    public void add(org.simpleframework.xml.core.Parameter r2) {
            r1 = this;
            java.lang.Object r0 = r2.getKey()
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.ParameterMap r1 = r1.parameters
            r1.put(r0, r2)
        Lb:
            return
    }

    public boolean contains(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    public org.simpleframework.xml.core.Signature copy() {
            r2 = this;
            org.simpleframework.xml.core.Signature r0 = new org.simpleframework.xml.core.Signature
            r0.<init>(r2)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
            r0.add(r1)
            goto L9
        L19:
            return r0
    }

    public java.lang.Object create() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            boolean r0 = r0.isAccessible()
            if (r0 != 0) goto Le
            java.lang.reflect.Constructor r0 = r2.factory
            r1 = 1
            r0.setAccessible(r1)
        Le:
            java.lang.reflect.Constructor r2 = r2.factory
            r0 = 0
            java.lang.Object r2 = r2.newInstance(r0)
            return r2
    }

    public java.lang.Object create(java.lang.Object[] r3) {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            boolean r0 = r0.isAccessible()
            if (r0 != 0) goto Le
            java.lang.reflect.Constructor r0 = r2.factory
            r1 = 1
            r0.setAccessible(r1)
        Le:
            java.lang.reflect.Constructor r2 = r2.factory
            java.lang.Object r2 = r2.newInstance(r3)
            return r2
    }

    public org.simpleframework.xml.core.Parameter get(int r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            org.simpleframework.xml.core.Parameter r0 = r0.get(r1)
            return r0
    }

    public org.simpleframework.xml.core.Parameter get(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
            return r0
    }

    public java.util.List<org.simpleframework.xml.core.Parameter> getAll() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            java.util.List r0 = r0.getAll()
            return r0
    }

    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    public boolean isEmpty() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Parameter> iterator() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public org.simpleframework.xml.core.Parameter remove(java.lang.Object r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            java.lang.Object r0 = r0.remove(r1)
            org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
            return r0
    }

    public void set(java.lang.Object r1, org.simpleframework.xml.core.Parameter r2) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            r0.put(r1, r2)
            return
    }

    public int size() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.parameters
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.reflect.Constructor r0 = r0.factory
            java.lang.String r0 = r0.toString()
            return r0
    }
}
