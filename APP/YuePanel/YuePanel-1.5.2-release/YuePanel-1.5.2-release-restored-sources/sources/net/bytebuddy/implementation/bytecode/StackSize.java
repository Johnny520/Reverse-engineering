package net.bytebuddy.implementation.bytecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.bytecode.StackManipulation;

/* JADX INFO: loaded from: classes2.dex */
public enum StackSize {
    ZERO(0),
    SINGLE(1),
    DOUBLE(2);

    private final int size;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.StackSize$1 */
    public static /* synthetic */ class C28861 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;

        static {
            int[] iArr = new int[StackSize.values().length];
            $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = iArr;
            try {
                iArr[StackSize.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[StackSize.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[StackSize.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    StackSize(int i) {
        this.size = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static StackSize m5374of(Class<?> cls) {
        return cls == Void.TYPE ? ZERO : (cls == Double.TYPE || cls == Long.TYPE) ? DOUBLE : SINGLE;
    }

    public int getSize() {
        return this.size;
    }

    public StackSize maximum(StackSize stackSize) {
        int[] iArr = C28861.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;
        int i = iArr[ordinal()];
        if (i == 1) {
            return this;
        }
        if (i != 2) {
            if (i == 3) {
                return stackSize;
            }
            throw new AssertionError();
        }
        int i2 = iArr[stackSize.ordinal()];
        if (i2 == 1) {
            return stackSize;
        }
        if (i2 == 2 || i2 == 3) {
            return this;
        }
        throw new AssertionError();
    }

    public StackManipulation.Size toDecreasingSize() {
        return new StackManipulation.Size(getSize() * (-1), 0);
    }

    public StackManipulation.Size toIncreasingSize() {
        return new StackManipulation.Size(getSize(), getSize());
    }

    /* JADX INFO: renamed from: of */
    public static StackSize m5373of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return SINGLE;
        }
        if (i == 2) {
            return DOUBLE;
        }
        throw new IllegalArgumentException("Unexpected stack size value: " + i);
    }

    /* JADX INFO: renamed from: of */
    public static int m5372of(TypeDefinition... typeDefinitionArr) {
        return m5371of(Arrays.asList(typeDefinitionArr));
    }

    /* JADX INFO: renamed from: of */
    public static int m5371of(Collection<? extends TypeDefinition> collection) {
        Iterator<? extends TypeDefinition> it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getStackSize().getSize();
        }
        return size;
    }
}
