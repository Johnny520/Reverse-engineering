.class final Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1;
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
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;I)V",
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
.field final synthetic $currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1;->$currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 57
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v3

    .line 11
    :goto_0
    and-int/2addr p2, v2

    .line 12
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_2

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 25
    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    sget-object p2, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1;->INSTANCE:Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    check-cast p2, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    sget-object v0, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 36
    .line 37
    invoke-static {v0, v3, p2}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p0, p0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$dialog$1$1$1;->$currentContent$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 42
    .line 43
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 48
    .line 49
    invoke-static {p2, p0, p1, v3, v3}, Landroidx/compose/ui/window/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 54
    .line 55
    .line 56
    return-void
.end method
