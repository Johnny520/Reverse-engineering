package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class PathParser implements org.simpleframework.xml.core.Expression {
    protected boolean attribute;
    protected org.simpleframework.xml.util.Cache<java.lang.String> attributes;
    protected java.lang.StringBuilder builder;
    protected java.lang.String cache;
    protected int count;
    protected char[] data;
    protected org.simpleframework.xml.util.Cache<java.lang.String> elements;
    protected java.util.List<java.lang.Integer> indexes;
    protected java.lang.String location;
    protected java.util.List<java.lang.String> names;
    protected int off;
    protected java.lang.String path;
    protected java.util.List<java.lang.String> prefixes;
    protected int start;
    protected org.simpleframework.xml.stream.Style style;
    protected org.simpleframework.xml.strategy.Type type;

    public class PathSection implements org.simpleframework.xml.core.Expression {
        private int begin;
        private java.util.List<java.lang.String> cache;
        private int end;
        private java.lang.String path;
        private java.lang.String section;
        final /* synthetic */ org.simpleframework.xml.core.PathParser this$0;

        public PathSection(org.simpleframework.xml.core.PathParser r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.cache = r1
                r0.begin = r2
                r0.end = r3
                return
        }

        private java.lang.String getCanonicalPath() {
                r5 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r5.begin
                r3 = 47
                if (r0 >= r2) goto L15
                org.simpleframework.xml.core.PathParser r2 = r5.this$0
                java.lang.String r2 = r2.location
                int r1 = r1 + 1
                int r1 = r2.indexOf(r3, r1)
                int r0 = r0 + 1
                goto L2
            L15:
                r2 = r1
            L16:
                int r4 = r5.end
                if (r0 > r4) goto L32
                org.simpleframework.xml.core.PathParser r4 = r5.this$0
                java.lang.String r4 = r4.location
                int r2 = r2 + 1
                int r2 = r4.indexOf(r3, r2)
                r4 = -1
                if (r2 != r4) goto L2f
                org.simpleframework.xml.core.PathParser r2 = r5.this$0
                java.lang.String r2 = r2.location
                int r2 = r2.length()
            L2f:
                int r0 = r0 + 1
                goto L16
            L32:
                org.simpleframework.xml.core.PathParser r0 = r5.this$0
                java.lang.String r0 = r0.location
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1, r2)
                return r0
        }

        private java.lang.String getFragment() {
                r5 = this;
                org.simpleframework.xml.core.PathParser r0 = r5.this$0
                int r0 = r0.start
                r1 = 0
                r2 = r1
            L6:
                int r3 = r5.end
                if (r1 > r3) goto L28
                org.simpleframework.xml.core.PathParser r3 = r5.this$0
                int r4 = r3.count
                if (r0 < r4) goto L13
                int r0 = r0 + 1
                goto L28
            L13:
                char[] r3 = r3.data
                int r4 = r0 + 1
                char r0 = r3[r0]
                r3 = 47
                if (r0 != r3) goto L26
                int r1 = r1 + 1
                int r0 = r5.begin
                if (r1 != r0) goto L26
                r0 = r4
                r2 = r0
                goto L6
            L26:
                r0 = r4
                goto L6
            L28:
                java.lang.String r1 = new java.lang.String
                org.simpleframework.xml.core.PathParser r3 = r5.this$0
                char[] r3 = r3.data
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                r1.<init>(r3, r2, r0)
                return r1
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getAttribute(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.getPath()
                if (r0 == 0) goto Lc
                org.simpleframework.xml.core.PathParser r1 = r2.this$0
                java.lang.String r3 = r1.getAttributePath(r0, r3)
            Lc:
                return r3
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getElement(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.getPath()
                if (r0 == 0) goto Lc
                org.simpleframework.xml.core.PathParser r1 = r2.this$0
                java.lang.String r3 = r1.getElementPath(r0, r3)
            Lc:
                return r3
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getFirst() {
                r2 = this;
                org.simpleframework.xml.core.PathParser r0 = r2.this$0
                java.util.List<java.lang.String> r0 = r0.names
                int r1 = r2.begin
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public int getIndex() {
                r2 = this;
                org.simpleframework.xml.core.PathParser r0 = r2.this$0
                java.util.List<java.lang.Integer> r0 = r0.indexes
                int r1 = r2.begin
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getLast() {
                r2 = this;
                org.simpleframework.xml.core.PathParser r0 = r2.this$0
                java.util.List<java.lang.String> r0 = r0.names
                int r1 = r2.end
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getPath() {
                r1 = this;
                java.lang.String r0 = r1.section
                if (r0 != 0) goto La
                java.lang.String r0 = r1.getCanonicalPath()
                r1.section = r0
            La:
                java.lang.String r0 = r1.section
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public org.simpleframework.xml.core.Expression getPath(int r2) {
                r1 = this;
                r0 = 0
                org.simpleframework.xml.core.Expression r2 = r1.getPath(r2, r0)
                return r2
        }

        @Override // org.simpleframework.xml.core.Expression
        public org.simpleframework.xml.core.Expression getPath(int r4, int r5) {
                r3 = this;
                org.simpleframework.xml.core.PathParser$PathSection r0 = new org.simpleframework.xml.core.PathParser$PathSection
                org.simpleframework.xml.core.PathParser r1 = r3.this$0
                int r2 = r3.begin
                int r2 = r2 + r4
                int r4 = r3.end
                int r4 = r4 - r5
                r0.<init>(r1, r2, r4)
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String getPrefix() {
                r2 = this;
                org.simpleframework.xml.core.PathParser r0 = r2.this$0
                java.util.List<java.lang.String> r0 = r0.prefixes
                int r1 = r2.begin
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isAttribute() {
                r4 = this;
                org.simpleframework.xml.core.PathParser r0 = r4.this$0
                boolean r1 = r0.attribute
                r2 = 0
                if (r1 == 0) goto L14
                int r1 = r4.end
                java.util.List<java.lang.String> r0 = r0.names
                int r0 = r0.size()
                r3 = 1
                int r0 = r0 - r3
                if (r1 < r0) goto L14
                r2 = r3
            L14:
                return r2
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.begin
                int r1 = r2.end
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public boolean isPath() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.begin
                int r0 = r0 - r1
                r1 = 1
                if (r0 < r1) goto L9
                goto La
            L9:
                r1 = 0
            La:
                return r1
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<java.lang.String> iterator() {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.cache
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L22
                int r0 = r3.begin
            La:
                int r1 = r3.end
                if (r0 > r1) goto L22
                org.simpleframework.xml.core.PathParser r1 = r3.this$0
                java.util.List<java.lang.String> r1 = r1.names
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L1f
                java.util.List<java.lang.String> r2 = r3.cache
                r2.add(r1)
            L1f:
                int r0 = r0 + 1
                goto La
            L22:
                java.util.List<java.lang.String> r0 = r3.cache
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // org.simpleframework.xml.core.Expression
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.path
                if (r0 != 0) goto La
                java.lang.String r0 = r1.getFragment()
                r1.path = r0
            La:
                java.lang.String r0 = r1.path
                return r0
        }
    }

    public PathParser(java.lang.String r2, org.simpleframework.xml.strategy.Type r3, org.simpleframework.xml.stream.Format r4) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.attributes = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.elements = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.indexes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.prefixes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.names = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.builder = r0
            org.simpleframework.xml.stream.Style r4 = r4.getStyle()
            r1.style = r4
            r1.type = r3
            r1.path = r2
            r1.parse(r2)
            return
    }

    private void align() throws java.lang.Exception {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.names
            int r0 = r0.size()
            java.util.List<java.lang.Integer> r1 = r2.indexes
            int r1 = r1.size()
            if (r0 <= r1) goto L18
            java.util.List<java.lang.Integer> r0 = r2.indexes
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L18:
            return
    }

    private void attribute() throws java.lang.Exception {
            r5 = this;
            int r0 = r5.off
            r1 = 1
            int r0 = r0 + r1
            r5.off = r0
        L6:
            int r2 = r5.off
            int r3 = r5.count
            if (r2 >= r3) goto L2f
            char[] r3 = r5.data
            int r4 = r2 + 1
            r5.off = r4
            char r2 = r3[r2]
            boolean r3 = r5.isValid(r2)
            if (r3 == 0) goto L1b
            goto L6
        L1b:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.Character r1 = java.lang.Character.valueOf(r2)
            java.lang.String r2 = r5.path
            org.simpleframework.xml.strategy.Type r3 = r5.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Illegal character '%s' in attribute for '%s' in %s"
            r0.<init>(r2, r1)
            throw r0
        L2f:
            if (r2 <= r0) goto L38
            r5.attribute = r1
            int r2 = r2 - r0
            r5.attribute(r0, r2)
            return
        L38:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r5.path
            org.simpleframework.xml.strategy.Type r2 = r5.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Attribute reference in '%s' for %s is empty"
            r0.<init>(r2, r1)
            throw r0
    }

    private void attribute(int r3, int r4) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.data
            r0.<init>(r1, r3, r4)
            if (r4 <= 0) goto Lc
            r2.attribute(r0)
        Lc:
            return
    }

    private void attribute(java.lang.String r3) {
            r2 = this;
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r3 = r0.getAttribute(r3)
            java.util.List<java.lang.String> r0 = r2.prefixes
            r1 = 0
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r2.names
            r0.add(r3)
            return
    }

    private void build() {
            r8 = this;
            java.util.List<java.lang.String> r0 = r8.names
            int r0 = r0.size()
            int r1 = r0 + (-1)
            r2 = 0
        L9:
            if (r2 >= r0) goto L6c
            java.util.List<java.lang.String> r3 = r8.prefixes
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<java.lang.String> r4 = r8.names
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.Integer> r5 = r8.indexes
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 <= 0) goto L30
            java.lang.StringBuilder r6 = r8.builder
            r7 = 47
            r6.append(r7)
        L30:
            boolean r6 = r8.attribute
            if (r6 == 0) goto L43
            if (r2 != r1) goto L43
            java.lang.StringBuilder r3 = r8.builder
            r5 = 64
            r3.append(r5)
            java.lang.StringBuilder r3 = r8.builder
            r3.append(r4)
            goto L69
        L43:
            if (r3 == 0) goto L51
            java.lang.StringBuilder r6 = r8.builder
            r6.append(r3)
            java.lang.StringBuilder r3 = r8.builder
            r6 = 58
            r3.append(r6)
        L51:
            java.lang.StringBuilder r3 = r8.builder
            r3.append(r4)
            java.lang.StringBuilder r3 = r8.builder
            r4 = 91
            r3.append(r4)
            java.lang.StringBuilder r3 = r8.builder
            r3.append(r5)
            java.lang.StringBuilder r3 = r8.builder
            r4 = 93
            r3.append(r4)
        L69:
            int r2 = r2 + 1
            goto L9
        L6c:
            java.lang.StringBuilder r0 = r8.builder
            java.lang.String r0 = r0.toString()
            r8.location = r0
            return
    }

    private void element() throws java.lang.Exception {
            r5 = this;
            int r0 = r5.off
            r1 = 0
        L3:
            int r2 = r5.off
            int r3 = r5.count
            if (r2 >= r3) goto L46
            char[] r3 = r5.data
            int r4 = r2 + 1
            r5.off = r4
            char r2 = r3[r2]
            boolean r3 = r5.isValid(r2)
            if (r3 != 0) goto L43
            r3 = 64
            if (r2 != r3) goto L22
            int r2 = r5.off
            int r2 = r2 + (-1)
            r5.off = r2
            goto L46
        L22:
            r3 = 91
            if (r2 != r3) goto L2a
            r5.index()
            goto L46
        L2a:
            r3 = 47
            if (r2 != r3) goto L2f
            goto L46
        L2f:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.Character r1 = java.lang.Character.valueOf(r2)
            java.lang.String r2 = r5.path
            org.simpleframework.xml.strategy.Type r3 = r5.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Illegal character '%s' in element for '%s' in %s"
            r0.<init>(r2, r1)
            throw r0
        L43:
            int r1 = r1 + 1
            goto L3
        L46:
            r5.element(r0, r1)
            return
    }

    private void element(int r3, int r4) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.data
            r0.<init>(r1, r3, r4)
            if (r4 <= 0) goto Lc
            r2.element(r0)
        Lc:
            return
    }

    private void element(java.lang.String r3) {
            r2 = this;
            r0 = 58
            int r0 = r3.indexOf(r0)
            if (r0 <= 0) goto L14
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            goto L15
        L14:
            r1 = 0
        L15:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r3 = r0.getElement(r3)
            java.util.List<java.lang.String> r0 = r2.prefixes
            r0.add(r1)
            java.util.List<java.lang.String> r0 = r2.names
            r0.add(r3)
            return
    }

    private void index() throws java.lang.Exception {
            r4 = this;
            char[] r0 = r4.data
            int r1 = r4.off
            int r1 = r1 + (-1)
            char r0 = r0[r1]
            r1 = 91
            r2 = 0
            if (r0 != r1) goto L28
        Ld:
            int r0 = r4.off
            int r1 = r4.count
            if (r0 >= r1) goto L28
            char[] r1 = r4.data
            int r3 = r0 + 1
            r4.off = r3
            char r0 = r1[r0]
            boolean r1 = r4.isDigit(r0)
            if (r1 != 0) goto L22
            goto L28
        L22:
            int r2 = r2 * 10
            int r2 = r2 + r0
            int r2 = r2 + (-48)
            goto Ld
        L28:
            char[] r0 = r4.data
            int r1 = r4.off
            int r3 = r1 + 1
            r4.off = r3
            int r1 = r1 + (-1)
            char r0 = r0[r1]
            r1 = 93
            if (r0 != r1) goto L42
            java.util.List<java.lang.Integer> r0 = r4.indexes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            return
        L42:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r4.path
            org.simpleframework.xml.strategy.Type r2 = r4.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Invalid index for path '%s' in %s"
            r0.<init>(r2, r1)
            throw r0
    }

    private boolean isDigit(char r1) {
            r0 = this;
            boolean r1 = java.lang.Character.isDigit(r1)
            return r1
    }

    private boolean isEmpty(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            int r1 = r1.length()
            if (r1 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private boolean isLetter(char r1) {
            r0 = this;
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            return r1
    }

    private boolean isSpecial(char r2) {
            r1 = this;
            r0 = 95
            if (r2 == r0) goto Lf
            r0 = 45
            if (r2 == r0) goto Lf
            r0 = 58
            if (r2 != r0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    private boolean isValid(char r2) {
            r1 = this;
            boolean r0 = r1.isLetter(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.isSpecial(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    private void parse(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            if (r4 == 0) goto L10
            int r0 = r4.length()
            r3.count = r0
            char[] r1 = new char[r0]
            r3.data = r1
            r2 = 0
            r4.getChars(r2, r0, r1, r2)
        L10:
            r3.path()
            return
    }

    private void path() throws java.lang.Exception {
            r3 = this;
            char[] r0 = r3.data
            int r1 = r3.off
            char r0 = r0[r1]
            r1 = 47
            if (r0 == r1) goto L36
            r1 = 46
            if (r0 != r1) goto L11
            r3.skip()
        L11:
            int r0 = r3.off
            int r1 = r3.count
            if (r0 >= r1) goto L2f
            boolean r0 = r3.attribute
            if (r0 != 0) goto L1f
            r3.segment()
            goto L11
        L1f:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r3.path
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Path '%s' in %s references an invalid attribute"
            r0.<init>(r2, r1)
            throw r0
        L2f:
            r3.truncate()
            r3.build()
            return
        L36:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r3.path
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Path '%s' in %s references document root"
            r0.<init>(r2, r1)
            throw r0
    }

    private void segment() throws java.lang.Exception {
            r3 = this;
            char[] r0 = r3.data
            int r1 = r3.off
            char r0 = r0[r1]
            r1 = 47
            if (r0 == r1) goto L19
            r1 = 64
            if (r0 != r1) goto L12
            r3.attribute()
            goto L15
        L12:
            r3.element()
        L15:
            r3.align()
            return
        L19:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r3.path
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Invalid path expression '%s' in %s"
            r0.<init>(r2, r1)
            throw r0
    }

    private void skip() throws java.lang.Exception {
            r4 = this;
            char[] r0 = r4.data
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L24
            int r1 = r4.off
            int r3 = r1 + 1
            char r0 = r0[r3]
            r3 = 47
            if (r0 != r3) goto L14
            int r1 = r1 + r2
            r4.off = r1
            goto L24
        L14:
            org.simpleframework.xml.core.PathException r0 = new org.simpleframework.xml.core.PathException
            java.lang.String r1 = r4.path
            org.simpleframework.xml.strategy.Type r2 = r4.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Path '%s' in %s has an illegal syntax"
            r0.<init>(r2, r1)
            throw r0
        L24:
            int r0 = r4.off
            int r0 = r0 + r2
            r4.off = r0
            r4.start = r0
            return
    }

    private void truncate() throws java.lang.Exception {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + (-1)
            char[] r2 = r4.data
            int r3 = r2.length
            if (r1 < r3) goto Le
            int r0 = r0 + (-1)
            r4.off = r0
            goto L1a
        Le:
            int r1 = r0 + (-1)
            char r1 = r2[r1]
            r2 = 47
            if (r1 != r2) goto L1a
            int r0 = r0 + (-1)
            r4.off = r0
        L1a:
            return
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getAttribute(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.location
            boolean r0 = r2.isEmpty(r0)
            if (r0 != 0) goto L20
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r2.attributes
            java.lang.Object r0 = r0.fetch(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1f
            java.lang.String r0 = r2.location
            java.lang.String r0 = r2.getAttributePath(r0, r3)
            if (r0 == 0) goto L1f
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r2.attributes
            r1.cache(r3, r0)
        L1f:
            return r0
        L20:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r3 = r0.getAttribute(r3)
            return r3
    }

    public java.lang.String getAttributePath(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getAttribute(r3)
            boolean r0 = r1.isEmpty(r2)
            if (r0 == 0) goto Ld
            return r3
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/@"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getElement(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.location
            boolean r0 = r2.isEmpty(r0)
            if (r0 != 0) goto L20
            org.simpleframework.xml.util.Cache<java.lang.String> r0 = r2.elements
            java.lang.Object r0 = r0.fetch(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1f
            java.lang.String r0 = r2.location
            java.lang.String r0 = r2.getElementPath(r0, r3)
            if (r0 == 0) goto L1f
            org.simpleframework.xml.util.Cache<java.lang.String> r1 = r2.elements
            r1.cache(r3, r0)
        L1f:
            return r0
        L20:
            org.simpleframework.xml.stream.Style r0 = r2.style
            java.lang.String r3 = r0.getElement(r3)
            return r3
    }

    public java.lang.String getElementPath(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.simpleframework.xml.stream.Style r0 = r1.style
            java.lang.String r3 = r0.getElement(r3)
            boolean r0 = r1.isEmpty(r3)
            if (r0 == 0) goto Ld
            return r2
        Ld:
            boolean r0 = r1.isEmpty(r2)
            if (r0 == 0) goto L14
            return r3
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "[1]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getFirst() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.names
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public int getIndex() {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.indexes
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getLast() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.names
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.List<java.lang.String> r1 = r2.names
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.location
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public org.simpleframework.xml.core.Expression getPath(int r2) {
            r1 = this;
            r0 = 0
            org.simpleframework.xml.core.Expression r2 = r1.getPath(r2, r0)
            return r2
    }

    @Override // org.simpleframework.xml.core.Expression
    public org.simpleframework.xml.core.Expression getPath(int r2, int r3) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.names
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r3
            if (r0 < r2) goto L11
            org.simpleframework.xml.core.PathParser$PathSection r3 = new org.simpleframework.xml.core.PathParser$PathSection
            r3.<init>(r1, r2, r0)
            return r3
        L11:
            org.simpleframework.xml.core.PathParser$PathSection r3 = new org.simpleframework.xml.core.PathParser$PathSection
            r3.<init>(r1, r2, r2)
            return r3
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String getPrefix() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.prefixes
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isAttribute() {
            r1 = this;
            boolean r0 = r1.attribute
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isEmpty() {
            r1 = this;
            java.lang.String r0 = r1.location
            boolean r0 = r1.isEmpty(r0)
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isPath() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.names
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.names
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // org.simpleframework.xml.core.Expression
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.off
            int r1 = r4.start
            int r0 = r0 - r1
            java.lang.String r2 = r4.cache
            if (r2 != 0) goto L12
            java.lang.String r2 = new java.lang.String
            char[] r3 = r4.data
            r2.<init>(r3, r1, r0)
            r4.cache = r2
        L12:
            java.lang.String r0 = r4.cache
            return r0
    }
}
