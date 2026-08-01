package com.esotericsoftware.asm;

import com.android.p002dx.p003cf.attrib.AttConstantValue;
import com.android.p002dx.p003cf.attrib.AttDeprecated;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttSignature;
import com.android.p002dx.p003cf.attrib.AttSynthetic;

/* JADX INFO: loaded from: classes.dex */
final class FieldWriter extends FieldVisitor {

    /* JADX INFO: renamed from: b */
    private final ClassWriter f178b;

    /* JADX INFO: renamed from: c */
    private final int f179c;

    /* JADX INFO: renamed from: d */
    private final int f180d;

    /* JADX INFO: renamed from: e */
    private final int f181e;

    /* JADX INFO: renamed from: f */
    private int f182f;

    /* JADX INFO: renamed from: g */
    private int f183g;

    /* JADX INFO: renamed from: h */
    private AnnotationWriter f184h;

    /* JADX INFO: renamed from: i */
    private AnnotationWriter f185i;

    /* JADX INFO: renamed from: j */
    private Attribute f186j;

    /* JADX INFO: renamed from: k */
    private AnnotationWriter f187k;

    /* JADX INFO: renamed from: l */
    private AnnotationWriter f188l;

    public FieldWriter(ClassWriter classWriter, int i, String str, String str2, String str3, Object obj) {
        super(327680);
        if (classWriter.f116B == null) {
            classWriter.f116B = this;
        } else {
            classWriter.f117C.f177fv = this;
        }
        classWriter.f117C = this;
        this.f178b = classWriter;
        this.f179c = i;
        this.f180d = classWriter.newUTF8(str);
        this.f181e = classWriter.newUTF8(str2);
        if (str3 != null) {
            this.f182f = classWriter.newUTF8(str3);
        }
        if (obj != null) {
            this.f183g = classWriter.m74a(obj).f209a;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83a(ByteVector byteVector) {
        int i = this.f179c;
        byteVector.putShort(i & (~(((i & 262144) / 64) | net.bytebuddy.jar.asm.Opcodes.ASM6))).putShort(this.f180d).putShort(this.f181e);
        int iM37a = this.f183g != 0 ? 1 : 0;
        int i2 = this.f179c;
        if ((i2 & 4096) != 0 && ((this.f178b.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i2 & 262144) != 0)) {
            iM37a++;
        }
        if ((i2 & 131072) != 0) {
            iM37a++;
        }
        if (this.f182f != 0) {
            iM37a++;
        }
        if (this.f184h != null) {
            iM37a++;
        }
        if (this.f185i != null) {
            iM37a++;
        }
        if (this.f187k != null) {
            iM37a++;
        }
        if (this.f188l != null) {
            iM37a++;
        }
        Attribute attribute = this.f186j;
        if (attribute != null) {
            iM37a += attribute.m37a();
        }
        byteVector.putShort(iM37a);
        if (this.f183g != 0) {
            byteVector.putShort(this.f178b.newUTF8(AttConstantValue.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.f183g);
        }
        int i3 = this.f179c;
        if ((i3 & 4096) != 0) {
            ClassWriter classWriter = this.f178b;
            if ((65535 & classWriter.f129b) < 49 || (i3 & 262144) != 0) {
                byteVector.putShort(classWriter.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
            }
        }
        if ((this.f179c & 131072) != 0) {
            byteVector.putShort(this.f178b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f182f != 0) {
            byteVector.putShort(this.f178b.newUTF8(AttSignature.ATTRIBUTE_NAME));
            byteVector.putInt(2).putShort(this.f182f);
        }
        if (this.f184h != null) {
            byteVector.putShort(this.f178b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.f184h.m36a(byteVector);
        }
        if (this.f185i != null) {
            byteVector.putShort(this.f178b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.f185i.m36a(byteVector);
        }
        if (this.f187k != null) {
            byteVector.putShort(this.f178b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f187k.m36a(byteVector);
        }
        if (this.f188l != null) {
            byteVector.putShort(this.f178b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f188l.m36a(byteVector);
        }
        Attribute attribute2 = this.f186j;
        if (attribute2 != null) {
            attribute2.m39a(this.f178b, null, 0, -1, -1, byteVector);
        }
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f178b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f178b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f103g = this.f184h;
            this.f184h = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f185i;
        this.f185i = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.f105a = this.f186j;
        this.f186j = attribute;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m33a(i, typePath, byteVector);
        byteVector.putShort(this.f178b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f178b, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f187k;
            this.f187k = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f188l;
        this.f188l = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.FieldVisitor
    public void visitEnd() {
    }

    /* JADX INFO: renamed from: a */
    public int m82a() {
        int iM35a;
        if (this.f183g != 0) {
            this.f178b.newUTF8(AttConstantValue.ATTRIBUTE_NAME);
            iM35a = 16;
        } else {
            iM35a = 8;
        }
        int i = this.f179c;
        if ((i & 4096) != 0) {
            ClassWriter classWriter = this.f178b;
            if ((classWriter.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i & 262144) != 0) {
                classWriter.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
                iM35a += 6;
            }
        }
        if ((this.f179c & 131072) != 0) {
            this.f178b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iM35a += 6;
        }
        if (this.f182f != 0) {
            this.f178b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            iM35a += 8;
        }
        if (this.f184h != null) {
            this.f178b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iM35a += this.f184h.m35a() + 8;
        }
        if (this.f185i != null) {
            this.f178b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iM35a += this.f185i.m35a() + 8;
        }
        if (this.f187k != null) {
            this.f178b.newUTF8("RuntimeVisibleTypeAnnotations");
            iM35a += this.f187k.m35a() + 8;
        }
        if (this.f188l != null) {
            this.f178b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iM35a += this.f188l.m35a() + 8;
        }
        Attribute attribute = this.f186j;
        return attribute != null ? iM35a + attribute.m38a(this.f178b, null, 0, -1, -1) : iM35a;
    }
}
