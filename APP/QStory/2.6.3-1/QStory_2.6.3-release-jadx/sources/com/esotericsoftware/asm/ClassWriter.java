package com.esotericsoftware.asm;

import bsh.C3466;
import com.android.p002dx.p003cf.attrib.AttBootstrapMethods;
import com.android.p002dx.p003cf.attrib.AttDeprecated;
import com.android.p002dx.p003cf.attrib.AttEnclosingMethod;
import com.android.p002dx.p003cf.attrib.AttInnerClasses;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttSignature;
import com.android.p002dx.p003cf.attrib.AttSourceDebugExtension;
import com.android.p002dx.p003cf.attrib.AttSourceFile;
import com.android.p002dx.p003cf.attrib.AttSynthetic;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class ClassWriter extends ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;

    /* JADX INFO: renamed from: a */
    static final byte[] f114a;

    /* JADX INFO: renamed from: A */
    ByteVector f115A;

    /* JADX INFO: renamed from: B */
    FieldWriter f116B;

    /* JADX INFO: renamed from: C */
    FieldWriter f117C;

    /* JADX INFO: renamed from: D */
    MethodWriter f118D;

    /* JADX INFO: renamed from: E */
    MethodWriter f119E;

    /* JADX INFO: renamed from: G */
    private short f120G;

    /* JADX INFO: renamed from: H */
    Item[] f121H;

    /* JADX INFO: renamed from: I */
    String f122I;

    /* JADX INFO: renamed from: J */
    private boolean f123J;

    /* JADX INFO: renamed from: K */
    private boolean f124K;

    /* JADX INFO: renamed from: L */
    boolean f125L;

    /* JADX INFO: renamed from: M */
    ClassReader f126M;

    /* JADX INFO: renamed from: N */
    private AnnotationWriter f127N;

    /* JADX INFO: renamed from: O */
    private AnnotationWriter f128O;

    /* JADX INFO: renamed from: b */
    int f129b;

    /* JADX INFO: renamed from: c */
    int f130c;

    /* JADX INFO: renamed from: d */
    final ByteVector f131d;

    /* JADX INFO: renamed from: e */
    Item[] f132e;

    /* JADX INFO: renamed from: f */
    int f133f;

    /* JADX INFO: renamed from: g */
    final Item f134g;

    /* JADX INFO: renamed from: h */
    final Item f135h;

    /* JADX INFO: renamed from: i */
    final Item f136i;

    /* JADX INFO: renamed from: j */
    final Item f137j;

    /* JADX INFO: renamed from: k */
    private int f138k;

    /* JADX INFO: renamed from: l */
    private int f139l;

    /* JADX INFO: renamed from: m */
    private int f140m;

    /* JADX INFO: renamed from: n */
    private int f141n;

    /* JADX INFO: renamed from: o */
    private int f142o;

    /* JADX INFO: renamed from: p */
    private int[] f143p;

    /* JADX INFO: renamed from: q */
    private int f144q;

    /* JADX INFO: renamed from: r */
    private ByteVector f145r;

    /* JADX INFO: renamed from: s */
    private int f146s;

    /* JADX INFO: renamed from: t */
    private int f147t;

    /* JADX INFO: renamed from: u */
    private AnnotationWriter f148u;

    /* JADX INFO: renamed from: v */
    private AnnotationWriter f149v;

    /* JADX INFO: renamed from: w */
    private Attribute f150w;

    /* JADX INFO: renamed from: x */
    private int f151x;

    /* JADX INFO: renamed from: y */
    private ByteVector f152y;

    /* JADX INFO: renamed from: z */
    int f153z;

    static {
        _clinit_();
        byte[] bArr = new byte[com.android.p002dx.p005io.Opcodes.REM_INT_LIT8];
        for (int i = 0; i < 220; i++) {
            bArr[i] = (byte) ("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ".charAt(i) - 'A');
        }
        f114a = bArr;
    }

    public ClassWriter(int i) {
        super(327680);
        this.f130c = 1;
        this.f131d = new ByteVector();
        Item[] itemArr = new Item[256];
        this.f132e = itemArr;
        this.f133f = (int) (((double) itemArr.length) * 0.75d);
        this.f134g = new Item();
        this.f135h = new Item();
        this.f136i = new Item();
        this.f137j = new Item();
        this.f124K = (i & 1) != 0;
        this.f123J = (i & 2) != 0;
    }

    /* JADX INFO: renamed from: b */
    private void m65b(Item item) {
        if (this.f130c + this.f120G > this.f133f) {
            int length = this.f132e.length;
            int i = (length * 2) + 1;
            Item[] itemArr = new Item[i];
            for (int i2 = length - 1; i2 >= 0; i2--) {
                Item item2 = this.f132e[i2];
                while (item2 != null) {
                    int i3 = item2.f216j % i;
                    Item item3 = item2.f217k;
                    item2.f217k = itemArr[i3];
                    itemArr[i3] = item2;
                    item2 = item3;
                }
            }
            this.f132e = itemArr;
            this.f133f = (int) (((double) i) * 0.75d);
        }
        int i4 = item.f216j;
        Item[] itemArr2 = this.f132e;
        int length2 = i4 % itemArr2.length;
        item.f217k = itemArr2[length2];
        itemArr2[length2] = item;
    }

    /* JADX INFO: renamed from: c */
    private Item m66c(Item item) {
        short s = (short) (this.f120G + 1);
        this.f120G = s;
        Item item2 = new Item(s, this.f134g);
        m65b(item2);
        if (this.f121H == null) {
            this.f121H = new Item[16];
        }
        short s2 = this.f120G;
        Item[] itemArr = this.f121H;
        if (s2 == itemArr.length) {
            Item[] itemArr2 = new Item[itemArr.length * 2];
            System.arraycopy(itemArr, 0, itemArr2, 0, itemArr.length);
            this.f121H = itemArr2;
        }
        this.f121H[this.f120G] = item2;
        return item2;
    }

    /* JADX INFO: renamed from: a */
    public Item m74a(Object obj) {
        if (obj instanceof Integer) {
            return m71a(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m71a(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m71a((int) ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m71a(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m71a(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m70a(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m73a(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m69a(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m63b((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            if (sort == 10) {
                return m75a(type.getInternalName());
            }
            String descriptor = type.getDescriptor();
            return sort == 11 ? m81c(descriptor) : m75a(descriptor);
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return m72a(handle.f198a, handle.f199b, handle.f200c, handle.f201d, handle.f202e);
        }
        StringBuffer stringBuffer = new StringBuffer("value ");
        stringBuffer.append(obj);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public String getCommonSuperClass(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, classLoader);
            Class<?> cls2 = Class.forName(str2.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (cls.isInterface() || cls2.isInterface()) {
                return TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME;
            }
            do {
                cls = cls.getSuperclass();
            } while (!cls.isAssignableFrom(cls2));
            return cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public int newClass(String str) {
        return m75a(str).f209a;
    }

    public int newConst(Object obj) {
        return m74a(obj).f209a;
    }

    public int newField(String str, String str2, String str3) {
        return m78a(str, str2, str3).f209a;
    }

    public int newHandle(int i, String str, String str2, String str3) {
        return newHandle(i, str, str2, str3, i == 9);
    }

    public int newInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return m77a(str, str2, handle, objArr).f209a;
    }

    public int newMethod(String str, String str2, String str3, boolean z) {
        return m79a(str, str2, str3, z).f209a;
    }

    public int newMethodType(String str) {
        return m81c(str).f209a;
    }

    public int newNameType(String str, String str2) {
        return m76a(str, str2).f209a;
    }

    public int newUTF8(String str) {
        this.f134g.m103a(1, str, null, null);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a == null) {
            this.f131d.putByte(1).putUTF8(str);
            int i = this.f130c;
            this.f130c = i + 1;
            itemM61a = new Item(i, this.f134g);
            m65b(itemM61a);
        }
        return itemM61a.f209a;
    }

    public byte[] toByteArray() {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        ByteVector byteVector;
        if (this.f130c > 65535) {
            C3466.m5899("Class file too large!");
            return null;
        }
        int iM35a = (this.f142o * 2) + 24;
        int i3 = 0;
        for (FieldWriter fieldWriter = this.f116B; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.f177fv) {
            i3++;
            iM35a += fieldWriter.m82a();
        }
        int i4 = 0;
        for (MethodWriter methodWriter = this.f118D; methodWriter != null; methodWriter = (MethodWriter) methodWriter.f229mv) {
            i4++;
            iM35a += methodWriter.m132a();
        }
        ByteVector byteVector2 = this.f115A;
        if (byteVector2 != null) {
            iM35a += byteVector2.f108b + 8;
            newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME);
            i = 1;
        } else {
            i = 0;
        }
        if (this.f140m != 0) {
            i++;
            iM35a += 8;
            newUTF8(AttSignature.ATTRIBUTE_NAME);
        }
        if (this.f144q != 0) {
            i++;
            iM35a += 8;
            newUTF8(AttSourceFile.ATTRIBUTE_NAME);
        }
        ByteVector byteVector3 = this.f145r;
        if (byteVector3 != null) {
            i++;
            iM35a += byteVector3.f108b + 6;
            newUTF8(AttSourceDebugExtension.ATTRIBUTE_NAME);
        }
        if (this.f146s != 0) {
            i++;
            iM35a += 10;
            newUTF8(AttEnclosingMethod.ATTRIBUTE_NAME);
        }
        if ((this.f138k & 131072) != 0) {
            i++;
            iM35a += 6;
            newUTF8(AttDeprecated.ATTRIBUTE_NAME);
        }
        int i5 = this.f138k;
        if ((i5 & 4096) != 0 && ((this.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i5 & 262144) != 0)) {
            i++;
            iM35a += 6;
            newUTF8(AttSynthetic.ATTRIBUTE_NAME);
        }
        ByteVector byteVector4 = this.f152y;
        if (byteVector4 != null) {
            i++;
            iM35a += byteVector4.f108b + 8;
            newUTF8(AttInnerClasses.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter = this.f148u;
        if (annotationWriter != null) {
            i++;
            iM35a += annotationWriter.m35a() + 8;
            newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter2 = this.f149v;
        if (annotationWriter2 != null) {
            i++;
            iM35a += annotationWriter2.m35a() + 8;
            newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter3 = this.f127N;
        int i6 = i;
        if (annotationWriter3 != null) {
            i6++;
            iM35a += annotationWriter3.m35a() + 8;
            newUTF8("RuntimeVisibleTypeAnnotations");
        }
        AnnotationWriter annotationWriter4 = this.f128O;
        if (annotationWriter4 != null) {
            i6++;
            iM35a += annotationWriter4.m35a() + 8;
            newUTF8("RuntimeInvisibleTypeAnnotations");
        }
        int i7 = i6;
        int iM38a = iM35a;
        int i8 = i7;
        Attribute attribute = this.f150w;
        if (attribute != null) {
            int iM37a = attribute.m37a() + i8;
            Attribute attribute2 = this.f150w;
            str3 = "RuntimeVisibleTypeAnnotations";
            str = "RuntimeInvisibleTypeAnnotations";
            str5 = AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME;
            str6 = AttEnclosingMethod.ATTRIBUTE_NAME;
            str2 = AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME;
            str4 = AttSourceDebugExtension.ATTRIBUTE_NAME;
            iM38a += attribute2.m38a(this, null, 0, -1, -1);
            i8 = iM37a;
        } else {
            str = "RuntimeInvisibleTypeAnnotations";
            str2 = AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME;
            str3 = "RuntimeVisibleTypeAnnotations";
            str4 = AttSourceDebugExtension.ATTRIBUTE_NAME;
            str5 = AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME;
            str6 = AttEnclosingMethod.ATTRIBUTE_NAME;
        }
        ByteVector byteVector5 = new ByteVector(iM38a + this.f131d.f108b);
        byteVector5.putInt(-889275714).putInt(this.f129b);
        ByteVector byteVectorPutShort = byteVector5.putShort(this.f130c);
        ByteVector byteVector6 = this.f131d;
        byteVectorPutShort.putByteArray(byteVector6.f107a, 0, byteVector6.f108b);
        int i9 = this.f138k;
        byteVector5.putShort(i9 & (~(((i9 & 262144) / 64) | net.bytebuddy.jar.asm.Opcodes.ASM6))).putShort(this.f139l).putShort(this.f141n);
        byteVector5.putShort(this.f142o);
        for (int i10 = 0; i10 < this.f142o; i10++) {
            byteVector5.putShort(this.f143p[i10]);
        }
        byteVector5.putShort(i3);
        for (FieldWriter fieldWriter2 = this.f116B; fieldWriter2 != null; fieldWriter2 = (FieldWriter) fieldWriter2.f177fv) {
            fieldWriter2.m83a(byteVector5);
        }
        byteVector5.putShort(i4);
        for (MethodWriter methodWriter2 = this.f118D; methodWriter2 != null; methodWriter2 = (MethodWriter) methodWriter2.f229mv) {
            methodWriter2.m133a(byteVector5);
        }
        byteVector5.putShort(i8);
        if (this.f115A != null) {
            byteVector5.putShort(newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME));
            byteVector5.putInt(this.f115A.f108b + 2).putShort(this.f153z);
            ByteVector byteVector7 = this.f115A;
            byteVector5.putByteArray(byteVector7.f107a, 0, byteVector7.f108b);
        }
        if (this.f140m != 0) {
            i2 = 2;
            byteVector5.putShort(newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(2).putShort(this.f140m);
        } else {
            i2 = 2;
        }
        if (this.f144q != 0) {
            byteVector5.putShort(newUTF8(AttSourceFile.ATTRIBUTE_NAME)).putInt(i2).putShort(this.f144q);
        }
        ByteVector byteVector8 = this.f145r;
        if (byteVector8 != null) {
            int i11 = byteVector8.f108b;
            byteVector5.putShort(newUTF8(str4)).putInt(i11);
            byteVector5.putByteArray(this.f145r.f107a, 0, i11);
        }
        if (this.f146s != 0) {
            byteVector5.putShort(newUTF8(str6)).putInt(4);
            byteVector5.putShort(this.f146s).putShort(this.f147t);
        }
        if ((this.f138k & 131072) != 0) {
            byteVector5.putShort(newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        int i12 = this.f138k;
        if ((i12 & 4096) != 0 && ((this.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i12 & 262144) != 0)) {
            byteVector5.putShort(newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f152y != null) {
            byteVector5.putShort(newUTF8(AttInnerClasses.ATTRIBUTE_NAME));
            byteVector5.putInt(this.f152y.f108b + 2).putShort(this.f151x);
            ByteVector byteVector9 = this.f152y;
            byteVector5.putByteArray(byteVector9.f107a, 0, byteVector9.f108b);
        }
        if (this.f148u != null) {
            byteVector5.putShort(newUTF8(str2));
            this.f148u.m36a(byteVector5);
        }
        if (this.f149v != null) {
            byteVector5.putShort(newUTF8(str5));
            this.f149v.m36a(byteVector5);
        }
        if (this.f127N != null) {
            byteVector5.putShort(newUTF8(str3));
            this.f127N.m36a(byteVector5);
        }
        if (this.f128O != null) {
            byteVector5.putShort(newUTF8(str));
            this.f128O.m36a(byteVector5);
        }
        Attribute attribute3 = this.f150w;
        if (attribute3 != null) {
            byteVector = byteVector5;
            attribute3.m39a(this, null, 0, -1, -1, byteVector);
        } else {
            byteVector = byteVector5;
        }
        if (!this.f125L) {
            return byteVector.f107a;
        }
        this.f148u = null;
        this.f149v = null;
        this.f150w = null;
        this.f151x = 0;
        this.f152y = null;
        this.f153z = 0;
        this.f115A = null;
        this.f116B = null;
        this.f117C = null;
        this.f118D = null;
        this.f119E = null;
        this.f124K = false;
        this.f123J = true;
        this.f125L = false;
        new ClassReader(byteVector.f107a).accept(this, 4);
        return toByteArray();
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f129b = i;
        this.f138k = i2;
        this.f139l = newClass(str);
        this.f122I = str;
        if (str2 != null) {
            this.f140m = newUTF8(str2);
        }
        this.f141n = str3 == null ? 0 : newClass(str3);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f142o = length;
        this.f143p = new int[length];
        for (int i3 = 0; i3 < this.f142o; i3++) {
            this.f143p[i3] = newClass(strArr[i3]);
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f103g = this.f148u;
            this.f148u = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f149v;
        this.f149v = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.f105a = this.f150w;
        this.f150w = attribute;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return new FieldWriter(this, i, str, str2, str3, obj);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.f152y == null) {
            this.f152y = new ByteVector();
        }
        Item itemM75a = m75a(str);
        if (itemM75a.f211c == 0) {
            this.f151x++;
            this.f152y.putShort(itemM75a.f209a);
            this.f152y.putShort(str2 == null ? 0 : newClass(str2));
            this.f152y.putShort(str3 != null ? newUTF8(str3) : 0);
            this.f152y.putShort(i);
            itemM75a.f211c = this.f151x;
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return new MethodWriter(this, i, str, str2, str3, strArr, this.f124K, this.f123J);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        this.f146s = newClass(str);
        if (str2 == null || str3 == null) {
            return;
        }
        this.f147t = newNameType(str2, str3);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.f144q = newUTF8(str);
        }
        if (str2 != null) {
            this.f145r = new ByteVector().m43c(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m33a(i, typePath, byteVector);
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f127N;
            this.f127N = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f128O;
        this.f128O = annotationWriter;
        return annotationWriter;
    }

    public int newHandle(int i, String str, String str2, String str3, boolean z) {
        return m72a(i, str, str2, str3, z).f209a;
    }

    public static /* synthetic */ void _clinit_() {
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitEnd() {
    }

    /* JADX INFO: renamed from: c */
    public int m80c(String str) {
        this.f134g.m103a(30, str, null, null);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a == null) {
            itemM61a = m66c(this.f134g);
        }
        return itemM61a.f209a;
    }

    /* JADX INFO: renamed from: c */
    public Item m81c(String str) {
        this.f135h.m103a(16, str, null, null);
        Item itemM61a = m61a(this.f135h);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.m42b(16, newUTF8(str));
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f135h);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: b */
    private void m64b(int i, int i2, int i3) {
        this.f131d.m41a(i, i2).putShort(i3);
    }

    /* JADX INFO: renamed from: b */
    private Item m63b(String str) {
        this.f135h.m103a(8, str, null, null);
        Item itemM61a = m61a(this.f135h);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.m42b(8, newUTF8(str));
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f135h);
        m65b(item);
        return item;
    }

    public ClassWriter(ClassReader classReader, int i) {
        this(i);
        classReader.m60a(this);
        this.f126M = classReader;
    }

    /* JADX INFO: renamed from: a */
    public int m68a(String str, int i) {
        Item item = this.f134g;
        item.f210b = 31;
        item.f211c = i;
        item.f213g = str;
        item.f216j = (str.hashCode() + 31 + i) & Integer.MAX_VALUE;
        Item itemM61a = m61a(this.f134g);
        if (itemM61a == null) {
            itemM61a = m66c(this.f134g);
        }
        return itemM61a.f209a;
    }

    /* JADX INFO: renamed from: a */
    public Item m69a(double d) {
        this.f134g.m99a(d);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.putByte(6).putLong(this.f134g.f212d);
        Item item = new Item(this.f130c, this.f134g);
        this.f130c += 2;
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m70a(float f) {
        this.f134g.m100a(f);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.putByte(4).putInt(this.f134g.f211c);
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f134g);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m71a(int i) {
        this.f134g.m101a(i);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.putByte(3).putInt(i);
        int i2 = this.f130c;
        this.f130c = i2 + 1;
        Item item = new Item(i2, this.f134g);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m72a(int i, String str, String str2, String str3, boolean z) {
        this.f137j.m103a(i + 20, str, str2, str3);
        Item itemM61a = m61a(this.f137j);
        if (itemM61a != null) {
            return itemM61a;
        }
        m64b(15, i, i <= 4 ? newField(str, str2, str3) : newMethod(str, str2, str3, z));
        int i2 = this.f130c;
        this.f130c = i2 + 1;
        Item item = new Item(i2, this.f137j);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m73a(long j) {
        this.f134g.m104a(j);
        Item itemM61a = m61a(this.f134g);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.putByte(5).putLong(j);
        Item item = new Item(this.f130c, this.f134g);
        this.f130c += 2;
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    private Item m61a(Item item) {
        Item[] itemArr = this.f132e;
        Item item2 = itemArr[item.f216j % itemArr.length];
        while (item2 != null && (item2.f210b != item.f210b || !item.m106a(item2))) {
            item2 = item2.f217k;
        }
        return item2;
    }

    /* JADX INFO: renamed from: a */
    public int m67a(int i, int i2) {
        Item item = this.f135h;
        item.f210b = 32;
        item.f212d = ((long) i) | (((long) i2) << 32);
        item.f216j = (i + 32 + i2) & Integer.MAX_VALUE;
        Item itemM61a = m61a(item);
        if (itemM61a == null) {
            Item[] itemArr = this.f121H;
            String str = itemArr[i].f213g;
            String str2 = itemArr[i2].f213g;
            this.f135h.f211c = m80c(getCommonSuperClass(str, str2));
            itemM61a = new Item(0, this.f135h);
            m65b(itemM61a);
        }
        return itemM61a.f211c;
    }

    /* JADX INFO: renamed from: a */
    public Item m75a(String str) {
        this.f135h.m103a(7, str, null, null);
        Item itemM61a = m61a(this.f135h);
        if (itemM61a != null) {
            return itemM61a;
        }
        this.f131d.m42b(7, newUTF8(str));
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f135h);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m76a(String str, String str2) {
        this.f135h.m103a(12, str, str2, null);
        Item itemM61a = m61a(this.f135h);
        if (itemM61a != null) {
            return itemM61a;
        }
        m62a(12, newUTF8(str), newUTF8(str2));
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f135h);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m77a(String str, String str2, Handle handle, Object... objArr) {
        int i;
        ByteVector byteVector = this.f115A;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.f115A = byteVector;
        }
        int i2 = byteVector.f108b;
        int iHashCode = handle.hashCode();
        byteVector.putShort(newHandle(handle.f198a, handle.f199b, handle.f200c, handle.f201d, handle.isInterface()));
        int length = objArr.length;
        byteVector.putShort(length);
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
            byteVector.putShort(newConst(obj));
        }
        byte[] bArr = byteVector.f107a;
        int i3 = (length + 2) << 1;
        int i4 = iHashCode & Integer.MAX_VALUE;
        Item[] itemArr = this.f132e;
        Item item = itemArr[i4 % itemArr.length];
        loop1: while (item != null) {
            if (item.f210b == 33 && item.f216j == i4) {
                int i5 = item.f211c;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (bArr[i2 + i6] != bArr[i5 + i6]) {
                        break;
                    }
                }
                break loop1;
            }
            item = item.f217k;
        }
        if (item != null) {
            i = item.f209a;
            byteVector.f108b = i2;
        } else {
            i = this.f153z;
            this.f153z = i + 1;
            Item item2 = new Item(i);
            item2.m102a(i2, i4);
            m65b(item2);
        }
        this.f136i.m105a(str, str2, i);
        Item itemM61a = m61a(this.f136i);
        if (itemM61a != null) {
            return itemM61a;
        }
        m62a(18, i, newNameType(str, str2));
        int i7 = this.f130c;
        this.f130c = i7 + 1;
        Item item3 = new Item(i7, this.f136i);
        m65b(item3);
        return item3;
    }

    /* JADX INFO: renamed from: a */
    public Item m78a(String str, String str2, String str3) {
        this.f136i.m103a(9, str, str2, str3);
        Item itemM61a = m61a(this.f136i);
        if (itemM61a != null) {
            return itemM61a;
        }
        m62a(9, newClass(str), newNameType(str2, str3));
        int i = this.f130c;
        this.f130c = i + 1;
        Item item = new Item(i, this.f136i);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    public Item m79a(String str, String str2, String str3, boolean z) {
        int i = z ? 11 : 10;
        this.f136i.m103a(i, str, str2, str3);
        Item itemM61a = m61a(this.f136i);
        if (itemM61a != null) {
            return itemM61a;
        }
        m62a(i, newClass(str), newNameType(str2, str3));
        int i2 = this.f130c;
        this.f130c = i2 + 1;
        Item item = new Item(i2, this.f136i);
        m65b(item);
        return item;
    }

    /* JADX INFO: renamed from: a */
    private void m62a(int i, int i2, int i3) {
        this.f131d.m42b(i, i2).putShort(i3);
    }
}
