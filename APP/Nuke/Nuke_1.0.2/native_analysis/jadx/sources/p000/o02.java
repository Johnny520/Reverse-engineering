package p000;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o02 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public kl1 f7399l;

    /* JADX INFO: renamed from: m */
    public p02 f7400m;

    /* JADX INFO: renamed from: n */
    public CharSequence f7401n;

    /* JADX INFO: renamed from: o */
    public long f7402o;

    /* JADX INFO: renamed from: p */
    public int f7403p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f7404q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ CharSequence f7405r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f7406s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ p02 f7407t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o02(long j, t00 t00Var, p02 p02Var, CharSequence charSequence) {
        super(2, t00Var);
        this.f7405r = charSequence;
        this.f7406s = j;
        this.f7407t = p02Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((o02) mo13p((t00) obj2, (TextClassifier) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        o02 o02Var = new o02(this.f7406s, t00Var, this.f7407t, this.f7405r);
        o02Var.f7404q = obj;
        return o02Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        long j;
        kl1 kl1Var;
        TextSelection textSelection;
        CharSequence charSequence;
        p02 p02Var;
        int i = this.f7403p;
        if (i == 0) {
            fg1.m1627T(obj);
            TextClassifier textClassifier = (TextClassifier) this.f7404q;
            p90.m3826x();
            long j2 = this.f7406s;
            int iM1497f = f13.m1497f(j2);
            int iM1496e = f13.m1496e(j2);
            CharSequence charSequence2 = this.f7405r;
            TextSelection.Request.Builder builderM3815m = p90.m3815m(charSequence2, iM1497f, iM1496e);
            p02 p02Var2 = this.f7407t;
            TextSelection.Request.Builder defaultLocales = builderM3815m.setDefaultLocales(p02Var2.m3672b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM1636i = fg1.m1636i(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            k20 k20Var = k20.f5323h;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f7402o = jM1636i;
                this.f7403p = 2;
                if (p02.m3671a(this.f7407t, this.f7405r, jM1636i, textClassifier, this) != k20Var) {
                    j = jM1636i;
                }
            } else {
                kl1Var = p02Var2.f7911e;
                this.f7404q = textSelectionSuggestSelection;
                this.f7399l = kl1Var;
                this.f7400m = p02Var2;
                this.f7401n = charSequence2;
                this.f7402o = jM1636i;
                this.f7403p = 1;
                if (kl1Var.m2720d(this) != k20Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    p02Var = p02Var2;
                    j = jM1636i;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    p02Var.f7913g.setValue(new ny2(charSequence, j, textClassification));
                }
            }
            return k20Var;
        }
        if (i == 1) {
            j = this.f7402o;
            charSequence = this.f7401n;
            p02Var = this.f7400m;
            kl1Var = this.f7399l;
            textSelection = (TextSelection) this.f7404q;
            fg1.m1627T(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                p02Var.f7913g.setValue(new ny2(charSequence, j, textClassification2));
            } finally {
                kl1Var.m2722f(null);
            }
        } else {
            if (i != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f7402o;
            fg1.m1627T(obj);
        }
        return new f13(j);
    }
}
