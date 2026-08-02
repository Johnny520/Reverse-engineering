package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mt2 {
    public static final long a = rg3.D(14);
    public static final long b = rg3.D(0);
    public static final long c = ju.f;
    public static final l03 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j = ju.b;
        d = j != 16 ? new wu(j) : sn.U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[PHI: r19
  0x0049: PHI (r19v6 sn) = 
  (r19v0 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
  (r19v7 sn)
 binds: [B:6:0x0034, B:35:0x0090, B:44:0x00b0, B:41:0x00a6, B:38:0x009c, B:33:0x0084, B:30:0x007a, B:25:0x006b, B:22:0x0065, B:19:0x005b, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lt2 a(lt2 lt2Var, long j, an anVar, float f, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, xj xjVar, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var, op0 op0Var) {
        sn snVar;
        xj xjVar2;
        op0 op0Var2;
        bq2 bq2Var2;
        long j5;
        l03 wuVar;
        l03 l03Var;
        boolean z;
        gm0 gm0Var2 = gm0Var;
        hm0 hm0Var2 = hm0Var;
        mx2 mx2Var2 = mx2Var;
        String str2 = str;
        long j6 = j3;
        sn snVar2 = sn.U;
        q13[] q13VarArr = p13.b;
        long j7 = j2 & 1095216660480L;
        if (j7 != 0) {
            snVar = snVar2;
            if (!p13.a(j2, lt2Var.b)) {
                xjVar2 = xjVar;
                j5 = j4;
                bq2Var2 = bq2Var;
                op0Var2 = op0Var;
            }
            if (anVar == null) {
                if (anVar instanceof ft2) {
                    long jI0 = rp0.i0(f, ((ft2) anVar).a);
                    wuVar = jI0 != 16 ? new wu(jI0) : snVar;
                } else {
                    if (!(anVar instanceof zp2)) {
                        c80.s();
                        return null;
                    }
                    wuVar = new cn((zp2) anVar, f);
                }
            } else if (j != 16) {
                wuVar = new wu(j);
            }
            l03Var = lt2Var.a;
            l03Var.getClass();
            z = wuVar instanceof cn;
            if (!z && (l03Var instanceof cn)) {
                cn cnVar = (cn) wuVar;
                zp2 zp2Var = cnVar.h;
                float f2 = cnVar.i;
                if (Float.isNaN(f2)) {
                    f2 = ((cn) l03Var).i;
                }
                wuVar = new cn(zp2Var, f2);
            } else if ((z || (l03Var instanceof cn)) && ((!z && (l03Var instanceof cn)) || wuVar.equals(snVar))) {
            }
            if (mx2Var2 == null) {
                mx2Var2 = lt2Var.f;
            }
            long j8 = j7 != 0 ? lt2Var.b : j2;
            im0 im0Var2 = im0Var != null ? lt2Var.c : im0Var;
            if (gm0Var2 == null) {
                gm0Var2 = lt2Var.d;
            }
            if (hm0Var2 == null) {
                hm0Var2 = lt2Var.e;
            }
            if (str2 == null) {
                str2 = lt2Var.g;
            }
            if ((j6 & 1095216660480L) == 0) {
                j6 = lt2Var.h;
            }
            if (xjVar2 == null) {
                xjVar2 = lt2Var.i;
            }
            long j9 = j8;
            m03 m03Var2 = m03Var != null ? lt2Var.j : m03Var;
            kc1 kc1Var2 = kc1Var != null ? lt2Var.k : kc1Var;
            if (j5 == 16) {
                j5 = lt2Var.l;
            }
            m03 m03Var3 = m03Var2;
            gz2 gz2Var2 = gz2Var != null ? lt2Var.m : gz2Var;
            if (bq2Var2 == null) {
                bq2Var2 = lt2Var.n;
            }
            return new lt2(wuVar, j9, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, xjVar2, m03Var3, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.o : op0Var2);
        }
        snVar = snVar2;
        if ((anVar != null || j == 16 || ju.c(j, lt2Var.a.b())) && ((gm0Var2 == null || gm0Var2.equals(lt2Var.d)) && ((im0Var == null || im0Var.equals(lt2Var.c)) && ((mx2Var2 == null || mx2Var2 == lt2Var.f) && (((j6 & 1095216660480L) == 0 || p13.a(j6, lt2Var.h)) && ((gz2Var == null || gz2Var.equals(lt2Var.m)) && t11.l(anVar, lt2Var.a.k()) && ((anVar == null || f == lt2Var.a.a()) && ((hm0Var2 == null || hm0Var2.equals(lt2Var.e)) && (str2 == null || str2.equals(lt2Var.g)))))))))) {
            if (xjVar != null) {
                xjVar2 = xjVar;
                if (xjVar2.equals(lt2Var.i)) {
                }
                if (anVar == null) {
                }
                l03Var = lt2Var.a;
                l03Var.getClass();
                z = wuVar instanceof cn;
                if (!z) {
                    wuVar = z ? l03Var : l03Var;
                }
                if (mx2Var2 == null) {
                }
                if (j7 != 0) {
                }
                if (im0Var != null) {
                }
                if (gm0Var2 == null) {
                }
                if (hm0Var2 == null) {
                }
                if (str2 == null) {
                }
                if ((j6 & 1095216660480L) == 0) {
                }
                if (xjVar2 == null) {
                }
                long j92 = j8;
                if (m03Var != null) {
                }
                if (kc1Var != null) {
                }
                if (j5 == 16) {
                }
                m03 m03Var32 = m03Var2;
                if (gz2Var != null) {
                }
                if (bq2Var2 == null) {
                }
                return new lt2(wuVar, j92, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, xjVar2, m03Var32, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.o : op0Var2);
            }
            xjVar2 = xjVar;
            if (m03Var == null || m03Var.equals(lt2Var.j)) {
                if (kc1Var == null || kc1Var.equals(lt2Var.k)) {
                    j5 = j4;
                    if (j5 == 16 || ju.c(j5, lt2Var.l)) {
                        bq2Var2 = bq2Var;
                        if (bq2Var2 == null || bq2Var2.equals(lt2Var.n)) {
                            op0Var2 = op0Var;
                            if (op0Var2 == null || op0Var2.equals(lt2Var.o)) {
                                return lt2Var;
                            }
                        }
                    }
                    op0Var2 = op0Var;
                }
                bq2Var2 = bq2Var;
                op0Var2 = op0Var;
            }
            if (anVar == null) {
            }
            l03Var = lt2Var.a;
            l03Var.getClass();
            z = wuVar instanceof cn;
            if (!z) {
            }
            if (mx2Var2 == null) {
            }
            if (j7 != 0) {
            }
            if (im0Var != null) {
            }
            if (gm0Var2 == null) {
            }
            if (hm0Var2 == null) {
            }
            if (str2 == null) {
            }
            if ((j6 & 1095216660480L) == 0) {
            }
            if (xjVar2 == null) {
            }
            long j922 = j8;
            if (m03Var != null) {
            }
            if (kc1Var != null) {
            }
            if (j5 == 16) {
            }
            m03 m03Var322 = m03Var2;
            if (gz2Var != null) {
            }
            if (bq2Var2 == null) {
            }
            return new lt2(wuVar, j922, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, xjVar2, m03Var322, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.o : op0Var2);
        }
        j5 = j4;
        bq2Var2 = bq2Var;
        op0Var2 = op0Var;
        if (anVar == null) {
        }
        l03Var = lt2Var.a;
        l03Var.getClass();
        z = wuVar instanceof cn;
        if (!z) {
        }
        if (mx2Var2 == null) {
        }
        if (j7 != 0) {
        }
        if (im0Var != null) {
        }
        if (gm0Var2 == null) {
        }
        if (hm0Var2 == null) {
        }
        if (str2 == null) {
        }
        if ((j6 & 1095216660480L) == 0) {
        }
        if (xjVar2 == null) {
        }
        long j9222 = j8;
        if (m03Var != null) {
        }
        if (kc1Var != null) {
        }
        if (j5 == 16) {
        }
        m03 m03Var3222 = m03Var2;
        if (gz2Var != null) {
        }
        if (bq2Var2 == null) {
        }
        return new lt2(wuVar, j9222, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, xjVar2, m03Var3222, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.o : op0Var2);
    }
}
