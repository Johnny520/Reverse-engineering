package com.esotericsoftware.asm;

import androidx.activity.AbstractC0900;

/* JADX INFO: loaded from: classes.dex */
final class AnnotationWriter extends AnnotationVisitor {

    /* JADX INFO: renamed from: a */
    private final ClassWriter f97a;

    /* JADX INFO: renamed from: b */
    private int f98b;

    /* JADX INFO: renamed from: c */
    private final boolean f99c;

    /* JADX INFO: renamed from: d */
    private final ByteVector f100d;

    /* JADX INFO: renamed from: e */
    private final ByteVector f101e;

    /* JADX INFO: renamed from: f */
    private final int f102f;

    /* JADX INFO: renamed from: g */
    AnnotationWriter f103g;

    /* JADX INFO: renamed from: h */
    AnnotationWriter f104h;

    public AnnotationWriter(ClassWriter classWriter, boolean z, ByteVector byteVector, ByteVector byteVector2, int i) {
        super(327680);
        this.f97a = classWriter;
        this.f99c = z;
        this.f100d = byteVector;
        this.f101e = byteVector2;
        this.f102f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m33a(int i, TypePath typePath, ByteVector byteVector) {
        int i2 = i >>> 24;
        if (i2 != 0 && i2 != 1) {
            switch (i2) {
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            byteVector.putInt(i);
                            break;
                        default:
                            byteVector.m42b(i2, (i & 16776960) >> 8);
                            break;
                    }
                    break;
            }
        } else {
            byteVector.putShort(i >>> 16);
        }
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.f285a;
        int i3 = typePath.f286b;
        byteVector.putByteArray(bArr, i3, (bArr[i3] * 2) + 1);
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
        this.f98b++;
        if (this.f99c) {
            this.f100d.putShort(this.f97a.newUTF8(str));
        }
        if (obj instanceof String) {
            this.f100d.m42b(115, this.f97a.newUTF8((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f100d.m42b(66, this.f97a.m71a((int) ((Byte) obj).byteValue()).f209a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f100d.m42b(90, this.f97a.m71a(((Boolean) obj).booleanValue() ? 1 : 0).f209a);
            return;
        }
        if (obj instanceof Character) {
            this.f100d.m42b(67, this.f97a.m71a((int) ((Character) obj).charValue()).f209a);
            return;
        }
        if (obj instanceof Short) {
            this.f100d.m42b(83, this.f97a.m71a((int) ((Short) obj).shortValue()).f209a);
            return;
        }
        if (obj instanceof Type) {
            this.f100d.m42b(99, this.f97a.newUTF8(((Type) obj).getDescriptor()));
            return;
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f100d.m42b(91, bArr.length);
            while (i < bArr.length) {
                this.f100d.m42b(66, this.f97a.m71a((int) bArr[i]).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f100d.m42b(91, zArr.length);
            while (i < zArr.length) {
                this.f100d.m42b(90, this.f97a.m71a(zArr[i] ? 1 : 0).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f100d.m42b(91, sArr.length);
            while (i < sArr.length) {
                this.f100d.m42b(83, this.f97a.m71a((int) sArr[i]).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f100d.m42b(91, cArr.length);
            while (i < cArr.length) {
                this.f100d.m42b(67, this.f97a.m71a((int) cArr[i]).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f100d.m42b(91, iArr.length);
            while (i < iArr.length) {
                this.f100d.m42b(73, this.f97a.m71a(iArr[i]).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f100d.m42b(91, jArr.length);
            while (i < jArr.length) {
                this.f100d.m42b(74, this.f97a.m73a(jArr[i]).f209a);
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f100d.m42b(91, fArr.length);
            while (i < fArr.length) {
                this.f100d.m42b(70, this.f97a.m70a(fArr[i]).f209a);
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            Item itemM74a = this.f97a.m74a(obj);
            this.f100d.m42b(".s.IFJDCS".charAt(itemM74a.f210b), itemM74a.f209a);
            return;
        }
        double[] dArr = (double[]) obj;
        this.f100d.m42b(91, dArr.length);
        while (i < dArr.length) {
            this.f100d.m42b(68, this.f97a.m69a(dArr[i]).f209a);
            i++;
        }
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.f98b++;
        if (this.f99c) {
            this.f100d.putShort(this.f97a.newUTF8(str));
        }
        this.f100d.m42b(64, this.f97a.newUTF8(str2)).putShort(0);
        ClassWriter classWriter = this.f97a;
        ByteVector byteVector = this.f100d;
        return new AnnotationWriter(classWriter, true, byteVector, byteVector, byteVector.f108b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        this.f98b++;
        if (this.f99c) {
            this.f100d.putShort(this.f97a.newUTF8(str));
        }
        this.f100d.m42b(91, 0);
        ClassWriter classWriter = this.f97a;
        ByteVector byteVector = this.f100d;
        return new AnnotationWriter(classWriter, false, byteVector, byteVector, byteVector.f108b - 2);
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public void visitEnd() {
        ByteVector byteVector = this.f101e;
        if (byteVector != null) {
            byte[] bArr = byteVector.f107a;
            int i = this.f102f;
            int i2 = this.f98b;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    @Override // com.esotericsoftware.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.f98b++;
        if (this.f99c) {
            this.f100d.putShort(this.f97a.newUTF8(str));
        }
        this.f100d.m42b(101, this.f97a.newUTF8(str2)).putShort(this.f97a.newUTF8(str3));
    }

    /* JADX INFO: renamed from: a */
    public int m35a() {
        int i = 0;
        while (this != null) {
            i += this.f100d.f108b;
            this = this.f103g;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public void m36a(ByteVector byteVector) {
        int i = 2;
        AnnotationWriter annotationWriter = null;
        int i2 = 0;
        while (this != null) {
            i2++;
            i += this.f100d.f108b;
            this.visitEnd();
            this.f104h = annotationWriter;
            annotationWriter = this;
            this = this.f103g;
        }
        byteVector.putInt(i);
        byteVector.putShort(i2);
        while (annotationWriter != null) {
            ByteVector byteVector2 = annotationWriter.f100d;
            byteVector.putByteArray(byteVector2.f107a, 0, byteVector2.f108b);
            annotationWriter = annotationWriter.f104h;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34a(AnnotationWriter[] annotationWriterArr, int i, ByteVector byteVector) {
        int iM703 = AbstractC0900.m703(annotationWriterArr.length, i, 2, 1);
        int i2 = i;
        while (true) {
            int iM35a = 0;
            if (i2 >= annotationWriterArr.length) {
                break;
            }
            AnnotationWriter annotationWriter = annotationWriterArr[i2];
            if (annotationWriter != null) {
                iM35a = annotationWriter.m35a();
            }
            iM703 += iM35a;
            i2++;
        }
        byteVector.putInt(iM703).putByte(annotationWriterArr.length - i);
        while (i < annotationWriterArr.length) {
            AnnotationWriter annotationWriter2 = null;
            int i3 = 0;
            for (AnnotationWriter annotationWriter3 = annotationWriterArr[i]; annotationWriter3 != null; annotationWriter3 = annotationWriter3.f103g) {
                i3++;
                annotationWriter3.visitEnd();
                annotationWriter3.f104h = annotationWriter2;
                annotationWriter2 = annotationWriter3;
            }
            byteVector.putShort(i3);
            while (annotationWriter2 != null) {
                ByteVector byteVector2 = annotationWriter2.f100d;
                byteVector.putByteArray(byteVector2.f107a, 0, byteVector2.f108b);
                annotationWriter2 = annotationWriter2.f104h;
            }
            i++;
        }
    }
}
