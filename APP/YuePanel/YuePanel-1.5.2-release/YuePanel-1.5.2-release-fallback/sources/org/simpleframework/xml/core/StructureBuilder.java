package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class StructureBuilder {
    private org.simpleframework.xml.core.ModelAssembler assembler;
    private org.simpleframework.xml.core.LabelMap attributes;
    private org.simpleframework.xml.core.ExpressionBuilder builder;
    private org.simpleframework.xml.core.LabelMap elements;
    private org.simpleframework.xml.core.Instantiator factory;
    private boolean primitive;
    private org.simpleframework.xml.core.InstantiatorBuilder resolver;
    private org.simpleframework.xml.core.Model root;
    private org.simpleframework.xml.core.Scanner scanner;
    private org.simpleframework.xml.core.Support support;
    private org.simpleframework.xml.core.Label text;
    private org.simpleframework.xml.core.LabelMap texts;
    private org.simpleframework.xml.core.Label version;

    public StructureBuilder(org.simpleframework.xml.core.Scanner r3, org.simpleframework.xml.core.Detail r4, org.simpleframework.xml.core.Support r5) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.ExpressionBuilder r0 = new org.simpleframework.xml.core.ExpressionBuilder
            r0.<init>(r4, r5)
            r2.builder = r0
            org.simpleframework.xml.core.ModelAssembler r1 = new org.simpleframework.xml.core.ModelAssembler
            r1.<init>(r0, r4, r5)
            r2.assembler = r1
            org.simpleframework.xml.core.InstantiatorBuilder r0 = new org.simpleframework.xml.core.InstantiatorBuilder
            r0.<init>(r3, r4)
            r2.resolver = r0
            org.simpleframework.xml.core.TreeModel r0 = new org.simpleframework.xml.core.TreeModel
            r0.<init>(r3, r4)
            r2.root = r0
            org.simpleframework.xml.core.LabelMap r4 = new org.simpleframework.xml.core.LabelMap
            r4.<init>(r3)
            r2.attributes = r4
            org.simpleframework.xml.core.LabelMap r4 = new org.simpleframework.xml.core.LabelMap
            r4.<init>(r3)
            r2.elements = r4
            org.simpleframework.xml.core.LabelMap r4 = new org.simpleframework.xml.core.LabelMap
            r4.<init>(r3)
            r2.texts = r4
            r2.scanner = r3
            r2.support = r5
            return
    }

    private org.simpleframework.xml.core.Model create(org.simpleframework.xml.core.Expression r5) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.core.Model r0 = r4.root
        L2:
            if (r0 == 0) goto L23
            java.lang.String r1 = r5.getPrefix()
            java.lang.String r2 = r5.getFirst()
            int r3 = r5.getIndex()
            if (r2 == 0) goto L16
            org.simpleframework.xml.core.Model r0 = r0.register(r2, r1, r3)
        L16:
            boolean r1 = r5.isPath()
            if (r1 != 0) goto L1d
            goto L23
        L1d:
            r1 = 1
            org.simpleframework.xml.core.Expression r5 = r5.getPath(r1)
            goto L2
        L23:
            return r0
    }

    private boolean isAttribute(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.ExpressionBuilder r0 = r3.builder
            org.simpleframework.xml.core.Expression r0 = r0.build(r4)
            org.simpleframework.xml.core.Model r1 = r3.lookup(r0)
            if (r1 == 0) goto L20
            java.lang.String r2 = r0.getLast()
            boolean r0 = r0.isPath()
            if (r0 != 0) goto L1b
            boolean r4 = r1.isAttribute(r4)
            return r4
        L1b:
            boolean r4 = r1.isAttribute(r2)
            return r4
        L20:
            r4 = 0
            return r4
    }

    private boolean isElement(java.lang.String r6) throws java.lang.Exception {
            r5 = this;
            org.simpleframework.xml.core.ExpressionBuilder r0 = r5.builder
            org.simpleframework.xml.core.Expression r6 = r0.build(r6)
            org.simpleframework.xml.core.Model r0 = r5.lookup(r6)
            r1 = 0
            if (r0 == 0) goto L2f
            java.lang.String r2 = r6.getLast()
            int r6 = r6.getIndex()
            boolean r3 = r0.isElement(r2)
            r4 = 1
            if (r3 == 0) goto L1d
            return r4
        L1d:
            boolean r3 = r0.isModel(r2)
            if (r3 == 0) goto L2f
            org.simpleframework.xml.core.Model r6 = r0.lookup(r2, r6)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2e
            return r1
        L2e:
            return r4
        L2f:
            return r1
    }

    private boolean isEmpty() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.text
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            org.simpleframework.xml.core.Model r0 = r1.root
            boolean r0 = r0.isEmpty()
            return r0
    }

    private org.simpleframework.xml.core.Model lookup(org.simpleframework.xml.core.Expression r3) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            r1 = 1
            org.simpleframework.xml.core.Expression r0 = r3.getPath(r0, r1)
            boolean r3 = r3.isPath()
            if (r3 == 0) goto L13
            org.simpleframework.xml.core.Model r3 = r2.root
            org.simpleframework.xml.core.Model r3 = r3.lookup(r0)
            return r3
        L13:
            org.simpleframework.xml.core.Model r3 = r2.root
            return r3
    }

    private void process(org.simpleframework.xml.core.Contact r3, java.lang.annotation.Annotation r4, org.simpleframework.xml.core.LabelMap r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Support r0 = r2.support
            org.simpleframework.xml.core.Label r4 = r0.getLabel(r3, r4)
            java.lang.String r0 = r4.getPath()
            java.lang.String r1 = r4.getName()
            java.lang.Object r0 = r5.get(r0)
            if (r0 != 0) goto L18
            r2.process(r3, r4, r5)
            return
        L18:
            org.simpleframework.xml.core.PersistenceException r4 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r5 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            r4.<init>(r5, r3)
            throw r4
    }

    private void process(org.simpleframework.xml.core.Contact r4, org.simpleframework.xml.core.Label r5, org.simpleframework.xml.core.LabelMap r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Expression r4 = r5.getExpression()
            java.lang.String r0 = r5.getPath()
            org.simpleframework.xml.core.Model r1 = r3.root
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L14
            org.simpleframework.xml.core.Model r1 = r3.register(r4)
        L14:
            org.simpleframework.xml.core.InstantiatorBuilder r4 = r3.resolver
            r4.register(r5)
            r1.register(r5)
            r6.put(r0, r5)
            return
    }

    private org.simpleframework.xml.core.Model register(org.simpleframework.xml.core.Expression r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.root
            org.simpleframework.xml.core.Model r0 = r0.lookup(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            org.simpleframework.xml.core.Model r2 = r1.create(r2)
            return r2
    }

    private void text(org.simpleframework.xml.core.Contact r5, java.lang.annotation.Annotation r6) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.core.Support r0 = r4.support
            org.simpleframework.xml.core.Label r5 = r0.getLabel(r5, r6)
            org.simpleframework.xml.core.Expression r0 = r5.getExpression()
            java.lang.String r1 = r5.getPath()
            org.simpleframework.xml.core.Model r2 = r4.root
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L1a
            org.simpleframework.xml.core.Model r2 = r4.register(r0)
        L1a:
            org.simpleframework.xml.core.LabelMap r0 = r4.texts
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L30
            org.simpleframework.xml.core.InstantiatorBuilder r6 = r4.resolver
            r6.register(r5)
            r2.register(r5)
            org.simpleframework.xml.core.LabelMap r6 = r4.texts
            r6.put(r1, r5)
            return
        L30:
            org.simpleframework.xml.core.TextException r5 = new org.simpleframework.xml.core.TextException
            java.lang.String r0 = "Multiple text annotations in %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r5.<init>(r0, r6)
            throw r5
    }

    private void union(org.simpleframework.xml.core.Contact r4, java.lang.annotation.Annotation r5, org.simpleframework.xml.core.LabelMap r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Support r0 = r3.support
            java.util.List r5 = r0.getLabels(r4, r5)
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            java.lang.String r1 = r0.getPath()
            java.lang.String r2 = r0.getName()
            java.lang.Object r1 = r6.get(r1)
            if (r1 != 0) goto L28
            r3.process(r4, r0, r6)
            goto La
        L28:
            org.simpleframework.xml.core.PersistenceException r4 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r5 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r0}
            r4.<init>(r5, r6)
            throw r4
        L34:
            return
    }

    private void validateAttributes(java.lang.Class r5, org.simpleframework.xml.Order r6) throws java.lang.Exception {
            r4 = this;
            if (r6 == 0) goto L21
            java.lang.String[] r6 = r6.attributes()
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L21
            r2 = r6[r1]
            boolean r3 = r4.isAttribute(r2)
            if (r3 == 0) goto L15
            int r1 = r1 + 1
            goto L8
        L15:
            org.simpleframework.xml.core.AttributeException r6 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r0 = "Ordered attribute '%s' missing in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5}
            r6.<init>(r0, r5)
            throw r6
        L21:
            return
    }

    private void validateElements(java.lang.Class r5, org.simpleframework.xml.Order r6) throws java.lang.Exception {
            r4 = this;
            if (r6 == 0) goto L21
            java.lang.String[] r6 = r6.elements()
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L21
            r2 = r6[r1]
            boolean r3 = r4.isElement(r2)
            if (r3 == 0) goto L15
            int r1 = r1 + 1
            goto L8
        L15:
            org.simpleframework.xml.core.ElementException r6 = new org.simpleframework.xml.core.ElementException
            java.lang.String r0 = "Ordered element '%s' missing for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5}
            r6.<init>(r0, r5)
            throw r6
        L21:
            return
    }

    private void validateModel(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Model r0 = r1.root
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            org.simpleframework.xml.core.Model r0 = r1.root
            r0.validate(r2)
        Ld:
            return
    }

    private void validateText(java.lang.Class r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Model r0 = r3.root
            org.simpleframework.xml.core.Label r0 = r0.getText()
            if (r0 == 0) goto L37
            boolean r1 = r0.isTextList()
            if (r1 != 0) goto L45
            org.simpleframework.xml.core.LabelMap r1 = r3.elements
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            org.simpleframework.xml.core.Model r1 = r3.root
            boolean r1 = r1.isComposite()
            if (r1 != 0) goto L1f
            goto L45
        L1f:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r2 = "Paths used with %s in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            r1.<init>(r2, r4)
            throw r1
        L2b:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r2 = "Elements used with %s in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            r1.<init>(r2, r4)
            throw r1
        L37:
            org.simpleframework.xml.core.Scanner r4 = r3.scanner
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L45
            boolean r4 = r3.isEmpty()
            r3.primitive = r4
        L45:
            return
    }

    private void validateTextList(java.lang.Class r6) throws java.lang.Exception {
            r5 = this;
            org.simpleframework.xml.core.Model r0 = r5.root
            org.simpleframework.xml.core.Label r0 = r0.getText()
            if (r0 == 0) goto L68
            boolean r1 = r0.isTextList()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.getKey()
            org.simpleframework.xml.core.LabelMap r2 = r5.elements
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()
            org.simpleframework.xml.core.Label r3 = (org.simpleframework.xml.core.Label) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L47
            org.simpleframework.xml.strategy.Type r3 = r3.getDependent()
            java.lang.Class r3 = r3.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == r4) goto L3b
            goto L18
        L3b:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r2 = "Illegal entry of %s with text annotations on %s in %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r3, r0, r6}
            r1.<init>(r2, r6)
            throw r1
        L47:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r2 = "Elements used with %s in %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            r1.<init>(r2, r6)
            throw r1
        L53:
            org.simpleframework.xml.core.Model r1 = r5.root
            boolean r1 = r1.isComposite()
            if (r1 != 0) goto L5c
            goto L68
        L5c:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r2 = "Paths used with %s in %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            r1.<init>(r2, r6)
            throw r1
        L68:
            return
    }

    private void validateUnions(java.lang.Class r10) throws java.lang.Exception {
            r9 = this;
            org.simpleframework.xml.core.LabelMap r10 = r9.elements
            java.util.Iterator r10 = r10.iterator()
        L6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r10.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            java.lang.String[] r1 = r0.getPaths()
            org.simpleframework.xml.core.Contact r2 = r0.getContact()
            int r3 = r1.length
            r4 = 0
        L1c:
            if (r4 >= r3) goto L6
            r5 = r1[r4]
            java.lang.annotation.Annotation r6 = r2.getAnnotation()
            org.simpleframework.xml.core.LabelMap r7 = r9.elements
            java.lang.Object r5 = r7.get(r5)
            org.simpleframework.xml.core.Label r5 = (org.simpleframework.xml.core.Label) r5
            boolean r7 = r0.isInline()
            boolean r8 = r5.isInline()
            if (r7 != r8) goto L4f
            boolean r7 = r0.isRequired()
            boolean r5 = r5.isRequired()
            if (r7 != r5) goto L43
            int r4 = r4 + 1
            goto L1c
        L43:
            org.simpleframework.xml.core.UnionException r10 = new org.simpleframework.xml.core.UnionException
            java.lang.String r0 = "Required must be consistent in %s for %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r2}
            r10.<init>(r0, r1)
            throw r10
        L4f:
            org.simpleframework.xml.core.UnionException r10 = new org.simpleframework.xml.core.UnionException
            java.lang.String r0 = "Inline must be consistent in %s for %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r2}
            r10.<init>(r0, r1)
            throw r10
        L5b:
            return
    }

    private void version(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.Label r2 = r0.getLabel(r2, r3)
            org.simpleframework.xml.core.Label r0 = r1.version
            if (r0 != 0) goto Ld
            r1.version = r2
            return
        Ld:
            org.simpleframework.xml.core.AttributeException r2 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r0 = "Multiple version annotations in %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r0, r3)
            throw r2
    }

    public void assemble(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Scanner r3 = r2.scanner
            org.simpleframework.xml.Order r3 = r3.getOrder()
            if (r3 == 0) goto Lf
            org.simpleframework.xml.core.ModelAssembler r0 = r2.assembler
            org.simpleframework.xml.core.Model r1 = r2.root
            r0.assemble(r1, r3)
        Lf:
            return
    }

    public org.simpleframework.xml.core.Structure build(java.lang.Class r7) throws java.lang.Exception {
            r6 = this;
            org.simpleframework.xml.core.Structure r7 = new org.simpleframework.xml.core.Structure
            org.simpleframework.xml.core.Instantiator r1 = r6.factory
            org.simpleframework.xml.core.Model r2 = r6.root
            org.simpleframework.xml.core.Label r3 = r6.version
            org.simpleframework.xml.core.Label r4 = r6.text
            boolean r5 = r6.primitive
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    public void commit(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Instantiator r1 = r0.factory
            if (r1 != 0) goto Lc
            org.simpleframework.xml.core.InstantiatorBuilder r1 = r0.resolver
            org.simpleframework.xml.core.Instantiator r1 = r1.build()
            r0.factory = r1
        Lc:
            return
    }

    public void process(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof org.simpleframework.xml.Attribute
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            r1.process(r2, r3, r0)
        L9:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto L12
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.union(r2, r3, r0)
        L12:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L1b
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.union(r2, r3, r0)
        L1b:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L24
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.union(r2, r3, r0)
        L24:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementList
            if (r0 == 0) goto L2d
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.process(r2, r3, r0)
        L2d:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementArray
            if (r0 == 0) goto L36
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.process(r2, r3, r0)
        L36:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMap
            if (r0 == 0) goto L3f
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.process(r2, r3, r0)
        L3f:
            boolean r0 = r3 instanceof org.simpleframework.xml.Element
            if (r0 == 0) goto L48
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.process(r2, r3, r0)
        L48:
            boolean r0 = r3 instanceof org.simpleframework.xml.Version
            if (r0 == 0) goto L4f
            r1.version(r2, r3)
        L4f:
            boolean r0 = r3 instanceof org.simpleframework.xml.Text
            if (r0 == 0) goto L56
            r1.text(r2, r3)
        L56:
            return
    }

    public void validate(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Scanner r0 = r1.scanner
            org.simpleframework.xml.Order r0 = r0.getOrder()
            r1.validateUnions(r2)
            r1.validateElements(r2, r0)
            r1.validateAttributes(r2, r0)
            r1.validateModel(r2)
            r1.validateText(r2)
            r1.validateTextList(r2)
            return
    }
}
