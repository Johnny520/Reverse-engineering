.class public final synthetic Lkt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lqm1;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lqm1;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkt1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lkt1;->ζ:Lqm1;

    .line 4
    .line 5
    iput-object p2, p0, Lkt1;->η:Landroid/app/Activity;

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
    .locals 7

    .line 1
    iget v0, p0, Lkt1;->ε:I

    .line 2
    .line 3
    const-string v1, "\u9690\u85cf\u8054\u7cfb\u4eba\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, Lkt1;->η:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object p0, p0, Lkt1;->ζ:Lqm1;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    check-cast p2, Landroid/widget/Switch;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lx9;->β()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    iput-boolean v3, p0, Lqm1;->ε:Z

    .line 40
    .line 41
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 42
    .line 43
    .line 44
    iput-boolean v4, p0, Lqm1;->ε:Z

    .line 45
    .line 46
    const-string p0, "\u4f1a\u8bdd\u6279\u91cf\u5220\u9664\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 47
    .line 48
    invoke-static {v5, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 57
    .line 58
    if-nez p0, :cond_1

    .line 59
    .line 60
    sget-object p0, Lbv1;->α:Lbv1;

    .line 61
    .line 62
    const-string p0, "im_conversation_delete_entry_enabled"

    .line 63
    .line 64
    invoke-static {p0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_0
    return-object v2

    .line 68
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 72
    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-static {}, Lx9;->δ()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    iput-boolean v3, p0, Lqm1;->ε:Z

    .line 84
    .line 85
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 86
    .line 87
    .line 88
    iput-boolean v4, p0, Lqm1;->ε:Z

    .line 89
    .line 90
    invoke-static {v5, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 99
    .line 100
    if-nez p0, :cond_3

    .line 101
    .line 102
    sget-object p0, Lbv1;->α:Lbv1;

    .line 103
    .line 104
    const-string p0, "hidden_contact_operation_toggle_enabled"

    .line 105
    .line 106
    invoke-static {p0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_1
    return-object v2

    .line 110
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 114
    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    invoke-static {}, Lx9;->δ()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    iput-boolean v3, p0, Lqm1;->ε:Z

    .line 126
    .line 127
    invoke-virtual {p2, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 128
    .line 129
    .line 130
    iput-boolean v4, p0, Lqm1;->ε:Z

    .line 131
    .line 132
    invoke-static {v5, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :cond_4
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 142
    .line 143
    if-nez v0, :cond_8

    .line 144
    .line 145
    sget-object v0, Lbe0;->α:Lbe0;

    .line 146
    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    invoke-static {}, Lx9;->δ()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    invoke-virtual {v0}, Lbe0;->ε()V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-nez v6, :cond_6

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_6
    const-string v6, "hidden_contact_enabled_v2"

    .line 171
    .line 172
    invoke-static {v6, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 173
    .line 174
    .line 175
    const-string v6, "set_enabled"

    .line 176
    .line 177
    invoke-virtual {v0, v6}, Lbe0;->ο(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    sget-object v0, Lbe0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lzd0;

    .line 187
    .line 188
    iget-object v6, v0, Lzd0;->α:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_7

    .line 195
    .line 196
    iget-boolean v0, v0, Lzd0;->β:Z

    .line 197
    .line 198
    if-ne v0, p1, :cond_7

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_7
    :goto_2
    iput-boolean v3, p0, Lqm1;->ε:Z

    .line 202
    .line 203
    xor-int/2addr p1, v3

    .line 204
    invoke-virtual {p2, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 205
    .line 206
    .line 207
    iput-boolean v4, p0, Lqm1;->ε:Z

    .line 208
    .line 209
    const-string p0, "\u5f53\u524d\u8d26\u53f7\u5c1a\u672a\u8bc6\u522b"

    .line 210
    .line 211
    invoke-static {v5, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_8
    :goto_3
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 220
    .line 221
    if-nez p0, :cond_a

    .line 222
    .line 223
    if-eqz p1, :cond_a

    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-eqz p0, :cond_9

    .line 234
    .line 235
    invoke-static {p0}, Lqd0;->α(Ljava/lang/ClassLoader;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    const-string p0, "\u5bbf\u4e3b\u73af\u5883\u5c1a\u672a\u5c31\u7eea\uff0c\u4e0b\u6b21\u542f\u52a8\u540e\u751f\u6548"

    .line 240
    .line 241
    invoke-static {v5, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 246
    .line 247
    .line 248
    :cond_a
    :goto_4
    return-object v2

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
