package bsh.org.objectweb.asm;

import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ClassVisitor {
    protected final int api;

    /* JADX INFO: renamed from: cv */
    protected ClassVisitor f1002cv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassVisitor(int i9, ClassVisitor classVisitor) {
        if (i9 != 393216 && i9 != 327680 && i9 != 262144) {
            C2104o.m5289o();
            throw null;
        }
        this.api = i9;
        this.f1002cv = classVisitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visit(int i9, int i10, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visit(i9, i10, str, str2, str3, strArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitAttribute(Attribute attribute) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visitAttribute(attribute);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitEnd() {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visitEnd();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldVisitor visitField(int i9, String str, String str2, String str3, Object obj) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            return classVisitor.visitField(i9, str, str2, str3, obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitInnerClass(String str, String str2, String str3, int i9) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visitInnerClass(str, str2, str3, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodVisitor visitMethod(int i9, String str, String str2, String str3, String[] strArr) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            return classVisitor.visitMethod(i9, str, str2, str3, strArr);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitOuterClass(String str, String str2, String str3) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visitOuterClass(str, str2, str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitSource(String str, String str2) {
        ClassVisitor classVisitor = this.f1002cv;
        if (classVisitor != null) {
            classVisitor.visitSource(str, str2);
        }
    }

    public ClassVisitor(int i9) {
        this(i9, null);
    }
}
