package p100h0;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import p015b0.AbstractC0132b0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1540o extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public C6046b f5131h;

    /* JADX INFO: renamed from: i */
    public C1542p f5132i;

    /* JADX INFO: renamed from: j */
    public CharSequence f5133j;

    /* JADX INFO: renamed from: k */
    public long f5134k;

    /* JADX INFO: renamed from: l */
    public int f5135l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f5136m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ CharSequence f5137n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f5138o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1542p f5139p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1540o(CharSequence charSequence, long j3, C1542p c1542p, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5137n = charSequence;
        this.f5138o = j3;
        this.f5139p = c1542p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C1540o c1540o = new C1540o(this.f5137n, this.f5138o, this.f5139p, interfaceC5557c);
        c1540o.f5136m = obj;
        return c1540o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1540o) create((TextClassifier) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        long j3;
        C6046b c6046b;
        TextSelection textSelection;
        CharSequence charSequence;
        C1542p c1542p;
        int i9 = this.f5135l;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            TextClassifier textClassifier = (TextClassifier) this.f5136m;
            AbstractC0132b0.m712z();
            long j4 = this.f5138o;
            int iM4816f = C1939m0.m4816f(j4);
            int iM4815e = C1939m0.m4815e(j4);
            CharSequence charSequence2 = this.f5137n;
            TextSelection.Request.Builder builderM700n = AbstractC0132b0.m700n(charSequence2, iM4816f, iM4815e);
            C1542p c1542p2 = this.f5139p;
            TextSelection.Request.Builder defaultLocales = builderM700n.setDefaultLocales(c1542p2.m4039b());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM4784b = AbstractC1923e0.m4784b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (i10 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f5134k = jM4784b;
                this.f5135l = 2;
                if (C1542p.m4038a(this.f5139p, this.f5137n, jM4784b, textClassifier, this) != enumC5799a) {
                    j3 = jM4784b;
                }
            } else {
                c6046b = c1542p2.f5146e;
                this.f5136m = textSelectionSuggestSelection;
                this.f5131h = c6046b;
                this.f5132i = c1542p2;
                this.f5133j = charSequence2;
                this.f5134k = jM4784b;
                this.f5135l = 1;
                if (c6046b.m10806d(this) != enumC5799a) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    c1542p = c1542p2;
                    j3 = jM4784b;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    c1542p.f5148g.setValue(new C1547r0(charSequence, j3, textClassification));
                }
            }
            return enumC5799a;
        }
        if (i9 == 1) {
            j3 = this.f5134k;
            charSequence = this.f5133j;
            c1542p = this.f5132i;
            c6046b = this.f5131h;
            textSelection = (TextSelection) this.f5136m;
            AbstractC1089i.m2732I0(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                c1542p.f5148g.setValue(new C1547r0(charSequence, j3, textClassification2));
            } finally {
                c6046b.m10808f(null);
            }
        } else {
            if (i9 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = this.f5134k;
            AbstractC1089i.m2732I0(obj);
        }
        return new C1939m0(j3);
    }
}
