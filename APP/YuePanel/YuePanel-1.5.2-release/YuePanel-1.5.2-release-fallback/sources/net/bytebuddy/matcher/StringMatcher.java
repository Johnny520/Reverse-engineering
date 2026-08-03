package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class StringMatcher extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<java.lang.String> {
    private final net.bytebuddy.matcher.StringMatcher.Mode mode;
    private final java.lang.String value;

    /* JADX INFO: renamed from: net.bytebuddy.matcher.StringMatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Mode extends java.lang.Enum<net.bytebuddy.matcher.StringMatcher.Mode> {
        private static final /* synthetic */ net.bytebuddy.matcher.StringMatcher.Mode[] $VALUES = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode CONTAINS = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode CONTAINS_IGNORE_CASE = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode ENDS_WITH = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode ENDS_WITH_IGNORE_CASE = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode EQUALS_FULLY = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode EQUALS_FULLY_IGNORE_CASE = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode MATCHES = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode STARTS_WITH = null;
        public static final net.bytebuddy.matcher.StringMatcher.Mode STARTS_WITH_IGNORE_CASE = null;
        private final java.lang.String description;










        static {
                net.bytebuddy.matcher.StringMatcher$Mode$1 r0 = new net.bytebuddy.matcher.StringMatcher$Mode$1
                r1 = 0
                java.lang.String r2 = "equals"
                java.lang.String r3 = "EQUALS_FULLY"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.matcher.StringMatcher.Mode.EQUALS_FULLY = r0
                net.bytebuddy.matcher.StringMatcher$Mode$2 r2 = new net.bytebuddy.matcher.StringMatcher$Mode$2
                r3 = 1
                java.lang.String r4 = "equalsIgnoreCase"
                java.lang.String r5 = "EQUALS_FULLY_IGNORE_CASE"
                r2.<init>(r5, r3, r4)
                net.bytebuddy.matcher.StringMatcher.Mode.EQUALS_FULLY_IGNORE_CASE = r2
                net.bytebuddy.matcher.StringMatcher$Mode$3 r4 = new net.bytebuddy.matcher.StringMatcher$Mode$3
                r5 = 2
                java.lang.String r6 = "startsWith"
                java.lang.String r7 = "STARTS_WITH"
                r4.<init>(r7, r5, r6)
                net.bytebuddy.matcher.StringMatcher.Mode.STARTS_WITH = r4
                net.bytebuddy.matcher.StringMatcher$Mode$4 r6 = new net.bytebuddy.matcher.StringMatcher$Mode$4
                r7 = 3
                java.lang.String r8 = "startsWithIgnoreCase"
                java.lang.String r9 = "STARTS_WITH_IGNORE_CASE"
                r6.<init>(r9, r7, r8)
                net.bytebuddy.matcher.StringMatcher.Mode.STARTS_WITH_IGNORE_CASE = r6
                net.bytebuddy.matcher.StringMatcher$Mode$5 r8 = new net.bytebuddy.matcher.StringMatcher$Mode$5
                r9 = 4
                java.lang.String r10 = "endsWith"
                java.lang.String r11 = "ENDS_WITH"
                r8.<init>(r11, r9, r10)
                net.bytebuddy.matcher.StringMatcher.Mode.ENDS_WITH = r8
                net.bytebuddy.matcher.StringMatcher$Mode$6 r10 = new net.bytebuddy.matcher.StringMatcher$Mode$6
                r11 = 5
                java.lang.String r12 = "endsWithIgnoreCase"
                java.lang.String r13 = "ENDS_WITH_IGNORE_CASE"
                r10.<init>(r13, r11, r12)
                net.bytebuddy.matcher.StringMatcher.Mode.ENDS_WITH_IGNORE_CASE = r10
                net.bytebuddy.matcher.StringMatcher$Mode$7 r12 = new net.bytebuddy.matcher.StringMatcher$Mode$7
                r13 = 6
                java.lang.String r14 = "contains"
                java.lang.String r15 = "CONTAINS"
                r12.<init>(r15, r13, r14)
                net.bytebuddy.matcher.StringMatcher.Mode.CONTAINS = r12
                net.bytebuddy.matcher.StringMatcher$Mode$8 r14 = new net.bytebuddy.matcher.StringMatcher$Mode$8
                r15 = 7
                java.lang.String r13 = "containsIgnoreCase"
                java.lang.String r11 = "CONTAINS_IGNORE_CASE"
                r14.<init>(r11, r15, r13)
                net.bytebuddy.matcher.StringMatcher.Mode.CONTAINS_IGNORE_CASE = r14
                net.bytebuddy.matcher.StringMatcher$Mode$9 r11 = new net.bytebuddy.matcher.StringMatcher$Mode$9
                r13 = 8
                java.lang.String r15 = "matches"
                java.lang.String r9 = "MATCHES"
                r11.<init>(r9, r13, r15)
                net.bytebuddy.matcher.StringMatcher.Mode.MATCHES = r11
                r9 = 9
                net.bytebuddy.matcher.StringMatcher$Mode[] r9 = new net.bytebuddy.matcher.StringMatcher.Mode[r9]
                r9[r1] = r0
                r9[r3] = r2
                r9[r5] = r4
                r9[r7] = r6
                r0 = 4
                r9[r0] = r8
                r0 = 5
                r9[r0] = r10
                r0 = 6
                r9[r0] = r12
                r0 = 7
                r9[r0] = r14
                r9[r13] = r11
                net.bytebuddy.matcher.StringMatcher.Mode.$VALUES = r9
                return
        }

        Mode(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.description = r3
                return
        }

        /* synthetic */ Mode(java.lang.String r1, int r2, java.lang.String r3, net.bytebuddy.matcher.StringMatcher.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static net.bytebuddy.matcher.StringMatcher.Mode valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.matcher.StringMatcher$Mode> r0 = net.bytebuddy.matcher.StringMatcher.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.matcher.StringMatcher$Mode r1 = (net.bytebuddy.matcher.StringMatcher.Mode) r1
                return r1
        }

        public static net.bytebuddy.matcher.StringMatcher.Mode[] values() {
                net.bytebuddy.matcher.StringMatcher$Mode[] r0 = net.bytebuddy.matcher.StringMatcher.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.matcher.StringMatcher$Mode[] r0 = (net.bytebuddy.matcher.StringMatcher.Mode[]) r0
                return r0
        }

        public java.lang.String getDescription() {
                r1 = this;
                java.lang.String r0 = r1.description
                return r0
        }

        public abstract boolean matches(java.lang.String r1, java.lang.String r2);
    }

    public StringMatcher(java.lang.String r1, net.bytebuddy.matcher.StringMatcher.Mode r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.mode = r2
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.doMatch2(r1)
            return r1
    }

    /* JADX INFO: renamed from: doMatch, reason: avoid collision after fix types in other method */
    public boolean doMatch2(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.matcher.StringMatcher$Mode r0 = r2.mode
            java.lang.String r1 = r2.value
            boolean r3 = r0.matches(r1, r3)
            return r3
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            net.bytebuddy.matcher.StringMatcher$Mode r2 = r4.mode
            net.bytebuddy.matcher.StringMatcher r5 = (net.bytebuddy.matcher.StringMatcher) r5
            net.bytebuddy.matcher.StringMatcher$Mode r3 = r5.mode
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            java.lang.String r2 = r4.value
            java.lang.String r5 = r5.value
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L32
            return r1
        L32:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.value
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.StringMatcher$Mode r1 = r2.mode
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            net.bytebuddy.matcher.StringMatcher$Mode r1 = r2.mode
            java.lang.String r1 = r1.getDescription()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r2.value
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
