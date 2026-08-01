package net.bytebuddy.jar.asm;

import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassVisitor {
    protected final int api;

    /* JADX INFO: renamed from: cv */
    protected ClassVisitor f320cv;

    public ClassVisitor(int i, ClassVisitor classVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C6755.m11869(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.f320cv = classVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC7012.m12147(i, "Unsupported api ");
    }

    public ClassVisitor getDelegate() {
        return this.f320cv;
    }

    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (this.api < 524288 && (65536 & i2) != 0) {
            C6755.m11867("Records requires ASM8");
            return;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visit(i, i2, str, str2, str3, strArr);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitEnd();
        }
    }

    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitField(i, str, str2, str3, obj);
        }
        return null;
    }

    public void visitInnerClass(String str, String str2, String str3, int i) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitInnerClass(str, str2, str3, i);
        }
    }

    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitMethod(i, str, str2, str3, strArr);
        }
        return null;
    }

    public ModuleVisitor visitModule(String str, int i, String str2) {
        if (this.api < 393216) {
            C6755.m11867("Module requires ASM6");
            return null;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitModule(str, i, str2);
        }
        return null;
    }

    public void visitNestHost(String str) {
        if (this.api < 458752) {
            C6755.m11867("NestHost requires ASM7");
            return;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitNestHost(str);
        }
    }

    public void visitNestMember(String str) {
        if (this.api < 458752) {
            C6755.m11867("NestMember requires ASM7");
            return;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitNestMember(str);
        }
    }

    public void visitOuterClass(String str, String str2, String str3) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitOuterClass(str, str2, str3);
        }
    }

    public void visitPermittedSubclass(String str) {
        if (this.api < 589824) {
            C6755.m11867("PermittedSubclasses requires ASM9");
            return;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitPermittedSubclass(str);
        }
    }

    public RecordComponentVisitor visitRecordComponent(String str, String str2, String str3) {
        if (this.api < 524288) {
            C6755.m11867("Record requires ASM8");
            return null;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitRecordComponent(str, str2, str3);
        }
        return null;
    }

    public void visitSource(String str, String str2) {
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            classVisitor.visitSource(str, str2);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            C6755.m11867("TypeAnnotation requires ASM5");
            return null;
        }
        ClassVisitor classVisitor = this.f320cv;
        if (classVisitor != null) {
            return classVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public ClassVisitor(int i) {
        this(i, null);
    }
}
