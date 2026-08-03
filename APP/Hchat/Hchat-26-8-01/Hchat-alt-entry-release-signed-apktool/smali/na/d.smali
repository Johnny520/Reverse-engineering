.class public final synthetic Lna/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lna/e;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lna/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lna/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lna/d;->h:Lna/e;

    .line 4
    .line 5
    iput-object p2, p0, Lna/d;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lna/d;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lna/d;->k:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lna/d;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/content/Intent;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "key_native_url"

    .line 14
    .line 15
    iget-object v3, v0, Lna/d;->i:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const-string v2, "key_username"

    .line 21
    .line 22
    iget-object v3, v0, Lna/d;->j:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Lna/d;->k:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    const-string v3, "key_from_username"

    .line 36
    .line 37
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v2, v0, Lna/d;->h:Lna/e;

    .line 41
    .line 42
    iget-object v3, v2, Lna/e;->a:Landroid/content/Context;

    .line 43
    .line 44
    const-string v12, "vm4.l"

    .line 45
    .line 46
    const-string v13, "wl4.l"

    .line 47
    .line 48
    const-string v4, "nk4.l"

    .line 49
    .line 50
    const-string v5, "oq4.l"

    .line 51
    .line 52
    const-string v6, "pn4.l"

    .line 53
    .line 54
    const-string v7, "qm4.l"

    .line 55
    .line 56
    const-string v8, "rm4.l"

    .line 57
    .line 58
    const-string v9, "sm4.l"

    .line 59
    .line 60
    const-string v10, "tm4.l"

    .line 61
    .line 62
    const-string v11, "um4.l"

    .line 63
    .line 64
    filled-new-array/range {v4 .. v13}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-string v5, "C"

    .line 69
    .line 70
    const-string v6, "D"

    .line 71
    .line 72
    const-string v7, "A"

    .line 73
    .line 74
    const-string v8, "B"

    .line 75
    .line 76
    filled-new-array {v7, v8, v5, v6}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const-string v6, ".ui.LuckyMoneyNotHookReceiveUI"

    .line 81
    .line 82
    const-string v7, ".ui.LuckyMoneyReceiveUI"

    .line 83
    .line 84
    const-string v8, ".ui.LuckyMoneyNewReceiveUI"

    .line 85
    .line 86
    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const/4 v8, 0x0

    .line 91
    :goto_0
    const/16 v9, 0xa

    .line 92
    .line 93
    const/4 v10, 0x3

    .line 94
    if-ge v8, v9, :cond_3

    .line 95
    .line 96
    aget-object v9, v4, v8

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    :goto_1
    const/4 v12, 0x4

    .line 100
    if-ge v11, v12, :cond_2

    .line 101
    .line 102
    aget-object v12, v5, v11

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    :goto_2
    if-ge v13, v10, :cond_1

    .line 106
    .line 107
    aget-object v14, v6, v13

    .line 108
    .line 109
    :try_start_0
    iget-object v15, v2, Lna/e;->b:Ljava/lang/ClassLoader;

    .line 110
    .line 111
    invoke-static {v9, v15}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    const-string v7, "luckymoney"

    .line 116
    .line 117
    filled-new-array {v3, v7, v14, v1}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-static {v15, v12, v7}, Lh/Hchat/utils/KavaReflector;->invokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    new-instance v7, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v15, "\u542f\u52a8: "

    .line 130
    .line 131
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v2, v7}, Lna/e;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catchall_0
    add-int/lit8 v13, v13, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_3
    const/4 v7, 0x0

    .line 155
    :goto_3
    if-ge v7, v10, :cond_4

    .line 156
    .line 157
    aget-object v2, v6, v7

    .line 158
    .line 159
    :try_start_1
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    new-instance v5, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v8, "com.tencent.mm.plugin.luckymoney"

    .line 169
    .line 170
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v1, v4, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x10000000

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_1
    add-int/lit8 v7, v7, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_4
    :goto_4
    return-void

    .line 196
    :pswitch_0
    iget-object v1, v0, Lna/d;->h:Lna/e;

    .line 197
    .line 198
    iget-object v1, v1, Lna/e;->o:Lra/c;

    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    iget-object v3, v0, Lna/d;->i:Ljava/lang/String;

    .line 202
    .line 203
    iget-object v4, v0, Lna/d;->j:Ljava/lang/String;

    .line 204
    .line 205
    iget-object v5, v0, Lna/d;->k:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v1, v2, v3, v4, v5}, Lra/c;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
