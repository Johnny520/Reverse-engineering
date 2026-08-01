package com.android.dx.dex.code;

import bsh.C2633;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Dop {
    private final int family;
    private final InsnFormat format;
    private final boolean hasResult;
    private final int nextOpcode;
    private final int opcode;

    public Dop(int i, int i2, int i3, InsnFormat insnFormat, boolean z) {
        if (!Opcodes.isValidShape(i)) {
            C5925.m11310("bogus opcode");
            throw null;
        }
        if (!Opcodes.isValidShape(i2)) {
            C5925.m11310("bogus family");
            throw null;
        }
        if (!Opcodes.isValidShape(i3)) {
            C5925.m11310("bogus nextOpcode");
            throw null;
        }
        if (insnFormat == null) {
            C2633.m5343("format == null");
            throw null;
        }
        this.opcode = i;
        this.family = i2;
        this.nextOpcode = i3;
        this.format = insnFormat;
        this.hasResult = z;
    }

    public int getFamily() {
        return this.family;
    }

    public InsnFormat getFormat() {
        return this.format;
    }

    public String getName() {
        return OpcodeInfo.getName(this.opcode);
    }

    public int getNextOpcode() {
        return this.nextOpcode;
    }

    public int getOpcode() {
        return this.opcode;
    }

    public Dop getOppositeTest() {
        switch (this.opcode) {
            case 50:
                return Dops.IF_NE;
            case 51:
                return Dops.IF_EQ;
            case 52:
                return Dops.IF_GE;
            case 53:
                return Dops.IF_LT;
            case 54:
                return Dops.IF_LE;
            case 55:
                return Dops.IF_GT;
            case 56:
                return Dops.IF_NEZ;
            case 57:
                return Dops.IF_EQZ;
            case 58:
                return Dops.IF_GEZ;
            case 59:
                return Dops.IF_LTZ;
            case 60:
                return Dops.IF_LEZ;
            case 61:
                return Dops.IF_GTZ;
            default:
                C4211.m8604(this, "bogus opcode: ");
                return null;
        }
    }

    public boolean hasResult() {
        return this.hasResult;
    }

    public String toString() {
        return getName();
    }
}
