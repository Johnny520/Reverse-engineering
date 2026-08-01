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
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            /*
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
                java.lang.ClassLoader r4 = r4.classLoader
                net.bytebuddy.dynamic.loading.ClassLoaderDecorator$NoOp r5 = (net.bytebuddy.dynamic.loading.ClassLoaderDecorator.NoOp) r5
                java.lang.ClassLoader r5 = r5.classLoader
                if (r5 == 0) goto L24
                if (r4 == 0) goto L26
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L27
                return r1
            L24:
                if (r4 == 0) goto L27
            L26:
                return r1
            L27:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassLoaderDecorator.NoOp.equals(java.lang.Object):boolean");
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
