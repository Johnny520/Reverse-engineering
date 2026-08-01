package p056;

import io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest$IncludeContext;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.Role;
import java.lang.annotation.Annotation;
import p052.InterfaceC6543;
import p087.C7077;
import p087.C7103;
import p087.C7135;
import p087.C7146;
import p088.C7154;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6631 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18017;

    public /* synthetic */ C6631(int i) {
        this.f18017 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f18017) {
            case 0:
                return CreateMessageRequest$IncludeContext.Companion.serializer();
            case 1:
                return new C7103(C7135.f19089, 0);
            case 2:
                return CreateMessageRequest$IncludeContext._init_$_anonymous_();
            case 3:
                return Role.Companion.serializer();
            case 4:
                return ErrorCode$Defined._init_$_anonymous_();
            case 5:
                C7135 c7135 = C7135.f19089;
                return new C7077(c7135, c7135, 1);
            case 6:
                return new C7103(C6737.f18164, 0);
            case 7:
                return new C6835();
            case 8:
                return new C6835();
            case 9:
                return new C7103(C6753.f18181, 0);
            case 10:
                return new C7103(C6799.f18237, 0);
            case 11:
                return new C7103(C6794.f18234, 0);
            case 12:
                return new C7103(C6768.f18205, 0);
            case 13:
                return new C7103(C6579.f17951, 0);
            case 14:
                return LoggingLevel._init_$_anonymous_();
            case 15:
                return LoggingLevel.Companion.serializer();
            case 16:
                return LoggingLevel.Companion.serializer();
            case 17:
                return Method$Defined._init_$_anonymous_();
            case 18:
                return new C7103(C6815.f18255, 0);
            case 19:
                return new C6835();
            case 20:
                return new C7103(C6750.f18176, 0);
            case 21:
                return Role.Companion.serializer();
            case 22:
                return new C7103(C6779.f18215, 0);
            case 23:
                return Role._init_$_anonymous_();
            case 24:
                return Role.Companion.serializer();
            case 25:
                return new C7146("io.modelcontextprotocol.kotlin.sdk.StopReason.EndTurn", C6766.INSTANCE, new Annotation[0]);
            case 26:
                return new C7146("io.modelcontextprotocol.kotlin.sdk.StopReason.MaxTokens", C6765.INSTANCE, new Annotation[0]);
            case 27:
                return new C7146("io.modelcontextprotocol.kotlin.sdk.StopReason.StopSequence", C6583.INSTANCE, new Annotation[0]);
            case 28:
                return new C7103(C7135.f19089, 0);
            default:
                return C7154.f19117;
        }
    }
}
