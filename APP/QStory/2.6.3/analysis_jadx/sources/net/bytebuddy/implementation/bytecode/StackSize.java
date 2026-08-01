package net.bytebuddy.implementation.bytecode;

import androidx.profileinstaller.AbstractC2442;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum StackSize {
    ZERO(0),
    SINGLE(1),
    DOUBLE(2);

    private final int size;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.StackSize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static /* synthetic */ class AnonymousClass1 {
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

    public static StackSize of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return SINGLE;
        }
        if (i == 2) {
            return DOUBLE;
        }
        C5925.m11310(AbstractC6183.m11588(i, "Unexpected stack size value: "));
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public StackSize maximum(StackSize stackSize) {
        int[] iArr = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;
        int i = iArr[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return stackSize;
                }
                C5554.m10870();
                return null;
            }
            int i2 = iArr[stackSize.ordinal()];
            if (i2 == 1) {
                return stackSize;
            }
            if (i2 != 2 && i2 != 3) {
                C5554.m10870();
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

    public static StackSize of(Class<?> cls) {
        if (cls == Void.TYPE) {
            return ZERO;
        }
        if (cls != Double.TYPE && cls != Long.TYPE) {
            return SINGLE;
        }
        return DOUBLE;
    }

    public static int of(TypeDefinition... typeDefinitionArr) {
        return of(Arrays.asList(typeDefinitionArr));
    }

    public static int of(Collection<? extends TypeDefinition> collection) {
        Iterator<? extends TypeDefinition> it = collection.iterator();
        int iM4566 = 0;
        while (it.hasNext()) {
            iM4566 = AbstractC2442.m4566(it.next(), iM4566);
        }
        return iM4566;
    }
}
