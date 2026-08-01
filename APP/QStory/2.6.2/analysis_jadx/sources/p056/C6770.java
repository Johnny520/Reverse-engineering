package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import p087.AbstractC7143;
import p089.InterfaceC7180;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6770 {
    public static final C6766 Companion = new C6766();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18213;

    public /* synthetic */ C6770(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6767.f18210.getDescriptor());
            throw null;
        }
        this.f18213 = str;
        this.f18212 = str2;
        if (AbstractC5138.m10125(str, "file://", false)) {
            return;
        }
        C5919.m11249("'uri' param must start with 'file://'");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6770)) {
            return false;
        }
        C6770 c6770 = (C6770) obj;
        return AbstractC4394.m8917(this.f18213, c6770.f18213) && AbstractC4394.m8917(this.f18212, c6770.f18212);
    }

    public final int hashCode() {
        int iHashCode = this.f18213.hashCode() * 31;
        String str = this.f18212;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Root(uri=");
        sb.append(this.f18213);
        sb.append(", name=");
        return AbstractC0053.m155(sb, this.f18212, ')');
    }
}
