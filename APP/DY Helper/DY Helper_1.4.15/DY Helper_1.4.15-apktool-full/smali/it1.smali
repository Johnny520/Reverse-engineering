.class public final synthetic Lit1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lit1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lit1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lit1;->ε:I

    .line 2
    .line 3
    const-string v1, "\u81ea\u52a8\u5ba1\u6279\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ls62;->α:Ls62;

    .line 7
    .line 8
    iget-object p0, p0, Lit1;->ζ:Landroid/app/Activity;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lau1;

    .line 25
    .line 26
    invoke-direct {v0, p1, p0, p2}, Lau1;-><init>(ZLandroid/app/Activity;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p1, Lxx0;

    .line 42
    .line 43
    const/16 v0, 0xd

    .line 44
    .line 45
    invoke-direct {p1, p0, p2, v0}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p1, Lxx0;

    .line 61
    .line 62
    const/16 v0, 0xc

    .line 63
    .line 64
    invoke-direct {p1, p0, p2, v0}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    check-cast p2, Landroid/widget/Switch;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const-string p2, "pet_elf_camp_show_top_notification"

    .line 81
    .line 82
    invoke-static {p2, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    sget-object p2, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object p2, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 91
    .line 92
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    if-nez p1, :cond_0

    .line 101
    .line 102
    new-instance p1, Lcom/example/dyhelper/ui/φ;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Lcom/example/dyhelper/ui/φ;-><init>(Landroid/app/Activity;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 108
    .line 109
    .line 110
    :cond_0
    return-object v3

    .line 111
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    check-cast p2, Landroid/widget/Switch;

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object p2, Lbv1;->α:Lbv1;

    .line 121
    .line 122
    const-string p2, "version_update_check_enabled"

    .line 123
    .line 124
    invoke-static {p2, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    if-eqz p1, :cond_1

    .line 128
    .line 129
    invoke-static {p0}, Lu72;->ε(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    const/4 p1, 0x1

    .line 133
    invoke-static {p1}, Lu72;->α(Z)V

    .line 134
    .line 135
    .line 136
    const-string p1, "\u5df2\u5f00\u542f\u7248\u672c\u66f4\u65b0\u68c0\u67e5"

    .line 137
    .line 138
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    const-string p1, "\u5df2\u5173\u95ed\u7248\u672c\u66f4\u65b0\u68c0\u67e5"

    .line 147
    .line 148
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 153
    .line 154
    .line 155
    :goto_0
    return-object v3

    .line 156
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    check-cast p2, Landroid/widget/Switch;

    .line 161
    .line 162
    sget-object v0, Lbv1;->α:Lbv1;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const-string v0, "group_apply_auto_approval_polling_enabled"

    .line 168
    .line 169
    if-eqz p1, :cond_2

    .line 170
    .line 171
    invoke-static {}, Lx9;->γ()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_2

    .line 176
    .line 177
    invoke-static {v0, v2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 181
    .line 182
    .line 183
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_2
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    :goto_1
    return-object v3

    .line 195
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    check-cast p2, Landroid/widget/Switch;

    .line 200
    .line 201
    sget-object v0, Lbv1;->α:Lbv1;

    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    const-string v0, "group_apply_auto_approval_cold_start_enabled"

    .line 207
    .line 208
    if-eqz p1, :cond_3

    .line 209
    .line 210
    invoke-static {}, Lx9;->γ()Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_3

    .line 215
    .line 216
    invoke-static {v0, v2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 220
    .line 221
    .line 222
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_3
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    :goto_2
    return-object v3

    .line 234
    nop

    .line 235
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
