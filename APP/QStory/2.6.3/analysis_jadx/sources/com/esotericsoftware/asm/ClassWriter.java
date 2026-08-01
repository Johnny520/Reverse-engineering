package com.esotericsoftware.asm;

import bsh.C2633;
import com.android.dx.cf.attrib.AttBootstrapMethods;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttEnclosingMethod;
import com.android.dx.cf.attrib.AttInnerClasses;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSourceDebugExtension;
import com.android.dx.cf.attrib.AttSourceFile;
import com.android.dx.cf.attrib.AttSynthetic;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class ClassWriter extends ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    static final byte[] a;
    ByteVector A;
    FieldWriter B;
    FieldWriter C;
    MethodWriter D;
    MethodWriter E;
    private short G;
    Item[] H;
    String I;
    private boolean J;
    private boolean K;
    boolean L;
    ClassReader M;
    private AnnotationWriter N;
    private AnnotationWriter O;
    int b;
    int c;
    final ByteVector d;
    Item[] e;
    int f;
    final Item g;
    final Item h;
    final Item i;
    final Item j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[] p;
    private int q;
    private ByteVector r;
    private int s;
    private int t;
    private AnnotationWriter u;
    private AnnotationWriter v;
    private Attribute w;
    private int x;
    private ByteVector y;
    int z;

    static {
        _clinit_();
        byte[] bArr = new byte[com.android.dx.io.Opcodes.REM_INT_LIT8];
        for (int i = 0; i < 220; i++) {
            bArr[i] = (byte) ("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ".charAt(i) - 'A');
        }
        a = bArr;
    }

    public ClassWriter(int i) {
        super(327680);
        this.c = 1;
        this.d = new ByteVector();
        Item[] itemArr = new Item[256];
        this.e = itemArr;
        this.f = (int) (((double) itemArr.length) * 0.75d);
        this.g = new Item();
        this.h = new Item();
        this.i = new Item();
        this.j = new Item();
        this.K = (i & 1) != 0;
        this.J = (i & 2) != 0;
    }

    private void b(Item item) {
        if (this.c + this.G > this.f) {
            int length = this.e.length;
            int i = (length * 2) + 1;
            Item[] itemArr = new Item[i];
            for (int i2 = length - 1; i2 >= 0; i2--) {
                Item item2 = this.e[i2];
                while (item2 != null) {
                    int i3 = item2.j % i;
                    Item item3 = item2.k;
                    item2.k = itemArr[i3];
                    itemArr[i3] = item2;
                    item2 = item3;
                }
            }
            this.e = itemArr;
            this.f = (int) (((double) i) * 0.75d);
        }
        int i4 = item.j;
        Item[] itemArr2 = this.e;
        int length2 = i4 % itemArr2.length;
        item.k = itemArr2[length2];
        itemArr2[length2] = item;
    }

    private Item c(Item item) {
        short s = (short) (this.G + 1);
        this.G = s;
        Item item2 = new Item(s, this.g);
        b(item2);
        if (this.H == null) {
            this.H = new Item[16];
        }
        short s2 = this.G;
        Item[] itemArr = this.H;
        if (s2 == itemArr.length) {
            Item[] itemArr2 = new Item[itemArr.length * 2];
            System.arraycopy(itemArr, 0, itemArr2, 0, itemArr.length);
            this.H = itemArr2;
        }
        this.H[this.G] = item2;
        return item2;
    }

    public Item a(Object obj) {
        if (obj instanceof Integer) {
            return a(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return a(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return a((int) ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return a(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return a(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return a(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return a(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            if (sort == 10) {
                return a(type.getInternalName());
            }
            String descriptor = type.getDescriptor();
            return sort == 11 ? m6892c(descriptor) : a(descriptor);
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return a(handle.a, handle.b, handle.c, handle.d, handle.e);
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
        return a(str).a;
    }

    public int newConst(Object obj) {
        return a(obj).a;
    }

    public int newField(String str, String str2, String str3) {
        return a(str, str2, str3).a;
    }

    public int newHandle(int i, String str, String str2, String str3) {
        return newHandle(i, str, str2, str3, i == 9);
    }

    public int newInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return a(str, str2, handle, objArr).a;
    }

    public int newMethod(String str, String str2, String str3, boolean z) {
        return a(str, str2, str3, z).a;
    }

    public int newMethodType(String str) {
        return m6892c(str).a;
    }

    public int newNameType(String str, String str2) {
        return a(str, str2).a;
    }

    public int newUTF8(String str) {
        this.g.a(1, str, null, null);
        Item itemA = a(this.g);
        if (itemA == null) {
            this.d.putByte(1).putUTF8(str);
            int i = this.c;
            this.c = i + 1;
            itemA = new Item(i, this.g);
            b(itemA);
        }
        return itemA.a;
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
        if (this.c > 65535) {
            C2633.m5339("Class file too large!");
            return null;
        }
        int iA = (this.o * 2) + 24;
        int i3 = 0;
        for (FieldWriter fieldWriter = this.B; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.fv) {
            i3++;
            iA += fieldWriter.a();
        }
        int i4 = 0;
        for (MethodWriter methodWriter = this.D; methodWriter != null; methodWriter = (MethodWriter) methodWriter.mv) {
            i4++;
            iA += methodWriter.a();
        }
        ByteVector byteVector2 = this.A;
        if (byteVector2 != null) {
            iA += byteVector2.b + 8;
            newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME);
            i = 1;
        } else {
            i = 0;
        }
        if (this.m != 0) {
            i++;
            iA += 8;
            newUTF8(AttSignature.ATTRIBUTE_NAME);
        }
        if (this.q != 0) {
            i++;
            iA += 8;
            newUTF8(AttSourceFile.ATTRIBUTE_NAME);
        }
        ByteVector byteVector3 = this.r;
        if (byteVector3 != null) {
            i++;
            iA += byteVector3.b + 6;
            newUTF8(AttSourceDebugExtension.ATTRIBUTE_NAME);
        }
        if (this.s != 0) {
            i++;
            iA += 10;
            newUTF8(AttEnclosingMethod.ATTRIBUTE_NAME);
        }
        if ((this.k & 131072) != 0) {
            i++;
            iA += 6;
            newUTF8(AttDeprecated.ATTRIBUTE_NAME);
        }
        int i5 = this.k;
        if ((i5 & 4096) != 0 && ((this.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i5 & 262144) != 0)) {
            i++;
            iA += 6;
            newUTF8(AttSynthetic.ATTRIBUTE_NAME);
        }
        ByteVector byteVector4 = this.y;
        if (byteVector4 != null) {
            i++;
            iA += byteVector4.b + 8;
            newUTF8(AttInnerClasses.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter = this.u;
        if (annotationWriter != null) {
            i++;
            iA += annotationWriter.a() + 8;
            newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter2 = this.v;
        if (annotationWriter2 != null) {
            i++;
            iA += annotationWriter2.a() + 8;
            newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        }
        AnnotationWriter annotationWriter3 = this.N;
        int i6 = i;
        if (annotationWriter3 != null) {
            i6++;
            iA += annotationWriter3.a() + 8;
            newUTF8("RuntimeVisibleTypeAnnotations");
        }
        AnnotationWriter annotationWriter4 = this.O;
        if (annotationWriter4 != null) {
            i6++;
            iA += annotationWriter4.a() + 8;
            newUTF8("RuntimeInvisibleTypeAnnotations");
        }
        int i7 = i6;
        int iA2 = iA;
        int i8 = i7;
        Attribute attribute = this.w;
        if (attribute != null) {
            int iA3 = attribute.a() + i8;
            Attribute attribute2 = this.w;
            str3 = "RuntimeVisibleTypeAnnotations";
            str = "RuntimeInvisibleTypeAnnotations";
            str5 = AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME;
            str6 = AttEnclosingMethod.ATTRIBUTE_NAME;
            str2 = AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME;
            str4 = AttSourceDebugExtension.ATTRIBUTE_NAME;
            iA2 += attribute2.a(this, null, 0, -1, -1);
            i8 = iA3;
        } else {
            str = "RuntimeInvisibleTypeAnnotations";
            str2 = AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME;
            str3 = "RuntimeVisibleTypeAnnotations";
            str4 = AttSourceDebugExtension.ATTRIBUTE_NAME;
            str5 = AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME;
            str6 = AttEnclosingMethod.ATTRIBUTE_NAME;
        }
        ByteVector byteVector5 = new ByteVector(iA2 + this.d.b);
        byteVector5.putInt(-889275714).putInt(this.b);
        ByteVector byteVectorPutShort = byteVector5.putShort(this.c);
        ByteVector byteVector6 = this.d;
        byteVectorPutShort.putByteArray(byteVector6.a, 0, byteVector6.b);
        int i9 = this.k;
        byteVector5.putShort(i9 & (~(((i9 & 262144) / 64) | net.bytebuddy.jar.asm.Opcodes.ASM6))).putShort(this.l).putShort(this.n);
        byteVector5.putShort(this.o);
        for (int i10 = 0; i10 < this.o; i10++) {
            byteVector5.putShort(this.p[i10]);
        }
        byteVector5.putShort(i3);
        for (FieldWriter fieldWriter2 = this.B; fieldWriter2 != null; fieldWriter2 = (FieldWriter) fieldWriter2.fv) {
            fieldWriter2.a(byteVector5);
        }
        byteVector5.putShort(i4);
        for (MethodWriter methodWriter2 = this.D; methodWriter2 != null; methodWriter2 = (MethodWriter) methodWriter2.mv) {
            methodWriter2.a(byteVector5);
        }
        byteVector5.putShort(i8);
        if (this.A != null) {
            byteVector5.putShort(newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME));
            byteVector5.putInt(this.A.b + 2).putShort(this.z);
            ByteVector byteVector7 = this.A;
            byteVector5.putByteArray(byteVector7.a, 0, byteVector7.b);
        }
        if (this.m != 0) {
            i2 = 2;
            byteVector5.putShort(newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(2).putShort(this.m);
        } else {
            i2 = 2;
        }
        if (this.q != 0) {
            byteVector5.putShort(newUTF8(AttSourceFile.ATTRIBUTE_NAME)).putInt(i2).putShort(this.q);
        }
        ByteVector byteVector8 = this.r;
        if (byteVector8 != null) {
            int i11 = byteVector8.b;
            byteVector5.putShort(newUTF8(str4)).putInt(i11);
            byteVector5.putByteArray(this.r.a, 0, i11);
        }
        if (this.s != 0) {
            byteVector5.putShort(newUTF8(str6)).putInt(4);
            byteVector5.putShort(this.s).putShort(this.t);
        }
        if ((this.k & 131072) != 0) {
            byteVector5.putShort(newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        int i12 = this.k;
        if ((i12 & 4096) != 0 && ((this.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i12 & 262144) != 0)) {
            byteVector5.putShort(newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.y != null) {
            byteVector5.putShort(newUTF8(AttInnerClasses.ATTRIBUTE_NAME));
            byteVector5.putInt(this.y.b + 2).putShort(this.x);
            ByteVector byteVector9 = this.y;
            byteVector5.putByteArray(byteVector9.a, 0, byteVector9.b);
        }
        if (this.u != null) {
            byteVector5.putShort(newUTF8(str2));
            this.u.a(byteVector5);
        }
        if (this.v != null) {
            byteVector5.putShort(newUTF8(str5));
            this.v.a(byteVector5);
        }
        if (this.N != null) {
            byteVector5.putShort(newUTF8(str3));
            this.N.a(byteVector5);
        }
        if (this.O != null) {
            byteVector5.putShort(newUTF8(str));
            this.O.a(byteVector5);
        }
        Attribute attribute3 = this.w;
        if (attribute3 != null) {
            byteVector = byteVector5;
            attribute3.a(this, null, 0, -1, -1, byteVector);
        } else {
            byteVector = byteVector5;
        }
        if (!this.L) {
            return byteVector.a;
        }
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = 0;
        this.y = null;
        this.z = 0;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.K = false;
        this.J = true;
        this.L = false;
        new ClassReader(byteVector.a).accept(this, 4);
        return toByteArray();
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.b = i;
        this.k = i2;
        this.l = newClass(str);
        this.I = str;
        if (str2 != null) {
            this.m = newUTF8(str2);
        }
        this.n = str3 == null ? 0 : newClass(str3);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.o = length;
        this.p = new int[length];
        for (int i3 = 0; i3 < this.o; i3++) {
            this.p[i3] = newClass(strArr[i3]);
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.g = this.u;
            this.u = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.v;
        this.v = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.a = this.w;
        this.w = attribute;
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return new FieldWriter(this, i, str, str2, str3, obj);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.y == null) {
            this.y = new ByteVector();
        }
        Item itemA = a(str);
        if (itemA.c == 0) {
            this.x++;
            this.y.putShort(itemA.a);
            this.y.putShort(str2 == null ? 0 : newClass(str2));
            this.y.putShort(str3 != null ? newUTF8(str3) : 0);
            this.y.putShort(i);
            itemA.c = this.x;
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return new MethodWriter(this, i, str, str2, str3, strArr, this.K, this.J);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        this.s = newClass(str);
        if (str2 == null || str3 == null) {
            return;
        }
        this.t = newNameType(str2, str3);
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.q = newUTF8(str);
        }
        if (str2 != null) {
            this.r = new ByteVector().c(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i, typePath, byteVector);
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.N;
            this.N = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.O;
        this.O = annotationWriter;
        return annotationWriter;
    }

    public int newHandle(int i, String str, String str2, String str3, boolean z) {
        return a(i, str, str2, str3, z).a;
    }

    public static /* synthetic */ void _clinit_() {
    }

    @Override // com.esotericsoftware.asm.ClassVisitor
    public final void visitEnd() {
    }

    public int c(String str) {
        this.g.a(30, str, null, null);
        Item itemA = a(this.g);
        if (itemA == null) {
            itemA = c(this.g);
        }
        return itemA.a;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public Item m6892c(String str) {
        this.h.a(16, str, null, null);
        Item itemA = a(this.h);
        if (itemA != null) {
            return itemA;
        }
        this.d.b(16, newUTF8(str));
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.h);
        b(item);
        return item;
    }

    private void b(int i, int i2, int i3) {
        this.d.a(i, i2).putShort(i3);
    }

    private Item b(String str) {
        this.h.a(8, str, null, null);
        Item itemA = a(this.h);
        if (itemA != null) {
            return itemA;
        }
        this.d.b(8, newUTF8(str));
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.h);
        b(item);
        return item;
    }

    public ClassWriter(ClassReader classReader, int i) {
        this(i);
        classReader.a(this);
        this.M = classReader;
    }

    public int a(String str, int i) {
        Item item = this.g;
        item.b = 31;
        item.c = i;
        item.g = str;
        item.j = (str.hashCode() + 31 + i) & Integer.MAX_VALUE;
        Item itemA = a(this.g);
        if (itemA == null) {
            itemA = c(this.g);
        }
        return itemA.a;
    }

    public Item a(double d) {
        this.g.a(d);
        Item itemA = a(this.g);
        if (itemA != null) {
            return itemA;
        }
        this.d.putByte(6).putLong(this.g.d);
        Item item = new Item(this.c, this.g);
        this.c += 2;
        b(item);
        return item;
    }

    public Item a(float f) {
        this.g.a(f);
        Item itemA = a(this.g);
        if (itemA != null) {
            return itemA;
        }
        this.d.putByte(4).putInt(this.g.c);
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.g);
        b(item);
        return item;
    }

    public Item a(int i) {
        this.g.a(i);
        Item itemA = a(this.g);
        if (itemA != null) {
            return itemA;
        }
        this.d.putByte(3).putInt(i);
        int i2 = this.c;
        this.c = i2 + 1;
        Item item = new Item(i2, this.g);
        b(item);
        return item;
    }

    public Item a(int i, String str, String str2, String str3, boolean z) {
        this.j.a(i + 20, str, str2, str3);
        Item itemA = a(this.j);
        if (itemA != null) {
            return itemA;
        }
        b(15, i, i <= 4 ? newField(str, str2, str3) : newMethod(str, str2, str3, z));
        int i2 = this.c;
        this.c = i2 + 1;
        Item item = new Item(i2, this.j);
        b(item);
        return item;
    }

    public Item a(long j) {
        this.g.a(j);
        Item itemA = a(this.g);
        if (itemA != null) {
            return itemA;
        }
        this.d.putByte(5).putLong(j);
        Item item = new Item(this.c, this.g);
        this.c += 2;
        b(item);
        return item;
    }

    private Item a(Item item) {
        Item[] itemArr = this.e;
        Item item2 = itemArr[item.j % itemArr.length];
        while (item2 != null && (item2.b != item.b || !item.a(item2))) {
            item2 = item2.k;
        }
        return item2;
    }

    public int a(int i, int i2) {
        Item item = this.h;
        item.b = 32;
        item.d = ((long) i) | (((long) i2) << 32);
        item.j = (i + 32 + i2) & Integer.MAX_VALUE;
        Item itemA = a(item);
        if (itemA == null) {
            Item[] itemArr = this.H;
            String str = itemArr[i].g;
            String str2 = itemArr[i2].g;
            this.h.c = c(getCommonSuperClass(str, str2));
            itemA = new Item(0, this.h);
            b(itemA);
        }
        return itemA.c;
    }

    public Item a(String str) {
        this.h.a(7, str, null, null);
        Item itemA = a(this.h);
        if (itemA != null) {
            return itemA;
        }
        this.d.b(7, newUTF8(str));
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.h);
        b(item);
        return item;
    }

    public Item a(String str, String str2) {
        this.h.a(12, str, str2, null);
        Item itemA = a(this.h);
        if (itemA != null) {
            return itemA;
        }
        a(12, newUTF8(str), newUTF8(str2));
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.h);
        b(item);
        return item;
    }

    public Item a(String str, String str2, Handle handle, Object... objArr) {
        int i;
        ByteVector byteVector = this.A;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.A = byteVector;
        }
        int i2 = byteVector.b;
        int iHashCode = handle.hashCode();
        byteVector.putShort(newHandle(handle.a, handle.b, handle.c, handle.d, handle.isInterface()));
        int length = objArr.length;
        byteVector.putShort(length);
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
            byteVector.putShort(newConst(obj));
        }
        byte[] bArr = byteVector.a;
        int i3 = (length + 2) << 1;
        int i4 = iHashCode & Integer.MAX_VALUE;
        Item[] itemArr = this.e;
        Item item = itemArr[i4 % itemArr.length];
        loop1: while (item != null) {
            if (item.b == 33 && item.j == i4) {
                int i5 = item.c;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (bArr[i2 + i6] != bArr[i5 + i6]) {
                        break;
                    }
                }
                break loop1;
            }
            item = item.k;
        }
        if (item != null) {
            i = item.a;
            byteVector.b = i2;
        } else {
            i = this.z;
            this.z = i + 1;
            Item item2 = new Item(i);
            item2.a(i2, i4);
            b(item2);
        }
        this.i.a(str, str2, i);
        Item itemA = a(this.i);
        if (itemA != null) {
            return itemA;
        }
        a(18, i, newNameType(str, str2));
        int i7 = this.c;
        this.c = i7 + 1;
        Item item3 = new Item(i7, this.i);
        b(item3);
        return item3;
    }

    public Item a(String str, String str2, String str3) {
        this.i.a(9, str, str2, str3);
        Item itemA = a(this.i);
        if (itemA != null) {
            return itemA;
        }
        a(9, newClass(str), newNameType(str2, str3));
        int i = this.c;
        this.c = i + 1;
        Item item = new Item(i, this.i);
        b(item);
        return item;
    }

    public Item a(String str, String str2, String str3, boolean z) {
        int i = z ? 11 : 10;
        this.i.a(i, str, str2, str3);
        Item itemA = a(this.i);
        if (itemA != null) {
            return itemA;
        }
        a(i, newClass(str), newNameType(str2, str3));
        int i2 = this.c;
        this.c = i2 + 1;
        Item item = new Item(i2, this.i);
        b(item);
        return item;
    }

    private void a(int i, int i2, int i3) {
        this.d.b(i, i2).putShort(i3);
    }
}
