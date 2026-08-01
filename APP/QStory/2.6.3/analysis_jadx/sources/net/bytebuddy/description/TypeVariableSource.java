package net.bytebuddy.description;

import io.ktor.util.C4211;
import net.bytebuddy.description.ModifierReviewable;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeVariableSource extends ModifierReviewable.OfAbstraction {

    @AlwaysNull
    public static final TypeVariableSource UNDEFINED = null;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractBase extends ModifierReviewable.AbstractBase implements TypeVariableSource {
        @Override // net.bytebuddy.description.TypeVariableSource
        public TypeDescription.Generic findExpectedVariable(String str) {
            TypeDescription.Generic genericFindVariable = findVariable(str);
            if (genericFindVariable != null) {
                return genericFindVariable;
            }
            C4211.m8603(toSafeString(), AbstractC6183.m11585("Cannot resolve ", str, " from "));
            return null;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @MaybeNull
        public TypeDescription.Generic findVariable(String str) {
            TypeList.Generic genericFilter = getTypeVariables().filter(ElementMatchers.named(str));
            if (!genericFilter.isEmpty()) {
                return genericFilter.getOnly();
            }
            TypeVariableSource enclosingSource = getEnclosingSource();
            return enclosingSource == null ? TypeDescription.Generic.UNDEFINED : enclosingSource.findVariable(str);
        }

        public abstract String toSafeString();
    }

    <T> T accept(Visitor<T> visitor);

    TypeDescription.Generic findExpectedVariable(String str);

    @MaybeNull
    TypeDescription.Generic findVariable(String str);

    @MaybeNull
    TypeVariableSource getEnclosingSource();

    TypeList.Generic getTypeVariables();

    boolean isGenerified();

    boolean isInferrable();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Visitor<T> {
        T onMethod(MethodDescription.InDefinedShape inDefinedShape);

        T onType(TypeDescription typeDescription);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum NoOp implements Visitor<TypeVariableSource> {
            INSTANCE;

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            public TypeVariableSource onMethod(MethodDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape;
            }

            @Override // net.bytebuddy.description.TypeVariableSource.Visitor
            public TypeVariableSource onType(TypeDescription typeDescription) {
                return typeDescription;
            }
        }
    }
}
