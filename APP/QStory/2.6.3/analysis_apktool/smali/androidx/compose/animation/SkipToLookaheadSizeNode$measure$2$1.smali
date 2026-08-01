.class final Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2;->invoke(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V",
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
.field final synthetic $resolvedScale:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2$1;->$resolvedScale:J

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

    .line 41
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2$1;->invoke(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2$1;->$resolvedScale:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰世哲(F)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Landroidx/compose/animation/SkipToLookaheadSizeNode$measure$2$1;->$resolvedScale:J

    .line 17
    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v0, v2

    .line 24
    long-to-int p0, v0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, p0}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪苏兰哲世(F)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    invoke-static {p0, p0}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲世兰(FF)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰苏世(J)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
