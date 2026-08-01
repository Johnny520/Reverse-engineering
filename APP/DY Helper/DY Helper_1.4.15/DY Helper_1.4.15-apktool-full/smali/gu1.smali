.class public final synthetic Lgu1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgu1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lgu1;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lgu1;->η:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lgu1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const-string v2, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lgu1;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object p0, p0, Lgu1;->ζ:Landroid/content/Context;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    check-cast p2, Landroid/widget/Switch;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    sget-object v0, Lbv1;->α:Lbv1;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v0, "pet_elf_auto_feed_enabled"

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-static {}, Lx9;->η()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lxa1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lxa1;->δ()V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-static {v4}, Lxa1;->θ(Landroid/app/Activity;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    return-object v1

    .line 69
    :pswitch_0
    sget-object v0, Lbv1;->α:Lbv1;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string v0, "pet_elf_closeness_auto_claim_enabled"

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-static {}, Lx9;->η()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_2

    .line 83
    .line 84
    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    sget-object p0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    .line 105
    invoke-static {v4}, Lse1;->δ(Landroid/app/Activity;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_1
    return-object v1

    .line 109
    :pswitch_1
    sget-object v0, Lbv1;->α:Lbv1;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const-string v0, "pet_elf_auto_claim_enabled"

    .line 115
    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    invoke-static {}, Lx9;->η()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_4

    .line 123
    .line 124
    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-static {v4}, Lpg1;->ι(Landroid/app/Activity;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_2
    return-object v1

    .line 147
    :pswitch_2
    sget-object v0, Lbv1;->α:Lbv1;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const-string v0, "pet_elf_auto_image_enabled"

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    invoke-static {}, Lx9;->η()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_6

    .line 161
    .line 162
    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    if-eqz p1, :cond_7

    .line 177
    .line 178
    const-string v2, "pet_elf_task_image_uri"

    .line 179
    .line 180
    const-string v5, ""

    .line 181
    .line 182
    invoke-static {v2, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_7

    .line 191
    .line 192
    invoke-static {v0, v3}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 196
    .line 197
    .line 198
    const-string p1, "\u8bf7\u5148\u9009\u62e9\u81ea\u52a8\u4efb\u52a1\u56fe\u7247"

    .line 199
    .line 200
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 205
    .line 206
    .line 207
    new-instance p0, Lcl1;

    .line 208
    .line 209
    const/4 p1, 0x3

    .line 210
    invoke-direct {p0, p1, p2}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    new-instance p1, Lhu;

    .line 214
    .line 215
    const/16 p2, 0x19

    .line 216
    .line 217
    invoke-direct {p1, p0, v4, p2}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v4, p1}, Lbv1;->Η(Landroid/app/Activity;La80;)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 225
    .line 226
    .line 227
    :goto_3
    return-object v1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
