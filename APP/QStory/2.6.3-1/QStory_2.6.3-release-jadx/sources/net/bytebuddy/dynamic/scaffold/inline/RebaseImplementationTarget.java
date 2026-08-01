package net.bytebuddy.dynamic.scaffold.inline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class RebaseImplementationTarget extends Implementation.Target.AbstractBase {
    private final Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> rebaseableMethods;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Factory implements Implementation.Target.Factory {
        private final MethodRebaseResolver methodRebaseResolver;

        public Factory(MethodRebaseResolver methodRebaseResolver) {
            this.methodRebaseResolver = methodRebaseResolver;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.methodRebaseResolver.equals(((Factory) obj).methodRebaseResolver);
        }

        public int hashCode() {
            return this.methodRebaseResolver.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.Implementation.Target.Factory
        public Implementation.Target make(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion) {
            return RebaseImplementationTarget.m356of(typeDescription, linked, classFileVersion, this.methodRebaseResolver);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class RebasedMethodInvocation extends Implementation.SpecialMethodInvocation.AbstractBase {
        private final TypeDescription instrumentedType;
        private final MethodDescription.InDefinedShape methodDescription;
        private final TypeList prependedParameters;
        private final StackManipulation stackManipulation;

        public RebasedMethodInvocation(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription, StackManipulation stackManipulation, TypeList typeList) {
            this.methodDescription = inDefinedShape;
            this.instrumentedType = typeDescription;
            this.stackManipulation = stackManipulation;
            this.prependedParameters = typeList;
        }

        /* JADX INFO: renamed from: of */
        public static Implementation.SpecialMethodInvocation m357of(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription, TypeList typeList) {
            StackManipulation stackManipulationInvoke = inDefinedShape.isStatic() ? MethodInvocation.invoke(inDefinedShape) : MethodInvocation.invoke(inDefinedShape).special(typeDescription);
            if (!stackManipulationInvoke.isValid()) {
                return Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(typeList.size() + 1);
            Iterator<TypeDescription> it = typeList.iterator();
            while (it.hasNext()) {
                arrayList.add(DefaultValue.m443of(it.next()));
            }
            arrayList.add(stackManipulationInvoke);
            return new RebasedMethodInvocation(inDefinedShape, typeDescription, new StackManipulation.Compound(arrayList), typeList);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return this.stackManipulation.apply(methodVisitor, context);
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public MethodDescription getMethodDescription() {
            return this.methodDescription;
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public TypeDescription getTypeDescription() {
            return this.instrumentedType;
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public JavaConstant.MethodHandle toMethodHandle() {
            boolean zIsStatic = this.methodDescription.isStatic();
            MethodDescription.InDefinedShape inDefinedShape = this.methodDescription;
            return zIsStatic ? JavaConstant.MethodHandle.m481of(inDefinedShape) : JavaConstant.MethodHandle.ofSpecial(inDefinedShape, this.instrumentedType);
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(MethodDescription.TypeToken typeToken) {
            return this.methodDescription.asTypeToken().equals(new MethodDescription.TypeToken(typeToken.getReturnType(), CompoundList.m477of((List) typeToken.getParameterTypes(), (List) this.prependedParameters))) ? this : Implementation.SpecialMethodInvocation.Illegal.INSTANCE;
        }
    }

    public RebaseImplementationTarget(TypeDescription typeDescription, MethodGraph.Linked linked, Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation, Map<MethodDescription.SignatureToken, MethodRebaseResolver.Resolution> map) {
        super(typeDescription, linked, defaultMethodInvocation);
        this.rebaseableMethods = map;
    }

    private Implementation.SpecialMethodInvocation invokeSuper(MethodGraph.Node node) {
        TypeDescription.Generic superClass = this.instrumentedType.getSuperClass();
        return (!node.getSort().isResolved() || superClass == null) ? Implementation.SpecialMethodInvocation.Illegal.INSTANCE : Implementation.SpecialMethodInvocation.Simple.m372of(node.getRepresentative(), superClass.asErasure());
    }

    /* JADX INFO: renamed from: of */
    public static Implementation.Target m356of(TypeDescription typeDescription, MethodGraph.Linked linked, ClassFileVersion classFileVersion, MethodRebaseResolver methodRebaseResolver) {
        return new RebaseImplementationTarget(typeDescription, linked, Implementation.Target.AbstractBase.DefaultMethodInvocation.m373of(classFileVersion), methodRebaseResolver.asTokenMap());
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.rebaseableMethods.equals(((RebaseImplementationTarget) obj).rebaseableMethods);
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public int hashCode() {
        return this.rebaseableMethods.hashCode() + (super.hashCode() * 31);
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public TypeDescription getOriginType() {
        return this.instrumentedType;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public Implementation.SpecialMethodInvocation invokeSuper(MethodDescription.SignatureToken signatureToken) {
        MethodRebaseResolver.Resolution resolution = this.rebaseableMethods.get(signatureToken);
        if (resolution == null) {
            return invokeSuper(this.methodGraph.getSuperClassGraph().locate(signatureToken));
        }
        return invokeSuper(resolution);
    }

    private Implementation.SpecialMethodInvocation invokeSuper(MethodRebaseResolver.Resolution resolution) {
        if (resolution.isRebased()) {
            return RebasedMethodInvocation.m357of(resolution.getResolvedMethod(), this.instrumentedType, resolution.getAppendedParameters());
        }
        return Implementation.SpecialMethodInvocation.Simple.m372of(resolution.getResolvedMethod(), this.instrumentedType);
    }
}
