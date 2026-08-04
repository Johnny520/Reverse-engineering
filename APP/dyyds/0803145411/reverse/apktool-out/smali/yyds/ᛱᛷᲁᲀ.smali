.class public final Lyyds/ᛱᛷᲁᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲈᛳᛵᲇ;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lyyds/ᛱᛵᛱᛱ;->ᛷᲈᲈᲁ(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)Lyyds/ᲈᛳᛵᲇ;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᛱᛷᲁᲀ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛵᲇ;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛶᛳᛳ;
    .locals 5

    .line 1
    sget-object v0, Lyyds/ᛶᛴᛱᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛴᛱᲀ;

    .line 2
    .line 3
    invoke-static {}, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ()Lyyds/ᛲᛲᲇᲈ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lyyds/ᛱᛱᛴ;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2}, Lyyds/ᛱᛱᛴ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    const-class v0, Lyyds/ᛲᲀᲇᲇ;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/EnumSet;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ()Lyyds/ᛴᲈᛳᛶ;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "json string can not be null or empty"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lyyds/ᛴᛸᛲ;->ᛱᲈᲁ(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    :try_start_0
    new-instance v2, Lyyds/ᛶᛵᲁᛳ;

    .line 46
    .line 47
    const/16 v3, -0x2001

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lyyds/ᛶᛵᲁᛳ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lyyds/ᛳᲇᛵᲇ;

    .line 55
    .line 56
    iget-object v4, v2, Lyyds/ᛶᛵᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲀᲀᛸᛳ;

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    new-instance v4, Lyyds/ᲀᲀᛸᛳ;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lyyds/ᲀᲀᛸᛳ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, Lyyds/ᛶᛵᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲀᲀᛸᛳ;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v4, p0, v1}, Lyyds/ᲀᲀᛸᛳ;->ᲇᲈᛵᛷ(Ljava/lang/String;Lyyds/ᛵᲀᛵᲁ;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catch Lyyds/ᲁᛵᛷᲁ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    new-instance v1, Lyyds/ᛲᛶᛳᛳ;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0}, Lyyds/ᛲᛶᛳᛳ;-><init>(Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :catch_0
    move-exception p0

    .line 78
    new-instance v0, Lyyds/ᛶᛲᲈᛴ;

    .line 79
    .line 80
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public static varargs ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lyyds/ᛶᛴᛱᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛴᛱᲀ;

    .line 2
    .line 3
    invoke-static {}, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ()Lyyds/ᛲᛲᲇᲈ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lyyds/ᛱᛱᛴ;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v2}, Lyyds/ᛱᛱᛴ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    const-class v0, Lyyds/ᛲᲀᲇᲇ;

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/EnumSet;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ()Lyyds/ᛴᲈᛳᛶ;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "json string can not be null or empty"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lyyds/ᛴᛸᛲ;->ᛱᲈᲁ(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    :try_start_0
    new-instance v2, Lyyds/ᛶᛵᲁᛳ;

    .line 46
    .line 47
    const/16 v3, -0x2001

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lyyds/ᛶᛵᲁᛳ;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lyyds/ᛳᲇᛵᲇ;

    .line 55
    .line 56
    iget-object v4, v2, Lyyds/ᛶᛵᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲀᲀᛸᛳ;

    .line 57
    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    new-instance v4, Lyyds/ᲀᲀᛸᛳ;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lyyds/ᲀᲀᛸᛳ;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, Lyyds/ᛶᛵᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲀᲀᛸᛳ;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v4, p0, v1}, Lyyds/ᲀᲀᛸᛳ;->ᲇᲈᛵᛷ(Ljava/lang/String;Lyyds/ᛵᲀᛵᲁ;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catch Lyyds/ᲁᛵᛷᲁ; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    new-instance v1, Lyyds/ᛲᛶᛳᛳ;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0}, Lyyds/ᛲᛶᛳᛳ;-><init>(Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1, p2}, Lyyds/ᛲᛶᛳᛳ;->ᛲᲈᲁ(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)Ljava/lang/Object;

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
    new-instance p1, Lyyds/ᛶᛲᲈᛴ;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method
