package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛸᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0908 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f4130;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0399 f4131;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ List f4132;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f4133;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ List f4134;

    public RunnableC0908(C0399 c0399, List list, List list2, int i, Runnable runnable) {
        this.f4131 = c0399;
        this.f4132 = list;
        this.f4134 = list2;
        this.f4130 = i;
        this.f4133 = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        C0621 c0621;
        int i2;
        int i3;
        C0621 c06212;
        C0621 c06213;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C0052 c0052 = new C0052(5, this);
        int size = this.f4132.size();
        int size2 = this.f4134.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2500 c2500 = new C2500();
        int i19 = 0;
        c2500.f12309 = 0;
        c2500.f12310 = size;
        c2500.f12311 = 0;
        c2500.f12312 = size2;
        arrayList2.add(c2500);
        int i20 = size + size2;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i22];
        int i23 = i22 / 2;
        int[] iArr2 = new int[i22];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C2500 c25002 = (C2500) arrayList2.remove(arrayList2.size() - i21);
            if (c25002.m4538() < i21 || c25002.m4537() < i21) {
                i = i23;
                c0621 = null;
            } else {
                int iM4537 = ((c25002.m4537() + c25002.m4538()) + i21) / 2;
                int i24 = i21 + i23;
                iArr[i24] = c25002.f12309;
                iArr2[i24] = c25002.f12310;
                int i25 = i19;
                while (i25 < iM4537) {
                    int i26 = Math.abs(c25002.m4538() - c25002.m4537()) % 2 == i21 ? i21 : i19;
                    int iM4538 = c25002.m4538() - c25002.m4537();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            i2 = i19;
                            i = i23;
                            i3 = iM4537;
                            c06212 = null;
                            break;
                        }
                        if (i28 != i27) {
                            if (i28 != i25) {
                                i9 = i28;
                                if (iArr[i28 + 1 + i23] > iArr[(i28 - 1) + i23]) {
                                }
                                i = i23;
                                i12 = ((i11 - c25002.f12309) + c25002.f12311) - i9;
                                if (i25 == 0 || i11 != i10) {
                                    i13 = i11;
                                    i14 = i12;
                                } else {
                                    i13 = i11;
                                    i14 = i12 - 1;
                                }
                                int i29 = iM4537;
                                i15 = i12;
                                i16 = i13;
                                i3 = i29;
                                i17 = i26;
                                while (i16 < c25002.f12310 && i15 < c25002.f12312 && c0052.m397(i16, i15)) {
                                    i16++;
                                    i15++;
                                }
                                iArr[i9 + i] = i16;
                                if (i17 == 0) {
                                    int i30 = iM4538 - i9;
                                    i18 = iM4538;
                                    if (i30 >= i27 + 1 && i30 <= i25 - 1 && iArr2[i30 + i] <= i16) {
                                        c06212 = new C0621();
                                        c06212.f3009 = i10;
                                        c06212.f3010 = i14;
                                        c06212.f3011 = i16;
                                        c06212.f3012 = i15;
                                        i2 = 0;
                                        c06212.f3008 = false;
                                        break;
                                    }
                                } else {
                                    i18 = iM4538;
                                }
                                i19 = 0;
                                i28 = i9 + 2;
                                i23 = i;
                                iM4537 = i3;
                                i26 = i17;
                                iM4538 = i18;
                            } else {
                                i9 = i28;
                            }
                            i10 = iArr[(i9 - 1) + i23];
                            i11 = i10 + 1;
                            i = i23;
                            i12 = ((i11 - c25002.f12309) + c25002.f12311) - i9;
                            if (i25 == 0) {
                                i13 = i11;
                                i14 = i12;
                                int i292 = iM4537;
                                i15 = i12;
                                i16 = i13;
                                i3 = i292;
                                i17 = i26;
                                while (i16 < c25002.f12310) {
                                    i16++;
                                    i15++;
                                }
                                iArr[i9 + i] = i16;
                                if (i17 == 0) {
                                }
                                i19 = 0;
                                i28 = i9 + 2;
                                i23 = i;
                                iM4537 = i3;
                                i26 = i17;
                                iM4538 = i18;
                            }
                        } else {
                            i9 = i28;
                        }
                        i10 = iArr[i9 + 1 + i23];
                        i11 = i10;
                        i = i23;
                        i12 = ((i11 - c25002.f12309) + c25002.f12311) - i9;
                        if (i25 == 0) {
                        }
                    }
                    if (c06212 != null) {
                        c0621 = c06212;
                        break;
                    }
                    int i31 = (c25002.m4538() - c25002.m4537()) % 2 == 0 ? 1 : i2;
                    int iM45382 = c25002.m4538() - c25002.m4537();
                    int i32 = i27;
                    while (true) {
                        if (i32 > i25) {
                            c06213 = null;
                            break;
                        }
                        if (i32 == i27 || (i32 != i25 && iArr2[i32 + 1 + i] < iArr2[(i32 - 1) + i])) {
                            i4 = iArr2[i32 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i32 - 1) + i];
                            i5 = i4 - 1;
                        }
                        int i33 = c25002.f12312 - ((c25002.f12310 - i5) - i32);
                        if (i25 == 0 || i5 != i4) {
                            i6 = i33;
                        } else {
                            i6 = i33;
                            i33++;
                        }
                        int i34 = i6;
                        int i35 = i31;
                        int i36 = i5;
                        int i37 = i34;
                        int i38 = iM45382;
                        while (i36 > c25002.f12309 && i37 > c25002.f12311) {
                            i7 = i32;
                            if (!c0052.m397(i36 - 1, i37 - 1)) {
                                break;
                            }
                            i36--;
                            i37--;
                            i32 = i7;
                        }
                        i7 = i32;
                        iArr2[i7 + i] = i36;
                        if (i35 != 0 && (i8 = i38 - i7) >= i27 && i8 <= i25 && iArr[i8 + i] >= i36) {
                            c06213 = new C0621();
                            c06213.f3009 = i36;
                            c06213.f3010 = i37;
                            c06213.f3011 = i4;
                            c06213.f3012 = i33;
                            c06213.f3008 = true;
                            break;
                        }
                        i32 = i7 + 2;
                        i31 = i35;
                        iM45382 = i38;
                    }
                    if (c06213 != null) {
                        c0621 = c06213;
                        break;
                    }
                    i25++;
                    i23 = i;
                    iM4537 = i3;
                    i21 = 1;
                    i19 = 0;
                }
                i = i23;
                c0621 = null;
            }
            if (c0621 != null) {
                if (c0621.m1523() > 0) {
                    int i39 = c0621.f3012;
                    int i40 = c0621.f3010;
                    int i41 = i39 - i40;
                    int i42 = c0621.f3011;
                    int i43 = c0621.f3009;
                    int i44 = i42 - i43;
                    arrayList.add(i41 != i44 ? c0621.f3008 ? new C1138(i43, i40, c0621.m1523()) : i41 > i44 ? new C1138(i43, i40 + 1, c0621.m1523()) : new C1138(i43 + 1, i40, c0621.m1523()) : new C1138(i43, i40, i44));
                }
                C2500 c25003 = arrayList3.isEmpty() ? new C2500() : (C2500) arrayList3.remove(arrayList3.size() - 1);
                c25003.f12309 = c25002.f12309;
                c25003.f12311 = c25002.f12311;
                c25003.f12310 = c0621.f3009;
                c25003.f12312 = c0621.f3010;
                arrayList2.add(c25003);
                c25002.f12310 = c25002.f12310;
                c25002.f12312 = c25002.f12312;
                c25002.f12309 = c0621.f3011;
                c25002.f12311 = c0621.f3012;
                arrayList2.add(c25002);
            } else {
                arrayList3.add(c25002);
            }
            i23 = i;
            i21 = 1;
            i19 = 0;
        }
        Collections.sort(arrayList, AbstractC0578.f2769);
        this.f4131.f2105.execute(new RunnableC2660(this, 1, new C2552(c0052, arrayList, iArr, iArr2)));
    }
}
