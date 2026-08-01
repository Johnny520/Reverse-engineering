.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    const/16 v1, 0x1b

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
    check-cast p0, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    check-cast v5, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 21
    .line 22
    new-instance p1, Ljava/io/File;

    .line 23
    .line 24
    iget-object p0, p0, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    const/16 p0, 0xb27    # 4.001E-42f

    .line 42
    .line 43
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    return v4

    .line 54
    :pswitch_0
    check-cast p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 55
    .line 56
    check-cast v5, Ljava/util/List;

    .line 57
    .line 58
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 59
    .line 60
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 70
    .line 71
    .line 72
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 p2, 0xca6

    .line 78
    .line 79
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1, v2}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    invoke-direct {p2, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object p2, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 114
    .line 115
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 116
    .line 117
    .line 118
    new-instance p1, Ljava/lang/Thread;

    .line 119
    .line 120
    new-instance p2, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;

    .line 121
    .line 122
    invoke-direct {p2, v5, v4, p0}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 129
    .line 130
    .line 131
    return v4

    .line 132
    :pswitch_1
    check-cast p0, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰苏哲;

    .line 133
    .line 134
    check-cast v5, Ljava/util/List;

    .line 135
    .line 136
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 137
    .line 138
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 142
    .line 143
    if-eqz p1, :cond_2

    .line 144
    .line 145
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 146
    .line 147
    .line 148
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const/16 p2, 0xc96

    .line 154
    .line 155
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1, v2}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 185
    .line 186
    invoke-direct {p2, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 187
    .line 188
    .line 189
    iput-object p2, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;

    .line 190
    .line 191
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 192
    .line 193
    .line 194
    new-instance p1, Ljava/lang/Thread;

    .line 195
    .line 196
    new-instance p2, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 197
    .line 198
    const/16 v0, 0x1c

    .line 199
    .line 200
    invoke-direct {p2, v5, v0, p0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 207
    .line 208
    .line 209
    return v4

    .line 210
    :pswitch_2
    check-cast p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏哲兰;

    .line 211
    .line 212
    check-cast v5, Ltop/suzhelan/qstory/entity/Notice;

    .line 213
    .line 214
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 215
    .line 216
    iget-object p0, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 217
    .line 218
    const/16 p1, 0x4c2

    .line 219
    .line 220
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
    invoke-virtual {p0, p2, p1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 241
    .line 242
    invoke-static {p0, v5, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪哲苏兰世(Llin/xposed/hook/javaplugin/view/PluginItemView;Ljava/lang/String;L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

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
