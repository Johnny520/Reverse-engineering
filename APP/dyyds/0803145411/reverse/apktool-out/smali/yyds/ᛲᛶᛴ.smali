.class public Lyyds/ᛲᛶᛴ;
.super Lyyds/ᲈᛸᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛲᛶᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛲᛶᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛲᛶᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛲᛶᛴ;->ᛲᲈᲁ:Lyyds/ᛲᛶᛴ;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static ᛲᛴᛳᛲ(ILyyds/ᲀᛲᛴᲇ;)Lyyds/ᛳᛱᛶᲁ;
    .locals 2

    .line 1
    invoke-static {p0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲁᛶᛴᛸ()V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lyyds/ᛱᲇᛲᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲇᛲᲁ;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {p0}, Lyyds/ᛴᛷᛷᲇ;->ᛳᛸᛴᛶ(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "Unexpected token: "

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Lyyds/ᛳᲈᲀᲀ;

    .line 40
    .line 41
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛷᛶᛷᲀ()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Lyyds/ᛳᲈᲀᲀ;-><init>(Ljava/lang/Boolean;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛵᛷ()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Lyyds/ᛳᲈᲀᲀ;

    .line 58
    .line 59
    new-instance v0, Lyyds/ᛱᲇᛴᛸ;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lyyds/ᛱᲇᛴᛸ;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, v0}, Lyyds/ᛳᲈᲀᲀ;-><init>(Ljava/lang/Number;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    new-instance p0, Lyyds/ᛳᲈᲀᲀ;

    .line 69
    .line 70
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛵᛷ()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lyyds/ᛳᲈᲀᲀ;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method

.method public static ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛳᲁ;Lyyds/ᛳᛱᛶᲁ;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    instance-of v0, p1, Lyyds/ᛱᲇᛲᲁ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lyyds/ᛳᲈᲀᲀ;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    check-cast p1, Lyyds/ᛳᲈᲀᲀ;

    .line 14
    .line 15
    iget-object v0, p1, Lyyds/ᛳᲈᲀᲀ;->ᲀᛲᛳᲀ:Ljava/io/Serializable;

    .line 16
    .line 17
    instance-of v1, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lyyds/ᛳᲈᲀᲀ;->ᲀᛲᛳᲀ()Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lyyds/ᛶᲀᛳᲁ;->ᲈᛷᲈᛶ(Ljava/lang/Number;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1}, Lyyds/ᛳᲈᲀᲀ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᛶᲀᛳᲁ;->ᛱᛸᲁᲇ(Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-virtual {p1}, Lyyds/ᛳᲈᲀᲀ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lyyds/ᛶᲀᛳᲁ;->ᛲᛱᲁᛳ(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    instance-of v0, p1, Lyyds/ᲇᛴᛷ;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᲁ;->ᲇᲇᲇᛱ()V

    .line 69
    .line 70
    .line 71
    check-cast p1, Lyyds/ᲇᛴᛷ;

    .line 72
    .line 73
    iget-object p1, p1, Lyyds/ᲇᛴᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lyyds/ᛳᛱᛶᲁ;

    .line 90
    .line 91
    invoke-static {p0, v0}, Lyyds/ᛲᛶᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛳᲁ;Lyyds/ᛳᛱᛶᲁ;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᲁ;->ᛳᲁᲁᲇ()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_6
    instance-of v0, p1, Lyyds/ᛳᛴᛴ;

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᲁ;->ᛶᛷᛲᲁ()V

    .line 104
    .line 105
    .line 106
    check-cast p1, Lyyds/ᛳᛴᛴ;

    .line 107
    .line 108
    iget-object p1, p1, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 109
    .line 110
    invoke-virtual {p1}, Lyyds/ᛷᛶᲁᛵ;->entrySet()Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lyyds/ᛳᛷᛱᛱ;

    .line 115
    .line 116
    invoke-virtual {p1}, Lyyds/ᛳᛷᛱᛱ;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_2
    move-object v0, p1

    .line 121
    check-cast v0, Lyyds/ᲁᛱᛵᛳ;

    .line 122
    .line 123
    invoke-virtual {v0}, Lyyds/ᲁᛱᛵᛳ;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    move-object v0, p1

    .line 130
    check-cast v0, Lyyds/ᲁᛱᛵᛳ;

    .line 131
    .line 132
    invoke-virtual {v0}, Lyyds/ᲁᛱᛵᛳ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛱᛴ;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p0, v1}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lyyds/ᛳᛱᛶᲁ;

    .line 150
    .line 151
    invoke-static {p0, v0}, Lyyds/ᛲᛶᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛳᲁ;Lyyds/ᛳᛱᛶᲁ;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᲁ;->ᲇᛱᛲ()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_8
    const-string p0, "Couldn\'t write "

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1, p0}, Lyyds/ᛷᲈᲈᛶ;->ᛲᛴᛳᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_9
    :goto_3
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᲁ;->ᛵᲀᲈᛴ()Lyyds/ᛶᲀᛳᲁ;

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᲀᛲᛴᲇ;)Lyyds/ᛳᛱᛶᲁ;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    move-object v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lyyds/ᛳᛴᛴ;

    .line 21
    .line 22
    invoke-direct {v1}, Lyyds/ᛳᛴᛴ;-><init>()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲈᲁ()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lyyds/ᲇᛴᛷ;

    .line 30
    .line 31
    invoke-direct {v1}, Lyyds/ᲇᛴᛷ;-><init>()V

    .line 32
    .line 33
    .line 34
    :goto_0
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-static {v0, p0}, Lyyds/ᛲᛶᛴ;->ᛲᛴᛳᛲ(ILyyds/ᲀᛲᛴᲇ;)Lyyds/ᛳᛱᛶᲁ;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    new-instance v0, Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛵᲀᲈᛴ()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_a

    .line 51
    .line 52
    instance-of v4, v1, Lyyds/ᛳᛴᛴ;

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛱᛸᲁᲇ()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v4, v3

    .line 62
    :goto_2
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-static {v5}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    if-eq v6, v2, :cond_5

    .line 73
    .line 74
    move-object v6, v3

    .line 75
    goto :goto_3

    .line 76
    :cond_5
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 77
    .line 78
    .line 79
    new-instance v6, Lyyds/ᛳᛴᛴ;

    .line 80
    .line 81
    invoke-direct {v6}, Lyyds/ᛳᛴᛴ;-><init>()V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲈᲁ()V

    .line 86
    .line 87
    .line 88
    new-instance v6, Lyyds/ᲇᛴᛷ;

    .line 89
    .line 90
    invoke-direct {v6}, Lyyds/ᲇᛴᛷ;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_3
    if-eqz v6, :cond_7

    .line 94
    .line 95
    const/4 v7, 0x1

    .line 96
    goto :goto_4

    .line 97
    :cond_7
    const/4 v7, 0x0

    .line 98
    :goto_4
    if-nez v6, :cond_8

    .line 99
    .line 100
    invoke-static {v5, p0}, Lyyds/ᛲᛶᛴ;->ᛲᛴᛳᛲ(ILyyds/ᲀᛲᛴᲇ;)Lyyds/ᛳᛱᛶᲁ;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    :cond_8
    instance-of v5, v1, Lyyds/ᲇᛴᛷ;

    .line 105
    .line 106
    if-eqz v5, :cond_9

    .line 107
    .line 108
    move-object v4, v1

    .line 109
    check-cast v4, Lyyds/ᲇᛴᛷ;

    .line 110
    .line 111
    iget-object v4, v4, Lyyds/ᲇᛴᛷ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_9
    move-object v5, v1

    .line 118
    check-cast v5, Lyyds/ᛳᛴᛴ;

    .line 119
    .line 120
    iget-object v5, v5, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 121
    .line 122
    invoke-virtual {v5, v4, v6}, Lyyds/ᛷᛶᲁᛵ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :goto_5
    if-eqz v7, :cond_3

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v1, v6

    .line 131
    goto :goto_1

    .line 132
    :cond_a
    instance-of v4, v1, Lyyds/ᲇᛴᛷ;

    .line 133
    .line 134
    if-eqz v4, :cond_b

    .line 135
    .line 136
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᛳᲁᲁᲇ()V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_b
    invoke-virtual {p0}, Lyyds/ᲀᛲᛴᲇ;->ᲇᛱᛲ()V

    .line 141
    .line 142
    .line 143
    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_c

    .line 148
    .line 149
    return-object v1

    .line 150
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Lyyds/ᛳᛱᛶᲁ;

    .line 155
    .line 156
    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛶᛴ;->ᲇᲈᛵᛷ(Lyyds/ᲀᛲᛴᲇ;)Lyyds/ᛳᛱᛶᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lyyds/ᛳᛱᛶᲁ;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lyyds/ᛲᛶᛴ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛳᲁ;Lyyds/ᛳᛱᛶᲁ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
