package yyds;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛵᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0859 extends C0944 {

    /* JADX INFO: renamed from: ᛲᛱᛵᛱ, reason: contains not printable characters */
    public boolean f3931;

    /* JADX INFO: renamed from: ᛳᛵᛶᲀ, reason: contains not printable characters */
    public int f3932;

    /* JADX INFO: renamed from: ᛳᛷᛶᛵ, reason: contains not printable characters */
    public WeakReference f3933;

    /* JADX INFO: renamed from: ᛴᲇᛵᛸ, reason: contains not printable characters */
    public final C0390 f3934;

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public final C1491 f3935;

    /* JADX INFO: renamed from: ᛵᛸᲈᛷ, reason: contains not printable characters */
    public boolean f3936;

    /* JADX INFO: renamed from: ᛶᛵᛸᛳ, reason: contains not printable characters */
    public C1093[] f3937;

    /* JADX INFO: renamed from: ᛶᛷᛶᛲ, reason: contains not printable characters */
    public int f3938;

    /* JADX INFO: renamed from: ᛶᛸᛱᲁ, reason: contains not printable characters */
    public final C2296 f3939;

    /* JADX INFO: renamed from: ᛷᛶᛱᛸ, reason: contains not printable characters */
    public WeakReference f3940;

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public int f3941;

    /* JADX INFO: renamed from: ᛸᲇᛴᲀ, reason: contains not printable characters */
    public boolean f3942;

    /* JADX INFO: renamed from: ᲀᲇᛱᛲ, reason: contains not printable characters */
    public int f3943;

    /* JADX INFO: renamed from: ᲀᲇᛶᲈ, reason: contains not printable characters */
    public C1093[] f3944;

    /* JADX INFO: renamed from: ᲁᛸᛲᲈ, reason: contains not printable characters */
    public WeakReference f3945;

    /* JADX INFO: renamed from: ᲁᲀᛱᛴ, reason: contains not printable characters */
    public C2594 f3946;

    /* JADX INFO: renamed from: ᲁᲁᛵ, reason: contains not printable characters */
    public int f3947;

    /* JADX INFO: renamed from: ᲇᛳᛱ, reason: contains not printable characters */
    public WeakReference f3948;

    /* JADX INFO: renamed from: ᲈᛵᛶᛲ, reason: contains not printable characters */
    public final HashSet f3949;

    /* JADX INFO: renamed from: ᲈᲁᛵᛶ, reason: contains not printable characters */
    public int f3950;

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public ArrayList f3930 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public final C0644 f3929 = new C0644(this);

    public C0859() {
        C1491 c1491 = new C1491();
        c1491.f7038 = true;
        c1491.f7039 = true;
        c1491.f7037 = new ArrayList();
        new ArrayList();
        c1491.f7040 = null;
        c1491.f7036 = new C0390();
        c1491.f7042 = new ArrayList();
        c1491.f7041 = this;
        c1491.f7043 = this;
        this.f3935 = c1491;
        this.f3946 = null;
        this.f3942 = false;
        this.f3939 = new C2296();
        this.f3943 = 0;
        this.f3950 = 0;
        this.f3944 = new C1093[4];
        this.f3937 = new C1093[4];
        this.f3938 = 257;
        this.f3931 = false;
        this.f3936 = false;
        this.f3948 = null;
        this.f3945 = null;
        this.f3933 = null;
        this.f3940 = null;
        this.f3949 = new HashSet();
        this.f3934 = new C0390();
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static void m1946(C0944 c0944, C2594 c2594, C0390 c0390) {
        int i;
        int i2;
        if (c2594 == null) {
            return;
        }
        int i3 = c0944.f20;
        int[] iArr = c0944.f4356;
        if (i3 == 8 || (c0944 instanceof C2076) || (c0944 instanceof C0411)) {
            c0390.f2013 = 0;
            c0390.f2019 = 0;
            return;
        }
        int[] iArr2 = c0944.f4401;
        c0390.f2014 = iArr2[0];
        c0390.f2015 = iArr2[1];
        c0390.f2018 = c0944.m2072();
        c0390.f2020 = c0944.m2067();
        c0390.f2012 = false;
        c0390.f2017 = 0;
        boolean z = c0390.f2014 == 3;
        boolean z2 = c0390.f2015 == 3;
        boolean z3 = z && c0944.f4359 > 0.0f;
        boolean z4 = z2 && c0944.f4359 > 0.0f;
        if (z && c0944.m2073(0) && c0944.f4363 == 0 && !z3) {
            c0390.f2014 = 2;
            if (z2 && c0944.f4389 == 0) {
                c0390.f2014 = 1;
            }
            z = false;
        }
        if (z2 && c0944.m2073(1) && c0944.f4389 == 0 && !z4) {
            c0390.f2015 = 2;
            if (z && c0944.f4363 == 0) {
                c0390.f2015 = 1;
            }
            z2 = false;
        }
        if (c0944.mo1172()) {
            c0390.f2014 = 1;
            z = false;
        }
        if (c0944.mo1168()) {
            c0390.f2015 = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c0390.f2014 = 1;
            } else if (!z2) {
                if (c0390.f2015 == 1) {
                    i2 = c0390.f2020;
                } else {
                    c0390.f2014 = 2;
                    c2594.m4676(c0944, c0390);
                    i2 = c0390.f2019;
                }
                c0390.f2014 = 1;
                c0390.f2018 = (int) (c0944.f4359 * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c0390.f2015 = 1;
            } else if (!z) {
                if (c0390.f2014 == 1) {
                    i = c0390.f2018;
                } else {
                    c0390.f2015 = 2;
                    c2594.m4676(c0944, c0390);
                    i = c0390.f2013;
                }
                c0390.f2015 = 1;
                int i4 = c0944.f4368;
                float f = c0944.f4359;
                if (i4 == -1) {
                    c0390.f2020 = (int) (i / f);
                } else {
                    c0390.f2020 = (int) (f * i);
                }
            }
        }
        c2594.m4676(c0944, c0390);
        c0944.m2064(c0390.f2013);
        c0944.m2082(c0390.f2019);
        c0944.f4388 = c0390.f2011;
        int i5 = c0390.f2016;
        c0944.f4399 = i5;
        c0944.f4388 = i5 > 0;
        c0390.f2017 = 0;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void mo1947(C0644 c0644) {
        super.mo1947(c0644);
        int size = this.f3930.size();
        for (int i = 0; i < size; i++) {
            ((C0944) this.f3930.get(i)).mo1947(c0644);
        }
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final boolean m1948(int i) {
        return (this.f3938 & i) == i;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final void mo1949() {
        this.f3939.m4304();
        this.f3947 = 0;
        this.f3932 = 0;
        this.f3930.clear();
        super.mo1949();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x066f A[EDGE_INSN: B:151:0x0267->B:384:0x066f BREAK  A[LOOP:9: B:155:0x027e->B:159:0x02a1], PHI: r31
  0x066f: PHI (r31v1 yyds.ᲀᲈᲁᛲ) = (r31v0 yyds.ᲀᲈᲁᛲ), (r31v11 yyds.ᲀᲈᲁᛲ), (r31v11 yyds.ᲀᲈᲁᛲ) binds: [B:151:0x0267, B:336:0x05d8, B:368:0x063e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0828 A[LOOP:33: B:488:0x0826->B:489:0x0828, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [yyds.ᛴᛵᛷᛴ, yyds.ᛴᲀᲈᛲ] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v94, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v79, types: [int] */
    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1950() {
        boolean[] zArr;
        ?? r21;
        C2141 c2141;
        int i;
        boolean z;
        char c;
        boolean z2;
        C2141 c21412;
        boolean z3;
        boolean z4;
        int iMax;
        ?? r10;
        ?? r17;
        boolean z5;
        int iMax2;
        ?? r0;
        boolean z6;
        boolean z7;
        ?? r02;
        ?? r13;
        int i2;
        boolean z8;
        int i3;
        int iMax3;
        boolean z9;
        int iM4173;
        int i4;
        ArrayList arrayList;
        C2183 c2183;
        C2183 c21832;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C2594 c2594;
        ArrayList arrayList4;
        int i5;
        boolean z11;
        boolean[] zArr2 = AbstractC1741.f8792;
        this.f4371 = 0;
        this.f4354 = 0;
        this.f3931 = false;
        this.f3936 = false;
        int size = this.f3930.size();
        int iMax4 = Math.max(0, m2072());
        int iMax5 = Math.max(0, m2067());
        int[] iArr = this.f4401;
        int i6 = iArr[1];
        int i7 = iArr[0];
        int i8 = this.f3941;
        C2141 c21413 = this.f4403;
        C2141 c21414 = this.f4382;
        if (i8 == 0 && AbstractC1741.m3480(this.f3938, 1)) {
            C2594 c25942 = this.f3946;
            int i9 = iArr[0];
            int i10 = iArr[1];
            m2081();
            ArrayList arrayList5 = this.f3930;
            int size2 = arrayList5.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((C0944) arrayList5.get(i11)).m2081();
            }
            boolean z12 = this.f3942;
            zArr = zArr2;
            if (i9 == 1) {
                m2085(0, m2072());
            } else {
                c21414.m4081(0);
                this.f4371 = 0;
            }
            int i12 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i12 < size2) {
                int i13 = i12;
                C0944 c0944 = (C0944) arrayList5.get(i12);
                int[] iArr2 = iArr;
                if (c0944 instanceof C2076) {
                    C2076 c2076 = (C2076) c0944;
                    z11 = z13;
                    if (c2076.f10262 == 1) {
                        int i14 = c2076.f10257;
                        if (i14 != -1) {
                            c2076.m3982(i14);
                        } else if (c2076.f10259 != -1 && mo1172()) {
                            c2076.m3982(m2072() - c2076.f10259);
                        } else if (mo1172()) {
                            c2076.m3982((int) ((c2076.f10258 * m2072()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    z11 = z13;
                    if ((c0944 instanceof C0411) && ((C0411) c0944).m1170() == 0) {
                        z13 = z11;
                        z14 = true;
                    }
                    i12 = i13 + 1;
                    iArr = iArr2;
                }
                z13 = z11;
                i12 = i13 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z13) {
                for (int i15 = 0; i15 < size2; i15 = i5 + 1) {
                    C0944 c09442 = (C0944) arrayList5.get(i15);
                    if (c09442 instanceof C2076) {
                        C2076 c20762 = (C2076) c09442;
                        i5 = i15;
                        if (c20762.f10262 == 1) {
                            AbstractC0476.m1331(0, c25942, c20762, z12);
                        }
                    } else {
                        i5 = i15;
                    }
                }
            }
            AbstractC0476.m1331(0, c25942, this, z12);
            if (z14) {
                for (int i16 = 0; i16 < size2; i16++) {
                    C0944 c09443 = (C0944) arrayList5.get(i16);
                    if (c09443 instanceof C0411) {
                        C0411 c0411 = (C0411) c09443;
                        if (c0411.m1170() == 0 && c0411.m1166()) {
                            AbstractC0476.m1331(1, c25942, c0411, z12);
                        }
                    }
                }
            }
            if (i10 == 1) {
                m2080(0, m2067());
            } else {
                c21413.m4081(0);
                this.f4354 = 0;
            }
            int i17 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i17 < size2) {
                C0944 c09444 = (C0944) arrayList5.get(i17);
                int i18 = i17;
                if (c09444 instanceof C2076) {
                    C2076 c20763 = (C2076) c09444;
                    if (c20763.f10262 == 0) {
                        int i19 = c20763.f10257;
                        if (i19 != -1) {
                            c20763.m3982(i19);
                        } else if (c20763.f10259 != -1 && mo1168()) {
                            c20763.m3982(m2067() - c20763.f10259);
                        } else if (mo1168()) {
                            c20763.m3982((int) ((c20763.f10258 * m2067()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((c09444 instanceof C0411) && ((C0411) c09444).m1170() == 1) {
                    z16 = true;
                }
                i17 = i18 + 1;
            }
            if (z15) {
                for (int i20 = 0; i20 < size2; i20++) {
                    C0944 c09445 = (C0944) arrayList5.get(i20);
                    if (c09445 instanceof C2076) {
                        C2076 c20764 = (C2076) c09445;
                        if (c20764.f10262 == 0) {
                            AbstractC0476.m1324(1, c25942, c20764);
                        }
                    }
                }
            }
            AbstractC0476.m1324(0, c25942, this);
            if (z16) {
                for (int i21 = 0; i21 < size2; i21++) {
                    C0944 c09446 = (C0944) arrayList5.get(i21);
                    if (c09446 instanceof C0411) {
                        C0411 c04112 = (C0411) c09446;
                        if (c04112.m1170() == 1 && c04112.m1166()) {
                            AbstractC0476.m1324(1, c25942, c04112);
                        }
                    }
                }
            }
            for (int i22 = 0; i22 < size2; i22++) {
                C0944 c09447 = (C0944) arrayList5.get(i22);
                if (c09447.m2069() && AbstractC0476.m1323(c09447)) {
                    m1946(c09447, c25942, AbstractC0476.f2383);
                    if (!(c09447 instanceof C2076)) {
                        AbstractC0476.m1331(0, c25942, c09447, z12);
                        AbstractC0476.m1324(0, c25942, c09447);
                    } else if (((C2076) c09447).f10262 == 0) {
                        AbstractC0476.m1324(0, c25942, c09447);
                    } else {
                        AbstractC0476.m1331(0, c25942, c09447, z12);
                    }
                }
            }
            for (int i23 = 0; i23 < size; i23++) {
                C0944 c09448 = (C0944) this.f3930.get(i23);
                if (c09448.m2069() && !(c09448 instanceof C2076) && !(c09448 instanceof C0411)) {
                    int iM2065 = c09448.m2065(0);
                    int iM20652 = c09448.m2065(1);
                    if (iM2065 != 3 || c09448.f4363 == 1 || iM20652 != 3 || c09448.f4389 == 1) {
                        m1946(c09448, this.f3946, new C0390());
                    }
                }
            }
        } else {
            zArr = zArr2;
            r21 = iArr;
        }
        C2296 c2296 = this.f3939;
        if (size <= 2 || !((i7 == 2 || i6 == 2) && AbstractC1741.m3480(this.f3938, 1024))) {
            c2141 = c21414;
            i = iMax4;
            z = false;
        } else {
            C2594 c25943 = this.f3946;
            ArrayList arrayList6 = this.f3930;
            int size3 = arrayList6.size();
            int i24 = 0;
            while (i24 < size3) {
                C0944 c09449 = (C0944) arrayList6.get(i24);
                ?? r3 = r21[0];
                ?? r6 = r21[1];
                int[] iArr3 = c09449.f4401;
                int i25 = i24;
                if (!AbstractC0395.m1135(r3, r6, iArr3[0], iArr3[1])) {
                    c2141 = c21414;
                    break;
                }
                i24 = i25 + 1;
            }
            int i26 = 0;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            ArrayList arrayList9 = null;
            ArrayList<C0411> arrayList10 = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            while (i26 < size3) {
                int i27 = i26;
                C0944 c094410 = (C0944) arrayList6.get(i26);
                ArrayList arrayList13 = arrayList7;
                ?? r32 = r21[0];
                ArrayList arrayList14 = arrayList8;
                ?? r62 = r21[1];
                ArrayList arrayList15 = arrayList9;
                int[] iArr4 = c094410.f4401;
                C2141 c21415 = c21414;
                if (!AbstractC0395.m1135(r32, r62, iArr4[0], iArr4[1])) {
                    m1946(c094410, c25943, this.f3934);
                }
                boolean z17 = c094410 instanceof C2076;
                if (z17) {
                    C2076 c20765 = (C2076) c094410;
                    if (c20765.f10262 == 0) {
                        arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                        arrayList9.add(c20765);
                    } else {
                        arrayList9 = arrayList15;
                    }
                    z10 = z17;
                    if (c20765.f10262 == 1) {
                        arrayList2 = arrayList13 == null ? new ArrayList() : arrayList13;
                        arrayList2.add(c20765);
                    } else {
                        arrayList2 = arrayList13;
                    }
                } else {
                    z10 = z17;
                    arrayList2 = arrayList13;
                    arrayList9 = arrayList15;
                }
                if (!(c094410 instanceof C0411)) {
                    arrayList3 = arrayList2;
                    c2594 = c25943;
                    arrayList8 = arrayList14;
                } else if (c094410 instanceof C0411) {
                    C0411 c04113 = (C0411) c094410;
                    if (c04113.m1170() == 0) {
                        arrayList4 = arrayList14 == null ? new ArrayList() : arrayList14;
                        arrayList4.add(c04113);
                    } else {
                        arrayList4 = arrayList14;
                    }
                    arrayList3 = arrayList2;
                    c2594 = c25943;
                    if (c04113.m1170() == 1) {
                        ArrayList arrayList16 = arrayList10 == null ? new ArrayList() : arrayList10;
                        arrayList16.add(c04113);
                        arrayList10 = arrayList16;
                    }
                    arrayList8 = arrayList4;
                } else {
                    arrayList3 = arrayList2;
                    c2594 = c25943;
                    C0411 c04114 = (C0411) c094410;
                    arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                    arrayList8.add(c04114);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                    }
                    ArrayList arrayList17 = arrayList10;
                    arrayList17.add(c04114);
                    arrayList10 = arrayList17;
                }
                if (c094410.f4382.f10577 == null && c094410.f4344.f10577 == null && !z10 && !(c094410 instanceof C0411)) {
                    if (arrayList11 == null) {
                        arrayList11 = new ArrayList();
                    }
                    ArrayList arrayList18 = arrayList11;
                    arrayList18.add(c094410);
                    arrayList11 = arrayList18;
                }
                if (c094410.f4403.f10577 == null && c094410.f4341.f10577 == null && c094410.f4385.f10577 == null && !z10 && !(c094410 instanceof C0411)) {
                    if (arrayList12 == null) {
                        arrayList12 = new ArrayList();
                    }
                    ArrayList arrayList19 = arrayList12;
                    arrayList19.add(c094410);
                    arrayList12 = arrayList19;
                }
                i26 = i27 + 1;
                arrayList7 = arrayList3;
                c21414 = c21415;
                c25943 = c2594;
            }
            ArrayList arrayList20 = arrayList7;
            ArrayList<C0411> arrayList21 = arrayList8;
            c2141 = c21414;
            ArrayList arrayList22 = arrayList9;
            ArrayList<C2183> arrayList23 = new ArrayList();
            if (arrayList20 != null) {
                Iterator it = arrayList20.iterator();
                while (it.hasNext()) {
                    AbstractC0395.m1138((C2076) it.next(), 0, arrayList23, null);
                }
            }
            C2183 c21833 = null;
            int i28 = 0;
            if (arrayList21 != null) {
                for (C0411 c04115 : arrayList21) {
                    C2183 c2183M1138 = AbstractC0395.m1138(c04115, i28, arrayList23, c21833);
                    c04115.m1169(i28, arrayList23, c2183M1138);
                    c2183M1138.m4172(arrayList23);
                    c21833 = null;
                    i28 = 0;
                }
            }
            HashSet hashSet = mo2076(2).f10573;
            if (hashSet != null) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    AbstractC0395.m1138(((C2141) it2.next()).f10578, 0, arrayList23, null);
                }
            }
            HashSet hashSet2 = mo2076(4).f10573;
            if (hashSet2 != null) {
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    AbstractC0395.m1138(((C2141) it3.next()).f10578, 0, arrayList23, null);
                }
            }
            HashSet hashSet3 = mo2076(7).f10573;
            if (hashSet3 != null) {
                Iterator it4 = hashSet3.iterator();
                while (it4.hasNext()) {
                    AbstractC0395.m1138(((C2141) it4.next()).f10578, 0, arrayList23, null);
                }
            }
            C2183 c21834 = null;
            if (arrayList11 != null) {
                Iterator it5 = arrayList11.iterator();
                while (it5.hasNext()) {
                    AbstractC0395.m1138((C0944) it5.next(), 0, arrayList23, null);
                }
            }
            if (arrayList22 != null) {
                Iterator it6 = arrayList22.iterator();
                while (it6.hasNext()) {
                    AbstractC0395.m1138((C2076) it6.next(), 1, arrayList23, null);
                }
            }
            int i29 = 1;
            if (arrayList10 != null) {
                for (C0411 c04116 : arrayList10) {
                    C2183 c2183M11382 = AbstractC0395.m1138(c04116, i29, arrayList23, c21834);
                    c04116.m1169(i29, arrayList23, c2183M11382);
                    c2183M11382.m4172(arrayList23);
                    c21834 = null;
                    i29 = 1;
                }
            }
            HashSet hashSet4 = mo2076(3).f10573;
            if (hashSet4 != null) {
                Iterator it7 = hashSet4.iterator();
                while (it7.hasNext()) {
                    AbstractC0395.m1138(((C2141) it7.next()).f10578, 1, arrayList23, null);
                }
            }
            HashSet hashSet5 = mo2076(6).f10573;
            if (hashSet5 != null) {
                Iterator it8 = hashSet5.iterator();
                while (it8.hasNext()) {
                    AbstractC0395.m1138(((C2141) it8.next()).f10578, 1, arrayList23, null);
                }
            }
            HashSet hashSet6 = mo2076(5).f10573;
            if (hashSet6 != null) {
                Iterator it9 = hashSet6.iterator();
                while (it9.hasNext()) {
                    AbstractC0395.m1138(((C2141) it9.next()).f10578, 1, arrayList23, null);
                }
            }
            HashSet hashSet7 = mo2076(7).f10573;
            if (hashSet7 != null) {
                Iterator it10 = hashSet7.iterator();
                while (it10.hasNext()) {
                    AbstractC0395.m1138(((C2141) it10.next()).f10578, 1, arrayList23, null);
                }
            }
            boolean z18 = true;
            if (arrayList12 != null) {
                Iterator it11 = arrayList12.iterator();
                while (it11.hasNext()) {
                    AbstractC0395.m1138((C0944) it11.next(), 1, arrayList23, null);
                }
            }
            int i30 = 0;
            while (i30 < size3) {
                C0944 c094411 = (C0944) arrayList6.get(i30);
                int[] iArr5 = c094411.f4401;
                boolean z19 = z18;
                if (iArr5[0] == 3 && iArr5[z19 ? 1 : 0] == 3) {
                    int i31 = c094411.f4397;
                    int size4 = arrayList23.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 >= size4) {
                            i4 = i30;
                            arrayList = arrayList6;
                            c2183 = null;
                            break;
                        }
                        i4 = i30;
                        c2183 = (C2183) arrayList23.get(i32);
                        arrayList = arrayList6;
                        if (i31 == c2183.f10736) {
                            break;
                        }
                        i32++;
                        arrayList6 = arrayList;
                        i30 = i4;
                    }
                    int i33 = c094411.f4372;
                    int size5 = arrayList23.size();
                    int i34 = 0;
                    while (true) {
                        if (i34 >= size5) {
                            c21832 = null;
                            break;
                        }
                        c21832 = (C2183) arrayList23.get(i34);
                        if (i33 == c21832.f10736) {
                            break;
                        } else {
                            i34++;
                        }
                    }
                    if (c2183 != null && c21832 != null) {
                        c2183.m4174(0, c21832);
                        c21832.f10737 = 2;
                        arrayList23.remove(c2183);
                    }
                } else {
                    i4 = i30;
                    arrayList = arrayList6;
                }
                i30 = i4 + 1;
                arrayList6 = arrayList;
                z18 = true;
            }
            if (arrayList23.size() <= 1) {
                i = iMax4;
                z = false;
            } else {
                int i35 = 0;
                if (r21[0] == 2) {
                    int i36 = 0;
                    C2183 c21835 = null;
                    for (C2183 c21836 : arrayList23) {
                        if (c21836.f10737 != 1) {
                            int iM41732 = c21836.m4173(c2296, i35);
                            if (iM41732 > i36) {
                                c21835 = c21836;
                                i36 = iM41732;
                            }
                            i35 = 0;
                        }
                    }
                    if (c21835 != null) {
                        m2090(1);
                        m2064(i36);
                    } else {
                        c21835 = null;
                    }
                    if (r21[1] == 2) {
                        int i37 = 0;
                        C2183 c21837 = null;
                        for (C2183 c21838 : arrayList23) {
                            if (c21838.f10737 != 0 && (iM4173 = c21838.m4173(c2296, 1)) > i37) {
                                c21837 = c21838;
                                i37 = iM4173;
                            }
                        }
                        if (c21837 != null) {
                            m2066(1);
                            m2082(i37);
                        } else {
                            c21837 = null;
                        }
                        if (c21835 != null || c21837 != null) {
                            if (i7 == 2) {
                                if (iMax4 >= m2072() || iMax4 <= 0) {
                                    iMax4 = m2072();
                                } else {
                                    m2064(iMax4);
                                    this.f3931 = true;
                                }
                            }
                            if (i6 == 2) {
                                if (iMax5 >= m2067() || iMax5 <= 0) {
                                    iMax5 = m2067();
                                } else {
                                    m2082(iMax5);
                                    this.f3936 = true;
                                }
                            }
                            i = iMax4;
                            z = true;
                        }
                    }
                }
            }
        }
        boolean z20 = m1948(64) || m1948(128);
        c2296.getClass();
        c2296.f11276 = false;
        if (this.f3938 == 0 || !z20) {
            c = 1;
        } else {
            c = 1;
            c2296.f11276 = true;
        }
        ArrayList arrayList24 = this.f3930;
        boolean z21 = r21[0] == 2 || r21[c] == 2;
        this.f3943 = 0;
        this.f3950 = 0;
        for (int i38 = 0; i38 < size; i38++) {
            C0944 c094412 = (C0944) this.f3930.get(i38);
            if (c094412 instanceof C0859) {
                ((C0859) c094412).m1950();
            }
        }
        boolean zM1948 = m1948(64);
        ?? r132 = z;
        int i39 = 0;
        boolean z22 = true;
        while (z22) {
            int i40 = i39 + 1;
            try {
                c2296.m4304();
                this.f3943 = 0;
                this.f3950 = 0;
                m2068(c2296);
                for (int i41 = 0; i41 < size; i41++) {
                    ((C0944) this.f3930.get(i41)).m2068(c2296);
                }
                m1951(c2296);
                try {
                    WeakReference weakReference = this.f3948;
                    if (weakReference == null || weakReference.get() == null) {
                        z2 = z21;
                    } else {
                        z2 = z21;
                        try {
                            c2296.m4316(c2296.m4310((C2141) this.f3948.get()), c2296.m4310(c21413), 0, 5);
                            this.f3948 = null;
                        } catch (Exception e) {
                            e = e;
                            z9 = true;
                            e.printStackTrace();
                            c21412 = c21413;
                            System.out.println("EXCEPTION : " + e);
                            z3 = z9;
                            if (z3) {
                            }
                            if (z2) {
                            }
                            iMax = Math.max(this.f4361, m2072());
                            if (iMax > m2072()) {
                            }
                            iMax2 = Math.max(this.f4402, m2067());
                            if (iMax2 > m2067()) {
                            }
                            if (r0 == 0) {
                            }
                            r13 = r02;
                            i2 = 8;
                            z8 = z7;
                            if (i40 <= i2) {
                            }
                            i39 = i40;
                            z21 = z2;
                            c21413 = c21412;
                            r132 = r13;
                            z22 = z8;
                        }
                    }
                    WeakReference weakReference2 = this.f3933;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c2296.m4316(c2296.m4310(this.f4341), c2296.m4310((C2141) this.f3933.get()), 0, 5);
                        this.f3933 = null;
                    }
                    WeakReference weakReference3 = this.f3945;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        C2141 c21416 = c2141;
                        try {
                            c2141 = c21416;
                            c2296.m4316(c2296.m4310((C2141) this.f3945.get()), c2296.m4310(c21416), 0, 5);
                            this.f3945 = null;
                        } catch (Exception e2) {
                            e = e2;
                            c2141 = c21416;
                            z9 = true;
                            e.printStackTrace();
                            c21412 = c21413;
                            System.out.println("EXCEPTION : " + e);
                            z3 = z9;
                            if (z3) {
                            }
                            if (z2) {
                                int iMax6 = 0;
                                int iMax7 = 0;
                                while (i3 < size) {
                                }
                                int iMax8 = Math.max(this.f4361, iMax7);
                                iMax3 = Math.max(this.f4402, iMax6);
                                r132 = r132;
                                z4 = z4;
                                if (i7 == 2) {
                                }
                                if (i6 == 2) {
                                    m2082(iMax3);
                                    r21[1] = 2;
                                    r132 = 1;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.f4361, m2072());
                            if (iMax > m2072()) {
                            }
                            iMax2 = Math.max(this.f4402, m2067());
                            if (iMax2 > m2067()) {
                            }
                            if (r0 == 0) {
                            }
                            r13 = r02;
                            i2 = 8;
                            z8 = z7;
                            if (i40 <= i2) {
                            }
                            i39 = i40;
                            z21 = z2;
                            c21413 = c21412;
                            r132 = r13;
                            z22 = z8;
                        }
                    }
                    WeakReference weakReference4 = this.f3940;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        try {
                        } catch (Exception e3) {
                            e = e3;
                        }
                        try {
                            c2296.m4316(c2296.m4310(this.f4344), c2296.m4310((C2141) this.f3940.get()), 0, 5);
                        } catch (Exception e4) {
                            e = e4;
                            z9 = true;
                            e.printStackTrace();
                            c21412 = c21413;
                            System.out.println("EXCEPTION : " + e);
                            z3 = z9;
                        }
                        try {
                            this.f3940 = null;
                        } catch (Exception e5) {
                            e = e5;
                            z9 = true;
                            e.printStackTrace();
                            c21412 = c21413;
                            System.out.println("EXCEPTION : " + e);
                            z3 = z9;
                        }
                    }
                    c2296.m4315();
                    c21412 = c21413;
                    z3 = true;
                } catch (Exception e6) {
                    e = e6;
                    z2 = z21;
                }
            } catch (Exception e7) {
                e = e7;
                z2 = z21;
                z9 = z22;
            }
            if (z3) {
                zArr[2] = false;
                boolean zM19482 = m1948(64);
                mo2086(c2296, zM19482);
                int size6 = this.f3930.size();
                int i42 = 0;
                boolean z23 = false;
                while (i42 < size6) {
                    C0944 c094413 = (C0944) this.f3930.get(i42);
                    c094413.mo2086(c2296, zM19482);
                    boolean z24 = zM19482;
                    int i43 = size6;
                    if (c094413.f4343 != -1 || c094413.f4348 != -1) {
                        z23 = true;
                    }
                    i42++;
                    zM19482 = z24;
                    size6 = i43;
                    z23 = z23;
                }
                z4 = z23;
            } else {
                mo2086(c2296, zM1948);
                for (int i44 = 0; i44 < size; i44++) {
                    ((C0944) this.f3930.get(i44)).mo2086(c2296, zM1948);
                }
                z4 = false;
            }
            if (z2 && i40 < 8 && zArr[2]) {
                int iMax62 = 0;
                int iMax72 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    C0944 c094414 = (C0944) this.f3930.get(i3);
                    iMax72 = Math.max(iMax72, c094414.m2072() + c094414.f4371);
                    iMax62 = Math.max(iMax62, c094414.m2067() + c094414.f4354);
                }
                int iMax82 = Math.max(this.f4361, iMax72);
                iMax3 = Math.max(this.f4402, iMax62);
                r132 = r132;
                z4 = z4;
                if (i7 == 2) {
                    r132 = r132;
                    z4 = z4;
                    if (m2072() < iMax82) {
                        m2064(iMax82);
                        r21[0] = 2;
                        r132 = 1;
                        z4 = true;
                    }
                }
                if (i6 == 2 && m2067() < iMax3) {
                    m2082(iMax3);
                    r21[1] = 2;
                    r132 = 1;
                    z4 = true;
                }
            }
            iMax = Math.max(this.f4361, m2072());
            if (iMax > m2072()) {
                m2064(iMax);
                r10 = 1;
                r21[0] = 1;
                z5 = true;
                r17 = 1;
            } else {
                r10 = 1;
                r17 = r132;
                z5 = z4;
            }
            iMax2 = Math.max(this.f4402, m2067());
            if (iMax2 > m2067()) {
                m2082(iMax2);
                r21[r10] = r10;
                ?? r03 = r10;
                z6 = r03 == true ? 1 : 0;
                r0 = r03;
            } else {
                r0 = r17;
                z6 = z5;
            }
            if (r0 == 0) {
                ?? r04 = r0;
                r04 = r0;
                boolean z25 = z6;
                z25 = z6;
                if (r21[0] == 2 && i > 0) {
                    r04 = r0;
                    z25 = z6;
                    if (m2072() > i) {
                        this.f3931 = r10;
                        r21[0] = r10;
                        m2064(i);
                        ?? r05 = r10;
                        z25 = r05 == true ? 1 : 0;
                        r04 = r05;
                    }
                }
                r02 = r04;
                r02 = r04;
                z7 = z25;
                z7 = z25;
                if (r21[r10] == 2 && iMax5 > 0) {
                    r02 = r04;
                    z7 = z25;
                    if (m2067() > iMax5) {
                        this.f3936 = r10;
                        r21[r10] = r10;
                        m2082(iMax5);
                        i2 = 8;
                        r13 = 1;
                        z8 = true;
                    }
                }
                if (i40 <= i2) {
                    z8 = false;
                }
                i39 = i40;
                z21 = z2;
                c21413 = c21412;
                r132 = r13;
                z22 = z8;
            } else {
                r02 = r0;
                z7 = z6;
            }
            r13 = r02;
            i2 = 8;
            z8 = z7;
            if (i40 <= i2) {
            }
            i39 = i40;
            z21 = z2;
            c21413 = c21412;
            r132 = r13;
            z22 = z8;
        }
        this.f3930 = arrayList24;
        if (r132 != 0) {
            r21[0] = i7;
            r21[1] = i6;
        }
        mo1947(c2296.f11277);
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m1951(C2296 c2296) {
        C0859 c0859;
        C2296 c22962;
        boolean zM1948 = m1948(64);
        mo1167(c2296, zM1948);
        int size = this.f3930.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0944 c0944 = (C0944) this.f3930.get(i);
            boolean[] zArr = c0944.f4370;
            zArr[0] = false;
            zArr[1] = false;
            if (c0944 instanceof C0411) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0944 c09442 = (C0944) this.f3930.get(i2);
                if (c09442 instanceof C0411) {
                    C0411 c0411 = (C0411) c09442;
                    for (int i3 = 0; i3 < c0411.f2142; i3++) {
                        C0944 c09443 = c0411.f2143[i3];
                        if (c0411.f2145 || c09443.mo1171()) {
                            int i4 = c0411.f2144;
                            if (i4 == 0 || i4 == 1) {
                                c09443.f4370[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c09443.f4370[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f3949;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0944 c09444 = (C0944) this.f3930.get(i5);
            c09444.getClass();
            if (c09444 instanceof C2076) {
                c09444.mo1167(c2296, zM1948);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((C0944) it.next()).getClass();
                C0188.m794();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0944) it2.next()).mo1167(c2296, zM1948);
                }
                hashSet.clear();
            }
        }
        if (C2296.f11274) {
            HashSet<C0944> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                C0944 c09445 = (C0944) this.f3930.get(i6);
                c09445.getClass();
                if (!(c09445 instanceof C2076)) {
                    hashSet2.add(c09445);
                }
            }
            c0859 = this;
            c22962 = c2296;
            c0859.m2070(this, c22962, hashSet2, this.f4401[0] == 2 ? 0 : 1, false);
            for (C0944 c09446 : hashSet2) {
                AbstractC1741.m3469(c0859, c22962, c09446);
                c09446.mo1167(c22962, zM1948);
            }
        } else {
            c0859 = this;
            c22962 = c2296;
            for (int i7 = 0; i7 < size; i7++) {
                C0944 c09447 = (C0944) c0859.f3930.get(i7);
                if (c09447 instanceof C0859) {
                    int[] iArr = c09447.f4401;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        c09447.m2090(1);
                    }
                    if (i9 == 2) {
                        c09447.m2066(1);
                    }
                    c09447.mo1167(c22962, zM1948);
                    if (i8 == 2) {
                        c09447.m2090(i8);
                    }
                    if (i9 == 2) {
                        c09447.m2066(i9);
                    }
                } else {
                    AbstractC1741.m3469(c0859, c22962, c09447);
                    if (!(c09447 instanceof C2076)) {
                        c09447.mo1167(c22962, zM1948);
                    }
                }
            }
        }
        if (c0859.f3943 > 0) {
            C2810.m4943(c0859, c22962, null, 0);
        }
        if (c0859.f3950 > 0) {
            C2810.m4943(c0859, c22962, null, 1);
        }
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m1952(C0944 c0944, int i) {
        if (i == 0) {
            int i2 = this.f3943 + 1;
            C1093[] c1093Arr = this.f3937;
            if (i2 >= c1093Arr.length) {
                c1093Arr = (C1093[]) Arrays.copyOf(c1093Arr, c1093Arr.length * 2);
                this.f3937 = c1093Arr;
            }
            int i3 = this.f3943;
            c1093Arr[i3] = new C1093(c0944, 0, this.f3942);
            this.f3943 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3950 + 1;
            C1093[] c1093Arr2 = this.f3944;
            if (i4 >= c1093Arr2.length) {
                c1093Arr2 = (C1093[]) Arrays.copyOf(c1093Arr2, c1093Arr2.length * 2);
                this.f3944 = c1093Arr2;
            }
            int i5 = this.f3950;
            c1093Arr2[i5] = new C1093(c0944, 1, this.f3942);
            this.f3950 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final boolean m1953(int i, boolean z) {
        boolean z2;
        C1491 c1491 = this.f3935;
        ArrayList<AbstractC1413> arrayList = (ArrayList) c1491.f7037;
        C0859 c0859 = (C0859) c1491.f7041;
        boolean z3 = false;
        int iM2065 = c0859.m2065(0);
        int iM20652 = c0859.m2065(1);
        int iM2087 = c0859.m2087();
        int iM2075 = c0859.m2075();
        if (z && (iM2065 == 2 || iM20652 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1413 abstractC1413 = (AbstractC1413) it.next();
                if (abstractC1413.f6694 == i && !abstractC1413.mo1396()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iM2065 == 2) {
                    c0859.m2090(1);
                    c0859.m2064(c1491.m3003(c0859, 0));
                    c0859.f4400.f6688.mo612(c0859.m2072());
                }
            } else if (z && iM20652 == 2) {
                c0859.m2066(1);
                c0859.m2082(c1491.m3003(c0859, 1));
                c0859.f4349.f6688.mo612(c0859.m2067());
            }
        }
        int[] iArr = c0859.f4401;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM2072 = c0859.m2072() + iM2087;
                c0859.f4400.f6687.mo612(iM2072);
                c0859.f4400.f6688.mo612(iM2072 - iM2087);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM2067 = c0859.m2067() + iM2075;
                c0859.f4349.f6687.mo612(iM2067);
                c0859.f4349.f6688.mo612(iM2067 - iM2075);
                z2 = true;
            }
            z2 = false;
        }
        c1491.m2994();
        for (AbstractC1413 abstractC14132 : arrayList) {
            if (abstractC14132.f6694 == i && (abstractC14132.f6690 != c0859 || abstractC14132.f6691)) {
                abstractC14132.mo1394();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC1413 abstractC14133 = (AbstractC1413) it2.next();
            if (abstractC14133.f6694 == i && (z2 || abstractC14133.f6690 != c0859)) {
                if (!abstractC14133.f6686.f6520 || !abstractC14133.f6687.f6520 || (!(abstractC14133 instanceof C0552) && !abstractC14133.f6688.f6520)) {
                    break;
                }
            }
        }
        c0859.m2090(iM2065);
        c0859.m2066(iM20652);
        return z3;
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void mo1954(StringBuilder sb) {
        sb.append(this.f4384 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4394);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4355);
        sb.append("\n");
        Iterator it = this.f3930.iterator();
        while (it.hasNext()) {
            ((C0944) it.next()).mo1954(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // yyds.C0944
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void mo1955(boolean z, boolean z2) {
        super.mo1955(z, z2);
        int size = this.f3930.size();
        for (int i = 0; i < size; i++) {
            ((C0944) this.f3930.get(i)).mo1955(z, z2);
        }
    }
}
