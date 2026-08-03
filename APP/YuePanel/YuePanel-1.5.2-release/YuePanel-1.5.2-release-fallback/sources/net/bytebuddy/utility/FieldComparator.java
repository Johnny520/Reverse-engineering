package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public enum FieldComparator extends java.lang.Enum<net.bytebuddy.utility.FieldComparator> implements java.util.Comparator<java.lang.reflect.Field> {
    private static final /* synthetic */ net.bytebuddy.utility.FieldComparator[] $VALUES = null;
    public static final net.bytebuddy.utility.FieldComparator INSTANCE = null;

    static {
            net.bytebuddy.utility.FieldComparator r0 = new net.bytebuddy.utility.FieldComparator
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.utility.FieldComparator.INSTANCE = r0
            net.bytebuddy.utility.FieldComparator[] r0 = new net.bytebuddy.utility.FieldComparator[]{r0}
            net.bytebuddy.utility.FieldComparator.$VALUES = r0
            return
    }

    FieldComparator(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.utility.FieldComparator valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.utility.FieldComparator> r0 = net.bytebuddy.utility.FieldComparator.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.utility.FieldComparator r1 = (net.bytebuddy.utility.FieldComparator) r1
            return r1
    }

    public static net.bytebuddy.utility.FieldComparator[] values() {
            net.bytebuddy.utility.FieldComparator[] r0 = net.bytebuddy.utility.FieldComparator.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.utility.FieldComparator[] r0 = (net.bytebuddy.utility.FieldComparator[]) r0
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Field r1, java.lang.reflect.Field r2) {
            r0 = this;
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.lang.reflect.Field r3, java.lang.reflect.Field r4) {
            r2 = this;
            if (r3 != r4) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = r4.getName()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L27
            java.lang.Class r3 = r3.getType()
            java.lang.String r3 = r3.getName()
            java.lang.Class r4 = r4.getType()
            java.lang.String r4 = r4.getName()
            int r3 = r3.compareTo(r4)
            return r3
        L27:
            return r0
    }
}
