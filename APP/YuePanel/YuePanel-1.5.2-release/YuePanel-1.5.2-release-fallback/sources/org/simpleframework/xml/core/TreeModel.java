package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    private org.simpleframework.xml.core.Model create(java.lang.String r8, java.lang.String r9, int r10) throws java.lang.Exception {
            r7 = this;
            org.simpleframework.xml.core.TreeModel r6 = new org.simpleframework.xml.core.TreeModel
            org.simpleframework.xml.core.Policy r1 = r7.policy
            org.simpleframework.xml.core.Detail r2 = r7.detail
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L19
            org.simpleframework.xml.core.ModelMap r9 = r7.models
            r9.register(r8, r6)
            org.simpleframework.xml.core.TreeModel$OrderList r9 = r7.order
            r9.add(r8)
        L19:
            return r6
    }

    private void validateAttributes(java.lang.Class r4) throws java.lang.Exception {
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
            org.simpleframework.xml.core.AttributeException r0 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r2 = "Ordered attribute '%s' does not exist in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            r0.<init>(r2, r4)
            throw r0
        L34:
            return
    }

    private void validateElements(java.lang.Class r5) throws java.lang.Exception {
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
            org.simpleframework.xml.core.ElementException r0 = new org.simpleframework.xml.core.ElementException
            java.lang.String r2 = "Ordered element '%s' does not exist in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            r0.<init>(r2, r5)
            throw r0
        L37:
            if (r2 == 0) goto L4e
            if (r3 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42
            goto L4e
        L42:
            org.simpleframework.xml.core.ElementException r0 = new org.simpleframework.xml.core.ElementException
            java.lang.String r2 = "Element '%s' is also a path name in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            r0.<init>(r2, r5)
            throw r0
        L4e:
            org.simpleframework.xml.core.Expression r2 = r4.expression
            if (r2 == 0) goto La
            r2.getElement(r1)
            goto La
        L56:
            return
    }

    private void validateExpression(org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Expression r4 = r4.getExpression()
            org.simpleframework.xml.core.Expression r0 = r3.expression
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.getPath()
            java.lang.String r4 = r4.getPath()
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L17
            goto L27
        L17:
            org.simpleframework.xml.core.PathException r1 = new org.simpleframework.xml.core.PathException
            org.simpleframework.xml.core.Detail r2 = r3.detail
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4, r2}
            java.lang.String r0 = "Path '%s' does not match '%s' in %s"
            r1.<init>(r0, r4)
            throw r1
        L25:
            r3.expression = r4
        L27:
            return
    }

    private void validateExpressions(java.lang.Class r2) throws java.lang.Exception {
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

    private void validateModels(java.lang.Class r8) throws java.lang.Exception {
            r7 = this;
            org.simpleframework.xml.core.ModelMap r0 = r7.models
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.ModelList r1 = (org.simpleframework.xml.core.ModelList) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r1.next()
            org.simpleframework.xml.core.Model r3 = (org.simpleframework.xml.core.Model) r3
            if (r3 == 0) goto L17
            java.lang.String r4 = r3.getName()
            int r5 = r3.getIndex()
            int r6 = r2 + 1
            if (r5 != r2) goto L36
            r3.validate(r8)
            r2 = r6
            goto L17
        L36:
            org.simpleframework.xml.core.ElementException r0 = new org.simpleframework.xml.core.ElementException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r4, r1, r8}
            java.lang.String r1 = "Path section '%s[%s]' is out of sequence in %s"
            r0.<init>(r1, r8)
            throw r0
        L46:
            return
    }

    private void validateText(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.text
            if (r0 == 0) goto L2f
            org.simpleframework.xml.core.LabelMap r0 = r2.elements
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            boolean r0 = r2.isComposite()
            if (r0 != 0) goto L13
            goto L2f
        L13:
            org.simpleframework.xml.core.TextException r0 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.core.Label r1 = r2.text
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = "Text annotation %s can not be used with paths in %s"
            r0.<init>(r1, r3)
            throw r0
        L21:
            org.simpleframework.xml.core.TextException r0 = new org.simpleframework.xml.core.TextException
            org.simpleframework.xml.core.Label r1 = r2.text
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = "Text annotation %s used with elements in %s"
            r0.<init>(r1, r3)
            throw r0
        L2f:
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.LabelMap getAttributes() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            org.simpleframework.xml.core.LabelMap r0 = r0.getLabels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.LabelMap getElements() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            org.simpleframework.xml.core.LabelMap r0 = r0.getLabels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Expression getExpression() {
            r1 = this;
            org.simpleframework.xml.core.Expression r0 = r1.expression
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.ModelMap getModels() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            org.simpleframework.xml.core.ModelMap r0 = r0.getModels()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = r1.prefix
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Label getText() {
            r1 = this;
            org.simpleframework.xml.core.Label r0 = r1.list
            if (r0 == 0) goto L5
            return r0
        L5:
            org.simpleframework.xml.core.Label r0 = r1.text
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isAttribute(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            boolean r2 = r0.containsKey(r2)
            return r2
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
            org.simpleframework.xml.core.ModelMap r0 = r4.models
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isElement(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            boolean r2 = r0.containsKey(r2)
            return r2
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
            boolean r0 = r2.isComposite()
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isModel(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.TreeModel$OrderList r1 = r3.order
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto Lb
        L1b:
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model lookup(java.lang.String r2, int r3) {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            org.simpleframework.xml.core.Model r2 = r0.lookup(r2, r3)
            return r2
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model lookup(org.simpleframework.xml.core.Expression r4) {
            r3 = this;
            java.lang.String r0 = r4.getFirst()
            int r1 = r4.getIndex()
            org.simpleframework.xml.core.Model r0 = r3.lookup(r0, r1)
            boolean r1 = r4.isPath()
            if (r1 == 0) goto L1f
            r1 = 1
            r2 = 0
            org.simpleframework.xml.core.Expression r4 = r4.getPath(r1, r2)
            if (r0 == 0) goto L1f
            org.simpleframework.xml.core.Model r4 = r0.lookup(r4)
            return r4
        L1f:
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public org.simpleframework.xml.core.Model register(java.lang.String r2, java.lang.String r3, int r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.ModelMap r0 = r1.models
            org.simpleframework.xml.core.Model r0 = r0.lookup(r2, r4)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.core.Model r2 = r1.create(r2, r3, r4)
            return r2
        Ld:
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public void register(org.simpleframework.xml.core.Label r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto La
            r1.registerAttribute(r2)
            goto L17
        La:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L14
            r1.registerText(r2)
            goto L17
        L14:
            r1.registerElement(r2)
        L17:
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.LabelMap r0 = r2.attributes
            r1 = 0
            r0.put(r3, r1)
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.getName()
            org.simpleframework.xml.core.LabelMap r1 = r3.attributes
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L12
            org.simpleframework.xml.core.LabelMap r1 = r3.attributes
            r1.put(r0, r4)
            return
        L12:
            org.simpleframework.xml.core.AttributeException r1 = new org.simpleframework.xml.core.AttributeException
            java.lang.String r2 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            r1.<init>(r2, r4)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.TreeModel$OrderList r0 = r2.order
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto Ld
            org.simpleframework.xml.core.TreeModel$OrderList r0 = r2.order
            r0.add(r3)
        Ld:
            org.simpleframework.xml.core.LabelMap r0 = r2.elements
            r1 = 0
            r0.put(r3, r1)
            return
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(org.simpleframework.xml.core.Label r4) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.getName()
            org.simpleframework.xml.core.LabelMap r1 = r3.elements
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L27
            org.simpleframework.xml.core.TreeModel$OrderList r1 = r3.order
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L19
            org.simpleframework.xml.core.TreeModel$OrderList r1 = r3.order
            r1.add(r0)
        L19:
            boolean r1 = r4.isTextList()
            if (r1 == 0) goto L21
            r3.list = r4
        L21:
            org.simpleframework.xml.core.LabelMap r1 = r3.elements
            r1.put(r0, r4)
            return
        L27:
            org.simpleframework.xml.core.ElementException r1 = new org.simpleframework.xml.core.ElementException
            java.lang.String r2 = "Duplicate annotation of name '%s' on %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            r1.<init>(r2, r4)
            throw r1
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerText(org.simpleframework.xml.core.Label r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.text
            if (r0 != 0) goto L7
            r2.text = r3
            return
        L7:
            org.simpleframework.xml.core.TextException r0 = new org.simpleframework.xml.core.TextException
            java.lang.String r1 = "Duplicate text annotation on %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r1 = r2.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "model '%s[%s]'"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Model
    public void validate(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            r0.validateExpressions(r1)
            r0.validateAttributes(r1)
            r0.validateElements(r1)
            r0.validateModels(r1)
            r0.validateText(r1)
            return
    }
}
