package ua;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2650c1;
import java.util.Arrays;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8587e extends AbstractC8601r {
    public C8587e(char c10) {
        super(Character.valueOf(c10));
    }

    /* JADX INFO: renamed from: c */
    public final String m33002c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case Opcodes.FCONST_0 /* 11 */:
            default:
                return m33004e(c10) ? String.valueOf(c10) : "?";
            case Opcodes.FCONST_1 /* 12 */:
                return "\\f";
            case Opcodes.FCONST_2 /* 13 */:
                return "\\r";
        }
    }

    @Override // ua.AbstractC8590g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 mo32999a(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC2650c1 abstractC2650c1M20933v = interfaceC6005h0.mo12669t().m20933v();
        abstractC2650c1M20933v.getClass();
        return abstractC2650c1M20933v;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m33004e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // ua.AbstractC8590g
    public String toString() {
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) mo33009b()).charValue()), m33002c(((Character) mo33009b()).charValue())}, 2));
    }
}
