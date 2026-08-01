package net.bytebuddy.description.enumeration;

import java.util.ArrayList;
import java.util.List;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.build.CachedReturnPlugin;
import net.bytebuddy.description.NamedElement;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface EnumerationDescription extends NamedElement {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractBase implements EnumerationDescription {
        private transient /* synthetic */ int hashCode;

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumerationDescription)) {
                return false;
            }
            EnumerationDescription enumerationDescription = (EnumerationDescription) obj;
            return getEnumerationType().equals(enumerationDescription.getEnumerationType()) && getValue().equals(enumerationDescription.getValue());
        }

        @Override // net.bytebuddy.description.NamedElement
        public String getActualName() {
            return getValue();
        }

        @CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
            int iHashCode = this.hashCode != 0 ? 0 : getValue().hashCode() + (getEnumerationType().hashCode() * 31);
            if (iHashCode == 0) {
                return this.hashCode;
            }
            this.hashCode = iHashCode;
            return iHashCode;
        }

        public String toString() {
            return getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class ForLoadedEnumeration extends AbstractBase {
        private final Enum<?> value;

        public ForLoadedEnumeration(Enum<?> r1) {
            this.value = r1;
        }

        public static List<EnumerationDescription> asList(Enum<?>[] enumArr) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum<?> r0 : enumArr) {
                arrayList.add(new ForLoadedEnumeration(r0));
            }
            return arrayList;
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public TypeDescription getEnumerationType() {
            return TypeDescription.ForLoadedType.of(this.value.getDeclaringClass());
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public String getValue() {
            return this.value.name();
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public <T extends Enum<T>> T load(Class<T> cls) {
            Class<T> declaringClass = this.value.getDeclaringClass();
            T t = (T) this.value;
            return declaringClass == cls ? t : (T) Enum.valueOf(cls, t.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Latent extends AbstractBase {
        private final TypeDescription enumerationType;
        private final String value;

        public Latent(TypeDescription typeDescription, String str) {
            this.enumerationType = typeDescription;
            this.value = str;
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public TypeDescription getEnumerationType() {
            return this.enumerationType;
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public String getValue() {
            return this.value;
        }

        @Override // net.bytebuddy.description.enumeration.EnumerationDescription
        public <T extends Enum<T>> T load(Class<T> cls) {
            if (this.enumerationType.represents(cls)) {
                return (T) Enum.valueOf(cls, this.value);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            C5553.m10819(sb, " does not represent ", this.enumerationType);
            return null;
        }
    }

    TypeDescription getEnumerationType();

    String getValue();

    <T extends Enum<T>> T load(Class<T> cls);
}
