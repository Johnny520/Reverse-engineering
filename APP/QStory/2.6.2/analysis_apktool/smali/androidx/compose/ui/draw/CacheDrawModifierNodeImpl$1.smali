.class final Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "invoke",
        "()Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl$1;->this$0:Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/ui/graphics/飘花落叶言子世楪苏兰哲;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl$1;->this$0:Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/ui/draw/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪兰哲:Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;

    .line 13
    .line 14
    :cond_0
    iget-object v1, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪苏兰哲;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getGraphicsContext()Landroidx/compose/ui/graphics/飘花落叶言子世楪苏兰哲;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0}, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰()V

    .line 29
    .line 30
    .line 31
    iput-object p0, v0, Landroidx/compose/ui/draw/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子世楪苏兰哲;

    .line 32
    .line 33
    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 34
    invoke-virtual {p0}, Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl$1;->invoke()Landroidx/compose/ui/graphics/飘花落叶言子世楪苏兰哲;

    move-result-object p0

    return-object p0
.end method
