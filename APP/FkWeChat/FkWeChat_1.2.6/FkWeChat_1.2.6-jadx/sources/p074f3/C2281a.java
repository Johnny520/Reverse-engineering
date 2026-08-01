package p074f3;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p043d3.C1868d;
import p043d3.C1869e;
import p059e3.C2014i;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: f3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281a {

    /* JADX INFO: renamed from: a */
    public static final C2281a f6258a = new C2281a();

    /* JADX INFO: renamed from: a */
    public final Object m8297a(C1869e c1869e) {
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c1869e, 10));
        Iterator<E> it = c1869e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1868d) it.next()).m6625a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* JADX INFO: renamed from: b */
    public final void m8298b(C2014i c2014i, C1869e c1869e) {
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c1869e, 10));
        Iterator<E> it = c1869e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1868d) it.next()).m6625a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c2014i.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
