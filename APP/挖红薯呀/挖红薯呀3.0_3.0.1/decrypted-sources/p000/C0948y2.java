package p000;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948y2 implements InterfaceC0312i9, pb1 {

    /* JADX INFO: renamed from: d */
    public Object f7491d;

    /* JADX INFO: renamed from: e */
    public Object f7492e;

    /* JADX INFO: renamed from: f */
    public Object f7493f;

    /* JADX INFO: renamed from: g */
    public Object f7494g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0948y2(Typeface typeface, ge0 ge0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f7494g = typeface;
        this.f7491d = ge0Var;
        this.f7493f = new he0(1024);
        int iM925a = ge0Var.m925a(6);
        if (iM925a != 0) {
            int i5 = iM925a + ge0Var.f1420d;
            i = ((ByteBuffer) ge0Var.f1423g).getInt(((ByteBuffer) ge0Var.f1423g).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f7492e = new char[i * 2];
        int iM925a2 = ge0Var.m925a(6);
        if (iM925a2 != 0) {
            int i6 = iM925a2 + ge0Var.f1420d;
            i2 = ((ByteBuffer) ge0Var.f1423g).getInt(((ByteBuffer) ge0Var.f1423g).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            y91 y91Var = new y91(this, i7);
            fe0 fe0VarM5225b = y91Var.m5225b();
            int iM925a3 = fe0VarM5225b.m925a(4);
            Character.toChars(iM925a3 != 0 ? ((ByteBuffer) fe0VarM5225b.f1423g).getInt(iM925a3 + fe0VarM5225b.f1420d) : 0, (char[]) this.f7492e, i7 * 2);
            fe0 fe0VarM5225b2 = y91Var.m5225b();
            int iM925a4 = fe0VarM5225b2.m925a(16);
            if (iM925a4 != 0) {
                int i8 = iM925a4 + fe0VarM5225b2.f1420d;
                i3 = ((ByteBuffer) fe0VarM5225b2.f1423g).getInt(((ByteBuffer) fe0VarM5225b2.f1423g).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                C0921xc.m5131l("invalid metadata codepoint length");
                throw null;
            }
            he0 he0Var = (he0) this.f7493f;
            fe0 fe0VarM5225b3 = y91Var.m5225b();
            int iM925a5 = fe0VarM5225b3.m925a(16);
            if (iM925a5 != 0) {
                int i9 = iM925a5 + fe0VarM5225b3.f1420d;
                i4 = ((ByteBuffer) fe0VarM5225b3.f1423g).getInt(((ByteBuffer) fe0VarM5225b3.f1423g).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            he0Var.m1300a(y91Var, 0, i4 - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: b */
    public long mo2487b(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        int iMo27b = abstractC0046b8.mo27b();
        long jMax = 0;
        for (int i = 0; i < iMo27b; i++) {
            jMax = Math.max(jMax, ((InterfaceC0082c8) this.f7491d).get(i).mo972d(abstractC0046b8.mo26a(i), abstractC0046b82.mo26a(i), abstractC0046b83.mo26a(i)));
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x0199 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:150:0x00d2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:164:0x01a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:167:0x0154 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0154 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:172:0x01a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:176:0x00c9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x00c0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [oe0] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [oe0] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [sh0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [oe0] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [oe0] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5204d(long j, long j2, AbstractC0358jk abstractC0358jk) {
        bj0 bj0Var;
        int i;
        gj0 gj0Var;
        long j3;
        gj0 gj0Var2;
        h91 h91Var;
        mj0 mj0Var;
        h91 h91Var2;
        mj0 mj0Var2;
        ?? sh0Var;
        ?? M3050f;
        int i2;
        if (abstractC0358jk instanceof bj0) {
            bj0Var = (bj0) abstractC0358jk;
            int i3 = bj0Var.f521i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bj0Var.f521i = i3 - Integer.MIN_VALUE;
            } else {
                bj0Var = new bj0(this, abstractC0358jk);
            }
        }
        bj0 bj0Var2 = bj0Var;
        Object obj = bj0Var2.f519g;
        int i4 = bj0Var2.f521i;
        Object obj2 = null;
        if (i4 == 0) {
            w60.m4891M(obj);
            gj0 gj0Var3 = (gj0) this.f7491d;
            int i5 = 262144;
            if (gj0Var3 == null || !gj0Var3.f4542q) {
                i = 262144;
                gj0Var = null;
            } else {
                if (!gj0Var3.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = gj0Var3.f4529d.f4533h;
                b60 b60VarM3039Q = pf1.m3039Q(gj0Var3);
                loop0: while (true) {
                    if (b60VarM3039Q == null) {
                        h91Var2 = null;
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & i5) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & i5) != 0) {
                                ?? r14 = obj2;
                                ?? r13 = oe0Var;
                                while (r13 != 0) {
                                    if (r13 instanceof h91) {
                                        h91Var2 = (h91) r13;
                                        if (p30.m3002l(gj0Var3.mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        if ((r13.f4531f & i5) != 0 && (r13 instanceof AbstractC0731sm)) {
                                            oe0 oe0Var2 = ((AbstractC0731sm) r13).f5782s;
                                            int i6 = 0;
                                            M3050f = r13;
                                            sh0Var = r14;
                                            while (oe0Var2 != null) {
                                                int i7 = i5;
                                                if ((oe0Var2.f4531f & i7) != 0) {
                                                    i6++;
                                                    sh0Var = sh0Var;
                                                    if (i6 == 1) {
                                                        M3050f = oe0Var2;
                                                    } else {
                                                        if (sh0Var == 0) {
                                                            sh0Var = new sh0(new oe0[16]);
                                                        }
                                                        if (M3050f != 0) {
                                                            sh0Var.m4072b(M3050f);
                                                            M3050f = 0;
                                                        }
                                                        sh0Var.m4072b(oe0Var2);
                                                    }
                                                }
                                                oe0Var2 = oe0Var2.f4534i;
                                                i5 = i7;
                                                M3050f = M3050f;
                                                sh0Var = sh0Var;
                                            }
                                            i2 = i5;
                                            sh0Var = sh0Var;
                                            if (i6 == 1) {
                                            }
                                            i5 = i2;
                                            r13 = M3050f;
                                            r14 = sh0Var;
                                        }
                                        M3050f = pf1.m3050f(sh0Var);
                                        i5 = i2;
                                        r13 = M3050f;
                                        r14 = sh0Var;
                                    }
                                    i2 = i5;
                                    sh0Var = r14;
                                    M3050f = pf1.m3050f(sh0Var);
                                    i5 = i2;
                                    r13 = M3050f;
                                    r14 = sh0Var;
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                            i5 = i5;
                            obj2 = null;
                        }
                    }
                    int i8 = i5;
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var2 = b60VarM3039Q.f395I) == null) ? null : mj0Var2.f3997e;
                    i5 = i8;
                    obj2 = null;
                }
                i = i5;
                gj0Var = (gj0) h91Var2;
            }
            j3 = 0;
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (gj0Var == null) {
                gj0 gj0Var4 = (gj0) this.f7492e;
                if (gj0Var4 != null) {
                    bj0Var2.f521i = 1;
                    Object objMo178R = gj0Var4.mo178R(j, j2, bj0Var2);
                    if (objMo178R != enumC1007zk) {
                        obj = objMo178R;
                        j3 = ((rb1) obj).f5348a;
                    }
                    return enumC1007zk;
                }
            } else {
                gj0 gj0Var5 = (gj0) this.f7491d;
                if (gj0Var5 == null || !gj0Var5.f4542q) {
                    gj0Var2 = null;
                } else {
                    if (!gj0Var5.f4529d.f4542q) {
                        w10.m4824b("visitAncestors called on an unattached node");
                    }
                    oe0 oe0Var3 = gj0Var5.f4529d.f4533h;
                    b60 b60VarM3039Q2 = pf1.m3039Q(gj0Var5);
                    loop3: while (true) {
                        if (b60VarM3039Q2 == null) {
                            h91Var = null;
                            break;
                        }
                        if ((b60VarM3039Q2.f395I.f3998f.f4532g & i) != 0) {
                            while (oe0Var3 != null) {
                                if ((oe0Var3.f4531f & i) != 0) {
                                    ?? M3050f2 = oe0Var3;
                                    ?? sh0Var2 = 0;
                                    while (M3050f2 != 0) {
                                        if (M3050f2 instanceof h91) {
                                            h91 h91Var3 = (h91) M3050f2;
                                            if (p30.m3002l(gj0Var5.mo1247k(), h91Var3.mo1247k()) && gj0.class == h91Var3.getClass()) {
                                                h91Var = h91Var3;
                                                break loop3;
                                            }
                                        } else if ((M3050f2.f4531f & i) != 0 && (M3050f2 instanceof AbstractC0731sm)) {
                                            oe0 oe0Var4 = ((AbstractC0731sm) M3050f2).f5782s;
                                            int i9 = 0;
                                            M3050f2 = M3050f2;
                                            sh0Var2 = sh0Var2;
                                            while (oe0Var4 != null) {
                                                if ((oe0Var4.f4531f & i) != 0) {
                                                    i9++;
                                                    sh0Var2 = sh0Var2;
                                                    if (i9 == 1) {
                                                        M3050f2 = oe0Var4;
                                                    } else {
                                                        if (sh0Var2 == 0) {
                                                            sh0Var2 = new sh0(new oe0[16]);
                                                        }
                                                        if (M3050f2 != 0) {
                                                            sh0Var2.m4072b(M3050f2);
                                                            M3050f2 = 0;
                                                        }
                                                        sh0Var2.m4072b(oe0Var4);
                                                    }
                                                }
                                                oe0Var4 = oe0Var4.f4534i;
                                                M3050f2 = M3050f2;
                                                sh0Var2 = sh0Var2;
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        M3050f2 = pf1.m3050f(sh0Var2);
                                    }
                                }
                                oe0Var3 = oe0Var3.f4533h;
                            }
                        }
                        b60VarM3039Q2 = b60VarM3039Q2.m315v();
                        oe0Var3 = (b60VarM3039Q2 == null || (mj0Var = b60VarM3039Q2.f395I) == null) ? null : mj0Var.f3997e;
                    }
                    gj0Var2 = (gj0) h91Var;
                }
                if (gj0Var2 != null) {
                    bj0Var2.f521i = 2;
                    Object objMo178R2 = gj0Var2.mo178R(j, j2, bj0Var2);
                    if (objMo178R2 != enumC1007zk) {
                        obj = objMo178R2;
                        j3 = ((rb1) obj).f5348a;
                    }
                    return enumC1007zk;
                }
            }
        } else if (i4 == 1) {
            w60.m4891M(obj);
            j3 = ((rb1) obj).f5348a;
        } else {
            if (i4 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
            j3 = ((rb1) obj).f5348a;
        }
        return new rb1(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        if (((AbstractC0046b8) this.f7493f) == null) {
            this.f7493f = abstractC0046b83.mo28c();
        }
        AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) this.f7493f;
        if (abstractC0046b84 == null) {
            p30.m2986V("velocityVector");
            throw null;
        }
        int iMo27b = abstractC0046b84.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b85 = (AbstractC0046b8) this.f7493f;
            if (i >= iMo27b) {
                if (abstractC0046b85 != null) {
                    return abstractC0046b85;
                }
                p30.m2986V("velocityVector");
                throw null;
            }
            if (abstractC0046b85 == null) {
                p30.m2986V("velocityVector");
                throw null;
            }
            abstractC0046b85.mo30e(((InterfaceC0082c8) this.f7491d).get(i).mo971c(j, abstractC0046b8.mo26a(i), abstractC0046b82.mo26a(i), abstractC0046b83.mo26a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x00aa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x00b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0063 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x0063 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x00b3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v10, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5205f(long j, AbstractC0358jk abstractC0358jk) {
        cj0 cj0Var;
        long j2;
        mj0 mj0Var;
        if (abstractC0358jk instanceof cj0) {
            cj0Var = (cj0) abstractC0358jk;
            int i = cj0Var.f830i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj0Var.f830i = i - Integer.MIN_VALUE;
            } else {
                cj0Var = new cj0(this, abstractC0358jk);
            }
        }
        Object objMo177O = cj0Var.f828g;
        int i2 = cj0Var.f830i;
        gj0 gj0Var = null;
        h91 h91Var = null;
        gj0Var = null;
        if (i2 == 0) {
            w60.m4891M(objMo177O);
            gj0 gj0Var2 = (gj0) this.f7491d;
            if (gj0Var2 != null && gj0Var2.f4542q) {
                if (!gj0Var2.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = gj0Var2.f4529d.f4533h;
                b60 b60VarM3039Q = pf1.m3039Q(gj0Var2);
                loop0: while (true) {
                    if (b60VarM3039Q == null) {
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 262144) != 0) {
                                ?? M3050f = oe0Var;
                                ?? sh0Var = 0;
                                while (M3050f != 0) {
                                    if (M3050f instanceof h91) {
                                        h91 h91Var2 = (h91) M3050f;
                                        if (p30.m3002l(gj0Var2.mo1247k(), h91Var2.mo1247k()) && gj0.class == h91Var2.getClass()) {
                                            h91Var = h91Var2;
                                            break loop0;
                                        }
                                    } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                        oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                        int i3 = 0;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                        while (oe0Var2 != null) {
                                            if ((oe0Var2.f4531f & 262144) != 0) {
                                                i3++;
                                                sh0Var = sh0Var;
                                                if (i3 == 1) {
                                                    M3050f = oe0Var2;
                                                } else {
                                                    if (sh0Var == 0) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (M3050f != 0) {
                                                        sh0Var.m4072b(M3050f);
                                                        M3050f = 0;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                            oe0Var2 = oe0Var2.f4534i;
                                            M3050f = M3050f;
                                            sh0Var = sh0Var;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    M3050f = pf1.m3050f(sh0Var);
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                }
                gj0Var = (gj0) h91Var;
            }
            if (gj0Var == null) {
                j2 = 0;
                return new rb1(j2);
            }
            cj0Var.f830i = 1;
            objMo177O = gj0Var.mo177O(j, cj0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objMo177O == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(objMo177O);
        }
        j2 = ((rb1) objMo177O).f5348a;
        return new rb1(j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        if (((AbstractC0046b8) this.f7492e) == null) {
            this.f7492e = abstractC0046b8.mo28c();
        }
        AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) this.f7492e;
        if (abstractC0046b84 == null) {
            p30.m2986V("valueVector");
            throw null;
        }
        int iMo27b = abstractC0046b84.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b85 = (AbstractC0046b8) this.f7492e;
            if (i >= iMo27b) {
                if (abstractC0046b85 != null) {
                    return abstractC0046b85;
                }
                p30.m2986V("valueVector");
                throw null;
            }
            if (abstractC0046b85 == null) {
                p30.m2986V("valueVector");
                throw null;
            }
            abstractC0046b85.mo30e(((InterfaceC0082c8) this.f7491d).get(i).mo970b(j, abstractC0046b8.mo26a(i), abstractC0046b82.mo26a(i), abstractC0046b83.mo26a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: i */
    public AbstractC0046b8 mo2488i(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        if (((AbstractC0046b8) this.f7494g) == null) {
            this.f7494g = abstractC0046b83.mo28c();
        }
        AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) this.f7494g;
        if (abstractC0046b84 == null) {
            p30.m2986V("endVelocityVector");
            throw null;
        }
        int iMo27b = abstractC0046b84.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b85 = (AbstractC0046b8) this.f7494g;
            if (i >= iMo27b) {
                if (abstractC0046b85 != null) {
                    return abstractC0046b85;
                }
                p30.m2986V("endVelocityVector");
                throw null;
            }
            if (abstractC0046b85 == null) {
                p30.m2986V("endVelocityVector");
                throw null;
            }
            abstractC0046b85.mo30e(((InterfaceC0082c8) this.f7491d).get(i).mo973e(abstractC0046b8.mo26a(i), abstractC0046b82.mo26a(i), abstractC0046b83.mo26a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public AbstractC0046b8 m5206j(AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82) {
        C0948y2 c0948y2 = this;
        if (((AbstractC0046b8) c0948y2.f7494g) == null) {
            c0948y2.f7494g = abstractC0046b8.mo28c();
        }
        AbstractC0046b8 abstractC0046b83 = (AbstractC0046b8) c0948y2.f7494g;
        if (abstractC0046b83 == null) {
            p30.m2986V("targetVector");
            throw null;
        }
        int iMo27b = abstractC0046b83.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) c0948y2.f7494g;
            if (i >= iMo27b) {
                if (abstractC0046b84 != null) {
                    return abstractC0046b84;
                }
                p30.m2986V("targetVector");
                throw null;
            }
            if (abstractC0046b84 == null) {
                p30.m2986V("targetVector");
                throw null;
            }
            C0910x1 c0910x1 = (C0910x1) c0948y2.f7491d;
            float fMo26a = abstractC0046b8.mo26a(i);
            float fMo26a2 = abstractC0046b82.mo26a(i);
            C0031au c0031au = (C0031au) c0910x1.f7232e;
            double dM210b = c0031au.m210b(fMo26a2);
            double d = AbstractC0068bu.f588a;
            float f = c0031au.f265a * c0031au.f266b;
            abstractC0046b84.mo30e((Math.signum(fMo26a2) * ((float) (Math.exp((d / (d - 1.0d)) * dM210b) * ((double) f)))) + fMo26a, i);
            i++;
            c0948y2 = this;
            iMo27b = iMo27b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public AbstractC0046b8 m5207k(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82) {
        if (((AbstractC0046b8) this.f7493f) == null) {
            this.f7493f = abstractC0046b8.mo28c();
        }
        AbstractC0046b8 abstractC0046b83 = (AbstractC0046b8) this.f7493f;
        if (abstractC0046b83 == null) {
            p30.m2986V("velocityVector");
            throw null;
        }
        int iMo27b = abstractC0046b83.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) this.f7493f;
            if (i >= iMo27b) {
                if (abstractC0046b84 != null) {
                    return abstractC0046b84;
                }
                p30.m2986V("velocityVector");
                throw null;
            }
            if (abstractC0046b84 == null) {
                p30.m2986V("velocityVector");
                throw null;
            }
            C0910x1 c0910x1 = (C0910x1) this.f7491d;
            abstractC0046b8.getClass();
            long j2 = j / 1000000;
            C1016zt c1016ztM209a = ((C0031au) c0910x1.f7232e).m209a(abstractC0046b82.mo26a(i));
            long j3 = c1016ztM209a.f7994c;
            abstractC0046b84.mo30e((((Math.signum(c1016ztM209a.f7992a) * AbstractC0538o5.m2787a(j3 > 0 ? j2 / j3 : 1.0f).f4180b) * c1016ztM209a.f7993b) / j3) * 1000.0f, i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public qc1 m5208l(C0352je c0352je, String str) {
        qc1 qc1Var;
        boolean zIsInstance;
        qc1 qc1VarMo2959a;
        synchronized (((jo0) this.f7494g)) {
            try {
                vc1 vc1Var = (vc1) this.f7491d;
                vc1Var.getClass();
                qc1Var = (qc1) vc1Var.f6661a.get(str);
                Class clsM1928n = c0352je.f2804d;
                clsM1928n.getClass();
                Map map = C0352je.f2803e;
                map.getClass();
                Integer num = (Integer) map.get(clsM1928n);
                if (num != null) {
                    zIsInstance = s91.m4018C(num.intValue(), qc1Var);
                } else {
                    if (clsM1928n.isPrimitive()) {
                        clsM1928n = AbstractC0398kl.m1928n(au0.m211a(clsM1928n));
                    }
                    zIsInstance = clsM1928n.isInstance(qc1Var);
                }
                if (zIsInstance) {
                    tc1 tc1Var = (tc1) this.f7492e;
                    if (tc1Var instanceof ox0) {
                        ox0 ox0Var = (ox0) tc1Var;
                        qc1Var.getClass();
                        s90 s90Var = ox0Var.f4673d;
                        if (s90Var != null) {
                            kx0 kx0Var = ox0Var.f4674e;
                            kx0Var.getClass();
                            g60.m1207f(qc1Var, kx0Var, s90Var);
                        }
                    }
                    qc1Var.getClass();
                } else {
                    rg0 rg0Var = new rg0((AbstractC0176el) this.f7493f);
                    rg0Var.f1481a.put(o30.f4430P, str);
                    tc1 tc1Var2 = (tc1) this.f7492e;
                    try {
                        try {
                            qc1VarMo2959a = tc1Var2.mo1195c(c0352je, rg0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = c0352je.f2804d;
                            cls.getClass();
                            qc1VarMo2959a = tc1Var2.mo2959a(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = c0352je.f2804d;
                        cls2.getClass();
                        qc1VarMo2959a = tc1Var2.mo2960b(cls2, rg0Var);
                    }
                    qc1Var = qc1VarMo2959a;
                    vc1 vc1Var2 = (vc1) this.f7491d;
                    vc1Var2.getClass();
                    qc1Var.getClass();
                    qc1 qc1Var2 = (qc1) vc1Var2.f6661a.put(str, qc1Var);
                    if (qc1Var2 != null) {
                        qc1Var2.m3212a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qc1Var;
    }

    public C0948y2(vc1 vc1Var, tc1 tc1Var, AbstractC0176el abstractC0176el) {
        vc1Var.getClass();
        abstractC0176el.getClass();
        this.f7491d = vc1Var;
        this.f7492e = tc1Var;
        this.f7493f = abstractC0176el;
        this.f7494g = new jo0(19);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [f21.b(f21, ny0, float, float, c21, jk):java.lang.Object, qb1.<init>(float, float, b8):void, ul.m(java.lang.Object):java.lang.Object, y2.<init>(eu):void] */
    public /* synthetic */ C0948y2(Object obj) {
        this.f7491d = obj;
    }

    public C0948y2() {
        this.f7493f = new C0310i7(6, this);
    }

    public C0948y2(InterfaceC0185eu interfaceC0185eu) {
        this(new qb1(interfaceC0185eu));
    }
}
