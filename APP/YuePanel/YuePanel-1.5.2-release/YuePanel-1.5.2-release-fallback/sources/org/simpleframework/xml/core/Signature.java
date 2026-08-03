package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    public void add(org.simpleframework.xml.core.Parameter r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.ParameterMap r1 = r2.parameters
            r1.put(r0, r3)
        Lb:
            return
    }

    public boolean contains(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public org.simpleframework.xml.core.Signature copy() throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Signature r0 = new org.simpleframework.xml.core.Signature
            r0.<init>(r3)
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            r0.add(r2)
            goto L9
        L19:
            return r0
    }

    public java.lang.Object create() throws java.lang.Exception {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            boolean r0 = r0.isAccessible()
            if (r0 != 0) goto Le
            java.lang.reflect.Constructor r0 = r2.factory
            r1 = 1
            r0.setAccessible(r1)
        Le:
            java.lang.reflect.Constructor r0 = r2.factory
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    public java.lang.Object create(java.lang.Object[] r3) throws java.lang.Exception {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            boolean r0 = r0.isAccessible()
            if (r0 != 0) goto Le
            java.lang.reflect.Constructor r0 = r2.factory
            r1 = 1
            r0.setAccessible(r1)
        Le:
            java.lang.reflect.Constructor r0 = r2.factory
            java.lang.Object r3 = r0.newInstance(r3)
            return r3
    }

    public org.simpleframework.xml.core.Parameter get(int r2) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            org.simpleframework.xml.core.Parameter r2 = r0.get(r2)
            return r2
    }

    public org.simpleframework.xml.core.Parameter get(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            return r2
    }

    public java.util.List<org.simpleframework.xml.core.Parameter> getAll() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            java.util.List r0 = r0.getAll()
            return r0
    }

    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.type
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Parameter> iterator() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public org.simpleframework.xml.core.Parameter remove(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            java.lang.Object r2 = r0.remove(r2)
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            return r2
    }

    public void set(java.lang.Object r2, org.simpleframework.xml.core.Parameter r3) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            r0.put(r2, r3)
            return
    }

    public int size() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.parameters
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.factory
            java.lang.String r0 = r0.toString()
            return r0
    }
}
