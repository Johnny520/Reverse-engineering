.class public final Lsf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Z

.field public β:Ljava/lang/Object;

.field public γ:Ljava/lang/Object;

.field public δ:Ljava/lang/Object;

.field public ε:Ljava/lang/Object;


# virtual methods
.method public α(Ln5;Landroidx/compose/ui/platform/AndroidComposeView;Z)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lsf;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lke0;

    .line 6
    .line 7
    iget-object v2, v1, Lsf;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lne0;

    .line 10
    .line 11
    iget-boolean v3, v1, Lsf;->α:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iput-boolean v3, v1, Lsf;->α:Z

    .line 19
    .line 20
    iget-object v5, v1, Lsf;->δ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Ly21;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    invoke-virtual {v5, v6, v7}, Ly21;->π(Ln5;Landroidx/compose/ui/platform/AndroidComposeView;)Ln5;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v5, Ln5;->ζ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Lzv0;

    .line 35
    .line 36
    invoke-virtual {v6}, Lzv0;->ζ()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v4

    .line 41
    :goto_0
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Lzv0;->η(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Lai1;

    .line 48
    .line 49
    iget-boolean v10, v9, Lai1;->δ:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v9, Lai1;->θ:Z

    .line 54
    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    :goto_1
    move v7, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v7, v3

    .line 67
    :goto_2
    invoke-virtual {v6}, Lzv0;->ζ()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    move v9, v4

    .line 72
    :goto_3
    if-ge v9, v8, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v9}, Lzv0;->η(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Lai1;

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    invoke-static {v10}, Lj81;->η(Lai1;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :cond_4
    iget-object v11, v1, Lsf;->β:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    check-cast v12, Lyp0;

    .line 92
    .line 93
    iget-wide v13, v10, Lai1;->γ:J

    .line 94
    .line 95
    iget-object v11, v1, Lsf;->ε:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v11

    .line 98
    check-cast v15, Lne0;

    .line 99
    .line 100
    iget v11, v10, Lai1;->ι:I

    .line 101
    .line 102
    const/16 v17, 0x1

    .line 103
    .line 104
    move/from16 v16, v11

    .line 105
    .line 106
    invoke-virtual/range {v12 .. v17}, Lyp0;->ω(JLne0;IZ)V

    .line 107
    .line 108
    .line 109
    iget-object v11, v2, Lne0;->ε:Lv11;

    .line 110
    .line 111
    invoke-virtual {v11}, Lv11;->θ()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    iget-wide v11, v10, Lai1;->α:J

    .line 118
    .line 119
    invoke-static {v10}, Lj81;->η(Lai1;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v0, v11, v12, v2, v10}, Lke0;->α(JLjava/util/List;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lne0;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move/from16 v2, p3

    .line 133
    .line 134
    invoke-virtual {v0, v5, v2}, Lke0;->β(Ln5;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {v6}, Lzv0;->ζ()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    move v5, v4

    .line 143
    :goto_4
    if-ge v5, v2, :cond_8

    .line 144
    .line 145
    invoke-virtual {v6, v5}, Lzv0;->η(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Lai1;

    .line 150
    .line 151
    invoke-static {v7, v3}, Lj81;->Ι(Lai1;Z)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    const-wide/16 v10, 0x0

    .line 156
    .line 157
    invoke-static {v8, v9, v10, v11}, Lo41;->α(JJ)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-nez v8, :cond_7

    .line 162
    .line 163
    invoke-virtual {v7}, Lai1;->β()Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    move v2, v3

    .line 170
    goto :goto_5

    .line 171
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_8
    move v2, v4

    .line 175
    :goto_5
    invoke-virtual {v6}, Lzv0;->ζ()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    move v7, v4

    .line 180
    :goto_6
    if-ge v7, v5, :cond_a

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Lzv0;->η(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    check-cast v8, Lai1;

    .line 187
    .line 188
    invoke-virtual {v8}, Lai1;->β()Z

    .line 189
    .line 190
    .line 191
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    if-eqz v8, :cond_9

    .line 193
    .line 194
    move v5, v3

    .line 195
    goto :goto_7

    .line 196
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_a
    move v5, v4

    .line 200
    :goto_7
    shl-int/2addr v2, v3

    .line 201
    or-int/2addr v0, v2

    .line 202
    shl-int/lit8 v2, v5, 0x2

    .line 203
    .line 204
    or-int/2addr v0, v2

    .line 205
    iput-boolean v4, v1, Lsf;->α:Z

    .line 206
    .line 207
    return v0

    .line 208
    :goto_8
    iput-boolean v4, v1, Lsf;->α:Z

    .line 209
    .line 210
    throw v0
.end method
