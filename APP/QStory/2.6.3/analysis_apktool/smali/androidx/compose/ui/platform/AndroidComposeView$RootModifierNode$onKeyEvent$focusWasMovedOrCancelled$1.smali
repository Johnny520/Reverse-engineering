.class final Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)Ljava/lang/Boolean;",
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
.field final synthetic $focusDirection:Landroidx/compose/ui/focus/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1;->$focusDirection:Landroidx/compose/ui/focus/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1;->$focusDirection:Landroidx/compose/ui/focus/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪哲世苏(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1;->invoke(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
