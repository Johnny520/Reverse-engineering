.class public final Lxhss/ᛱᛸᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛲᛵᲀᲈ;


# instance fields
.field public final ᛷᛵᛵᲈ:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    const-class v22, Lxhss/ᛷᲁᛴᛵ;

    .line 2
    .line 3
    const-class v23, Lxhss/ᛳᛳᛵᲈ;

    .line 4
    .line 5
    const-class v1, Lxhss/ᛱᛳᲇᛶ;

    .line 6
    .line 7
    const-class v2, Lxhss/ᛷᛴᛲᛲ;

    .line 8
    .line 9
    const-class v3, Lxhss/ᛵᲇᛱᛴ;

    .line 10
    .line 11
    const-class v4, Lxhss/ᛸᛵᛵᲈ;

    .line 12
    .line 13
    const-class v5, Lxhss/ᛵᛳᛵᛱ;

    .line 14
    .line 15
    const-class v6, Lxhss/ᲈᛴᲁᛵ;

    .line 16
    .line 17
    const-class v7, Lxhss/ᛷᛶᛵᛸ;

    .line 18
    .line 19
    const-class v8, Lxhss/ᲇᛱᛳᛳ;

    .line 20
    .line 21
    const-class v9, Lxhss/ᲇᛸᲀᲇ;

    .line 22
    .line 23
    const-class v10, Lxhss/ᛶᲇᲈᛱ;

    .line 24
    .line 25
    const-class v11, Lxhss/ᛱᲈᛷᛸ;

    .line 26
    .line 27
    const-class v12, Lxhss/ᛳᛱᛳᛳ;

    .line 28
    .line 29
    const-class v13, Lxhss/ᛵᛸᲈᛷ;

    .line 30
    .line 31
    const-class v14, Lxhss/ᛳᛵᲇᛸ;

    .line 32
    .line 33
    const-class v15, Lxhss/ᛳᛵᛵᲁ;

    .line 34
    .line 35
    const-class v16, Lxhss/ᛸᲁᛷᛳ;

    .line 36
    .line 37
    const-class v17, Lxhss/ᲀᲁᛷᛴ;

    .line 38
    .line 39
    const-class v18, Lxhss/ᲇᛳᛳᲈ;

    .line 40
    .line 41
    const-class v19, Lxhss/ᲈᲇᛸᛵ;

    .line 42
    .line 43
    const-class v20, Lxhss/ᛵᛱᛷ;

    .line 44
    .line 45
    const-class v21, Lxhss/ᛴᲁᛵᛵ;

    .line 46
    .line 47
    filled-new-array/range {v1 .. v23}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lxhss/ᛱᲀᛷᛳ;->ᲁᲁᛴᲁ([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v2, 0x0

    .line 69
    move v3, v2

    .line 70
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    add-int/lit8 v5, v3, 0x1

    .line 81
    .line 82
    if-ltz v3, :cond_0

    .line 83
    .line 84
    check-cast v4, Ljava/lang/Class;

    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    new-instance v6, Lxhss/ᲀᛴᛳᛸ;

    .line 91
    .line 92
    invoke-direct {v6, v4, v3}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move v3, v5

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-static {}, Lxhss/ᛱᲀᛷᛳ;->ᛳᛸᛵᲀ()V

    .line 101
    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    throw v0

    .line 105
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    const/4 v3, 0x1

    .line 112
    if-eq v0, v3, :cond_2

    .line 113
    .line 114
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-static {v2}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛶᲈᛶ(I)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_3

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Lxhss/ᲀᛴᛳᛸ;

    .line 142
    .line 143
    iget-object v3, v2, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 144
    .line 145
    iget-object v2, v2, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lxhss/ᲀᛴᛳᛸ;

    .line 156
    .line 157
    iget-object v1, v0, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 158
    .line 159
    iget-object v0, v0, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 160
    .line 161
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 162
    .line 163
    .line 164
    :cond_3
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᛸᛷᛸ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lxhss/ᛱᛸᛷᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lxhss/ᛱᛸᛷᛸ;

    .line 10
    .line 11
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛸᛷᛸ;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛱᛸᛷᛸ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, " (Kotlin reflection is not available)"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛸᛷᛸ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
