package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
public interface ElementMatcher<T> {

    public interface Junction<S> extends net.bytebuddy.matcher.ElementMatcher<S> {

        public static abstract class AbstractBase<V> implements net.bytebuddy.matcher.ElementMatcher.Junction<V> {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction
            public <U extends V> net.bytebuddy.matcher.ElementMatcher.Junction<U> and(net.bytebuddy.matcher.ElementMatcher<? super U> r4) {
                    r3 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction r0 = new net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction
                    r1 = 2
                    net.bytebuddy.matcher.ElementMatcher[] r1 = new net.bytebuddy.matcher.ElementMatcher[r1]
                    r2 = 0
                    r1[r2] = r3
                    r2 = 1
                    r1[r2] = r4
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction
            public <U extends V> net.bytebuddy.matcher.ElementMatcher.Junction<U> or(net.bytebuddy.matcher.ElementMatcher<? super U> r4) {
                    r3 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction r0 = new net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction
                    r1 = 2
                    net.bytebuddy.matcher.ElementMatcher[] r1 = new net.bytebuddy.matcher.ElementMatcher[r1]
                    r2 = 0
                    r1[r2] = r3
                    r2 = 1
                    r1[r2] = r4
                    r0.<init>(r1)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Conjunction<W> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<W> {
            private final java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> matchers;

            public Conjunction(java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r3) {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    r2.matchers = r0
                    java.util.Iterator r3 = r3.iterator()
                L12:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L32
                    java.lang.Object r0 = r3.next()
                    net.bytebuddy.matcher.ElementMatcher r0 = (net.bytebuddy.matcher.ElementMatcher) r0
                    boolean r1 = r0 instanceof net.bytebuddy.matcher.ElementMatcher.Junction.Conjunction
                    if (r1 == 0) goto L2c
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction r0 = (net.bytebuddy.matcher.ElementMatcher.Junction.Conjunction) r0
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r0 = r0.matchers
                    r1.addAll(r0)
                    goto L12
                L2c:
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    r1.add(r0)
                    goto L12
                L32:
                    return
            }

            public Conjunction(net.bytebuddy.matcher.ElementMatcher<? super W>... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
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
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r2 = r4.matchers
                    net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction r5 = (net.bytebuddy.matcher.ElementMatcher.Junction.Conjunction) r5
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r5 = r5.matchers
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public boolean matches(@net.bytebuddy.utility.nullability.UnknownNull W r3) {
                    r2 = this;
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r0 = r2.matchers
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1a
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.matcher.ElementMatcher r1 = (net.bytebuddy.matcher.ElementMatcher) r1
                    boolean r1 = r1.matches(r3)
                    if (r1 != 0) goto L6
                    r3 = 0
                    return r3
                L1a:
                    r3 = 1
                    return r3
            }

            public java.lang.String toString() {
                    r5 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "("
                    r0.<init>(r1)
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r5.matchers
                    java.util.Iterator r1 = r1.iterator()
                    r2 = 1
                Le:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L27
                    java.lang.Object r3 = r1.next()
                    net.bytebuddy.matcher.ElementMatcher r3 = (net.bytebuddy.matcher.ElementMatcher) r3
                    if (r2 == 0) goto L1e
                    r2 = 0
                    goto L23
                L1e:
                    java.lang.String r4 = " and "
                    r0.append(r4)
                L23:
                    r0.append(r3)
                    goto Le
                L27:
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Disjunction<W> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<W> {
            private final java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> matchers;

            public Disjunction(java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r3) {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    r2.matchers = r0
                    java.util.Iterator r3 = r3.iterator()
                L12:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L32
                    java.lang.Object r0 = r3.next()
                    net.bytebuddy.matcher.ElementMatcher r0 = (net.bytebuddy.matcher.ElementMatcher) r0
                    boolean r1 = r0 instanceof net.bytebuddy.matcher.ElementMatcher.Junction.Disjunction
                    if (r1 == 0) goto L2c
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction r0 = (net.bytebuddy.matcher.ElementMatcher.Junction.Disjunction) r0
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r0 = r0.matchers
                    r1.addAll(r0)
                    goto L12
                L2c:
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    r1.add(r0)
                    goto L12
                L32:
                    return
            }

            public Disjunction(net.bytebuddy.matcher.ElementMatcher<? super W>... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
                    return
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
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r2 = r4.matchers
                    net.bytebuddy.matcher.ElementMatcher$Junction$Disjunction r5 = (net.bytebuddy.matcher.ElementMatcher.Junction.Disjunction) r5
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r5 = r5.matchers
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r2.matchers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public boolean matches(@net.bytebuddy.utility.nullability.UnknownNull W r3) {
                    r2 = this;
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r0 = r2.matchers
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1a
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.matcher.ElementMatcher r1 = (net.bytebuddy.matcher.ElementMatcher) r1
                    boolean r1 = r1.matches(r3)
                    if (r1 == 0) goto L6
                    r3 = 1
                    return r3
                L1a:
                    r3 = 0
                    return r3
            }

            public java.lang.String toString() {
                    r5 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "("
                    r0.<init>(r1)
                    java.util.List<net.bytebuddy.matcher.ElementMatcher<? super W>> r1 = r5.matchers
                    java.util.Iterator r1 = r1.iterator()
                    r2 = 1
                Le:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L27
                    java.lang.Object r3 = r1.next()
                    net.bytebuddy.matcher.ElementMatcher r3 = (net.bytebuddy.matcher.ElementMatcher) r3
                    if (r2 == 0) goto L1e
                    r2 = 0
                    goto L23
                L1e:
                    java.lang.String r4 = " or "
                    r0.append(r4)
                L23:
                    r0.append(r3)
                    goto Le
                L27:
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForNonNullValues<W> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<W> {
            public ForNonNullValues() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract boolean doMatch(W r1);

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
            public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull W r1) {
                    r0 = this;
                    if (r1 == 0) goto La
                    boolean r1 = r0.doMatch(r1)
                    if (r1 == 0) goto La
                    r1 = 1
                    goto Lb
                La:
                    r1 = 0
                Lb:
                    return r1
            }
        }

        <U extends S> net.bytebuddy.matcher.ElementMatcher.Junction<U> and(net.bytebuddy.matcher.ElementMatcher<? super U> r1);

        <U extends S> net.bytebuddy.matcher.ElementMatcher.Junction<U> or(net.bytebuddy.matcher.ElementMatcher<? super U> r1);
    }

    boolean matches(@net.bytebuddy.utility.nullability.UnknownNull T r1);
}
