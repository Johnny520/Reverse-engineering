.class public abstract Ls4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;

.field public static volatile c:Ljava/lang/ClassLoader;

.field public static volatile d:Z

.field public static volatile e:Ljava/lang/reflect/Method;

.field public static volatile f:Ljava/lang/Object;

.field public static volatile g:Z

.field public static volatile h:Z

.field public static volatile i:Ljava/lang/reflect/Method;

.field public static volatile j:Ljava/lang/ref/WeakReference;

.field public static volatile k:Ljava/lang/reflect/Method;

.field public static volatile l:Ljava/lang/ref/WeakReference;

.field public static volatile m:Ljava/lang/ref/WeakReference;

.field public static n:J

.field public static o:Lf2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls4;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ls4;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public static A(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, 0xa

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0xd

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v0, 0x78

    .line 21
    .line 22
    invoke-static {p0, v0}, Ls4;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static a(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;Ljava/util/ArrayList;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_7

    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static/range {p3 .. p3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    new-instance v6, Landroid/text/SpannableStringBuilder;

    .line 36
    .line 37
    invoke-direct {v6, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v7, 0x1

    .line 45
    sub-int/2addr v1, v7

    .line 46
    move v8, v2

    .line 47
    move v9, v8

    .line 48
    :goto_0
    if-ltz v1, :cond_4

    .line 49
    .line 50
    move-object/from16 v10, p3

    .line 51
    .line 52
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    check-cast v11, Lq4;

    .line 57
    .line 58
    iget v12, v11, Lq4;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    iget-object v13, v11, Lq4;->c:Landroid/text/SpannableStringBuilder;

    .line 61
    .line 62
    iget v11, v11, Lq4;->b:I

    .line 63
    .line 64
    if-ltz v12, :cond_7

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-gt v11, v14, :cond_7

    .line 71
    .line 72
    if-lt v12, v11, :cond_1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    sub-int v14, v11, v12

    .line 76
    .line 77
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    if-lt v4, v11, :cond_2

    .line 82
    .line 83
    sub-int v16, v15, v14

    .line 84
    .line 85
    add-int v8, v16, v8

    .line 86
    .line 87
    :cond_2
    if-lt v5, v11, :cond_3

    .line 88
    .line 89
    sub-int/2addr v15, v14

    .line 90
    add-int/2addr v9, v15

    .line 91
    :cond_3
    invoke-virtual {v6, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v1, v1, -0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    move-object/from16 v10, p1

    .line 104
    .line 105
    invoke-interface {v10, v2, v1, v6}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 106
    .line 107
    .line 108
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v3, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 115
    .line 116
    .line 117
    return v7

    .line 118
    :cond_5
    if-ltz v4, :cond_6

    .line 119
    .line 120
    if-ltz v5, :cond_6

    .line 121
    .line 122
    add-int/2addr v4, v8

    .line 123
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    add-int/2addr v5, v9

    .line 132
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v0, v3, v1}, Landroid/widget/EditText;->setSelection(II)V

    .line 141
    .line 142
    .line 143
    return v7

    .line 144
    :cond_6
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    .line 147
    return v7

    .line 148
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v3, "apply official spans failed: "

    .line 151
    .line 152
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_2
    return v2
.end method

.method public static b(Landroid/widget/EditText;Ljava/lang/String;IZ)Lf2;
    .locals 12

    .line 1
    const/4 v1, 0x0

    .line 2
    if-gtz p2, :cond_0

    .line 3
    .line 4
    const-string p0, "invalid_begin"

    .line 5
    .line 6
    invoke-static {v1, p0}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v9

    .line 14
    new-instance v11, Lf2;

    .line 15
    .line 16
    new-instance v2, Lia;

    .line 17
    .line 18
    sget-wide v3, Ls4;->n:J

    .line 19
    .line 20
    const-wide/16 v5, 0x1

    .line 21
    .line 22
    add-long/2addr v3, v5

    .line 23
    sput-wide v3, Ls4;->n:J

    .line 24
    .line 25
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    move-object v5, p0

    .line 30
    move-object v6, p1

    .line 31
    move v7, p2

    .line 32
    invoke-direct/range {v2 .. v10}, Lia;-><init>(JLandroid/widget/EditText;Ljava/lang/String;IIJ)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v11, v5, v2}, Lf2;-><init>(Landroid/widget/EditText;Lia;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Ls4;->b:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter p0

    .line 41
    :try_start_0
    sget-object p1, Ls4;->o:Lf2;

    .line 42
    .line 43
    sput-object v11, Ls4;->o:Lf2;

    .line 44
    .line 45
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    invoke-static {p1}, Ls4;->e(Lf2;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lk4;

    .line 50
    .line 51
    invoke-direct {p0, v11}, Lk4;-><init>(Lf2;)V

    .line 52
    .line 53
    .line 54
    iput-object p0, v11, Lf2;->d:Ljava/lang/Object;

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    if-eqz p3, :cond_1

    .line 60
    .line 61
    iget-object p0, v11, Lf2;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lia;

    .line 64
    .line 65
    invoke-virtual {p0, v9, v10}, Lia;->a(J)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v11

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object p0, v0

    .line 71
    const-string p1, "watcher_failed"

    .line 72
    .line 73
    invoke-static {v11, p1}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "pending watcher install failed: "

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    move-object p1, v0

    .line 96
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    throw p1
.end method

.method public static c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ly;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    new-instance v4, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move v6, v5

    .line 14
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge v6, v0, :cond_21

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v7, 0x10

    .line 25
    .line 26
    if-ge v0, v7, :cond_21

    .line 27
    .line 28
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v7, v0

    .line 33
    check-cast v7, Lr4;

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    iget-boolean v0, v7, Lr4;->a:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    move-object/from16 v10, p2

    .line 42
    .line 43
    goto/16 :goto_14

    .line 44
    .line 45
    :cond_1
    iget-object v0, v7, Lr4;->d:Ljava/lang/String;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    :cond_2
    move-object/from16 v10, p2

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v9, v5

    .line 54
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-ge v9, v10, :cond_2

    .line 59
    .line 60
    move-object/from16 v10, p2

    .line 61
    .line 62
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    check-cast v11, Li4;

    .line 67
    .line 68
    if-eqz v11, :cond_4

    .line 69
    .line 70
    iget-object v12, v11, Li4;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    if-eqz v12, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :goto_2
    if-eqz v11, :cond_21

    .line 83
    .line 84
    iget-object v0, v11, Li4;->f:Lh4;

    .line 85
    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    goto/16 :goto_15

    .line 89
    .line 90
    :cond_5
    iget-object v0, v11, Li4;->f:Lh4;

    .line 91
    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    iget v9, v0, Lh4;->a:I

    .line 95
    .line 96
    if-ltz v9, :cond_8

    .line 97
    .line 98
    iget-object v0, v0, Lh4;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, [Ljava/lang/Object;

    .line 101
    .line 102
    array-length v11, v0

    .line 103
    if-ge v9, v11, :cond_8

    .line 104
    .line 105
    aget-object v0, v0, v9

    .line 106
    .line 107
    instance-of v9, v0, Ljava/util/ArrayList;

    .line 108
    .line 109
    if-nez v9, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    check-cast v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    move v9, v5

    .line 115
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-ge v9, v11, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    new-instance v12, Ljava/util/IdentityHashMap;

    .line 126
    .line 127
    invoke-direct {v12}, Ljava/util/IdentityHashMap;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-static {v12}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    filled-new-array {v5}, [I

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-static {v11, v5, v12, v13}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    if-eqz v11, :cond_7

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    :goto_4
    const/4 v11, 0x0

    .line 149
    :goto_5
    const-string v9, "null"

    .line 150
    .line 151
    if-eqz v11, :cond_1d

    .line 152
    .line 153
    iget-object v0, v11, Lo4;->a:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v0, :cond_1d

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-lez v0, :cond_1d

    .line 162
    .line 163
    iget-object v0, v11, Lo4;->c:Ljava/io/Serializable;

    .line 164
    .line 165
    check-cast v0, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_1d

    .line 172
    .line 173
    iget-object v13, v11, Lo4;->a:Ljava/lang/String;

    .line 174
    .line 175
    iget-boolean v0, v11, Lo4;->b:Z

    .line 176
    .line 177
    iget-object v14, v3, Ly;->a:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v14, Ljava/lang/reflect/Method;

    .line 180
    .line 181
    const-string v8, " path="

    .line 182
    .line 183
    if-eqz v13, :cond_a

    .line 184
    .line 185
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v16

    .line 189
    if-eqz v16, :cond_a

    .line 190
    .line 191
    iget-object v12, v3, Ly;->b:Ljava/lang/Object;

    .line 192
    .line 193
    if-eqz v12, :cond_a

    .line 194
    .line 195
    if-nez v14, :cond_9

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_9
    :try_start_0
    new-instance v15, Ljava/io/File;

    .line 199
    .line 200
    invoke-direct {v15, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v15}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    filled-new-array {v13, v15, v0}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v14, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-nez v0, :cond_b

    .line 220
    .line 221
    :cond_a
    :goto_6
    const/4 v12, 0x0

    .line 222
    goto :goto_7

    .line 223
    :cond_b
    new-instance v12, Landroid/text/SpannableStringBuilder;

    .line 224
    .line 225
    const-string v15, "\u56fe\u7247"

    .line 226
    .line 227
    invoke-direct {v12, v15}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Landroid/text/SpannableStringBuilder;->length()I

    .line 231
    .line 232
    .line 233
    move-result v15

    .line 234
    const/16 v3, 0x21

    .line 235
    .line 236
    invoke-virtual {v12, v0, v5, v15, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    .line 238
    .line 239
    goto :goto_7

    .line 240
    :catchall_0
    move-exception v0

    .line 241
    new-instance v3, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v12, "official span invocation failed method="

    .line 244
    .line 245
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v14}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const/16 v12, 0x78

    .line 259
    .line 260
    invoke-static {v13, v12}, Ls4;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v12, ": "

    .line 268
    .line 269
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :goto_7
    if-eqz v12, :cond_1a

    .line 284
    .line 285
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_c

    .line 290
    .line 291
    goto/16 :goto_10

    .line 292
    .line 293
    :cond_c
    const/16 v0, 0xa

    .line 294
    .line 295
    const/4 v3, 0x1

    .line 296
    if-gtz v6, :cond_e

    .line 297
    .line 298
    :cond_d
    :goto_8
    move v8, v5

    .line 299
    goto :goto_b

    .line 300
    :cond_e
    add-int/lit8 v8, v6, -0x1

    .line 301
    .line 302
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    check-cast v8, Lr4;

    .line 307
    .line 308
    if-eqz v8, :cond_d

    .line 309
    .line 310
    iget-boolean v9, v8, Lr4;->a:Z

    .line 311
    .line 312
    if-nez v9, :cond_d

    .line 313
    .line 314
    iget v9, v8, Lr4;->c:I

    .line 315
    .line 316
    iget v8, v8, Lr4;->b:I

    .line 317
    .line 318
    if-gt v9, v8, :cond_f

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_f
    if-eqz v1, :cond_11

    .line 322
    .line 323
    if-le v9, v8, :cond_11

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    if-le v9, v8, :cond_10

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_10
    add-int/lit8 v9, v9, -0x1

    .line 333
    .line 334
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-ne v8, v0, :cond_11

    .line 339
    .line 340
    move v8, v3

    .line 341
    goto :goto_a

    .line 342
    :cond_11
    :goto_9
    move v8, v5

    .line 343
    :goto_a
    xor-int/2addr v8, v3

    .line 344
    :goto_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    sub-int/2addr v9, v3

    .line 349
    if-lt v6, v9, :cond_12

    .line 350
    .line 351
    goto :goto_e

    .line 352
    :cond_12
    add-int/lit8 v9, v6, 0x1

    .line 353
    .line 354
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    check-cast v9, Lr4;

    .line 359
    .line 360
    if-eqz v9, :cond_16

    .line 361
    .line 362
    iget-boolean v11, v9, Lr4;->a:Z

    .line 363
    .line 364
    if-nez v11, :cond_16

    .line 365
    .line 366
    iget v11, v9, Lr4;->c:I

    .line 367
    .line 368
    iget v9, v9, Lr4;->b:I

    .line 369
    .line 370
    if-gt v11, v9, :cond_13

    .line 371
    .line 372
    goto :goto_e

    .line 373
    :cond_13
    if-eqz v1, :cond_15

    .line 374
    .line 375
    if-le v11, v9, :cond_15

    .line 376
    .line 377
    if-ltz v9, :cond_15

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    if-lt v9, v11, :cond_14

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_14
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    if-ne v9, v0, :cond_15

    .line 391
    .line 392
    move v9, v3

    .line 393
    goto :goto_d

    .line 394
    :cond_15
    :goto_c
    move v9, v5

    .line 395
    :goto_d
    xor-int/2addr v3, v9

    .line 396
    :cond_16
    :goto_e
    if-nez v8, :cond_17

    .line 397
    .line 398
    if-nez v3, :cond_17

    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_17
    new-instance v9, Landroid/text/SpannableStringBuilder;

    .line 402
    .line 403
    invoke-direct {v9}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    if-eqz v8, :cond_18

    .line 407
    .line 408
    invoke-virtual {v9, v0}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 409
    .line 410
    .line 411
    :cond_18
    invoke-virtual {v9, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 412
    .line 413
    .line 414
    if-eqz v3, :cond_19

    .line 415
    .line 416
    invoke-virtual {v9, v0}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 417
    .line 418
    .line 419
    :cond_19
    move-object v12, v9

    .line 420
    :goto_f
    new-instance v0, Lq4;

    .line 421
    .line 422
    iget v3, v7, Lr4;->b:I

    .line 423
    .line 424
    iget v7, v7, Lr4;->c:I

    .line 425
    .line 426
    invoke-direct {v0, v3, v7, v12}, Lq4;-><init>(IILandroid/text/SpannableStringBuilder;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_14

    .line 433
    :cond_1a
    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string v1, "official span create failed token="

    .line 436
    .line 437
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    iget-object v1, v7, Lr4;->d:Ljava/lang/String;

    .line 441
    .line 442
    if-nez v1, :cond_1b

    .line 443
    .line 444
    goto :goto_11

    .line 445
    :cond_1b
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    const/16 v3, 0x24

    .line 450
    .line 451
    if-gt v2, v3, :cond_1c

    .line 452
    .line 453
    move-object v9, v1

    .line 454
    goto :goto_11

    .line 455
    :cond_1c
    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    :goto_11
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    iget-object v1, v11, Lo4;->a:Ljava/lang/String;

    .line 466
    .line 467
    const/16 v12, 0x78

    .line 468
    .line 469
    invoke-static {v1, v12}, Ls4;->o(Ljava/lang/String;I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-object v4

    .line 484
    :cond_1d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 485
    .line 486
    const-string v1, "unsupported favorite token="

    .line 487
    .line 488
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    iget-object v1, v7, Lr4;->d:Ljava/lang/String;

    .line 492
    .line 493
    if-nez v1, :cond_1e

    .line 494
    .line 495
    goto :goto_12

    .line 496
    :cond_1e
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    const/16 v3, 0x24

    .line 501
    .line 502
    if-gt v2, v3, :cond_1f

    .line 503
    .line 504
    move-object v9, v1

    .line 505
    goto :goto_12

    .line 506
    :cond_1f
    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v9

    .line 510
    :goto_12
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    const-string v1, " reason="

    .line 514
    .line 515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    if-nez v11, :cond_20

    .line 519
    .line 520
    const-string v1, "no_pic_path"

    .line 521
    .line 522
    goto :goto_13

    .line 523
    :cond_20
    iget-object v1, v11, Lo4;->c:Ljava/io/Serializable;

    .line 524
    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    :goto_13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-object v4

    .line 538
    :goto_14
    add-int/lit8 v6, v6, 0x1

    .line 539
    .line 540
    move-object/from16 v3, p3

    .line 541
    .line 542
    goto/16 :goto_0

    .line 543
    .line 544
    :cond_21
    :goto_15
    return-object v4
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const-class v2, Ljava/lang/Object;

    .line 18
    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    array-length v3, v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return-object p0

    .line 46
    :catch_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static e(Lf2;)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lf2;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lia;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_0
    iput-boolean v1, v0, Lia;->g:Z

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, v0, Lia;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    monitor-enter p0

    .line 18
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v1, p0, Lf2;->c:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lf2;->c:Ljava/io/Serializable;

    .line 28
    .line 29
    check-cast v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    iget-object v1, p0, Lf2;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/widget/EditText;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    :try_start_2
    iget-object p0, p0, Lf2;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lk4;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    :catchall_0
    :cond_1
    const/4 p0, 0x0

    .line 57
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-ge p0, v2, :cond_2

    .line 62
    .line 63
    :try_start_3
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    .line 71
    .line 72
    :catchall_1
    add-int/lit8 p0, p0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    :goto_1
    return-void

    .line 76
    :catchall_2
    move-exception v0

    .line 77
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 78
    throw v0

    .line 79
    :catchall_3
    move-exception p0

    .line 80
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 81
    throw p0
.end method

.method public static f(Lf2;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ls4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls4;->o:Lf2;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    if-eq v1, p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    sput-object p0, Ls4;->o:Lf2;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-static {v1}, Ls4;->e(Lf2;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v0, "pending official mixed send cleared id="

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, Lf2;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lia;

    .line 30
    .line 31
    iget-wide v0, v0, Lia;->a:J

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, " reason="

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p0
.end method

.method public static g(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x5

    .line 3
    if-ge v0, v1, :cond_2

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eq p1, p0, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 22
    .line 23
    .line 24
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    instance-of v1, p1, Landroid/view/View;

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    check-cast p1, Landroid/view/View;

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static h(Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lr4;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v2, v2, Lr4;->a:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return v1
.end method

.method public static i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_27

    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    if-gt p1, v1, :cond_27

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget v2, p3, v1

    .line 9
    .line 10
    const/16 v3, 0xb4

    .line 11
    .line 12
    if-gt v2, v3, :cond_27

    .line 13
    .line 14
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_13

    .line 21
    .line 22
    :cond_0
    aget v2, p3, v1

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    add-int/2addr v2, v3

    .line 26
    aput v2, p3, v1

    .line 27
    .line 28
    instance-of v2, p0, Ljava/lang/CharSequence;

    .line 29
    .line 30
    if-nez v2, :cond_27

    .line 31
    .line 32
    instance-of v2, p0, Ljava/lang/Number;

    .line 33
    .line 34
    if-nez v2, :cond_27

    .line 35
    .line 36
    instance-of v2, p0, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v2, :cond_27

    .line 39
    .line 40
    instance-of v2, p0, Landroid/content/Context;

    .line 41
    .line 42
    if-nez v2, :cond_27

    .line 43
    .line 44
    instance-of v2, p0, Landroid/view/View;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    goto/16 :goto_13

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v5, "marketface"

    .line 65
    .line 66
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const-string v6, "face_or_market"

    .line 71
    .line 72
    const-string v7, ""

    .line 73
    .line 74
    if-nez v5, :cond_26

    .line 75
    .line 76
    const-string v5, "facebubble"

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_26

    .line 83
    .line 84
    const-string v5, "giphyelement"

    .line 85
    .line 86
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    goto/16 :goto_12

    .line 93
    .line 94
    :cond_2
    const-string v5, "picelement"

    .line 95
    .line 96
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_13

    .line 101
    .line 102
    const-string p1, "getSourcePath"

    .line 103
    .line 104
    invoke-static {p0, p1}, Ls4;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    move-object p1, v0

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_0
    if-eqz p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-nez p2, :cond_6

    .line 123
    .line 124
    :cond_4
    const-string p1, "sourcePath"

    .line 125
    .line 126
    invoke-static {p0, p1}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-nez p1, :cond_5

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_1
    move-object p1, v0

    .line 138
    :cond_6
    const-string p2, "getOriginal"

    .line 139
    .line 140
    invoke-static {p0, p2}, Ls4;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    const-string p3, "original"

    .line 145
    .line 146
    invoke-static {p0, p3}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    instance-of p3, p0, Ljava/lang/Boolean;

    .line 151
    .line 152
    if-eqz p3, :cond_7

    .line 153
    .line 154
    check-cast p0, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    goto :goto_2

    .line 161
    :cond_7
    instance-of p3, p0, Ljava/lang/Number;

    .line 162
    .line 163
    if-eqz p3, :cond_8

    .line 164
    .line 165
    check-cast p0, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eqz p0, :cond_8

    .line 172
    .line 173
    move p0, v3

    .line 174
    goto :goto_2

    .line 175
    :cond_8
    move p0, v1

    .line 176
    :goto_2
    instance-of p3, p2, Ljava/lang/Boolean;

    .line 177
    .line 178
    if-eqz p3, :cond_9

    .line 179
    .line 180
    check-cast p2, Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    goto :goto_3

    .line 187
    :cond_9
    instance-of p3, p2, Ljava/lang/Number;

    .line 188
    .line 189
    if-eqz p3, :cond_b

    .line 190
    .line 191
    check-cast p2, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_a

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_a
    move v3, v1

    .line 201
    goto :goto_3

    .line 202
    :cond_b
    move v3, p0

    .line 203
    :goto_3
    if-eqz p1, :cond_12

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-nez p0, :cond_c

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_c
    const-string p0, "file://"

    .line 213
    .line 214
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-eqz p0, :cond_d

    .line 219
    .line 220
    const/4 p0, 0x7

    .line 221
    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    :cond_d
    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    const-string p2, "http://"

    .line 230
    .line 231
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-nez p2, :cond_11

    .line 236
    .line 237
    const-string p2, "https://"

    .line 238
    .line 239
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-nez p2, :cond_11

    .line 244
    .line 245
    const-string p2, "content://"

    .line 246
    .line 247
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    if-eqz p0, :cond_e

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_e
    new-instance p0, Ljava/io/File;

    .line 255
    .line 256
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_10

    .line 264
    .line 265
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 266
    .line 267
    .line 268
    move-result-wide p1

    .line 269
    const-wide/16 v4, 0x0

    .line 270
    .line 271
    cmp-long p1, p1, v4

    .line 272
    .line 273
    if-gtz p1, :cond_f

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_f
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    new-instance p1, Lo4;

    .line 281
    .line 282
    invoke-direct {p1, p0, v7, v3}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 283
    .line 284
    .line 285
    return-object p1

    .line 286
    :cond_10
    :goto_4
    new-instance p0, Lo4;

    .line 287
    .line 288
    const-string p1, "file_missing"

    .line 289
    .line 290
    invoke-direct {p0, v7, p1, v1}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 291
    .line 292
    .line 293
    return-object p0

    .line 294
    :cond_11
    :goto_5
    new-instance p0, Lo4;

    .line 295
    .line 296
    const-string p1, "non_file_path"

    .line 297
    .line 298
    invoke-direct {p0, v7, p1, v1}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 299
    .line 300
    .line 301
    return-object p0

    .line 302
    :cond_12
    :goto_6
    new-instance p0, Lo4;

    .line 303
    .line 304
    const-string p1, "path_empty"

    .line 305
    .line 306
    invoke-direct {p0, v7, p1, v1}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 307
    .line 308
    .line 309
    return-object p0

    .line 310
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    const/16 v5, 0x40

    .line 319
    .line 320
    if-eqz v4, :cond_15

    .line 321
    .line 322
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-nez v4, :cond_15

    .line 335
    .line 336
    :try_start_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 337
    .line 338
    .line 339
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    goto :goto_7

    .line 341
    :catchall_0
    move v2, v1

    .line 342
    :goto_7
    if-ge v1, v2, :cond_27

    .line 343
    .line 344
    if-ge v1, v5, :cond_27

    .line 345
    .line 346
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    add-int/lit8 v6, p1, 0x1

    .line 351
    .line 352
    invoke-static {v4, v6, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    if-eqz v4, :cond_14

    .line 357
    .line 358
    return-object v4

    .line 359
    :cond_14
    add-int/lit8 v1, v1, 0x1

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_15
    instance-of v4, p0, Ljava/lang/Iterable;

    .line 363
    .line 364
    if-eqz v4, :cond_17

    .line 365
    .line 366
    check-cast p0, Ljava/lang/Iterable;

    .line 367
    .line 368
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_27

    .line 377
    .line 378
    if-ge v1, v5, :cond_27

    .line 379
    .line 380
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    add-int/lit8 v4, p1, 0x1

    .line 385
    .line 386
    invoke-static {v2, v4, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    if-eqz v2, :cond_16

    .line 391
    .line 392
    return-object v2

    .line 393
    :cond_16
    add-int/lit8 v1, v1, 0x1

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_17
    instance-of v4, p0, Ljava/util/Map;

    .line 397
    .line 398
    if-eqz v4, :cond_1a

    .line 399
    .line 400
    check-cast p0, Ljava/util/Map;

    .line 401
    .line 402
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_27

    .line 415
    .line 416
    if-ge v1, v5, :cond_27

    .line 417
    .line 418
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    instance-of v4, v2, Ljava/util/Map$Entry;

    .line 423
    .line 424
    if-eqz v4, :cond_19

    .line 425
    .line 426
    check-cast v2, Ljava/util/Map$Entry;

    .line 427
    .line 428
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    add-int/lit8 v6, p1, 0x1

    .line 433
    .line 434
    invoke-static {v4, v6, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    if-eqz v4, :cond_18

    .line 439
    .line 440
    return-object v4

    .line 441
    :cond_18
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v2, v6, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    if-eqz v2, :cond_19

    .line 450
    .line 451
    return-object v2

    .line 452
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_1a
    const-string v4, "picElement"

    .line 456
    .line 457
    invoke-static {p0, v4}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    if-eqz v4, :cond_1b

    .line 462
    .line 463
    add-int/lit8 v5, p1, 0x1

    .line 464
    .line 465
    invoke-static {v4, v5, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    if-eqz v4, :cond_1b

    .line 470
    .line 471
    return-object v4

    .line 472
    :cond_1b
    const-string v4, "faceElement"

    .line 473
    .line 474
    const-string v5, "giphyElement"

    .line 475
    .line 476
    const-string v8, "marketFaceElement"

    .line 477
    .line 478
    const-string v9, "faceBubbleElement"

    .line 479
    .line 480
    filled-new-array {v8, v9, v4, v5}, [Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    move v5, v1

    .line 485
    :goto_a
    const/4 v8, 0x4

    .line 486
    if-ge v5, v8, :cond_1d

    .line 487
    .line 488
    aget-object v8, v4, v5

    .line 489
    .line 490
    invoke-static {p0, v8}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    if-eqz v8, :cond_1c

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_1c
    add-int/lit8 v5, v5, 0x1

    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_1d
    move-object v8, v0

    .line 501
    :goto_b
    if-eqz v8, :cond_1e

    .line 502
    .line 503
    new-instance p0, Lo4;

    .line 504
    .line 505
    invoke-direct {p0, v7, v6, v1}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 506
    .line 507
    .line 508
    return-object p0

    .line 509
    :cond_1e
    const-string v4, "java."

    .line 510
    .line 511
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    if-nez v4, :cond_27

    .line 516
    .line 517
    const-string v4, "android."

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-nez v4, :cond_27

    .line 524
    .line 525
    const-string v4, "kotlin."

    .line 526
    .line 527
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    if-eqz v2, :cond_1f

    .line 532
    .line 533
    goto/16 :goto_13

    .line 534
    .line 535
    :cond_1f
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    move v4, v1

    .line 540
    :goto_c
    if-eqz v2, :cond_27

    .line 541
    .line 542
    const-class v5, Ljava/lang/Object;

    .line 543
    .line 544
    if-eq v2, v5, :cond_27

    .line 545
    .line 546
    const/16 v5, 0x50

    .line 547
    .line 548
    if-ge v4, v5, :cond_27

    .line 549
    .line 550
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 551
    .line 552
    .line 553
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 554
    goto :goto_d

    .line 555
    :catchall_1
    move-object v6, v0

    .line 556
    :goto_d
    if-eqz v6, :cond_25

    .line 557
    .line 558
    move v8, v1

    .line 559
    :goto_e
    array-length v9, v6

    .line 560
    if-ge v8, v9, :cond_25

    .line 561
    .line 562
    if-ge v4, v5, :cond_25

    .line 563
    .line 564
    aget-object v9, v6, v8

    .line 565
    .line 566
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-nez v10, :cond_24

    .line 575
    .line 576
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    move-result-object v10

    .line 580
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-eqz v10, :cond_20

    .line 585
    .line 586
    goto :goto_11

    .line 587
    :cond_20
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v10

    .line 591
    if-nez v10, :cond_21

    .line 592
    .line 593
    move-object v10, v7

    .line 594
    goto :goto_f

    .line 595
    :cond_21
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 596
    .line 597
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v10

    .line 601
    :goto_f
    const-string v11, "pic"

    .line 602
    .line 603
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 604
    .line 605
    .line 606
    move-result v11

    .line 607
    if-nez v11, :cond_23

    .line 608
    .line 609
    const-string v11, "image"

    .line 610
    .line 611
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    if-nez v11, :cond_23

    .line 616
    .line 617
    const-string v11, "face"

    .line 618
    .line 619
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 620
    .line 621
    .line 622
    move-result v11

    .line 623
    if-nez v11, :cond_23

    .line 624
    .line 625
    const-string v11, "element"

    .line 626
    .line 627
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 628
    .line 629
    .line 630
    move-result v10

    .line 631
    if-eqz v10, :cond_22

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_22
    const/4 v10, 0x2

    .line 635
    if-le p1, v10, :cond_23

    .line 636
    .line 637
    goto :goto_11

    .line 638
    :cond_23
    :goto_10
    add-int/lit8 v4, v4, 0x1

    .line 639
    .line 640
    :try_start_2
    invoke-virtual {v9, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v9, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    add-int/lit8 v10, p1, 0x1

    .line 648
    .line 649
    invoke-static {v9, v10, p2, p3}, Ls4;->i(Ljava/lang/Object;ILjava/util/Set;[I)Lo4;

    .line 650
    .line 651
    .line 652
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 653
    if-eqz v9, :cond_24

    .line 654
    .line 655
    return-object v9

    .line 656
    :catchall_2
    :cond_24
    :goto_11
    add-int/lit8 v8, v8, 0x1

    .line 657
    .line 658
    goto :goto_e

    .line 659
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    goto :goto_c

    .line 664
    :cond_26
    :goto_12
    new-instance p0, Lo4;

    .line 665
    .line 666
    invoke-direct {p0, v7, v6, v1}, Lo4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 667
    .line 668
    .line 669
    return-object p0

    .line 670
    :cond_27
    :goto_13
    return-object v0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return-object v0
.end method

.method public static k(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_6

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    if-eqz v2, :cond_5

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    if-ne v3, v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    array-length v4, v3

    .line 28
    const/4 v5, 0x3

    .line 29
    if-eq v4, v5, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    aget-object v4, v3, v0

    .line 33
    .line 34
    const-class v5, Ljava/lang/String;

    .line 35
    .line 36
    if-eq v4, v5, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v4, 0x1

    .line 40
    aget-object v5, v3, v4

    .line 41
    .line 42
    const-class v6, Landroid/net/Uri;

    .line 43
    .line 44
    if-eq v5, v6, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v5, 0x2

    .line 48
    aget-object v3, v3, v5

    .line 49
    .line 50
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-eq v3, v5, :cond_4

    .line 53
    .line 54
    const-class v5, Ljava/lang/Boolean;

    .line 55
    .line 56
    if-eq v3, v5, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method

.method public static l(Landroid/view/View;Landroid/widget/EditText;I[ILh4;II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    if-gt v7, v5, :cond_16

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget v3, p3, v2

    .line 17
    .line 18
    move/from16 v6, p6

    .line 19
    .line 20
    if-le v3, v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_b

    .line 23
    .line 24
    :cond_0
    const/4 v8, 0x1

    .line 25
    add-int/2addr v3, v8

    .line 26
    aput v3, p3, v2

    .line 27
    .line 28
    const/16 v3, 0x78

    .line 29
    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    goto/16 :goto_9

    .line 33
    .line 34
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-eqz v9, :cond_12

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 41
    .line 42
    .line 43
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 44
    if-nez v9, :cond_2

    .line 45
    .line 46
    goto/16 :goto_9

    .line 47
    .line 48
    :cond_2
    instance-of v9, v0, Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v9, :cond_3

    .line 51
    .line 52
    move-object v9, v0

    .line 53
    check-cast v9, Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 v9, 0x0

    .line 61
    :goto_0
    const-string v10, ""

    .line 62
    .line 63
    if-nez v9, :cond_4

    .line 64
    .line 65
    move-object v9, v10

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    :goto_1
    const-string v11, "\u53d1\u9001"

    .line 76
    .line 77
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-eqz v12, :cond_5

    .line 82
    .line 83
    move v9, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    invoke-virtual {v9, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_6

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/4 v12, 0x6

    .line 96
    if-gt v9, v12, :cond_6

    .line 97
    .line 98
    const/16 v9, 0x5f

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    move v9, v2

    .line 102
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    if-nez v12, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    invoke-interface {v12}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    :goto_3
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_8

    .line 122
    .line 123
    const/16 v10, 0x50

    .line 124
    .line 125
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    :cond_8
    invoke-static {v0}, Ls4;->w(Landroid/view/View;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 134
    .line 135
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    const-string v11, "send"

    .line 140
    .line 141
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-nez v11, :cond_9

    .line 146
    .line 147
    const-string v11, "fun_btn"

    .line 148
    .line 149
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_a

    .line 154
    .line 155
    :cond_9
    const/16 v10, 0x3a

    .line 156
    .line 157
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    :cond_a
    if-gtz v9, :cond_b

    .line 162
    .line 163
    goto/16 :goto_9

    .line 164
    .line 165
    :cond_b
    invoke-static {v1, v0}, Ls4;->g(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    if-nez v10, :cond_c

    .line 170
    .line 171
    goto/16 :goto_9

    .line 172
    .line 173
    :cond_c
    const/4 v10, 0x2

    .line 174
    :try_start_1
    new-array v11, v10, [I

    .line 175
    .line 176
    new-array v12, v10, [I

    .line 177
    .line 178
    invoke-virtual {v1, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v12}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 182
    .line 183
    .line 184
    aget v13, v11, v8

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    div-int/2addr v14, v10

    .line 191
    add-int/2addr v13, v14

    .line 192
    aget v14, v12, v8

    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    div-int/2addr v15, v10

    .line 199
    add-int/2addr v14, v15

    .line 200
    sub-int/2addr v14, v13

    .line 201
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 209
    if-nez v13, :cond_d

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_d
    :try_start_2
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 221
    .line 222
    const/high16 v14, 0x42f00000    # 120.0f

    .line 223
    .line 224
    mul-float/2addr v14, v13

    .line 225
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 230
    .line 231
    .line 232
    move-result v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 233
    goto :goto_5

    .line 234
    :catchall_0
    :goto_4
    move v13, v3

    .line 235
    :goto_5
    if-le v10, v13, :cond_e

    .line 236
    .line 237
    move v10, v2

    .line 238
    goto :goto_8

    .line 239
    :cond_e
    mul-int/lit8 v10, v10, 0x28

    .line 240
    .line 241
    :try_start_3
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    div-int/2addr v10, v13

    .line 246
    rsub-int/lit8 v10, v10, 0x28

    .line 247
    .line 248
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    aget v12, v12, v2

    .line 253
    .line 254
    aget v11, v11, v2

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 260
    if-nez v13, :cond_f

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_f
    :try_start_4
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 272
    .line 273
    const/high16 v14, 0x41c00000    # 24.0f

    .line 274
    .line 275
    mul-float/2addr v14, v13

    .line 276
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 281
    .line 282
    .line 283
    move-result v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 284
    goto :goto_7

    .line 285
    :catchall_1
    :goto_6
    const/16 v13, 0x18

    .line 286
    .line 287
    :goto_7
    sub-int/2addr v11, v13

    .line 288
    if-lt v12, v11, :cond_10

    .line 289
    .line 290
    add-int/lit8 v10, v10, 0xc

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :catchall_2
    move v10, v8

    .line 294
    :cond_10
    :goto_8
    if-gtz v10, :cond_11

    .line 295
    .line 296
    const/16 v11, 0x64

    .line 297
    .line 298
    if-ge v9, v11, :cond_11

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_11
    add-int v2, v9, v10

    .line 302
    .line 303
    :catchall_3
    :cond_12
    :goto_9
    iget v9, v4, Lh4;->a:I

    .line 304
    .line 305
    if-le v2, v9, :cond_14

    .line 306
    .line 307
    invoke-static {v1, v0}, Ls4;->g(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    if-eqz v9, :cond_13

    .line 312
    .line 313
    iput-object v9, v4, Lh4;->b:Ljava/lang/Object;

    .line 314
    .line 315
    :cond_13
    iput v2, v4, Lh4;->a:I

    .line 316
    .line 317
    :cond_14
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 318
    .line 319
    if-nez v2, :cond_15

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_15
    move-object v9, v0

    .line 323
    check-cast v9, Landroid/view/ViewGroup;

    .line 324
    .line 325
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    sub-int/2addr v0, v8

    .line 334
    move v10, v0

    .line 335
    :goto_a
    if-ltz v10, :cond_16

    .line 336
    .line 337
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    add-int/lit8 v2, v7, 0x1

    .line 342
    .line 343
    move-object/from16 v3, p3

    .line 344
    .line 345
    invoke-static/range {v0 .. v6}, Ls4;->l(Landroid/view/View;Landroid/widget/EditText;I[ILh4;II)V

    .line 346
    .line 347
    .line 348
    add-int/lit8 v10, v10, -0x1

    .line 349
    .line 350
    move-object/from16 v1, p1

    .line 351
    .line 352
    move-object/from16 v4, p4

    .line 353
    .line 354
    move/from16 v5, p5

    .line 355
    .line 356
    move/from16 v6, p6

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_16
    :goto_b
    return-void
.end method

.method public static m(Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lr4;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v3, v2, Lr4;->a:Z

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget v3, v2, Lr4;->c:I

    .line 22
    .line 23
    iget v2, v2, Lr4;->b:I

    .line 24
    .line 25
    if-le v3, v2, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v0
.end method

.method public static n(Lf2;Z)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    const-string v1, "favorite_emoticon_batch_send"

    .line 5
    .line 6
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    sget-object v1, Ls4;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    sget-object v2, Ls4;->o:Lf2;

    .line 18
    .line 19
    if-eq v2, p0, :cond_1

    .line 20
    .line 21
    monitor-exit v1

    .line 22
    return v0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    iget-object v1, p0, Lf2;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/widget/EditText;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :goto_0
    if-nez v3, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    :catchall_1
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    iget-object v5, p0, Lf2;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Lia;

    .line 60
    .line 61
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    monitor-enter v5

    .line 66
    :try_start_2
    iget-boolean v7, v5, Lia;->g:Z

    .line 67
    .line 68
    const/4 v8, 0x1

    .line 69
    if-nez v7, :cond_5

    .line 70
    .line 71
    iget-wide v9, v5, Lia;->f:J

    .line 72
    .line 73
    cmp-long v7, v3, v9

    .line 74
    .line 75
    if-gtz v7, :cond_5

    .line 76
    .line 77
    iget v7, v5, Lia;->e:I

    .line 78
    .line 79
    if-ne v7, v6, :cond_5

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    iget-object v6, v5, Lia;->b:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-ne v1, v6, :cond_5

    .line 90
    .line 91
    iget-object v1, v5, Lia;->c:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v2, :cond_4

    .line 94
    .line 95
    const-string v2, ""

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_2
    move-exception p0

    .line 99
    goto :goto_7

    .line 100
    :cond_4
    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    move v1, v8

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    move v1, v0

    .line 109
    :goto_3
    monitor-exit v5

    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iget-object p0, p0, Lf2;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Lia;

    .line 117
    .line 118
    monitor-enter p0

    .line 119
    :try_start_3
    iget-boolean p1, p0, Lia;->g:Z

    .line 120
    .line 121
    if-nez p1, :cond_6

    .line 122
    .line 123
    iget-wide v1, p0, Lia;->f:J

    .line 124
    .line 125
    cmp-long p1, v3, v1

    .line 126
    .line 127
    if-gtz p1, :cond_6

    .line 128
    .line 129
    iget-wide v1, p0, Lia;->h:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 130
    .line 131
    cmp-long p1, v3, v1

    .line 132
    .line 133
    if-gtz p1, :cond_6

    .line 134
    .line 135
    move v0, v8

    .line 136
    goto :goto_4

    .line 137
    :catchall_3
    move-exception p1

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    :goto_4
    monitor-exit p0

    .line 140
    move v1, v0

    .line 141
    goto :goto_6

    .line 142
    :goto_5
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 143
    throw p1

    .line 144
    :cond_7
    :goto_6
    return v1

    .line 145
    :goto_7
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 146
    throw p0

    .line 147
    :goto_8
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 148
    throw p0

    .line 149
    :cond_8
    :goto_9
    return v0
.end method

.method public static o(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gt v0, p1, :cond_1

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static p(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "debug_log"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "favorite emoticon mixed "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V
    .locals 13

    .line 1
    const-string v1, ",+"

    .line 2
    .line 3
    const-string v2, "["

    .line 4
    .line 5
    const-string v3, "null"

    .line 6
    .line 7
    const-string v0, "debug_log"

    .line 8
    .line 9
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " input="

    .line 25
    .line 26
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, " editable="

    .line 41
    .line 42
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, "class="

    .line 48
    .line 49
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " len="

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, " text="

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Ls4;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p0, " spans="

    .line 99
    .line 100
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 p0, 0x5d

    .line 104
    .line 105
    const/16 v5, 0x2c

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    :try_start_0
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const-class v7, Ljava/lang/Object;

    .line 113
    .line 114
    move-object/from16 v8, p4

    .line 115
    .line 116
    invoke-interface {v8, v6, v0, v7}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    array-length v7, v0

    .line 123
    if-nez v7, :cond_1

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    array-length v8, v0

    .line 132
    const/16 v9, 0x8

    .line 133
    .line 134
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    move v9, v6

    .line 139
    :goto_0
    if-ge v9, v8, :cond_6

    .line 140
    .line 141
    if-lez v9, :cond_2

    .line 142
    .line 143
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    goto :goto_4

    .line 149
    :cond_2
    :goto_1
    aget-object v10, v0, v9

    .line 150
    .line 151
    if-nez v10, :cond_3

    .line 152
    .line 153
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    const/16 v12, 0x2e

    .line 166
    .line 167
    invoke-virtual {v11, v12}, Ljava/lang/String;->lastIndexOf(I)I

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-ltz v12, :cond_4

    .line 172
    .line 173
    add-int/lit8 v12, v12, 0x1

    .line 174
    .line 175
    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    :cond_4
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    instance-of v10, v10, Landroid/text/style/ReplacementSpan;

    .line 183
    .line 184
    if-eqz v10, :cond_5

    .line 185
    .line 186
    const-string v10, ":replacement"

    .line 187
    .line 188
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    :cond_5
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_6
    array-length v9, v0

    .line 195
    if-le v9, v8, :cond_7

    .line 196
    .line 197
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    array-length v0, v0

    .line 201
    sub-int/2addr v0, v8

    .line 202
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    :cond_7
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_5

    .line 213
    :cond_8
    :goto_3
    const-string v0, "[]"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v7, "error:"

    .line 225
    .line 226
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :goto_5
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v0, " segments="

    .line 234
    .line 235
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :goto_6
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    const/16 v7, 0xc

    .line 248
    .line 249
    if-ge v6, v2, :cond_c

    .line 250
    .line 251
    if-ge v6, v7, :cond_c

    .line 252
    .line 253
    if-lez v6, :cond_9

    .line 254
    .line 255
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    :cond_9
    move-object/from16 v2, p5

    .line 259
    .line 260
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    check-cast v7, Lr4;

    .line 265
    .line 266
    if-nez v7, :cond_a

    .line 267
    .line 268
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_a
    iget v8, v7, Lr4;->c:I

    .line 273
    .line 274
    iget v9, v7, Lr4;->b:I

    .line 275
    .line 276
    iget-boolean v7, v7, Lr4;->a:Z

    .line 277
    .line 278
    const/16 v10, 0x29

    .line 279
    .line 280
    const/16 v11, 0x2d

    .line 281
    .line 282
    if-eqz v7, :cond_b

    .line 283
    .line 284
    const-string v7, "fav("

    .line 285
    .line 286
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_b
    const-string v7, "text("

    .line 303
    .line 304
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_c
    move-object/from16 v2, p5

    .line 323
    .line 324
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-le v5, v7, :cond_d

    .line 329
    .line 330
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    sub-int/2addr v1, v7

    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    :cond_d
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string p0, " sendEntry="

    .line 352
    .line 353
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    const-string p0, " sendMethod="

    .line 360
    .line 361
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-static {p1}, Ls4;->r(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-string p0, " listIndex="

    .line 372
    .line 373
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string p0, " spanMethod="

    .line 380
    .line 381
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    sget-object p0, Ls4;->e:Ljava/lang/reflect/Method;

    .line 385
    .line 386
    if-nez p0, :cond_e

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_e
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    :goto_8
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    return-void
.end method

.method public static r(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    check-cast p0, Ljava/lang/reflect/Method;

    .line 11
    .line 12
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const-string p0, "null"

    .line 18
    .line 19
    return-object p0
.end method

.method public static s(Landroid/widget/EditText;)Ly;
    .locals 8

    .line 1
    sget-object v0, Ls4;->e:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    sget-object v1, Ls4;->f:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance p0, Ly;

    .line 11
    .line 12
    invoke-direct {p0, v1, v0, v2}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Ls4;->c:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_2
    sget-object v1, Ls4;->a:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v1

    .line 42
    :try_start_0
    sget-object v3, Ls4;->e:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    sget-object v4, Ls4;->f:Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    new-instance p0, Ly;

    .line 51
    .line 52
    invoke-direct {p0, v4, v3, v2}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 53
    .line 54
    .line 55
    monitor-exit v1

    .line 56
    return-object p0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_3
    sget-boolean v3, Ls4;->d:Z

    .line 61
    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    monitor-exit v1

    .line 65
    return-object p0

    .line 66
    :cond_4
    const/4 v3, 0x1

    .line 67
    sput-boolean v3, Ls4;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    :try_start_1
    const-string v4, "com.tencent.mobileqq.aio.input.fullscreen.InputImageUtils"

    .line 70
    .line 71
    invoke-static {v0, v4}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    const-string v0, "official input image utils missing class=com.tencent.mobileqq.aio.input.fullscreen.InputImageUtils"

    .line 78
    .line 79
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    return-object p0

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_5
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move v5, v2

    .line 92
    :goto_0
    array-length v6, v4

    .line 93
    if-ge v5, v6, :cond_9

    .line 94
    .line 95
    aget-object v6, v4, v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    :try_start_4
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-nez v7, :cond_7

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 126
    if-eqz v6, :cond_8

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catchall_2
    :cond_8
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_9
    :try_start_5
    invoke-virtual {v0, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 143
    goto :goto_2

    .line 144
    :catchall_3
    move-object v6, p0

    .line 145
    :goto_2
    :try_start_6
    invoke-static {v0}, Ls4;->k(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v6, :cond_b

    .line 150
    .line 151
    if-nez v0, :cond_a

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_a
    sput-object v6, Ls4;->f:Ljava/lang/Object;

    .line 155
    .line 156
    sput-object v0, Ls4;->e:Ljava/lang/reflect/Method;

    .line 157
    .line 158
    new-instance v3, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v4, "official input image span ready method="

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v3}, Ls4;->p(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v3, Ly;

    .line 183
    .line 184
    invoke-direct {v3, v6, v0, v2}, Ly;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 185
    .line 186
    .line 187
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 188
    return-object v3

    .line 189
    :cond_b
    :goto_3
    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v3, "official input image span unresolved host="

    .line 195
    .line 196
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    if-nez v6, :cond_c

    .line 200
    .line 201
    const-string v3, "null"

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_c
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v3, " method="

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    if-nez v0, :cond_d

    .line 221
    .line 222
    const-string v0, "null"

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_d
    invoke-static {v0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_5
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 237
    .line 238
    .line 239
    :try_start_9
    monitor-exit v1

    .line 240
    goto :goto_7

    .line 241
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v3, "official input image span resolve failed: "

    .line 247
    .line 248
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, Ls4;->p(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    monitor-exit v1

    .line 262
    :goto_7
    return-object p0

    .line 263
    :goto_8
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 264
    throw p0
.end method

.method public static t(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_8

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    move v3, v2

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ge v2, v4, :cond_8

    .line 30
    .line 31
    add-int/lit8 v4, v3, 0x1

    .line 32
    .line 33
    const/16 v5, 0x200

    .line 34
    .line 35
    if-ge v3, v5, :cond_8

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move v5, v1

    .line 39
    move-object v6, v3

    .line 40
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-ge v5, v7, :cond_5

    .line 45
    .line 46
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-nez v8, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {p0, v7, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-gez v8, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    add-int/2addr v9, v8

    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget v10, v6, Ly2;->b:I

    .line 76
    .line 77
    if-lt v8, v10, :cond_3

    .line 78
    .line 79
    if-ne v8, v10, :cond_4

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    iget-object v11, v6, Ly2;->a:Ljava/io/Serializable;

    .line 86
    .line 87
    check-cast v11, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-le v10, v11, :cond_4

    .line 94
    .line 95
    :cond_3
    new-instance v6, Ly2;

    .line 96
    .line 97
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v7, v6, Ly2;->a:Ljava/io/Serializable;

    .line 101
    .line 102
    iput v8, v6, Ly2;->b:I

    .line 103
    .line 104
    iput v9, v6, Ly2;->c:I

    .line 105
    .line 106
    :cond_4
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    if-nez v6, :cond_6

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-ge v2, p1, :cond_8

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    new-instance p1, Lr4;

    .line 122
    .line 123
    invoke-direct {p1, v3, v2, p0, v1}, Lr4;-><init>(Ljava/lang/String;IIZ)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_6
    iget v5, v6, Ly2;->c:I

    .line 131
    .line 132
    iget v7, v6, Ly2;->b:I

    .line 133
    .line 134
    if-le v7, v2, :cond_7

    .line 135
    .line 136
    new-instance v8, Lr4;

    .line 137
    .line 138
    invoke-direct {v8, v3, v2, v7, v1}, Lr4;-><init>(Ljava/lang/String;IIZ)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_7
    iget-object v2, v6, Ly2;->a:Ljava/io/Serializable;

    .line 145
    .line 146
    check-cast v2, Ljava/lang/String;

    .line 147
    .line 148
    new-instance v3, Lr4;

    .line 149
    .line 150
    const/4 v6, 0x1

    .line 151
    invoke-direct {v3, v2, v7, v5, v6}, Lr4;-><init>(Ljava/lang/String;IIZ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move v3, v4

    .line 158
    move v2, v5

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_8
    :goto_3
    return-object v0
.end method

.method public static u(Lf2;Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    const-string v0, "auto send task rejected delay="

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lf2;->c:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    iget-object v1, p0, Lf2;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/widget/EditText;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_1
    iget-object p2, p0, Lf2;->c:Ljava/io/Serializable;

    .line 26
    .line 27
    check-cast p2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    const-string p1, "input_missing"

    .line 34
    .line 35
    invoke-static {p0, p1}, Ls4;->f(Lf2;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1

    .line 42
    :cond_0
    :try_start_3
    invoke-virtual {v1, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    :try_start_4
    iget-object v1, p0, Lf2;->c:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 54
    .line 55
    .line 56
    :try_start_5
    monitor-exit p0

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p2}, Ls4;->p(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_1
    move-exception p2

    .line 74
    goto :goto_0

    .line 75
    :catchall_2
    move-exception p2

    .line 76
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 77
    :try_start_7
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 78
    :cond_1
    return-void

    .line 79
    :goto_0
    monitor-enter p0

    .line 80
    :try_start_8
    iget-object p3, p0, Lf2;->c:Ljava/io/Serializable;

    .line 81
    .line 82
    check-cast p3, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 85
    .line 86
    .line 87
    monitor-exit p0

    .line 88
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string p1, "auto send click schedule failed: "

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_3
    move-exception p1

    .line 107
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 108
    throw p1

    .line 109
    :catchall_4
    move-exception p1

    .line 110
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 111
    throw p1
.end method

.method public static v(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-string v0, "official send delegate method incompatible="

    .line 2
    .line 3
    const-string v1, "official send delegate hook installed method="

    .line 4
    .line 5
    const-string v2, "official send button click hook installed method="

    .line 6
    .line 7
    const-string v3, "official send button listener method incompatible="

    .line 8
    .line 9
    if-eqz p0, :cond_9

    .line 10
    .line 11
    sput-object p0, Ls4;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const-string v4, "official send button click hook failed: "

    .line 14
    .line 15
    sget-boolean v5, Ls4;->h:Z

    .line 16
    .line 17
    const/16 v6, 0x28

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    sget-object v5, Ls4;->a:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v5

    .line 26
    :try_start_0
    sget-boolean v8, Ls4;->h:Z

    .line 27
    .line 28
    if-eqz v8, :cond_1

    .line 29
    .line 30
    monitor-exit v5

    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_1
    sput-boolean v7, Ls4;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    :try_start_1
    const-string v8, "com.tencent.mobileqq.aio.input.sendmsg.b"

    .line 38
    .line 39
    invoke-static {p0, v8}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    if-nez v8, :cond_2

    .line 44
    .line 45
    const-string v2, "official send button listener missing class=com.tencent.mobileqq.aio.input.sendmsg.b"

    .line 46
    .line 47
    invoke-static {v2}, Ls4;->p(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception v2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_3
    const-string v9, "onClick"

    .line 55
    .line 56
    const-class v10, Landroid/view/View;

    .line 57
    .line 58
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    if-eq v9, v10, :cond_3

    .line 73
    .line 74
    invoke-static {v8}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, Ls4;->p(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    .line 84
    .line 85
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    :try_start_5
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Lm4;

    .line 91
    .line 92
    invoke-direct {v3, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v8, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 96
    .line 97
    .line 98
    sput-object v8, Ls4;->k:Ljava/lang/reflect/Method;

    .line 99
    .line 100
    invoke-static {v8}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v2}, Ls4;->p(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :goto_0
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2}, Ls4;->p(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 128
    :goto_2
    const-string v2, "official send delegate hook failed: "

    .line 129
    .line 130
    sget-boolean v3, Ls4;->g:Z

    .line 131
    .line 132
    if-eqz v3, :cond_4

    .line 133
    .line 134
    goto/16 :goto_8

    .line 135
    .line 136
    :cond_4
    sget-object v3, Ls4;->a:Ljava/lang/Object;

    .line 137
    .line 138
    monitor-enter v3

    .line 139
    :try_start_7
    sget-boolean v4, Ls4;->g:Z

    .line 140
    .line 141
    if-eqz v4, :cond_5

    .line 142
    .line 143
    monitor-exit v3

    .line 144
    goto :goto_8

    .line 145
    :catchall_2
    move-exception p0

    .line 146
    goto :goto_6

    .line 147
    :cond_5
    sput-boolean v7, Ls4;->g:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 148
    .line 149
    :try_start_8
    const-string v4, "com.tencent.mobileqq.aio.input.sendmsg.AIOSendMsgVMDelegate"

    .line 150
    .line 151
    invoke-static {p0, v4}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-nez p0, :cond_6

    .line 156
    .line 157
    const-string p0, "official send delegate missing class=com.tencent.mobileqq.aio.input.sendmsg.AIOSendMsgVMDelegate"

    .line 158
    .line 159
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 160
    .line 161
    .line 162
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 163
    goto :goto_8

    .line 164
    :catchall_3
    move-exception p0

    .line 165
    goto :goto_4

    .line 166
    :cond_6
    :try_start_a
    const-string v4, "E"

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    invoke-virtual {p0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    array-length v4, v4

    .line 178
    if-nez v4, :cond_8

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    if-eq v4, v5, :cond_7

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    invoke-virtual {p0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ln4;

    .line 193
    .line 194
    invoke-direct {v0, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p0, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 198
    .line 199
    .line 200
    sput-object p0, Ls4;->i:Ljava/lang/reflect/Method;

    .line 201
    .line 202
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    :goto_3
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 223
    .line 224
    .line 225
    :try_start_b
    monitor-exit v3

    .line 226
    goto :goto_8

    .line 227
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :catch_0
    :goto_5
    monitor-exit v3

    .line 243
    goto :goto_8

    .line 244
    :goto_6
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 245
    throw p0

    .line 246
    :goto_7
    :try_start_c
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 247
    throw p0

    .line 248
    :cond_9
    :goto_8
    return-void
.end method

.method public static w(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "restored input text snapshot len="

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {p1, v2, v1, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p2, "restore input text failed: "

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    return-void
.end method

.method public static y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V
    .locals 10

    .line 1
    if-eqz p0, :cond_16

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p1, v0, :cond_16

    .line 5
    .line 6
    iget-boolean v0, p3, Lp4;->c:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "[ELARIS_FAV:"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_16

    .line 28
    .line 29
    iput-boolean v1, p3, Lp4;->c:Z

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 33
    .line 34
    if-nez v0, :cond_16

    .line 35
    .line 36
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v0, :cond_16

    .line 39
    .line 40
    instance-of v0, p0, Landroid/content/Context;

    .line 41
    .line 42
    if-nez v0, :cond_16

    .line 43
    .line 44
    instance-of v0, p0, Landroid/view/View;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_2
    if-eqz p2, :cond_16

    .line 51
    .line 52
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "picelement"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    iget p0, p3, Lp4;->a:I

    .line 83
    .line 84
    add-int/2addr p0, v1

    .line 85
    iput p0, p3, Lp4;->a:I

    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    const-string v3, "textelement"

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    iget p0, p3, Lp4;->b:I

    .line 97
    .line 98
    add-int/2addr p0, v1

    .line 99
    iput p0, p3, Lp4;->b:I

    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    instance-of v3, p0, Ljava/util/Collection;

    .line 103
    .line 104
    const/16 v4, 0x50

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    check-cast p0, Ljava/util/Collection;

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_16

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    add-int/2addr v5, v1

    .line 126
    if-le v5, v4, :cond_7

    .line 127
    .line 128
    goto/16 :goto_6

    .line 129
    .line 130
    :cond_7
    add-int/lit8 v2, p1, 0x1

    .line 131
    .line 132
    invoke-static {v0, v2, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 133
    .line 134
    .line 135
    iget-boolean v0, p3, Lp4;->c:Z

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_8
    instance-of v3, p0, Ljava/util/Map;

    .line 142
    .line 143
    if-eqz v3, :cond_b

    .line 144
    .line 145
    check-cast p0, Ljava/util/Map;

    .line 146
    .line 147
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_16

    .line 160
    .line 161
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/util/Map$Entry;

    .line 166
    .line 167
    add-int/2addr v5, v1

    .line 168
    if-le v5, v4, :cond_a

    .line 169
    .line 170
    goto/16 :goto_6

    .line 171
    .line 172
    :cond_a
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    add-int/lit8 v3, p1, 0x1

    .line 177
    .line 178
    invoke-static {v2, v3, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0, v3, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v0, p3, Lp4;->c:Z

    .line 189
    .line 190
    if-eqz v0, :cond_9

    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_d

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_d

    .line 209
    .line 210
    :try_start_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    goto :goto_0

    .line 215
    :catchall_0
    move v0, v5

    .line 216
    :goto_0
    if-ge v5, v0, :cond_16

    .line 217
    .line 218
    if-ge v5, v4, :cond_16

    .line 219
    .line 220
    :try_start_1
    invoke-static {p0, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    add-int/lit8 v3, p1, 0x1

    .line 225
    .line 226
    invoke-static {v2, v3, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 227
    .line 228
    .line 229
    iget-boolean v2, p3, Lp4;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 230
    .line 231
    if-eqz v2, :cond_c

    .line 232
    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :catchall_1
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_d
    const-string v3, "picElement"

    .line 239
    .line 240
    invoke-static {p0, v3}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-eqz v3, :cond_e

    .line 245
    .line 246
    add-int/2addr p1, v1

    .line 247
    invoke-static {v3, p1, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_e
    const-string v3, "textElement"

    .line 252
    .line 253
    invoke-static {p0, v3}, Ls4;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-eqz v3, :cond_f

    .line 258
    .line 259
    add-int/2addr p1, v1

    .line 260
    invoke-static {v3, p1, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_f
    const/4 v3, 0x3

    .line 265
    if-ge p1, v3, :cond_16

    .line 266
    .line 267
    const-string v3, "java."

    .line 268
    .line 269
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-nez v3, :cond_16

    .line 274
    .line 275
    const-string v3, "android."

    .line 276
    .line 277
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-nez v3, :cond_16

    .line 282
    .line 283
    const-string v3, "kotlin."

    .line 284
    .line 285
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_10

    .line 290
    .line 291
    goto/16 :goto_6

    .line 292
    .line 293
    :cond_10
    move v2, v5

    .line 294
    :goto_1
    if-eqz v0, :cond_16

    .line 295
    .line 296
    const-class v3, Ljava/lang/Object;

    .line 297
    .line 298
    if-eq v0, v3, :cond_16

    .line 299
    .line 300
    const/16 v3, 0x30

    .line 301
    .line 302
    if-ge v2, v3, :cond_16

    .line 303
    .line 304
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 305
    .line 306
    .line 307
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 308
    goto :goto_2

    .line 309
    :catchall_2
    const/4 v4, 0x0

    .line 310
    :goto_2
    if-eqz v4, :cond_15

    .line 311
    .line 312
    move v6, v5

    .line 313
    :goto_3
    array-length v7, v4

    .line 314
    if-ge v6, v7, :cond_15

    .line 315
    .line 316
    if-ge v2, v3, :cond_15

    .line 317
    .line 318
    aget-object v7, v4, v6

    .line 319
    .line 320
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-nez v8, :cond_14

    .line 329
    .line 330
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-eqz v8, :cond_11

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_11
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    if-nez v8, :cond_12

    .line 346
    .line 347
    const-string v8, ""

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_12
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 351
    .line 352
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    :goto_4
    const-string v9, "pic"

    .line 357
    .line 358
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    if-nez v9, :cond_13

    .line 363
    .line 364
    const-string v9, "image"

    .line 365
    .line 366
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    if-nez v9, :cond_13

    .line 371
    .line 372
    const-string v9, "element"

    .line 373
    .line 374
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-nez v9, :cond_13

    .line 379
    .line 380
    const-string v9, "msg"

    .line 381
    .line 382
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-nez v8, :cond_13

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 390
    .line 391
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    add-int/lit8 v8, p1, 0x1

    .line 399
    .line 400
    invoke-static {v7, v8, p2, p3}, Ls4;->y(Ljava/lang/Object;ILjava/util/Set;Lp4;)V

    .line 401
    .line 402
    .line 403
    iget-boolean v7, p3, Lp4;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 404
    .line 405
    if-eqz v7, :cond_14

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :catchall_3
    :cond_14
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 409
    .line 410
    goto :goto_3

    .line 411
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    goto :goto_1

    .line 416
    :cond_16
    :goto_6
    return-void
.end method

.method public static z(Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v0, Li3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p1, v1}, Li3;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Li3;->run()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance p0, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method
