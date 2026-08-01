package net.bytebuddy.implementation.bytecode;

import androidx.profileinstaller.AbstractC3275;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum StackSize {
    ZERO(0),
    SINGLE(1),
    DOUBLE(2);

    private final int size;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.StackSize$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static /* synthetic */ class C07211 {
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

    /* JADX INFO: renamed from: of */
    public static StackSize m435of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return SINGLE;
        }
        if (i == 2) {
            return DOUBLE;
        }
        C6755.m11869(AbstractC7012.m12147(i, "Unexpected stack size value: "));
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public StackSize maximum(StackSize stackSize) {
        int[] iArr = C07211.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;
        int i = iArr[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return stackSize;
                }
                C6385.m11429();
                return null;
            }
            int i2 = iArr[stackSize.ordinal()];
            if (i2 == 1) {
                return stackSize;
            }
            if (i2 != 2 && i2 != 3) {
                C6385.m11429();
                return null;
            }
        }
        return this;
    }

    public StackManipulation.Size toDecreasingSize() {
        return new StackManipulation.Size(getSize() * (-1), 0);
    }

    public StackManipulation.Size toIncreasingSize() {
        return new StackManipulation.Size(getSize(), getSize());
    }

    /* JADX INFO: renamed from: of */
    public static StackSize m436of(Class<?> cls) {
        if (cls == Void.TYPE) {
            return ZERO;
        }
        if (cls != Double.TYPE && cls != Long.TYPE) {
            return SINGLE;
        }
        return DOUBLE;
    }

    /* JADX INFO: renamed from: of */
    public static int m434of(TypeDefinition... typeDefinitionArr) {
        return m433of(Arrays.asList(typeDefinitionArr));
    }

    /* JADX INFO: renamed from: of */
    public static int m433of(Collection<? extends TypeDefinition> collection) {
        Iterator<? extends TypeDefinition> it = collection.iterator();
        int iM5126 = 0;
        while (it.hasNext()) {
            iM5126 = AbstractC3275.m5126(it.next(), iM5126);
        }
        return iM5126;
    }
}
