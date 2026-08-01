package p107V1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: V1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1512k implements InterfaceC1509h {

    /* JADX INFO: renamed from: b */
    public final Map f5259b;

    /* JADX INFO: renamed from: c */
    public volatile Map f5260c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1512k(Map map) {
        this.f5259b = Collections.unmodifiableMap(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1509h
    /* JADX INFO: renamed from: a */
    public final Map mo2781a() {
        if (this.f5260c == null) {
            synchronized (this) {
                try {
                    if (this.f5260c == null) {
                        this.f5260c = Collections.unmodifiableMap(m2782b());
                    }
                } finally {
                }
            }
        }
        return this.f5260c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final HashMap m2782b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5259b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str = ((C1511j) list.get(i5)).f5258a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i5 != list.size() - 1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1512k) {
            return this.f5259b.equals(((C1512k) obj).f5259b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5259b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LazyHeaders{headers=" + this.f5259b + '}';
    }
}
