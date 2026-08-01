package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import p236.C8102;
import p236.C8117;
import p236.InterfaceC8094;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4165 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f12617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12618;

    public C4165(String str, String str2) {
        this.f12618 = str;
        this.f12617 = str2;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '/') {
                C5919.m11249("Multisegment prefix is not supported");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4165)) {
            return false;
        }
        C4165 c4165 = (C4165) obj;
        return this.f12618.equals(c4165.f12618) && this.f12617.equals(c4165.f12617);
    }

    public final int hashCode() {
        return this.f12617.hashCode() + (this.f12618.hashCode() * 31);
    }

    public final String toString() {
        return "{...}";
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        InterfaceC8094 c8102;
        String str;
        List list = c4141.f12549;
        String str2 = this.f12617;
        int i2 = 0;
        if (str2.length() > 0 && ((str = (String) AbstractC4343.m8831(i, list)) == null || !AbstractC5138.m10125(str, str2, false))) {
            return AbstractC4159.f12601;
        }
        String str3 = this.f12618;
        if (str3.length() == 0) {
            InterfaceC8094.f22340.getClass();
            c8102 = C8117.f22416;
        } else {
            List listM8792 = AbstractC4343.m8792(i, list);
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM8792, 10));
            for (Object obj : listM8792) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC8189.m13662();
                    throw null;
                }
                String strM10169 = (String) obj;
                if (i2 == 0) {
                    strM10169 = AbstractC5143.m10169(str2.length(), strM10169);
                }
                arrayList.add(strM10169);
                i2 = i3;
            }
            c8102 = new C8102(str3, arrayList);
        }
        return new C4160(i < list.size() ? 0.1d : 0.2d, c8102, list.size() - i);
    }
}
