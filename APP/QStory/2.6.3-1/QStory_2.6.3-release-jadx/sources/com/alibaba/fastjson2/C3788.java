package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.util.Collection;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3788 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9701 = AbstractC3693.m6334(Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9700 = AbstractC3693.m6334("");

    public C3788(String str, long j) {
        this.f9703 = str;
        this.f9702 = j;
    }

    public final String toString() {
        return ".." + this.f9703;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m6981() {
        long j = f9701;
        long j2 = this.f9702;
        return j2 == j || j2 == f9700;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6982(AbstractC3732 abstractC3732, JSONArray jSONArray) {
        Object objMo6744;
        boolean z = abstractC3732.f9544;
        long j = this.f9702;
        if (z) {
            if (!abstractC3732.mo6703((byte) -90)) {
                if (!abstractC3732.mo6729()) {
                    abstractC3732.mo6793();
                    return;
                }
                int iMo6792 = abstractC3732.mo6792();
                for (int i = 0; i < iMo6792; i++) {
                    if (abstractC3732.mo6737() || abstractC3732.mo6729()) {
                        m6982(abstractC3732, jSONArray);
                    } else {
                        abstractC3732.mo6793();
                    }
                }
                return;
            }
            while (!abstractC3732.mo6703((byte) -91)) {
                long jMo6689 = abstractC3732.mo6689();
                if (jMo6689 != 0) {
                    if (jMo6689 == j) {
                        if (abstractC3732.mo6729()) {
                            jSONArray.addAll(abstractC3732.mo6685());
                        } else {
                            jSONArray.add(abstractC3732.mo6684());
                        }
                    } else if (abstractC3732.mo6737() || abstractC3732.mo6729()) {
                        m6982(abstractC3732, jSONArray);
                    } else {
                        abstractC3732.mo6793();
                    }
                }
            }
            return;
        }
        char c = abstractC3732.f9538;
        if (c != '{') {
            if (c != '[') {
                abstractC3732.mo6793();
                return;
            }
            abstractC3732.mo6733();
            while (true) {
                char c2 = abstractC3732.f9538;
                if (c2 == ']') {
                    abstractC3732.mo6733();
                    break;
                }
                if (c2 == '{' || c2 == '[') {
                    m6982(abstractC3732, jSONArray);
                } else {
                    abstractC3732.mo6793();
                }
                if (abstractC3732.f9538 == ',') {
                    abstractC3732.mo6733();
                    break;
                }
            }
            if (abstractC3732.f9538 == ',') {
                abstractC3732.mo6733();
                return;
            }
            return;
        }
        abstractC3732.mo6733();
        while (abstractC3732.f9538 != '}') {
            boolean z2 = abstractC3732.mo6689() == j;
            char c3 = abstractC3732.f9538;
            if (!z2 && c3 != '{' && c3 != '[') {
                abstractC3732.mo6793();
            } else if (c3 == '\"' || c3 == '\'') {
                objMo6744 = abstractC3732.mo6744();
                if (objMo6744 instanceof Collection) {
                    jSONArray.add(objMo6744);
                } else {
                    jSONArray.addAll((Collection) objMo6744);
                }
                if (abstractC3732.f9538 != ',') {
                    abstractC3732.mo6733();
                }
            } else {
                if (c3 != '+' && c3 != '-') {
                    if (c3 != '[') {
                        if (c3 != 'f') {
                            if (c3 == 'n') {
                                abstractC3732.mo6762();
                                objMo6744 = null;
                                if (objMo6744 instanceof Collection) {
                                }
                                if (abstractC3732.f9538 != ',') {
                                }
                            } else if (c3 != 't') {
                                if (c3 != '{') {
                                    switch (c3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            C1123.m1402(abstractC3732.f9538, "TODO : ");
                                            return;
                                    }
                                    if (objMo6744 instanceof Collection) {
                                    }
                                    if (abstractC3732.f9538 != ',') {
                                    }
                                }
                                if (z2) {
                                }
                            }
                        }
                        objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                        if (objMo6744 instanceof Collection) {
                        }
                        if (abstractC3732.f9538 != ',') {
                        }
                    } else if (z2) {
                        m6982(abstractC3732, jSONArray);
                    } else {
                        objMo6744 = c3 == '[' ? abstractC3732.mo6685() : abstractC3732.mo6754();
                        if (objMo6744 instanceof Collection) {
                        }
                        if (abstractC3732.f9538 != ',') {
                        }
                    }
                }
                abstractC3732.mo6755();
                objMo6744 = abstractC3732.m6663();
                if (objMo6744 instanceof Collection) {
                }
                if (abstractC3732.f9538 != ',') {
                }
            }
        }
        abstractC3732.mo6733();
        if (abstractC3732.f9538 == ',') {
            abstractC3732.mo6733();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        JSONArray jSONArray = new JSONArray();
        (m6981() ? new C3791(this, c3759, jSONArray) : new C3790(this, c3759, jSONArray)).accept(obj);
        if (jSONArray.size() == 1 && (jSONArray.get(0) instanceof Collection)) {
            c3759.f9614 = jSONArray.get(0);
        } else {
            c3759.f9614 = jSONArray;
        }
        Object obj2 = c3759.f9614;
        if ((obj2 instanceof List) && (c3759.f9616 instanceof AbstractC3711)) {
            c3759.f9614 = new C3754((List) obj2);
        }
        c3759.f9620 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        JSONArray jSONArray = new JSONArray();
        m6982(abstractC3732, jSONArray);
        c3759.f9614 = jSONArray;
        c3759.f9620 = true;
    }
}
