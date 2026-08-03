package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class BooleanMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {
    private static final net.bytebuddy.matcher.BooleanMatcher<?> FALSE = null;
    private static final net.bytebuddy.matcher.BooleanMatcher<?> TRUE = null;
    protected final boolean matches;

    static {
            net.bytebuddy.matcher.BooleanMatcher r0 = new net.bytebuddy.matcher.BooleanMatcher
            r1 = 1
            r0.<init>(r1)
            net.bytebuddy.matcher.BooleanMatcher.TRUE = r0
            net.bytebuddy.matcher.BooleanMatcher r0 = new net.bytebuddy.matcher.BooleanMatcher
            r1 = 0
            r0.<init>(r1)
            net.bytebuddy.matcher.BooleanMatcher.FALSE = r0
            return
    }

    public BooleanMatcher(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.matches = r1
            return
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> of(boolean r0) {
            if (r0 == 0) goto L5
            net.bytebuddy.matcher.BooleanMatcher<?> r0 = net.bytebuddy.matcher.BooleanMatcher.TRUE
            goto L7
        L5:
            net.bytebuddy.matcher.BooleanMatcher<?> r0 = net.bytebuddy.matcher.BooleanMatcher.FALSE
        L7:
            return r0
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            boolean r2 = r4.matches
            net.bytebuddy.matcher.BooleanMatcher r5 = (net.bytebuddy.matcher.BooleanMatcher) r5
            boolean r5 = r5.matches
            if (r2 == r5) goto L1c
            return r1
        L1c:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.matches
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r1) {
            r0 = this;
            boolean r1 = r0.matches
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.matches
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            return r0
    }
}
