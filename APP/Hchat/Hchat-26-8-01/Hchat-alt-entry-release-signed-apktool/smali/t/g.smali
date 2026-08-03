.class public final Lt/g;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Object;Li0/a1;Li0/a1;Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p7, p0, Lt/g;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lt/g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lt/g;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lt/g;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lt/g;->m:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 18
    iput p6, p0, Lt/g;->h:I

    iput-object p1, p0, Lt/g;->j:Ljava/lang/Object;

    iput-object p2, p0, Lt/g;->k:Ljava/lang/Object;

    iput-object p3, p0, Lt/g;->l:Ljava/lang/Object;

    iput-object p4, p0, Lt/g;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 10

    .line 1
    iget v0, p0, Lt/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lt/g;

    .line 7
    .line 8
    iget-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Landroid/content/Context;

    .line 12
    .line 13
    iget-object p1, p0, Lt/g;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Leb/c0;

    .line 17
    .line 18
    iget-object p1, p0, Lt/g;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Li0/a1;

    .line 22
    .line 23
    iget-object p1, p0, Lt/g;->l:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, Li0/a1;

    .line 27
    .line 28
    iget-object p1, p0, Lt/g;->m:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p1

    .line 31
    check-cast v6, Li0/a1;

    .line 32
    .line 33
    const/4 v8, 0x4

    .line 34
    move-object v7, p2

    .line 35
    invoke-direct/range {v1 .. v8}, Lt/g;-><init>(Landroid/content/Context;Ljava/lang/Object;Li0/a1;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    move-object v7, p2

    .line 40
    new-instance v2, Lt/g;

    .line 41
    .line 42
    iget-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, p1

    .line 45
    check-cast v3, Landroid/content/Context;

    .line 46
    .line 47
    iget-object p1, p0, Lt/g;->j:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v4, p1

    .line 50
    check-cast v4, Lwb/d4;

    .line 51
    .line 52
    iget-object p1, p0, Lt/g;->k:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v5, p1

    .line 55
    check-cast v5, Li0/a1;

    .line 56
    .line 57
    iget-object p1, p0, Lt/g;->l:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v6, p1

    .line 60
    check-cast v6, Li0/a1;

    .line 61
    .line 62
    iget-object p1, p0, Lt/g;->m:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Li0/a1;

    .line 65
    .line 66
    const/4 v9, 0x3

    .line 67
    move-object v8, v7

    .line 68
    move-object v7, p1

    .line 69
    invoke-direct/range {v2 .. v9}, Lt/g;-><init>(Landroid/content/Context;Ljava/lang/Object;Li0/a1;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_1
    move-object v7, p2

    .line 74
    new-instance v2, Lt/g;

    .line 75
    .line 76
    iget-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v3, p1

    .line 79
    check-cast v3, Landroid/content/Context;

    .line 80
    .line 81
    iget-object p1, p0, Lt/g;->j:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v4, p1

    .line 84
    check-cast v4, Lwb/v0;

    .line 85
    .line 86
    iget-object p1, p0, Lt/g;->k:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v5, p1

    .line 89
    check-cast v5, Li0/a1;

    .line 90
    .line 91
    iget-object p1, p0, Lt/g;->l:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v6, p1

    .line 94
    check-cast v6, Li0/a1;

    .line 95
    .line 96
    iget-object p1, p0, Lt/g;->m:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Li0/a1;

    .line 99
    .line 100
    const/4 v9, 0x2

    .line 101
    move-object v8, v7

    .line 102
    move-object v7, p1

    .line 103
    invoke-direct/range {v2 .. v9}, Lt/g;-><init>(Landroid/content/Context;Ljava/lang/Object;Li0/a1;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :pswitch_2
    move-object v7, p2

    .line 108
    new-instance v2, Lt/g;

    .line 109
    .line 110
    iget-object p2, p0, Lt/g;->j:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v3, p2

    .line 113
    check-cast v3, Ljava/lang/String;

    .line 114
    .line 115
    iget-object p2, p0, Lt/g;->k:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v4, p2

    .line 118
    check-cast v4, Li0/a1;

    .line 119
    .line 120
    iget-object p2, p0, Lt/g;->l:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v5, p2

    .line 123
    check-cast v5, Li0/a1;

    .line 124
    .line 125
    iget-object p2, p0, Lt/g;->m:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v6, p2

    .line 128
    check-cast v6, Li0/a1;

    .line 129
    .line 130
    const/4 v8, 0x1

    .line 131
    invoke-direct/range {v2 .. v8}, Lt/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 132
    .line 133
    .line 134
    iput-object p1, v2, Lt/g;->i:Ljava/lang/Object;

    .line 135
    .line 136
    return-object v2

    .line 137
    :pswitch_3
    move-object v7, p2

    .line 138
    new-instance v2, Lt/g;

    .line 139
    .line 140
    iget-object p2, p0, Lt/g;->j:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v3, p2

    .line 143
    check-cast v3, Lt/h;

    .line 144
    .line 145
    iget-object p2, p0, Lt/g;->k:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v4, p2

    .line 148
    check-cast v4, Lx1/i1;

    .line 149
    .line 150
    iget-object p2, p0, Lt/g;->l:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v5, p2

    .line 153
    check-cast v5, Lc1/b;

    .line 154
    .line 155
    iget-object p2, p0, Lt/g;->m:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v6, p2

    .line 158
    check-cast v6, Lab/e;

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    invoke-direct/range {v2 .. v8}, Lt/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 162
    .line 163
    .line 164
    iput-object p1, v2, Lt/g;->i:Ljava/lang/Object;

    .line 165
    .line 166
    return-object v2

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt/g;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lt/g;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lt/g;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lt/g;

    .line 40
    .line 41
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lt/g;

    .line 52
    .line 53
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lt/g;

    .line 65
    .line 66
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lt/g;->h:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lt/g;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lt/g;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lt/g;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lt/g;->j:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroid/content/Context;

    .line 22
    .line 23
    check-cast v5, Leb/c0;

    .line 24
    .line 25
    iget-object v1, v5, Leb/c0;->a:Ljava/lang/String;

    .line 26
    .line 27
    check-cast v4, Li0/a1;

    .line 28
    .line 29
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    const-string v4, ""

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-object v0, v4

    .line 46
    :cond_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v3, Li0/a1;

    .line 55
    .line 56
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v4, v3

    .line 72
    :goto_0
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v2, Li0/a1;

    .line 81
    .line 82
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/util/Map;

    .line 87
    .line 88
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/util/List;

    .line 93
    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 97
    .line 98
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    :try_start_0
    invoke-static {p1, v1, v0, v3, v2}, Lgb/k;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v2, v0

    .line 112
    check-cast v2, Lgb/r;

    .line 113
    .line 114
    invoke-static {p1}, Lgb/q;->g(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lgb/q;->f(Lorg/json/JSONObject;)Lgb/m;

    .line 123
    .line 124
    .line 125
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :try_start_1
    invoke-static {p1, v2, v3}, Lgb/b;->n(Landroid/content/Context;Lgb/r;Lgb/m;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    check-cast v0, Lgb/m;
    :try_end_1
    .catch Lgb/f; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object p1, v0

    .line 138
    goto :goto_2

    .line 139
    :catch_0
    move-exception v0

    .line 140
    if-eqz v3, :cond_3

    .line 141
    .line 142
    :try_start_2
    iget-object v3, v0, Lgb/f;->g:Ljava/lang/String;

    .line 143
    .line 144
    const-string v4, "PLUGIN_NOT_FOUND"

    .line 145
    .line 146
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_3

    .line 151
    .line 152
    invoke-static {p1, v1}, Lgb/q;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/4 v0, 0x0

    .line 156
    invoke-static {p1, v2, v0}, Lgb/b;->n(Landroid/content/Context;Lgb/r;Lgb/m;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    check-cast v0, Lgb/m;

    .line 164
    .line 165
    :goto_1
    invoke-static {p1, v1, v0}, Lgb/q;->k(Landroid/content/Context;Ljava/lang/String;Lgb/m;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_3
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    :goto_2
    new-instance v0, Lsf/f;

    .line 171
    .line 172
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    :goto_3
    new-instance p1, Lsf/g;

    .line 176
    .line 177
    invoke-direct {p1, v0}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-object p1

    .line 181
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    check-cast v5, Lwb/d4;

    .line 185
    .line 186
    check-cast v4, Li0/a1;

    .line 187
    .line 188
    check-cast v3, Li0/a1;

    .line 189
    .line 190
    move-object v6, v2

    .line 191
    check-cast v6, Li0/a1;

    .line 192
    .line 193
    new-instance v2, Lc9/q0;

    .line 194
    .line 195
    const/16 v7, 0x17

    .line 196
    .line 197
    move-object v12, v5

    .line 198
    move-object v5, v3

    .line 199
    move-object v3, v12

    .line 200
    invoke-direct/range {v2 .. v7}, Lc9/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 201
    .line 202
    .line 203
    invoke-static {v2}, Lwb/ho;->b6(Lfg/p;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    check-cast v5, Lwb/v0;

    .line 211
    .line 212
    iget-object p1, v5, Lwb/v0;->b:Lwb/u0;

    .line 213
    .line 214
    iget-boolean v0, v5, Lwb/v0;->f:Z

    .line 215
    .line 216
    check-cast v4, Li0/a1;

    .line 217
    .line 218
    check-cast v3, Li0/a1;

    .line 219
    .line 220
    check-cast v2, Li0/a1;

    .line 221
    .line 222
    new-instance v5, Lwb/la;

    .line 223
    .line 224
    const/16 v6, 0xf

    .line 225
    .line 226
    invoke-direct {v5, v4, v3, v2, v6}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 227
    .line 228
    .line 229
    invoke-static {p1, v0, v5}, Lwb/ho;->a6(Lwb/u0;ZLfg/p;)V

    .line 230
    .line 231
    .line 232
    return-object v1

    .line 233
    :pswitch_2
    iget-object v0, p0, Lt/g;->i:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lqg/t;

    .line 236
    .line 237
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    check-cast v5, Ljava/lang/String;

    .line 241
    .line 242
    check-cast v4, Li0/a1;

    .line 243
    .line 244
    check-cast v3, Li0/a1;

    .line 245
    .line 246
    check-cast v2, Li0/a1;

    .line 247
    .line 248
    :try_start_3
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 249
    .line 250
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 251
    .line 252
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Ljava/lang/String;

    .line 257
    .line 258
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ljava/lang/String;

    .line 263
    .line 264
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {p1, v5, v0, v1}, Lx8/x;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx8/v;

    .line 271
    .line 272
    .line 273
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 274
    goto :goto_4

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    move-object p1, v0

    .line 277
    new-instance v0, Lsf/f;

    .line 278
    .line 279
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 280
    .line 281
    .line 282
    move-object p1, v0

    .line 283
    :goto_4
    new-instance v0, Lsf/g;

    .line 284
    .line 285
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-object p1, p0, Lt/g;->i:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p1, Lqg/t;

    .line 295
    .line 296
    new-instance v6, Lc0/m;

    .line 297
    .line 298
    move-object v7, v5

    .line 299
    check-cast v7, Lt/h;

    .line 300
    .line 301
    move-object v8, v4

    .line 302
    check-cast v8, Lx1/i1;

    .line 303
    .line 304
    move-object v9, v3

    .line 305
    check-cast v9, Lc1/b;

    .line 306
    .line 307
    const/16 v11, 0x10

    .line 308
    .line 309
    const/4 v10, 0x0

    .line 310
    invoke-direct/range {v6 .. v11}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 311
    .line 312
    .line 313
    const/4 v0, 0x3

    .line 314
    invoke-static {p1, v10, v6, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 315
    .line 316
    .line 317
    new-instance v1, Lci/j;

    .line 318
    .line 319
    check-cast v2, Lab/e;

    .line 320
    .line 321
    const/16 v3, 0xe

    .line 322
    .line 323
    invoke-direct {v1, v7, v2, v10, v3}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 324
    .line 325
    .line 326
    invoke-static {p1, v10, v1, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    return-object p1

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
