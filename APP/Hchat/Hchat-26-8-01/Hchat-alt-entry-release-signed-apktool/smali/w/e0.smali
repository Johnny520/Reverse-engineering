.class public final Lw/e0;
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


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Li0/a1;Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p6, p0, Lw/e0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 16
    iput p5, p0, Lw/e0;->h:I

    iput-object p1, p0, Lw/e0;->j:Ljava/lang/Object;

    iput-object p2, p0, Lw/e0;->k:Ljava/lang/Object;

    iput-object p3, p0, Lw/e0;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    iget v0, p0, Lw/e0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw/e0;

    .line 7
    .line 8
    iget-object v0, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Li/c;

    .line 12
    .line 13
    iget-object v0, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Li/c;

    .line 17
    .line 18
    iget-object v0, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Li/c;

    .line 22
    .line 23
    const/4 v6, 0x4

    .line 24
    move-object v5, p2

    .line 25
    invoke-direct/range {v1 .. v6}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v1, Lw/e0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object v6, p2

    .line 32
    new-instance v2, Lw/e0;

    .line 33
    .line 34
    iget-object p1, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lwb/s5;

    .line 38
    .line 39
    iget-object p1, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, Landroid/content/SharedPreferences;

    .line 43
    .line 44
    iget-object p1, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    check-cast v5, Li0/a1;

    .line 48
    .line 49
    iget-object p1, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Li0/a1;

    .line 52
    .line 53
    const/4 v8, 0x3

    .line 54
    move-object v7, v6

    .line 55
    move-object v6, p1

    .line 56
    invoke-direct/range {v2 .. v8}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 57
    .line 58
    .line 59
    return-object v2

    .line 60
    :pswitch_1
    move-object v6, p2

    .line 61
    new-instance v2, Lw/e0;

    .line 62
    .line 63
    iget-object p1, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v3, p1

    .line 66
    check-cast v3, Landroid/content/Context;

    .line 67
    .line 68
    iget-object p1, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v4, p1

    .line 71
    check-cast v4, Li0/a1;

    .line 72
    .line 73
    iget-object p1, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v5, p1

    .line 76
    check-cast v5, Li0/a1;

    .line 77
    .line 78
    iget-object p1, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Li0/a1;

    .line 81
    .line 82
    const/4 v8, 0x2

    .line 83
    move-object v7, v6

    .line 84
    move-object v6, p1

    .line 85
    invoke-direct/range {v2 .. v8}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :pswitch_2
    move-object v6, p2

    .line 90
    new-instance v2, Lw/e0;

    .line 91
    .line 92
    iget-object p2, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v3, p2

    .line 95
    check-cast v3, Li0/a1;

    .line 96
    .line 97
    iget-object p2, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v4, p2

    .line 100
    check-cast v4, Li0/a1;

    .line 101
    .line 102
    iget-object p2, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v5, p2

    .line 105
    check-cast v5, Li0/a1;

    .line 106
    .line 107
    const/4 v7, 0x1

    .line 108
    invoke-direct/range {v2 .. v7}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 109
    .line 110
    .line 111
    iput-object p1, v2, Lw/e0;->i:Ljava/lang/Object;

    .line 112
    .line 113
    return-object v2

    .line 114
    :pswitch_3
    move-object v6, p2

    .line 115
    new-instance v2, Lw/e0;

    .line 116
    .line 117
    iget-object p2, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v3, p2

    .line 120
    check-cast v3, Ls1/x;

    .line 121
    .line 122
    iget-object p2, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v4, p2

    .line 125
    check-cast v4, Lw/y0;

    .line 126
    .line 127
    iget-object p2, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v5, p2

    .line 130
    check-cast v5, Lh0/d1;

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-direct/range {v2 .. v7}, Lw/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 134
    .line 135
    .line 136
    iput-object p1, v2, Lw/e0;->i:Ljava/lang/Object;

    .line 137
    .line 138
    return-object v2

    .line 139
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
    iget v0, p0, Lw/e0;->h:I

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
    invoke-virtual {p0, p1, p2}, Lw/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw/e0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lw/e0;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lw/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lw/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lw/e0;

    .line 39
    .line 40
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lw/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lw/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lw/e0;

    .line 51
    .line 52
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lw/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lw/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lw/e0;

    .line 63
    .line 64
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lw/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-object p2

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw/e0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 5
    .line 6
    iget-object v3, p0, Lw/e0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lw/e0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lw/e0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lqg/t;

    .line 18
    .line 19
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lwb/n3;

    .line 23
    .line 24
    check-cast v5, Li/c;

    .line 25
    .line 26
    const/4 v6, 0x7

    .line 27
    invoke-direct {p1, v5, v1, v6}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    invoke-static {v0, v1, p1, v5}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 32
    .line 33
    .line 34
    new-instance p1, Lwb/n3;

    .line 35
    .line 36
    check-cast v4, Li/c;

    .line 37
    .line 38
    const/16 v6, 0x8

    .line 39
    .line 40
    invoke-direct {p1, v4, v1, v6}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1, p1, v5}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 44
    .line 45
    .line 46
    new-instance p1, Lwb/n3;

    .line 47
    .line 48
    check-cast v3, Li/c;

    .line 49
    .line 50
    const/16 v4, 0x9

    .line 51
    .line 52
    invoke-direct {p1, v3, v1, v4}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, p1, v5}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lwb/s5;

    .line 65
    .line 66
    iget-boolean p1, p1, Lwb/s5;->c:Z

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    check-cast v5, Landroid/content/SharedPreferences;

    .line 71
    .line 72
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast v4, Li0/a1;

    .line 77
    .line 78
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 79
    .line 80
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v0}, La2/a;->g(Ljava/util/List;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v1, "message_block_templates"

    .line 91
    .line 92
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast v3, Li0/a1;

    .line 97
    .line 98
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/util/List;

    .line 103
    .line 104
    invoke-static {v0}, La2/a;->e(Ljava/util/List;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "message_block_bindings"

    .line 109
    .line 110
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 115
    .line 116
    .line 117
    :cond_0
    return-object v2

    .line 118
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    check-cast v5, Li0/a1;

    .line 122
    .line 123
    check-cast v4, Li0/a1;

    .line 124
    .line 125
    check-cast v3, Li0/a1;

    .line 126
    .line 127
    new-instance p1, Lwb/la;

    .line 128
    .line 129
    const/16 v0, 0x11

    .line 130
    .line 131
    invoke-direct {p1, v5, v4, v3, v0}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 135
    .line 136
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-nez v1, :cond_1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_1
    new-instance v1, Landroid/os/Handler;

    .line 150
    .line 151
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 156
    .line 157
    .line 158
    new-instance v3, Ljava/lang/Thread;

    .line 159
    .line 160
    new-instance v4, Lr8/b;

    .line 161
    .line 162
    const/4 v5, 0x4

    .line 163
    invoke-direct {v4, v0, v1, p1, v5}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    const-string p1, "HchatMessageBlockContacts"

    .line 167
    .line 168
    invoke-direct {v3, v4, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_2
    :goto_0
    new-instance v0, Lwb/j5;

    .line 176
    .line 177
    invoke-direct {v0}, Lwb/j5;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v3, "\u8054\u7cfb\u4eba\u5217\u8868\u4e0d\u53ef\u7528"

    .line 183
    .line 184
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0, v1}, Lwb/la;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    :goto_1
    return-object v2

    .line 191
    :pswitch_2
    iget-object v0, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 192
    .line 193
    move-object v7, v0

    .line 194
    check-cast v7, Lqg/t;

    .line 195
    .line 196
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    move-object p1, v5

    .line 200
    check-cast p1, Li0/a1;

    .line 201
    .line 202
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 203
    .line 204
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    move-object v0, v4

    .line 210
    check-cast v0, Li0/a1;

    .line 211
    .line 212
    const-string v1, ""

    .line 213
    .line 214
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    if-eqz v8, :cond_4

    .line 229
    .line 230
    invoke-virtual {v8}, Lg8/i;->G()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-nez v1, :cond_3

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_3
    new-instance p1, Ljava/lang/Thread;

    .line 238
    .line 239
    move-object v9, v3

    .line 240
    check-cast v9, Li0/a1;

    .line 241
    .line 242
    move-object v10, v4

    .line 243
    check-cast v10, Li0/a1;

    .line 244
    .line 245
    move-object v11, v5

    .line 246
    check-cast v11, Li0/a1;

    .line 247
    .line 248
    new-instance v6, Lb9/c;

    .line 249
    .line 250
    invoke-direct/range {v6 .. v11}, Lb9/c;-><init>(Lqg/t;Lg8/i;Li0/a1;Li0/a1;Li0/a1;)V

    .line 251
    .line 252
    .line 253
    const-string v0, "HchatAutoReplyLabels"

    .line 254
    .line 255
    invoke-direct {p1, v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_4
    :goto_2
    check-cast v3, Li0/a1;

    .line 263
    .line 264
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 265
    .line 266
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    const-string v1, "\u8054\u7cfb\u4eba\u6807\u7b7e\u4e0d\u53ef\u7528"

    .line 270
    .line 271
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_3
    return-object v2

    .line 280
    :pswitch_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget-object p1, p0, Lw/e0;->i:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast p1, Lqg/t;

    .line 286
    .line 287
    new-instance v0, Lw/d0;

    .line 288
    .line 289
    check-cast v5, Ls1/x;

    .line 290
    .line 291
    check-cast v4, Lw/y0;

    .line 292
    .line 293
    const/4 v6, 0x0

    .line 294
    invoke-direct {v0, v5, v4, v1, v6}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 295
    .line 296
    .line 297
    const/4 v4, 0x1

    .line 298
    invoke-static {p1, v1, v0, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 299
    .line 300
    .line 301
    new-instance v0, Lci/j;

    .line 302
    .line 303
    check-cast v3, Lh0/d1;

    .line 304
    .line 305
    const/16 v6, 0x12

    .line 306
    .line 307
    invoke-direct {v0, v5, v3, v1, v6}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 308
    .line 309
    .line 310
    invoke-static {p1, v1, v0, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 311
    .line 312
    .line 313
    return-object v2

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
