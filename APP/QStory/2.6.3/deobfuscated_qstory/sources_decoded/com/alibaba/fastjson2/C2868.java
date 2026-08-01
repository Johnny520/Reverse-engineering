package com.alibaba.fastjson2;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2868 extends AbstractC2922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f9071;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9072;

    public C2868(String str, List list, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9071 = list;
        int size = list.size();
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        while (true) {
            if (i >= size - 1) {
                break;
            }
            AbstractC2952 abstractC2952 = (AbstractC2952) list.get(i);
            if (abstractC2952 instanceof C2948) {
                if (((C2948) abstractC2952).f9336 < 0) {
                    z2 = false;
                }
            } else if (!(abstractC2952 instanceof C2947)) {
                if (i > 0) {
                    AbstractC2952 abstractC29522 = (AbstractC2952) list.get(i - 1);
                    if ((abstractC29522 instanceof C2955) && ((C2955) abstractC29522).m6421() && (abstractC2952 instanceof AbstractC2880)) {
                        ((AbstractC2880) abstractC2952).f9110 = false;
                    }
                }
                z = false;
            }
            i++;
        }
        this.f9072 = z2;
        this.f9070 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C2868.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9071, ((C2868) obj).f9071);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9071);
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo5946() {
        return this.f9070;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo5947(AbstractC2899 abstractC2899) {
        List list = this.f9071;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (!this.f9072) {
            return mo5948(abstractC2899.mo6124());
        }
        int i = 0;
        C2926 c2926 = null;
        boolean z = false;
        while (true) {
            if (i >= size) {
                break;
            }
            AbstractC2952 abstractC2952 = (AbstractC2952) list.get(i);
            i++;
            C2926 c29262 = new C2926(this, c2926, abstractC2952, i < size ? (AbstractC2952) list.get(i) : null);
            if (z) {
                abstractC2952.mo5953(c29262);
            } else {
                abstractC2952.mo5954(abstractC2899, c29262);
            }
            if (c29262.f9275) {
                if (c29262.f9269 == null) {
                    c2926 = c29262;
                    break;
                }
                z = true;
            }
            c2926 = c29262;
        }
        Object obj = c2926.f9269;
        if (obj instanceof C2921) {
            obj = ((C2921) obj).f9260;
        }
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9262) != 0) {
            if (obj == null) {
                return new JSONArray();
            }
            if (!(obj instanceof List)) {
                return JSONArray.of(obj);
            }
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo5948(Object obj) {
        List list = this.f9071;
        int size = list.size();
        if (size == 0) {
            return obj;
        }
        int i = 0;
        C2926 c2926 = null;
        while (i < size) {
            AbstractC2952 abstractC2952 = (AbstractC2952) list.get(i);
            int i2 = i + 1;
            C2926 c29262 = new C2926(this, c2926, abstractC2952, i2 < size ? (AbstractC2952) list.get(i2) : null);
            if (i == 0) {
                c29262.f9270 = obj;
            }
            if (i > 0) {
                AbstractC2952 abstractC29522 = (AbstractC2952) list.get(i - 1);
                if ((abstractC29522 instanceof C2955) && ((C2955) abstractC29522).m6421() && (abstractC2952 instanceof AbstractC2880)) {
                    ((AbstractC2880) abstractC2952).f9110 = false;
                }
            }
            abstractC2952.mo5953(c29262);
            i = i2;
            c2926 = c29262;
        }
        Object obj2 = c2926.f9269;
        return (c2926.f9274.f9262 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? obj2 == null ? new JSONArray() : !(obj2 instanceof List) ? JSONArray.of(obj2) : obj2 : obj2;
    }
}
