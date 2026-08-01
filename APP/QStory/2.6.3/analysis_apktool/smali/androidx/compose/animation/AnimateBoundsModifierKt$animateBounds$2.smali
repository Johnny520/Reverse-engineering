.class final Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "animatedSize",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<unused var>",
        "invoke-2pbfIzA",
        "(JJ)J",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;->INSTANCE:Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-wide v0, p1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    check-cast p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    iget-wide p1, p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;->invoke-2pbfIzA(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    new-instance p2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-direct {p2, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;-><init>(J)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public final invoke-2pbfIzA(JJ)J
    .locals 0

    .line 1
    const/16 p0, 0x20

    .line 2
    .line 3
    shr-long p3, p1, p0

    .line 4
    .line 5
    long-to-int p0, p3

    .line 6
    const-wide p3, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, p3

    .line 12
    long-to-int p1, p1

    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 p3, 0x1

    .line 15
    if-ltz p0, :cond_0

    .line 16
    .line 17
    move p4, p3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p4, p2

    .line 20
    :goto_0
    if-ltz p1, :cond_1

    .line 21
    .line 22
    move p2, p3

    .line 23
    :cond_1
    and-int/2addr p2, p4

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const-string p2, "width and height must be >= 0"

    .line 27
    .line 28
    invoke-static {p2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-static {p0, p0, p1, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(IIII)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    return-wide p0
.end method
