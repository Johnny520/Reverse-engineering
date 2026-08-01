.class final Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;
.super Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u696a\u54f2;",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪兰苏世哲:J

.field public final 飘花落叶言子楪兰苏哲世:J

.field public final 飘花落叶言子楪哲兰世苏:F

.field public final 飘花落叶言子楪哲兰苏世:J

.field public final 飘花落叶言子楪哲苏兰世:F


# direct methods
.method public constructor <init>(FFJLandroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;ZJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 11
    .line 12
    iput-boolean p6, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 13
    .line 14
    iput-wide p7, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 15
    .line 16
    iput-wide p9, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;

    .line 12
    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_3
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 32
    .line 33
    iget v1, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_4
    const/4 v0, 0x0

    .line 44
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_5
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 60
    .line 61
    iget v2, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 62
    .line 63
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_9

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    const/high16 v0, 0x41000000    # 8.0f

    .line 92
    .line 93
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 101
    .line 102
    iget-wide v2, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 103
    .line 104
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_c

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_c
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 112
    .line 113
    iget-object v1, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_d

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_d
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 123
    .line 124
    iget-boolean v1, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 125
    .line 126
    if-eq v0, v1, :cond_e

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_e
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 130
    .line 131
    iget-wide v2, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 132
    .line 133
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_f

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_f
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 141
    .line 142
    iget-wide p0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 143
    .line 144
    invoke-static {v0, v1, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_10

    .line 149
    .line 150
    :goto_0
    const/4 p0, 0x0

    .line 151
    return p0

    .line 152
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 153
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    invoke-static {v1, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 30
    .line 31
    invoke-static {v0, v3, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/high16 v1, 0x41000000    # 8.0f

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sget v1, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 54
    .line 55
    iget-wide v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 56
    .line 57
    invoke-static {v0, v2, v3, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v1, v0

    .line 68
    mul-int/2addr v1, v2

    .line 69
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 70
    .line 71
    const/16 v3, 0x3c1

    .line 72
    .line 73
    invoke-static {v1, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏(IIZ)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    sget v1, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰:I

    .line 78
    .line 79
    iget-wide v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 80
    .line 81
    invoke-static {v0, v2, v3, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-wide v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 86
    .line 87
    invoke-static {v0, v2, v3, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-static {v0, p0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(III)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const/4 v0, 0x3

    .line 97
    invoke-static {v0, p0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(III)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", translationX=0.0, translationY=0.0, shadowElevation="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", shape="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", clip="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-boolean v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", renderEffect=null, ambientShadowColor="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 63
    .line 64
    const-string v3, ", spotShadowColor="

    .line 65
    .line 66
    invoke-static {v1, v2, v0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 70
    .line 71
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, ", compositingStrategy=CompositingStrategy(value=0), blendMode="

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x3

    .line 84
    invoke-static {p0}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世苏楪哲兰(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p0, ", colorFilter=null)"

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 2

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世楪兰哲苏:F

    .line 6
    .line 7
    iput v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏楪哲兰:F

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 10
    .line 11
    iput v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏楪兰哲:F

    .line 12
    .line 13
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 14
    .line 15
    iput v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏哲楪兰:F

    .line 16
    .line 17
    const/high16 v0, 0x41000000    # 8.0f

    .line 18
    .line 19
    iput v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏哲兰楪:F

    .line 20
    .line 21
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 22
    .line 23
    iput-wide v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏兰楪哲:J

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 26
    .line 27
    iput-object v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏兰哲楪:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 28
    .line 29
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 30
    .line 31
    iput-boolean v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲楪苏兰:Z

    .line 32
    .line 33
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 34
    .line 35
    iput-wide v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲楪兰苏:J

    .line 36
    .line 37
    iget-wide v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 38
    .line 39
    iput-wide v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲苏楪兰:J

    .line 40
    .line 41
    const/4 p0, 0x3

    .line 42
    iput p0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲苏兰楪:I

    .line 43
    .line 44
    iget-object p0, p1, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲兰楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 45
    .line 46
    iget-object v0, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 47
    .line 48
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x2

    .line 54
    invoke-static {p1, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-virtual {p1, p0, v0}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言楪子世苏哲兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Z)V

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世楪兰哲苏:F

    .line 9
    .line 10
    iput v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏楪哲兰:F

    .line 11
    .line 12
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:F

    .line 13
    .line 14
    iput v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏楪兰哲:F

    .line 15
    .line 16
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:F

    .line 17
    .line 18
    iput v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏哲楪兰:F

    .line 19
    .line 20
    const/high16 v1, 0x41000000    # 8.0f

    .line 21
    .line 22
    iput v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏哲兰楪:F

    .line 23
    .line 24
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:J

    .line 25
    .line 26
    iput-wide v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏兰楪哲:J

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 29
    .line 30
    iput-object v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世苏兰哲楪:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 31
    .line 32
    iget-boolean v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲楪苏兰:Z

    .line 35
    .line 36
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏世哲:J

    .line 37
    .line 38
    iput-wide v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲楪兰苏:J

    .line 39
    .line 40
    iget-wide v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:J

    .line 41
    .line 42
    iput-wide v1, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲苏楪兰:J

    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    iput p0, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲苏兰楪:I

    .line 46
    .line 47
    new-instance p0, Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier$layerBlock$1;

    .line 48
    .line 49
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier$layerBlock$1;-><init>(Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v0, Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;->飘花落叶言子世哲兰楪苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 53
    .line 54
    return-object v0
.end method
