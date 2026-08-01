package p228;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8040 implements InterfaceC8041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile Map f22201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f22202;

    public C8040(Map map) {
        this.f22202 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8040) {
            return this.f22202.equals(((C8040) obj).f22202);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22202.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f22202 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap m13526() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f22202.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C8039) list.get(i)).f22200;
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

    @Override // p228.InterfaceC8041
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map mo13527() {
        if (this.f22201 == null) {
            synchronized (this) {
                try {
                    if (this.f22201 == null) {
                        this.f22201 = Collections.unmodifiableMap(m13526());
                    }
                } finally {
                }
            }
        }
        return this.f22201;
    }
}
