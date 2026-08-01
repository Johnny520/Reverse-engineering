.class public abstract Lpg1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final η:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lpg1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lpg1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lpg1;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lpg1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 38
    .line 39
    const-wide/16 v1, 0x0

    .line 40
    .line 41
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lpg1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lpg1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;Lky1;Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/lang/String;)Ll91;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    new-instance v3, Lf7;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    invoke-direct {v3, v4, v5}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v4, Log1;->ζ:Log1;

    .line 16
    .line 17
    new-instance v5, Ly30;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    invoke-direct {v5, v3, v6, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lcf1;

    .line 24
    .line 25
    const/16 v4, 0xb

    .line 26
    .line 27
    invoke-direct {v3, v4}, Lcf1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Lbu;

    .line 31
    .line 32
    invoke-interface {v5}, Lss1;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-direct {v4, v5, v3}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    move v5, v3

    .line 41
    :cond_0
    :goto_0
    invoke-virtual {v4}, Lσ;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_7

    .line 46
    .line 47
    invoke-virtual {v4}, Lσ;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    move-object v9, v7

    .line 52
    check-cast v9, Ltf1;

    .line 53
    .line 54
    iget-wide v7, v0, Lky1;->β:J

    .line 55
    .line 56
    iget-object v10, v9, Ltf1;->β:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v14, v9, Ltf1;->α:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v10, :cond_1

    .line 61
    .line 62
    move-object v10, v14

    .line 63
    :cond_1
    new-instance v11, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v7, ":"

    .line 72
    .line 73
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-nez v8, :cond_0

    .line 88
    .line 89
    iget-object v10, v0, Lky1;->α:Ljava/lang/String;

    .line 90
    .line 91
    iget-wide v11, v0, Lky1;->β:J

    .line 92
    .line 93
    iget v13, v0, Lky1;->δ:I

    .line 94
    .line 95
    move-object/from16 v8, p0

    .line 96
    .line 97
    invoke-static/range {v8 .. v13}, Lxn0;->υ(Ljava/lang/ClassLoader;Ltf1;Ljava/lang/String;JI)Lrf1;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    iget-object v8, v9, Lrf1;->α:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {v9}, Lrf1;->α()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    const-string v12, " taskId="

    .line 108
    .line 109
    const-string v13, "r86c859e3375e752"

    .line 110
    .line 111
    if-eqz v10, :cond_2

    .line 112
    .line 113
    move-object v10, v8

    .line 114
    check-cast v10, Lsf1;

    .line 115
    .line 116
    if-eqz v10, :cond_2

    .line 117
    .line 118
    iget v11, v10, Lsf1;->α:I

    .line 119
    .line 120
    iget v10, v10, Lsf1;->γ:I

    .line 121
    .line 122
    const/16 v15, 0x2f19

    .line 123
    .line 124
    filled-new-array {v11, v10}, [I

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-static {v15, v10}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->β(I[I)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-ne v10, v6, :cond_2

    .line 133
    .line 134
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    const-string v7, "\u751f\u4ea7\u9886\u53d6\u6210\u529f name="

    .line 140
    .line 141
    invoke-static {v7, v2, v12, v14}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    const/4 v8, 0x4

    .line 146
    const/4 v9, 0x0

    .line 147
    invoke-static {v13, v7, v9, v8, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    iget-object v7, v9, Lrf1;->β:Ljava/lang/Throwable;

    .line 154
    .line 155
    if-eqz v7, :cond_3

    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    if-nez v7, :cond_6

    .line 162
    .line 163
    :cond_3
    check-cast v8, Lsf1;

    .line 164
    .line 165
    if-eqz v8, :cond_4

    .line 166
    .line 167
    iget-object v9, v8, Lsf1;->δ:Ljava/lang/String;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    const/4 v9, 0x0

    .line 171
    :goto_1
    if-nez v9, :cond_5

    .line 172
    .line 173
    const-string v7, "unknown"

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_5
    move-object v7, v9

    .line 177
    :cond_6
    :goto_2
    const-string v8, "\u751f\u4ea7\u9886\u53d6\u5931\u8d25 name="

    .line 178
    .line 179
    const-string v9, " error="

    .line 180
    .line 181
    invoke-static {v8, v2, v12, v14, v9}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    const/4 v8, 0x4

    .line 193
    const/4 v9, 0x0

    .line 194
    invoke-static {v13, v7, v9, v8, v9}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :goto_3
    const-wide/16 v7, 0x12c

    .line 198
    .line 199
    invoke-static {v7, v8}, Lpg1;->μ(J)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v2, Ll91;

    .line 213
    .line 214
    invoke-direct {v2, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-object v2
.end method

.method public static β(Ljava/lang/String;I)Lmg1;
    .locals 9

    .line 1
    new-instance v0, Lmg1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v8, p0

    .line 10
    move v6, p1

    .line 11
    invoke-direct/range {v0 .. v8}, Lmg1;-><init>(IIIIIIILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static γ(Landroid/app/Activity;Llg1;)Lmg1;
    .locals 49

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    iget-object v8, v4, Llg1;->θ:Lmy1;

    .line 6
    .line 7
    sget-object v9, Lxn0;->χ:Lxn0;

    .line 8
    .line 9
    iget-object v10, v4, Llg1;->η:Lky1;

    .line 10
    .line 11
    iget-boolean v11, v4, Llg1;->δ:Z

    .line 12
    .line 13
    iget-object v12, v4, Llg1;->α:Lkg1;

    .line 14
    .line 15
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v2, Lcf1;

    .line 32
    .line 33
    const/16 v3, 0xc

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ly30;

    .line 39
    .line 40
    const/4 v13, 0x1

    .line 41
    invoke-direct {v3, v0, v13, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lbf1;

    .line 45
    .line 46
    invoke-direct {v0, v10, v13}, Lbf1;-><init>(Lky1;I)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Ly30;

    .line 50
    .line 51
    invoke-direct {v2, v3, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lib1;

    .line 55
    .line 56
    const/16 v3, 0xf

    .line 57
    .line 58
    invoke-direct {v0, v3}, Lib1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_0

    .line 77
    .line 78
    sget-object v0, Ljz;->ε:Ljz;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_1

    .line 90
    .line 91
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-static {v2}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    move-object v0, v2

    .line 115
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/4 v14, 0x0

    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    const-string v0, "\u6ca1\u6709\u5df2\u8bc6\u522b\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd"

    .line 123
    .line 124
    invoke-static {v1, v4, v14, v0, v13}, Lpg1;->δ(Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v13}, Lpg1;->β(Ljava/lang/String;I)Lmg1;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0

    .line 132
    :cond_3
    sget-object v2, Lng1;->α:[I

    .line 133
    .line 134
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    aget v2, v2, v3

    .line 139
    .line 140
    if-ne v2, v13, :cond_4

    .line 141
    .line 142
    move v15, v13

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    iget-boolean v2, v4, Llg1;->β:Z

    .line 145
    .line 146
    move v15, v2

    .line 147
    :goto_2
    iget-boolean v2, v4, Llg1;->γ:Z

    .line 148
    .line 149
    sget-object v3, Lkg1;->ε:Lkg1;

    .line 150
    .line 151
    if-ne v12, v3, :cond_5

    .line 152
    .line 153
    move-object v3, v0

    .line 154
    goto :goto_5

    .line 155
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_8

    .line 169
    .line 170
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    move-object v7, v6

    .line 175
    check-cast v7, Lky1;

    .line 176
    .line 177
    sget-object v16, Lry1;->α:Lry1;

    .line 178
    .line 179
    if-eqz v10, :cond_6

    .line 180
    .line 181
    move-object v13, v8

    .line 182
    goto :goto_4

    .line 183
    :cond_6
    move-object v13, v14

    .line 184
    :goto_4
    invoke-static {v7, v15, v2, v13}, Lry1;->Ω(Lky1;ZZLmy1;)Liy1;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    iget-boolean v7, v7, Liy1;->α:Z

    .line 189
    .line 190
    if-eqz v7, :cond_7

    .line 191
    .line 192
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_7
    const/4 v13, 0x1

    .line 196
    goto :goto_3

    .line 197
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const/4 v13, 0x0

    .line 202
    if-eqz v5, :cond_9

    .line 203
    .line 204
    const-string v0, "\u6240\u6709\u4f1a\u8bdd\u5747\u88ab\u4eba\u5458\u89c4\u5219\u6392\u9664"

    .line 205
    .line 206
    invoke-static {v1, v4, v14, v0, v13}, Lpg1;->δ(Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v13}, Lpg1;->β(Ljava/lang/String;I)Lmg1;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :cond_9
    sget-object v5, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    if-eqz v5, :cond_a

    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-eqz v5, :cond_a

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    :goto_6
    invoke-static {v12}, Lpg1;->η(Lkg1;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v12}, Lpg1;->θ(Lkg1;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    const-string v13, "\u51c6\u5907\u5904\u7406 0/"

    .line 254
    .line 255
    invoke-static {v13, v14}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    invoke-static {v4}, Lpg1;->ο(Llg1;)Z

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    if-nez v14, :cond_b

    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    goto :goto_7

    .line 267
    :cond_b
    sget-object v14, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    invoke-static {v14, v1, v6, v7, v13}, Lcom/example/dyhelper/ui/а;->μ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    sub-int v13, v0, v13

    .line 282
    .line 283
    new-instance v0, Ljava/util/HashSet;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 286
    .line 287
    .line 288
    new-instance v14, Ljava/util/HashSet;

    .line 289
    .line 290
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v19

    .line 297
    move-object/from16 v22, v0

    .line 298
    .line 299
    move-object/from16 v20, v8

    .line 300
    .line 301
    move-object/from16 v25, v10

    .line 302
    .line 303
    move/from16 v26, v11

    .line 304
    .line 305
    move/from16 v27, v13

    .line 306
    .line 307
    const/4 v0, 0x0

    .line 308
    const/4 v8, 0x0

    .line 309
    const/4 v10, 0x0

    .line 310
    const/4 v11, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const/16 v21, 0x0

    .line 313
    .line 314
    const/16 v23, 0x0

    .line 315
    .line 316
    const/16 v24, 0x0

    .line 317
    .line 318
    :goto_8
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v28

    .line 322
    move/from16 v29, v13

    .line 323
    .line 324
    sget-object v13, Lkg1;->η:Lkg1;

    .line 325
    .line 326
    const-string v30, ""

    .line 327
    .line 328
    const-wide/16 v31, 0x12c

    .line 329
    .line 330
    move/from16 v33, v11

    .line 331
    .line 332
    const-string v11, "r86c859e3375e752"

    .line 333
    .line 334
    if-eqz v28, :cond_40

    .line 335
    .line 336
    move/from16 v28, v10

    .line 337
    .line 338
    add-int/lit8 v10, v8, 0x1

    .line 339
    .line 340
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v34

    .line 344
    move/from16 v35, v8

    .line 345
    .line 346
    move-object/from16 v8, v34

    .line 347
    .line 348
    check-cast v8, Lky1;

    .line 349
    .line 350
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 351
    .line 352
    .line 353
    move-result-object v34

    .line 354
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Thread;->isInterrupted()Z

    .line 355
    .line 356
    .line 357
    move-result v34

    .line 358
    if-nez v34, :cond_c

    .line 359
    .line 360
    if-ne v12, v13, :cond_d

    .line 361
    .line 362
    invoke-static {}, Lpg1;->ε()Z

    .line 363
    .line 364
    .line 365
    move-result v34

    .line 366
    if-nez v34, :cond_d

    .line 367
    .line 368
    const-string v2, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u6267\u884c\u4e2d\u88ab\u5173\u95ed\uff0c\u505c\u6b62\u540e\u7eed\u4f1a\u8bdd"

    .line 369
    .line 370
    const/4 v8, 0x4

    .line 371
    const/4 v10, 0x0

    .line 372
    invoke-static {v11, v2, v10, v8, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_c
    move/from16 v39, v0

    .line 376
    .line 377
    move-object/from16 v36, v3

    .line 378
    .line 379
    move-object/from16 v45, v5

    .line 380
    .line 381
    move-object/from16 v38, v9

    .line 382
    .line 383
    :goto_9
    move-object v15, v11

    .line 384
    move-object v10, v12

    .line 385
    move-object/from16 v37, v14

    .line 386
    .line 387
    move-object/from16 v11, v22

    .line 388
    .line 389
    move-object v14, v7

    .line 390
    move-object v7, v6

    .line 391
    move-object v6, v4

    .line 392
    goto/16 :goto_28

    .line 393
    .line 394
    :cond_d
    sget-object v34, Lry1;->α:Lry1;

    .line 395
    .line 396
    move-object/from16 v34, v3

    .line 397
    .line 398
    invoke-static {v8}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    move-object/from16 v37, v11

    .line 403
    .line 404
    move-object/from16 v36, v12

    .line 405
    .line 406
    iget-wide v11, v8, Lky1;->β:J

    .line 407
    .line 408
    mul-int/lit8 v38, v35, 0x4b

    .line 409
    .line 410
    invoke-interface/range {v34 .. v34}, Ljava/util/List;->size()I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    move/from16 v39, v0

    .line 415
    .line 416
    const/4 v0, 0x1

    .line 417
    if-ge v4, v0, :cond_e

    .line 418
    .line 419
    const/4 v4, 0x1

    .line 420
    :cond_e
    div-int v0, v38, v4

    .line 421
    .line 422
    invoke-interface/range {v34 .. v34}, Ljava/util/List;->size()I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    move-object/from16 v38, v13

    .line 427
    .line 428
    new-instance v13, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    move/from16 v40, v2

    .line 437
    .line 438
    const-string v2, " \u00b7 \u8bfb\u53d6\u4efb\u52a1 "

    .line 439
    .line 440
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    const-string v2, "/"

    .line 447
    .line 448
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static/range {p1 .. p1}, Lpg1;->ο(Llg1;)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_f

    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_f
    invoke-static {v1, v6, v7, v2, v0}, Lcom/example/dyhelper/ui/а;->ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 466
    .line 467
    .line 468
    :goto_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v9, v5, v11, v12}, Lxn0;->Θ(Ljava/lang/ClassLoader;J)Lrf1;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    iget-object v4, v2, Lrf1;->α:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v4, Lgg1;

    .line 478
    .line 479
    invoke-virtual {v2}, Lrf1;->α()Z

    .line 480
    .line 481
    .line 482
    move-result v13

    .line 483
    if-eqz v13, :cond_3b

    .line 484
    .line 485
    if-eqz v4, :cond_3b

    .line 486
    .line 487
    iget v13, v4, Lgg1;->α:I

    .line 488
    .line 489
    if-nez v13, :cond_3b

    .line 490
    .line 491
    add-int/lit8 v13, v39, 0x1

    .line 492
    .line 493
    invoke-virtual {v4}, Lgg1;->α()Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    if-eqz v26, :cond_10

    .line 498
    .line 499
    invoke-static {v5, v8, v2, v14, v3}, Lpg1;->α(Ljava/lang/ClassLoader;Lky1;Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/lang/String;)Ll91;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    move/from16 v41, v0

    .line 504
    .line 505
    iget-object v0, v4, Ll91;->ε:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Ljava/lang/Number;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    add-int v0, v0, v24

    .line 514
    .line 515
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v4, Ljava/lang/Number;

    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    add-int v23, v4, v23

    .line 524
    .line 525
    move/from16 v24, v0

    .line 526
    .line 527
    goto :goto_b

    .line 528
    :cond_10
    move/from16 v41, v0

    .line 529
    .line 530
    :goto_b
    if-eqz v25, :cond_11

    .line 531
    .line 532
    move-object/from16 v0, v20

    .line 533
    .line 534
    :goto_c
    move/from16 v4, v40

    .line 535
    .line 536
    goto :goto_d

    .line 537
    :cond_11
    const/4 v0, 0x0

    .line 538
    goto :goto_c

    .line 539
    :goto_d
    invoke-static {v8, v15, v4, v0}, Lry1;->Ω(Lky1;ZZLmy1;)Liy1;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sget-object v1, Lkg1;->ζ:Lkg1;

    .line 544
    .line 545
    move-object/from16 v40, v8

    .line 546
    .line 547
    sget-object v8, Lkg1;->θ:Lkg1;

    .line 548
    .line 549
    move/from16 v42, v10

    .line 550
    .line 551
    move-object/from16 v10, v36

    .line 552
    .line 553
    if-eq v10, v1, :cond_14

    .line 554
    .line 555
    move-object/from16 v1, v38

    .line 556
    .line 557
    if-eq v10, v1, :cond_12

    .line 558
    .line 559
    if-ne v10, v8, :cond_13

    .line 560
    .line 561
    :cond_12
    move-object/from16 v38, v1

    .line 562
    .line 563
    goto :goto_f

    .line 564
    :cond_13
    move-object/from16 v43, v2

    .line 565
    .line 566
    move/from16 v44, v4

    .line 567
    .line 568
    move-object/from16 v45, v5

    .line 569
    .line 570
    move-object/from16 v38, v9

    .line 571
    .line 572
    move-wide/from16 v46, v11

    .line 573
    .line 574
    move-object/from16 v11, v22

    .line 575
    .line 576
    move-object/from16 v36, v34

    .line 577
    .line 578
    move-object/from16 v2, v40

    .line 579
    .line 580
    move/from16 v48, v41

    .line 581
    .line 582
    move-object v12, v0

    .line 583
    move-object v9, v3

    .line 584
    move/from16 v22, v13

    .line 585
    .line 586
    move/from16 v34, v15

    .line 587
    .line 588
    move-object/from16 v15, v37

    .line 589
    .line 590
    move-object v13, v1

    .line 591
    move-object/from16 v37, v14

    .line 592
    .line 593
    move-object/from16 v1, p0

    .line 594
    .line 595
    :goto_e
    move-object v14, v7

    .line 596
    move-object v7, v6

    .line 597
    move-object/from16 v6, p1

    .line 598
    .line 599
    goto/16 :goto_20

    .line 600
    .line 601
    :cond_14
    :goto_f
    iget-boolean v1, v0, Liy1;->β:Z

    .line 602
    .line 603
    if-eqz v1, :cond_2f

    .line 604
    .line 605
    new-instance v1, Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 611
    .line 612
    .line 613
    move-result-object v36

    .line 614
    :goto_10
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->hasNext()Z

    .line 615
    .line 616
    .line 617
    move-result v39

    .line 618
    if-eqz v39, :cond_16

    .line 619
    .line 620
    move-object/from16 v39, v0

    .line 621
    .line 622
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    move-object/from16 v43, v2

    .line 627
    .line 628
    move-object v2, v0

    .line 629
    check-cast v2, Ltf1;

    .line 630
    .line 631
    move/from16 v44, v4

    .line 632
    .line 633
    iget v4, v2, Ltf1;->γ:I

    .line 634
    .line 635
    move-object/from16 v45, v2

    .line 636
    .line 637
    const/4 v2, 0x1

    .line 638
    if-ne v4, v2, :cond_15

    .line 639
    .line 640
    invoke-virtual/range {v45 .. v45}, Ltf1;->γ()Lfg1;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    sget-object v4, Lfg1;->ε:Lfg1;

    .line 645
    .line 646
    if-ne v2, v4, :cond_15

    .line 647
    .line 648
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    :cond_15
    move-object/from16 v0, v39

    .line 652
    .line 653
    move-object/from16 v2, v43

    .line 654
    .line 655
    move/from16 v4, v44

    .line 656
    .line 657
    goto :goto_10

    .line 658
    :cond_16
    move-object/from16 v39, v0

    .line 659
    .line 660
    move-object/from16 v43, v2

    .line 661
    .line 662
    move/from16 v44, v4

    .line 663
    .line 664
    new-instance v0, Ljava/util/HashSet;

    .line 665
    .line 666
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 667
    .line 668
    .line 669
    new-instance v2, Ljava/util/ArrayList;

    .line 670
    .line 671
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    if-eqz v4, :cond_19

    .line 683
    .line 684
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    move-object/from16 v36, v1

    .line 689
    .line 690
    move-object v1, v4

    .line 691
    check-cast v1, Ltf1;

    .line 692
    .line 693
    move-object/from16 v45, v5

    .line 694
    .line 695
    iget-object v5, v1, Ltf1;->β:Ljava/lang/String;

    .line 696
    .line 697
    if-nez v5, :cond_17

    .line 698
    .line 699
    iget-object v5, v1, Ltf1;->α:Ljava/lang/String;

    .line 700
    .line 701
    :cond_17
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    if-eqz v1, :cond_18

    .line 706
    .line 707
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    :cond_18
    move-object/from16 v1, v36

    .line 711
    .line 712
    move-object/from16 v5, v45

    .line 713
    .line 714
    goto :goto_11

    .line 715
    :cond_19
    move-object/from16 v45, v5

    .line 716
    .line 717
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-nez v0, :cond_2e

    .line 722
    .line 723
    new-instance v0, Ljava/util/ArrayList;

    .line 724
    .line 725
    const/16 v1, 0xa

    .line 726
    .line 727
    invoke-static {v2, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    if-eqz v2, :cond_1a

    .line 743
    .line 744
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    check-cast v2, Ltf1;

    .line 749
    .line 750
    invoke-static {v2}, Lrg1;->β(Ltf1;)Lqg1;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    new-instance v5, Ll91;

    .line 755
    .line 756
    invoke-direct {v5, v2, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    goto :goto_12

    .line 763
    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    if-eqz v2, :cond_1c

    .line 772
    .line 773
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    move-object v4, v2

    .line 778
    check-cast v4, Ll91;

    .line 779
    .line 780
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 781
    .line 782
    if-nez v4, :cond_1b

    .line 783
    .line 784
    goto :goto_13

    .line 785
    :cond_1c
    const/4 v2, 0x0

    .line 786
    :goto_13
    check-cast v2, Ll91;

    .line 787
    .line 788
    if-eqz v2, :cond_1d

    .line 789
    .line 790
    iget-object v1, v2, Ll91;->ε:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v1, Ltf1;

    .line 793
    .line 794
    goto :goto_14

    .line 795
    :cond_1d
    const/4 v1, 0x0

    .line 796
    :goto_14
    if-eqz v1, :cond_1f

    .line 797
    .line 798
    add-int/lit8 v23, v23, 0x1

    .line 799
    .line 800
    iget-object v0, v1, Ltf1;->α:Ljava/lang/String;

    .line 801
    .line 802
    const-string v1, "\u4efb\u52a1 "

    .line 803
    .line 804
    const-string v2, " \u6570\u91cf\u672a\u77e5\uff0c\u62d2\u7edd\u53d1\u9001 name="

    .line 805
    .line 806
    invoke-static {v1, v0, v2, v3}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    move-object/from16 v2, v37

    .line 811
    .line 812
    const/4 v1, 0x4

    .line 813
    const/4 v4, 0x0

    .line 814
    invoke-static {v2, v0, v4, v1, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    :cond_1e
    move-object/from16 v1, p0

    .line 818
    .line 819
    move-wide/from16 v46, v11

    .line 820
    .line 821
    move-object/from16 v37, v14

    .line 822
    .line 823
    move-object/from16 v11, v22

    .line 824
    .line 825
    move-object/from16 v36, v34

    .line 826
    .line 827
    move-object/from16 v12, v39

    .line 828
    .line 829
    move/from16 v48, v41

    .line 830
    .line 831
    move-object v14, v7

    .line 832
    move/from16 v22, v13

    .line 833
    .line 834
    move/from16 v34, v15

    .line 835
    .line 836
    move-object/from16 v13, v38

    .line 837
    .line 838
    move-object v15, v2

    .line 839
    move-object v7, v6

    .line 840
    move-object/from16 v38, v9

    .line 841
    .line 842
    move-object/from16 v2, v40

    .line 843
    .line 844
    move-object/from16 v6, p1

    .line 845
    .line 846
    move-object v9, v3

    .line 847
    goto/16 :goto_20

    .line 848
    .line 849
    :cond_1f
    move-object/from16 v2, v37

    .line 850
    .line 851
    new-instance v1, Ljava/util/ArrayList;

    .line 852
    .line 853
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    :cond_20
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 861
    .line 862
    .line 863
    move-result v4

    .line 864
    if-eqz v4, :cond_22

    .line 865
    .line 866
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    check-cast v4, Ll91;

    .line 871
    .line 872
    iget-object v4, v4, Ll91;->ζ:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v4, Lqg1;

    .line 875
    .line 876
    if-eqz v4, :cond_21

    .line 877
    .line 878
    iget v4, v4, Lqg1;->α:I

    .line 879
    .line 880
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    goto :goto_16

    .line 885
    :cond_21
    const/4 v4, 0x0

    .line 886
    :goto_16
    if-eqz v4, :cond_20

    .line 887
    .line 888
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    goto :goto_15

    .line 892
    :cond_22
    invoke-static {v1}, Lxh;->С(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    check-cast v0, Ljava/lang/Integer;

    .line 897
    .line 898
    if-eqz v0, :cond_1e

    .line 899
    .line 900
    sget-object v36, Lry1;->α:Lry1;

    .line 901
    .line 902
    if-eqz v25, :cond_23

    .line 903
    .line 904
    move-object/from16 v1, v20

    .line 905
    .line 906
    goto :goto_17

    .line 907
    :cond_23
    const/4 v1, 0x0

    .line 908
    :goto_17
    invoke-static {}, Lui1;->Α()Z

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    const-string v5, "\u706b\u661f\u4efb\u52a1"

    .line 913
    .line 914
    if-nez v4, :cond_24

    .line 915
    .line 916
    const/4 v1, 0x0

    .line 917
    goto :goto_1b

    .line 918
    :cond_24
    if-nez v1, :cond_25

    .line 919
    .line 920
    invoke-static/range {v40 .. v40}, Lry1;->Ψ(Lky1;)Lmy1;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    :cond_25
    iget-object v1, v1, Lmy1;->γ:Ljava/lang/String;

    .line 925
    .line 926
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 927
    .line 928
    .line 929
    move-result v4

    .line 930
    if-eqz v4, :cond_29

    .line 931
    .line 932
    invoke-static/range {v40 .. v40}, Lry1;->Τ(Lky1;)Lly1;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    if-eqz v1, :cond_26

    .line 937
    .line 938
    iget-object v1, v1, Lly1;->γ:Lmy1;

    .line 939
    .line 940
    iget-object v1, v1, Lmy1;->γ:Ljava/lang/String;

    .line 941
    .line 942
    goto :goto_18

    .line 943
    :cond_26
    const/4 v1, 0x0

    .line 944
    :goto_18
    if-nez v1, :cond_27

    .line 945
    .line 946
    goto :goto_19

    .line 947
    :cond_27
    move-object/from16 v30, v1

    .line 948
    .line 949
    :goto_19
    invoke-static/range {v30 .. v30}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    if-eqz v1, :cond_28

    .line 954
    .line 955
    const-string v1, "pet_elf_mutual_message"

    .line 956
    .line 957
    invoke-static {v1, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    goto :goto_1a

    .line 962
    :cond_28
    move-object/from16 v1, v30

    .line 963
    .line 964
    :cond_29
    :goto_1a
    const/16 v4, 0x30

    .line 965
    .line 966
    invoke-static {v1, v4}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    :goto_1b
    if-nez v1, :cond_2a

    .line 971
    .line 972
    move-object/from16 v30, v5

    .line 973
    .line 974
    goto :goto_1c

    .line 975
    :cond_2a
    move-object/from16 v30, v1

    .line 976
    .line 977
    :goto_1c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 978
    .line 979
    .line 980
    move-result v37

    .line 981
    new-instance v0, Lig1;

    .line 982
    .line 983
    move v1, v15

    .line 984
    move-object v15, v2

    .line 985
    move-object/from16 v2, v34

    .line 986
    .line 987
    move/from16 v34, v1

    .line 988
    .line 989
    move-object/from16 v4, p1

    .line 990
    .line 991
    move-object v5, v6

    .line 992
    move-object v6, v7

    .line 993
    move-wide/from16 v46, v11

    .line 994
    .line 995
    move-object/from16 v11, v22

    .line 996
    .line 997
    move-object/from16 v12, v39

    .line 998
    .line 999
    move/from16 v1, v41

    .line 1000
    .line 1001
    move-object v7, v3

    .line 1002
    move/from16 v22, v13

    .line 1003
    .line 1004
    move-object/from16 v13, v38

    .line 1005
    .line 1006
    move-object/from16 v3, p0

    .line 1007
    .line 1008
    invoke-direct/range {v0 .. v7}, Lig1;-><init>(ILjava/util/List;Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    move-object/from16 v38, v6

    .line 1012
    .line 1013
    move-object v6, v4

    .line 1014
    move/from16 v4, v37

    .line 1015
    .line 1016
    move-object/from16 v37, v14

    .line 1017
    .line 1018
    move-object/from16 v14, v38

    .line 1019
    .line 1020
    move/from16 v48, v1

    .line 1021
    .line 1022
    move-object v1, v3

    .line 1023
    move-object/from16 v38, v9

    .line 1024
    .line 1025
    move-object/from16 v3, v30

    .line 1026
    .line 1027
    move-object v9, v7

    .line 1028
    move-object v7, v5

    .line 1029
    move-object v5, v0

    .line 1030
    move-object/from16 v0, v36

    .line 1031
    .line 1032
    move-object/from16 v36, v2

    .line 1033
    .line 1034
    move-object/from16 v2, v40

    .line 1035
    .line 1036
    invoke-virtual/range {v0 .. v5}, Lry1;->ｉ(Landroid/app/Activity;Lky1;Ljava/lang/String;ILig1;)Loy1;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    iget v3, v0, Loy1;->β:I

    .line 1041
    .line 1042
    add-int v4, v33, v3

    .line 1043
    .line 1044
    iget v0, v0, Loy1;->γ:I

    .line 1045
    .line 1046
    add-int v23, v23, v0

    .line 1047
    .line 1048
    if-nez v21, :cond_2c

    .line 1049
    .line 1050
    if-lez v3, :cond_2b

    .line 1051
    .line 1052
    goto :goto_1d

    .line 1053
    :cond_2b
    const/4 v0, 0x0

    .line 1054
    goto :goto_1e

    .line 1055
    :cond_2c
    :goto_1d
    const/4 v0, 0x1

    .line 1056
    :goto_1e
    if-lez v3, :cond_2d

    .line 1057
    .line 1058
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    invoke-virtual {v11, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    :cond_2d
    move/from16 v21, v0

    .line 1066
    .line 1067
    move/from16 v33, v4

    .line 1068
    .line 1069
    goto :goto_20

    .line 1070
    :cond_2e
    move-object/from16 v1, p0

    .line 1071
    .line 1072
    move-wide/from16 v46, v11

    .line 1073
    .line 1074
    move-object/from16 v11, v22

    .line 1075
    .line 1076
    move-object/from16 v36, v34

    .line 1077
    .line 1078
    move-object/from16 v12, v39

    .line 1079
    .line 1080
    move-object/from16 v2, v40

    .line 1081
    .line 1082
    move/from16 v48, v41

    .line 1083
    .line 1084
    :goto_1f
    move/from16 v22, v13

    .line 1085
    .line 1086
    move/from16 v34, v15

    .line 1087
    .line 1088
    move-object/from16 v15, v37

    .line 1089
    .line 1090
    move-object/from16 v13, v38

    .line 1091
    .line 1092
    move-object/from16 v38, v9

    .line 1093
    .line 1094
    move-object/from16 v37, v14

    .line 1095
    .line 1096
    move-object v9, v3

    .line 1097
    goto/16 :goto_e

    .line 1098
    .line 1099
    :cond_2f
    move-object/from16 v1, p0

    .line 1100
    .line 1101
    move-object/from16 v43, v2

    .line 1102
    .line 1103
    move/from16 v44, v4

    .line 1104
    .line 1105
    move-object/from16 v45, v5

    .line 1106
    .line 1107
    move-wide/from16 v46, v11

    .line 1108
    .line 1109
    move-object/from16 v11, v22

    .line 1110
    .line 1111
    move-object/from16 v36, v34

    .line 1112
    .line 1113
    move-object/from16 v2, v40

    .line 1114
    .line 1115
    move/from16 v48, v41

    .line 1116
    .line 1117
    move-object v12, v0

    .line 1118
    goto :goto_1f

    .line 1119
    :goto_20
    if-eq v10, v13, :cond_30

    .line 1120
    .line 1121
    if-ne v10, v8, :cond_32

    .line 1122
    .line 1123
    :cond_30
    iget-boolean v0, v12, Liy1;->γ:Z

    .line 1124
    .line 1125
    if-eqz v0, :cond_32

    .line 1126
    .line 1127
    invoke-virtual/range {v43 .. v43}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eqz v0, :cond_31

    .line 1132
    .line 1133
    goto :goto_22

    .line 1134
    :cond_31
    invoke-virtual/range {v43 .. v43}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    if-eqz v3, :cond_32

    .line 1143
    .line 1144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v3

    .line 1148
    check-cast v3, Ltf1;

    .line 1149
    .line 1150
    iget v4, v3, Ltf1;->γ:I

    .line 1151
    .line 1152
    const/4 v5, 0x1

    .line 1153
    if-ne v4, v5, :cond_39

    .line 1154
    .line 1155
    invoke-virtual {v3}, Ltf1;->γ()Lfg1;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v3

    .line 1159
    sget-object v4, Lfg1;->ζ:Lfg1;

    .line 1160
    .line 1161
    if-ne v3, v4, :cond_39

    .line 1162
    .line 1163
    iget-object v0, v6, Llg1;->ζ:Landroid/net/Uri;

    .line 1164
    .line 1165
    if-nez v0, :cond_33

    .line 1166
    .line 1167
    add-int/lit8 v23, v23, 0x1

    .line 1168
    .line 1169
    const-string v0, "\u56fe\u7247\u4efb\u52a1\u5df2\u547d\u4e2d\u4f46\u8bbe\u7f6e\u4e2d\u672a\u9009\u62e9\u56fe\u7247 name="

    .line 1170
    .line 1171
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    const/4 v4, 0x0

    .line 1176
    const/4 v8, 0x4

    .line 1177
    invoke-static {v15, v0, v4, v8, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    :cond_32
    :goto_22
    move/from16 v13, v29

    .line 1181
    .line 1182
    goto/16 :goto_26

    .line 1183
    .line 1184
    :cond_33
    const-string v3, " \u00b7 \u53d1\u9001\u4efb\u52a1\u56fe\u7247"

    .line 1185
    .line 1186
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v3

    .line 1190
    invoke-static {v6}, Lpg1;->ο(Llg1;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v4

    .line 1194
    if-nez v4, :cond_34

    .line 1195
    .line 1196
    goto :goto_23

    .line 1197
    :cond_34
    move/from16 v4, v48

    .line 1198
    .line 1199
    invoke-static {v1, v7, v14, v3, v4}, Lcom/example/dyhelper/ui/а;->ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1200
    .line 1201
    .line 1202
    :goto_23
    invoke-static {v1, v2, v0}, Lg81;->σ(Landroid/app/Activity;Lky1;Landroid/net/Uri;)Leg1;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    iget-boolean v2, v0, Leg1;->α:Z

    .line 1207
    .line 1208
    if-eqz v2, :cond_35

    .line 1209
    .line 1210
    add-int/lit8 v13, v29, 0x1

    .line 1211
    .line 1212
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    const/16 v21, 0x1

    .line 1220
    .line 1221
    goto :goto_26

    .line 1222
    :cond_35
    add-int/lit8 v23, v23, 0x1

    .line 1223
    .line 1224
    iget-object v2, v0, Leg1;->ε:Lbg1;

    .line 1225
    .line 1226
    if-eqz v2, :cond_36

    .line 1227
    .line 1228
    iget-boolean v3, v2, Lbg1;->ε:Z

    .line 1229
    .line 1230
    const/4 v5, 0x1

    .line 1231
    if-ne v3, v5, :cond_37

    .line 1232
    .line 1233
    add-int/lit8 v3, v28, 0x1

    .line 1234
    .line 1235
    goto :goto_24

    .line 1236
    :cond_36
    const/4 v5, 0x1

    .line 1237
    :cond_37
    move/from16 v3, v28

    .line 1238
    .line 1239
    :goto_24
    if-eqz v2, :cond_38

    .line 1240
    .line 1241
    iget-boolean v4, v2, Lbg1;->ε:Z

    .line 1242
    .line 1243
    if-ne v4, v5, :cond_38

    .line 1244
    .line 1245
    const/4 v4, 0x1

    .line 1246
    goto :goto_25

    .line 1247
    :cond_38
    const/4 v4, 0x0

    .line 1248
    :goto_25
    iget v5, v0, Leg1;->β:I

    .line 1249
    .line 1250
    iget v8, v0, Leg1;->γ:I

    .line 1251
    .line 1252
    iget-object v0, v0, Leg1;->δ:Ljava/lang/String;

    .line 1253
    .line 1254
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    const-string v13, "\u56fe\u7247\u4efb\u52a1\u53d1\u9001\u5931\u8d25 name="

    .line 1257
    .line 1258
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    const-string v9, " retryable="

    .line 1265
    .line 1266
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1270
    .line 1271
    .line 1272
    const-string v4, " kind="

    .line 1273
    .line 1274
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    .line 1280
    const-string v2, " bridge="

    .line 1281
    .line 1282
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    const-string v2, " image="

    .line 1289
    .line 1290
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1294
    .line 1295
    .line 1296
    const-string v2, " detail="

    .line 1297
    .line 1298
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    const/4 v4, 0x0

    .line 1309
    const/4 v8, 0x4

    .line 1310
    invoke-static {v15, v0, v4, v8, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1311
    .line 1312
    .line 1313
    move/from16 v28, v3

    .line 1314
    .line 1315
    goto/16 :goto_22

    .line 1316
    .line 1317
    :cond_39
    move/from16 v4, v48

    .line 1318
    .line 1319
    move/from16 v48, v4

    .line 1320
    .line 1321
    goto/16 :goto_21

    .line 1322
    .line 1323
    :goto_26
    invoke-interface/range {v36 .. v36}, Ljava/util/List;->size()I

    .line 1324
    .line 1325
    .line 1326
    move-result v0

    .line 1327
    const/16 v16, 0x1

    .line 1328
    .line 1329
    add-int/lit8 v0, v0, -0x1

    .line 1330
    .line 1331
    move/from16 v3, v35

    .line 1332
    .line 1333
    if-ge v3, v0, :cond_3a

    .line 1334
    .line 1335
    invoke-static/range {v31 .. v32}, Lpg1;->μ(J)V

    .line 1336
    .line 1337
    .line 1338
    :cond_3a
    move-object v4, v6

    .line 1339
    move-object v6, v7

    .line 1340
    move-object v12, v10

    .line 1341
    move-object v7, v14

    .line 1342
    move/from16 v0, v22

    .line 1343
    .line 1344
    move/from16 v10, v28

    .line 1345
    .line 1346
    move/from16 v15, v34

    .line 1347
    .line 1348
    move-object/from16 v3, v36

    .line 1349
    .line 1350
    move-object/from16 v14, v37

    .line 1351
    .line 1352
    move-object/from16 v9, v38

    .line 1353
    .line 1354
    move/from16 v8, v42

    .line 1355
    .line 1356
    move/from16 v2, v44

    .line 1357
    .line 1358
    move-object/from16 v5, v45

    .line 1359
    .line 1360
    move-object/from16 v22, v11

    .line 1361
    .line 1362
    move/from16 v11, v33

    .line 1363
    .line 1364
    goto/16 :goto_8

    .line 1365
    .line 1366
    :cond_3b
    move-object/from16 v45, v5

    .line 1367
    .line 1368
    move-object/from16 v38, v9

    .line 1369
    .line 1370
    move/from16 v42, v10

    .line 1371
    .line 1372
    move-object/from16 v11, v22

    .line 1373
    .line 1374
    move-object/from16 v10, v36

    .line 1375
    .line 1376
    move/from16 v44, v40

    .line 1377
    .line 1378
    move-object v9, v3

    .line 1379
    move-object/from16 v36, v34

    .line 1380
    .line 1381
    move/from16 v3, v35

    .line 1382
    .line 1383
    move/from16 v34, v15

    .line 1384
    .line 1385
    move-object/from16 v15, v37

    .line 1386
    .line 1387
    move-object/from16 v37, v14

    .line 1388
    .line 1389
    move-object v14, v7

    .line 1390
    move-object v7, v6

    .line 1391
    move-object/from16 v6, p1

    .line 1392
    .line 1393
    add-int/lit8 v23, v23, 0x1

    .line 1394
    .line 1395
    iget-object v0, v2, Lrf1;->β:Ljava/lang/Throwable;

    .line 1396
    .line 1397
    if-eqz v0, :cond_3c

    .line 1398
    .line 1399
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    if-nez v0, :cond_3e

    .line 1404
    .line 1405
    :cond_3c
    if-eqz v4, :cond_3d

    .line 1406
    .line 1407
    iget-object v0, v4, Lgg1;->β:Ljava/lang/String;

    .line 1408
    .line 1409
    goto :goto_27

    .line 1410
    :cond_3d
    const/4 v0, 0x0

    .line 1411
    :goto_27
    if-nez v0, :cond_3e

    .line 1412
    .line 1413
    const-string v0, "unknown"

    .line 1414
    .line 1415
    :cond_3e
    const-string v2, "\u751f\u4ea7\u4efb\u52a1\u5217\u8868\u5931\u8d25 name="

    .line 1416
    .line 1417
    const-string v4, " error="

    .line 1418
    .line 1419
    invoke-static {v2, v9, v4, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    const/4 v4, 0x0

    .line 1424
    const/4 v8, 0x4

    .line 1425
    invoke-static {v15, v0, v4, v8, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-interface/range {v36 .. v36}, Ljava/util/List;->size()I

    .line 1429
    .line 1430
    .line 1431
    move-result v0

    .line 1432
    const/16 v16, 0x1

    .line 1433
    .line 1434
    add-int/lit8 v0, v0, -0x1

    .line 1435
    .line 1436
    if-ge v3, v0, :cond_3f

    .line 1437
    .line 1438
    invoke-static/range {v31 .. v32}, Lpg1;->μ(J)V

    .line 1439
    .line 1440
    .line 1441
    :cond_3f
    move-object v4, v6

    .line 1442
    move-object v6, v7

    .line 1443
    move-object v12, v10

    .line 1444
    move-object/from16 v22, v11

    .line 1445
    .line 1446
    move-object v7, v14

    .line 1447
    move/from16 v10, v28

    .line 1448
    .line 1449
    move/from16 v13, v29

    .line 1450
    .line 1451
    move/from16 v11, v33

    .line 1452
    .line 1453
    move/from16 v15, v34

    .line 1454
    .line 1455
    move-object/from16 v3, v36

    .line 1456
    .line 1457
    move-object/from16 v14, v37

    .line 1458
    .line 1459
    move-object/from16 v9, v38

    .line 1460
    .line 1461
    move/from16 v0, v39

    .line 1462
    .line 1463
    move/from16 v8, v42

    .line 1464
    .line 1465
    move/from16 v2, v44

    .line 1466
    .line 1467
    move-object/from16 v5, v45

    .line 1468
    .line 1469
    goto/16 :goto_8

    .line 1470
    .line 1471
    :cond_40
    move/from16 v39, v0

    .line 1472
    .line 1473
    move-object/from16 v36, v3

    .line 1474
    .line 1475
    move-object/from16 v45, v5

    .line 1476
    .line 1477
    move-object/from16 v38, v9

    .line 1478
    .line 1479
    move/from16 v28, v10

    .line 1480
    .line 1481
    goto/16 :goto_9

    .line 1482
    .line 1483
    :goto_28
    const/4 v0, 0x3

    .line 1484
    if-eqz v26, :cond_49

    .line 1485
    .line 1486
    if-eqz v21, :cond_49

    .line 1487
    .line 1488
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    .line 1493
    .line 1494
    .line 1495
    move-result v2

    .line 1496
    if-nez v2, :cond_49

    .line 1497
    .line 1498
    if-ne v10, v13, :cond_41

    .line 1499
    .line 1500
    invoke-static {}, Lpg1;->ε()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v2

    .line 1504
    if-eqz v2, :cond_49

    .line 1505
    .line 1506
    :cond_41
    new-instance v2, Ljava/util/ArrayList;

    .line 1507
    .line 1508
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1509
    .line 1510
    .line 1511
    invoke-interface/range {v36 .. v36}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v3

    .line 1515
    :cond_42
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1516
    .line 1517
    .line 1518
    move-result v4

    .line 1519
    if-eqz v4, :cond_43

    .line 1520
    .line 1521
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v4

    .line 1525
    move-object v5, v4

    .line 1526
    check-cast v5, Lky1;

    .line 1527
    .line 1528
    iget-wide v8, v5, Lky1;->β:J

    .line 1529
    .line 1530
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v5

    .line 1534
    invoke-virtual {v11, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v5

    .line 1538
    if-eqz v5, :cond_42

    .line 1539
    .line 1540
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1541
    .line 1542
    .line 1543
    goto :goto_29

    .line 1544
    :cond_43
    const/4 v3, 0x0

    .line 1545
    :goto_2a
    if-ge v3, v0, :cond_49

    .line 1546
    .line 1547
    const-wide/16 v4, 0x9c4

    .line 1548
    .line 1549
    invoke-static {v4, v5}, Lpg1;->μ(J)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v4

    .line 1556
    const/4 v5, 0x0

    .line 1557
    :goto_2b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v8

    .line 1561
    if-eqz v8, :cond_48

    .line 1562
    .line 1563
    add-int/lit8 v8, v5, 0x1

    .line 1564
    .line 1565
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v9

    .line 1569
    check-cast v9, Lky1;

    .line 1570
    .line 1571
    sget-object v11, Lry1;->α:Lry1;

    .line 1572
    .line 1573
    invoke-static {v9}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v11

    .line 1577
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1578
    .line 1579
    .line 1580
    move-result v12

    .line 1581
    mul-int/2addr v12, v3

    .line 1582
    add-int/2addr v12, v5

    .line 1583
    const/4 v13, 0x1

    .line 1584
    add-int/2addr v12, v13

    .line 1585
    move/from16 v19, v0

    .line 1586
    .line 1587
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1588
    .line 1589
    .line 1590
    move-result v0

    .line 1591
    if-ge v0, v13, :cond_44

    .line 1592
    .line 1593
    const/4 v0, 0x1

    .line 1594
    :cond_44
    mul-int/lit8 v0, v0, 0x3

    .line 1595
    .line 1596
    add-int/lit8 v13, v3, 0x1

    .line 1597
    .line 1598
    move/from16 v20, v0

    .line 1599
    .line 1600
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1606
    .line 1607
    .line 1608
    move-object/from16 v21, v2

    .line 1609
    .line 1610
    const-string v2, " \u00b7 \u5237\u65b0\u9886\u53d6 "

    .line 1611
    .line 1612
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1616
    .line 1617
    .line 1618
    const-string v2, "/3"

    .line 1619
    .line 1620
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    mul-int/lit8 v12, v12, 0x19

    .line 1628
    .line 1629
    div-int v12, v12, v20

    .line 1630
    .line 1631
    add-int/lit8 v12, v12, 0x4b

    .line 1632
    .line 1633
    invoke-static {v6}, Lpg1;->ο(Llg1;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v2

    .line 1637
    if-nez v2, :cond_45

    .line 1638
    .line 1639
    goto :goto_2c

    .line 1640
    :cond_45
    invoke-static {v1, v7, v14, v0, v12}, Lcom/example/dyhelper/ui/а;->ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1641
    .line 1642
    .line 1643
    :goto_2c
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    iget-wide v12, v9, Lky1;->β:J

    .line 1647
    .line 1648
    move-object/from16 v0, v38

    .line 1649
    .line 1650
    move-object/from16 v2, v45

    .line 1651
    .line 1652
    invoke-virtual {v0, v2, v12, v13}, Lxn0;->Θ(Ljava/lang/ClassLoader;J)Lrf1;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v12

    .line 1656
    iget-object v13, v12, Lrf1;->α:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v13, Lgg1;

    .line 1659
    .line 1660
    invoke-virtual {v12}, Lrf1;->α()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v12

    .line 1664
    if-eqz v12, :cond_47

    .line 1665
    .line 1666
    if-eqz v13, :cond_47

    .line 1667
    .line 1668
    iget v12, v13, Lgg1;->α:I

    .line 1669
    .line 1670
    if-nez v12, :cond_47

    .line 1671
    .line 1672
    invoke-virtual {v13}, Lgg1;->α()Ljava/util/ArrayList;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v12

    .line 1676
    move-object/from16 v13, v37

    .line 1677
    .line 1678
    invoke-static {v2, v9, v12, v13, v11}, Lpg1;->α(Ljava/lang/ClassLoader;Lky1;Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/lang/String;)Ll91;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v9

    .line 1682
    iget-object v11, v9, Ll91;->ε:Ljava/lang/Object;

    .line 1683
    .line 1684
    check-cast v11, Ljava/lang/Number;

    .line 1685
    .line 1686
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1687
    .line 1688
    .line 1689
    move-result v11

    .line 1690
    add-int v24, v11, v24

    .line 1691
    .line 1692
    iget-object v9, v9, Ll91;->ζ:Ljava/lang/Object;

    .line 1693
    .line 1694
    check-cast v9, Ljava/lang/Number;

    .line 1695
    .line 1696
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1697
    .line 1698
    .line 1699
    move-result v9

    .line 1700
    add-int v23, v9, v23

    .line 1701
    .line 1702
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 1703
    .line 1704
    .line 1705
    move-result v9

    .line 1706
    const/16 v16, 0x1

    .line 1707
    .line 1708
    add-int/lit8 v9, v9, -0x1

    .line 1709
    .line 1710
    if-ge v5, v9, :cond_46

    .line 1711
    .line 1712
    invoke-static/range {v31 .. v32}, Lpg1;->μ(J)V

    .line 1713
    .line 1714
    .line 1715
    :cond_46
    :goto_2d
    move-object/from16 v38, v0

    .line 1716
    .line 1717
    move-object/from16 v45, v2

    .line 1718
    .line 1719
    move v5, v8

    .line 1720
    move-object/from16 v37, v13

    .line 1721
    .line 1722
    move/from16 v0, v19

    .line 1723
    .line 1724
    move-object/from16 v2, v21

    .line 1725
    .line 1726
    goto/16 :goto_2b

    .line 1727
    .line 1728
    :cond_47
    move-object/from16 v13, v37

    .line 1729
    .line 1730
    add-int/lit8 v23, v23, 0x1

    .line 1731
    .line 1732
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 1733
    .line 1734
    .line 1735
    move-result v9

    .line 1736
    const/16 v16, 0x1

    .line 1737
    .line 1738
    add-int/lit8 v9, v9, -0x1

    .line 1739
    .line 1740
    if-ge v5, v9, :cond_46

    .line 1741
    .line 1742
    invoke-static/range {v31 .. v32}, Lpg1;->μ(J)V

    .line 1743
    .line 1744
    .line 1745
    goto :goto_2d

    .line 1746
    :cond_48
    move/from16 v19, v0

    .line 1747
    .line 1748
    move-object/from16 v21, v2

    .line 1749
    .line 1750
    move-object/from16 v13, v37

    .line 1751
    .line 1752
    move-object/from16 v0, v38

    .line 1753
    .line 1754
    move-object/from16 v2, v45

    .line 1755
    .line 1756
    add-int/lit8 v3, v3, 0x1

    .line 1757
    .line 1758
    move/from16 v0, v19

    .line 1759
    .line 1760
    move-object/from16 v2, v21

    .line 1761
    .line 1762
    goto/16 :goto_2a

    .line 1763
    .line 1764
    :cond_49
    move/from16 v19, v0

    .line 1765
    .line 1766
    move/from16 v0, v23

    .line 1767
    .line 1768
    move/from16 v2, v24

    .line 1769
    .line 1770
    if-lez v28, :cond_4a

    .line 1771
    .line 1772
    const-string v3, "\uff0c\u5f85\u91cd\u8bd5 "

    .line 1773
    .line 1774
    move/from16 v4, v28

    .line 1775
    .line 1776
    invoke-static {v3, v4}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v30

    .line 1780
    :goto_2e
    move-object/from16 v3, v30

    .line 1781
    .line 1782
    goto :goto_2f

    .line 1783
    :cond_4a
    move/from16 v4, v28

    .line 1784
    .line 1785
    goto :goto_2e

    .line 1786
    :goto_2f
    const-string v5, "\uff0c\u6587\u672c "

    .line 1787
    .line 1788
    const-string v7, "\uff0c\u56fe\u7247 "

    .line 1789
    .line 1790
    const-string v8, "\u4f1a\u8bdd "

    .line 1791
    .line 1792
    move/from16 v11, v33

    .line 1793
    .line 1794
    move/from16 v9, v39

    .line 1795
    .line 1796
    invoke-static {v8, v9, v5, v11, v7}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v5

    .line 1800
    const-string v7, "\uff0c\u9886\u53d6 "

    .line 1801
    .line 1802
    const-string v8, "\uff0c\u8df3\u8fc7 "

    .line 1803
    .line 1804
    move/from16 v13, v29

    .line 1805
    .line 1806
    invoke-static {v5, v13, v7, v2, v8}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1807
    .line 1808
    .line 1809
    move/from16 v7, v27

    .line 1810
    .line 1811
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1812
    .line 1813
    .line 1814
    const-string v8, "\uff0c\u5931\u8d25 "

    .line 1815
    .line 1816
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v3

    .line 1829
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 1830
    .line 1831
    .line 1832
    move-result v5

    .line 1833
    if-eqz v5, :cond_4e

    .line 1834
    .line 1835
    const/4 v8, 0x1

    .line 1836
    if-eq v5, v8, :cond_4d

    .line 1837
    .line 1838
    const/4 v10, 0x2

    .line 1839
    if-eq v5, v10, :cond_4c

    .line 1840
    .line 1841
    move/from16 v10, v19

    .line 1842
    .line 1843
    if-ne v5, v10, :cond_4b

    .line 1844
    .line 1845
    const-string v5, "\u4eba\u5458\u706b\u661f\u4efb\u52a1\u5b8c\u6210"

    .line 1846
    .line 1847
    goto :goto_30

    .line 1848
    :cond_4b
    invoke-static {}, Lγ;->κ()V

    .line 1849
    .line 1850
    .line 1851
    const/16 v17, 0x0

    .line 1852
    .line 1853
    return-object v17

    .line 1854
    :cond_4c
    const-string v5, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u5b8c\u6210"

    .line 1855
    .line 1856
    goto :goto_30

    .line 1857
    :cond_4d
    const-string v5, "\u4e92\u53d1\u4efb\u52a1\u5b8c\u6210"

    .line 1858
    .line 1859
    goto :goto_30

    .line 1860
    :cond_4e
    const/4 v8, 0x1

    .line 1861
    const-string v5, "\u706b\u661f\u9886\u53d6\u5b8c\u6210"

    .line 1862
    .line 1863
    :goto_30
    if-lez v0, :cond_4f

    .line 1864
    .line 1865
    if-nez v11, :cond_4f

    .line 1866
    .line 1867
    if-nez v13, :cond_4f

    .line 1868
    .line 1869
    if-nez v2, :cond_4f

    .line 1870
    .line 1871
    goto :goto_31

    .line 1872
    :cond_4f
    const/4 v8, 0x0

    .line 1873
    :goto_31
    invoke-static {v1, v6, v5, v3, v8}, Lpg1;->δ(Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1874
    .line 1875
    .line 1876
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1877
    .line 1878
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1879
    .line 1880
    .line 1881
    const-string v6, ": "

    .line 1882
    .line 1883
    invoke-static {v1, v5, v6, v3}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v1

    .line 1887
    const/4 v8, 0x4

    .line 1888
    const/4 v10, 0x0

    .line 1889
    invoke-static {v15, v1, v10, v8, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1890
    .line 1891
    .line 1892
    new-instance v18, Lmg1;

    .line 1893
    .line 1894
    invoke-static {v5, v6, v3}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v26

    .line 1898
    move/from16 v24, v0

    .line 1899
    .line 1900
    move/from16 v22, v2

    .line 1901
    .line 1902
    move/from16 v25, v4

    .line 1903
    .line 1904
    move/from16 v23, v7

    .line 1905
    .line 1906
    move/from16 v19, v9

    .line 1907
    .line 1908
    move/from16 v20, v11

    .line 1909
    .line 1910
    move/from16 v21, v13

    .line 1911
    .line 1912
    invoke-direct/range {v18 .. v26}, Lmg1;-><init>(IIIIIIILjava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    return-object v18
.end method

.method public static δ(Landroid/app/Activity;Llg1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 10

    .line 1
    invoke-static {p1}, Lpg1;->ο(Llg1;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p1, p1, Llg1;->α:Lkg1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {p1}, Lpg1;->η(Lkg1;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Lpg1;->θ(Lkg1;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_1
    move-object v3, p2

    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    invoke-static {p0, v0, v3, p3}, Lcom/example/dyhelper/ui/а;->γ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    sget-object p1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v1, Ld52;

    .line 37
    .line 38
    const/16 v5, 0x64

    .line 39
    .line 40
    sget-object v6, Lf52;->ζ:Lf52;

    .line 41
    .line 42
    const-wide/16 v8, 0x640

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    move-object v4, p3

    .line 46
    invoke-direct/range {v1 .. v9}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static ε()Z
    .locals 2

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "pet_elf_auto_task_enabled"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    return v1
.end method

.method public static ζ()Z
    .locals 2

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "pet_elf_auto_claim_enabled"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    return v1
.end method

.method public static η(Lkg1;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    const-string p0, "pet_elf:person"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string p0, "pet_elf:daily"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    const-string p0, "pet_elf:mutual"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    const-string p0, "pet_elf:claim"

    .line 31
    .line 32
    return-object p0
.end method

.method public static θ(Lkg1;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    const-string p0, "\u5b8c\u6210\u706b\u661f\u4efb\u52a1"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string p0, "\u6bcf\u65e5\u706b\u661f\u4efb\u52a1"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    const-string p0, "\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u4efb\u52a1"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    const-string p0, "\u9886\u53d6\u706b\u661f"

    .line 31
    .line 32
    return-object p0
.end method

.method public static ι(Landroid/app/Activity;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lpg1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lx9;->η()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    invoke-static {}, Lpg1;->ζ()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    sget-object p0, Lpg1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object p0, Lpg1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/Thread;

    .line 49
    .line 50
    new-instance v2, Lfb0;

    .line 51
    .line 52
    const/16 v3, 0x10

    .line 53
    .line 54
    invoke-direct {v2, v3}, Lfb0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const-string v3, "r62da759f6a7d20c7"

    .line 58
    .line 59
    invoke-direct {p0, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    invoke-static {}, Lpg1;->ε()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const-string p0, "pet_elf_auto_last_run_date"

    .line 76
    .line 77
    const-string v2, ""

    .line 78
    .line 79
    invoke-static {p0, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {}, Lpg1;->ξ()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_5

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    const-string p0, "spark_auto_renew_trigger_hour"

    .line 95
    .line 96
    const/4 v2, -0x1

    .line 97
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3, p0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 102
    .line 103
    .line 104
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :catchall_0
    if-ltz v2, :cond_6

    .line 106
    .line 107
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const/16 v3, 0xb

    .line 112
    .line 113
    invoke-virtual {p0, v3}, Ljava/util/Calendar;->get(I)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-ge p0, v2, :cond_6

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    sget-object p0, Lpg1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 127
    .line 128
    .line 129
    move-result-wide v4

    .line 130
    sub-long v6, v2, v4

    .line 131
    .line 132
    const-wide/32 v8, 0xea60

    .line 133
    .line 134
    .line 135
    cmp-long v6, v6, v8

    .line 136
    .line 137
    if-gez v6, :cond_7

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_7
    invoke-virtual {p0, v4, v5, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_8

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_8
    sget-object p0, Lpg1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_9

    .line 154
    .line 155
    :goto_1
    return-void

    .line 156
    :cond_9
    new-instance p0, Ljava/lang/Thread;

    .line 157
    .line 158
    new-instance v0, Lfb0;

    .line 159
    .line 160
    const/16 v2, 0xf

    .line 161
    .line 162
    invoke-direct {v0, v2}, Lfb0;-><init>(I)V

    .line 163
    .line 164
    .line 165
    const-string v2, "r1351137180264ddf"

    .line 166
    .line 167
    invoke-direct {p0, v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public static κ(Landroid/app/Activity;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, p0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 19
    :goto_1
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lpg1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-static {}, Lx9;->η()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    invoke-static {}, Lpg1;->ζ()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    sget-object v0, Lpg1;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    new-instance v0, Ljava/lang/Thread;

    .line 56
    .line 57
    new-instance v1, Lhg1;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v1, p0, v3}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 61
    .line 62
    .line 63
    const-string p0, "r6ee2d07c2b38eec3"

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_2
    return-void
.end method

.method public static λ(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p2, v0, :cond_1

    .line 3
    .line 4
    const-string p2, "pet_elf_auto_success_toast_enabled"

    .line 5
    .line 6
    invoke-static {p2, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p2, Lxx0;

    .line 14
    .line 15
    const/16 v0, 0x9

    .line 16
    .line 17
    invoke-direct {p2, p0, p1, v0}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static μ(J)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ν(Landroid/app/Activity;Llg1;La80;)V
    .locals 4

    .line 1
    invoke-static {}, Lx9;->η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "\u706b\u661f\u4efb\u52a1\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 9
    .line 10
    invoke-static {p0, v1}, Lpg1;->β(Ljava/lang/String;I)Lmg1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p2, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object v0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string p0, "\u5df2\u6709\u706b\u661f\u4efb\u52a1\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u540e"

    .line 28
    .line 29
    invoke-static {p0, v1}, Lpg1;->β(Ljava/lang/String;I)Lmg1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p2, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 38
    .line 39
    new-instance v2, Ljg1;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, p0, p1, p2, v3}, Ljg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p1, Llg1;->α:Lkg1;

    .line 46
    .line 47
    new-instance p1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string p2, "r3c58554f041a7fe1"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {v0, v2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static ξ()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static ο(Llg1;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Llg1;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Llg1;->α:Lkg1;

    .line 6
    .line 7
    sget-object v0, Lkg1;->θ:Lkg1;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    const-string p0, "spark_show_top_notification"

    .line 13
    .line 14
    invoke-static {p0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    :cond_0
    return v1

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static π(ILp70;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p0, :cond_2

    .line 3
    .line 4
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v1, 0x3e8

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance p0, Ljava/lang/InterruptedException;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_2
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method
