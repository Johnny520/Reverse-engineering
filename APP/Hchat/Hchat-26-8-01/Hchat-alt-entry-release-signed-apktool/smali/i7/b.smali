.class public abstract Li7/b;
.super Lc7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Li7/f;

.field public final f:Lc7/b;


# direct methods
.method public constructor <init>(Li7/f;Lc7/b;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lc7/b;->a:Ld7/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld7/g;->a0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, La7/a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, ".error_file_path_"

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget v0, v0, Lk7/a;->g:I

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-direct {p0, v1}, Lc7/e;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Li7/b;->e:Li7/f;

    .line 33
    .line 34
    iput-object p2, p0, Li7/b;->f:Lc7/b;

    .line 35
    .line 36
    iget-object p1, p2, Lc7/b;->a:Ld7/m;

    .line 37
    .line 38
    invoke-virtual {p1}, Ld7/g;->c0()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lc7/e;->c:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 14

    .line 1
    iget-object v0, p0, Li7/b;->f:Lc7/b;

    .line 2
    .line 3
    iget-object v1, v0, Lc7/b;->a:Ld7/m;

    .line 4
    .line 5
    iget-object v2, v0, Lc7/b;->a:Ld7/m;

    .line 6
    .line 7
    invoke-virtual {v1}, Ld7/g;->c0()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v4, p0, Li7/b;->e:Li7/f;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    const/16 v5, 0x200

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    const/16 v7, 0x8

    .line 21
    .line 22
    if-ne v3, v7, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, 0x0

    .line 26
    const/16 v8, 0x400

    .line 27
    .line 28
    :try_start_0
    new-array v9, v8, [B

    .line 29
    .line 30
    iget-object v10, v0, Lc7/b;->a:Ld7/m;

    .line 31
    .line 32
    iget-wide v10, v10, Ld7/g;->s:J

    .line 33
    .line 34
    invoke-virtual {v0}, Lc7/b;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v12

    .line 38
    invoke-virtual {v4, v10, v11, v12, v13}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    new-instance v11, Ljava/util/zip/InflaterInputStream;

    .line 43
    .line 44
    new-instance v12, Ljava/util/zip/Inflater;

    .line 45
    .line 46
    invoke-direct {v12, v6}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v11, v10, v12, v5}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v11, v9, v3, v8}, Ljava/io/InputStream;->read([BII)I

    .line 53
    .line 54
    .line 55
    iget v8, v2, Ld7/g;->p:I

    .line 56
    .line 57
    add-int/lit8 v8, v8, 0x2

    .line 58
    .line 59
    invoke-virtual {v2, v8, v7}, Ld7/s;->R(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lc7/b;->a()Ld7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    iget v9, v8, Ld7/g;->p:I

    .line 67
    .line 68
    add-int/lit8 v9, v9, 0x2

    .line 69
    .line 70
    invoke-virtual {v8, v9, v7}, Ld7/s;->R(II)V

    .line 71
    .line 72
    .line 73
    iput v7, p0, Lc7/e;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    :goto_0
    iget-object v1, v0, Lc7/b;->a:Ld7/m;

    .line 76
    .line 77
    iget-wide v1, v1, Ld7/g;->s:J

    .line 78
    .line 79
    invoke-virtual {v0}, Lc7/b;->b()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-virtual {v4, v1, v2, v7, v8}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Ljava/util/zip/InflaterInputStream;

    .line 88
    .line 89
    new-instance v2, Ljava/util/zip/Inflater;

    .line 90
    .line 91
    invoke-direct {v2, v6}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v1, v0, v2, v5}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V

    .line 95
    .line 96
    .line 97
    return-object v1

    .line 98
    :catchall_0
    iget v5, v2, Ld7/g;->p:I

    .line 99
    .line 100
    add-int/lit8 v5, v5, 0x2

    .line 101
    .line 102
    invoke-virtual {v2, v5, v3}, Ld7/s;->R(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lc7/b;->a()Ld7/d;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget v6, v5, Ld7/g;->p:I

    .line 110
    .line 111
    add-int/lit8 v6, v6, 0x2

    .line 112
    .line 113
    invoke-virtual {v5, v6, v3}, Ld7/s;->R(II)V

    .line 114
    .line 115
    .line 116
    iput v3, p0, Lc7/e;->c:I

    .line 117
    .line 118
    invoke-virtual {v1}, Ld7/m;->e0()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    invoke-virtual {v1}, Ld7/m;->X()J

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    cmp-long v3, v5, v7

    .line 127
    .line 128
    if-lez v3, :cond_2

    .line 129
    .line 130
    invoke-virtual {v1, v5, v6}, Ld7/m;->o0(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lc7/b;->a()Ld7/d;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ld7/g;->d0()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {v1, v3, v5, v6}, Ld7/s;->Q(IJ)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    cmp-long v3, v7, v5

    .line 146
    .line 147
    if-lez v3, :cond_3

    .line 148
    .line 149
    invoke-virtual {v1, v7, v8}, Ld7/m;->q0(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lc7/b;->a()Ld7/d;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget v3, v1, Ld7/g;->p:I

    .line 157
    .line 158
    add-int/lit8 v3, v3, 0x10

    .line 159
    .line 160
    invoke-virtual {v1, v3, v7, v8}, Ld7/s;->Q(IJ)V

    .line 161
    .line 162
    .line 163
    :cond_3
    :goto_1
    iget-wide v1, v2, Ld7/g;->s:J

    .line 164
    .line 165
    invoke-virtual {v0}, Lc7/b;->b()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-virtual {v4, v1, v2, v5, v6}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method
