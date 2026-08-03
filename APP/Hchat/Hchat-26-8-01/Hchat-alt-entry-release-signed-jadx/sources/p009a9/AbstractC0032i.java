package p009a9;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: a9.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0032i {

    /* JADX INFO: renamed from: a */
    public static final Map f101a = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: b */
    public static final Map f102b = AbstractC3199a.m6843p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m283a(C0026c c0026c) {
        TextView textView = c0026c.f82a;
        C0027d c0027dM287e = m287e(c0026c);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C0030g c0030g = c0027dM287e.f85c;
        String str = c0030g.f94a;
        InterfaceC1220a interfaceC1220a = c0030g.f99f;
        if (str.length() > 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c0030g.f94a);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new C0029f(c0030g.f95b, c0030g.f96c, c0030g.f97d, c0030g.f98e), length, length2, 33);
            if (interfaceC1220a != null) {
                spannableStringBuilder.setSpan(new C0025b(interfaceC1220a), length, length2, 33);
            }
            spannableStringBuilder.append((CharSequence) " ");
        }
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append(c0027dM287e.f83a);
        int length4 = spannableStringBuilder.length();
        C0024a c0024a = c0027dM287e.f84b;
        if (c0024a != null) {
            if (!(length4 > length3)) {
                c0024a = null;
            }
            if (c0024a != null) {
                spannableStringBuilder.setSpan(new C0028e(c0024a.f78a, c0024a.f79b), length3, length4, 33);
            }
        }
        if (c0027dM287e.f86d.length() > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append(c0027dM287e.f86d);
        }
        textView.setMovementMethod(interfaceC1220a != null ? LinkMovementMethod.getInstance() : null);
        textView.setHighlightColor(0);
        textView.setText(spannableStringBuilder);
        String string = spannableStringBuilder.toString();
        string.getClass();
        c0027dM287e.f87e = string;
        textView.setSingleLine(false);
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setEllipsize(null);
        textView.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0026c m284b(TextView textView) {
        C0026c c0026c;
        Map map = f101a;
        map.getClass();
        synchronized (map) {
            c0026c = (C0026c) map.get(textView);
        }
        return c0026c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static CharSequence m285c(TextView textView) {
        Map map = f102b;
        map.getClass();
        synchronized (map) {
            try {
                C0027d c0027d = (C0027d) map.get(textView);
                if (c0027d != null && c0027d.f87e.length() > 0) {
                    CharSequence text = textView.getText();
                    if (AbstractC1416l.m3825a(text != null ? text.toString() : null, c0027d.f87e)) {
                        return c0027d.f83a;
                    }
                }
                return m289g(textView.getText());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0026c m286d(TextView textView) {
        Map map = f101a;
        map.getClass();
        synchronized (map) {
            C0026c c0026c = (C0026c) map.get(textView);
            if (c0026c != null) {
                return c0026c;
            }
            C0026c c0026c2 = new C0026c(textView);
            map.put(textView, c0026c2);
            Map map2 = f102b;
            map2.getClass();
            map2.put(textView, new C0027d(m289g(textView.getText())));
            textView.setSingleLine(false);
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            textView.setHighlightColor(0);
            return c0026c2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C0027d m287e(C0026c c0026c) {
        C0027d c0027d;
        Map map = f102b;
        map.getClass();
        synchronized (map) {
            try {
                Map map2 = map;
                TextView textView = c0026c.f82a;
                Object c0027d2 = map2.get(textView);
                if (c0027d2 == null) {
                    c0027d2 = new C0027d(m289g(c0026c.f82a.getText()));
                    map2.put(textView, c0027d2);
                }
                c0027d = (C0027d) c0027d2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0027d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C0027d m288f(C0026c c0026c) {
        C0027d c0027dM287e = m287e(c0026c);
        CharSequence text = c0026c.f82a.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!string.equals(c0027dM287e.f87e)) {
            c0027dM287e.f83a = m289g(text);
        }
        return c0027dM287e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r0.length == 0) goto L12;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence m289g(CharSequence charSequence) {
        if (charSequence == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C0029f[] c0029fArr = (C0029f[]) spanned.getSpans(0, spanned.length(), C0029f.class);
            C0028e[] c0028eArr = (C0028e[]) spanned.getSpans(0, spanned.length(), C0028e.class);
            c0029fArr.getClass();
            if (c0029fArr.length == 0) {
                c0028eArr.getClass();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            c0028eArr.getClass();
            for (C0028e c0028e : c0028eArr) {
                spannableStringBuilder.removeSpan(c0028e);
            }
            ArrayList arrayList = new ArrayList();
            for (C0029f c0029f : c0029fArr) {
                int spanStart = spannableStringBuilder.getSpanStart(c0029f);
                int spanEnd = spannableStringBuilder.getSpanEnd(c0029f);
                C3958e c3958e = (spanStart < 0 || spanEnd < spanStart) ? null : new C3958e(Integer.valueOf(spanStart), Integer.valueOf(spanEnd));
                if (c3958e != null) {
                    arrayList.add(c3958e);
                }
            }
            for (C3958e c3958e2 : AbstractC4166m.m8402K1(arrayList, new C0031h(0))) {
                int iIntValue = ((Number) c3958e2.f12961g).intValue();
                int iIntValue2 = ((Number) c3958e2.f12962h).intValue() + 1;
                int length = spannableStringBuilder.length();
                if (iIntValue2 > length) {
                    iIntValue2 = length;
                }
                spannableStringBuilder.delete(iIntValue, iIntValue2);
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }
}
