package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationUtils {
    private static final com.android.dx.rop.cst.CstString ACCESS_FLAGS_STRING = null;
    private static final com.android.dx.rop.cst.CstType ANNOTATION_DEFAULT_TYPE = null;
    private static final com.android.dx.rop.cst.CstType ENCLOSING_CLASS_TYPE = null;
    private static final com.android.dx.rop.cst.CstType ENCLOSING_METHOD_TYPE = null;
    private static final com.android.dx.rop.cst.CstType INNER_CLASS_TYPE = null;
    private static final com.android.dx.rop.cst.CstType MEMBER_CLASSES_TYPE = null;
    private static final com.android.dx.rop.cst.CstString NAME_STRING = null;
    private static final com.android.dx.rop.cst.CstType SIGNATURE_TYPE = null;
    private static final com.android.dx.rop.cst.CstType SOURCE_DEBUG_EXTENSION_TYPE = null;
    private static final com.android.dx.rop.cst.CstType THROWS_TYPE = null;
    private static final com.android.dx.rop.cst.CstString VALUE_STRING = null;

    static {
            java.lang.String r0 = "Ldalvik/annotation/AnnotationDefault;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.ANNOTATION_DEFAULT_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/EnclosingClass;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.ENCLOSING_CLASS_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/EnclosingMethod;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.ENCLOSING_METHOD_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/InnerClass;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.INNER_CLASS_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/MemberClasses;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.MEMBER_CLASSES_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/Signature;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.SIGNATURE_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/SourceDebugExtension;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.SOURCE_DEBUG_EXTENSION_TYPE = r0
            java.lang.String r0 = "Ldalvik/annotation/Throws;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.intern(r0)
            com.android.dx.dex.file.AnnotationUtils.THROWS_TYPE = r0
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "accessFlags"
            r0.<init>(r1)
            com.android.dx.dex.file.AnnotationUtils.ACCESS_FLAGS_STRING = r0
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "name"
            r0.<init>(r1)
            com.android.dx.dex.file.AnnotationUtils.NAME_STRING = r0
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "value"
            r0.<init>(r1)
            com.android.dx.dex.file.AnnotationUtils.VALUE_STRING = r0
            return
    }

    private AnnotationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.rop.annotation.Annotation makeAnnotationDefault(com.android.dx.rop.annotation.Annotation r4) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.ANNOTATION_DEFAULT_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            com.android.dx.rop.cst.CstAnnotation r3 = new com.android.dx.rop.cst.CstAnnotation
            r3.<init>(r4)
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }

    private static com.android.dx.rop.cst.CstArray makeCstArray(com.android.dx.rop.type.TypeList r4) {
            int r0 = r4.size()
            com.android.dx.rop.cst.CstArray$List r1 = new com.android.dx.rop.cst.CstArray$List
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            com.android.dx.rop.type.Type r3 = r4.getType(r2)
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.intern(r3)
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto La
        L1a:
            r1.setImmutable()
            com.android.dx.rop.cst.CstArray r4 = new com.android.dx.rop.cst.CstArray
            r4.<init>(r1)
            return r4
    }

    public static com.android.dx.rop.annotation.Annotation makeEnclosingClass(com.android.dx.rop.cst.CstType r3) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.ENCLOSING_CLASS_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeEnclosingMethod(com.android.dx.rop.cst.CstMethodRef r3) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.ENCLOSING_METHOD_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeInnerClass(com.android.dx.rop.cst.CstString r3, int r4) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.INNER_CLASS_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            if (r3 == 0) goto Lc
            goto Le
        Lc:
            com.android.dx.rop.cst.CstKnownNull r3 = com.android.dx.rop.cst.CstKnownNull.THE_ONE
        Le:
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.NAME_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            com.android.dx.rop.annotation.NameValuePair r3 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r1 = com.android.dx.dex.file.AnnotationUtils.ACCESS_FLAGS_STRING
            com.android.dx.rop.cst.CstInteger r4 = com.android.dx.rop.cst.CstInteger.make(r4)
            r3.<init>(r1, r4)
            r0.put(r3)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeMemberClasses(com.android.dx.rop.type.TypeList r3) {
            com.android.dx.rop.cst.CstArray r3 = makeCstArray(r3)
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.MEMBER_CLASSES_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeSignature(com.android.dx.rop.cst.CstString r8) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.SIGNATURE_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            java.lang.String r8 = r8.getString()
            int r1 = r8.length()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L1a:
            if (r4 >= r1) goto L50
            char r5 = r8.charAt(r4)
            int r6 = r4 + 1
            r7 = 76
            if (r5 != r7) goto L3b
        L26:
            if (r6 >= r1) goto L47
            char r5 = r8.charAt(r6)
            r7 = 59
            if (r5 != r7) goto L33
            int r6 = r6 + 1
            goto L47
        L33:
            r7 = 60
            if (r5 != r7) goto L38
            goto L47
        L38:
            int r6 = r6 + 1
            goto L26
        L3b:
            if (r6 >= r1) goto L47
            char r5 = r8.charAt(r6)
            if (r5 != r7) goto L44
            goto L47
        L44:
            int r6 = r6 + 1
            goto L3b
        L47:
            java.lang.String r4 = r8.substring(r4, r6)
            r2.add(r4)
            r4 = r6
            goto L1a
        L50:
            int r8 = r2.size()
            com.android.dx.rop.cst.CstArray$List r1 = new com.android.dx.rop.cst.CstArray$List
            r1.<init>(r8)
        L59:
            if (r3 >= r8) goto L6c
            com.android.dx.rop.cst.CstString r4 = new com.android.dx.rop.cst.CstString
            java.lang.Object r5 = r2.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5)
            r1.set(r3, r4)
            int r3 = r3 + 1
            goto L59
        L6c:
            r1.setImmutable()
            com.android.dx.rop.annotation.NameValuePair r8 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            com.android.dx.rop.cst.CstArray r3 = new com.android.dx.rop.cst.CstArray
            r3.<init>(r1)
            r8.<init>(r2, r3)
            r0.put(r8)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeSourceDebugExtension(com.android.dx.rop.cst.CstString r3) {
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.SOURCE_DEBUG_EXTENSION_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.rop.annotation.Annotation makeThrows(com.android.dx.rop.type.TypeList r3) {
            com.android.dx.rop.cst.CstArray r3 = makeCstArray(r3)
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            com.android.dx.rop.cst.CstType r1 = com.android.dx.dex.file.AnnotationUtils.THROWS_TYPE
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.SYSTEM
            r0.<init>(r1, r2)
            com.android.dx.rop.annotation.NameValuePair r1 = new com.android.dx.rop.annotation.NameValuePair
            com.android.dx.rop.cst.CstString r2 = com.android.dx.dex.file.AnnotationUtils.VALUE_STRING
            r1.<init>(r2, r3)
            r0.put(r1)
            r0.setImmutable()
            return r0
    }
}
