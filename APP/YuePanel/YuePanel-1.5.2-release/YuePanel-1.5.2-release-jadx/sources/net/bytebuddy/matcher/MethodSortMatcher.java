package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class MethodSortMatcher<T extends MethodDescription> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final Sort sort;

    public enum Sort {
        METHOD("isMethod()") { // from class: net.bytebuddy.matcher.MethodSortMatcher.Sort.1
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isMethod();
            }
        },
        CONSTRUCTOR("isConstructor()") { // from class: net.bytebuddy.matcher.MethodSortMatcher.Sort.2
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isConstructor();
            }
        },
        TYPE_INITIALIZER("isTypeInitializer()") { // from class: net.bytebuddy.matcher.MethodSortMatcher.Sort.3
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isTypeInitializer();
            }
        },
        VIRTUAL("isVirtual()") { // from class: net.bytebuddy.matcher.MethodSortMatcher.Sort.4
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isVirtual();
            }
        },
        DEFAULT_METHOD("isDefaultMethod()") { // from class: net.bytebuddy.matcher.MethodSortMatcher.Sort.5
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isDefaultMethod();
            }
        };

        private final String description;
        private final MethodSortMatcher<?> matcher;

        public String getDescription() {
            return this.description;
        }

        public MethodSortMatcher<?> getMatcher() {
            return this.matcher;
        }

        public abstract boolean isSort(MethodDescription methodDescription);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        Sort(String str) {
            this.description = str;
            this.matcher = new MethodSortMatcher<>(this);
        }
    }

    public MethodSortMatcher(Sort sort) {
        this.sort = sort;
    }

    /* JADX INFO: renamed from: of */
    public static <T extends MethodDescription> ElementMatcher.Junction<T> m5399of(Sort sort) {
        return sort.getMatcher();
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.sort.equals(((MethodSortMatcher) obj).sort);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return (super.hashCode() * 31) + this.sort.hashCode();
    }

    public String toString() {
        return this.sort.getDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: doMatch(Ljava/lang/Object;)Z */
    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        return this.sort.isSort(t);
    }
}
