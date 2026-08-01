package ad;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: ad.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0272l {

    /* JADX INFO: renamed from: a */
    public static final C0272l f663a;

    /* JADX INFO: renamed from: b */
    public static final char[] f664b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f665c;

    static {
        C0272l c0272l = new C0272l();
        f663a = c0272l;
        f664b = new char[Opcodes.LNEG];
        f665c = new byte[126];
        c0272l.m800f();
        c0272l.m799e();
    }

    /* JADX INFO: renamed from: a */
    public final void m795a(char c10, char c11) {
        m796b(c10, c11);
    }

    /* JADX INFO: renamed from: b */
    public final void m796b(int i10, char c10) {
        if (c10 != 'u') {
            f664b[c10] = (char) i10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m797c(char c10, byte b10) {
        m798d(c10, b10);
    }

    /* JADX INFO: renamed from: d */
    public final void m798d(int i10, byte b10) {
        f665c[i10] = b10;
    }

    /* JADX INFO: renamed from: e */
    public final void m799e() {
        for (int i10 = 0; i10 < 33; i10++) {
            m798d(i10, JSONB.Constants.BC_SYMBOL);
        }
        m798d(9, (byte) 3);
        m798d(10, (byte) 3);
        m798d(13, (byte) 3);
        m798d(32, (byte) 3);
        m797c(',', (byte) 4);
        m797c(':', (byte) 5);
        m797c('{', (byte) 6);
        m797c('}', (byte) 7);
        m797c('[', (byte) 8);
        m797c(']', (byte) 9);
        m797c('\"', (byte) 1);
        m797c('\\', (byte) 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m800f() {
        for (int i10 = 0; i10 < 32; i10++) {
            m796b(i10, 'u');
        }
        m796b(8, 'b');
        m796b(9, 't');
        m796b(10, 'n');
        m796b(12, 'f');
        m796b(13, 'r');
        m795a('/', '/');
        m795a('\"', '\"');
        m795a('\\', '\\');
    }
}
