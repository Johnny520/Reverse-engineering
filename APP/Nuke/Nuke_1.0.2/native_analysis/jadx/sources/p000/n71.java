package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n71 implements ls0 {

    /* JADX INFO: renamed from: b */
    public final Map f7033b;

    /* JADX INFO: renamed from: c */
    public volatile Map f7034c;

    public n71(Map map) {
        this.f7033b = Collections.unmodifiableMap(map);
    }

    @Override // p000.ls0
    /* JADX INFO: renamed from: a */
    public final Map mo2970a() {
        if (this.f7034c == null) {
            synchronized (this) {
                try {
                    if (this.f7034c == null) {
                        this.f7034c = Collections.unmodifiableMap(m3255b());
                    }
                } finally {
                }
            }
        }
        return this.f7034c;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m3255b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f7033b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((m71) list.get(i)).f6498a;
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

    public final boolean equals(Object obj) {
        if (obj instanceof n71) {
            return this.f7033b.equals(((n71) obj).f7033b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7033b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f7033b + '}';
    }
}
