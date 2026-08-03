package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public enum ConstructorComparator extends java.lang.Enum<net.bytebuddy.utility.ConstructorComparator> implements java.util.Comparator<java.lang.reflect.Constructor<?>> {
    private static final /* synthetic */ net.bytebuddy.utility.ConstructorComparator[] $VALUES = null;
    public static final net.bytebuddy.utility.ConstructorComparator INSTANCE = null;

    static {
            net.bytebuddy.utility.ConstructorComparator r0 = new net.bytebuddy.utility.ConstructorComparator
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.utility.ConstructorComparator.INSTANCE = r0
            net.bytebuddy.utility.ConstructorComparator[] r0 = new net.bytebuddy.utility.ConstructorComparator[]{r0}
            net.bytebuddy.utility.ConstructorComparator.$VALUES = r0
            return
    }

    ConstructorComparator(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.utility.ConstructorComparator valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.utility.ConstructorComparator> r0 = net.bytebuddy.utility.ConstructorComparator.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.utility.ConstructorComparator r1 = (net.bytebuddy.utility.ConstructorComparator) r1
            return r1
    }

    public static net.bytebuddy.utility.ConstructorComparator[] values() {
            net.bytebuddy.utility.ConstructorComparator[] r0 = net.bytebuddy.utility.ConstructorComparator.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.utility.ConstructorComparator[] r0 = (net.bytebuddy.utility.ConstructorComparator[]) r0
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Constructor<?> r1, java.lang.reflect.Constructor<?> r2) {
            r0 = this;
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.lang.reflect.Constructor<?> r5, java.lang.reflect.Constructor<?> r6) {
            r4 = this;
            r0 = 0
            if (r5 != r6) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = r6.getName()
            int r1 = r1.compareTo(r2)
            if (r1 != 0) goto L41
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r5.length
            int r2 = r6.length
            if (r1 >= r2) goto L20
            r5 = -1
            return r5
        L20:
            int r1 = r5.length
            int r2 = r6.length
            if (r1 <= r2) goto L26
            r5 = 1
            return r5
        L26:
            r1 = r0
        L27:
            int r2 = r5.length
            if (r1 >= r2) goto L40
            r2 = r5[r1]
            java.lang.String r2 = r2.getName()
            r3 = r6[r1]
            java.lang.String r3 = r3.getName()
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L3d
            return r2
        L3d:
            int r1 = r1 + 1
            goto L27
        L40:
            return r0
        L41:
            return r1
    }
}
