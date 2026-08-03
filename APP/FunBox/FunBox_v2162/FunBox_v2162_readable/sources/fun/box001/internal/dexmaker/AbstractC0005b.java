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
    static AbstractC0192v m42a(Integer num) {
        return num == 0 ? C0181k.f690a : num instanceof Boolean ? ((Boolean) num).booleanValue() ? C0175e.f688c : C0175e.f687b : num instanceof Byte ? C0176f.m432j(((Byte) num).byteValue()) : num instanceof Character ? C0177g.m433j(((Character) num).charValue()) : num instanceof Double ? C0178h.m434j(Double.doubleToLongBits(((Double) num).doubleValue())) : num instanceof Float ? C0179i.m435j(Float.floatToIntBits(((Float) num).floatValue())) : C0180j.m436j(num.intValue());
    }
}
