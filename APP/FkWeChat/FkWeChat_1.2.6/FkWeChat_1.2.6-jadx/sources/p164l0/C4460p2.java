package p164l0;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p024b9.AbstractC1061t;
import p043d3.C1868d;
import p043d3.C1869e;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: l0.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4460p2 {

    /* JADX INFO: renamed from: a */
    public static final C4460p2 f12982a = new C4460p2();

    /* JADX INFO: renamed from: a */
    public final void m17307a(EditorInfo editorInfo, C1869e c1869e) {
        if (AbstractC1061t.m3842c(c1869e, C1869e.f5201s.m6634b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c1869e, 10));
        Iterator<E> it = c1869e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1868d) it.next()).m6625a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
