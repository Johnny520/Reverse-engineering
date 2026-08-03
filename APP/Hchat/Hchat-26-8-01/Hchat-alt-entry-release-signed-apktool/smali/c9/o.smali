.class public final synthetic Lc9/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Laa/c;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Laa/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc9/o;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/o;->h:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/o;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/o;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lc9/o;->k:Laa/c;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/o;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sget-object v3, Lc9/b0;->a:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v3, v0, Lc9/o;->h:Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    iget-object v1, v0, Lc9/o;->i:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3, v1}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eqz v4, :cond_5

    .line 31
    .line 32
    sget-object v1, Ld9/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    iget-object v1, v0, Lc9/o;->j:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v5, ""

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    move-object v1, v5

    .line 49
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/4 v7, 0x0

    .line 54
    if-lez v6, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v1, v7

    .line 58
    :goto_0
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-static {v3, v1}, Ld9/o;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    :cond_2
    if-nez v7, :cond_3

    .line 69
    .line 70
    move-object v12, v5

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v12, v7

    .line 73
    :goto_1
    const/4 v15, 0x0

    .line 74
    const/16 v16, 0xf7f

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    invoke-static/range {v4 .. v16}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v4, v0, Lc9/o;->k:Laa/c;

    .line 90
    .line 91
    invoke-static {v3, v1, v4}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    const-string v1, "\u5934\u50cf\u8bbe\u7f6e\u5931\u8d25"

    .line 96
    .line 97
    invoke-static {v3, v1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    return-object v2

    .line 101
    :pswitch_0
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    sget-object v3, Lc9/b0;->a:Landroid/os/Handler;

    .line 110
    .line 111
    iget-object v5, v0, Lc9/o;->h:Landroid/app/Activity;

    .line 112
    .line 113
    iget-object v7, v0, Lc9/o;->i:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v6, v0, Lc9/o;->j:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v8, v0, Lc9/o;->k:Laa/c;

    .line 118
    .line 119
    if-nez v1, :cond_6

    .line 120
    .line 121
    new-instance v4, Lc9/o;

    .line 122
    .line 123
    const/4 v9, 0x1

    .line 124
    invoke-direct/range {v4 .. v9}, Lc9/o;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Laa/c;I)V

    .line 125
    .line 126
    .line 127
    sget-object v1, Ld9/f;->a:Ld9/f;

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-virtual {v1, v5, v4, v7, v3}, Ld9/f;->b(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-static {v5, v7}, Ld9/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const-string v3, "\u6062\u590d\u9ed8\u8ba4\u5934\u50cf\u5931\u8d25"

    .line 139
    .line 140
    if-nez v1, :cond_7

    .line 141
    .line 142
    invoke-static {v5, v3}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    invoke-static {v5, v6}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    if-eqz v9, :cond_a

    .line 151
    .line 152
    const/16 v20, 0x0

    .line 153
    .line 154
    const/16 v21, 0xf7f

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const-string v17, ""

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    invoke-static/range {v9 .. v21}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v5, v1}, Lc9/o2;->u(Landroid/content/Context;Lc9/a;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_8

    .line 179
    .line 180
    invoke-virtual {v8}, Laa/c;->invoke()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_8
    if-eqz v1, :cond_9

    .line 184
    .line 185
    const-string v3, "\u5df2\u6062\u590d\u9ed8\u8ba4\u5934\u50cf"

    .line 186
    .line 187
    :cond_9
    invoke-static {v5, v3}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    :goto_3
    return-object v2

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
