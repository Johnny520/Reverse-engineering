package yyds;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛵᛶᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1121 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f5176;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Map f5177;

    public C1121(String str, Map map) {
        this.f5176 = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            linkedHashMap.put(str2 != null ? str2.toLowerCase(Locale.US) : null, (String) entry.getValue());
        }
        this.f5177 = Collections.unmodifiableMap(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1121)) {
            return false;
        }
        C1121 c1121 = (C1121) obj;
        return c1121.f5176.equals(this.f5176) && c1121.f5177.equals(this.f5177);
    }

    public final int hashCode() {
        return this.f5177.hashCode() + AbstractC0897.m1997(this.f5176, 899, 31);
    }

    public final String toString() {
        return this.f5176 + " authParams=" + this.f5177;
    }
}
