package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.rop.annotation.Annotations;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstMethodRef;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.android.p002dx.util.ToHuman;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodAnnotationStruct implements ToHuman, Comparable<MethodAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstMethodRef method;

    public MethodAnnotationStruct(CstMethodRef cstMethodRef, AnnotationSetItem annotationSetItem) {
        if (cstMethodRef == null) {
            C3466.m5903("method == null");
            throw null;
        }
        if (annotationSetItem == null) {
            C3466.m5903("annotations == null");
            throw null;
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

    @Override // java.lang.Comparable
    public int compareTo(MethodAnnotationStruct methodAnnotationStruct) {
        return this.method.compareTo((Constant) methodAnnotationStruct.method);
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

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return this.method.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.method.toHuman());
            annotatedOutput.annotate(4, "      method_idx:      " + Hex.m30u4(iIndexOf));
            AbstractC3275.m5123(absoluteOffset, new StringBuilder("      annotations_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }
}
