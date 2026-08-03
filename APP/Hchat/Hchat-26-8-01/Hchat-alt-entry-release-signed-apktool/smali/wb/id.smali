.class public final synthetic Lwb/id;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/id;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/id;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/id;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/id;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/id;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/id;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/id;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lwb/id;->j:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-string v2, "${sendText}"

    .line 19
    .line 20
    iget-object v3, p0, Lwb/id;->h:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v4, p0, Lwb/id;->k:Li0/a1;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move v6, v5

    .line 37
    move v7, v6

    .line 38
    :goto_0
    const/4 v8, 0x4

    .line 39
    invoke-static {v0, v2, v6, v5, v8}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-gez v6, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    if-eq v7, v0, :cond_1

    .line 47
    .line 48
    const-string v0, "\u6587\u672c\u683c\u5f0f\u5fc5\u987b\u4e14\u53ea\u80fd\u5305\u542b\u4e00\u4e2a\u539f\u6d88\u606f\u53d8\u91cf"

    .line 49
    .line 50
    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    add-int/lit8 v6, v6, 0xb

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v6, p0, Lwb/id;->l:Li0/a1;

    .line 75
    .line 76
    const-string v7, "HH:mm:ss"

    .line 77
    .line 78
    const-string v8, ""

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/String;

    .line 87
    .line 88
    :try_start_0
    new-instance v9, Ljava/text/SimpleDateFormat;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    move-object v0, v8

    .line 93
    :cond_2
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_3

    .line 106
    .line 107
    move-object v0, v7

    .line 108
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-direct {v9, v0, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    new-instance v9, Lsf/f;

    .line 118
    .line 119
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :goto_1
    instance-of v0, v9, Lsf/f;

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    const-string v0, "\u65f6\u95f4\u683c\u5f0f\u65e0\u6548"

    .line 127
    .line 128
    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :cond_4
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/String;

    .line 142
    .line 143
    if-nez v0, :cond_5

    .line 144
    .line 145
    move-object v0, v8

    .line 146
    :cond_5
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_6

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    move-object v2, v0

    .line 154
    :goto_2
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Ljava/lang/String;

    .line 162
    .line 163
    if-nez v0, :cond_7

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    move-object v8, v0

    .line 167
    :goto_3
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    move-object v7, v0

    .line 183
    :goto_4
    invoke-interface {v6, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lwb/id;->i:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const-string v2, "message_affix_enable"

    .line 203
    .line 204
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/String;

    .line 213
    .line 214
    const-string v2, "message_affix_text_format"

    .line 215
    .line 216
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/String;

    .line 225
    .line 226
    const-string v2, "message_affix_time_format"

    .line 227
    .line 228
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 233
    .line 234
    .line 235
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 236
    .line 237
    invoke-static {v3, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 242
    .line 243
    .line 244
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_0
    new-instance v0, Landroid/os/Handler;

    .line 248
    .line 249
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 254
    .line 255
    .line 256
    new-instance v2, Lca/x;

    .line 257
    .line 258
    const/16 v8, 0xe

    .line 259
    .line 260
    iget-object v3, p0, Lwb/id;->h:Landroid/content/Context;

    .line 261
    .line 262
    iget-object v4, p0, Lwb/id;->i:Landroid/content/SharedPreferences;

    .line 263
    .line 264
    iget-object v5, p0, Lwb/id;->j:Li0/a1;

    .line 265
    .line 266
    iget-object v6, p0, Lwb/id;->k:Li0/a1;

    .line 267
    .line 268
    iget-object v7, p0, Lwb/id;->l:Li0/a1;

    .line 269
    .line 270
    invoke-direct/range {v2 .. v8}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 274
    .line 275
    .line 276
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
