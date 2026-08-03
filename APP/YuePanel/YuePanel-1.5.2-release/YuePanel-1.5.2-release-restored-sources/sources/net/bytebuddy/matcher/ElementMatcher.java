package net.bytebuddy.matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;
import net.bytebuddy.utility.nullability.UnknownNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ElementMatcher<T> {

    public interface Junction<S> extends ElementMatcher<S> {

        public static abstract class AbstractBase<V> implements Junction<V> {
            @Override // net.bytebuddy.matcher.ElementMatcher.Junction
            public <U extends V> Junction<U> and(ElementMatcher<? super U> elementMatcher) {
                return new Conjunction(this, elementMatcher);
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction
            /* JADX INFO: renamed from: or */
            public <U extends V> Junction<U> mo5389or(ElementMatcher<? super U> elementMatcher) {
                return new Disjunction(this, elementMatcher);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Conjunction<W> extends AbstractBase<W> {
            private final List<ElementMatcher<? super W>> matchers;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Conjunction(ElementMatcher<? super W>... elementMatcherArr) {
                this(Arrays.asList(elementMatcherArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Conjunction) obj).matchers);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.matchers.hashCode();
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public boolean matches(@UnknownNull W w) {
                Iterator<ElementMatcher<? super W>> it = this.matchers.iterator();
                while (it.hasNext()) {
                    if (!it.next().matches(w)) {
                        return false;
                    }
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("(");
                boolean z = true;
                for (ElementMatcher<? super W> elementMatcher : this.matchers) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(" and ");
                    }
                    sb.append(elementMatcher);
                }
                sb.append(")");
                return sb.toString();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Conjunction(List<ElementMatcher<? super W>> list) {
                this.matchers = new ArrayList(list.size());
                for (ElementMatcher<? super W> elementMatcher : list) {
                    if (elementMatcher instanceof Conjunction) {
                        this.matchers.addAll(((Conjunction) elementMatcher).matchers);
                    } else {
                        this.matchers.add(elementMatcher);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Disjunction<W> extends AbstractBase<W> {
            private final List<ElementMatcher<? super W>> matchers;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Disjunction(ElementMatcher<? super W>... elementMatcherArr) {
                this(Arrays.asList(elementMatcherArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Disjunction) obj).matchers);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.matchers.hashCode();
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public boolean matches(@UnknownNull W w) {
                Iterator<ElementMatcher<? super W>> it = this.matchers.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(w)) {
                        return true;
                    }
                }
                return false;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("(");
                boolean z = true;
                for (ElementMatcher<? super W> elementMatcher : this.matchers) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(" or ");
                    }
                    sb.append(elementMatcher);
                }
                sb.append(")");
                return sb.toString();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Disjunction(List<ElementMatcher<? super W>> list) {
                this.matchers = new ArrayList(list.size());
                for (ElementMatcher<? super W> elementMatcher : list) {
                    if (elementMatcher instanceof Disjunction) {
                        this.matchers.addAll(((Disjunction) elementMatcher).matchers);
                    } else {
                        this.matchers.add(elementMatcher);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForNonNullValues<W> extends AbstractBase<W> {
            public abstract boolean doMatch(W w);

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public int hashCode() {
                return getClass().hashCode();
            }

            @Override // net.bytebuddy.matcher.ElementMatcher
            public boolean matches(@MaybeNull W w) {
                return w != null && doMatch(w);
            }
        }

        <U extends S> Junction<U> and(ElementMatcher<? super U> elementMatcher);

        /* JADX INFO: renamed from: or */
        <U extends S> Junction<U> mo5389or(ElementMatcher<? super U> elementMatcher);
    }

    boolean matches(@UnknownNull T t);
}
