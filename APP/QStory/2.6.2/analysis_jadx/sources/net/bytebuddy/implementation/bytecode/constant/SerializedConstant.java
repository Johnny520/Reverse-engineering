package net.bytebuddy.implementation.bytecode.constant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;
import p330.C8796;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class SerializedConstant extends StackManipulation.AbstractBase {
    private static final String CHARSET = "ISO-8859-1";
    private final String serialization;

    public SerializedConstant(String str) {
        this.serialization = str;
    }

    public static StackManipulation of(@MaybeNull Serializable serializable) {
        if (serializable == null) {
            return NullConstant.INSTANCE;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                return new SerializedConstant(byteArrayOutputStream.toString(CHARSET));
            } catch (Throwable th) {
                objectOutputStream.close();
                throw th;
            }
        } catch (IOException e) {
            C5553.m10818("Cannot serialize ", serializable, e);
            return null;
        }
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        try {
            StackManipulation stackManipulationOf = TypeCreation.of(TypeDescription.ForLoadedType.of(ObjectInputStream.class));
            StackManipulation stackManipulationOf2 = TypeCreation.of(TypeDescription.ForLoadedType.of(ByteArrayInputStream.class));
            TextConstant textConstant = new TextConstant(this.serialization);
            TextConstant textConstant2 = new TextConstant(CHARSET);
            MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(String.class.getMethod("getBytes", String.class)));
            MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke2 = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedConstructor(ByteArrayInputStream.class.getConstructor(byte[].class)));
            MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke3 = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedConstructor(ObjectInputStream.class.getConstructor(InputStream.class)));
            MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke4 = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ObjectInputStream.class.getMethod("readObject", null)));
            Duplication duplication = Duplication.SINGLE;
            return new StackManipulation.Compound(stackManipulationOf, duplication, stackManipulationOf2, duplication, textConstant, textConstant2, withImplicitInvocationTargetTypeInvoke, withImplicitInvocationTargetTypeInvoke2, withImplicitInvocationTargetTypeInvoke3, withImplicitInvocationTargetTypeInvoke4).apply(methodVisitor, context);
        } catch (NoSuchMethodException e) {
            C8796.m14449("Could not locate Java API method", e);
            return null;
        }
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.serialization.equals(((SerializedConstant) obj).serialization);
    }

    public int hashCode() {
        return this.serialization.hashCode() + (getClass().hashCode() * 31);
    }
}
