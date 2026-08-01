.class final Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.ui.graphics.layer.GraphicsLayer"
    f = "AndroidGraphicsLayer.android.kt"
    l = {
        0x366
    }
    m = "toImageBitmap"
    v = 0x1
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/layer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->this$0:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

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
    .locals 4

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->this$0:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 16
    .line 17
    and-int v2, v1, v0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v0

    .line 22
    iput v1, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;-><init>(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v2, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲世兰;

    .line 57
    .line 58
    iput v3, p0, Landroidx/compose/ui/graphics/layer/GraphicsLayer$toImageBitmap$1;->label:I

    .line 59
    .line 60
    invoke-interface {v0, p1, p0}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast v0, Landroid/graphics/Bitmap;

    .line 68
    .line 69
    new-instance p0, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 70
    .line 71
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;-><init>(Landroid/graphics/Bitmap;)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method
