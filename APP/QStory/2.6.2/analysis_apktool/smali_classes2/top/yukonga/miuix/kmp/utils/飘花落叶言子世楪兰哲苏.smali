.class public final Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:D

.field public 飘花落叶言子楪世兰苏哲:D

.field public 飘花落叶言子楪世哲兰苏:D

.field public 飘花落叶言子楪世哲苏兰:D

.field public 飘花落叶言子楪世苏兰哲:D

.field public 飘花落叶言子楪世苏哲兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(F)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const v3, 0x3a83126f    # 0.001f

    .line 10
    .line 11
    .line 12
    const v4, 0x3c83126f    # 0.016f

    .line 13
    .line 14
    .line 15
    move/from16 v5, p1

    .line 16
    .line 17
    invoke-static {v5, v3, v4}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(FFF)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-wide v4, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 22
    .line 23
    iget-wide v6, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 24
    .line 25
    iget-wide v8, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 26
    .line 27
    iget-wide v10, v1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:D

    .line 28
    .line 29
    float-to-double v12, v3

    .line 30
    mul-double/2addr v10, v12

    .line 31
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 32
    .line 33
    sub-double v10, v14, v10

    .line 34
    .line 35
    move/from16 v16, v2

    .line 36
    .line 37
    iget-wide v2, v1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:D

    .line 38
    .line 39
    sub-double v17, v8, v6

    .line 40
    .line 41
    mul-double v17, v17, v2

    .line 42
    .line 43
    mul-double v17, v17, v12

    .line 44
    .line 45
    mul-double/2addr v4, v10

    .line 46
    add-double v4, v4, v17

    .line 47
    .line 48
    iput-wide v4, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 49
    .line 50
    mul-double/2addr v12, v4

    .line 51
    add-double/2addr v12, v6

    .line 52
    iput-wide v12, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 53
    .line 54
    iget-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:D

    .line 55
    .line 56
    cmpg-double v1, v1, v8

    .line 57
    .line 58
    if-gez v1, :cond_1

    .line 59
    .line 60
    cmpl-double v2, v12, v8

    .line 61
    .line 62
    if-lez v2, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    if-lez v1, :cond_2

    .line 66
    .line 67
    cmpl-double v2, v12, v8

    .line 68
    .line 69
    if-ltz v2, :cond_4

    .line 70
    .line 71
    :cond_2
    if-nez v1, :cond_3

    .line 72
    .line 73
    iget-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:D

    .line 74
    .line 75
    invoke-static {v1, v2}, Ljava/lang/Math;->signum(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    iget-wide v3, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 80
    .line 81
    invoke-static {v3, v4}, Ljava/lang/Math;->signum(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    cmpg-double v1, v1, v3

    .line 86
    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    :cond_3
    iget-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 90
    .line 91
    iget-wide v3, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 92
    .line 93
    sub-double/2addr v1, v3

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    cmpg-double v1, v1, v14

    .line 99
    .line 100
    if-gez v1, :cond_5

    .line 101
    .line 102
    :cond_4
    :goto_0
    iget-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 103
    .line 104
    iput-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 105
    .line 106
    const-wide/16 v1, 0x0

    .line 107
    .line 108
    iput-wide v1, v0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    return v0

    .line 112
    :cond_5
    return v16
.end method

.method public final 飘花落叶言子楪世苏哲兰(FF)V
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    iput-wide v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:D

    .line 3
    .line 4
    iput-wide v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:D

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:D

    .line 9
    .line 10
    float-to-double v0, p2

    .line 11
    iput-wide v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:D

    .line 12
    .line 13
    iput-wide v0, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏:D

    .line 14
    .line 15
    new-instance p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 16
    .line 17
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    float-to-double v0, p2

    .line 22
    const-wide v2, 0x40b3880000000000L    # 5000.0

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpl-double p2, v0, v2

    .line 28
    .line 29
    if-lez p2, :cond_0

    .line 30
    .line 31
    const p2, 0x3f0ccccd    # 0.55f

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const p2, 0x3ecccccd    # 0.4f

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-direct {p1, p2}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;-><init>(F)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪哲兰;

    .line 42
    .line 43
    return-void
.end method
