.class final Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/ktor/client/engine/cio/UtilsKt$readResponse$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1"
    f = "utils.kt"
    l = {
        0xc9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $connectionType:Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;

.field final synthetic $contentLength:J

.field final synthetic $input:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

.field final synthetic $transferEncoding:Ljava/lang/String;

.field final synthetic $version:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;JLjava/lang/String;Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u4e16\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
            "J",
            "Ljava/lang/String;",
            "Lio/ktor/http/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$version:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    iput-wide p2, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$contentLength:J

    .line 4
    .line 5
    iput-object p4, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$transferEncoding:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$connectionType:Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    iput-object p6, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$input:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$version:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    iget-wide v2, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$contentLength:J

    .line 6
    .line 7
    iget-object v4, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$transferEncoding:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$connectionType:Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    iget-object v6, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$input:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;-><init>(L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;JLjava/lang/String;Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 27
    .line 28
    iget-object v3, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$version:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

    .line 29
    .line 30
    iget-wide v4, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$contentLength:J

    .line 31
    .line 32
    iget-object v6, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$transferEncoding:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v7, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$connectionType:Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;

    .line 35
    .line 36
    iget-object v8, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->$input:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 37
    .line 38
    iget-object v9, p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 39
    .line 40
    iput v2, p0, Lio/ktor/client/engine/cio/UtilsKt$readResponse$2$1$body$httpBodyParser$1;->label:I

    .line 41
    .line 42
    move-object v10, p0

    .line 43
    invoke-static/range {v3 .. v10}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲(L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;JLjava/lang/CharSequence;Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 51
    .line 52
    return-object p0
.end method
