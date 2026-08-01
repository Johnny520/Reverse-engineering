package p072;

import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.Role;
import java.lang.annotation.Annotation;
import p068.InterfaceC7372;
import p103.C7906;
import p103.C7932;
import p103.C7964;
import p103.C7975;
import p104.C7983;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7460 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18362;

    public /* synthetic */ C7460(int i) {
        this.f18362 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f18362) {
            case 0:
                return CreateMessageRequest$IncludeContext.Companion.serializer();
            case 1:
                return new C7932(C7964.f19434, 0);
            case 2:
                return CreateMessageRequest$IncludeContext._init_$_anonymous_();
            case 3:
                return Role.Companion.serializer();
            case 4:
                return ErrorCode$Defined._init_$_anonymous_();
            case 5:
                C7964 c7964 = C7964.f19434;
                return new C7906(c7964, c7964, 1);
            case 6:
                return new C7932(C7566.f18509, 0);
            case 7:
                return new C7664();
            case 8:
                return new C7664();
            case 9:
                return new C7932(C7582.f18526, 0);
            case 10:
                return new C7932(C7628.f18582, 0);
            case 11:
                return new C7932(C7623.f18579, 0);
            case 12:
                return new C7932(C7597.f18550, 0);
            case 13:
                return new C7932(C7408.f18296, 0);
            case 14:
                return LoggingLevel._init_$_anonymous_();
            case 15:
                return LoggingLevel.Companion.serializer();
            case 16:
                return LoggingLevel.Companion.serializer();
            case 17:
                return Method$Defined._init_$_anonymous_();
            case 18:
                return new C7932(C7644.f18600, 0);
            case 19:
                return new C7664();
            case 20:
                return new C7932(C7579.f18521, 0);
            case 21:
                return Role.Companion.serializer();
            case 22:
                return new C7932(C7608.f18560, 0);
            case 23:
                return Role._init_$_anonymous_();
            case 24:
                return Role.Companion.serializer();
            case 25:
                return new C7975("io.modelcontextprotocol.kotlin.sdk.StopReason.EndTurn", C7595.INSTANCE, new Annotation[0]);
            case 26:
                return new C7975("io.modelcontextprotocol.kotlin.sdk.StopReason.MaxTokens", C7594.INSTANCE, new Annotation[0]);
            case 27:
                return new C7975("io.modelcontextprotocol.kotlin.sdk.StopReason.StopSequence", C7412.INSTANCE, new Annotation[0]);
            case 28:
                return new C7932(C7964.f19434, 0);
            default:
                return C7983.f19462;
        }
    }
}
