.class public final Lcj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lcj1;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcj1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcj1;->α:Lcj1;

    .line 7
    .line 8
    const-string v0, "/aweme/v1/aweme/favorite/"

    .line 9
    .line 10
    const-string v1, "/aweme/v1/filter/post/"

    .line 11
    .line 12
    const-string v2, "/aweme/v1/aweme/post/"

    .line 13
    .line 14
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcj1;->β:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcj1;->γ:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    return-void
.end method

.method public static final α(Lcj1;Ljava/lang/reflect/Method;)I
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v0, p0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const-class v4, Ljava/lang/String;

    .line 17
    .line 18
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    aget-object v5, p0, v2

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x3

    .line 38
    if-lt v3, p0, :cond_2

    .line 39
    .line 40
    const/16 p0, 0xc8

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move p0, v1

    .line 44
    :goto_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Class;

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_7

    .line 64
    .line 65
    array-length v2, v0

    .line 66
    move v3, v1

    .line 67
    :goto_2
    if-ge v3, v2, :cond_7

    .line 68
    .line 69
    aget-object v5, v0, v3

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    array-length v7, v6

    .line 79
    move v8, v1

    .line 80
    move v9, v8

    .line 81
    :goto_3
    if-ge v8, v7, :cond_4

    .line 82
    .line 83
    aget-object v10, v6, v8

    .line 84
    .line 85
    invoke-static {v10, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_3

    .line 90
    .line 91
    add-int/lit8 v9, v9, 0x1

    .line 92
    .line 93
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const/4 v6, 0x4

    .line 97
    if-lt v9, v6, :cond_6

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    array-length v6, v5

    .line 107
    move v7, v1

    .line 108
    :goto_4
    if-ge v7, v6, :cond_6

    .line 109
    .line 110
    aget-object v8, v5, v7

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    const-string v9, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 117
    .line 118
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_5

    .line 127
    .line 128
    add-int/lit16 p0, p0, 0x12c

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    :goto_5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    array-length v2, v0

    .line 149
    move v3, v1

    .line 150
    :goto_6
    if-ge v1, v2, :cond_9

    .line 151
    .line 152
    aget-object v4, v0, v1

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v5, v4}, Lcj1;->λ(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    add-int/lit8 v3, v3, 0x1

    .line 171
    .line 172
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_9
    const/4 p1, 0x2

    .line 176
    if-lt v3, p1, :cond_a

    .line 177
    .line 178
    add-int/lit8 p0, p0, 0x64

    .line 179
    .line 180
    :cond_a
    return p0
.end method

.method public static β(IILjava/lang/Object;Ljava/lang/String;Lf8;)Lbj1;
    .locals 8

    .line 1
    add-int/lit8 v2, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 p1, 0x0

    .line 12
    if-eqz p4, :cond_1

    .line 13
    .line 14
    iget-object v0, p4, Lf8;->θ:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_6

    .line 21
    :cond_1
    :goto_1
    const-string v0, "getAid"

    .line 22
    .line 23
    invoke-static {p2, v0}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v1, v0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object v0, p1

    .line 35
    :goto_2
    const-string v1, "getAwemeId"

    .line 36
    .line 37
    invoke-static {p2, v1}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    instance-of v4, v1, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-object v1, p1

    .line 49
    :goto_3
    const-string v4, "aid"

    .line 50
    .line 51
    invoke-static {p2, v4}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    instance-of v5, v4, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move-object v4, p1

    .line 63
    :goto_4
    const-string v5, "awemeId"

    .line 64
    .line 65
    invoke-static {p2, v5}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    instance-of v6, v5, Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v6, :cond_5

    .line 72
    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_5
    move-object v5, p1

    .line 77
    :goto_5
    filled-new-array {v0, v1, v4, v5}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lcj1;->η([Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    move-object v5, p1

    .line 93
    :goto_6
    if-eqz p4, :cond_9

    .line 94
    .line 95
    iget-object v0, p4, Lf8;->β:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_9

    .line 98
    .line 99
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_7

    .line 104
    .line 105
    const-string v1, "\u65e0\u63cf\u8ff0"

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_7
    move-object v0, p1

    .line 115
    :goto_7
    if-nez v0, :cond_8

    .line 116
    .line 117
    goto :goto_9

    .line 118
    :cond_8
    :goto_8
    move-object v6, v0

    .line 119
    goto :goto_b

    .line 120
    :cond_9
    :goto_9
    const-string v0, "getDesc"

    .line 121
    .line 122
    invoke-static {p2, v0}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    instance-of v1, v0, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v1, :cond_a

    .line 129
    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    goto :goto_a

    .line 133
    :cond_a
    move-object v0, p1

    .line 134
    :goto_a
    if-nez v0, :cond_8

    .line 135
    .line 136
    const-string v0, "desc"

    .line 137
    .line 138
    invoke-static {p2, v0}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    instance-of v1, v0, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_b
    move-object v6, p1

    .line 150
    :goto_b
    if-eqz p4, :cond_d

    .line 151
    .line 152
    iget-object p4, p4, Lf8;->ζ:Lh8;

    .line 153
    .line 154
    if-eqz p4, :cond_d

    .line 155
    .line 156
    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    if-nez p4, :cond_c

    .line 161
    .line 162
    goto :goto_c

    .line 163
    :cond_c
    move-object v7, p4

    .line 164
    goto :goto_d

    .line 165
    :cond_d
    :goto_c
    const-string p4, "getAwemeType"

    .line 166
    .line 167
    const-string v0, "awemeType"

    .line 168
    .line 169
    invoke-static {p2, p4, v0}, Lcj1;->υ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    if-eqz p2, :cond_e

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    :cond_e
    move-object v7, p1

    .line 180
    :goto_d
    new-instance v0, Lbj1;

    .line 181
    .line 182
    move v1, p0

    .line 183
    move-object v4, p3

    .line 184
    invoke-direct/range {v0 .. v7}, Lbj1;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v0
.end method

.method public static γ(Ljava/lang/Class;Ljava/lang/Class;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Ljava/lang/Object;
    .locals 30

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v14

    .line 7
    const-class v24, Ljava/lang/String;

    .line 8
    .line 9
    const-class v25, Ljava/lang/String;

    .line 10
    .line 11
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const-class v16, Ljava/lang/String;

    .line 14
    .line 15
    const-class v17, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v18, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v21, Ljava/lang/String;

    .line 20
    .line 21
    const-class v22, Ljava/lang/String;

    .line 22
    .line 23
    sget-object v23, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    move-object/from16 v19, v15

    .line 26
    .line 27
    move-object/from16 v26, v18

    .line 28
    .line 29
    move-object/from16 v27, v18

    .line 30
    .line 31
    move-object/from16 v28, v18

    .line 32
    .line 33
    move-object/from16 v29, v15

    .line 34
    .line 35
    move-object/from16 v20, p1

    .line 36
    .line 37
    filled-new-array/range {v15 .. v29}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object/from16 v1, p0

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-wide/16 v5, 0x0

    .line 66
    .line 67
    cmp-long v7, p3, v5

    .line 68
    .line 69
    if-gez v7, :cond_0

    .line 70
    .line 71
    move-wide v7, v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move-wide/from16 v7, p3

    .line 74
    .line 75
    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const/16 v8, 0x32

    .line 80
    .line 81
    const/16 v9, 0x14

    .line 82
    .line 83
    invoke-static {v9, v1, v8}, Lj81;->μ(III)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    move-object v5, v7

    .line 99
    const/4 v7, 0x0

    .line 100
    move-object v6, v8

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v11, 0x0

    .line 104
    move-object v15, v14

    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    filled-new-array/range {v2 .. v16}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    array-length v3, v0

    .line 130
    move/from16 v4, v17

    .line 131
    .line 132
    :goto_1
    if-ge v4, v3, :cond_2

    .line 133
    .line 134
    aget-object v5, v0, v4

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 141
    .line 142
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_1

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-nez v6, :cond_1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    const/4 v5, 0x0

    .line 163
    :goto_2
    if-nez v5, :cond_3

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_3
    :try_start_0
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 167
    .line 168
    .line 169
    move/from16 v0, p5

    .line 170
    .line 171
    invoke-virtual {v5, v2, v0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 178
    .line 179
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catchall_0
    move-exception v0

    .line 183
    new-instance v1, Leo1;

    .line 184
    .line 185
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v0, v1

    .line 189
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_4

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 199
    .line 200
    :cond_4
    :goto_4
    return-object v2
.end method

.method public static δ(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static ε(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    const-string v0, "getItemsP"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getItems"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "items"

    .line 14
    .line 15
    invoke-static {p0, v2}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "preloadAwemes"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    instance-of v3, v2, Ljava/lang/Iterable;

    .line 62
    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    check-cast v2, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v2}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    instance-of v3, v2, [Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    check-cast v2, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v2}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    sget-object v2, Ljz;->ε:Ljz;

    .line 84
    .line 85
    :goto_1
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 146
    .line 147
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-nez v2, :cond_6

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v3, "Aweme"

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_5

    .line 173
    .line 174
    :cond_6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    return-object v0
.end method

.method public static ζ(Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static varargs η([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const-string v2, ""

    .line 4
    .line 5
    if-ge v1, v0, :cond_3

    .line 6
    .line 7
    aget-object v3, p0, v1

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v3, 0x0

    .line 21
    :goto_1
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    move-object v2, v3

    .line 25
    :goto_2
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    const-string v3, "null"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-object v2
.end method

.method public static θ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    const-string v1, "http"

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-static {p0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    return-object v0
.end method

.method public static ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :goto_0
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_1
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    array-length v6, v6

    .line 47
    if-nez v6, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v5, v0

    .line 56
    :goto_2
    if-eqz v5, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move-object p1, v0

    .line 73
    goto :goto_4

    .line 74
    :goto_3
    new-instance p1, Leo1;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_4
    if-eqz p1, :cond_4

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_4
    move-object v0, p1

    .line 83
    :goto_5
    return-object v0
.end method

.method public static κ(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v1, v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 33
    .line 34
    return-object v3

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :goto_1
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    sget v2, Lcom/example/dyhelper/MainHook;->β:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_2
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    move-object v1, v3

    .line 56
    :goto_3
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    sget v2, Lcom/example/dyhelper/MainHook;->β:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    if-nez v1, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    throw v1
.end method

.method public static λ(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    array-length v0, v0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    aget-object v0, v0, v1

    .line 25
    .line 26
    const-class v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    return v2

    .line 45
    :cond_0
    return v1
.end method

.method public static μ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ge v3, v4, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v0, v1

    .line 40
    :goto_1
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "-1"

    .line 55
    .line 56
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v4, "true"

    .line 67
    .line 68
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, "false"

    .line 79
    .line 80
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/16 v4, 0x8

    .line 95
    .line 96
    if-lt v3, v4, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move v3, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    :goto_2
    move v3, v1

    .line 102
    :goto_3
    if-eqz v0, :cond_5

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_5

    .line 125
    .line 126
    :cond_4
    return v1

    .line 127
    :cond_5
    return v2
.end method

.method public static ο(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p4, v0, :cond_0

    .line 3
    .line 4
    :goto_0
    move v7, v0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x4

    .line 7
    goto :goto_0

    .line 8
    :goto_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;

    .line 9
    .line 10
    const-string v8, "locate_host"

    .line 11
    .line 12
    const-string v9, "locate"

    .line 13
    .line 14
    const/16 v4, 0x14

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move-object v3, p1

    .line 18
    move-wide v5, p2

    .line 19
    invoke-virtual/range {v1 .. v9}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->loadProfileAwemeList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getRawResponse()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, Lcj1;->ε(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_2
    if-lez p1, :cond_2

    .line 42
    .line 43
    sget p1, Lcom/example/dyhelper/MainHook;->β:I

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 47
    .line 48
    const-string v8, "profile_tab"

    .line 49
    .line 50
    const-string v9, "public"

    .line 51
    .line 52
    const/16 v4, 0x14

    .line 53
    .line 54
    invoke-virtual/range {v1 .. v9}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->loadProfileAwemeList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;IJILjava/lang/String;Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static π(Ljava/util/ArrayList;ILjava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_a

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-ltz v1, :cond_9

    .line 25
    .line 26
    :try_start_0
    sget-object v5, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-static {v2}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 29
    .line 30
    .line 31
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v5

    .line 34
    new-instance v6, Leo1;

    .line 35
    .line 36
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v5, v6

    .line 40
    :goto_1
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    :cond_0
    const-string v6, "parse_failed:"

    .line 61
    .line 62
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {p1, v1, v2, v6, v4}, Lcj1;->β(IILjava/lang/Object;Ljava/lang/String;Lf8;)Lbj1;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    instance-of v6, v5, Leo1;

    .line 74
    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    move-object v5, v4

    .line 78
    :cond_2
    check-cast v5, Lf8;

    .line 79
    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_3
    iget-object v6, v5, Lf8;->ζ:Lh8;

    .line 84
    .line 85
    sget-object v7, Lh8;->ι:Lh8;

    .line 86
    .line 87
    if-ne v6, v7, :cond_4

    .line 88
    .line 89
    const-string v6, "unknown_type"

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    iget-object v6, v5, Lf8;->θ:Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move-object v6, v4

    .line 104
    goto :goto_3

    .line 105
    :cond_6
    :goto_2
    const-string v6, "missing_aweme_id"

    .line 106
    .line 107
    :goto_3
    if-eqz v6, :cond_7

    .line 108
    .line 109
    invoke-static {p1, v1, v2, v6, v5}, Lcj1;->β(IILjava/lang/Object;Ljava/lang/String;Lf8;)Lbj1;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    move-object v4, v5

    .line 118
    :goto_4
    if-eqz v4, :cond_8

    .line 119
    .line 120
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_8
    move v1, v3

    .line 124
    goto :goto_0

    .line 125
    :cond_9
    invoke-static {}, Lyh;->х()V

    .line 126
    .line 127
    .line 128
    throw v4

    .line 129
    :cond_a
    return-object v0
.end method

.method public static ρ(Lf8;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lf8;->ε:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lf8;->δ:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0}, Lcj1;->ζ(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lf8;->ε()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lf8;->Μ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lf8;->Λ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lf8;->Ο:Ljava/util/List;

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    sget-object v0, Ljz;->ε:Ljz;

    .line 44
    .line 45
    :cond_0
    new-instance v1, Lf7;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lli1;

    .line 52
    .line 53
    invoke-direct {v0, v2}, Lli1;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/String;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    iget-object p0, p0, Lf8;->Η:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {p0}, Lcj1;->ζ(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_1
    return-object v0
.end method

.method public static σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :goto_0
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_1
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    move-object v5, v0

    .line 46
    :goto_2
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object p1, v0

    .line 63
    goto :goto_4

    .line 64
    :goto_3
    new-instance p1, Leo1;

    .line 65
    .line 66
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :goto_4
    if-eqz p1, :cond_4

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    move-object v0, p1

    .line 73
    :goto_5
    return-object v0
.end method

.method public static τ(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const-string v0, "isHasMore"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of p0, v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "getHasMore"

    .line 25
    .line 26
    const-string v1, "hasMore"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lcj1;->υ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-wide/16 v2, 0x1

    .line 39
    .line 40
    cmp-long p0, v0, v2

    .line 41
    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_2
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public static υ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcj1;->ι(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p2}, Lcj1;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    instance-of p0, p1, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    instance-of p0, p1, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    const/16 p0, 0xa

    .line 33
    .line 34
    invoke-static {p1, p0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static χ()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 23

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getLastProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v0}, Lcj1;->μ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    sget-object v0, Lb10;->γ:Ljava/lang/String;

    .line 24
    .line 25
    sget-object v2, Lb10;->ε:Ljava/lang/String;

    .line 26
    .line 27
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcj1;->η([Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v0, Lb10;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    filled-new-array {v0}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcj1;->η([Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 59
    .line 60
    const v21, 0xfff8

    .line 61
    .line 62
    .line 63
    const/16 v22, 0x0

    .line 64
    .line 65
    const-string v5, ""

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const-wide/16 v10, 0x0

    .line 72
    .line 73
    const-wide/16 v12, 0x0

    .line 74
    .line 75
    const/4 v14, 0x0

    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x0

    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const/16 v19, 0x0

    .line 84
    .line 85
    const/16 v20, 0x0

    .line 86
    .line 87
    invoke-direct/range {v2 .. v22}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2}, Lcj1;->μ(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    return-object v2

    .line 97
    :cond_3
    :goto_1
    return-object v1
.end method

.method public static ψ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lli1;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-direct {v2, v3}, Lli1;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v3, 0x1e

    .line 48
    .line 49
    const-string v4, ","

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "):"

    .line 57
    .line 58
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method


# virtual methods
.method public final ν(Landroid/app/Activity;)Ljava/util/List;
    .locals 36

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :cond_0
    move-object v3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v0, "host classLoader is null"

    .line 27
    .line 28
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :goto_0
    invoke-static {}, Lcj1;->χ()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    if-eqz v6, :cond_35

    .line 37
    .line 38
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 39
    .line 40
    const-string v0, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 41
    .line 42
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v3, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_34

    .line 51
    .line 52
    move-object/from16 v4, p0

    .line 53
    .line 54
    invoke-virtual {v4, v5, v3}, Lcj1;->φ(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    sget-object v14, Lh8;->ι:Lh8;

    .line 63
    .line 64
    const-string v4, " \u9875\u5b8c\u6210 \u00b7 \u5df2\u83b7\u53d6 "

    .line 65
    .line 66
    const/4 v10, -0x1

    .line 67
    const-string v11, " \u9875 \u00b7 \u5df2\u83b7\u53d6 "

    .line 68
    .line 69
    const/16 v12, 0x1f

    .line 70
    .line 71
    const-wide/high16 v16, -0x8000000000000000L

    .line 72
    .line 73
    const-string v13, "\u4e3b\u52a8\u83b7\u53d6\u4e3b\u9875\u4f5c\u54c1"

    .line 74
    .line 75
    move-object/from16 v18, v2

    .line 76
    .line 77
    const-string v2, "\u7b2c "

    .line 78
    .line 79
    const-string v15, " \u4e2a"

    .line 80
    .line 81
    const-wide/16 v19, 0x0

    .line 82
    .line 83
    const/16 v21, 0x0

    .line 84
    .line 85
    if-eqz v0, :cond_1c

    .line 86
    .line 87
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 88
    .line 89
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    move-wide/from16 v8, v19

    .line 95
    .line 96
    move/from16 v25, v21

    .line 97
    .line 98
    move/from16 v26, v25

    .line 99
    .line 100
    const/4 v7, 0x1

    .line 101
    :goto_1
    if-ge v7, v12, :cond_2

    .line 102
    .line 103
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v2, v7, v11, v0, v15}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v10, v1, v13, v0}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v3, v6, v8, v9, v7}, Lcj1;->ο(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 117
    .line 118
    .line 119
    move-result-object v27

    .line 120
    if-nez v27, :cond_3

    .line 121
    .line 122
    :cond_2
    :goto_2
    move-object/from16 v22, v5

    .line 123
    .line 124
    goto/16 :goto_11

    .line 125
    .line 126
    :cond_3
    invoke-virtual/range {v27 .. v27}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getRawResponse()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez v0, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    invoke-static {v0}, Lcj1;->ε(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v10, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v28

    .line 146
    :goto_3
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :try_start_0
    sget-object v29, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 157
    .line 158
    invoke-static {v0}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 159
    .line 160
    .line 161
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    goto :goto_4

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    new-instance v12, Leo1;

    .line 165
    .line 166
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    move-object v0, v12

    .line 170
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    if-eqz v12, :cond_5

    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    sget v12, Lcom/example/dyhelper/MainHook;->β:I

    .line 180
    .line 181
    :cond_5
    instance-of v12, v0, Leo1;

    .line 182
    .line 183
    if-eqz v12, :cond_6

    .line 184
    .line 185
    move-object/from16 v0, v18

    .line 186
    .line 187
    :cond_6
    check-cast v0, Lf8;

    .line 188
    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_7
    const/16 v12, 0x1f

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-eqz v12, :cond_b

    .line 211
    .line 212
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    move-object/from16 v28, v3

    .line 217
    .line 218
    move-object v3, v12

    .line 219
    check-cast v3, Lf8;

    .line 220
    .line 221
    move-object/from16 v30, v6

    .line 222
    .line 223
    iget-object v6, v3, Lf8;->ζ:Lh8;

    .line 224
    .line 225
    if-eq v6, v14, :cond_a

    .line 226
    .line 227
    iget-object v3, v3, Lf8;->θ:Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v3, :cond_a

    .line 230
    .line 231
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_9

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_9
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    :cond_a
    :goto_6
    move-object/from16 v3, v28

    .line 242
    .line 243
    move-object/from16 v6, v30

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_b
    move-object/from16 v28, v3

    .line 247
    .line 248
    move-object/from16 v30, v6

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    :cond_c
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_e

    .line 259
    .line 260
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    check-cast v6, Lf8;

    .line 265
    .line 266
    iget-object v10, v6, Lf8;->θ:Ljava/lang/String;

    .line 267
    .line 268
    if-eqz v10, :cond_c

    .line 269
    .line 270
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-eqz v12, :cond_d

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_d
    invoke-interface {v5, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-nez v6, :cond_f

    .line 290
    .line 291
    move-object/from16 v6, v18

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    check-cast v6, Lf8;

    .line 299
    .line 300
    iget v6, v6, Lf8;->ξ:I

    .line 301
    .line 302
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    :cond_10
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    if-eqz v10, :cond_11

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    check-cast v10, Lf8;

    .line 317
    .line 318
    iget v10, v10, Lf8;->ξ:I

    .line 319
    .line 320
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    invoke-virtual {v6, v10}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    if-gez v12, :cond_10

    .line 329
    .line 330
    move-object v6, v10

    .line 331
    goto :goto_8

    .line 332
    :cond_11
    :goto_9
    if-eqz v6, :cond_12

    .line 333
    .line 334
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    :goto_a
    move/from16 v6, v25

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_12
    move/from16 v3, v21

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :goto_b
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-virtual/range {v27 .. v27}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getMaxCursor()J

    .line 349
    .line 350
    .line 351
    move-result-wide v31

    .line 352
    cmp-long v6, v31, v19

    .line 353
    .line 354
    if-lez v6, :cond_13

    .line 355
    .line 356
    cmp-long v6, v31, v16

    .line 357
    .line 358
    if-eqz v6, :cond_13

    .line 359
    .line 360
    cmp-long v6, v31, v8

    .line 361
    .line 362
    if-eqz v6, :cond_13

    .line 363
    .line 364
    const/4 v6, 0x1

    .line 365
    goto :goto_c

    .line 366
    :cond_13
    move/from16 v6, v21

    .line 367
    .line 368
    :goto_c
    invoke-virtual/range {v27 .. v27}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    if-eqz v10, :cond_14

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    if-eqz v10, :cond_15

    .line 379
    .line 380
    :cond_14
    move/from16 v10, v26

    .line 381
    .line 382
    const/4 v12, 0x3

    .line 383
    goto :goto_d

    .line 384
    :cond_15
    move/from16 v10, v26

    .line 385
    .line 386
    goto :goto_e

    .line 387
    :goto_d
    if-ge v10, v12, :cond_17

    .line 388
    .line 389
    if-eqz v6, :cond_17

    .line 390
    .line 391
    if-lez v3, :cond_16

    .line 392
    .line 393
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 394
    .line 395
    .line 396
    move-result v12

    .line 397
    if-le v3, v12, :cond_17

    .line 398
    .line 399
    :cond_16
    const/4 v12, 0x1

    .line 400
    goto :goto_f

    .line 401
    :cond_17
    :goto_e
    move/from16 v12, v21

    .line 402
    .line 403
    :goto_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v27 .. v27}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 410
    .line 411
    .line 412
    sget v16, Lcom/example/dyhelper/MainHook;->β:I

    .line 413
    .line 414
    mul-int/lit8 v16, v7, 0x64

    .line 415
    .line 416
    move-object/from16 v17, v0

    .line 417
    .line 418
    div-int/lit8 v0, v16, 0x1e

    .line 419
    .line 420
    move/from16 v16, v3

    .line 421
    .line 422
    move-object/from16 v22, v5

    .line 423
    .line 424
    const/16 v3, 0x63

    .line 425
    .line 426
    const/4 v5, 0x1

    .line 427
    invoke-static {v0, v5, v3}, Lj81;->μ(III)I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    sget-object v24, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 432
    .line 433
    invoke-virtual/range {v22 .. v22}, Ljava/util/AbstractMap;->size()I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    invoke-static {v2, v7, v4, v3, v15}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-static {v0, v1, v13, v3}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v22 .. v22}, Ljava/util/AbstractMap;->size()I

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    const/16 v3, 0x270f

    .line 449
    .line 450
    if-ge v0, v3, :cond_1b

    .line 451
    .line 452
    invoke-virtual/range {v27 .. v27}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-nez v0, :cond_18

    .line 457
    .line 458
    if-eqz v12, :cond_1b

    .line 459
    .line 460
    :cond_18
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_19

    .line 465
    .line 466
    if-eqz v12, :cond_1b

    .line 467
    .line 468
    :cond_19
    if-eqz v6, :cond_1b

    .line 469
    .line 470
    if-eqz v12, :cond_1a

    .line 471
    .line 472
    add-int/lit8 v26, v10, 0x1

    .line 473
    .line 474
    invoke-virtual/range {v22 .. v22}, Ljava/util/AbstractMap;->size()I

    .line 475
    .line 476
    .line 477
    goto :goto_10

    .line 478
    :cond_1a
    move/from16 v26, v10

    .line 479
    .line 480
    :goto_10
    const-wide/16 v33, 0x78

    .line 481
    .line 482
    :try_start_1
    invoke-static/range {v33 .. v34}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 483
    .line 484
    .line 485
    :catchall_1
    add-int/lit8 v7, v7, 0x1

    .line 486
    .line 487
    move/from16 v25, v16

    .line 488
    .line 489
    move-object/from16 v5, v22

    .line 490
    .line 491
    move-object/from16 v3, v28

    .line 492
    .line 493
    move-object/from16 v6, v30

    .line 494
    .line 495
    const/4 v10, -0x1

    .line 496
    const/16 v12, 0x1f

    .line 497
    .line 498
    move-wide/from16 v16, v8

    .line 499
    .line 500
    move-wide/from16 v8, v31

    .line 501
    .line 502
    goto/16 :goto_1

    .line 503
    .line 504
    :cond_1b
    :goto_11
    invoke-virtual/range {v22 .. v22}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    check-cast v0, Ljava/lang/Iterable;

    .line 512
    .line 513
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 518
    .line 519
    .line 520
    sget v1, Lcom/example/dyhelper/MainHook;->β:I

    .line 521
    .line 522
    return-object v0

    .line 523
    :cond_1c
    move-object/from16 v30, v6

    .line 524
    .line 525
    const/4 v3, 0x1

    .line 526
    invoke-static {v7}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    check-cast v0, Ljava/lang/reflect/Method;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    aget-object v6, v0, v21

    .line 537
    .line 538
    invoke-static {v7}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    check-cast v0, Ljava/lang/reflect/Method;

    .line 543
    .line 544
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    new-instance v12, Lli1;

    .line 555
    .line 556
    const/4 v8, 0x3

    .line 557
    invoke-direct {v12, v8}, Lli1;-><init>(I)V

    .line 558
    .line 559
    .line 560
    move-object v9, v13

    .line 561
    const/16 v13, 0x1f

    .line 562
    .line 563
    move/from16 v23, v8

    .line 564
    .line 565
    const/4 v8, 0x0

    .line 566
    move-object v10, v9

    .line 567
    const/4 v9, 0x0

    .line 568
    move-object/from16 v22, v10

    .line 569
    .line 570
    const/4 v10, 0x0

    .line 571
    move-object/from16 v25, v11

    .line 572
    .line 573
    const/4 v11, 0x0

    .line 574
    move-object/from16 v35, v22

    .line 575
    .line 576
    move-object/from16 v3, v25

    .line 577
    .line 578
    move-object/from16 v22, v14

    .line 579
    .line 580
    const/16 v14, 0x1f

    .line 581
    .line 582
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-object v10, v7

    .line 586
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 587
    .line 588
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 589
    .line 590
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 591
    .line 592
    .line 593
    move-wide/from16 v7, v19

    .line 594
    .line 595
    move/from16 v9, v21

    .line 596
    .line 597
    move v13, v9

    .line 598
    const/4 v12, 0x1

    .line 599
    :goto_12
    if-ge v12, v14, :cond_33

    .line 600
    .line 601
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 602
    .line 603
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    invoke-static {v2, v12, v3, v0, v15}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    move-object/from16 v25, v3

    .line 612
    .line 613
    move-object/from16 v3, v35

    .line 614
    .line 615
    const/4 v14, -0x1

    .line 616
    invoke-static {v14, v1, v3, v0}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    const/4 v14, 0x1

    .line 620
    if-ne v12, v14, :cond_1d

    .line 621
    .line 622
    move v14, v9

    .line 623
    const/4 v9, 0x1

    .line 624
    :goto_13
    move-object v1, v4

    .line 625
    move-object v4, v6

    .line 626
    move-object/from16 v6, v30

    .line 627
    .line 628
    goto :goto_14

    .line 629
    :cond_1d
    const/4 v0, 0x4

    .line 630
    move v14, v9

    .line 631
    move v9, v0

    .line 632
    goto :goto_13

    .line 633
    :goto_14
    invoke-static/range {v4 .. v9}, Lcj1;->γ(Ljava/lang/Class;Ljava/lang/Class;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    move-object/from16 v30, v6

    .line 638
    .line 639
    invoke-virtual/range {v30 .. v30}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v30 .. v30}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    sget v6, Lcom/example/dyhelper/MainHook;->β:I

    .line 646
    .line 647
    invoke-static {v0, v10}, Lcj1;->κ(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v6

    .line 651
    if-nez v6, :cond_1e

    .line 652
    .line 653
    goto/16 :goto_20

    .line 654
    .line 655
    :cond_1e
    invoke-static {v6}, Lcj1;->ε(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    new-instance v9, Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v23

    .line 668
    :goto_15
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    if-eqz v0, :cond_21

    .line 673
    .line 674
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    :try_start_2
    sget-object v26, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 679
    .line 680
    invoke-static {v0}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 681
    .line 682
    .line 683
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 684
    move-object/from16 v26, v4

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :catchall_2
    move-exception v0

    .line 688
    move-object/from16 v26, v4

    .line 689
    .line 690
    new-instance v4, Leo1;

    .line 691
    .line 692
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 693
    .line 694
    .line 695
    move-object v0, v4

    .line 696
    :goto_16
    instance-of v4, v0, Leo1;

    .line 697
    .line 698
    if-eqz v4, :cond_1f

    .line 699
    .line 700
    move-object/from16 v0, v18

    .line 701
    .line 702
    :cond_1f
    check-cast v0, Lf8;

    .line 703
    .line 704
    if-eqz v0, :cond_20

    .line 705
    .line 706
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    :cond_20
    move-object/from16 v4, v26

    .line 710
    .line 711
    goto :goto_15

    .line 712
    :cond_21
    move-object/from16 v26, v4

    .line 713
    .line 714
    new-instance v0, Ljava/util/ArrayList;

    .line 715
    .line 716
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 724
    .line 725
    .line 726
    move-result v9

    .line 727
    if-eqz v9, :cond_24

    .line 728
    .line 729
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v9

    .line 733
    move-object/from16 v23, v4

    .line 734
    .line 735
    move-object v4, v9

    .line 736
    check-cast v4, Lf8;

    .line 737
    .line 738
    move-object/from16 v27, v5

    .line 739
    .line 740
    iget-object v5, v4, Lf8;->ζ:Lh8;

    .line 741
    .line 742
    move-wide/from16 v31, v7

    .line 743
    .line 744
    move-object/from16 v7, v22

    .line 745
    .line 746
    if-eq v5, v7, :cond_23

    .line 747
    .line 748
    iget-object v4, v4, Lf8;->θ:Ljava/lang/String;

    .line 749
    .line 750
    if-eqz v4, :cond_23

    .line 751
    .line 752
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    if-eqz v4, :cond_22

    .line 757
    .line 758
    goto :goto_18

    .line 759
    :cond_22
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    :cond_23
    :goto_18
    move-object/from16 v22, v7

    .line 763
    .line 764
    move-object/from16 v4, v23

    .line 765
    .line 766
    move-object/from16 v5, v27

    .line 767
    .line 768
    move-wide/from16 v7, v31

    .line 769
    .line 770
    goto :goto_17

    .line 771
    :cond_24
    move-object/from16 v27, v5

    .line 772
    .line 773
    move-wide/from16 v31, v7

    .line 774
    .line 775
    move-object/from16 v7, v22

    .line 776
    .line 777
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    :cond_25
    :goto_19
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    if-eqz v5, :cond_27

    .line 786
    .line 787
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    check-cast v5, Lf8;

    .line 792
    .line 793
    iget-object v8, v5, Lf8;->θ:Ljava/lang/String;

    .line 794
    .line 795
    if-eqz v8, :cond_25

    .line 796
    .line 797
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 798
    .line 799
    .line 800
    move-result v9

    .line 801
    if-eqz v9, :cond_26

    .line 802
    .line 803
    goto :goto_19

    .line 804
    :cond_26
    invoke-interface {v11, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    goto :goto_19

    .line 808
    :cond_27
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    if-nez v5, :cond_28

    .line 817
    .line 818
    move-object/from16 v5, v18

    .line 819
    .line 820
    goto :goto_1b

    .line 821
    :cond_28
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    check-cast v5, Lf8;

    .line 826
    .line 827
    iget v5, v5, Lf8;->ξ:I

    .line 828
    .line 829
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    :cond_29
    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v8

    .line 837
    if-eqz v8, :cond_2a

    .line 838
    .line 839
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    check-cast v8, Lf8;

    .line 844
    .line 845
    iget v8, v8, Lf8;->ξ:I

    .line 846
    .line 847
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    invoke-virtual {v5, v8}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 852
    .line 853
    .line 854
    move-result v9

    .line 855
    if-gez v9, :cond_29

    .line 856
    .line 857
    move-object v5, v8

    .line 858
    goto :goto_1a

    .line 859
    :cond_2a
    :goto_1b
    if-eqz v5, :cond_2b

    .line 860
    .line 861
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 862
    .line 863
    .line 864
    move-result v4

    .line 865
    goto :goto_1c

    .line 866
    :cond_2b
    move/from16 v4, v21

    .line 867
    .line 868
    :goto_1c
    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    .line 869
    .line 870
    .line 871
    move-result v13

    .line 872
    invoke-static {v6}, Lcj1;->τ(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v4

    .line 876
    const-string v5, "getMaxCursor"

    .line 877
    .line 878
    const-string v8, "maxCursor"

    .line 879
    .line 880
    invoke-static {v6, v5, v8}, Lcj1;->υ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 881
    .line 882
    .line 883
    move-result-object v5

    .line 884
    if-eqz v5, :cond_2c

    .line 885
    .line 886
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 887
    .line 888
    .line 889
    move-result-wide v5

    .line 890
    goto :goto_1d

    .line 891
    :cond_2c
    move-wide/from16 v5, v19

    .line 892
    .line 893
    :goto_1d
    cmp-long v8, v5, v19

    .line 894
    .line 895
    if-lez v8, :cond_2d

    .line 896
    .line 897
    cmp-long v8, v5, v16

    .line 898
    .line 899
    if-eqz v8, :cond_2d

    .line 900
    .line 901
    cmp-long v8, v5, v31

    .line 902
    .line 903
    if-eqz v8, :cond_2d

    .line 904
    .line 905
    const/4 v8, 0x1

    .line 906
    goto :goto_1e

    .line 907
    :cond_2d
    move/from16 v8, v21

    .line 908
    .line 909
    :goto_1e
    if-nez v4, :cond_2e

    .line 910
    .line 911
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 912
    .line 913
    .line 914
    move-result v9

    .line 915
    if-le v13, v9, :cond_2e

    .line 916
    .line 917
    const/4 v9, 0x3

    .line 918
    if-ge v14, v9, :cond_2f

    .line 919
    .line 920
    if-eqz v8, :cond_2f

    .line 921
    .line 922
    const/16 v16, 0x1

    .line 923
    .line 924
    goto :goto_1f

    .line 925
    :cond_2e
    const/4 v9, 0x3

    .line 926
    :cond_2f
    move/from16 v16, v21

    .line 927
    .line 928
    :goto_1f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 929
    .line 930
    .line 931
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 932
    .line 933
    .line 934
    sget v17, Lcom/example/dyhelper/MainHook;->β:I

    .line 935
    .line 936
    mul-int/lit8 v17, v12, 0x64

    .line 937
    .line 938
    div-int/lit8 v9, v17, 0x1e

    .line 939
    .line 940
    move/from16 v17, v4

    .line 941
    .line 942
    move-wide/from16 v33, v5

    .line 943
    .line 944
    const/16 v4, 0x63

    .line 945
    .line 946
    const/4 v5, 0x1

    .line 947
    invoke-static {v9, v5, v4}, Lj81;->μ(III)I

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    sget-object v9, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 952
    .line 953
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 954
    .line 955
    .line 956
    move-result v9

    .line 957
    invoke-static {v2, v12, v1, v9, v15}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v9

    .line 961
    move-object/from16 v4, p1

    .line 962
    .line 963
    invoke-static {v6, v4, v3, v9}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 967
    .line 968
    .line 969
    move-result v6

    .line 970
    const/16 v9, 0x270f

    .line 971
    .line 972
    if-ge v6, v9, :cond_33

    .line 973
    .line 974
    if-nez v17, :cond_30

    .line 975
    .line 976
    if-eqz v16, :cond_33

    .line 977
    .line 978
    :cond_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    if-eqz v0, :cond_31

    .line 983
    .line 984
    if-eqz v16, :cond_33

    .line 985
    .line 986
    :cond_31
    if-eqz v8, :cond_33

    .line 987
    .line 988
    if-eqz v16, :cond_32

    .line 989
    .line 990
    add-int/lit8 v0, v14, 0x1

    .line 991
    .line 992
    invoke-virtual {v11}, Ljava/util/AbstractMap;->size()I

    .line 993
    .line 994
    .line 995
    move v14, v0

    .line 996
    :cond_32
    add-int/lit8 v12, v12, 0x1

    .line 997
    .line 998
    move-object v5, v4

    .line 999
    move-object v4, v1

    .line 1000
    move-object v1, v5

    .line 1001
    move-object/from16 v35, v3

    .line 1002
    .line 1003
    move-object/from16 v22, v7

    .line 1004
    .line 1005
    move v9, v14

    .line 1006
    move-object/from16 v3, v25

    .line 1007
    .line 1008
    move-object/from16 v6, v26

    .line 1009
    .line 1010
    move-object/from16 v5, v27

    .line 1011
    .line 1012
    move-wide/from16 v16, v31

    .line 1013
    .line 1014
    move-wide/from16 v7, v33

    .line 1015
    .line 1016
    const/16 v14, 0x1f

    .line 1017
    .line 1018
    goto/16 :goto_12

    .line 1019
    .line 1020
    :cond_33
    :goto_20
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    check-cast v0, Ljava/lang/Iterable;

    .line 1028
    .line 1029
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    return-object v0

    .line 1034
    :cond_34
    new-instance v1, Ljava/lang/ClassNotFoundException;

    .line 1035
    .line 1036
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-direct {v1, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    throw v1

    .line 1044
    :cond_35
    move-object/from16 v18, v2

    .line 1045
    .line 1046
    const-string v0, "profile uid/secUid is empty"

    .line 1047
    .line 1048
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    return-object v18
.end method

.method public final ξ(Landroid/app/Activity;)Lzi1;
    .locals 44

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "host classLoader is null"

    .line 26
    .line 27
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    :goto_0
    invoke-static {}, Lcj1;->χ()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-eqz v4, :cond_28

    .line 36
    .line 37
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 38
    .line 39
    const-string v3, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 40
    .line 41
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v1, v5}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v5, :cond_27

    .line 50
    .line 51
    move-object/from16 v6, p0

    .line 52
    .line 53
    invoke-virtual {v6, v5, v1}, Lcj1;->φ(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const-string v11, " \u4e2a \u00b7 \u672a\u8bc6\u522b "

    .line 62
    .line 63
    const-string v12, " \u9875\u5b8c\u6210 \u00b7 \u5df2\u8bc6\u522b "

    .line 64
    .line 65
    const-string v6, " \u9875 \u00b7 \u5df2\u8bc6\u522b "

    .line 66
    .line 67
    const/16 v7, 0x1f

    .line 68
    .line 69
    const-wide/high16 v16, -0x8000000000000000L

    .line 70
    .line 71
    const-string v8, "\u8c03\u8bd5\u83b7\u53d6\u4e3b\u9875\u4f5c\u54c1"

    .line 72
    .line 73
    move-object/from16 v18, v2

    .line 74
    .line 75
    const-string v2, "\u7b2c "

    .line 76
    .line 77
    const-string v10, " \u4e2a"

    .line 78
    .line 79
    const-wide/16 v19, 0x0

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    if-eqz v3, :cond_14

    .line 84
    .line 85
    sget v3, Lcom/example/dyhelper/MainHook;->β:I

    .line 86
    .line 87
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v9, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    move-object/from16 v34, v11

    .line 103
    .line 104
    move-object/from16 v35, v12

    .line 105
    .line 106
    move-wide/from16 v13, v19

    .line 107
    .line 108
    move/from16 v11, v21

    .line 109
    .line 110
    move v12, v11

    .line 111
    const/4 v15, 0x1

    .line 112
    :goto_1
    if-ge v15, v7, :cond_13

    .line 113
    .line 114
    sget-object v22, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-static {v2, v15, v6, v7, v10}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    move-object/from16 v37, v6

    .line 125
    .line 126
    const/4 v6, -0x1

    .line 127
    invoke-static {v6, v0, v8, v7}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v4, v13, v14, v15}, Lcj1;->ο(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    if-nez v6, :cond_2

    .line 135
    .line 136
    :goto_2
    move-object v0, v3

    .line 137
    move-object/from16 v40, v4

    .line 138
    .line 139
    goto/16 :goto_d

    .line 140
    .line 141
    :cond_2
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getRawResponse()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    if-nez v7, :cond_3

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-static {v7}, Lcj1;->ε(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-static {v7, v15, v5}, Lcj1;->π(Ljava/util/ArrayList;ILjava/util/ArrayList;)Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    move-result-object v38

    .line 156
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v22

    .line 160
    :goto_3
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v23

    .line 164
    if-eqz v23, :cond_6

    .line 165
    .line 166
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v23

    .line 170
    move-object/from16 v39, v1

    .line 171
    .line 172
    move-object/from16 v1, v23

    .line 173
    .line 174
    check-cast v1, Lf8;

    .line 175
    .line 176
    move-object/from16 v40, v4

    .line 177
    .line 178
    iget-object v4, v1, Lf8;->θ:Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v4, :cond_5

    .line 181
    .line 182
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v23

    .line 186
    if-eqz v23, :cond_4

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_4
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_5
    :goto_4
    move-object/from16 v1, v39

    .line 193
    .line 194
    move-object/from16 v4, v40

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_6
    move-object/from16 v39, v1

    .line 198
    .line 199
    move-object/from16 v40, v4

    .line 200
    .line 201
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_7

    .line 210
    .line 211
    move-object/from16 v4, v18

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    check-cast v4, Lf8;

    .line 219
    .line 220
    iget v4, v4, Lf8;->ξ:I

    .line 221
    .line 222
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v22

    .line 230
    if-eqz v22, :cond_9

    .line 231
    .line 232
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v22

    .line 236
    move-object/from16 v23, v1

    .line 237
    .line 238
    move-object/from16 v1, v22

    .line 239
    .line 240
    check-cast v1, Lf8;

    .line 241
    .line 242
    iget v1, v1, Lf8;->ξ:I

    .line 243
    .line 244
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v4, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 249
    .line 250
    .line 251
    move-result v22

    .line 252
    if-gez v22, :cond_8

    .line 253
    .line 254
    move-object v4, v1

    .line 255
    :cond_8
    move-object/from16 v1, v23

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_9
    :goto_6
    if-eqz v4, :cond_a

    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    goto :goto_7

    .line 265
    :cond_a
    move/from16 v1, v21

    .line 266
    .line 267
    :goto_7
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getMaxCursor()J

    .line 272
    .line 273
    .line 274
    move-result-wide v29

    .line 275
    cmp-long v1, v29, v19

    .line 276
    .line 277
    if-lez v1, :cond_b

    .line 278
    .line 279
    cmp-long v1, v29, v16

    .line 280
    .line 281
    if-eqz v1, :cond_b

    .line 282
    .line 283
    cmp-long v1, v29, v13

    .line 284
    .line 285
    if-eqz v1, :cond_b

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    goto :goto_8

    .line 289
    :cond_b
    move/from16 v1, v21

    .line 290
    .line 291
    :goto_8
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_c

    .line 296
    .line 297
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->isEmpty()Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_e

    .line 302
    .line 303
    :cond_c
    const/4 v4, 0x3

    .line 304
    if-ge v12, v4, :cond_e

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    if-lez v11, :cond_d

    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-le v11, v4, :cond_e

    .line 315
    .line 316
    :cond_d
    const/16 v31, 0x1

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_e
    move/from16 v31, v21

    .line 320
    .line 321
    :goto_9
    new-instance v22, Laj1;

    .line 322
    .line 323
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v24

    .line 327
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->size()I

    .line 328
    .line 329
    .line 330
    move-result v25

    .line 331
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    sub-int v26, v4, v7

    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 342
    .line 343
    .line 344
    move-result v27

    .line 345
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 346
    .line 347
    .line 348
    move-result v28

    .line 349
    const-string v32, "coroutine"

    .line 350
    .line 351
    move/from16 v23, v15

    .line 352
    .line 353
    invoke-direct/range {v22 .. v32}, Laj1;-><init>(IIIIIZJZLjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v7, v22

    .line 357
    .line 358
    move/from16 v4, v23

    .line 359
    .line 360
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    mul-int/lit8 v15, v4, 0x64

    .line 364
    .line 365
    div-int/lit8 v15, v15, 0x1e

    .line 366
    .line 367
    move/from16 v16, v1

    .line 368
    .line 369
    const/4 v1, 0x1

    .line 370
    const/16 v7, 0x63

    .line 371
    .line 372
    invoke-static {v15, v1, v7}, Lj81;->μ(III)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    sget-object v1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 377
    .line 378
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    move/from16 v17, v11

    .line 387
    .line 388
    move/from16 v22, v12

    .line 389
    .line 390
    move-object/from16 v11, v34

    .line 391
    .line 392
    move-object/from16 v12, v35

    .line 393
    .line 394
    invoke-static {v2, v4, v12, v1, v11}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-static {v1, v7, v10}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-static {v15, v0, v8, v1}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    const/16 v7, 0x270f

    .line 410
    .line 411
    if-ge v1, v7, :cond_f

    .line 412
    .line 413
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient$ProfileAwemeListResult;->getHasMore()Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_10

    .line 418
    .line 419
    if-eqz v31, :cond_f

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_f
    :goto_a
    move-object v0, v3

    .line 423
    goto :goto_d

    .line 424
    :cond_10
    :goto_b
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->isEmpty()Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_11

    .line 429
    .line 430
    if-eqz v31, :cond_f

    .line 431
    .line 432
    :cond_11
    if-eqz v16, :cond_f

    .line 433
    .line 434
    if-eqz v31, :cond_12

    .line 435
    .line 436
    add-int/lit8 v1, v22, 0x1

    .line 437
    .line 438
    goto :goto_c

    .line 439
    :cond_12
    move/from16 v1, v22

    .line 440
    .line 441
    :goto_c
    const-wide/16 v6, 0x78

    .line 442
    .line 443
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 444
    .line 445
    .line 446
    :catchall_0
    add-int/lit8 v15, v4, 0x1

    .line 447
    .line 448
    move-object/from16 v34, v11

    .line 449
    .line 450
    move-object/from16 v35, v12

    .line 451
    .line 452
    move/from16 v11, v17

    .line 453
    .line 454
    move-object/from16 v6, v37

    .line 455
    .line 456
    move-object/from16 v4, v40

    .line 457
    .line 458
    const/16 v7, 0x1f

    .line 459
    .line 460
    move v12, v1

    .line 461
    move-wide/from16 v16, v13

    .line 462
    .line 463
    move-wide/from16 v13, v29

    .line 464
    .line 465
    move-object/from16 v1, v39

    .line 466
    .line 467
    goto/16 :goto_1

    .line 468
    .line 469
    :cond_13
    move-object/from16 v40, v4

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :goto_d
    new-instance v3, Lzi1;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    check-cast v0, Ljava/lang/Iterable;

    .line 482
    .line 483
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    move-object v8, v9

    .line 488
    const/4 v9, 0x0

    .line 489
    move-object v7, v5

    .line 490
    const-string v5, "coroutine"

    .line 491
    .line 492
    move-object/from16 v4, v40

    .line 493
    .line 494
    invoke-direct/range {v3 .. v9}, Lzi1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    return-object v3

    .line 498
    :cond_14
    move-object/from16 v37, v6

    .line 499
    .line 500
    invoke-static {v9}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Ljava/lang/reflect/Method;

    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    aget-object v3, v1, v21

    .line 511
    .line 512
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 513
    .line 514
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 515
    .line 516
    .line 517
    new-instance v13, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 520
    .line 521
    .line 522
    new-instance v14, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 525
    .line 526
    .line 527
    move-object/from16 v22, v3

    .line 528
    .line 529
    move-object/from16 v34, v11

    .line 530
    .line 531
    move-object/from16 v35, v12

    .line 532
    .line 533
    move-wide/from16 v6, v19

    .line 534
    .line 535
    move/from16 v11, v21

    .line 536
    .line 537
    move v12, v11

    .line 538
    const/16 v3, 0x1f

    .line 539
    .line 540
    const/4 v15, 0x1

    .line 541
    :goto_e
    if-ge v15, v3, :cond_16

    .line 542
    .line 543
    sget-object v23, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 544
    .line 545
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    move-object/from16 v40, v4

    .line 550
    .line 551
    move-object/from16 v4, v37

    .line 552
    .line 553
    invoke-static {v2, v15, v4, v3, v10}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    move-object/from16 v37, v10

    .line 558
    .line 559
    const/4 v10, -0x1

    .line 560
    invoke-static {v10, v0, v8, v3}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    const/4 v3, 0x1

    .line 567
    if-ne v15, v3, :cond_15

    .line 568
    .line 569
    move-object v10, v8

    .line 570
    const/4 v8, 0x1

    .line 571
    move-object/from16 v33, v4

    .line 572
    .line 573
    move-object v4, v5

    .line 574
    move-object/from16 v3, v22

    .line 575
    .line 576
    move-object/from16 v5, v40

    .line 577
    .line 578
    const/16 v36, 0x1f

    .line 579
    .line 580
    goto :goto_f

    .line 581
    :cond_15
    const/4 v3, 0x4

    .line 582
    move-object v10, v8

    .line 583
    move v8, v3

    .line 584
    move-object/from16 v33, v4

    .line 585
    .line 586
    move-object v4, v5

    .line 587
    move-object/from16 v5, v40

    .line 588
    .line 589
    const/16 v36, 0x1f

    .line 590
    .line 591
    move-object/from16 v3, v22

    .line 592
    .line 593
    :goto_f
    invoke-static/range {v3 .. v8}, Lcj1;->γ(Ljava/lang/Class;Ljava/lang/Class;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;JI)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    move-object/from16 v43, v5

    .line 598
    .line 599
    move-object v5, v3

    .line 600
    move-object v3, v4

    .line 601
    move-object/from16 v4, v43

    .line 602
    .line 603
    invoke-static {v8, v9}, Lcj1;->κ(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    if-nez v8, :cond_17

    .line 608
    .line 609
    :cond_16
    move-object/from16 v42, v1

    .line 610
    .line 611
    move-object/from16 v41, v4

    .line 612
    .line 613
    goto/16 :goto_18

    .line 614
    .line 615
    :cond_17
    move-object/from16 v39, v3

    .line 616
    .line 617
    invoke-static {v8}, Lcj1;->ε(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    invoke-static {v3, v15, v13}, Lcj1;->π(Ljava/util/ArrayList;ILjava/util/ArrayList;)Ljava/util/ArrayList;

    .line 622
    .line 623
    .line 624
    move-result-object v40

    .line 625
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v22

    .line 629
    :goto_10
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v23

    .line 633
    if-eqz v23, :cond_1a

    .line 634
    .line 635
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v23

    .line 639
    move-object/from16 v24, v3

    .line 640
    .line 641
    move-object/from16 v3, v23

    .line 642
    .line 643
    check-cast v3, Lf8;

    .line 644
    .line 645
    move-object/from16 v41, v4

    .line 646
    .line 647
    iget-object v4, v3, Lf8;->θ:Ljava/lang/String;

    .line 648
    .line 649
    if-eqz v4, :cond_19

    .line 650
    .line 651
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 652
    .line 653
    .line 654
    move-result v23

    .line 655
    if-eqz v23, :cond_18

    .line 656
    .line 657
    goto :goto_11

    .line 658
    :cond_18
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    :cond_19
    :goto_11
    move-object/from16 v3, v24

    .line 662
    .line 663
    move-object/from16 v4, v41

    .line 664
    .line 665
    goto :goto_10

    .line 666
    :cond_1a
    move-object/from16 v24, v3

    .line 667
    .line 668
    move-object/from16 v41, v4

    .line 669
    .line 670
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    if-nez v4, :cond_1c

    .line 679
    .line 680
    move-object/from16 v4, v18

    .line 681
    .line 682
    :cond_1b
    move-object/from16 v42, v1

    .line 683
    .line 684
    goto :goto_13

    .line 685
    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    check-cast v4, Lf8;

    .line 690
    .line 691
    iget v4, v4, Lf8;->ξ:I

    .line 692
    .line 693
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v22

    .line 701
    if-eqz v22, :cond_1b

    .line 702
    .line 703
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v22

    .line 707
    move-object/from16 v42, v1

    .line 708
    .line 709
    move-object/from16 v1, v22

    .line 710
    .line 711
    check-cast v1, Lf8;

    .line 712
    .line 713
    iget v1, v1, Lf8;->ξ:I

    .line 714
    .line 715
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    invoke-virtual {v4, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 720
    .line 721
    .line 722
    move-result v22

    .line 723
    if-gez v22, :cond_1d

    .line 724
    .line 725
    move-object v4, v1

    .line 726
    :cond_1d
    move-object/from16 v1, v42

    .line 727
    .line 728
    goto :goto_12

    .line 729
    :goto_13
    if-eqz v4, :cond_1e

    .line 730
    .line 731
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    goto :goto_14

    .line 736
    :cond_1e
    move/from16 v1, v21

    .line 737
    .line 738
    :goto_14
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 739
    .line 740
    .line 741
    move-result v11

    .line 742
    invoke-static {v8}, Lcj1;->τ(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v28

    .line 746
    const-string v1, "getMaxCursor"

    .line 747
    .line 748
    const-string v3, "maxCursor"

    .line 749
    .line 750
    invoke-static {v8, v1, v3}, Lcj1;->υ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    if-eqz v1, :cond_1f

    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 757
    .line 758
    .line 759
    move-result-wide v3

    .line 760
    move-wide/from16 v29, v3

    .line 761
    .line 762
    goto :goto_15

    .line 763
    :cond_1f
    move-wide/from16 v29, v19

    .line 764
    .line 765
    :goto_15
    cmp-long v1, v29, v19

    .line 766
    .line 767
    if-lez v1, :cond_20

    .line 768
    .line 769
    cmp-long v1, v29, v16

    .line 770
    .line 771
    if-eqz v1, :cond_20

    .line 772
    .line 773
    cmp-long v1, v29, v6

    .line 774
    .line 775
    if-eqz v1, :cond_20

    .line 776
    .line 777
    const/4 v1, 0x1

    .line 778
    goto :goto_16

    .line 779
    :cond_20
    move/from16 v1, v21

    .line 780
    .line 781
    :goto_16
    if-nez v28, :cond_21

    .line 782
    .line 783
    invoke-virtual/range {v42 .. v42}, Ljava/util/AbstractMap;->size()I

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    if-le v11, v3, :cond_21

    .line 788
    .line 789
    const/4 v4, 0x3

    .line 790
    if-ge v12, v4, :cond_22

    .line 791
    .line 792
    if-eqz v1, :cond_22

    .line 793
    .line 794
    const/16 v31, 0x1

    .line 795
    .line 796
    goto :goto_17

    .line 797
    :cond_21
    const/4 v4, 0x3

    .line 798
    :cond_22
    move/from16 v31, v21

    .line 799
    .line 800
    :goto_17
    new-instance v22, Laj1;

    .line 801
    .line 802
    move-object/from16 v3, v24

    .line 803
    .line 804
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 805
    .line 806
    .line 807
    move-result v24

    .line 808
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayList;->size()I

    .line 809
    .line 810
    .line 811
    move-result v25

    .line 812
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayList;->size()I

    .line 817
    .line 818
    .line 819
    move-result v8

    .line 820
    sub-int v26, v3, v8

    .line 821
    .line 822
    invoke-virtual/range {v42 .. v42}, Ljava/util/AbstractMap;->size()I

    .line 823
    .line 824
    .line 825
    move-result v27

    .line 826
    const-string v32, "static"

    .line 827
    .line 828
    move/from16 v23, v15

    .line 829
    .line 830
    invoke-direct/range {v22 .. v32}, Laj1;-><init>(IIIIIZJZLjava/lang/String;)V

    .line 831
    .line 832
    .line 833
    move-object/from16 v8, v22

    .line 834
    .line 835
    move/from16 v3, v23

    .line 836
    .line 837
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    mul-int/lit8 v15, v3, 0x64

    .line 841
    .line 842
    div-int/lit8 v15, v15, 0x1e

    .line 843
    .line 844
    const/4 v4, 0x1

    .line 845
    const/16 v8, 0x63

    .line 846
    .line 847
    invoke-static {v15, v4, v8}, Lj81;->μ(III)I

    .line 848
    .line 849
    .line 850
    move-result v15

    .line 851
    sget-object v16, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 852
    .line 853
    invoke-virtual/range {v42 .. v42}, Ljava/util/AbstractMap;->size()I

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 858
    .line 859
    .line 860
    move-result v8

    .line 861
    move/from16 v16, v1

    .line 862
    .line 863
    move-object/from16 v22, v5

    .line 864
    .line 865
    move-object/from16 v1, v34

    .line 866
    .line 867
    move-object/from16 v5, v35

    .line 868
    .line 869
    invoke-static {v2, v3, v5, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    move-object/from16 v1, v37

    .line 874
    .line 875
    invoke-static {v4, v8, v1}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-static {v15, v0, v10, v4}, Lcom/example/dyhelper/ui/а;->λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v42 .. v42}, Ljava/util/AbstractMap;->size()I

    .line 883
    .line 884
    .line 885
    move-result v4

    .line 886
    const/16 v8, 0x270f

    .line 887
    .line 888
    if-ge v4, v8, :cond_26

    .line 889
    .line 890
    if-nez v28, :cond_23

    .line 891
    .line 892
    if-eqz v31, :cond_26

    .line 893
    .line 894
    :cond_23
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayList;->isEmpty()Z

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    if-eqz v4, :cond_24

    .line 899
    .line 900
    if-eqz v31, :cond_26

    .line 901
    .line 902
    :cond_24
    if-eqz v16, :cond_26

    .line 903
    .line 904
    if-eqz v31, :cond_25

    .line 905
    .line 906
    add-int/lit8 v12, v12, 0x1

    .line 907
    .line 908
    :cond_25
    add-int/lit8 v15, v3, 0x1

    .line 909
    .line 910
    move-object/from16 v35, v5

    .line 911
    .line 912
    move-wide/from16 v16, v6

    .line 913
    .line 914
    move-object v8, v10

    .line 915
    move-wide/from16 v6, v29

    .line 916
    .line 917
    move-object/from16 v37, v33

    .line 918
    .line 919
    move/from16 v3, v36

    .line 920
    .line 921
    move-object/from16 v5, v39

    .line 922
    .line 923
    move-object/from16 v4, v41

    .line 924
    .line 925
    move-object v10, v1

    .line 926
    move-object/from16 v1, v42

    .line 927
    .line 928
    goto/16 :goto_e

    .line 929
    .line 930
    :cond_26
    :goto_18
    new-instance v3, Lzi1;

    .line 931
    .line 932
    invoke-virtual/range {v42 .. v42}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    check-cast v0, Ljava/lang/Iterable;

    .line 940
    .line 941
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 942
    .line 943
    .line 944
    move-result-object v6

    .line 945
    const/4 v9, 0x0

    .line 946
    const-string v5, "static"

    .line 947
    .line 948
    move-object v7, v13

    .line 949
    move-object v8, v14

    .line 950
    move-object/from16 v4, v41

    .line 951
    .line 952
    invoke-direct/range {v3 .. v9}, Lzi1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    return-object v3

    .line 956
    :cond_27
    new-instance v0, Ljava/lang/ClassNotFoundException;

    .line 957
    .line 958
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-direct {v0, v1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    throw v0

    .line 966
    :cond_28
    move-object/from16 v18, v2

    .line 967
    .line 968
    const-string v0, "profile uid/secUid is empty"

    .line 969
    .line 970
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    return-object v18
.end method

.method public final φ(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->п:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p2}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    move-object v5, v4

    .line 32
    check-cast v5, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {p1, v5}, Lcj1;->λ(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, Lib1;

    .line 45
    .line 46
    const/16 v4, 0x17

    .line 47
    .line 48
    invoke-direct {v1, v4}, Lib1;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance v1, Lrj0;

    .line 85
    .line 86
    invoke-direct {v1, p2, p1, v2}, Lrj0;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Class;I)V

    .line 87
    .line 88
    .line 89
    const-string v3, "\u5b9a\u4f4d\u4e3b\u9875\u4f5c\u54c1\u4e3b\u52a8\u83b7\u53d6\u63a5\u53e3"

    .line 90
    .line 91
    invoke-static {v0, p2, v3, v1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v3, v1

    .line 115
    check-cast v3, Ljava/lang/reflect/Method;

    .line 116
    .line 117
    invoke-static {p1, v3}, Lcj1;->λ(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    new-instance p1, Ljd1;

    .line 128
    .line 129
    invoke-direct {p1, v2, p0}, Ljd1;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-eqz p2, :cond_6

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    check-cast p2, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    return-object p0
.end method
