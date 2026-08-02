package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mt2 {

    /* JADX INFO: renamed from: a */
    public static final long f6831a = rg3.m4450D(14);

    /* JADX INFO: renamed from: b */
    public static final long f6832b = rg3.m4450D(0);

    /* JADX INFO: renamed from: c */
    public static final long f6833c = C0363ju.f5216f;

    /* JADX INFO: renamed from: d */
    public static final l03 f6834d;

    static {
        long j = C0363ju.f5212b;
        f6834d = j != 16 ? new C0860wu(j) : C0700sn.f10217U;
    }

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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lt2 m3209a(lt2 lt2Var, long j, AbstractC0024an abstractC0024an, float f, long j2, im0 im0Var, gm0 gm0Var, hm0 hm0Var, mx2 mx2Var, String str, long j3, C0888xj c0888xj, m03 m03Var, kc1 kc1Var, long j4, gz2 gz2Var, bq2 bq2Var, op0 op0Var) {
        C0700sn c0700sn;
        C0888xj c0888xj2;
        op0 op0Var2;
        bq2 bq2Var2;
        long j5;
        l03 c0860wu;
        l03 l03Var;
        boolean z;
        gm0 gm0Var2 = gm0Var;
        hm0 hm0Var2 = hm0Var;
        mx2 mx2Var2 = mx2Var;
        String str2 = str;
        long j6 = j3;
        C0700sn c0700sn2 = C0700sn.f10217U;
        q13[] q13VarArr = p13.f7927b;
        long j7 = j2 & 1095216660480L;
        if (j7 != 0) {
            c0700sn = c0700sn2;
            if (!p13.m3673a(j2, lt2Var.f6302b)) {
                c0888xj2 = c0888xj;
                j5 = j4;
                bq2Var2 = bq2Var;
                op0Var2 = op0Var;
            }
            if (abstractC0024an == null) {
                if (abstractC0024an instanceof ft2) {
                    long jM4548i0 = rp0.m4548i0(f, ((ft2) abstractC0024an).f3140a);
                    c0860wu = jM4548i0 != 16 ? new C0860wu(jM4548i0) : c0700sn;
                } else {
                    if (!(abstractC0024an instanceof zp2)) {
                        c80.m675s();
                        return null;
                    }
                    c0860wu = new C0097cn((zp2) abstractC0024an, f);
                }
            } else if (j != 16) {
                c0860wu = new C0860wu(j);
            }
            l03Var = lt2Var.f6301a;
            l03Var.getClass();
            z = c0860wu instanceof C0097cn;
            if (!z && (l03Var instanceof C0097cn)) {
                C0097cn c0097cn = (C0097cn) c0860wu;
                zp2 zp2Var = c0097cn.f1625h;
                float f2 = c0097cn.f1626i;
                if (Float.isNaN(f2)) {
                    f2 = ((C0097cn) l03Var).f1626i;
                }
                c0860wu = new C0097cn(zp2Var, f2);
            } else if ((z || (l03Var instanceof C0097cn)) && ((!z && (l03Var instanceof C0097cn)) || c0860wu.equals(c0700sn))) {
            }
            if (mx2Var2 == null) {
                mx2Var2 = lt2Var.f6306f;
            }
            long j8 = j7 != 0 ? lt2Var.f6302b : j2;
            im0 im0Var2 = im0Var != null ? lt2Var.f6303c : im0Var;
            if (gm0Var2 == null) {
                gm0Var2 = lt2Var.f6304d;
            }
            if (hm0Var2 == null) {
                hm0Var2 = lt2Var.f6305e;
            }
            if (str2 == null) {
                str2 = lt2Var.f6307g;
            }
            if ((j6 & 1095216660480L) == 0) {
                j6 = lt2Var.f6308h;
            }
            if (c0888xj2 == null) {
                c0888xj2 = lt2Var.f6309i;
            }
            long j9 = j8;
            m03 m03Var2 = m03Var != null ? lt2Var.f6310j : m03Var;
            kc1 kc1Var2 = kc1Var != null ? lt2Var.f6311k : kc1Var;
            if (j5 == 16) {
                j5 = lt2Var.f6312l;
            }
            m03 m03Var3 = m03Var2;
            gz2 gz2Var2 = gz2Var != null ? lt2Var.f6313m : gz2Var;
            if (bq2Var2 == null) {
                bq2Var2 = lt2Var.f6314n;
            }
            return new lt2(c0860wu, j9, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, c0888xj2, m03Var3, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.f6315o : op0Var2);
        }
        c0700sn = c0700sn2;
        if ((abstractC0024an != null || j == 16 || C0363ju.m2566c(j, lt2Var.f6301a.mo864b())) && ((gm0Var2 == null || gm0Var2.equals(lt2Var.f6304d)) && ((im0Var == null || im0Var.equals(lt2Var.f6303c)) && ((mx2Var2 == null || mx2Var2 == lt2Var.f6306f) && (((j6 & 1095216660480L) == 0 || p13.m3673a(j6, lt2Var.f6308h)) && ((gz2Var == null || gz2Var.equals(lt2Var.f6313m)) && t11.m5086l(abstractC0024an, lt2Var.f6301a.mo865k()) && ((abstractC0024an == null || f == lt2Var.f6301a.mo863a()) && ((hm0Var2 == null || hm0Var2.equals(lt2Var.f6305e)) && (str2 == null || str2.equals(lt2Var.f6307g)))))))))) {
            if (c0888xj != null) {
                c0888xj2 = c0888xj;
                if (c0888xj2.equals(lt2Var.f6309i)) {
                }
                if (abstractC0024an == null) {
                }
                l03Var = lt2Var.f6301a;
                l03Var.getClass();
                z = c0860wu instanceof C0097cn;
                if (!z) {
                    c0860wu = z ? l03Var : l03Var;
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
                if (c0888xj2 == null) {
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
                return new lt2(c0860wu, j92, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, c0888xj2, m03Var32, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.f6315o : op0Var2);
            }
            c0888xj2 = c0888xj;
            if (m03Var == null || m03Var.equals(lt2Var.f6310j)) {
                if (kc1Var == null || kc1Var.equals(lt2Var.f6311k)) {
                    j5 = j4;
                    if (j5 == 16 || C0363ju.m2566c(j5, lt2Var.f6312l)) {
                        bq2Var2 = bq2Var;
                        if (bq2Var2 == null || bq2Var2.equals(lt2Var.f6314n)) {
                            op0Var2 = op0Var;
                            if (op0Var2 == null || op0Var2.equals(lt2Var.f6315o)) {
                                return lt2Var;
                            }
                        }
                    }
                    op0Var2 = op0Var;
                }
                bq2Var2 = bq2Var;
                op0Var2 = op0Var;
            }
            if (abstractC0024an == null) {
            }
            l03Var = lt2Var.f6301a;
            l03Var.getClass();
            z = c0860wu instanceof C0097cn;
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
            if (c0888xj2 == null) {
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
            return new lt2(c0860wu, j922, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, c0888xj2, m03Var322, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.f6315o : op0Var2);
        }
        j5 = j4;
        bq2Var2 = bq2Var;
        op0Var2 = op0Var;
        if (abstractC0024an == null) {
        }
        l03Var = lt2Var.f6301a;
        l03Var.getClass();
        z = c0860wu instanceof C0097cn;
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
        if (c0888xj2 == null) {
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
        return new lt2(c0860wu, j9222, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j6, c0888xj2, m03Var3222, kc1Var2, j5, gz2Var2, bq2Var2, op0Var2 != null ? lt2Var.f6315o : op0Var2);
    }
}
