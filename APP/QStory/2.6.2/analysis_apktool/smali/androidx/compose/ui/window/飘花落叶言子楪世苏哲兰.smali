.class public final Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    iput-wide p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏哲世兰(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;JLandroidx/compose/ui/unit/LayoutDirection;J)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    iget v3, v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    sub-int/2addr v2, v3

    .line 10
    iget v3, v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:I

    .line 11
    .line 12
    iget v4, v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:I

    .line 13
    .line 14
    sub-int/2addr v3, v4

    .line 15
    int-to-long v4, v2

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shl-long/2addr v4, v2

    .line 19
    int-to-long v6, v3

    .line 20
    const-wide v8, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v6, v8

    .line 26
    or-long v13, v4, v6

    .line 27
    .line 28
    iget-object v10, v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 29
    .line 30
    const-wide/16 v11, 0x0

    .line 31
    .line 32
    move-object/from16 v15, p4

    .line 33
    .line 34
    invoke-interface/range {v10 .. v15}, Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iget-object v10, v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;

    .line 39
    .line 40
    move-wide/from16 v13, p5

    .line 41
    .line 42
    invoke-interface/range {v10 .. v15}, Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    shr-long v10, v5, v2

    .line 47
    .line 48
    long-to-int v7, v10

    .line 49
    neg-int v7, v7

    .line 50
    and-long/2addr v5, v8

    .line 51
    long-to-int v5, v5

    .line 52
    neg-int v5, v5

    .line 53
    int-to-long v6, v7

    .line 54
    shl-long/2addr v6, v2

    .line 55
    int-to-long v10, v5

    .line 56
    and-long/2addr v10, v8

    .line 57
    or-long v5, v6, v10

    .line 58
    .line 59
    iget-wide v10, v0, Landroidx/compose/ui/window/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 60
    .line 61
    shr-long v12, v10, v2

    .line 62
    .line 63
    long-to-int v0, v12

    .line 64
    sget-object v7, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 65
    .line 66
    if-ne v15, v7, :cond_0

    .line 67
    .line 68
    const/4 v7, 0x1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v7, -0x1

    .line 71
    :goto_0
    mul-int/2addr v0, v7

    .line 72
    and-long/2addr v10, v8

    .line 73
    long-to-int v7, v10

    .line 74
    int-to-long v10, v0

    .line 75
    shl-long/2addr v10, v2

    .line 76
    int-to-long v12, v7

    .line 77
    and-long v7, v12, v8

    .line 78
    .line 79
    or-long/2addr v7, v10

    .line 80
    invoke-virtual {v1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-static {v0, v1, v3, v4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    invoke-static {v0, v1, v5, v6}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-static {v0, v1, v7, v8}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(JJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    return-wide v0
.end method
