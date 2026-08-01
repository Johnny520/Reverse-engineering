.class public final L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;
.super L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪哲兰苏世:F


# direct methods
.method public constructor <init>(L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪哲苏兰;L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪哲苏兰;L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput p1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-wide v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/os/Looper;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne v1, v0, :cond_1

    .line 33
    .line 34
    iget-boolean v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 43
    .line 44
    const-string v0, "Animations may only be started on the same thread as the animation handler"

    .line 45
    .line 46
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    const-string p0, "Spring animations can only come to an end when there is damping"

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(F)V
    .locals 5

    .line 1
    iget-boolean v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    invoke-direct {v0, p1}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 20
    .line 21
    float-to-double v1, p1

    .line 22
    iput-wide v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 23
    .line 24
    double-to-float p1, v1

    .line 25
    float-to-double v1, p1

    .line 26
    const-wide v3, 0x47efffffe0000000L    # 3.4028234663852886E38

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmpl-double p1, v1, v3

    .line 32
    .line 33
    if-gtz p1, :cond_8

    .line 34
    .line 35
    iget p1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:F

    .line 36
    .line 37
    float-to-double v3, p1

    .line 38
    cmpg-double v1, v1, v3

    .line 39
    .line 40
    if-ltz v1, :cond_7

    .line 41
    .line 42
    iget v1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:F

    .line 43
    .line 44
    const/high16 v2, 0x3f400000    # 0.75f

    .line 45
    .line 46
    mul-float/2addr v1, v2

    .line 47
    float-to-double v1, v1

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    iput-wide v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:D

    .line 53
    .line 54
    const-wide v3, 0x404f400000000000L    # 62.5

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-double/2addr v1, v3

    .line 60
    iput-wide v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:D

    .line 61
    .line 62
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/os/Looper;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v1, v0, :cond_6

    .line 84
    .line 85
    iget-boolean v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 93
    .line 94
    iget-object v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

    .line 95
    .line 96
    iget-object v1, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪哲苏兰;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪哲苏兰;)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iput v0, p0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 103
    .line 104
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 105
    .line 106
    .line 107
    cmpl-float v1, v0, v1

    .line 108
    .line 109
    if-gtz v1, :cond_4

    .line 110
    .line 111
    cmpg-float p1, v0, p1

    .line 112
    .line 113
    if-ltz p1, :cond_4

    .line 114
    .line 115
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object v0, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_3

    .line 126
    .line 127
    iget-object v1, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 128
    .line 129
    iget-object v2, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 130
    .line 131
    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Landroid/view/Choreographer;

    .line 134
    .line 135
    new-instance v3, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;

    .line 136
    .line 137
    invoke-direct {v3, v2}, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 141
    .line 142
    .line 143
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 144
    .line 145
    const/16 v2, 0x21

    .line 146
    .line 147
    if-lt v1, v2, :cond_3

    .line 148
    .line 149
    invoke-static {}, Landroidx/activity/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 154
    .line 155
    iget-object v1, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 156
    .line 157
    if-nez v1, :cond_2

    .line 158
    .line 159
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 160
    .line 161
    const/16 v2, 0x12

    .line 162
    .line 163
    invoke-direct {v1, p1, v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;-><init>(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    iput-object v1, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 167
    .line 168
    :cond_2
    iget-object p1, p1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 169
    .line 170
    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;

    .line 173
    .line 174
    if-nez v1, :cond_3

    .line 175
    .line 176
    new-instance v1, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;

    .line 177
    .line 178
    invoke-direct {v1, p1}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;)V

    .line 179
    .line 180
    .line 181
    iput-object v1, p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {v1}, Landroidx/activity/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲(L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;)Z

    .line 184
    .line 185
    .line 186
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_5

    .line 191
    .line 192
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_4
    const-string p0, "Starting value need to be in between min value and max value"

    .line 197
    .line 198
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    return-void

    .line 202
    :cond_6
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 203
    .line 204
    const-string p1, "Animations may only be started on the same thread as the animation handler"

    .line 205
    .line 206
    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p0

    .line 210
    :cond_7
    const-string p0, "Final position of the spring cannot be less than the min value."

    .line 211
    .line 212
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_8
    const-string p0, "Final position of the spring cannot be greater than the max value."

    .line 217
    .line 218
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-void
.end method
