package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ModelAssembler {
    private final org.simpleframework.xml.core.ExpressionBuilder builder;
    private final org.simpleframework.xml.core.Detail detail;
    private final org.simpleframework.xml.stream.Format format;

    public ModelAssembler(org.simpleframework.xml.core.ExpressionBuilder r1, org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) throws java.lang.Exception {
            r0 = this;
            r0.<init>()
            org.simpleframework.xml.stream.Format r3 = r3.getFormat()
            r0.format = r3
            r0.builder = r1
            r0.detail = r2
            return
    }

    private void assembleAttributes(org.simpleframework.xml.core.Model r6, org.simpleframework.xml.Order r7) throws java.lang.Exception {
            r5 = this;
            java.lang.String[] r7 = r7.attributes()
            int r0 = r7.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L45
            r2 = r7[r1]
            org.simpleframework.xml.core.ExpressionBuilder r3 = r5.builder
            org.simpleframework.xml.core.Expression r3 = r3.build(r2)
            boolean r4 = r3.isAttribute()
            if (r4 != 0) goto L2b
            boolean r4 = r3.isPath()
            if (r4 != 0) goto L1d
            goto L2b
        L1d:
            org.simpleframework.xml.core.PathException r6 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r7 = r5.detail
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r7}
            java.lang.String r0 = "Ordered attribute '%s' references an element in %s"
            r6.<init>(r0, r7)
            throw r6
        L2b:
            boolean r4 = r3.isPath()
            if (r4 != 0) goto L3f
            org.simpleframework.xml.stream.Format r3 = r5.format
            org.simpleframework.xml.stream.Style r3 = r3.getStyle()
            java.lang.String r2 = r3.getAttribute(r2)
            r6.registerAttribute(r2)
            goto L42
        L3f:
            r5.registerAttributes(r6, r3)
        L42:
            int r1 = r1 + 1
            goto L6
        L45:
            return
    }

    private void assembleElements(org.simpleframework.xml.core.Model r5, org.simpleframework.xml.Order r6) throws java.lang.Exception {
            r4 = this;
            java.lang.String[] r6 = r6.elements()
            int r0 = r6.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L2a
            r2 = r6[r1]
            org.simpleframework.xml.core.ExpressionBuilder r3 = r4.builder
            org.simpleframework.xml.core.Expression r2 = r3.build(r2)
            boolean r3 = r2.isAttribute()
            if (r3 != 0) goto L1c
            r4.registerElements(r5, r2)
            int r1 = r1 + 1
            goto L6
        L1c:
            org.simpleframework.xml.core.PathException r5 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r6 = r4.detail
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r6}
            java.lang.String r0 = "Ordered element '%s' references an attribute in %s"
            r5.<init>(r0, r6)
            throw r5
        L2a:
            return
    }

    private void registerAttribute(org.simpleframework.xml.core.Model r1, org.simpleframework.xml.core.Expression r2) throws java.lang.Exception {
            r0 = this;
            java.lang.String r2 = r2.getFirst()
            if (r2 == 0) goto L9
            r1.registerAttribute(r2)
        L9:
            return
    }

    private void registerAttributes(org.simpleframework.xml.core.Model r5, org.simpleframework.xml.core.Expression r6) throws java.lang.Exception {
            r4 = this;
            java.lang.String r0 = r6.getPrefix()
            java.lang.String r1 = r6.getFirst()
            int r2 = r6.getIndex()
            boolean r3 = r6.isPath()
            if (r3 == 0) goto L2f
            org.simpleframework.xml.core.Model r5 = r5.register(r1, r0, r2)
            r0 = 1
            org.simpleframework.xml.core.Expression r6 = r6.getPath(r0)
            if (r5 == 0) goto L21
            r4.registerAttributes(r5, r6)
            goto L32
        L21:
            org.simpleframework.xml.core.PathException r5 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r6 = r4.detail
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}
            java.lang.String r0 = "Element '%s' does not exist in %s"
            r5.<init>(r0, r6)
            throw r5
        L2f:
            r4.registerAttribute(r5, r6)
        L32:
            return
    }

    private void registerElement(org.simpleframework.xml.core.Model r5, org.simpleframework.xml.core.Expression r6) throws java.lang.Exception {
            r4 = this;
            java.lang.String r0 = r6.getPrefix()
            java.lang.String r1 = r6.getFirst()
            int r2 = r6.getIndex()
            r3 = 1
            if (r2 <= r3) goto L26
            int r3 = r2 + (-1)
            org.simpleframework.xml.core.Model r3 = r5.lookup(r1, r3)
            if (r3 == 0) goto L18
            goto L26
        L18:
            org.simpleframework.xml.core.PathException r5 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r0 = r4.detail
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6, r0}
            java.lang.String r0 = "Ordered element '%s' in path '%s' is out of sequence for %s"
            r5.<init>(r0, r6)
            throw r5
        L26:
            r5.register(r1, r0, r2)
            return
    }

    private void registerElements(org.simpleframework.xml.core.Model r4, org.simpleframework.xml.core.Expression r5) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r5.getPrefix()
            java.lang.String r1 = r5.getFirst()
            int r2 = r5.getIndex()
            if (r1 == 0) goto L20
            org.simpleframework.xml.core.Model r0 = r4.register(r1, r0, r2)
            r1 = 1
            org.simpleframework.xml.core.Expression r1 = r5.getPath(r1)
            boolean r2 = r5.isPath()
            if (r2 == 0) goto L20
            r3.registerElements(r0, r1)
        L20:
            r3.registerElement(r4, r5)
            return
    }

    public void assemble(org.simpleframework.xml.core.Model r1, org.simpleframework.xml.Order r2) throws java.lang.Exception {
            r0 = this;
            r0.assembleElements(r1, r2)
            r0.assembleAttributes(r1, r2)
            return
    }
}
