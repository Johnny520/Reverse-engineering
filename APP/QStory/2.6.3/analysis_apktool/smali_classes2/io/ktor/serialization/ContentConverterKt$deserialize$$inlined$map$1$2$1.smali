.class public final Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;


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
    c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2"
    f = "ContentConverter.kt"
    l = {
        0x33,
        0x32
    }
    m = "emit"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->this$0:Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/serialization/ContentConverterKt$deserialize$$inlined$map$1$2$1;->this$0:Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lio/ktor/serialization/飘花落叶言子楪世苏哲兰;->emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
