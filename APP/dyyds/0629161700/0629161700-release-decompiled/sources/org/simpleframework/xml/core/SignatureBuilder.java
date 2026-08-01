package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class SignatureBuilder {
    private final java.lang.reflect.Constructor factory;
    private final org.simpleframework.xml.core.SignatureBuilder.ParameterTable table;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r2 = r2.get(r1)
                int r2 = r2.size()
                return r2
            L10:
                return r1
        }

        private int width() {
                r0 = this;
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r0.get(r1)
                return r0
        }

        public org.simpleframework.xml.core.Parameter get(int r1, int r2) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r0.get(r1)
                java.lang.Object r0 = r0.get(r2)
                org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
                return r0
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
                java.lang.Object r2 = super.get(r3)
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r2 = (org.simpleframework.xml.core.SignatureBuilder.ParameterList) r2
                return r2
        }

        public void insert(org.simpleframework.xml.core.Parameter r1, int r2) {
                r0 = this;
                org.simpleframework.xml.core.SignatureBuilder$ParameterList r0 = r0.get(r2)
                if (r0 == 0) goto L9
                r0.add(r1)
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

    private java.util.List<org.simpleframework.xml.core.Signature> build(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r2) {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r1.table
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r1 = r1.create()
            return r1
        Ld:
            r0 = 0
            r1.build(r2, r0)
            java.util.List r1 = r1.create(r2)
            return r1
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
            if (r2 <= r8) goto L30
            r2 = 0
        L15:
            if (r2 >= r1) goto L2f
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
            return
        L30:
            r5.populate(r6, r7, r8)
            return
    }

    private java.util.List<org.simpleframework.xml.core.Signature> create() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.simpleframework.xml.core.Signature r1 = new org.simpleframework.xml.core.Signature
            java.lang.reflect.Constructor r2 = r3.factory
            r1.<init>(r2)
            boolean r3 = r3.isValid()
            if (r3 == 0) goto L15
            r0.add(r1)
        L15:
            return r0
    }

    private java.util.List<org.simpleframework.xml.core.Signature> create(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r11) {
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
            java.lang.reflect.Constructor r10 = r10.factory
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r10}
            java.lang.String r0 = "Parameter '%s' is a duplicate in %s"
            r11.<init>(r0, r10)
            throw r11
        L41:
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L47:
            return r0
    }

    private void populate(org.simpleframework.xml.core.SignatureBuilder.ParameterTable r8, org.simpleframework.xml.core.SignatureBuilder.ParameterList r9, int r10) {
            r7 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r7 = r7.table
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r7 = r7.get(r10)
            int r0 = r9.size()
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L35
            r4 = r2
        L13:
            if (r4 >= r0) goto L25
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r5 = r8.get(r4)
            java.lang.Object r6 = r9.get(r4)
            org.simpleframework.xml.core.Parameter r6 = (org.simpleframework.xml.core.Parameter) r6
            r5.add(r6)
            int r4 = r4 + 1
            goto L13
        L25:
            org.simpleframework.xml.core.SignatureBuilder$ParameterList r4 = r8.get(r10)
            java.lang.Object r5 = r7.get(r3)
            org.simpleframework.xml.core.Parameter r5 = (org.simpleframework.xml.core.Parameter) r5
            r4.add(r5)
            int r3 = r3 + 1
            goto L10
        L35:
            return
    }

    public java.util.List<org.simpleframework.xml.core.Signature> build() {
            r1 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = new org.simpleframework.xml.core.SignatureBuilder$ParameterTable
            r0.<init>()
            java.util.List r1 = r1.build(r0)
            return r1
    }

    public void insert(org.simpleframework.xml.core.Parameter r1, int r2) {
            r0 = this;
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r0 = r0.table
            r0.insert(r1, r2)
            return
    }

    public boolean isValid() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.factory
            java.lang.Class[] r0 = r0.getParameterTypes()
            org.simpleframework.xml.core.SignatureBuilder$ParameterTable r1 = r1.table
            int r1 = org.simpleframework.xml.core.SignatureBuilder.ParameterTable.access$000(r1)
            int r0 = r0.length
            if (r0 != r1) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }
}
