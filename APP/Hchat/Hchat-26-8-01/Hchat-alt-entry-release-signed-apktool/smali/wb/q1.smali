.class public final synthetic Lwb/q1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/q1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/q1;->i:Li0/a1;

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
    .locals 6

    .line 1
    iget v0, p0, Lwb/q1;->g:I

    .line 2
    .line 3
    const-string v1, "\u94c3\u58f0\u5df2\u9009\u62e9\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p0, Lwb/q1;->i:Li0/a1;

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    instance-of v2, v0, Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v0

    .line 25
    check-cast v2, Landroid/app/Activity;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-nez v2, :cond_1

    .line 30
    .line 31
    const-string p1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 32
    .line 33
    invoke-static {v0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget-object v3, Lwb/wq;->a:Lwb/wq;

    .line 42
    .line 43
    new-instance v4, Leb/v0;

    .line 44
    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-direct {v4, p1, v0, v1, v5}, Leb/v0;-><init>(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2, p1, v4}, Lwb/wq;->b(Landroid/app/Activity;ILfg/l;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 56
    .line 57
    iget-object v1, p0, Lwb/q1;->i:Li0/a1;

    .line 58
    .line 59
    check-cast p1, Li0/a0;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object p1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 65
    .line 66
    new-instance v3, Lwb/l9;

    .line 67
    .line 68
    const/16 v4, 0x18

    .line 69
    .line 70
    invoke-direct {v3, v1, v4}, Lwb/l9;-><init>(Li0/a1;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->subscribePluginCatalog(Landroid/content/Context;Lfg/a;)Leb/b0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lwb/bo;

    .line 78
    .line 79
    invoke-direct {v0, p1, v2}, Lwb/bo;-><init>(Leb/b0;I)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_1
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 84
    .line 85
    iget-object v2, p0, Lwb/q1;->i:Li0/a1;

    .line 86
    .line 87
    check-cast p1, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v4, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 93
    .line 94
    invoke-static {v0, p1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 106
    .line 107
    .line 108
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_2
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 112
    .line 113
    iget-object v2, p0, Lwb/q1;->i:Li0/a1;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v4, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 121
    .line 122
    invoke-static {v0, p1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_3
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 138
    .line 139
    iget-object v1, p0, Lwb/q1;->i:Li0/a1;

    .line 140
    .line 141
    check-cast p1, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_2

    .line 148
    .line 149
    const-string v4, "\u81ea\u5b9a\u4e49\u5934\u50cf\u5df2\u4fdd\u5b58"

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_2
    const-string v4, "\u5934\u50cf\u8bbe\u7f6e\u5931\u8d25"

    .line 153
    .line 154
    :goto_3
    invoke-static {v0, v4, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 159
    .line 160
    .line 161
    if-eqz p1, :cond_3

    .line 162
    .line 163
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-static {p1, v2, v1}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 173
    .line 174
    return-object p1

    .line 175
    :pswitch_4
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 176
    .line 177
    iget-object v1, p0, Lwb/q1;->i:Li0/a1;

    .line 178
    .line 179
    check-cast p1, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object p1, Lk9/r;->a:Lk9/r;

    .line 189
    .line 190
    const-string p1, "floating_shortcut_menu"

    .line 191
    .line 192
    invoke-static {v0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    const-string v0, "enable"

    .line 201
    .line 202
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 207
    .line 208
    .line 209
    sput-boolean v2, Lk9/r;->d:Z

    .line 210
    .line 211
    new-instance p1, Lk9/q;

    .line 212
    .line 213
    invoke-direct {p1, v3, v2}, Lk9/q;-><init>(IZ)V

    .line 214
    .line 215
    .line 216
    invoke-static {p1}, Lk9/r;->p(Lfg/a;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :pswitch_5
    iget-object v0, p0, Lwb/q1;->h:Landroid/content/Context;

    .line 221
    .line 222
    iget-object v1, p0, Lwb/q1;->i:Li0/a1;

    .line 223
    .line 224
    check-cast p1, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string p1, "Hchat_conversation_groups"

    .line 234
    .line 235
    invoke-static {v0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const-string v1, "enabled"

    .line 244
    .line 245
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-nez p1, :cond_4

    .line 254
    .line 255
    const-string p1, "[Hchat:ConversationGroup] \u4fdd\u5b58\u542f\u7528\u72b6\u6001\u5931\u8d25"

    .line 256
    .line 257
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_4
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
