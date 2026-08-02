package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o02 extends tw2 implements mn0 {
    public kl1 l;
    public p02 m;
    public CharSequence n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CharSequence r;
    public final /* synthetic */ long s;
    public final /* synthetic */ p02 t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o02(long j, t00 t00Var, p02 p02Var, CharSequence charSequence) {
        super(2, t00Var);
        this.r = charSequence;
        this.s = j;
        this.t = p02Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((o02) p((t00) obj2, (TextClassifier) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        o02 o02Var = new o02(this.s, t00Var, this.t, this.r);
        o02Var.q = obj;
        return o02Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        long j;
        kl1 kl1Var;
        TextSelection textSelection;
        CharSequence charSequence;
        p02 p02Var;
        int i = this.p;
        if (i == 0) {
            fg1.T(obj);
            TextClassifier textClassifier = (TextClassifier) this.q;
            p90.x();
            long j2 = this.s;
            int iF = f13.f(j2);
            int iE = f13.e(j2);
            CharSequence charSequence2 = this.r;
            TextSelection.Request.Builder builderM = p90.m(charSequence2, iF, iE);
            p02 p02Var2 = this.t;
            TextSelection.Request.Builder defaultLocales = builderM.setDefaultLocales(p02Var2.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jI = fg1.i(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            k20 k20Var = k20.h;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.o = jI;
                this.p = 2;
                if (p02.a(this.t, this.r, jI, textClassifier, this) != k20Var) {
                    j = jI;
                }
            } else {
                kl1Var = p02Var2.e;
                this.q = textSelectionSuggestSelection;
                this.l = kl1Var;
                this.m = p02Var2;
                this.n = charSequence2;
                this.o = jI;
                this.p = 1;
                if (kl1Var.d(this) != k20Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    p02Var = p02Var2;
                    j = jI;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    p02Var.g.setValue(new ny2(charSequence, j, textClassification));
                }
            }
            return k20Var;
        }
        if (i == 1) {
            j = this.o;
            charSequence = this.n;
            p02Var = this.m;
            kl1Var = this.l;
            textSelection = (TextSelection) this.q;
            fg1.T(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                p02Var.g.setValue(new ny2(charSequence, j, textClassification2));
            } finally {
                kl1Var.f(null);
            }
        } else {
            if (i != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.o;
            fg1.T(obj);
        }
        return new f13(j);
    }
}
