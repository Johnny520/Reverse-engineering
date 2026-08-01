package p043d3;

import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import p024b9.AbstractC1061t;
import p059e3.C2024s;

/* JADX INFO: renamed from: d3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1865a implements InterfaceC1870f {

    /* JADX INFO: renamed from: a */
    public LocaleList f5195a;

    /* JADX INFO: renamed from: b */
    public C1869e f5196b;

    /* JADX INFO: renamed from: c */
    public final C2024s f5197c = new C2024s();

    @Override // p043d3.InterfaceC1870f
    /* JADX INFO: renamed from: a */
    public C1869e mo6621a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f5197c) {
            C1869e c1869e = this.f5196b;
            if (c1869e != null && localeList == this.f5195a) {
                return c1869e;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new C1868d(localeList.get(i10)));
            }
            C1869e c1869e2 = new C1869e(arrayList);
            this.f5195a = localeList;
            this.f5196b = c1869e2;
            return c1869e2;
        }
    }

    @Override // p043d3.InterfaceC1870f
    /* JADX INFO: renamed from: b */
    public Locale mo6622b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC1061t.m3842c(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(AbstractC1866b.f5198a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
