package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import p050.AbstractC7176;
import p252.C8932;
import p252.C8947;
import p252.InterfaceC8924;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4998 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12967;

    public C4998(String str, String str2) {
        this.f12967 = str;
        this.f12966 = str2;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '/') {
                C6755.m11869("Multisegment prefix is not supported");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4998)) {
            return false;
        }
        C4998 c4998 = (C4998) obj;
        return this.f12967.equals(c4998.f12967) && this.f12966.equals(c4998.f12966);
    }

    public final int hashCode() {
        return this.f12966.hashCode() + (this.f12967.hashCode() * 31);
    }

    public final String toString() {
        return "{...}";
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        InterfaceC8924 c8932;
        String str;
        List list = c4974.f12898;
        String str2 = this.f12966;
        int i2 = 0;
        if (str2.length() > 0 && ((str = (String) AbstractC5176.m9377(i, list)) == null || !AbstractC5971.m10698(str, str2, false))) {
            return AbstractC4992.f12950;
        }
        String str3 = this.f12967;
        if (str3.length() == 0) {
            InterfaceC8924.f22683.getClass();
            c8932 = C8947.f22759;
        } else {
            List listM9364 = AbstractC5176.m9364(i, list);
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM9364, 10));
            for (Object obj : listM9364) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC7176.m12479();
                    throw null;
                }
                String strM10721 = (String) obj;
                if (i2 == 0) {
                    strM10721 = AbstractC5976.m10721(str2.length(), strM10721);
                }
                arrayList.add(strM10721);
                i2 = i3;
            }
            c8932 = new C8932(str3, arrayList);
        }
        return new C4993(i < list.size() ? 0.1d : 0.2d, c8932, list.size() - i);
    }
}
