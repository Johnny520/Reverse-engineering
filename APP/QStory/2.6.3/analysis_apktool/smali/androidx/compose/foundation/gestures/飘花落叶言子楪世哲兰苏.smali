.class public final synthetic Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v0, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 16
    .line 17
    iget-boolean p0, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-boolean p0, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    move v3, v4

    .line 26
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰哲苏世;

    .line 32
    .line 33
    xor-int/lit8 p0, v3, 0x1

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪哲苏兰世;

    .line 41
    .line 42
    sget-object p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 43
    .line 44
    check-cast p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰(Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string p1, "android.software.leanback"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_1

    .line 66
    .line 67
    sget-object p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏兰哲世;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏兰世哲;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-object p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/gestures/飘花落叶言子楪哲世兰苏;

    .line 76
    .line 77
    :goto_0
    return-object p0

    .line 78
    :pswitch_2
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;

    .line 79
    .line 80
    new-instance p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    iget v3, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:F

    .line 83
    .line 84
    iget v4, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:F

    .line 85
    .line 86
    iget v5, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:F

    .line 87
    .line 88
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    int-to-long v6, v4

    .line 93
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    int-to-long v4, v4

    .line 98
    shl-long/2addr v6, v2

    .line 99
    and-long/2addr v0, v4

    .line 100
    or-long/2addr v0, v6

    .line 101
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:F

    .line 102
    .line 103
    invoke-direct {p0, v3, p1, v0, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;-><init>(FFJ)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 108
    .line 109
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;

    .line 110
    .line 111
    iget v3, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 112
    .line 113
    iget-wide v4, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 114
    .line 115
    shr-long v6, v4, v2

    .line 116
    .line 117
    long-to-int v2, v6

    .line 118
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    and-long/2addr v0, v4

    .line 123
    long-to-int v0, v0

    .line 124
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget p1, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 129
    .line 130
    invoke-direct {p0, v3, v2, v0, p1}, Landroidx/compose/animation/core/飘花落叶言子楪哲世兰苏;-><init>(FFFF)V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide p0

    .line 140
    invoke-static {p0, p1}, Landroidx/compose/foundation/gestures/NonTouchScrollingLogicKt$busyReceive$2$job$1;->飘花落叶言子楪世苏兰哲(J)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_5
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;

    .line 146
    .line 147
    invoke-static {p1}, Landroidx/compose/foundation/gestures/DraggableNode$drag$2;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_6
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;

    .line 153
    .line 154
    invoke-static {p1}, Landroidx/compose/foundation/gestures/Draggable2DNode$drag$2;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_7
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;

    .line 160
    .line 161
    invoke-static {p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$drag$2;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
