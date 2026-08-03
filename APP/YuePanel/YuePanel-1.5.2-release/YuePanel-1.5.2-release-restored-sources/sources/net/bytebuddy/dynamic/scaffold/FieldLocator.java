package net.bytebuddy.dynamic.scaffold;

import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldLocator {

    public interface Factory {
        FieldLocator make(TypeDescription typeDescription);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassHierarchy extends AbstractBase {
        private final TypeDescription typeDescription;

        public enum Factory implements Factory {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForClassHierarchy(typeDescription);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForClassHierarchy(TypeDescription typeDescription) {
            this(typeDescription, typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public boolean equals(@MaybeNull Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForClassHierarchy) obj).typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.typeDescription.hashCode();
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            Iterator<TypeDefinition> it = this.typeDescription.iterator();
            while (it.hasNext()) {
                FieldList<?> fieldList = (FieldList) it.next().getDeclaredFields().filter(elementMatcher);
                if (!fieldList.isEmpty()) {
                    return fieldList;
                }
            }
            return new FieldList.Empty();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForClassHierarchy(TypeDescription typeDescription, TypeDescription typeDescription2) {
            super(typeDescription2);
            this.typeDescription = typeDescription;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForExactType extends AbstractBase {
        private final TypeDescription typeDescription;

        @HashCodeAndEqualsPlugin.Enhance
        public static class Factory implements Factory {
            private final TypeDescription typeDescription;

            public Factory(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Factory) obj).typeDescription);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.typeDescription.hashCode();
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForExactType(this.typeDescription, typeDescription);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ForExactType(TypeDescription typeDescription) {
            this(typeDescription, typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public boolean equals(@MaybeNull Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForExactType) obj).typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.typeDescription.hashCode();
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            return (FieldList) this.typeDescription.getDeclaredFields().filter(elementMatcher);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ForExactType(TypeDescription typeDescription, TypeDescription typeDescription2) {
            super(typeDescription2);
            this.typeDescription = typeDescription;
        }
    }

    public static class ForTopLevelType extends AbstractBase {

        public enum Factory implements Factory {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForTopLevelType(typeDescription);
            }
        }

        public ForTopLevelType(TypeDescription typeDescription) {
            super(typeDescription);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            return (FieldList) this.accessingType.getDeclaredFields().filter(elementMatcher);
        }
    }

    public enum NoOp implements FieldLocator, Factory {
        INSTANCE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str) {
            return Resolution.Illegal.INSTANCE;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Factory
        public FieldLocator make(TypeDescription typeDescription) {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str, TypeDescription typeDescription) {
            return Resolution.Illegal.INSTANCE;
        }
    }

    public interface Resolution {

        public enum Illegal implements Resolution {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public FieldDescription getField() {
                throw new IllegalStateException("Could not locate field");
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                return false;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements Resolution {
            private final FieldDescription fieldDescription;

            public Simple(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            public static Resolution ofBeanAccessor(FieldLocator fieldLocator, MethodDescription methodDescription) {
                String strSubstring;
                if (ElementMatchers.isSetter().matches(methodDescription)) {
                    strSubstring = methodDescription.getInternalName().substring(3);
                } else {
                    if (!ElementMatchers.isGetter().matches(methodDescription)) {
                        return Illegal.INSTANCE;
                    }
                    strSubstring = methodDescription.getInternalName().substring(methodDescription.getInternalName().startsWith("is") ? 2 : 3);
                }
                Resolution resolutionLocate = fieldLocator.locate(Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1));
                if (resolutionLocate.isResolved()) {
                    return resolutionLocate;
                }
                return fieldLocator.locate(Character.toUpperCase(strSubstring.charAt(0)) + strSubstring.substring(1));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Simple) obj).fieldDescription);
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public FieldDescription getField() {
                return this.fieldDescription;
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.fieldDescription.hashCode();
            }

            @Override // net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                return true;
            }
        }

        FieldDescription getField();

        boolean isResolved();
    }

    Resolution locate(String str);

    Resolution locate(String str, TypeDescription typeDescription);

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class AbstractBase implements FieldLocator {
        protected final TypeDescription accessingType;

        public AbstractBase(TypeDescription typeDescription) {
            this.accessingType = typeDescription;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.accessingType.equals(((AbstractBase) obj).accessingType);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.accessingType.hashCode();
        }

        public abstract FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str) {
            FieldList<?> fieldListLocate = locate(ElementMatchers.named(str).and(ElementMatchers.isVisibleTo(this.accessingType)));
            return fieldListLocate.size() == 1 ? new Resolution.Simple((FieldDescription) fieldListLocate.getOnly()) : Resolution.Illegal.INSTANCE;
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str, TypeDescription typeDescription) {
            FieldList<?> fieldListLocate = locate(ElementMatchers.named(str).and(ElementMatchers.fieldType(typeDescription)).and(ElementMatchers.isVisibleTo(this.accessingType)));
            return fieldListLocate.size() == 1 ? new Resolution.Simple((FieldDescription) fieldListLocate.getOnly()) : Resolution.Illegal.INSTANCE;
        }
    }
}
