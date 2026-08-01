.class public final Lxhss/ᛴᛶᛷᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛴᲇᲀᛴ;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lxhss/ᛸᛷᲁᛵ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "path can not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lxhss/ᛳᛱᛲᲀ;->ᲈᛳᲀ(Ljava/lang/String;[Lxhss/ᛸᛷᲁᛵ;)Lxhss/ᛴᲇᲀᛴ;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lxhss/ᛴᛶᛷᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛴᲇᲀᛴ;

    .line 14
    .line 15
    return-void
.end method

.method public static varargs ᛱᛱᛲᲇ(Ljava/lang/String;Ljava/lang/String;[Lxhss/ᛸᛷᲁᛵ;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lxhss/ᛶᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᛳ;

    .line 2
    .line 3
    invoke-static {}, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛶ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2}, Lxhss/ᲇᛵᛲᲁ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    const-class v0, Lxhss/ᛳᛳᛱᛳ;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/EnumSet;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lxhss/ᲇᛸᛶ;->ᛷᛵᛵᲈ()Lxhss/ᲀᛲᲇ;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "json string can not be null or empty"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛳᲈᲈᛲ(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    :try_start_0
    new-instance v2, Lxhss/ᲀᛱᛸᛶ;

    .line 46
    .line 47
    const/16 v3, -0x2001

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lxhss/ᲀᛱᛸᛶ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lxhss/ᛸᛵᛷᲁ;

    .line 55
    .line 56
    iget-object v4, v2, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    new-instance v4, Lxhss/ᛸᛱᛱᛳ;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lxhss/ᛸᛱᛱᛳ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v4, p0, v1}, Lxhss/ᛸᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;Lxhss/ᛵᛳᲈᛶ;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catch Lxhss/ᲇᛳᲇᛷ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    new-instance v1, Lxhss/ᛸᛴᛳᲈ;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0}, Lxhss/ᛸᛴᛳᲈ;-><init>(Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1, p2}, Lxhss/ᛸᛴᛳᲈ;->ᛷᛵᛵᲈ(Ljava/lang/String;[Lxhss/ᛸᛷᲁᛵ;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :catch_0
    move-exception p0

    .line 82
    new-instance p1, Lxhss/ᛷᛴᛵᛴ;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/String;)Lxhss/ᛸᛴᛳᲈ;
    .locals 5

    .line 1
    sget-object v0, Lxhss/ᛶᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᛳ;

    .line 2
    .line 3
    invoke-static {}, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ()Lxhss/ᲇᛸᛶ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2}, Lxhss/ᲇᛵᛲᲁ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    const-class v0, Lxhss/ᛳᛳᛱᛳ;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/EnumSet;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lxhss/ᲇᛸᛶ;->ᛷᛵᛵᲈ()Lxhss/ᲀᛲᲇ;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "json string can not be null or empty"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛳᲈᲈᛲ(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    :try_start_0
    new-instance v2, Lxhss/ᲀᛱᛸᛶ;

    .line 46
    .line 47
    const/16 v3, -0x2001

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lxhss/ᲀᛱᛸᛶ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lxhss/ᛸᛵᛷᲁ;

    .line 55
    .line 56
    iget-object v4, v2, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    new-instance v4, Lxhss/ᛸᛱᛱᛳ;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lxhss/ᛸᛱᛱᛳ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, Lxhss/ᲀᛱᛸᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v4, p0, v1}, Lxhss/ᛸᛱᛱᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;Lxhss/ᛵᛳᲈᛶ;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catch Lxhss/ᲇᛳᲇᛷ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    new-instance v1, Lxhss/ᛸᛴᛳᲈ;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0}, Lxhss/ᛸᛴᛳᲈ;-><init>(Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :catch_0
    move-exception p0

    .line 78
    new-instance v0, Lxhss/ᛷᛴᛵᛴ;

    .line 79
    .line 80
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method
