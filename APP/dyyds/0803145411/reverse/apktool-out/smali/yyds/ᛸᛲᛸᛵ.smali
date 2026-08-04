.class public final synthetic Lyyds/ᛸᛲᛸᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/reflect/Method;

.field public final synthetic ᛲᛳᛶᲁ:Ljava/lang/reflect/Method;

.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/reflect/Method;

.field public final synthetic ᛲᲈᲁ:Ljava/lang/reflect/Method;

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/reflect/Method;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/reflect/Method;

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛲᛸᛵ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛸᛲᛸᛵ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛸᛲᛸᛵ;->ᲀᛲᛳᲀ:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛸᛲᛸᛵ;->ᲇᲈᛵᛷ:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    iput-object p5, p0, Lyyds/ᛸᛲᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iput-object p6, p0, Lyyds/ᛸᛲᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    iput-object p7, p0, Lyyds/ᛸᛲᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    iput-object p8, p0, Lyyds/ᛸᛲᛸᛵ;->ᛱᲈᲁ:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    iput-object p9, p0, Lyyds/ᛸᛲᛸᛵ;->ᛲᛳᛶᲁ:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    iput-object p10, p0, Lyyds/ᛸᛲᛸᛵ;->ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide v2, -0x340dde68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lyyds/ᛸᲇᛷᛸ;->ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/ArrayDeque;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    :goto_0
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲇᲇᲇᛱ()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v6, v1, Lyyds/ᛸᛲᛸᛵ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 38
    .line 39
    iget-object v7, v1, Lyyds/ᛸᛲᛸᛵ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-eqz v3, :cond_9

    .line 42
    .line 43
    if-eqz v0, :cond_9

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v6, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    instance-of v4, v3, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    check-cast v3, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_4

    .line 58
    :cond_1
    move-object v3, v2

    .line 59
    :goto_1
    if-nez v3, :cond_3

    .line 60
    .line 61
    :cond_2
    :goto_2
    move-object v8, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_3
    iget-object v4, v3, Lcom/ss/android/ugc/aweme/feed/model/Aweme;->aid:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move-object v4, v2

    .line 75
    :goto_3
    if-nez v4, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    invoke-virtual {v7, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-nez v5, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    new-instance v8, Lyyds/ᛶᛸᛳᛱ;

    .line 86
    .line 87
    invoke-direct {v8, v0, v3, v5, v4}, Lyyds/ᛶᛸᛳᛱ;-><init>(Ljava/lang/Object;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :goto_4
    new-instance v8, Lyyds/ᲈᛵᛵᛴ;

    .line 92
    .line 93
    invoke-direct {v8, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_5
    invoke-static {v8}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    sget-object v3, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 103
    .line 104
    const-wide v4, -0x340e3e68a836eL

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, v4, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    instance-of v0, v8, Lyyds/ᲈᛵᛵᛴ;

    .line 117
    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_8
    move-object v2, v8

    .line 122
    :goto_6
    check-cast v2, Lyyds/ᛶᛸᛳᛱ;

    .line 123
    .line 124
    :cond_9
    move-object v5, v2

    .line 125
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-wide v2, -0x340f2e68a836eL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    new-array v2, v2, [Ljava/lang/Object;

    .line 139
    .line 140
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object/from16 v2, p1

    .line 145
    .line 146
    invoke-interface {v2, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v5, :cond_a

    .line 151
    .line 152
    sget-object v2, Lyyds/ᛸᲇᛷᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛸᲇᛷᛸ;

    .line 153
    .line 154
    iget-object v3, v5, Lyyds/ᛶᛸᛳᛱ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v4, v5, Lyyds/ᛶᛸᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v4}, Lyyds/ᛸᲇᛷᛸ;->ᲀᛴᲁᲈ(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_a

    .line 166
    .line 167
    sget-object v2, Lyyds/ᛸᲇᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 168
    .line 169
    invoke-virtual {v2}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Landroid/os/Handler;

    .line 174
    .line 175
    new-instance v4, Lyyds/ᛶᛵᛸᛵ;

    .line 176
    .line 177
    iget-object v8, v1, Lyyds/ᛸᛲᛸᛵ;->ᲀᛲᛳᲀ:Ljava/lang/reflect/Method;

    .line 178
    .line 179
    iget-object v9, v1, Lyyds/ᛸᛲᛸᛵ;->ᲇᲈᛵᛷ:Ljava/lang/reflect/Method;

    .line 180
    .line 181
    iget-object v10, v1, Lyyds/ᛸᛲᛸᛵ;->ᛲᛴᛳᛲ:Ljava/lang/reflect/Method;

    .line 182
    .line 183
    iget-object v11, v1, Lyyds/ᛸᛲᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

    .line 184
    .line 185
    iget-object v12, v1, Lyyds/ᛸᛲᛸᛵ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 186
    .line 187
    iget-object v13, v1, Lyyds/ᛸᛲᛸᛵ;->ᛱᲈᲁ:Ljava/lang/reflect/Method;

    .line 188
    .line 189
    iget-object v14, v1, Lyyds/ᛸᛲᛸᛵ;->ᛲᛳᛶᲁ:Ljava/lang/reflect/Method;

    .line 190
    .line 191
    iget-object v15, v1, Lyyds/ᛸᛲᛸᛵ;->ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

    .line 192
    .line 193
    invoke-direct/range {v4 .. v15}, Lyyds/ᛶᛵᛸᛵ;-><init>(Lyyds/ᛶᛸᛳᛱ;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 197
    .line 198
    .line 199
    :cond_a
    return-object v0
.end method
