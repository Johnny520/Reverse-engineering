package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class SignatureCreator implements org.simpleframework.xml.core.Creator {
    private final java.util.List<org.simpleframework.xml.core.Parameter> list;
    private final org.simpleframework.xml.core.Signature signature;
    private final java.lang.Class type;

    public SignatureCreator(org.simpleframework.xml.core.Signature r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getType()
            r1.type = r0
            java.util.List r0 = r2.getAll()
            r1.list = r0
            r1.signature = r2
            return
    }

    private double getAdjustment(double r5) {
            r4 = this;
            java.util.List<org.simpleframework.xml.core.Parameter> r0 = r4.list
            int r0 = r0.size()
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            java.util.List<org.simpleframework.xml.core.Parameter> r4 = r4.list
            if (r2 <= 0) goto L1d
            int r4 = r4.size()
            double r2 = (double) r4
            double r5 = r5 / r2
            double r5 = r5 + r0
            return r5
        L1d:
            int r4 = r4.size()
            double r0 = (double) r4
            double r5 = r5 / r0
            return r5
    }

    private double getPercentage(org.simpleframework.xml.core.Criteria r8) {
            r7 = this;
            java.util.List<org.simpleframework.xml.core.Parameter> r0 = r7.list
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r0.next()
            org.simpleframework.xml.core.Parameter r3 = (org.simpleframework.xml.core.Parameter) r3
            java.lang.Object r4 = r3.getKey()
            org.simpleframework.xml.core.Variable r4 = r8.get(r4)
            if (r4 != 0) goto L2e
            boolean r4 = r3.isRequired()
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r4 == 0) goto L27
            return r5
        L27:
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L8
            return r5
        L2e:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r3
            goto L8
        L32:
            double r7 = r7.getAdjustment(r1)
            return r7
    }

    private java.lang.Object getVariable(org.simpleframework.xml.core.Criteria r1, int r2) {
            r0 = this;
            java.util.List<org.simpleframework.xml.core.Parameter> r0 = r0.list
            java.lang.Object r0 = r0.get(r2)
            org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
            java.lang.Object r0 = r0.getKey()
            org.simpleframework.xml.core.Variable r0 = r1.remove(r0)
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.getValue()
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // org.simpleframework.xml.core.Creator
    public java.lang.Object getInstance() {
            r0 = this;
            org.simpleframework.xml.core.Signature r0 = r0.signature
            java.lang.Object r0 = r0.create()
            return r0
    }

    @Override // org.simpleframework.xml.core.Creator
    public java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r4) {
            r3 = this;
            java.util.List<org.simpleframework.xml.core.Parameter> r0 = r3.list
            java.lang.Object[] r0 = r0.toArray()
            r1 = 0
        L7:
            java.util.List<org.simpleframework.xml.core.Parameter> r2 = r3.list
            int r2 = r2.size()
            if (r1 >= r2) goto L18
            java.lang.Object r2 = r3.getVariable(r4, r1)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L18:
            org.simpleframework.xml.core.Signature r3 = r3.signature
            java.lang.Object r3 = r3.create(r0)
            return r3
    }

    @Override // org.simpleframework.xml.core.Creator
    public double getScore(org.simpleframework.xml.core.Criteria r9) {
            r8 = this;
            org.simpleframework.xml.core.Signature r0 = r8.signature
            org.simpleframework.xml.core.Signature r0 = r0.copy()
            java.util.Iterator r1 = r9.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            org.simpleframework.xml.core.Parameter r3 = r0.get(r2)
            org.simpleframework.xml.core.Variable r2 = r9.get(r2)
            org.simpleframework.xml.core.Contact r4 = r2.getContact()
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r3 == 0) goto L37
            java.lang.Object r2 = r2.getValue()
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r7 = r3.getType()
            boolean r2 = org.simpleframework.xml.core.Support.isAssignable(r2, r7)
            if (r2 != 0) goto L37
            return r5
        L37:
            boolean r2 = r4.isReadOnly()
            if (r2 == 0) goto La
            if (r3 != 0) goto La
            return r5
        L40:
            double r8 = r8.getPercentage(r9)
            return r8
    }

    @Override // org.simpleframework.xml.core.Creator
    public org.simpleframework.xml.core.Signature getSignature() {
            r0 = this;
            org.simpleframework.xml.core.Signature r0 = r0.signature
            return r0
    }

    @Override // org.simpleframework.xml.core.Creator
    public java.lang.Class getType() {
            r0 = this;
            java.lang.Class r0 = r0.type
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            org.simpleframework.xml.core.Signature r0 = r0.signature
            java.lang.String r0 = r0.toString()
            return r0
    }
}
