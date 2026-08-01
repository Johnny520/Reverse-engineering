.class final synthetic Lio/ktor/client/plugins/sse/SSEKt$SSE$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/ktor/client/plugins/sse/SSEKt$SSE$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/client/plugins/sse/SSEKt$SSE$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/client/plugins/sse/SSEKt$SSE$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/client/plugins/sse/SSEKt$SSE$1;->INSTANCE:Lio/ktor/client/plugins/sse/SSEKt$SSE$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "<init>()V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v2, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    const-string v3, "<init>"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰苏哲;
    .locals 2

    .line 1
    new-instance p0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    const/16 v0, 0xbb8

    .line 9
    .line 10
    sget-object v1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(ILkotlin/time/DurationUnit;)J

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual {p0}, Lio/ktor/client/plugins/sse/SSEKt$SSE$1;->invoke()Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰苏哲;

    move-result-object p0

    return-object p0
.end method
