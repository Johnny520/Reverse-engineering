package p069;

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
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1072;
import androidx.compose.foundation.text.selection.AbstractC1759;
import androidx.compose.p001ui.contentcapture.ViewOnAttachStateChangeListenerC2256;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2788;
import androidx.core.os.AbstractC3008;
import androidx.core.os.AbstractC3012;
import androidx.core.widget.ActionModeCallbackC3132;
import androidx.window.area.AbstractC3400;
import bsh.C3466;
import com.bumptech.glide.AbstractC3889;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C5043;
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
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.AbstractC5814;
import kotlin.reflect.jvm.internal.AbstractC5839;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.C5812;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5873;
import kotlin.reflect.jvm.internal.C5902;
import kotlin.reflect.jvm.internal.InterfaceC5907;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5358;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.sequences.C5960;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.C6385;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p023.AbstractC6957;
import p023.C6960;
import p023.C6961;
import p025.AbstractC7012;
import p029.C7056;
import p049.AbstractC7165;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p064.C7346;
import p064.C7348;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p090.C7775;
import p103.C7956;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p107.InterfaceC8020;
import p168.C8422;
import p169.C8431;
import p177.C8468;
import p221.AbstractC8726;
import p252.C8927;
import p269.AbstractC9019;
import p279.AbstractC9085;
import p279.C9084;
import p282.C9092;
import p282.C9093;
import p303.AbstractC9234;
import p362.AbstractC9666;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7390 implements InterfaceC8015, InterfaceC8017 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean f18281 = true;

    public AbstractC7390() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static TypedValue m12599(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static C8927 m12600(CharSequence charSequence) {
        charSequence.getClass();
        List listM10703 = AbstractC5976.m10703(charSequence, new String[]{"/", "."}, 6);
        if (listM10703.size() != 3) {
            C5043.m9174(charSequence, "Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ");
            return null;
        }
        String str = (String) listM10703.get(0);
        String str2 = (String) listM10703.get(1);
        String str3 = (String) listM10703.get(2);
        int i = Integer.parseInt(str2);
        int i2 = Integer.parseInt(str3);
        str.getClass();
        return (str.equals("HTTP") && i == 1 && i2 == 0) ? C8927.f22705 : (str.equals("HTTP") && i == 1 && i2 == 1) ? C8927.f22706 : (str.equals("HTTP") && i == 2 && i2 == 0) ? C8927.f22707 : new C8927(str, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m12601(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m12601(file.getParentFile());
        file.mkdir();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static C7775 m12602(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C7348 c7348 = new C7348(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c7348, 10));
        Iterator it = c7348.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                int[] iArrM9357 = AbstractC5176.m9357(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrM9357, iArrM9357.length);
                return new C7775(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            c7346.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static C5523 m12603(C5523 c5523, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c5523.f14049) {
            String strM9893 = c5523.m9893();
            if (AbstractC5971.m10698(strM9893, str, false) && strM9893.length() != str.length() && ('a' > (cCharAt = strM9893.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C5523.m9889(str2.concat(AbstractC5976.m10706(strM9893, str)));
                }
                if (!z) {
                    return c5523;
                }
                String strM10706 = AbstractC5976.m10706(strM9893, str);
                if (strM10706.length() != 0 && AbstractC5894.m10584(0, strM10706)) {
                    if (strM10706.length() != 1 && AbstractC5894.m10584(1, strM10706)) {
                        Iterator it = new C7348(0, strM10706.length() - 1, 1).iterator();
                        while (true) {
                            C7346 c7346 = (C7346) it;
                            if (!c7346.f18168) {
                                next = null;
                                break;
                            }
                            next = c7346.next();
                            if (!AbstractC5894.m10584(((Number) next).intValue(), strM10706)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strM10706 = AbstractC5894.m10574(strM10706.substring(0, iIntValue)).concat(strM10706.substring(iIntValue));
                        } else {
                            strM10706 = AbstractC5894.m10574(strM10706);
                        }
                    } else if (strM10706.length() != 0 && 'A' <= (cCharAt2 = strM10706.charAt(0)) && cCharAt2 < '[') {
                        strM10706 = Character.toLowerCase(cCharAt2) + strM10706.substring(1);
                    }
                }
                if (C5523.m9888(strM10706)) {
                    return C5523.m9889(strM10706);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static C5960 m12604(InterfaceC7383 interfaceC7383) {
        C5960 c5960 = new C5960();
        c5960.f15013 = AbstractC3400.m5651(interfaceC7383, c5960, c5960);
        return c5960;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static C8422 m12605(C1072 c1072) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C8422(AbstractC3012.m4536(c1072));
        }
        TextPaint textPaint = new TextPaint(c1072.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1072.getBreakStrategy();
        int hyphenationFrequency = c1072.getHyphenationFrequency();
        if (c1072.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c1072.getInputType() & 15) != 3) {
            boolean z = c1072.getLayoutDirection() == 1;
            switch (c1072.getTextDirection()) {
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
            byte directionality = Character.getDirectionality(AbstractC3012.m4538(DecimalFormatSymbols.getInstance(c1072.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C8422(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static ArrayList m12606() {
        ArrayList arrayList = new ArrayList();
        Object objM12146 = AbstractC7012.m12146(984);
        C9921 c9921M15231 = C9921.m15231(objM12146.getClass());
        c9921M15231.f25826 = AbstractC9234.m14531(985);
        for (Object obj : (List) c9921M15231.m15233(objM12146, new Object[0])) {
            GroupInfo groupInfo = new GroupInfo();
            String str = (String) XposedHelpers.getObjectField(obj, AbstractC9234.m14531(1223));
            String str2 = (String) XposedHelpers.getObjectField(obj, AbstractC9234.m14531(1228));
            String uidFromUin = QQEnvTool.getUidFromUin((String) XposedHelpers.getObjectField(obj, AbstractC9234.m14531(1229)));
            groupInfo.GroupUin = str;
            groupInfo.GroupName = str2;
            groupInfo.GroupOwner = uidFromUin;
            groupInfo.IsOwnerOrAdmin = AbstractC9666.m15061(obj);
            String str3 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(1230), obj);
            ArrayList<String> arrayList2 = new ArrayList<>();
            if (str3 != null) {
                for (String str4 : str3.split(AbstractC9234.m14532("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
                    if (!TextUtils.isEmpty(str4)) {
                        arrayList2.add(str4);
                    }
                }
            } else {
                arrayList2.addAll(AbstractC9666.m15062(groupInfo.GroupUin));
            }
            arrayList2.add(groupInfo.GroupOwner);
            groupInfo.AdminList = arrayList2;
            groupInfo.sourceInfo = obj;
            arrayList.add(groupInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static C9092 m12607(double d, double d2) {
        C9084 c9084M14382;
        C9093 c9093 = new C9093(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                c9084M14382 = AbstractC9085.m14382(c9093.f23226, c9093.f23225, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = c9093.m14387(i3) < c9093.m14387(i4);
            if (c9093.m14387(i3) >= c9093.f23225 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        c9084M14382 = AbstractC9085.m14382(c9093.f23226, c9093.f23225, i2);
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
        return new C9092(d, d2, c9084M14382);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static long m12608(int i, int i2, int i3, int i4) {
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
                    AbstractC8726.m13887(i6);
                    C5043.m9161();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC8726.m13884(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static long m12609(int i, int i2, int i3, int i4) {
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
                    AbstractC8726.m13887(i6);
                    C5043.m9161();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC8726.m13884(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m12610(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            C3466.m5899(AbstractC9234.m14531(54));
            return;
        }
        if (!file.isDirectory()) {
            C3466.m5899(AbstractC9234.m14531(55));
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
        m12611(file, "", zipOutputStream);
        zipOutputStream.close();
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m12611(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isDirectory()) {
            StringBuilder sbM700 = AbstractC0900.m700(str);
            sbM700.append(file.getName());
            sbM700.append(AbstractC9234.m14532("喵呜喵呜呜呜喵喵"));
            String string = sbM700.toString();
            zipOutputStream.putNextEntry(new ZipEntry(string));
            for (File file2 : file.listFiles()) {
                m12611(file2, string, zipOutputStream);
            }
            return;
        }
        StringBuilder sbM7002 = AbstractC0900.m700(str);
        sbM7002.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(sbM7002.toString()));
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
    public static String m12612(int i) {
        return i == 10 ? "newline" : i == 9 ? "tab" : i == -1 ? "end of file" : (i < 0 || i > 31) ? String.format("%c", Integer.valueOf(i)) : String.format("control character 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m12613(ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C2785 c2785;
        C2788 c2788;
        C2776 c2776;
        InterfaceC7387 interfaceC7387;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM2412 = AbstractC1759.m2412(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM2412 != null && (value = viewTranslationResponseM2412.getValue("android:text")) != null && (text = value.getText()) != null && (c2785 = (C2785) viewOnAttachStateChangeListenerC2256.m3107().m1393((int) jKeyAt)) != null && (c2788 = c2785.f6106) != null && (c2776 = (C2776) AbstractC2792.m4233(c2788.f6114, AbstractC2794.f6154)) != null && (interfaceC7387 = (InterfaceC7387) c2776.f6051) != null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List m12614(AbstractC5839 abstractC5839, List list, C5366 c5366, List list2, C5902 c5902, boolean z) {
        abstractC5839.getClass();
        list.getClass();
        list2.getClass();
        c5902.getClass();
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        if (z) {
            InterfaceC5923 interfaceC5923Mo10502 = abstractC5839.mo10502();
            if (interfaceC5923Mo10502 instanceof C5836) {
                if (AbstractC5894.m10599(abstractC5839)) {
                    if (((C5836) interfaceC5923Mo10502).mo9441()) {
                        Class<?> declaringClass = AbstractC3889.m7316((InterfaceC5925) interfaceC5923Mo10502).getDeclaringClass();
                        declaringClass.getClass();
                        listBuilderM12470.add(new C5873(abstractC5839, AbstractC5228.f13320.mo9476(declaringClass)));
                    }
                } else if (!(abstractC5839 instanceof AbstractC5814) || !AbstractC9019.m14257((InterfaceC5907) abstractC5839)) {
                    C6385.m11431(abstractC5839, "Only top-level callables are supported for now: ");
                    return null;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listBuilderM12470.add(new C5812(abstractC5839, (C5358) it.next(), listBuilderM12470.size(), KParameter$Kind.CONTEXT, c5902));
            }
            if (c5366 != null) {
                String strM9894 = AbstractC5524.f14053.m9894();
                strM9894.getClass();
                C5358 c5358 = new C5358(0, strM9894);
                c5358.f13531 = c5366;
                listBuilderM12470.add(new C5812(abstractC5839, c5358, listBuilderM12470.size(), KParameter$Kind.EXTENSION_RECEIVER, c5902));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            listBuilderM12470.add(new C5812(abstractC5839, (C5358) it2.next(), listBuilderM12470.size(), KParameter$Kind.VALUE, c5902));
        }
        return listBuilderM12470.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m12615(TextView textView, int i) {
        AbstractC7173.m12430(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC3012.m4535(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static long m12616(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C6755.m11869("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static int m12617(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C6755.m11869("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static TypedValue m12618(View view, int i) {
        return m12626(view.getContext(), view.getClass().getCanonicalName(), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static ActionMode.Callback m12619(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC3132) || callback == null) ? callback : new ActionModeCallbackC3132(callback, textView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static void m12620(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3008.m4532(viewGroup, z);
        } else if (f18281) {
            try {
                AbstractC3008.m4532(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f18281 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static final C6960 m12621(C6960 c6960) {
        c6960.getClass();
        C6961 c6961M12079 = c6960.m12079();
        AbstractC6957 abstractC6957 = c6960.f17115;
        c6961M12079.f17129 = new C7056(abstractC6957.mo11724(), abstractC6957.mo11725());
        return c6961M12079.m12081();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m12622(String str, String str2) throws Exception {
        File file = new File(str2);
        if (!file.exists() && !file.mkdir()) {
            throw new Exception(AbstractC9234.m14531(50));
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            if (nextEntry.isDirectory()) {
                StringBuilder sbM700 = AbstractC0900.m700(str2);
                sbM700.append(File.separator);
                sbM700.append(nextEntry.getName());
                m12601(new File(sbM700.toString()));
            } else {
                StringBuilder sbM7002 = AbstractC0900.m700(str2);
                sbM7002.append(File.separator);
                sbM7002.append(nextEntry.getName());
                String string = sbM7002.toString();
                m12601(new File(string).getParentFile());
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
    public static final String m12623(float f) {
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
    public static void m12624(TextView textView, int i) {
        AbstractC7173.m12430(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static void m12625(TextView textView, int i) {
        AbstractC7173.m12430(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static TypedValue m12626(Context context, String str, int i) {
        TypedValue typedValueM12599 = m12599(context.getTheme(), i);
        if (typedValueM12599 != null) {
            return typedValueM12599;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static boolean m12627(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueM12599 = m12599(theme, i);
        return (typedValueM12599 == null || typedValueM12599.type != 18) ? z : typedValueM12599.data != 0;
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public void mo11204(int i) {
        m12628(Integer.valueOf(i));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public void mo11278(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        mo11267(interfaceC8020, i);
        mo11264(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public void mo11279(C7956 c7956, int i, char c) {
        c7956.getClass();
        mo11267(c7956, i);
        mo11266(c);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo11280(C7956 c7956, int i, byte b) {
        c7956.getClass();
        mo11267(c7956, i);
        mo11206(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m12628(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(cls));
        sb.append(" is not supported by ");
        sb.append(c5229.mo9476(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo11265(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        m12628(Integer.valueOf(i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo11266(char c) {
        m12628(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo11267(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo11281(InterfaceC8020 interfaceC8020, int i, long j) {
        interfaceC8020.getClass();
        mo11267(interfaceC8020, i);
        mo11210(j);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo11268() {
        throw new SerializationException("'null' is not supported by default");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract List mo12003(String str, List list);

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo11270(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo11284(C7956 c7956, int i, short s) {
        c7956.getClass();
        mo11267(c7956, i);
        mo11207(s);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo11285(C7956 c7956, int i, float f) {
        c7956.getClass();
        mo11267(c7956, i);
        mo11271(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract Typeface mo12629(Context context, Resources resources, int i, String str);

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo11271(float f) {
        m12628(Float.valueOf(f));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo11288(int i, int i2, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        mo11267(interfaceC8020, i);
        mo11204(i2);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo11273(boolean z) {
        m12628(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Typeface mo12630(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo11274(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        mo11267(interfaceC8020, i);
        m12995(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract Typeface mo12631(Context context, C8431[] c8431Arr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract Typeface mo12632(Context context, C8468 c8468, Resources resources, int i);

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public InterfaceC8015 mo11293(C7956 c7956, int i) {
        c7956.getClass();
        mo11267(c7956, i);
        return mo11275(c7956.mo12942(i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo11206(byte b) {
        m12628(Byte.valueOf(b));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo11276(double d) {
        m12628(Double.valueOf(d));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo11207(short s) {
        m12628(Short.valueOf(s));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public void mo11208(String str) {
        str.getClass();
        m12628(str);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public void mo11294(InterfaceC8020 interfaceC8020, int i, String str) {
        interfaceC8020.getClass();
        str.getClass();
        mo11267(interfaceC8020, i);
        mo11208(str);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public void mo11295(C7956 c7956, int i, double d) {
        c7956.getClass();
        mo11267(c7956, i);
        mo11276(d);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public void mo11296(InterfaceC8020 interfaceC8020, int i, boolean z) {
        interfaceC8020.getClass();
        mo11267(interfaceC8020, i);
        mo11273(z);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public void mo11210(long j) {
        m12628(Long.valueOf(j));
    }
}
