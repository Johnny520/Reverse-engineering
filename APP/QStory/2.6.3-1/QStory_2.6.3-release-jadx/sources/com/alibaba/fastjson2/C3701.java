package com.alibaba.fastjson2;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3701 extends AbstractC3755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f9415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List f9416;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f9417;

    public C3701(String str, List list, JSONPath$Feature... jSONPath$FeatureArr) {
        super(str, jSONPath$FeatureArr);
        this.f9416 = list;
        int size = list.size();
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        while (true) {
            if (i >= size - 1) {
                break;
            }
            AbstractC3785 abstractC3785 = (AbstractC3785) list.get(i);
            if (abstractC3785 instanceof C3781) {
                if (((C3781) abstractC3785).f9681 < 0) {
                    z2 = false;
                }
            } else if (!(abstractC3785 instanceof C3780)) {
                if (i > 0) {
                    AbstractC3785 abstractC37852 = (AbstractC3785) list.get(i - 1);
                    if ((abstractC37852 instanceof C3788) && ((C3788) abstractC37852).m6981() && (abstractC3785 instanceof AbstractC3713)) {
                        ((AbstractC3713) abstractC3785).f9455 = false;
                    }
                }
                z = false;
            }
            i++;
        }
        this.f9417 = z2;
        this.f9415 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C3701.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9416, ((C3701) obj).f9416);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9416);
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo6506() {
        return this.f9415;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo6507(AbstractC3732 abstractC3732) {
        List list = this.f9416;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (!this.f9417) {
            return mo6508(abstractC3732.mo6684());
        }
        int i = 0;
        C3759 c3759 = null;
        boolean z = false;
        while (true) {
            if (i >= size) {
                break;
            }
            AbstractC3785 abstractC3785 = (AbstractC3785) list.get(i);
            i++;
            C3759 c37592 = new C3759(this, c3759, abstractC3785, i < size ? (AbstractC3785) list.get(i) : null);
            if (z) {
                abstractC3785.mo6513(c37592);
            } else {
                abstractC3785.mo6514(abstractC3732, c37592);
            }
            if (c37592.f9620) {
                if (c37592.f9614 == null) {
                    c3759 = c37592;
                    break;
                }
                z = true;
            }
            c3759 = c37592;
        }
        Object obj = c3759.f9614;
        if (obj instanceof C3754) {
            obj = ((C3754) obj).f9605;
        }
        if ((JSONPath$Feature.AlwaysReturnList.mask & this.f9607) != 0) {
            if (obj == null) {
                return new JSONArray();
            }
            if (!(obj instanceof List)) {
                return JSONArray.m0of(obj);
            }
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC3755
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo6508(Object obj) {
        List list = this.f9416;
        int size = list.size();
        if (size == 0) {
            return obj;
        }
        int i = 0;
        C3759 c3759 = null;
        while (i < size) {
            AbstractC3785 abstractC3785 = (AbstractC3785) list.get(i);
            int i2 = i + 1;
            C3759 c37592 = new C3759(this, c3759, abstractC3785, i2 < size ? (AbstractC3785) list.get(i2) : null);
            if (i == 0) {
                c37592.f9615 = obj;
            }
            if (i > 0) {
                AbstractC3785 abstractC37852 = (AbstractC3785) list.get(i - 1);
                if ((abstractC37852 instanceof C3788) && ((C3788) abstractC37852).m6981() && (abstractC3785 instanceof AbstractC3713)) {
                    ((AbstractC3713) abstractC3785).f9455 = false;
                }
            }
            abstractC3785.mo6513(c37592);
            i = i2;
            c3759 = c37592;
        }
        Object obj2 = c3759.f9614;
        return (c3759.f9619.f9607 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? obj2 == null ? new JSONArray() : !(obj2 instanceof List) ? JSONArray.m0of(obj2) : obj2 : obj2;
    }
}
