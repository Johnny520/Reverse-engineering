.class final Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $currentQuery$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $mediaScope:Landroidx/compose/ui/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪兰世苏哲;Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;->$mediaScope:Landroidx/compose/ui/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;->$currentQuery$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;->$currentQuery$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 2
    .line 3
    sget v1, Landroidx/compose/ui/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;->$mediaScope:Landroidx/compose/ui/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    invoke-interface {v0, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/MediaQueryKt$derivedMediaQuery$1$1;->invoke()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
