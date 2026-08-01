package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.rop.annotation.Annotations;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstFieldRef;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.android.p002dx.util.ToHuman;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldAnnotationStruct implements ToHuman, Comparable<FieldAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstFieldRef field;

    public FieldAnnotationStruct(CstFieldRef cstFieldRef, AnnotationSetItem annotationSetItem) {
        if (cstFieldRef == null) {
            C3466.m5903("field == null");
            throw null;
        }
        if (annotationSetItem == null) {
            C3466.m5903("annotations == null");
            throw null;
        }
        this.field = cstFieldRef;
        this.annotations = annotationSetItem;
    }

    public void addContents(DexFile dexFile) {
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MixedItemSection wordData = dexFile.getWordData();
        fieldIds.intern(this.field);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldAnnotationStruct fieldAnnotationStruct) {
        return this.field.compareTo((Constant) fieldAnnotationStruct.field);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FieldAnnotationStruct) {
            return this.field.equals(((FieldAnnotationStruct) obj).field);
        }
        return false;
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }

    public CstFieldRef getField() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return this.field.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.field.toHuman());
            annotatedOutput.annotate(4, "      field_idx:       " + Hex.m30u4(iIndexOf));
            AbstractC3275.m5123(absoluteOffset, new StringBuilder("      annotations_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }
}
