package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements Closeable {
    public static final Logger k;
    public final on h;
    public final sv0 i;
    public final zu0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger = Logger.getLogger(jv0.class.getName());
        logger.getClass();
        k = logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tv0(o52 o52Var) {
        o52Var.getClass();
        this.h = o52Var;
        sv0 sv0Var = new sv0(o52Var);
        this.i = sv0Var;
        this.j = new zu0(sv0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0232, code lost:
    
        defpackage.c80.v(defpackage.vi0.g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(boolean z, x0 x0Var) throws Exception {
        int iL;
        Object[] array;
        try {
            this.h.x(9L);
            iL = ug3.l(this.h);
        } catch (EOFException unused) {
        }
        if (iL > 16384) {
            c80.v(vi0.g("FRAME_SIZE_ERROR: ", iL));
            return false;
        }
        int i = this.h.readByte() & 255;
        byte b = this.h.readByte();
        int i2 = b & 255;
        int i3 = this.h.readInt();
        int i4 = Integer.MAX_VALUE & i3;
        int i5 = 1;
        if (i != 8) {
            Logger logger = k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jv0.b(true, i4, iL, i, i2));
            }
        }
        if (z && i != 4) {
            c80.w("Expected a SETTINGS frame but was ", jv0.a(i));
            return false;
        }
        cg0 cg0Var = null;
        switch (i) {
            case 0:
                c(x0Var, iL, i2, i4);
                return true;
            case 1:
                g(x0Var, iL, i2, i4);
                return true;
            case 2:
                if (iL != 5) {
                    c80.v(hk1.g(iL, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i4 == 0) {
                    c80.v("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                on onVar = this.h;
                onVar.readInt();
                onVar.readByte();
                return true;
            case 3:
                if (iL != 4) {
                    c80.v(hk1.g(iL, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i4 == 0) {
                    c80.v("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int i6 = this.h.readInt();
                cg0.i.getClass();
                cg0[] cg0VarArrValues = cg0.values();
                int length = cg0VarArrValues.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        cg0 cg0Var2 = cg0VarArrValues[i7];
                        if (cg0Var2.h == i6) {
                            cg0Var = cg0Var2;
                        } else {
                            i7++;
                        }
                    }
                }
                if (cg0Var == null) {
                    c80.v(vi0.g("TYPE_RST_STREAM unexpected error code: ", i6));
                    return false;
                }
                qv0 qv0Var = (qv0) x0Var.j;
                if (i4 != 0 && (i3 & 1) == 0) {
                    hy2.b(qv0Var.p, qv0Var.j + '[' + i4 + "] onReset", new mv0(qv0Var, i4, cg0Var, i5));
                    return true;
                }
                xv0 xv0VarE = qv0Var.e(i4);
                if (xv0VarE != null) {
                    synchronized (xv0VarE) {
                        if (xv0VarE.f() == null) {
                            xv0VarE.s = cg0Var;
                            xv0VarE.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                on onVar2 = this.h;
                if (i4 != 0) {
                    c80.v("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((b & 1) != 0) {
                    if (iL != 0) {
                        c80.v("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iL % 6 != 0) {
                    c80.v(vi0.g("TYPE_SETTINGS length % 6 != 0: ", iL));
                    return false;
                }
                xp2 xp2Var = new xp2();
                a11 a11VarW = ci0.W(ci0.X(0, iL), 6);
                int i8 = a11VarW.h;
                int i9 = a11VarW.i;
                int i10 = a11VarW.j;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (true) {
                        short s = onVar2.readShort();
                        byte[] bArr = ug3.a;
                        int i11 = s & 65535;
                        int i12 = onVar2.readInt();
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                }
                            } else if (i12 < 0) {
                                c80.v("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (i12 != 0 && i12 != 1) {
                            c80.v("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        xp2Var.b(i11, i12);
                        if (i8 != i9) {
                            i8 += i10;
                        }
                        break;
                    }
                }
                qv0 qv0Var2 = (qv0) x0Var.j;
                hy2.b(qv0Var2.o, hk1.j(new StringBuilder(), qv0Var2.j, " applyAndAckSettings"), new r1(20, x0Var, xp2Var));
                return true;
            case 5:
                h(x0Var, iL, i2, i4);
                return true;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (iL != 8) {
                    c80.v(vi0.g("TYPE_PING length != 8: ", iL));
                    return false;
                }
                if (i4 != 0) {
                    c80.v("TYPE_PING streamId != 0");
                    return false;
                }
                final int i13 = this.h.readInt();
                final int i14 = this.h.readInt();
                i = (b & 1) != 0 ? 1 : 0;
                qv0 qv0Var3 = (qv0) x0Var.j;
                if (i == 0) {
                    hy2 hy2Var = qv0Var3.o;
                    String strJ = hk1.j(new StringBuilder(), ((qv0) x0Var.j).j, " ping");
                    final qv0 qv0Var4 = (qv0) x0Var.j;
                    hy2.b(hy2Var, strJ, new xm0() { // from class: pv0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.xm0
                        public final Object a() {
                            qv0 qv0Var5 = qv0Var4;
                            try {
                                qv0Var5.D.j(i13, i14, true);
                            } catch (IOException e) {
                                cg0 cg0Var3 = cg0.PROTOCOL_ERROR;
                                qv0Var5.b(cg0Var3, cg0Var3, e);
                            }
                            return a83.a;
                        }
                    });
                    return true;
                }
                synchronized (qv0Var3) {
                    try {
                        if (i13 == 1) {
                            qv0Var3.s++;
                        } else if (i13 == 2) {
                            qv0Var3.u++;
                        } else if (i13 == 3) {
                            qv0Var3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (iL < 8) {
                    c80.v(vi0.g("TYPE_GOAWAY length < 8: ", iL));
                    return false;
                }
                if (i4 != 0) {
                    c80.v("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int i15 = this.h.readInt();
                int i16 = this.h.readInt();
                int i17 = iL - 8;
                cg0.i.getClass();
                cg0[] cg0VarArrValues2 = cg0.values();
                int length2 = cg0VarArrValues2.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length2) {
                        cg0 cg0Var3 = cg0VarArrValues2[i18];
                        if (cg0Var3.h == i16) {
                            cg0Var = cg0Var3;
                        } else {
                            i18++;
                        }
                    }
                }
                if (cg0Var == null) {
                    c80.v(vi0.g("TYPE_GOAWAY unexpected error code: ", i16));
                    return false;
                }
                no noVarF = no.k;
                if (i17 > 0) {
                    noVarF = this.h.f(i17);
                }
                noVarF.getClass();
                noVarF.a();
                qv0 qv0Var5 = (qv0) x0Var.j;
                synchronized (qv0Var5) {
                    array = qv0Var5.i.values().toArray(new xv0[0]);
                    qv0Var5.m = true;
                }
                xv0[] xv0VarArr = (xv0[]) array;
                int length3 = xv0VarArr.length;
                while (i < length3) {
                    xv0 xv0Var = xv0VarArr[i];
                    if (xv0Var.h > i15 && xv0Var.g()) {
                        cg0 cg0Var4 = cg0.REFUSED_STREAM;
                        synchronized (xv0Var) {
                            if (xv0Var.f() == null) {
                                xv0Var.s = cg0Var4;
                                xv0Var.notifyAll();
                            }
                        }
                        ((qv0) x0Var.j).e(xv0Var.h);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iL != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iL);
                    }
                    long j = ((long) this.h.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = k;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(jv0.c(true, i4, iL, j));
                    }
                    qv0 qv0Var6 = (qv0) x0Var.j;
                    if (i4 == 0) {
                        synchronized (qv0Var6) {
                            qv0Var6.B += j;
                            qv0Var6.notifyAll();
                        }
                        return true;
                    }
                    xv0 xv0VarC = qv0Var6.c(i4);
                    if (xv0VarC != null) {
                        synchronized (xv0VarC) {
                            xv0VarC.l += j;
                            if (j > 0) {
                                xv0VarC.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    k.fine(jv0.b(true, i4, iL, 8, i2));
                    throw e;
                }
            default:
                this.h.skip(iL);
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r9.i(defpackage.js0.i, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(x0 x0Var, int i, int i2, final int i3) throws IOException {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            c80.v("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            c80.v("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.h.readByte();
            byte[] bArr = ug3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        final int iD = gf1.D(i, i2, i4);
        on onVar = this.h;
        onVar.getClass();
        final qv0 qv0Var = (qv0) x0Var.j;
        if (!((i3 == 0 || (i3 & 1) != 0) ? false : z)) {
            xv0 xv0VarC = qv0Var.c(i3);
            if (xv0VarC != null) {
                TimeZone timeZone = wg3.a;
                vv0 vv0Var = xv0VarC.o;
                long j = iD;
                vv0Var.getClass();
                long j2 = j;
                while (true) {
                    xv0 xv0Var = vv0Var.m;
                    if (j2 <= 0) {
                        TimeZone timeZone2 = wg3.a;
                        xv0Var.i.h(j);
                        vv0Var.m.i.w.getClass();
                        break;
                    }
                    synchronized (xv0Var) {
                        z2 = vv0Var.i;
                        z3 = vv0Var.k.i + j2 > vv0Var.h;
                    }
                    if (z3) {
                        onVar.skip(j2);
                        vv0Var.m.e(cg0.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        onVar.skip(j2);
                        break;
                    }
                    long jN = onVar.n(vv0Var.j, j2);
                    if (jN == -1) {
                        throw new EOFException();
                    }
                    j2 -= jN;
                    xv0 xv0Var2 = vv0Var.m;
                    synchronized (xv0Var2) {
                        try {
                            if (vv0Var.l) {
                                vv0Var.j.g();
                            } else {
                                fn fnVar = vv0Var.k;
                                boolean z5 = fnVar.i == 0;
                                fnVar.D(vv0Var.j);
                                if (z5) {
                                    xv0Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                ((qv0) x0Var.j).k(i3, cg0.PROTOCOL_ERROR);
                long j3 = iD;
                ((qv0) x0Var.j).h(j3);
                onVar.skip(j3);
            }
        } else {
            final fn fnVar2 = new fn();
            long j4 = iD;
            onVar.x(j4);
            onVar.n(fnVar2, j4);
            hy2.b(qv0Var.p, qv0Var.j + '[' + i3 + "] onData", new xm0(i3, fnVar2, iD, z4) { // from class: lv0
                public final /* synthetic */ int i;
                public final /* synthetic */ fn j;
                public final /* synthetic */ int k;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.xm0
                public final Object a() {
                    qv0 qv0Var2 = this.h;
                    int i5 = this.i;
                    fn fnVar3 = this.j;
                    int i6 = this.k;
                    try {
                        qv0Var2.r.getClass();
                        fnVar3.skip(i6);
                        qv0Var2.D.k(i5, cg0.CANCEL);
                        synchronized (qv0Var2) {
                            qv0Var2.F.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return a83.a;
                }
            });
        }
        this.h.skip(i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List e(int i, int i2, int i3, int i4) throws IOException {
        sv0 sv0Var = this.i;
        sv0Var.k = i;
        sv0Var.l = i2;
        sv0Var.i = i3;
        sv0Var.j = i4;
        zu0 zu0Var = this.j;
        o52 o52Var = zu0Var.d;
        while (!o52Var.b()) {
            byte b = o52Var.readByte();
            byte[] bArr = ug3.a;
            int i5 = b & 255;
            if (i5 == 128) {
                c80.v("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iF = zu0Var.f(i5, 127);
                int i6 = iF - 1;
                if (i6 >= 0) {
                    gs0[] gs0VarArr = bv0.a;
                    if (i6 <= gs0VarArr.length - 1) {
                        zu0Var.a(gs0VarArr[i6]);
                    }
                }
                int length = zu0Var.f + 1 + (i6 - bv0.a.length);
                if (length >= 0) {
                    gs0[] gs0VarArr2 = zu0Var.e;
                    if (length < gs0VarArr2.length) {
                        gs0 gs0Var = gs0VarArr2[length];
                        gs0Var.getClass();
                        zu0Var.a(gs0Var);
                    }
                }
                c80.v(vi0.g("Header index too large ", iF));
                return null;
            }
            if (i5 == 64) {
                gs0[] gs0VarArr3 = bv0.a;
                no noVarE = zu0Var.e();
                bv0.a(noVarE);
                zu0Var.d(new gs0(noVarE, zu0Var.e()));
            } else if ((b & 64) == 64) {
                zu0Var.d(new gs0(zu0Var.c(zu0Var.f(i5, 63) - 1), zu0Var.e()));
            } else if ((b & 32) == 32) {
                int iF2 = zu0Var.f(i5, 31);
                zu0Var.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + zu0Var.a);
                }
                int i7 = zu0Var.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        gs0[] gs0VarArr4 = zu0Var.e;
                        mg.i0(gs0VarArr4, 0, gs0VarArr4.length);
                        zu0Var.f = zu0Var.e.length - 1;
                        zu0Var.g = 0;
                        zu0Var.h = 0;
                    } else {
                        zu0Var.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                gs0[] gs0VarArr5 = bv0.a;
                no noVarE2 = zu0Var.e();
                bv0.a(noVarE2);
                zu0Var.a(new gs0(noVarE2, zu0Var.e()));
            } else {
                zu0Var.a(new gs0(zu0Var.c(zu0Var.f(i5, 15) - 1), zu0Var.e()));
            }
        }
        ArrayList arrayList = zu0Var.b;
        List listF0 = du.F0(arrayList);
        arrayList.clear();
        zu0Var.c = 0L;
        return listF0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(x0 x0Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            c80.v("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.h.readByte();
            byte[] bArr = ug3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            on onVar = this.h;
            onVar.readInt();
            onVar.readByte();
            byte[] bArr2 = ug3.a;
            i -= 5;
        }
        List listE = e(gf1.D(i, i2, i4), i4, i2, i3);
        qv0 qv0Var = (qv0) x0Var.j;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            hy2.b(qv0Var.p, qv0Var.j + '[' + i3 + "] onHeaders", new mv0(qv0Var, i3, listE, z2));
            return;
        }
        synchronized (qv0Var) {
            xv0 xv0VarC = qv0Var.c(i3);
            if (xv0VarC != null) {
                xv0VarC.i(wg3.g(listE), z2);
                return;
            }
            if (qv0Var.m) {
                return;
            }
            if (i3 <= qv0Var.k) {
                return;
            }
            if (i3 % 2 == qv0Var.l % 2) {
                return;
            }
            xv0 xv0Var = new xv0(i3, qv0Var, false, z2, wg3.g(listE));
            qv0Var.k = i3;
            qv0Var.i.put(Integer.valueOf(i3), xv0Var);
            hy2.b(qv0Var.n.d(), qv0Var.j + '[' + i3 + "] onStream", new r1(19, qv0Var, xv0Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(x0 x0Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            c80.v("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.h.readByte();
            byte[] bArr = ug3.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.h.readInt() & Integer.MAX_VALUE;
        List listE = e(gf1.D(i - 4, i2, i4), i4, i2, i3);
        qv0 qv0Var = (qv0) x0Var.j;
        synchronized (qv0Var) {
            if (qv0Var.F.contains(Integer.valueOf(i6))) {
                qv0Var.k(i6, cg0.PROTOCOL_ERROR);
                return;
            }
            qv0Var.F.add(Integer.valueOf(i6));
            hy2.b(qv0Var.p, qv0Var.j + '[' + i6 + "] onRequest", new mv0(qv0Var, i6, listE, i5));
        }
    }
}
