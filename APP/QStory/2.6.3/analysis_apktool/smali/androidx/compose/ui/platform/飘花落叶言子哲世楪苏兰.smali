.class public final Landroidx/compose/ui/platform/飘花落叶言子哲世楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子哲世楪苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/platform/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子哲世楪苏兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/view/MotionEvent;I)Z
    .locals 2

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/view/MotionEvent;I)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v0

    .line 13
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 14
    .line 15
    if-ge p0, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世(Landroid/view/MotionEvent;I)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    and-int/2addr p0, v0

    .line 26
    if-ge p0, v1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method
