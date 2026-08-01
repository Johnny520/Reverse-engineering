package androidx.appcompat.app;

import android.content.ClipData;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillManager;
import androidx.activity.C0016;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0138;
import androidx.appcompat.widget.C0197;
import androidx.appcompat.widget.InterfaceC0156;
import androidx.appcompat.widget.InterfaceC0200;
import androidx.appcompat.widget.InterfaceC0211;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0255;
import androidx.collection.C0263;
import androidx.compose.animation.AbstractC0385;
import androidx.compose.animation.AbstractC0403;
import androidx.compose.animation.AbstractC0434;
import androidx.compose.animation.C0383;
import androidx.compose.animation.C0386;
import androidx.compose.animation.core.AbstractC0343;
import androidx.compose.animation.core.AbstractC0359;
import androidx.compose.animation.core.C0308;
import androidx.compose.animation.core.C0325;
import androidx.compose.animation.core.InterfaceC0309;
import androidx.compose.animation.core.InterfaceC0310;
import androidx.compose.animation.core.InterfaceC0321;
import androidx.compose.foundation.gestures.InterfaceC0548;
import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0757;
import androidx.compose.foundation.lazy.layout.C0696;
import androidx.compose.foundation.lazy.layout.C0721;
import androidx.compose.foundation.lazy.layout.C0729;
import androidx.compose.foundation.lazy.layout.C0730;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.foundation.lazy.layout.InterfaceC0697;
import androidx.compose.foundation.lazy.layout.InterfaceC0735;
import androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0706;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.material3.AbstractC1142;
import androidx.compose.material3.AbstractC1195;
import androidx.compose.material3.C1138;
import androidx.compose.material3.C1140;
import androidx.compose.material3.C1191;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.graphics.AbstractC1589;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.vector.AbstractC1547;
import androidx.compose.ui.graphics.vector.C1534;
import androidx.compose.ui.graphics.vector.C1535;
import androidx.compose.ui.graphics.vector.C1536;
import androidx.compose.ui.graphics.vector.C1549;
import androidx.compose.ui.graphics.vector.C1550;
import androidx.compose.ui.graphics.vector.C1551;
import androidx.compose.ui.graphics.vector.C1552;
import androidx.compose.ui.graphics.vector.C1553;
import androidx.compose.ui.graphics.vector.C1554;
import androidx.compose.ui.graphics.vector.C1555;
import androidx.compose.ui.graphics.vector.C1556;
import androidx.compose.ui.graphics.vector.C1557;
import androidx.compose.ui.graphics.vector.C1558;
import androidx.compose.ui.graphics.vector.C1559;
import androidx.compose.ui.graphics.vector.C1560;
import androidx.compose.ui.graphics.vector.C1563;
import androidx.compose.ui.graphics.vector.C1564;
import androidx.compose.ui.graphics.vector.C1565;
import androidx.compose.ui.graphics.vector.C1566;
import androidx.compose.ui.input.pointer.C1636;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1644;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.core.view.C2242;
import androidx.core.view.C2260;
import androidx.core.view.InterfaceC2245;
import androidx.lifecycle.C2411;
import io.ktor.client.plugins.api.C3885;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.C5553;
import p052.InterfaceC6557;
import p112.C7328;
import p114.InterfaceC7332;
import p117.AbstractC7349;
import p144.C7546;
import p190.InterfaceC7788;
import p190.InterfaceC7796;
import p190.MenuC7801;
import p190.SubMenuC7774;
import p205.C7897;
import p205.C7904;
import p205.InterfaceC7895;
import p210.AbstractC7935;
import p232.C8064;
import p305.C8631;
import p316.C8675;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0113 implements InterfaceC7788, InterfaceC7796, InterfaceC0211, InterfaceC0309, InterfaceC0321, InterfaceC0548, InterfaceC7332, InterfaceC2245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f358;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r11
  0x002a: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:5:0x0019, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0113(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = 5
            r0.f358 = r2
            r0.<init>()
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
            androidx.compose.animation.core.飘花落叶言子楪哲苏兰世[][] r5 = new androidx.compose.animation.core.C0344[r3][]
            r6 = 0
            r8 = r4
            r9 = r8
            r7 = r6
        L13:
            if (r7 >= r3) goto L6b
            r10 = r23[r7]
            r11 = 3
            r12 = 2
            if (r10 == 0) goto L2a
            if (r10 == r4) goto L33
            if (r10 == r12) goto L31
            if (r10 == r11) goto L2c
            r11 = 4
            if (r10 == r11) goto L2a
            if (r10 == r2) goto L28
            r14 = r9
            goto L35
        L28:
            r14 = r2
            goto L35
        L2a:
            r14 = r11
            goto L35
        L2c:
            if (r8 != r4) goto L33
            goto L31
        L2f:
            r14 = r8
            goto L35
        L31:
            r8 = r12
            goto L2f
        L33:
            r8 = r4
            goto L2f
        L35:
            r9 = r25[r7]
            int r10 = r7 + 1
            r11 = r25[r10]
            r15 = r1[r7]
            r16 = r1[r10]
            int r13 = r9.length
            int r13 = r13 / r12
            int r2 = r9.length
            int r2 = r2 % r12
            int r2 = r2 + r13
            androidx.compose.animation.core.飘花落叶言子楪哲苏兰世[] r12 = new androidx.compose.animation.core.C0344[r2]
            r13 = r6
        L47:
            if (r13 >= r2) goto L65
            int r17 = r13 * 2
            r18 = r13
            androidx.compose.animation.core.飘花落叶言子楪哲苏兰世 r13 = new androidx.compose.animation.core.飘花落叶言子楪哲苏兰世
            r19 = r17
            r17 = r9[r19]
            int r20 = r19 + 1
            r21 = r18
            r18 = r9[r20]
            r19 = r11[r19]
            r20 = r11[r20]
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r12[r21] = r13
            int r13 = r21 + 1
            goto L47
        L65:
            r5[r7] = r12
            r7 = r10
            r9 = r14
            r2 = 5
            goto L13
        L6b:
            r0.f357 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0113.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static ArrayList m423(C0113 c0113, String str) {
        int i;
        char cCharAt;
        char c;
        float fIntBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        char c2 = 0;
        int i2 = 0;
        while (i2 < length && AbstractC4394.m8915(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && AbstractC4394.m8915(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                cCharAt = str.charAt(i2);
                int i4 = cCharAt | ' ';
                if ((i4 - 122) * (i4 - 97) > 0 || i4 == 101) {
                    if (i >= length) {
                        cCharAt = c2;
                    } else {
                        i2 = i;
                    }
                }
            }
            if (cCharAt != 0) {
                int i5 = cCharAt | ' ';
                if (i5 != 122) {
                    while (i < length && AbstractC4394.m8915(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    char c3 = i5 == 97 ? (char) 1 : c2;
                    int i6 = c2;
                    do {
                        long jM2817 = (c3 == 0 || 3 > i6 || i6 >= 5) ? AbstractC1547.m2817(i, length, str) : AbstractC1547.m2817(i, Math.min(i + 1, length), str);
                        i = (int) (jM2817 >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM2817 & 4294967295L));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = (float[]) c0113.f357;
                            int i7 = i6 + 1;
                            fArr[i6] = fIntBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                c0113.f357 = fArr2;
                                System.arraycopy(fArr, c2, fArr2, c2, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (AbstractC4394.m8915(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i3 = i6;
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i3 = i6;
                }
                float[] fArr3 = (float[]) c0113.f357;
                int i8 = 2;
                switch (cCharAt) {
                    case 'A':
                        c = c2;
                        int i9 = i3 - 7;
                        for (int i10 = c; i10 <= i9; i10 += 7) {
                            arrayList.add(new C1565(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], Float.compare(fArr3[i10 + 3], 0.0f) != 0 ? 1 : c, Float.compare(fArr3[i10 + 4], 0.0f) != 0 ? 1 : c, fArr3[i10 + 5], fArr3[i10 + 6]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'C':
                        c = c2;
                        int i11 = i3 - 6;
                        for (int i12 = c; i12 <= i11; i12 += 6) {
                            arrayList.add(new C1563(fArr3[i12], fArr3[i12 + 1], fArr3[i12 + 2], fArr3[i12 + 3], fArr3[i12 + 4], fArr3[i12 + 5]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'H':
                        c = c2;
                        int i13 = i3 - 1;
                        for (int i14 = c; i14 <= i13; i14++) {
                            arrayList.add(new C1564(fArr3[i14]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'L':
                        c = c2;
                        int i15 = i3 - 2;
                        for (int i16 = c; i16 <= i15; i16 += 2) {
                            arrayList.add(new C1556(fArr3[i16], fArr3[i16 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'M':
                        c = c2;
                        int i17 = i3 - 2;
                        if (i17 >= 0) {
                            arrayList.add(new C1555(fArr3[c], fArr3[1]));
                            while (i8 <= i17) {
                                arrayList.add(new C1556(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Q':
                        c = c2;
                        int i18 = i3 - 4;
                        for (int i19 = c; i19 <= i18; i19 += 4) {
                            arrayList.add(new C1559(fArr3[i19], fArr3[i19 + 1], fArr3[i19 + 2], fArr3[i19 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'S':
                        c = c2;
                        int i20 = i3 - 4;
                        for (int i21 = c; i21 <= i20; i21 += 4) {
                            arrayList.add(new C1560(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'T':
                        c = c2;
                        int i22 = i3 - 2;
                        for (int i23 = c; i23 <= i22; i23 += 2) {
                            arrayList.add(new C1557(fArr3[i23], fArr3[i23 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'V':
                        c = c2;
                        int i24 = i3 - 1;
                        for (int i25 = c; i25 <= i24; i25++) {
                            arrayList.add(new C1534(fArr3[i25]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Z':
                    case 'z':
                        c = c2;
                        arrayList.add(C1566.f4614);
                        i2 = i;
                        c2 = c;
                        break;
                    case 'a':
                        int i26 = i3 - 7;
                        int i27 = c2;
                        while (i27 <= i26) {
                            char c4 = c2;
                            arrayList.add(new C1558(fArr3[i27], fArr3[i27 + 1], fArr3[i27 + 2], Float.compare(fArr3[i27 + 3], 0.0f) != 0 ? 1 : c4, Float.compare(fArr3[i27 + 4], 0.0f) != 0 ? 1 : c4, fArr3[i27 + 5], fArr3[i27 + 6]));
                            i27 += 7;
                            c2 = c4;
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'c':
                        int i28 = i3 - 6;
                        for (int i29 = c2; i29 <= i28; i29 += 6) {
                            arrayList.add(new C1550(fArr3[i29], fArr3[i29 + 1], fArr3[i29 + 2], fArr3[i29 + 3], fArr3[i29 + 4], fArr3[i29 + 5]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'h':
                        int i30 = i3 - 1;
                        for (int i31 = c2; i31 <= i30; i31++) {
                            arrayList.add(new C1549(fArr3[i31]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'l':
                        int i32 = i3 - 2;
                        for (int i33 = c2; i33 <= i32; i33 += 2) {
                            arrayList.add(new C1553(fArr3[i33], fArr3[i33 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'm':
                        int i34 = i3 - 2;
                        if (i34 >= 0) {
                            arrayList.add(new C1554(fArr3[c2], fArr3[1]));
                            while (i8 <= i34) {
                                arrayList.add(new C1553(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'q':
                        int i35 = i3 - 4;
                        for (int i36 = c2; i36 <= i35; i36 += 4) {
                            arrayList.add(new C1551(fArr3[i36], fArr3[i36 + 1], fArr3[i36 + 2], fArr3[i36 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 's':
                        int i37 = i3 - 4;
                        for (int i38 = c2; i38 <= i37; i38 += 4) {
                            arrayList.add(new C1552(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 't':
                        int i39 = i3 - 2;
                        for (int i40 = c2; i40 <= i39; i40 += 2) {
                            arrayList.add(new C1536(fArr3[i40], fArr3[i40 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'v':
                        int i41 = i3 - 1;
                        for (int i42 = c2; i42 <= i41; i42++) {
                            arrayList.add(new C1535(fArr3[i42]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    default:
                        C5553.m10811(cCharAt, "Unknown command for: ");
                        return null;
                }
            } else {
                i2 = i;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static InterfaceC0697 m424(C0113 c0113, int i) {
        C0741 c0741 = (C0741) c0113.f357;
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            C0757 c0757 = (C0757) ((AbstractC1347) c0741.f2103).getValue();
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            C0696 c0696 = c0741.f2117;
            long j = c0757.f2215;
            boolean z = c0741.f2105;
            C0016 c0016 = new C0016(i, c0757);
            C0734 c0734 = c0696.f1958;
            if (c0734 == null) {
                return C0721.f2029;
            }
            C0108 c0108 = c0696.f1959;
            InterfaceC0735 interfaceC0735 = (InterfaceC0735) c0734.f2068;
            boolean z2 = interfaceC0735 instanceof ViewOnAttachStateChangeListenerC0706;
            C0730 c0730 = new C0730(c0734, i, c0108, c0016);
            c0730.f2045 = new C7897(j);
            if (!z2) {
                interfaceC0735.mo1495(c0730);
            } else if (z) {
                ViewOnAttachStateChangeListenerC0706 viewOnAttachStateChangeListenerC0706 = (ViewOnAttachStateChangeListenerC0706) interfaceC0735;
                viewOnAttachStateChangeListenerC0706.f1991.add(new C0729(1, c0730));
                if (!viewOnAttachStateChangeListenerC0706.f1992) {
                    viewOnAttachStateChangeListenerC0706.f1992 = true;
                    viewOnAttachStateChangeListenerC0706.f1993.post(viewOnAttachStateChangeListenerC0706);
                }
            } else {
                ViewOnAttachStateChangeListenerC0706 viewOnAttachStateChangeListenerC07062 = (ViewOnAttachStateChangeListenerC0706) interfaceC0735;
                viewOnAttachStateChangeListenerC07062.f1991.add(new C0729(0, c0730));
                if (!viewOnAttachStateChangeListenerC07062.f1992) {
                    viewOnAttachStateChangeListenerC07062.f1992 = true;
                    viewOnAttachStateChangeListenerC07062.f1993.post(viewOnAttachStateChangeListenerC07062);
                }
            }
            C8675.m14343(i, "compose:lazy:schedule_prefetch:index");
            return c0730;
        } catch (Throwable th) {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
            throw th;
        }
    }

    @Override // androidx.core.view.InterfaceC2245
    public C2260 build() {
        return new C2260(new C2242(((ContentInfo.Builder) this.f357).build()));
    }

    @Override // androidx.core.view.InterfaceC2245
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f357).setExtras(bundle);
    }

    public String toString() {
        switch (this.f358) {
            case 24:
                return ((SortedSet) this.f357).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8064 m425(C0076 c0076, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        long j;
        boolean z;
        long jM3524;
        C0263 c0263 = (C0263) this.f357;
        List list = (List) c0076.f227;
        C0263 c02632 = new C0263(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            C1636 c1636 = (C1636) list.get(i);
            long j2 = c1636.f4784;
            C1644 c1644 = (C1644) c0263.m825(j2);
            if (c1644 == null) {
                j = c1636.f4783;
                jM3524 = c1636.f4781;
                z = false;
            } else {
                long j3 = c1644.f4822;
                j = j3;
                z = c1644.f4820;
                jM3524 = viewTreeObserverOnGlobalLayoutListenerC1884.m3524(c1644.f4821);
            }
            long j4 = c1636.f4784;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            c02632.m822(new C1643(j4, c1636.f4783, c1636.f4781, c1636.f4780, c1636.f4779, j, jM3524, z, c1636.f4787, c1636.f4790, c1636.f4791, c1636.f4788, c1636.f4789, c1636.f4785), j4);
            boolean z2 = c1636.f4780;
            if (z2) {
                c0263.m822(new C1644(c1636.f4783, c1636.f4782, z2), j2);
            } else {
                c0263.m821(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new C8064(c02632, c0076);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m426(View view, int i, boolean z) {
        ((AutofillManager) this.f357).notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long m427() {
        switch (this.f358) {
            case 15:
                C1191 c1191 = (C1191) this.f357;
                long jM427 = c1191.f3395.m427();
                if (jM427 != 16) {
                    return jM427;
                }
                C1140 c1140 = (C1140) AbstractC1785.m3346(c1191, AbstractC1142.f3281);
                if (c1140 != null) {
                    long j = c1140.f3278;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((C1599) AbstractC1785.m3346(c1191, AbstractC1195.f3448)).f4699;
            default:
                return ((C1138) this.f357).f3275;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m428(float f, float f2, float f3, float f4) {
        C0108 c0108 = (C0108) this.f357;
        InterfaceC1601 interfaceC1601M385 = c0108.m385();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0108.m367() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0108.m367() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC1589.m2898("Width and height must be greater than or equal to zero");
        }
        c0108.m360(jFloatToRawIntBits);
        interfaceC1601M385.mo2675(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC0310 m429(int i) {
        switch (this.f358) {
            case 6:
                return ((C0308[]) this.f357)[i];
            case 7:
                return (C0308) this.f357;
            default:
                return (InterfaceC0310) this.f357;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m430(float f, float f2) {
        ((C0108) this.f357).m385().mo2675(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public void m431(C7904 c7904) {
        ((Region) this.f357).set(c7904.f21881, c7904.f21880, c7904.f21879, c7904.f21878);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m432(float f, float f2, long j) {
        InterfaceC1601 interfaceC1601M385 = ((C0108) this.f357).m385();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC1601M385.mo2675(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC1601M385.mo2671(f, f2);
        interfaceC1601M385.mo2675(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m433(float f, long j) {
        InterfaceC1601 interfaceC1601M385 = ((C0108) this.f357).m385();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC1601M385.mo2675(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC1601M385.mo2670(f);
        interfaceC1601M385.mo2675(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m434(C1748 c1748) {
        if (!c1748.m3233()) {
            AbstractC7935.m13395("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.f357).remove(c1748);
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float mo435(float f, long j) {
        long j2 = j / 1000000;
        C0383 c0383M1078 = ((C0386) this.f357).m1078(f);
        long j3 = c0383M1078.f1292;
        return (((Math.signum(c0383M1078.f1294) * AbstractC0403.m1115(j3 > 0 ? j2 / j3 : 1.0f).f1346) * c0383M1078.f1293) / j3) * 1000.0f;
    }

    @Override // androidx.core.view.InterfaceC2245
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo436(Uri uri) {
        ((ContentInfo.Builder) this.f357).setLinkUri(uri);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long mo437(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f357).mo437(abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float mo438() {
        return 0.0f;
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo189(MenuC7801 menuC7801, boolean z) {
        if (menuC7801 instanceof SubMenuC7774) {
            ((SubMenuC7774) menuC7801).f21111.mo13103().m13126(false);
        }
        InterfaceC7788 interfaceC7788 = ((C0197) this.f357).f788;
        if (interfaceC7788 != null) {
            interfaceC7788.mo189(menuC7801, z);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0321, androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo439() {
        ((C0325) this.f357).getClass();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m440(C1748 c1748) {
        if (!c1748.m3233()) {
            AbstractC7935.m13395("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.f357).add(c1748);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m442() {
        ((AbstractC1372) this.f357).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long m443(C1652 c1652) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f357;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = c1652.f4851;
        C7328 c7328 = new C7328(0L);
        int size = list.size();
        int i = 0;
        while (true) {
            long j = c7328.f19546;
            if (i >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            }
            c7328 = new C7328(C7328.m12498(j, ((C1643) list.get(i)).f4819));
            i++;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC0343 mo444(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f357).mo444(j, abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo203(MenuC7801 menuC7801) {
        InterfaceC7796 interfaceC7796 = ((ActionMenuView) this.f357).f453;
        if (interfaceC7796 != null) {
            interfaceC7796.mo203(menuC7801);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float mo445(float f, float f2) {
        C0386 c0386 = (C0386) this.f357;
        double dM1077 = c0386.m1077(f2);
        double d = AbstractC0385.f1296;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM1077) * ((double) (c0386.f1298 * c0386.f1297))))) + f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC0343 mo446(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f357).mo446(abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo196(MenuC7801 menuC7801) {
        C0197 c0197 = (C0197) this.f357;
        if (menuC7801 == c0197.f795) {
            return false;
        }
        ((SubMenuC7774) menuC7801).f21112.getClass();
        InterfaceC7788 interfaceC7788 = c0197.f788;
        if (interfaceC7788 != null) {
            return interfaceC7788.mo196(menuC7801);
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC2245
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo448(int i) {
        ((ContentInfo.Builder) this.f357).setFlags(i);
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float mo449(float f, float f2, long j) {
        long j2 = j / 1000000;
        C0383 c0383M1078 = ((C0386) this.f357).m1078(f2);
        long j3 = c0383M1078.f1292;
        return (Math.signum(c0383M1078.f1294) * c0383M1078.f1293 * AbstractC0403.m1115(j3 > 0 ? j2 / j3 : 1.0f).f1347) + f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0309
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long mo450(float f) {
        return ((long) (Math.exp(((C0386) this.f357).m1077(f) / (((double) AbstractC0385.f1296) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AbstractC0343 mo451(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return ((C0325) this.f357).mo451(j, abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public boolean mo204(MenuC7801 menuC7801, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC0200 interfaceC0200 = ((ActionMenuView) this.f357).f451;
        if (interfaceC0200 != null) {
            Toolbar toolbar = ((C0138) interfaceC0200).f598;
            if (toolbar.f480.m4201()) {
                zOnMenuItemSelected = true;
            } else {
                InterfaceC0156 interfaceC0156 = toolbar.f519;
                zOnMenuItemSelected = interfaceC0156 != null ? ((C0065) interfaceC0156).f141.f126.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0211
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo447(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0211
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo452(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0211
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void mo441(int i, float f) {
    }

    public /* synthetic */ C0113(Object obj, int i) {
        this.f358 = i;
        this.f357 = obj;
    }

    public C0113(InterfaceC7895 interfaceC7895) {
        this.f358 = 4;
        float f = AbstractC0434.f1398;
        C0386 c0386 = new C0386();
        c0386.f1298 = f;
        float fMo1246 = interfaceC7895.mo1246();
        float f2 = AbstractC0385.f1296;
        c0386.f1297 = fMo1246 * 386.0878f * 160.0f * 0.84f;
        this.f357 = c0386;
    }

    public /* synthetic */ C0113(int i, boolean z) {
        this.f358 = i;
    }

    public C0113(long[] jArr) {
        C0255 c0255;
        this.f358 = 18;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c0255 = new C0255(jArrCopyOf.length);
            int i = c0255.f930;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = c0255.f931;
                    if (jArr2.length < length) {
                        c0255.f931 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = c0255.f931;
                    int i2 = c0255.f930;
                    if (i != i2) {
                        AbstractC4346.m8835(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    AbstractC4346.m8835(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    c0255.f930 += jArrCopyOf.length;
                }
            } else {
                C7546.m12743("");
                throw null;
            }
        } else {
            c0255 = new C0255();
        }
        this.f357 = c0255;
    }

    public C0113(int i) {
        Object c8631;
        this.f358 = i;
        switch (i) {
            case 24:
                this.f357 = new SortedSet(AbstractC1785.f5222);
                break;
            case 25:
                C2411 c2411 = new C2411(1);
                this.f357 = c2411;
                if (!c2411.f7048) {
                    if (c2411.f7049) {
                        AbstractC7349.m12516("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c2411.m4504();
                    c2411.f7049 = true;
                    break;
                }
                break;
            case 26:
                this.f357 = new Region();
                break;
            case 27:
                int i2 = 5;
                if (Build.VERSION.SDK_INT >= 28) {
                    c8631 = new C3885(i2);
                } else {
                    c8631 = new C8631(i2);
                }
                this.f357 = c8631;
                break;
            default:
                this.f357 = new C0263((Object) null);
                break;
        }
    }

    public C0113(ClipData clipData, int i) {
        this.f358 = 29;
        this.f357 = AbstractC0921.m1825(clipData, i);
    }

    public C0113(float f, float f2, AbstractC0343 abstractC0343) {
        C0113 c0113;
        this.f358 = 9;
        int[] iArr = AbstractC0359.f1232;
        if (abstractC0343 != null) {
            c0113 = new C0113(abstractC0343, f, f2);
        } else {
            c0113 = new C0113(f, f2);
        }
        this.f357 = new C0325(c0113);
    }

    public C0113(AbstractC0343 abstractC0343, float f, float f2) {
        this.f358 = 6;
        int iMo1039 = abstractC0343.mo1039();
        C0308[] c0308Arr = new C0308[iMo1039];
        for (int i = 0; i < iMo1039; i++) {
            c0308Arr[i] = new C0308(f, f2, abstractC0343.mo1040(i));
        }
        this.f357 = c0308Arr;
    }

    public C0113(float f, float f2) {
        this.f358 = 7;
        this.f357 = new C0308(f, f2, 0.01f);
    }
}
