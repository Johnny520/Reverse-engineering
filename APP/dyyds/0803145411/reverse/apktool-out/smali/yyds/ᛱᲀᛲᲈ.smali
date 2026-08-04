.class public final Lyyds/ᛱᲀᛲᲈ;
.super Lyyds/ᲀᛶᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public final ᲇᲇᲇᛱ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;C)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᛱᲀᛲᲈ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lyyds/ᛱᲀᛲᲈ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 20
    .line 21
    const-string p1, "Empty properties"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 3

    .line 1
    iget-object p2, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 2
    .line 3
    iget-object v0, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v0, p3, Ljava/util/Map;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛱᲈᲁ()Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_5

    .line 17
    .line 18
    iget-object p4, p2, Lyyds/ᛴᲈᛳᛶ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 19
    .line 20
    sget-object v0, Lyyds/ᛲᲀᲇᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲀᲇᲇ;

    .line 21
    .line 22
    invoke-interface {p4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_0

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    if-nez p3, :cond_1

    .line 31
    .line 32
    const-string p3, "null"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    :goto_0
    new-instance p4, Lyyds/ᛷᛵᛳᲈ;

    .line 44
    .line 45
    invoke-virtual {p0}, Lyyds/ᛱᲀᛲᲈ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p2, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "Expected to find an object with property "

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, " in path "

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p0, " but found \'"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, "\'. This is not a json object according to the JsonProvider: \'"

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p0, "\'."

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p4, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p4

    .line 106
    :cond_2
    iget-object p2, p0, Lyyds/ᛱᲀᛲᲈ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v1, 0x1

    .line 113
    if-ne v0, v1, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛴᛳᛲ()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-le v0, v1, :cond_4

    .line 127
    .line 128
    :goto_1
    invoke-virtual {p0, p1, p3, p4, p2}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/lang/String;

    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1, p3, p4, v0}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    :goto_3
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛱᲀᛲᲈ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛱᲀᛲᲈ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 11
    .line 12
    const-string v2, ","

    .line 13
    .line 14
    invoke-static {v2, v1, p0}, Lyyds/ᛴᛸᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "]"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛲᲈ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛴᛳᛲ()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-le p0, v2, :cond_1

    .line 22
    .line 23
    :goto_0
    return v2

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method
