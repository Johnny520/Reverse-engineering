package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Composite implements org.simpleframework.xml.core.Converter {
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Criteria criteria;
    private final org.simpleframework.xml.core.ObjectFactory factory;
    private final org.simpleframework.xml.core.Primitive primitive;
    private final org.simpleframework.xml.core.Revision revision;
    private final org.simpleframework.xml.strategy.Type type;

    /* JADX INFO: renamed from: org.simpleframework.xml.core.Composite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        protected final org.simpleframework.xml.core.Composite composite;
        protected final org.simpleframework.xml.core.Criteria criteria;
        protected final org.simpleframework.xml.core.Schema schema;
        protected final org.simpleframework.xml.core.Instance value;

        public Builder(org.simpleframework.xml.core.Composite r1, org.simpleframework.xml.core.Criteria r2, org.simpleframework.xml.core.Schema r3, org.simpleframework.xml.core.Instance r4) {
                r0 = this;
                r0.<init>()
                r0.composite = r1
                r0.criteria = r2
                r0.schema = r3
                r0.value = r4
                return
        }

        public java.lang.Object read(org.simpleframework.xml.stream.InputNode r5) throws java.lang.Exception {
                r4 = this;
                org.simpleframework.xml.core.Instance r0 = r4.value
                java.lang.Object r0 = r0.getInstance()
                org.simpleframework.xml.core.Schema r1 = r4.schema
                org.simpleframework.xml.core.Section r1 = r1.getSection()
                org.simpleframework.xml.core.Instance r2 = r4.value
                r2.setInstance(r0)
                org.simpleframework.xml.core.Composite r2 = r4.composite
                org.simpleframework.xml.core.Schema r3 = r4.schema
                org.simpleframework.xml.core.Composite.access$100(r2, r5, r0, r3)
                org.simpleframework.xml.core.Composite r2 = r4.composite
                org.simpleframework.xml.core.Composite.access$200(r2, r5, r0, r1)
                org.simpleframework.xml.core.Composite r2 = r4.composite
                org.simpleframework.xml.core.Composite.access$300(r2, r5, r0, r1)
                org.simpleframework.xml.core.Composite r2 = r4.composite
                org.simpleframework.xml.core.Composite.access$400(r2, r5, r0, r1)
                org.simpleframework.xml.core.Criteria r5 = r4.criteria
                r5.commit(r0)
                return r0
        }
    }

    public class Injector extends org.simpleframework.xml.core.Composite.Builder {
        final /* synthetic */ org.simpleframework.xml.core.Composite this$0;

        private Injector(org.simpleframework.xml.core.Composite r1, org.simpleframework.xml.core.Composite r2, org.simpleframework.xml.core.Criteria r3, org.simpleframework.xml.core.Schema r4, org.simpleframework.xml.core.Instance r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4, r5)
                return
        }

        public /* synthetic */ Injector(org.simpleframework.xml.core.Composite r1, org.simpleframework.xml.core.Composite r2, org.simpleframework.xml.core.Criteria r3, org.simpleframework.xml.core.Schema r4, org.simpleframework.xml.core.Instance r5, org.simpleframework.xml.core.Composite.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private java.lang.Object readInject(org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception {
                r1 = this;
                org.simpleframework.xml.core.Schema r2 = r1.schema
                org.simpleframework.xml.core.Instantiator r2 = r2.getInstantiator()
                org.simpleframework.xml.core.Criteria r0 = r1.criteria
                java.lang.Object r2 = r2.getInstance(r0)
                org.simpleframework.xml.core.Instance r0 = r1.value
                r0.setInstance(r2)
                org.simpleframework.xml.core.Criteria r0 = r1.criteria
                r0.commit(r2)
                return r2
        }

        @Override // org.simpleframework.xml.core.Composite.Builder
        public java.lang.Object read(org.simpleframework.xml.stream.InputNode r5) throws java.lang.Exception {
                r4 = this;
                org.simpleframework.xml.core.Schema r0 = r4.schema
                org.simpleframework.xml.core.Section r0 = r0.getSection()
                org.simpleframework.xml.core.Composite r1 = r4.composite
                org.simpleframework.xml.core.Schema r2 = r4.schema
                r3 = 0
                org.simpleframework.xml.core.Composite.access$100(r1, r5, r3, r2)
                org.simpleframework.xml.core.Composite r1 = r4.composite
                org.simpleframework.xml.core.Composite.access$200(r1, r5, r3, r0)
                org.simpleframework.xml.core.Composite r1 = r4.composite
                org.simpleframework.xml.core.Composite.access$300(r1, r5, r3, r0)
                org.simpleframework.xml.core.Composite r1 = r4.composite
                org.simpleframework.xml.core.Composite.access$400(r1, r5, r3, r0)
                java.lang.Object r5 = r4.readInject(r5)
                return r5
        }
    }

    public Composite(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Composite(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, java.lang.Class r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.ObjectFactory r0 = new org.simpleframework.xml.core.ObjectFactory
            r0.<init>(r2, r3, r4)
            r1.factory = r0
            org.simpleframework.xml.core.Primitive r4 = new org.simpleframework.xml.core.Primitive
            r4.<init>(r2, r3)
            r1.primitive = r4
            org.simpleframework.xml.core.Collector r4 = new org.simpleframework.xml.core.Collector
            r4.<init>()
            r1.criteria = r4
            org.simpleframework.xml.core.Revision r4 = new org.simpleframework.xml.core.Revision
            r4.<init>()
            r1.revision = r4
            r1.context = r2
            r1.type = r3
            return
    }

    public static /* synthetic */ void access$100(org.simpleframework.xml.core.Composite r0, org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Schema r3) throws java.lang.Exception {
            r0.readVersion(r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$200(org.simpleframework.xml.core.Composite r0, org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Section r3) throws java.lang.Exception {
            r0.readText(r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$300(org.simpleframework.xml.core.Composite r0, org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Section r3) throws java.lang.Exception {
            r0.readAttributes(r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$400(org.simpleframework.xml.core.Composite r0, org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Section r3) throws java.lang.Exception {
            r0.readElements(r1, r2, r3)
            return
    }

    private boolean isOverridden(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, org.simpleframework.xml.strategy.Type r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ObjectFactory r0 = r1.factory
            boolean r2 = r0.setOverride(r4, r3, r2)
            return r2
    }

    private java.lang.Object read(org.simpleframework.xml.stream.InputNode r2, org.simpleframework.xml.core.Instance r3, java.lang.Class r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Schema r4 = r0.getSchema(r4)
            org.simpleframework.xml.core.Caller r0 = r4.getCaller()
            org.simpleframework.xml.core.Composite$Builder r4 = r1.read(r4, r3)
            java.lang.Object r4 = r4.read(r2)
            r0.validate(r4)
            r0.commit(r4)
            r3.setInstance(r4)
            java.lang.Object r2 = r1.readResolve(r2, r4, r0)
            return r2
    }

    private org.simpleframework.xml.core.Composite.Builder read(org.simpleframework.xml.core.Schema r10, org.simpleframework.xml.core.Instance r11) throws java.lang.Exception {
            r9 = this;
            org.simpleframework.xml.core.Instantiator r0 = r10.getInstantiator()
            boolean r0 = r0.isDefault()
            if (r0 == 0) goto L12
            org.simpleframework.xml.core.Composite$Builder r0 = new org.simpleframework.xml.core.Composite$Builder
            org.simpleframework.xml.core.Criteria r1 = r9.criteria
            r0.<init>(r9, r1, r10, r11)
            return r0
        L12:
            org.simpleframework.xml.core.Composite$Injector r0 = new org.simpleframework.xml.core.Composite$Injector
            org.simpleframework.xml.core.Criteria r5 = r9.criteria
            r8 = 0
            r2 = r0
            r3 = r9
            r4 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
    }

    private void read(org.simpleframework.xml.stream.InputNode r2, java.lang.Object r3, org.simpleframework.xml.core.Schema r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Section r0 = r4.getSection()
            r1.readVersion(r2, r3, r4)
            r1.readSection(r2, r3, r0)
            return
    }

    private void readAttribute(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Section r5, org.simpleframework.xml.core.LabelMap r6) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r5 = r5.getAttribute(r0)
            org.simpleframework.xml.core.Label r0 = r6.getLabel(r5)
            if (r0 != 0) goto L37
            org.simpleframework.xml.stream.Position r3 = r3.getPosition()
            org.simpleframework.xml.core.Context r0 = r2.context
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Class r4 = r0.getType(r1, r4)
            org.simpleframework.xml.core.Context r0 = r2.context
            boolean r6 = r6.isStrict(r0)
            if (r6 == 0) goto L3a
            org.simpleframework.xml.core.Revision r6 = r2.revision
            boolean r6 = r6.isEqual()
            if (r6 != 0) goto L2b
            goto L3a
        L2b:
            org.simpleframework.xml.core.AttributeException r6 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r0 = "Attribute '%s' does not have a match in %s at %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r4, r3}
            r6.<init>(r0, r3)
            throw r6
        L37:
            r2.readInstance(r3, r4, r0)
        L3a:
            return
    }

    private void readAttributes(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Section r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r4.getAttributes()
            org.simpleframework.xml.core.LabelMap r1 = r6.getAttributes()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            org.simpleframework.xml.stream.InputNode r2 = r4.getAttribute(r2)
            if (r2 == 0) goto Lc
            r3.readAttribute(r2, r5, r6, r1)
            goto Lc
        L22:
            r3.validate(r4, r1, r5)
            return
    }

    private void readElement(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Section r6, org.simpleframework.xml.core.LabelMap r7) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.getName()
            java.lang.String r6 = r6.getPath(r0)
            org.simpleframework.xml.core.Label r0 = r7.getLabel(r6)
            if (r0 != 0) goto L14
            org.simpleframework.xml.core.Criteria r0 = r3.criteria
            org.simpleframework.xml.core.Variable r0 = r0.resolve(r6)
        L14:
            if (r0 != 0) goto L43
            org.simpleframework.xml.stream.Position r0 = r4.getPosition()
            org.simpleframework.xml.core.Context r1 = r3.context
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Class r5 = r1.getType(r2, r5)
            org.simpleframework.xml.core.Context r1 = r3.context
            boolean r7 = r7.isStrict(r1)
            if (r7 == 0) goto L3f
            org.simpleframework.xml.core.Revision r7 = r3.revision
            boolean r7 = r7.isEqual()
            if (r7 != 0) goto L33
            goto L3f
        L33:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            java.lang.String r7 = "Element '%s' does not have a match in %s at %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r0}
            r4.<init>(r7, r5)
            throw r4
        L3f:
            r4.skip()
            goto L46
        L43:
            r3.readUnion(r4, r5, r7, r0)
        L46:
            return
    }

    private void readElements(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Section r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.LabelMap r0 = r6.getElements()
            org.simpleframework.xml.stream.InputNode r1 = r4.getNext()
        L8:
            if (r1 == 0) goto L20
            java.lang.String r2 = r1.getName()
            org.simpleframework.xml.core.Section r2 = r6.getSection(r2)
            if (r2 == 0) goto L18
            r3.readSection(r1, r5, r2)
            goto L1b
        L18:
            r3.readElement(r1, r5, r6, r0)
        L1b:
            org.simpleframework.xml.stream.InputNode r1 = r4.getNext()
            goto L8
        L20:
            r3.validate(r4, r0, r5)
            return
    }

    private java.lang.Object readInstance(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Label r6) throws java.lang.Exception {
            r3 = this;
            java.lang.Object r0 = r3.readVariable(r4, r5, r6)
            if (r0 != 0) goto L2d
            org.simpleframework.xml.stream.Position r4 = r4.getPosition()
            org.simpleframework.xml.core.Context r1 = r3.context
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Class r5 = r1.getType(r2, r5)
            boolean r1 = r6.isRequired()
            if (r1 == 0) goto L3a
            org.simpleframework.xml.core.Revision r1 = r3.revision
            boolean r1 = r1.isEqual()
            if (r1 != 0) goto L21
            goto L3a
        L21:
            org.simpleframework.xml.core.ValueRequiredException r0 = new org.simpleframework.xml.core.ValueRequiredException
            java.lang.String r1 = "Empty value for %s in %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r5, r4}
            r0.<init>(r1, r4)
            throw r0
        L2d:
            org.simpleframework.xml.core.Context r4 = r3.context
            java.lang.Object r4 = r6.getEmpty(r4)
            if (r0 == r4) goto L3a
            org.simpleframework.xml.core.Criteria r4 = r3.criteria
            r4.set(r6, r0)
        L3a:
            return r0
    }

    private java.lang.Object readPrimitive(org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.core.Instance r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r4.getType()
            org.simpleframework.xml.core.Primitive r1 = r2.primitive
            java.lang.Object r3 = r1.read(r3, r0)
            if (r0 == 0) goto Lf
            r4.setInstance(r3)
        Lf:
            return r3
    }

    private java.lang.Object readResolve(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Caller r5) throws java.lang.Exception {
            r2 = this;
            if (r4 == 0) goto L27
            org.simpleframework.xml.stream.Position r3 = r3.getPosition()
            java.lang.Object r4 = r5.resolve(r4)
            org.simpleframework.xml.strategy.Type r5 = r2.type
            java.lang.Class r5 = r5.getType()
            java.lang.Class r0 = r4.getClass()
            boolean r1 = r5.isAssignableFrom(r0)
            if (r1 == 0) goto L1b
            return r4
        L1b:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            java.lang.String r1 = "Type %s does not match %s at %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r5, r3}
            r4.<init>(r1, r3)
            throw r4
        L27:
            return r4
    }

    private void readSection(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Section r3) throws java.lang.Exception {
            r0 = this;
            r0.readText(r1, r2, r3)
            r0.readAttributes(r1, r2, r3)
            r0.readElements(r1, r2, r3)
            return
    }

    private void readText(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Section r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Label r3 = r3.getText()
            if (r3 == 0) goto L9
            r0.readInstance(r1, r2, r3)
        L9:
            return
    }

    private void readUnion(org.simpleframework.xml.stream.InputNode r4, java.lang.Object r5, org.simpleframework.xml.core.LabelMap r6, org.simpleframework.xml.core.Label r7) throws java.lang.Exception {
            r3 = this;
            java.lang.Object r4 = r3.readInstance(r4, r5, r7)
            java.lang.String[] r5 = r7.getPaths()
            int r0 = r5.length
            r1 = 0
        La:
            if (r1 >= r0) goto L14
            r2 = r5[r1]
            r6.getLabel(r2)
            int r1 = r1 + 1
            goto La
        L14:
            boolean r5 = r7.isInline()
            if (r5 == 0) goto L1f
            org.simpleframework.xml.core.Criteria r5 = r3.criteria
            r5.set(r7, r4)
        L1f:
            return
    }

    private java.lang.Object readVariable(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Label r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Context r0 = r2.context
            org.simpleframework.xml.core.Converter r0 = r5.getConverter(r0)
            boolean r1 = r5.isCollection()
            if (r1 == 0) goto L2e
            org.simpleframework.xml.core.Criteria r1 = r2.criteria
            org.simpleframework.xml.core.Variable r1 = r1.get(r5)
            org.simpleframework.xml.core.Contact r5 = r5.getContact()
            if (r1 == 0) goto L21
            java.lang.Object r4 = r1.getValue()
            java.lang.Object r3 = r0.read(r3, r4)
            return r3
        L21:
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r5.get(r4)
            if (r4 == 0) goto L2e
            java.lang.Object r3 = r0.read(r3, r4)
            return r3
        L2e:
            java.lang.Object r3 = r0.read(r3)
            return r3
    }

    private void readVersion(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Label r3) throws java.lang.Exception {
            r0 = this;
            java.lang.Object r1 = r0.readInstance(r1, r2, r3)
            org.simpleframework.xml.strategy.Type r2 = r0.type
            java.lang.Class r2 = r2.getType()
            if (r1 == 0) goto L27
            org.simpleframework.xml.core.Context r3 = r0.context
            org.simpleframework.xml.Version r2 = r3.getVersion(r2)
            double r2 = r2.revision()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            org.simpleframework.xml.core.Revision r3 = r0.revision
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L27
            org.simpleframework.xml.core.Revision r3 = r0.revision
            r3.compare(r2, r1)
        L27:
            return
    }

    private void readVersion(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Schema r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r5 = r5.getVersion()
            org.simpleframework.xml.strategy.Type r0 = r2.type
            java.lang.Class r0 = r0.getType()
            if (r5 == 0) goto L42
            java.lang.String r1 = r5.getName()
            org.simpleframework.xml.stream.NodeMap r3 = r3.getAttributes()
            org.simpleframework.xml.stream.Node r3 = r3.remove(r1)
            org.simpleframework.xml.stream.InputNode r3 = (org.simpleframework.xml.stream.InputNode) r3
            if (r3 == 0) goto L20
            r2.readVersion(r3, r4, r5)
            goto L42
        L20:
            org.simpleframework.xml.core.Context r3 = r2.context
            org.simpleframework.xml.Version r3 = r3.getVersion(r0)
            org.simpleframework.xml.core.Revision r4 = r2.revision
            double r0 = r4.getDefault()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            double r0 = r3.revision()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            org.simpleframework.xml.core.Criteria r0 = r2.criteria
            r0.set(r5, r4)
            org.simpleframework.xml.core.Revision r5 = r2.revision
            r5.compare(r3, r4)
        L42:
            return
    }

    private void validate(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.Label r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Context r0 = r3.context
            org.simpleframework.xml.core.Converter r0 = r5.getConverter(r0)
            org.simpleframework.xml.stream.Position r1 = r4.getPosition()
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Class r2 = r2.getType()
            boolean r4 = r0.validate(r4)
            if (r4 == 0) goto L1d
            org.simpleframework.xml.core.Criteria r4 = r3.criteria
            r0 = 0
            r4.set(r5, r0)
            return
        L1d:
            org.simpleframework.xml.core.PersistenceException r4 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r0 = "Invalid value for %s in %s at %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r1}
            r4.<init>(r0, r5)
            throw r4
    }

    private void validate(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.LabelMap r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.stream.Position r4 = r4.getPosition()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r5.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            org.simpleframework.xml.strategy.Type r1 = r3.type
            java.lang.Class r1 = r1.getType()
            boolean r2 = r0.isRequired()
            if (r2 == 0) goto L8
            org.simpleframework.xml.core.Revision r2 = r3.revision
            boolean r2 = r2.isEqual()
            if (r2 != 0) goto L29
            goto L8
        L29:
            org.simpleframework.xml.core.ValueRequiredException r5 = new org.simpleframework.xml.core.ValueRequiredException
            java.lang.String r2 = "Unable to satisfy %s for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r4}
            r5.<init>(r2, r4)
            throw r5
        L35:
            return
    }

    private void validate(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.LabelMap r5, java.lang.Object r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Context r0 = r3.context
            org.simpleframework.xml.strategy.Type r1 = r3.type
            java.lang.Class r6 = r0.getType(r1, r6)
            org.simpleframework.xml.stream.Position r4 = r4.getPosition()
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r5.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            boolean r1 = r0.isRequired()
            if (r1 == 0) goto L37
            org.simpleframework.xml.core.Revision r1 = r3.revision
            boolean r1 = r1.isEqual()
            if (r1 != 0) goto L2b
            goto L37
        L2b:
            org.simpleframework.xml.core.ValueRequiredException r5 = new org.simpleframework.xml.core.ValueRequiredException
            java.lang.String r1 = "Unable to satisfy %s for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r6, r4}
            r5.<init>(r1, r4)
            throw r5
        L37:
            org.simpleframework.xml.core.Context r1 = r3.context
            java.lang.Object r1 = r0.getEmpty(r1)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.Criteria r2 = r3.criteria
            r2.set(r0, r1)
            goto L10
        L45:
            return
    }

    private boolean validate(org.simpleframework.xml.stream.InputNode r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Schema r3 = r0.getSchema(r3)
            org.simpleframework.xml.core.Section r0 = r3.getSection()
            r1.validateText(r2, r3)
            r1.validateSection(r2, r0)
            boolean r2 = r2.isElement()
            return r2
    }

    private void validateAttribute(org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.core.Section r4, org.simpleframework.xml.core.LabelMap r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.Position r0 = r3.getPosition()
            java.lang.String r1 = r3.getName()
            java.lang.String r4 = r4.getAttribute(r1)
            org.simpleframework.xml.core.Label r1 = r5.getLabel(r4)
            if (r1 != 0) goto L35
            org.simpleframework.xml.strategy.Type r3 = r2.type
            java.lang.Class r3 = r3.getType()
            org.simpleframework.xml.core.Context r1 = r2.context
            boolean r5 = r5.isStrict(r1)
            if (r5 == 0) goto L38
            org.simpleframework.xml.core.Revision r5 = r2.revision
            boolean r5 = r5.isEqual()
            if (r5 != 0) goto L29
            goto L38
        L29:
            org.simpleframework.xml.core.AttributeException r5 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r1 = "Attribute '%s' does not exist for %s at %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3, r0}
            r5.<init>(r1, r3)
            throw r5
        L35:
            r2.validate(r3, r1)
        L38:
            return
    }

    private void validateAttributes(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.Section r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.stream.NodeMap r0 = r4.getAttributes()
            org.simpleframework.xml.core.LabelMap r1 = r5.getAttributes()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            org.simpleframework.xml.stream.InputNode r2 = r4.getAttribute(r2)
            if (r2 == 0) goto Lc
            r3.validateAttribute(r2, r5, r1)
            goto Lc
        L22:
            r3.validate(r4, r1)
            return
    }

    private void validateElement(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.Section r5, org.simpleframework.xml.core.LabelMap r6) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.getName()
            java.lang.String r5 = r5.getPath(r0)
            org.simpleframework.xml.core.Label r0 = r6.getLabel(r5)
            if (r0 != 0) goto L14
            org.simpleframework.xml.core.Criteria r0 = r3.criteria
            org.simpleframework.xml.core.Variable r0 = r0.resolve(r5)
        L14:
            if (r0 != 0) goto L41
            org.simpleframework.xml.stream.Position r0 = r4.getPosition()
            org.simpleframework.xml.strategy.Type r1 = r3.type
            java.lang.Class r1 = r1.getType()
            org.simpleframework.xml.core.Context r2 = r3.context
            boolean r6 = r6.isStrict(r2)
            if (r6 == 0) goto L3d
            org.simpleframework.xml.core.Revision r6 = r3.revision
            boolean r6 = r6.isEqual()
            if (r6 != 0) goto L31
            goto L3d
        L31:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            java.lang.String r6 = "Element '%s' does not exist for %s at %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1, r0}
            r4.<init>(r6, r5)
            throw r4
        L3d:
            r4.skip()
            goto L44
        L41:
            r3.validateUnion(r4, r6, r0)
        L44:
            return
    }

    private void validateElements(org.simpleframework.xml.stream.InputNode r4, org.simpleframework.xml.core.Section r5) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.LabelMap r0 = r5.getElements()
            org.simpleframework.xml.stream.InputNode r1 = r4.getNext()
        L8:
            if (r1 == 0) goto L20
            java.lang.String r2 = r1.getName()
            org.simpleframework.xml.core.Section r2 = r5.getSection(r2)
            if (r2 == 0) goto L18
            r3.validateSection(r1, r2)
            goto L1b
        L18:
            r3.validateElement(r1, r5, r0)
        L1b:
            org.simpleframework.xml.stream.InputNode r1 = r4.getNext()
            goto L8
        L20:
            r3.validate(r4, r0)
            return
    }

    private void validateSection(org.simpleframework.xml.stream.InputNode r1, org.simpleframework.xml.core.Section r2) throws java.lang.Exception {
            r0 = this;
            r0.validateAttributes(r1, r2)
            r0.validateElements(r1, r2)
            return
    }

    private void validateText(org.simpleframework.xml.stream.InputNode r1, org.simpleframework.xml.core.Schema r2) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.core.Label r2 = r2.getText()
            if (r2 == 0) goto L9
            r0.validate(r1, r2)
        L9:
            return
    }

    private void validateUnion(org.simpleframework.xml.stream.InputNode r5, org.simpleframework.xml.core.LabelMap r6, org.simpleframework.xml.core.Label r7) throws java.lang.Exception {
            r4 = this;
            java.lang.String[] r0 = r7.getPaths()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            r6.getLabel(r3)
            int r2 = r2 + 1
            goto L6
        L10:
            boolean r6 = r7.isInline()
            if (r6 == 0) goto L1c
            org.simpleframework.xml.core.Criteria r6 = r4.criteria
            r0 = 0
            r6.set(r7, r0)
        L1c:
            r4.validate(r5, r7)
            return
    }

    private void write(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, org.simpleframework.xml.core.Schema r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Section r0 = r4.getSection()
            r1.writeVersion(r2, r3, r4)
            r1.writeSection(r2, r3, r0)
            return
    }

    private void writeAttribute(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Label r5) throws java.lang.Exception {
            r2 = this;
            if (r4 == 0) goto L17
            org.simpleframework.xml.core.Decorator r0 = r5.getDecorator()
            java.lang.String r5 = r5.getName()
            org.simpleframework.xml.core.ObjectFactory r1 = r2.factory
            java.lang.String r4 = r1.getText(r4)
            org.simpleframework.xml.stream.OutputNode r3 = r3.setAttribute(r5, r4)
            r0.decorate(r3)
        L17:
            return
    }

    private void writeAttributes(org.simpleframework.xml.stream.OutputNode r5, java.lang.Object r6, org.simpleframework.xml.core.Section r7) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.core.LabelMap r7 = r7.getAttributes()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r7.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            org.simpleframework.xml.core.Contact r1 = r0.getContact()
            java.lang.Object r1 = r1.get(r6)
            org.simpleframework.xml.core.Context r2 = r4.context
            org.simpleframework.xml.strategy.Type r3 = r4.type
            java.lang.Class r2 = r2.getType(r3, r6)
            if (r1 != 0) goto L2c
            org.simpleframework.xml.core.Context r1 = r4.context
            java.lang.Object r1 = r0.getEmpty(r1)
        L2c:
            if (r1 != 0) goto L41
            boolean r3 = r0.isRequired()
            if (r3 != 0) goto L35
            goto L41
        L35:
            org.simpleframework.xml.core.AttributeException r5 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r6 = "Value for %s is null in %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r2}
            r5.<init>(r6, r7)
            throw r5
        L41:
            r4.writeAttribute(r5, r1, r0)
            goto L8
        L45:
            return
    }

    private void writeElement(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2, org.simpleframework.xml.core.Converter r3) throws java.lang.Exception {
            r0 = this;
            r3.write(r1, r2)
            return
    }

    private void writeElement(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Label r6) throws java.lang.Exception {
            r3 = this;
            if (r5 == 0) goto L3b
            java.lang.Class r0 = r5.getClass()
            org.simpleframework.xml.core.Label r1 = r6.getLabel(r0)
            java.lang.String r2 = r1.getName()
            org.simpleframework.xml.strategy.Type r6 = r6.getType(r0)
            org.simpleframework.xml.stream.OutputNode r4 = r4.getChild(r2)
            boolean r0 = r1.isInline()
            if (r0 != 0) goto L1f
            r3.writeNamespaces(r4, r6, r1)
        L1f:
            boolean r0 = r1.isInline()
            if (r0 != 0) goto L2b
            boolean r6 = r3.isOverridden(r4, r5, r6)
            if (r6 != 0) goto L3b
        L2b:
            org.simpleframework.xml.core.Context r6 = r3.context
            org.simpleframework.xml.core.Converter r6 = r1.getConverter(r6)
            boolean r0 = r1.isData()
            r4.setData(r0)
            r3.writeElement(r4, r5, r6)
        L3b:
            return
    }

    private void writeElements(org.simpleframework.xml.stream.OutputNode r6, java.lang.Object r7, org.simpleframework.xml.core.Section r8) throws java.lang.Exception {
            r5 = this;
            java.util.Iterator r0 = r8.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.simpleframework.xml.core.Section r2 = r8.getSection(r1)
            if (r2 == 0) goto L1e
            org.simpleframework.xml.stream.OutputNode r1 = r6.getChild(r1)
            r5.writeSection(r1, r7, r2)
            goto L4
        L1e:
            java.lang.String r2 = r8.getPath(r1)
            org.simpleframework.xml.core.Label r2 = r8.getElement(r2)
            org.simpleframework.xml.core.Context r3 = r5.context
            org.simpleframework.xml.strategy.Type r4 = r5.type
            java.lang.Class r3 = r3.getType(r4, r7)
            org.simpleframework.xml.core.Criteria r4 = r5.criteria
            org.simpleframework.xml.core.Variable r4 = r4.get(r2)
            if (r4 != 0) goto L4
            if (r2 == 0) goto L3c
            r5.writeUnion(r6, r7, r8, r2)
            goto L4
        L3c:
            org.simpleframework.xml.core.ElementException r6 = new org.simpleframework.xml.core.ElementException
            java.lang.String r7 = "Element '%s' not defined in %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r3}
            r6.<init>(r7, r8)
            throw r6
        L48:
            return
    }

    private void writeNamespaces(org.simpleframework.xml.stream.OutputNode r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r3 = r3.getType()
            org.simpleframework.xml.core.Context r0 = r1.context
            org.simpleframework.xml.core.Decorator r3 = r0.getDecorator(r3)
            org.simpleframework.xml.core.Decorator r4 = r4.getDecorator()
            r4.decorate(r2, r3)
            return
    }

    private java.lang.Object writeReplace(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            if (r3 == 0) goto L10
            java.lang.Class r0 = r3.getClass()
            org.simpleframework.xml.core.Context r1 = r2.context
            org.simpleframework.xml.core.Caller r0 = r1.getCaller(r0)
            java.lang.Object r3 = r0.replace(r3)
        L10:
            return r3
    }

    private void writeSection(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Section r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.NamespaceMap r0 = r3.getNamespaces()
            java.lang.String r1 = r5.getPrefix()
            if (r1 == 0) goto L22
            java.lang.String r0 = r0.getReference(r1)
            if (r0 == 0) goto L14
            r3.setReference(r0)
            goto L22
        L14:
            org.simpleframework.xml.core.ElementException r3 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.strategy.Type r4 = r2.type
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            java.lang.String r5 = "Namespace prefix '%s' in %s is not in scope"
            r3.<init>(r5, r4)
            throw r3
        L22:
            r2.writeAttributes(r3, r4, r5)
            r2.writeElements(r3, r4, r5)
            r2.writeText(r3, r4, r5)
            return
    }

    private void writeText(org.simpleframework.xml.stream.OutputNode r2, java.lang.Object r3, org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L18
            boolean r0 = r4.isTextList()
            if (r0 != 0) goto L18
            org.simpleframework.xml.core.ObjectFactory r0 = r1.factory
            java.lang.String r3 = r0.getText(r3)
            boolean r4 = r4.isData()
            r2.setData(r4)
            r2.setValue(r3)
        L18:
            return
    }

    private void writeText(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Section r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Label r6 = r6.getText()
            if (r6 == 0) goto L36
            org.simpleframework.xml.core.Contact r0 = r6.getContact()
            java.lang.Object r0 = r0.get(r5)
            org.simpleframework.xml.core.Context r1 = r3.context
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Class r5 = r1.getType(r2, r5)
            if (r0 != 0) goto L1e
            org.simpleframework.xml.core.Context r0 = r3.context
            java.lang.Object r0 = r6.getEmpty(r0)
        L1e:
            if (r0 != 0) goto L33
            boolean r1 = r6.isRequired()
            if (r1 != 0) goto L27
            goto L33
        L27:
            org.simpleframework.xml.core.TextException r4 = new org.simpleframework.xml.core.TextException
            java.lang.String r0 = "Value for %s is null in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            r4.<init>(r0, r5)
            throw r4
        L33:
            r3.writeText(r4, r0, r6)
        L36:
            return
    }

    private void writeUnion(org.simpleframework.xml.stream.OutputNode r3, java.lang.Object r4, org.simpleframework.xml.core.Section r5, org.simpleframework.xml.core.Label r6) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Contact r5 = r6.getContact()
            java.lang.Object r5 = r5.get(r4)
            org.simpleframework.xml.core.Context r0 = r2.context
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Class r4 = r0.getType(r1, r4)
            if (r5 != 0) goto L25
            boolean r0 = r6.isRequired()
            if (r0 != 0) goto L19
            goto L25
        L19:
            org.simpleframework.xml.core.ElementException r3 = new org.simpleframework.xml.core.ElementException
            java.lang.String r5 = "Value for %s is null in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4}
            r3.<init>(r5, r4)
            throw r3
        L25:
            java.lang.Object r4 = r2.writeReplace(r5)
            if (r4 == 0) goto L2e
            r2.writeElement(r3, r4, r6)
        L2e:
            org.simpleframework.xml.core.Criteria r3 = r2.criteria
            r3.set(r6, r4)
            return
    }

    private void writeVersion(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5, org.simpleframework.xml.core.Schema r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.Version r5 = r6.getRevision()
            org.simpleframework.xml.core.Label r6 = r6.getVersion()
            if (r5 == 0) goto L31
            org.simpleframework.xml.core.Revision r0 = r3.revision
            double r0 = r0.getDefault()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r5.revision()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            org.simpleframework.xml.core.Revision r1 = r3.revision
            boolean r0 = r1.compare(r5, r0)
            if (r0 == 0) goto L2e
            boolean r0 = r6.isRequired()
            if (r0 == 0) goto L31
            r3.writeAttribute(r4, r5, r6)
            goto L31
        L2e:
            r3.writeAttribute(r4, r5, r6)
        L31:
            return
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.ObjectFactory r0 = r3.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r4)
            java.lang.Class r1 = r0.getType()
            boolean r2 = r0.isReference()
            if (r2 == 0) goto L15
            java.lang.Object r4 = r0.getInstance()
            return r4
        L15:
            org.simpleframework.xml.core.Context r2 = r3.context
            boolean r2 = r2.isPrimitive(r1)
            if (r2 == 0) goto L22
            java.lang.Object r4 = r3.readPrimitive(r4, r0)
            return r4
        L22:
            java.lang.Object r4 = r3.read(r4, r0, r1)
            return r4
    }

    @Override // org.simpleframework.xml.core.Converter
    public java.lang.Object read(org.simpleframework.xml.stream.InputNode r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            org.simpleframework.xml.core.Context r1 = r2.context
            org.simpleframework.xml.core.Schema r0 = r1.getSchema(r0)
            org.simpleframework.xml.core.Caller r1 = r0.getCaller()
            r2.read(r3, r4, r0)
            org.simpleframework.xml.core.Criteria r0 = r2.criteria
            r0.commit(r4)
            r1.validate(r4)
            r1.commit(r4)
            java.lang.Object r3 = r2.readResolve(r3, r4, r1)
            return r3
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.ObjectFactory r0 = r2.factory
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r3)
            boolean r1 = r0.isReference()
            if (r1 != 0) goto L19
            r1 = 0
            r0.setInstance(r1)
            java.lang.Class r0 = r0.getType()
            boolean r3 = r2.validate(r3, r0)
            return r3
        L19:
            r3 = 1
            return r3
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(org.simpleframework.xml.stream.OutputNode r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            org.simpleframework.xml.core.Context r1 = r3.context
            org.simpleframework.xml.core.Schema r0 = r1.getSchema(r0)
            org.simpleframework.xml.core.Caller r1 = r0.getCaller()
            boolean r2 = r0.isPrimitive()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1c
            org.simpleframework.xml.core.Primitive r0 = r3.primitive     // Catch: java.lang.Throwable -> L1a
            r0.write(r4, r5)     // Catch: java.lang.Throwable -> L1a
            goto L22
        L1a:
            r4 = move-exception
            goto L26
        L1c:
            r1.persist(r5)     // Catch: java.lang.Throwable -> L1a
            r3.write(r4, r5, r0)     // Catch: java.lang.Throwable -> L1a
        L22:
            r1.complete(r5)
            return
        L26:
            r1.complete(r5)
            throw r4
    }
}
