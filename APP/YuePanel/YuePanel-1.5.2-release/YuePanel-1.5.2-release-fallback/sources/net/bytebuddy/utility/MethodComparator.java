package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodComparator extends java.lang.Enum<net.bytebuddy.utility.MethodComparator> implements java.util.Comparator<java.lang.reflect.Method> {
    private static final /* synthetic */ net.bytebuddy.utility.MethodComparator[] $VALUES = null;
    public static final net.bytebuddy.utility.MethodComparator INSTANCE = null;

    static {
            net.bytebuddy.utility.MethodComparator r0 = new net.bytebuddy.utility.MethodComparator
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.utility.MethodComparator.INSTANCE = r0
            net.bytebuddy.utility.MethodComparator[] r0 = new net.bytebuddy.utility.MethodComparator[]{r0}
            net.bytebuddy.utility.MethodComparator.$VALUES = r0
            return
    }

    MethodComparator(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.utility.MethodComparator valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.utility.MethodComparator> r0 = net.bytebuddy.utility.MethodComparator.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.utility.MethodComparator r1 = (net.bytebuddy.utility.MethodComparator) r1
            return r1
    }

    public static net.bytebuddy.utility.MethodComparator[] values() {
            net.bytebuddy.utility.MethodComparator[] r0 = net.bytebuddy.utility.MethodComparator.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.utility.MethodComparator[] r0 = (net.bytebuddy.utility.MethodComparator[]) r0
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
            r0 = this;
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.lang.reflect.Method r6, java.lang.reflect.Method r7) {
            r5 = this;
            r0 = 0
            if (r6 != r7) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.getName()
            java.lang.String r2 = r7.getName()
            int r1 = r1.compareTo(r2)
            if (r1 != 0) goto L54
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.Class[] r2 = r7.getParameterTypes()
            int r3 = r1.length
            int r4 = r2.length
            if (r3 >= r4) goto L20
            r6 = -1
            return r6
        L20:
            int r3 = r1.length
            int r4 = r2.length
            if (r3 <= r4) goto L26
            r6 = 1
            return r6
        L26:
            int r3 = r1.length
            if (r0 >= r3) goto L3f
            r3 = r1[r0]
            java.lang.String r3 = r3.getName()
            r4 = r2[r0]
            java.lang.String r4 = r4.getName()
            int r3 = r3.compareTo(r4)
            if (r3 == 0) goto L3c
            return r3
        L3c:
            int r0 = r0 + 1
            goto L26
        L3f:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r6 = r6.getName()
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r7 = r7.getName()
            int r6 = r6.compareTo(r7)
            return r6
        L54:
            return r1
    }
}
