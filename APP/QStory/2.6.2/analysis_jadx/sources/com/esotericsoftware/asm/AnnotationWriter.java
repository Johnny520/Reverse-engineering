package com.esotericsoftware.asm;

import androidx.activity.AbstractC0053;

/* JADX INFO: loaded from: classes.dex */
final class AnnotationWriter extends AnnotationVisitor {
    private final ClassWriter a;
    private int b;
    private final boolean c;
    private final ByteVector d;
    private final ByteVector e;
    private final int f;
    AnnotationWriter g;
    AnnotationWriter h;

    public AnnotationWriter(ClassWriter classWriter, boolean z, ByteVector byteVector, ByteVector byteVector2, int i) {
        super(327680);
        this.a = classWriter;
        this.c = z;
        this.d = byteVector;
        this.e = byteVector2;
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r3, com.esotericsoftware.asm.TypePath r4, com.esotericsoftware.asm.ByteVector r5) {
        /*
            int r0 = r3 >>> 24
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L1f
            switch(r0) {
                case 19: goto L1b;
                case 20: goto L1b;
                case 21: goto L1b;
                case 22: goto L1f;
                default: goto La;
            }
        La:
            switch(r0) {
                case 71: goto L17;
                case 72: goto L17;
                case 73: goto L17;
                case 74: goto L17;
                case 75: goto L17;
                default: goto Ld;
            }
        Ld:
            r2 = 16776960(0xffff00, float:2.3509528E-38)
            r3 = r3 & r2
            int r3 = r3 >> 8
            r5.b(r0, r3)
            goto L24
        L17:
            r5.putInt(r3)
            goto L24
        L1b:
            r5.putByte(r0)
            goto L24
        L1f:
            int r3 = r3 >>> 16
            r5.putShort(r3)
        L24:
            if (r4 != 0) goto L2b
            r3 = 0
            r5.putByte(r3)
            return
        L2b:
            byte[] r3 = r4.a
            int r4 = r4.b
            r0 = r3[r4]
            int r0 = r0 * 2
            int r0 = r0 + r1
            r5.putByteArray(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.AnnotationWriter.a(int, com.esotericsoftware.asm.TypePath, com.esotericsoftware.asm.ByteVector):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        this.b++;
        if (this.c) {
            this.d.putShort(this.a.newUTF8(str));
        }
        if (obj instanceof String) {
            this.d.b(115, this.a.newUTF8((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.d.b(66, this.a.a((int) ((Byte) obj).byteValue()).a);
            return;
        }
        if (obj instanceof Boolean) {
            this.d.b(90, this.a.a(((Boolean) obj).booleanValue() ? 1 : 0).a);
            return;
        }
        if (obj instanceof Character) {
            this.d.b(67, this.a.a((int) ((Character) obj).charValue()).a);
            return;
        }
        if (obj instanceof Short) {
            this.d.b(83, this.a.a((int) ((Short) obj).shortValue()).a);
            return;
        }
        if (obj instanceof Type) {
            this.d.b(99, this.a.newUTF8(((Type) obj).getDescriptor()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.d.b(91, bArr.length);
            while (i < bArr.length) {
                this.d.b(66, this.a.a((int) bArr[i]).a);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.d.b(91, zArr.length);
            while (i < zArr.length) {
                this.d.b(90, this.a.a(zArr[i] ? 1 : 0).a);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.d.b(91, sArr.length);
            while (i < sArr.length) {
                this.d.b(83, this.a.a((int) sArr[i]).a);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.d.b(91, cArr.length);
            while (i < cArr.length) {
                this.d.b(67, this.a.a((int) cArr[i]).a);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.d.b(91, iArr.length);
            while (i < iArr.length) {
                this.d.b(73, this.a.a(iArr[i]).a);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.d.b(91, jArr.length);
            while (i < jArr.length) {
                this.d.b(74, this.a.a(jArr[i]).a);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.d.b(91, fArr.length);
            while (i < fArr.length) {
                this.d.b(70, this.a.a(fArr[i]).a);
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            Item itemA = this.a.a(obj);
            this.d.b(".s.IFJDCS".charAt(itemA.b), itemA.a);
            return;
        }
        double[] dArr = (double[]) obj;
        this.d.b(91, dArr.length);
        while (i < dArr.length) {
            this.d.b(68, this.a.a(dArr[i]).a);
            i++;
        }
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.b++;
        if (this.c) {
            this.d.putShort(this.a.newUTF8(str));
        }
        this.d.b(64, this.a.newUTF8(str2)).putShort(0);
        ClassWriter classWriter = this.a;
        ByteVector byteVector = this.d;
        return new AnnotationWriter(classWriter, true, byteVector, byteVector, byteVector.b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        this.b++;
        if (this.c) {
            this.d.putShort(this.a.newUTF8(str));
        }
        this.d.b(91, 0);
        ClassWriter classWriter = this.a;
        ByteVector byteVector = this.d;
        return new AnnotationWriter(classWriter, false, byteVector, byteVector, byteVector.b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public void visitEnd() {
        ByteVector byteVector = this.e;
        if (byteVector != null) {
            byte[] bArr = byteVector.a;
            int i = this.f;
            int i2 = this.b;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.b++;
        if (this.c) {
            this.d.putShort(this.a.newUTF8(str));
        }
        this.d.b(101, this.a.newUTF8(str2)).putShort(this.a.newUTF8(str3));
    }

    public int a() {
        int i = 0;
        while (this != null) {
            i += this.d.b;
            this = this.g;
        }
        return i;
    }

    public void a(ByteVector byteVector) {
        int i = 2;
        AnnotationWriter annotationWriter = null;
        int i2 = 0;
        while (this != null) {
            i2++;
            i += this.d.b;
            this.visitEnd();
            this.h = annotationWriter;
            annotationWriter = this;
            this = this.g;
        }
        byteVector.putInt(i);
        byteVector.putShort(i2);
        while (annotationWriter != null) {
            ByteVector byteVector2 = annotationWriter.d;
            byteVector.putByteArray(byteVector2.a, 0, byteVector2.b);
            annotationWriter = annotationWriter.h;
        }
    }

    public static void a(AnnotationWriter[] annotationWriterArr, int i, ByteVector byteVector) {
        int iM142 = AbstractC0053.m142(annotationWriterArr.length, i, 2, 1);
        int i2 = i;
        while (true) {
            int iA = 0;
            if (i2 >= annotationWriterArr.length) {
                break;
            }
            AnnotationWriter annotationWriter = annotationWriterArr[i2];
            if (annotationWriter != null) {
                iA = annotationWriter.a();
            }
            iM142 += iA;
            i2++;
        }
        byteVector.putInt(iM142).putByte(annotationWriterArr.length - i);
        while (i < annotationWriterArr.length) {
            AnnotationWriter annotationWriter2 = null;
            int i3 = 0;
            for (AnnotationWriter annotationWriter3 = annotationWriterArr[i]; annotationWriter3 != null; annotationWriter3 = annotationWriter3.g) {
                i3++;
                annotationWriter3.visitEnd();
                annotationWriter3.h = annotationWriter2;
                annotationWriter2 = annotationWriter3;
            }
            byteVector.putShort(i3);
            while (annotationWriter2 != null) {
                ByteVector byteVector2 = annotationWriter2.d;
                byteVector.putByteArray(byteVector2.a, 0, byteVector2.b);
                annotationWriter2 = annotationWriter2.h;
            }
            i++;
        }
    }
}
