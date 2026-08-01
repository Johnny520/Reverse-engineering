package p053;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0225;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.core.os.AbstractC2175;
import androidx.core.os.AbstractC2179;
import androidx.core.widget.ActionModeCallbackC2299;
import androidx.window.area.AbstractC2567;
import bsh.C2633;
import com.bumptech.glide.AbstractC3057;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4211;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.AbstractC4982;
import kotlin.reflect.jvm.internal.AbstractC5007;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.C4980;
import kotlin.reflect.jvm.internal.C5004;
import kotlin.reflect.jvm.internal.C5041;
import kotlin.reflect.jvm.internal.C5070;
import kotlin.reflect.jvm.internal.InterfaceC5075;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.sequences.C5128;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.C5554;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6128;
import p007.C6131;
import p007.C6132;
import p009.AbstractC6183;
import p013.C6227;
import p033.AbstractC6336;
import p034.AbstractC6344;
import p034.AbstractC6347;
import p048.C6517;
import p048.C6519;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p074.C6946;
import p087.C7127;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7191;
import p152.C7593;
import p153.C7602;
import p161.C7639;
import p205.AbstractC7897;
import p236.C8098;
import p253.AbstractC8190;
import p263.AbstractC8256;
import p263.C8255;
import p266.C8263;
import p266.C8264;
import p287.AbstractC8405;
import p346.AbstractC8837;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6561 implements InterfaceC7186, InterfaceC7188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean f17936 = true;

    public AbstractC6561() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static TypedValue m12040(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C8098 m12041(CharSequence charSequence) {
        charSequence.getClass();
        List listM10144 = AbstractC5144.m10144(charSequence, new String[]{"/", "."}, 6);
        if (listM10144.size() != 3) {
            C4211.m8615(charSequence, "Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ");
            return null;
        }
        String str = (String) listM10144.get(0);
        String str2 = (String) listM10144.get(1);
        String str3 = (String) listM10144.get(2);
        int i = Integer.parseInt(str2);
        int i2 = Integer.parseInt(str3);
        str.getClass();
        return (str.equals("HTTP") && i == 1 && i2 == 0) ? C8098.f22360 : (str.equals("HTTP") && i == 1 && i2 == 1) ? C8098.f22361 : (str.equals("HTTP") && i == 2 && i2 == 0) ? C8098.f22362 : new C8098(str, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m12042(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m12042(file.getParentFile());
        file.mkdir();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static C6946 m12043(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C6519 c6519 = new C6519(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c6519, 10));
        Iterator it = c6519.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                int[] iArrM8798 = AbstractC4344.m8798(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrM8798, iArrM8798.length);
                return new C6946(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            c6517.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C4691 m12044(C4691 c4691, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c4691.f13704) {
            String strM9334 = c4691.m9334();
            if (AbstractC5139.m10139(strM9334, str, false) && strM9334.length() != str.length() && ('a' > (cCharAt = strM9334.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C4691.m9330(str2.concat(AbstractC5144.m10147(strM9334, str)));
                }
                if (!z) {
                    return c4691;
                }
                String strM10147 = AbstractC5144.m10147(strM9334, str);
                if (strM10147.length() != 0 && AbstractC5062.m10025(0, strM10147)) {
                    if (strM10147.length() != 1 && AbstractC5062.m10025(1, strM10147)) {
                        Iterator it = new C6519(0, strM10147.length() - 1, 1).iterator();
                        while (true) {
                            C6517 c6517 = (C6517) it;
                            if (!c6517.f17823) {
                                next = null;
                                break;
                            }
                            next = c6517.next();
                            if (!AbstractC5062.m10025(((Number) next).intValue(), strM10147)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strM10147 = AbstractC5062.m10015(strM10147.substring(0, iIntValue)).concat(strM10147.substring(iIntValue));
                        } else {
                            strM10147 = AbstractC5062.m10015(strM10147);
                        }
                    } else if (strM10147.length() != 0 && 'A' <= (cCharAt2 = strM10147.charAt(0)) && cCharAt2 < '[') {
                        strM10147 = Character.toLowerCase(cCharAt2) + strM10147.substring(1);
                    }
                }
                if (C4691.m9329(strM10147)) {
                    return C4691.m9330(strM10147);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C5128 m12045(InterfaceC6554 interfaceC6554) {
        C5128 c5128 = new C5128();
        c5128.f14668 = AbstractC2567.m5091(interfaceC6554, c5128, c5128);
        return c5128;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static C7593 m12046(C0225 c0225) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C7593(AbstractC2179.m3976(c0225));
        }
        TextPaint textPaint = new TextPaint(c0225.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0225.getBreakStrategy();
        int hyphenationFrequency = c0225.getHyphenationFrequency();
        if (c0225.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c0225.getInputType() & 15) != 3) {
            boolean z = c0225.getLayoutDirection() == 1;
            switch (c0225.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC2179.m3978(DecimalFormatSymbols.getInstance(c0225.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C7593(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static ArrayList m12047() {
        ArrayList arrayList = new ArrayList();
        Object objM11587 = AbstractC6183.m11587(984);
        C9092 c9092M14672 = C9092.m14672(objM11587.getClass());
        c9092M14672.f25481 = AbstractC8405.m13972(985);
        for (Object obj : (List) c9092M14672.m14674(objM11587, new Object[0])) {
            GroupInfo groupInfo = new GroupInfo();
            String str = (String) XposedHelpers.getObjectField(obj, AbstractC8405.m13972(1223));
            String str2 = (String) XposedHelpers.getObjectField(obj, AbstractC8405.m13972(1228));
            String uidFromUin = QQEnvTool.getUidFromUin((String) XposedHelpers.getObjectField(obj, AbstractC8405.m13972(1229)));
            groupInfo.GroupUin = str;
            groupInfo.GroupName = str2;
            groupInfo.GroupOwner = uidFromUin;
            groupInfo.IsOwnerOrAdmin = AbstractC8837.m14502(obj);
            String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(1230), obj);
            ArrayList<String> arrayList2 = new ArrayList<>();
            if (str3 != null) {
                for (String str4 : str3.split(AbstractC8405.m13973("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
                    if (!TextUtils.isEmpty(str4)) {
                        arrayList2.add(str4);
                    }
                }
            } else {
                arrayList2.addAll(AbstractC8837.m14503(groupInfo.GroupUin));
            }
            arrayList2.add(groupInfo.GroupOwner);
            groupInfo.AdminList = arrayList2;
            groupInfo.sourceInfo = obj;
            arrayList.add(groupInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static C8263 m12048(double d, double d2) {
        C8255 c8255M13823;
        C8264 c8264 = new C8264(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                c8255M13823 = AbstractC8256.m13823(c8264.f22881, c8264.f22880, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = c8264.m13828(i3) < c8264.m13828(i4);
            if (c8264.m13828(i3) >= c8264.f22880 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        c8255M13823 = AbstractC8256.m13823(c8264.f22881, c8264.f22880, i2);
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new C8263(d, d2, c8255M13823);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static long m12049(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7897.m13328(i6);
                    C4211.m8602();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC7897.m13325(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static long m12050(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC7897.m13328(i6);
                    C4211.m8602();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC7897.m13325(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m12051(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            C2633.m5339(AbstractC8405.m13972(54));
            return;
        }
        if (!file.isDirectory()) {
            C2633.m5339(AbstractC8405.m13972(55));
            return;
        }
        File file2 = new File(str2);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
        m12052(file, "", zipOutputStream);
        zipOutputStream.close();
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m12052(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isDirectory()) {
            StringBuilder sbM140 = AbstractC0053.m140(str);
            sbM140.append(file.getName());
            sbM140.append(AbstractC8405.m13973("喵呜喵呜呜呜喵喵"));
            String string = sbM140.toString();
            zipOutputStream.putNextEntry(new ZipEntry(string));
            for (File file2 : file.listFiles()) {
                m12052(file2, string, zipOutputStream);
            }
            return;
        }
        StringBuilder sbM1402 = AbstractC0053.m140(str);
        sbM1402.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(sbM1402.toString()));
        byte[] bArr = new byte[10240];
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 10240);
        while (true) {
            int i = bufferedInputStream.read(bArr, 0, 10240);
            if (i == -1) {
                bufferedInputStream.close();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m12053(int i) {
        return i == 10 ? "newline" : i == 9 ? "tab" : i == -1 ? "end of file" : (i < 0 || i > 31) ? String.format("%c", Integer.valueOf(i)) : String.format("control character 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m12054(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C1950 c1950;
        C1953 c1953;
        C1941 c1941;
        InterfaceC6558 interfaceC6558;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM1852 = AbstractC0921.m1852(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM1852 != null && (value = viewTranslationResponseM1852.getValue("android:text")) != null && (text = value.getText()) != null && (c1950 = (C1950) viewOnAttachStateChangeListenerC1421.m2547().m833((int) jKeyAt)) != null && (c1953 = c1950.f5761) != null && (c1941 = (C1941) AbstractC1957.m3673(c1953.f5769, AbstractC1959.f5809)) != null && (interfaceC6558 = (InterfaceC6558) c1941.f5706) != null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List m12055(AbstractC5007 abstractC5007, List list, C4534 c4534, List list2, C5070 c5070, boolean z) {
        abstractC5007.getClass();
        list.getClass();
        list2.getClass();
        c5070.getClass();
        ListBuilder listBuilderM11911 = AbstractC6347.m11911();
        if (z) {
            InterfaceC5091 interfaceC5091Mo9943 = abstractC5007.mo9943();
            if (interfaceC5091Mo9943 instanceof C5004) {
                if (AbstractC5062.m10040(abstractC5007)) {
                    if (((C5004) interfaceC5091Mo9943).mo8882()) {
                        Class<?> declaringClass = AbstractC3057.m6756((InterfaceC5093) interfaceC5091Mo9943).getDeclaringClass();
                        declaringClass.getClass();
                        listBuilderM11911.add(new C5041(abstractC5007, AbstractC4396.f12975.mo8917(declaringClass)));
                    }
                } else if (!(abstractC5007 instanceof AbstractC4982) || !AbstractC8190.m13698((InterfaceC5075) abstractC5007)) {
                    C5554.m10872(abstractC5007, "Only top-level callables are supported for now: ");
                    return null;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listBuilderM11911.add(new C4980(abstractC5007, (C4526) it.next(), listBuilderM11911.size(), KParameter$Kind.CONTEXT, c5070));
            }
            if (c4534 != null) {
                String strM9335 = AbstractC4692.f13708.m9335();
                strM9335.getClass();
                C4526 c4526 = new C4526(0, strM9335);
                c4526.f13186 = c4534;
                listBuilderM11911.add(new C4980(abstractC5007, c4526, listBuilderM11911.size(), KParameter$Kind.EXTENSION_RECEIVER, c5070));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            listBuilderM11911.add(new C4980(abstractC5007, (C4526) it2.next(), listBuilderM11911.size(), KParameter$Kind.VALUE, c5070));
        }
        return listBuilderM11911.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m12056(TextView textView, int i) {
        AbstractC6344.m11871(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2179.m3975(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static long m12057(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C5925.m11310("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static int m12058(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C5925.m11310("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static TypedValue m12059(View view, int i) {
        return m12067(view.getContext(), view.getClass().getCanonicalName(), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static ActionMode.Callback m12060(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC2299) || callback == null) ? callback : new ActionModeCallbackC2299(callback, textView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static void m12061(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2175.m3972(viewGroup, z);
        } else if (f17936) {
            try {
                AbstractC2175.m3972(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f17936 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static final C6131 m12062(C6131 c6131) {
        c6131.getClass();
        C6132 c6132M11520 = c6131.m11520();
        AbstractC6128 abstractC6128 = c6131.f16770;
        c6132M11520.f16784 = new C6227(abstractC6128.mo11165(), abstractC6128.mo11166());
        return c6132M11520.m11522();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m12063(String str, String str2) throws Exception {
        File file = new File(str2);
        if (!file.exists() && !file.mkdir()) {
            throw new Exception(AbstractC8405.m13972(50));
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            if (nextEntry.isDirectory()) {
                StringBuilder sbM140 = AbstractC0053.m140(str2);
                sbM140.append(File.separator);
                sbM140.append(nextEntry.getName());
                m12042(new File(sbM140.toString()));
            } else {
                StringBuilder sbM1402 = AbstractC0053.m140(str2);
                sbM1402.append(File.separator);
                sbM1402.append(nextEntry.getName());
                String string = sbM1402.toString();
                m12042(new File(string).getParentFile());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = zipInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.close();
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final String m12064(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static void m12065(TextView textView, int i) {
        AbstractC6344.m11871(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static void m12066(TextView textView, int i) {
        AbstractC6344.m11871(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static TypedValue m12067(Context context, String str, int i) {
        TypedValue typedValueM12040 = m12040(context.getTheme(), i);
        if (typedValueM12040 != null) {
            return typedValueM12040;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static boolean m12068(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueM12040 = m12040(theme, i);
        return (typedValueM12040 == null || typedValueM12040.type != 18) ? z : typedValueM12040.data != 0;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public void mo10645(int i) {
        m12069(Integer.valueOf(i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public void mo10719(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        mo10708(interfaceC7191, i);
        mo10705(interfaceC7184, obj);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public void mo10720(C7127 c7127, int i, char c) {
        c7127.getClass();
        mo10708(c7127, i);
        mo10707(c);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo10721(C7127 c7127, int i, byte b) {
        c7127.getClass();
        mo10708(c7127, i);
        mo10647(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m12069(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(cls));
        sb.append(" is not supported by ");
        sb.append(c4397.mo8917(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo10706(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        m12069(Integer.valueOf(i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo10707(char c) {
        m12069(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo10708(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo10722(InterfaceC7191 interfaceC7191, int i, long j) {
        interfaceC7191.getClass();
        mo10708(interfaceC7191, i);
        mo10651(j);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo10709() {
        throw new SerializationException("'null' is not supported by default");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract List mo11444(String str, List list);

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo10711(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo10725(C7127 c7127, int i, short s) {
        c7127.getClass();
        mo10708(c7127, i);
        mo10648(s);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo10726(C7127 c7127, int i, float f) {
        c7127.getClass();
        mo10708(c7127, i);
        mo10712(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract Typeface mo12070(Context context, Resources resources, int i, String str);

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo10712(float f) {
        m12069(Float.valueOf(f));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo10729(int i, int i2, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        mo10708(interfaceC7191, i);
        mo10645(i2);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo10714(boolean z) {
        m12069(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Typeface mo12071(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo10715(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        mo10708(interfaceC7191, i);
        m12436(interfaceC7184, obj);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public InterfaceC7186 mo10716(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract Typeface mo12072(Context context, C7602[] c7602Arr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract Typeface mo12073(Context context, C7639 c7639, Resources resources, int i);

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public InterfaceC7186 mo10734(C7127 c7127, int i) {
        c7127.getClass();
        mo10708(c7127, i);
        return mo10716(c7127.mo12383(i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo10647(byte b) {
        m12069(Byte.valueOf(b));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo10717(double d) {
        m12069(Double.valueOf(d));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo10648(short s) {
        m12069(Short.valueOf(s));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public void mo10649(String str) {
        str.getClass();
        m12069(str);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public void mo10735(InterfaceC7191 interfaceC7191, int i, String str) {
        interfaceC7191.getClass();
        str.getClass();
        mo10708(interfaceC7191, i);
        mo10649(str);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public void mo10736(C7127 c7127, int i, double d) {
        c7127.getClass();
        mo10708(c7127, i);
        mo10717(d);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public void mo10737(InterfaceC7191 interfaceC7191, int i, boolean z) {
        interfaceC7191.getClass();
        mo10708(interfaceC7191, i);
        mo10714(z);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public void mo10651(long j) {
        m12069(Long.valueOf(j));
    }
}
