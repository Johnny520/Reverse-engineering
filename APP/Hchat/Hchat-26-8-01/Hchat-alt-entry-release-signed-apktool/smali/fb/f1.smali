.class public final synthetic Lfb/f1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfb/f1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lfb/f1;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lfb/f1;->g:I

    .line 2
    .line 3
    const-string v1, "profile_id_enable"

    .line 4
    .line 5
    const-string v2, "Hchat_profile_id_config"

    .line 6
    .line 7
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, Lfb/f1;->h:Landroid/content/Context;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Li0/a0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    :goto_0
    instance-of p1, v6, Landroid/content/ContextWrapper;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    instance-of p1, v6, Landroid/app/Activity;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    check-cast v6, Landroid/app/Activity;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    check-cast v6, Landroid/content/ContextWrapper;

    .line 36
    .line 37
    invoke-virtual {v6}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    instance-of p1, v6, Landroid/app/Activity;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    check-cast v6, Landroid/app/Activity;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v6, v5

    .line 50
    :goto_1
    if-eqz v6, :cond_3

    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object p1, v5

    .line 58
    :goto_2
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :cond_4
    if-eqz p1, :cond_5

    .line 73
    .line 74
    if-eqz v5, :cond_5

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    and-int/lit8 v0, v0, 0xf

    .line 81
    .line 82
    or-int/lit8 v0, v0, 0x10

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 85
    .line 86
    .line 87
    :cond_5
    new-instance v0, Lci/w;

    .line 88
    .line 89
    const/16 v1, 0x9

    .line 90
    .line 91
    invoke-direct {v0, p1, v1, v5}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const-string v0, "clipboard"

    .line 101
    .line 102
    invoke-virtual {v6, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    move-object v5, v0

    .line 111
    check-cast v5, Landroid/content/ClipboardManager;

    .line 112
    .line 113
    :cond_6
    if-eqz v5, :cond_7

    .line 114
    .line 115
    const-string v0, "Agent \u4ee3\u7801"

    .line 116
    .line 117
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v5, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    const-string p1, "\u4ee3\u7801\u5df2\u590d\u5236"

    .line 125
    .line 126
    invoke-static {v6, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 131
    .line 132
    .line 133
    return-object v3

    .line 134
    :pswitch_1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 140
    .line 141
    instance-of v0, p1, Landroid/app/Activity;

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    move-object v5, p1

    .line 146
    check-cast v5, Landroid/app/Activity;

    .line 147
    .line 148
    :cond_8
    if-eqz v5, :cond_a

    .line 149
    .line 150
    invoke-static {v6, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_9

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_9
    sget-object p1, Lva/b;->h:Lva/b;

    .line 162
    .line 163
    invoke-static {v5, p1}, Luf/d;->K(Landroid/app/Activity;Lva/b;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_a

    .line 168
    .line 169
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    new-instance v1, Lc9/t;

    .line 182
    .line 183
    const/16 v2, 0xa

    .line 184
    .line 185
    invoke-direct {v1, v5, p1, v2}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_3
    return-object v3

    .line 192
    :pswitch_2
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 198
    .line 199
    instance-of v0, p1, Landroid/app/Activity;

    .line 200
    .line 201
    if-eqz v0, :cond_b

    .line 202
    .line 203
    check-cast p1, Landroid/app/Activity;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_b
    move-object p1, v5

    .line 207
    :goto_4
    if-eqz p1, :cond_f

    .line 208
    .line 209
    invoke-static {v6, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_c

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_c
    sget-object v0, Lva/b;->g:Lva/b;

    .line 221
    .line 222
    invoke-static {p1, v0}, Luf/d;->K(Landroid/app/Activity;Lva/b;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_f

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_d

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    goto :goto_5

    .line 239
    :cond_d
    move-object v1, v5

    .line 240
    :goto_5
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 241
    .line 242
    if-eqz v2, :cond_e

    .line 243
    .line 244
    move-object v5, v1

    .line 245
    check-cast v5, Landroid/view/ViewGroup;

    .line 246
    .line 247
    :cond_e
    if-eqz v5, :cond_f

    .line 248
    .line 249
    new-instance v1, Lc9/t;

    .line 250
    .line 251
    invoke-direct {v1, p1, v0}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 255
    .line 256
    .line 257
    :cond_f
    :goto_6
    return-object v3

    .line 258
    :pswitch_3
    check-cast p1, Lfb/a;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 264
    .line 265
    iget-object p1, p1, Lfb/a;->b:Ljava/lang/String;

    .line 266
    .line 267
    invoke-static {v6, p1}, Lfb/g1;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    return-object p1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
