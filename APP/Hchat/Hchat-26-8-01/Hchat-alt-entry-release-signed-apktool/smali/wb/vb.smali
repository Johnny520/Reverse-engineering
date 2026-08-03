.class public final synthetic Lwb/vb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/vb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/vb;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/vb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "group_member_reply_media_order"

    .line 19
    .line 20
    invoke-static {v2, v1}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v1}, Lwb/ho;->P5(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 59
    .line 60
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 63
    .line 64
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v1}, Lwb/ho;->L5(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_2
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 87
    .line 88
    check-cast p1, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v2, "group_member_reply_both_order"

    .line 95
    .line 96
    invoke-static {v2, v1}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_3
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 109
    .line 110
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 113
    .line 114
    check-cast p1, Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v2, "group_member_reply_prompt_type"

    .line 121
    .line 122
    invoke-static {v2, v1}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_4
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 135
    .line 136
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 139
    .line 140
    check-cast p1, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-static {v2, p1, v0, v1, v3}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :pswitch_5
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 151
    .line 152
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 155
    .line 156
    check-cast p1, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 174
    .line 175
    .line 176
    sget-object p1, Lac/p;->b:Lia/a0;

    .line 177
    .line 178
    if-eqz p1, :cond_0

    .line 179
    .line 180
    new-instance v0, Lia/x;

    .line 181
    .line 182
    const/4 v1, 0x1

    .line 183
    invoke-direct {v0, p1, v1}, Lia/x;-><init>(Lia/a0;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v0}, Lia/a0;->r(Lfg/a;)Z

    .line 187
    .line 188
    .line 189
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_6
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 193
    .line 194
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 195
    .line 196
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 197
    .line 198
    check-cast p1, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 216
    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :pswitch_7
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 221
    .line 222
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 225
    .line 226
    check-cast p1, Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {p1, v2, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :pswitch_8
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 242
    .line 243
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 246
    .line 247
    check-cast p1, Ljava/lang/Boolean;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 265
    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :pswitch_9
    iget-object v0, p0, Lwb/vb;->h:Landroid/content/SharedPreferences;

    .line 270
    .line 271
    iget-object v1, p0, Lwb/vb;->i:Ljava/lang/String;

    .line 272
    .line 273
    iget-object v2, p0, Lwb/vb;->j:Li0/a1;

    .line 274
    .line 275
    check-cast p1, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-interface {p1, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 293
    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
