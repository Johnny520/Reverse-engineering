package p244;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8869 implements InterfaceC8870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile Map f22546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f22547;

    public C8869(Map map) {
        this.f22547 = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8869) {
            return this.f22547.equals(((C8869) obj).f22547);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22547.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f22547 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap m14085() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f22547.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C8868) list.get(i)).f22545;
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

    @Override // p244.InterfaceC8870
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map mo14086() {
        if (this.f22546 == null) {
            synchronized (this) {
                try {
                    if (this.f22546 == null) {
                        this.f22546 = Collections.unmodifiableMap(m14085());
                    }
                } finally {
                }
            }
        }
        return this.f22546;
    }
}
