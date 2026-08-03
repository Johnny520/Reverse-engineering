.class public final synthetic Laa/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p2, p0, Laa/c;->g:I

    iput-object p1, p0, Laa/c;->h:Ljava/lang/Object;

    iput-object p3, p0, Laa/c;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqg/t;Lfg/l;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput v0, p0, Laa/c;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Laa/c;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lyf/i;

    .line 11
    .line 12
    iput-object p2, p0, Laa/c;->i:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Lr8/g;Lfg/p;)V
    .locals 1

    .line 16
    const/16 v0, 0x17

    iput v0, p0, Laa/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/c;->i:Ljava/lang/Object;

    check-cast p2, Lgg/j;

    iput-object p2, p0, Laa/c;->h:Ljava/lang/Object;

    return-void
.end method

.method private final e()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Laa/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v1, p0, Laa/c;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr8/g;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    iget-object v3, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lna/e;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v3, Lna/e;

    .line 18
    .line 19
    iget-object v4, v1, Lr8/g;->a:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v5, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 22
    .line 23
    iget-object v1, v1, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 24
    .line 25
    invoke-direct {v3, v4, v5, v1}, Lna/e;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;)V

    .line 26
    .line 27
    .line 28
    iput-object v3, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v3}, Lna/e;->c()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v0, v4}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_6

    .line 54
    :cond_1
    iget-object v1, v3, Lna/e;->c:Lh/Hchat/dexkit/DexFinder;

    .line 55
    .line 56
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyClass:Ljava/lang/Class;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->receiveLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v3, v2

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    :goto_2
    move v3, v4

    .line 69
    :goto_3
    iget-object v5, v1, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;

    .line 70
    .line 71
    if-nez v5, :cond_5

    .line 72
    .line 73
    iget-object v0, v1, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyUnionClass:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    move v0, v2

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    :goto_4
    move v0, v4

    .line 81
    :goto_5
    if-eqz v3, :cond_6

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    move v2, v4

    .line 86
    goto :goto_7

    .line 87
    :goto_6
    const-string v3, "\u81ea\u52a8\u62a2\u7ea2\u5305\u5b89\u88c5\u5931\u8d25"

    .line 88
    .line 89
    invoke-virtual {v0, v3, v1}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0
.end method

