.class public abstract Lyyds/ᛱᛸᲁᲇ;
.super Lyyds/ᛴᲈᛱᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᛱᛶᛸ;
.implements Lyyds/ᛴᲈᛳᲀ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛲ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lyyds/ᛴᲈᛱᛷ;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lyyds/ᲈᲇᲈᲇ;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lyyds/ᛴᲈᛱᛷ;->ᲈᛷᲈᛶ(Lyyds/ᲈᲇᲈᲇ;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lyyds/ᛲᛸᛶᛳ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lyyds/ᛲᛸᛶᛳ;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛸᛴᛵᛶ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lyyds/ᛱᛸᲁᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛶᛵᛸᛲ(ILyyds/ᛱᛸᲁᲇ;Lyyds/ᛲᲇᲁᛴ;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 6
    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    :try_start_0
    iget-object p1, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    invoke-static {p3}, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3, p2, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    :try_start_2
    invoke-static {p1, v0}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 36
    .line 37
    if-eq p2, p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lyyds/ᛱᛸᲁᲇ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception p2

    .line 46
    :try_start_3
    invoke-static {p1, v0}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :goto_0
    new-instance p2, Lyyds/ᲈᛵᛵᛴ;

    .line 51
    .line 52
    invoke-direct {p2, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2}, Lyyds/ᛱᛸᲁᲇ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    check-cast p3, Lyyds/ᛲᛴᛷᛳ;

    .line 64
    .line 65
    invoke-virtual {p3, p2, p0}, Lyyds/ᛲᛴᛷᛳ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0, v0}, Lyyds/ᛲᛱᛶᛸ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void

    .line 77
    :cond_3
    :try_start_4
    check-cast p3, Lyyds/ᛲᛴᛷᛳ;

    .line 78
    .line 79
    invoke-virtual {p3, p2, p0}, Lyyds/ᛲᛴᛷᛳ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v0, p1}, Lyyds/ᛲᛸᲈᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_2
    move-exception p1

    .line 92
    new-instance p2, Lyyds/ᲈᛵᛵᛴ;

    .line 93
    .line 94
    invoke-direct {p2, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p2}, Lyyds/ᛱᛸᲁᲇ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method public final ᛷᛴᛴᲁ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of p0, p1, Lyyds/ᛲᛸᛶᛳ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛲᛸᛶᛳ;

    .line 6
    .line 7
    sget-object p0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 8
    .line 9
    sget-wide v0, Lyyds/ᛲᛸᛶᛳ;->ᛵᛸᛸᛷ:J

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᛸᛳᛵᛳ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛷᛲᲁ(Lyyds/ᲁᛴᛲ;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲀᛲᛲᲇ()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛸᲁᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    return-object p0
.end method
