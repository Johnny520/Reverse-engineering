.class public final Lk4/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lk4/b;

.field public final b:Lv4/d0;

.field public final c:I

.field public final d:Lk4/d;

.field public e:I

.field public final synthetic f:I

.field public final g:Lz4/e;


# direct methods
.method public constructor <init>(Lk4/b;Lv4/d0;ILk4/d;B)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_1

    if-eqz p4, :cond_0

    .line 54
    iput-object p1, p0, Lk4/c;->a:Lk4/b;

    .line 55
    iput-object p2, p0, Lk4/c;->b:Lv4/d0;

    .line 56
    iput p3, p0, Lk4/c;->c:I

    .line 57
    iput-object p4, p0, Lk4/c;->d:Lk4/d;

    const/4 p1, -0x1

    .line 58
    iput p1, p0, Lk4/c;->e:I

    return-void

    .line 59
    :cond_0
    const-string p1, "attributeFactory == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 60
    :cond_1
    const-string p1, "offset < 0"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lk4/b;Lv4/d0;ILk4/d;I)V
    .locals 6

    .line 1
    iput p5, p0, Lk4/c;->f:I

    .line 2
    .line 3
    packed-switch p5, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v3, p3

    .line 11
    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lk4/c;-><init>(Lk4/b;Lv4/d0;ILk4/d;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lh4/u;

    .line 16
    .line 17
    iget-object v1, p1, Lk4/b;->b:Lg8/b;

    .line 18
    .line 19
    invoke-virtual {v1, p3}, Lg8/b;->g(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lk4/c;->g:Lz4/e;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    const/4 v5, 0x0

    .line 30
    move-object v0, p0

    .line 31
    move-object v1, p1

    .line 32
    move-object v2, p2

    .line 33
    move v3, p3

    .line 34
    move-object v4, p4

    .line 35
    invoke-direct/range {v0 .. v5}, Lk4/c;-><init>(Lk4/b;Lv4/d0;ILk4/d;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lh4/u;

    .line 39
    .line 40
    iget-object v1, p1, Lk4/b;->b:Lg8/b;

    .line 41
    .line 42
    invoke-virtual {v1, p3}, Lg8/b;->g(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lk4/c;->g:Lz4/e;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lk4/c;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "method"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "field"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lk4/c;->e:I

    .line 4
    .line 5
    if-gez v0, :cond_1

    .line 6
    .line 7
    const-string v2, "]"

    .line 8
    .line 9
    const-string v3, "s["

    .line 10
    .line 11
    const-string v4, "...while parsing "

    .line 12
    .line 13
    iget v0, v1, Lk4/c;->f:I

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    goto :goto_0

    .line 20
    :pswitch_0
    const/4 v0, 0x1

    .line 21
    :goto_0
    iget-object v5, v1, Lk4/c;->a:Lk4/b;

    .line 22
    .line 23
    iget-object v6, v5, Lk4/b;->b:Lg8/b;

    .line 24
    .line 25
    iget v7, v1, Lk4/c;->c:I

    .line 26
    .line 27
    invoke-virtual {v6, v7}, Lg8/b;->g(I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    add-int/lit8 v7, v7, 0x2

    .line 32
    .line 33
    iget-object v8, v5, Lk4/b;->b:Lg8/b;

    .line 34
    .line 35
    invoke-virtual {v5}, Lk4/b;->d()V

    .line 36
    .line 37
    .line 38
    iget-object v9, v5, Lk4/b;->d:Lv4/e0;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    :goto_1
    if-ge v11, v6, :cond_0

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v8, v7}, Lg8/b;->g(I)I

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    add-int/lit8 v13, v7, 0x2

    .line 48
    .line 49
    invoke-virtual {v8, v13}, Lg8/b;->g(I)I

    .line 50
    .line 51
    .line 52
    move-result v13

    .line 53
    add-int/lit8 v14, v7, 0x4

    .line 54
    .line 55
    invoke-virtual {v8, v14}, Lg8/b;->g(I)I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    invoke-virtual {v9, v13}, Lv4/e0;->l(I)Lv4/a;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    check-cast v13, Lv4/c0;

    .line 64
    .line 65
    invoke-virtual {v9, v14}, Lv4/e0;->l(I)Lv4/a;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    check-cast v14, Lv4/c0;

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x6

    .line 72
    .line 73
    new-instance v15, Lk4/a;

    .line 74
    .line 75
    iget-object v10, v1, Lk4/c;->d:Lk4/d;

    .line 76
    .line 77
    invoke-direct {v15, v5, v0, v7, v10}, Lk4/a;-><init>(Lk4/b;IILk4/d;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v15}, Lk4/a;->a()V

    .line 81
    .line 82
    .line 83
    iget v7, v15, Lk4/a;->c:I

    .line 84
    .line 85
    invoke-virtual {v15}, Lk4/a;->a()V

    .line 86
    .line 87
    .line 88
    iget-object v10, v15, Lk4/a;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, Lh4/u;

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    iput-boolean v15, v10, Lz4/j;->g:Z

    .line 94
    .line 95
    new-instance v15, Lv4/z;

    .line 96
    .line 97
    invoke-direct {v15, v13, v14}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v11, v12, v15, v10}, Lk4/c;->c(IILv4/z;Lh4/u;)Ll4/a;
    :try_end_0
    .catch Ll4/c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catch_0
    move-exception v0

    .line 107
    goto :goto_2

    .line 108
    :catch_1
    move-exception v0

    .line 109
    goto :goto_3

    .line 110
    :goto_2
    new-instance v5, Ll4/c;

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    invoke-direct {v5, v6, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lk4/c;->a()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v5, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v5

    .line 145
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Lk4/c;->a()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_0
    iput v7, v1, Lk4/c;->e:I

    .line 175
    .line 176
    :cond_1
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(IILv4/z;Lh4/u;)Ll4/a;
    .locals 2

    .line 1
    iget v0, p0, Lk4/c;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll4/f;

    .line 7
    .line 8
    iget-object v1, p0, Lk4/c;->b:Lv4/d0;

    .line 9
    .line 10
    invoke-direct {v0, v1, p2, p3, p4}, Ll4/f;-><init>(Lv4/d0;ILv4/z;Lh4/u;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lk4/c;->g:Lz4/e;

    .line 14
    .line 15
    check-cast p2, Lh4/u;

    .line 16
    .line 17
    invoke-virtual {p2, p1, v0}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Ll4/d;

    .line 22
    .line 23
    iget-object v1, p0, Lk4/c;->b:Lv4/d0;

    .line 24
    .line 25
    invoke-direct {v0, v1, p2, p3, p4}, Ll4/e;-><init>(Lv4/d0;ILv4/z;Lh4/u;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lk4/c;->g:Lz4/e;

    .line 29
    .line 30
    check-cast p2, Lh4/u;

    .line 31
    .line 32
    invoke-virtual {p2, p1, v0}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
