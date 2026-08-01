.class public final Lxhss/ᛳᲀᲁᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᲁᛷᲁ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

.field public ᛳᲁᲇᛸ:Z

.field public ᛷᛴᛷᛱ:Z

.field public final synthetic ᲀᲇᛳᲁ:Lxhss/ᲇᛸᛵᛴ;

.field public ᲇᛴᲇᛵ:J

.field public ᲇᛶᛴᲀ:Z


# direct methods
.method public constructor <init>(Lxhss/ᲇᛸᛵᛴ;Lxhss/ᛱᲁᛷᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᲀᲁᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲇᛸᛵᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lxhss/ᛳᲀᲁᲁ;->ᛷᛴᛷᛱ:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲇᛶᛴᲀ:Z

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {p0, v0}, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0
.end method

.method public final flush()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛳᲀᲁᲁ;->ᲇᛴᲇᛵ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {p0, v0}, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛳᲀᲁᲁ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x28

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 p0, 0x29

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᛱᲁᛷᲁ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ:Z

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲇᛸᛵᛴ;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-static {p0, v0, p1, v1}, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ(Lxhss/ᲇᛸᛵᛴ;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ(JLxhss/ᛴᛲᛴᛶ;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲇᛶᛴᲀ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    :try_start_0
    iget-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛷᛴᛷᛱ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛷᛴᛷᛱ:Z

    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲇᛸᛵᛴ;

    .line 13
    .line 14
    iget-object v0, v0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 15
    .line 16
    iget-object v0, v0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    iget-object v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 25
    .line 26
    invoke-interface {v0, p1, p2, p3}, Lxhss/ᛱᲁᛷᲁ;->ᛷᛴᛷᛱ(JLxhss/ᛴᛲᛴᛶ;)V

    .line 27
    .line 28
    .line 29
    iget-wide v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲇᛴᲇᛵ:J

    .line 30
    .line 31
    add-long/2addr v0, p1

    .line 32
    iput-wide v0, p0, Lxhss/ᛳᲀᲁᲁ;->ᲇᛴᲇᛵ:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    return-void

    .line 35
    :goto_1
    invoke-virtual {p0, p1}, Lxhss/ᛳᲀᲁᲁ;->ᛳᲁᲇᛸ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0

    .line 40
    :cond_1
    const-string p0, "closed"

    .line 41
    .line 42
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᛱᲁᛷᲁ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᲁᛷᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᛱᲁᛷᲁ;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
