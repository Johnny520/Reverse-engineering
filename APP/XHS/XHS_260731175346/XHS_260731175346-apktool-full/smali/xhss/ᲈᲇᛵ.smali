.class public final Lxhss/ᲈᲇᛵ;
.super Lxhss/ᛴᛱᛶᛸ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field private volatile threadLocalIsSet:Z

.field public final ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛸᛴᛳᛷ;)V
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᲈᲁᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲁᲇ;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

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
    invoke-direct {p0, v0, p2}, Lxhss/ᛴᛱᛶᛸ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛸᛴᛳᛷ;)V

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
    iput-object v0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    iget-object p2, p2, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 26
    .line 27
    sget-object v0, Lxhss/ᛳᛴᲀᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 28
    .line 29
    invoke-interface {p2, v0}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    instance-of p2, p2, Lxhss/ᛲᛶᲇᲇ;

    .line 34
    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-static {p1, p2}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-static {p1, p2}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Lxhss/ᲈᲇᛵ;->ᛷᛸᛷ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method


# virtual methods
.method public final ᛴᛷᛵᛴ()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᲈᲇᛵ;->threadLocalIsSet:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

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
    iget-object p0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

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

.method public final ᛷᛸᛷ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᲈᲇᛵ;->threadLocalIsSet:Z

    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance v0, Lxhss/ᲀᛴᛳᛸ;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᛸᛷᲈᲈ(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lxhss/ᲈᲇᛵ;->threadLocalIsSet:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lxhss/ᲀᛴᛳᛸ;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lxhss/ᛴᛵᛳᛵ;

    .line 18
    .line 19
    iget-object v0, v0, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lxhss/ᲈᲇᛵ;->ᲇᛶᛴᲀ:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, Lxhss/ᲈᲀᲀᛱ;->ᲁᲁᛴᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 34
    .line 35
    iget-object v1, v0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v1, v2}, Lxhss/ᛶᲈᛴᛲ;->ᲁᛲᛴᛴ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-object v4, Lxhss/ᛶᲈᛴᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 43
    .line 44
    if-eq v3, v4, :cond_2

    .line 45
    .line 46
    invoke-static {v0, v1, v3}, Lxhss/ᛵᛶᲀᲇ;->ᲈᛳᲀ(Lxhss/ᛸᛴᛳᛷ;Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Lxhss/ᲈᲇᛵ;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_2
    :try_start_0
    iget-object p0, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_0
    invoke-static {v1, v3}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-virtual {v2}, Lxhss/ᲈᲇᛵ;->ᛴᛷᛵᛴ()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    :cond_5
    invoke-static {v1, v3}, Lxhss/ᛶᲈᛴᛲ;->ᛸᛲᛷᛱ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_6
    throw p0
.end method
