.class final Landroidx/compose/ui/window/DialogLayout$Content$4;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $tmp0_rcvr:Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/DialogLayout$Content$4;->$tmp0_rcvr:Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/ui/window/DialogLayout$Content$4;->$$changed:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/DialogLayout$Content$4;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 0

    .line 15
    iget-object p2, p0, Landroidx/compose/ui/window/DialogLayout$Content$4;->$tmp0_rcvr:Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;

    iget p0, p0, Landroidx/compose/ui/window/DialogLayout$Content$4;->$$changed:I

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪(I)I

    move-result p0

    invoke-virtual {p2, p1, p0}, Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    return-void
.end method
