.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget-object v1, v1, v2

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-wide v3, -0x36a50c82051405a7L    # -2.4041221178853817E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-wide v4, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-wide v3, -0x36a50c78051405a7L    # -2.4041357291800585E45

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-static {p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v4, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 93
    .line 94
    sget-object v4, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_0

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-static {p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_1

    .line 114
    .line 115
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const-class v5, Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    filled-new-array {v7, v5, v6, v7}, [Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iget-object v6, p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 134
    .line 135
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    filled-new-array {v0, v1, v3, p0}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p1, v2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_1
    const-wide p0, -0x36a50d11051405a7L    # -2.403927476371503E45

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_2
    :goto_1
    return-void

    .line 177
    :pswitch_0
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 178
    .line 179
    if-eqz v0, :cond_3

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_5

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Landroid/view/View;

    .line 203
    .line 204
    instance-of v1, v0, Landroid/widget/TextView;

    .line 205
    .line 206
    if-eqz v1, :cond_4

    .line 207
    .line 208
    check-cast v0, Landroid/widget/TextView;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    const-wide v2, -0x36a50c6f051405a7L    # -2.4041479793452677E45

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_4

    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    iput p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 238
    .line 239
    :cond_5
    :goto_2
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
