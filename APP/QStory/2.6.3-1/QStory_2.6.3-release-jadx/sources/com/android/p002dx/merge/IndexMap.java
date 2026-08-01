package com.android.p002dx.merge;

import com.android.dex.MethodHandle$MethodHandleType;
import com.android.p002dx.util.ByteArrayAnnotatedOutput;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import java.util.HashMap;
import p160.C8376;
import p299.C9211;
import p300.InterfaceC9214;
import p300.InterfaceC9215;
import p308.C9369;
import p308.C9373;
import p308.C9374;
import p308.C9375;
import p308.C9377;
import p308.C9378;
import p308.C9379;
import p308.C9380;
import p308.C9381;
import p308.C9382;
import p308.C9383;
import p308.C9387;
import top.suzhelan.qstory.hook.item.C6755;

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
    private final C9387 target;
    public final short[] typeIds;
    private final HashMap<Integer, Integer> typeListOffsets;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public final class EncodedValueTransformer {
        private final InterfaceC9214 out;

        public EncodedValueTransformer(InterfaceC9214 interfaceC9214) {
            this.out = interfaceC9214;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformAnnotation(C9378 c9378) {
            int iM14674 = c9378.m14674();
            AbstractC3887.m7194(this.out, IndexMap.this.adjustType(c9378.f24197));
            AbstractC3887.m7194(this.out, iM14674);
            for (int i = 0; i < iM14674; i++) {
                AbstractC3887.m7194(this.out, IndexMap.this.adjustString(AbstractC3887.m7204(c9378.f24199)));
                transform(c9378);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void transformArray(C9378 c9378) {
            c9378.m14676(28);
            c9378.f24198 = -1;
            int iM7204 = AbstractC3887.m7204(c9378.f24199);
            AbstractC3887.m7194(this.out, iM7204);
            for (int i = 0; i < iM7204; i++) {
                transform(c9378);
            }
        }

        private void writeTypeAndArg(int i, int i2) {
            this.out.writeByte(i | (i2 << 5));
        }

        public void transform(C9378 c9378) {
            int iM14675 = c9378.m14675();
            InterfaceC9215 interfaceC9215 = c9378.f24199;
            if (iM14675 == 0) {
                InterfaceC9214 interfaceC9214 = this.out;
                c9378.m14676(0);
                c9378.f24198 = -1;
                AbstractC3888.m7289(interfaceC9214, 0, (byte) AbstractC3888.m7241(interfaceC9215, c9378.f24196));
                return;
            }
            if (iM14675 == 6) {
                AbstractC3888.m7289(this.out, 6, c9378.m14672());
                return;
            }
            if (iM14675 == 2) {
                InterfaceC9214 interfaceC92142 = this.out;
                c9378.m14676(2);
                c9378.f24198 = -1;
                AbstractC3888.m7289(interfaceC92142, 2, (short) AbstractC3888.m7241(interfaceC9215, c9378.f24196));
                return;
            }
            if (iM14675 == 3) {
                InterfaceC9214 interfaceC92143 = this.out;
                c9378.m14676(3);
                c9378.f24198 = -1;
                AbstractC3888.m7283(interfaceC92143, 3, (char) AbstractC3888.m7238(interfaceC9215, c9378.f24196, false));
                return;
            }
            if (iM14675 == 4) {
                InterfaceC9214 interfaceC92144 = this.out;
                c9378.m14676(4);
                c9378.f24198 = -1;
                AbstractC3888.m7289(interfaceC92144, 4, AbstractC3888.m7241(interfaceC9215, c9378.f24196));
                return;
            }
            if (iM14675 == 16) {
                c9378.m14676(16);
                c9378.f24198 = -1;
                AbstractC3888.m7288(this.out, 16, ((long) Float.floatToIntBits(Float.intBitsToFloat(AbstractC3888.m7238(interfaceC9215, c9378.f24196, true)))) << 32);
                return;
            }
            if (iM14675 == 17) {
                AbstractC3888.m7288(this.out, 17, Double.doubleToLongBits(c9378.m14673()));
                return;
            }
            switch (iM14675) {
                case 21:
                    InterfaceC9214 interfaceC92145 = this.out;
                    IndexMap indexMap = IndexMap.this;
                    c9378.m14676(21);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC92145, 21, indexMap.adjustProto(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 22:
                    InterfaceC9214 interfaceC92146 = this.out;
                    IndexMap indexMap2 = IndexMap.this;
                    c9378.m14676(22);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC92146, 22, indexMap2.adjustMethodHandle(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 23:
                    AbstractC3888.m7283(this.out, 23, IndexMap.this.adjustString(c9378.m14671()));
                    break;
                case 24:
                    InterfaceC9214 interfaceC92147 = this.out;
                    IndexMap indexMap3 = IndexMap.this;
                    c9378.m14676(24);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC92147, 24, indexMap3.adjustType(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 25:
                    InterfaceC9214 interfaceC92148 = this.out;
                    IndexMap indexMap4 = IndexMap.this;
                    c9378.m14676(25);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC92148, 25, indexMap4.adjustField(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 26:
                    InterfaceC9214 interfaceC92149 = this.out;
                    IndexMap indexMap5 = IndexMap.this;
                    c9378.m14676(26);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC92149, 26, indexMap5.adjustMethod(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 27:
                    InterfaceC9214 interfaceC921410 = this.out;
                    IndexMap indexMap6 = IndexMap.this;
                    c9378.m14676(27);
                    c9378.f24198 = -1;
                    AbstractC3888.m7283(interfaceC921410, 27, indexMap6.adjustField(AbstractC3888.m7238(interfaceC9215, c9378.f24196, false)));
                    break;
                case 28:
                    writeTypeAndArg(28, 0);
                    transformArray(c9378);
                    break;
                case 29:
                    writeTypeAndArg(29, 0);
                    transformAnnotation(c9378);
                    break;
                case 30:
                    c9378.m14676(30);
                    c9378.f24198 = -1;
                    writeTypeAndArg(30, 0);
                    break;
                case 31:
                    c9378.m14676(31);
                    c9378.f24198 = -1;
                    writeTypeAndArg(31, c9378.f24196 != 0 ? 1 : 0);
                    break;
                default:
                    C8376.m13329(Integer.toHexString(c9378.m14675()), "Unexpected type: ");
                    break;
            }
        }
    }

    public IndexMap(C9387 c9387, C9375 c9375) {
        this.target = c9387;
        this.stringIds = new int[c9375.f24169.f24190];
        this.typeIds = new short[c9375.f24168.f24190];
        this.protoIds = new short[c9375.f24167.f24190];
        this.fieldIds = new short[c9375.f24166.f24190];
        this.methodIds = new short[c9375.f24165.f24190];
        this.callSiteIds = new int[c9375.f24183.f24190];
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

    public C9374 adjust(C9374 c9374) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformAnnotation(new C9378(c9374.f24158, 29));
        return new C9374(this.target, c9374.f24157, new C9379(byteArrayAnnotatedOutput.toByteArray()));
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

    public C9379 adjustEncodedArray(C9379 c9379) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transformArray(new C9378(c9379, 28));
        return new C9379(byteArrayAnnotatedOutput.toByteArray());
    }

    public C9379 adjustEncodedValue(C9379 c9379) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(byteArrayAnnotatedOutput).transform(new C9378(new C9211(c9379.f24200)));
        return new C9379(byteArrayAnnotatedOutput.toByteArray());
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

    public C9377 adjustTypeList(C9377 c9377) {
        if (c9377 == C9377.f24193) {
            return c9377;
        }
        short[] sArr = (short[]) c9377.f24194.clone();
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) adjustType(sArr[i]);
        }
        return new C9377(this.target, sArr);
    }

    public int adjustTypeListOffset(int i) {
        return this.typeListOffsets.get(Integer.valueOf(i)).intValue();
    }

    public void putAnnotationDirectoryOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.annotationDirectoryOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.annotationOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.annotationSetOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putAnnotationSetRefListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.annotationSetRefListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putEncodedArrayValueOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.encodedArrayValueOffset.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void putTypeListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C6755.m11865();
        } else {
            this.typeListOffsets.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public int adjustEncodedArray(int i) {
        return this.encodedArrayValueOffset.get(Integer.valueOf(i)).intValue();
    }

    public C9373 adjust(C9373 c9373) {
        return new C9373(this.target, adjustEncodedArray(c9373.f24155));
    }

    public C9383 adjust(C9383 c9383) {
        int iAdjustMethod;
        C9387 c9387 = this.target;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c9383.f24215;
        int i = c9383.f24216;
        boolean zIsField = methodHandle$MethodHandleType.isField();
        int i2 = c9383.f24214;
        if (zIsField) {
            iAdjustMethod = adjustField(i2);
        } else {
            iAdjustMethod = adjustMethod(i2);
        }
        return new C9383(c9387, methodHandle$MethodHandleType, i, iAdjustMethod, c9383.f24213);
    }

    public C9382 adjust(C9382 c9382) {
        return new C9382(this.target, adjustType(c9382.f24210), adjustType(c9382.f24211), adjustString(c9382.f24209));
    }

    public C9381 adjust(C9381 c9381) {
        return new C9381(this.target, adjustString(c9381.f24206), adjustType(c9381.f24207), adjustTypeListOffset(c9381.f24205));
    }

    public C9369 adjust(C9369 c9369) {
        return new C9369(this.target, c9369.f24140, adjustType(c9369.f24139), c9369.f24138, adjustType(c9369.f24137), adjustTypeListOffset(c9369.f24136), c9369.f24143, c9369.f24142, c9369.f24144, c9369.f24145);
    }

    public SortableType adjust(SortableType sortableType) {
        return new SortableType(sortableType.getDex(), sortableType.getIndexMap(), adjust(sortableType.getClassDef()));
    }

    public C9380 adjust(C9380 c9380) {
        return new C9380(this.target, adjustType(c9380.f24202), adjustProto(c9380.f24203), adjustString(c9380.f24201));
    }
}
