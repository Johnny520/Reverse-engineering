package p058L;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p010B3.AbstractC0227f;
import p056K2.C0891q;
import p061L2.AbstractC0974n;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p092S0.C1259L;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1366i0;
import p117X2.AbstractC1665j;
import p125Z0.AbstractC1782c;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p127Z2.AbstractC1784a;
import p207n3.C2695c;

/* JADX INFO: renamed from: L.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0943o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1051i f2964a;

    /* JADX INFO: renamed from: b */
    public final Context f2965b;

    /* JADX INFO: renamed from: c */
    public final EnumC0947s f2966c;

    /* JADX INFO: renamed from: d */
    public final C1781b f2967d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f2969f;

    /* JADX INFO: renamed from: e */
    public final C2695c f2968e = new C2695c();

    /* JADX INFO: renamed from: g */
    public final C1366i0 f2970g = AbstractC1385s.m2629s(null);

    /* JADX INFO: renamed from: h */
    public final Object f2971h = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0943o(InterfaceC1051i interfaceC1051i, Context context, EnumC0947s enumC0947s, C1781b c1781b) {
        this.f2964a = interfaceC1051i;
        this.f2965b = context;
        this.f2966c = enumC0947s;
        this.f2967d = c1781b;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST]}, finally: {[CONST, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[CONST, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, IPUT, IPUT, IPUT, IPUT, IPUT, INVOKE, MOVE] complete}, expected: {[CONST, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1947a(C0943o c0943o, CharSequence charSequence, long j5, TextClassifier textClassifier, AbstractC1178c abstractC1178c) {
        C0941m c0941m;
        long j6;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        C2695c c2695c;
        EnumC1152a enumC1152a;
        Object obj;
        TextClassification textClassificationClassifyText;
        long j7;
        CharSequence charSequence3;
        C2695c c2695c2 = c0943o.f2968e;
        C1366i0 c1366i0 = c0943o.f2970g;
        if (abstractC1178c instanceof C0941m) {
            c0941m = (C0941m) abstractC1178c;
            int i5 = c0941m.f2954m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0941m.f2954m = i5 - Integer.MIN_VALUE;
            } else {
                c0941m = new C0941m(c0943o, abstractC1178c);
            }
        }
        Object obj2 = c0941m.f2952k;
        int i6 = c0941m.f2954m;
        C0891q c0891q = C0891q.f2780a;
        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(obj2);
                c0941m.f2948g = charSequence;
                c0941m.f2949h = textClassifier;
                c0941m.f2950i = c2695c2;
                j6 = j5;
                c0941m.f2951j = j6;
                c0941m.f2954m = 1;
                if (c2695c2.m4691d(c0941m) == enumC1152a2) {
                    return enumC1152a2;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                c2695c = c2695c2;
            } else {
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = c0941m.f2951j;
                    c2695c2 = c0941m.f2950i;
                    textClassificationClassifyText = (TextClassification) c0941m.f2949h;
                    charSequence3 = c0941m.f2948g;
                    AbstractC1784a.m3205S(obj2);
                    try {
                        c1366i0.setValue(new C0910L(charSequence3, j7, textClassificationClassifyText));
                        return c0891q;
                    } finally {
                        c2695c2.m4693f(null);
                    }
                }
                j6 = c0941m.f2951j;
                c2695c = c0941m.f2950i;
                textClassifier2 = (TextClassifier) c0941m.f2949h;
                charSequence2 = c0941m.f2948g;
                AbstractC1784a.m3205S(obj2);
            }
            C0910L c0910l = (C0910L) c1366i0.getValue();
            if (c0910l != null) {
                C1341U0 c1341u0 = AbstractC0945q.f2972a;
                enumC1152a = enumC1152a2;
                if (C1259L.m2334b(j6, c0910l.f2827b)) {
                    boolean z5 = AbstractC1665j.m2981a(charSequence2, c0910l.f2826a);
                    obj = null;
                    if (z5) {
                        c2695c.m4693f(null);
                        return c0891q;
                    }
                }
                c1366i0.setValue(new C0910L(charSequence3, j7, textClassificationClassifyText));
                return c0891q;
            }
            enumC1152a = enumC1152a2;
            obj = null;
            c2695c.m4693f(obj);
            AbstractC0227f.m349q();
            textClassificationClassifyText = textClassifier2.classifyText(AbstractC0227f.m338f(charSequence2, C1259L.m2338f(j6), C1259L.m2337e(j6)).setDefaultLocales(c0943o.m1948b()).build());
            c0941m.f2948g = charSequence2;
            c0941m.f2949h = textClassificationClassifyText;
            c0941m.f2950i = c2695c2;
            c0941m.f2951j = j6;
            c0941m.f2954m = 2;
            Object objM4691d = c2695c2.m4691d(c0941m);
            EnumC1152a enumC1152a3 = enumC1152a;
            if (objM4691d == enumC1152a3) {
                return enumC1152a3;
            }
            j7 = j6;
            charSequence3 = charSequence2;
            c1366i0.setValue(new C0910L(charSequence3, j7, textClassificationClassifyText));
            return c0891q;
        } catch (Throwable th) {
            c2695c.m4693f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final LocaleList m1948b() {
        C1781b c1781b = this.f2967d;
        if (c1781b == null) {
            return new LocaleList(((C1780a) AbstractC1782c.f6092a.m107k().f6090d.get(0)).f6088a);
        }
        ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(c1781b, 10));
        Iterator it = c1781b.f6090d.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1780a) it.next()).f6088a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
