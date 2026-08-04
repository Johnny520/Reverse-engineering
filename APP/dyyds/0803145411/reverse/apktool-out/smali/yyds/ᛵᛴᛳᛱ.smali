.class public final Lyyds/ᛵᛴᛳᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᲇᲀᲀ;


# instance fields
.field public final ᛱᲈᲁ:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Ljava/lang/Boolean;

.field public ᛶᛷᛲᲁ:Lyyds/ᛷᛶᛳᛴ;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

.field public volatile ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛵᛴᛳᛱ;->ᛱᲈᲁ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 7
    .line 8
    iput-boolean p3, p0, Lyyds/ᛵᛴᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_3

    .line 5
    .line 6
    const-class v0, Lyyds/ᛵᛴᛳᛱ;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lyyds/ᛵᛴᛳᛱ;

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p1, p1, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛱᛳᲇ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lyyds/ᛳᲇᲀᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛱᲈᲁ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᲀᲀ;->ᛱᲈᲁ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᛲᛲᲈᲈ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᲀᲀ;->ᛲᛲᲈᲈ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᛲᛳᛶᲁ(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lyyds/ᛳᲇᲀᲀ;->ᛲᛳᛶᲁ(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lyyds/ᛳᲇᲀᲀ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lyyds/ᛳᲇᲀᲀ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛲᛳᛶᲁ:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object p0, Lyyds/ᛸᛲᛶᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛲᛶᛱ;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    iget-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᛳᛴ;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Lyyds/ᛷᛶᛳᛴ;

    .line 20
    .line 21
    iget-object v1, p0, Lyyds/ᛵᛴᛳᛱ;->ᛱᲈᲁ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, Lyyds/ᛷᛶᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᛴᛳᛱ;

    .line 27
    .line 28
    iget-object v2, p0, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v2, v0, Lyyds/ᛷᛶᛳᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v1, v0, Lyyds/ᛷᛶᛳᛴ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 33
    .line 34
    iput-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᛳᛴ;

    .line 35
    .line 36
    :cond_2
    return-object v0
.end method

.method public final varargs ᛵᛸᛸᛷ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lyyds/ᛳᲇᲀᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final varargs ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lyyds/ᛳᲇᲀᲀ;->ᛶᛷᛲᲁ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛷᛲᲈᛱ(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lyyds/ᛳᲇᲀᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛷᛵᲇᲀ(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lyyds/ᛳᲇᲀᲀ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛷᲈᲈᲁ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᲀᲀ;->ᛷᲈᲈᲁ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᲀᲀ;->ᲀᛲᛳᲀ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᲇᛱᛲ()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "log"

    .line 17
    .line 18
    const-class v2, Lyyds/ᛲᛱᛳᲈ;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iput-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    iput-object v0, p0, Lyyds/ᛵᛴᛳᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Boolean;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lyyds/ᛳᲇᲀᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Boolean;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛴᛳᛱ;->ᛳᲁᲁᲇ()Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᲀᲀ;->ᲇᲈᛵᛷ()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
