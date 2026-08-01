package com.android.dx.rop.code;

import com.android.dx.rop.cst.CstString;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SourcePosition {
    public static final SourcePosition NO_INFO = new SourcePosition(null, -1, -1);
    private final int address;
    private final int line;
    private final CstString sourceFile;

    public SourcePosition(CstString cstString, int i, int i2) {
        if (i < -1) {
            C5919.m11249("address < -1");
            throw null;
        }
        if (i2 < -1) {
            C5919.m11249("line < -1");
            throw null;
        }
        this.sourceFile = cstString;
        this.address = i;
        this.line = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SourcePosition)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourcePosition sourcePosition = (SourcePosition) obj;
        return this.address == sourcePosition.address && sameLineAndFile(sourcePosition);
    }

    public int getAddress() {
        return this.address;
    }

    public int getLine() {
        return this.line;
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public int hashCode() {
        return this.sourceFile.hashCode() + this.address + this.line;
    }

    public boolean sameLine(SourcePosition sourcePosition) {
        return this.line == sourcePosition.line;
    }

    public boolean sameLineAndFile(SourcePosition sourcePosition) {
        if (this.line != sourcePosition.line) {
            return false;
        }
        CstString cstString = this.sourceFile;
        CstString cstString2 = sourcePosition.sourceFile;
        if (cstString != cstString2) {
            return cstString != null && cstString.equals(cstString2);
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        CstString cstString = this.sourceFile;
        if (cstString != null) {
            sb.append(cstString.toHuman());
            sb.append(":");
        }
        int i = this.line;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.address;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(Hex.u2(i2));
        }
        return sb.toString();
    }
}
