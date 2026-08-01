package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.dex.code.DalvCode;
import com.android.p002dx.rop.code.AccessFlags;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstMethodRef;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.type.TypeList;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.bumptech.glide.AbstractC3887;
import java.io.PrintWriter;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedMethod extends EncodedMember implements Comparable<EncodedMethod> {
    private final CodeItem code;
    private final CstMethodRef method;

    public EncodedMethod(CstMethodRef cstMethodRef, int i, DalvCode dalvCode, TypeList typeList) {
        super(i);
        if (cstMethodRef == null) {
            C3466.m5903("method == null");
            throw null;
        }
        this.method = cstMethodRef;
        if (dalvCode == null) {
            this.code = null;
        } else {
            this.code = new CodeItem(cstMethodRef, dalvCode, (i & 8) != 0, typeList);
        }
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        CodeItem codeItem = this.code;
        if (codeItem != null) {
            wordData.add(codeItem);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedMethod encodedMethod) {
        return this.method.compareTo((Constant) encodedMethod.method);
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public void debugPrint(PrintWriter printWriter, boolean z) {
        CodeItem codeItem = this.code;
        if (codeItem != null) {
            codeItem.debugPrint(printWriter, "  ", z);
            return;
        }
        printWriter.println(getRef().toHuman() + ": abstract or native");
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2) {
        int iIndexOf = dexFile.getMethodIds().indexOf(this.method);
        int i3 = iIndexOf - i;
        int accessFlags = getAccessFlags();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.code);
        if ((absoluteOffsetOr0 != 0) != ((accessFlags & 1280) == 0)) {
            C6755.m11867("code vs. access_flags mismatch");
            return 0;
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, String.format("  [%x] %s", Integer.valueOf(i2), this.method.toHuman()));
            annotatedOutput.annotate(AbstractC3887.m7197(i3), "    method_idx:   " + Hex.m30u4(iIndexOf));
            annotatedOutput.annotate(AbstractC3887.m7197(accessFlags), "    access_flags: " + AccessFlags.methodString(accessFlags));
            AbstractC3275.m5123(absoluteOffsetOr0, new StringBuilder("    code_off:     "), annotatedOutput, AbstractC3887.m7197(absoluteOffsetOr0));
        }
        annotatedOutput.writeUleb128(i3);
        annotatedOutput.writeUleb128(accessFlags);
        annotatedOutput.writeUleb128(absoluteOffsetOr0);
        return iIndexOf;
    }

    public boolean equals(Object obj) {
        return (obj instanceof EncodedMethod) && compareTo((EncodedMethod) obj) == 0;
    }

    @Override // com.android.p002dx.dex.file.EncodedMember
    public final CstString getName() {
        return this.method.getNat().getName();
    }

    public final CstMethodRef getRef() {
        return this.method;
    }

    @Override // com.android.p002dx.util.ToHuman
    public final String toHuman() {
        return this.method.toHuman();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(EncodedMethod.class.getName());
        sb.append('{');
        sb.append(Hex.m28u2(getAccessFlags()));
        sb.append(' ');
        sb.append(this.method);
        if (this.code != null) {
            sb.append(' ');
            sb.append(this.code);
        }
        sb.append('}');
        return sb.toString();
    }
}
