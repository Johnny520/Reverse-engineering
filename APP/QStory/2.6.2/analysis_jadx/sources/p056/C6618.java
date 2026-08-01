package p056;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6618 implements InterfaceC6839 {
    public static final C6628 Companion = new C6628();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f18002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f18003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CreateMessageRequest$IncludeContext f18005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18007;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6809 f18008;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7151 f18009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7151 f18010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6815 f18011;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f18001 = new InterfaceC5183[]{AbstractC5186.m10211(lazyThreadSafetyMode, new C2558(29)), null, AbstractC5186.m10211(lazyThreadSafetyMode, new C6630(0)), null, null, AbstractC5186.m10211(lazyThreadSafetyMode, new C6630(1)), null, null, null, null};
    }

    public C6618(int i, List list, String str, CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext, Double d, int i2, List list2, C7151 c7151, C6809 c6809, C7151 c71512, InterfaceC6815 interfaceC6815) {
        if (191 != (i & 191)) {
            AbstractC7143.m12393(i, 191, C6629.f18021.getDescriptor());
            throw null;
        }
        this.f18007 = list;
        this.f18006 = str;
        this.f18005 = createMessageRequest$IncludeContext;
        this.f18004 = d;
        this.f18003 = i2;
        this.f18002 = list2;
        if ((i & 64) == 0) {
            this.f18009 = AbstractC6601.f17981;
        } else {
            this.f18009 = c7151;
        }
        this.f18008 = c6809;
        if ((i & 256) == 0) {
            this.f18010 = AbstractC6601.f17981;
        } else {
            this.f18010 = c71512;
        }
        if ((i & 512) == 0) {
            this.f18011 = Method$Defined.SamplingCreateMessage;
        } else {
            this.f18011 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6618)) {
            return false;
        }
        C6618 c6618 = (C6618) obj;
        return AbstractC4394.m8917(this.f18007, c6618.f18007) && AbstractC4394.m8917(this.f18006, c6618.f18006) && this.f18005 == c6618.f18005 && AbstractC4394.m8917(this.f18004, c6618.f18004) && this.f18003 == c6618.f18003 && AbstractC4394.m8917(this.f18002, c6618.f18002) && AbstractC4394.m8917(this.f18009, c6618.f18009) && AbstractC4394.m8917(this.f18008, c6618.f18008) && AbstractC4394.m8917(this.f18010, c6618.f18010);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18011;
    }

    public final int hashCode() {
        int iHashCode = this.f18007.hashCode() * 31;
        String str = this.f18006;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = this.f18005;
        int iHashCode3 = (iHashCode2 + (createMessageRequest$IncludeContext == null ? 0 : createMessageRequest$IncludeContext.hashCode())) * 31;
        Double d = this.f18004;
        int iM143 = AbstractC0053.m143(this.f18003, (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31);
        List list = this.f18002;
        int iM11538 = AbstractC6136.m11538(this.f18009.f19121, (iM143 + (list == null ? 0 : list.hashCode())) * 31, 31);
        C6809 c6809 = this.f18008;
        return this.f18010.f19121.hashCode() + ((iM11538 + (c6809 != null ? c6809.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageRequest(messages=");
        sb.append(this.f18007);
        sb.append(", systemPrompt=");
        sb.append(this.f18006);
        sb.append(", includeContext=");
        sb.append(this.f18005);
        sb.append(", temperature=");
        sb.append(this.f18004);
        sb.append(", maxTokens=");
        sb.append(this.f18003);
        sb.append(", stopSequences=");
        sb.append(this.f18002);
        sb.append(", metadata=");
        sb.append(this.f18009);
        sb.append(", modelPreferences=");
        sb.append(this.f18008);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18010, ')');
    }
}
