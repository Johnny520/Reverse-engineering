package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import p034.AbstractC6347;
import p236.C8103;
import p236.C8118;
import p236.InterfaceC8095;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4166 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12622;

    public C4166(String str, String str2) {
        this.f12622 = str;
        this.f12621 = str2;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '/') {
                C5925.m11310("Multisegment prefix is not supported");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4166)) {
            return false;
        }
        C4166 c4166 = (C4166) obj;
        return this.f12622.equals(c4166.f12622) && this.f12621.equals(c4166.f12621);
    }

    public final int hashCode() {
        return this.f12621.hashCode() + (this.f12622.hashCode() * 31);
    }

    public final String toString() {
        return "{...}";
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        InterfaceC8095 c8103;
        String str;
        List list = c4142.f12553;
        String str2 = this.f12621;
        int i2 = 0;
        if (str2.length() > 0 && ((str = (String) AbstractC4344.m8818(i, list)) == null || !AbstractC5139.m10139(str, str2, false))) {
            return AbstractC4160.f12605;
        }
        String str3 = this.f12622;
        if (str3.length() == 0) {
            InterfaceC8095.f22338.getClass();
            c8103 = C8118.f22414;
        } else {
            List listM8805 = AbstractC4344.m8805(i, list);
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM8805, 10));
            for (Object obj : listM8805) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC6347.m11920();
                    throw null;
                }
                String strM10162 = (String) obj;
                if (i2 == 0) {
                    strM10162 = AbstractC5144.m10162(str2.length(), strM10162);
                }
                arrayList.add(strM10162);
                i2 = i3;
            }
            c8103 = new C8103(str3, arrayList);
        }
        return new C4161(i < list.size() ? 0.1d : 0.2d, c8103, list.size() - i);
    }
}
