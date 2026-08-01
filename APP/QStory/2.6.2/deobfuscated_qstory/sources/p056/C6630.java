package p056;

import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.Role;
import java.lang.annotation.Annotation;
import p052.InterfaceC6542;
import p087.C7076;
import p087.C7102;
import p087.C7134;
import p087.C7145;
import p088.C7153;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6630 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18022;

    public /* synthetic */ C6630(int i) {
        this.f18022 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f18022) {
            case 0:
                return CreateMessageRequest$IncludeContext.Companion.serializer();
            case 1:
                return new C7102(C7134.f19094, 0);
            case 2:
                return CreateMessageRequest$IncludeContext._init_$_anonymous_();
            case 3:
                return Role.Companion.serializer();
            case 4:
                return ErrorCode$Defined._init_$_anonymous_();
            case 5:
                C7134 c7134 = C7134.f19094;
                return new C7076(c7134, c7134, 1);
            case 6:
                return new C7102(C6736.f18169, 0);
            case 7:
                return new C6834();
            case 8:
                return new C6834();
            case 9:
                return new C7102(C6752.f18186, 0);
            case 10:
                return new C7102(C6798.f18242, 0);
            case 11:
                return new C7102(C6793.f18239, 0);
            case 12:
                return new C7102(C6767.f18210, 0);
            case 13:
                return new C7102(C6578.f17956, 0);
            case 14:
                return LoggingLevel._init_$_anonymous_();
            case 15:
                return LoggingLevel.Companion.serializer();
            case 16:
                return LoggingLevel.Companion.serializer();
            case 17:
                return Method$Defined._init_$_anonymous_();
            case 18:
                return new C7102(C6814.f18260, 0);
            case 19:
                return new C6834();
            case 20:
                return new C7102(C6749.f18181, 0);
            case 21:
                return Role.Companion.serializer();
            case 22:
                return new C7102(C6778.f18220, 0);
            case 23:
                return Role._init_$_anonymous_();
            case 24:
                return Role.Companion.serializer();
            case 25:
                return new C7145("io.modelcontextprotocol.kotlin.sdk.StopReason.EndTurn", C6765.INSTANCE, new Annotation[0]);
            case 26:
                return new C7145("io.modelcontextprotocol.kotlin.sdk.StopReason.MaxTokens", C6764.INSTANCE, new Annotation[0]);
            case 27:
                return new C7145("io.modelcontextprotocol.kotlin.sdk.StopReason.StopSequence", C6582.INSTANCE, new Annotation[0]);
            case 28:
                return new C7102(C7134.f19094, 0);
            default:
                return C7153.f19122;
        }
    }
}
