.class public final Lk6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6;->a:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, Lk6;->b:Landroid/app/Dialog;

    .line 7
    .line 8
    iput-object p3, p0, Lk6;->c:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lk6;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lk6;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lk6;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    :try_start_0
    iget-object v0, p0, Lk6;->b:Landroid/app/Dialog;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :catchall_0
    iget-object v0, p0, Lk6;->c:Landroid/app/Activity;

    .line 30
    .line 31
    const-string v1, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=member uin unresolved target="

    .line 32
    .line 33
    const-string v2, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=oidb submit unresolved groupUin="

    .line 34
    .line 35
    const-string v3, "\u8bbe\u7f6e\u5934\u8854, titleLen="

    .line 36
    .line 37
    const-string v4, "group action submitted type=\u8bbe\u7f6e\u5934\u8854 groupUin="

    .line 38
    .line 39
    iget-object v5, p0, Lk6;->d:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v5, :cond_a

    .line 42
    .line 43
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    iget-object p0, p0, Lk6;->e:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz p0, :cond_9

    .line 54
    .line 55
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_2
    invoke-static {v0}, Ls6;->H(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v0, p0}, Ls6;->i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_8

    .line 76
    .line 77
    const-string v8, "u_"

    .line 78
    .line 79
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_3

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_3
    invoke-static {v0, v6, v5, v7, p1}, Ls6;->o0(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    const-string v1, " targetUin="

    .line 92
    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    :try_start_3
    invoke-static {v0}, Ls6;->q(Landroid/app/Activity;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v2, 0x0

    .line 104
    if-lez v0, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_4

    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    goto :goto_1

    .line 114
    :catchall_1
    move-exception p0

    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :cond_4
    move p0, v2

    .line 118
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, " titleLen="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    if-nez p1, :cond_5

    .line 138
    .line 139
    move v1, v2

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, " targetSelf="

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string p0, "avatar-action"

    .line 164
    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    if-nez p1, :cond_6

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v5, v7, p0, p1}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string p0, "\u5df2\u63d0\u4ea4\u5934\u8854\u8bbe\u7f6e"

    .line 188
    .line 189
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string p0, "\u672a\u627e\u5230 QQ \u5934\u8854\u63d0\u4ea4\u63a5\u53e3"

    .line 215
    .line 216
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_8
    :goto_4
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string p0, "\u672a\u83b7\u53d6\u5230\u6210\u5458 QQ \u53f7"

    .line 228
    .line 229
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_9
    :goto_5
    const-string p0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=missing targetUin"

    .line 234
    .line 235
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const-string p0, "\u672a\u83b7\u53d6\u5230\u6210\u5458 UID"

    .line 239
    .line 240
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_a
    :goto_6
    const-string p0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=missing groupUin"

    .line 245
    .line 246
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const-string p0, "\u672a\u83b7\u53d6\u5230\u7fa4\u53f7"

    .line 250
    .line 251
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 252
    .line 253
    .line 254
    goto :goto_8

    .line 255
    :goto_7
    invoke-static {p0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    new-instance p1, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason="

    .line 262
    .line 263
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    const-string v0, ": "

    .line 267
    .line 268
    invoke-static {p0, p1, v0}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string p1, "member-title-action"

    .line 272
    .line 273
    invoke-static {v5, p1, p0}, Li5;->Z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    :goto_8
    return-void
.end method
