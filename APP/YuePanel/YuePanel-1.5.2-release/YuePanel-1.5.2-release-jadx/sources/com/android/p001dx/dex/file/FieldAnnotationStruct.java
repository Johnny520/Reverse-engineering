package com.android.p001dx.dex.file;

import com.android.p001dx.rop.annotation.Annotations;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstFieldRef;
import com.android.p001dx.util.AnnotatedOutput;
import com.android.p001dx.util.Hex;
import com.android.p001dx.util.ToHuman;

/* JADX INFO: loaded from: classes.dex */
public final class FieldAnnotationStruct implements ToHuman, Comparable<FieldAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstFieldRef field;

    public FieldAnnotationStruct(CstFieldRef cstFieldRef, AnnotationSetItem annotationSetItem) {
        if (cstFieldRef == null) {
            throw new NullPointerException("field == null");
        }
        if (annotationSetItem == null) {
            throw new NullPointerException("annotations == null");
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

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return this.field.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getFieldIds().indexOf(this.field);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.field.toHuman());
            annotatedOutput.annotate(4, "      field_idx:       " + Hex.m5037u4(iIndexOf));
            annotatedOutput.annotate(4, "      annotations_off: " + Hex.m5037u4(absoluteOffset));
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(FieldAnnotationStruct fieldAnnotationStruct) {
        return this.field.compareTo((Constant) fieldAnnotationStruct.field);
    }
}
