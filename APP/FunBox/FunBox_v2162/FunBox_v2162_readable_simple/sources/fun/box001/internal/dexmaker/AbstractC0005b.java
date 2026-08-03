package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.code.AbstractC0192v;
import fun.box001.internal.dexformat.writer.code.C0175e;
import fun.box001.internal.dexformat.writer.code.C0176f;
import fun.box001.internal.dexformat.writer.code.C0177g;
import fun.box001.internal.dexformat.writer.code.C0178h;
import fun.box001.internal.dexformat.writer.code.C0179i;
import fun.box001.internal.dexformat.writer.code.C0180j;
import fun.box001.internal.dexformat.writer.code.C0181k;

/* JADX INFO: renamed from: c.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0005b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static AbstractC0192v m42a(Integer r2) {
        if (r2 != 0) goto L6;
        return C0181k.f690a;
    L6:
        if ((r2 instanceof Boolean) == false) goto L13;
        if (((Boolean) r2).booleanValue() == false) goto L11;
        return C0175e.f688c;
    L11:
        return C0175e.f687b;
    L13:
        if ((r2 instanceof Byte) == false) goto L17;
        return C0176f.m432j(((Byte) r2).byteValue());
    L17:
        if ((r2 instanceof Character) == false) goto L21;
        return C0177g.m433j(((Character) r2).charValue());
    L21:
        if ((r2 instanceof Double) == false) goto L25;
        return C0178h.m434j(Double.doubleToLongBits(((Double) r2).doubleValue()));
    L25:
        if ((r2 instanceof Float) == false) goto L29;
        return C0179i.m435j(Float.floatToIntBits(((Float) r2).floatValue()));
    L29:
        return C0180j.m436j(r2.intValue());
    }
}
