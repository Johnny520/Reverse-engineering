.class public final synthetic Lia/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lia/q;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Lp8/l;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lia/q;Ljava/lang/String;Lp8/l;I)V
    .locals 0

    .line 16
    iput p5, p0, Lia/j;->g:I

    iput-object p1, p0, Lia/j;->j:Landroid/app/Activity;

    iput-object p2, p0, Lia/j;->h:Lia/q;

    iput-object p3, p0, Lia/j;->i:Ljava/lang/String;

    iput-object p4, p0, Lia/j;->k:Lp8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lia/q;Ljava/lang/String;Landroid/app/Activity;Lp8/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lia/j;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lia/j;->h:Lia/q;

    .line 8
    .line 9
    iput-object p2, p0, Lia/j;->i:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lia/j;->j:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p4, p0, Lia/j;->k:Lp8/l;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lia/j;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    check-cast v3, Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v4, Lia/j;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    iget-object v2, v0, Lia/j;->j:Landroid/app/Activity;

    .line 19
    .line 20
    iget-object v6, v0, Lia/j;->h:Lia/q;

    .line 21
    .line 22
    iget-object v7, v0, Lia/j;->i:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v8, v0, Lia/j;->k:Lp8/l;

    .line 25
    .line 26
    move-object v5, v2

    .line 27
    invoke-direct/range {v4 .. v9}, Lia/j;-><init>(Landroid/app/Activity;Lia/q;Ljava/lang/String;Lp8/l;I)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Lk/s1;

    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    invoke-direct {v5, v1}, Lk/s1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x1

    .line 37
    const/16 v12, 0xb80

    .line 38
    .line 39
    const-string v6, "\u9009\u62e9\u8bc4\u8bba\u597d\u53cb"

    .line 40
    .line 41
    const-string v7, "\u4e0b\u4e00\u6b65"

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-static/range {v2 .. v12}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_0
    move-object/from16 v1, p1

    .line 53
    .line 54
    check-cast v1, Ljava/util/List;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lia/j;->h:Lia/q;

    .line 60
    .line 61
    iget-object v3, v2, Lia/q;->a:Lb5/c;

    .line 62
    .line 63
    iget-object v4, v0, Lia/j;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    new-instance v6, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_0

    .line 87
    .line 88
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Lwb/jv;

    .line 93
    .line 94
    new-instance v9, Lia/d;

    .line 95
    .line 96
    iget-object v10, v8, Lwb/jv;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v8, v8, Lwb/jv;->b:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v9, v10, v8}, Lia/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    iget-object v7, v2, Lia/q;->d:Landroid/content/SharedPreferences;

    .line 108
    .line 109
    const-string v8, "fake_like_random_order"

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_1

    .line 117
    .line 118
    invoke-static {v6}, Ltf/m;->S1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    :cond_1
    invoke-virtual {v3, v4, v6}, Lb5/c;->T(Ljava/lang/String;Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v2, Lia/q;->b:Lia/a0;

    .line 129
    .line 130
    iget-object v3, v0, Lia/j;->j:Landroid/app/Activity;

    .line 131
    .line 132
    iget-object v4, v0, Lia/j;->k:Lp8/l;

    .line 133
    .line 134
    invoke-virtual {v2, v3, v4, v5}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    const-string v1, "\u5df2\u6062\u590d\u771f\u5b9e\u70b9\u8d5e"

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    const-string v1, "\u4f2a\u96c6\u8d5e\u5df2\u66f4\u65b0"

    .line 147
    .line 148
    :goto_2
    invoke-static {v3, v1}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :pswitch_1
    move-object/from16 v1, p1

    .line 153
    .line 154
    check-cast v1, Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v1}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    move-object v6, v1

    .line 164
    check-cast v6, Lwb/jv;

    .line 165
    .line 166
    if-eqz v6, :cond_3

    .line 167
    .line 168
    iget-object v9, v6, Lwb/jv;->b:Ljava/lang/String;

    .line 169
    .line 170
    new-instance v14, Leb/o;

    .line 171
    .line 172
    iget-object v3, v0, Lia/j;->j:Landroid/app/Activity;

    .line 173
    .line 174
    iget-object v4, v0, Lia/j;->h:Lia/q;

    .line 175
    .line 176
    iget-object v5, v0, Lia/j;->i:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v7, v0, Lia/j;->k:Lp8/l;

    .line 179
    .line 180
    move-object v2, v14

    .line 181
    invoke-direct/range {v2 .. v7}, Leb/o;-><init>(Landroid/app/Activity;Lia/q;Ljava/lang/String;Lwb/jv;Lp8/l;)V

    .line 182
    .line 183
    .line 184
    new-instance v15, Lk/s1;

    .line 185
    .line 186
    const/4 v1, 0x7

    .line 187
    invoke-direct {v15, v1}, Lk/s1;-><init>(I)V

    .line 188
    .line 189
    .line 190
    const/16 v16, 0x248

    .line 191
    .line 192
    const-string v8, "\u586b\u5199\u4f2a\u8bc4\u8bba"

    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    const-string v11, "\u8bf7\u8f93\u5165\u8bc4\u8bba\u5185\u5bb9"

    .line 196
    .line 197
    const/16 v12, 0x3e8

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    move-object v7, v3

    .line 201
    invoke-static/range {v7 .. v16}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 202
    .line 203
    .line 204
    :cond_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
