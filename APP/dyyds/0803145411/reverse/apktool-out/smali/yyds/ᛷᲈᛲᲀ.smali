.class public final Lyyds/ᛷᲈᛲᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static ᛱᲈᲁ:Ljava/lang/reflect/Method;

.field public static volatile ᛲᛴᛳᛲ:Ljava/lang/String;

.field public static final ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

.field public static final ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

.field public static ᛶᛷᛲᲁ:Ljava/lang/ref/WeakReference;

.field public static final ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

.field public static volatile ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

.field public static final ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛷᲈᛲᲀ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛲᲈᲁ:Lyyds/ᛷᲈᛲᲀ;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 5

    .line 1
    const-wide v0, -0x20ff0e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    :try_start_0
    invoke-static {p0}, Lyyds/ᲁᲀᲈᛸ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Lyyds/ᛳᛱᛶᲁ;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of v0, p0, Lyyds/ᛳᛴᛴ;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    check-cast p0, Lyyds/ᛳᛴᛴ;

    .line 42
    .line 43
    iget-object p0, p0, Lyyds/ᛳᛴᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛶᲁᛵ;

    .line 44
    .line 45
    invoke-virtual {p0}, Lyyds/ᛷᛶᲁᛵ;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-wide v1, -0x20ff4e68a836eL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    check-cast p0, Lyyds/ᛳᛷᛱᛱ;

    .line 58
    .line 59
    invoke-virtual {p0}, Lyyds/ᛳᛷᛱᛱ;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/String;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lyyds/ᛳᛱᛶᲁ;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    instance-of v3, v1, Lyyds/ᛳᲈᲀᲀ;

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    move-object v3, v1

    .line 95
    check-cast v3, Lyyds/ᛳᲈᲀᲀ;

    .line 96
    .line 97
    iget-object v3, v3, Lyyds/ᛳᲈᲀᲀ;->ᲀᛲᛳᲀ:Ljava/io/Serializable;

    .line 98
    .line 99
    instance-of v3, v3, Ljava/lang/String;

    .line 100
    .line 101
    if-nez v3, :cond_3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1}, Lyyds/ᛳᛱᛶᲁ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const-wide v3, -0x21002e68a836eL

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-lez v3, :cond_2

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-lez v3, :cond_2

    .line 143
    .line 144
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :catchall_0
    move-exception p0

    .line 149
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 150
    .line 151
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    move-object p0, v0

    .line 155
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-nez v0, :cond_5

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 165
    .line 166
    .line 167
    :goto_2
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    return-object p0
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ()Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v1

    .line 18
    :goto_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-wide v2, -0x2102ce68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-static {p2}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move-object p2, v1

    .line 48
    :goto_1
    if-nez p2, :cond_4

    .line 49
    .line 50
    const-wide v2, -0x2102de68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :cond_4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    monitor-enter p0

    .line 66
    :try_start_0
    sget-object v2, Lyyds/ᛷᲈᛲᲀ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-lez v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    invoke-virtual {p2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception p1

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    :goto_2
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-object v1, v0

    .line 106
    goto :goto_3

    .line 107
    :cond_6
    if-eqz v3, :cond_7

    .line 108
    .line 109
    invoke-virtual {p2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object p2, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    move-object v1, p1

    .line 125
    check-cast v1, Ljava/lang/String;

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-lez v0, :cond_8

    .line 133
    .line 134
    sget-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_8
    :goto_3
    monitor-exit p0

    .line 143
    return-object v1

    .line 144
    :goto_4
    monitor-exit p0

    .line 145
    throw p1
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 8
    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛶᛷᛲᲁ:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    sput-object p2, Lyyds/ᛷᲈᛲᲀ;->ᛱᲈᲁ:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit p0

    .line 24
    throw p1

    .line 25
    :cond_1
    :goto_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Ljava/util/LinkedHashMap;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛲ;

    .line 7
    .line 8
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    sget-object v0, Lyyds/ᛷᲈᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    monitor-enter p0

    .line 36
    :try_start_0
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lyyds/ᛷᲈᛲᲀ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sput-object v1, Lyyds/ᛷᲈᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    sput-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    sget-object v1, Lyyds/ᛷᲈᛲᲀ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-object v0

    .line 64
    :goto_1
    monitor-exit p0

    .line 65
    throw v0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-wide v0, -0x21041e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    const-wide v0, -0x21047e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    monitor-enter p0

    .line 40
    :try_start_0
    sget-object v0, Lyyds/ᛷᲈᛲᲀ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lyyds/ᲇᛸᛵᛳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 47
    .line 48
    monitor-exit p0

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    :goto_1
    return-void

    .line 52
    :cond_3
    iget-object v2, v1, Lyyds/ᲇᛸᛵᛳ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_5

    .line 59
    .line 60
    monitor-enter p0

    .line 61
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    :goto_2
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :goto_3
    monitor-exit p0

    .line 76
    throw p1

    .line 77
    :cond_5
    :try_start_2
    iget-object p0, v1, Lyyds/ᲇᛸᛵᛳ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Field;

    .line 78
    .line 79
    invoke-virtual {p0, v2, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    new-instance p2, Lyyds/ᲈᛵᛵᛴ;

    .line 87
    .line 88
    invoke-direct {p2, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object p0, p2

    .line 92
    :goto_4
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    if-nez p2, :cond_6

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_6
    sget-object p0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 100
    .line 101
    const-wide v0, -0x21048e68a836eL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    :goto_5
    check-cast p0, Ljava/lang/Boolean;

    .line 120
    .line 121
    return-void

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit p0

    .line 124
    throw p1
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-wide v1, -0x2103fe68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    monitor-enter p0

    .line 33
    :try_start_0
    sget-object v0, Lyyds/ᛷᲈᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-object p1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit p0

    .line 45
    throw p1
.end method
