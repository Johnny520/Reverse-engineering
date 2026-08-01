.class public final synthetic Ltu1;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Ltu1;->ε:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, Landroid/app/Activity;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lbv1;

    .line 10
    .line 11
    sget-object p1, Lbv1;->α:Lbv1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const-string p0, "\u9876\u680f TAB \u8fc7\u6ee4\u662f\u5185\u6d4b\u529f\u80fd\uff0c\u9700\u8981\u5185\u6d4b\u8d44\u683c\u624d\u80fd\u4f7f\u7528"

    .line 27
    .line 28
    invoke-static {v1, p0}, Lbv1;->η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const-string p0, "toptab_discovered_tabs"

    .line 34
    .line 35
    const-string p1, "[]"

    .line 36
    .line 37
    invoke-static {p0, p1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 p1, 0x0

    .line 42
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 43
    .line 44
    invoke-direct {v2, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p1, p0}, Lj81;->Σ(II)Lxm0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v4, 0xa

    .line 58
    .line 59
    invoke-static {p0, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_0
    move-object v4, p0

    .line 71
    check-cast v4, Lwm0;

    .line 72
    .line 73
    iget-boolean v4, v4, Lwm0;->η:Z

    .line 74
    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    move-object v4, p0

    .line 78
    check-cast v4, Lwm0;

    .line 79
    .line 80
    invoke-virtual {v4}, Lwm0;->nextInt()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    sget-object v3, Ljz;->ε:Ljz;

    .line 93
    .line 94
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    const-string p0, "\u5c1a\u672a\u626b\u63cf\u5230\u9876\u680f Tab\uff0c\u8bf7\u5148\u6253\u5f00\u6296\u97f3\u9996\u9875\u7b49\u5f85\u81ea\u52a8\u626b\u63cf"

    .line 101
    .line 102
    invoke-static {v0, v1, p0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    const-string p0, "\u626b\u63cf\u5b8c\u6210\u540e\u91cd\u65b0\u6253\u5f00\u6b64\u8bbe\u7f6e\u9762\u677f\u5373\u53ef\u770b\u5230\u9009\u9879"

    .line 109
    .line 110
    invoke-static {v0, v1, p0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v4, "\u5df2\u81ea\u52a8\u626b\u63cf\u5230 "

    .line 122
    .line 123
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p0, " \u4e2a\u9876\u680f Tab\uff08\u300c\u63a8\u8350\u300d\u59cb\u7ec8\u4fdd\u7559\u4e0d\u53ef\u9690\u85cf\uff09"

    .line 130
    .line 131
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {v0, v1, p0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    move v2, p1

    .line 149
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    add-int/lit8 v6, v2, 0x1

    .line 160
    .line 161
    if-ltz v2, :cond_4

    .line 162
    .line 163
    check-cast v3, Ljava/lang/String;

    .line 164
    .line 165
    if-lez v2, :cond_3

    .line 166
    .line 167
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 168
    .line 169
    .line 170
    :cond_3
    const-string v2, "toptab_hide_"

    .line 171
    .line 172
    invoke-static {v2, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v4, "\u9690\u85cf\u300c"

    .line 177
    .line 178
    const-string v5, "\u300d"

    .line 179
    .line 180
    invoke-static {v4, v3, v5}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    const-string v5, "\u79fb\u9664\u9876\u680f\u7684 "

    .line 185
    .line 186
    const-string v7, " \u6807\u7b7e"

    .line 187
    .line 188
    invoke-static {v5, v3, v7}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    move-object v5, v2

    .line 193
    move-object v2, v4

    .line 194
    invoke-static {v5, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    move-object v7, v5

    .line 199
    new-instance v5, Lic;

    .line 200
    .line 201
    const/4 v8, 0x7

    .line 202
    invoke-direct {v5, v1, v8, v7}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 206
    .line 207
    .line 208
    move v2, v6

    .line 209
    goto :goto_1

    .line 210
    :cond_4
    invoke-static {}, Lyh;->х()V

    .line 211
    .line 212
    .line 213
    const/4 p0, 0x0

    .line 214
    throw p0

    .line 215
    :cond_5
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    const-string p0, "\u65b0\u51fa\u73b0\u7684 Tab \u4f1a\u5728\u4e0b\u6b21\u6253\u5f00\u9996\u9875\u65f6\u81ea\u52a8\u626b\u63cf\u5e76\u6dfb\u52a0\u5230\u6b64\u5217\u8868"

    .line 219
    .line 220
    invoke-static {v0, v1, p0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 224
    .line 225
    .line 226
    const-string p0, "toptab_center_align"

    .line 227
    .line 228
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    new-instance v5, Lct1;

    .line 233
    .line 234
    const/16 p0, 0x11

    .line 235
    .line 236
    invoke-direct {v5, v1, p0}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 237
    .line 238
    .line 239
    const-string v2, "\u9876\u680f Tab \u5c45\u4e2d\u5bf9\u9f50"

    .line 240
    .line 241
    const-string v3, "\u5c06\u6240\u6709 Tab \u6807\u7b7e\u5728\u6807\u9898\u680f\u4e2d\u5c45\u4e2d\u663e\u793a\uff0c\u800c\u975e\u9ed8\u8ba4\u5de6\u5bf9\u9f50"

    .line 242
    .line 243
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    const-string p0, "toptab_skip_hidden_page_enabled"

    .line 250
    .line 251
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    new-instance v5, Lct1;

    .line 256
    .line 257
    const/16 p0, 0x12

    .line 258
    .line 259
    invoke-direct {v5, v1, p0}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 260
    .line 261
    .line 262
    const-string v2, "\u8df3\u8fc7\u9690\u85cf\u9876\u680f\u9875"

    .line 263
    .line 264
    const-string v3, "\u6ed1\u52a8\u5230\u5df2\u9690\u85cf\u7684\u9876\u680f\u9875\u9762\u65f6\u81ea\u52a8\u8df3\u5230\u6700\u8fd1\u53ef\u89c1\u9875\u9762\uff0c\u5173\u95ed\u53ef\u964d\u4f4e Hook \u5f00\u9500"

    .line 265
    .line 266
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 270
    .line 271
    .line 272
    const-string p0, "\u5207\u6362\u9875\u9762\u6216\u91cd\u542f\u6296\u97f3\u540e\u751f\u6548"

    .line 273
    .line 274
    invoke-static {v0, v1, p0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :goto_2
    return-object v0
.end method

.method private final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lbv1;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    const/4 v9, 0x1

    .line 22
    invoke-static {v0, v9}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    new-instance v11, Lqm1;

    .line 27
    .line 28
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "info_bar_enabled"

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    invoke-static {v1, v12}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput-boolean v1, v11, Lqm1;->ε:Z

    .line 39
    .line 40
    new-instance v2, Lic;

    .line 41
    .line 42
    const/4 v3, 0x5

    .line 43
    invoke-direct {v2, v11, v3, v10}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "\u542f\u7528\u89c6\u9891\u4fe1\u606f\u6761"

    .line 47
    .line 48
    const-string v4, "\u5728\u89c6\u9891\u63cf\u8ff0\u4e0b\u65b9\u663e\u793a\u53d1\u5e03\u65f6\u95f4\u4e0e\u4f4d\u7f6e\uff08\u5b58\u5728\u4e00\u5b9a\u7684\u6027\u80fd\u5f00\u9500\uff09"

    .line 49
    .line 50
    invoke-static {v0, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    const-string v1, "info_bar_text_size"

    .line 65
    .line 66
    const/16 v2, 0x73

    .line 67
    .line 68
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :catchall_0
    const/16 v1, 0x50

    .line 77
    .line 78
    const/16 v3, 0xc8

    .line 79
    .line 80
    invoke-static {v2, v1, v3}, Lj81;->μ(III)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    new-instance v7, Ldt1;

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    invoke-direct {v7, v1}, Ldt1;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-string v1, "\u5b57\u4f53\u5927\u5c0f"

    .line 91
    .line 92
    const/16 v4, 0x50

    .line 93
    .line 94
    const-string v5, " (x0.1sp)"

    .line 95
    .line 96
    const-string v6, "\u8c03\u8282\u4fe1\u606f\u6761\u7684\u5b57\u53f7\uff0c\u9ed8\u8ba4 115 \u5373 11.5sp"

    .line 97
    .line 98
    invoke-static/range {v0 .. v7}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    const-string v1, "info_bar_text_format"

    .line 113
    .line 114
    const-string v2, "{time}     {location}"

    .line 115
    .line 116
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const/16 v2, 0x14

    .line 121
    .line 122
    invoke-static {v1, v2}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v2, Lg71;

    .line 127
    .line 128
    const/16 v3, 0x15

    .line 129
    .line 130
    invoke-direct {v2, v0, v3}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 131
    .line 132
    .line 133
    const-string v3, "\u663e\u793a\u683c\u5f0f"

    .line 134
    .line 135
    const-string v4, "\u652f\u6301 {time:yyyy-MM-dd HH:mm}\u3001{location}\u3001{id}"

    .line 136
    .line 137
    invoke-static {v0, v3, v1, v4, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    new-instance v1, Lqm1;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v2, "info_bar_neon_enabled"

    .line 157
    .line 158
    invoke-static {v2, v12}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    iput-boolean v2, v1, Lqm1;->ε:Z

    .line 163
    .line 164
    new-instance v3, Lqm1;

    .line 165
    .line 166
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 167
    .line 168
    .line 169
    if-nez v2, :cond_0

    .line 170
    .line 171
    const-string v2, "info_bar_neon_solid_enabled"

    .line 172
    .line 173
    invoke-static {v2, v12}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_0

    .line 178
    .line 179
    move v2, v9

    .line 180
    goto :goto_0

    .line 181
    :cond_0
    move v2, v12

    .line 182
    :goto_0
    iput-boolean v2, v3, Lqm1;->ε:Z

    .line 183
    .line 184
    invoke-static {v0, v9}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    new-instance v4, Lum1;

    .line 189
    .line 190
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    iget-boolean v5, v1, Lqm1;->ε:Z

    .line 194
    .line 195
    new-instance v6, Lft1;

    .line 196
    .line 197
    invoke-direct {v6, v1, v3, v4, v2}, Lft1;-><init>(Lqm1;Lqm1;Lum1;Landroid/widget/LinearLayout;)V

    .line 198
    .line 199
    .line 200
    const-string v7, "\u9713\u8679\u5f69\u8679\u8272"

    .line 201
    .line 202
    const-string v13, "\u6587\u5b57\u663e\u793a\u5b9e\u65f6\u6d41\u52a8\u7684\u5f69\u8679\u6e10\u53d8\uff0c\u81ea\u5e26\u53d1\u5149\u6548\u679c"

    .line 203
    .line 204
    invoke-static {v0, v7, v13, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-static {v10, v5, v0}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 209
    .line 210
    .line 211
    iget-boolean v6, v3, Lqm1;->ε:Z

    .line 212
    .line 213
    new-instance v7, Lft1;

    .line 214
    .line 215
    invoke-direct {v7, v3, v1, v5, v2}, Lft1;-><init>(Lqm1;Lqm1;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    .line 216
    .line 217
    .line 218
    const-string v5, "\u6574\u4f53\u9713\u8679\u53d8\u8272"

    .line 219
    .line 220
    const-string v13, "\u6574\u6761\u4fe1\u606f\u6761\u540c\u6b65\u53d8\u8272\uff0c\u4e0d\u505a\u5355\u5b57\u5f69\u8679\u6e10\u53d8"

    .line 221
    .line 222
    invoke-static {v0, v5, v13, v6, v7}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    instance-of v7, v6, Landroid/widget/Switch;

    .line 231
    .line 232
    if-eqz v7, :cond_1

    .line 233
    .line 234
    check-cast v6, Landroid/widget/Switch;

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_1
    const/4 v6, 0x0

    .line 238
    :goto_1
    iput-object v6, v4, Lum1;->ε:Ljava/lang/Object;

    .line 239
    .line 240
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 248
    .line 249
    .line 250
    const-string v4, "info_bar_text_color"

    .line 251
    .line 252
    const-string v5, "#CCFFFFFF"

    .line 253
    .line 254
    invoke-static {v4, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    new-instance v6, Lg71;

    .line 259
    .line 260
    const/16 v7, 0x16

    .line 261
    .line 262
    invoke-direct {v6, v0, v7}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 263
    .line 264
    .line 265
    const-string v7, "\u5b57\u4f53\u989c\u8272"

    .line 266
    .line 267
    const-string v14, "\u70b9\u51fb\u9009\u62e9\u5b57\u4f53\u989c\u8272"

    .line 268
    .line 269
    invoke-static {v0, v7, v4, v14, v6}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v4, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    instance-of v7, v6, Landroid/view/ViewGroup;

    .line 278
    .line 279
    if-eqz v7, :cond_2

    .line 280
    .line 281
    check-cast v6, Landroid/view/ViewGroup;

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_2
    const/4 v6, 0x0

    .line 285
    :goto_2
    if-eqz v6, :cond_3

    .line 286
    .line 287
    invoke-virtual {v6, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    goto :goto_3

    .line 292
    :cond_3
    const/4 v6, 0x0

    .line 293
    :goto_3
    instance-of v7, v6, Landroid/widget/TextView;

    .line 294
    .line 295
    if-eqz v7, :cond_4

    .line 296
    .line 297
    check-cast v6, Landroid/widget/TextView;

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_4
    const/4 v6, 0x0

    .line 301
    :goto_4
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 309
    .line 310
    .line 311
    new-instance v4, Lfi;

    .line 312
    .line 313
    invoke-direct {v4, v6, v9}, Lfi;-><init>(Landroid/widget/TextView;I)V

    .line 314
    .line 315
    .line 316
    new-instance v14, Ll91;

    .line 317
    .line 318
    const-string v6, "\u767d\u8272"

    .line 319
    .line 320
    invoke-direct {v14, v6, v5}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    new-instance v15, Ll91;

    .line 324
    .line 325
    const-string v5, "\u4eae\u767d"

    .line 326
    .line 327
    const-string v6, "#FFFFFFFF"

    .line 328
    .line 329
    invoke-direct {v15, v5, v6}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v5, Ll91;

    .line 333
    .line 334
    const-string v6, "\u9ec4\u8272"

    .line 335
    .line 336
    const-string v7, "#FFFFD700"

    .line 337
    .line 338
    invoke-direct {v5, v6, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    new-instance v6, Ll91;

    .line 342
    .line 343
    const-string v7, "\u7ea2\u8272"

    .line 344
    .line 345
    const-string v12, "#FFFE2C55"

    .line 346
    .line 347
    invoke-direct {v6, v7, v12}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    new-instance v7, Ll91;

    .line 351
    .line 352
    const-string v12, "\u9752\u8272"

    .line 353
    .line 354
    const-string v13, "#FF00E5FF"

    .line 355
    .line 356
    invoke-direct {v7, v12, v13}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v12, Ll91;

    .line 360
    .line 361
    const-string v13, "\u7eff\u8272"

    .line 362
    .line 363
    const-string v9, "#FF7CFC00"

    .line 364
    .line 365
    invoke-direct {v12, v13, v9}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v16, v5

    .line 369
    .line 370
    move-object/from16 v17, v6

    .line 371
    .line 372
    move-object/from16 v18, v7

    .line 373
    .line 374
    move-object/from16 v19, v12

    .line 375
    .line 376
    filled-new-array/range {v14 .. v19}, [Ll91;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    const/4 v6, 0x1

    .line 385
    invoke-static {v0, v6}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    sget-object v6, Lbv1;->α:Lbv1;

    .line 390
    .line 391
    const/16 v6, 0x10

    .line 392
    .line 393
    invoke-static {v0, v6}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    const/16 v12, 0xc

    .line 398
    .line 399
    invoke-static {v0, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 400
    .line 401
    .line 402
    move-result v12

    .line 403
    invoke-static {v0, v6}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    const/16 v13, 0xe

    .line 408
    .line 409
    invoke-static {v0, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 410
    .line 411
    .line 412
    move-result v13

    .line 413
    invoke-virtual {v7, v9, v12, v6, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 414
    .line 415
    .line 416
    const-string v6, "\u989c\u8272\u9884\u8bbe"

    .line 417
    .line 418
    const/high16 v9, 0x41600000    # 14.0f

    .line 419
    .line 420
    invoke-static {v0, v6, v9}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 425
    .line 426
    const-string v12, "theme"

    .line 427
    .line 428
    if-eqz v9, :cond_b

    .line 429
    .line 430
    iget-object v9, v9, Lqu1;->η:Ljava/lang/String;

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const/4 v14, 0x1

    .line 434
    invoke-static {v9, v6, v13, v14}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 438
    .line 439
    .line 440
    new-instance v6, Landroid/widget/TextView;

    .line 441
    .line 442
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 443
    .line 444
    .line 445
    const-string v9, "\u70b9\u51fb\u4e0b\u65b9\u8272\u5757\u5feb\u901f\u5e94\u7528\u9884\u8bbe\u989c\u8272"

    .line 446
    .line 447
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    const/high16 v9, 0x41400000    # 12.0f

    .line 451
    .line 452
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 453
    .line 454
    .line 455
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 456
    .line 457
    if-eqz v9, :cond_a

    .line 458
    .line 459
    iget-object v9, v9, Lqu1;->ι:Ljava/lang/String;

    .line 460
    .line 461
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 466
    .line 467
    .line 468
    const/4 v9, 0x4

    .line 469
    invoke-static {v0, v9}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 470
    .line 471
    .line 472
    move-result v9

    .line 473
    const/16 v12, 0xa

    .line 474
    .line 475
    invoke-static {v0, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 476
    .line 477
    .line 478
    move-result v12

    .line 479
    const/4 v13, 0x0

    .line 480
    invoke-virtual {v6, v13, v9, v13, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 484
    .line 485
    .line 486
    new-instance v6, Landroid/widget/LinearLayout;

    .line 487
    .line 488
    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 492
    .line 493
    .line 494
    const v9, 0x800013

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 505
    .line 506
    .line 507
    move-result v9

    .line 508
    if-eqz v9, :cond_6

    .line 509
    .line 510
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    check-cast v9, Ll91;

    .line 515
    .line 516
    iget-object v14, v9, Ll91;->ε:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v14, Ljava/lang/String;

    .line 519
    .line 520
    iget-object v9, v9, Ll91;->ζ:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v9, Ljava/lang/String;

    .line 523
    .line 524
    const/high16 v15, 0x41300000    # 11.0f

    .line 525
    .line 526
    invoke-static {v0, v14, v15}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 527
    .line 528
    .line 529
    move-result-object v15

    .line 530
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    move-result v13

    .line 534
    invoke-static {v13}, Landroid/graphics/Color;->red(I)I

    .line 535
    .line 536
    .line 537
    move-result v12

    .line 538
    mul-int/lit16 v12, v12, 0x12b

    .line 539
    .line 540
    move-object/from16 v17, v5

    .line 541
    .line 542
    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    mul-int/lit16 v5, v5, 0x24b

    .line 547
    .line 548
    add-int/2addr v5, v12

    .line 549
    invoke-static {v13}, Landroid/graphics/Color;->blue(I)I

    .line 550
    .line 551
    .line 552
    move-result v12

    .line 553
    mul-int/lit8 v12, v12, 0x72

    .line 554
    .line 555
    add-int/2addr v12, v5

    .line 556
    div-int/lit16 v12, v12, 0x3e8

    .line 557
    .line 558
    const/16 v5, 0xa0

    .line 559
    .line 560
    if-le v12, v5, :cond_5

    .line 561
    .line 562
    const/high16 v5, -0x1000000

    .line 563
    .line 564
    goto :goto_6

    .line 565
    :cond_5
    const/4 v5, -0x1

    .line 566
    :goto_6
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 567
    .line 568
    .line 569
    const/4 v5, 0x0

    .line 570
    const/4 v12, 0x1

    .line 571
    invoke-virtual {v15, v5, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 572
    .line 573
    .line 574
    const/16 v5, 0x11

    .line 575
    .line 576
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 577
    .line 578
    .line 579
    const/16 v5, 0x8

    .line 580
    .line 581
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    move-object/from16 v16, v3

    .line 586
    .line 587
    const/4 v3, 0x6

    .line 588
    move-object/from16 v18, v1

    .line 589
    .line 590
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    move-object/from16 v19, v11

    .line 595
    .line 596
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    invoke-virtual {v15, v12, v1, v11, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 605
    .line 606
    .line 607
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 608
    .line 609
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 613
    .line 614
    .line 615
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    int-to-float v3, v3

    .line 620
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v15, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 624
    .line 625
    .line 626
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 627
    .line 628
    const/4 v3, -0x2

    .line 629
    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 630
    .line 631
    .line 632
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 637
    .line 638
    invoke-virtual {v15, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 639
    .line 640
    .line 641
    const/4 v12, 0x1

    .line 642
    invoke-virtual {v15, v12}, Landroid/view/View;->setClickable(Z)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v15, v12}, Landroid/view/View;->setFocusable(Z)V

    .line 646
    .line 647
    .line 648
    new-instance v1, Lvj;

    .line 649
    .line 650
    invoke-direct {v1, v9, v4, v0, v14}, Lvj;-><init>(Ljava/lang/String;Lfi;Landroid/app/Activity;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v15, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v6, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 657
    .line 658
    .line 659
    move-object/from16 v3, v16

    .line 660
    .line 661
    move-object/from16 v5, v17

    .line 662
    .line 663
    move-object/from16 v1, v18

    .line 664
    .line 665
    move-object/from16 v11, v19

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    goto/16 :goto_5

    .line 669
    .line 670
    :cond_6
    move-object/from16 v18, v1

    .line 671
    .line 672
    move-object/from16 v16, v3

    .line 673
    .line 674
    move-object/from16 v19, v11

    .line 675
    .line 676
    const/16 v5, 0x8

    .line 677
    .line 678
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 685
    .line 686
    .line 687
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 692
    .line 693
    .line 694
    const-string v1, "\u683c\u5f0f\u793a\u4f8b\uff1a{time:yyyy-MM-dd HH:mm} \u00b7 {location}\uff0cMM \u662f\u6708\u4efd\uff0cmm \u662f\u5206\u949f"

    .line 695
    .line 696
    invoke-static {v0, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 701
    .line 702
    .line 703
    const-string v1, "\u5207\u6362\u9875\u9762\u540e\u6837\u5f0f\u751f\u6548"

    .line 704
    .line 705
    invoke-static {v0, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 713
    .line 714
    .line 715
    move-object/from16 v0, v19

    .line 716
    .line 717
    iget-boolean v0, v0, Lqm1;->ε:Z

    .line 718
    .line 719
    if-eqz v0, :cond_7

    .line 720
    .line 721
    const/4 v0, 0x0

    .line 722
    goto :goto_7

    .line 723
    :cond_7
    move v0, v5

    .line 724
    :goto_7
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 725
    .line 726
    .line 727
    move-object/from16 v0, v18

    .line 728
    .line 729
    iget-boolean v0, v0, Lqm1;->ε:Z

    .line 730
    .line 731
    if-nez v0, :cond_9

    .line 732
    .line 733
    move-object/from16 v0, v16

    .line 734
    .line 735
    iget-boolean v0, v0, Lqm1;->ε:Z

    .line 736
    .line 737
    if-eqz v0, :cond_8

    .line 738
    .line 739
    goto :goto_8

    .line 740
    :cond_8
    const/4 v12, 0x0

    .line 741
    goto :goto_9

    .line 742
    :cond_9
    :goto_8
    move v12, v5

    .line 743
    :goto_9
    invoke-virtual {v2, v12}, Landroid/view/View;->setVisibility(I)V

    .line 744
    .line 745
    .line 746
    return-object v8

    .line 747
    :cond_a
    invoke-static {v12}, Lln0;->и(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    const/4 v5, 0x0

    .line 751
    throw v5

    .line 752
    :cond_b
    const/4 v5, 0x0

    .line 753
    invoke-static {v12}, Lln0;->и(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    throw v5
.end method

.method private final δ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, Landroid/app/Activity;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lbv1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const-string p0, "\u7a7a\u95f2\u9000\u51fa\u662f\u5185\u6d4b\u529f\u80fd\uff0c\u9700\u8981\u5185\u6d4b\u8d44\u683c\u624d\u80fd\u4f7f\u7528"

    .line 25
    .line 26
    invoke-static {v1, p0}, Lbv1;->η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "idle_auto_exit_enabled"

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    new-instance v5, Lct1;

    .line 39
    .line 40
    const/16 p0, 0x8

    .line 41
    .line 42
    invoke-direct {v5, v1, p0}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 43
    .line 44
    .line 45
    const-string v2, "\u542f\u7528\u7a7a\u95f2\u9000\u51fa"

    .line 46
    .line 47
    const-string v3, "\u8d85\u8fc7\u8bbe\u5b9a\u65f6\u95f4\u65e0\u64cd\u4f5c\uff0c\u81ea\u52a8\u9000\u51fa\u6296\u97f3\u5e76\u9501\u5c4f"

    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 50
    .line 51
    .line 52
    move-object p0, v0

    .line 53
    invoke-static {p0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "idle_auto_exit_minutes"

    .line 57
    .line 58
    const/16 v2, 0x1e

    .line 59
    .line 60
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :catchall_0
    const/4 v0, 0x1

    .line 69
    const/16 v3, 0x78

    .line 70
    .line 71
    invoke-static {v2, v0, v3}, Lj81;->μ(III)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    new-instance v7, Lkv0;

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    invoke-direct {v7, v1, v0}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 79
    .line 80
    .line 81
    move-object v0, v1

    .line 82
    const-string v1, "\u7a7a\u95f2\u65f6\u957f"

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    const-string v5, "\u5206\u949f"

    .line 86
    .line 87
    const-string v6, "\u65e0\u64cd\u4f5c\u8d85\u8fc7\u6b64\u65f6\u957f\u540e\u81ea\u52a8\u9000\u51fa"

    .line 88
    .line 89
    invoke-static/range {v0 .. v7}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    const-string v1, "idle_exit_lock_screen"

    .line 100
    .line 101
    invoke-static {v1, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    new-instance v5, Lct1;

    .line 106
    .line 107
    const/16 v1, 0x9

    .line 108
    .line 109
    invoke-direct {v5, v0, v1}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 110
    .line 111
    .line 112
    const-string v2, "\u9000\u51fa\u540e\u9501\u5c4f"

    .line 113
    .line 114
    const-string v3, "\u9000\u51fa\u6296\u97f3\u65f6\u9501\u5c4f\uff08\u9700 Root\uff09"

    .line 115
    .line 116
    move-object v1, v0

    .line 117
    move-object v0, p0

    .line 118
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 122
    .line 123
    .line 124
    const-string p0, "idle_exit_show_countdown"

    .line 125
    .line 126
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    new-instance v5, Lct1;

    .line 131
    .line 132
    const/16 p0, 0xa

    .line 133
    .line 134
    invoke-direct {v5, v1, p0}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 135
    .line 136
    .line 137
    const-string v2, "\u9000\u51fa\u524d\u5012\u8ba1\u65f6\u63d0\u793a"

    .line 138
    .line 139
    const-string v3, "\u7a7a\u95f2\u8d85\u65f6\u524d\u663e\u793a\u5012\u8ba1\u65f6\uff0c\u89e6\u6478\u53ef\u53d6\u6d88\u9000\u51fa"

    .line 140
    .line 141
    invoke-static/range {v0 .. v5}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 142
    .line 143
    .line 144
    return-object v0
.end method

.method private final ζ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/app/Activity;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lbv1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "download_show_top_notification"

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {p1, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    new-instance v2, Loq1;

    .line 26
    .line 27
    const/16 v3, 0x1b

    .line 28
    .line 29
    invoke-direct {v2, v3}, Loq1;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v3, "\u4e0b\u8f7d\u4f5c\u54c1\u8fdb\u5ea6"

    .line 33
    .line 34
    const-string v4, "\u4e0b\u8f7d\u89c6\u9891\u3001\u56fe\u7247\u3001\u52a8\u56fe\u3001\u97f3\u9891\u65f6\u4f7f\u7528\u9876\u90e8\u901a\u77e5\u663e\u793a\u8fdb\u5ea6"

    .line 35
    .line 36
    invoke-static {v0, v3, v4, p1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "spark_show_top_notification"

    .line 51
    .line 52
    invoke-static {p1, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    new-instance v2, Loq1;

    .line 57
    .line 58
    const/16 v3, 0x1c

    .line 59
    .line 60
    invoke-direct {v2, v3}, Loq1;-><init>(I)V

    .line 61
    .line 62
    .line 63
    const-string v3, "\u706b\u82b1/\u706b\u661f\u4efb\u52a1\u8fdb\u5ea6"

    .line 64
    .line 65
    const-string v4, "\u624b\u52a8\u6216\u81ea\u52a8\u6267\u884c\u7eed\u706b\u3001\u706b\u661f\u4efb\u52a1\u65f6\u4f7f\u7528\u9876\u90e8\u901a\u77e5\u663e\u793a\u8fdb\u5ea6"

    .line 66
    .line 67
    invoke-static {v0, v3, v4, p1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    const-string p1, "pet_elf_camp_show_top_notification"

    .line 82
    .line 83
    invoke-static {p1, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    new-instance v1, Lit1;

    .line 88
    .line 89
    const/4 v2, 0x3

    .line 90
    invoke-direct {v1, v0, v2}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 91
    .line 92
    .line 93
    const-string v2, "\u8425\u5730\u4efb\u52a1\u63d0\u793a"

    .line 94
    .line 95
    const-string v3, "\u5237\u65b0\u3001\u6536\u83dc\u3001\u79cd\u5730\u3001\u6d47\u6c34\u5404\u81ea\u5728\u5f53\u65e5\u9996\u6b21\u5b8c\u6210\u65f6\u6c47\u603b\u63d0\u793a\uff0c\u540e\u7eed\u9759\u9ed8\u6267\u884c"

    .line 96
    .line 97
    invoke-static {v0, v2, v3, p1, v1}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p0, p1, v0}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "download_top_notification_alpha"

    .line 105
    .line 106
    const/16 v1, 0x3e

    .line 107
    .line 108
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :catchall_0
    const/4 p1, 0x0

    .line 117
    const/16 v2, 0x64

    .line 118
    .line 119
    invoke-static {v1, p1, v2}, Lj81;->μ(III)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    new-instance v7, Ldt1;

    .line 124
    .line 125
    const/16 p1, 0x14

    .line 126
    .line 127
    invoke-direct {v7, p1}, Ldt1;-><init>(I)V

    .line 128
    .line 129
    .line 130
    const-string v1, "\u9876\u90e8\u901a\u77e5\u901a\u900f\u5ea6"

    .line 131
    .line 132
    const/16 v3, 0x64

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    const-string v5, "%"

    .line 136
    .line 137
    const-string v6, "\u6570\u503c\u8d8a\u9ad8\u8d8a\u900f\u660e\uff0c\u6587\u5b57\u548c\u8fdb\u5ea6\u4e0d\u53d7\u5f71\u54cd"

    .line 138
    .line 139
    invoke-static/range {v0 .. v7}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    return-object p0
.end method

.method private final η(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lbv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "version_update_check_enabled"

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v1, Lit1;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, p1, v2}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 28
    .line 29
    .line 30
    const-string v2, "\u7248\u672c\u66f4\u65b0\u68c0\u67e5"

    .line 31
    .line 32
    const-string v3, "\u542f\u52a8\u5bbf\u4e3b\u540e\u81ea\u52a8\u68c0\u67e5 DYHelper \u65b0\u7248\u672c\uff0c\u53d1\u73b0\u66f4\u65b0\u65f6\u5f39\u7a97\u63d0\u793a\u4e0b\u8f7d"

    .line 33
    .line 34
    invoke-static {p1, v2, v3, v0, v1}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lu72;->δ()Lt72;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    const-string v0, "\u6682\u65e0\u7f13\u5b58"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v1, v0, Lt72;->α:I

    .line 58
    .line 59
    iget-object v0, v0, Lt72;->β:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, " ("

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ")"

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :goto_0
    new-instance v1, Ljt1;

    .line 98
    .line 99
    const/4 v2, 0x3

    .line 100
    invoke-direct {v1, p1, v2}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 101
    .line 102
    .line 103
    const-string v2, "\u7acb\u5373\u68c0\u67e5\u66f4\u65b0"

    .line 104
    .line 105
    const-string v3, "\u8054\u7f51\u62c9\u53d6\u6700\u65b0\u7248\u672c\u4fe1\u606f\uff0c\u82e5\u53d1\u73b0\u65b0\u7248\u672c\u4f1a\u663e\u793a\u66f4\u65b0\u5f39\u7a97"

    .line 106
    .line 107
    invoke-static {p1, v2, v0, v3, v1}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    const-string v0, "\u5173\u95ed\u540e\u4e0d\u4f1a\u81ea\u52a8\u8054\u7f51\u68c0\u67e5\u7248\u672c\uff1b\u624b\u52a8\u70b9\u51fb\u201c\u7acb\u5373\u68c0\u67e5\u66f4\u65b0\u201d\u4ecd\u53ef\u4e3b\u52a8\u67e5\u8be2"

    .line 122
    .line 123
    invoke-static {p1, v0}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    return-object p0
.end method

.method private final θ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lbv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {}, Lx9;->θ()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {}, Lx9;->η()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v4, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v4, v2

    .line 35
    :goto_1
    if-nez v4, :cond_2

    .line 36
    .line 37
    const-string v5, "\u706b\u82b1\u4e0e\u706b\u661f\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 38
    .line 39
    invoke-static {p1, v5}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const-string v5, "spark_auto_renew_enabled"

    .line 56
    .line 57
    invoke-static {v5, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v5, v3

    .line 63
    :goto_2
    new-instance v6, Lct1;

    .line 64
    .line 65
    const/16 v7, 0x13

    .line 66
    .line 67
    invoke-direct {v6, p1, v7}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 68
    .line 69
    .line 70
    const-string v7, "\u81ea\u52a8\u7eed\u671f\u6a21\u5f0f"

    .line 71
    .line 72
    const-string v8, "\u5230\u8fbe\u8bbe\u5b9a\u65f6\u95f4\u540e\u81ea\u52a8\u53d1\u9001\u7eed\u671f\u6d88\u606f"

    .line 73
    .line 74
    invoke-static {p1, v7, v8, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    const-string v5, "\u5c0f\u706b\u4eba\u706b\u661f\u4efb\u52a1\u4e0e\u4eb2\u5bc6\u5ea6"

    .line 89
    .line 90
    invoke-static {p1, v5}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    const-string v5, "pet_elf_auto_success_toast_enabled"

    .line 105
    .line 106
    invoke-static {v5, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    new-instance v6, Lhu1;

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-direct {v6, v7}, Lhu1;-><init>(I)V

    .line 114
    .line 115
    .line 116
    const-string v7, "\u81ea\u52a8\u64cd\u4f5c\u6210\u529f\u63d0\u9192"

    .line 117
    .line 118
    const-string v8, "\u81ea\u52a8\u6295\u5582\u3001\u81ea\u52a8\u9886\u53d6\u4eb2\u5bc6\u5ea6\u6216\u81ea\u52a8\u9886\u53d6\u706b\u661f\u6210\u529f\u6570\u91cf\u81f3\u5c11\u4e3a 1 \u65f6\uff0c\u6bcf\u6b21\u663e\u793a Toast"

    .line 119
    .line 120
    invoke-static {p1, v7, v8, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    const-string v5, "pet_elf_auto_claim_enabled"

    .line 137
    .line 138
    invoke-static {v5, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    goto :goto_3

    .line 143
    :cond_4
    move v5, v3

    .line 144
    :goto_3
    new-instance v6, Lgu1;

    .line 145
    .line 146
    const/4 v7, 0x1

    .line 147
    invoke-direct {v6, p1, p1, v7}, Lgu1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 148
    .line 149
    .line 150
    const-string v7, "\u6bcf\u65e5\u81ea\u52a8\u9886\u53d6\u706b\u661f"

    .line 151
    .line 152
    const-string v8, "\u5f00\u542f\u540e\u6bcf\u6b21\u6253\u5f00\u6296\u97f3\u90fd\u4f1a\u68c0\u67e5\u5e76\u9886\u53d6\u5df2\u5b8c\u6210\u7684\u706b\u661f\u4efb\u52a1"

    .line 153
    .line 154
    invoke-static {p1, v7, v8, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-static {p0, v5, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 159
    .line 160
    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    const-string v5, "pet_elf_closeness_auto_claim_enabled"

    .line 164
    .line 165
    invoke-static {v5, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    goto :goto_4

    .line 170
    :cond_5
    move v5, v3

    .line 171
    :goto_4
    new-instance v6, Lgu1;

    .line 172
    .line 173
    const/4 v7, 0x2

    .line 174
    invoke-direct {v6, p1, p1, v7}, Lgu1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 175
    .line 176
    .line 177
    const-string v7, "\u81ea\u52a8\u9886\u53d6\u5c0f\u706b\u4eba\u7ecf\u9a8c"

    .line 178
    .line 179
    const-string v8, "\u6bcf\u6b21\u6253\u5f00\u6296\u97f3\u9886\u53d6\u5df2\u51fa\u73b0\u7684\u4eb2\u5bc6\u5ea6\u6c14\u6ce1\uff1b\u4e0e\u706b\u661f\u4efb\u52a1\u5956\u52b1\u72ec\u7acb"

    .line 180
    .line 181
    invoke-static {p1, v7, v8, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-static {p0, v5, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 186
    .line 187
    .line 188
    if-eqz v1, :cond_6

    .line 189
    .line 190
    const-string v5, "pet_elf_auto_feed_enabled"

    .line 191
    .line 192
    invoke-static {v5, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    goto :goto_5

    .line 197
    :cond_6
    move v5, v3

    .line 198
    :goto_5
    new-instance v6, Lgu1;

    .line 199
    .line 200
    const/4 v7, 0x3

    .line 201
    invoke-direct {v6, p1, p1, v7}, Lgu1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 202
    .line 203
    .line 204
    const-string v7, "\u81ea\u52a8\u6295\u5582\u5c0f\u706b\u4eba"

    .line 205
    .line 206
    const-string v8, "\u6bcf\u4e2a\u6296\u97f3\u8fdb\u7a0b\u68c0\u67e5\u4e00\u6b21\uff1b\u9010\u4eba\u5458\u8bfb\u53d6\u5b9e\u65f6\u76ee\u5f55\u5e76\u9075\u5b88\u4ef7\u683c\u4e0a\u9650"

    .line 207
    .line 208
    invoke-static {p1, v7, v8, v5, v6}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    const-string v5, "pet_elf_auto_feed_default_food_id"

    .line 223
    .line 224
    const-string v6, "204"

    .line 225
    .line 226
    invoke-static {v5, v6}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    const-string v8, "__smart__"

    .line 250
    .line 251
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    const/4 v9, 0x0

    .line 256
    const-string v10, ""

    .line 257
    .line 258
    const/16 v11, 0xa

    .line 259
    .line 260
    if-eqz v7, :cond_7

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_7
    invoke-static {v5, v11}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-eqz v5, :cond_9

    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-lez v7, :cond_8

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_8
    move-object v5, v9

    .line 277
    :goto_6
    if-eqz v5, :cond_9

    .line 278
    .line 279
    invoke-virtual {v5}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    move-object v8, v5

    .line 284
    goto :goto_7

    .line 285
    :cond_9
    move-object v8, v9

    .line 286
    :goto_7
    if-nez v8, :cond_a

    .line 287
    .line 288
    move-object v8, v10

    .line 289
    :cond_a
    :goto_8
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_b

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_b
    move-object v6, v8

    .line 297
    :goto_9
    invoke-static {v6}, Lgf1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    new-instance v7, Lfj1;

    .line 302
    .line 303
    const/4 v8, 0x3

    .line 304
    invoke-direct {v7, p1, v6, v8}, Lfj1;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    const-string v6, "\u9ed8\u8ba4\u6295\u5582\u98df\u7269"

    .line 308
    .line 309
    const-string v8, "\u4eba\u5458\u672a\u5355\u72ec\u9009\u62e9\u65f6\u4f7f\u7528\uff1b\u667a\u80fd\u9009\u62e9\u4f1a\u6309\u5b9e\u65f6\u4ef7\u683c\u4e0a\u9650\u6bd4\u8f83\u4eb2\u5bc6\u5ea6 / \u706b\u661f"

    .line 310
    .line 311
    invoke-static {p1, v6, v5, v8, v7}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-static {p0, v5, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 316
    .line 317
    .line 318
    const-string v5, "pet_elf_auto_feed_max_price"

    .line 319
    .line 320
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-interface {v6, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 325
    .line 326
    .line 327
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    goto :goto_a

    .line 329
    :catchall_0
    move v5, v3

    .line 330
    :goto_a
    const/16 v6, 0x64

    .line 331
    .line 332
    invoke-static {v5, v3, v6}, Lj81;->μ(III)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-nez v5, :cond_c

    .line 337
    .line 338
    const-string v5, "\u4ec5\u514d\u8d39"

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_c
    const-string v6, "\u6700\u591a "

    .line 342
    .line 343
    const-string v7, " \u706b\u661f"

    .line 344
    .line 345
    invoke-static {v6, v5, v7}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    :goto_b
    new-instance v6, Ljt1;

    .line 350
    .line 351
    const/16 v7, 0xd

    .line 352
    .line 353
    invoke-direct {v6, p1, v7}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 354
    .line 355
    .line 356
    const-string v7, "\u5355\u6b21\u6295\u5582\u4ef7\u683c\u4e0a\u9650"

    .line 357
    .line 358
    const-string v8, "0 \u8868\u793a\u53ea\u6295\u5582\u514d\u8d39\u98df\u7269\uff1b\u5b9e\u65f6\u4ef7\u683c\u8d85\u8fc7\u4e0a\u9650\u65f6\u5199\u660e\u539f\u56e0\u5e76\u8df3\u8fc7"

    .line 359
    .line 360
    invoke-static {p1, v7, v5, v8, v6}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 365
    .line 366
    .line 367
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 372
    .line 373
    .line 374
    invoke-static {}, Lgf1;->γ()Lef1;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    iget-object v5, v5, Lef1;->α:Ljava/util/List;

    .line 379
    .line 380
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-lez v5, :cond_d

    .line 385
    .line 386
    const-string v6, " \u79cd"

    .line 387
    .line 388
    invoke-static {v6, v5}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    goto :goto_c

    .line 393
    :cond_d
    const-string v6, "\u672a\u7f13\u5b58"

    .line 394
    .line 395
    :goto_c
    new-instance v7, Ljt1;

    .line 396
    .line 397
    const/16 v8, 0xe

    .line 398
    .line 399
    invoke-direct {v7, p1, v8}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 400
    .line 401
    .line 402
    const-string v8, "\u66f4\u65b0\u98df\u7269\u5217\u8868"

    .line 403
    .line 404
    const-string v12, "\u901a\u8fc7\u5bbf\u4e3b\u5237\u65b0\u5f53\u524d\u8d26\u53f7\u76ee\u5f55\uff1b\u5b9e\u9645\u6295\u5582\u4ecd\u4f1a\u518d\u6b21\u6821\u9a8c\u76ee\u6807\u4f1a\u8bdd\u4ef7\u683c"

    .line 405
    .line 406
    invoke-static {p1, v8, v6, v12, v7}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 411
    .line 412
    .line 413
    if-eqz v1, :cond_e

    .line 414
    .line 415
    if-nez v5, :cond_e

    .line 416
    .line 417
    new-instance v5, Leu1;

    .line 418
    .line 419
    const/16 v6, 0x10

    .line 420
    .line 421
    invoke-direct {v5, v6}, Leu1;-><init>(I)V

    .line 422
    .line 423
    .line 424
    invoke-static {p1, v9, v5}, Lpf1;->δ(Landroid/app/Activity;Lky1;La80;)V

    .line 425
    .line 426
    .line 427
    :cond_e
    invoke-static {p1, v2}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 436
    .line 437
    .line 438
    const-string v6, "pet_elf_auto_task_enabled"

    .line 439
    .line 440
    if-eqz v1, :cond_f

    .line 441
    .line 442
    invoke-static {v6, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    goto :goto_d

    .line 447
    :cond_f
    move v7, v3

    .line 448
    :goto_d
    new-instance v8, Lbl0;

    .line 449
    .line 450
    const/4 v9, 0x2

    .line 451
    invoke-direct {v8, p1, v5, p1, v9}, Lbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 452
    .line 453
    .line 454
    const-string v9, "\u6bcf\u65e5\u81ea\u52a8\u5b8c\u6210\u706b\u661f\u4efb\u52a1"

    .line 455
    .line 456
    const-string v12, "\u6bcf\u65e5\u6309\u89e6\u53d1\u65f6\u95f4\u5b8c\u6210\u5df2\u542f\u7528\u4efb\u52a1\uff0c\u5b8c\u6210\u540e\u81ea\u52a8\u68c0\u67e5\u5e76\u9886\u53d6"

    .line 457
    .line 458
    invoke-static {p1, v9, v12, v7, v8}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 463
    .line 464
    .line 465
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 470
    .line 471
    .line 472
    if-eqz v1, :cond_10

    .line 473
    .line 474
    const-string v7, "pet_elf_auto_mutual_message_enabled"

    .line 475
    .line 476
    invoke-static {v7, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    goto :goto_e

    .line 481
    :cond_10
    move v2, v3

    .line 482
    :goto_e
    new-instance v7, Lct1;

    .line 483
    .line 484
    const/16 v8, 0x14

    .line 485
    .line 486
    invoke-direct {v7, p1, v8}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 487
    .line 488
    .line 489
    const-string v8, "\u81ea\u52a8\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 490
    .line 491
    const-string v9, "\u4e25\u683c\u5339\u914d\u540c\u65f6\u5305\u542b\u201c\u4e92\u53d1\u201d\u201c\u6d88\u606f\u201d\u4e14\u4e0d\u542b\u201c\u591a\u95ea\u201d\u7684\u4efb\u52a1"

    .line 492
    .line 493
    invoke-static {p1, v8, v9, v2, v7}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 498
    .line 499
    .line 500
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 505
    .line 506
    .line 507
    const-string v2, "pet_elf_mutual_message"

    .line 508
    .line 509
    const-string v7, "\u706b\u661f\u4efb\u52a1"

    .line 510
    .line 511
    invoke-static {v2, v7}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const/16 v7, 0xf

    .line 516
    .line 517
    invoke-static {v2, v7}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    new-instance v8, Ljt1;

    .line 522
    .line 523
    const/16 v9, 0x9

    .line 524
    .line 525
    invoke-direct {v8, p1, v9}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 526
    .line 527
    .line 528
    const-string v9, "\u4e92\u53d1\u6d88\u606f\u9ed8\u8ba4\u5185\u5bb9"

    .line 529
    .line 530
    const-string v12, "\u6240\u6709\u4eba\u5458\u9ed8\u8ba4\u4f7f\u7528\uff1b\u53ef\u5728\u81ea\u5b9a\u4e49\u4eba\u5458\u9875\u9762\u5355\u72ec\u8986\u76d6"

    .line 531
    .line 532
    invoke-static {p1, v9, v2, v12, v8}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-static {v5, v2, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 537
    .line 538
    .line 539
    if-eqz v1, :cond_11

    .line 540
    .line 541
    const-string v2, "pet_elf_auto_image_enabled"

    .line 542
    .line 543
    invoke-static {v2, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    goto :goto_f

    .line 548
    :cond_11
    move v2, v3

    .line 549
    :goto_f
    new-instance v8, Lgu1;

    .line 550
    .line 551
    const/4 v9, 0x0

    .line 552
    invoke-direct {v8, p1, p1, v9}, Lgu1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 553
    .line 554
    .line 555
    const-string v9, "\u81ea\u52a8\u53d1\u9001\u56fe\u7247\u4efb\u52a1"

    .line 556
    .line 557
    const-string v12, "\u547d\u4e2d\u8fdb\u884c\u4e2d\u7684\u56fe\u7247\u4efb\u52a1\u65f6\u53d1\u9001\u8bbe\u7f6e\u4e2d\u9009\u62e9\u7684\u56fe\u7247"

    .line 558
    .line 559
    invoke-static {p1, v9, v12, v2, v8}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 567
    .line 568
    .line 569
    move-result v8

    .line 570
    invoke-static {v3, v8}, Lj81;->Σ(II)Lxm0;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    new-instance v9, Ljava/util/ArrayList;

    .line 575
    .line 576
    invoke-static {v8, v11}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v8}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 584
    .line 585
    .line 586
    move-result-object v8

    .line 587
    :goto_10
    move-object v11, v8

    .line 588
    check-cast v11, Lwm0;

    .line 589
    .line 590
    iget-boolean v12, v11, Lwm0;->η:Z

    .line 591
    .line 592
    if-eqz v12, :cond_12

    .line 593
    .line 594
    invoke-virtual {v11}, Lwm0;->nextInt()I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 599
    .line 600
    .line 601
    move-result-object v11

    .line 602
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    goto :goto_10

    .line 606
    :cond_12
    new-instance v2, Ljava/util/ArrayList;

    .line 607
    .line 608
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    :cond_13
    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 616
    .line 617
    .line 618
    move-result v9

    .line 619
    if-eqz v9, :cond_14

    .line 620
    .line 621
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v9

    .line 625
    instance-of v11, v9, Landroid/widget/Switch;

    .line 626
    .line 627
    if-eqz v11, :cond_13

    .line 628
    .line 629
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    goto :goto_11

    .line 633
    :cond_14
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Landroid/widget/Switch;

    .line 638
    .line 639
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 644
    .line 645
    .line 646
    const-string v8, "pet_elf_task_image_name"

    .line 647
    .line 648
    invoke-static {v8, v10}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v8

    .line 652
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    if-eqz v9, :cond_15

    .line 657
    .line 658
    const-string v8, "\u672a\u9009\u62e9"

    .line 659
    .line 660
    :cond_15
    const/16 v9, 0x20

    .line 661
    .line 662
    invoke-static {v8, v9}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    new-instance v9, Lqh1;

    .line 667
    .line 668
    const/4 v10, 0x6

    .line 669
    invoke-direct {v9, p1, v10, v2}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    const-string v2, "\u81ea\u52a8\u4efb\u52a1\u56fe\u7247"

    .line 673
    .line 674
    const-string v10, "\u901a\u8fc7\u7cfb\u7edf SAF \u9009\u62e9\uff1b\u6240\u6709\u542f\u7528\u56fe\u7247\u4efb\u52a1\u7684\u4eba\u5458\u5171\u7528"

    .line 675
    .line 676
    invoke-static {p1, v2, v8, v10, v9}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 681
    .line 682
    .line 683
    if-eqz v1, :cond_16

    .line 684
    .line 685
    invoke-static {v6, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_16

    .line 690
    .line 691
    move v1, v3

    .line 692
    goto :goto_12

    .line 693
    :cond_16
    const/16 v1, 0x8

    .line 694
    .line 695
    :goto_12
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 699
    .line 700
    .line 701
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 706
    .line 707
    .line 708
    if-eqz v0, :cond_17

    .line 709
    .line 710
    const-string v1, "spark_include_group_chat"

    .line 711
    .line 712
    invoke-static {v1, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    goto :goto_13

    .line 717
    :cond_17
    move v1, v3

    .line 718
    :goto_13
    new-instance v2, Lct1;

    .line 719
    .line 720
    const/16 v5, 0x15

    .line 721
    .line 722
    invoke-direct {v2, p1, v5}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 723
    .line 724
    .line 725
    const-string v5, "\u5305\u542b\u7fa4\u804a\u706b\u82b1"

    .line 726
    .line 727
    const-string v6, "\u5f00\u542f\u540e\u4f1a\u8bc6\u522b\u5e76\u7eed\u671f\u7fa4\u804a\u706b\u82b1\uff1b\u9ed8\u8ba4\u53ea\u5904\u7406\u5355\u804a"

    .line 728
    .line 729
    invoke-static {p1, v5, v6, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 734
    .line 735
    .line 736
    const/4 v1, -0x1

    .line 737
    if-eqz v0, :cond_18

    .line 738
    .line 739
    const-string v2, "spark_auto_renew_trigger_hour"

    .line 740
    .line 741
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    invoke-interface {v5, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 746
    .line 747
    .line 748
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 749
    :catchall_1
    :cond_18
    if-gez v1, :cond_19

    .line 750
    .line 751
    const-string v1, "\u65e5\u671f\u5207\u6362\u65f6\u89e6\u53d1"

    .line 752
    .line 753
    goto :goto_14

    .line 754
    :cond_19
    const-string v2, "\u6bcf\u65e5 "

    .line 755
    .line 756
    const-string v5, ":00 \u540e\u89e6\u53d1"

    .line 757
    .line 758
    invoke-static {v2, v1, v5}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    :goto_14
    new-instance v2, Ljt1;

    .line 763
    .line 764
    const/16 v5, 0xa

    .line 765
    .line 766
    invoke-direct {v2, p1, v5}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 767
    .line 768
    .line 769
    const-string v5, "\u89e6\u53d1\u65f6\u95f4\u8bbe\u7f6e"

    .line 770
    .line 771
    const-string v6, "\u8bbe\u4e3a -1 = \u65e5\u671f\u5207\u6362\u65f6\u89e6\u53d1\uff1b0~23 = \u6307\u5b9a\u5c0f\u65f6\u540e\u89e6\u53d1"

    .line 772
    .line 773
    invoke-static {p1, v5, v1, v6, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 778
    .line 779
    .line 780
    if-eqz v0, :cond_1a

    .line 781
    .line 782
    const-string v1, "spark_auto_renew_delay_seconds"

    .line 783
    .line 784
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    invoke-interface {v2, v1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 789
    .line 790
    .line 791
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 792
    goto :goto_15

    .line 793
    :catchall_2
    :cond_1a
    move v1, v7

    .line 794
    :goto_15
    const-string v2, "s"

    .line 795
    .line 796
    invoke-static {v2, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    new-instance v5, Lht1;

    .line 801
    .line 802
    const/4 v6, 0x4

    .line 803
    invoke-direct {v5, p1, v1, v6}, Lht1;-><init>(Landroid/app/Activity;II)V

    .line 804
    .line 805
    .line 806
    const-string v1, "\u706b\u82b1/\u706b\u661f\u542f\u52a8\u5ef6\u8fdf"

    .line 807
    .line 808
    const-string v6, "\u6253\u5f00\u6296\u97f3\u540e\u7b49\u5f85\u591a\u5c11\u79d2\u518d\u6267\u884c\u706b\u82b1\u7eed\u671f\u548c\u6bcf\u65e5\u706b\u661f\u4efb\u52a1"

    .line 809
    .line 810
    invoke-static {p1, v1, v2, v6, v5}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 815
    .line 816
    .line 817
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 822
    .line 823
    .line 824
    const-string v1, "spark_message"

    .line 825
    .line 826
    const-string v2, "\u706b\u82b1"

    .line 827
    .line 828
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-static {v1, v7}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    new-instance v2, Ljt1;

    .line 837
    .line 838
    const/16 v5, 0xb

    .line 839
    .line 840
    invoke-direct {v2, p1, v5}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 841
    .line 842
    .line 843
    const-string v5, "\u7eed\u671f\u6d88\u606f\u5185\u5bb9"

    .line 844
    .line 845
    const-string v6, "\u81ea\u52a8\u53d1\u9001\u7684\u6d88\u606f\u6587\u672c"

    .line 846
    .line 847
    invoke-static {p1, v5, v1, v6, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 852
    .line 853
    .line 854
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 859
    .line 860
    .line 861
    const-string v1, "spark_message_source"

    .line 862
    .line 863
    const-string v2, "custom"

    .line 864
    .line 865
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    sget-object v2, Lkn0;->η:[Ljava/lang/String;

    .line 870
    .line 871
    invoke-static {v2, v1}, Lg7;->е([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 872
    .line 873
    .line 874
    move-result v1

    .line 875
    sget-object v2, Lkn0;->ζ:[Ljava/lang/String;

    .line 876
    .line 877
    if-ltz v1, :cond_1b

    .line 878
    .line 879
    const/4 v5, 0x3

    .line 880
    if-ge v1, v5, :cond_1b

    .line 881
    .line 882
    aget-object v1, v2, v1

    .line 883
    .line 884
    goto :goto_16

    .line 885
    :cond_1b
    invoke-static {v2}, Lg7;->а([Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    check-cast v1, Ljava/lang/String;

    .line 890
    .line 891
    :goto_16
    new-instance v2, Ljt1;

    .line 892
    .line 893
    const/16 v5, 0xc

    .line 894
    .line 895
    invoke-direct {v2, p1, v5}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 896
    .line 897
    .line 898
    const-string v5, "\u7eed\u671f\u6d88\u606f\u6765\u6e90"

    .line 899
    .line 900
    const-string v6, "\u53ef\u9009\u62e9\u56fa\u5b9a\u6587\u672c\u3001\u4e00\u8a00\u6216\u4eca\u65e5\u8bd7\u8bcd\uff1bAPI \u5931\u8d25\u65f6\u56de\u9000\u56fa\u5b9a\u6587\u672c"

    .line 901
    .line 902
    invoke-static {p1, v5, v1, v6, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 907
    .line 908
    .line 909
    if-eqz v0, :cond_1c

    .line 910
    .line 911
    const-string v1, "spark_custom_renew_enabled"

    .line 912
    .line 913
    invoke-static {v1, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    goto :goto_17

    .line 918
    :cond_1c
    move v1, v3

    .line 919
    :goto_17
    new-instance v2, Lct1;

    .line 920
    .line 921
    const/16 v5, 0x16

    .line 922
    .line 923
    invoke-direct {v2, p1, v5}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 924
    .line 925
    .line 926
    const-string v5, "\u542f\u7528\u81ea\u5b9a\u4e49\u4eba\u5458\u7eed\u706b"

    .line 927
    .line 928
    const-string v6, "\u89c4\u5219\u5185\u4eba\u5458\u4f1a\u53c2\u4e0e\u7eed\u706b\uff1b\u5373\u4f7f\u5f53\u524d\u4e0d\u662f\u5f85\u7eed\u72b6\u6001\u4e5f\u53ef\u53d1\u9001"

    .line 929
    .line 930
    invoke-static {p1, v5, v6, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 935
    .line 936
    .line 937
    if-eqz v0, :cond_1d

    .line 938
    .line 939
    const-string v0, "spark_fake_days_enabled"

    .line 940
    .line 941
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 942
    .line 943
    .line 944
    move-result v3

    .line 945
    :cond_1d
    new-instance v0, Lct1;

    .line 946
    .line 947
    const/16 v1, 0x17

    .line 948
    .line 949
    invoke-direct {v0, p1, v1}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 950
    .line 951
    .line 952
    const-string v1, "\u4f2a\u88c5\u706b\u82b1\u5929\u6570"

    .line 953
    .line 954
    const-string v2, "\u5f00\u542f\u540e\u53ef\u5728\u4eba\u5458\u5217\u8868\u4e2d\u70b9\u51fb\u4eba\u5458\uff0c\u4e3a\u5355\u4e2a\u4f1a\u8bdd\u8bbe\u7f6e\u672c\u5730\u663e\u793a\u7684\u706b\u82b1\u5929\u6570"

    .line 955
    .line 956
    invoke-static {p1, v1, v2, v3, v0}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 961
    .line 962
    .line 963
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 968
    .line 969
    .line 970
    new-instance v0, Let1;

    .line 971
    .line 972
    const/4 v1, 0x2

    .line 973
    invoke-direct {v0, p1, p1, v1}, Let1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 974
    .line 975
    .line 976
    const-string v1, "\u81ea\u5b9a\u4e49\u7eed\u706b\u4eba\u5458"

    .line 977
    .line 978
    const-string v2, "\u6253\u5f00\u7ba1\u7406"

    .line 979
    .line 980
    const-string v3, "\u70b9\u51fb\u4eba\u5458\u8bbe\u7f6e\u4e13\u5c5e\u6d88\u606f\u3001\u706b\u661f\u4efb\u52a1\u548c\u4f2a\u88c5\u5929\u6570\uff0c\u957f\u6309\u4eba\u5458\u62d6\u62fd\u5206\u7ec4"

    .line 981
    .line 982
    invoke-static {p1, v1, v2, v3, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 983
    .line 984
    .line 985
    move-result-object p1

    .line 986
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 987
    .line 988
    .line 989
    invoke-static {p0, v4}, Lbv1;->ζ(Landroid/view/View;Z)V

    .line 990
    .line 991
    .line 992
    return-object p0
.end method

.method private final ι(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lbv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {}, Lx9;->ζ()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v1, "\u53e3\u888b\u8425\u5730\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {}, Lv81;->ι()Lqd;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Ld62;

    .line 44
    .line 45
    iget-boolean v3, v1, Lqd;->α:Z

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v4, Lod;->ε:Lod;

    .line 52
    .line 53
    const-string v5, "\u81ea\u52a8\u6536\u83dc"

    .line 54
    .line 55
    invoke-direct {v2, v4, v5, v3}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Ld62;

    .line 59
    .line 60
    iget-boolean v4, v1, Lqd;->β:Z

    .line 61
    .line 62
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    sget-object v5, Lod;->ζ:Lod;

    .line 67
    .line 68
    const-string v6, "\u81ea\u52a8\u79cd\u5730"

    .line 69
    .line 70
    invoke-direct {v3, v5, v6, v4}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Ld62;

    .line 74
    .line 75
    iget-boolean v1, v1, Lqd;->γ:Z

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v5, Lod;->η:Lod;

    .line 82
    .line 83
    const-string v6, "\u81ea\u52a8\u6d47\u6c34"

    .line 84
    .line 85
    invoke-direct {v4, v5, v6, v1}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    filled-new-array {v2, v3, v4}, [Ld62;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x1

    .line 105
    const/4 v4, 0x0

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ld62;

    .line 113
    .line 114
    iget-object v5, v2, Ld62;->ε:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, Lod;

    .line 117
    .line 118
    iget-object v6, v2, Ld62;->ζ:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v2, v2, Ld62;->η:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    sget-object v7, Lbv1;->α:Lbv1;

    .line 131
    .line 132
    if-eqz v0, :cond_1

    .line 133
    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    move v4, v3

    .line 137
    :cond_1
    new-instance v2, Lbl0;

    .line 138
    .line 139
    invoke-direct {v2, p1, v5, p1, v3}, Lbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    const-string v3, "\u8fdb\u5165\u6296\u97f3\u540e\u5728\u540e\u53f0\u6267\u884c\uff1b\u4eba\u5458\u8986\u76d6\u89c4\u5219\u53ef\u5728\u8425\u5730\u7ba1\u7406\u4e2d\u8c03\u6574"

    .line 143
    .line 144
    invoke-static {p1, v6, v3, v4, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {p0, v2, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_2
    if-eqz v0, :cond_3

    .line 153
    .line 154
    const-string v1, "\u7ba1\u7406\u4eba\u5458\u89c4\u5219\u4e0e\u56fa\u5b9a\u79cd\u5b50"

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    const-string v1, "\u5df2\u9501\u5b9a \u00b7 \u4ec5\u9650\u5185\u6d4b\u7528\u6237"

    .line 158
    .line 159
    :goto_1
    new-instance v2, Lg71;

    .line 160
    .line 161
    const/16 v5, 0x1b

    .line 162
    .line 163
    invoke-direct {v2, p1, v5}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 164
    .line 165
    .line 166
    const-string v5, "\u8425\u5730\u7ba1\u7406"

    .line 167
    .line 168
    const-string v6, "\u67e5\u770b\u7f13\u5b58\u72b6\u6001\u3001\u5237\u65b0\u8425\u5730\u5e76\u6267\u884c\u6279\u91cf\u64cd\u4f5c"

    .line 169
    .line 170
    invoke-static {p1, v5, v1, v6, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 175
    .line 176
    .line 177
    const-string v1, "pet_elf_camp_start_delay_seconds"

    .line 178
    .line 179
    const/4 v2, 0x5

    .line 180
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-interface {v5, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 185
    .line 186
    .line 187
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :catchall_0
    const/16 v1, 0x12c

    .line 189
    .line 190
    invoke-static {v2, v4, v1}, Lj81;->μ(III)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    const-string v2, " \u79d2\u540e"

    .line 195
    .line 196
    invoke-static {v2, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    new-instance v5, Lht1;

    .line 201
    .line 202
    invoke-direct {v5, p1, v1, v4}, Lht1;-><init>(Landroid/app/Activity;II)V

    .line 203
    .line 204
    .line 205
    const-string v1, "\u8fdb\u5165\u6296\u97f3\u540e\u6267\u884c"

    .line 206
    .line 207
    const-string v6, "\u4ec5\u63a7\u5236\u8425\u5730\u540e\u53f0\u4efb\u52a1\uff0c\u4e0d\u5f71\u54cd\u706b\u82b1\u7eed\u671f\u548c\u706b\u661f\u4efb\u52a1"

    .line 208
    .line 209
    invoke-static {p1, v1, v2, v6, v5}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 214
    .line 215
    .line 216
    const-string v1, "pet_elf_camp_daily_harvest_limit"

    .line 217
    .line 218
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-interface {v2, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 223
    .line 224
    .line 225
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 226
    goto :goto_2

    .line 227
    :catchall_1
    move v1, v4

    .line 228
    :goto_2
    const/16 v2, 0x64

    .line 229
    .line 230
    invoke-static {v1, v4, v2}, Lj81;->μ(III)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const-string v5, " \u6b21"

    .line 235
    .line 236
    const-string v6, "\u4e0d\u9650\u5236"

    .line 237
    .line 238
    if-nez v1, :cond_4

    .line 239
    .line 240
    move-object v7, v6

    .line 241
    goto :goto_3

    .line 242
    :cond_4
    invoke-static {v5, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    :goto_3
    new-instance v8, Lht1;

    .line 247
    .line 248
    invoke-direct {v8, p1, v1, v3}, Lht1;-><init>(Landroid/app/Activity;II)V

    .line 249
    .line 250
    .line 251
    const-string v1, "\u6bcf\u65e5\u6536\u83b7\u9650\u989d"

    .line 252
    .line 253
    const-string v3, "0 \u8868\u793a\u4e0d\u9650\u5236\uff1b\u8fbe\u5230\u975e\u96f6\u9650\u989d\u540e\u5f53\u5929\u505c\u6b62\u81ea\u52a8\u6536\u83b7"

    .line 254
    .line 255
    invoke-static {p1, v1, v7, v3, v8}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 260
    .line 261
    .line 262
    const-string v1, "pet_elf_camp_daily_plant_limit"

    .line 263
    .line 264
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-interface {v3, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 269
    .line 270
    .line 271
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 272
    goto :goto_4

    .line 273
    :catchall_2
    move v1, v4

    .line 274
    :goto_4
    invoke-static {v1, v4, v2}, Lj81;->μ(III)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-nez v1, :cond_5

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_5
    invoke-static {v5, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    :goto_5
    new-instance v2, Lht1;

    .line 286
    .line 287
    const/4 v3, 0x2

    .line 288
    invoke-direct {v2, p1, v1, v3}, Lht1;-><init>(Landroid/app/Activity;II)V

    .line 289
    .line 290
    .line 291
    const-string v1, "\u6bcf\u65e5\u79cd\u690d\u9650\u989d"

    .line 292
    .line 293
    const-string v3, "0 \u8868\u793a\u4e0d\u9650\u5236\uff1b\u8fbe\u5230\u975e\u96f6\u9650\u989d\u540e\u5f53\u5929\u505c\u6b62\u81ea\u52a8\u79cd\u690d"

    .line 294
    .line 295
    invoke-static {p1, v1, v6, v3, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {p0, v1, p1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 300
    .line 301
    .line 302
    const-string v1, "pet_elf_camp_operation_interval_seconds"

    .line 303
    .line 304
    const/4 v2, 0x3

    .line 305
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 310
    .line 311
    .line 312
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 313
    goto :goto_6

    .line 314
    :catchall_3
    move v1, v2

    .line 315
    :goto_6
    const/16 v3, 0x3c

    .line 316
    .line 317
    invoke-static {v1, v4, v3}, Lj81;->μ(III)I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    const-string v3, " \u79d2"

    .line 322
    .line 323
    invoke-static {v3, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    new-instance v4, Lht1;

    .line 328
    .line 329
    invoke-direct {v4, p1, v1, v2}, Lht1;-><init>(Landroid/app/Activity;II)V

    .line 330
    .line 331
    .line 332
    const-string v1, "\u8425\u5730\u64cd\u4f5c\u95f4\u9694"

    .line 333
    .line 334
    const-string v2, "\u540c\u4e00\u4f1a\u8bdd\u4e24\u6b21\u5199\u64cd\u4f5c\u7684\u95f4\u9694\uff1b\u4e0d\u540c\u4f1a\u8bdd\u53ef\u5e76\u884c"

    .line 335
    .line 336
    invoke-static {p1, v1, v3, v2, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 341
    .line 342
    .line 343
    invoke-static {p0, v0}, Lbv1;->ζ(Landroid/view/View;Z)V

    .line 344
    .line 345
    .line 346
    return-object p0
.end method

.method private final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lbv1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-wide/32 v0, 0xb0d53cf

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lu90;->δ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, " MB"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-wide/32 v2, 0x21887000

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lu90;->δ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p1}, Lu90;->ε(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const-string v2, "\u5df2\u4e0b\u8f7d"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string v2, "\u672a\u4e0b\u8f7d"

    .line 51
    .line 52
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v4, "\u4e0b\u8f7d "

    .line 55
    .line 56
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, "\uff0c\u89e3\u538b\u540e\u5360\u7528 "

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Let1;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-direct {v1, p1, p1, v3}, Let1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 78
    .line 79
    .line 80
    const-string v3, "\u56fd\u5916\u5730\u533a\u6570\u636e\u5e93"

    .line 81
    .line 82
    invoke-static {p1, v3, v2, v0, v1}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 99
    .line 100
    .line 101
    const-string v1, "DexKit \u7f13\u5b58"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    const/high16 v1, 0x41600000    # 14.0f

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lbv1;->α:Lbv1;

    .line 112
    .line 113
    sget-object v2, Lbv1;->δ:Lqu1;

    .line 114
    .line 115
    const-string v3, "theme"

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    iget-object v2, v2, Lqu1;->η:Ljava/lang/String;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    invoke-static {v2, v0, v4, v5}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 124
    .line 125
    .line 126
    const/16 v2, 0x10

    .line 127
    .line 128
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    const/16 v7, 0xd

    .line 133
    .line 134
    invoke-static {p1, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    const/16 v10, 0x8

    .line 143
    .line 144
    invoke-static {p1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {v0, v6, v8, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    new-instance v0, Lg71;

    .line 155
    .line 156
    const/16 v6, 0xe

    .line 157
    .line 158
    invoke-direct {v0, p1, v6}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 159
    .line 160
    .line 161
    const-string v6, "\u6e05\u9664 DexKit \u7f13\u5b58"

    .line 162
    .line 163
    const-string v8, "\u70b9\u51fb\u6e05\u9664"

    .line 164
    .line 165
    const-string v9, "\u6e05\u9664 DexKit \u65b9\u6cd5/\u7c7b/\u5b57\u6bb5\u67e5\u8be2\u7f13\u5b58\uff0c\u4e0b\u6b21\u542f\u52a8\u4f1a\u91cd\u65b0\u67e5\u8be2"

    .line 166
    .line 167
    invoke-static {p1, v6, v8, v9, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    new-instance v0, Landroid/widget/TextView;

    .line 182
    .line 183
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 184
    .line 185
    .line 186
    const-string v6, "\u65e5\u5fd7\u4e0e\u8bca\u65ad"

    .line 187
    .line 188
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 192
    .line 193
    .line 194
    sget-object v6, Lbv1;->δ:Lqu1;

    .line 195
    .line 196
    if-eqz v6, :cond_2

    .line 197
    .line 198
    iget-object v6, v6, Lqu1;->η:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v6, v0, v4, v5}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 201
    .line 202
    .line 203
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-static {p1, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    invoke-static {p1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-virtual {v0, v6, v9, v11, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Lg71;

    .line 226
    .line 227
    const/16 v6, 0xf

    .line 228
    .line 229
    invoke-direct {v0, p1, v6}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 230
    .line 231
    .line 232
    const-string v6, "\u67e5\u770b DyLog \u65e5\u5fd7"

    .line 233
    .line 234
    const-string v9, "\u70b9\u51fb\u67e5\u770b"

    .line 235
    .line 236
    const-string v11, "\u67e5\u770b DyLog \u6536\u96c6\u7684\u5168\u90e8\u8fd0\u884c\u65e5\u5fd7\uff0c\u5e76\u53ef\u6309 TAG \u8fc7\u6ee4"

    .line 237
    .line 238
    invoke-static {p1, v6, v9, v11, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    new-instance v0, Landroid/widget/TextView;

    .line 253
    .line 254
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 255
    .line 256
    .line 257
    const-string v6, "\u7528\u6237\u914d\u7f6e\u6570\u636e"

    .line 258
    .line 259
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 263
    .line 264
    .line 265
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 266
    .line 267
    if-eqz v1, :cond_1

    .line 268
    .line 269
    iget-object v1, v1, Lqu1;->η:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v1, v0, v4, v5}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 272
    .line 273
    .line 274
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-static {p1, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-static {p1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, Lg71;

    .line 297
    .line 298
    invoke-direct {v0, p1, v2}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 299
    .line 300
    .line 301
    const-string v1, "\u5bfc\u51fa\u7528\u6237\u914d\u7f6e"

    .line 302
    .line 303
    const-string v2, "\u4fdd\u5b58\u5230\u6587\u4ef6"

    .line 304
    .line 305
    const-string v3, "\u5bfc\u51fa\u5df2\u8bbe\u7f6e\u7684\u9009\u9879\u3001\u8d26\u53f7\u914d\u7f6e\u3001\u706b\u82b1\u8bb0\u5f55\u3001\u5185\u6d4b\u72b6\u6001\u7b49 DYHelper \u7528\u6237\u914d\u7f6e"

    .line 306
    .line 307
    invoke-static {p1, v1, v2, v3, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 319
    .line 320
    .line 321
    new-instance v0, Lg71;

    .line 322
    .line 323
    const/16 v1, 0x11

    .line 324
    .line 325
    invoke-direct {v0, p1, v1}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 326
    .line 327
    .line 328
    const-string v1, "\u5bfc\u5165\u7528\u6237\u914d\u7f6e"

    .line 329
    .line 330
    const-string v2, "\u4ece\u6587\u4ef6\u6062\u590d"

    .line 331
    .line 332
    const-string v3, "\u4ece\u5bfc\u51fa\u7684 JSON \u6587\u4ef6\u6062\u590d\u914d\u7f6e\uff1b\u4f1a\u8986\u76d6\u5907\u4efd\u5185\u5305\u542b\u7684\u540c\u540d\u914d\u7f6e\u6587\u4ef6"

    .line 333
    .line 334
    invoke-static {p1, v1, v2, v3, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 339
    .line 340
    .line 341
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 346
    .line 347
    .line 348
    new-instance v0, Lg71;

    .line 349
    .line 350
    const/16 v1, 0x12

    .line 351
    .line 352
    invoke-direct {v0, p1, v1}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 353
    .line 354
    .line 355
    const-string v1, "\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e"

    .line 356
    .line 357
    const-string v2, "\u6e05\u9664\u5168\u5c40\u914d\u7f6e\u3001\u5f53\u524d\u8d26\u53f7\u3001\u5176\u4ed6\u8d26\u53f7\u3001\u5143\u6570\u636e\u3001\u5185\u6d4b\u72b6\u6001\u6587\u4ef6\u7b49\u5168\u90e8 DYHelper \u7528\u6237\u914d\u7f6e"

    .line 358
    .line 359
    invoke-static {p1, v1, v8, v2, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 364
    .line 365
    .line 366
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 371
    .line 372
    .line 373
    const-string v0, "\u6e05\u9664\u5168\u90e8\u7528\u6237\u914d\u7f6e\u540e\u5efa\u8bae\u91cd\u542f\u6296\u97f3\uff0c\u786e\u4fdd\u6240\u6709 Hook \u548c\u5185\u6d4b\u72b6\u6001\u91cd\u65b0\u8bfb\u53d6\u9ed8\u8ba4\u503c"

    .line 374
    .line 375
    invoke-static {p1, v0}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 380
    .line 381
    .line 382
    return-object p0

    .line 383
    :cond_1
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v4

    .line 387
    :cond_2
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v4

    .line 391
    :cond_3
    invoke-static {v3}, Lln0;->и(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v4
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ltu1;->ε:I

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/16 v3, 0x13

    .line 8
    .line 9
    const/4 v9, 0x5

    .line 10
    const/4 v10, 0x4

    .line 11
    const/4 v11, 0x3

    .line 12
    const/16 v12, 0x14

    .line 13
    .line 14
    const/16 v13, 0x19

    .line 15
    .line 16
    const/16 v14, 0x18

    .line 17
    .line 18
    const/16 v15, 0xd

    .line 19
    .line 20
    const-string v4, ""

    .line 21
    .line 22
    const/16 v5, 0xa

    .line 23
    .line 24
    const/16 v6, 0x64

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Landroid/app/Activity;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lbv1;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v0, Lbe0;->α:Lbe0;

    .line 46
    .line 47
    invoke-virtual {v0}, Lbe0;->δ()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lx9;->δ()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    new-instance v4, Lqm1;

    .line 59
    .line 60
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {v0}, Lbe0;->ξ()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const-string v6, "\u5f53\u524d\u8d26\u53f7\u5df2\u9690\u85cf "

    .line 74
    .line 75
    const-string v9, " \u4eba"

    .line 76
    .line 77
    invoke-static {v6, v5, v9}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    const-string v5, "\u5df2\u9501\u5b9a \u00b7 \u4ec5\u9650\u5185\u6d4b\u7528\u6237"

    .line 83
    .line 84
    :goto_0
    invoke-static {v1, v5}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const-string v6, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    const-string v9, "\u5173\u6ce8\u3001\u7c89\u4e1d\u3001\u6d88\u606f\u3001\u641c\u7d22\u548c\u89c6\u9891\u5206\u4eab"

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v9, v6

    .line 96
    :goto_1
    invoke-virtual {v0}, Lbe0;->ζ()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    new-instance v10, Lkt1;

    .line 101
    .line 102
    invoke-direct {v10, v4, v1, v8}, Lkt1;-><init>(Lqm1;Landroid/app/Activity;I)V

    .line 103
    .line 104
    .line 105
    const-string v11, "\u542f\u7528\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 106
    .line 107
    invoke-static {v1, v11, v9, v0, v10}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v3, v0, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 112
    .line 113
    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    const-string v6, "\u5728\u64cd\u4f5c\u9762\u677f\u663e\u793a\u4e34\u65f6\u663e\u793a/\u6062\u590d\u6309\u94ae\uff1b\u9000\u51fa\u6296\u97f3\u540e\u6309\u603b\u5f00\u5173\u6062\u590d\u9690\u85cf"

    .line 117
    .line 118
    :cond_2
    const-string v0, "hidden_contact_operation_toggle_enabled"

    .line 119
    .line 120
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    new-instance v2, Lkt1;

    .line 125
    .line 126
    invoke-direct {v2, v4, v1, v7}, Lkt1;-><init>(Lqm1;Landroid/app/Activity;I)V

    .line 127
    .line 128
    .line 129
    const-string v4, "\u64cd\u4f5c\u9762\u677f\u4e34\u65f6\u663e\u793a\u6309\u94ae"

    .line 130
    .line 131
    invoke-static {v1, v4, v6, v0, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v3, v0, v1}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 136
    .line 137
    .line 138
    const-string v0, "hidden_contact_peek_duration_seconds"

    .line 139
    .line 140
    const/16 v2, 0x1e

    .line 141
    .line 142
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-interface {v4, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    :catchall_0
    const-string v0, " \u79d2"

    .line 151
    .line 152
    invoke-static {v0, v2}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    new-instance v2, Ljt1;

    .line 157
    .line 158
    invoke-direct {v2, v1, v7}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 159
    .line 160
    .line 161
    const-string v4, "\u53cc\u51fb\u663e\u793a\u65f6\u957f"

    .line 162
    .line 163
    const-string v6, "\u53cc\u51fb\u6d88\u606f\u9875\u9876\u90e8\"\u6d88\u606f\"\u6587\u5b57\u540e\u4e34\u65f6\u663e\u793a\u8054\u7cfb\u4eba\u7684\u6301\u7eed\u65f6\u957f\uff085~300 \u79d2\uff09"

    .line 164
    .line 165
    invoke-static {v1, v4, v0, v6, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    new-instance v0, Lq61;

    .line 180
    .line 181
    invoke-direct {v0, v1, v5, v7}, Lq61;-><init>(Landroid/app/Activity;Landroid/widget/TextView;I)V

    .line 182
    .line 183
    .line 184
    const-string v2, "\u8054\u7cfb\u4eba\u83dc\u5355"

    .line 185
    .line 186
    const-string v4, "\u6253\u5f00"

    .line 187
    .line 188
    const-string v6, "\u6dfb\u52a0\u8054\u7cfb\u4eba\u3001\u641c\u7d22\u548c\u7ba1\u7406\u9690\u85cf\u540d\u5355"

    .line 189
    .line 190
    invoke-static {v1, v2, v4, v6, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 205
    .line 206
    .line 207
    return-object v3

    .line 208
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Ltu1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Ltu1;->ι(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Ltu1;->θ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0

    .line 223
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Ltu1;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :pswitch_4
    move-object/from16 v1, p1

    .line 229
    .line 230
    check-cast v1, Landroid/app/Activity;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Lbv1;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const-string v5, "download_path_template"

    .line 247
    .line 248
    invoke-static {v5, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-eqz v5, :cond_3

    .line 257
    .line 258
    const-string v4, "\u7cfb\u7edf\u9ed8\u8ba4\u76ee\u5f55"

    .line 259
    .line 260
    :cond_3
    new-instance v5, Lg71;

    .line 261
    .line 262
    invoke-direct {v5, v1, v3}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 263
    .line 264
    .line 265
    const-string v3, "\u4e0b\u8f7d\u8def\u5f84\u8bbe\u7f6e"

    .line 266
    .line 267
    const-string v6, "\u7edf\u4e00\u914d\u7f6e\u89c6\u9891\u3001\u56fe\u7247\u3001\u52a8\u56fe\u3001LivePhoto\u3001\u97f3\u4e50\u3001\u8bc4\u8bba\u56fe\u7247\u3001\u8bc4\u8bba\u8bed\u97f3\u548c\u8868\u60c5\u5305"

    .line 268
    .line 269
    invoke-static {v1, v3, v4, v6, v5}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 281
    .line 282
    .line 283
    const-string v3, "comment_emoji_convert_format_enabled"

    .line 284
    .line 285
    invoke-static {v3, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    new-instance v4, Loq1;

    .line 290
    .line 291
    invoke-direct {v4, v2}, Loq1;-><init>(I)V

    .line 292
    .line 293
    .line 294
    const-string v2, "\u8868\u60c5\u5305\u81ea\u52a8\u8f6c\u6362\u683c\u5f0f"

    .line 295
    .line 296
    const-string v5, "\u9ed8\u8ba4\u5f00\u542f\uff1a\u52a8\u753b WebP \u4e0b\u8f7d\u540e\u9010\u5e27\u8f6c\u6362\u4e3a GIF\uff0c\u9759\u6001\u8868\u60c5\u8f6c\u6362\u4e3a PNG"

    .line 297
    .line 298
    invoke-static {v1, v2, v5, v3, v4}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    const-string v2, "live_photo_merge_after_download"

    .line 313
    .line 314
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    new-instance v3, Loq1;

    .line 319
    .line 320
    invoke-direct {v3, v15}, Loq1;-><init>(I)V

    .line 321
    .line 322
    .line 323
    const-string v4, "\u4e0b\u8f7d\u540e\u5408\u5e76\u52a8\u56fe"

    .line 324
    .line 325
    const-string v5, "LivePhoto \u4e0b\u8f7d\u65f6\u4f18\u5148\u8c03\u7528\u6296\u97f3\u5b98\u65b9\u4fdd\u5b58\u80fd\u529b\uff0c\u5931\u8d25\u540e\u518d\u4f7f\u7528 DYHelper \u517c\u5bb9\u5408\u5e76"

    .line 326
    .line 327
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Ltu1;->ζ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Ltu1;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Ltu1;->δ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    return-object v0

    .line 350
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Ltu1;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    return-object v0

    .line 355
    :pswitch_9
    move-object/from16 v2, p1

    .line 356
    .line 357
    check-cast v2, Landroid/app/Activity;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Lbv1;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-static {v2}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const-string v0, "profile_uid_show_enabled"

    .line 374
    .line 375
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    new-instance v6, Loq1;

    .line 380
    .line 381
    const/16 v0, 0x17

    .line 382
    .line 383
    invoke-direct {v6, v0}, Loq1;-><init>(I)V

    .line 384
    .line 385
    .line 386
    const-string v3, "\u663e\u793a\u7528\u6237 UID"

    .line 387
    .line 388
    const-string v4, "\u5728\u4e2a\u4eba\u4e3b\u9875\u201c\u6296\u97f3\u53f7\u201d\u4e0b\u65b9\u663e\u793a\u8be5\u7528\u6237\u7684\u6570\u5b57 UID\uff0c\u70b9\u51fb\u53ef\u590d\u5236"

    .line 389
    .line 390
    invoke-static/range {v1 .. v6}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v1, v2}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 394
    .line 395
    .line 396
    const-string v0, "profile_bookmark_hook_enabled"

    .line 397
    .line 398
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    new-instance v6, Loq1;

    .line 403
    .line 404
    invoke-direct {v6, v14}, Loq1;-><init>(I)V

    .line 405
    .line 406
    .line 407
    const-string v3, "\u542f\u7528\u4e3b\u9875\u4e66\u7b7e\u529f\u80fd"

    .line 408
    .line 409
    const-string v4, "\u63a7\u5236\u4e3b\u9875\u4e66\u7b7e Hook \u662f\u5426\u5b89\u88c5\uff1b\u5173\u95ed\u540e\u4e0d\u4f1a\u5728\u4e3b\u9875\u5904\u7406\u4e66\u7b7e\u903b\u8f91"

    .line 410
    .line 411
    invoke-static/range {v1 .. v6}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v1, v2}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 415
    .line 416
    .line 417
    const-string v0, "profile_bookmark_show_enabled"

    .line 418
    .line 419
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    new-instance v6, Loq1;

    .line 424
    .line 425
    invoke-direct {v6, v13}, Loq1;-><init>(I)V

    .line 426
    .line 427
    .line 428
    const-string v3, "\u663e\u793a\u4e2a\u4eba\u4e3b\u9875\u4e66\u7b7e\u6309\u94ae"

    .line 429
    .line 430
    const-string v4, "\u5728\u4e2a\u4eba\u4e3b\u9875\u6ce8\u5165\u300c\u6dfb\u52a0\u4e66\u7b7e\u300d\u6309\u94ae\uff0c\u65b9\u4fbf\u5feb\u901f\u8ba2\u9605\u8be5\u4f5c\u8005\u66f4\u65b0"

    .line 431
    .line 432
    invoke-static/range {v1 .. v6}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 433
    .line 434
    .line 435
    invoke-static {v1, v2}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 436
    .line 437
    .line 438
    const-string v0, "\u5173\u95ed\u201c\u542f\u7528\u4e3b\u9875\u4e66\u7b7e\u529f\u80fd\u201d\u540e\uff0c\u4e3b\u9875\u4e66\u7b7e\u903b\u8f91\u6574\u4f53\u4e0d\u5b89\u88c5"

    .line 439
    .line 440
    invoke-static {v1, v2, v0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    const-string v0, "\u4fee\u6539\u540e\u91cd\u65b0\u8fdb\u5165\u4e2a\u4eba\u4e3b\u9875\u751f\u6548"

    .line 444
    .line 445
    invoke-static {v1, v2, v0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    return-object v1

    .line 449
    :pswitch_a
    move-object/from16 v4, p1

    .line 450
    .line 451
    check-cast v4, Landroid/app/Activity;

    .line 452
    .line 453
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Lbv1;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-static {v4}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    const-string v0, "immersive_status_bar_enabled"

    .line 468
    .line 469
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    new-instance v14, Loq1;

    .line 474
    .line 475
    invoke-direct {v14, v12}, Loq1;-><init>(I)V

    .line 476
    .line 477
    .line 478
    const-string v11, "\u542f\u7528\u6c89\u6d78\u5f0f\u72b6\u6001\u680f"

    .line 479
    .line 480
    const-string v12, "\u9690\u85cf\u9876\u90e8\u7cfb\u7edf\u72b6\u6001\u680f\uff0c\u5305\u62ec\u65f6\u95f4\u3001\u7535\u91cf\u3001\u901a\u77e5\u56fe\u6807\u7b49"

    .line 481
    .line 482
    move-object v9, v3

    .line 483
    move-object v10, v4

    .line 484
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v3, v4}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 488
    .line 489
    .line 490
    const-string v0, "immersive_navigation_bar_enabled"

    .line 491
    .line 492
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 493
    .line 494
    .line 495
    move-result v7

    .line 496
    new-instance v8, Loq1;

    .line 497
    .line 498
    const/16 v0, 0x15

    .line 499
    .line 500
    invoke-direct {v8, v0}, Loq1;-><init>(I)V

    .line 501
    .line 502
    .line 503
    const-string v5, "\u540c\u65f6\u9690\u85cf\u5bfc\u822a\u680f/\u624b\u52bf\u6761"

    .line 504
    .line 505
    const-string v6, "\u9690\u85cf\u5e95\u90e8\u4e09\u952e\u5bfc\u822a\u680f\u6216\u5b89\u5353\u624b\u52bf\u5c0f\u767d\u6761\uff0c\u5b9e\u73b0\u66f4\u5b8c\u6574\u7684\u5168\u5c4f\u6c89\u6d78\u6548\u679c"

    .line 506
    .line 507
    invoke-static/range {v3 .. v8}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 508
    .line 509
    .line 510
    invoke-static {v3, v4}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 511
    .line 512
    .line 513
    const-string v0, "\u5f00\u542f\u201c\u6c89\u6d78\u5f0f\u72b6\u6001\u680f\u201d\u540e\uff0c\u5c06\u9690\u85cf\u9876\u90e8\u7cfb\u7edf\u72b6\u6001\u680f\u3002"

    .line 514
    .line 515
    invoke-static {v3, v4, v0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    const-string v0, "\u5f00\u542f\u201c\u540c\u65f6\u9690\u85cf\u5bfc\u822a\u680f/\u624b\u52bf\u6761\u201d\u540e\uff0c\u4f1a\u8fdb\u4e00\u6b65\u9690\u85cf\u5e95\u90e8\u5bfc\u822a\u680f\u6216\u5b89\u5353\u624b\u52bf\u6761\u3002"

    .line 519
    .line 520
    invoke-static {v3, v4, v0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    const-string v0, "\u63d0\u793a\uff1a\u4e0d\u4e00\u5b9a\u6210\u529f"

    .line 524
    .line 525
    invoke-static {v3, v4, v0}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    return-object v3

    .line 529
    :pswitch_b
    move-object/from16 v15, p1

    .line 530
    .line 531
    check-cast v15, Landroid/app/Activity;

    .line 532
    .line 533
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, Lbv1;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-static {v15}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-static {v15}, Li81;->τ(Landroid/content/Context;)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-nez v1, :cond_4

    .line 552
    .line 553
    const-string v0, "\u6e05\u723d\u6a21\u5f0f\u662f\u5185\u6d4b\u529f\u80fd\uff0c\u9700\u8981\u5185\u6d4b\u8d44\u683c\u624d\u80fd\u4f7f\u7528"

    .line 554
    .line 555
    invoke-static {v15, v0}, Lbv1;->η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    goto/16 :goto_5

    .line 560
    .line 561
    :cond_4
    const-string v1, "clean_mode_enabled"

    .line 562
    .line 563
    invoke-static {v1, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 564
    .line 565
    .line 566
    move-result v18

    .line 567
    new-instance v1, Lct1;

    .line 568
    .line 569
    invoke-direct {v1, v15, v14}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 570
    .line 571
    .line 572
    const-string v16, "\u542f\u7528\u6e05\u723d\u6a21\u5f0f"

    .line 573
    .line 574
    const-string v17, "\u8c03\u6574\u64ad\u653e\u9875\u9762\u63a7\u4ef6\u900f\u660e\u5ea6\uff0c\u6253\u9020\u6c89\u6d78\u5f0f\u89c2\u770b\u4f53\u9a8c"

    .line 575
    .line 576
    move-object v14, v0

    .line 577
    move-object/from16 v19, v1

    .line 578
    .line 579
    invoke-static/range {v14 .. v19}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 583
    .line 584
    .line 585
    const-string v0, "clean_right_panel_alpha"

    .line 586
    .line 587
    const/16 v1, 0x28

    .line 588
    .line 589
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 594
    .line 595
    .line 596
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 597
    goto :goto_2

    .line 598
    :catchall_1
    move v0, v1

    .line 599
    :goto_2
    invoke-static {v0, v8, v6}, Lj81;->μ(III)I

    .line 600
    .line 601
    .line 602
    move-result v23

    .line 603
    new-instance v0, Lkv0;

    .line 604
    .line 605
    invoke-direct {v0, v15, v11}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 606
    .line 607
    .line 608
    const-string v22, "\u53f3\u4fa7\u4e92\u52a8\u533a\u900f\u660e\u5ea6"

    .line 609
    .line 610
    const/16 v24, 0x64

    .line 611
    .line 612
    const/16 v25, 0x0

    .line 613
    .line 614
    const-string v26, "%"

    .line 615
    .line 616
    const-string v27, "\u63a7\u5236\u70b9\u8d5e\u3001\u8bc4\u8bba\u3001\u5206\u4eab\u3001\u5934\u50cf\u3001\u53f3\u4e0b\u89d2\u5531\u7247\u7b49\u63a7\u4ef6\u7684\u900f\u660e\u5ea6"

    .line 617
    .line 618
    move-object/from16 v28, v0

    .line 619
    .line 620
    move-object/from16 v21, v15

    .line 621
    .line 622
    invoke-static/range {v21 .. v28}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 630
    .line 631
    .line 632
    const-string v0, "clean_bottom_info_alpha"

    .line 633
    .line 634
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 639
    .line 640
    .line 641
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 642
    goto :goto_3

    .line 643
    :catchall_2
    move v0, v1

    .line 644
    :goto_3
    invoke-static {v0, v8, v6}, Lj81;->μ(III)I

    .line 645
    .line 646
    .line 647
    move-result v23

    .line 648
    new-instance v0, Lkv0;

    .line 649
    .line 650
    invoke-direct {v0, v15, v10}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 651
    .line 652
    .line 653
    const-string v22, "\u5e95\u90e8\u4fe1\u606f\u533a\u900f\u660e\u5ea6"

    .line 654
    .line 655
    const/16 v24, 0x64

    .line 656
    .line 657
    const/16 v25, 0x0

    .line 658
    .line 659
    const-string v26, "%"

    .line 660
    .line 661
    const-string v27, "\u63a7\u5236\u4f5c\u8005\u540d\u3001\u63cf\u8ff0\u6587\u6848\u3001\u97f3\u4e50\u4fe1\u606f\u7684\u900f\u660e\u5ea6"

    .line 662
    .line 663
    move-object/from16 v28, v0

    .line 664
    .line 665
    move-object/from16 v21, v15

    .line 666
    .line 667
    invoke-static/range {v21 .. v28}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 672
    .line 673
    .line 674
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 675
    .line 676
    .line 677
    const-string v0, "clean_top_bar_alpha"

    .line 678
    .line 679
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 684
    .line 685
    .line 686
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 687
    :catchall_3
    invoke-static {v1, v8, v6}, Lj81;->μ(III)I

    .line 688
    .line 689
    .line 690
    move-result v23

    .line 691
    new-instance v0, Lkv0;

    .line 692
    .line 693
    invoke-direct {v0, v15, v9}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 694
    .line 695
    .line 696
    const-string v22, "\u9876\u680f\u900f\u660e\u5ea6"

    .line 697
    .line 698
    const/16 v24, 0x64

    .line 699
    .line 700
    const/16 v25, 0x0

    .line 701
    .line 702
    const-string v26, "%"

    .line 703
    .line 704
    const-string v27, "\u63a7\u5236\u9996\u9875\u9876\u90e8\u6807\u9898\u680f / \u9876\u90e8 TAB \u533a\u57df\u900f\u660e\u5ea6"

    .line 705
    .line 706
    move-object/from16 v28, v0

    .line 707
    .line 708
    move-object/from16 v21, v15

    .line 709
    .line 710
    invoke-static/range {v21 .. v28}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 715
    .line 716
    .line 717
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 718
    .line 719
    .line 720
    new-instance v0, Lg71;

    .line 721
    .line 722
    invoke-direct {v0, v15, v5}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 723
    .line 724
    .line 725
    const-string v1, "\u6742\u9879\u63a7\u4ef6\u7ba1\u7406"

    .line 726
    .line 727
    const-string v2, "\u8fdb\u5165"

    .line 728
    .line 729
    const-string v3, "\u5206\u522b\u7ba1\u7406\u5e95\u680f\u6742\u9879\u3001\u5168\u5c4f\u89c2\u770b\u548c Feed \u5f39\u5e55\u6309\u94ae"

    .line 730
    .line 731
    invoke-static {v15, v1, v2, v3, v0}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 739
    .line 740
    .line 741
    const-string v0, "clean_auto_hide"

    .line 742
    .line 743
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 744
    .line 745
    .line 746
    move-result v18

    .line 747
    new-instance v0, Lct1;

    .line 748
    .line 749
    invoke-direct {v0, v15, v11}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 750
    .line 751
    .line 752
    const-string v16, "\u89c6\u9891\u6682\u505c\u663e\u793a\u63a7\u4ef6\u5f00\u5173"

    .line 753
    .line 754
    const-string v17, "\u6e05\u723d\u6a21\u5f0f\u5b50\u529f\u80fd\uff1a\u89c6\u9891\u6682\u505c\u65f6\u4e34\u65f6\u6062\u590d\u64ad\u653e\u9875\u63a7\u4ef6\u663e\u793a\uff0c\u7ee7\u7eed\u64ad\u653e\u540e\u6062\u590d\u6e05\u723d\u900f\u660e\u5ea6"

    .line 755
    .line 756
    move-object/from16 v19, v0

    .line 757
    .line 758
    invoke-static/range {v14 .. v19}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 759
    .line 760
    .line 761
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 762
    .line 763
    .line 764
    const-string v0, "clean_touch_restore_controls"

    .line 765
    .line 766
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 767
    .line 768
    .line 769
    move-result v18

    .line 770
    new-instance v0, Lct1;

    .line 771
    .line 772
    invoke-direct {v0, v15, v10}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 773
    .line 774
    .line 775
    const-string v16, "\u89e6\u63a7\u6062\u590d\u63a7\u4ef6\u663e\u793a"

    .line 776
    .line 777
    const-string v17, "\u89e6\u6478\u64ad\u653e\u9875\u65f6\u4e34\u65f6\u6062\u590d\u64ad\u653e\u9875\u63a7\u4ef6\u663e\u793a\uff0c\u677e\u624b\u540e\u6062\u590d\u6e05\u723d\u900f\u660e\u5ea6"

    .line 778
    .line 779
    move-object/from16 v19, v0

    .line 780
    .line 781
    invoke-static/range {v14 .. v19}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 782
    .line 783
    .line 784
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 785
    .line 786
    .line 787
    const-string v0, "clean_pause_show_bottom_bar"

    .line 788
    .line 789
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 790
    .line 791
    .line 792
    move-result v18

    .line 793
    new-instance v0, Lct1;

    .line 794
    .line 795
    invoke-direct {v0, v15, v9}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 796
    .line 797
    .line 798
    const-string v16, "\u6682\u505c\u65f6\u6062\u590d\u5e95\u680f\u663e\u793a"

    .line 799
    .line 800
    const-string v17, "\u89c6\u9891\u6682\u505c\u663e\u793a\u63a7\u4ef6\u65f6\uff0c\u540c\u65f6\u4e34\u65f6\u6062\u590d\u5e95\u680f\u663e\u793a\uff08\u4e0d\u5f71\u54cd\u53d1\u5e03\u6309\u94ae\u9690\u85cf\uff09"

    .line 801
    .line 802
    move-object/from16 v19, v0

    .line 803
    .line 804
    invoke-static/range {v14 .. v19}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 805
    .line 806
    .line 807
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 808
    .line 809
    .line 810
    const-string v0, "clean_progress_bar_enabled"

    .line 811
    .line 812
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 813
    .line 814
    .line 815
    move-result v18

    .line 816
    new-instance v0, Lct1;

    .line 817
    .line 818
    const/4 v1, 0x6

    .line 819
    invoke-direct {v0, v15, v1}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 820
    .line 821
    .line 822
    const-string v16, "\u8fdb\u5ea6\u6761\u900f\u660e\u5ea6\u63a7\u5236"

    .line 823
    .line 824
    const-string v17, "\u542f\u7528\u540e\u53ef\u81ea\u5b9a\u4e49\u89c6\u9891\u8fdb\u5ea6\u6761\u7684\u900f\u660e\u5ea6"

    .line 825
    .line 826
    move-object/from16 v19, v0

    .line 827
    .line 828
    invoke-static/range {v14 .. v19}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 829
    .line 830
    .line 831
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 832
    .line 833
    .line 834
    const-string v0, "clean_progress_bar_alpha"

    .line 835
    .line 836
    const v1, 0x3ecccccd    # 0.4f

    .line 837
    .line 838
    .line 839
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 844
    .line 845
    .line 846
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 847
    :catchall_4
    const/4 v0, 0x0

    .line 848
    const/high16 v2, 0x3f800000    # 1.0f

    .line 849
    .line 850
    invoke-static {v1, v0, v2}, Lj81;->λ(FFF)F

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    int-to-float v1, v6

    .line 855
    mul-float/2addr v0, v1

    .line 856
    float-to-int v0, v0

    .line 857
    invoke-static {v0, v8, v6}, Lj81;->μ(III)I

    .line 858
    .line 859
    .line 860
    move-result v22

    .line 861
    new-instance v0, Lnq1;

    .line 862
    .line 863
    const/16 v1, 0x1c

    .line 864
    .line 865
    invoke-direct {v0, v1}, Lnq1;-><init>(I)V

    .line 866
    .line 867
    .line 868
    const-string v21, "\u8fdb\u5ea6\u6761\u64ad\u653e\u900f\u660e\u5ea6"

    .line 869
    .line 870
    const/16 v23, 0x64

    .line 871
    .line 872
    const/16 v24, 0x0

    .line 873
    .line 874
    const-string v25, "%"

    .line 875
    .line 876
    const-string v26, "\u63a7\u5236\u89c6\u9891\u64ad\u653e\u65f6\u8fdb\u5ea6\u6761\u7684\u900f\u660e\u5ea6\uff080=\u5168\u900f\u660e\uff0c100=\u4e0d\u900f\u660e\uff09"

    .line 877
    .line 878
    move-object/from16 v27, v0

    .line 879
    .line 880
    move-object/from16 v20, v15

    .line 881
    .line 882
    invoke-static/range {v20 .. v27}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 887
    .line 888
    .line 889
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 890
    .line 891
    .line 892
    const-string v0, "clean_progress_bar_restore_alpha_on_pause"

    .line 893
    .line 894
    invoke-static {v0, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    move-object v9, v14

    .line 899
    new-instance v14, Lct1;

    .line 900
    .line 901
    invoke-direct {v14, v15, v13}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 902
    .line 903
    .line 904
    const-string v11, "\u6682\u505c\u65f6\u6062\u590d\u5b8c\u5168\u4e0d\u900f\u660e"

    .line 905
    .line 906
    const-string v12, "\u89c6\u9891\u6682\u505c/\u505c\u6b62\u65f6\u5c06\u8fdb\u5ea6\u6761\u6062\u590d\u4e3a\u5b8c\u5168\u4e0d\u900f\u660e\uff08100%\uff09"

    .line 907
    .line 908
    move v13, v0

    .line 909
    move-object v10, v15

    .line 910
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 911
    .line 912
    .line 913
    move-object v14, v9

    .line 914
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 915
    .line 916
    .line 917
    const-string v0, "clean_progress_bar_only_in_clean_mode"

    .line 918
    .line 919
    invoke-static {v0, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 920
    .line 921
    .line 922
    move-result v13

    .line 923
    new-instance v14, Lct1;

    .line 924
    .line 925
    const/16 v0, 0x1a

    .line 926
    .line 927
    invoke-direct {v14, v15, v0}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 928
    .line 929
    .line 930
    const-string v11, "\u4ec5\u5728\u6e05\u723d\u6a21\u5f0f\u4e0b\u751f\u6548"

    .line 931
    .line 932
    const-string v12, "\u5f00\u542f\u540e\uff0c\u8fdb\u5ea6\u6761\u900f\u660e\u5ea6\u63a7\u5236\u4ec5\u5728\u6e05\u723d\u6a21\u5f0f\u542f\u7528\u65f6\u751f\u6548"

    .line 933
    .line 934
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 935
    .line 936
    .line 937
    move-object v14, v9

    .line 938
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 939
    .line 940
    .line 941
    const-string v0, "bottom_bar_hidden"

    .line 942
    .line 943
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 944
    .line 945
    .line 946
    move-result v13

    .line 947
    new-instance v0, Lum1;

    .line 948
    .line 949
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 950
    .line 951
    .line 952
    new-instance v14, Lic;

    .line 953
    .line 954
    const/16 v1, 0x9

    .line 955
    .line 956
    invoke-direct {v14, v15, v1, v0}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    const-string v11, "\u5e95\u680f\u9690\u85cf"

    .line 960
    .line 961
    const-string v12, "\u5f00\u542f\u540e\u9690\u85cf\u539f\u5e95\u680f\u5e76\u8ba9\u89c6\u9891\u5ef6\u4f38\u5230\u5e95\u90e8\uff1b\u4e0b\u65b9\u5f00\u5173\u53ef\u8ba9\u64ad\u653e\u63a7\u4ef6\u4fdd\u7559\u5b89\u5168\u4f4d\u7f6e"

    .line 962
    .line 963
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 964
    .line 965
    .line 966
    move-object v14, v9

    .line 967
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 968
    .line 969
    .line 970
    const-string v0, "bottom_bar_show_text"

    .line 971
    .line 972
    invoke-static {v0, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 973
    .line 974
    .line 975
    move-result v13

    .line 976
    new-instance v14, Lct1;

    .line 977
    .line 978
    invoke-direct {v14, v15, v8}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 979
    .line 980
    .line 981
    const-string v11, "\u663e\u793a\u5e95\u680f\u6587\u5b57"

    .line 982
    .line 983
    const-string v12, "\u4e0e\u5e95\u680f\u9690\u85cf\u540c\u65f6\u5f00\u542f\u65f6\u4fdd\u7559 TAB \u6587\u5b57\uff1b\u56fe\u6807\u548c\u80cc\u666f\u7ee7\u7eed\u9690\u85cf\uff0c\u89c6\u9891\u4ecd\u5ef6\u4f38\u5230\u5e95\u90e8"

    .line 984
    .line 985
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 986
    .line 987
    .line 988
    move-object v5, v9

    .line 989
    invoke-static {v5, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 990
    .line 991
    .line 992
    const-string v0, "bottom_bar_text_alpha"

    .line 993
    .line 994
    :try_start_5
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 995
    .line 996
    .line 997
    move-result-object v1

    .line 998
    invoke-interface {v1, v0, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 999
    .line 1000
    .line 1001
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1002
    goto :goto_4

    .line 1003
    :catchall_5
    move v0, v6

    .line 1004
    :goto_4
    invoke-static {v0, v8, v6}, Lj81;->μ(III)I

    .line 1005
    .line 1006
    .line 1007
    move-result v11

    .line 1008
    new-instance v0, Lkv0;

    .line 1009
    .line 1010
    const/4 v1, 0x2

    .line 1011
    invoke-direct {v0, v15, v1}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 1012
    .line 1013
    .line 1014
    const-string v10, "\u5e95\u680f\u6587\u5b57\u900f\u660e\u5ea6"

    .line 1015
    .line 1016
    const/16 v12, 0x64

    .line 1017
    .line 1018
    const/4 v13, 0x0

    .line 1019
    const-string v14, "%"

    .line 1020
    .line 1021
    move-object/from16 v21, v15

    .line 1022
    .line 1023
    const-string v15, "\u63a7\u5236\u5e95\u680f\u6587\u5b57\u7684\u900f\u660e\u5ea6\uff080=\u5168\u900f\u660e\uff0c100=\u4e0d\u900f\u660e\uff09"

    .line 1024
    .line 1025
    move-object/from16 v16, v0

    .line 1026
    .line 1027
    move-object/from16 v9, v21

    .line 1028
    .line 1029
    invoke-static/range {v9 .. v16}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    move-object v15, v9

    .line 1034
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-static {v5, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 1038
    .line 1039
    .line 1040
    const-string v0, "bottom_bar_hide_badge"

    .line 1041
    .line 1042
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v13

    .line 1046
    new-instance v14, Lct1;

    .line 1047
    .line 1048
    invoke-direct {v14, v15, v7}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 1049
    .line 1050
    .line 1051
    const-string v11, "\u59cb\u7ec8\u9690\u85cf\u6d88\u606f\u7ea2\u70b9"

    .line 1052
    .line 1053
    const-string v12, "\u5e95\u680f\u9690\u85cf\u751f\u6548\u65f6\u4e0d\u663e\u793a\u6d88\u606f\u7ea2\u70b9\u548c\u6570\u5b57\u89d2\u6807\uff1b\u5173\u95ed\u65f6\u7ea2\u70b9\u8ddf\u968f\u5e95\u680f\u6587\u5b57\u900f\u660e\u5ea6"

    .line 1054
    .line 1055
    move-object v9, v5

    .line 1056
    move-object v10, v15

    .line 1057
    invoke-static/range {v9 .. v14}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 1058
    .line 1059
    .line 1060
    move-object v14, v9

    .line 1061
    invoke-static {v14, v15}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 1062
    .line 1063
    .line 1064
    const-string v0, "hide_tab_publish"

    .line 1065
    .line 1066
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v9

    .line 1070
    new-instance v10, Lct1;

    .line 1071
    .line 1072
    const/4 v1, 0x2

    .line 1073
    invoke-direct {v10, v15, v1}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 1074
    .line 1075
    .line 1076
    const-string v7, "\u9690\u85cf\u52a0\u53f7\u6309\u94ae"

    .line 1077
    .line 1078
    const-string v8, "\u9690\u85cf\u5e95\u90e8\u5bfc\u822a\u680f\u7684\u53d1\u5e03/\u52a0\u53f7\u6309\u94ae"

    .line 1079
    .line 1080
    move-object v5, v14

    .line 1081
    move-object v6, v15

    .line 1082
    invoke-static/range {v5 .. v10}, Lbv1;->δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V

    .line 1083
    .line 1084
    .line 1085
    move-object v0, v14

    .line 1086
    :goto_5
    return-object v0

    .line 1087
    :pswitch_c
    move-object/from16 v1, p1

    .line 1088
    .line 1089
    check-cast v1, Landroid/app/Activity;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1095
    .line 1096
    check-cast v0, Lbv1;

    .line 1097
    .line 1098
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    new-instance v2, Lsm1;

    .line 1106
    .line 1107
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1108
    .line 1109
    .line 1110
    const-string v3, "liquid_glass_bottom_bar_scale_percent"

    .line 1111
    .line 1112
    :try_start_6
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    invoke-interface {v4, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1117
    .line 1118
    .line 1119
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1120
    :catchall_6
    const/16 v3, 0x32

    .line 1121
    .line 1122
    const/16 v4, 0x96

    .line 1123
    .line 1124
    invoke-static {v6, v3, v4}, Lj81;->μ(III)I

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    iput v3, v2, Lsm1;->ε:I

    .line 1129
    .line 1130
    sget-object v3, Lzs1;->α:Lys1;

    .line 1131
    .line 1132
    invoke-static {v3}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v3

    .line 1136
    invoke-static {v0, v1, v3, v8}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 1137
    .line 1138
    .line 1139
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 1140
    .line 1141
    .line 1142
    iget v3, v2, Lsm1;->ε:I

    .line 1143
    .line 1144
    new-instance v8, Lcl1;

    .line 1145
    .line 1146
    const/4 v4, 0x2

    .line 1147
    invoke-direct {v8, v4, v2}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 1148
    .line 1149
    .line 1150
    const-string v2, "\u5e95\u680f\u7f29\u653e"

    .line 1151
    .line 1152
    const/16 v4, 0x96

    .line 1153
    .line 1154
    const/16 v5, 0x32

    .line 1155
    .line 1156
    const-string v6, "%"

    .line 1157
    .line 1158
    const-string v7, "\u540c\u65f6\u8c03\u6574\u73bb\u7483\u80f6\u56ca\u3001\u56fe\u6807\u3001\u6587\u5b57\u548c\u89e6\u6478\u533a\u57df\uff0c\u9ed8\u8ba4 100%"

    .line 1159
    .line 1160
    invoke-static/range {v1 .. v8}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 1168
    .line 1169
    .line 1170
    const-string v2, "Android 13 \u53ca\u4ee5\u4e0a\u542f\u7528\u5b9e\u65f6\u6298\u5c04\u6a21\u7cca\uff1bAndroid 11/12 \u81ea\u52a8\u4f7f\u7528\u534a\u900f\u660e\u73bb\u7483\u964d\u7ea7\u3002\u5f00\u542f\u65f6\u4f1a\u6682\u65f6\u63a5\u7ba1\u201c\u5e95\u680f\u9690\u85cf\u201d\uff0c\u5173\u95ed\u540e\u6062\u590d\u539f\u9690\u85cf\u8bbe\u7f6e\u3002"

    .line 1171
    .line 1172
    invoke-static {v0, v1, v2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    return-object v0

    .line 1176
    :pswitch_d
    move-object/from16 v1, p1

    .line 1177
    .line 1178
    check-cast v1, Landroid/app/Activity;

    .line 1179
    .line 1180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1181
    .line 1182
    .line 1183
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1184
    .line 1185
    check-cast v0, Lbv1;

    .line 1186
    .line 1187
    sget-object v2, Lbv1;->α:Lbv1;

    .line 1188
    .line 1189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1190
    .line 1191
    .line 1192
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    :try_start_7
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 1201
    .line 1202
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->all()Ljava/util/List;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v3

    .line 1206
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1207
    .line 1208
    .line 1209
    move-result v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1210
    goto :goto_6

    .line 1211
    :catchall_7
    move v3, v8

    .line 1212
    :goto_6
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1213
    .line 1214
    const/4 v6, -0x2

    .line 1215
    const/high16 v9, 0x41500000    # 13.0f

    .line 1216
    .line 1217
    const-string v11, "theme"

    .line 1218
    .line 1219
    if-nez v2, :cond_8

    .line 1220
    .line 1221
    invoke-static {v1, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v12

    .line 1225
    const/16 v13, 0x10

    .line 1226
    .line 1227
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1228
    .line 1229
    .line 1230
    move-result v14

    .line 1231
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1232
    .line 1233
    .line 1234
    move-result v15

    .line 1235
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1240
    .line 1241
    .line 1242
    move-result v8

    .line 1243
    invoke-virtual {v12, v14, v15, v5, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 1244
    .line 1245
    .line 1246
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 1247
    .line 1248
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1249
    .line 1250
    .line 1251
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 1252
    .line 1253
    if-eqz v8, :cond_7

    .line 1254
    .line 1255
    iget-object v8, v8, Lqu1;->ο:Ljava/lang/String;

    .line 1256
    .line 1257
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1258
    .line 1259
    .line 1260
    move-result v8

    .line 1261
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1262
    .line 1263
    .line 1264
    const/16 v8, 0x8

    .line 1265
    .line 1266
    invoke-static {v1, v8}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1267
    .line 1268
    .line 1269
    move-result v13

    .line 1270
    int-to-float v8, v13

    .line 1271
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v12, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1275
    .line 1276
    .line 1277
    new-instance v5, Landroid/widget/TextView;

    .line 1278
    .line 1279
    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1280
    .line 1281
    .line 1282
    const-string v8, "\ud83d\udd12 \u5185\u6d4b\u529f\u80fd"

    .line 1283
    .line 1284
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1285
    .line 1286
    .line 1287
    const/high16 v8, 0x41700000    # 15.0f

    .line 1288
    .line 1289
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1290
    .line 1291
    .line 1292
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 1293
    .line 1294
    if-eqz v8, :cond_6

    .line 1295
    .line 1296
    iget-object v8, v8, Lqu1;->ξ:Ljava/lang/String;

    .line 1297
    .line 1298
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1299
    .line 1300
    .line 1301
    move-result v8

    .line 1302
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1303
    .line 1304
    .line 1305
    const/4 v8, 0x0

    .line 1306
    invoke-virtual {v5, v8, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1307
    .line 1308
    .line 1309
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 1310
    .line 1311
    const/4 v13, -0x1

    .line 1312
    invoke-direct {v8, v13, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1313
    .line 1314
    .line 1315
    const/16 v13, 0x8

    .line 1316
    .line 1317
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1318
    .line 1319
    .line 1320
    move-result v14

    .line 1321
    iput v14, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1322
    .line 1323
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1327
    .line 1328
    .line 1329
    new-instance v5, Landroid/widget/TextView;

    .line 1330
    .line 1331
    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1332
    .line 1333
    .line 1334
    const-string v8, "\u8fdb\u5165\u6296\u97f3\u81ea\u52a8\u626b\u63cf\u548c\u4e3b\u52a8\u67e5\u8be2\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528\n\n\u8bf7\u5148\u5b8c\u6210\u5185\u6d4b\u9a8c\u8bc1\u4ee5\u89e3\u9501\u5b8c\u6574\u529f\u80fd"

    .line 1335
    .line 1336
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1340
    .line 1341
    .line 1342
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 1343
    .line 1344
    if-eqz v8, :cond_5

    .line 1345
    .line 1346
    iget-object v8, v8, Lqu1;->θ:Ljava/lang/String;

    .line 1347
    .line 1348
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1349
    .line 1350
    .line 1351
    move-result v8

    .line 1352
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1353
    .line 1354
    .line 1355
    invoke-static {v1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1356
    .line 1357
    .line 1358
    move-result v8

    .line 1359
    int-to-float v8, v8

    .line 1360
    invoke-virtual {v5, v8, v4}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1367
    .line 1368
    .line 1369
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v5

    .line 1373
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1374
    .line 1375
    .line 1376
    goto :goto_7

    .line 1377
    :cond_5
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1378
    .line 1379
    .line 1380
    const/16 v18, 0x0

    .line 1381
    .line 1382
    throw v18

    .line 1383
    :cond_6
    const/16 v18, 0x0

    .line 1384
    .line 1385
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1386
    .line 1387
    .line 1388
    throw v18

    .line 1389
    :cond_7
    const/16 v18, 0x0

    .line 1390
    .line 1391
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    throw v18

    .line 1395
    :cond_8
    :goto_7
    const-string v5, "comment_bookmark_auto_scan_enabled"

    .line 1396
    .line 1397
    const/4 v8, 0x0

    .line 1398
    invoke-static {v5, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v5

    .line 1402
    new-instance v10, Lct1;

    .line 1403
    .line 1404
    const/4 v12, 0x7

    .line 1405
    invoke-direct {v10, v1, v12}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 1406
    .line 1407
    .line 1408
    const-string v12, "\u8fdb\u5165\u6296\u97f3\u81ea\u52a8\u626b\u63cf\u4e66\u7b7e\u8bc4\u8bba"

    .line 1409
    .line 1410
    const-string v13, "\u542f\u52a8\u540e\u81ea\u52a8\u67e5\u8be2\u6240\u6709\u4e66\u7b7e\u8bc4\u8bba\u7684\u65b0\u56de\u590d\uff0c\u65e0\u9700\u624b\u52a8\u6253\u5f00\u5217\u8868"

    .line 1411
    .line 1412
    invoke-static {v1, v12, v13, v5, v10}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v5

    .line 1416
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1417
    .line 1418
    .line 1419
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v5

    .line 1423
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1424
    .line 1425
    .line 1426
    const-string v5, "comment_panel_hook_enabled"

    .line 1427
    .line 1428
    invoke-static {v5, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1429
    .line 1430
    .line 1431
    move-result v5

    .line 1432
    new-instance v8, Loq1;

    .line 1433
    .line 1434
    const/16 v10, 0xa

    .line 1435
    .line 1436
    invoke-direct {v8, v10}, Loq1;-><init>(I)V

    .line 1437
    .line 1438
    .line 1439
    const-string v10, "\u542f\u7528\u8bc4\u8bba\u957f\u6309\u9762\u677f\u6269\u5c55"

    .line 1440
    .line 1441
    const-string v12, "\u957f\u6309\u8bc4\u8bba\u9762\u677f\u6dfb\u52a0 \u590d\u5236\u539f\u8bc4\u8bba\u548c\u4e66\u7b7e\u6309\u94ae"

    .line 1442
    .line 1443
    invoke-static {v1, v10, v12, v5, v8}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v5

    .line 1447
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1448
    .line 1449
    .line 1450
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v5

    .line 1454
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1455
    .line 1456
    .line 1457
    new-instance v5, Landroid/widget/LinearLayout;

    .line 1458
    .line 1459
    invoke-direct {v5, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1463
    .line 1464
    .line 1465
    const/16 v13, 0x10

    .line 1466
    .line 1467
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1468
    .line 1469
    .line 1470
    move-result v8

    .line 1471
    const/16 v10, 0xd

    .line 1472
    .line 1473
    invoke-static {v1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1474
    .line 1475
    .line 1476
    move-result v12

    .line 1477
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1478
    .line 1479
    .line 1480
    move-result v13

    .line 1481
    invoke-static {v1, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1482
    .line 1483
    .line 1484
    move-result v10

    .line 1485
    invoke-virtual {v5, v8, v12, v13, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 1486
    .line 1487
    .line 1488
    const-string v8, "\u4e66\u7b7e\u7edf\u8ba1"

    .line 1489
    .line 1490
    const/high16 v10, 0x41600000    # 14.0f

    .line 1491
    .line 1492
    invoke-static {v1, v8, v10}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v8

    .line 1496
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 1497
    .line 1498
    if-eqz v10, :cond_e

    .line 1499
    .line 1500
    iget-object v10, v10, Lqu1;->η:Ljava/lang/String;

    .line 1501
    .line 1502
    const/4 v12, 0x0

    .line 1503
    invoke-static {v10, v8, v12, v7}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1507
    .line 1508
    .line 1509
    new-instance v8, Landroid/widget/LinearLayout;

    .line 1510
    .line 1511
    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1512
    .line 1513
    .line 1514
    const/4 v10, 0x0

    .line 1515
    invoke-virtual {v8, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1516
    .line 1517
    .line 1518
    const/16 v13, 0x8

    .line 1519
    .line 1520
    invoke-static {v1, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1521
    .line 1522
    .line 1523
    move-result v12

    .line 1524
    invoke-virtual {v8, v10, v12, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 1525
    .line 1526
    .line 1527
    const-string v12, "\u5f53\u524d\u4e66\u7b7e\u6570\uff1a"

    .line 1528
    .line 1529
    invoke-static {v1, v12, v9}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v12

    .line 1533
    sget-object v13, Lbv1;->δ:Lqu1;

    .line 1534
    .line 1535
    if-eqz v13, :cond_d

    .line 1536
    .line 1537
    iget-object v13, v13, Lqu1;->θ:Ljava/lang/String;

    .line 1538
    .line 1539
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1540
    .line 1541
    .line 1542
    move-result v13

    .line 1543
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1544
    .line 1545
    .line 1546
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 1547
    .line 1548
    invoke-direct {v13, v10, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1555
    .line 1556
    .line 1557
    new-instance v4, Landroid/widget/TextView;

    .line 1558
    .line 1559
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1560
    .line 1561
    .line 1562
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1568
    .line 1569
    .line 1570
    const-string v10, " \u6761"

    .line 1571
    .line 1572
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v6

    .line 1579
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1583
    .line 1584
    .line 1585
    if-lez v3, :cond_a

    .line 1586
    .line 1587
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 1588
    .line 1589
    if-eqz v3, :cond_9

    .line 1590
    .line 1591
    iget-object v3, v3, Lqu1;->κ:Ljava/lang/String;

    .line 1592
    .line 1593
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1594
    .line 1595
    .line 1596
    move-result v3

    .line 1597
    const/4 v12, 0x0

    .line 1598
    goto :goto_8

    .line 1599
    :cond_9
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    const/4 v12, 0x0

    .line 1603
    throw v12

    .line 1604
    :cond_a
    const/4 v12, 0x0

    .line 1605
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 1606
    .line 1607
    if-eqz v3, :cond_c

    .line 1608
    .line 1609
    iget-object v3, v3, Lqu1;->ι:Ljava/lang/String;

    .line 1610
    .line 1611
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1612
    .line 1613
    .line 1614
    move-result v3

    .line 1615
    :goto_8
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v4, v12, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1628
    .line 1629
    .line 1630
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v3

    .line 1634
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1635
    .line 1636
    .line 1637
    if-eqz v2, :cond_b

    .line 1638
    .line 1639
    const-string v2, "\u5f00\u542f\u81ea\u52a8\u626b\u63cf\u540e\uff0c\u8fdb\u5165\u6296\u97f3\u4f1a\u5ef6\u8fdf5\u79d2\u5f00\u59cb\u67e5\u8be2\u6240\u6709\u4e66\u7b7e\u8bc4\u8bba"

    .line 1640
    .line 1641
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v2

    .line 1645
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1646
    .line 1647
    .line 1648
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v2

    .line 1652
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1653
    .line 1654
    .line 1655
    const-string v2, "\u68c0\u6d4b\u5230\u65b0\u56de\u590d\u65f6\u4f1a\u53d1\u9001\u7cfb\u7edf\u901a\u77e5\u63d0\u9192"

    .line 1656
    .line 1657
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1662
    .line 1663
    .line 1664
    goto :goto_9

    .line 1665
    :cond_b
    const-string v2, "\u5185\u6d4b\u7528\u6237\u53ef\u89e3\u9501\u81ea\u52a8\u626b\u63cf\u548c\u4e3b\u52a8\u67e5\u8be2\u529f\u80fd"

    .line 1666
    .line 1667
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v1

    .line 1671
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1672
    .line 1673
    .line 1674
    :goto_9
    return-object v0

    .line 1675
    :cond_c
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1676
    .line 1677
    .line 1678
    const/16 v18, 0x0

    .line 1679
    .line 1680
    throw v18

    .line 1681
    :cond_d
    const/16 v18, 0x0

    .line 1682
    .line 1683
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    throw v18

    .line 1687
    :cond_e
    const/16 v18, 0x0

    .line 1688
    .line 1689
    invoke-static {v11}, Lln0;->и(Ljava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    throw v18

    .line 1693
    :pswitch_e
    move-object/from16 v9, p1

    .line 1694
    .line 1695
    check-cast v9, Landroid/app/Activity;

    .line 1696
    .line 1697
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1701
    .line 1702
    check-cast v0, Lbv1;

    .line 1703
    .line 1704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1705
    .line 1706
    .line 1707
    invoke-static {v9}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    const-string v1, "voice_replace_enabled"

    .line 1712
    .line 1713
    const/4 v8, 0x0

    .line 1714
    invoke-static {v1, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1715
    .line 1716
    .line 1717
    move-result v1

    .line 1718
    new-instance v3, Lct1;

    .line 1719
    .line 1720
    const/16 v5, 0xb

    .line 1721
    .line 1722
    invoke-direct {v3, v9, v5}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 1723
    .line 1724
    .line 1725
    const-string v5, "\u542f\u7528\u8bed\u97f3\u66ff\u6362"

    .line 1726
    .line 1727
    const-string v6, "\u5728\u8bc4\u8bba\u533a\u6216\u79c1\u4fe1\u8bed\u97f3\u5f55\u5236\u5b8c\u6210\u65f6\uff0c\u7528\u5df2\u9009\u62e9\u7684 MP3 \u6587\u4ef6\u66ff\u4ee3\u672c\u6b21\u8bed\u97f3"

    .line 1728
    .line 1729
    invoke-static {v9, v5, v6, v1, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    invoke-static {v0, v1, v9}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1734
    .line 1735
    .line 1736
    sget-object v10, Lkn0;->δ:[Ljava/lang/String;

    .line 1737
    .line 1738
    const-string v1, "voice_replace_scope"

    .line 1739
    .line 1740
    :try_start_8
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v3

    .line 1744
    const/4 v8, 0x0

    .line 1745
    invoke-interface {v3, v1, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1746
    .line 1747
    .line 1748
    move-result v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1749
    goto :goto_a

    .line 1750
    :catchall_8
    const/4 v1, 0x0

    .line 1751
    :goto_a
    invoke-static {v10}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v3

    .line 1755
    invoke-static {v1, v3}, Lj81;->ν(ILxm0;)I

    .line 1756
    .line 1757
    .line 1758
    move-result v11

    .line 1759
    aget-object v1, v10, v11

    .line 1760
    .line 1761
    new-instance v8, Lgt1;

    .line 1762
    .line 1763
    const/4 v13, 0x0

    .line 1764
    move-object v12, v9

    .line 1765
    invoke-direct/range {v8 .. v13}, Lgt1;-><init>(Landroid/app/Activity;[Ljava/lang/String;ILandroid/app/Activity;I)V

    .line 1766
    .line 1767
    .line 1768
    const-string v3, "\u4f5c\u7528\u8303\u56f4"

    .line 1769
    .line 1770
    const-string v5, "\u9009\u62e9\u5728\u54ea\u4e9b\u8bed\u97f3\u53d1\u9001\u573a\u666f\u542f\u7528\u66ff\u6362"

    .line 1771
    .line 1772
    invoke-static {v9, v3, v1, v5, v8}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v1

    .line 1776
    invoke-static {v0, v1, v9}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 1777
    .line 1778
    .line 1779
    sget-object v10, Lkn0;->ε:[Ljava/lang/String;

    .line 1780
    .line 1781
    const-string v1, "voice_replace_mode"

    .line 1782
    .line 1783
    :try_start_9
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v3

    .line 1787
    const/4 v8, 0x0

    .line 1788
    invoke-interface {v3, v1, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1789
    .line 1790
    .line 1791
    move-result v8
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1792
    goto :goto_b

    .line 1793
    :catchall_9
    const/4 v8, 0x0

    .line 1794
    :goto_b
    invoke-static {v10}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v1

    .line 1798
    invoke-static {v8, v1}, Lj81;->ν(ILxm0;)I

    .line 1799
    .line 1800
    .line 1801
    move-result v11

    .line 1802
    aget-object v1, v10, v11

    .line 1803
    .line 1804
    new-instance v8, Lgt1;

    .line 1805
    .line 1806
    const/4 v13, 0x1

    .line 1807
    move-object v12, v9

    .line 1808
    invoke-direct/range {v8 .. v13}, Lgt1;-><init>(Landroid/app/Activity;[Ljava/lang/String;ILandroid/app/Activity;I)V

    .line 1809
    .line 1810
    .line 1811
    const-string v3, "\u66ff\u6362\u65b9\u5f0f"

    .line 1812
    .line 1813
    const-string v5, "\u6bcf\u6b21\u8be2\u95ee\u6216\u81ea\u52a8\u66ff\u6362\u5f55\u97f3\u7ed3\u679c"

    .line 1814
    .line 1815
    invoke-static {v9, v3, v1, v5, v8}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v1

    .line 1819
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1820
    .line 1821
    .line 1822
    invoke-static {v9}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v1

    .line 1826
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1827
    .line 1828
    .line 1829
    const-string v1, "voice_replace_confirm_before_send"

    .line 1830
    .line 1831
    invoke-static {v1, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v1

    .line 1835
    new-instance v3, Lct1;

    .line 1836
    .line 1837
    invoke-direct {v3, v9, v2}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 1838
    .line 1839
    .line 1840
    const-string v2, "\u53d1\u9001\u524d\u786e\u8ba4"

    .line 1841
    .line 1842
    const-string v5, "\u66ff\u6362\u65b9\u5f0f\u4e3a\u6bcf\u6b21\u8be2\u95ee\u65f6\uff0c\u5f55\u97f3\u5b8c\u6210\u540e\u5f39\u7a97\u9009\u62e9\u4f7f\u7528 MP3 \u6216\u539f\u8bed\u97f3"

    .line 1843
    .line 1844
    invoke-static {v9, v2, v5, v1, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v1

    .line 1848
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1849
    .line 1850
    .line 1851
    invoke-static {v9}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v1

    .line 1855
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1856
    .line 1857
    .line 1858
    invoke-static {}, Lbv1;->Α()I

    .line 1859
    .line 1860
    .line 1861
    move-result v1

    .line 1862
    if-lez v1, :cond_f

    .line 1863
    .line 1864
    const-string v2, " \u4e2a\u97f3\u9891"

    .line 1865
    .line 1866
    invoke-static {v2, v1}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v1

    .line 1870
    goto :goto_c

    .line 1871
    :cond_f
    const-string v1, "voice_replace_mp3_name"

    .line 1872
    .line 1873
    invoke-static {v1, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v1

    .line 1877
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1878
    .line 1879
    .line 1880
    move-result v2

    .line 1881
    if-eqz v2, :cond_10

    .line 1882
    .line 1883
    const-string v1, "\u672a\u9009\u62e9"

    .line 1884
    .line 1885
    :cond_10
    :goto_c
    new-instance v2, Let1;

    .line 1886
    .line 1887
    invoke-direct {v2, v9, v9, v7}, Let1;-><init>(Landroid/app/Activity;Landroid/app/Activity;I)V

    .line 1888
    .line 1889
    .line 1890
    const-string v3, "\u97f3\u9891\u7ba1\u7406"

    .line 1891
    .line 1892
    const-string v4, "\u5f55\u97f3\u5b8c\u6210\u540e\u7684\u5f39\u7a97\u4e2d\u53ef\u7ee7\u7eed\u6dfb\u52a0\u3001\u64ad\u653e\u548c\u9009\u62e9\u97f3\u9891"

    .line 1893
    .line 1894
    invoke-static {v9, v3, v1, v4, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1899
    .line 1900
    .line 1901
    invoke-static {v9}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v1

    .line 1905
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1906
    .line 1907
    .line 1908
    new-instance v1, Lkv0;

    .line 1909
    .line 1910
    const/4 v12, 0x7

    .line 1911
    invoke-direct {v1, v9, v12}, Lkv0;-><init>(Landroid/content/Context;I)V

    .line 1912
    .line 1913
    .line 1914
    const-string v2, "\u6e05\u9664\u97f3\u9891\u5217\u8868"

    .line 1915
    .line 1916
    const-string v3, "\u6e05\u9664"

    .line 1917
    .line 1918
    const-string v4, "\u6e05\u7a7a\u5df2\u6dfb\u52a0\u7684\u66ff\u6362\u97f3\u9891"

    .line 1919
    .line 1920
    invoke-static {v9, v2, v3, v4, v1}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v1

    .line 1924
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1925
    .line 1926
    .line 1927
    invoke-static {v9}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v1

    .line 1931
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1932
    .line 1933
    .line 1934
    const-string v1, "\u8bc4\u8bba\u533a\u97f3\u9891\u8d85\u8fc7 30 \u79d2\u4f1a\u81ea\u52a8\u88c1\u5207\u3002\u53d1\u9001\u65f6\u4f1a\u590d\u5236\u5230\u5bbf\u4e3b\u8bed\u97f3\u7f13\u5b58\u76ee\u5f55\uff0c\u5e76\u6cbf\u7528\u5bbf\u4e3b\u7684\u8bed\u97f3\u53d1\u9001\u6d41\u7a0b\u3002"

    .line 1935
    .line 1936
    invoke-static {v9, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v1

    .line 1940
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1941
    .line 1942
    .line 1943
    return-object v0

    .line 1944
    :pswitch_f
    move-object/from16 v1, p1

    .line 1945
    .line 1946
    check-cast v1, Landroid/app/Activity;

    .line 1947
    .line 1948
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1949
    .line 1950
    .line 1951
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 1952
    .line 1953
    check-cast v0, Lbv1;

    .line 1954
    .line 1955
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1956
    .line 1957
    .line 1958
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    sget-object v2, Lkn0;->γ:[Ljava/lang/String;

    .line 1963
    .line 1964
    const-string v3, "comment_audio_download_trigger_mode"

    .line 1965
    .line 1966
    :try_start_a
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v4

    .line 1970
    invoke-interface {v4, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1971
    .line 1972
    .line 1973
    move-result v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1974
    :catchall_a
    invoke-static {v2}, Lg7;->в([Ljava/lang/Object;)Lxm0;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v3

    .line 1978
    invoke-static {v7, v3}, Lj81;->ν(ILxm0;)I

    .line 1979
    .line 1980
    .line 1981
    move-result v3

    .line 1982
    aget-object v3, v2, v3

    .line 1983
    .line 1984
    new-instance v4, Lg71;

    .line 1985
    .line 1986
    invoke-direct {v4, v2, v1}, Lg71;-><init>([Ljava/lang/String;Landroid/app/Activity;)V

    .line 1987
    .line 1988
    .line 1989
    const-string v2, "\u89e6\u53d1\u65b9\u6848"

    .line 1990
    .line 1991
    const-string v5, "\u9ed8\u8ba4\u4f7f\u7528\u7eff\u8272\u5706\u89d2\u4e0b\u8f7d\u6309\u94ae\uff1b\u53ef\u6539\u4e3a\u53cc\u51fb\u5bbf\u4e3b\u64ad\u653e\u63a7\u4ef6\u6216\u4e24\u8005\u540c\u65f6\u542f\u7528"

    .line 1992
    .line 1993
    invoke-static {v1, v2, v3, v5, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v2

    .line 1997
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1998
    .line 1999
    .line 2000
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v2

    .line 2004
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2005
    .line 2006
    .line 2007
    const-string v2, "\u53cc\u51fb\u65b9\u6848\u76d1\u542c\u5bbf\u4e3b\u64ad\u653e\u63a7\u4ef6\u7684\u70b9\u51fb\u7ed3\u679c\uff0c\u4e0d\u518d\u8986\u76d6\u957f\u6309\uff1b\u6309\u94ae\u65b9\u6848\u4f1a\u5728\u8bed\u97f3\u63a7\u4ef6\u4e0b\u65b9\u6dfb\u52a0\u7eff\u8272\u5706\u89d2\u4e0b\u8f7d\u6309\u94ae\u3002"

    .line 2008
    .line 2009
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v1

    .line 2013
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2014
    .line 2015
    .line 2016
    return-object v0

    .line 2017
    :pswitch_10
    move-object/from16 v1, p1

    .line 2018
    .line 2019
    check-cast v1, Landroid/app/Activity;

    .line 2020
    .line 2021
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2022
    .line 2023
    .line 2024
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2025
    .line 2026
    check-cast v0, Lbv1;

    .line 2027
    .line 2028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2029
    .line 2030
    .line 2031
    sget-object v0, Lzs1;->τ:Lys1;

    .line 2032
    .line 2033
    const-string v2, "\u5f00\u542f\u540e\u4f1a\u81ea\u52a8\u7f13\u5b58\u65e0\u6c34\u5370\u539f\u56fe\u94fe\u63a5\uff0c\u5f53\u68c0\u6d4b\u5230\u6c34\u5370\u56fe\u7247\u65f6\u8fdb\u884c\u66ff\u6362"

    .line 2034
    .line 2035
    invoke-static {v1, v0, v2}, Lbv1;->σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v0

    .line 2039
    sget-object v2, Lbv1;->α:Lbv1;

    .line 2040
    .line 2041
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 2042
    .line 2043
    .line 2044
    const-string v2, "\u4ec5\u5bf9 douyinpic.com \u57df\u540d\u4e0b\u7684 tos-cn-i- \u56fe\u7247\u751f\u6548"

    .line 2045
    .line 2046
    invoke-static {v0, v1, v2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 2047
    .line 2048
    .line 2049
    return-object v0

    .line 2050
    :pswitch_11
    move-object/from16 v1, p1

    .line 2051
    .line 2052
    check-cast v1, Landroid/app/Activity;

    .line 2053
    .line 2054
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2055
    .line 2056
    .line 2057
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2058
    .line 2059
    check-cast v0, Lbv1;

    .line 2060
    .line 2061
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v0

    .line 2068
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 2069
    .line 2070
    .line 2071
    move-result v2

    .line 2072
    if-nez v2, :cond_11

    .line 2073
    .line 2074
    const-string v0, "\u5e95\u680f TAB \u8fc7\u6ee4\u662f\u5185\u6d4b\u529f\u80fd\uff0c\u9700\u8981\u5185\u6d4b\u8d44\u683c\u624d\u80fd\u4f7f\u7528"

    .line 2075
    .line 2076
    invoke-static {v1, v0}, Lbv1;->η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    goto :goto_d

    .line 2081
    :cond_11
    const-string v2, "\u9009\u62e9\u8981\u9690\u85cf\u7684\u5e95\u680f Tab\uff08\u300c\u9996\u9875\u300d\u59cb\u7ec8\u4fdd\u7559\u4e0d\u53ef\u9690\u85cf\uff09"

    .line 2082
    .line 2083
    invoke-static {v0, v1, v2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 2084
    .line 2085
    .line 2086
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 2087
    .line 2088
    .line 2089
    sget-object v2, Lzs1;->β:Ljava/util/List;

    .line 2090
    .line 2091
    invoke-static {v0, v1, v2, v7}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 2092
    .line 2093
    .line 2094
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 2095
    .line 2096
    .line 2097
    const-string v2, "\u5207\u6362\u9875\u9762\u6216\u91cd\u542f\u6296\u97f3\u540e\u751f\u6548"

    .line 2098
    .line 2099
    invoke-static {v0, v1, v2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 2100
    .line 2101
    .line 2102
    :goto_d
    return-object v0

    .line 2103
    :pswitch_12
    move-object/from16 v1, p1

    .line 2104
    .line 2105
    check-cast v1, Landroid/app/Activity;

    .line 2106
    .line 2107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2108
    .line 2109
    .line 2110
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2111
    .line 2112
    check-cast v0, Lbv1;

    .line 2113
    .line 2114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2115
    .line 2116
    .line 2117
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    const-string v2, "precise_time_enabled"

    .line 2122
    .line 2123
    const/4 v8, 0x0

    .line 2124
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2125
    .line 2126
    .line 2127
    move-result v2

    .line 2128
    new-instance v4, Loq1;

    .line 2129
    .line 2130
    invoke-direct {v4, v3}, Loq1;-><init>(I)V

    .line 2131
    .line 2132
    .line 2133
    const-string v3, "\u542f\u7528\u8bc4\u8bba\u7cbe\u786e\u65f6\u95f4"

    .line 2134
    .line 2135
    const-string v5, "\u5c06\u8bc4\u8bba\u533a\u76f8\u5bf9\u65f6\u95f4\uff08\u5982\uff1a\u521a\u521a\u30013\u5c0f\u65f6\u524d\uff09\u66ff\u6362\u4e3a\u7cbe\u786e\u65f6\u95f4"

    .line 2136
    .line 2137
    invoke-static {v1, v3, v5, v2, v4}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v2

    .line 2141
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2142
    .line 2143
    .line 2144
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v2

    .line 2148
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2149
    .line 2150
    .line 2151
    const-string v2, "precise_time_format"

    .line 2152
    .line 2153
    const-string v3, "yyyy-MM-dd HH:mm"

    .line 2154
    .line 2155
    invoke-static {v2, v3}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v2

    .line 2159
    invoke-static {v2, v12}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v2

    .line 2163
    new-instance v3, Ljt1;

    .line 2164
    .line 2165
    const/4 v4, 0x2

    .line 2166
    invoke-direct {v3, v1, v4}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 2167
    .line 2168
    .line 2169
    const-string v4, "\u65f6\u95f4\u683c\u5f0f"

    .line 2170
    .line 2171
    const-string v5, "\u81ea\u5b9a\u4e49\u8bc4\u8bba\u65f6\u95f4\u663e\u793a\u683c\u5f0f\uff0c\u652f\u6301 yyyy MM dd HH mm ss"

    .line 2172
    .line 2173
    invoke-static {v1, v4, v2, v5, v3}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2174
    .line 2175
    .line 2176
    move-result-object v2

    .line 2177
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2178
    .line 2179
    .line 2180
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v2

    .line 2184
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2185
    .line 2186
    .line 2187
    const-string v2, "\u5e38\u7528\u683c\u5f0f yyyy-MM-dd HH:mm \u6216 MM-dd HH:mm:ss"

    .line 2188
    .line 2189
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v1

    .line 2193
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2194
    .line 2195
    .line 2196
    return-object v0

    .line 2197
    :pswitch_13
    move-object/from16 v8, p1

    .line 2198
    .line 2199
    check-cast v8, Landroid/app/Activity;

    .line 2200
    .line 2201
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2202
    .line 2203
    .line 2204
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2205
    .line 2206
    check-cast v0, Lbv1;

    .line 2207
    .line 2208
    const-string v1, "comment_panel_width_px"

    .line 2209
    .line 2210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2211
    .line 2212
    .line 2213
    invoke-static {v8}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v0

    .line 2217
    const-string v2, "\u7eaf\u8272\u80cc\u666f"

    .line 2218
    .line 2219
    const-string v3, "\u81ea\u5b9a\u4e49\u56fe\u7247"

    .line 2220
    .line 2221
    const-string v5, "\u9ed8\u8ba4"

    .line 2222
    .line 2223
    filled-new-array {v5, v2, v3}, [Ljava/lang/String;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v2

    .line 2227
    new-instance v3, Lsm1;

    .line 2228
    .line 2229
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2230
    .line 2231
    .line 2232
    const-string v9, "comment_bg_mode"

    .line 2233
    .line 2234
    :try_start_b
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v10

    .line 2238
    const/4 v11, 0x0

    .line 2239
    invoke-interface {v10, v9, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2240
    .line 2241
    .line 2242
    move-result v9
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 2243
    goto :goto_e

    .line 2244
    :catchall_b
    const/4 v9, 0x0

    .line 2245
    :goto_e
    iput v9, v3, Lsm1;->ε:I

    .line 2246
    .line 2247
    invoke-static {v8, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v26

    .line 2251
    invoke-static {v8, v7}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v27

    .line 2255
    iget v9, v3, Lsm1;->ε:I

    .line 2256
    .line 2257
    invoke-static {v9, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v9

    .line 2261
    check-cast v9, Ljava/lang/String;

    .line 2262
    .line 2263
    if-nez v9, :cond_12

    .line 2264
    .line 2265
    goto :goto_f

    .line 2266
    :cond_12
    move-object v5, v9

    .line 2267
    :goto_f
    new-instance v22, Lm90;

    .line 2268
    .line 2269
    const/16 v28, 0x4

    .line 2270
    .line 2271
    move-object/from16 v24, v2

    .line 2272
    .line 2273
    move-object/from16 v25, v3

    .line 2274
    .line 2275
    move-object/from16 v23, v8

    .line 2276
    .line 2277
    invoke-direct/range {v22 .. v28}, Lm90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2278
    .line 2279
    .line 2280
    move-object/from16 v10, v22

    .line 2281
    .line 2282
    move-object/from16 v2, v25

    .line 2283
    .line 2284
    move-object/from16 v3, v26

    .line 2285
    .line 2286
    move-object/from16 v9, v27

    .line 2287
    .line 2288
    const-string v11, "\u80cc\u666f\u6a21\u5f0f"

    .line 2289
    .line 2290
    const-string v12, "\u9009\u62e9\u8bc4\u8bba\u533a\u80cc\u666f\u6837\u5f0f"

    .line 2291
    .line 2292
    invoke-static {v8, v11, v5, v12, v10}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v5

    .line 2296
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2297
    .line 2298
    .line 2299
    invoke-static {v8}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v5

    .line 2303
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2304
    .line 2305
    .line 2306
    const-string v5, "comment_bg_color"

    .line 2307
    .line 2308
    const-string v10, "#FF1A1A2E"

    .line 2309
    .line 2310
    invoke-static {v5, v10}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v5

    .line 2314
    new-instance v10, Ljt1;

    .line 2315
    .line 2316
    const/4 v12, 0x7

    .line 2317
    invoke-direct {v10, v8, v12}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 2318
    .line 2319
    .line 2320
    const-string v11, "\u80cc\u666f\u989c\u8272"

    .line 2321
    .line 2322
    const-string v12, "\u70b9\u51fb\u9009\u62e9\u989c\u8272\uff08\u652f\u6301\u900f\u660e\u5ea6\uff09"

    .line 2323
    .line 2324
    invoke-static {v8, v11, v5, v12, v10}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v5

    .line 2328
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2329
    .line 2330
    .line 2331
    :try_start_c
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 2335
    const/4 v10, 0x0

    .line 2336
    :try_start_d
    invoke-interface {v5, v1, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2337
    .line 2338
    .line 2339
    move-result v21
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 2340
    goto :goto_10

    .line 2341
    :catchall_c
    const/4 v10, 0x0

    .line 2342
    :catchall_d
    move/from16 v21, v10

    .line 2343
    .line 2344
    :goto_10
    if-lez v21, :cond_13

    .line 2345
    .line 2346
    move v5, v7

    .line 2347
    goto :goto_11

    .line 2348
    :cond_13
    move v5, v10

    .line 2349
    :goto_11
    :try_start_e
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v11

    .line 2353
    invoke-interface {v11, v1, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2354
    .line 2355
    .line 2356
    move-result v21
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 2357
    move/from16 v1, v21

    .line 2358
    .line 2359
    goto :goto_12

    .line 2360
    :catchall_e
    move v1, v10

    .line 2361
    :goto_12
    const-string v11, "comment_panel_height_px"

    .line 2362
    .line 2363
    :try_start_f
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v12

    .line 2367
    invoke-interface {v12, v11, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2368
    .line 2369
    .line 2370
    move-result v11
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 2371
    goto :goto_13

    .line 2372
    :catchall_f
    const/4 v11, 0x0

    .line 2373
    :goto_13
    if-lez v1, :cond_14

    .line 2374
    .line 2375
    if-lez v11, :cond_14

    .line 2376
    .line 2377
    new-instance v10, Ll91;

    .line 2378
    .line 2379
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v1

    .line 2383
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v11

    .line 2387
    invoke-direct {v10, v1, v11}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2388
    .line 2389
    .line 2390
    goto :goto_14

    .line 2391
    :cond_14
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v1

    .line 2395
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v1

    .line 2399
    iget v10, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2400
    .line 2401
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2402
    .line 2403
    int-to-float v1, v1

    .line 2404
    const/high16 v11, 0x3f400000    # 0.75f

    .line 2405
    .line 2406
    mul-float/2addr v1, v11

    .line 2407
    float-to-int v1, v1

    .line 2408
    new-instance v11, Ll91;

    .line 2409
    .line 2410
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2411
    .line 2412
    .line 2413
    move-result-object v10

    .line 2414
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v1

    .line 2418
    invoke-direct {v11, v10, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2419
    .line 2420
    .line 2421
    move-object v10, v11

    .line 2422
    :goto_14
    iget-object v1, v10, Ll91;->ε:Ljava/lang/Object;

    .line 2423
    .line 2424
    check-cast v1, Ljava/lang/Number;

    .line 2425
    .line 2426
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2427
    .line 2428
    .line 2429
    move-result v1

    .line 2430
    iget-object v10, v10, Ll91;->ζ:Ljava/lang/Object;

    .line 2431
    .line 2432
    check-cast v10, Ljava/lang/Number;

    .line 2433
    .line 2434
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 2435
    .line 2436
    .line 2437
    move-result v10

    .line 2438
    invoke-static {v8}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v11

    .line 2442
    invoke-virtual {v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2443
    .line 2444
    .line 2445
    const-string v11, "px"

    .line 2446
    .line 2447
    const-string v12, "\u00d7"

    .line 2448
    .line 2449
    if-eqz v5, :cond_15

    .line 2450
    .line 2451
    const-string v5, " \u5df2\u83b7\u53d6\u771f\u5b9e\u9762\u677f\u5c3a\u5bf8\uff1a"

    .line 2452
    .line 2453
    invoke-static {v5, v1, v12, v10, v11}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v1

    .line 2457
    goto :goto_15

    .line 2458
    :cond_15
    const-string v5, " \u5c1a\u672a\u83b7\u53d6\u771f\u5b9e\u5c3a\u5bf8\uff08\u8bf7\u5148\u6253\u5f00\u4e00\u6b21\u8bc4\u8bba\u533a\uff09\uff0c\u5f53\u524d\u4f7f\u7528\u4f30\u7b97\u503c\uff1a"

    .line 2459
    .line 2460
    invoke-static {v5, v1, v12, v10, v11}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v1

    .line 2464
    :goto_15
    const/high16 v5, 0x41400000    # 12.0f

    .line 2465
    .line 2466
    invoke-static {v8, v1, v5}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v1

    .line 2470
    sget-object v5, Lbv1;->α:Lbv1;

    .line 2471
    .line 2472
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 2473
    .line 2474
    if-eqz v5, :cond_1a

    .line 2475
    .line 2476
    iget-object v5, v5, Lqu1;->ι:Ljava/lang/String;

    .line 2477
    .line 2478
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 2479
    .line 2480
    .line 2481
    move-result v5

    .line 2482
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2483
    .line 2484
    .line 2485
    const/16 v5, 0x10

    .line 2486
    .line 2487
    invoke-static {v8, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 2488
    .line 2489
    .line 2490
    move-result v10

    .line 2491
    const/16 v11, 0xa

    .line 2492
    .line 2493
    invoke-static {v8, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 2494
    .line 2495
    .line 2496
    move-result v12

    .line 2497
    invoke-static {v8, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 2498
    .line 2499
    .line 2500
    move-result v5

    .line 2501
    invoke-static {v8, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 2502
    .line 2503
    .line 2504
    move-result v11

    .line 2505
    invoke-virtual {v1, v10, v12, v5, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 2506
    .line 2507
    .line 2508
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 2509
    .line 2510
    const/4 v10, -0x1

    .line 2511
    const/4 v11, -0x2

    .line 2512
    invoke-direct {v5, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2516
    .line 2517
    .line 2518
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2519
    .line 2520
    .line 2521
    const-string v1, "comment_bg_cropped_uri"

    .line 2522
    .line 2523
    invoke-static {v1, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v1

    .line 2527
    new-instance v4, Lum1;

    .line 2528
    .line 2529
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 2530
    .line 2531
    .line 2532
    invoke-static {v8}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v5

    .line 2536
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2537
    .line 2538
    .line 2539
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2540
    .line 2541
    .line 2542
    move-result v1

    .line 2543
    if-nez v1, :cond_16

    .line 2544
    .line 2545
    const-string v1, "\u5df2\u9009\u62e9\u5e76\u88c1\u526a"

    .line 2546
    .line 2547
    goto :goto_16

    .line 2548
    :cond_16
    const-string v1, "\u70b9\u51fb\u9009\u62e9"

    .line 2549
    .line 2550
    :goto_16
    new-instance v5, Llt1;

    .line 2551
    .line 2552
    invoke-direct {v5, v4, v8}, Llt1;-><init>(Lum1;Landroid/app/Activity;)V

    .line 2553
    .line 2554
    .line 2555
    const-string v4, "\u80cc\u666f\u56fe\u7247"

    .line 2556
    .line 2557
    const-string v10, "\u9009\u62e9\u56fe\u7247\u540e\u8fdb\u5165\u88c1\u526a\u754c\u9762\uff0c\u88c1\u526a\u6846\u6bd4\u4f8b\u4e0e\u8bc4\u8bba\u9762\u677f\u4e00\u81f4"

    .line 2558
    .line 2559
    invoke-static {v8, v4, v1, v10, v5}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v1

    .line 2563
    invoke-static {v9, v1, v8}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 2564
    .line 2565
    .line 2566
    const-string v1, "comment_bg_image_alpha"

    .line 2567
    .line 2568
    :try_start_10
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2569
    .line 2570
    .line 2571
    move-result-object v4

    .line 2572
    invoke-interface {v4, v1, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2573
    .line 2574
    .line 2575
    move-result v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 2576
    :goto_17
    const/4 v10, 0x0

    .line 2577
    goto :goto_18

    .line 2578
    :catchall_10
    move v1, v6

    .line 2579
    goto :goto_17

    .line 2580
    :goto_18
    invoke-static {v1, v10, v6}, Lj81;->μ(III)I

    .line 2581
    .line 2582
    .line 2583
    move-result v24

    .line 2584
    new-instance v1, Ldt1;

    .line 2585
    .line 2586
    const/16 v4, 0x12

    .line 2587
    .line 2588
    invoke-direct {v1, v4}, Ldt1;-><init>(I)V

    .line 2589
    .line 2590
    .line 2591
    const-string v23, "\u56fe\u7247\u900f\u660e\u5ea6"

    .line 2592
    .line 2593
    const/16 v25, 0x64

    .line 2594
    .line 2595
    const/16 v26, 0x0

    .line 2596
    .line 2597
    const-string v27, "%"

    .line 2598
    .line 2599
    const-string v28, "\u63a7\u5236\u80cc\u666f\u56fe\u7247\u7684\u4e0d\u900f\u660e\u5ea6\uff080=\u5168\u900f\u660e\uff0c100=\u4e0d\u900f\u660e\uff09"

    .line 2600
    .line 2601
    move-object/from16 v29, v1

    .line 2602
    .line 2603
    move-object/from16 v22, v8

    .line 2604
    .line 2605
    invoke-static/range {v22 .. v29}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v1

    .line 2609
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2610
    .line 2611
    .line 2612
    invoke-static {v8}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2613
    .line 2614
    .line 2615
    move-result-object v1

    .line 2616
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2617
    .line 2618
    .line 2619
    new-instance v1, Landroid/widget/LinearLayout;

    .line 2620
    .line 2621
    invoke-direct {v1, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2622
    .line 2623
    .line 2624
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2625
    .line 2626
    .line 2627
    const-string v4, "comment_bg_image_blur_enabled"

    .line 2628
    .line 2629
    const/4 v10, 0x0

    .line 2630
    invoke-static {v4, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2631
    .line 2632
    .line 2633
    move-result v4

    .line 2634
    new-instance v5, Lic;

    .line 2635
    .line 2636
    const/4 v6, 0x6

    .line 2637
    invoke-direct {v5, v8, v6, v1}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2638
    .line 2639
    .line 2640
    const-string v6, "\u56fe\u7247\u9ad8\u65af\u6a21\u7cca"

    .line 2641
    .line 2642
    const-string v10, "\u5f00\u542f\u540e\u6309\u5f53\u524d\u6a21\u7cca\u5ea6\u751f\u6210\u7f13\u5b58\u56fe\uff1b\u672a\u66f4\u6362\u56fe\u7247\u6216\u6a21\u7cca\u5ea6\u65f6\u76f4\u63a5\u590d\u7528\u7f13\u5b58"

    .line 2643
    .line 2644
    invoke-static {v8, v6, v10, v4, v5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v5

    .line 2648
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2649
    .line 2650
    .line 2651
    invoke-static {v8}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v5

    .line 2655
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2656
    .line 2657
    .line 2658
    const-string v5, "comment_bg_image_blur_radius"

    .line 2659
    .line 2660
    const/16 v6, 0x17

    .line 2661
    .line 2662
    :try_start_11
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v10

    .line 2666
    invoke-interface {v10, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 2667
    .line 2668
    .line 2669
    move-result v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 2670
    :catchall_11
    invoke-static {v6, v7, v13}, Lj81;->μ(III)I

    .line 2671
    .line 2672
    .line 2673
    move-result v10

    .line 2674
    new-instance v15, Ljt1;

    .line 2675
    .line 2676
    const/16 v13, 0x8

    .line 2677
    .line 2678
    invoke-direct {v15, v8, v13}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 2679
    .line 2680
    .line 2681
    move-object/from16 v27, v9

    .line 2682
    .line 2683
    const-string v9, "\u6a21\u7cca\u5ea6"

    .line 2684
    .line 2685
    const/16 v11, 0x19

    .line 2686
    .line 2687
    const/4 v12, 0x1

    .line 2688
    const-string v13, ""

    .line 2689
    .line 2690
    const-string v14, "\u8c03\u6574\u540e\u4e0d\u4f1a\u5b9e\u65f6\u6e32\u67d3\uff0c\u91cd\u65b0\u6253\u5f00\u8bc4\u8bba\u533a\u65f6\u6309\u8be5\u6570\u503c\u751f\u6210\u6216\u590d\u7528\u7f13\u5b58\u56fe"

    .line 2691
    .line 2692
    move-object/from16 v5, v27

    .line 2693
    .line 2694
    invoke-static/range {v8 .. v15}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2695
    .line 2696
    .line 2697
    move-result-object v6

    .line 2698
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2699
    .line 2700
    .line 2701
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2702
    .line 2703
    .line 2704
    if-eqz v4, :cond_17

    .line 2705
    .line 2706
    const/4 v4, 0x0

    .line 2707
    goto :goto_19

    .line 2708
    :cond_17
    const/16 v4, 0x8

    .line 2709
    .line 2710
    :goto_19
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2711
    .line 2712
    .line 2713
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2714
    .line 2715
    .line 2716
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2717
    .line 2718
    .line 2719
    iget v1, v2, Lsm1;->ε:I

    .line 2720
    .line 2721
    if-ne v1, v7, :cond_18

    .line 2722
    .line 2723
    const/4 v2, 0x0

    .line 2724
    goto :goto_1a

    .line 2725
    :cond_18
    const/16 v2, 0x8

    .line 2726
    .line 2727
    :goto_1a
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2728
    .line 2729
    .line 2730
    const/4 v4, 0x2

    .line 2731
    if-ne v1, v4, :cond_19

    .line 2732
    .line 2733
    const/4 v1, 0x0

    .line 2734
    goto :goto_1b

    .line 2735
    :cond_19
    const/16 v1, 0x8

    .line 2736
    .line 2737
    :goto_1b
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2738
    .line 2739
    .line 2740
    return-object v0

    .line 2741
    :cond_1a
    const-string v0, "theme"

    .line 2742
    .line 2743
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 2744
    .line 2745
    .line 2746
    const/16 v18, 0x0

    .line 2747
    .line 2748
    throw v18

    .line 2749
    :pswitch_14
    move-object/from16 v1, p1

    .line 2750
    .line 2751
    check-cast v1, Landroid/app/Activity;

    .line 2752
    .line 2753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2754
    .line 2755
    .line 2756
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2757
    .line 2758
    check-cast v0, Lbv1;

    .line 2759
    .line 2760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2761
    .line 2762
    .line 2763
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v0

    .line 2767
    sget-object v2, Lbv1;->α:Lbv1;

    .line 2768
    .line 2769
    sget-object v2, Lzs1;->ν:Lys1;

    .line 2770
    .line 2771
    sget-object v3, Lzs1;->ξ:Lys1;

    .line 2772
    .line 2773
    sget-object v4, Lzs1;->ο:Lys1;

    .line 2774
    .line 2775
    sget-object v5, Lzs1;->λ:Lys1;

    .line 2776
    .line 2777
    sget-object v6, Lzs1;->μ:Lys1;

    .line 2778
    .line 2779
    filled-new-array {v2, v3, v4, v5, v6}, [Lys1;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v2

    .line 2783
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v2

    .line 2787
    const/4 v8, 0x0

    .line 2788
    invoke-static {v0, v1, v2, v8}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 2789
    .line 2790
    .line 2791
    invoke-static {v0, v1}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 2792
    .line 2793
    .line 2794
    const-string v2, "\u4fee\u6539\u540e\u91cd\u542f\u6296\u97f3\u751f\u6548\uff1b\u5f3a\u5236\u65e7\u7248\u4f1a\u5173\u95ed\u5bbf\u4e3b KMP \u8bc4\u8bba\u5217\u8868\u5b9e\u9a8c\uff0c\u53f3\u4e0a\u89d2\u641c\u7d22\u6309\u94ae\u9690\u85cf\u4f9d\u8d56 DexKit \u9996\u626b\u7ed3\u679c\u3002"

    .line 2795
    .line 2796
    invoke-static {v0, v1, v2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 2797
    .line 2798
    .line 2799
    return-object v0

    .line 2800
    :pswitch_15
    move-object/from16 v1, p1

    .line 2801
    .line 2802
    check-cast v1, Landroid/app/Activity;

    .line 2803
    .line 2804
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2805
    .line 2806
    .line 2807
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2808
    .line 2809
    check-cast v0, Lbv1;

    .line 2810
    .line 2811
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2812
    .line 2813
    .line 2814
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2815
    .line 2816
    .line 2817
    move-result-object v0

    .line 2818
    sget-object v2, Llk;->α:Ljava/util/List;

    .line 2819
    .line 2820
    if-eqz v2, :cond_1b

    .line 2821
    .line 2822
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 2823
    .line 2824
    .line 2825
    move-result v3

    .line 2826
    if-eqz v3, :cond_1b

    .line 2827
    .line 2828
    const/4 v3, 0x0

    .line 2829
    goto :goto_1d

    .line 2830
    :cond_1b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v2

    .line 2834
    const/4 v3, 0x0

    .line 2835
    :cond_1c
    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2836
    .line 2837
    .line 2838
    move-result v4

    .line 2839
    if-eqz v4, :cond_1e

    .line 2840
    .line 2841
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2842
    .line 2843
    .line 2844
    move-result-object v4

    .line 2845
    check-cast v4, Lmk;

    .line 2846
    .line 2847
    iget-boolean v5, v4, Lmk;->γ:Z

    .line 2848
    .line 2849
    if-eqz v5, :cond_1c

    .line 2850
    .line 2851
    sget-object v5, Lui1;->α:Ljava/lang/Object;

    .line 2852
    .line 2853
    iget-object v4, v4, Lmk;->α:Ljava/lang/String;

    .line 2854
    .line 2855
    invoke-static {v4}, Lui1;->χ(Ljava/lang/String;)Z

    .line 2856
    .line 2857
    .line 2858
    move-result v4

    .line 2859
    if-nez v4, :cond_1c

    .line 2860
    .line 2861
    add-int/lit8 v3, v3, 0x1

    .line 2862
    .line 2863
    if-ltz v3, :cond_1d

    .line 2864
    .line 2865
    goto :goto_1c

    .line 2866
    :cond_1d
    invoke-static {}, Lyh;->ф()V

    .line 2867
    .line 2868
    .line 2869
    const/16 v18, 0x0

    .line 2870
    .line 2871
    throw v18

    .line 2872
    :cond_1e
    :goto_1d
    const-string v2, "comment_control_custom_enabled"

    .line 2873
    .line 2874
    const/4 v8, 0x0

    .line 2875
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2876
    .line 2877
    .line 2878
    move-result v2

    .line 2879
    new-instance v4, Loq1;

    .line 2880
    .line 2881
    const/16 v5, 0xe

    .line 2882
    .line 2883
    invoke-direct {v4, v5}, Loq1;-><init>(I)V

    .line 2884
    .line 2885
    .line 2886
    const-string v5, "\u542f\u7528\u8bc4\u8bba\u533a\u63a7\u4ef6\u7ba1\u7406"

    .line 2887
    .line 2888
    const-string v6, "\u5e94\u7528\u5df2\u4fdd\u5b58\u7684\u8bc4\u8bba\u63a7\u4ef6\u6837\u5f0f"

    .line 2889
    .line 2890
    invoke-static {v1, v5, v6, v2, v4}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 2891
    .line 2892
    .line 2893
    move-result-object v2

    .line 2894
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2895
    .line 2896
    .line 2897
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v2

    .line 2901
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2902
    .line 2903
    .line 2904
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2905
    .line 2906
    const-string v4, "\u70b9\u51fb\u9884\u89c8\u63a7\u4ef6\u8fdb\u884c\u4fee\u6539 \u00b7 \u5df2\u9690\u85cf "

    .line 2907
    .line 2908
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2909
    .line 2910
    .line 2911
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2912
    .line 2913
    .line 2914
    const-string v3, " \u9879"

    .line 2915
    .line 2916
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2917
    .line 2918
    .line 2919
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2920
    .line 2921
    .line 2922
    move-result-object v2

    .line 2923
    new-instance v3, Lg71;

    .line 2924
    .line 2925
    invoke-direct {v3, v1, v12}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 2926
    .line 2927
    .line 2928
    const-string v4, "\u6253\u5f00\u63a7\u4ef6\u7ba1\u7406\u5668"

    .line 2929
    .line 2930
    const-string v5, "\u9884\u89c8\u4e0e\u7f16\u8f91"

    .line 2931
    .line 2932
    invoke-static {v1, v4, v2, v5, v3}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 2933
    .line 2934
    .line 2935
    move-result-object v1

    .line 2936
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2937
    .line 2938
    .line 2939
    return-object v0

    .line 2940
    :pswitch_16
    move-object/from16 v1, p1

    .line 2941
    .line 2942
    check-cast v1, Landroid/app/Activity;

    .line 2943
    .line 2944
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2945
    .line 2946
    .line 2947
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2948
    .line 2949
    check-cast v0, Lbv1;

    .line 2950
    .line 2951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2952
    .line 2953
    .line 2954
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2955
    .line 2956
    .line 2957
    move-result-object v0

    .line 2958
    const-string v2, "live_room_audience_exact_count_enabled"

    .line 2959
    .line 2960
    const/4 v8, 0x0

    .line 2961
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 2962
    .line 2963
    .line 2964
    move-result v2

    .line 2965
    new-instance v3, Loq1;

    .line 2966
    .line 2967
    const/16 v4, 0x1d

    .line 2968
    .line 2969
    invoke-direct {v3, v4}, Loq1;-><init>(I)V

    .line 2970
    .line 2971
    .line 2972
    const-string v4, "\u542f\u7528\u76f4\u64ad\u95f4\u7cbe\u786e\u4eba\u6570\u663e\u793a"

    .line 2973
    .line 2974
    const-string v5, "\u5c06\u76f4\u64ad\u95f4\u9876\u90e8\u5728\u7ebf\u4eba\u6570\u4ece\u300c1\u4e07\u300d\u300c1.2\u4e07\u300d\u7b49\u663e\u793a\u4e3a\u5177\u4f53\u6570\u5b57\uff08\u9700\u91cd\u8fdb\u76f4\u64ad\u95f4\uff09"

    .line 2975
    .line 2976
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 2977
    .line 2978
    .line 2979
    move-result-object v1

    .line 2980
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2981
    .line 2982
    .line 2983
    return-object v0

    .line 2984
    :pswitch_17
    move-object/from16 v1, p1

    .line 2985
    .line 2986
    check-cast v1, Landroid/app/Activity;

    .line 2987
    .line 2988
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2989
    .line 2990
    .line 2991
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 2992
    .line 2993
    check-cast v0, Lbv1;

    .line 2994
    .line 2995
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2996
    .line 2997
    .line 2998
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    const-string v2, "feed_follow_confirm_enabled"

    .line 3003
    .line 3004
    const/4 v8, 0x0

    .line 3005
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3006
    .line 3007
    .line 3008
    move-result v2

    .line 3009
    new-instance v3, Loq1;

    .line 3010
    .line 3011
    const/16 v4, 0x1a

    .line 3012
    .line 3013
    invoke-direct {v3, v4}, Loq1;-><init>(I)V

    .line 3014
    .line 3015
    .line 3016
    const-string v4, "\u542f\u7528Feed\u5173\u6ce8\u4e8c\u6b21\u786e\u8ba4"

    .line 3017
    .line 3018
    const-string v5, "\u53ea\u62e6\u622a\u89c6\u9891\u6d41\u4e2d\u7684\u5173\u6ce8\u8bf7\u6c42\uff0c\u70b9\u51fb\u5173\u6ce8\u540e\u9700\u8981\u518d\u6b21\u786e\u8ba4\u624d\u4f1a\u63d0\u4ea4"

    .line 3019
    .line 3020
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v2

    .line 3024
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3025
    .line 3026
    .line 3027
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3028
    .line 3029
    .line 3030
    move-result-object v2

    .line 3031
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3032
    .line 3033
    .line 3034
    const-string v2, "\u9700\u8981\u91cd\u542f\u6296\u97f3\u751f\u6548\uff1b\u4e2a\u4eba\u4e3b\u9875\u7b49\u975eFeed\u5165\u53e3\u4e0d\u62e6\u622a"

    .line 3035
    .line 3036
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3037
    .line 3038
    .line 3039
    move-result-object v1

    .line 3040
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3041
    .line 3042
    .line 3043
    return-object v0

    .line 3044
    :pswitch_18
    move-object/from16 v1, p1

    .line 3045
    .line 3046
    check-cast v1, Landroid/app/Activity;

    .line 3047
    .line 3048
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3049
    .line 3050
    .line 3051
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 3052
    .line 3053
    check-cast v0, Lbv1;

    .line 3054
    .line 3055
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3056
    .line 3057
    .line 3058
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 3059
    .line 3060
    .line 3061
    move-result-object v0

    .line 3062
    invoke-static {}, Lbv1;->ψ()Ljava/util/List;

    .line 3063
    .line 3064
    .line 3065
    move-result-object v2

    .line 3066
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 3067
    .line 3068
    .line 3069
    move-result v3

    .line 3070
    if-eqz v3, :cond_1f

    .line 3071
    .line 3072
    const/4 v8, 0x0

    .line 3073
    goto :goto_1f

    .line 3074
    :cond_1f
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3075
    .line 3076
    .line 3077
    move-result-object v2

    .line 3078
    const/4 v3, 0x0

    .line 3079
    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 3080
    .line 3081
    .line 3082
    move-result v4

    .line 3083
    if-eqz v4, :cond_22

    .line 3084
    .line 3085
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v4

    .line 3089
    check-cast v4, Lku1;

    .line 3090
    .line 3091
    iget-object v4, v4, Lku1;->α:Ljava/lang/String;

    .line 3092
    .line 3093
    const-string v5, "feed_right_control_hide_"

    .line 3094
    .line 3095
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3096
    .line 3097
    .line 3098
    move-result-object v4

    .line 3099
    const/4 v8, 0x0

    .line 3100
    invoke-static {v4, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3101
    .line 3102
    .line 3103
    move-result v4

    .line 3104
    if-eqz v4, :cond_21

    .line 3105
    .line 3106
    add-int/lit8 v3, v3, 0x1

    .line 3107
    .line 3108
    if-ltz v3, :cond_20

    .line 3109
    .line 3110
    goto :goto_1e

    .line 3111
    :cond_20
    invoke-static {}, Lyh;->ф()V

    .line 3112
    .line 3113
    .line 3114
    const/16 v18, 0x0

    .line 3115
    .line 3116
    throw v18

    .line 3117
    :cond_21
    const/16 v18, 0x0

    .line 3118
    .line 3119
    goto :goto_1e

    .line 3120
    :cond_22
    move v8, v3

    .line 3121
    :goto_1f
    if-lez v8, :cond_23

    .line 3122
    .line 3123
    const-string v2, "\u5df2\u9690\u85cf "

    .line 3124
    .line 3125
    const-string v3, " \u9879"

    .line 3126
    .line 3127
    invoke-static {v2, v8, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 3128
    .line 3129
    .line 3130
    move-result-object v2

    .line 3131
    goto :goto_20

    .line 3132
    :cond_23
    const-string v2, "\u672a\u9690\u85cf"

    .line 3133
    .line 3134
    :goto_20
    new-instance v3, Lg71;

    .line 3135
    .line 3136
    const/16 v4, 0x1a

    .line 3137
    .line 3138
    invoke-direct {v3, v1, v4}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 3139
    .line 3140
    .line 3141
    const-string v4, "\u6253\u5f00\u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d\u8bbe\u7f6e"

    .line 3142
    .line 3143
    const-string v5, "\u4f7f\u7528 XML \u5217\u8868\u9009\u62e9\u8981\u9690\u85cf\u7684\u53f3\u4fa7\u63a7\u4ef6\uff1b\u4f18\u5148\u6309\u6a21\u5757\u548c\u5934\u50cf\u6269\u5c55\u8fc7\u6ee4"

    .line 3144
    .line 3145
    invoke-static {v1, v4, v2, v5, v3}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3146
    .line 3147
    .line 3148
    move-result-object v2

    .line 3149
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3150
    .line 3151
    .line 3152
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3153
    .line 3154
    .line 3155
    move-result-object v2

    .line 3156
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3157
    .line 3158
    .line 3159
    const-string v2, "\u8fc7\u6ee4\u94fe\u8def\uff1a\u6a21\u5757 visibility + \u5934\u50cf PresenterGroup \u6269\u5c55\u8fc7\u6ee4\uff1b\u5c3d\u91cf\u4e0d\u4f7f\u7528\u5168\u5c40 View \u626b\u63cf"

    .line 3160
    .line 3161
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3162
    .line 3163
    .line 3164
    move-result-object v1

    .line 3165
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3166
    .line 3167
    .line 3168
    return-object v0

    .line 3169
    :pswitch_19
    move-object/from16 v1, p1

    .line 3170
    .line 3171
    check-cast v1, Landroid/app/Activity;

    .line 3172
    .line 3173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3174
    .line 3175
    .line 3176
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 3177
    .line 3178
    check-cast v0, Lbv1;

    .line 3179
    .line 3180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3181
    .line 3182
    .line 3183
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 3184
    .line 3185
    .line 3186
    move-result-object v0

    .line 3187
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 3188
    .line 3189
    .line 3190
    move-result v2

    .line 3191
    if-nez v2, :cond_24

    .line 3192
    .line 3193
    const-string v0, "\u53f3\u4fa7\u6309\u94ae\u7ba1\u7406\u5668\u662f\u5185\u6d4b\u529f\u80fd\uff0c\u9700\u8981\u5185\u6d4b\u8d44\u683c\u624d\u80fd\u4f7f\u7528"

    .line 3194
    .line 3195
    invoke-static {v1, v0}, Lbv1;->η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 3196
    .line 3197
    .line 3198
    move-result-object v0

    .line 3199
    goto :goto_21

    .line 3200
    :cond_24
    const-string v2, "feed_right_dislike_button_enabled"

    .line 3201
    .line 3202
    const/4 v8, 0x0

    .line 3203
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3204
    .line 3205
    .line 3206
    move-result v2

    .line 3207
    new-instance v3, Lct1;

    .line 3208
    .line 3209
    const/16 v10, 0xd

    .line 3210
    .line 3211
    invoke-direct {v3, v1, v10}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 3212
    .line 3213
    .line 3214
    const-string v4, "\u542f\u7528\u53f3\u4fa7\u4e0d\u611f\u5174\u8da3\u6309\u94ae"

    .line 3215
    .line 3216
    const-string v5, "\u5728\u89c6\u9891\u53f3\u4fa7\u64cd\u4f5c\u680f\u6dfb\u52a0\u4e00\u4e2a\u5feb\u901f\u6807\u8bb0\u300c\u4e0d\u611f\u5174\u8da3\u300d\u7684\u6309\u94ae"

    .line 3217
    .line 3218
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3219
    .line 3220
    .line 3221
    move-result-object v2

    .line 3222
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3223
    .line 3224
    .line 3225
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3226
    .line 3227
    .line 3228
    move-result-object v2

    .line 3229
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3230
    .line 3231
    .line 3232
    const-string v2, "feed_right_auto_scroll_button_enabled"

    .line 3233
    .line 3234
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3235
    .line 3236
    .line 3237
    move-result v2

    .line 3238
    new-instance v3, Lct1;

    .line 3239
    .line 3240
    const/16 v4, 0xe

    .line 3241
    .line 3242
    invoke-direct {v3, v1, v4}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 3243
    .line 3244
    .line 3245
    const-string v4, "\u542f\u7528\u53f3\u4fa7\u81ea\u52a8\u8fde\u64ad\u5f00\u5173"

    .line 3246
    .line 3247
    const-string v5, "\u5728\u89c6\u9891\u53f3\u4fa7\u64cd\u4f5c\u680f\u6dfb\u52a0\u8fde\u64ad\u6309\u94ae\uff1b\u5f00\u542f\u65f6\u6309\u94ae\u4e3a\u84dd\u8272\uff0c\u5173\u95ed\u65f6\u4e3a\u767d\u8272"

    .line 3248
    .line 3249
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3250
    .line 3251
    .line 3252
    move-result-object v2

    .line 3253
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3254
    .line 3255
    .line 3256
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v2

    .line 3260
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3261
    .line 3262
    .line 3263
    const-string v2, "\u6309\u94ae\u663e\u793a\u72b6\u6001\u9700\u8981\u91cd\u542f\u6296\u97f3\u6216\u91cd\u65b0\u8fdb\u5165\u89c6\u9891\u6d41\u751f\u6548\uff1b\u53f3\u4fa7\u8fde\u64ad\u6309\u94ae\u70b9\u51fb\u540e\u4f1a\u76f4\u63a5\u5207\u6362\u300c\u81ea\u52a8\u4e0b\u6ed1\u300d\u5f00\u5173"

    .line 3264
    .line 3265
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3266
    .line 3267
    .line 3268
    move-result-object v1

    .line 3269
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3270
    .line 3271
    .line 3272
    :goto_21
    return-object v0

    .line 3273
    :pswitch_1a
    move-object/from16 v1, p1

    .line 3274
    .line 3275
    check-cast v1, Landroid/app/Activity;

    .line 3276
    .line 3277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3278
    .line 3279
    .line 3280
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 3281
    .line 3282
    check-cast v0, Lbv1;

    .line 3283
    .line 3284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3285
    .line 3286
    .line 3287
    const-string v0, "offline_cache_count_enabled"

    .line 3288
    .line 3289
    const/4 v8, 0x0

    .line 3290
    invoke-static {v0, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3291
    .line 3292
    .line 3293
    move-result v0

    .line 3294
    const-string v2, "offline_cache_count"

    .line 3295
    .line 3296
    :try_start_12
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 3297
    .line 3298
    .line 3299
    move-result-object v3

    .line 3300
    invoke-interface {v3, v2, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 3301
    .line 3302
    .line 3303
    move-result v6
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 3304
    :catchall_12
    const/16 v2, 0x1f4

    .line 3305
    .line 3306
    const/16 v10, 0xa

    .line 3307
    .line 3308
    invoke-static {v6, v10, v2}, Lj81;->μ(III)I

    .line 3309
    .line 3310
    .line 3311
    move-result v2

    .line 3312
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 3313
    .line 3314
    .line 3315
    move-result-object v3

    .line 3316
    new-instance v4, Loq1;

    .line 3317
    .line 3318
    const/16 v5, 0xf

    .line 3319
    .line 3320
    invoke-direct {v4, v5}, Loq1;-><init>(I)V

    .line 3321
    .line 3322
    .line 3323
    const-string v5, "\u542f\u7528\u81ea\u5b9a\u4e49\u79bb\u7ebf\u7f13\u5b58\u6570\u91cf"

    .line 3324
    .line 3325
    const-string v6, "\u8986\u76d6\u5bbf\u4e3b\u56fa\u5b9a\u6570\u91cf\u6863\u4f4d\uff0c\u5e76\u4fdd\u7559\u5bbf\u4e3b\u539f\u751f\u7f13\u5b58\u7ba1\u7406\u6d41\u7a0b"

    .line 3326
    .line 3327
    invoke-static {v1, v5, v6, v0, v4}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3328
    .line 3329
    .line 3330
    move-result-object v0

    .line 3331
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3332
    .line 3333
    .line 3334
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3335
    .line 3336
    .line 3337
    move-result-object v0

    .line 3338
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3339
    .line 3340
    .line 3341
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3342
    .line 3343
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3344
    .line 3345
    .line 3346
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3347
    .line 3348
    .line 3349
    const-string v2, " \u6761"

    .line 3350
    .line 3351
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3352
    .line 3353
    .line 3354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3355
    .line 3356
    .line 3357
    move-result-object v0

    .line 3358
    new-instance v2, Lg71;

    .line 3359
    .line 3360
    invoke-direct {v2, v1, v14}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 3361
    .line 3362
    .line 3363
    const-string v4, "\u7f13\u5b58\u89c6\u9891\u6570\u91cf"

    .line 3364
    .line 3365
    const-string v5, "\u8f93\u5165 10~500\uff1b\u5728\u5bbf\u4e3b\u79bb\u7ebf\u7f13\u5b58\u8bbe\u7f6e\u4e2d\u8c03\u6574\u6570\u91cf\u65f6\u751f\u6548"

    .line 3366
    .line 3367
    invoke-static {v1, v4, v0, v5, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3368
    .line 3369
    .line 3370
    move-result-object v0

    .line 3371
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3372
    .line 3373
    .line 3374
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3375
    .line 3376
    .line 3377
    move-result-object v0

    .line 3378
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3379
    .line 3380
    .line 3381
    const-string v0, "\u542f\u7528\u540e\u91cd\u542f\u6296\u97f3\uff1b\u968f\u540e\u5728\u79bb\u7ebf\u7f13\u5b58\u8bbe\u7f6e\u4e2d\u9009\u62e9\u4efb\u4e00\u6570\u91cf\uff0c\u5bbf\u4e3b\u4f1a\u6309\u81ea\u5b9a\u4e49\u503c\u6e05\u7a7a\u65e7\u7f13\u5b58\u5e76\u91cd\u65b0\u4e0b\u8f7d"

    .line 3382
    .line 3383
    invoke-static {v1, v0}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3384
    .line 3385
    .line 3386
    move-result-object v0

    .line 3387
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3388
    .line 3389
    .line 3390
    return-object v3

    .line 3391
    :pswitch_1b
    move-object/from16 v12, p1

    .line 3392
    .line 3393
    check-cast v12, Landroid/app/Activity;

    .line 3394
    .line 3395
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3396
    .line 3397
    .line 3398
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 3399
    .line 3400
    check-cast v0, Lbv1;

    .line 3401
    .line 3402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3403
    .line 3404
    .line 3405
    invoke-static {v12}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 3406
    .line 3407
    .line 3408
    move-result-object v0

    .line 3409
    new-instance v1, Lqm1;

    .line 3410
    .line 3411
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3412
    .line 3413
    .line 3414
    const-string v2, "feed_enable_preload"

    .line 3415
    .line 3416
    const/4 v8, 0x0

    .line 3417
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3418
    .line 3419
    .line 3420
    move-result v2

    .line 3421
    iput-boolean v2, v1, Lqm1;->ε:Z

    .line 3422
    .line 3423
    new-instance v3, Lcc;

    .line 3424
    .line 3425
    const/16 v4, 0x9

    .line 3426
    .line 3427
    invoke-direct {v3, v4, v1}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 3428
    .line 3429
    .line 3430
    const-string v1, "\u542f\u7528Feed\u6d41\u9884\u52a0\u8f7d"

    .line 3431
    .line 3432
    const-string v4, "\u63a7\u5236\u6296\u97f3\u89c6\u9891\u6d41\u7684\u9884\u52a0\u8f7d\u884c\u4e3a\uff0c\u5173\u95ed\u53ef\u8282\u7701\u6d41\u91cf\u548c\u5185\u5b58"

    .line 3433
    .line 3434
    invoke-static {v12, v1, v4, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3435
    .line 3436
    .line 3437
    move-result-object v1

    .line 3438
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 3439
    .line 3440
    .line 3441
    const-string v1, "feed_preload_count"

    .line 3442
    .line 3443
    :try_start_13
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 3444
    .line 3445
    .line 3446
    move-result-object v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 3447
    const/4 v4, 0x2

    .line 3448
    :try_start_14
    invoke-interface {v2, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 3449
    .line 3450
    .line 3451
    move-result v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 3452
    :goto_22
    const/4 v8, 0x0

    .line 3453
    const/16 v13, 0x8

    .line 3454
    .line 3455
    goto :goto_23

    .line 3456
    :catchall_13
    const/4 v4, 0x2

    .line 3457
    :catchall_14
    move v1, v4

    .line 3458
    goto :goto_22

    .line 3459
    :goto_23
    invoke-static {v1, v8, v13}, Lj81;->μ(III)I

    .line 3460
    .line 3461
    .line 3462
    move-result v14

    .line 3463
    new-instance v1, Lnq1;

    .line 3464
    .line 3465
    const/16 v2, 0x1d

    .line 3466
    .line 3467
    invoke-direct {v1, v2}, Lnq1;-><init>(I)V

    .line 3468
    .line 3469
    .line 3470
    const-string v13, "\u9884\u52a0\u8f7d\u6570\u91cf"

    .line 3471
    .line 3472
    const/16 v15, 0x8

    .line 3473
    .line 3474
    const/16 v16, 0x0

    .line 3475
    .line 3476
    const-string v17, "\u4e2a"

    .line 3477
    .line 3478
    const-string v18, "\u540c\u65f6\u9884\u52a0\u8f7d\u7684\u89c6\u9891\u6570\u91cf\uff080=\u7981\u7528\u9884\u52a0\u8f7d\uff0c1-8=\u81ea\u5b9a\u4e49\u6570\u91cf\uff09"

    .line 3479
    .line 3480
    move-object/from16 v19, v1

    .line 3481
    .line 3482
    invoke-static/range {v12 .. v19}, Lbv1;->π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3483
    .line 3484
    .line 3485
    move-result-object v1

    .line 3486
    invoke-static {v0, v1, v12}, Lnx;->υ(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 3487
    .line 3488
    .line 3489
    const-string v1, "\u8d85\u6e05"

    .line 3490
    .line 3491
    const-string v2, "\u6781\u6e05"

    .line 3492
    .line 3493
    const-string v3, "\u6807\u6e05"

    .line 3494
    .line 3495
    const-string v4, "\u9ad8\u6e05"

    .line 3496
    .line 3497
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 3498
    .line 3499
    .line 3500
    move-result-object v1

    .line 3501
    new-instance v2, Lsm1;

    .line 3502
    .line 3503
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 3504
    .line 3505
    .line 3506
    const-string v3, "feed_preload_quality"

    .line 3507
    .line 3508
    :try_start_15
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 3509
    .line 3510
    .line 3511
    move-result-object v4

    .line 3512
    invoke-interface {v4, v3, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 3513
    .line 3514
    .line 3515
    move-result v7
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    .line 3516
    :catchall_15
    const/4 v8, 0x0

    .line 3517
    invoke-static {v7, v8, v11}, Lj81;->μ(III)I

    .line 3518
    .line 3519
    .line 3520
    move-result v3

    .line 3521
    iput v3, v2, Lsm1;->ε:I

    .line 3522
    .line 3523
    aget-object v3, v1, v3

    .line 3524
    .line 3525
    new-instance v4, Lm3;

    .line 3526
    .line 3527
    const/16 v5, 0x9

    .line 3528
    .line 3529
    invoke-direct {v4, v12, v1, v2, v5}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 3530
    .line 3531
    .line 3532
    const-string v1, "\u9884\u52a0\u8f7d\u6e05\u6670\u5ea6"

    .line 3533
    .line 3534
    const-string v2, "\u9009\u62e9\u9884\u52a0\u8f7d\u89c6\u9891\u7684\u6e05\u6670\u5ea6\u7b49\u7ea7"

    .line 3535
    .line 3536
    invoke-static {v12, v1, v3, v2, v4}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3537
    .line 3538
    .line 3539
    move-result-object v1

    .line 3540
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3541
    .line 3542
    .line 3543
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3544
    .line 3545
    .line 3546
    move-result-object v1

    .line 3547
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3548
    .line 3549
    .line 3550
    const-string v1, "feed_preload_debug_log"

    .line 3551
    .line 3552
    const/4 v8, 0x0

    .line 3553
    invoke-static {v1, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3554
    .line 3555
    .line 3556
    move-result v1

    .line 3557
    new-instance v2, Loq1;

    .line 3558
    .line 3559
    const/16 v3, 0xb

    .line 3560
    .line 3561
    invoke-direct {v2, v3}, Loq1;-><init>(I)V

    .line 3562
    .line 3563
    .line 3564
    const-string v3, "\u8c03\u8bd5\u65e5\u5fd7"

    .line 3565
    .line 3566
    const-string v4, "\u5f00\u542f\u540e\u4f1a\u5728Dylog\u65e5\u5fd7\u4e2d\u8f93\u51fa\u9884\u52a0\u8f7d\u76f8\u5173\u8c03\u8bd5\u4fe1\u606f"

    .line 3567
    .line 3568
    invoke-static {v12, v3, v4, v1, v2}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3569
    .line 3570
    .line 3571
    move-result-object v1

    .line 3572
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3573
    .line 3574
    .line 3575
    invoke-static {v12}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3576
    .line 3577
    .line 3578
    move-result-object v1

    .line 3579
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3580
    .line 3581
    .line 3582
    const-string v1, "\u4fee\u6539\u540e\u5207\u6362\u89c6\u9891\u9875\u9762\u751f\u6548\u3002\u964d\u4f4e\u9884\u52a0\u8f7d\u6570\u91cf\u6216\u5173\u95ed\u9884\u52a0\u8f7d\u53ef\u4ee5\u8282\u7701\u6d41\u91cf\u548c\u5185\u5b58\u5360\u7528"

    .line 3583
    .line 3584
    invoke-static {v12, v1}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3585
    .line 3586
    .line 3587
    move-result-object v1

    .line 3588
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3589
    .line 3590
    .line 3591
    return-object v0

    .line 3592
    :pswitch_1c
    move-object/from16 v1, p1

    .line 3593
    .line 3594
    check-cast v1, Landroid/app/Activity;

    .line 3595
    .line 3596
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3597
    .line 3598
    .line 3599
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 3600
    .line 3601
    check-cast v0, Lbv1;

    .line 3602
    .line 3603
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3604
    .line 3605
    .line 3606
    invoke-static {v1}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 3607
    .line 3608
    .line 3609
    move-result-object v0

    .line 3610
    const-string v2, "double_tap_menu_enabled"

    .line 3611
    .line 3612
    const/4 v8, 0x0

    .line 3613
    invoke-static {v2, v8}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3614
    .line 3615
    .line 3616
    move-result v3

    .line 3617
    if-eqz v3, :cond_25

    .line 3618
    .line 3619
    invoke-static {v2, v8}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 3620
    .line 3621
    .line 3622
    :cond_25
    new-instance v2, Ljt1;

    .line 3623
    .line 3624
    invoke-direct {v2, v1, v9}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 3625
    .line 3626
    .line 3627
    const-string v3, "Feed\u6d41\u624b\u52bf\u914d\u7f6e"

    .line 3628
    .line 3629
    const-string v4, "\u70b9\u51fb\u914d\u7f6e\u4e0d\u540c\u533a\u57df\u7684\u53cc\u51fb/\u957f\u6309\u52a8\u4f5c"

    .line 3630
    .line 3631
    const-string v5, "\u914d\u7f6e\u540e\u4f1a\u4e3b\u52a8\u62e6\u622a\u539f\u751f\u53cc\u51fb\u70b9\u8d5e / \u957f\u6309\u9762\u677f"

    .line 3632
    .line 3633
    invoke-static {v1, v3, v4, v5, v2}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3634
    .line 3635
    .line 3636
    move-result-object v2

    .line 3637
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3638
    .line 3639
    .line 3640
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3641
    .line 3642
    .line 3643
    move-result-object v2

    .line 3644
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3645
    .line 3646
    .line 3647
    const-string v2, "\u63d0\u793a\uff1a\u533a\u57df\u53cc\u51fb\u914d\u7f6e\u540e\uff0c\u6a21\u5757\u4f1a\u4f18\u5148\u63a5\u7ba1\u53cc\u51fb\u5e76\u62e6\u622a\u539f\u751f\u53cc\u51fb\u70b9\u8d5e\uff1b\u533a\u57df\u957f\u6309\u914d\u7f6e\u540e\uff0c\u4f1a\u62e6\u622a\u539f\u751f\u957f\u6309\u9762\u677f\u3002\u82e5\u60f3\u4fdd\u7559\u539f\u751f\u903b\u8f91\uff0c\u8bf7\u628a\u5bf9\u5e94\u52a8\u4f5c\u8bbe\u4e3a\u300c\u65e0\u300d\u3002"

    .line 3648
    .line 3649
    invoke-static {v1, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 3650
    .line 3651
    .line 3652
    move-result-object v2

    .line 3653
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3654
    .line 3655
    .line 3656
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3657
    .line 3658
    .line 3659
    move-result-object v2

    .line 3660
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3661
    .line 3662
    .line 3663
    const-string v2, "volume_key_enabled"

    .line 3664
    .line 3665
    invoke-static {v2, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3666
    .line 3667
    .line 3668
    move-result v2

    .line 3669
    new-instance v3, Lct1;

    .line 3670
    .line 3671
    const/16 v4, 0xf

    .line 3672
    .line 3673
    invoke-direct {v3, v1, v4}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 3674
    .line 3675
    .line 3676
    const-string v4, "\u97f3\u91cf\u952e\u7ec4\u5408"

    .line 3677
    .line 3678
    const-string v5, "\u5148\u6309\u97f3\u91cf+\u518d\u6309\u97f3\u91cf-\u5feb\u901f\u5524\u51fa\u64cd\u4f5c\u83dc\u5355"

    .line 3679
    .line 3680
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3681
    .line 3682
    .line 3683
    move-result-object v2

    .line 3684
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3685
    .line 3686
    .line 3687
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3688
    .line 3689
    .line 3690
    move-result-object v2

    .line 3691
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3692
    .line 3693
    .line 3694
    const-string v2, "share_panel_enabled"

    .line 3695
    .line 3696
    invoke-static {v2, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 3697
    .line 3698
    .line 3699
    move-result v2

    .line 3700
    new-instance v3, Lct1;

    .line 3701
    .line 3702
    const/16 v13, 0x10

    .line 3703
    .line 3704
    invoke-direct {v3, v1, v13}, Lct1;-><init>(Landroid/app/Activity;I)V

    .line 3705
    .line 3706
    .line 3707
    const-string v4, "\u5206\u4eab\u754c\u9762\u6ce8\u5165"

    .line 3708
    .line 3709
    const-string v5, "\u5728\u5206\u4eab\u9762\u677f\u4e2d\u6dfb\u52a0 DY Helper \u4e0b\u8f7d\u6309\u94ae"

    .line 3710
    .line 3711
    invoke-static {v1, v4, v5, v2, v3}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 3712
    .line 3713
    .line 3714
    move-result-object v2

    .line 3715
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3716
    .line 3717
    .line 3718
    invoke-static {v1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 3719
    .line 3720
    .line 3721
    move-result-object v2

    .line 3722
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3723
    .line 3724
    .line 3725
    invoke-static {}, Lbv1;->Κ()Ljava/lang/String;

    .line 3726
    .line 3727
    .line 3728
    move-result-object v2

    .line 3729
    new-instance v3, Ljt1;

    .line 3730
    .line 3731
    const/4 v6, 0x6

    .line 3732
    invoke-direct {v3, v1, v6}, Ljt1;-><init>(Landroid/app/Activity;I)V

    .line 3733
    .line 3734
    .line 3735
    const-string v4, "\u914d\u7f6e\u5206\u4eab\u5feb\u6377\u6309\u94ae"

    .line 3736
    .line 3737
    const-string v5, "\u9009\u62e9\u8981\u5728\u5206\u4eab\u9762\u677f\u663e\u793a\u7684\u6b63\u5f0f\u64cd\u4f5c\uff1b\u5b8c\u6574\u83dc\u5355\u5165\u53e3\u59cb\u7ec8\u4fdd\u7559"

    .line 3738
    .line 3739
    invoke-static {v1, v4, v2, v5, v3}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 3740
    .line 3741
    .line 3742
    move-result-object v1

    .line 3743
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3744
    .line 3745
    .line 3746
    return-object v0

    .line 3747
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
