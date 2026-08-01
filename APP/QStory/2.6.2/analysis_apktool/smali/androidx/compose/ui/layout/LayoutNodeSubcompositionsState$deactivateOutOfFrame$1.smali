.class final Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$deactivateOutOfFrame$1;
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
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
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
.field final synthetic $this_deactivateOutOfFrame:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$deactivateOutOfFrame$1;->$this_deactivateOutOfFrame:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 29
    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$deactivateOutOfFrame$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$deactivateOutOfFrame$1;->$this_deactivateOutOfFrame:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 4
    .line 5
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$deactivateOutOfFrame$1;->$this_deactivateOutOfFrame:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
