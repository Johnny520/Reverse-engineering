.class public final Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(F)F
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-virtual {v1, v2, v3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const/4 p1, 0x2

    .line 36
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 37
    .line 38
    check-cast p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v2, v3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏哲兰(IJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    invoke-virtual {v1, p0, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {v1, p0}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    new-instance p0, Landroidx/compose/foundation/gestures/FlingCancellationException;

    .line 54
    .line 55
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/FlingCancellationException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p0
.end method
