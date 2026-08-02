package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements Closeable {

    /* JADX INFO: renamed from: k */
    public static final Logger f10970k;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0549on f10971h;

    /* JADX INFO: renamed from: i */
    public final sv0 f10972i;

    /* JADX INFO: renamed from: j */
    public final zu0 f10973j;

    static {
        Logger logger = Logger.getLogger(jv0.class.getName());
        logger.getClass();
        f10970k = logger;
    }

    public tv0(o52 o52Var) {
        o52Var.getClass();
        this.f10971h = o52Var;
        sv0 sv0Var = new sv0(o52Var);
        this.f10972i = sv0Var;
        this.f10973j = new zu0(sv0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0232, code lost:
    
        p000.c80.m678v(p000.vi0.m5688g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5438b(boolean z, C0867x0 c0867x0) throws Exception {
        int iM5504l;
        Object[] array;
        try {
            this.f10971h.mo1695x(9L);
            iM5504l = ug3.m5504l(this.f10971h);
        } catch (EOFException unused) {
        }
        if (iM5504l > 16384) {
            c80.m678v(vi0.m5688g("FRAME_SIZE_ERROR: ", iM5504l));
            return false;
        }
        int i = this.f10971h.readByte() & 255;
        byte b = this.f10971h.readByte();
        int i2 = b & 255;
        int i3 = this.f10971h.readInt();
        int i4 = Integer.MAX_VALUE & i3;
        int i5 = 1;
        if (i != 8) {
            Logger logger = f10970k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jv0.m2580b(true, i4, iM5504l, i, i2));
            }
        }
        if (z && i != 4) {
            c80.m679w("Expected a SETTINGS frame but was ", jv0.m2579a(i));
            return false;
        }
        cg0 cg0Var = null;
        switch (i) {
            case 0:
                m5439c(c0867x0, iM5504l, i2, i4);
                return true;
            case 1:
                m5441g(c0867x0, iM5504l, i2, i4);
                return true;
            case 2:
                if (iM5504l != 5) {
                    c80.m678v(hk1.m2208g(iM5504l, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i4 == 0) {
                    c80.m678v("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                InterfaceC0549on interfaceC0549on = this.f10971h;
                interfaceC0549on.readInt();
                interfaceC0549on.readByte();
                return true;
            case 3:
                if (iM5504l != 4) {
                    c80.m678v(hk1.m2208g(iM5504l, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i4 == 0) {
                    c80.m678v("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int i6 = this.f10971h.readInt();
                cg0.f1521i.getClass();
                cg0[] cg0VarArrValues = cg0.values();
                int length = cg0VarArrValues.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        cg0 cg0Var2 = cg0VarArrValues[i7];
                        if (cg0Var2.f1529h == i6) {
                            cg0Var = cg0Var2;
                        } else {
                            i7++;
                        }
                    }
                }
                if (cg0Var == null) {
                    c80.m678v(vi0.m5688g("TYPE_RST_STREAM unexpected error code: ", i6));
                    return false;
                }
                qv0 qv0Var = (qv0) c0867x0.f12748j;
                if (i4 != 0 && (i3 & 1) == 0) {
                    hy2.m2234b(qv0Var.f9194p, qv0Var.f9188j + '[' + i4 + "] onReset", new mv0(qv0Var, i4, cg0Var, i5));
                    return true;
                }
                xv0 xv0VarM4283e = qv0Var.m4283e(i4);
                if (xv0VarM4283e != null) {
                    synchronized (xv0VarM4283e) {
                        if (xv0VarM4283e.m6187f() == null) {
                            xv0VarM4283e.f13192s = cg0Var;
                            xv0VarM4283e.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                InterfaceC0549on interfaceC0549on2 = this.f10971h;
                if (i4 != 0) {
                    c80.m678v("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((b & 1) != 0) {
                    if (iM5504l != 0) {
                        c80.m678v("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iM5504l % 6 != 0) {
                    c80.m678v(vi0.m5688g("TYPE_SETTINGS length % 6 != 0: ", iM5504l));
                    return false;
                }
                xp2 xp2Var = new xp2();
                a11 a11VarM798W = ci0.m798W(ci0.m799X(0, iM5504l), 6);
                int i8 = a11VarM798W.f25h;
                int i9 = a11VarM798W.f26i;
                int i10 = a11VarM798W.f27j;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (true) {
                        short s = interfaceC0549on2.readShort();
                        byte[] bArr = ug3.f11300a;
                        int i11 = s & 65535;
                        int i12 = interfaceC0549on2.readInt();
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                }
                            } else if (i12 < 0) {
                                c80.m678v("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (i12 != 0 && i12 != 1) {
                            c80.m678v("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        xp2Var.m6171b(i11, i12);
                        if (i8 != i9) {
                            i8 += i10;
                        }
                        break;
                    }
                }
                qv0 qv0Var2 = (qv0) c0867x0.f12748j;
                hy2.m2234b(qv0Var2.f9193o, hk1.m2211j(new StringBuilder(), qv0Var2.f9188j, " applyAndAckSettings"), new C0640r1(20, c0867x0, xp2Var));
                return true;
            case 5:
                m5442h(c0867x0, iM5504l, i2, i4);
                return true;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (iM5504l != 8) {
                    c80.m678v(vi0.m5688g("TYPE_PING length != 8: ", iM5504l));
                    return false;
                }
                if (i4 != 0) {
                    c80.m678v("TYPE_PING streamId != 0");
                    return false;
                }
                final int i13 = this.f10971h.readInt();
                final int i14 = this.f10971h.readInt();
                i = (b & 1) != 0 ? 1 : 0;
                qv0 qv0Var3 = (qv0) c0867x0.f12748j;
                if (i == 0) {
                    hy2 hy2Var = qv0Var3.f9193o;
                    String strM2211j = hk1.m2211j(new StringBuilder(), ((qv0) c0867x0.f12748j).f9188j, " ping");
                    final qv0 qv0Var4 = (qv0) c0867x0.f12748j;
                    hy2.m2234b(hy2Var, strM2211j, new xm0() { // from class: pv0
                        @Override // p000.xm0
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            qv0 qv0Var5 = qv0Var4;
                            try {
                                qv0Var5.f9183D.m6352j(i13, i14, true);
                            } catch (IOException e) {
                                cg0 cg0Var3 = cg0.PROTOCOL_ERROR;
                                qv0Var5.m4281b(cg0Var3, cg0Var3, e);
                            }
                            return a83.f116a;
                        }
                    });
                    return true;
                }
                synchronized (qv0Var3) {
                    try {
                        if (i13 == 1) {
                            qv0Var3.f9197s++;
                        } else if (i13 == 2) {
                            qv0Var3.f9199u++;
                        } else if (i13 == 3) {
                            qv0Var3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (iM5504l < 8) {
                    c80.m678v(vi0.m5688g("TYPE_GOAWAY length < 8: ", iM5504l));
                    return false;
                }
                if (i4 != 0) {
                    c80.m678v("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int i15 = this.f10971h.readInt();
                int i16 = this.f10971h.readInt();
                int i17 = iM5504l - 8;
                cg0.f1521i.getClass();
                cg0[] cg0VarArrValues2 = cg0.values();
                int length2 = cg0VarArrValues2.length;
                int i18 = 0;
                while (true) {
                    if (i18 < length2) {
                        cg0 cg0Var3 = cg0VarArrValues2[i18];
                        if (cg0Var3.f1529h == i16) {
                            cg0Var = cg0Var3;
                        } else {
                            i18++;
                        }
                    }
                }
                if (cg0Var == null) {
                    c80.m678v(vi0.m5688g("TYPE_GOAWAY unexpected error code: ", i16));
                    return false;
                }
                C0505no c0505noMo1678f = C0505no.f7266k;
                if (i17 > 0) {
                    c0505noMo1678f = this.f10971h.mo1678f(i17);
                }
                c0505noMo1678f.getClass();
                c0505noMo1678f.mo3322a();
                qv0 qv0Var5 = (qv0) c0867x0.f12748j;
                synchronized (qv0Var5) {
                    array = qv0Var5.f9187i.values().toArray(new xv0[0]);
                    qv0Var5.f9191m = true;
                }
                xv0[] xv0VarArr = (xv0[]) array;
                int length3 = xv0VarArr.length;
                while (i < length3) {
                    xv0 xv0Var = xv0VarArr[i];
                    if (xv0Var.f13181h > i15 && xv0Var.m6188g()) {
                        cg0 cg0Var4 = cg0.REFUSED_STREAM;
                        synchronized (xv0Var) {
                            if (xv0Var.m6187f() == null) {
                                xv0Var.f13192s = cg0Var4;
                                xv0Var.notifyAll();
                            }
                        }
                        ((qv0) c0867x0.f12748j).m4283e(xv0Var.f13181h);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iM5504l != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM5504l);
                    }
                    long j = ((long) this.f10971h.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = f10970k;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(jv0.m2581c(true, i4, iM5504l, j));
                    }
                    qv0 qv0Var6 = (qv0) c0867x0.f12748j;
                    if (i4 == 0) {
                        synchronized (qv0Var6) {
                            qv0Var6.f9181B += j;
                            qv0Var6.notifyAll();
                        }
                        return true;
                    }
                    xv0 xv0VarM4282c = qv0Var6.m4282c(i4);
                    if (xv0VarM4282c != null) {
                        synchronized (xv0VarM4282c) {
                            xv0VarM4282c.f13185l += j;
                            if (j > 0) {
                                xv0VarM4282c.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    f10970k.fine(jv0.m2580b(true, i4, iM5504l, 8, i2));
                    throw e;
                }
            default:
                this.f10971h.skip(iM5504l);
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r9.m6190i(p000.js0.f5193i, true);
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5439c(C0867x0 c0867x0, int i, int i2, final int i3) throws IOException {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            c80.m678v("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
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
            c80.m678v("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f10971h.readByte();
            byte[] bArr = ug3.f11300a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        final int iM1856D = gf1.m1856D(i, i2, i4);
        InterfaceC0549on interfaceC0549on = this.f10971h;
        interfaceC0549on.getClass();
        final qv0 qv0Var = (qv0) c0867x0.f12748j;
        if (!((i3 == 0 || (i3 & 1) != 0) ? false : z)) {
            xv0 xv0VarM4282c = qv0Var.m4282c(i3);
            if (xv0VarM4282c != null) {
                TimeZone timeZone = wg3.f12507a;
                vv0 vv0Var = xv0VarM4282c.f13188o;
                long j = iM1856D;
                vv0Var.getClass();
                long j2 = j;
                while (true) {
                    xv0 xv0Var = vv0Var.f12187m;
                    if (j2 <= 0) {
                        TimeZone timeZone2 = wg3.f12507a;
                        xv0Var.f13182i.m4285h(j);
                        vv0Var.f12187m.f13182i.f9201w.getClass();
                        break;
                    }
                    synchronized (xv0Var) {
                        z2 = vv0Var.f12183i;
                        z3 = vv0Var.f12185k.f3068i + j2 > vv0Var.f12182h;
                    }
                    if (z3) {
                        interfaceC0549on.skip(j2);
                        vv0Var.f12187m.m6186e(cg0.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        interfaceC0549on.skip(j2);
                        break;
                    }
                    long jMo891n = interfaceC0549on.mo891n(vv0Var.f12184j, j2);
                    if (jMo891n == -1) {
                        throw new EOFException();
                    }
                    j2 -= jMo891n;
                    xv0 xv0Var2 = vv0Var.f12187m;
                    synchronized (xv0Var2) {
                        try {
                            if (vv0Var.f12186l) {
                                vv0Var.f12184j.m1679g();
                            } else {
                                C0209fn c0209fn = vv0Var.f12185k;
                                boolean z5 = c0209fn.f3068i == 0;
                                c0209fn.m1669D(vv0Var.f12184j);
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
                ((qv0) c0867x0.f12748j).m4287k(i3, cg0.PROTOCOL_ERROR);
                long j3 = iM1856D;
                ((qv0) c0867x0.f12748j).m4285h(j3);
                interfaceC0549on.skip(j3);
            }
        } else {
            final C0209fn c0209fn2 = new C0209fn();
            long j4 = iM1856D;
            interfaceC0549on.mo1695x(j4);
            interfaceC0549on.mo891n(c0209fn2, j4);
            hy2.m2234b(qv0Var.f9194p, qv0Var.f9188j + '[' + i3 + "] onData", new xm0(i3, c0209fn2, iM1856D, z4) { // from class: lv0

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f6336i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C0209fn f6337j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ int f6338k;

                @Override // p000.xm0
                /* JADX INFO: renamed from: a */
                public final Object mo6a() {
                    qv0 qv0Var2 = this.f6335h;
                    int i5 = this.f6336i;
                    C0209fn c0209fn3 = this.f6337j;
                    int i6 = this.f6338k;
                    try {
                        qv0Var2.f9196r.getClass();
                        c0209fn3.skip(i6);
                        qv0Var2.f9183D.m6353k(i5, cg0.CANCEL);
                        synchronized (qv0Var2) {
                            qv0Var2.f9185F.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return a83.f116a;
                }
            });
        }
        this.f10971h.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10971h.close();
    }

    /* JADX INFO: renamed from: e */
    public final List m5440e(int i, int i2, int i3, int i4) throws IOException {
        sv0 sv0Var = this.f10972i;
        sv0Var.f10382k = i;
        sv0Var.f10383l = i2;
        sv0Var.f10380i = i3;
        sv0Var.f10381j = i4;
        zu0 zu0Var = this.f10973j;
        o52 o52Var = zu0Var.f14103d;
        while (!o52Var.m3509b()) {
            byte b = o52Var.readByte();
            byte[] bArr = ug3.f11300a;
            int i5 = b & 255;
            if (i5 == 128) {
                c80.m678v("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM6510f = zu0Var.m6510f(i5, 127);
                int i6 = iM6510f - 1;
                if (i6 >= 0) {
                    gs0[] gs0VarArr = bv0.f1041a;
                    if (i6 <= gs0VarArr.length - 1) {
                        zu0Var.m6505a(gs0VarArr[i6]);
                    }
                }
                int length = zu0Var.f14105f + 1 + (i6 - bv0.f1041a.length);
                if (length >= 0) {
                    gs0[] gs0VarArr2 = zu0Var.f14104e;
                    if (length < gs0VarArr2.length) {
                        gs0 gs0Var = gs0VarArr2[length];
                        gs0Var.getClass();
                        zu0Var.m6505a(gs0Var);
                    }
                }
                c80.m678v(vi0.m5688g("Header index too large ", iM6510f));
                return null;
            }
            if (i5 == 64) {
                gs0[] gs0VarArr3 = bv0.f1041a;
                C0505no c0505noM6509e = zu0Var.m6509e();
                bv0.m597a(c0505noM6509e);
                zu0Var.m6508d(new gs0(c0505noM6509e, zu0Var.m6509e()));
            } else if ((b & 64) == 64) {
                zu0Var.m6508d(new gs0(zu0Var.m6507c(zu0Var.m6510f(i5, 63) - 1), zu0Var.m6509e()));
            } else if ((b & 32) == 32) {
                int iM6510f2 = zu0Var.m6510f(i5, 31);
                zu0Var.f14100a = iM6510f2;
                if (iM6510f2 < 0 || iM6510f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + zu0Var.f14100a);
                }
                int i7 = zu0Var.f14107h;
                if (iM6510f2 < i7) {
                    if (iM6510f2 == 0) {
                        gs0[] gs0VarArr4 = zu0Var.f14104e;
                        AbstractC0460mg.m3094i0(gs0VarArr4, 0, gs0VarArr4.length);
                        zu0Var.f14105f = zu0Var.f14104e.length - 1;
                        zu0Var.f14106g = 0;
                        zu0Var.f14107h = 0;
                    } else {
                        zu0Var.m6506b(i7 - iM6510f2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                gs0[] gs0VarArr5 = bv0.f1041a;
                C0505no c0505noM6509e2 = zu0Var.m6509e();
                bv0.m597a(c0505noM6509e2);
                zu0Var.m6505a(new gs0(c0505noM6509e2, zu0Var.m6509e()));
            } else {
                zu0Var.m6505a(new gs0(zu0Var.m6507c(zu0Var.m6510f(i5, 15) - 1), zu0Var.m6509e()));
            }
        }
        ArrayList arrayList = zu0Var.f14101b;
        List listM1148F0 = AbstractC0142du.m1148F0(arrayList);
        arrayList.clear();
        zu0Var.f14102c = 0L;
        return listM1148F0;
    }

    /* JADX INFO: renamed from: g */
    public final void m5441g(C0867x0 c0867x0, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            c80.m678v("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f10971h.readByte();
            byte[] bArr = ug3.f11300a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC0549on interfaceC0549on = this.f10971h;
            interfaceC0549on.readInt();
            interfaceC0549on.readByte();
            byte[] bArr2 = ug3.f11300a;
            i -= 5;
        }
        List listM5440e = m5440e(gf1.m1856D(i, i2, i4), i4, i2, i3);
        qv0 qv0Var = (qv0) c0867x0.f12748j;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            hy2.m2234b(qv0Var.f9194p, qv0Var.f9188j + '[' + i3 + "] onHeaders", new mv0(qv0Var, i3, listM5440e, z2));
            return;
        }
        synchronized (qv0Var) {
            xv0 xv0VarM4282c = qv0Var.m4282c(i3);
            if (xv0VarM4282c != null) {
                xv0VarM4282c.m6190i(wg3.m5894g(listM5440e), z2);
                return;
            }
            if (qv0Var.f9191m) {
                return;
            }
            if (i3 <= qv0Var.f9189k) {
                return;
            }
            if (i3 % 2 == qv0Var.f9190l % 2) {
                return;
            }
            xv0 xv0Var = new xv0(i3, qv0Var, false, z2, wg3.m5894g(listM5440e));
            qv0Var.f9189k = i3;
            qv0Var.f9187i.put(Integer.valueOf(i3), xv0Var);
            hy2.m2234b(qv0Var.f9192n.m2421d(), qv0Var.f9188j + '[' + i3 + "] onStream", new C0640r1(19, qv0Var, xv0Var));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5442h(C0867x0 c0867x0, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            c80.m678v("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.f10971h.readByte();
            byte[] bArr = ug3.f11300a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.f10971h.readInt() & Integer.MAX_VALUE;
        List listM5440e = m5440e(gf1.m1856D(i - 4, i2, i4), i4, i2, i3);
        qv0 qv0Var = (qv0) c0867x0.f12748j;
        synchronized (qv0Var) {
            if (qv0Var.f9185F.contains(Integer.valueOf(i6))) {
                qv0Var.m4287k(i6, cg0.PROTOCOL_ERROR);
                return;
            }
            qv0Var.f9185F.add(Integer.valueOf(i6));
            hy2.m2234b(qv0Var.f9194p, qv0Var.f9188j + '[' + i6 + "] onRequest", new mv0(qv0Var, i6, listM5440e, i5));
        }
    }
}
