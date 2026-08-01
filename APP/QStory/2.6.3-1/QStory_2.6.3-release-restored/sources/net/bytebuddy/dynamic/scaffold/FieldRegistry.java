package net.bytebuddy.dynamic.scaffold;

import androidx.profileinstaller.AbstractC3275;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.Transformer;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface FieldRegistry {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Compiled extends TypeWriter.FieldPool {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NoOp implements Compiled {
            INSTANCE;

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public TypeWriter.FieldPool.Record target(FieldDescription fieldDescription) {
                return new TypeWriter.FieldPool.Record.ForImplicitField(fieldDescription);
            }
        }
    }

    Compiled compile(TypeDescription typeDescription);

    FieldRegistry prepend(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, @MaybeNull Object obj, Transformer<FieldDescription> transformer);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements FieldRegistry {
        private final List<Entry> entries;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Entry implements LatentMatcher<FieldDescription> {

            @MaybeNull
            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final Object defaultValue;
            private final FieldAttributeAppender.Factory fieldAttributeAppenderFactory;
            private final LatentMatcher<? super FieldDescription> matcher;
            private final Transformer<FieldDescription> transformer;

            public Entry(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, @MaybeNull Object obj, Transformer<FieldDescription> transformer) {
                this.matcher = latentMatcher;
                this.fieldAttributeAppenderFactory = factory;
                this.defaultValue = obj;
                this.transformer = transformer;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
            
                if (r2 != null) goto L24;
             */
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
                Entry entry = (Entry) obj;
                if (!this.matcher.equals(entry.matcher) || !this.fieldAttributeAppenderFactory.equals(entry.fieldAttributeAppenderFactory)) {
                    return false;
                }
                Object obj2 = this.defaultValue;
                Object obj3 = entry.defaultValue;
                if (obj3 != null) {
                    if (obj2 == null || !obj2.equals(obj3)) {
                        return false;
                    }
                    return this.transformer.equals(entry.transformer);
                }
            }

            @MaybeNull
            public Object getDefaultValue() {
                return this.defaultValue;
            }

            public FieldAttributeAppender.Factory getFieldAttributeAppenderFactory() {
                return this.fieldAttributeAppenderFactory;
            }

            public Transformer<FieldDescription> getTransformer() {
                return this.transformer;
            }

            public int hashCode() {
                int iHashCode = (this.fieldAttributeAppenderFactory.hashCode() + ((this.matcher.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31;
                Object obj = this.defaultValue;
                if (obj != null) {
                    iHashCode += obj.hashCode();
                }
                return this.transformer.hashCode() + (iHashCode * 31);
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public ElementMatcher<? super FieldDescription> resolve(TypeDescription typeDescription) {
                return this.matcher.resolve(typeDescription);
            }
        }

        public Default() {
            this(Collections.EMPTY_LIST);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public Compiled compile(TypeDescription typeDescription) {
            ArrayList arrayList = new ArrayList(this.entries.size());
            HashMap map = new HashMap();
            for (Entry entry : this.entries) {
                FieldAttributeAppender fieldAttributeAppenderMake = (FieldAttributeAppender) map.get(entry.getFieldAttributeAppenderFactory());
                if (fieldAttributeAppenderMake == null) {
                    fieldAttributeAppenderMake = entry.getFieldAttributeAppenderFactory().make(typeDescription);
                    map.put(entry.getFieldAttributeAppenderFactory(), fieldAttributeAppenderMake);
                }
                arrayList.add(new Compiled.Entry(entry.resolve(typeDescription), fieldAttributeAppenderMake, entry.getDefaultValue(), entry.getTransformer()));
            }
            return new Compiled(typeDescription, arrayList);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.entries.equals(((Default) obj).entries);
        }

        public int hashCode() {
            return this.entries.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.dynamic.scaffold.FieldRegistry
        public FieldRegistry prepend(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, @MaybeNull Object obj, Transformer<FieldDescription> transformer) {
            ArrayList arrayList = new ArrayList(this.entries.size() + 1);
            arrayList.add(new Entry(latentMatcher, factory, obj, transformer));
            arrayList.addAll(this.entries);
            return new Default(arrayList);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Compiled implements Compiled {
            private final List<Entry> entries;
            private final TypeDescription instrumentedType;

            public Compiled(TypeDescription typeDescription, List<Entry> list) {
                this.instrumentedType = typeDescription;
                this.entries = list;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Compiled compiled = (Compiled) obj;
                return this.instrumentedType.equals(compiled.instrumentedType) && this.entries.equals(compiled.entries);
            }

            public int hashCode() {
                return this.entries.hashCode() + AbstractC3275.m5144(this.instrumentedType, getClass().hashCode() * 31, 31);
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public TypeWriter.FieldPool.Record target(FieldDescription fieldDescription) {
                for (Entry entry : this.entries) {
                    if (entry.matches(fieldDescription)) {
                        return entry.bind(this.instrumentedType, fieldDescription);
                    }
                }
                return new TypeWriter.FieldPool.Record.ForImplicitField(fieldDescription);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Entry implements ElementMatcher<FieldDescription> {

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final Object defaultValue;
                private final FieldAttributeAppender fieldAttributeAppender;
                private final ElementMatcher<? super FieldDescription> matcher;
                private final Transformer<FieldDescription> transformer;

                public Entry(ElementMatcher<? super FieldDescription> elementMatcher, FieldAttributeAppender fieldAttributeAppender, @MaybeNull Object obj, Transformer<FieldDescription> transformer) {
                    this.matcher = elementMatcher;
                    this.fieldAttributeAppender = fieldAttributeAppender;
                    this.defaultValue = obj;
                    this.transformer = transformer;
                }

                public TypeWriter.FieldPool.Record bind(TypeDescription typeDescription, FieldDescription fieldDescription) {
                    return new TypeWriter.FieldPool.Record.ForExplicitField(this.fieldAttributeAppender, this.defaultValue, this.transformer.transform(typeDescription, fieldDescription));
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
                
                    if (r2 != null) goto L24;
                 */
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
                    Entry entry = (Entry) obj;
                    if (!this.matcher.equals(entry.matcher) || !this.fieldAttributeAppender.equals(entry.fieldAttributeAppender)) {
                        return false;
                    }
                    Object obj2 = this.defaultValue;
                    Object obj3 = entry.defaultValue;
                    if (obj3 != null) {
                        if (obj2 == null || !obj2.equals(obj3)) {
                            return false;
                        }
                        return this.transformer.equals(entry.transformer);
                    }
                }

                public int hashCode() {
                    int iHashCode = (this.fieldAttributeAppender.hashCode() + AbstractC3275.m5146(this.matcher, getClass().hashCode() * 31, 31)) * 31;
                    Object obj = this.defaultValue;
                    if (obj != null) {
                        iHashCode += obj.hashCode();
                    }
                    return this.transformer.hashCode() + (iHashCode * 31);
                }

                @Override // net.bytebuddy.matcher.ElementMatcher
                public boolean matches(@MaybeNull FieldDescription fieldDescription) {
                    return this.matcher.matches(fieldDescription);
                }
            }
        }

        private Default(List<Entry> list) {
            this.entries = list;
        }
    }
}
