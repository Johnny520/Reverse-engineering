.class final Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;
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

.field final synthetic $$default:I

.field final synthetic $clipPathData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $name:Ljava/lang/String;

.field final synthetic $pivotX:F

.field final synthetic $pivotY:F

.field final synthetic $rotation:F

.field final synthetic $scaleX:F

.field final synthetic $scaleY:F

.field final synthetic $translationX:F

.field final synthetic $translationY:F


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFFFFFLjava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "FFFFFFF",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/graphics/vector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            ">;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$name:Ljava/lang/String;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$rotation:F

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$pivotX:F

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$pivotY:F

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$scaleX:F

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$scaleY:F

    .line 12
    .line 13
    iput p7, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$translationX:F

    .line 14
    .line 15
    iput p8, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$translationY:F

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$clipPathData:Ljava/util/List;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 20
    .line 21
    iput p11, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$$changed:I

    .line 22
    .line 23
    iput p12, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$$default:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$name:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$rotation:F

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$pivotX:F

    .line 6
    .line 7
    iget v3, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$pivotY:F

    .line 8
    .line 9
    iget v4, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$scaleX:F

    .line 10
    .line 11
    iget v5, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$scaleY:F

    .line 12
    .line 13
    iget v6, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$translationX:F

    .line 14
    .line 15
    iget v7, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$translationY:F

    .line 16
    .line 17
    iget-object v8, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$clipPathData:Ljava/util/List;

    .line 18
    .line 19
    iget-object v9, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 20
    .line 21
    iget p2, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$$changed:I

    .line 22
    .line 23
    or-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪(I)I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    iget v12, p0, Landroidx/compose/ui/graphics/vector/VectorComposeKt$Group$4;->$$default:I

    .line 30
    .line 31
    move-object v10, p1

    .line 32
    invoke-static/range {v0 .. v12}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;FFFFFFFLjava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
