.class public final synthetic Lwb/jo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/jo;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/jo;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/jo;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "comment_self"

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lwb/jo;->i:Li0/a1;

    .line 15
    .line 16
    iget-object v3, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    invoke-static {v2, p1, v3, v1, v0}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 25
    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lwb/jo;->i:Li0/a1;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 37
    .line 38
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception v1

    .line 62
    new-instance v2, Lsf/f;

    .line 63
    .line 64
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v1, v2

    .line 68
    :goto_2
    instance-of v1, v1, Lsf/f;

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 73
    .line 74
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_1
    move-object v0, p1

    .line 94
    :goto_3
    const-string p1, "comment_time_format"

    .line 95
    .line 96
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 101
    .line 102
    .line 103
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v0, p0, Lwb/jo;->i:Li0/a1;

    .line 109
    .line 110
    iget-object v1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 111
    .line 112
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "comment_content"

    .line 117
    .line 118
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget-object v1, p0, Lwb/jo;->i:Li0/a1;

    .line 133
    .line 134
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 138
    .line 139
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v1, "comment_enable"

    .line 144
    .line 145
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 152
    .line 153
    .line 154
    move-result-wide v0

    .line 155
    const-wide/16 v2, 0x3e8

    .line 156
    .line 157
    div-long/2addr v0, v2

    .line 158
    goto :goto_4

    .line 159
    :cond_3
    const-wide/16 v0, 0x0

    .line 160
    .line 161
    :goto_4
    const-string v2, "comment_enabled_at_seconds"

    .line 162
    .line 163
    invoke-interface {p1, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_1

    .line 171
    .line 172
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    const-string v1, "comment_log_enable"

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v0, p0, Lwb/jo;->i:Li0/a1;

    .line 185
    .line 186
    iget-object v1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const-string v1, "comment_exclude_keywords_video_text"

    .line 193
    .line 194
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    const-string v1, "comment_keyword_video"

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 214
    .line 215
    iget-object v0, p0, Lwb/jo;->i:Li0/a1;

    .line 216
    .line 217
    iget-object v1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 218
    .line 219
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    const-string v1, "comment_exclude_keywords_image_text"

    .line 224
    .line 225
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    const-string v1, "comment_keyword_image"

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 245
    .line 246
    iget-object v0, p0, Lwb/jo;->i:Li0/a1;

    .line 247
    .line 248
    iget-object v1, p0, Lwb/jo;->h:Landroid/content/SharedPreferences;

    .line 249
    .line 250
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-string v1, "comment_exclude_keywords_text"

    .line 255
    .line 256
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    const-string v1, "comment_keyword_text"

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    const-string v1, "comment_allow_video"

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const-string v1, "comment_allow_image"

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    const-string v1, "comment_allow_text"

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :pswitch_data_0
    .packed-switch 0x0
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
