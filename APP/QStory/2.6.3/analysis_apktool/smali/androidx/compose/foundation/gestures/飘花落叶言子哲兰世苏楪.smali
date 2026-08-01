.class public final Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:J

.field public 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;


# direct methods
.method public constructor <init>(JLandroidx/compose/foundation/gestures/Orientation;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 14
    iput-wide p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/gestures/Orientation;I)V
    .locals 2

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;-><init>(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(J)F
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x20

    .line 8
    .line 9
    shr-long p0, p1, p0

    .line 10
    .line 11
    :goto_0
    long-to-int p0, p0

    .line 12
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long p0, p1, v0

    .line 23
    .line 24
    goto :goto_0
.end method

.method public final 飘花落叶言子楪世苏哲兰(FJZ)J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {v0, v1, p2, p3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    iput-wide p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, v1, p2, p3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    :goto_0
    iget-object p4, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 17
    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    invoke-static {p2, p3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p0, p2, p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲(J)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    :goto_1
    cmpl-float p2, p2, p1

    .line 34
    .line 35
    if-ltz p2, :cond_5

    .line 36
    .line 37
    iget-object p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 38
    .line 39
    iget-wide p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 40
    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    invoke-static {p3, p4}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p2, p3, p4}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    invoke-static {p1, p2, p3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(FJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iget-wide p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 56
    .line 57
    invoke-static {p3, p4, p1, p2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    return-wide p0

    .line 62
    :cond_2
    invoke-virtual {p0, p3, p4}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲(J)F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget-wide p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 67
    .line 68
    invoke-virtual {p0, p3, p4}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲(J)F

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    mul-float/2addr p3, p1

    .line 77
    sub-float/2addr p2, p3

    .line 78
    iget-wide p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:J

    .line 79
    .line 80
    iget-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 81
    .line 82
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 83
    .line 84
    const/16 v1, 0x20

    .line 85
    .line 86
    const-wide v2, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    if-ne p1, v0, :cond_3

    .line 92
    .line 93
    and-long/2addr p3, v2

    .line 94
    :goto_2
    long-to-int p1, p3

    .line 95
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    shr-long/2addr p3, v1

    .line 101
    goto :goto_2

    .line 102
    :goto_3
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/Orientation;

    .line 103
    .line 104
    if-ne p0, v0, :cond_4

    .line 105
    .line 106
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    int-to-long p2, p0

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    int-to-long p0, p0

    .line 116
    shl-long/2addr p2, v1

    .line 117
    and-long/2addr p0, v2

    .line 118
    or-long/2addr p0, p2

    .line 119
    return-wide p0

    .line 120
    :cond_4
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    int-to-long p0, p0

    .line 125
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    int-to-long p2, p2

    .line 130
    shl-long/2addr p0, v1

    .line 131
    and-long/2addr p2, v2

    .line 132
    or-long/2addr p0, p2

    .line 133
    return-wide p0

    .line 134
    :cond_5
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    return-wide p0
.end method
