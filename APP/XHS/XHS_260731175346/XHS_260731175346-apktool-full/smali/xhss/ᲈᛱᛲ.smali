.class public final Lxhss/ᲈᛱᛲ;
.super Lxhss/ᛳᛳᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛸᛴᛶᛳ:Ljava/util/List;

.field public final ᲀᲇᛳᲁ:Ljava/lang/String;

.field public final ᲇᛶᛴᲀ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxhss/ᛳᛳᛵᛱ;-><init>()V

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
    iput-object v0, p0, Lxhss/ᲈᛱᛲ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-object p1, p0, Lxhss/ᲈᛱᛲ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p2, p0, Lxhss/ᲈᛱᛲ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Lxhss/ᲈᛱᛲ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p1, p0, Lxhss/ᲈᛱᛲ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᲈᛱᛲ;->ᲀᲇᛳᲁ:Ljava/lang/String;

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

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V
    .locals 2

    .line 1
    iget-object p1, p4, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 2
    .line 3
    sget-object p2, Lxhss/ᲁᛳᛳᛱ;->ᛷᛵᛵᲈ:Ljava/util/Map;

    .line 4
    .line 5
    iget-object p3, p0, Lxhss/ᲈᛱᛲ;->ᲇᛶᛴᲀ:Ljava/lang/String;

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
    iget-object p0, p0, Lxhss/ᲈᛱᛲ;->ᛸᛴᛶᛳ:Ljava/util/List;

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
    check-cast p2, Lxhss/ᛴᛸᛵᛴ;

    .line 40
    .line 41
    iget p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᛷᛵᛵᲈ:I

    .line 42
    .line 43
    invoke-static {p3}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

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
    new-instance p3, Lxhss/ᲁᛸᛶᛳ;

    .line 54
    .line 55
    iget-object v0, p2, Lxhss/ᛴᛸᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲀᛴ;

    .line 56
    .line 57
    iget-object v1, p4, Lxhss/ᛵᲈᛷ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-direct {p3, v0, v1, p1}, Lxhss/ᲁᛸᛶᛳ;-><init>(Lxhss/ᛴᲇᲀᛴ;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p2, Lxhss/ᛴᛸᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Boolean;

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
    iget-object v0, p2, Lxhss/ᛴᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛷᛷ;

    .line 71
    .line 72
    invoke-virtual {p3, v0}, Lxhss/ᲁᛸᛶᛳ;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    :cond_2
    iput-object p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛷᛷ;

    .line 79
    .line 80
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    iput-object p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Boolean;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Boolean;

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
    new-instance p3, Lxhss/ᛶᛵᲇᛸ;

    .line 94
    .line 95
    iget-object v0, p1, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 96
    .line 97
    const/4 v0, 0x4

    .line 98
    invoke-direct {p3, v0}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 99
    .line 100
    .line 101
    iput-object p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛷᛷ;

    .line 102
    .line 103
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object p3, p2, Lxhss/ᛴᛸᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Boolean;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    const/4 p0, 0x0

    .line 109
    throw p0

    .line 110
    :cond_5
    :try_start_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    :catch_0
    move-exception p0

    .line 117
    new-instance p1, Lxhss/ᲁᲀᛳ;

    .line 118
    .line 119
    const-string p2, "Function of name: "

    .line 120
    .line 121
    const-string p4, " cannot be created"

    .line 122
    .line 123
    invoke-static {p2, p3, p4}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_6
    new-instance p0, Lxhss/ᲁᲀᛳ;

    .line 132
    .line 133
    const-string p1, "Function with name: "

    .line 134
    .line 135
    const-string p2, " does not exist."

    .line 136
    .line 137
    invoke-static {p1, p3, p2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p0
.end method

.method public final ᲀᲇᛳᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
