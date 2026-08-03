.class public final synthetic Lwb/ji;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/ji;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lwb/ji;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ji;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ji;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ji;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ji;->l:Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget v0, p0, Lwb/ji;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ji;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/a;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/ji;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/ji;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Li0/a1;

    .line 17
    .line 18
    iget-object v3, p0, Lwb/ji;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lfg/l;

    .line 21
    .line 22
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    iget-boolean v4, p0, Lwb/ji;->h:Z

    .line 35
    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/util/Set;

    .line 44
    .line 45
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    new-instance v0, Lwb/xi;

    .line 49
    .line 50
    const/16 v4, 0x15

    .line 51
    .line 52
    invoke-direct {v0, v3, v4, v2}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    new-instance v3, Lwb/vu;

    .line 68
    .line 69
    invoke-direct {v3, v1, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    iget-object v0, p0, Lwb/ji;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lfg/l;

    .line 81
    .line 82
    iget-object v1, p0, Lwb/ji;->j:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Ljava/lang/Integer;

    .line 85
    .line 86
    iget-object v2, p0, Lwb/ji;->k:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Ljava/lang/Integer;

    .line 89
    .line 90
    iget-object v3, p0, Lwb/ji;->l:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/lang/Integer;

    .line 93
    .line 94
    iget-boolean v4, p0, Lwb/ji;->h:Z

    .line 95
    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/4 v2, 0x3

    .line 114
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v2, "%02d:%02d:%02d"

    .line 119
    .line 120
    invoke-static {v4, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_1
    iget-object v0, p0, Lwb/ji;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Landroid/content/Context;

    .line 133
    .line 134
    iget-object v1, p0, Lwb/ji;->j:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Landroid/content/SharedPreferences;

    .line 137
    .line 138
    iget-object v2, p0, Lwb/ji;->k:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Li0/a1;

    .line 141
    .line 142
    iget-object v3, p0, Lwb/ji;->l:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, Li0/a1;

    .line 145
    .line 146
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    const-string v5, "yyyy-MM-dd HH:mm:ss"

    .line 165
    .line 166
    if-eqz v4, :cond_3

    .line 167
    .line 168
    move-object v2, v5

    .line 169
    :cond_3
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 170
    .line 171
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-direct {v4, v2, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 176
    .line 177
    .line 178
    new-instance v6, Ljava/util/Date;

    .line 179
    .line 180
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    goto :goto_1

    .line 188
    :catchall_0
    move-exception v4

    .line 189
    new-instance v6, Lsf/f;

    .line 190
    .line 191
    invoke-direct {v6, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    move-object v4, v6

    .line 195
    :goto_1
    instance-of v4, v4, Lsf/f;

    .line 196
    .line 197
    iget-boolean v6, p0, Lwb/ji;->h:Z

    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    if-eqz v6, :cond_4

    .line 201
    .line 202
    if-eqz v4, :cond_4

    .line 203
    .line 204
    const-string v1, "\u65f6\u95f4\u683c\u5f0f\u65e0\u6548"

    .line 205
    .line 206
    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_5

    .line 229
    .line 230
    const-string v3, "{name}\u64a4\u56de\u4e86\u4e0a\u4e00\u6761\u6d88\u606f {content}"

    .line 231
    .line 232
    :cond_5
    const-string v6, "anti_recall_notice_text"

    .line 233
    .line 234
    invoke-interface {v1, v6, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-nez v4, :cond_6

    .line 239
    .line 240
    move-object v5, v2

    .line 241
    :cond_6
    const-string v2, "anti_recall_notice_time_format"

    .line 242
    .line 243
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 248
    .line 249
    .line 250
    const-string v1, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 251
    .line 252
    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 257
    .line 258
    .line 259
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 260
    .line 261
    return-object v0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
