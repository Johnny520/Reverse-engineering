package com.esotericsoftware.asm;

import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSynthetic;

/* JADX INFO: loaded from: classes.dex */
final class FieldWriter extends FieldVisitor {
    private final ClassWriter b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private int g;
    private AnnotationWriter h;
    private AnnotationWriter i;
    private Attribute j;
    private AnnotationWriter k;
    private AnnotationWriter l;

    public FieldWriter(ClassWriter classWriter, int i, String str, String str2, String str3, Object obj) {
        super(327680);
        if (classWriter.B == null) {
            classWriter.B = this;
        } else {
            classWriter.C.fv = this;
        }
        classWriter.C = this;
        this.b = classWriter;
        this.c = i;
        this.d = classWriter.newUTF8(str);
        this.e = classWriter.newUTF8(str2);
        if (str3 != null) {
            this.f = classWriter.newUTF8(str3);
        }
        if (obj != null) {
            this.g = classWriter.a(obj).a;
        }
    }

    public void a(ByteVector byteVector) {
        int i = this.c;
        byteVector.putShort(i & (~(((i & 262144) / 64) | net.bytebuddy.jar.asm.Opcodes.ASM6))).putShort(this.d).putShort(this.e);
        int iA = this.g != 0 ? 1 : 0;
        int i2 = this.c;
        if ((i2 & 4096) != 0 && ((this.b.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i2 & 262144) != 0)) {
            iA++;
        }
        if ((i2 & 131072) != 0) {
            iA++;
        }
        if (this.f != 0) {
            iA++;
        }
        if (this.h != null) {
            iA++;
        }
        if (this.i != null) {
            iA++;
        }
        if (this.k != null) {
            iA++;
        }
        if (this.l != null) {
            iA++;
        }
        Attribute attribute = this.j;
        if (attribute != null) {
            iA += attribute.a();
        }
        byteVector.putShort(iA);
        if (this.g != 0) {
            byteVector.putShort(this.b.newUTF8(AttConstantValue.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.g);
        }
        int i3 = this.c;
        if ((i3 & 4096) != 0) {
            ClassWriter classWriter = this.b;
            if ((65535 & classWriter.b) < 49 || (i3 & 262144) != 0) {
                byteVector.putShort(classWriter.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
            }
        }
        if ((this.c & 131072) != 0) {
            byteVector.putShort(this.b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f != 0) {
            byteVector.putShort(this.b.newUTF8(AttSignature.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.f);
        }
        if (this.h != null) {
            byteVector.putShort(this.b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.h.a(byteVector);
        }
        if (this.i != null) {
            byteVector.putShort(this.b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.i.a(byteVector);
        }
        if (this.k != null) {
            byteVector.putShort(this.b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.k.a(byteVector);
        }
        if (this.l != null) {
            byteVector.putShort(this.b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.l.a(byteVector);
        }
        Attribute attribute2 = this.j;
        if (attribute2 != null) {
            attribute2.a(this.b, null, 0, -1, -1, byteVector);
        }
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.g = this.h;
            this.h = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.i;
        this.i = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.a = this.j;
        this.j = attribute;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i, typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.k;
            this.k = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.l;
        this.l = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public void visitEnd() {
    }

    public int a() {
        int iA;
        if (this.g != 0) {
            this.b.newUTF8(AttConstantValue.ATTRIBUTE_NAME);
            iA = 16;
        } else {
            iA = 8;
        }
        int i = this.c;
        if ((i & 4096) != 0) {
            ClassWriter classWriter = this.b;
            if ((classWriter.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i & 262144) != 0) {
                classWriter.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
                iA += 6;
            }
        }
        if ((this.c & 131072) != 0) {
            this.b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iA += 6;
        }
        if (this.f != 0) {
            this.b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            iA += 8;
        }
        if (this.h != null) {
            this.b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iA += this.h.a() + 8;
        }
        if (this.i != null) {
            this.b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iA += this.i.a() + 8;
        }
        if (this.k != null) {
            this.b.newUTF8("RuntimeVisibleTypeAnnotations");
            iA += this.k.a() + 8;
        }
        if (this.l != null) {
            this.b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iA += this.l.a() + 8;
        }
        Attribute attribute = this.j;
        return attribute != null ? iA + attribute.a(this.b, null, 0, -1, -1) : iA;
    }
}
