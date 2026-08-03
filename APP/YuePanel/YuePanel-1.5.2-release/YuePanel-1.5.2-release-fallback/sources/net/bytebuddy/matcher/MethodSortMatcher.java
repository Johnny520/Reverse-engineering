package net.bytebuddy.matcher;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MethodSortMatcher<T extends net.bytebuddy.description.method.MethodDescription> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.matcher.MethodSortMatcher.Sort sort;

    /* JADX INFO: renamed from: net.bytebuddy.matcher.MethodSortMatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Sort extends java.lang.Enum<net.bytebuddy.matcher.MethodSortMatcher.Sort> {
        private static final /* synthetic */ net.bytebuddy.matcher.MethodSortMatcher.Sort[] $VALUES = null;
        public static final net.bytebuddy.matcher.MethodSortMatcher.Sort CONSTRUCTOR = null;
        public static final net.bytebuddy.matcher.MethodSortMatcher.Sort DEFAULT_METHOD = null;
        public static final net.bytebuddy.matcher.MethodSortMatcher.Sort METHOD = null;
        public static final net.bytebuddy.matcher.MethodSortMatcher.Sort TYPE_INITIALIZER = null;
        public static final net.bytebuddy.matcher.MethodSortMatcher.Sort VIRTUAL = null;
        private final java.lang.String description;
        private final net.bytebuddy.matcher.MethodSortMatcher<?> matcher;






        static {
                net.bytebuddy.matcher.MethodSortMatcher$Sort$1 r0 = new net.bytebuddy.matcher.MethodSortMatcher$Sort$1
                r1 = 0
                java.lang.String r2 = "isMethod()"
                java.lang.String r3 = "METHOD"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.matcher.MethodSortMatcher.Sort.METHOD = r0
                net.bytebuddy.matcher.MethodSortMatcher$Sort$2 r2 = new net.bytebuddy.matcher.MethodSortMatcher$Sort$2
                r3 = 1
                java.lang.String r4 = "isConstructor()"
                java.lang.String r5 = "CONSTRUCTOR"
                r2.<init>(r5, r3, r4)
                net.bytebuddy.matcher.MethodSortMatcher.Sort.CONSTRUCTOR = r2
                net.bytebuddy.matcher.MethodSortMatcher$Sort$3 r4 = new net.bytebuddy.matcher.MethodSortMatcher$Sort$3
                r5 = 2
                java.lang.String r6 = "isTypeInitializer()"
                java.lang.String r7 = "TYPE_INITIALIZER"
                r4.<init>(r7, r5, r6)
                net.bytebuddy.matcher.MethodSortMatcher.Sort.TYPE_INITIALIZER = r4
                net.bytebuddy.matcher.MethodSortMatcher$Sort$4 r6 = new net.bytebuddy.matcher.MethodSortMatcher$Sort$4
                r7 = 3
                java.lang.String r8 = "isVirtual()"
                java.lang.String r9 = "VIRTUAL"
                r6.<init>(r9, r7, r8)
                net.bytebuddy.matcher.MethodSortMatcher.Sort.VIRTUAL = r6
                net.bytebuddy.matcher.MethodSortMatcher$Sort$5 r8 = new net.bytebuddy.matcher.MethodSortMatcher$Sort$5
                r9 = 4
                java.lang.String r10 = "isDefaultMethod()"
                java.lang.String r11 = "DEFAULT_METHOD"
                r8.<init>(r11, r9, r10)
                net.bytebuddy.matcher.MethodSortMatcher.Sort.DEFAULT_METHOD = r8
                r10 = 5
                net.bytebuddy.matcher.MethodSortMatcher$Sort[] r10 = new net.bytebuddy.matcher.MethodSortMatcher.Sort[r10]
                r10[r1] = r0
                r10[r3] = r2
                r10[r5] = r4
                r10[r7] = r6
                r10[r9] = r8
                net.bytebuddy.matcher.MethodSortMatcher.Sort.$VALUES = r10
                return
        }

        Sort(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.description = r3
                net.bytebuddy.matcher.MethodSortMatcher r1 = new net.bytebuddy.matcher.MethodSortMatcher
                r1.<init>(r0)
                r0.matcher = r1
                return
        }

        /* synthetic */ Sort(java.lang.String r1, int r2, java.lang.String r3, net.bytebuddy.matcher.MethodSortMatcher.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static net.bytebuddy.matcher.MethodSortMatcher.Sort valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.matcher.MethodSortMatcher$Sort> r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.matcher.MethodSortMatcher$Sort r1 = (net.bytebuddy.matcher.MethodSortMatcher.Sort) r1
                return r1
        }

        public static net.bytebuddy.matcher.MethodSortMatcher.Sort[] values() {
                net.bytebuddy.matcher.MethodSortMatcher$Sort[] r0 = net.bytebuddy.matcher.MethodSortMatcher.Sort.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.matcher.MethodSortMatcher$Sort[] r0 = (net.bytebuddy.matcher.MethodSortMatcher.Sort[]) r0
                return r0
        }

        public java.lang.String getDescription() {
                r1 = this;
                java.lang.String r0 = r1.description
                return r0
        }

        public net.bytebuddy.matcher.MethodSortMatcher<?> getMatcher() {
                r1 = this;
                net.bytebuddy.matcher.MethodSortMatcher<?> r0 = r1.matcher
                return r0
        }

        public abstract boolean isSort(net.bytebuddy.description.method.MethodDescription r1);
    }

    public MethodSortMatcher(net.bytebuddy.matcher.MethodSortMatcher.Sort r1) {
            r0 = this;
            r0.<init>()
            r0.sort = r1
            return
    }

    public static <T extends net.bytebuddy.description.method.MethodDescription> net.bytebuddy.matcher.ElementMatcher.Junction<T> of(net.bytebuddy.matcher.MethodSortMatcher.Sort r0) {
            net.bytebuddy.matcher.MethodSortMatcher r0 = r0.getMatcher()
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r2) {
            r1 = this;
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = r1.sort
            boolean r2 = r0.isSort(r2)
            return r2
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
            net.bytebuddy.matcher.MethodSortMatcher$Sort r2 = r4.sort
            net.bytebuddy.matcher.MethodSortMatcher r5 = (net.bytebuddy.matcher.MethodSortMatcher) r5
            net.bytebuddy.matcher.MethodSortMatcher$Sort r5 = r5.sort
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.matcher.MethodSortMatcher$Sort r1 = r2.sort
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            net.bytebuddy.matcher.MethodSortMatcher$Sort r0 = r1.sort
            java.lang.String r0 = r0.getDescription()
            return r0
    }
}
