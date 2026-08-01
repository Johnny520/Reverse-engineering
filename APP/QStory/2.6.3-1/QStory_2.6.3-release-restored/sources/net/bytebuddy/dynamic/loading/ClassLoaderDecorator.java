package net.bytebuddy.dynamic.loading;

import java.util.Map;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface ClassLoaderDecorator {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Factory {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NoOp implements Factory {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.loading.ClassLoaderDecorator.Factory
            public ClassLoaderDecorator make(@MaybeNull ClassLoader classLoader, Map<String, byte[]> map) {
                return new NoOp(classLoader);
            }
        }

        ClassLoaderDecorator make(@MaybeNull ClassLoader classLoader, Map<String, byte[]> map);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class NoOp implements ClassLoaderDecorator {

        @MaybeNull
        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final ClassLoader classLoader;

        public NoOp(@MaybeNull ClassLoader classLoader) {
            this.classLoader = classLoader;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoaderDecorator
        @MaybeNull
        public ClassLoader apply(TypeDescription typeDescription) {
            return this.classLoader;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ClassLoader classLoader = this.classLoader;
            ClassLoader classLoader2 = ((NoOp) obj).classLoader;
            if (classLoader2 != null) {
                return classLoader != null && classLoader.equals(classLoader2);
            }
            if (classLoader != null) {
                return false;
            }
        }

        public int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            ClassLoader classLoader = this.classLoader;
            return classLoader != null ? classLoader.hashCode() + iHashCode : iHashCode;
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoaderDecorator
        public boolean isSkipped(TypeDescription typeDescription) {
            return false;
        }
    }

    @MaybeNull
    ClassLoader apply(TypeDescription typeDescription);

    boolean isSkipped(TypeDescription typeDescription);
}
