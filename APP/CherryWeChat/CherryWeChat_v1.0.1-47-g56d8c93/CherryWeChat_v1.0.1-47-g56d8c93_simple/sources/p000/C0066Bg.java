package p000;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0066Bg {

    /* JADX INFO: renamed from: a */
    public final int f157a;

    /* JADX INFO: renamed from: b */
    public final int f158b;

    /* JADX INFO: renamed from: c */
    public final long f159c;

    /* JADX INFO: renamed from: d */
    public final byte[] f160d;

    public C0066Bg(byte[] r7, int r8, int r9) {
        this(-1, r7, r8, r9);
    }

    /* JADX INFO: renamed from: a */
    public static C0066Bg m106a(long r3, ByteOrder r5) {
        long[] r1 = {r3};
        ByteBuffer r32 = ByteBuffer.wrap(new byte[C0238Fg.f756C[4]]);
        r32.order(r5);
        r32.putInt((int) r1[0]);
        return new C0066Bg(r32.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C0066Bg m107b(C0152Dg r4, ByteOrder r5) {
        ByteBuffer r0 = ByteBuffer.wrap(new byte[C0238Fg.f756C[5]]);
        r0.order(r5);
        C0152Dg r42 = new C0152Dg[]{r4}[0];
        r0.putInt((int) r42.f408a);
        r0.putInt((int) r42.f409b);
        return new C0066Bg(r0.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C0066Bg m108c(int r2, ByteOrder r3) {
        ByteBuffer r0 = ByteBuffer.wrap(new byte[C0238Fg.f756C[3]]);
        r0.order(r3);
        r0.putShort((short) new int[]{r2}[0]);
        return new C0066Bg(r0.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m109d(ByteOrder r5) {
        Object r52 = m112g(r5);
        if (r52 == null) goto L43;
        if ((r52 instanceof String) == false) goto L9;
        return Double.parseDouble((String) r52);
    L9:
        if ((r52 instanceof long[]) == false) goto L17;
        if (((long[]) r52).length != 1) goto L15;
        return r5[0];
    L15:
        throw new NumberFormatException("There are more than one component");
    L17:
        if ((r52 instanceof int[]) == false) goto L25;
        if (((int[]) r52).length != 1) goto L23;
        return r5[0];
    L23:
        throw new NumberFormatException("There are more than one component");
    L25:
        if ((r52 instanceof double[]) == false) goto L33;
        double[] r53 = (double[]) r52;
        if (r53.length != 1) goto L31;
        return r53[0];
    L31:
        throw new NumberFormatException("There are more than one component");
    L33:
        if ((r52 instanceof C0152Dg[]) == false) goto L41;
        C0152Dg[] r54 = (C0152Dg[]) r52;
        if (r54.length != 1) goto L39;
        C0152Dg r55 = r54[0];
        return r55.f408a / r55.f409b;
    L39:
        throw new NumberFormatException("There are more than one component");
    L41:
        throw new NumberFormatException("Couldn't find a double value");
    L43:
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    /* JADX INFO: renamed from: e */
    public final int m110e(ByteOrder r5) {
        Object r52 = m112g(r5);
        if (r52 == null) goto L27;
        if ((r52 instanceof String) == false) goto L9;
        return Integer.parseInt((String) r52);
    L9:
        if ((r52 instanceof long[]) == false) goto L17;
        long[] r53 = (long[]) r52;
        if (r53.length != 1) goto L15;
        return (int) r53[0];
    L15:
        throw new NumberFormatException("There are more than one component");
    L17:
        if ((r52 instanceof int[]) == false) goto L25;
        int[] r54 = (int[]) r52;
        if (r54.length != 1) goto L23;
        return r54[0];
    L23:
        throw new NumberFormatException("There are more than one component");
    L25:
        throw new NumberFormatException("Couldn't find a integer value");
    L27:
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    /* JADX INFO: renamed from: f */
    public final String m111f(ByteOrder r7) {
        Object r72 = m112g(r7);
        if (r72 != null) goto L6;
        return null;
    L6:
        if ((r72 instanceof String) == true) goto L8;
        StringBuilder r0 = new StringBuilder();
        int r3 = 0;
        if ((r72 instanceof long[]) == false) goto L20;
        long[] r73 = (long[]) r72;
    L13:
        if (r3 >= r73.length) goto L18;
        r0.append(r73[r3]);
        r3 = r3 + 1;
        if (r3 == r73.length) goto L13;
        r0.append(",");
        goto L13
    L18:
        return r0.toString();
    L20:
        if ((r72 instanceof int[]) == false) goto L30;
        int[] r74 = (int[]) r72;
    L23:
        if (r3 >= r74.length) goto L28;
        r0.append(r74[r3]);
        r3 = r3 + 1;
        if (r3 == r74.length) goto L23;
        r0.append(",");
        goto L23
    L28:
        return r0.toString();
    L30:
        if ((r72 instanceof double[]) == false) goto L40;
        double[] r75 = (double[]) r72;
    L33:
        if (r3 >= r75.length) goto L38;
        r0.append(r75[r3]);
        r3 = r3 + 1;
        if (r3 == r75.length) goto L33;
        r0.append(",");
        goto L33
    L38:
        return r0.toString();
    L40:
        if ((r72 instanceof C0152Dg[]) == false) goto L49;
        C0152Dg[] r76 = (C0152Dg[]) r72;
    L43:
        if (r3 >= r76.length) goto L48;
        r0.append(r76[r3].f408a);
        r0.append('/');
        r0.append(r76[r3].f409b);
        r3 = r3 + 1;
        if (r3 == r76.length) goto L43;
        r0.append(",");
        goto L43
    L48:
        return r0.toString();
    L49:
        return null;
    L8:
        return (String) r72;
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [Dg[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [Dg[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: g */
    public final Serializable m112g(ByteOrder r12) {
        byte[] r0 = this.f160d;
        C0023Ag r1 = null;
        C0023Ag r2 = new C0023Ag(r0);     // Catch: Throwable -> L93 IOException -> L95
    L147:
        r2.f47c = r12;     // Catch: Throwable -> L13 IOException -> L115
        int r122 = this.f157a;     // Catch: Throwable -> L13 IOException -> L115
        int r5 = 0;
        int r6 = this.f158b;
        switch(r122) {
            case 1: goto L83;
            case 2: goto L60;
            case 3: goto L53;
            case 4: goto L47;
            case 5: goto L41;
            case 6: goto L83;
            case 7: goto L60;
            case 8: goto L35;
            case 9: goto L29;
            case 10: goto L23;
            case 11: goto L17;
            case 12: goto L9;
            default: goto L117;
        };
    L9:
        ?? r123 = new double[r6];     // Catch: Throwable -> L13 IOException -> L115
    L10:
        if (r5 >= r6) goto L123;
        r123[r5] = r2.readDouble();     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L10
    L123:
        r2.close();     // Catch: IOException -> L102
    L16:
        return r123;
    L17:
        ?? r124 = new double[r6];     // Catch: Throwable -> L13 IOException -> L115
    L18:
        if (r5 >= r6) goto L135;
        r124[r5] = r2.readFloat();     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L18
    L135:
        r2.close();     // Catch: IOException -> L103
    L22:
        return r124;
    L23:
        ?? r125 = new C0152Dg[r6];     // Catch: Throwable -> L13 IOException -> L115
    L24:
        if (r5 >= r6) goto L141;
        r125[r5] = new C0152Dg(r2.readInt(), r2.readInt());     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L24
    L141:
        r2.close();     // Catch: IOException -> L104
    L28:
        return r125;
    L29:
        ?? r126 = new int[r6];     // Catch: Throwable -> L13 IOException -> L115
    L30:
        if (r5 >= r6) goto L127;
        r126[r5] = r2.readInt();     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L30
    L127:
        r2.close();     // Catch: IOException -> L105
    L34:
        return r126;
    L35:
        ?? r127 = new int[r6];     // Catch: Throwable -> L13 IOException -> L115
    L36:
        if (r5 >= r6) goto L137;
        r127[r5] = r2.readShort();     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L36
    L137:
        r2.close();     // Catch: IOException -> L106
    L40:
        return r127;
    L41:
        ?? r128 = new C0152Dg[r6];     // Catch: Throwable -> L13 IOException -> L115
    L42:
        if (r5 >= r6) goto L139;
        r128[r5] = new C0152Dg(((long) r2.readInt()) & 4294967295L, ((long) r2.readInt()) & 4294967295L);     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L42
    L139:
        r2.close();     // Catch: IOException -> L107
    L46:
        return r128;
    L47:
        ?? r129 = new long[r6];     // Catch: Throwable -> L13 IOException -> L115
    L48:
        if (r5 >= r6) goto L125;
        r129[r5] = ((long) r2.readInt()) & 4294967295L;     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L48
    L125:
        r2.close();     // Catch: IOException -> L108
    L52:
        return r129;
    L53:
        ?? r1210 = new int[r6];     // Catch: Throwable -> L13 IOException -> L115
    L54:
        if (r5 >= r6) goto L133;
        r1210[r5] = r2.readUnsignedShort();     // Catch: Throwable -> L13 IOException -> L115
        r5 = r5 + 1;
        goto L54
    L133:
        r2.close();     // Catch: IOException -> L109
    L58:
        return r1210;
    L117:
        r2.close();     // Catch: IOException -> L113
    L8:
        return null;
    L60:
        if (r6 < C0238Fg.f757D.length) goto L69;
        int r1211 = 0;
    L62:
        byte[] r3 = C0238Fg.f757D;     // Catch: Throwable -> L13 IOException -> L115
        if (r1211 >= r3.length) goto L68;
        if (r0[r1211] != r3[r1211]) goto L69;
        r1211 = r1211 + 1;     // Catch: Throwable -> L13 IOException -> L115
        goto L62
    L68:
        r5 = r3.length;     // Catch: Throwable -> L13 IOException -> L115
    L69:
        StringBuilder r1212 = new StringBuilder();     // Catch: Throwable -> L13 IOException -> L115
    L70:
        if (r5 >= r6) goto L79;
        byte r32 = r0[r5];     // Catch: Throwable -> L13 IOException -> L115
        if (r32 == 0) goto L79;
        if (r32 < 32) goto L77;
        r1212.append((char) r32);     // Catch: Throwable -> L13 IOException -> L115
    L78:
        r5 = r5 + 1;     // Catch: Throwable -> L13 IOException -> L115
        goto L70
    L77:
        r1212.append('?');     // Catch: Throwable -> L13 IOException -> L115
    L79:
        String r1213 = r1212.toString();     // Catch: Throwable -> L13 IOException -> L115
        r2.close();     // Catch: IOException -> L110
    L81:
        return r1213;
    L83:
        if (r0.length != 1) goto L90;
        byte r1214 = r0[0];     // Catch: Throwable -> L13 IOException -> L115
        if (r1214 < 0) goto L90;
        if (r1214 > 1) goto L90;
        String r02 = new String(new char[]{(char) (r1214 + 48)});     // Catch: Throwable -> L13 IOException -> L115
        r2.close();     // Catch: IOException -> L111
    L89:
        return r02;
    L90:
        String r1215 = new String(r0, C0238Fg.f765L);     // Catch: Throwable -> L13 IOException -> L115
        r2.close();     // Catch: IOException -> L112
    L92:
        return r1215;
    L13:
        th = th;
        r1 = r2;
    L96:
        if (r1 != null) goto L129;
    L98:
        throw th;
    L129:
        r1.close();     // Catch: IOException -> L114
    L99:
        if (r2 != null) goto L121;
    L101:
        return null;
    L121:
        r2.close();     // Catch: IOException -> L116
    L95:
        r2 = null;
    L93:
        th = th;
        goto L96
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("(");
        r0.append(C0238Fg.f755B[this.f157a]);
        r0.append(", data length:");
        return AbstractC0213Ey.m409g(r0, this.f160d.length, ")");
    }

    public C0066Bg(long r1, byte[] r3, int r4, int r5) {
        this.f157a = r4;
        this.f158b = r5;
        this.f159c = r1;
        this.f160d = r3;
    }
}
