.class public final Lyyds/ᲀᲁᲇᛱ;
.super Lyyds/ᛷᛸᛶᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field private volatile threadLocalIsSet:Z

.field public final ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛲᲁᛷᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛷᛴ;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    invoke-direct {p0, v0, p2}, Lyyds/ᛷᛸᛶᲁ;-><init>(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    invoke-interface {p2}, Lyyds/ᛲᛱᛶᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    sget-object v0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 30
    .line 31
    invoke-interface {p2, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of p2, p2, Lyyds/ᛴᲇᛴᛲ;

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-static {p1, p2}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p1, p2}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᲁᲇᛱ;->ᲇᲇᲈᲀ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᲁᲇᛱ;->threadLocalIsSet:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlin/Pair;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lyyds/ᲁᛴᛲ;

    .line 20
    .line 21
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v1, v0}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lyyds/ᛲᲇᲁᛳ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v0, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 38
    .line 39
    invoke-interface {v0}, Lyyds/ᛲᛱᛶᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v1, v2}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v4, Lyyds/ᛴᛲᛴᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 49
    .line 50
    if-eq v3, v4, :cond_2

    .line 51
    .line 52
    invoke-static {v0, v1, v3}, Lyyds/ᛲᛳᲁ;->ᛲᛲᲈᲈ(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)Lyyds/ᲀᲁᲇᛱ;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    :cond_2
    :try_start_0
    iget-object p0, p0, Lyyds/ᛷᛸᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Lyyds/ᛲᛱᛶᛸ;->ᛱᲈᲁ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-virtual {v2}, Lyyds/ᲀᲁᲇᛱ;->ᛳᛴᲇᛶ()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-void

    .line 71
    :cond_4
    :goto_0
    invoke-static {v1, v3}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {v2}, Lyyds/ᲀᲁᲇᛱ;->ᛳᛴᲇᛶ()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_6

    .line 83
    .line 84
    :cond_5
    invoke-static {v1, v3}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_6
    throw p0
.end method

.method public final ᛳᛴᲇᛶ()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᲁᲇᛱ;->threadLocalIsSet:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object p0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    xor-int/lit8 p0, v0, 0x1

    .line 23
    .line 24
    return p0
.end method

.method public final ᲇᲇᲈᲀ(Lyyds/ᲁᛴᛲ;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᲀᲁᲇᛱ;->threadLocalIsSet:Z

    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᲀᲁᲇᛱ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
