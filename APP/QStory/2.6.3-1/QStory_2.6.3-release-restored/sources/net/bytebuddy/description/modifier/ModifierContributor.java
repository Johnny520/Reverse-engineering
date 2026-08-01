package net.bytebuddy.description.modifier;

import java.util.Arrays;
import java.util.Collection;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface ModifierContributor {
    public static final int EMPTY_MASK = 0;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ForField extends ModifierContributor {
        public static final int MASK = 151775;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ForMethod extends ModifierContributor {
        public static final int MASK = 7679;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ForModule extends ModifierContributor {
        public static final int MASK = 36896;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface OfExport extends ModifierContributor {
            public static final int MASK = 36864;
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface OfOpen extends ModifierContributor {
            public static final int MASK = 36864;
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface OfRequire extends ModifierContributor {
            public static final int MASK = 36960;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ForParameter extends ModifierContributor {
        public static final int MASK = 36880;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ForType extends ModifierContributor {
        public static final int MASK = 163391;
    }

    int getMask();

    int getRange();

    boolean isDefault();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Resolver<T extends ModifierContributor> {
        private final Collection<? extends T> modifierContributors;

        public Resolver(Collection<? extends T> collection) {
            this.modifierContributors = collection;
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForType> m284of(ForType... forTypeArr) {
            return m276of(Arrays.asList(forTypeArr));
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.modifierContributors.equals(((Resolver) obj).modifierContributors);
        }

        public int hashCode() {
            return this.modifierContributors.hashCode() + (getClass().hashCode() * 31);
        }

        public int resolve(int i) {
            for (T t : this.modifierContributors) {
                i = (i & (~t.getRange())) | t.getMask();
            }
            return i;
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForModule> m282of(ForModule... forModuleArr) {
            return m276of(Arrays.asList(forModuleArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForModule.OfRequire> m281of(ForModule.OfRequire... ofRequireArr) {
            return m276of(Arrays.asList(ofRequireArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForModule.OfExport> m279of(ForModule.OfExport... ofExportArr) {
            return m276of(Arrays.asList(ofExportArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForModule.OfOpen> m280of(ForModule.OfOpen... ofOpenArr) {
            return m276of(Arrays.asList(ofOpenArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForField> m277of(ForField... forFieldArr) {
            return m276of(Arrays.asList(forFieldArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForMethod> m278of(ForMethod... forMethodArr) {
            return m276of(Arrays.asList(forMethodArr));
        }

        /* JADX INFO: renamed from: of */
        public static Resolver<ForParameter> m283of(ForParameter... forParameterArr) {
            return m276of(Arrays.asList(forParameterArr));
        }

        /* JADX INFO: renamed from: of */
        public static <S extends ModifierContributor> Resolver<S> m276of(Collection<? extends S> collection) {
            return new Resolver<>(collection);
        }

        public int resolve() {
            return resolve(0);
        }
    }
}
