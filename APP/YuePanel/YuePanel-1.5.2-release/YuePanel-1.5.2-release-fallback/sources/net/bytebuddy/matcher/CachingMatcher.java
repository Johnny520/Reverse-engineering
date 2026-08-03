package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(permitSubclassEquality = true)
public class CachingMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {
    private static final java.lang.Object NULL_VALUE = null;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    protected final java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> map;
    private final net.bytebuddy.matcher.ElementMatcher<? super T> matcher;

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Equality does not consider eviction size.", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
    public static class WithInlineEviction<S> extends net.bytebuddy.matcher.CachingMatcher<S> {
        private final int evictionSize;

        public WithInlineEviction(net.bytebuddy.matcher.ElementMatcher<? super S> r1, java.util.concurrent.ConcurrentMap<? super S, java.lang.Boolean> r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.evictionSize = r3
                return
        }

        @Override // net.bytebuddy.matcher.CachingMatcher
        public boolean onCacheMiss(@net.bytebuddy.utility.nullability.MaybeNull S r3) {
                r2 = this;
                java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r0 = r2.map
                int r0 = r0.size()
                int r1 = r2.evictionSize
                if (r0 < r1) goto L1a
                java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r0 = r2.map
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r0.next()
                r0.remove()
            L1a:
                boolean r3 = super.onCacheMiss(r3)
                return r3
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            net.bytebuddy.matcher.CachingMatcher.NULL_VALUE = r0
            return
    }

    public CachingMatcher(net.bytebuddy.matcher.ElementMatcher<? super T> r1, java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r2) {
            r0 = this;
            r0.<init>()
            r0.matcher = r1
            r0.map = r2
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof net.bytebuddy.matcher.CachingMatcher
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r3.matcher
            net.bytebuddy.matcher.CachingMatcher r4 = (net.bytebuddy.matcher.CachingMatcher) r4
            net.bytebuddy.matcher.ElementMatcher<? super T> r4 = r4.matcher
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<net.bytebuddy.matcher.CachingMatcher> r0 = net.bytebuddy.matcher.CachingMatcher.class
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r0 = r2.map
            if (r3 != 0) goto L7
            java.lang.Object r1 = net.bytebuddy.matcher.CachingMatcher.NULL_VALUE
            goto L8
        L7:
            r1 = r3
        L8:
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L18
            boolean r3 = r2.onCacheMiss(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L18:
            boolean r3 = r0.booleanValue()
            return r3
    }

    public boolean onCacheMiss(@net.bytebuddy.utility.nullability.MaybeNull T r4) {
            r3 = this;
            net.bytebuddy.matcher.ElementMatcher<? super T> r0 = r3.matcher
            boolean r0 = r0.matches(r4)
            java.util.concurrent.ConcurrentMap<? super T, java.lang.Boolean> r1 = r3.map
            if (r4 != 0) goto Lc
            java.lang.Object r4 = net.bytebuddy.matcher.CachingMatcher.NULL_VALUE
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r4, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cached("
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r2.matcher
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
