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
import androidx.activity.C0863;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0985;
import androidx.appcompat.widget.C1044;
import androidx.appcompat.widget.InterfaceC1003;
import androidx.appcompat.widget.InterfaceC1047;
import androidx.appcompat.widget.InterfaceC1058;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1102;
import androidx.collection.C1110;
import androidx.compose.animation.AbstractC1231;
import androidx.compose.animation.AbstractC1249;
import androidx.compose.animation.AbstractC1280;
import androidx.compose.animation.C1229;
import androidx.compose.animation.C1232;
import androidx.compose.animation.core.AbstractC1189;
import androidx.compose.animation.core.AbstractC1205;
import androidx.compose.animation.core.C1154;
import androidx.compose.animation.core.C1171;
import androidx.compose.animation.core.C1190;
import androidx.compose.animation.core.InterfaceC1155;
import androidx.compose.animation.core.InterfaceC1156;
import androidx.compose.animation.core.InterfaceC1167;
import androidx.compose.foundation.gestures.InterfaceC1389;
import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1598;
import androidx.compose.foundation.lazy.layout.C1537;
import androidx.compose.foundation.lazy.layout.C1562;
import androidx.compose.foundation.lazy.layout.C1570;
import androidx.compose.foundation.lazy.layout.C1571;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.foundation.lazy.layout.InterfaceC1538;
import androidx.compose.foundation.lazy.layout.InterfaceC1576;
import androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC1547;
import androidx.compose.foundation.text.selection.AbstractC1759;
import androidx.compose.material3.AbstractC1977;
import androidx.compose.material3.AbstractC2030;
import androidx.compose.material3.C1973;
import androidx.compose.material3.C1975;
import androidx.compose.material3.C2026;
import androidx.compose.p001ui.graphics.AbstractC2424;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.vector.AbstractC2382;
import androidx.compose.p001ui.graphics.vector.C2369;
import androidx.compose.p001ui.graphics.vector.C2370;
import androidx.compose.p001ui.graphics.vector.C2371;
import androidx.compose.p001ui.graphics.vector.C2384;
import androidx.compose.p001ui.graphics.vector.C2385;
import androidx.compose.p001ui.graphics.vector.C2386;
import androidx.compose.p001ui.graphics.vector.C2387;
import androidx.compose.p001ui.graphics.vector.C2388;
import androidx.compose.p001ui.graphics.vector.C2389;
import androidx.compose.p001ui.graphics.vector.C2390;
import androidx.compose.p001ui.graphics.vector.C2391;
import androidx.compose.p001ui.graphics.vector.C2392;
import androidx.compose.p001ui.graphics.vector.C2393;
import androidx.compose.p001ui.graphics.vector.C2394;
import androidx.compose.p001ui.graphics.vector.C2395;
import androidx.compose.p001ui.graphics.vector.C2398;
import androidx.compose.p001ui.graphics.vector.C2399;
import androidx.compose.p001ui.graphics.vector.C2400;
import androidx.compose.p001ui.graphics.vector.C2401;
import androidx.compose.p001ui.input.pointer.C2471;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2479;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.SortedSet;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.core.view.C3075;
import androidx.core.view.C3093;
import androidx.core.view.InterfaceC3078;
import androidx.lifecycle.C3244;
import com.bumptech.glide.AbstractC3889;
import io.ktor.client.plugins.api.C4718;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.C6385;
import p068.InterfaceC7387;
import p128.C8158;
import p130.InterfaceC8162;
import p133.AbstractC8179;
import p160.C8376;
import p206.InterfaceC8618;
import p206.InterfaceC8626;
import p206.MenuC8631;
import p206.SubMenuC8604;
import p221.C8727;
import p221.C8734;
import p221.InterfaceC8725;
import p226.AbstractC8765;
import p248.C8894;
import p321.C9452;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0960 implements InterfaceC8618, InterfaceC8626, InterfaceC1058, InterfaceC1155, InterfaceC1167, InterfaceC1389, InterfaceC8162, InterfaceC3078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f703;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r11
  0x002a: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:5:0x0019, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0960(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int i2 = 5;
        this.f703 = 5;
        int length = fArr.length - 1;
        C1190[][] c1190Arr = new C1190[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i = i6 != i2 ? i4 : i2;
                        }
                    } else {
                        if (i3 == 1) {
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C1190[] c1190Arr2 = new C1190[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                c1190Arr2[i11] = new C1190(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            c1190Arr[i5] = c1190Arr2;
            i5 = i8;
            i4 = i;
            i2 = 5;
        }
        this.f702 = c1190Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static ArrayList m984(C0960 c0960, String str) {
        int i;
        char cCharAt;
        char c;
        float fIntBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        char c2 = 0;
        int i2 = 0;
        while (i2 < length && AbstractC5227.m9464(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && AbstractC5227.m9464(str.charAt(length - 1), 32) <= 0) {
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
                    while (i < length && AbstractC5227.m9464(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    char c3 = i5 == 97 ? (char) 1 : c2;
                    int i6 = c2;
                    do {
                        long jM3387 = (c3 == 0 || 3 > i6 || i6 >= 5) ? AbstractC2382.m3387(i, length, str) : AbstractC2382.m3387(i, Math.min(i + 1, length), str);
                        i = (int) (jM3387 >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM3387 & 4294967295L));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = (float[]) c0960.f702;
                            int i7 = i6 + 1;
                            fArr[i6] = fIntBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                c0960.f702 = fArr2;
                                System.arraycopy(fArr, c2, fArr2, c2, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (AbstractC5227.m9464(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i3 = i6;
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i3 = i6;
                }
                float[] fArr3 = (float[]) c0960.f702;
                int i8 = 2;
                switch (cCharAt) {
                    case 'A':
                        c = c2;
                        int i9 = i3 - 7;
                        for (int i10 = c; i10 <= i9; i10 += 7) {
                            arrayList.add(new C2400(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], Float.compare(fArr3[i10 + 3], 0.0f) != 0 ? 1 : c, Float.compare(fArr3[i10 + 4], 0.0f) != 0 ? 1 : c, fArr3[i10 + 5], fArr3[i10 + 6]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'C':
                        c = c2;
                        int i11 = i3 - 6;
                        for (int i12 = c; i12 <= i11; i12 += 6) {
                            arrayList.add(new C2398(fArr3[i12], fArr3[i12 + 1], fArr3[i12 + 2], fArr3[i12 + 3], fArr3[i12 + 4], fArr3[i12 + 5]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'H':
                        c = c2;
                        int i13 = i3 - 1;
                        for (int i14 = c; i14 <= i13; i14++) {
                            arrayList.add(new C2399(fArr3[i14]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'L':
                        c = c2;
                        int i15 = i3 - 2;
                        for (int i16 = c; i16 <= i15; i16 += 2) {
                            arrayList.add(new C2391(fArr3[i16], fArr3[i16 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'M':
                        c = c2;
                        int i17 = i3 - 2;
                        if (i17 >= 0) {
                            arrayList.add(new C2390(fArr3[c], fArr3[1]));
                            while (i8 <= i17) {
                                arrayList.add(new C2391(fArr3[i8], fArr3[i8 + 1]));
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
                            arrayList.add(new C2394(fArr3[i19], fArr3[i19 + 1], fArr3[i19 + 2], fArr3[i19 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'S':
                        c = c2;
                        int i20 = i3 - 4;
                        for (int i21 = c; i21 <= i20; i21 += 4) {
                            arrayList.add(new C2395(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'T':
                        c = c2;
                        int i22 = i3 - 2;
                        for (int i23 = c; i23 <= i22; i23 += 2) {
                            arrayList.add(new C2392(fArr3[i23], fArr3[i23 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'V':
                        c = c2;
                        int i24 = i3 - 1;
                        for (int i25 = c; i25 <= i24; i25++) {
                            arrayList.add(new C2369(fArr3[i25]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Z':
                    case 'z':
                        c = c2;
                        arrayList.add(C2401.f4960);
                        i2 = i;
                        c2 = c;
                        break;
                    case 'a':
                        int i26 = i3 - 7;
                        int i27 = c2;
                        while (i27 <= i26) {
                            char c4 = c2;
                            arrayList.add(new C2393(fArr3[i27], fArr3[i27 + 1], fArr3[i27 + 2], Float.compare(fArr3[i27 + 3], 0.0f) != 0 ? 1 : c4, Float.compare(fArr3[i27 + 4], 0.0f) != 0 ? 1 : c4, fArr3[i27 + 5], fArr3[i27 + 6]));
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
                            arrayList.add(new C2385(fArr3[i29], fArr3[i29 + 1], fArr3[i29 + 2], fArr3[i29 + 3], fArr3[i29 + 4], fArr3[i29 + 5]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'h':
                        int i30 = i3 - 1;
                        for (int i31 = c2; i31 <= i30; i31++) {
                            arrayList.add(new C2384(fArr3[i31]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'l':
                        int i32 = i3 - 2;
                        for (int i33 = c2; i33 <= i32; i33 += 2) {
                            arrayList.add(new C2388(fArr3[i33], fArr3[i33 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'm':
                        int i34 = i3 - 2;
                        if (i34 >= 0) {
                            arrayList.add(new C2389(fArr3[c2], fArr3[1]));
                            while (i8 <= i34) {
                                arrayList.add(new C2388(fArr3[i8], fArr3[i8 + 1]));
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
                            arrayList.add(new C2386(fArr3[i36], fArr3[i36 + 1], fArr3[i36 + 2], fArr3[i36 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 's':
                        int i37 = i3 - 4;
                        for (int i38 = c2; i38 <= i37; i38 += 4) {
                            arrayList.add(new C2387(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 't':
                        int i39 = i3 - 2;
                        for (int i40 = c2; i40 <= i39; i40 += 2) {
                            arrayList.add(new C2371(fArr3[i40], fArr3[i40 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'v':
                        int i41 = i3 - 1;
                        for (int i42 = c2; i42 <= i41; i42++) {
                            arrayList.add(new C2370(fArr3[i42]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    default:
                        C6385.m11427(cCharAt, "Unknown command for: ");
                        return null;
                }
            } else {
                i2 = i;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static InterfaceC1538 m985(C0960 c0960, int i) {
        C1582 c1582 = (C1582) c0960.f702;
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            C1598 c1598 = (C1598) ((AbstractC2182) c1582.f2449).getValue();
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            C1537 c1537 = c1582.f2463;
            long j = c1598.f2561;
            boolean z = c1582.f2451;
            C0863 c0863 = new C0863(i, c1598);
            C1575 c1575 = c1537.f2304;
            if (c1575 == null) {
                return C1562.f2375;
            }
            C0955 c0955 = c1537.f2305;
            InterfaceC1576 interfaceC1576 = (InterfaceC1576) c1575.f2414;
            boolean z2 = interfaceC1576 instanceof ViewOnAttachStateChangeListenerC1547;
            C1571 c1571 = new C1571(c1575, i, c0955, c0863);
            c1571.f2391 = new C8727(j);
            if (!z2) {
                interfaceC1576.mo2065(c1571);
            } else if (z) {
                ViewOnAttachStateChangeListenerC1547 viewOnAttachStateChangeListenerC1547 = (ViewOnAttachStateChangeListenerC1547) interfaceC1576;
                viewOnAttachStateChangeListenerC1547.f2337.add(new C1570(1, c1571));
                if (!viewOnAttachStateChangeListenerC1547.f2338) {
                    viewOnAttachStateChangeListenerC1547.f2338 = true;
                    viewOnAttachStateChangeListenerC1547.f2339.post(viewOnAttachStateChangeListenerC1547);
                }
            } else {
                ViewOnAttachStateChangeListenerC1547 viewOnAttachStateChangeListenerC15472 = (ViewOnAttachStateChangeListenerC1547) interfaceC1576;
                viewOnAttachStateChangeListenerC15472.f2337.add(new C1570(0, c1571));
                if (!viewOnAttachStateChangeListenerC15472.f2338) {
                    viewOnAttachStateChangeListenerC15472.f2338 = true;
                    viewOnAttachStateChangeListenerC15472.f2339.post(viewOnAttachStateChangeListenerC15472);
                }
            }
            AbstractC3889.m7293(i, "compose:lazy:schedule_prefetch:index");
            return c1571;
        } catch (Throwable th) {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            throw th;
        }
    }

    @Override // androidx.core.view.InterfaceC3078
    public C3093 build() {
        return new C3093(new C3075(((ContentInfo.Builder) this.f702).build()));
    }

    @Override // androidx.core.view.InterfaceC3078
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f702).setExtras(bundle);
    }

    public String toString() {
        switch (this.f703) {
            case 24:
                return ((SortedSet) this.f702).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C8894 m986(C0923 c0923, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        long j;
        boolean z;
        long jM4094;
        C1110 c1110 = (C1110) this.f702;
        List list = (List) c0923.f572;
        C1110 c11102 = new C1110(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            C2471 c2471 = (C2471) list.get(i);
            long j2 = c2471.f5130;
            C2479 c2479 = (C2479) c1110.m1386(j2);
            if (c2479 == null) {
                j = c2471.f5129;
                jM4094 = c2471.f5127;
                z = false;
            } else {
                long j3 = c2479.f5168;
                j = j3;
                z = c2479.f5166;
                jM4094 = viewTreeObserverOnGlobalLayoutListenerC2719.m4094(c2479.f5167);
            }
            long j4 = c2471.f5130;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            c11102.m1383(new C2478(j4, c2471.f5129, c2471.f5127, c2471.f5126, c2471.f5125, j, jM4094, z, c2471.f5133, c2471.f5136, c2471.f5137, c2471.f5134, c2471.f5135, c2471.f5131), j4);
            boolean z2 = c2471.f5126;
            if (z2) {
                c1110.m1383(new C2479(c2471.f5129, c2471.f5128, z2), j2);
            } else {
                c1110.m1382(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new C8894(c11102, c0923);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m987(View view, int i, boolean z) {
        ((AutofillManager) this.f702).notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long m988() {
        switch (this.f703) {
            case 15:
                C2026 c2026 = (C2026) this.f702;
                long jM988 = c2026.f3741.m988();
                if (jM988 != 16) {
                    return jM988;
                }
                C1975 c1975 = (C1975) AbstractC2620.m3916(c2026, AbstractC1977.f3627);
                if (c1975 != null) {
                    long j = c1975.f3624;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((C2434) AbstractC2620.m3916(c2026, AbstractC2030.f3794)).f5045;
            default:
                return ((C1973) this.f702).f3621;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m989(float f, float f2, float f3, float f4) {
        C0955 c0955 = (C0955) this.f702;
        InterfaceC2436 interfaceC2436M946 = c0955.m946();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0955.m928() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0955.m928() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC2424.m3468("Width and height must be greater than or equal to zero");
        }
        c0955.m921(jFloatToRawIntBits);
        interfaceC2436M946.mo3245(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public InterfaceC1156 m990(int i) {
        switch (this.f703) {
            case 6:
                return ((C1154[]) this.f702)[i];
            case 7:
                return (C1154) this.f702;
            default:
                return (InterfaceC1156) this.f702;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m991(float f, float f2) {
        ((C0955) this.f702).m946().mo3245(f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public void m992(C8734 c8734) {
        ((Region) this.f702).set(c8734.f22223, c8734.f22222, c8734.f22221, c8734.f22220);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m993(float f, float f2, long j) {
        InterfaceC2436 interfaceC2436M946 = ((C0955) this.f702).m946();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC2436M946.mo3245(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC2436M946.mo3241(f, f2);
        interfaceC2436M946.mo3245(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m994(float f, long j) {
        InterfaceC2436 interfaceC2436M946 = ((C0955) this.f702).m946();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC2436M946.mo3245(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC2436M946.mo3240(f);
        interfaceC2436M946.mo3245(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m995(C2583 c2583) {
        if (!c2583.m3803()) {
            AbstractC8765.m13982("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.f702).remove(c2583);
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float mo996(float f, long j) {
        long j2 = j / 1000000;
        C1229 c1229M1639 = ((C1232) this.f702).m1639(f);
        long j3 = c1229M1639.f1637;
        return (((Math.signum(c1229M1639.f1639) * AbstractC1249.m1676(j3 > 0 ? j2 / j3 : 1.0f).f1691) * c1229M1639.f1638) / j3) * 1000.0f;
    }

    @Override // androidx.core.view.InterfaceC3078
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo997(Uri uri) {
        ((ContentInfo.Builder) this.f702).setLinkUri(uri);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long mo998(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f702).mo998(abstractC1189, abstractC11892, abstractC11893);
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float mo999() {
        return 0.0f;
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo750(MenuC8631 menuC8631, boolean z) {
        if (menuC8631 instanceof SubMenuC8604) {
            ((SubMenuC8604) menuC8631).f21453.mo13690().m13713(false);
        }
        InterfaceC8618 interfaceC8618 = ((C1044) this.f702).f1133;
        if (interfaceC8618 != null) {
            interfaceC8618.mo750(menuC8631, z);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1167, androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo1000() {
        ((C1171) this.f702).getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC1189 mo1001(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f702).mo1001(abstractC1189, abstractC11892, abstractC11893);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m1002(C2583 c2583) {
        if (!c2583.m3803()) {
            AbstractC8765.m13982("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.f702).add(c2583);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f702).mo1003(j, abstractC1189, abstractC11892, abstractC11893);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long m1004(C2487 c2487) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f702;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = c2487.f5197;
        C8158 c8158 = new C8158(0L);
        int size = list.size();
        int i = 0;
        while (true) {
            long j = c8158.f19886;
            if (i >= size) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            }
            c8158 = new C8158(C8158.m13084(j, ((C2478) list.get(i)).f5165));
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m1005() {
        ((AbstractC2207) this.f702).getClass();
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo764(MenuC8631 menuC8631) {
        InterfaceC8626 interfaceC8626 = ((ActionMenuView) this.f702).f798;
        if (interfaceC8626 != null) {
            interfaceC8626.mo764(menuC8631);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return ((C1171) this.f702).mo1006(j, abstractC1189, abstractC11892, abstractC11893);
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo757(MenuC8631 menuC8631) {
        C1044 c1044 = (C1044) this.f702;
        if (menuC8631 == c1044.f1140) {
            return false;
        }
        ((SubMenuC8604) menuC8631).f21454.getClass();
        InterfaceC8618 interfaceC8618 = c1044.f1133;
        if (interfaceC8618 != null) {
            return interfaceC8618.mo757(menuC8631);
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC3078
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo1009(int i) {
        ((ContentInfo.Builder) this.f702).setFlags(i);
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float mo1010(float f, float f2, long j) {
        long j2 = j / 1000000;
        C1229 c1229M1639 = ((C1232) this.f702).m1639(f2);
        long j3 = c1229M1639.f1637;
        return (Math.signum(c1229M1639.f1639) * c1229M1639.f1638 * AbstractC1249.m1676(j3 > 0 ? j2 / j3 : 1.0f).f1692) + f;
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long mo1011(float f) {
        return ((long) (Math.exp(((C1232) this.f702).m1638(f) / (((double) AbstractC1231.f1641) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC1155
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float mo1012(float f, float f2) {
        C1232 c1232 = (C1232) this.f702;
        double dM1638 = c1232.m1638(f2);
        double d = AbstractC1231.f1641;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM1638) * ((double) (c1232.f1643 * c1232.f1642))))) + f;
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC1047 interfaceC1047 = ((ActionMenuView) this.f702).f796;
        if (interfaceC1047 != null) {
            Toolbar toolbar = ((C0985) interfaceC1047).f943;
            if (toolbar.f825.m4771()) {
                zOnMenuItemSelected = true;
            } else {
                InterfaceC1003 interfaceC1003 = toolbar.f864;
                zOnMenuItemSelected = interfaceC1003 != null ? ((C0912) interfaceC1003).f486.f471.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC1058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo1008(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo1013(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo1007(int i, float f) {
    }

    public /* synthetic */ C0960(Object obj, int i) {
        this.f703 = i;
        this.f702 = obj;
    }

    public C0960(InterfaceC8725 interfaceC8725) {
        this.f703 = 4;
        float f = AbstractC1280.f1743;
        C1232 c1232 = new C1232();
        c1232.f1643 = f;
        float fMo1816 = interfaceC8725.mo1816();
        float f2 = AbstractC1231.f1641;
        c1232.f1642 = fMo1816 * 386.0878f * 160.0f * 0.84f;
        this.f702 = c1232;
    }

    public /* synthetic */ C0960(int i, boolean z) {
        this.f703 = i;
    }

    public C0960(long[] jArr) {
        C1102 c1102;
        this.f703 = 18;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c1102 = new C1102(jArrCopyOf.length);
            int i = c1102.f1275;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = c1102.f1276;
                    if (jArr2.length < length) {
                        c1102.f1276 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = c1102.f1276;
                    int i2 = c1102.f1275;
                    if (i != i2) {
                        AbstractC5179.m9401(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    AbstractC5179.m9401(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    c1102.f1275 += jArrCopyOf.length;
                }
            } else {
                C8376.m13331("");
                throw null;
            }
        } else {
            c1102 = new C1102();
        }
        this.f702 = c1102;
    }

    public C0960(int i) {
        Object c9452;
        this.f703 = i;
        switch (i) {
            case 24:
                this.f702 = new SortedSet(AbstractC2620.f5568);
                break;
            case 25:
                C3244 c3244 = new C3244(1);
                this.f702 = c3244;
                if (!c3244.f7394) {
                    if (c3244.f7395) {
                        AbstractC8179.m13102("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3244.m5074();
                    c3244.f7395 = true;
                    break;
                }
                break;
            case 26:
                this.f702 = new Region();
                break;
            case 27:
                int i2 = 5;
                if (Build.VERSION.SDK_INT >= 28) {
                    c9452 = new C4718(i2);
                } else {
                    c9452 = new C9452(i2);
                }
                this.f702 = c9452;
                break;
            default:
                this.f702 = new C1110((Object) null);
                break;
        }
    }

    public C0960(ClipData clipData, int i) {
        this.f703 = 29;
        this.f702 = AbstractC1759.m2395(clipData, i);
    }

    public C0960(float f, float f2, AbstractC1189 abstractC1189) {
        C0960 c0960;
        this.f703 = 9;
        int[] iArr = AbstractC1205.f1577;
        if (abstractC1189 != null) {
            c0960 = new C0960(abstractC1189, f, f2);
        } else {
            c0960 = new C0960(f, f2);
        }
        this.f702 = new C1171(c0960);
    }

    public C0960(AbstractC1189 abstractC1189, float f, float f2) {
        this.f703 = 6;
        int iMo1600 = abstractC1189.mo1600();
        C1154[] c1154Arr = new C1154[iMo1600];
        for (int i = 0; i < iMo1600; i++) {
            c1154Arr[i] = new C1154(f, f2, abstractC1189.mo1601(i));
        }
        this.f702 = c1154Arr;
    }

    public C0960(float f, float f2) {
        this.f703 = 7;
        this.f702 = new C1154(f, f2, 0.01f);
    }
}
