.class public abstract Lyyds/ᲀᛱᛳᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:[Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 3
    .line 4
    sput-object v0, Lyyds/ᲀᛱᛳᲈ;->ᛲᲈᲁ:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    return-void
.end method

.method public static ᛱᛳᲇ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    const/16 v2, 0x67

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-char v2, v1, v3

    .line 13
    .line 14
    const/16 v2, 0x65

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    aput-char v2, v1, v4

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    const/16 v5, 0x74

    .line 21
    .line 22
    aput-char v5, v1, v2

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/16 v3, 0x61

    .line 29
    .line 30
    if-lt v2, v3, :cond_0

    .line 31
    .line 32
    const/16 v3, 0x7a

    .line 33
    .line 34
    if-gt v2, v3, :cond_0

    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x20

    .line 37
    .line 38
    int-to-char v2, v2

    .line 39
    :cond_0
    const/4 v3, 0x3

    .line 40
    aput-char v2, v1, v3

    .line 41
    .line 42
    :goto_0
    if-ge v4, v0, :cond_1

    .line 43
    .line 44
    add-int/lit8 v2, v4, 0x3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    aput-char v3, v1, v2

    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 58
    .line 59
    .line 60
    return-object p0
.end method

.method public static ᛱᲈᲁ(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "Primitive type is not allowed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public static ᛲᛲᲈᲈ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_3

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    if-ne v2, p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aget-object p0, p0, v1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    aget-object p1, p1, v1

    .line 40
    .line 41
    aget-object p0, p0, v1

    .line 42
    .line 43
    invoke-static {p1, p0, p2}, Lyyds/ᲀᛱᛳᲈ;->ᛲᛲᲈᲈ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    :goto_1
    const-class p0, Ljava/lang/Object;

    .line 58
    .line 59
    if-eq p1, p0, :cond_6

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, p0, p2}, Lyyds/ᲀᛱᛳᲈ;->ᛲᛲᲈᲈ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_5
    move-object p1, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    return-object p2
.end method

.method public static ᛲᛳᛶᲁ(Ljava/lang/String;)Lyyds/ᲇᲁᲀᲁ;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_0

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lyyds/ᛷᛶᛷᛵ;->ᲀᛲᛳᲀ(C)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shl-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lyyds/ᛷᛶᛷᛵ;->ᲀᛲᛳᲀ(C)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v4

    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Lyyds/ᲇᲁᲀᲁ;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string v0, "Unexpected hex string: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static ᛲᛴᛳᛲ(Lyyds/ᛳᛸᲀᛳ;)Lyyds/ᛳᛸᲀᛳ;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛸᲀᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲇᛸᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛳᲇᛸᛵ;->ᛵᛸᛸᛷ()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lyyds/ᛳᲇᛸᛵ;->ᛳᲁᲁᲇ:Z

    .line 8
    .line 9
    iget v1, v0, Lyyds/ᛳᲇᛸᛵ;->ᛷᛲᲈᛱ:I

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Lyyds/ᛳᲇᛸᛵ;->ᲇᛱᛲ:Lyyds/ᛳᲇᛸᛵ;

    .line 15
    .line 16
    :goto_0
    iget v0, v0, Lyyds/ᛳᲇᛸᛵ;->ᛷᛲᲈᛱ:I

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lyyds/ᛳᛸᲀᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛸᲀᛳ;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final ᛲᲈᲁ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲇᛵᲁᛳ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲇᛵᲁᛳ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lyyds/ᛷᛸ;->ᛲᲈᲁ()Lyyds/ᛶᲇᲁᛵ;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-direct {v0, p0}, Lyyds/ᲇᛵᲁᛳ;-><init>(Lyyds/ᲁᛴᛲ;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final ᛳᛸᛴᛶ(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲈᛶᛱᛱ;Lyyds/ᛲᛲᲇᲈ;Lyyds/ᛶᲀᲈᛷ;Lyyds/ᲁᛵᛵ;)V
    .locals 9

    .line 1
    iput-object p4, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p4, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 4
    .line 5
    iget-boolean p4, p4, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᲈᛶᛱᛱ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    const-wide v1, -0x6ef8e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    invoke-static {v1, v3}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 45
    .line 46
    invoke-static {v5}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {p0, v3}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 78
    .line 79
    invoke-static {v5}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-static {v1}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lyyds/ᲇᲁᲁᲁ;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_2
    :goto_2
    move-object v5, v2

    .line 107
    check-cast v5, Lyyds/ᲀᛲᲈᛵ;

    .line 108
    .line 109
    iget-boolean v6, v5, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 110
    .line 111
    if-eqz v6, :cond_3

    .line 112
    .line 113
    invoke-virtual {v5}, Lyyds/ᲀᛲᲈᛵ;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    move-object v6, v5

    .line 118
    check-cast v6, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    if-eq v7, v6, :cond_2

    .line 133
    .line 134
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    check-cast v5, Ljava/lang/Number;

    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v1, v5, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {p1, v0, v3}, Lyyds/ᲈᛶᛱᛱ;->ᛷᛲᲈᛱ(ILjava/util/ArrayList;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lyyds/ᲈᛶᛱᛱ;->ᛲᛳᛶᲁ()V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_8

    .line 192
    .line 193
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-le v5, v3, :cond_d

    .line 202
    .line 203
    invoke-static {v2}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    instance-of v6, v5, Ljava/util/Collection;

    .line 208
    .line 209
    if-eqz v6, :cond_7

    .line 210
    .line 211
    move-object v6, v5

    .line 212
    check-cast v6, Ljava/util/Collection;

    .line 213
    .line 214
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_7

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_7
    invoke-virtual {v5}, Lyyds/ᲇᲁᲁᲁ;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    :cond_8
    move-object v6, v5

    .line 226
    check-cast v6, Lyyds/ᲀᛲᲈᛵ;

    .line 227
    .line 228
    iget-boolean v7, v6, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 229
    .line 230
    if-eqz v7, :cond_9

    .line 231
    .line 232
    invoke-virtual {v6}, Lyyds/ᲀᛲᲈᛵ;->nextInt()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-static {v7, v6}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-nez v6, :cond_8

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_9
    :goto_4
    invoke-static {v2}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    new-instance v5, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4}, Lyyds/ᲇᲁᲁᲁ;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    :cond_a
    :goto_5
    move-object v6, v4

    .line 265
    check-cast v6, Lyyds/ᲀᛲᲈᛵ;

    .line 266
    .line 267
    iget-boolean v7, v6, Lyyds/ᲀᛲᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 268
    .line 269
    if-eqz v7, :cond_b

    .line 270
    .line 271
    invoke-virtual {v6}, Lyyds/ᲀᛲᲈᛵ;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    move-object v7, v6

    .line 276
    check-cast v7, Ljava/lang/Number;

    .line 277
    .line 278
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    if-eq v8, v7, :cond_a

    .line 291
    .line 292
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-eqz v6, :cond_c

    .line 305
    .line 306
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    check-cast v6, Ljava/lang/Number;

    .line 311
    .line 312
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-virtual {v1, v6, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-interface {v0, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_c
    invoke-virtual {p1, v3, v5}, Lyyds/ᲈᛶᛱᛱ;->ᛷᛲᲈᛱ(ILjava/util/ArrayList;)V

    .line 332
    .line 333
    .line 334
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    invoke-interface {p0, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 343
    .line 344
    .line 345
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    sub-int/2addr v0, v3

    .line 350
    iget-object v2, p1, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 351
    .line 352
    invoke-virtual {v2, v3, v0}, Lyyds/ᛴᛲᲇᛵ;->ᲇᲈᛵᛷ(II)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Lyyds/ᲈᛶᛱᛱ;->ᛲᛳᛶᲁ()V

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_d
    :goto_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 363
    .line 364
    .line 365
    new-instance v2, Ljava/util/HashSet;

    .line 366
    .line 367
    const/16 v3, 0xc

    .line 368
    .line 369
    invoke-static {v4, v3}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-static {v3}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-static {v4, v2}, Lyyds/ᛷᛷᛶᲇ;->ᲁᛵᲁᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 381
    .line 382
    .line 383
    iget-object v3, p1, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 384
    .line 385
    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1}, Lyyds/ᛲᛵᲇᛳ;->ᲀᛲᛳᲀ()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1}, Lyyds/ᲈᛶᛱᛱ;->ᛲᛳᛶᲁ()V

    .line 395
    .line 396
    .line 397
    :goto_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    const/4 v2, 0x0

    .line 402
    if-eqz v0, :cond_e

    .line 403
    .line 404
    move v1, v2

    .line 405
    goto :goto_a

    .line 406
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    move v1, v2

    .line 411
    :cond_f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v3, :cond_11

    .line 416
    .line 417
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    check-cast v3, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 422
    .line 423
    invoke-virtual {p1, v3}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-eqz v3, :cond_f

    .line 428
    .line 429
    add-int/lit8 v1, v1, 0x1

    .line 430
    .line 431
    if-ltz v1, :cond_10

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_10
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᛵᛶᛲᲀ()V

    .line 435
    .line 436
    .line 437
    const/4 p0, 0x0

    .line 438
    throw p0

    .line 439
    :cond_11
    :goto_a
    iget-object p1, p2, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast p1, Landroid/widget/TextView;

    .line 442
    .line 443
    iget-object p2, p2, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast p2, Landroid/widget/Button;

    .line 446
    .line 447
    iget-boolean v0, p3, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 448
    .line 449
    if-eqz v0, :cond_12

    .line 450
    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    const-wide v3, -0xb5cbe68a836eL

    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 466
    .line 467
    .line 468
    move-result p0

    .line 469
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-wide v3, -0xb5d7e68a836eL

    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    goto :goto_b

    .line 489
    :cond_12
    if-eqz p4, :cond_13

    .line 490
    .line 491
    new-instance v0, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    const-wide v3, -0xb5dce68a836eL

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-wide v3, -0xb5e1e68a836eL

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    const-wide v3, -0xb5e5e68a836eL

    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object p0

    .line 543
    goto :goto_b

    .line 544
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-wide v3, -0xb5f2e68a836eL

    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 559
    .line 560
    .line 561
    move-result p0

    .line 562
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    const-wide v3, -0xb5f5e68a836eL

    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    const-wide v3, -0xb5f9e68a836eL

    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    :goto_b
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 597
    .line 598
    .line 599
    if-eqz p4, :cond_14

    .line 600
    .line 601
    goto :goto_c

    .line 602
    :cond_14
    const/16 v2, 0x8

    .line 603
    .line 604
    :goto_c
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 605
    .line 606
    .line 607
    iget-boolean p0, p3, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 608
    .line 609
    xor-int/lit8 p0, p0, 0x1

    .line 610
    .line 611
    invoke-virtual {p2, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 612
    .line 613
    .line 614
    iget-boolean p0, p3, Lyyds/ᛶᲀᲈᛷ;->ᲀᛲᛳᲀ:Z

    .line 615
    .line 616
    if-eqz p0, :cond_15

    .line 617
    .line 618
    const-wide p0, -0xb608e68a836eL

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    :goto_d
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    goto :goto_e

    .line 628
    :cond_15
    const-wide p0, -0xb60de68a836eL

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    goto :goto_d

    .line 634
    :goto_e
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 635
    .line 636
    .line 637
    return-void
.end method

.method public static ᛳᲁᲁᲇ(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lyyds/ᲀᛱᛳᲈ;->ᛳᲁᲁᲇ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const-class p0, Ljava/lang/Object;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    aget-object p0, p0, v1

    .line 63
    .line 64
    invoke-static {p0}, Lyyds/ᲀᛱᛳᲈ;->ᛳᲁᲁᲇ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_4
    if-nez p0, :cond_5

    .line 70
    .line 71
    const-string v0, "null"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_0
    const-string v1, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    .line 83
    .line 84
    const-string v2, "> is of type "

    .line 85
    .line 86
    invoke-static {v1, p0, v2, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛳᛶᲁ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    return-object p0
.end method

.method public static ᛵᛶᛲᲀ(I)[Lyyds/ᛳᲀᛷᛸ;
    .locals 3

    .line 1
    new-array v0, p0, [Lyyds/ᛳᲀᛷᛸ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    new-instance v2, Lyyds/ᛳᲀᛷᛸ;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    aput-object v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0
.end method

.method public static final ᛵᛸᛸᛷ()Lyyds/ᲇᛵᲁᛳ;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᲇᛵᲁᛳ;

    .line 2
    .line 3
    invoke-static {}, Lyyds/ᛸᛳᛷᛳ;->ᛲᲈᲁ()Lyyds/ᲁᲀᲇᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 8
    .line 9
    sget-object v2, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lyyds/ᲇᛵᲁᛳ;-><init>(Lyyds/ᲁᛴᛲ;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static ᛶᛳᛶᛵ(Landroid/content/Context;Ljava/util/List;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lyyds/ᛲᛴᛷᲁ;

    .line 24
    .line 25
    invoke-virtual {v0, p0, v1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    return v1
.end method

.method public static ᛶᛷᛲᲁ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lyyds/ᛳᛵᲀᛴ;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lyyds/ᲀᛱᛳᲈ;->ᛶᛷᛲᲁ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Lyyds/ᛳᛵᲀᛴ;-><init>(Ljava/lang/reflect/Type;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    return-object p0

    .line 28
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 33
    .line 34
    new-instance v0, Lyyds/ᛸᛳᲈᲁ;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Class;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {v0, v1, v2, p0}, Lyyds/ᛸᛳᲈᲁ;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 59
    .line 60
    new-instance v0, Lyyds/ᛳᛵᲀᛴ;

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v0, p0}, Lyyds/ᛳᛵᲀᛴ;-><init>(Ljava/lang/reflect/Type;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 75
    .line 76
    new-instance v0, Lyyds/ᛳᛳᲀᲇ;

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v0, v1, p0}, Lyyds/ᛳᛳᲀᲇ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_4
    return-object p0
.end method

.method public static ᛶᛸᲀᲁ(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final ᛶᲈᛴᲈ(Lyyds/ᛷᛸᛶᲁ;Lyyds/ᛷᛸᛶᲁ;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p2}, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p1, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    new-instance p2, Lyyds/ᛲᛸᛶᛳ;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p2, p1, v0}, Lyyds/ᛲᛸᛶᛳ;-><init>(Ljava/lang/Throwable;Z)V

    .line 14
    .line 15
    .line 16
    move-object p1, p2

    .line 17
    :goto_0
    sget-object p2, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛸᛴᛵᛶ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 27
    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    instance-of p1, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    invoke-static {p0}, Lyyds/ᛲᛷᛵᲇ;->ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :goto_1
    return-object p2

    .line 40
    :cond_2
    check-cast p0, Lyyds/ᛲᛸᛶᛳ;

    .line 41
    .line 42
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 43
    .line 44
    throw p0
.end method

.method public static ᛷᛲᲈᛱ(Ljava/lang/String;)Lyyds/ᲇᲁᲀᲁ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 10
    .line 11
    .line 12
    iput-object p0, v0, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public static ᛷᛵᲇᲀ(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    return v0

    .line 71
    :cond_3
    return v2

    .line 72
    :cond_4
    instance-of v1, p0, Ljava/lang/reflect/GenericArrayType;

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    return v2

    .line 81
    :cond_5
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p0, p1}, Lyyds/ᲀᛱᛳᲈ;->ᛷᛵᲇᲀ(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_6
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    .line 99
    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    instance-of v1, p1, Ljava/lang/reflect/WildcardType;

    .line 103
    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_8

    .line 138
    .line 139
    return v0

    .line 140
    :cond_8
    return v2

    .line 141
    :cond_9
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    .line 142
    .line 143
    if-eqz v1, :cond_b

    .line 144
    .line 145
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 146
    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    return v2

    .line 150
    :cond_a
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 151
    .line 152
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_b

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_b

    .line 181
    .line 182
    return v0

    .line 183
    :cond_b
    return v2
.end method

.method public static ᛷᲈᲈᲁ(IF)I
    .locals 0

    .line 1
    int-to-float p0, p0

    .line 2
    mul-float/2addr p0, p1

    .line 3
    const/high16 p1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    add-float/2addr p0, p1

    .line 6
    float-to-int p0, p0

    .line 7
    return p0
.end method

.method public static ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    instance-of v2, p2, Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_9

    .line 7
    .line 8
    move-object v2, p2

    .line 9
    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .line 10
    .line 11
    invoke-virtual {p3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ljava/lang/reflect/Type;

    .line 16
    .line 17
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_1
    return-object v4

    .line 25
    :cond_2
    invoke-virtual {p3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :cond_3
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of v4, p2, Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Class;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    move-object p2, v0

    .line 43
    :goto_0
    if-nez p2, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    invoke-static {p0, p1, p2}, Lyyds/ᲀᛱᛳᲈ;->ᛲᛲᲈᲈ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    array-length v5, p2

    .line 59
    :goto_1
    if-ge v3, v5, :cond_7

    .line 60
    .line 61
    aget-object v6, p2, v3

    .line 62
    .line 63
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_6

    .line 68
    .line 69
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    aget-object p2, p2, v3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_8
    :goto_2
    move-object p2, v2

    .line 88
    :goto_3
    if-ne p2, v2, :cond_0

    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_9
    instance-of v0, p2, Ljava/lang/Class;

    .line 93
    .line 94
    if-eqz v0, :cond_b

    .line 95
    .line 96
    move-object v0, p2

    .line 97
    check-cast v0, Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_b

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p0, p1, p2, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p2, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_a

    .line 118
    .line 119
    move-object p2, v0

    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_a
    new-instance p1, Lyyds/ᛳᛵᲀᛴ;

    .line 123
    .line 124
    invoke-direct {p1, p0}, Lyyds/ᛳᛵᲀᛴ;-><init>(Ljava/lang/reflect/Type;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    move-object p2, p1

    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_b
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 131
    .line 132
    if-eqz v0, :cond_d

    .line 133
    .line 134
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 135
    .line 136
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {p0, p1, v0, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_c

    .line 149
    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_c
    new-instance p1, Lyyds/ᛳᛵᲀᛴ;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Lyyds/ᛳᛵᲀᛴ;-><init>(Ljava/lang/reflect/Type;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_d
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    if-eqz v0, :cond_12

    .line 162
    .line 163
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 164
    .line 165
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p0, p1, v0, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    array-length v6, v5

    .line 182
    move-object v7, v5

    .line 183
    move v5, v3

    .line 184
    :goto_5
    if-ge v3, v6, :cond_10

    .line 185
    .line 186
    aget-object v8, v7, v3

    .line 187
    .line 188
    invoke-static {p0, p1, v8, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    aget-object v9, v7, v3

    .line 193
    .line 194
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-nez v9, :cond_f

    .line 199
    .line 200
    if-nez v5, :cond_e

    .line 201
    .line 202
    invoke-virtual {v7}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    move-object v7, v5

    .line 207
    check-cast v7, [Ljava/lang/reflect/Type;

    .line 208
    .line 209
    move v5, v2

    .line 210
    :cond_e
    aput-object v8, v7, v3

    .line 211
    .line 212
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_10
    if-eqz v0, :cond_11

    .line 216
    .line 217
    if-eqz v5, :cond_16

    .line 218
    .line 219
    :cond_11
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Ljava/lang/Class;

    .line 224
    .line 225
    new-instance p1, Lyyds/ᛸᛳᲈᲁ;

    .line 226
    .line 227
    invoke-direct {p1, v4, p0, v7}, Lyyds/ᛸᛳᲈᲁ;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_12
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    .line 232
    .line 233
    if-eqz v0, :cond_16

    .line 234
    .line 235
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 236
    .line 237
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    array-length v5, v0

    .line 246
    if-ne v5, v2, :cond_14

    .line 247
    .line 248
    aget-object v4, v0, v3

    .line 249
    .line 250
    invoke-static {p0, p1, v4, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    aget-object p1, v0, v3

    .line 255
    .line 256
    if-eq p0, p1, :cond_16

    .line 257
    .line 258
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 259
    .line 260
    if-eqz p1, :cond_13

    .line 261
    .line 262
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 263
    .line 264
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    goto :goto_6

    .line 269
    :cond_13
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 270
    .line 271
    aput-object p0, p1, v3

    .line 272
    .line 273
    move-object p0, p1

    .line 274
    :goto_6
    new-instance p2, Lyyds/ᛳᛳᲀᲇ;

    .line 275
    .line 276
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 277
    .line 278
    const-class v0, Ljava/lang/Object;

    .line 279
    .line 280
    aput-object v0, p1, v3

    .line 281
    .line 282
    invoke-direct {p2, p1, p0}, Lyyds/ᛳᛳᲀᲇ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_14
    array-length v0, v4

    .line 287
    if-ne v0, v2, :cond_16

    .line 288
    .line 289
    aget-object v0, v4, v3

    .line 290
    .line 291
    invoke-static {p0, p1, v0, p3}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    aget-object p1, v4, v3

    .line 296
    .line 297
    if-eq p0, p1, :cond_16

    .line 298
    .line 299
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 300
    .line 301
    if-eqz p1, :cond_15

    .line 302
    .line 303
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 304
    .line 305
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    goto :goto_7

    .line 310
    :cond_15
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 311
    .line 312
    aput-object p0, p1, v3

    .line 313
    .line 314
    move-object p0, p1

    .line 315
    :goto_7
    new-instance p2, Lyyds/ᛳᛳᲀᲇ;

    .line 316
    .line 317
    sget-object p1, Lyyds/ᲀᛱᛳᲈ;->ᛲᲈᲁ:[Ljava/lang/reflect/Type;

    .line 318
    .line 319
    invoke-direct {p2, p0, p1}, Lyyds/ᛳᛳᲀᲇ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 320
    .line 321
    .line 322
    :cond_16
    :goto_8
    if-eqz v1, :cond_17

    .line 323
    .line 324
    invoke-virtual {p3, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_17
    return-object p2
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/Context;Ljava/lang/String;IFLyyds/ᲁᛶᲁᲀ;)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p0, 0x41600000    # 14.0f

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x11

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {v0, p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 33
    .line 34
    .line 35
    const p2, 0x18fe2c55

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p3}, Lyyds/ᲀᛱᛳᲈ;->ᛷᲈᲈᲁ(IF)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const p2, 0x66fe2c55

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 49
    .line 50
    .line 51
    const/16 p1, 0xc

    .line 52
    .line 53
    invoke-static {p1, p3}, Lyyds/ᲀᛱᛳᲈ;->ᛷᲈᲈᲁ(IF)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-float p1, p1

    .line 58
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, Lyyds/ᛶᲇᲁᲀ;

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-direct {p0, p1, p4}, Lyyds/ᛶᲇᲁᲀ;-><init>(ILyyds/ᲁᛶᲁᲀ;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static ᲇᛱᛲ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object p0, p0, v0

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0, p1, p2}, Lyyds/ᲀᛱᛳᲈ;->ᛲᛲᲈᲈ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1, p2, v0}, Lyyds/ᲀᛱᛳᲈ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, " is not the same as or a subtype of "

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public static ᲇᲇᲇᛱ(Lyyds/ᲇᛵᲁᛳ;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛵᲁᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lyyds/ᲈᲇᲈᲇ;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-interface {v0, p0}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "Scope cannot be cancelled because it does not have a job: "

    .line 19
    .line 20
    invoke-static {p0, v0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᛶᲀᛱᛵ;Lyyds/ᛶᛳᲇᛳ;)V
    .locals 12

    .line 1
    iget p1, p1, Lyyds/ᛶᛳᲇᛳ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/16 p1, 0xa

    .line 8
    .line 9
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const-string v4, "(D)Ljava/lang/Double;"

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/16 v1, 0xb8

    .line 17
    .line 18
    const-string v2, "java/lang/Double"

    .line 19
    .line 20
    const-string v3, "valueOf"

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    invoke-virtual/range {v0 .. v5}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    move-object v6, p0

    .line 28
    const-string v10, "(J)Ljava/lang/Long;"

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    const/16 v7, 0xb8

    .line 32
    .line 33
    const-string v8, "java/lang/Long"

    .line 34
    .line 35
    const-string v9, "valueOf"

    .line 36
    .line 37
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    move-object v6, p0

    .line 42
    const-string v10, "(F)Ljava/lang/Float;"

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/16 v7, 0xb8

    .line 46
    .line 47
    const-string v8, "java/lang/Float"

    .line 48
    .line 49
    const-string v9, "valueOf"

    .line 50
    .line 51
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_3
    move-object v6, p0

    .line 56
    const-string v10, "(I)Ljava/lang/Integer;"

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    const/16 v7, 0xb8

    .line 60
    .line 61
    const-string v8, "java/lang/Integer"

    .line 62
    .line 63
    const-string v9, "valueOf"

    .line 64
    .line 65
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_4
    move-object v6, p0

    .line 70
    const-string v10, "(S)Ljava/lang/Short;"

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/16 v7, 0xb8

    .line 74
    .line 75
    const-string v8, "java/lang/Short"

    .line 76
    .line 77
    const-string v9, "valueOf"

    .line 78
    .line 79
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    move-object v6, p0

    .line 84
    const-string v10, "(B)Ljava/lang/Byte;"

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    const/16 v7, 0xb8

    .line 88
    .line 89
    const-string v8, "java/lang/Byte"

    .line 90
    .line 91
    const-string v9, "valueOf"

    .line 92
    .line 93
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_6
    move-object v6, p0

    .line 98
    const-string v10, "(C)Ljava/lang/Character;"

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    const/16 v7, 0xb8

    .line 102
    .line 103
    const-string v8, "java/lang/Character"

    .line 104
    .line 105
    const-string v9, "valueOf"

    .line 106
    .line 107
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_7
    move-object v6, p0

    .line 112
    const-string v10, "(Z)Ljava/lang/Boolean;"

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    const/16 v7, 0xb8

    .line 116
    .line 117
    const-string v8, "java/lang/Boolean"

    .line 118
    .line 119
    const-string v9, "valueOf"

    .line 120
    .line 121
    invoke-virtual/range {v6 .. v11}, Lyyds/ᛶᲀᛱᛵ;->ᲀᛲᛲᲇ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
