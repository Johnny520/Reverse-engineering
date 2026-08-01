package com.android.dx.merge;

import com.android.dex.MethodHandle$MethodHandleType;
import com.android.dx.util.ByteArrayAnnotatedOutput;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3065;
import java.util.HashMap;
import p144.C7546;
import p283.C8381;
import p284.InterfaceC8384;
import p284.InterfaceC8385;
import p292.C8548;
import p292.C8552;
import p292.C8553;
import p292.C8554;
import p292.C8556;
import p292.C8557;
import p292.C8558;
import p292.C8559;
import p292.C8560;
import p292.C8561;
import p292.C8562;
import p292.C8566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class IndexMap {
    private final HashMap<Integer, Integer> annotationDirectoryOffsets;
    private final HashMap<Integer, Integer> annotationOffsets;
    private final HashMap<Integer, Integer> annotationSetOffsets;
    private final HashMap<Integer, Integer> annotationSetRefListOffsets;
    public final int[] callSiteIds;
    private final HashMap<Integer, Integer> encodedArrayValueOffset;
    public final short[] fieldIds;
    public final HashMap<Integer, Integer> methodHandleIds = new HashMap<>();
    public final short[] methodIds;
    public final short[] protoIds;
    public final int[] stringIds;
    private final C8566 target;
    public final short[] typeIds;
    private final HashMap<Integer, Integer> typeListOffsets;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public final class EncodedValueTransformer {
        private final InterfaceC8384 out;

        public EncodedValueTransformer(InterfaceC8384 interfaceC8384) {
            this.out = interfaceC8384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformAnnotation(C8557 c8557) {
            int iM14096 = c8557.m14096();
            AbstractC3065.m6829(this.out, IndexMap.this.adjustType(c8557.f23861));
            AbstractC3065.m6829(this.out, iM14096);
            for (int i = 0; i < iM14096; i++) {
                AbstractC3065.m6829(this.out, IndexMap.this.adjustString(AbstractC3065.m6852(c8557.f23863)));
                transform(c8557);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformArray(C8557 c8557) {
            c8557.m14098(28);
            c8557.f23862 = -1;
            int iM6852 = AbstractC3065.m6852(c8557.f23863);
            AbstractC3065.m6829(this.out, iM6852);
            for (int i = 0; i < iM6852; i++) {
                transform(c8557);
            }
        }

        private void writeTypeAndArg(int i, int i2) {
            this.out.writeByte(i | (i2 << 5));
        }

        public void transform(C8557 c8557) {
            int iM14097 = c8557.m14097();
            InterfaceC8385 interfaceC8385 = c8557.f23863;
            if (iM14097 == 0) {
                InterfaceC8384 interfaceC8384 = this.out;
                c8557.m14098(0);
                c8557.f23862 = -1;
                AbstractC3054.m6576(interfaceC8384, 0, (byte) AbstractC3054.m6603(interfaceC8385, c8557.f23860));
                return;
            }
            if (iM14097 == 6) {
                AbstractC3054.m6576(this.out, 6, c8557.m14094());
                return;
            }
            if (iM14097 == 2) {
                InterfaceC8384 interfaceC83842 = this.out;
                c8557.m14098(2);
                c8557.f23862 = -1;
                AbstractC3054.m6576(interfaceC83842, 2, (short) AbstractC3054.m6603(interfaceC8385, c8557.f23860));
                return;
            }
            if (iM14097 == 3) {
                InterfaceC8384 interfaceC83843 = this.out;
                c8557.m14098(3);
                c8557.f23862 = -1;
                AbstractC3054.m6575(interfaceC83843, 3, (char) AbstractC3054.m6604(interfaceC8385, c8557.f23860, false));
                return;
            }
            if (iM14097 == 4) {
                InterfaceC8384 interfaceC83844 = this.out;
                c8557.m14098(4);
                c8557.f23862 = -1;
                AbstractC3054.m6576(interfaceC83844, 4, AbstractC3054.m6603(interfaceC8385, c8557.f23860));
                return;
            }
            if (iM14097 == 16) {
                c8557.m14098(16);
                c8557.f23862 = -1;
                AbstractC3054.m6573(this.out, 16, ((long) Float.floatToIntBits(Float.intBitsToFloat(AbstractC3054.m6604(interfaceC8385, c8557.f23860, true)))) << 32);
                return;
            }
            if (iM14097 == 17) {
                AbstractC3054.m6573(this.out, 17, Double.doubleToLongBits(c8557.m14095()));
                return;
            }
            switch (iM14097) {
                case 21:
                    InterfaceC8384 interfaceC83845 = this.out;
                    IndexMap indexMap = IndexMap.this;
                    c8557.m14098(21);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC83845, 21, indexMap.adjustProto(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 22:
                    InterfaceC8384 interfaceC83846 = this.out;
                    IndexMap indexMap2 = IndexMap.this;
                    c8557.m14098(22);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC83846, 22, indexMap2.adjustMethodHandle(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 23:
                    AbstractC3054.m6575(this.out, 23, IndexMap.this.adjustString(c8557.m14093()));
                    break;
                case 24:
                    InterfaceC8384 interfaceC83847 = this.out;
                    IndexMap indexMap3 = IndexMap.this;
                    c8557.m14098(24);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC83847, 24, indexMap3.adjustType(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 25:
                    InterfaceC8384 interfaceC83848 = this.out;
                    IndexMap indexMap4 = IndexMap.this;
                    c8557.m14098(25);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC83848, 25, indexMap4.adjustField(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 26:
                    InterfaceC8384 interfaceC83849 = this.out;
                    IndexMap indexMap5 = IndexMap.this;
                    c8557.m14098(26);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC83849, 26, indexMap5.adjustMethod(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 27:
                    InterfaceC8384 interfaceC838410 = this.out;
                    IndexMap indexMap6 = IndexMap.this;
                    c8557.m14098(27);
                    c8557.f23862 = -1;
                    AbstractC3054.m6575(interfaceC838410, 27, indexMap6.adjustField(AbstractC3054.m6604(interfaceC8385, c8557.f23860, false)));
                    break;
                case 28:
                    writeTypeAndArg(28, 0);
                    transformArray(c8557);
                    break;
                case 29:
                    writeTypeAndArg(29, 0);
                    transformAnnotation(c8557);
                    break;
                case 30:
                    c8557.m14098(30);
                    c8557.f23862 = -1;
                    writeTypeAndArg(30, 0);
                    break;
                case 31:
                    c8557.m14098(31);
                    c8557.f23862 = -1;
                    writeTypeAndArg(31, c8557.f23860 != 0 ? 1 : 0);
                    break;
                default:
                    C7546.m12741(Integer.toHexString(c8557.m14097()), "Unexpected type: ");
                    break;
            }
        }
    }

    public IndexMap(C8566 c8566, C8554 c8554) {
        this.target = c8566;
        this.stringIds = new int[c8554.f23833.f23854];
        this.typeIds = new short[c8554.f23832.f23854];
        this.protoIds = new short[c8554.f23831.f23854];
        this.fieldIds = new short[c8554.f23830.f23854];
        this.methodIds = new short[c8554.f23829.f23854];
        this.callSiteIds = new int[c8554.f23847.f23854];
        HashMap<Integer, Integer> map = new HashMap<>();
        this.typeListOffsets = map;
        this.annotationOffsets = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        this.annotationSetOffsets = map2;
        this.annotationSetRefListOffsets = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        this.annotationDirectoryOffsets = map3;
        HashMap<Integer, Integer> map4 = new HashMap<>();
        this.encodedArrayValueOffset = map4;
        map.put(0, 0);
        map2.put(0, 0);
        map3.put(0, 0);
        map4.put(0, 0);
    }

    public C8553 adjust(C8553 c8553) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformAnnotation(new C8557(c8553.f23822, 29));
        return new C8553(this.target, c8553.f23821, new C8558(byteArrayAnnotatedOutput.toByteArray()));
    }

    public int adjustAnnotation(int i) {
        return this.annotationOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationDirectory(int i) {
        return this.annotationDirectoryOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationSet(int i) {
        return this.annotationSetOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustAnnotationSetRefList(int i) {
        return this.annotationSetRefListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public int adjustCallSite(int i) {
        return this.callSiteIds[i];
    }

    public C8558 adjustEncodedArray(C8558 c8558) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformArray(new C8557(c8558, 28));
        return new C8558(byteArrayAnnotatedOutput.toByteArray());
    }

    public C8558 adjustEncodedValue(C8558 c8558) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transform(new C8557(new C8381(c8558.f23864)));
        return new C8558(byteArrayAnnotatedOutput.toByteArray());
    }

    public int adjustField(int i) {
        return this.fieldIds[i] & 65535;
    }

    public int adjustMethod(int i) {
        return this.methodIds[i] & 65535;
    }

    public int adjustMethodHandle(int i) {
        return this.methodHandleIds.get(Integer.valueOf(i)).intValue();
    }

    public int adjustProto(int i) {
        return this.protoIds[i] & 65535;
    }

    public int adjustString(int i) {
        if (i == -1) {
            return -1;
        }
        return this.stringIds[i];
    }

    public int adjustType(int i) {
        if (i == -1) {
            return -1;
        }
        return this.typeIds[i] & 65535;
    }

    public C8556 adjustTypeList(C8556 c8556) {
        if (c8556 == C8556.f23857) {
            return c8556;
        }
        short[] sArr = (short[]) c8556.f23858.clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) adjustType(sArr[i]);
        }
        return new C8556(this.target, sArr);
    }

    public int adjustTypeListOffset(int i) {
        return this.typeListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public void putAnnotationDirectoryOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.annotationDirectoryOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.annotationOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.annotationSetOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetRefListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.annotationSetRefListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putEncodedArrayValueOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.encodedArrayValueOffset.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putTypeListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5919.m11245();
        } else {
            this.typeListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public int adjustEncodedArray(int i) {
        return this.encodedArrayValueOffset.get(Integer.valueOf(i)).intValue();
    }

    public C8552 adjust(C8552 c8552) {
        return new C8552(this.target, adjustEncodedArray(c8552.f23819));
    }

    public C8562 adjust(C8562 c8562) {
        int iAdjustMethod;
        C8566 c8566 = this.target;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c8562.f23879;
        int i = c8562.f23880;
        boolean zIsField = methodHandle$MethodHandleType.isField();
        int i2 = c8562.f23878;
        if (zIsField) {
            iAdjustMethod = adjustField(i2);
        } else {
            iAdjustMethod = adjustMethod(i2);
        }
        return new C8562(c8566, methodHandle$MethodHandleType, i, iAdjustMethod, c8562.f23877);
    }

    public C8561 adjust(C8561 c8561) {
        return new C8561(this.target, adjustType(c8561.f23874), adjustType(c8561.f23875), adjustString(c8561.f23873));
    }

    public C8560 adjust(C8560 c8560) {
        return new C8560(this.target, adjustString(c8560.f23870), adjustType(c8560.f23871), adjustTypeListOffset(c8560.f23869));
    }

    public C8548 adjust(C8548 c8548) {
        return new C8548(this.target, c8548.f23804, adjustType(c8548.f23803), c8548.f23802, adjustType(c8548.f23801), adjustTypeListOffset(c8548.f23800), c8548.f23807, c8548.f23806, c8548.f23808, c8548.f23809);
    }

    public SortableType adjust(SortableType sortableType) {
        return new SortableType(sortableType.getDex(), sortableType.getIndexMap(), adjust(sortableType.getClassDef()));
    }

    public C8559 adjust(C8559 c8559) {
        return new C8559(this.target, adjustType(c8559.f23866), adjustProto(c8559.f23867), adjustString(c8559.f23865));
    }
}
