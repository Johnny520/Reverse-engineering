.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;Landroid/view/View;)Z
    .locals 6

    .line 1
    iget v0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    check-cast v5, Ljava/util/List;

    .line 19
    .line 20
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 21
    .line 22
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 32
    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const/16 p2, 0xc35

    .line 40
    .line 41
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 71
    .line 72
    invoke-direct {p2, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 76
    .line 77
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ljava/lang/Thread;

    .line 81
    .line 82
    new-instance p2, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    const/4 v0, 0x6

    .line 85
    invoke-direct {p2, v5, v0, p0}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 92
    .line 93
    .line 94
    return v4

    .line 95
    :pswitch_0
    check-cast p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;

    .line 96
    .line 97
    check-cast v5, Ljava/util/List;

    .line 98
    .line 99
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 100
    .line 101
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 105
    .line 106
    if-eqz p1, :cond_1

    .line 107
    .line 108
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 109
    .line 110
    .line 111
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const/16 p2, 0xc25

    .line 117
    .line 118
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance p2, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 148
    .line 149
    invoke-direct {p2, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 150
    .line 151
    .line 152
    iput-object p2, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 153
    .line 154
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 155
    .line 156
    .line 157
    new-instance p1, Ljava/lang/Thread;

    .line 158
    .line 159
    new-instance p2, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;

    .line 160
    .line 161
    const/4 v0, 0x4

    .line 162
    invoke-direct {p2, v5, v0, p0}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 169
    .line 170
    .line 171
    return v4

    .line 172
    :pswitch_1
    check-cast p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;

    .line 173
    .line 174
    check-cast v5, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;

    .line 175
    .line 176
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 177
    .line 178
    new-instance p1, Ljava/io/File;

    .line 179
    .line 180
    iget-object p0, p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-eqz p0, :cond_2

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_2

    .line 196
    .line 197
    const/16 p0, 0xab5

    .line 198
    .line 199
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->invoke()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_2
    return v4

    .line 210
    :pswitch_2
    check-cast p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;

    .line 211
    .line 212
    check-cast v5, Ltop/suzhelan/qstory/entity/Notice;

    .line 213
    .line 214
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 215
    .line 216
    iget-object p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 217
    .line 218
    const/16 p1, 0x4de

    .line 219
    .line 220
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v5}, Ltop/suzhelan/qstory/entity/Notice;->getVersion()I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p0, p2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return v4

    .line 236
    :pswitch_3
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 237
    .line 238
    check-cast v5, Ljava/lang/String;

    .line 239
    .line 240
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 241
    .line 242
    invoke-static {p0, v5, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪哲苏兰世(Llin/xposed/hook/javaplugin/view/PluginItemView;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    return p0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
