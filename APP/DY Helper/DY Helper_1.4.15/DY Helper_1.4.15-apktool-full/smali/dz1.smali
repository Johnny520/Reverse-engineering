.class public final synthetic Ldz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnDragListener;


# instance fields
.field public final synthetic α:Landroid/widget/LinearLayout;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Lxx;

.field public final synthetic δ:Lgz1;

.field public final synthetic ε:Lcu1;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/app/Activity;Lxx;Lgz1;Lcu1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldz1;->α:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iput-object p2, p0, Ldz1;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Ldz1;->γ:Lxx;

    .line 9
    .line 10
    iput-object p4, p0, Ldz1;->δ:Lgz1;

    .line 11
    .line 12
    iput-object p5, p0, Ldz1;->ε:Lcu1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    iget-object p1, p0, Ldz1;->δ:Lgz1;

    .line 2
    .line 3
    iget-object v0, p1, Lgz1;->α:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Ldz1;->α:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-static {v1, p2}, Ljz1;->θ(Landroid/view/View;Landroid/view/DragEvent;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v2, v3, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Ldz1;->β:Landroid/app/Activity;

    .line 23
    .line 24
    iget-object p0, p0, Ldz1;->γ:Lxx;

    .line 25
    .line 26
    const/16 v0, 0xc

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    if-eq v2, v3, :cond_1

    .line 30
    .line 31
    const/4 v4, 0x5

    .line 32
    if-eq v2, v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x6

    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    iget-object p0, p0, Lxx;->κ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, p1, p0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    iget-object v2, p0, Lxx;->Α:Ljava/lang/String;

    .line 51
    .line 52
    iget-object p0, p0, Lxx;->γ:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, p1, v2, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-ne p0, v3, :cond_d

    .line 66
    .line 67
    invoke-static {}, Ljz1;->ω()V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p2}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    instance-of v1, p2, Lky1;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    const-string p1, "__ungrouped__"

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    move-object v0, v2

    .line 91
    :goto_0
    sget-object p1, Lry1;->α:Lry1;

    .line 92
    .line 93
    check-cast p2, Lky1;

    .line 94
    .line 95
    invoke-static {p2, v0}, Lry1;->А(Lky1;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_4
    instance-of v1, p2, Lgz1;

    .line 101
    .line 102
    if-eqz v1, :cond_c

    .line 103
    .line 104
    iget-boolean p1, p1, Lgz1;->ζ:Z

    .line 105
    .line 106
    if-nez p1, :cond_c

    .line 107
    .line 108
    check-cast p2, Lgz1;

    .line 109
    .line 110
    iget-object p1, p2, Lgz1;->α:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-nez p2, :cond_c

    .line 117
    .line 118
    sget-object p2, Lry1;->α:Lry1;

    .line 119
    .line 120
    invoke-static {}, Lui1;->Α()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_5

    .line 125
    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_5
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_c

    .line 149
    .line 150
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_c

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_c

    .line 161
    .line 162
    const-string v0, "default"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_6

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-static {}, Lry1;->М()Ljava/util/ArrayList;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v1, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_7
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_8

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    move-object v4, v3

    .line 195
    check-cast v4, Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-nez v4, :cond_7

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-nez v1, :cond_9

    .line 217
    .line 218
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :cond_9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    if-ltz p2, :cond_a

    .line 230
    .line 231
    move-object v2, v1

    .line 232
    :cond_a
    if-eqz v2, :cond_b

    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    goto :goto_2

    .line 239
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    :goto_2
    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 247
    .line 248
    new-instance p1, Lorg/json/JSONArray;

    .line 249
    .line 250
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-static {p2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-direct {p1, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const-string p2, "spark_group_order_v1"

    .line 269
    .line 270
    invoke-static {p2, p1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :cond_c
    :goto_3
    iget-object p0, p0, Ldz1;->ε:Lcu1;

    .line 274
    .line 275
    invoke-virtual {p0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :cond_d
    :goto_4
    const/4 p0, 0x1

    .line 279
    return p0
.end method
