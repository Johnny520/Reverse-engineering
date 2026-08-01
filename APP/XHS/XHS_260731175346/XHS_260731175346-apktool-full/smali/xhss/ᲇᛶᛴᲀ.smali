.class public abstract Lxhss/ᲇᛶᛴᲀ;
.super Lxhss/ᛸᛷᛳᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛴᛶᛴ;
.implements Lxhss/ᛲᛸᲁᲇ;


# instance fields
.field public final ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;


# direct methods
.method public constructor <init>(Lxhss/ᛴᛵᛳᛵ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lxhss/ᛸᛷᛳᲈ;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lxhss/ᛸᛷᛳᲈ;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛳᲁᲈ(Lxhss/ᛸᛷᛳᲈ;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lxhss/ᲇᛶᛴᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛶᛴᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛴᲈᲀᲀ(ILxhss/ᲇᛶᛴᲀ;Lxhss/ᛵᲇᛱᛴ;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

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
    iget-object p1, p0, Lxhss/ᲇᛶᛴᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    move-object v1, p3

    .line 26
    check-cast v1, Lxhss/ᛷᛲᛳᛴ;

    .line 27
    .line 28
    invoke-static {v1}, Lxhss/ᛱᛷᛵᛷ;->ᛱᛱᛲᲇ(Lxhss/ᛷᛲᛳᛴ;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, p2, p0}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    invoke-static {p1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    sget-object p1, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 39
    .line 40
    if-eq p2, p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p2}, Lxhss/ᲇᛶᛴᲀ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_0

    .line 48
    :catchall_1
    move-exception p2

    .line 49
    :try_start_3
    invoke-static {p1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 53
    :goto_0
    new-instance p2, Lxhss/ᲈᛳᛱᲇ;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p2}, Lxhss/ᲇᛶᛴᲀ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    new-instance p0, Lxhss/ᛵᛲᛲᲇ;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_1
    check-cast p3, Lxhss/ᛷᛲᛳᛴ;

    .line 69
    .line 70
    invoke-virtual {p3, p2, p0}, Lxhss/ᛷᛲᛳᛴ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-interface {p0, v0}, Lxhss/ᛱᛴᛶᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    :cond_3
    :try_start_4
    check-cast p3, Lxhss/ᛷᛲᛳᛴ;

    .line 83
    .line 84
    invoke-virtual {p3, p2, p0}, Lxhss/ᛷᛲᛳᛴ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lxhss/ᛶᛵᛱ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v0, p1}, Lxhss/ᲈᲀᲀᛱ;->ᛳᛸᛵᲀ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_2
    move-exception p1

    .line 97
    new-instance p2, Lxhss/ᲈᛳᛱᲇ;

    .line 98
    .line 99
    invoke-direct {p2, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p2}, Lxhss/ᲇᛶᛴᲀ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public final ᛵᛷᛲᛸ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of p0, p1, Lxhss/ᛷᲁᲇᛷ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛷᲁᲇᛷ;

    .line 6
    .line 7
    sget-object p0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 8
    .line 9
    sget-wide v0, Lxhss/ᛷᲁᲇᛷ;->ᛱᛱᛲᲇ:J

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

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
    new-instance p1, Lxhss/ᛷᲁᲇᛷ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛳᛸᛵᲀ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lxhss/ᲇᛶᛴᲀ;->ᛸᛷᲈᲈ(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final ᛸᛶᲈᛶ()Ljava/lang/String;
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

.method public final ᲀᛷᲁᲀ(Lxhss/ᛵᛲᛲᲇ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛶᛴᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛷᲈᲈ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛶᛴᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method
