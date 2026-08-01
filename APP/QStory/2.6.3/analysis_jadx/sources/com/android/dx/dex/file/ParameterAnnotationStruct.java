package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2633;
import com.android.dx.rop.annotation.AnnotationsList;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.android.dx.util.ToHuman;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterAnnotationStruct implements ToHuman, Comparable<ParameterAnnotationStruct> {
    private final UniformListItem<AnnotationSetRefItem> annotationsItem;
    private final AnnotationsList annotationsList;
    private final CstMethodRef method;

    public ParameterAnnotationStruct(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        if (cstMethodRef == null) {
            C2633.m5343("method == null");
            throw null;
        }
        if (annotationsList == null) {
            C2633.m5343("annotationsList == null");
            throw null;
        }
        this.method = cstMethodRef;
        this.annotationsList = annotationsList;
        int size = annotationsList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new AnnotationSetRefItem(new AnnotationSetItem(annotationsList.get(i), dexFile)));
        }
        this.annotationsItem = new UniformListItem<>(ItemType.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        wordData.add(this.annotationsItem);
    }

    @Override // java.lang.Comparable
    public int compareTo(ParameterAnnotationStruct parameterAnnotationStruct) {
        return this.method.compareTo((Constant) parameterAnnotationStruct.method);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterAnnotationStruct) {
            return this.method.equals(((ParameterAnnotationStruct) obj).method);
        }
        return false;
    }

    public AnnotationsList getAnnotationsList() {
        return this.annotationsList;
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.method.toHuman());
        sb.append(": ");
        boolean z = true;
        for (T t : this.annotationsItem.getItems()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(t.toHuman());
        }
        return sb.toString();
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotationsItem.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.method.toHuman());
            annotatedOutput.annotate(4, "      method_idx:      " + Hex.u4(iIndexOf));
            AbstractC2442.m4563(absoluteOffset, new StringBuilder("      annotations_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }
}
