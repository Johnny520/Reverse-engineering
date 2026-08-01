.class final Lio/ktor/server/http/content/PreCompressedKt$respondStaticResource$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.http.content.PreCompressedKt"
    f = "PreCompressed.kt"
    l = {
        0xda,
        0xc4,
        0xec,
        0xfe,
        0xd5,
        0x110
    }
    m = "respondStaticResource"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/http/content/PreCompressedKt$respondStaticResource$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iput-object p1, p0, Lio/ktor/server/http/content/PreCompressedKt$respondStaticResource$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/server/http/content/PreCompressedKt$respondStaticResource$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/server/http/content/PreCompressedKt$respondStaticResource$1;->label:I

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v8, p0

    .line 19
    invoke-static/range {v0 .. v8}, Lio/ktor/server/http/content/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
