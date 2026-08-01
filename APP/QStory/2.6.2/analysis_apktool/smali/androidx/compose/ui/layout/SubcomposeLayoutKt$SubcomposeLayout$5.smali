.class final Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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

.field final synthetic $$default:I

.field final synthetic $measurePolicy:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

.field final synthetic $state:Landroidx/compose/ui/layout/飘花落叶言子苏兰楪哲世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/飘花落叶言子苏兰楪哲世;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u696a\u54f2\u4e16;",
            "Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$state:Landroidx/compose/ui/layout/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$measurePolicy:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$$changed:I

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$$default:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$state:Landroidx/compose/ui/layout/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$measurePolicy:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    iget p2, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$$changed:I

    .line 8
    .line 9
    or-int/lit8 p2, p2, 0x1

    .line 10
    .line 11
    invoke-static {p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世兰楪苏哲(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget v5, p0, Landroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5;->$$default:I

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/layout/飘花落叶言子苏兰楪哲世;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
