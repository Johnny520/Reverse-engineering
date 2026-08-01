.class public final Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/layout/飘花落叶言子苏兰哲楪世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "ReusedSlotId"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/layout/飘花落叶言子苏兰世哲楪;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(JJ)J
    .locals 5

    .line 1
    iget p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    const-wide v1, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    shr-long v3, p1, v0

    .line 14
    .line 15
    long-to-int p0, v3

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    shr-long v3, p3, v0

    .line 21
    .line 22
    long-to-int v3, v3

    .line 23
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    cmpg-float p0, p0, v3

    .line 28
    .line 29
    if-gtz p0, :cond_0

    .line 30
    .line 31
    and-long v3, p1, v1

    .line 32
    .line 33
    long-to-int p0, v3

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    and-long v3, p3, v1

    .line 39
    .line 40
    long-to-int v3, v3

    .line 41
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    cmpg-float p0, p0, v3

    .line 46
    .line 47
    if-gtz p0, :cond_0

    .line 48
    .line 49
    const/high16 p0, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    int-to-long p3, p0

    .line 61
    shl-long p0, p1, v0

    .line 62
    .line 63
    and-long p2, p3, v1

    .line 64
    .line 65
    or-long/2addr p0, p2

    .line 66
    sget p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰(JJ)F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-long p1, p1

    .line 78
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    int-to-long p3, p0

    .line 83
    shl-long p0, p1, v0

    .line 84
    .line 85
    and-long p2, p3, v1

    .line 86
    .line 87
    or-long/2addr p0, p2

    .line 88
    sget p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:I

    .line 89
    .line 90
    :goto_0
    return-wide p0

    .line 91
    :pswitch_0
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰(JJ)F

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    int-to-long p1, p1

    .line 100
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    int-to-long p3, p0

    .line 105
    shl-long p0, p1, v0

    .line 106
    .line 107
    and-long p2, p3, v1

    .line 108
    .line 109
    or-long/2addr p0, p2

    .line 110
    sget p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:I

    .line 111
    .line 112
    return-wide p0

    .line 113
    :pswitch_1
    shr-long v3, p3, v0

    .line 114
    .line 115
    long-to-int p0, v3

    .line 116
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    shr-long v3, p1, v0

    .line 121
    .line 122
    long-to-int v3, v3

    .line 123
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    div-float/2addr p0, v3

    .line 128
    and-long/2addr p3, v1

    .line 129
    long-to-int p3, p3

    .line 130
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    and-long/2addr p1, v1

    .line 135
    long-to-int p1, p1

    .line 136
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    div-float/2addr p3, p1

    .line 141
    invoke-static {p0, p3}, Ljava/lang/Math;->max(FF)F

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    int-to-long p1, p1

    .line 150
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    int-to-long p3, p0

    .line 155
    shl-long p0, p1, v0

    .line 156
    .line 157
    and-long p2, p3, v1

    .line 158
    .line 159
    or-long/2addr p0, p2

    .line 160
    sget p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:I

    .line 161
    .line 162
    return-wide p0

    .line 163
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
