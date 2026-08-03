package com.android.p001dx.dex.file;

import com.android.p001dx.rop.annotation.Annotations;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstMethodRef;
import com.android.p001dx.util.AnnotatedOutput;
import com.android.p001dx.util.Hex;
import com.android.p001dx.util.ToHuman;

/* JADX INFO: loaded from: classes.dex */
public final class MethodAnnotationStruct implements ToHuman, Comparable<MethodAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstMethodRef method;

    public MethodAnnotationStruct(CstMethodRef cstMethodRef, AnnotationSetItem annotationSetItem) {
        if (cstMethodRef == null) {
            throw new NullPointerException("method == null");
        }
        if (annotationSetItem == null) {
            throw new NullPointerException("annotations == null");
        }
        this.method = cstMethodRef;
        this.annotations = annotationSetItem;
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MethodAnnotationStruct) {
            return this.method.equals(((MethodAnnotationStruct) obj).method);
        }
        return false;
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return this.method.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.method.toHuman());
            annotatedOutput.annotate(4, "      method_idx:      " + Hex.m5037u4(iIndexOf));
            annotatedOutput.annotate(4, "      annotations_off: " + Hex.m5037u4(absoluteOffset));
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(MethodAnnotationStruct methodAnnotationStruct) {
        return this.method.compareTo((Constant) methodAnnotationStruct.method);
    }
}
