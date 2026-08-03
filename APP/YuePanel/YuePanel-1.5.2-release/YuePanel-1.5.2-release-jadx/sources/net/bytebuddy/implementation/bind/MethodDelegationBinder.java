package net.bytebuddy.implementation.bind;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodDelegationBinder {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bind.MethodDelegationBinder$1 */
    public static /* synthetic */ class C28701 {

        /* JADX INFO: renamed from: $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution */
        static final /* synthetic */ int[] f4223x3870fe4c;

        static {
            int[] iArr = new int[AmbiguityResolver.Resolution.values().length];
            f4223x3870fe4c = iArr;
            try {
                iArr[AmbiguityResolver.Resolution.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4223x3870fe4c[AmbiguityResolver.Resolution.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4223x3870fe4c[AmbiguityResolver.Resolution.AMBIGUOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4223x3870fe4c[AmbiguityResolver.Resolution.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface AmbiguityResolver {
        public static final AmbiguityResolver DEFAULT = new Compound(BindingPriority.Resolver.INSTANCE, DeclaringTypeResolver.INSTANCE, ArgumentTypeResolver.INSTANCE, MethodNameEqualityResolver.INSTANCE, ParameterLengthResolver.INSTANCE);

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements AmbiguityResolver {
            private final List<AmbiguityResolver> ambiguityResolvers;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Compound(AmbiguityResolver... ambiguityResolverArr) {
                this((List<? extends AmbiguityResolver>) Arrays.asList(ambiguityResolverArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.ambiguityResolvers.equals(((Compound) obj).ambiguityResolvers);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.ambiguityResolvers.hashCode();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                Resolution resolutionResolve = Resolution.UNKNOWN;
                Iterator<AmbiguityResolver> it = this.ambiguityResolvers.iterator();
                while (resolutionResolve.isUnresolved() && it.hasNext()) {
                    resolutionResolve = it.next().resolve(methodDescription, methodBinding, methodBinding2);
                }
                return resolutionResolve;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Compound(List<? extends AmbiguityResolver> list) {
                this.ambiguityResolvers = new ArrayList();
                for (AmbiguityResolver ambiguityResolver : list) {
                    if (ambiguityResolver instanceof Compound) {
                        this.ambiguityResolvers.addAll(((Compound) ambiguityResolver).ambiguityResolvers);
                    } else if (!(ambiguityResolver instanceof NoOp)) {
                        this.ambiguityResolvers.add(ambiguityResolver);
                    }
                }
            }
        }

        public enum Directional implements AmbiguityResolver {
            LEFT(true),
            RIGHT(false);

            private final boolean left;

            Directional(boolean z) {
                this.left = z;
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return this.left ? Resolution.LEFT : Resolution.RIGHT;
            }
        }

        public enum NoOp implements AmbiguityResolver {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return Resolution.UNKNOWN;
            }
        }

        public enum Resolution {
            UNKNOWN(true),
            LEFT(false),
            RIGHT(false),
            AMBIGUOUS(true);

            private final boolean unresolved;

            Resolution(boolean z) {
                this.unresolved = z;
            }

            public boolean isUnresolved() {
                return this.unresolved;
            }

            public Resolution merge(Resolution resolution) {
                int i = C28701.f4223x3870fe4c[ordinal()];
                if (i == 1 || i == 2) {
                    return (resolution == UNKNOWN || resolution == this) ? this : AMBIGUOUS;
                }
                if (i == 3) {
                    return AMBIGUOUS;
                }
                if (i == 4) {
                    return resolution;
                }
                throw new AssertionError();
            }
        }

        Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2);
    }

    public interface BindingResolver {

        public enum Default implements BindingResolver {
            INSTANCE;

            private static final int LEFT = 0;
            private static final int ONLY = 0;
            private static final int RIGHT = 1;

            private MethodBinding doResolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                int size = list.size();
                if (size == 1) {
                    return list.get(0);
                }
                if (size == 2) {
                    MethodBinding methodBinding = list.get(0);
                    MethodBinding methodBinding2 = list.get(1);
                    int i = C28701.f4223x3870fe4c[ambiguityResolver.resolve(methodDescription, methodBinding, methodBinding2).ordinal()];
                    if (i == 1) {
                        return methodBinding;
                    }
                    if (i == 2) {
                        return methodBinding2;
                    }
                    if (i != 3 && i != 4) {
                        throw new AssertionError();
                    }
                    throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + methodDescription + " to " + methodBinding.getTarget() + " or " + methodBinding2.getTarget());
                }
                MethodBinding methodBinding3 = list.get(0);
                MethodBinding methodBinding4 = list.get(1);
                int[] iArr = C28701.f4223x3870fe4c;
                int i2 = iArr[ambiguityResolver.resolve(methodDescription, methodBinding3, methodBinding4).ordinal()];
                if (i2 == 1) {
                    list.remove(1);
                    return doResolve(ambiguityResolver, methodDescription, list);
                }
                if (i2 == 2) {
                    list.remove(0);
                    return doResolve(ambiguityResolver, methodDescription, list);
                }
                if (i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("Unexpected amount of targets: " + list.size());
                }
                list.remove(1);
                list.remove(0);
                MethodBinding methodBindingDoResolve = doResolve(ambiguityResolver, methodDescription, list);
                int i3 = iArr[ambiguityResolver.resolve(methodDescription, methodBinding3, methodBindingDoResolve).merge(ambiguityResolver.resolve(methodDescription, methodBinding4, methodBindingDoResolve)).ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return methodBindingDoResolve;
                    }
                    if (i3 != 3 && i3 != 4) {
                        throw new AssertionError();
                    }
                }
                throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + methodDescription + " to " + methodBinding3.getTarget() + " or " + methodBinding4.getTarget());
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                return doResolve(ambiguityResolver, methodDescription, new ArrayList(list));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements BindingResolver {
            private final BindingResolver delegate;
            private final PrintStream printStream;

            public StreamWriting(BindingResolver bindingResolver, PrintStream printStream) {
                this.delegate = bindingResolver;
                this.printStream = printStream;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static BindingResolver toSystemError() {
                return toSystemError(Default.INSTANCE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public static BindingResolver toSystemOut() {
                return toSystemOut(Default.INSTANCE);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                StreamWriting streamWriting = (StreamWriting) obj;
                return this.delegate.equals(streamWriting.delegate) && this.printStream.equals(streamWriting.printStream);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.printStream.hashCode();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                MethodBinding methodBindingResolve = this.delegate.resolve(ambiguityResolver, methodDescription, list);
                this.printStream.println("Binding " + methodDescription + " as delegation to " + methodBindingResolve.getTarget());
                return methodBindingResolve;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public static BindingResolver toSystemError(BindingResolver bindingResolver) {
                return new StreamWriting(bindingResolver, System.err);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public static BindingResolver toSystemOut(BindingResolver bindingResolver) {
                return new StreamWriting(bindingResolver, System.out);
            }
        }

        public enum Unique implements BindingResolver {
            INSTANCE;

            private static final int ONLY = 0;

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                if (list.size() == 1) {
                    return list.get(0);
                }
                throw new IllegalStateException(methodDescription + " allowed for more than one binding: " + list);
            }
        }

        MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list);
    }

    public interface MethodBinding extends StackManipulation {

        public static class Builder {
            private final MethodDescription candidate;
            private final MethodInvoker methodInvoker;
            private final List<StackManipulation> parameterStackManipulations;
            private final LinkedHashMap<Object, Integer> registeredTargetIndices = new LinkedHashMap<>();
            private int nextParameterIndex = 0;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Build implements MethodBinding {
                private final StackManipulation methodInvocation;
                private final List<StackManipulation> parameterStackManipulations;
                private final Map<?, Integer> registeredTargetIndices;
                private final MethodDescription target;
                private final StackManipulation terminatingStackManipulation;

                public Build(MethodDescription methodDescription, Map<?, Integer> map, StackManipulation stackManipulation, List<StackManipulation> list, StackManipulation stackManipulation2) {
                    this.target = methodDescription;
                    this.registeredTargetIndices = new HashMap(map);
                    this.methodInvocation = stackManipulation;
                    this.parameterStackManipulations = new ArrayList(list);
                    this.terminatingStackManipulation = stackManipulation2;
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                    return new StackManipulation.Compound((List<? extends StackManipulation>) CompoundList.m5414of((List) this.parameterStackManipulations, Arrays.asList(this.methodInvocation, this.terminatingStackManipulation))).apply(methodVisitor, context);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Build build = (Build) obj;
                    return this.target.equals(build.target) && this.registeredTargetIndices.equals(build.registeredTargetIndices) && this.methodInvocation.equals(build.methodInvocation) && this.parameterStackManipulations.equals(build.parameterStackManipulations) && this.terminatingStackManipulation.equals(build.terminatingStackManipulation);
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                public MethodDescription getTarget() {
                    return this.target;
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                @MaybeNull
                public Integer getTargetParameterIndex(Object obj) {
                    return this.registeredTargetIndices.get(obj);
                }

                public int hashCode() {
                    return (((((((((getClass().hashCode() * 31) + this.target.hashCode()) * 31) + this.registeredTargetIndices.hashCode()) * 31) + this.methodInvocation.hashCode()) * 31) + this.parameterStackManipulations.hashCode()) * 31) + this.terminatingStackManipulation.hashCode();
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                    boolean zIsValid = this.methodInvocation.isValid() && this.terminatingStackManipulation.isValid();
                    Iterator<StackManipulation> it = this.parameterStackManipulations.iterator();
                    while (zIsValid && it.hasNext()) {
                        zIsValid = it.next().isValid();
                    }
                    return zIsValid;
                }
            }

            public Builder(MethodInvoker methodInvoker, MethodDescription methodDescription) {
                this.methodInvoker = methodInvoker;
                this.candidate = methodDescription;
                this.parameterStackManipulations = new ArrayList(methodDescription.getParameters().size());
            }

            public boolean append(ParameterBinding<?> parameterBinding) {
                this.parameterStackManipulations.add(parameterBinding);
                LinkedHashMap<Object, Integer> linkedHashMap = this.registeredTargetIndices;
                Object identificationToken = parameterBinding.getIdentificationToken();
                int i = this.nextParameterIndex;
                this.nextParameterIndex = i + 1;
                return linkedHashMap.put(identificationToken, Integer.valueOf(i)) == null;
            }

            public MethodBinding build(StackManipulation stackManipulation) {
                if (this.candidate.getParameters().size() != this.nextParameterIndex) {
                    throw new IllegalStateException("The number of parameters bound does not equal the target's number of parameters");
                }
                MethodDescription methodDescription = this.candidate;
                return new Build(methodDescription, this.registeredTargetIndices, this.methodInvoker.invoke(methodDescription), this.parameterStackManipulations, stackManipulation);
            }
        }

        public enum Illegal implements MethodBinding {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                throw new IllegalStateException("Cannot delegate to an unbound method");
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public MethodDescription getTarget() {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public Integer getTargetParameterIndex(Object obj) {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return false;
            }
        }

        MethodDescription getTarget();

        @MaybeNull
        Integer getTargetParameterIndex(Object obj);
    }

    public interface MethodInvoker {

        public enum Simple implements MethodInvoker {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription) {
                return MethodInvocation.invoke(methodDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Virtual implements MethodInvoker {
            private final TypeDescription typeDescription;

            public Virtual(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Virtual) obj).typeDescription);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.typeDescription.hashCode();
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription) {
                return MethodInvocation.invoke(methodDescription).virtual(this.typeDescription);
            }
        }

        StackManipulation invoke(MethodDescription methodDescription);
    }

    public interface ParameterBinding<T> extends StackManipulation {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Anonymous implements ParameterBinding<Object> {

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final Object anonymousToken = new Object();
            private final StackManipulation delegate;

            public Anonymous(StackManipulation stackManipulation) {
                this.delegate = stackManipulation;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                return this.delegate.apply(methodVisitor, context);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((Anonymous) obj).delegate);
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public Object getIdentificationToken() {
                return this.anonymousToken;
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return this.delegate.isValid();
            }
        }

        public enum Illegal implements ParameterBinding<Void> {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                throw new IllegalStateException("An illegal parameter binding must not be applied");
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getIdentificationToken()Ljava/lang/Object; */
            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public Void getIdentificationToken() {
                throw new IllegalStateException("An illegal binding does not define an identification token");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Unique<T> implements ParameterBinding<T> {
            private final StackManipulation delegate;
            private final T identificationToken;

            public Unique(StackManipulation stackManipulation, T t) {
                this.delegate = stackManipulation;
                this.identificationToken = t;
            }

            /* JADX INFO: renamed from: of */
            public static <S> Unique<S> m5362of(StackManipulation stackManipulation, S s) {
                return new Unique<>(stackManipulation, s);
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                return this.delegate.apply(methodVisitor, context);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Unique unique = (Unique) obj;
                return this.identificationToken.equals(unique.identificationToken) && this.delegate.equals(unique.delegate);
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public T getIdentificationToken() {
                return this.identificationToken;
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.identificationToken.hashCode()) * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return this.delegate.isValid();
            }
        }

        T getIdentificationToken();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Processor implements Record {
        private final AmbiguityResolver ambiguityResolver;
        private final BindingResolver bindingResolver;
        private final List<? extends Record> records;

        public Processor(List<? extends Record> list, AmbiguityResolver ambiguityResolver, BindingResolver bindingResolver) {
            this.records = list;
            this.ambiguityResolver = ambiguityResolver;
            this.bindingResolver = bindingResolver;
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Record> it = this.records.iterator();
            while (it.hasNext()) {
                MethodBinding methodBindingBind = it.next().bind(target, methodDescription, terminationHandler, methodInvoker, assigner);
                if (methodBindingBind.isValid()) {
                    arrayList.add(methodBindingBind);
                }
            }
            if (!arrayList.isEmpty()) {
                return this.bindingResolver.resolve(this.ambiguityResolver, methodDescription, arrayList);
            }
            throw new IllegalArgumentException("None of " + this.records + " allows for delegation from " + methodDescription);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Processor processor = (Processor) obj;
            return this.records.equals(processor.records) && this.ambiguityResolver.equals(processor.ambiguityResolver) && this.bindingResolver.equals(processor.bindingResolver);
        }

        public int hashCode() {
            return (((((getClass().hashCode() * 31) + this.records.hashCode()) * 31) + this.ambiguityResolver.hashCode()) * 31) + this.bindingResolver.hashCode();
        }
    }

    public interface Record {

        public enum Illegal implements Record {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
            public MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner) {
                return MethodBinding.Illegal.INSTANCE;
            }
        }

        MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner);
    }

    public interface TerminationHandler {

        public enum Default implements TerminationHandler {
            RETURNING { // from class: net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.1
                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return new StackManipulation.Compound(assigner.assign(methodDescription2.isConstructor() ? methodDescription2.getDeclaringType().asGenericType() : methodDescription2.getReturnType(), methodDescription.getReturnType(), typing), MethodReturn.m5386of(methodDescription.getReturnType()));
                }
            },
            DROPPING { // from class: net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.2
                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Removal.m5370of(methodDescription2.isConstructor() ? methodDescription2.getDeclaringType() : methodDescription2.getReturnType());
                }
            };

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* synthetic */ Default(C28701 c28701) {
                this();
            }
        }

        StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2);
    }

    Record compile(MethodDescription methodDescription);
}
