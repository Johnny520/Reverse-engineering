package p263s;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p179m2.C4845g1;
import p185m8.AbstractC5106t;
import p228p8.InterfaceC5976f;
import p319w2.C9058e;
import p319w2.C9067f3;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6632b {
    /* JADX INFO: renamed from: a */
    public static final C9058e m26281a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C9058e(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iM20732f0 = AbstractC5106t.m20732f0(annotationArr);
        if (iM20732f0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (AbstractC1061t.m3842c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C9058e.d(new C6633c(annotation.getValue()).m26296k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == iM20732f0) {
                    break;
                }
                i10++;
            }
        }
        return new C9058e(charSequence.toString(), arrayList, null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m26282b(C9058e c9058e) {
        if (c9058e.m35152g().isEmpty()) {
            return c9058e.m35156k();
        }
        SpannableString spannableString = new SpannableString(c9058e.m35156k());
        C6634d c6634d = new C6634d();
        List listM35152g = c9058e.m35152g();
        int size = listM35152g.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) listM35152g.get(i10);
            C9067f3 c9067f3 = (C9067f3) dVar.m35187a();
            int iM35188b = dVar.m35188b();
            int iM35189c = dVar.m35189c();
            c6634d.m26317q();
            c6634d.m26309i(c9067f3);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c6634d.m26316p()), iM35188b, iM35189c, 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m26283c(C4845g1 c4845g1) {
        return C6631a.m26278a(c4845g1);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m26284d(C4845g1 c4845g1, InterfaceC5976f interfaceC5976f) {
        return C6631a.m26279b(c4845g1);
    }

    /* JADX INFO: renamed from: e */
    public static final C4845g1 m26285e(C9058e c9058e) {
        return C6631a.m26280c(c9058e);
    }
}
