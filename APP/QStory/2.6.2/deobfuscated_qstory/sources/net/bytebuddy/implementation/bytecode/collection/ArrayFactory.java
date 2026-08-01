package net.bytebuddy.implementation.bytecode.collection;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4210;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class ArrayFactory implements CollectionFactory {
    private final ArrayCreator arrayCreator;
    private final TypeDescription.Generic componentType;

    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    private final StackManipulation.Size sizeDecrease;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface ArrayCreator extends StackManipulation {
        public static final StackManipulation.Size ARRAY_CREATION_SIZE_CHANGE = StackSize.ZERO.toDecreasingSize();

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum ForPrimitiveType implements ArrayCreator {
            BOOLEAN(4, 84),
            BYTE(8, 84),
            SHORT(9, 86),
            CHARACTER(5, 85),
            INTEGER(10, 79),
            LONG(11, 80),
            FLOAT(6, 81),
            DOUBLE(7, 82);

            private final int creationOpcode;
            private final int storageOpcode;

            ForPrimitiveType(int i, int i2) {
                this.creationOpcode = i;
                this.storageOpcode = i2;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitIntInsn(188, this.creationOpcode);
                return ArrayCreator.ARRAY_CREATION_SIZE_CHANGE;
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                return this.storageOpcode;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForReferenceType extends StackManipulation.AbstractBase implements ArrayCreator {
            private final String internalTypeName;

            public ForReferenceType(TypeDescription typeDescription) {
                this.internalTypeName = typeDescription.getInternalName();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitTypeInsn(189, this.internalTypeName);
                return ArrayCreator.ARRAY_CREATION_SIZE_CHANGE;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.internalTypeName.equals(((ForReferenceType) obj).internalTypeName);
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                return 83;
            }

            public int hashCode() {
                return this.internalTypeName.hashCode() + (getClass().hashCode() * 31);
            }
        }

        int getStorageOpcode();
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class ArrayStackManipulation implements StackManipulation {
        private final List<? extends StackManipulation> stackManipulations;

        public ArrayStackManipulation(List<? extends StackManipulation> list) {
            this.stackManipulations = list;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            StackManipulation.Size sizeAggregate = IntegerConstant.forValue(this.stackManipulations.size()).apply(methodVisitor, context).aggregate(ArrayFactory.this.arrayCreator.apply(methodVisitor, context));
            int i = 0;
            for (StackManipulation stackManipulation : this.stackManipulations) {
                methodVisitor.visitInsn(89);
                StackManipulation.Size sizeAggregate2 = sizeAggregate.aggregate(StackSize.SINGLE.toIncreasingSize()).aggregate(IntegerConstant.forValue(i).apply(methodVisitor, context)).aggregate(stackManipulation.apply(methodVisitor, context));
                methodVisitor.visitInsn(ArrayFactory.this.arrayCreator.getStorageOpcode());
                sizeAggregate = sizeAggregate2.aggregate(ArrayFactory.this.sizeDecrease);
                i++;
            }
            return sizeAggregate;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ArrayStackManipulation arrayStackManipulation = (ArrayStackManipulation) obj;
            return this.stackManipulations.equals(arrayStackManipulation.stackManipulations) && ArrayFactory.this.equals(ArrayFactory.this);
        }

        public int hashCode() {
            return ArrayFactory.this.hashCode() + AbstractC0053.m159(this.stackManipulations, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            Iterator<? extends StackManipulation> it = this.stackManipulations.iterator();
            while (it.hasNext()) {
                if (!it.next().isValid()) {
                    return false;
                }
            }
            return ArrayFactory.this.arrayCreator.isValid();
        }
    }

    public ArrayFactory(TypeDescription.Generic generic, ArrayCreator arrayCreator) {
        this.componentType = generic;
        this.arrayCreator = arrayCreator;
        this.sizeDecrease = StackSize.DOUBLE.toDecreasingSize().aggregate(generic.getStackSize().toDecreasingSize());
    }

    public static ArrayFactory forType(TypeDescription.Generic generic) {
        return new ArrayFactory(generic, makeArrayCreatorFor(generic));
    }

    private static ArrayCreator makeArrayCreatorFor(TypeDefinition typeDefinition) {
        if (!typeDefinition.isPrimitive()) {
            return new ArrayCreator.ForReferenceType(typeDefinition.asErasure());
        }
        if (typeDefinition.represents(Boolean.TYPE)) {
            return ArrayCreator.ForPrimitiveType.BOOLEAN;
        }
        if (typeDefinition.represents(Byte.TYPE)) {
            return ArrayCreator.ForPrimitiveType.BYTE;
        }
        if (typeDefinition.represents(Short.TYPE)) {
            return ArrayCreator.ForPrimitiveType.SHORT;
        }
        if (typeDefinition.represents(Character.TYPE)) {
            return ArrayCreator.ForPrimitiveType.CHARACTER;
        }
        if (typeDefinition.represents(Integer.TYPE)) {
            return ArrayCreator.ForPrimitiveType.INTEGER;
        }
        if (typeDefinition.represents(Long.TYPE)) {
            return ArrayCreator.ForPrimitiveType.LONG;
        }
        if (typeDefinition.represents(Float.TYPE)) {
            return ArrayCreator.ForPrimitiveType.FLOAT;
        }
        if (typeDefinition.represents(Double.TYPE)) {
            return ArrayCreator.ForPrimitiveType.DOUBLE;
        }
        C4210.m8614(typeDefinition, "Cannot create array of type ");
        return null;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrayFactory arrayFactory = (ArrayFactory) obj;
        return this.componentType.equals(arrayFactory.componentType) && this.arrayCreator.equals(arrayFactory.arrayCreator);
    }

    @Override // net.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public TypeDescription.Generic getComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.arrayCreator.hashCode() + AbstractC2442.m4575(this.componentType, getClass().hashCode() * 31, 31);
    }

    @Override // net.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public StackManipulation withValues(List<? extends StackManipulation> list) {
        return new ArrayStackManipulation(list);
    }
}
