.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Landroid/view/View;)V
    .locals 3

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x98

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-class v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0, p0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v0, 0x99

    .line 35
    .line 36
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    check-cast p2, Landroid/view/ViewGroup;

    .line 50
    .line 51
    const/16 p0, 0x9a

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-class v0, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, p0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const v0, 0x293283

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Landroid/widget/TextView;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    new-instance v1, Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 89
    .line 90
    .line 91
    const v0, 0x2406047d

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x41900000    # 18.0f

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 104
    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 111
    .line 112
    const/4 v2, 0x3

    .line 113
    invoke-direct {v0, p1, v2, p0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 117
    .line 118
    .line 119
    const/16 p0, 0x9b

    .line 120
    .line 121
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    new-instance p0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 129
    .line 130
    const/4 p1, -0x1

    .line 131
    const/4 v0, -0x2

    .line 132
    invoke-direct {p0, p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    return-void

    .line 139
    :pswitch_0
    const/16 p0, 0x774

    .line 140
    .line 141
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    const/16 p0, 0x775

    .line 145
    .line 146
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    sget-object p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    .line 151
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 152
    .line 153
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p1, p0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_9

    .line 162
    .line 163
    sget-object p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Ljava/lang/String;

    .line 170
    .line 171
    if-nez p0, :cond_3

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_3
    instance-of p1, p2, Landroid/view/ViewGroup;

    .line 175
    .line 176
    if-eqz p1, :cond_4

    .line 177
    .line 178
    check-cast p2, Landroid/view/ViewGroup;

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_4
    const/4 p2, 0x0

    .line 182
    :goto_0
    if-nez p2, :cond_5

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    invoke-static {p2}, Llin/xposed/hook/util/qq/QQAIOTool;->hasContentMessage(Landroid/view/ViewGroup;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_6

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    invoke-static {p2}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentView(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-nez p1, :cond_7

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_7
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Landroid/view/View;)Ljava/util/ArrayList;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const/16 p2, 0x855

    .line 204
    .line 205
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    :cond_8
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_9

    .line 217
    .line 218
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    check-cast p2, Landroid/view/View;

    .line 223
    .line 224
    instance-of v0, p2, Landroid/widget/TextView;

    .line 225
    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const/16 v1, 0x854

    .line 237
    .line 238
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_8

    .line 247
    .line 248
    check-cast p2, Landroid/widget/TextView;

    .line 249
    .line 250
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_9
    :goto_2
    return-void

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