.method private final f()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Laa/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp8/d0;

    .line 4
    .line 5
    iget-object v1, p0, Laa/c;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    if-eqz v1, :cond_8

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lp8/h;->k()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_8

    .line 39
    .line 40
    iget-object v4, v0, Lp8/h;->j:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6, v4}, Lp8/h;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v4, v5

    .line 57
    :goto_0
    if-eqz v4, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    sget-object v4, Lp8/h;->o:Ljava/util/List;

    .line 61
    .line 62
    new-instance v6, Lc9/k1;

    .line 63
    .line 64
    const/16 v7, 0xa

    .line 65
    .line 66
    invoke-direct {v6, v0, v3, v7}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    const-string v7, "sns_info_update_v1"

    .line 70
    .line 71
    invoke-virtual {v0, v4, v6, v7}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-eqz v4, :cond_8

    .line 76
    .line 77
    iput-object v4, v0, Lp8/h;->j:Ljava/lang/reflect/Method;

    .line 78
    .line 79
    :goto_1
    const-string v6, "field_snsId"

    .line 80
    .line 81
    invoke-static {v1, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-eqz v6, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    const-string v6, "snsId"

    .line 89
    .line 90
    invoke-static {v1, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_8

    .line 95
    .line 96
    :goto_2
    instance-of v7, v6, Ljava/lang/Number;

    .line 97
    .line 98
    if-eqz v7, :cond_4

    .line 99
    .line 100
    move-object v5, v6

    .line 101
    check-cast v5, Ljava/lang/Number;

    .line 102
    .line 103
    :cond_4
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-static {v5}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-eqz v5, :cond_8

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    :goto_3
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    filled-new-array {v5, v1}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v4, v3, v1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    goto :goto_4

    .line 147
    :catchall_0
    move-exception v1

    .line 148
    new-instance v3, Lsf/f;

    .line 149
    .line 150
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    :goto_4
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-eqz v3, :cond_6

    .line 159
    .line 160
    iget-object v0, v0, Lp8/h;->d:Lp8/p;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v5, "\u66f4\u65b0\u670b\u53cb\u5708\u7f13\u5b58\u5931\u8d25: "

    .line 169
    .line 170
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v0, v3}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    instance-of v3, v1, Lsf/f;

    .line 186
    .line 187
    if-eqz v3, :cond_7

    .line 188
    .line 189
    move-object v1, v0

    .line 190
    :cond_7
    check-cast v1, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    goto :goto_6

    .line 197
    :cond_8
    :goto_5
    move v0, v2

    .line 198
    :goto_6
    const/4 v1, 0x1

    .line 199
    if-ne v0, v1, :cond_9

    .line 200
    .line 201
    move v2, v1

    .line 202
    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0
.end method

.method private final g()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Laa/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v1, p0, Laa/c;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr9/d0;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "hchat_message_details_view"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lr9/d0;->e(Landroid/widget/TextView;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Laa/c;->g:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, Ls8/c;

    .line 16
    .line 17
    iget-object v0, v1, Laa/c;->i:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v6, v0

    .line 20
    check-cast v6, Lr8/g;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    invoke-virtual {v2, v6}, Ls8/c;->E(Lr8/g;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {v2, v6}, Ls8/c;->r(Lr8/g;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v6}, Ls8/c;->p(Lr8/g;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v6, v7}, Ls8/c;->q(Lr8/g;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, v2, Ls8/c;->j:Z

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_0

    .line 58
    .line 59
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ls8/a;

    .line 64
    .line 65
    iget-object v9, v9, Ls8/a;->a:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    move v9, v4

    .line 78
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    :try_start_1
    sget-object v10, Lr8/i;->b:Lr8/i;

    .line 91
    .line 92
    new-instance v11, Ls8/b;

    .line 93
    .line 94
    invoke-direct {v11, v2, v6, v5}, Ls8/b;-><init>(Ls8/c;Lr8/g;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10, v0, v11}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    .line 99
    .line 100
    move v9, v5

    .line 101
    goto :goto_1

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    :try_start_2
    const-string v10, "\u9632\u64a4\u56de\u5165\u53e3Hook\u5b89\u88c5\u5931\u8d25"

    .line 104
    .line 105
    invoke-virtual {v2, v10, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    iput-boolean v9, v2, Ls8/c;->j:Z

    .line 110
    .line 111
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    const-string v0, "\u9632\u64a4\u56de\u5165\u53e3\u672a\u627e\u5230"

    .line 118
    .line 119
    invoke-virtual {v2, v0, v3}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-boolean v0, v2, Ls8/c;->j:Z

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    iget-boolean v0, v2, Ls8/c;->k:Z

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    iget-boolean v0, v2, Ls8/c;->l:Z

    .line 131
    .line 132
    if-nez v0, :cond_3

    .line 133
    .line 134
    iget-boolean v0, v2, Ls8/c;->m:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    :cond_3
    move v4, v5

    .line 139
    :cond_4
    monitor-exit v2

    .line 140
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :goto_2
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    throw v0

    .line 147
    :pswitch_0
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lv0/f;

    .line 150
    .line 151
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Lv0/d;

    .line 154
    .line 155
    new-instance v3, Ls/x0;

    .line 156
    .line 157
    sget-object v4, Ltf/u;->g:Ltf/u;

    .line 158
    .line 159
    invoke-direct {v3, v0, v4, v2}, Ls/x0;-><init>(Lv0/f;Ljava/util/Map;Lv0/d;)V

    .line 160
    .line 161
    .line 162
    return-object v3

    .line 163
    :pswitch_1
    invoke-direct {v1}, Laa/c;->g()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :pswitch_2
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 169
    .line 170
    move-object v2, v0

    .line 171
    check-cast v2, Lqb/k;

    .line 172
    .line 173
    iget-object v0, v1, Laa/c;->i:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lqb/i;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    :try_start_4
    new-instance v4, Ljava/io/File;

    .line 181
    .line 182
    new-instance v5, Ljava/io/File;

    .line 183
    .line 184
    invoke-virtual {v2}, Lqb/k;->n()Ljava/io/File;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    const-string v7, "Cache"

    .line 189
    .line 190
    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v6, "favorite_voice_preview.mp3"

    .line 194
    .line 195
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    new-instance v5, Ljava/io/File;

    .line 199
    .line 200
    iget-object v0, v0, Lqb/i;->a:Ljava/lang/String;

    .line 201
    .line 202
    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v5, v4}, Lqb/k;->E(Ljava/io/File;Ljava/io/File;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_5

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 215
    goto :goto_4

    .line 216
    :catchall_2
    move-exception v0

    .line 217
    goto :goto_3

    .line 218
    :cond_5
    move-object v0, v3

    .line 219
    goto :goto_4

    .line 220
    :goto_3
    new-instance v4, Lsf/f;

    .line 221
    .line 222
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    move-object v0, v4

    .line 226
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    if-nez v4, :cond_6

    .line 231
    .line 232
    move-object v3, v0

    .line 233
    goto :goto_5

    .line 234
    :cond_6
    iget-object v0, v2, Lqb/k;->b:Lia/t;

    .line 235
    .line 236
    const-string v2, "\u6536\u85cf\u8bed\u97f3\u9884\u89c8\u8f6c\u7801\u5931\u8d25"

    .line 237
    .line 238
    invoke-virtual {v0, v2, v4}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    :goto_5
    check-cast v3, Ljava/lang/String;

    .line 242
    .line 243
    return-object v3

    .line 244
    :pswitch_3
    invoke-direct {v1}, Laa/c;->f()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    return-object v0

    .line 249
    :pswitch_4
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Log/k;

    .line 252
    .line 253
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, Ljava/lang/CharSequence;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, Log/k;->g:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {v0, v4, v2}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0

    .line 277
    :pswitch_5
    iget-object v0, v1, Laa/c;->i:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Lr8/g;

    .line 280
    .line 281
    iget-object v2, v1, Laa/c;->h:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v2, Lgg/j;

    .line 284
    .line 285
    sget-object v3, Lo9/c;->a:Lo9/c;

    .line 286
    .line 287
    invoke-virtual {v3, v0, v5, v2}, Lo9/c;->c(Lr8/g;ZLfg/p;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :pswitch_6
    invoke-direct {v1}, Laa/c;->e()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0

    .line 301
    :pswitch_7
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Lgg/u;

    .line 304
    .line 305
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v2, Lk/i0;

    .line 308
    .line 309
    sget-object v3, Lv1/z0;->a:Li0/u;

    .line 310
    .line 311
    invoke-static {v2, v3}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iput-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 316
    .line 317
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_8
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lk/o;

    .line 323
    .line 324
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v2, Lx1/h0;

    .line 327
    .line 328
    iget-object v3, v0, Lk/o;->x:Lf1/r0;

    .line 329
    .line 330
    iget-object v4, v2, Lx1/h0;->g:Lh1/b;

    .line 331
    .line 332
    invoke-interface {v4}, Lh1/d;->a()J

    .line 333
    .line 334
    .line 335
    move-result-wide v4

    .line 336
    invoke-virtual {v2}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-interface {v3, v4, v5, v6, v2}, Lf1/r0;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    iput-object v2, v0, Lk/o;->C:Lf1/c0;

    .line 345
    .line 346
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_9
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 350
    .line 351
    move-object v5, v0

    .line 352
    check-cast v5, Lia/a0;

    .line 353
    .line 354
    iget-object v0, v1, Laa/c;->i:Ljava/lang/Object;

    .line 355
    .line 356
    move-object v6, v0

    .line 357
    check-cast v6, Ljava/lang/String;

    .line 358
    .line 359
    iget-object v2, v5, Lia/a0;->k:Ljava/lang/Object;

    .line 360
    .line 361
    monitor-enter v2

    .line 362
    :try_start_5
    invoke-virtual {v5, v6}, Lia/a0;->m(Ljava/lang/String;)Lp8/f;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iget-object v7, v0, Lp8/f;->b:Ljava/lang/Object;

    .line 367
    .line 368
    iget-boolean v0, v0, Lp8/f;->a:Z

    .line 369
    .line 370
    if-eqz v0, :cond_8

    .line 371
    .line 372
    if-nez v7, :cond_7

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_7
    iget-object v0, v5, Lia/a0;->b:Lb5/c;

    .line 376
    .line 377
    invoke-virtual {v0, v6}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v5, v0}, Lia/a0;->d(Lia/c;)Lia/c;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    invoke-static {v0}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    invoke-virtual {v5}, Lia/a0;->f()Z

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    invoke-virtual {v5}, Lia/a0;->e()Z

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    invoke-virtual/range {v5 .. v11}, Lia/a0;->h(Ljava/lang/String;Ljava/lang/Object;Lia/c;Lia/c;ZZ)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-eqz v4, :cond_8

    .line 402
    .line 403
    iget-object v7, v5, Lia/a0;->b:Lb5/c;

    .line 404
    .line 405
    invoke-virtual {v7, v6, v0}, Lb5/c;->a(Ljava/lang/String;Lia/c;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 406
    .line 407
    .line 408
    goto :goto_6

    .line 409
    :catchall_3
    move-exception v0

    .line 410
    goto :goto_7

    .line 411
    :cond_8
    :goto_6
    monitor-exit v2

    .line 412
    if-eqz v4, :cond_9

    .line 413
    .line 414
    invoke-static {}, Lia/a0;->c()Landroid/app/Activity;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    if-eqz v0, :cond_9

    .line 419
    .line 420
    invoke-virtual {v5, v0, v3}, Lia/a0;->n(Landroid/app/Activity;Landroid/view/View;)V

    .line 421
    .line 422
    .line 423
    :cond_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 424
    .line 425
    return-object v0

    .line 426
    :goto_7
    monitor-exit v2

    .line 427
    throw v0

    .line 428
    :pswitch_a
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 429
    .line 430
    move-object v8, v0

    .line 431
    check-cast v8, Lia/u;

    .line 432
    .line 433
    iget-object v0, v1, Laa/c;->i:Ljava/lang/Object;

    .line 434
    .line 435
    move-object v2, v0

    .line 436
    check-cast v2, Lr8/g;

    .line 437
    .line 438
    iget-object v15, v8, Lia/u;->g:Lp8/o;

    .line 439
    .line 440
    if-eqz v15, :cond_3d

    .line 441
    .line 442
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-eqz v0, :cond_11

    .line 447
    .line 448
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-eqz v0, :cond_10

    .line 453
    .line 454
    invoke-virtual {v0}, Lp8/h;->k()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    if-eqz v6, :cond_10

    .line 459
    .line 460
    iget-object v7, v0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 461
    .line 462
    if-eqz v7, :cond_b

    .line 463
    .line 464
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    invoke-static {v9, v7}, Lp8/h;->a(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    if-eqz v9, :cond_a

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_a
    move-object v7, v3

    .line 476
    :goto_8
    if-eqz v7, :cond_b

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_b
    const-string v7, "sns_info_get_by_id_v1"

    .line 480
    .line 481
    sget-object v9, Lp8/h;->l:Ljava/util/List;

    .line 482
    .line 483
    new-instance v10, Lc9/k1;

    .line 484
    .line 485
    const/16 v11, 0xf

    .line 486
    .line 487
    invoke-direct {v10, v0, v6, v11}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v9, v10, v7}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    if-eqz v7, :cond_c

    .line 495
    .line 496
    iput-object v7, v0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_c
    move-object v7, v3

    .line 500
    :goto_9
    iget-object v9, v0, Lp8/h;->j:Ljava/lang/reflect/Method;

    .line 501
    .line 502
    if-eqz v9, :cond_e

    .line 503
    .line 504
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    invoke-static {v10, v9}, Lp8/h;->e(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 509
    .line 510
    .line 511
    move-result v10

    .line 512
    if-eqz v10, :cond_d

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_d
    move-object v9, v3

    .line 516
    :goto_a
    if-eqz v9, :cond_e

    .line 517
    .line 518
    goto :goto_b

    .line 519
    :cond_e
    const-string v9, "sns_info_update_v1"

    .line 520
    .line 521
    sget-object v10, Lp8/h;->o:Ljava/util/List;

    .line 522
    .line 523
    new-instance v11, Lc9/k1;

    .line 524
    .line 525
    const/16 v12, 0x10

    .line 526
    .line 527
    invoke-direct {v11, v0, v6, v12}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v10, v11, v9}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    if-eqz v9, :cond_f

    .line 535
    .line 536
    iput-object v9, v0, Lp8/h;->j:Ljava/lang/reflect/Method;

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :cond_f
    move-object v9, v3

    .line 540
    :goto_b
    if-eqz v7, :cond_10

    .line 541
    .line 542
    if-eqz v9, :cond_10

    .line 543
    .line 544
    move v0, v5

    .line 545
    goto :goto_c

    .line 546
    :cond_10
    move v0, v4

    .line 547
    :goto_c
    move/from16 v16, v0

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :cond_11
    move/from16 v16, v4

    .line 551
    .line 552
    :goto_d
    iget-object v0, v8, Lia/u;->f:Lia/h;

    .line 553
    .line 554
    if-eqz v0, :cond_13

    .line 555
    .line 556
    invoke-virtual {v0}, Lia/h;->g()Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    if-ne v0, v5, :cond_12

    .line 561
    .line 562
    move v0, v5

    .line 563
    goto :goto_e

    .line 564
    :cond_12
    move v0, v4

    .line 565
    :goto_e
    move/from16 v17, v0

    .line 566
    .line 567
    goto :goto_f

    .line 568
    :cond_13
    move/from16 v17, v4

    .line 569
    .line 570
    :goto_f
    iget-object v6, v8, Lia/u;->e:Lia/a0;

    .line 571
    .line 572
    if-eqz v6, :cond_32

    .line 573
    .line 574
    iget-boolean v7, v6, Lia/a0;->o:Z

    .line 575
    .line 576
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-eqz v0, :cond_28

    .line 581
    .line 582
    invoke-virtual {v0}, Lp8/d0;->h()Lp8/x;

    .line 583
    .line 584
    .line 585
    move-result-object v9

    .line 586
    if-eqz v9, :cond_27

    .line 587
    .line 588
    monitor-enter v9

    .line 589
    :try_start_6
    iget-object v0, v9, Lp8/x;->h:Ljava/lang/Object;

    .line 590
    .line 591
    invoke-static {v0}, Lp8/x;->a(Ljava/util/List;)Z

    .line 592
    .line 593
    .line 594
    move-result v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 595
    if-eqz v10, :cond_14

    .line 596
    .line 597
    goto :goto_10

    .line 598
    :cond_14
    move-object v0, v3

    .line 599
    :goto_10
    if-eqz v0, :cond_15

    .line 600
    .line 601
    monitor-exit v9

    .line 602
    :goto_11
    move-object v3, v0

    .line 603
    goto/16 :goto_1b

    .line 604
    .line 605
    :cond_15
    :try_start_7
    iget-object v0, v9, Lp8/x;->a:Landroid/content/Context;

    .line 606
    .line 607
    iget-object v10, v9, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 608
    .line 609
    invoke-static {v0, v10}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    iget-object v10, v9, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 614
    .line 615
    iget-object v11, v9, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 616
    .line 617
    const-string v12, "native_comment_guards_v2"

    .line 618
    .line 619
    invoke-static {v10, v0, v11, v12}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v10

    .line 623
    new-instance v11, Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 626
    .line 627
    .line 628
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    :cond_16
    :goto_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v12

    .line 636
    if-eqz v12, :cond_19

    .line 637
    .line 638
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v12

    .line 642
    move-object v13, v12

    .line 643
    check-cast v13, Ljava/lang/reflect/Method;

    .line 644
    .line 645
    invoke-static {v13}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    if-nez v14, :cond_18

    .line 650
    .line 651
    invoke-static {v13}, Lp8/x;->c(Ljava/lang/reflect/Method;)Z

    .line 652
    .line 653
    .line 654
    move-result v13

    .line 655
    if-eqz v13, :cond_17

    .line 656
    .line 657
    goto :goto_13

    .line 658
    :cond_17
    move v13, v4

    .line 659
    goto :goto_14

    .line 660
    :cond_18
    :goto_13
    move v13, v5

    .line 661
    :goto_14
    if-eqz v13, :cond_16

    .line 662
    .line 663
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    goto :goto_12

    .line 667
    :catchall_4
    move-exception v0

    .line 668
    goto/16 :goto_1a

    .line 669
    .line 670
    :cond_19
    new-instance v10, Ljava/util/HashSet;

    .line 671
    .line 672
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 673
    .line 674
    .line 675
    new-instance v12, Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v11

    .line 684
    :cond_1a
    :goto_15
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v13

    .line 688
    if-eqz v13, :cond_1b

    .line 689
    .line 690
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v13

    .line 694
    move-object v14, v13

    .line 695
    check-cast v14, Ljava/lang/reflect/Method;

    .line 696
    .line 697
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v14

    .line 701
    invoke-virtual {v10, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v14

    .line 705
    if-eqz v14, :cond_1a

    .line 706
    .line 707
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    goto :goto_15

    .line 711
    :cond_1b
    invoke-static {v12}, Lp8/x;->a(Ljava/util/List;)Z

    .line 712
    .line 713
    .line 714
    move-result v10

    .line 715
    if-eqz v10, :cond_1c

    .line 716
    .line 717
    move-object v3, v12

    .line 718
    :cond_1c
    if-eqz v3, :cond_1d

    .line 719
    .line 720
    iput-object v3, v9, Lp8/x;->h:Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 721
    .line 722
    monitor-exit v9

    .line 723
    goto/16 :goto_1b

    .line 724
    .line 725
    :cond_1d
    :try_start_8
    invoke-virtual {v9}, Lp8/x;->f()Ljava/lang/reflect/Method;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    if-eqz v3, :cond_26

    .line 730
    .line 731
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    if-eqz v3, :cond_26

    .line 736
    .line 737
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    new-instance v10, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    :cond_1e
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 751
    .line 752
    .line 753
    move-result v11

    .line 754
    if-eqz v11, :cond_21

    .line 755
    .line 756
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v11

    .line 760
    move-object v12, v11

    .line 761
    check-cast v12, Ljava/lang/reflect/Method;

    .line 762
    .line 763
    invoke-static {v12}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 764
    .line 765
    .line 766
    move-result v13

    .line 767
    if-nez v13, :cond_20

    .line 768
    .line 769
    invoke-static {v12}, Lp8/x;->c(Ljava/lang/reflect/Method;)Z

    .line 770
    .line 771
    .line 772
    move-result v12

    .line 773
    if-eqz v12, :cond_1f

    .line 774
    .line 775
    goto :goto_17

    .line 776
    :cond_1f
    move v12, v4

    .line 777
    goto :goto_18

    .line 778
    :cond_20
    :goto_17
    move v12, v5

    .line 779
    :goto_18
    if-eqz v12, :cond_1e

    .line 780
    .line 781
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    goto :goto_16

    .line 785
    :cond_21
    new-instance v3, Ljava/util/HashSet;

    .line 786
    .line 787
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 788
    .line 789
    .line 790
    new-instance v11, Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 796
    .line 797
    .line 798
    move-result-object v10

    .line 799
    :cond_22
    :goto_19
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 800
    .line 801
    .line 802
    move-result v12

    .line 803
    if-eqz v12, :cond_23

    .line 804
    .line 805
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v12

    .line 809
    move-object v13, v12

    .line 810
    check-cast v13, Ljava/lang/reflect/Method;

    .line 811
    .line 812
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v13

    .line 816
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v13

    .line 820
    if-eqz v13, :cond_22

    .line 821
    .line 822
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    goto :goto_19

    .line 826
    :cond_23
    invoke-static {v11}, Lp8/x;->a(Ljava/util/List;)Z

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    if-nez v3, :cond_25

    .line 831
    .line 832
    iget-object v3, v9, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 833
    .line 834
    const-string v10, "native_comment_guards_v2"

    .line 835
    .line 836
    const-string v12, "cache.key"

    .line 837
    .line 838
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 839
    .line 840
    .line 841
    :try_start_9
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 842
    .line 843
    .line 844
    move-result-object v13

    .line 845
    const-string v14, ""

    .line 846
    .line 847
    invoke-interface {v3, v12, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    if-nez v3, :cond_24

    .line 856
    .line 857
    invoke-interface {v13}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    invoke-interface {v3, v12, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 862
    .line 863
    .line 864
    :cond_24
    invoke-interface {v13, v10}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 869
    .line 870
    .line 871
    :catchall_5
    :try_start_a
    iget-object v0, v9, Lp8/x;->d:Lp8/p;

    .line 872
    .line 873
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 874
    .line 875
    .line 876
    move-result v3

    .line 877
    new-instance v10, Ljava/lang/StringBuilder;

    .line 878
    .line 879
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 880
    .line 881
    .line 882
    const-string v11, "\u670b\u53cb\u5708\u8bc4\u8bba\u4fdd\u62a4\u5165\u53e3\u4e0d\u5b8c\u6574: count="

    .line 883
    .line 884
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    invoke-virtual {v0, v3}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 898
    .line 899
    iput-object v0, v9, Lp8/x;->h:Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 900
    .line 901
    monitor-exit v9

    .line 902
    goto/16 :goto_11

    .line 903
    .line 904
    :cond_25
    :try_start_b
    sget-object v3, Le8/b;->a:Le8/b;

    .line 905
    .line 906
    iget-object v10, v9, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 907
    .line 908
    const-string v12, "native_comment_guards_v2"

    .line 909
    .line 910
    invoke-virtual {v3, v10, v0, v12, v11}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 911
    .line 912
    .line 913
    iput-object v11, v9, Lp8/x;->h:Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 914
    .line 915
    monitor-exit v9

    .line 916
    move-object v3, v11

    .line 917
    goto :goto_1b

    .line 918
    :cond_26
    :try_start_c
    sget-object v0, Ltf/t;->g:Ltf/t;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 919
    .line 920
    monitor-exit v9

    .line 921
    goto/16 :goto_11

    .line 922
    .line 923
    :goto_1a
    :try_start_d
    monitor-exit v9
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 924
    throw v0

    .line 925
    :cond_27
    :goto_1b
    if-nez v3, :cond_28

    .line 926
    .line 927
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 928
    .line 929
    move-object v3, v0

    .line 930
    :cond_28
    if-nez v3, :cond_29

    .line 931
    .line 932
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 933
    .line 934
    :cond_29
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-eqz v0, :cond_2a

    .line 939
    .line 940
    iput-boolean v4, v6, Lia/a0;->o:Z

    .line 941
    .line 942
    move v0, v4

    .line 943
    goto/16 :goto_21

    .line 944
    .line 945
    :cond_2a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    if-eqz v0, :cond_2c

    .line 950
    .line 951
    :cond_2b
    move v0, v5

    .line 952
    goto :goto_20

    .line 953
    :cond_2c
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 954
    .line 955
    .line 956
    move-result-object v3

    .line 957
    :cond_2d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_2b

    .line 962
    .line 963
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    move-object v9, v0

    .line 968
    check-cast v9, Ljava/lang/reflect/Method;

    .line 969
    .line 970
    iget-object v10, v6, Lia/a0;->g:Ljava/util/Set;

    .line 971
    .line 972
    invoke-interface {v10, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-nez v0, :cond_2e

    .line 977
    .line 978
    move v0, v5

    .line 979
    goto :goto_1f

    .line 980
    :cond_2e
    :try_start_e
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 981
    .line 982
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 983
    .line 984
    .line 985
    move-result-object v11

    .line 986
    if-eqz v11, :cond_2f

    .line 987
    .line 988
    goto :goto_1c

    .line 989
    :cond_2f
    move-object v11, v9

    .line 990
    :goto_1c
    new-instance v12, Lia/z;

    .line 991
    .line 992
    invoke-direct {v12, v6, v4}, Lia/z;-><init>(Lia/a0;I)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v11, v12}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 996
    .line 997
    .line 998
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 999
    .line 1000
    goto :goto_1d

    .line 1001
    :catchall_6
    move-exception v0

    .line 1002
    new-instance v11, Lsf/f;

    .line 1003
    .line 1004
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1005
    .line 1006
    .line 1007
    move-object v0, v11

    .line 1008
    :goto_1d
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v11

    .line 1012
    if-nez v11, :cond_30

    .line 1013
    .line 1014
    goto :goto_1e

    .line 1015
    :cond_30
    invoke-interface {v10, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    iget-object v0, v6, Lia/a0;->d:Lab/b;

    .line 1019
    .line 1020
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v9

    .line 1024
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    const-string v12, "\u5b89\u88c5\u670b\u53cb\u5708\u4f2a\u8bc4\u8bba\u4ea4\u4e92\u4fdd\u62a4\u5931\u8d25: "

    .line 1027
    .line 1028
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v9

    .line 1038
    invoke-virtual {v0, v9, v11}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1042
    .line 1043
    :goto_1e
    check-cast v0, Ljava/lang/Boolean;

    .line 1044
    .line 1045
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    :goto_1f
    if-nez v0, :cond_2d

    .line 1050
    .line 1051
    move v0, v4

    .line 1052
    :goto_20
    iput-boolean v0, v6, Lia/a0;->o:Z

    .line 1053
    .line 1054
    if-eqz v0, :cond_31

    .line 1055
    .line 1056
    if-nez v7, :cond_31

    .line 1057
    .line 1058
    new-instance v3, Lia/x;

    .line 1059
    .line 1060
    invoke-direct {v3, v6, v5}, Lia/x;-><init>(Lia/a0;I)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v6, v3}, Lia/a0;->r(Lfg/a;)Z

    .line 1064
    .line 1065
    .line 1066
    :cond_31
    :goto_21
    if-ne v0, v5, :cond_32

    .line 1067
    .line 1068
    move v0, v5

    .line 1069
    goto :goto_22

    .line 1070
    :cond_32
    move v0, v4

    .line 1071
    :goto_22
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    if-eqz v3, :cond_33

    .line 1076
    .line 1077
    invoke-virtual {v3}, Lp8/d0;->i()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v3

    .line 1081
    if-ne v3, v5, :cond_33

    .line 1082
    .line 1083
    move v3, v5

    .line 1084
    goto :goto_23

    .line 1085
    :cond_33
    move v3, v4

    .line 1086
    :goto_23
    sget-object v6, Lp8/j;->a:Lp8/j;

    .line 1087
    .line 1088
    move-object v7, v6

    .line 1089
    new-instance v6, Lia/t;

    .line 1090
    .line 1091
    const-class v9, Lia/u;

    .line 1092
    .line 1093
    invoke-static {v9}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v9

    .line 1097
    const-string v10, "logFeatureError"

    .line 1098
    .line 1099
    const-string v11, "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 1100
    .line 1101
    const/4 v13, 0x0

    .line 1102
    const/4 v14, 0x0

    .line 1103
    move-object v12, v7

    .line 1104
    const/4 v7, 0x2

    .line 1105
    move-object/from16 v18, v12

    .line 1106
    .line 1107
    const/4 v12, 0x0

    .line 1108
    move-object/from16 v4, v18

    .line 1109
    .line 1110
    invoke-direct/range {v6 .. v14}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v4, v2, v15, v6}, Lp8/j;->d(Lr8/g;Lp8/o;Lfg/p;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    if-eqz v2, :cond_34

    .line 1118
    .line 1119
    if-eqz v3, :cond_34

    .line 1120
    .line 1121
    if-eqz v16, :cond_34

    .line 1122
    .line 1123
    if-eqz v17, :cond_34

    .line 1124
    .line 1125
    move v2, v5

    .line 1126
    goto :goto_24

    .line 1127
    :cond_34
    const/4 v2, 0x0

    .line 1128
    :goto_24
    iget-object v3, v8, Lia/u;->e:Lia/a0;

    .line 1129
    .line 1130
    if-eqz v3, :cond_36

    .line 1131
    .line 1132
    iget-boolean v4, v3, Lia/a0;->n:Z

    .line 1133
    .line 1134
    if-eq v4, v2, :cond_35

    .line 1135
    .line 1136
    move v4, v5

    .line 1137
    goto :goto_25

    .line 1138
    :cond_35
    const/4 v4, 0x0

    .line 1139
    :goto_25
    iput-boolean v2, v3, Lia/a0;->n:Z

    .line 1140
    .line 1141
    if-eqz v2, :cond_36

    .line 1142
    .line 1143
    if-eqz v4, :cond_36

    .line 1144
    .line 1145
    new-instance v4, Lia/x;

    .line 1146
    .line 1147
    invoke-direct {v4, v3, v5}, Lia/x;-><init>(Lia/a0;I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v3, v4}, Lia/a0;->r(Lfg/a;)Z

    .line 1151
    .line 1152
    .line 1153
    :cond_36
    if-eqz v2, :cond_3c

    .line 1154
    .line 1155
    iget-object v3, v8, Lia/u;->e:Lia/a0;

    .line 1156
    .line 1157
    if-eqz v3, :cond_3c

    .line 1158
    .line 1159
    iget-object v4, v3, Lia/a0;->e:Landroid/content/SharedPreferences;

    .line 1160
    .line 1161
    const-string v6, "pending_restore_all_v1"

    .line 1162
    .line 1163
    const/4 v7, 0x0

    .line 1164
    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v6

    .line 1168
    if-nez v6, :cond_38

    .line 1169
    .line 1170
    const-string v8, "pending_restore_likes_v1"

    .line 1171
    .line 1172
    invoke-interface {v4, v8, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v8

    .line 1176
    if-eqz v8, :cond_37

    .line 1177
    .line 1178
    goto :goto_26

    .line 1179
    :cond_37
    move v8, v7

    .line 1180
    goto :goto_27

    .line 1181
    :cond_38
    :goto_26
    move v8, v5

    .line 1182
    :goto_27
    if-nez v6, :cond_3a

    .line 1183
    .line 1184
    const-string v6, "pending_restore_comments_v1"

    .line 1185
    .line 1186
    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    if-eqz v4, :cond_39

    .line 1191
    .line 1192
    goto :goto_28

    .line 1193
    :cond_39
    const/4 v4, 0x0

    .line 1194
    goto :goto_29

    .line 1195
    :cond_3a
    :goto_28
    move v4, v5

    .line 1196
    :goto_29
    if-nez v8, :cond_3b

    .line 1197
    .line 1198
    if-nez v4, :cond_3b

    .line 1199
    .line 1200
    goto :goto_2a

    .line 1201
    :cond_3b
    new-instance v6, Lb0/d0;

    .line 1202
    .line 1203
    const/16 v7, 0x15

    .line 1204
    .line 1205
    invoke-direct {v6, v3, v7}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v3, v8, v4, v6}, Lia/a0;->o(ZZLfg/l;)Z

    .line 1209
    .line 1210
    .line 1211
    :cond_3c
    :goto_2a
    if-eqz v2, :cond_3d

    .line 1212
    .line 1213
    if-eqz v0, :cond_3d

    .line 1214
    .line 1215
    move v4, v5

    .line 1216
    goto :goto_2b

    .line 1217
    :cond_3d
    const/4 v4, 0x0

    .line 1218
    :goto_2b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    return-object v0

    .line 1223
    :pswitch_b
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v0, Lf/l0;

    .line 1226
    .line 1227
    iget-object v3, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v3, Li0/q;

    .line 1230
    .line 1231
    iget-object v4, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 1232
    .line 1233
    iget-object v0, v0, Lf/l0;->a:[J

    .line 1234
    .line 1235
    array-length v5, v0

    .line 1236
    sub-int/2addr v5, v2

    .line 1237
    if-ltz v5, :cond_41

    .line 1238
    .line 1239
    const/4 v2, 0x0

    .line 1240
    :goto_2c
    aget-wide v6, v0, v2

    .line 1241
    .line 1242
    not-long v8, v6

    .line 1243
    const/4 v10, 0x7

    .line 1244
    shl-long/2addr v8, v10

    .line 1245
    and-long/2addr v8, v6

    .line 1246
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    and-long/2addr v8, v10

    .line 1252
    cmp-long v8, v8, v10

    .line 1253
    .line 1254
    if-eqz v8, :cond_40

    .line 1255
    .line 1256
    sub-int v8, v2, v5

    .line 1257
    .line 1258
    not-int v8, v8

    .line 1259
    ushr-int/lit8 v8, v8, 0x1f

    .line 1260
    .line 1261
    const/16 v9, 0x8

    .line 1262
    .line 1263
    rsub-int/lit8 v8, v8, 0x8

    .line 1264
    .line 1265
    const/4 v10, 0x0

    .line 1266
    :goto_2d
    if-ge v10, v8, :cond_3f

    .line 1267
    .line 1268
    const-wide/16 v11, 0xff

    .line 1269
    .line 1270
    and-long/2addr v11, v6

    .line 1271
    const-wide/16 v13, 0x80

    .line 1272
    .line 1273
    cmp-long v11, v11, v13

    .line 1274
    .line 1275
    if-gez v11, :cond_3e

    .line 1276
    .line 1277
    shl-int/lit8 v11, v2, 0x3

    .line 1278
    .line 1279
    add-int/2addr v11, v10

    .line 1280
    aget-object v11, v4, v11

    .line 1281
    .line 1282
    invoke-virtual {v3, v11}, Li0/q;->z(Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    :cond_3e
    shr-long/2addr v6, v9

    .line 1286
    add-int/lit8 v10, v10, 0x1

    .line 1287
    .line 1288
    goto :goto_2d

    .line 1289
    :cond_3f
    if-ne v8, v9, :cond_41

    .line 1290
    .line 1291
    :cond_40
    if-eq v2, v5, :cond_41

    .line 1292
    .line 1293
    add-int/lit8 v2, v2, 0x1

    .line 1294
    .line 1295
    goto :goto_2c

    .line 1296
    :cond_41
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1297
    .line 1298
    return-object v0

    .line 1299
    :pswitch_c
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, Lb5/c;

    .line 1302
    .line 1303
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v2, Li0/s1;

    .line 1306
    .line 1307
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v0, Ls0/a;

    .line 1310
    .line 1311
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1312
    .line 1313
    .line 1314
    move-result v0

    .line 1315
    if-eqz v0, :cond_42

    .line 1316
    .line 1317
    goto :goto_2e

    .line 1318
    :cond_42
    invoke-virtual {v2}, Li0/s1;->invoke()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    :goto_2e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1322
    .line 1323
    return-object v0

    .line 1324
    :pswitch_d
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v0, Lsg/g;

    .line 1327
    .line 1328
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1329
    .line 1330
    invoke-interface {v0, v2}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1334
    .line 1335
    return-object v0

    .line 1336
    :pswitch_e
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v0, Lhb/r;

    .line 1339
    .line 1340
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v2, Lhb/q;

    .line 1343
    .line 1344
    iget-object v2, v2, Lhb/q;->a:Ljava/lang/String;

    .line 1345
    .line 1346
    iget-object v3, v0, Lhb/r;->d:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast v3, Landroid/os/Handler;

    .line 1349
    .line 1350
    new-instance v4, Lhb/o;

    .line 1351
    .line 1352
    invoke-direct {v4, v0, v2, v5}, Lhb/o;-><init>(Lhb/r;Ljava/lang/String;I)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1356
    .line 1357
    .line 1358
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1359
    .line 1360
    return-object v0

    .line 1361
    :pswitch_f
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v0, Lhb/k;

    .line 1364
    .line 1365
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v2, Lhb/i;

    .line 1368
    .line 1369
    iget-object v2, v2, Lhb/i;->a:Ljava/lang/String;

    .line 1370
    .line 1371
    iget-object v3, v0, Lhb/k;->c:Landroid/os/Handler;

    .line 1372
    .line 1373
    new-instance v4, La1/d;

    .line 1374
    .line 1375
    const/16 v5, 0x11

    .line 1376
    .line 1377
    invoke-direct {v4, v0, v5, v2}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1381
    .line 1382
    .line 1383
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1384
    .line 1385
    return-object v0

    .line 1386
    :pswitch_10
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v0, Lhb/c;

    .line 1389
    .line 1390
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1391
    .line 1392
    check-cast v2, Lhb/b;

    .line 1393
    .line 1394
    iget-object v2, v2, Lhb/b;->a:Ljava/lang/String;

    .line 1395
    .line 1396
    iget-object v0, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 1399
    .line 1400
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    check-cast v0, Lhb/b;

    .line 1405
    .line 1406
    if-eqz v0, :cond_43

    .line 1407
    .line 1408
    iget-object v2, v0, Lhb/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1409
    .line 1410
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1411
    .line 1412
    .line 1413
    iget-object v0, v0, Lhb/b;->c:Ljava/util/concurrent/CountDownLatch;

    .line 1414
    .line 1415
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1416
    .line 1417
    .line 1418
    :cond_43
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1419
    .line 1420
    return-object v0

    .line 1421
    :pswitch_11
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1422
    .line 1423
    check-cast v0, Lh0/d1;

    .line 1424
    .line 1425
    iget-object v4, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v4, Li0/a1;

    .line 1428
    .line 1429
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v4

    .line 1433
    check-cast v4, Lu2/l;

    .line 1434
    .line 1435
    iget-wide v6, v4, Lu2/l;->a:J

    .line 1436
    .line 1437
    invoke-virtual {v0}, Lh0/d1;->i()Le1/b;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v4

    .line 1441
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    if-eqz v4, :cond_4b

    .line 1447
    .line 1448
    iget-wide v10, v4, Le1/b;->a:J

    .line 1449
    .line 1450
    invoke-virtual {v0}, Lh0/d1;->m()Li2/g;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v4

    .line 1454
    if-eqz v4, :cond_4b

    .line 1455
    .line 1456
    iget-object v4, v4, Li2/g;->h:Ljava/lang/String;

    .line 1457
    .line 1458
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1459
    .line 1460
    .line 1461
    move-result v4

    .line 1462
    if-nez v4, :cond_44

    .line 1463
    .line 1464
    goto/16 :goto_32

    .line 1465
    .line 1466
    :cond_44
    iget-object v4, v0, Lh0/d1;->q:Li0/j1;

    .line 1467
    .line 1468
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v4

    .line 1472
    check-cast v4, Lw/g0;

    .line 1473
    .line 1474
    const/4 v12, -0x1

    .line 1475
    if-nez v4, :cond_45

    .line 1476
    .line 1477
    move v4, v12

    .line 1478
    goto :goto_2f

    .line 1479
    :cond_45
    sget-object v13, Lh0/f1;->a:[I

    .line 1480
    .line 1481
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1482
    .line 1483
    .line 1484
    move-result v4

    .line 1485
    aget v4, v13, v4

    .line 1486
    .line 1487
    :goto_2f
    if-eq v4, v12, :cond_4b

    .line 1488
    .line 1489
    const-wide v12, 0xffffffffL

    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    const/16 v14, 0x20

    .line 1495
    .line 1496
    if-eq v4, v5, :cond_47

    .line 1497
    .line 1498
    if-eq v4, v2, :cond_47

    .line 1499
    .line 1500
    const/4 v5, 0x3

    .line 1501
    if-ne v4, v5, :cond_46

    .line 1502
    .line 1503
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v3

    .line 1507
    iget-wide v3, v3, Ln2/s;->b:J

    .line 1508
    .line 1509
    sget v5, Li2/m0;->c:I

    .line 1510
    .line 1511
    and-long/2addr v3, v12

    .line 1512
    :goto_30
    long-to-int v3, v3

    .line 1513
    goto :goto_31

    .line 1514
    :cond_46
    invoke-static {}, Lokio/a;->k()V

    .line 1515
    .line 1516
    .line 1517
    goto/16 :goto_33

    .line 1518
    .line 1519
    :cond_47
    invoke-virtual {v0}, Lh0/d1;->n()Ln2/s;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v3

    .line 1523
    iget-wide v3, v3, Ln2/s;->b:J

    .line 1524
    .line 1525
    sget v5, Li2/m0;->c:I

    .line 1526
    .line 1527
    shr-long/2addr v3, v14

    .line 1528
    goto :goto_30

    .line 1529
    :goto_31
    iget-object v4, v0, Lh0/d1;->d:Lw/q0;

    .line 1530
    .line 1531
    if-eqz v4, :cond_4b

    .line 1532
    .line 1533
    invoke-virtual {v4}, Lw/q0;->d()Lw/m1;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v4

    .line 1537
    if-nez v4, :cond_48

    .line 1538
    .line 1539
    goto :goto_32

    .line 1540
    :cond_48
    iget-object v5, v0, Lh0/d1;->d:Lw/q0;

    .line 1541
    .line 1542
    if-eqz v5, :cond_4b

    .line 1543
    .line 1544
    iget-object v5, v5, Lw/q0;->a:Lw/x0;

    .line 1545
    .line 1546
    iget-object v5, v5, Lw/x0;->a:Li2/g;

    .line 1547
    .line 1548
    if-nez v5, :cond_49

    .line 1549
    .line 1550
    goto :goto_32

    .line 1551
    :cond_49
    iget-object v0, v0, Lh0/d1;->b:Lb5/k;

    .line 1552
    .line 1553
    invoke-virtual {v0, v3}, Lb5/k;->l(I)I

    .line 1554
    .line 1555
    .line 1556
    iget-object v0, v5, Li2/g;->h:Ljava/lang/String;

    .line 1557
    .line 1558
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1559
    .line 1560
    .line 1561
    move-result v0

    .line 1562
    const/4 v5, 0x0

    .line 1563
    invoke-static {v3, v5, v0}, Lr9/e0;->r(III)I

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    invoke-virtual {v4, v10, v11}, Lw/m1;->d(J)J

    .line 1568
    .line 1569
    .line 1570
    move-result-wide v10

    .line 1571
    shr-long/2addr v10, v14

    .line 1572
    long-to-int v3, v10

    .line 1573
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1574
    .line 1575
    .line 1576
    move-result v3

    .line 1577
    iget-object v4, v4, Lw/m1;->a:Li2/k0;

    .line 1578
    .line 1579
    iget-object v5, v4, Li2/k0;->b:Li2/o;

    .line 1580
    .line 1581
    invoke-virtual {v5, v0}, Li2/o;->d(I)I

    .line 1582
    .line 1583
    .line 1584
    move-result v0

    .line 1585
    invoke-virtual {v4, v0}, Li2/k0;->e(I)F

    .line 1586
    .line 1587
    .line 1588
    move-result v10

    .line 1589
    invoke-virtual {v4, v0}, Li2/k0;->f(I)F

    .line 1590
    .line 1591
    .line 1592
    move-result v4

    .line 1593
    invoke-static {v10, v4}, Ljava/lang/Math;->min(FF)F

    .line 1594
    .line 1595
    .line 1596
    move-result v11

    .line 1597
    invoke-static {v10, v4}, Ljava/lang/Math;->max(FF)F

    .line 1598
    .line 1599
    .line 1600
    move-result v4

    .line 1601
    invoke-static {v3, v11, v4}, Lr9/e0;->q(FFF)F

    .line 1602
    .line 1603
    .line 1604
    move-result v4

    .line 1605
    const-wide/16 v10, 0x0

    .line 1606
    .line 1607
    invoke-static {v6, v7, v10, v11}, Lu2/l;->a(JJ)Z

    .line 1608
    .line 1609
    .line 1610
    move-result v10

    .line 1611
    if-nez v10, :cond_4a

    .line 1612
    .line 1613
    sub-float/2addr v3, v4

    .line 1614
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 1615
    .line 1616
    .line 1617
    move-result v3

    .line 1618
    shr-long/2addr v6, v14

    .line 1619
    long-to-int v6, v6

    .line 1620
    div-int/2addr v6, v2

    .line 1621
    int-to-float v6, v6

    .line 1622
    cmpl-float v3, v3, v6

    .line 1623
    .line 1624
    if-lez v3, :cond_4a

    .line 1625
    .line 1626
    goto :goto_32

    .line 1627
    :cond_4a
    invoke-virtual {v5, v0}, Li2/o;->f(I)F

    .line 1628
    .line 1629
    .line 1630
    move-result v3

    .line 1631
    invoke-virtual {v5, v0}, Li2/o;->b(I)F

    .line 1632
    .line 1633
    .line 1634
    move-result v0

    .line 1635
    sub-float/2addr v0, v3

    .line 1636
    int-to-float v2, v2

    .line 1637
    div-float/2addr v0, v2

    .line 1638
    add-float/2addr v0, v3

    .line 1639
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1640
    .line 1641
    .line 1642
    move-result v2

    .line 1643
    int-to-long v2, v2

    .line 1644
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1645
    .line 1646
    .line 1647
    move-result v0

    .line 1648
    int-to-long v4, v0

    .line 1649
    shl-long/2addr v2, v14

    .line 1650
    and-long/2addr v4, v12

    .line 1651
    or-long v8, v2, v4

    .line 1652
    .line 1653
    :cond_4b
    :goto_32
    new-instance v3, Le1/b;

    .line 1654
    .line 1655
    invoke-direct {v3, v8, v9}, Le1/b;-><init>(J)V

    .line 1656
    .line 1657
    .line 1658
    :goto_33
    return-object v3

    .line 1659
    :pswitch_12
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1660
    .line 1661
    check-cast v0, Lqg/t;

    .line 1662
    .line 1663
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1664
    .line 1665
    check-cast v2, Lyf/i;

    .line 1666
    .line 1667
    new-instance v4, Lci/c;

    .line 1668
    .line 1669
    invoke-direct {v4, v2, v3}, Lci/c;-><init>(Lfg/l;Lwf/c;)V

    .line 1670
    .line 1671
    .line 1672
    invoke-static {v0, v3, v4, v5}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 1673
    .line 1674
    .line 1675
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1676
    .line 1677
    return-object v0

    .line 1678
    :pswitch_13
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1679
    .line 1680
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1681
    .line 1682
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1683
    .line 1684
    check-cast v2, Ljava/lang/String;

    .line 1685
    .line 1686
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1687
    .line 1688
    .line 1689
    move-result v0

    .line 1690
    if-eqz v0, :cond_4e

    .line 1691
    .line 1692
    sget-object v0, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 1693
    .line 1694
    sget-object v0, Lh/Hchat/crash/g;->t:Ljava/io/File;

    .line 1695
    .line 1696
    if-eqz v0, :cond_4d

    .line 1697
    .line 1698
    invoke-static {v0, v2}, Lh/Hchat/crash/g;->l(Ljava/io/File;Ljava/lang/String;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v0

    .line 1702
    if-eqz v0, :cond_4e

    .line 1703
    .line 1704
    sget-object v0, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 1705
    .line 1706
    if-eqz v0, :cond_4c

    .line 1707
    .line 1708
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1709
    .line 1710
    .line 1711
    goto :goto_34

    .line 1712
    :cond_4c
    const-string v0, "pendingReportFile"

    .line 1713
    .line 1714
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1715
    .line 1716
    .line 1717
    throw v3

    .line 1718
    :cond_4d
    const-string v0, "lastReportFile"

    .line 1719
    .line 1720
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1721
    .line 1722
    .line 1723
    throw v3

    .line 1724
    :cond_4e
    :goto_34
    sput-object v3, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 1725
    .line 1726
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 1727
    .line 1728
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    sput-object v0, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 1732
    .line 1733
    sput-object v3, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1734
    .line 1735
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1736
    .line 1737
    const/4 v5, 0x0

    .line 1738
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1739
    .line 1740
    .line 1741
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1742
    .line 1743
    return-object v0

    .line 1744
    :pswitch_14
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1745
    .line 1746
    check-cast v0, Landroid/content/Context;

    .line 1747
    .line 1748
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1749
    .line 1750
    check-cast v2, Ljava/lang/ClassLoader;

    .line 1751
    .line 1752
    sget-object v4, Lfa/a;->f:Ljava/util/HashSet;

    .line 1753
    .line 1754
    const-string v4, "[Hchat:MiniProgramSplashAds] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u5f00\u5c4f\u5e7f\u544a Hook \u5b89\u88c5\u5931\u8d25: "

    .line 1755
    .line 1756
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v6

    .line 1760
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v6

    .line 1764
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 1765
    .line 1766
    .line 1767
    move-result v7

    .line 1768
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1769
    .line 1770
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1774
    .line 1775
    .line 1776
    const-string v6, "@"

    .line 1777
    .line 1778
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v6

    .line 1788
    sget-object v7, Lfa/a;->f:Ljava/util/HashSet;

    .line 1789
    .line 1790
    monitor-enter v7

    .line 1791
    :try_start_f
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1792
    .line 1793
    .line 1794
    move-result v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 1795
    if-eqz v8, :cond_4f

    .line 1796
    .line 1797
    monitor-exit v7

    .line 1798
    move v4, v5

    .line 1799
    goto :goto_37

    .line 1800
    :cond_4f
    :try_start_10
    const-string v8, "Hchat_skip_global_mini_program_splash_ads_method_cache"

    .line 1801
    .line 1802
    invoke-static {v0, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v8

    .line 1806
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v9

    .line 1810
    const-string v10, "splash_ad_check_method"

    .line 1811
    .line 1812
    invoke-static {v8, v9, v2, v10}, Le8/b;->e(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v2

    .line 1816
    if-eqz v2, :cond_52

    .line 1817
    .line 1818
    invoke-static {v2}, Lf8/i;->b(Ljava/lang/reflect/Method;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v8
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1822
    if-eqz v8, :cond_50

    .line 1823
    .line 1824
    move-object v3, v2

    .line 1825
    :cond_50
    if-eqz v3, :cond_52

    .line 1826
    .line 1827
    :try_start_11
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 1828
    .line 1829
    new-instance v8, Lea/b;

    .line 1830
    .line 1831
    const/4 v9, 0x0

    .line 1832
    invoke-direct {v8, v0, v5, v9}, Lea/b;-><init>(Landroid/content/Context;IZ)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v2, v3, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1836
    .line 1837
    .line 1838
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1839
    .line 1840
    .line 1841
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 1842
    .line 1843
    goto :goto_35

    .line 1844
    :catchall_7
    move-exception v0

    .line 1845
    :try_start_12
    new-instance v2, Lsf/f;

    .line 1846
    .line 1847
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1848
    .line 1849
    .line 1850
    move-object v0, v2

    .line 1851
    :goto_35
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v2

    .line 1855
    if-nez v2, :cond_51

    .line 1856
    .line 1857
    goto :goto_36

    .line 1858
    :cond_51
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v0

    .line 1862
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1863
    .line 1864
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v0

    .line 1874
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1875
    .line 1876
    .line 1877
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1878
    .line 1879
    :goto_36
    check-cast v0, Ljava/lang/Boolean;

    .line 1880
    .line 1881
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1882
    .line 1883
    .line 1884
    move-result v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 1885
    monitor-exit v7

    .line 1886
    goto :goto_37

    .line 1887
    :catchall_8
    move-exception v0

    .line 1888
    goto :goto_38

    .line 1889
    :cond_52
    monitor-exit v7

    .line 1890
    const/4 v4, 0x0

    .line 1891
    :goto_37
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v0

    .line 1895
    return-object v0

    .line 1896
    :goto_38
    monitor-exit v7

    .line 1897
    throw v0

    .line 1898
    :pswitch_15
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1899
    .line 1900
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1901
    .line 1902
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1903
    .line 1904
    check-cast v2, Lwb/dr;

    .line 1905
    .line 1906
    invoke-static {v0, v2}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->l(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Lwb/dr;)Lsf/n;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v0

    .line 1910
    return-object v0

    .line 1911
    :pswitch_16
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1912
    .line 1913
    check-cast v0, Landroid/content/Context;

    .line 1914
    .line 1915
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1916
    .line 1917
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1918
    .line 1919
    .line 1920
    sget-object v3, Lc9/d2;->a:Lc9/d2;

    .line 1921
    .line 1922
    invoke-static {v2, v0}, Lc9/d2;->A(Ljava/lang/Object;Landroid/content/Context;)V

    .line 1923
    .line 1924
    .line 1925
    invoke-static {v2}, Lc9/d2;->B(Ljava/lang/Object;)V

    .line 1926
    .line 1927
    .line 1928
    const-string v0, "adapter"

    .line 1929
    .line 1930
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v0

    .line 1934
    if-eqz v0, :cond_53

    .line 1935
    .line 1936
    sget-object v2, Lc9/d2;->p:Ljava/lang/reflect/Method;

    .line 1937
    .line 1938
    const/4 v7, 0x0

    .line 1939
    new-array v3, v7, [Ljava/lang/Object;

    .line 1940
    .line 1941
    invoke-static {v2, v0, v3}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1942
    .line 1943
    .line 1944
    :cond_53
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1945
    .line 1946
    return-object v0

    .line 1947
    :pswitch_17
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1948
    .line 1949
    check-cast v0, Landroid/app/Activity;

    .line 1950
    .line 1951
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1952
    .line 1953
    check-cast v2, Lc9/u1;

    .line 1954
    .line 1955
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1956
    .line 1957
    .line 1958
    sget-object v3, Lc9/d2;->a:Lc9/d2;

    .line 1959
    .line 1960
    iget-object v2, v2, Lc9/u1;->d:Ljava/lang/Object;

    .line 1961
    .line 1962
    invoke-static {v2, v0}, Lc9/d2;->w(Ljava/lang/Object;Landroid/content/Context;)V

    .line 1963
    .line 1964
    .line 1965
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1966
    .line 1967
    return-object v0

    .line 1968
    :pswitch_18
    move v7, v4

    .line 1969
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 1970
    .line 1971
    check-cast v0, Landroid/content/Context;

    .line 1972
    .line 1973
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 1974
    .line 1975
    check-cast v2, Landroid/view/textclassifier/TextClassification;

    .line 1976
    .line 1977
    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getText()Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v3

    .line 1981
    if-eqz v3, :cond_54

    .line 1982
    .line 1983
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 1984
    .line 1985
    .line 1986
    move-result v4

    .line 1987
    goto :goto_39

    .line 1988
    :cond_54
    move v4, v7

    .line 1989
    :goto_39
    invoke-virtual {v2}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v2

    .line 1993
    const/high16 v3, 0xc000000

    .line 1994
    .line 1995
    invoke-static {v0, v4, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v2

    .line 1999
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2000
    .line 2001
    const/16 v3, 0x22

    .line 2002
    .line 2003
    if-lt v0, v3, :cond_55

    .line 2004
    .line 2005
    :try_start_13
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    invoke-static {v0}, Lb0/a0;->a(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v0

    .line 2013
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v0

    .line 2017
    invoke-static {v2, v0}, Lb0/a0;->m(Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    :try_end_13
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_13 .. :try_end_13} :catch_0

    .line 2018
    .line 2019
    .line 2020
    goto :goto_3a

    .line 2021
    :catch_0
    move-exception v0

    .line 2022
    const-string v3, "TextClassification"

    .line 2023
    .line 2024
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2025
    .line 2026
    const-string v5, "error sending pendingIntent: "

    .line 2027
    .line 2028
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2032
    .line 2033
    .line 2034
    const-string v2, " error: "

    .line 2035
    .line 2036
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v0

    .line 2046
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2047
    .line 2048
    .line 2049
    goto :goto_3a

    .line 2050
    :cond_55
    invoke-virtual {v2}, Landroid/app/PendingIntent;->send()V

    .line 2051
    .line 2052
    .line 2053
    :goto_3a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2054
    .line 2055
    return-object v0

    .line 2056
    :pswitch_19
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 2057
    .line 2058
    check-cast v0, Lz/d;

    .line 2059
    .line 2060
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 2061
    .line 2062
    check-cast v2, Lz/g;

    .line 2063
    .line 2064
    iget-object v0, v0, Lz/d;->d:Lfg/l;

    .line 2065
    .line 2066
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2070
    .line 2071
    return-object v0

    .line 2072
    :pswitch_1a
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 2073
    .line 2074
    check-cast v0, Ld0/d;

    .line 2075
    .line 2076
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 2077
    .line 2078
    check-cast v2, Lfg/a;

    .line 2079
    .line 2080
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v2

    .line 2084
    check-cast v2, Lv1/t;

    .line 2085
    .line 2086
    invoke-interface {v0, v2}, Ld0/d;->E0(Lv1/t;)J

    .line 2087
    .line 2088
    .line 2089
    move-result-wide v2

    .line 2090
    invoke-static {v2, v3}, Lig/a;->W(J)J

    .line 2091
    .line 2092
    .line 2093
    move-result-wide v2

    .line 2094
    new-instance v0, Lu2/j;

    .line 2095
    .line 2096
    invoke-direct {v0, v2, v3}, Lu2/j;-><init>(J)V

    .line 2097
    .line 2098
    .line 2099
    return-object v0

    .line 2100
    :pswitch_1b
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 2101
    .line 2102
    check-cast v0, Lgg/u;

    .line 2103
    .line 2104
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 2105
    .line 2106
    check-cast v2, Lfg/a;

    .line 2107
    .line 2108
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v2

    .line 2112
    iput-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 2113
    .line 2114
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2115
    .line 2116
    return-object v0

    .line 2117
    :pswitch_1c
    move v7, v4

    .line 2118
    iget-object v0, v1, Laa/c;->h:Ljava/lang/Object;

    .line 2119
    .line 2120
    check-cast v0, Laa/e;

    .line 2121
    .line 2122
    iget-object v2, v1, Laa/c;->i:Ljava/lang/Object;

    .line 2123
    .line 2124
    check-cast v2, Lr8/g;

    .line 2125
    .line 2126
    iget-boolean v4, v0, Laa/e;->e:Z

    .line 2127
    .line 2128
    if-eqz v4, :cond_56

    .line 2129
    .line 2130
    move v4, v5

    .line 2131
    goto/16 :goto_40

    .line 2132
    .line 2133
    :cond_56
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageParser()Lk8/q;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v4

    .line 2137
    if-eqz v4, :cond_61

    .line 2138
    .line 2139
    iget-object v6, v2, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 2140
    .line 2141
    iget-object v6, v6, Lh/Hchat/dexkit/DexFinder;->addMsgClasses:Ljava/util/List;

    .line 2142
    .line 2143
    if-eqz v6, :cond_61

    .line 2144
    .line 2145
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2146
    .line 2147
    .line 2148
    move-result v8

    .line 2149
    if-eqz v8, :cond_57

    .line 2150
    .line 2151
    goto/16 :goto_3f

    .line 2152
    .line 2153
    :cond_57
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v6

    .line 2157
    move v8, v7

    .line 2158
    :cond_58
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2159
    .line 2160
    .line 2161
    move-result v9

    .line 2162
    if-eqz v9, :cond_5e

    .line 2163
    .line 2164
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v9

    .line 2168
    check-cast v9, Ljava/lang/Class;

    .line 2169
    .line 2170
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v9

    .line 2174
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v9

    .line 2178
    :goto_3b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2179
    .line 2180
    .line 2181
    move-result v10

    .line 2182
    if-eqz v10, :cond_58

    .line 2183
    .line 2184
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v10

    .line 2188
    check-cast v10, Ljava/lang/reflect/Method;

    .line 2189
    .line 2190
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v11

    .line 2194
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2195
    .line 2196
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2197
    .line 2198
    .line 2199
    move-result v11

    .line 2200
    if-nez v11, :cond_59

    .line 2201
    .line 2202
    goto :goto_3b

    .line 2203
    :cond_59
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v11

    .line 2207
    if-eqz v11, :cond_5c

    .line 2208
    .line 2209
    new-instance v12, Ljava/util/ArrayList;

    .line 2210
    .line 2211
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 2212
    .line 2213
    .line 2214
    array-length v13, v11

    .line 2215
    move v14, v7

    .line 2216
    :goto_3c
    if-lt v14, v13, :cond_5a

    .line 2217
    .line 2218
    goto :goto_3d

    .line 2219
    :cond_5a
    aget-object v15, v11, v14

    .line 2220
    .line 2221
    invoke-static {v15}, Lk8/q;->h(Ljava/lang/Class;)Z

    .line 2222
    .line 2223
    .line 2224
    move-result v15

    .line 2225
    if-eqz v15, :cond_5b

    .line 2226
    .line 2227
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v15

    .line 2231
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2232
    .line 2233
    .line 2234
    :cond_5b
    add-int/lit8 v14, v14, 0x1

    .line 2235
    .line 2236
    goto :goto_3c

    .line 2237
    :cond_5c
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 2238
    .line 2239
    :goto_3d
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 2240
    .line 2241
    .line 2242
    move-result v11

    .line 2243
    if-eqz v11, :cond_5d

    .line 2244
    .line 2245
    goto :goto_3b

    .line 2246
    :cond_5d
    sget-object v11, Lr8/i;->b:Lr8/i;

    .line 2247
    .line 2248
    new-instance v13, Laa/d;

    .line 2249
    .line 2250
    invoke-direct {v13, v2, v12, v0, v4}, Laa/d;-><init>(Lr8/g;Ljava/util/List;Laa/e;Lk8/q;)V

    .line 2251
    .line 2252
    .line 2253
    invoke-virtual {v11, v10, v13}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 2254
    .line 2255
    .line 2256
    add-int/lit8 v8, v8, 0x1

    .line 2257
    .line 2258
    goto :goto_3b

    .line 2259
    :cond_5e
    if-lez v8, :cond_5f

    .line 2260
    .line 2261
    move v4, v5

    .line 2262
    goto :goto_3e

    .line 2263
    :cond_5f
    move v4, v7

    .line 2264
    :goto_3e
    iput-boolean v4, v0, Laa/e;->e:Z

    .line 2265
    .line 2266
    iget-boolean v2, v0, Laa/e;->e:Z

    .line 2267
    .line 2268
    if-nez v2, :cond_60

    .line 2269
    .line 2270
    const-string v2, "AddMsg \u5c4f\u853d\u5165\u53e3\u672a\u627e\u5230"

    .line 2271
    .line 2272
    invoke-virtual {v0, v2, v3}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2273
    .line 2274
    .line 2275
    :cond_60
    iget-boolean v4, v0, Laa/e;->e:Z

    .line 2276
    .line 2277
    goto :goto_40

    .line 2278
    :cond_61
    :goto_3f
    move v4, v7

    .line 2279
    :goto_40
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v0

    .line 2283
    return-object v0

    .line 2284
    nop

    .line 2285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
