package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class SignatureBuilder {
    private final java.lang.reflect.Constructor factory;
    private final org.simpleframework.xml.core.SignatureBuilder.ParameterTable table;

    public static class ParameterList extends java.util.ArrayList<org.simpleframework.xml.core.Parameter> {
        public ParameterList() {
                r0 = this;
                r0.<init>()
                return
        }

        public ParameterList(org.simpleframework.xml.core.SignatureBuilder.ParameterList r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class ParameterTable extends java.util.ArrayList<org.simpleframework.xml.core.SignatureBuilder.ParameterList> {
        public ParameterTable() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ int access$000(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r0) {
                int r0 = r0.width()
                return r0
        }

        public static /* synthetic */ int access$100(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r0) {
                int r0 = r0.height()
                return r0
        }

        private int height() {
                r2 = this;
                int r0 = r2.width()
                r1 = 0
                if (r0 <= 0) goto L10
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r2.get(r1)
                int r0 = r0.size()
                return r0
            L10:
                return r1
        }

        private int width() {
                r1 = this;
                int r0 = r1.size()
                return r0
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r1 = r0.get(r1)
                return r1
        }

        public org.simpleframework.xml.core.Parameter get(int r1, int r2) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r1 = r0.get(r1)
                java.lang.Object r1 = r1.get(r2)
                org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
                return r1
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public org.simpleframework.xml.core.SignatureBuilder.ParameterList get(int r3) {
                r2 = this;
                int r0 = r2.size()
            L4:
                if (r0 > r3) goto L11
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r1 = new org.simpleframework.xml.core.SignatureBuilder$ParameterList
                r1.<init>()
                r2.add(r1)
                int r0 = r0 + 1
                goto L4
            L11:
                java.lang.Object r3 = super.get(r3)
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r3 = (org.simpleframework.xml.core.SignatureBuilder.ParameterList) r3
                return r3
        }

        public void insert(org.simpleframework.xml.core.Parameter r1, int r2) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r2 = r0.get(r2)
                if (r2 == 0) goto L9
                r2.add(r1)
            L9:
                return
        }
    }

    public SignatureBuilder(java.lang.reflect.Constructor r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = new org.simpleframework.xml.core.SignatureBuilder$ParameterTable
            r0.<init>()
            r1.table = r0
            r1.factory = r2
            return
    }

    private java.util.List<org.simpleframework.xml.core.Signature> build(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r1.table
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r2 = r1.create()
            return r2
        Ld:
            r0 = 0
            r1.build(r2, r0)
            java.util.List r2 = r1.create(r2)
            return r2
    }

    private void build(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r2, int r3) {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = new org.simpleframework.xml.core.SignatureBuilder$ParameterList
            r0.<init>()
            r1.build(r2, r0, r3)
            return
    }

    private void build(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r6, org.simpleframework.xml.core.SignatureBuilder.ParameterList r7, int r8) {
            r5 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r5.table
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r0.get(r8)
            int r1 = r0.size()
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r2 = r5.table
            int r2 = org.simpleframework.xml.core.SignatureBuilder.ParameterTable.access$000(r2)
            int r2 = r2 + (-1)
            if (r2 <= r8) goto L2f
            r2 = 0
        L15:
            if (r2 >= r1) goto L32
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r3 = new org.simpleframework.xml.core.SignatureBuilder$ParameterList
            r3.<init>(r7)
            if (r7 == 0) goto L2c
            java.lang.Object r4 = r0.get(r2)
            org.simpleframework.xml.core.Parameter r4 = (org.simpleframework.xml.core.Parameter) r4
            r3.add(r4)
            int r4 = r8 + 1
            r5.build(r6, r3, r4)
        L2c:
            int r2 = r2 + 1
            goto L15
        L2f:
            r5.populate(r6, r7, r8)
        L32:
            return
    }

    private java.util.List<org.simpleframework.xml.core.Signature> create() throws java.lang.Exception {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.Signature r1 = new org.simpleframework.xml.core.Signature
            java.lang.reflect.Constructor r2 = r3.factory
            r1.<init>(r2)
            boolean r2 = r3.isValid()
            if (r2 == 0) goto L15
            r0.add(r1)
        L15:
            return r0
    }

    private java.util.List<org.simpleframework.xml.core.Signature> create(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r11) throws java.lang.Exception {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = org.simpleframework.xml.core.SignatureBuilder.ParameterTable.access$100(r11)
            int r2 = org.simpleframework.xml.core.SignatureBuilder.ParameterTable.access$000(r11)
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r1) goto L47
            org.simpleframework.xml.core.Signature r5 = new org.simpleframework.xml.core.Signature
            java.lang.reflect.Constructor r6 = r10.factory
            r5.<init>(r6)
            r6 = r3
        L19:
            if (r6 >= r2) goto L41
            org.simpleframework.xml.core.Parameter r7 = r11.get(r6, r4)
            java.lang.String r8 = r7.getPath()
            java.lang.Object r9 = r7.getKey()
            boolean r9 = r5.contains(r9)
            if (r9 != 0) goto L33
            r5.add(r7)
            int r6 = r6 + 1
            goto L19
        L33:
            org.simpleframework.xml.core.ConstructorException r11 = new org.simpleframework.xml.core.ConstructorException
            java.lang.reflect.Constructor r0 = r10.factory
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}
            java.lang.String r1 = "Parameter '%s' is a duplicate in %s"
            r11.<init>(r1, r0)
            throw r11
        L41:
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L47:
            return r0
    }

    private void populate(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r9, org.simpleframework.xml.core.SignatureBuilder.ParameterList r10, int r11) {
            r8 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r8.table
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r0.get(r11)
            int r1 = r10.size()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L35
            r5 = r3
        L13:
            if (r5 >= r1) goto L25
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r6 = r9.get(r5)
            java.lang.Object r7 = r10.get(r5)
            org.simpleframework.xml.core.Parameter r7 = (org.simpleframework.xml.core.Parameter) r7
            r6.add(r7)
            int r5 = r5 + 1
            goto L13
        L25:
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r5 = r9.get(r11)
            java.lang.Object r6 = r0.get(r4)
            org.simpleframework.xml.core.Parameter r6 = (org.simpleframework.xml.core.Parameter) r6
            r5.add(r6)
            int r4 = r4 + 1
            goto L10
        L35:
            return
    }

    public java.util.List<org.simpleframework.xml.core.Signature> build() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = new org.simpleframework.xml.core.SignatureBuilder$ParameterTable
            r0.<init>()
            java.util.List r0 = r1.build(r0)
            return r0
    }

    public void insert(org.simpleframework.xml.core.Parameter r2, int r3) {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r1.table
            r0.insert(r2, r3)
            return
    }

    public boolean isValid() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.factory
            java.lang.Class[] r0 = r0.getParameterTypes()
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r1 = r2.table
            int r1 = org.simpleframework.xml.core.SignatureBuilder.ParameterTable.access$000(r1)
            int r0 = r0.length
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }
}
