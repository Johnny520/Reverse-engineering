package p056;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6619 implements InterfaceC6840 {
    public static final C6629 Companion = new C6629();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f17996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f17997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f17998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f17999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CreateMessageRequest$IncludeContext f18000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18002;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6810 f18003;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7152 f18004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7152 f18005;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6816 f18006;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17996 = new InterfaceC5184[]{AbstractC5187.m10215(lazyThreadSafetyMode, new C2558(29)), null, AbstractC5187.m10215(lazyThreadSafetyMode, new C6631(0)), null, null, AbstractC5187.m10215(lazyThreadSafetyMode, new C6631(1)), null, null, null, null};
    }

    public C6619(int i, List list, String str, CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext, Double d, int i2, List list2, C7152 c7152, C6810 c6810, C7152 c71522, InterfaceC6816 interfaceC6816) {
        if (191 != (i & 191)) {
            AbstractC7144.m12420(i, 191, C6630.f18016.getDescriptor());
            throw null;
        }
        this.f18002 = list;
        this.f18001 = str;
        this.f18000 = createMessageRequest$IncludeContext;
        this.f17999 = d;
        this.f17998 = i2;
        this.f17997 = list2;
        if ((i & 64) == 0) {
            this.f18004 = AbstractC6602.f17976;
        } else {
            this.f18004 = c7152;
        }
        this.f18003 = c6810;
        if ((i & 256) == 0) {
            this.f18005 = AbstractC6602.f17976;
        } else {
            this.f18005 = c71522;
        }
        if ((i & 512) == 0) {
            this.f18006 = Method$Defined.SamplingCreateMessage;
        } else {
            this.f18006 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6619)) {
            return false;
        }
        C6619 c6619 = (C6619) obj;
        return AbstractC4395.m8907(this.f18002, c6619.f18002) && AbstractC4395.m8907(this.f18001, c6619.f18001) && this.f18000 == c6619.f18000 && AbstractC4395.m8907(this.f17999, c6619.f17999) && this.f17998 == c6619.f17998 && AbstractC4395.m8907(this.f17997, c6619.f17997) && AbstractC4395.m8907(this.f18004, c6619.f18004) && AbstractC4395.m8907(this.f18003, c6619.f18003) && AbstractC4395.m8907(this.f18005, c6619.f18005);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18006;
    }

    public final int hashCode() {
        int iHashCode = this.f18002.hashCode() * 31;
        String str = this.f18001;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = this.f18000;
        int iHashCode3 = (iHashCode2 + (createMessageRequest$IncludeContext == null ? 0 : createMessageRequest$IncludeContext.hashCode())) * 31;
        Double d = this.f17999;
        int iM144 = AbstractC0053.m144(this.f17998, (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31);
        List list = this.f17997;
        int iM11571 = AbstractC6183.m11571(this.f18004.f19116, (iM144 + (list == null ? 0 : list.hashCode())) * 31, 31);
        C6810 c6810 = this.f18003;
        return this.f18005.f19116.hashCode() + ((iM11571 + (c6810 != null ? c6810.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageRequest(messages=");
        sb.append(this.f18002);
        sb.append(", systemPrompt=");
        sb.append(this.f18001);
        sb.append(", includeContext=");
        sb.append(this.f18000);
        sb.append(", temperature=");
        sb.append(this.f17999);
        sb.append(", maxTokens=");
        sb.append(this.f17998);
        sb.append(", stopSequences=");
        sb.append(this.f17997);
        sb.append(", metadata=");
        sb.append(this.f18004);
        sb.append(", modelPreferences=");
        sb.append(this.f18003);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18005, ')');
    }
}
