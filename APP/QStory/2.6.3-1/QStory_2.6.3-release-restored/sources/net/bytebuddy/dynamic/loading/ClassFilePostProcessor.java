package net.bytebuddy.dynamic.loading;

import androidx.activity.AbstractC0900;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.AllPermission;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.util.Collections;
import java.util.Enumeration;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;
import p352.C9620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface ClassFilePostProcessor {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassFileTransformer implements ClassFilePostProcessor {
        protected static final ProtectionDomain ALL_PRIVILEGES = new ProtectionDomain(null, new AllPermissionsCollection());

        @AlwaysNull
        private static final Class<?> UNLOADED_TYPE = null;
        private final ClassFileTransformer classFileTransformer;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class AllPermissionsCollection extends PermissionCollection {
            private static final long serialVersionUID = 1;

            @Override // java.security.PermissionCollection
            public void add(Permission permission) {
                throw new UnsupportedOperationException("add");
            }

            @Override // java.security.PermissionCollection
            public Enumeration<Permission> elements() {
                return Collections.enumeration(Collections.singleton(new AllPermission()));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public int hashCode() {
                return getClass().hashCode();
            }

            @Override // java.security.PermissionCollection
            public boolean implies(Permission permission) {
                return true;
            }
        }

        public ForClassFileTransformer(ClassFileTransformer classFileTransformer) {
            this.classFileTransformer = classFileTransformer;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((ForClassFileTransformer) obj).classFileTransformer);
        }

        public int hashCode() {
            return this.classFileTransformer.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.dynamic.loading.ClassFilePostProcessor
        public byte[] transform(@MaybeNull ClassLoader classLoader, String str, @MaybeNull ProtectionDomain protectionDomain, byte[] bArr) {
            try {
                ClassFileTransformer classFileTransformer = this.classFileTransformer;
                String strReplace = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                Class<?> cls = UNLOADED_TYPE;
                if (protectionDomain == null) {
                    protectionDomain = ALL_PRIVILEGES;
                }
                byte[] bArrTransform = classFileTransformer.transform(classLoader, strReplace, cls, protectionDomain, bArr);
                return bArrTransform == null ? bArr : bArrTransform;
            } catch (IllegalClassFormatException e) {
                C9620.m15032(AbstractC0900.m717("Failed to transform ", str), e);
                return null;
            }
        }
    }

    byte[] transform(@MaybeNull ClassLoader classLoader, String str, @MaybeNull ProtectionDomain protectionDomain, byte[] bArr);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum NoOp implements ClassFilePostProcessor {
        INSTANCE;

        @Override // net.bytebuddy.dynamic.loading.ClassFilePostProcessor
        public byte[] transform(@MaybeNull ClassLoader classLoader, String str, @MaybeNull ProtectionDomain protectionDomain, byte[] bArr) {
            return bArr;
        }
    }
}
