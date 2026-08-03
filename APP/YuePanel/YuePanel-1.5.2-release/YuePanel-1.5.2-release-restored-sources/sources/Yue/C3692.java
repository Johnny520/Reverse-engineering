package Yue;

import Yue.C4128;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3692 extends AbstractC8432 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public ArrayList<AbstractC8432> f6530;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f6531;

    public C3692(C4128 c4128, int i) {
        super(c4128);
        this.f6530 = new ArrayList<>();
        this.f25273 = i;
        m10136();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f25273 == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<AbstractC8432> it = this.f6530.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5 A[PHI: r1 r22 r23 r24
  0x01d5: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]
  0x01d5: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01d3, B:110:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    @Override // Yue.AbstractC8432, Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo767(InterfaceC4369 interfaceC4369) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        float f2;
        int iMax;
        int i13;
        int i14;
        if (this.f25275.f8958 && this.f25276.f8958) {
            C4128 c4128M11876 = this.f3497.m11876();
            boolean zM11998 = (c4128M11876 == null || !(c4128M11876 instanceof C4129)) ? false : ((C4129) c4128M11876).m11998();
            int i15 = this.f25276.f8955 - this.f25275.f8955;
            int size = this.f6530.size();
            int i16 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i16 >= size) {
                    i16 = -1;
                    break;
                } else if (this.f6530.get(i16).f3497.m11890() != 8) {
                    break;
                } else {
                    i16++;
                }
            }
            int i17 = size - 1;
            int i18 = i17;
            while (true) {
                if (i18 < 0) {
                    break;
                }
                if (this.f6530.get(i18).f3497.m11890() != 8) {
                    i = i18;
                    break;
                }
                i18--;
            }
            int i19 = 0;
            while (i19 < 2) {
                int i20 = 0;
                i4 = 0;
                i5 = 0;
                int i21 = 0;
                f = 0.0f;
                while (i20 < size) {
                    AbstractC8432 abstractC8432 = this.f6530.get(i20);
                    if (abstractC8432.f3497.m11890() != i2) {
                        i21++;
                        if (i20 > 0 && i20 >= i16) {
                            i4 += abstractC8432.f25275.f8954;
                        }
                        C4401 c4401 = abstractC8432.f25272;
                        int i22 = c4401.f8955;
                        boolean z3 = abstractC8432.f25271 != C4128.EnumC0339.MATCH_CONSTRAINT;
                        if (z3) {
                            int i23 = this.f25273;
                            if (i23 == 0 && !abstractC8432.f3497.f8355.f25272.f8958) {
                                return;
                            }
                            if (i23 == 1 && !abstractC8432.f3497.f8356.f25272.f8958) {
                                return;
                            } else {
                                i13 = i22;
                            }
                        } else {
                            i13 = i22;
                            if (abstractC8432.f3496 == 1 && i19 == 0) {
                                i14 = c4401.f9074;
                                i5++;
                            } else if (c4401.f8958) {
                                i14 = i13;
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                float f3 = abstractC8432.f3497.f8434[this.f25273];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i14;
                            }
                            if (i20 >= i17 && i20 < i) {
                                i4 += -abstractC8432.f25276.f8954;
                            }
                        }
                        i14 = i13;
                        if (z3) {
                        }
                        if (i20 >= i17) {
                        }
                    }
                    i20++;
                    i2 = 8;
                }
                if (i4 < i15 || i5 == 0) {
                    i3 = i21;
                    break;
                } else {
                    i19++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i24 = this.f25275.f8955;
            if (zM11998) {
                i24 = this.f25276.f8955;
            }
            if (i4 > i15) {
                i24 = zM11998 ? i24 + ((int) (((i4 - i15) / 2.0f) + 0.5f)) : i24 - ((int) (((i4 - i15) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f4 = i15 - i4;
                int i25 = (int) ((f4 / i5) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    AbstractC8432 abstractC84322 = this.f6530.get(i26);
                    int i28 = i25;
                    int i29 = i4;
                    if (abstractC84322.f3497.m11890() != 8 && abstractC84322.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT) {
                        C4401 c44012 = abstractC84322.f25272;
                        if (c44012.f8958) {
                            z2 = zM11998;
                            i12 = i3;
                            i10 = i24;
                            f2 = f4;
                        } else {
                            if (f > 0.0f) {
                                i10 = i24;
                                i11 = (int) (((abstractC84322.f3497.f8434[this.f25273] * f4) / f) + 0.5f);
                            } else {
                                i10 = i24;
                                i11 = i28;
                            }
                            if (this.f25273 == 0) {
                                C4128 c4128 = abstractC84322.f3497;
                                f2 = f4;
                                int i30 = c4128.f8370;
                                z2 = zM11998;
                                i12 = i3;
                                iMax = Math.max(c4128.f8369, abstractC84322.f3496 == 1 ? Math.min(i11, c44012.f9074) : i11);
                                if (i30 > 0) {
                                    iMax = Math.min(i30, iMax);
                                }
                                if (iMax != i11) {
                                    i27++;
                                    i11 = iMax;
                                }
                                abstractC84322.f25272.mo12660(i11);
                            } else {
                                z2 = zM11998;
                                i12 = i3;
                                f2 = f4;
                                C4128 c41282 = abstractC84322.f3497;
                                int i31 = c41282.f8373;
                                iMax = Math.max(c41282.f8372, abstractC84322.f3496 == 1 ? Math.min(i11, c44012.f9074) : i11);
                                if (i31 > 0) {
                                    iMax = Math.min(i31, iMax);
                                }
                                if (iMax != i11) {
                                }
                                abstractC84322.f25272.mo12660(i11);
                            }
                        }
                    }
                    i26++;
                    i25 = i28;
                    i4 = i29;
                    i24 = i10;
                    f4 = f2;
                    zM11998 = z2;
                    i3 = i12;
                }
                z = zM11998;
                i6 = i3;
                i7 = i24;
                int i32 = i4;
                if (i27 > 0) {
                    i5 -= i27;
                    i4 = 0;
                    for (int i33 = 0; i33 < size; i33++) {
                        AbstractC8432 abstractC84323 = this.f6530.get(i33);
                        if (abstractC84323.f3497.m11890() != 8) {
                            if (i33 > 0 && i33 >= i16) {
                                i4 += abstractC84323.f25275.f8954;
                            }
                            i4 += abstractC84323.f25272.f8955;
                            if (i33 < i17 && i33 < i) {
                                i4 += -abstractC84323.f25276.f8954;
                            }
                        }
                    }
                } else {
                    i4 = i32;
                }
                i9 = 2;
                if (this.f6531 == 2 && i27 == 0) {
                    i8 = 0;
                    this.f6531 = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z = zM11998;
                i6 = i3;
                i7 = i24;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i15) {
                this.f6531 = i9;
            }
            if (i6 > 0 && i5 == 0 && i16 == i) {
                this.f6531 = i9;
            }
            int i34 = this.f6531;
            if (i34 == 1) {
                int i35 = i6;
                int i36 = i35 > 1 ? (i15 - i4) / (i35 - 1) : i35 == 1 ? (i15 - i4) / 2 : i8;
                if (i5 > 0) {
                    i36 = i8;
                }
                int i37 = i7;
                for (int i38 = i8; i38 < size; i38++) {
                    AbstractC8432 abstractC84324 = this.f6530.get(z ? size - (i38 + 1) : i38);
                    if (abstractC84324.f3497.m11890() == 8) {
                        abstractC84324.f25275.mo12660(i37);
                        abstractC84324.f25276.mo12660(i37);
                    } else {
                        if (i38 > 0) {
                            i37 = z ? i37 - i36 : i37 + i36;
                        }
                        if (i38 > 0 && i38 >= i16) {
                            i37 = z ? i37 - abstractC84324.f25275.f8954 : i37 + abstractC84324.f25275.f8954;
                        }
                        if (z) {
                            abstractC84324.f25276.mo12660(i37);
                        } else {
                            abstractC84324.f25275.mo12660(i37);
                        }
                        C4401 c44013 = abstractC84324.f25272;
                        int i39 = c44013.f8955;
                        if (abstractC84324.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT && abstractC84324.f3496 == 1) {
                            i39 = c44013.f9074;
                        }
                        i37 = z ? i37 - i39 : i37 + i39;
                        if (z) {
                            abstractC84324.f25275.mo12660(i37);
                        } else {
                            abstractC84324.f25276.mo12660(i37);
                        }
                        abstractC84324.f25274 = true;
                        if (i38 < i17 && i38 < i) {
                            i37 = z ? i37 - (-abstractC84324.f25276.f8954) : i37 + (-abstractC84324.f25276.f8954);
                        }
                    }
                }
                return;
            }
            int i40 = i6;
            if (i34 == 0) {
                int i41 = (i15 - i4) / (i40 + 1);
                if (i5 > 0) {
                    i41 = i8;
                }
                int i42 = i7;
                for (int i43 = i8; i43 < size; i43++) {
                    AbstractC8432 abstractC84325 = this.f6530.get(z ? size - (i43 + 1) : i43);
                    if (abstractC84325.f3497.m11890() == 8) {
                        abstractC84325.f25275.mo12660(i42);
                        abstractC84325.f25276.mo12660(i42);
                    } else {
                        int i44 = z ? i42 - i41 : i42 + i41;
                        if (i43 > 0 && i43 >= i16) {
                            i44 = z ? i44 - abstractC84325.f25275.f8954 : i44 + abstractC84325.f25275.f8954;
                        }
                        if (z) {
                            abstractC84325.f25276.mo12660(i44);
                        } else {
                            abstractC84325.f25275.mo12660(i44);
                        }
                        C4401 c44014 = abstractC84325.f25272;
                        int iMin = c44014.f8955;
                        if (abstractC84325.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT && abstractC84325.f3496 == 1) {
                            iMin = Math.min(iMin, c44014.f9074);
                        }
                        i42 = z ? i44 - iMin : i44 + iMin;
                        if (z) {
                            abstractC84325.f25275.mo12660(i42);
                        } else {
                            abstractC84325.f25276.mo12660(i42);
                        }
                        if (i43 < i17 && i43 < i) {
                            i42 = z ? i42 - (-abstractC84325.f25276.f8954) : i42 + (-abstractC84325.f25276.f8954);
                        }
                    }
                }
                return;
            }
            if (i34 == 2) {
                float fM11860 = this.f25273 == 0 ? this.f3497.m11860() : this.f3497.m11885();
                if (z) {
                    fM11860 = 1.0f - fM11860;
                }
                int i45 = (int) (((i15 - i4) * fM11860) + 0.5f);
                if (i45 < 0 || i5 > 0) {
                    i45 = i8;
                }
                int i46 = z ? i7 - i45 : i7 + i45;
                for (int i47 = i8; i47 < size; i47++) {
                    AbstractC8432 abstractC84326 = this.f6530.get(z ? size - (i47 + 1) : i47);
                    if (abstractC84326.f3497.m11890() == 8) {
                        abstractC84326.f25275.mo12660(i46);
                        abstractC84326.f25276.mo12660(i46);
                    } else {
                        if (i47 > 0 && i47 >= i16) {
                            i46 = z ? i46 - abstractC84326.f25275.f8954 : i46 + abstractC84326.f25275.f8954;
                        }
                        if (z) {
                            abstractC84326.f25276.mo12660(i46);
                        } else {
                            abstractC84326.f25275.mo12660(i46);
                        }
                        C4401 c44015 = abstractC84326.f25272;
                        int i48 = c44015.f8955;
                        if (abstractC84326.f25271 == C4128.EnumC0339.MATCH_CONSTRAINT && abstractC84326.f3496 == 1) {
                            i48 = c44015.f9074;
                        }
                        i46 = z ? i46 - i48 : i46 + i48;
                        if (z) {
                            abstractC84326.f25275.mo12660(i46);
                        } else {
                            abstractC84326.f25276.mo12660(i46);
                        }
                        if (i47 < i17 && i47 < i) {
                            i46 = z ? i46 - (-abstractC84326.f25276.f8954) : i46 + (-abstractC84326.f25276.f8954);
                        }
                    }
                }
            }
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo10130() {
        Iterator<AbstractC8432> it = this.f6530.iterator();
        while (it.hasNext()) {
            it.next().mo10130();
        }
        int size = this.f6530.size();
        if (size < 1) {
            return;
        }
        C4128 c4128 = this.f6530.get(0).f3497;
        C4128 c41282 = this.f6530.get(size - 1).f3497;
        if (this.f25273 == 0) {
            C4125 c4125 = c4128.f8386;
            C4125 c41252 = c41282.f8388;
            C4371 c4371M28214 = m28214(c4125, 0);
            int iM11763 = c4125.m11763();
            C4128 c4128M10137 = m10137();
            if (c4128M10137 != null) {
                iM11763 = c4128M10137.f8386.m11763();
            }
            if (c4371M28214 != null) {
                m4414(this.f25275, c4371M28214, iM11763);
            }
            C4371 c4371M282142 = m28214(c41252, 0);
            int iM117632 = c41252.m11763();
            C4128 c4128M10138 = m10138();
            if (c4128M10138 != null) {
                iM117632 = c4128M10138.f8388.m11763();
            }
            if (c4371M282142 != null) {
                m4414(this.f25276, c4371M282142, -iM117632);
            }
        } else {
            C4125 c41253 = c4128.f8387;
            C4125 c41254 = c41282.f8389;
            C4371 c4371M282143 = m28214(c41253, 1);
            int iM117633 = c41253.m11763();
            C4128 c4128M101372 = m10137();
            if (c4128M101372 != null) {
                iM117633 = c4128M101372.f8387.m11763();
            }
            if (c4371M282143 != null) {
                m4414(this.f25275, c4371M282143, iM117633);
            }
            C4371 c4371M282144 = m28214(c41254, 1);
            int iM117634 = c41254.m11763();
            C4128 c4128M101382 = m10138();
            if (c4128M101382 != null) {
                iM117634 = c4128M101382.f8389.m11763();
            }
            if (c4371M282144 != null) {
                m4414(this.f25276, c4371M282144, -iM117634);
            }
        }
        this.f25275.f846 = this;
        this.f25276.f846 = this;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo10131() {
        for (int i = 0; i < this.f6530.size(); i++) {
            this.f6530.get(i).mo10131();
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo10132() {
        this.f25270 = null;
        Iterator<AbstractC8432> it = this.f6530.iterator();
        while (it.hasNext()) {
            it.next().mo10132();
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public long mo10133() {
        int size = this.f6530.size();
        long jMo10133 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC8432 abstractC8432 = this.f6530.get(i);
            jMo10133 = jMo10133 + ((long) abstractC8432.f25275.f8954) + abstractC8432.mo10133() + ((long) abstractC8432.f25276.f8954);
        }
        return jMo10133;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo10134() {
        this.f25275.f8958 = false;
        this.f25276.f8958 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean mo10135() {
        int size = this.f6530.size();
        for (int i = 0; i < size; i++) {
            if (!this.f6530.get(i).mo10135()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m10136() {
        C4128 c4128;
        C4128 c41282 = this.f3497;
        C4128 c4128M11877 = c41282.m11877(this.f25273);
        while (true) {
            C4128 c41283 = c4128M11877;
            c4128 = c41282;
            c41282 = c41283;
            if (c41282 == null) {
                break;
            } else {
                c4128M11877 = c41282.m11877(this.f25273);
            }
        }
        this.f3497 = c4128;
        this.f6530.add(c4128.m11882(this.f25273));
        C4128 c4128M11873 = c4128.m11873(this.f25273);
        while (c4128M11873 != null) {
            this.f6530.add(c4128M11873.m11882(this.f25273));
            c4128M11873 = c4128M11873.m11873(this.f25273);
        }
        for (AbstractC8432 abstractC8432 : this.f6530) {
            int i = this.f25273;
            if (i == 0) {
                abstractC8432.f3497.f8353 = this;
            } else if (i == 1) {
                abstractC8432.f3497.f8354 = this;
            }
        }
        if (this.f25273 == 0 && ((C4129) this.f3497.m11876()).m11998() && this.f6530.size() > 1) {
            ArrayList<AbstractC8432> arrayList = this.f6530;
            this.f3497 = arrayList.get(arrayList.size() - 1).f3497;
        }
        this.f6531 = this.f25273 == 0 ? this.f3497.m11862() : this.f3497.m11887();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C4128 m10137() {
        for (int i = 0; i < this.f6530.size(); i++) {
            AbstractC8432 abstractC8432 = this.f6530.get(i);
            if (abstractC8432.f3497.m11890() != 8) {
                return abstractC8432.f3497;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final C4128 m10138() {
        for (int size = this.f6530.size() - 1; size >= 0; size--) {
            AbstractC8432 abstractC8432 = this.f6530.get(size);
            if (abstractC8432.f3497.m11890() != 8) {
                return abstractC8432.f3497;
            }
        }
        return null;
    }
}
