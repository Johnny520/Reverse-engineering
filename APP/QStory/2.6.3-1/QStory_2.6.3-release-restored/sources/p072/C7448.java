package p072;

import androidx.activity.AbstractC0900;
import androidx.window.area.C3391;
import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7448 implements InterfaceC7669 {
    public static final C7458 Companion = new C7458();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f18342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f18343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CreateMessageRequest$IncludeContext f18345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18347;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7639 f18348;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7981 f18349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7981 f18350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC7645 f18351;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f18341 = new InterfaceC6016[]{AbstractC6019.m10774(lazyThreadSafetyMode, new C3391(29)), null, AbstractC6019.m10774(lazyThreadSafetyMode, new C7460(0)), null, null, AbstractC6019.m10774(lazyThreadSafetyMode, new C7460(1)), null, null, null, null};
    }

    public C7448(int i, List list, String str, CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext, Double d, int i2, List list2, C7981 c7981, C7639 c7639, C7981 c79812, InterfaceC7645 interfaceC7645) {
        if (191 != (i & 191)) {
            AbstractC7973.m12979(i, 191, C7459.f18361.getDescriptor());
            throw null;
        }
        this.f18347 = list;
        this.f18346 = str;
        this.f18345 = createMessageRequest$IncludeContext;
        this.f18344 = d;
        this.f18343 = i2;
        this.f18342 = list2;
        if ((i & 64) == 0) {
            this.f18349 = AbstractC7431.f18321;
        } else {
            this.f18349 = c7981;
        }
        this.f18348 = c7639;
        if ((i & 256) == 0) {
            this.f18350 = AbstractC7431.f18321;
        } else {
            this.f18350 = c79812;
        }
        if ((i & 512) == 0) {
            this.f18351 = Method$Defined.SamplingCreateMessage;
        } else {
            this.f18351 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7448)) {
            return false;
        }
        C7448 c7448 = (C7448) obj;
        return AbstractC5227.m9466(this.f18347, c7448.f18347) && AbstractC5227.m9466(this.f18346, c7448.f18346) && this.f18345 == c7448.f18345 && AbstractC5227.m9466(this.f18344, c7448.f18344) && this.f18343 == c7448.f18343 && AbstractC5227.m9466(this.f18342, c7448.f18342) && AbstractC5227.m9466(this.f18349, c7448.f18349) && AbstractC5227.m9466(this.f18348, c7448.f18348) && AbstractC5227.m9466(this.f18350, c7448.f18350);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18351;
    }

    public final int hashCode() {
        int iHashCode = this.f18347.hashCode() * 31;
        String str = this.f18346;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CreateMessageRequest$IncludeContext createMessageRequest$IncludeContext = this.f18345;
        int iHashCode3 = (iHashCode2 + (createMessageRequest$IncludeContext == null ? 0 : createMessageRequest$IncludeContext.hashCode())) * 31;
        Double d = this.f18344;
        int iM704 = AbstractC0900.m704(this.f18343, (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31);
        List list = this.f18342;
        int iM12130 = AbstractC7012.m12130(this.f18349.f19461, (iM704 + (list == null ? 0 : list.hashCode())) * 31, 31);
        C7639 c7639 = this.f18348;
        return this.f18350.f19461.hashCode() + ((iM12130 + (c7639 != null ? c7639.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageRequest(messages=");
        sb.append(this.f18347);
        sb.append(", systemPrompt=");
        sb.append(this.f18346);
        sb.append(", includeContext=");
        sb.append(this.f18345);
        sb.append(", temperature=");
        sb.append(this.f18344);
        sb.append(", maxTokens=");
        sb.append(this.f18343);
        sb.append(", stopSequences=");
        sb.append(this.f18342);
        sb.append(", metadata=");
        sb.append(this.f18349);
        sb.append(", modelPreferences=");
        sb.append(this.f18348);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18350, ')');
    }
}
