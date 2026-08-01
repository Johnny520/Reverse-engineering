package p179m2;

import android.text.Annotation;
import android.text.SpannableString;
import java.util.List;
import p319w2.C9058e;
import p319w2.C9067f3;

/* JADX INFO: renamed from: m2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4873m {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m19485a(C9058e c9058e) {
        if (c9058e.m35152g().isEmpty()) {
            return c9058e.m35156k();
        }
        SpannableString spannableString = new SpannableString(c9058e.m35156k());
        C4905s1 c4905s1 = new C4905s1();
        List listM35152g = c9058e.m35152g();
        int size = listM35152g.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) listM35152g.get(i10);
            C9067f3 c9067f3 = (C9067f3) dVar.m35187a();
            int iM35188b = dVar.m35188b();
            int iM35189c = dVar.m35189c();
            c4905s1.m19691q();
            c4905s1.m19683i(c9067f3);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c4905s1.m19690p()), iM35188b, iM35189c, 33);
        }
        return spannableString;
    }
}
