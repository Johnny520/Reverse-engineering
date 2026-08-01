package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Support implements org.simpleframework.xml.filter.Filter {
    private final org.simpleframework.xml.core.DetailExtractor defaults;
    private final org.simpleframework.xml.core.DetailExtractor details;
    private final org.simpleframework.xml.filter.Filter filter;
    private final org.simpleframework.xml.stream.Format format;
    private final org.simpleframework.xml.core.InstanceFactory instances;
    private final org.simpleframework.xml.core.LabelExtractor labels;
    private final org.simpleframework.xml.transform.Matcher matcher;
    private final org.simpleframework.xml.core.ScannerFactory scanners;
    private final org.simpleframework.xml.transform.Transformer transform;

    public Support() {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public Support(org.simpleframework.xml.filter.Filter r2) {
            r1 = this;
            org.simpleframework.xml.core.EmptyMatcher r0 = new org.simpleframework.xml.core.EmptyMatcher
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public Support(org.simpleframework.xml.filter.Filter r2, org.simpleframework.xml.transform.Matcher r3) {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    public Support(org.simpleframework.xml.filter.Filter r3, org.simpleframework.xml.transform.Matcher r4, org.simpleframework.xml.stream.Format r5) {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.DetailExtractor r0 = new org.simpleframework.xml.core.DetailExtractor
            org.simpleframework.xml.DefaultType r1 = org.simpleframework.xml.DefaultType.FIELD
            r0.<init>(r2, r1)
            r2.defaults = r0
            org.simpleframework.xml.transform.Transformer r0 = new org.simpleframework.xml.transform.Transformer
            r0.<init>(r4)
            r2.transform = r0
            org.simpleframework.xml.core.ScannerFactory r0 = new org.simpleframework.xml.core.ScannerFactory
            r0.<init>(r2)
            r2.scanners = r0
            org.simpleframework.xml.core.DetailExtractor r0 = new org.simpleframework.xml.core.DetailExtractor
            r0.<init>(r2)
            r2.details = r0
            org.simpleframework.xml.core.LabelExtractor r0 = new org.simpleframework.xml.core.LabelExtractor
            r0.<init>(r5)
            r2.labels = r0
            org.simpleframework.xml.core.InstanceFactory r0 = new org.simpleframework.xml.core.InstanceFactory
            r0.<init>()
            r2.instances = r0
            r2.matcher = r4
            r2.filter = r3
            r2.format = r5
            return
    }

    private java.lang.String getClassName(java.lang.Class r1) {
            r0 = this;
            boolean r0 = r1.isArray()
            if (r0 == 0) goto La
            java.lang.Class r1 = r1.getComponentType()
        La:
            java.lang.String r0 = r1.getSimpleName()
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L15
            return r0
        L15:
            java.lang.String r0 = org.simpleframework.xml.core.Reflector.getName(r0)
            return r0
    }

    public static java.lang.Class getPrimitive(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L37
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
        L37:
            return r1
    }

    public static boolean isAssignable(java.lang.Class r1, java.lang.Class r2) {
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto La
            java.lang.Class r1 = getPrimitive(r1)
        La:
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L14
            java.lang.Class r2 = getPrimitive(r2)
        L14:
            boolean r1 = r2.isAssignableFrom(r1)
            return r1
    }

    public static boolean isFloat(java.lang.Class r2) {
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r1 = 1
            if (r2 != r0) goto L6
            return r1
        L6:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r2 != r0) goto Lb
            return r1
        Lb:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L10
            return r1
        L10:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L15
            return r1
        L15:
            r2 = 0
            return r2
    }

    public org.simpleframework.xml.core.Detail getDetail(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.Detail r1 = r1.getDetail(r2, r0)
            return r1
    }

    public org.simpleframework.xml.core.Detail getDetail(java.lang.Class r1, org.simpleframework.xml.DefaultType r2) {
            r0 = this;
            if (r2 == 0) goto L9
            org.simpleframework.xml.core.DetailExtractor r0 = r0.defaults
            org.simpleframework.xml.core.Detail r0 = r0.getDetail(r1)
            return r0
        L9:
            org.simpleframework.xml.core.DetailExtractor r0 = r0.details
            org.simpleframework.xml.core.Detail r0 = r0.getDetail(r1)
            return r0
    }

    public org.simpleframework.xml.core.ContactList getFields(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.ContactList r1 = r1.getFields(r2, r0)
            return r1
    }

    public org.simpleframework.xml.core.ContactList getFields(java.lang.Class r1, org.simpleframework.xml.DefaultType r2) {
            r0 = this;
            if (r2 == 0) goto L9
            org.simpleframework.xml.core.DetailExtractor r0 = r0.defaults
            org.simpleframework.xml.core.ContactList r0 = r0.getFields(r1)
            return r0
        L9:
            org.simpleframework.xml.core.DetailExtractor r0 = r0.details
            org.simpleframework.xml.core.ContactList r0 = r0.getFields(r1)
            return r0
    }

    public org.simpleframework.xml.stream.Format getFormat() {
            r0 = this;
            org.simpleframework.xml.stream.Format r0 = r0.format
            return r0
    }

    public org.simpleframework.xml.core.Instance getInstance(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.InstanceFactory r0 = r0.instances
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            return r0
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r1) {
            r0 = this;
            org.simpleframework.xml.core.InstanceFactory r0 = r0.instances
            org.simpleframework.xml.core.Instance r0 = r0.getInstance(r1)
            return r0
    }

    public org.simpleframework.xml.core.Label getLabel(org.simpleframework.xml.core.Contact r1, java.lang.annotation.Annotation r2) {
            r0 = this;
            org.simpleframework.xml.core.LabelExtractor r0 = r0.labels
            org.simpleframework.xml.core.Label r0 = r0.getLabel(r1, r2)
            return r0
    }

    public java.util.List<org.simpleframework.xml.core.Label> getLabels(org.simpleframework.xml.core.Contact r1, java.lang.annotation.Annotation r2) {
            r0 = this;
            org.simpleframework.xml.core.LabelExtractor r0 = r0.labels
            java.util.List r0 = r0.getList(r1, r2)
            return r0
    }

    public org.simpleframework.xml.core.ContactList getMethods(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.ContactList r1 = r1.getMethods(r2, r0)
            return r1
    }

    public org.simpleframework.xml.core.ContactList getMethods(java.lang.Class r1, org.simpleframework.xml.DefaultType r2) {
            r0 = this;
            if (r2 == 0) goto L9
            org.simpleframework.xml.core.DetailExtractor r0 = r0.defaults
            org.simpleframework.xml.core.ContactList r0 = r0.getMethods(r1)
            return r0
        L9:
            org.simpleframework.xml.core.DetailExtractor r0 = r0.details
            org.simpleframework.xml.core.ContactList r0 = r0.getMethods(r1)
            return r0
    }

    public java.lang.String getName(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.Scanner r0 = r1.getScanner(r2)
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r1.getClassName(r2)
            return r1
    }

    public org.simpleframework.xml.core.Scanner getScanner(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.core.ScannerFactory r0 = r0.scanners
            org.simpleframework.xml.core.Scanner r0 = r0.getInstance(r1)
            return r0
    }

    public org.simpleframework.xml.stream.Style getStyle() {
            r0 = this;
            org.simpleframework.xml.stream.Format r0 = r0.format
            org.simpleframework.xml.stream.Style r0 = r0.getStyle()
            return r0
    }

    public org.simpleframework.xml.transform.Transform getTransform(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.transform.Matcher r0 = r0.matcher
            org.simpleframework.xml.transform.Transform r0 = r0.match(r1)
            return r0
    }

    public boolean isContainer(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r2)
            r0 = 1
            if (r1 == 0) goto La
            return r0
        La:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L13
            return r0
        L13:
            boolean r1 = r2.isArray()
            return r1
    }

    public boolean isPrimitive(java.lang.Class r3) {
            r2 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 1
            if (r3 != r0) goto L6
            return r1
        L6:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r3 != r0) goto Lb
            return r1
        Lb:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r3 != r0) goto L10
            return r1
        L10:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r3 != r0) goto L15
            return r1
        L15:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r3 != r0) goto L1a
            return r1
        L1a:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 != r0) goto L1f
            return r1
        L1f:
            boolean r0 = r3.isEnum()
            if (r0 == 0) goto L26
            return r1
        L26:
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L2d
            return r1
        L2d:
            org.simpleframework.xml.transform.Transformer r2 = r2.transform
            boolean r2 = r2.valid(r3)
            return r2
    }

    public java.lang.Object read(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.transform.Transformer r0 = r0.transform
            java.lang.Object r0 = r0.read(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.filter.Filter
    public java.lang.String replace(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.filter.Filter r0 = r0.filter
            java.lang.String r0 = r0.replace(r1)
            return r0
    }

    public boolean valid(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.transform.Transformer r0 = r0.transform
            boolean r0 = r0.valid(r1)
            return r0
    }

    public java.lang.String write(java.lang.Object r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.transform.Transformer r0 = r0.transform
            java.lang.String r0 = r0.write(r1, r2)
            return r0
    }
}
