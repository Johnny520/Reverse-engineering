package p100h0;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p015b0.AbstractC0132b0;
import p077f8.AbstractC1089i;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.C1858m2;
import p119i2.C1939m0;
import p136j8.C2104o;
import p225p2.AbstractC3291c;
import p225p2.C3289a;
import p225p2.C3290b;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p371yg.C6046b;
import tf.AbstractC4167n;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1542p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5561g f5142a;

    /* JADX INFO: renamed from: b */
    public final Context f5143b;

    /* JADX INFO: renamed from: c */
    public final EnumC1550t f5144c;

    /* JADX INFO: renamed from: d */
    public final C3290b f5145d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f5147f;

    /* JADX INFO: renamed from: e */
    public final C6046b f5146e = new C6046b();

    /* JADX INFO: renamed from: g */
    public final C1845j1 f5148g = AbstractC1874r.m4639u(null);

    /* JADX INFO: renamed from: h */
    public final Object f5149h = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1542p(InterfaceC5561g interfaceC5561g, Context context, EnumC1550t enumC1550t, C3290b c3290b) {
        this.f5142a = interfaceC5561g;
        this.f5143b = context;
        this.f5144c = enumC1550t;
        this.f5145d = c3290b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4038a(C1542p c1542p, CharSequence charSequence, long j3, TextClassifier textClassifier, AbstractC6038c abstractC6038c) throws Throwable {
        C1536m c1536m;
        long j4;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        C6046b c6046b;
        Object obj;
        EnumC5799a enumC5799a;
        Object obj2;
        TextClassification textClassificationClassifyText;
        long j5;
        CharSequence charSequence3;
        C6046b c6046b2 = c1542p.f5146e;
        C1845j1 c1845j1 = c1542p.f5148g;
        if (abstractC6038c instanceof C1536m) {
            c1536m = (C1536m) abstractC6038c;
            int i9 = c1536m.f5123m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1536m.f5123m = i9 - Integer.MIN_VALUE;
            } else {
                c1536m = new C1536m(c1542p, abstractC6038c);
            }
        }
        Object obj3 = c1536m.f5121k;
        int i10 = c1536m.f5123m;
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
        try {
            if (i10 == 0) {
                AbstractC1089i.m2732I0(obj3);
                c1536m.f5117g = charSequence;
                c1536m.f5118h = textClassifier;
                c1536m.f5119i = c6046b2;
                j4 = j3;
                c1536m.f5120j = j4;
                c1536m.f5123m = 1;
                if (c6046b2.m10806d(c1536m) == enumC5799a2) {
                    return enumC5799a2;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                c6046b = c6046b2;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = c1536m.f5120j;
                    c6046b2 = c1536m.f5119i;
                    textClassificationClassifyText = (TextClassification) c1536m.f5118h;
                    charSequence3 = c1536m.f5117g;
                    AbstractC1089i.m2732I0(obj3);
                    try {
                        c1845j1.setValue(new C1547r0(charSequence3, j5, textClassificationClassifyText));
                        return c3967n;
                    } finally {
                        c6046b2.m10808f(null);
                    }
                }
                j4 = c1536m.f5120j;
                c6046b = c1536m.f5119i;
                textClassifier2 = (TextClassifier) c1536m.f5118h;
                charSequence2 = c1536m.f5117g;
                AbstractC1089i.m2732I0(obj3);
            }
            C1547r0 c1547r0 = (C1547r0) c1845j1.getValue();
            if (c1547r0 != null) {
                try {
                    C1858m2 c1858m2 = AbstractC1546r.f5155a;
                    enumC5799a = enumC5799a2;
                    if (C1939m0.m4812b(j4, c1547r0.f5158b)) {
                        boolean z9 = AbstractC1416l.m3825a(charSequence2, c1547r0.f5157a);
                        if (z9) {
                            return c3967n;
                        }
                        obj2 = null;
                    }
                    c1845j1.setValue(new C1547r0(charSequence3, j5, textClassificationClassifyText));
                    return c3967n;
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    c6046b2.m10808f(obj);
                    throw th;
                }
            }
            enumC5799a = enumC5799a2;
            obj2 = null;
            c6046b2.m10808f(obj2);
            AbstractC0132b0.m705s();
            textClassificationClassifyText = textClassifier2.classifyText(AbstractC0132b0.m693g(charSequence2, C1939m0.m4816f(j4), C1939m0.m4815e(j4)).setDefaultLocales(c1542p.m4039b()).build());
            c1536m.f5117g = charSequence2;
            c1536m.f5118h = textClassificationClassifyText;
            c1536m.f5119i = c6046b2;
            c1536m.f5120j = j4;
            c1536m.f5123m = 2;
            if (c6046b2.m10806d(c1536m) == enumC5799a) {
                return enumC5799a;
            }
            j5 = j4;
            charSequence3 = charSequence2;
            c1845j1.setValue(new C1547r0(charSequence3, j5, textClassificationClassifyText));
            return c3967n;
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final LocaleList m4039b() {
        C3290b c3290b = this.f5145d;
        if (c3290b == null) {
            return new LocaleList(((C3289a) AbstractC3291c.f10463a.m821r().f10461g.get(0)).f10459a);
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c3290b));
        Iterator it = c3290b.f10461g.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3289a) it.next()).f10459a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
