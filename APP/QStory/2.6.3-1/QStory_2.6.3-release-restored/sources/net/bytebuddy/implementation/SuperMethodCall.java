package net.bytebuddy.implementation;

import androidx.profileinstaller.AbstractC3275;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum SuperMethodCall implements Implementation.Composable {
    INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements ByteCodeAppender {
        private final Implementation.Target implementationTarget;
        private final TerminationHandler terminationHandler;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum TerminationHandler {
            RETURNING { // from class: net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.1
                @Override // net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                /* JADX INFO: renamed from: of */
                public StackManipulation mo415of(MethodDescription methodDescription) {
                    return MethodReturn.m448of(methodDescription.getReturnType());
                }
            },
            DROPPING { // from class: net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.2
                @Override // net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                /* JADX INFO: renamed from: of */
                public StackManipulation mo415of(MethodDescription methodDescription) {
                    return Removal.m432of(methodDescription.getReturnType());
                }
            };

            /* JADX INFO: renamed from: of */
            public abstract StackManipulation mo415of(MethodDescription methodDescription);
        }

        public Appender(Implementation.Target target, TerminationHandler terminationHandler) {
            this.implementationTarget = target;
            this.terminationHandler = terminationHandler;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Implementation.SpecialMethodInvocation specialMethodInvocationWithCheckedCompatibilityTo = this.implementationTarget.invokeDominant(methodDescription.asSignatureToken()).withCheckedCompatibilityTo(methodDescription.asTypeToken());
            if (specialMethodInvocationWithCheckedCompatibilityTo.isValid()) {
                return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), specialMethodInvocationWithCheckedCompatibilityTo, this.terminationHandler.mo415of(methodDescription)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
            C6755.m11870(AbstractC3275.m5133("Cannot call super (or default) method for ", methodDescription));
            return null;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.terminationHandler.equals(appender.terminationHandler) && this.implementationTarget.equals(appender.implementationTarget);
        }

        public int hashCode() {
            return this.terminationHandler.hashCode() + ((this.implementationTarget.hashCode() + (getClass().hashCode() * 31)) * 31);
        }
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return new Implementation.Compound(WithoutReturn.INSTANCE, implementation);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target, Appender.TerminationHandler.RETURNING);
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return new Implementation.Compound.Composable(WithoutReturn.INSTANCE, composable);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum WithoutReturn implements Implementation {
        INSTANCE;

        @Override // net.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(target, Appender.TerminationHandler.DROPPING);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
