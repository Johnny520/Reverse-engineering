package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class TreeModel implements org.simpleframework.xml.core.Model {
    private org.simpleframework.xml.core.LabelMap attributes;
    private org.simpleframework.xml.core.Detail detail;
    private org.simpleframework.xml.core.LabelMap elements;
    private org.simpleframework.xml.core.Expression expression;
    private int index;
    private org.simpleframework.xml.core.Label list;
    private org.simpleframework.xml.core.ModelMap models;
    private java.lang.String name;
    private org.simpleframework.xml.core.TreeModel.OrderList order;
    private org.simpleframework.xml.core.Policy policy;
    private java.lang.String prefix;
    private org.simpleframework.xml.core.Label text;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class OrderList extends java.util.ArrayList<java.lang.String> {
        public OrderList() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public TreeModel(org.simpleframework.xml.core.Policy r7, org.simpleframework.xml.core.Detail r8) {
            r6 = this;
            r4 = 0
            r5 = 1
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TreeModel(org.simpleframework.xml.core.Policy r2, org.simpleframework.xml.core.Detail r3, java.lang.String r4, java.lang.String r5, int r6) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            r0.<init>(r2)
            r1.attributes = r0
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            r0.<init>(r2)
            r1.elements = r0
            org.simpleframework.xml.core.ModelMap r0 = new org.simpleframework.xml.core.ModelMap
            r0.<init>(r3)
            r1.models = r0
            org.simpleframework.xml.core.TreeModel$OrderList r0 = new org.simpleframework.xml.core.TreeModel$OrderList
            r0.<init>()
            r1.order = r0
            r1.detail = r3
            r1.policy = r2
            r1.prefix = r5
            r1.index = r6
            r1.name = r4
            return
    }

    private org.simpleframework.xml.core.Model create(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            org.simpleframework.xml.core.TreeModel r0 = new org.simpleframework.xml.core.TreeModel
            org.simpleframework.xml.core.Policy r1 = r6.policy
            org.simpleframework.xml.core.Detail r2 = r6.detail
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L18
            org.simpleframework.xml.core.ModelMap r7 = r6.models
            r7.register(r3, r0)
            org.simpleframework.xml.core.TreeModel$OrderList r6 = r6.order
            r6.add(r3)
        L18:
            return r0
    }

    private void validateAttributes(java.lang.Class r4) {
            r3 = this;
            org.simpleframework.xml.core.LabelMap r0 = r3.attributes
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.simpleframework.xml.core.LabelMap r2 = r3.attributes
            java.lang.Object r2 = r2.get(r1)
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
            if (r2 == 0) goto L28
            org.simpleframework.xml.core.Expression r2 = r3.expression
            if (r2 == 0) goto La
            r2.getAttribute(r1)
            goto La
        L28:
            org.simpleframework.xml.core.AttributeException r3 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r0 = "Ordered attribute '%s' does not exist in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            r3.<init>(r0, r4)
            throw r3
        L34:
            return
    }

    private void validateElements(java.lang.Class r5) {
            r4 = this;
            org.simpleframework.xml.core.LabelMap r0 = r4.elements
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.simpleframework.xml.core.ModelMap r2 = r4.models
            java.lang.Object r2 = r2.get(r1)
            org.simpleframework.xml.core.ModelList r2 = (org.simpleframework.xml.core.ModelList) r2
            org.simpleframework.xml.core.LabelMap r3 = r4.elements
            java.lang.Object r3 = r3.get(r1)
            org.simpleframework.xml.core.Label r3 = (org.simpleframework.xml.core.Label) r3
            if (r2 != 0) goto L37
            if (r3 == 0) goto L2b
            goto L37
        L2b:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            java.lang.String r0 = "Ordered element '%s' does not exist in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            r4.<init>(r0, r5)
            throw r4
        L37:
            if (r2 == 0) goto L4e
            if (r3 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42
            goto L4e
        L42:
            org.simpleframework.xml.core.ElementException r4 = new org.simpleframework.xml.core.ElementException
            java.lang.String r0 = "Element '%s' is also a path name in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            r4.<init>(r0, r5)
            throw r4
        L4e:
            org.simpleframework.xml.core.Expression r2 = r4.expression
            if (r2 == 0) goto La
            r2.getElement(r1)
            goto La
        L56:
            return
    }

    private void validateExpression(org.simpleframework.xml.core.Label r3) {
            r2 = this;
            org.simpleframework.xml.core.Expression r3 = r3.getExpression()
            org.simpleframework.xml.core.Expression r0 = r2.expression
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.getPath()
            java.lang.String r3 = r3.getPath()
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L17
            return
        L17:
            org.simpleframework.xml.core.PathException r1 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r2 = r2.detail
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r3, r2}
            java.lang.String r3 = "Path '%s' does not match '%s' in %s"
            r1.<init>(r3, r2)
            throw r1
        L25:
            r2.expression = r3
            return
    }

    private void validateExpressions(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r2 = r1.elements
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            if (r0 == 0) goto L6
            r1.validateExpression(r0)
            goto L6
        L18:
            org.simpleframework.xml.core.LabelMap r2 = r1.attributes
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            if (r0 == 0) goto L1e
            r1.validateExpression(r0)
            goto L1e
        L30:
            org.simpleframework.xml.core.Label r2 = r1.text
            if (r2 == 0) goto L37
            r1.validateExpression(r2)
        L37:
            return
    }

    private void validateModels(java.lang.Class r7) {
            r6 = this;
            org.simpleframework.xml.core.ModelMap r6 = r6.models
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r6.next()
            org.simpleframework.xml.core.ModelList r0 = (org.simpleframework.xml.core.ModelList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6
            java.lang.Object r2 = r0.next()
            org.simpleframework.xml.core.Model r2 = (org.simpleframework.xml.core.Model) r2
            if (r2 == 0) goto L17
            java.lang.String r3 = r2.getName()
            int r4 = r2.getIndex()
            int r5 = r1 + 1
            if (r4 != r1) goto L36
            r2.validate(r7)
            r1 = r5
            goto L17
        L36:
            org.simpleframework.xml.core.ElementException r6 = new org.simpleframework.xml.core.ElementException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r0, r7}
            java.lang.String r0 = "Path section '%s[%s]' is out of sequence in %s"
            r6.<init>(r0, r7)
            throw r6
        L46:
            return
    }

    private void validateText(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.text
            if (r0 == 0) goto L2f
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            boolean r0 = r1.isComposite()
            if (r0 != 0) goto L13
            goto L2f
        L13:
            org.simpleframework.xml.core.TextException r0 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.core.Label r1 = r1.text
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Text annotation %s can not be used with paths in %s"
            r0.<init>(r2, r1)
            throw r0
        L21:
            org.simpleframework.xml.core.TextException r0 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.core.Label r1 = r1.text
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Text annotation %s used with elements in %s"
            r0.<init>(r2, r1)
            throw r0
        L2f:
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.LabelMap getAttributes() {
            r0 = this;
            org.simpleframework.xml.core.LabelMap r0 = r0.attributes
            org.simpleframework.xml.core.LabelMap r0 = r0.getLabels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.LabelMap getElements() {
            r0 = this;
            org.simpleframework.xml.core.LabelMap r0 = r0.elements
            org.simpleframework.xml.core.LabelMap r0 = r0.getLabels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Expression getExpression() {
            r0 = this;
            org.simpleframework.xml.core.Expression r0 = r0.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public int getIndex() {
            r0 = this;
            int r0 = r0.index
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.ModelMap getModels() {
            r0 = this;
            org.simpleframework.xml.core.ModelMap r0 = r0.models
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public java.lang.String getPrefix() {
            r0 = this;
            java.lang.String r0 = r0.prefix
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Label getText() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.list
            if (r0 == 0) goto L5
            return r0
        L5:
            org.simpleframework.xml.core.Label r1 = r1.text
            return r1
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isAttribute(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.LabelMap r0 = r0.attributes
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isComposite() {
            r4 = this;
            org.simpleframework.xml.core.ModelMap r0 = r4.models
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.ModelList r1 = (org.simpleframework.xml.core.ModelList) r1
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r1.next()
            org.simpleframework.xml.core.Model r3 = (org.simpleframework.xml.core.Model) r3
            if (r3 == 0) goto L17
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L17
            return r2
        L2c:
            org.simpleframework.xml.core.ModelMap r4 = r4.models
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r2
            return r4
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isElement(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.LabelMap r0 = r0.elements
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isEmpty() {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.text
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            org.simpleframework.xml.core.LabelMap r0 = r2.elements
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            org.simpleframework.xml.core.LabelMap r0 = r2.attributes
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            return r1
        L18:
            boolean r2 = r2.isComposite()
            r2 = r2 ^ 1
            return r2
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isModel(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.ModelMap r0 = r0.models
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.TreeModel$OrderList r2 = r2.order
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lb
        L1b:
            java.util.Iterator r2 = r0.iterator()
            return r2
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model lookup(java.lang.String r1, int r2) {
            r0 = this;
            org.simpleframework.xml.core.ModelMap r0 = r0.models
            org.simpleframework.xml.core.Model r0 = r0.lookup(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model lookup(org.simpleframework.xml.core.Expression r3) {
            r2 = this;
            java.lang.String r0 = r3.getFirst()
            int r1 = r3.getIndex()
            org.simpleframework.xml.core.Model r2 = r2.lookup(r0, r1)
            boolean r0 = r3.isPath()
            if (r0 == 0) goto L1e
            r0 = 1
            r1 = 0
            org.simpleframework.xml.core.Expression r3 = r3.getPath(r0, r1)
            if (r2 == 0) goto L1e
            org.simpleframework.xml.core.Model r2 = r2.lookup(r3)
        L1e:
            return r2
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model register(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            org.simpleframework.xml.core.Model r0 = r0.lookup(r2, r4)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.core.Model r1 = r1.create(r2, r3, r4)
            return r1
        Ld:
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public void register(org.simpleframework.xml.core.Label r2) {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto La
            r1.registerAttribute(r2)
            return
        La:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L14
            r1.registerText(r2)
            return
        L14:
            r1.registerElement(r2)
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r1 = r1.attributes
            r0 = 0
            r1.put(r2, r0)
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(org.simpleframework.xml.core.Label r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            org.simpleframework.xml.core.LabelMap r1 = r2.attributes
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L12
            org.simpleframework.xml.core.LabelMap r2 = r2.attributes
            r2.put(r0, r3)
            return
        L12:
            org.simpleframework.xml.core.AttributeException r2 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r1 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            r2.<init>(r1, r3)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.TreeModel$OrderList r0 = r1.order
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.core.TreeModel$OrderList r0 = r1.order
            r0.add(r2)
        Ld:
            org.simpleframework.xml.core.LabelMap r1 = r1.elements
            r0 = 0
            r1.put(r2, r0)
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(org.simpleframework.xml.core.Label r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L27
            org.simpleframework.xml.core.TreeModel$OrderList r1 = r2.order
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L19
            org.simpleframework.xml.core.TreeModel$OrderList r1 = r2.order
            r1.add(r0)
        L19:
            boolean r1 = r3.isTextList()
            if (r1 == 0) goto L21
            r2.list = r3
        L21:
            org.simpleframework.xml.core.LabelMap r2 = r2.elements
            r2.put(r0, r3)
            return
        L27:
            org.simpleframework.xml.core.ElementException r2 = new org.simpleframework.xml.core.ElementException
            java.lang.String r1 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            r2.<init>(r1, r3)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerText(org.simpleframework.xml.core.Label r2) {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.text
            if (r0 != 0) goto L7
            r1.text = r2
            return
        L7:
            org.simpleframework.xml.core.TextException r1 = new org.simpleframework.xml.core.TextException
            java.lang.String r0 = "Duplicate text annotation on %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.name
            int r3 = r3.index
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "model '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "]'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // org.simpleframework.xml.core.Model
    public void validate(java.lang.Class r1) {
            r0 = this;
            r0.validateExpressions(r1)
            r0.validateAttributes(r1)
            r0.validateElements(r1)
            r0.validateModels(r1)
            r0.validateText(r1)
            return
    }
}
