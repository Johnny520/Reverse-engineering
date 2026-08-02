package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 {
    public final a20 a;
    public final Context b;
    public final rm2 c;
    public final kc1 d;
    public TextClassifier f;
    public final kl1 e = new kl1();
    public final nx1 g = op0.u(null);
    public final Object h = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p02(a20 a20Var, Context context, rm2 rm2Var, kc1 kc1Var) {
        this.a = a20Var;
        this.b = context;
        this.c = rm2Var;
        this.d = kc1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p02 p02Var, CharSequence charSequence, long j, TextClassifier textClassifier, u00 u00Var) throws Throwable {
        n02 n02Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        kl1 kl1Var;
        Object obj;
        k20 k20Var;
        Object obj2;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        kl1 kl1Var2 = p02Var.e;
        nx1 nx1Var = p02Var.g;
        if (u00Var instanceof n02) {
            n02Var = (n02) u00Var;
            int i = n02Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                n02Var.q = i - Integer.MIN_VALUE;
            } else {
                n02Var = new n02(p02Var, u00Var);
            }
        }
        Object obj3 = n02Var.o;
        int i2 = n02Var.q;
        a83 a83Var = a83.a;
        k20 k20Var2 = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(obj3);
                n02Var.k = charSequence;
                n02Var.l = textClassifier;
                n02Var.m = kl1Var2;
                j2 = j;
                n02Var.n = j2;
                n02Var.q = 1;
                if (kl1Var2.d(n02Var) == k20Var2) {
                    return k20Var2;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                kl1Var = kl1Var2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = n02Var.n;
                    kl1Var2 = n02Var.m;
                    textClassificationClassifyText = (TextClassification) n02Var.l;
                    charSequence3 = n02Var.k;
                    fg1.T(obj3);
                    try {
                        nx1Var.setValue(new ny2(charSequence3, j3, textClassificationClassifyText));
                        return a83Var;
                    } finally {
                        kl1Var2.f(null);
                    }
                }
                j2 = n02Var.n;
                kl1Var = n02Var.m;
                textClassifier2 = (TextClassifier) n02Var.l;
                charSequence2 = n02Var.k;
                fg1.T(obj3);
            }
            ny2 ny2Var = (ny2) nx1Var.getValue();
            if (ny2Var != null) {
                try {
                    tu2 tu2Var = r02.a;
                    k20Var = k20Var2;
                    if (f13.b(j2, ny2Var.b)) {
                        boolean z = t11.l(charSequence2, ny2Var.a);
                        if (z) {
                            return a83Var;
                        }
                        obj2 = null;
                    }
                    nx1Var.setValue(new ny2(charSequence3, j3, textClassificationClassifyText));
                    return a83Var;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    kl1Var2.f(obj);
                    throw th;
                }
            }
            k20Var = k20Var2;
            obj2 = null;
            kl1Var2.f(obj2);
            p90.q();
            textClassificationClassifyText = textClassifier2.classifyText(p90.f(charSequence2, f13.f(j2), f13.e(j2)).setDefaultLocales(p02Var.b()).build());
            n02Var.k = charSequence2;
            n02Var.l = textClassificationClassifyText;
            n02Var.m = kl1Var2;
            n02Var.n = j2;
            n02Var.q = 2;
            if (kl1Var2.d(n02Var) == k20Var) {
                return k20Var;
            }
            j3 = j2;
            charSequence3 = charSequence2;
            nx1Var.setValue(new ny2(charSequence3, j3, textClassificationClassifyText));
            return a83Var;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final LocaleList b() {
        kc1 kc1Var = this.d;
        if (kc1Var == null) {
            return new LocaleList(((jc1) d02.a.r().h.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(eu.B(kc1Var, 10));
        Iterator it = kc1Var.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((jc1) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
