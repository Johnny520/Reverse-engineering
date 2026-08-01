package com.alibaba.fastjson2;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2867 extends AbstractC2921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f9069;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9070;

    public C2867(String str, List list, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9069 = list;
        int size = list.size();
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        while (true) {
            if (i >= size - 1) {
                break;
            }
            AbstractC2951 abstractC2951 = (AbstractC2951) list.get(i);
            if (abstractC2951 instanceof C2947) {
                if (((C2947) abstractC2951).f9334 < 0) {
                    z2 = false;
                }
            } else if (!(abstractC2951 instanceof C2946)) {
                if (i > 0) {
                    AbstractC2951 abstractC29512 = (AbstractC2951) list.get(i - 1);
                    if ((abstractC29512 instanceof C2954) && ((C2954) abstractC29512).m6363() && (abstractC2951 instanceof AbstractC2879)) {
                        ((AbstractC2879) abstractC2951).f9108 = false;
                    }
                }
                z = false;
            }
            i++;
        }
        this.f9070 = z2;
        this.f9068 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C2867.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9069, ((C2867) obj).f9069);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9069);
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo5901() {
        return this.f9068;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo5902(AbstractC2898 abstractC2898) {
        List list = this.f9069;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (!this.f9070) {
            return mo5903(abstractC2898.mo6078());
        }
        int i = 0;
        C2925 c2925 = null;
        boolean z = false;
        while (true) {
            if (i >= size) {
                break;
            }
            AbstractC2951 abstractC2951 = (AbstractC2951) list.get(i);
            i++;
            C2925 c29252 = new C2925(this, c2925, abstractC2951, i < size ? (AbstractC2951) list.get(i) : null);
            if (z) {
                abstractC2951.mo5908(c29252);
            } else {
                abstractC2951.mo5909(abstractC2898, c29252);
            }
            if (c29252.f9273) {
                if (c29252.f9267 == null) {
                    c2925 = c29252;
                    break;
                }
                z = true;
            }
            c2925 = c29252;
        }
        Object obj = c2925.f9267;
        if (obj instanceof C2920) {
            obj = ((C2920) obj).f9258;
        }
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9260) != 0) {
            if (obj == null) {
                return new JSONArray();
            }
            if (!(obj instanceof List)) {
                return JSONArray.of(obj);
            }
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo5903(Object obj) {
        List list = this.f9069;
        int size = list.size();
        if (size == 0) {
            return obj;
        }
        int i = 0;
        C2925 c2925 = null;
        while (i < size) {
            AbstractC2951 abstractC2951 = (AbstractC2951) list.get(i);
            int i2 = i + 1;
            C2925 c29252 = new C2925(this, c2925, abstractC2951, i2 < size ? (AbstractC2951) list.get(i2) : null);
            if (i == 0) {
                c29252.f9268 = obj;
            }
            if (i > 0) {
                AbstractC2951 abstractC29512 = (AbstractC2951) list.get(i - 1);
                if ((abstractC29512 instanceof C2954) && ((C2954) abstractC29512).m6363() && (abstractC2951 instanceof AbstractC2879)) {
                    ((AbstractC2879) abstractC2951).f9108 = false;
                }
            }
            abstractC2951.mo5908(c29252);
            i = i2;
            c2925 = c29252;
        }
        Object obj2 = c2925.f9267;
        return (c2925.f9272.f9260 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? obj2 == null ? new JSONArray() : !(obj2 instanceof List) ? JSONArray.of(obj2) : obj2 : obj2;
    }
}
