package p000;

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

    /* JADX INFO: renamed from: a */
    public final a20 f7907a;

    /* JADX INFO: renamed from: b */
    public final Context f7908b;

    /* JADX INFO: renamed from: c */
    public final rm2 f7909c;

    /* JADX INFO: renamed from: d */
    public final kc1 f7910d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f7912f;

    /* JADX INFO: renamed from: e */
    public final kl1 f7911e = new kl1();

    /* JADX INFO: renamed from: g */
    public final nx1 f7913g = op0.m3598u(null);

    /* JADX INFO: renamed from: h */
    public final Object f7914h = new Object();

    public p02(a20 a20Var, Context context, rm2 rm2Var, kc1 kc1Var) {
        this.f7907a = a20Var;
        this.f7908b = context;
        this.f7909c = rm2Var;
        this.f7910d = kc1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3671a(p02 p02Var, CharSequence charSequence, long j, TextClassifier textClassifier, u00 u00Var) throws Throwable {
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
        kl1 kl1Var2 = p02Var.f7911e;
        nx1 nx1Var = p02Var.f7913g;
        if (u00Var instanceof n02) {
            n02Var = (n02) u00Var;
            int i = n02Var.f6959q;
            if ((i & Integer.MIN_VALUE) != 0) {
                n02Var.f6959q = i - Integer.MIN_VALUE;
            } else {
                n02Var = new n02(p02Var, u00Var);
            }
        }
        Object obj3 = n02Var.f6957o;
        int i2 = n02Var.f6959q;
        a83 a83Var = a83.f116a;
        k20 k20Var2 = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj3);
                n02Var.f6953k = charSequence;
                n02Var.f6954l = textClassifier;
                n02Var.f6955m = kl1Var2;
                j2 = j;
                n02Var.f6956n = j2;
                n02Var.f6959q = 1;
                if (kl1Var2.m2720d(n02Var) == k20Var2) {
                    return k20Var2;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                kl1Var = kl1Var2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = n02Var.f6956n;
                    kl1Var2 = n02Var.f6955m;
                    textClassificationClassifyText = (TextClassification) n02Var.f6954l;
                    charSequence3 = n02Var.f6953k;
                    fg1.m1627T(obj3);
                    try {
                        nx1Var.setValue(new ny2(charSequence3, j3, textClassificationClassifyText));
                        return a83Var;
                    } finally {
                        kl1Var2.m2722f(null);
                    }
                }
                j2 = n02Var.f6956n;
                kl1Var = n02Var.f6955m;
                textClassifier2 = (TextClassifier) n02Var.f6954l;
                charSequence2 = n02Var.f6953k;
                fg1.m1627T(obj3);
            }
            ny2 ny2Var = (ny2) nx1Var.getValue();
            if (ny2Var != null) {
                try {
                    tu2 tu2Var = r02.f9309a;
                    k20Var = k20Var2;
                    if (f13.m1493b(j2, ny2Var.f7370b)) {
                        boolean z = t11.m5086l(charSequence2, ny2Var.f7369a);
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
                    kl1Var2.m2722f(obj);
                    throw th;
                }
            }
            k20Var = k20Var2;
            obj2 = null;
            kl1Var2.m2722f(obj2);
            p90.m3819q();
            textClassificationClassifyText = textClassifier2.classifyText(p90.m3808f(charSequence2, f13.m1497f(j2), f13.m1496e(j2)).setDefaultLocales(p02Var.m3672b()).build());
            n02Var.f6953k = charSequence2;
            n02Var.f6954l = textClassificationClassifyText;
            n02Var.f6955m = kl1Var2;
            n02Var.f6956n = j2;
            n02Var.f6959q = 2;
            if (kl1Var2.m2720d(n02Var) == k20Var) {
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

    /* JADX INFO: renamed from: b */
    public final LocaleList m3672b() {
        kc1 kc1Var = this.f7910d;
        if (kc1Var == null) {
            return new LocaleList(((jc1) d02.f1801a.m431r().f5454h.get(0)).f4962a);
        }
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(kc1Var, 10));
        Iterator it = kc1Var.f5454h.iterator();
        while (it.hasNext()) {
            arrayList.add(((jc1) it.next()).f4962a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
