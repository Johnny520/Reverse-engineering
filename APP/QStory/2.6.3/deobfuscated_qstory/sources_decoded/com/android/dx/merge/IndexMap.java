package com.android.dx.merge;

import com.android.dex.MethodHandle$MethodHandleType;
import com.android.dx.util.ByteArrayAnnotatedOutput;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import p144.C7547;
import p283.C8382;
import p284.InterfaceC8385;
import p284.InterfaceC8386;
import p292.C8540;
import p292.C8544;
import p292.C8545;
import p292.C8546;
import p292.C8548;
import p292.C8549;
import p292.C8550;
import p292.C8551;
import p292.C8552;
import p292.C8553;
import p292.C8554;
import p292.C8558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    private final C8558 target;
    public final short[] typeIds;
    private final HashMap<Integer, Integer> typeListOffsets;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public final class EncodedValueTransformer {
        private final InterfaceC8385 out;

        public EncodedValueTransformer(InterfaceC8385 interfaceC8385) {
            this.out = interfaceC8385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformAnnotation(C8549 c8549) {
            int iM14115 = c8549.m14115();
            AbstractC3055.m6634(this.out, IndexMap.this.adjustType(c8549.f23852));
            AbstractC3055.m6634(this.out, iM14115);
            for (int i = 0; i < iM14115; i++) {
                AbstractC3055.m6634(this.out, IndexMap.this.adjustString(AbstractC3055.m6644(c8549.f23854)));
                transform(c8549);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformArray(C8549 c8549) {
            c8549.m14117(28);
            c8549.f23853 = -1;
            int iM6644 = AbstractC3055.m6644(c8549.f23854);
            AbstractC3055.m6634(this.out, iM6644);
            for (int i = 0; i < iM6644; i++) {
                transform(c8549);
            }
        }

        private void writeTypeAndArg(int i, int i2) {
            this.out.writeByte(i | (i2 << 5));
        }

        public void transform(C8549 c8549) {
            int iM14116 = c8549.m14116();
            InterfaceC8386 interfaceC8386 = c8549.f23854;
            if (iM14116 == 0) {
                InterfaceC8385 interfaceC8385 = this.out;
                c8549.m14117(0);
                c8549.f23853 = -1;
                AbstractC3056.m6729(interfaceC8385, 0, (byte) AbstractC3056.m6681(interfaceC8386, c8549.f23851));
                return;
            }
            if (iM14116 == 6) {
                AbstractC3056.m6729(this.out, 6, c8549.m14113());
                return;
            }
            if (iM14116 == 2) {
                InterfaceC8385 interfaceC83852 = this.out;
                c8549.m14117(2);
                c8549.f23853 = -1;
                AbstractC3056.m6729(interfaceC83852, 2, (short) AbstractC3056.m6681(interfaceC8386, c8549.f23851));
                return;
            }
            if (iM14116 == 3) {
                InterfaceC8385 interfaceC83853 = this.out;
                c8549.m14117(3);
                c8549.f23853 = -1;
                AbstractC3056.m6723(interfaceC83853, 3, (char) AbstractC3056.m6678(interfaceC8386, c8549.f23851, false));
                return;
            }
            if (iM14116 == 4) {
                InterfaceC8385 interfaceC83854 = this.out;
                c8549.m14117(4);
                c8549.f23853 = -1;
                AbstractC3056.m6729(interfaceC83854, 4, AbstractC3056.m6681(interfaceC8386, c8549.f23851));
                return;
            }
            if (iM14116 == 16) {
                c8549.m14117(16);
                c8549.f23853 = -1;
                AbstractC3056.m6728(this.out, 16, ((long) Float.floatToIntBits(Float.intBitsToFloat(AbstractC3056.m6678(interfaceC8386, c8549.f23851, true)))) << 32);
                return;
            }
            if (iM14116 == 17) {
                AbstractC3056.m6728(this.out, 17, Double.doubleToLongBits(c8549.m14114()));
                return;
            }
            switch (iM14116) {
                case 21:
                    InterfaceC8385 interfaceC83855 = this.out;
                    IndexMap indexMap = IndexMap.this;
                    c8549.m14117(21);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC83855, 21, indexMap.adjustProto(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 22:
                    InterfaceC8385 interfaceC83856 = this.out;
                    IndexMap indexMap2 = IndexMap.this;
                    c8549.m14117(22);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC83856, 22, indexMap2.adjustMethodHandle(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 23:
                    AbstractC3056.m6723(this.out, 23, IndexMap.this.adjustString(c8549.m14112()));
                    break;
                case 24:
                    InterfaceC8385 interfaceC83857 = this.out;
                    IndexMap indexMap3 = IndexMap.this;
                    c8549.m14117(24);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC83857, 24, indexMap3.adjustType(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 25:
                    InterfaceC8385 interfaceC83858 = this.out;
                    IndexMap indexMap4 = IndexMap.this;
                    c8549.m14117(25);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC83858, 25, indexMap4.adjustField(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 26:
                    InterfaceC8385 interfaceC83859 = this.out;
                    IndexMap indexMap5 = IndexMap.this;
                    c8549.m14117(26);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC83859, 26, indexMap5.adjustMethod(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 27:
                    InterfaceC8385 interfaceC838510 = this.out;
                    IndexMap indexMap6 = IndexMap.this;
                    c8549.m14117(27);
                    c8549.f23853 = -1;
                    AbstractC3056.m6723(interfaceC838510, 27, indexMap6.adjustField(AbstractC3056.m6678(interfaceC8386, c8549.f23851, false)));
                    break;
                case 28:
                    writeTypeAndArg(28, 0);
                    transformArray(c8549);
                    break;
                case 29:
                    writeTypeAndArg(29, 0);
                    transformAnnotation(c8549);
                    break;
                case 30:
                    c8549.m14117(30);
                    c8549.f23853 = -1;
                    writeTypeAndArg(30, 0);
                    break;
                case 31:
                    c8549.m14117(31);
                    c8549.f23853 = -1;
                    writeTypeAndArg(31, c8549.f23851 != 0 ? 1 : 0);
                    break;
                default:
                    C7547.m12770(Integer.toHexString(c8549.m14116()), "Unexpected type: ");
                    break;
            }
        }
    }

    public IndexMap(C8558 c8558, C8546 c8546) {
        this.target = c8558;
        this.stringIds = new int[c8546.f23824.f23845];
        this.typeIds = new short[c8546.f23823.f23845];
        this.protoIds = new short[c8546.f23822.f23845];
        this.fieldIds = new short[c8546.f23821.f23845];
        this.methodIds = new short[c8546.f23820.f23845];
        this.callSiteIds = new int[c8546.f23838.f23845];
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

    public C8545 adjust(C8545 c8545) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformAnnotation(new C8549(c8545.f23813, 29));
        return new C8545(this.target, c8545.f23812, new C8550(byteArrayAnnotatedOutput.toByteArray()));
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

    public C8550 adjustEncodedArray(C8550 c8550) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformArray(new C8549(c8550, 28));
        return new C8550(byteArrayAnnotatedOutput.toByteArray());
    }

    public C8550 adjustEncodedValue(C8550 c8550) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transform(new C8549(new C8382(c8550.f23855)));
        return new C8550(byteArrayAnnotatedOutput.toByteArray());
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

    public C8548 adjustTypeList(C8548 c8548) {
        if (c8548 == C8548.f23848) {
            return c8548;
        }
        short[] sArr = (short[]) c8548.f23849.clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) adjustType(sArr[i]);
        }
        return new C8548(this.target, sArr);
    }

    public int adjustTypeListOffset(int i) {
        return this.typeListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public void putAnnotationDirectoryOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.annotationDirectoryOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.annotationOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.annotationSetOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetRefListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.annotationSetRefListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putEncodedArrayValueOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.encodedArrayValueOffset.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putTypeListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C5925.m11306();
        } else {
            this.typeListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public int adjustEncodedArray(int i) {
        return this.encodedArrayValueOffset.get(Integer.valueOf(i)).intValue();
    }

    public C8544 adjust(C8544 c8544) {
        return new C8544(this.target, adjustEncodedArray(c8544.f23810));
    }

    public C8554 adjust(C8554 c8554) {
        int iAdjustMethod;
        C8558 c8558 = this.target;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c8554.f23870;
        int i = c8554.f23871;
        boolean zIsField = methodHandle$MethodHandleType.isField();
        int i2 = c8554.f23869;
        if (zIsField) {
            iAdjustMethod = adjustField(i2);
        } else {
            iAdjustMethod = adjustMethod(i2);
        }
        return new C8554(c8558, methodHandle$MethodHandleType, i, iAdjustMethod, c8554.f23868);
    }

    public C8553 adjust(C8553 c8553) {
        return new C8553(this.target, adjustType(c8553.f23865), adjustType(c8553.f23866), adjustString(c8553.f23864));
    }

    public C8552 adjust(C8552 c8552) {
        return new C8552(this.target, adjustString(c8552.f23861), adjustType(c8552.f23862), adjustTypeListOffset(c8552.f23860));
    }

    public C8540 adjust(C8540 c8540) {
        return new C8540(this.target, c8540.f23795, adjustType(c8540.f23794), c8540.f23793, adjustType(c8540.f23792), adjustTypeListOffset(c8540.f23791), c8540.f23798, c8540.f23797, c8540.f23799, c8540.f23800);
    }

    public SortableType adjust(SortableType sortableType) {
        return new SortableType(sortableType.getDex(), sortableType.getIndexMap(), adjust(sortableType.getClassDef()));
    }

    public C8551 adjust(C8551 c8551) {
        return new C8551(this.target, adjustType(c8551.f23857), adjustProto(c8551.f23858), adjustString(c8551.f23856));
    }
}
