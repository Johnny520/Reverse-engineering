package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;

/* JADX INFO: loaded from: classes.dex */
public class MethodHandle implements Comparable<MethodHandle> {
    private final Dex dex;
    private final int fieldOrMethodId;
    private final MethodHandleType methodHandleType;
    private final int unused1;
    private final int unused2;

    /* JADX INFO: renamed from: com.android.dex.MethodHandle$1 */
    public static /* synthetic */ class C18041 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dex$MethodHandle$MethodHandleType;

        static {
            int[] iArr = new int[MethodHandleType.values().length];
            $SwitchMap$com$android$dex$MethodHandle$MethodHandleType = iArr;
            try {
                iArr[MethodHandleType.METHOD_HANDLE_TYPE_STATIC_PUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$dex$MethodHandle$MethodHandleType[MethodHandleType.METHOD_HANDLE_TYPE_STATIC_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$dex$MethodHandle$MethodHandleType[MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$android$dex$MethodHandle$MethodHandleType[MethodHandleType.METHOD_HANDLE_TYPE_INSTANCE_GET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum MethodHandleType {
        METHOD_HANDLE_TYPE_STATIC_PUT(0),
        METHOD_HANDLE_TYPE_STATIC_GET(1),
        METHOD_HANDLE_TYPE_INSTANCE_PUT(2),
        METHOD_HANDLE_TYPE_INSTANCE_GET(3),
        METHOD_HANDLE_TYPE_INVOKE_STATIC(4),
        METHOD_HANDLE_TYPE_INVOKE_INSTANCE(5),
        METHOD_HANDLE_TYPE_INVOKE_DIRECT(6),
        METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR(7),
        METHOD_HANDLE_TYPE_INVOKE_INTERFACE(8);

        private final int value;

        MethodHandleType(int i) {
            this.value = i;
        }

        public static MethodHandleType fromValue(int i) {
            for (MethodHandleType methodHandleType : values()) {
                if (methodHandleType.value == i) {
                    return methodHandleType;
                }
            }
            throw new IllegalArgumentException(String.valueOf(i));
        }

        public boolean isField() {
            int i = C18041.$SwitchMap$com$android$dex$MethodHandle$MethodHandleType[ordinal()];
            return i == 1 || i == 2 || i == 3 || i == 4;
        }
    }

    public MethodHandle(Dex dex, MethodHandleType methodHandleType, int i, int i2, int i3) {
        this.dex = dex;
        this.methodHandleType = methodHandleType;
        this.unused1 = i;
        this.fieldOrMethodId = i2;
        this.unused2 = i3;
    }

    public int getFieldOrMethodId() {
        return this.fieldOrMethodId;
    }

    public MethodHandleType getMethodHandleType() {
        return this.methodHandleType;
    }

    public int getUnused1() {
        return this.unused1;
    }

    public int getUnused2() {
        return this.unused2;
    }

    public String toString() {
        if (this.dex == null) {
            return this.methodHandleType + " " + this.fieldOrMethodId;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.methodHandleType);
        sb.append(" ");
        sb.append(this.methodHandleType.isField() ? this.dex.fieldIds().get(this.fieldOrMethodId) : this.dex.methodIds().get(this.fieldOrMethodId));
        return sb.toString();
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.methodHandleType.value);
        section.writeUnsignedShort(this.unused1);
        section.writeUnsignedShort(this.fieldOrMethodId);
        section.writeUnsignedShort(this.unused2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(MethodHandle methodHandle) {
        MethodHandleType methodHandleType = this.methodHandleType;
        MethodHandleType methodHandleType2 = methodHandle.methodHandleType;
        return methodHandleType != methodHandleType2 ? methodHandleType.compareTo(methodHandleType2) : Unsigned.compare(this.fieldOrMethodId, methodHandle.fieldOrMethodId);
    }
}
