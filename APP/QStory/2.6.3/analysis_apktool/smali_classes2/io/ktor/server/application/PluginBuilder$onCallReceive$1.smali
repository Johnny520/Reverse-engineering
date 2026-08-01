.class final synthetic Lio/ktor/server/application/PluginBuilder$onCallReceive$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
.field public static final INSTANCE:Lio/ktor/server/application/PluginBuilder$onCallReceive$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/server/application/PluginBuilder$onCallReceive$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/server/application/PluginBuilder$onCallReceive$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/server/application/PluginBuilder$onCallReceive$1;->INSTANCE:Lio/ktor/server/application/PluginBuilder$onCallReceive$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v2, Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;

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
.method public final invoke(Ljava/lang/Object;Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;)Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ")",
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p2, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    invoke-virtual {p0, p1, p2}, Lio/ktor/server/application/PluginBuilder$onCallReceive$1;->invoke(Ljava/lang/Object;Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;)Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;

    move-result-object p0

    return-object p0
.end method
