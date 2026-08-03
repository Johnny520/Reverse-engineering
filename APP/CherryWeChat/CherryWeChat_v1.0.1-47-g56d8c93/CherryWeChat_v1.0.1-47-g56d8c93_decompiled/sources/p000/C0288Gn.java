package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Gn */
/* JADX INFO: loaded from: classes.dex */
public final class C0288Gn implements InterfaceC2506sk {

    /* JADX INFO: renamed from: b */
    public final Map f933b;

    /* JADX INFO: renamed from: c */
    public volatile Map f934c;

    public C0288Gn(Map map) {
        this.f933b = Collections.unmodifiableMap(map);
    }

    @Override // p000.InterfaceC2506sk
    /* JADX INFO: renamed from: a */
    public final Map mo573a() {
        if (this.f934c == null) {
            synchronized (this) {
                try {
                    if (this.f934c == null) {
                        this.f934c = Collections.unmodifiableMap(m574b());
                    }
                } finally {
                }
            }
        }
        return this.f934c;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m574b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f933b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C0245Fn) list.get(i)).f801a;
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
        if (obj instanceof C0288Gn) {
            return this.f933b.equals(((C0288Gn) obj).f933b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f933b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f933b + '}';
    }
}
