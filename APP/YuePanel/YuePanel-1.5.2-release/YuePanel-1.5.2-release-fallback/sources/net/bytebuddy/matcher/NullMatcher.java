package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class NullMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {
    private static final net.bytebuddy.matcher.NullMatcher<?> INSTANCE = null;

    static {
            net.bytebuddy.matcher.NullMatcher r0 = new net.bytebuddy.matcher.NullMatcher
            r0.<init>()
            net.bytebuddy.matcher.NullMatcher.INSTANCE = r0
            return
    }

    public NullMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> net.bytebuddy.matcher.ElementMatcher.Junction<T> make() {
            net.bytebuddy.matcher.NullMatcher<?> r0 = net.bytebuddy.matcher.NullMatcher.INSTANCE
            return r0
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r3.getClass()
            java.lang.Class r4 = r4.getClass()
            if (r2 == r4) goto L13
            return r1
        L13:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "isNull()"
            return r0
    }
}
