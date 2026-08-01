package p209;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.text.AbstractC2901;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.C2884;
import androidx.compose.p001ui.text.C2889;
import androidx.compose.p001ui.text.C2893;
import androidx.compose.p001ui.text.C2898;
import androidx.compose.p001ui.text.C2905;
import androidx.compose.p001ui.text.InterfaceC2887;
import androidx.compose.p001ui.text.InterfaceC2897;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.C2828;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.runtime.InterfaceC2168;
import androidx.window.area.AbstractC3400;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.text.AbstractC5976;
import p064.C7348;
import p183.C8529;
import p183.C8542;
import p210.AbstractC8660;
import p210.C8661;
import p210.C8662;
import p212.C8664;
import p212.C8665;
import p212.C8668;
import p212.C8669;
import p212.C8670;
import p212.C8671;
import p212.C8672;
import p212.C8674;
import p221.C8728;
import p221.C8730;
import p221.InterfaceC8725;
import p224.C8744;
import p224.C8745;
import p225.C8751;
import p225.C8755;
import p225.C8756;
import p225.C8757;
import p225.C8760;
import p225.C8762;
import p225.InterfaceC8752;
import p228.AbstractC8777;
import p228.C8770;
import p228.C8774;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;
import top.suzhelan.qstory.p015ui.components.C6807;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8650 implements InterfaceC2897 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f21693;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean f21694;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0955 f21695;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2830 f21696;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final List f21697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final CharSequence f21698;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C8770 f21699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC8725 f21700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8649 f21701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2865 f21702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final List f21703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f21704;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0864 A[LOOP:6: B:416:0x0862->B:417:0x0864, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0875  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8650(String str, C2865 c2865, List list, List list2, InterfaceC2830 interfaceC2830, InterfaceC8725 interfaceC8725) {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        InterfaceC8752 interfaceC8752;
        boolean z;
        Typeface typeface;
        CharSequence charSequence;
        float f;
        long j;
        int i2;
        C8757 c8757;
        ArrayList arrayList;
        int size;
        int i3;
        C2881 c2881;
        ArrayList arrayList2;
        int i4;
        int[] iArr;
        int size2;
        int i5;
        boolean z2;
        C8757 c87572;
        int size3;
        int i6;
        int i7;
        InterfaceC8725 interfaceC87252;
        Object c8665;
        int i8;
        int i9;
        List list3;
        InterfaceC8725 interfaceC87253;
        int i10;
        C2889 c2889;
        CharSequence charSequence2;
        C2889 c28892;
        this.f21704 = str;
        this.f21702 = c2865;
        this.f21703 = list;
        this.f21697 = list2;
        this.f21696 = interfaceC2830;
        this.f21700 = interfaceC8725;
        float fMo1816 = interfaceC8725.mo1816();
        C8649 c8649 = new C8649(1);
        ((TextPaint) c8649).density = fMo1816;
        c8649.f21688 = C8760.f22306;
        c8649.f21687 = 3;
        c8649.f21686 = C2405.f4961;
        this.f21701 = c8649;
        boolean zM13754 = AbstractC8659.m13754(c2865);
        C2881 c28812 = c2865.f6329;
        C2898 c2898 = c2865.f6328;
        if (zM13754) {
            C6686 c6686 = C8658.f21714;
            C6686 c66862 = C8658.f21714;
            InterfaceC2168 interfaceC2168M11817 = (InterfaceC2168) c66862.f16359;
            if (interfaceC2168M11817 == null) {
                if (C8542.m13568()) {
                    interfaceC2168M11817 = c66862.m11817();
                    c66862.f16359 = interfaceC2168M11817;
                } else {
                    interfaceC2168M11817 = AbstractC8659.f21715;
                }
            }
            zBooleanValue = ((Boolean) interfaceC2168M11817.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f21694 = zBooleanValue;
        int i11 = c2898.f6457;
        C8661 c8661 = c28812.f6409;
        if (i11 != 4) {
            if (i11 != 5) {
                if (i11 == 1) {
                    i = 0;
                } else if (i11 == 2) {
                    i = 1;
                } else {
                    if (i11 != 3 && i11 != 0) {
                        C6755.m11870("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c8661 == null || (locale = ((C8662) c8661.f21719.get(0)).f21720) == null) ? Locale.getDefault() : locale);
                    i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        this.f21693 = i;
        C8651 c8651 = new C8651(this);
        C8755 c8755 = c2898.f6461;
        c8755 = c8755 == null ? C8755.f22293 : c8755;
        c8649.setFlags(c8755.f22294 ? c8649.getFlags() | 128 : c8649.getFlags() & (-129));
        int i12 = c8755.f22295;
        if (i12 == 1) {
            c8649.setFlags(c8649.getFlags() | 64);
            c8649.setHinting(0);
        } else if (i12 == 2) {
            c8649.getFlags();
            c8649.setHinting(1);
        } else if (i12 == 3) {
            c8649.getFlags();
            c8649.setHinting(0);
        } else {
            c8649.getFlags();
        }
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (((C2884) obj).f6422 instanceof C2881) {
                break;
            } else {
                i13++;
            }
        }
        boolean z3 = obj != null;
        long j2 = c28812.f6402;
        C2822 c2822 = c28812.f6401;
        C2824 c2824 = c28812.f6400;
        String str2 = c28812.f6408;
        C8661 c86612 = c28812.f6409;
        InterfaceC8752 interfaceC87522 = c28812.f6403;
        C8756 c8756 = c28812.f6412;
        long j3 = c28812.f6407;
        long jM13903 = C8728.m13903(j2);
        boolean z4 = z3;
        if (C8730.m13905(jM13903, 4294967296L)) {
            c8649.setTextSize(interfaceC8725.mo1895(j2));
        } else if (C8730.m13905(jM13903, 8589934592L)) {
            c8649.setTextSize(C8728.m13902(j2) * c8649.getTextSize());
        }
        AbstractC2827 abstractC2827 = c28812.f6398;
        if (abstractC2827 == null && c2824 == null && c2822 == null) {
            interfaceC8752 = interfaceC87522;
            z = z4;
        } else {
            C2822 c28222 = c2822 == null ? C2822.f6221 : c2822;
            int i14 = c2824 != null ? c2824.f6225 : 0;
            C2821 c2821 = c28812.f6399;
            int i15 = c2821 != null ? c2821.f6215 : Opcodes.MAX_VALUE;
            interfaceC8752 = interfaceC87522;
            C8650 c8650 = c8651.f21705;
            z = z4;
            C2803 c2803M4263 = ((C2828) c8650.f21696).m4263(abstractC2827, c28222, i14, i15);
            if (c2803M4263 instanceof C2803) {
                Object obj2 = c2803M4263.f6197;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                C0955 c0955 = new C0955(c2803M4263, c8650.f21695);
                c8650.f21695 = c0955;
                Object obj3 = c0955.f663;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            c8649.setTypeface(typeface);
        }
        if (c86612 != null) {
            C8661 c86613 = C8661.f21717;
            if (!c86612.equals(AbstractC8660.f21716.m13751())) {
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(c86612, 10));
                Iterator it = c86612.f21719.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C8662) it.next()).f21720);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                c8649.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c8649.setFontFeatureSettings(str2);
        }
        if (c8756 != null && !c8756.equals(C8756.f22296)) {
            c8649.setTextScaleX(c8649.getTextScaleX() * c8756.f22298);
            c8649.setTextSkewX(c8649.getTextSkewX() + c8756.f22297);
        }
        c8649.m13743(interfaceC8752.mo13976());
        c8649.m13744(interfaceC8752.mo13975(), 9205357640488583168L, interfaceC8752.mo13977());
        c8649.m13741(c28812.f6404);
        c8649.m13747(c28812.f6405);
        c8649.m13742(c28812.f6406);
        if (C8730.m13905(C8728.m13903(j3), 4294967296L) && C8728.m13902(j3) != 0.0f) {
            float textScaleX = c8649.getTextScaleX() * c8649.getTextSize();
            float fMo1895 = interfaceC8725.mo1895(j3);
            if (textScaleX != 0.0f) {
                c8649.setLetterSpacing(fMo1895 / textScaleX);
            }
        } else if (C8730.m13905(C8728.m13903(j3), 8589934592L)) {
            c8649.setLetterSpacing(C8728.m13902(j3));
        }
        long j4 = c28812.f6410;
        C8751 c8751 = c28812.f6411;
        boolean z5 = z && C8730.m13905(C8728.m13903(j3), 4294967296L) && C8728.m13902(j3) != 0.0f;
        long j5 = C2434.f5042;
        boolean z6 = (C2434.m3509(j4, j5) || C2434.m3509(j4, C2434.f5043)) ? false : true;
        boolean z7 = (c8751 == null || Float.compare(c8751.f22289, 0.0f) == 0) ? false : true;
        C2881 c28813 = (z5 || z6 || z7) ? new C2881(0L, 0L, (C2822) null, (C2824) null, (C2821) null, (AbstractC2827) null, (String) null, z5 ? j3 : C8728.f22211, z7 ? c8751 : null, (C8756) null, (C8661) null, z6 ? j4 : j5, (C8760) null, (C2405) null, 63103) : null;
        List list4 = this.f21703;
        if (c28813 != null) {
            int size5 = list4.size() + 1;
            ArrayList arrayList4 = new ArrayList(size5);
            int i16 = 0;
            while (i16 < size5) {
                arrayList4.add(i16 == 0 ? new C2884(c28813, 0, this.f21704.length()) : (C2884) this.f21703.get(i16 - 1));
                i16++;
            }
            list4 = arrayList4;
        }
        String str3 = this.f21704;
        float textSize = this.f21701.getTextSize();
        C2865 c28652 = this.f21702;
        List list5 = this.f21697;
        InterfaceC8725 interfaceC87254 = this.f21700;
        boolean z8 = this.f21694;
        C8653 c8653 = AbstractC8652.f21706;
        if (z8 && C8542.m13568()) {
            C2893 c2893 = c28652.f6327;
            C2905 c2905 = (c2893 == null || (c28892 = c2893.f6441) == null) ? null : new C2905(c28892.f6435);
            CharSequence charSequenceM13575 = C8542.m13569().m13575(0, str3.length(), (c2905 != null && c2905.f6479 == 2) ? 1 : 0, str3);
            charSequenceM13575.getClass();
            charSequence = charSequenceM13575;
        } else {
            charSequence = str3;
        }
        if (list4.isEmpty() && list5.isEmpty() && AbstractC5227.m9466(c28652.f6328.f6455, C8757.f22299)) {
            charSequence2 = charSequence;
            if ((c28652.f6328.f6456 & 1095216660480L) != 0) {
            }
        } else {
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            C2881 c28814 = c28652.f6329;
            C2898 c28982 = c28652.f6328;
            if (AbstractC5227.m9466(c28814.f6405, C8760.f22305)) {
                f = 0.0f;
                spannableString.setSpan(AbstractC8652.f21706, 0, str3.length(), 33);
            } else {
                f = 0.0f;
            }
            C2893 c28932 = c28652.f6327;
            if (((c28932 == null || (c2889 = c28932.f6441) == null) ? false : c2889.f6436) && c28982.f6453 == null) {
                float fM10578 = AbstractC5894.m10578(c28982.f6456, textSize, interfaceC87254);
                if (!Float.isNaN(fM10578)) {
                    spannableString.setSpan(new C8671(fM10578), 0, spannableString.length(), 33);
                }
                j = 0;
            } else {
                C8762 c8762 = c28982.f6453;
                c8762 = c8762 == null ? C8762.f22309 : c8762;
                j = 0;
                float fM105782 = AbstractC5894.m10578(c28982.f6456, textSize, interfaceC87254);
                if (!Float.isNaN(fM105782)) {
                    int length = (spannableString.length() == 0 || AbstractC5976.m10727(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i17 = c8762.f22311;
                    i2 = 0;
                    spannableString.setSpan(new C8670(fM105782, length, (i17 & 1) > 0, (i17 & 16) > 0, c8762.f22312, c8762.f22310), 0, spannableString.length(), 33);
                }
                c8757 = c28982.f6455;
                if (c8757 != null) {
                    long j6 = c8757.f22301;
                    long j7 = c8757.f22300;
                    int i18 = i2;
                    if ((!C8728.m13904(j6, AbstractC3400.m5640(i18)) || !C8728.m13904(j7, AbstractC3400.m5640(i18))) && (j6 & 1095216660480L) != j && (j7 & 1095216660480L) != j) {
                        long jM139032 = C8728.m13903(j6);
                        float fMo18952 = C8730.m13905(jM139032, 4294967296L) ? interfaceC87254.mo1895(j6) : C8730.m13905(jM139032, 8589934592L) ? C8728.m13902(j6) * textSize : f;
                        long jM139033 = C8728.m13903(j7);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fMo18952), (int) Math.ceil(C8730.m13905(jM139033, 4294967296L) ? interfaceC87254.mo1895(j7) : C8730.m13905(jM139033, 8589934592L) ? C8728.m13902(j7) * textSize : f)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list4.size());
                size = list4.size();
                for (i3 = 0; i3 < size; i3++) {
                    C2884 c2884 = (C2884) list4.get(i3);
                    Object obj4 = c2884.f6422;
                    if (obj4 instanceof C2881) {
                        C2881 c28815 = (C2881) obj4;
                        if (c28815.f6398 != null || c28815.f6400 != null || c28815.f6401 != null || ((C2881) obj4).f6399 != null) {
                            arrayList.add(c2884);
                        }
                    }
                }
                C2881 c28816 = c28652.f6329;
                AbstractC2827 abstractC28272 = c28816.f6398;
                C2881 c28817 = (abstractC28272 != null && c28816.f6400 == null && c28816.f6401 == null && c28816.f6399 == null) ? null : new C2881(0L, 0L, c28816.f6401, c28816.f6400, c28816.f6399, abstractC28272, (String) null, 0L, (C8751) null, (C8756) null, (C8661) null, 0L, (C8760) null, (C2405) null, 65475);
                C6807 c6807 = new C6807(spannableString, c8651, 3);
                if (arrayList.size() <= 1) {
                    int size6 = arrayList.size();
                    int i19 = size6 * 2;
                    int[] iArr2 = new int[i19];
                    int size7 = arrayList.size();
                    for (int i20 = 0; i20 < size7; i20++) {
                        C2884 c28842 = (C2884) arrayList.get(i20);
                        iArr2[i20] = c28842.f6421;
                        iArr2[i20 + size6] = c28842.f6420;
                    }
                    if (i19 > 1) {
                        Arrays.sort(iArr2);
                    }
                    if (i19 == 0) {
                        C5043.m9176("Array is empty.");
                        throw null;
                    }
                    int i21 = iArr2[0];
                    int i22 = 0;
                    while (i22 < i19) {
                        int i23 = iArr2[i22];
                        if (i23 == i21) {
                            arrayList2 = arrayList;
                            c2881 = c28817;
                            i4 = i19;
                            iArr = iArr2;
                        } else {
                            int size8 = arrayList.size();
                            c2881 = c28817;
                            int i24 = 0;
                            while (i24 < size8) {
                                ArrayList arrayList5 = arrayList;
                                C2884 c28843 = (C2884) arrayList.get(i24);
                                int i25 = i19;
                                int i26 = c28843.f6421;
                                int[] iArr3 = iArr2;
                                int i27 = c28843.f6420;
                                if (i26 != i27 && AbstractC2901.m4362(i21, i23, i26, i27)) {
                                    C2881 c28818 = (C2881) c28843.f6422;
                                    c28817 = c28817 != null ? c28817.m4323(c28818) : c28818;
                                }
                                i24++;
                                arrayList = arrayList5;
                                i19 = i25;
                                iArr2 = iArr3;
                            }
                            arrayList2 = arrayList;
                            i4 = i19;
                            iArr = iArr2;
                            if (c28817 != null) {
                                c6807.invoke(c28817, Integer.valueOf(i21), Integer.valueOf(i23));
                            }
                            i21 = i23;
                        }
                        i22++;
                        c28817 = c2881;
                        arrayList = arrayList2;
                        i19 = i4;
                        iArr2 = iArr;
                    }
                } else if (!arrayList.isEmpty()) {
                    C2881 c28819 = (C2881) ((C2884) arrayList.get(0)).f6422;
                    c6807.invoke(c28817 != null ? c28817.m4323(c28819) : c28819, Integer.valueOf(((C2884) arrayList.get(0)).f6421), Integer.valueOf(((C2884) arrayList.get(0)).f6420));
                }
                size2 = list4.size();
                i5 = 0;
                z2 = false;
                while (i5 < size2) {
                    C2884 c28844 = (C2884) list4.get(i5);
                    Object obj5 = c28844.f6422;
                    if (obj5 instanceof C2881) {
                        int i28 = c28844.f6421;
                        int i29 = c28844.f6420;
                        if (i28 < 0 || i28 >= spannableString.length() || i29 <= i28 || i29 > spannableString.length()) {
                            i8 = size2;
                            i9 = i5;
                            list3 = list4;
                            interfaceC87253 = interfaceC87254;
                        } else {
                            C2881 c288110 = (C2881) obj5;
                            long j8 = c288110.f6407;
                            C8751 c87512 = c288110.f6411;
                            InterfaceC8752 interfaceC87523 = c288110.f6403;
                            if (c87512 != null) {
                                i8 = size2;
                                i9 = i5;
                                spannableString.setSpan(new C8669(c87512.f22289, 0), i28, i29, 33);
                            } else {
                                i8 = size2;
                                i9 = i5;
                            }
                            AbstractC5894.m10577(spannableString, interfaceC87523.mo13976(), i28, i29);
                            AbstractC2433 abstractC2433Mo13975 = interfaceC87523.mo13975();
                            float fMo13977 = interfaceC87523.mo13977();
                            if (abstractC2433Mo13975 != null) {
                                if (abstractC2433Mo13975 instanceof C2406) {
                                    AbstractC5894.m10577(spannableString, ((C2406) abstractC2433Mo13975).f4965, i28, i29);
                                } else {
                                    spannableString.setSpan(new C8744((AbstractC2409) abstractC2433Mo13975, fMo13977), i28, i29, 33);
                                }
                            }
                            C8760 c8760 = c288110.f6405;
                            if (c8760 != null) {
                                int i30 = c8760.f22307;
                                C8672 c8672 = new C8672((i30 | 1) == i30, (i30 | 2) == i30);
                                i10 = 33;
                                spannableString.setSpan(c8672, i28, i29, 33);
                            } else {
                                i10 = 33;
                            }
                            int i31 = i10;
                            AbstractC5894.m10580(spannableString, c288110.f6402, interfaceC87254, i28, i29);
                            String str4 = c288110.f6408;
                            if (str4 != null) {
                                spannableString.setSpan(new C8668(str4, 0), i28, i29, i31);
                            }
                            C8756 c87562 = c288110.f6412;
                            if (c87562 != null) {
                                spannableString.setSpan(new ScaleXSpan(c87562.f22298), i28, i29, i31);
                                spannableString.setSpan(new C8669(c87562.f22297, 1), i28, i29, i31);
                            }
                            AbstractC5894.m10575(spannableString, c288110.f6409, i28, i29);
                            interfaceC87253 = interfaceC87254;
                            long j9 = c288110.f6410;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(AbstractC2416.m3433(j9)), i28, i29, i31);
                            }
                            C2405 c2405 = c288110.f6404;
                            if (c2405 != null) {
                                long j10 = c2405.f4963;
                                list3 = list4;
                                int iM3433 = AbstractC2416.m3433(c2405.f4964);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f2 = c2405.f4962;
                                C8674 c8674 = new C8674(fIntBitsToFloat, fIntBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2, iM3433);
                                i28 = i28;
                                i31 = 33;
                                spannableString.setSpan(c8674, i28, i29, 33);
                            } else {
                                list3 = list4;
                            }
                            AbstractC2340 abstractC2340 = c288110.f6406;
                            if (abstractC2340 != null) {
                                spannableString.setSpan(new C8745(abstractC2340), i28, i29, i31);
                            }
                            if (C8730.m13905(C8728.m13903(j8), 4294967296L) || C8730.m13905(C8728.m13903(j8), 8589934592L)) {
                                z2 = true;
                            }
                        }
                    }
                    i5 = i9 + 1;
                    list4 = list3;
                    interfaceC87254 = interfaceC87253;
                    size2 = i8;
                }
                List list6 = list4;
                InterfaceC8725 interfaceC87255 = interfaceC87254;
                if (z2) {
                    int size9 = list6.size();
                    int i32 = 0;
                    while (i32 < size9) {
                        List list7 = list6;
                        C2884 c28845 = (C2884) list7.get(i32);
                        InterfaceC2887 interfaceC2887 = (InterfaceC2887) c28845.f6422;
                        if (interfaceC2887 instanceof C2881) {
                            int i33 = c28845.f6421;
                            int i34 = c28845.f6420;
                            if (i33 < 0 || i33 >= spannableString.length() || i34 <= i33 || i34 > spannableString.length()) {
                                i7 = size9;
                                interfaceC87252 = interfaceC87255;
                            } else {
                                long j11 = ((C2881) interfaceC2887).f6407;
                                long jM139034 = C8728.m13903(j11);
                                InterfaceC8725 interfaceC87256 = interfaceC87255;
                                i7 = size9;
                                if (C8730.m13905(jM139034, 4294967296L)) {
                                    interfaceC87252 = interfaceC87256;
                                    c8665 = new C8664(interfaceC87252.mo1895(j11));
                                } else {
                                    interfaceC87252 = interfaceC87256;
                                    c8665 = C8730.m13905(jM139034, 8589934592L) ? new C8665(C8728.m13902(j11)) : null;
                                }
                                if (c8665 != null) {
                                    spannableString.setSpan(c8665, i33, i34, 33);
                                }
                            }
                        }
                        i32++;
                        interfaceC87255 = interfaceC87252;
                        size9 = i7;
                        list6 = list7;
                    }
                }
                List list8 = list6;
                InterfaceC8725 interfaceC87257 = interfaceC87255;
                c87572 = c28982.f6455;
                if (c87572 != null) {
                    long j12 = c87572.f22301;
                    long jM139035 = C8728.m13903(j12);
                    if (C8730.m13905(jM139035, 4294967296L)) {
                        interfaceC87257.mo1895(j12);
                    } else if (C8730.m13905(jM139035, 8589934592L)) {
                        C8728.m13902(j12);
                    }
                }
                size3 = list8.size();
                for (i6 = 0; i6 < size3; i6++) {
                    Object obj6 = ((C2884) list8.get(i6)).f6422;
                }
                charSequence2 = spannableString;
                if (list5.size() > 0) {
                    C2884 c28846 = (C2884) list5.get(0);
                    if (c28846.f6422 != null) {
                        C3775.m6954();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(c28846.f6421, c28846.f6420, C8529.class)) {
                        spannableString.removeSpan((C8529) obj7);
                    }
                    throw null;
                }
            }
            i2 = 0;
            c8757 = c28982.f6455;
            if (c8757 != null) {
            }
            arrayList = new ArrayList(list4.size());
            size = list4.size();
            while (i3 < size) {
            }
            C2881 c288162 = c28652.f6329;
            AbstractC2827 abstractC282722 = c288162.f6398;
            if (abstractC282722 != null) {
                C6807 c68072 = new C6807(spannableString, c8651, 3);
                if (arrayList.size() <= 1) {
                }
                size2 = list4.size();
                i5 = 0;
                z2 = false;
                while (i5 < size2) {
                }
                List list62 = list4;
                InterfaceC8725 interfaceC872552 = interfaceC87254;
                if (z2) {
                }
                List list82 = list62;
                InterfaceC8725 interfaceC872572 = interfaceC872552;
                c87572 = c28982.f6455;
                if (c87572 != null) {
                }
                size3 = list82.size();
                while (i6 < size3) {
                }
                charSequence2 = spannableString;
                if (list5.size() > 0) {
                }
            }
        }
        this.f21698 = charSequence2;
        this.f21699 = new C8770(charSequence2, this.f21701, this.f21693);
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo2713() {
        return this.f21699.m13985();
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2714() {
        C8770 c8770 = this.f21699;
        float f = c8770.f22322;
        TextPaint textPaint = c8770.f22325;
        if (!Float.isNaN(f)) {
            return c8770.f22322;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c8770.f22326;
        lineInstance.setText(new C8774(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC8777.f22342);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C7348(i, next, 1));
            } else {
                C7348 c7348 = (C7348) priorityQueue.peek();
                if (c7348 != null && c7348.f18161 - c7348.f18163 < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C7348(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                C3466.m5896();
                return 0.0f;
            }
            C7348 c73482 = (C7348) it.next();
            desiredWidth = Layout.getDesiredWidth(c8770.m13986(), c73482.f18163, c73482.f18161, textPaint);
            while (it.hasNext()) {
                C7348 c73483 = (C7348) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c8770.m13986(), c73483.f18163, c73483.f18161, textPaint));
            }
        }
        c8770.f22322 = desiredWidth;
        return desiredWidth;
    }

    @Override // androidx.compose.p001ui.text.InterfaceC2897
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo2715() {
        C0955 c0955 = this.f21695;
        if (c0955 != null ? c0955.m936() : false) {
            return true;
        }
        if (!this.f21694 && AbstractC8659.m13754(this.f21702)) {
            C6686 c6686 = C8658.f21714;
            C6686 c66862 = C8658.f21714;
            InterfaceC2168 interfaceC2168M11817 = (InterfaceC2168) c66862.f16359;
            if (interfaceC2168M11817 == null) {
                if (C8542.m13568()) {
                    interfaceC2168M11817 = c66862.m11817();
                    c66862.f16359 = interfaceC2168M11817;
                } else {
                    interfaceC2168M11817 = AbstractC8659.f21715;
                }
            }
            if (((Boolean) interfaceC2168M11817.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
