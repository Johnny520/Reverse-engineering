.class public final Landroidx/compose/foundation/layout/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/foundation/layout/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "Arrangement#Start"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "Arrangement#End"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "AbsoluteArrangement#Right"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "AbsoluteArrangement#Left"

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V
    .locals 2

    .line 1
    iget p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    const/4 v0, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 9
    .line 10
    if-ne p4, p0, :cond_0

    .line 11
    .line 12
    array-length p0, p3

    .line 13
    move p1, v0

    .line 14
    move p2, p1

    .line 15
    :goto_0
    if-ge v0, p0, :cond_2

    .line 16
    .line 17
    aget p4, p3, v0

    .line 18
    .line 19
    add-int/lit8 v1, p1, 0x1

    .line 20
    .line 21
    aput p2, p5, p1

    .line 22
    .line 23
    add-int/2addr p2, p4

    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    array-length p0, p3

    .line 29
    move p4, v0

    .line 30
    :goto_1
    if-ge v0, p0, :cond_1

    .line 31
    .line 32
    aget v1, p3, v0

    .line 33
    .line 34
    add-int/2addr p4, v1

    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sub-int/2addr p2, p4

    .line 39
    array-length p0, p3

    .line 40
    add-int/lit8 p0, p0, -0x1

    .line 41
    .line 42
    :goto_2
    if-ge p1, p0, :cond_2

    .line 43
    .line 44
    aget p4, p3, p0

    .line 45
    .line 46
    aput p2, p5, p0

    .line 47
    .line 48
    add-int/2addr p2, p4

    .line 49
    add-int/lit8 p0, p0, -0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_0
    sget-object p0, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 54
    .line 55
    if-ne p4, p0, :cond_4

    .line 56
    .line 57
    array-length p0, p3

    .line 58
    move p1, v0

    .line 59
    move p4, p1

    .line 60
    :goto_3
    if-ge p1, p0, :cond_3

    .line 61
    .line 62
    aget v1, p3, p1

    .line 63
    .line 64
    add-int/2addr p4, v1

    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    sub-int/2addr p2, p4

    .line 69
    array-length p0, p3

    .line 70
    move p1, v0

    .line 71
    :goto_4
    if-ge v0, p0, :cond_5

    .line 72
    .line 73
    aget p4, p3, v0

    .line 74
    .line 75
    add-int/lit8 v1, p1, 0x1

    .line 76
    .line 77
    aput p2, p5, p1

    .line 78
    .line 79
    add-int/2addr p2, p4

    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    move p1, v1

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    array-length p0, p3

    .line 85
    add-int/lit8 p0, p0, -0x1

    .line 86
    .line 87
    :goto_5
    if-ge p1, p0, :cond_5

    .line 88
    .line 89
    aget p2, p3, p0

    .line 90
    .line 91
    aput v0, p5, p0

    .line 92
    .line 93
    add-int/2addr v0, p2

    .line 94
    add-int/lit8 p0, p0, -0x1

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    return-void

    .line 98
    :pswitch_1
    array-length p0, p3

    .line 99
    move p1, v0

    .line 100
    move p4, p1

    .line 101
    :goto_6
    if-ge p1, p0, :cond_6

    .line 102
    .line 103
    aget v1, p3, p1

    .line 104
    .line 105
    add-int/2addr p4, v1

    .line 106
    add-int/lit8 p1, p1, 0x1

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_6
    sub-int/2addr p2, p4

    .line 110
    array-length p0, p3

    .line 111
    move p1, v0

    .line 112
    :goto_7
    if-ge v0, p0, :cond_7

    .line 113
    .line 114
    aget p4, p3, v0

    .line 115
    .line 116
    add-int/lit8 v1, p1, 0x1

    .line 117
    .line 118
    aput p2, p5, p1

    .line 119
    .line 120
    add-int/2addr p2, p4

    .line 121
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    move p1, v1

    .line 124
    goto :goto_7

    .line 125
    :cond_7
    return-void

    .line 126
    :pswitch_2
    array-length p0, p3

    .line 127
    move p1, v0

    .line 128
    move p2, p1

    .line 129
    :goto_8
    if-ge v0, p0, :cond_8

    .line 130
    .line 131
    aget p4, p3, v0

    .line 132
    .line 133
    add-int/lit8 v1, p1, 0x1

    .line 134
    .line 135
    aput p2, p5, p1

    .line 136
    .line 137
    add-int/2addr p2, p4

    .line 138
    add-int/lit8 v0, v0, 0x1

    .line 139
    .line 140
    move p1, v1

    .line 141
    goto :goto_8

    .line 142
    :cond_8
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
