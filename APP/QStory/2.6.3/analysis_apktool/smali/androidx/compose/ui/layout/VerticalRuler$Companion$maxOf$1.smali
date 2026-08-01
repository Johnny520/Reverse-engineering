.class final Landroidx/compose/ui/layout/VerticalRuler$Companion$maxOf$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;",
        "",
        "defaultValue",
        "invoke",
        "(Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;F)Ljava/lang/Float;",
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
.field final synthetic $rulers:[Landroidx/compose/ui/layout/飘花落叶言子哲楪世兰苏;


# direct methods
.method public constructor <init>([Landroidx/compose/ui/layout/飘花落叶言子哲楪世兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/VerticalRuler$Companion$maxOf$1;->$rulers:[Landroidx/compose/ui/layout/飘花落叶言子哲楪世兰苏;

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
.method public final invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;F)Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x1

    .line 14
    iget-object p0, p0, Landroidx/compose/ui/layout/VerticalRuler$Companion$maxOf$1;->$rulers:[Landroidx/compose/ui/layout/飘花落叶言子哲楪世兰苏;

    invoke-static {p1, v0, p0, p2}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Z[Landroidx/compose/ui/layout/飘花落叶言子苏哲世兰楪;F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/VerticalRuler$Companion$maxOf$1;->invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
