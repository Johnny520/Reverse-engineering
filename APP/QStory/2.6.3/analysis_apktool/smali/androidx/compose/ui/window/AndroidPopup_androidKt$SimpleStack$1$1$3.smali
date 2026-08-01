.class public final Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;)V",
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
.field final synthetic $placeables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u4e16\u5170;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u4e16\u5170;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;->$placeables:Ljava/util/List;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;->invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;->$placeables:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世苏兰哲楪(Ljava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    iget-object v3, p0, Landroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1$3;->$placeables:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 18
    .line 19
    invoke-static {p1, v3, v1, v1}, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;II)V

    .line 20
    .line 21
    .line 22
    if-eq v2, v0, :cond_0

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
