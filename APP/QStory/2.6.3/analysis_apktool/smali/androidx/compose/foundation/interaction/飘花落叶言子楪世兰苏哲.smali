.class public final Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p2, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 13
    .line 14
    instance-of p2, p1, Ltop/yukonga/miuix/kmp/interfaces/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of p2, p1, Ltop/yukonga/miuix/kmp/interfaces/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    check-cast p1, Ltop/yukonga/miuix/kmp/interfaces/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    iget-object p1, p1, Ltop/yukonga/miuix/kmp/interfaces/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ltop/yukonga/miuix/kmp/interfaces/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    xor-int/lit8 p0, p0, 0x1

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    xor-int/lit8 p0, p0, 0x1

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_1
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 64
    .line 65
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏兰世;

    .line 74
    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏兰世;

    .line 78
    .line 79
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世兰苏;

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世兰苏;

    .line 90
    .line 91
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    xor-int/lit8 p0, p0, 0x1

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_2
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 111
    .line 112
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世兰哲;

    .line 113
    .line 114
    if-eqz p2, :cond_5

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲世兰;

    .line 121
    .line 122
    if-eqz p2, :cond_6

    .line 123
    .line 124
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲世兰;

    .line 125
    .line 126
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世兰哲;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    xor-int/lit8 p0, p0, 0x1

    .line 136
    .line 137
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_3
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 146
    .line 147
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 148
    .line 149
    if-eqz p2, :cond_7

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;

    .line 156
    .line 157
    if-eqz p2, :cond_8

    .line 158
    .line 159
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;

    .line 160
    .line 161
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪世兰哲苏;

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    :cond_8
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    xor-int/lit8 p0, p0, 0x1

    .line 171
    .line 172
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_4
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;

    .line 181
    .line 182
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏兰哲;

    .line 183
    .line 184
    if-eqz p2, :cond_9

    .line 185
    .line 186
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世哲苏兰;

    .line 191
    .line 192
    if-eqz p2, :cond_a

    .line 193
    .line 194
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世哲苏兰;

    .line 195
    .line 196
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏兰哲;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_a
    instance-of p2, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏哲兰;

    .line 203
    .line 204
    if-eqz p2, :cond_b

    .line 205
    .line 206
    check-cast p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏哲兰;

    .line 207
    .line 208
    iget-object p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/interaction/飘花落叶言子楪世苏兰哲;

    .line 209
    .line 210
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    xor-int/lit8 p0, p0, 0x1

    .line 218
    .line 219
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-interface {v1, p0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
