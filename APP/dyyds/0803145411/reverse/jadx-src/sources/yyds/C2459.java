package yyds;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲇᛶᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459 implements InterfaceC2195 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Map f12157;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile Map f12158;

    public C2459(Map map) {
        this.f12157 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2459) {
            return this.f12157.equals(((C2459) obj).f12157);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12157.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f12157 + '}';
    }

    @Override // yyds.InterfaceC2195
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Map mo4187() {
        if (this.f12158 == null) {
            synchronized (this) {
                try {
                    if (this.f12158 == null) {
                        this.f12158 = Collections.unmodifiableMap(m4501());
                    }
                } finally {
                }
            }
        }
        return this.f12158;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap m4501() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f12157.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C2427) list.get(i)).f11977;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }
}
