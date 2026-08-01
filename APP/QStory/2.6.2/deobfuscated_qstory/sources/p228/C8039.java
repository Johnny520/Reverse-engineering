package p228;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8039 implements InterfaceC8040 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile Map f22204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f22205;

    public C8039(Map map) {
        this.f22205 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8039) {
            return this.f22205.equals(((C8039) obj).f22205);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22205.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f22205 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap m13498() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f22205.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C8038) list.get(i)).f22203;
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

    @Override // p228.InterfaceC8040
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map mo13499() {
        if (this.f22204 == null) {
            synchronized (this) {
                try {
                    if (this.f22204 == null) {
                        this.f22204 = Collections.unmodifiableMap(m13498());
                    }
                } finally {
                }
            }
        }
        return this.f22204;
    }
}
