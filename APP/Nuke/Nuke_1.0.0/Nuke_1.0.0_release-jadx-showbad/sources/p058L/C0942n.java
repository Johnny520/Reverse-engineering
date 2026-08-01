package p058L;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import p010B3.AbstractC0227f;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p207n3.C2695c;

/* JADX INFO: renamed from: L.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0942n extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public C2695c f2955h;

    /* JADX INFO: renamed from: i */
    public C0943o f2956i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2957j;

    /* JADX INFO: renamed from: k */
    public long f2958k;

    /* JADX INFO: renamed from: l */
    public int f2959l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f2960m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ CharSequence f2961n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f2962o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0943o f2963p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942n(long j5, C0943o c0943o, InterfaceC1046d interfaceC1046d, CharSequence charSequence) {
        super(2, interfaceC1046d);
        this.f2961n = charSequence;
        this.f2962o = j5;
        this.f2963p = c0943o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C0942n) mo7n((InterfaceC1046d) obj2, (TextClassifier) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C0942n c0942n = new C0942n(this.f2962o, this.f2963p, interfaceC1046d, this.f2961n);
        c0942n.f2960m = obj;
        return c0942n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        long j5;
        C2695c c2695c;
        TextSelection textSelection;
        CharSequence charSequence;
        C0943o c0943o;
        int i5 = this.f2959l;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            TextClassifier textClassifier = (TextClassifier) this.f2960m;
            AbstractC0227f.m358z();
            long j6 = this.f2962o;
            int iM2338f = C1259L.m2338f(j6);
            int iM2337e = C1259L.m2337e(j6);
            CharSequence charSequence2 = this.f2961n;
            TextSelection.Request.Builder builderM345m = AbstractC0227f.m345m(charSequence2, iM2338f, iM2337e);
            C0943o c0943o2 = this.f2963p;
            TextSelection.Request.Builder defaultLocales = builderM345m.setDefaultLocales(c0943o2.m1948b());
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM2313b = AbstractC1251D.m2313b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (i6 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f2958k = jM2313b;
                this.f2959l = 2;
                if (C0943o.m1947a(this.f2963p, this.f2961n, jM2313b, textClassifier, this) != enumC1152a) {
                    j5 = jM2313b;
                }
            } else {
                c2695c = c0943o2.f2968e;
                this.f2960m = textSelectionSuggestSelection;
                this.f2955h = c2695c;
                this.f2956i = c0943o2;
                this.f2957j = charSequence2;
                this.f2958k = jM2313b;
                this.f2959l = 1;
                if (c2695c.m4691d(this) != enumC1152a) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    c0943o = c0943o2;
                    j5 = jM2313b;
                    TextClassification textClassification = textSelection.getTextClassification();
                    AbstractC1665j.m2982b(textClassification);
                    c0943o.f2970g.setValue(new C0910L(charSequence, j5, textClassification));
                }
            }
            return enumC1152a;
        }
        if (i5 == 1) {
            j5 = this.f2958k;
            charSequence = this.f2957j;
            c0943o = this.f2956i;
            c2695c = this.f2955h;
            textSelection = (TextSelection) this.f2960m;
            AbstractC1784a.m3205S(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                AbstractC1665j.m2982b(textClassification2);
                c0943o.f2970g.setValue(new C0910L(charSequence, j5, textClassification2));
            } finally {
                c2695c.m4693f(null);
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.f2958k;
            AbstractC1784a.m3205S(obj);
        }
        return new C1259L(j5);
    }
}
