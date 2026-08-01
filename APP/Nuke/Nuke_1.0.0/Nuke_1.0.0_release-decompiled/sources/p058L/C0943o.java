package p058L;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p061L2.AbstractC0974n;
import p074O2.InterfaceC1051i;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p125Z0.AbstractC1782c;
import p125Z0.C1780a;
import p125Z0.C1781b;
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

    public C0943o(InterfaceC1051i interfaceC1051i, Context context, EnumC0947s enumC0947s, C1781b c1781b) {
        this.f2964a = interfaceC1051i;
        this.f2965b = context;
        this.f2966c = enumC0947s;
        this.f2967d = c1781b;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1947a(p058L.C0943o r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, p084Q2.AbstractC1178c r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0943o.m1947a(L.o, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, Q2.c):java.lang.Object");
    }

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
