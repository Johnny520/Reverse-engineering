package net.bytebuddy.implementation.bytecode.member;

import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.nullability.MaybeNull;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class Invokedynamic extends StackManipulation.AbstractBase {
    private final List<? extends JavaConstant> arguments;
    private final JavaConstant.MethodHandle bootstrap;
    private final String name;
    private final JavaConstant.MethodType type;

    public Invokedynamic(String str, JavaConstant.MethodType methodType, JavaConstant.MethodHandle methodHandle, List<? extends JavaConstant> list) {
        this.name = str;
        this.type = methodType;
        this.bootstrap = methodHandle;
        this.arguments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        Object[] objArr = new Object[this.arguments.size()];
        for (int i = 0; i < this.arguments.size(); i++) {
            objArr[i] = this.arguments.get(i).accept(JavaConstantValue.Visitor.INSTANCE);
        }
        methodVisitor.visitInvokeDynamicInsn(this.name, this.type.getDescriptor(), JavaConstantValue.Visitor.INSTANCE.onMethodHandle(this.bootstrap), objArr);
        return new StackManipulation.Size(this.type.getReturnType().getStackSize().getSize() - this.type.getParameterTypes().getStackSize(), this.type.getReturnType().getStackSize().getSize());
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Invokedynamic invokedynamic = (Invokedynamic) obj;
        return this.name.equals(invokedynamic.name) && this.type.equals(invokedynamic.type) && this.bootstrap.equals(invokedynamic.bootstrap) && this.arguments.equals(invokedynamic.arguments);
    }

    public int hashCode() {
        return this.arguments.hashCode() + ((this.bootstrap.hashCode() + ((this.type.hashCode() + AbstractC7012.m12131(getClass().hashCode() * 31, 31, this.name)) * 31)) * 31);
    }
}
