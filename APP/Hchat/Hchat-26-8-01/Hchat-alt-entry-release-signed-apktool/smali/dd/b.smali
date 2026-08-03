.class public final Ldd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lmh/b;

.field public static final c:Lfc/e;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Ldd/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldd/b;->b:Lmh/b;

    .line 8
    .line 9
    new-instance v0, Lfc/e;

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lfc/e;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ldd/b;->c:Lfc/e;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/EnumMap;

    .line 5
    .line 6
    const-class v1, Lbc/b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldd/b;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lud/e;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lud/e;->a0()Lud/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ldd/b;->a(Lud/e;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ldd/b;->c(Lud/e;Z)Lbc/d;
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception v0

    .line 19
    :goto_0
    new-instance v1, Laf/g;

    .line 20
    .line 21
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 22
    .line 23
    invoke-virtual {p1}, Lod/a;->f()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v2, "Failed to process class: "

    .line 28
    .line 29
    invoke-static {v2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public final b(Lud/e;)Lbc/d;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lud/e;->a0()Lud/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ldd/b;->b(Lud/e;)Lbc/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    :try_start_0
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 13
    .line 14
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1, v1}, Ldd/b;->c(Lud/e;Z)Lbc/d;

    .line 24
    .line 25
    .line 26
    sget-object p1, Ldd/b;->c:Lfc/e;

    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception v0

    .line 30
    goto :goto_2

    .line 31
    :catch_1
    move-exception v0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    iget-object v0, p1, Lud/e;->z:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lud/e;

    .line 50
    .line 51
    invoke-virtual {p0, v2, v1}, Ldd/b;->c(Lud/e;Z)Lbc/d;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p1, Lud/e;->A:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, p1, v1}, Ldd/b;->c(Lud/e;Z)Lbc/d;

    .line 64
    .line 65
    .line 66
    iget-object v0, p1, Lud/e;->A:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lud/e;

    .line 83
    .line 84
    invoke-virtual {p0, v2, v1}, Ldd/b;->c(Lud/e;Z)Lbc/d;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v0, 0x1

    .line 89
    invoke-virtual {p0, p1, v0}, Ldd/b;->c(Lud/e;Z)Lbc/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_4
    new-instance v0, Laf/g;

    .line 97
    .line 98
    const-string v1, "Codegen failed"

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :goto_2
    new-instance v1, Laf/g;

    .line 105
    .line 106
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 107
    .line 108
    invoke-virtual {p1}, Lod/a;->f()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v2, "Failed to generate code for class: "

    .line 113
    .line 114
    invoke-static {v2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v1
.end method

.method public final c(Lud/e;Z)Lbc/d;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget v2, p1, Lud/e;->y:I

    .line 6
    .line 7
    if-ne v2, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lxe/s;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p1, Lud/e;->m:Lod/a;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget-object v3, Lmd/a;->h0:Lmd/a;

    .line 18
    .line 19
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Lmd/e;->D(Lmd/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lud/e;->W()V

    .line 31
    .line 32
    .line 33
    sget-object v3, Lmd/a;->i0:Lmd/a;

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lmd/e;->w(Lmd/a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :catch_1
    move-exception v0

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    :goto_0
    sget-object v3, Lmd/a;->i0:Lmd/a;

    .line 48
    .line 49
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iget-object v4, p1, Lud/e;->k:Lud/u;

    .line 58
    .line 59
    invoke-virtual {v4, p1}, Lud/u;->j(Lud/e;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v3}, Lmd/e;->D(Lmd/a;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget v3, p1, Lud/e;->y:I

    .line 66
    .line 67
    const/4 v4, 0x1

    .line 68
    const/4 v5, 0x5

    .line 69
    if-ne v3, v5, :cond_3

    .line 70
    .line 71
    iput v4, p1, Lud/e;->y:I

    .line 72
    .line 73
    :cond_3
    if-eqz p2, :cond_4

    .line 74
    .line 75
    sget-object v3, Lmd/a;->g0:Lmd/a;

    .line 76
    .line 77
    iget-object v6, p1, Lmd/e;->g:Lmd/f;

    .line 78
    .line 79
    invoke-virtual {v6, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1, v3}, Lmd/e;->D(Lmd/a;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lud/e;->o0()V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget v3, p1, Lud/e;->y:I

    .line 92
    .line 93
    if-ne v3, v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, Lud/e;->e0()V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget v3, p1, Lud/e;->y:I

    .line 99
    .line 100
    const/4 v4, 0x2

    .line 101
    if-ne v3, v4, :cond_7

    .line 102
    .line 103
    const/4 v3, 0x3

    .line 104
    iput v3, p1, Lud/e;->y:I

    .line 105
    .line 106
    iget-object v3, p0, Ldd/b;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Lbe/a;

    .line 123
    .line 124
    invoke-static {v4, p1}, Lbe/h;->h0(Lbe/a;Lud/e;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    iput v0, p1, Lud/e;->y:I

    .line 129
    .line 130
    :cond_7
    if-eqz p2, :cond_9

    .line 131
    .line 132
    invoke-static {}, Lxe/s;->a()V

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, La7/a;->v(Lud/e;)Lbc/d;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sget-object v3, Lmd/a;->j0:Lmd/a;

    .line 140
    .line 141
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 142
    .line 143
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_8

    .line 148
    .line 149
    invoke-virtual {p1}, Lud/e;->o0()V

    .line 150
    .line 151
    .line 152
    iput v5, p1, Lud/e;->y:I
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    :cond_8
    :try_start_1
    monitor-exit v2

    .line 155
    return-object v0

    .line 156
    :cond_9
    monitor-exit v2

    .line 157
    return-object v1

    .line 158
    :goto_2
    if-nez p2, :cond_a

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v4, "Class process error: "

    .line 174
    .line 175
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p1, p2, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    monitor-exit v2

    .line 189
    :goto_3
    return-object v1

    .line 190
    :cond_a
    throw v0

    .line 191
    :goto_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    throw p1
.end method
