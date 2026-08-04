.class public final Lyyds/ᛲᛱᲁᲁ;
.super Lyyds/ᲀᛶᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Ljava/util/List;

.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public final ᲇᲇᲇᛱ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lyyds/ᲀᛶᲁᛵ;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "(...)"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "()"

    .line 16
    .line 17
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lyyds/ᛲᛱᲁᲁ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-object p1, p0, Lyyds/ᛲᛱᲁᲁ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p2, p0, Lyyds/ᛲᛱᲁᲁ;->ᛱᲈᲁ:Ljava/util/List;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Lyyds/ᛲᛱᲁᲁ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p1, p0, Lyyds/ᛲᛱᲁᲁ;->ᛱᲈᲁ:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 2

    .line 1
    iget-object p1, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 2
    .line 3
    sget-object p2, Lyyds/ᛸᛸᛴᛷ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 4
    .line 5
    iget-object p3, p0, Lyyds/ᛲᛱᲁᲁ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz p2, :cond_6

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    if-nez p2, :cond_5

    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᛲᛱᲁᲁ;->ᛱᲈᲁ:Ljava/util/List;

    .line 22
    .line 23
    if-eqz p0, :cond_4

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Lyyds/ᛸᲀᲀᛵ;

    .line 40
    .line 41
    iget p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᛲᲈᲁ:I

    .line 42
    .line 43
    invoke-static {p3}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    if-eq p3, v0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance p3, Lyyds/ᲁᛳᛸᛷ;

    .line 54
    .line 55
    iget-object v0, p2, Lyyds/ᛸᲀᲀᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛳᛵᲇ;

    .line 56
    .line 57
    iget-object v1, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-direct {p3, v0, v1, p1}, Lyyds/ᲁᛳᛸᛷ;-><init>(Lyyds/ᲈᛳᛵᲇ;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p2, Lyyds/ᛸᲀᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget-object v0, p2, Lyyds/ᛸᲀᲀᛵ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛴᲁᲁ;

    .line 71
    .line 72
    invoke-virtual {p3, v0}, Lyyds/ᲁᛳᛸᛷ;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    :cond_2
    iput-object p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛴᲁᲁ;

    .line 79
    .line 80
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    iput-object p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Boolean;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-nez p3, :cond_0

    .line 92
    .line 93
    new-instance p3, Lyyds/ᲀᛴᛱᛷ;

    .line 94
    .line 95
    iget-object v0, p1, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 96
    .line 97
    const/16 v0, 0x13

    .line 98
    .line 99
    invoke-direct {p3, v0}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 100
    .line 101
    .line 102
    iput-object p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛴᲁᲁ;

    .line 103
    .line 104
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    iput-object p3, p2, Lyyds/ᛸᲀᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Boolean;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    const/4 p0, 0x0

    .line 110
    throw p0

    .line 111
    :cond_5
    :try_start_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 114
    .line 115
    .line 116
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    :catch_0
    move-exception p0

    .line 118
    new-instance p1, Lyyds/ᲇᲈᛸᲀ;

    .line 119
    .line 120
    const-string p2, "Function of name: "

    .line 121
    .line 122
    const-string p4, " cannot be created"

    .line 123
    .line 124
    invoke-static {p2, p3, p4}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_6
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 133
    .line 134
    const-string p1, "Function with name: "

    .line 135
    .line 136
    const-string p2, " does not exist."

    .line 137
    .line 138
    invoke-static {p1, p3, p2}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛱᲁᲁ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "."

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
