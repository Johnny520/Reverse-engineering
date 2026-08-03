package net.bytebuddy.description.modifier;

import java.util.Arrays;
import java.util.Collection;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ModifierContributor {
    public static final int EMPTY_MASK = 0;

    public interface ForField extends ModifierContributor {
        public static final int MASK = 151775;
    }

    public interface ForMethod extends ModifierContributor {
        public static final int MASK = 7679;
    }

    public interface ForParameter extends ModifierContributor {
        public static final int MASK = 36880;
    }

    public interface ForType extends ModifierContributor {
        public static final int MASK = 161311;
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Resolver<T extends ModifierContributor> {
        private final Collection<? extends T> modifierContributors;

        public Resolver(Collection<? extends T> collection) {
            this.modifierContributors = collection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public static Resolver<ForType> m5234of(ForType... forTypeArr) {
            return m5230of(Arrays.asList(forTypeArr));
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.modifierContributors.equals(((Resolver) obj).modifierContributors);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.modifierContributors.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int resolve() {
            return resolve(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: of */
        public static Resolver<ForField> m5231of(ForField... forFieldArr) {
            return m5230of(Arrays.asList(forFieldArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public int resolve(int i) {
            for (T t : this.modifierContributors) {
                i = (i & (~t.getRange())) | t.getMask();
            }
            return i;
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForMethod> m5232of(ForMethod... forMethodArr) {
            return m5230of(Arrays.asList(forMethodArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForParameter> m5233of(ForParameter... forParameterArr) {
            return m5230of(Arrays.asList(forParameterArr));
        }

        /* JADX INFO: renamed from: of */
        public static <S extends ModifierContributor> Resolver<S> m5230of(Collection<? extends S> collection) {
            return new Resolver<>(collection);
        }
    }

    int getMask();

    int getRange();

    boolean isDefault();
}
