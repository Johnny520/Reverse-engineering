package Yue;

import Yue.C5720;
import Yue.InterfaceC7144;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5720 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f1635 = new String[0];

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Comparator<C0848> f1636 = new Comparator() { // from class: Yue.ۥ۠ۧۢ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C5720.m17680((C5720.C0848) obj, (C5720.C0848) obj2);
        }
    };

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ */
    @InterfaceC7113(24)
    public static class C0847 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2401(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m2402(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ۟ */
    public static class C0848 {

        /* JADX INFO: renamed from: ۥ */
        public URLSpan f1637;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f1638;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f14133;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f14134;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5721 {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2400(@InterfaceC6391 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m17668(@InterfaceC6391 TextView textView, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str) {
        if (m17683()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            m17670(textView, pattern, str, null, null, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m17669(@InterfaceC6391 TextView textView, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str, @InterfaceC6490 Linkify.MatchFilter matchFilter, @InterfaceC6490 Linkify.TransformFilter transformFilter) {
        if (m17683()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            m17670(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m17670(@InterfaceC6391 TextView textView, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr, @InterfaceC6490 Linkify.MatchFilter matchFilter, @InterfaceC6490 Linkify.TransformFilter transformFilter) {
        if (m17683()) {
            C0847.m2401(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (m17674(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            m2400(textView);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m17671(@InterfaceC6391 Spannable spannable, int i) {
        if (m17683()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<C0848> arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m17678(arrayList, spannable, C6645.f17066, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            m17678(arrayList, spannable, C6645.f17070, new String[]{C5905.f1771}, null, null);
        }
        if ((i & 8) != 0) {
            m17679(arrayList, spannable);
        }
        m17682(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (C0848 c0848 : arrayList) {
            if (c0848.f1637 == null) {
                m17676(c0848.f1638, c0848.f14133, c0848.f14134, spannable);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m17672(@InterfaceC6391 Spannable spannable, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str) {
        return m17683() ? Linkify.addLinks(spannable, pattern, str) : m17674(spannable, pattern, str, null, null, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m17673(@InterfaceC6391 Spannable spannable, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str, @InterfaceC6490 Linkify.MatchFilter matchFilter, @InterfaceC6490 Linkify.TransformFilter transformFilter) {
        return m17683() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : m17674(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m17674(@InterfaceC6391 Spannable spannable, @InterfaceC6391 Pattern pattern, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr, @InterfaceC6490 Linkify.MatchFilter matchFilter, @InterfaceC6490 Linkify.TransformFilter transformFilter) {
        if (m17683()) {
            return C0847.m2402(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f1635;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            strArr2[i] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) && strGroup != null) {
                m17676(m17681(strGroup, strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m17675(@InterfaceC6391 TextView textView, int i) {
        if (m17683()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (m17671(spannableStringValueOf, i)) {
                m2400(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        } else if (m17671((Spannable) text, i)) {
            m2400(textView);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m17676(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m17677(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : C4857.m14850(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m17678(ArrayList<C0848> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    C0848 c0848 = new C0848();
                    c0848.f1638 = m17681(strGroup, strArr, matcher, transformFilter);
                    c0848.f14133 = iStart;
                    c0848.f14134 = iEnd;
                    arrayList.add(c0848);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m17679(ArrayList<C0848> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String strM17677 = m17677(string);
                if (strM17677 != null && (iIndexOf = string.indexOf(strM17677)) >= 0) {
                    C0848 c0848 = new C0848();
                    int length = strM17677.length() + iIndexOf;
                    c0848.f14133 = iIndexOf + i;
                    i += length;
                    c0848.f14134 = i;
                    string = string.substring(length);
                    try {
                        c0848.f1638 = "geo:0,0?q=" + URLEncoder.encode(strM17677, Key.STRING_CHARSET_NAME);
                        arrayList.add(c0848);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m17680(C0848 c0848, C0848 c08482) {
        int i = c0848.f14133;
        int i2 = c08482.f14133;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(c08482.f14134, c0848.f14134);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m17681(@InterfaceC6391 String str, @InterfaceC6391 String[] strArr, Matcher matcher, @InterfaceC6490 Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m17682(ArrayList<C0848> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C0848 c0848 = new C0848();
            c0848.f1637 = uRLSpan;
            c0848.f14133 = spannable.getSpanStart(uRLSpan);
            c0848.f14134 = spannable.getSpanEnd(uRLSpan);
            arrayList.add(c0848);
        }
        Collections.sort(arrayList, f1636);
        int size = arrayList.size();
        while (i2 < size - 1) {
            C0848 c08482 = arrayList.get(i2);
            int i3 = i2 + 1;
            C0848 c08483 = arrayList.get(i3);
            int i4 = c08482.f14133;
            int i5 = c08483.f14133;
            if (i4 <= i5 && (i = c08482.f14134) > i5) {
                int i6 = c08483.f14134;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    Object obj = arrayList.get(i7).f1637;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m17683() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
