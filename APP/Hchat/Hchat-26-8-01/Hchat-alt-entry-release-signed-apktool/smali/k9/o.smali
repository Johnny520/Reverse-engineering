.class public final synthetic Lk9/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lk9/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk9/o;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk9/o;->b:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lk9/o;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lr9/d0;Landroid/app/Activity;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lk9/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/o;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk9/o;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Lk9/o;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lk9/o;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lr9/d0;

    .line 9
    .line 10
    iget-object v0, p0, Lk9/o;->b:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lr9/d0;->e0(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Lk9/o;->b:Landroid/app/Activity;

    .line 17
    .line 18
    iget-object v0, p0, Lk9/o;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lk9/j;

    .line 21
    .line 22
    iget-object v1, v0, Lk9/j;->b:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v2}, Lk9/r;->d(Z)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v3, v0, Lk9/j;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const v5, -0x62b40cf1

    .line 35
    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eq v4, v5, :cond_6

    .line 39
    .line 40
    const v0, 0x6d52c096

    .line 41
    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eq v4, v0, :cond_4

    .line 45
    .line 46
    const v0, 0x7939a2f9

    .line 47
    .line 48
    .line 49
    if-eq v4, v0, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-string v0, "plugin_agent"

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-static {p1}, La7/a;->W(Landroid/content/Context;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_2
    move-object v0, v5

    .line 80
    :goto_0
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    move-object v5, v0

    .line 85
    check-cast v5, Landroid/view/ViewGroup;

    .line 86
    .line 87
    :cond_3
    if-eqz v5, :cond_9

    .line 88
    .line 89
    new-instance v0, Lh/Hchat/crash/e;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    invoke-direct {v0, v3}, Lh/Hchat/crash/e;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    const-string v0, "module_settings"

    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v5, v2}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    const-string v4, "activity"

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_7

    .line 122
    .line 123
    :goto_1
    move v6, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_7
    iget-object v0, v0, Lk9/j;->d:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/16 v3, 0x2e

    .line 136
    .line 137
    invoke-static {v0, v3}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    new-instance v4, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :cond_8
    new-instance v3, Landroid/content/Intent;

    .line 163
    .line 164
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v4, Landroid/content/ComponentName;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-direct {v4, v5, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 184
    .line 185
    .line 186
    :cond_9
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    goto :goto_4

    .line 191
    :goto_3
    new-instance v3, Lsf/f;

    .line 192
    .line 193
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    move-object v0, v3

    .line 197
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    if-eqz v3, :cond_a

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    const-string v5, "[Hchat:FloatingShortcut] \u6253\u5f00\u5feb\u6377\u9879\u5931\u8d25: "

    .line 208
    .line 209
    const-string v6, " "

    .line 210
    .line 211
    invoke-static {v5, v1, v6, v4, v3}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :cond_a
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 215
    .line 216
    instance-of v4, v0, Lsf/f;

    .line 217
    .line 218
    if-eqz v4, :cond_b

    .line 219
    .line 220
    move-object v0, v3

    .line 221
    :cond_b
    check-cast v0, Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_c

    .line 228
    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v3, "\u65e0\u6cd5\u6253\u5f00"

    .line 232
    .line 233
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 248
    .line 249
    .line 250
    :cond_c
    return-void

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
