.class public final Lyyds/ᲈᲇᛲᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛴᛱᛴ;


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;


# direct methods
.method public constructor <init>(Lyyds/ᲀᛳᲇᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 5
    .line 6
    new-instance p1, Lyyds/ᛷᛲᲈᛲ;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 2
    .line 3
    iget-boolean v1, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 8
    .line 9
    iget-wide v2, v1, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2, v3, v1}, Lyyds/ᲀᛳᲇᲁ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 24
    :goto_1
    :try_start_1
    invoke-interface {v0}, Lyyds/ᲀᛳᲇᲁ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    :cond_1
    :goto_2
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    throw v1

    .line 39
    :cond_3
    :goto_3
    return-void
.end method

.method public final flush()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    iget-wide v1, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v3, v1, v3

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v1, v2, v0}, Lyyds/ᲀᛳᲇᲁ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p0}, Lyyds/ᲀᛳᲇᲁ;->flush()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "closed"

    .line 25
    .line 26
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->write(Ljava/nio/ByteBuffer;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 12
    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    const-string p0, "closed"

    .line 16
    .line 17
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᛷᛲᲈᛲ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    iget-wide v1, v0, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v1, v3

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    move-wide v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v5, v0, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 18
    .line 19
    iget-object v5, v5, Lyyds/ᛲᲈᲈᛶ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲈᲈᛶ;

    .line 20
    .line 21
    iget v6, v5, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    const/16 v7, 0x2000

    .line 24
    .line 25
    if-ge v6, v7, :cond_1

    .line 26
    .line 27
    iget-boolean v7, v5, Lyyds/ᛲᲈᲈᛶ;->ᛲᛴᛳᛲ:Z

    .line 28
    .line 29
    if-eqz v7, :cond_1

    .line 30
    .line 31
    iget v5, v5, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 32
    .line 33
    sub-int/2addr v6, v5

    .line 34
    int-to-long v5, v6

    .line 35
    sub-long/2addr v1, v5

    .line 36
    :cond_1
    :goto_0
    cmp-long v3, v1, v3

    .line 37
    .line 38
    if-lez v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 41
    .line 42
    invoke-interface {v3, v1, v2, v0}, Lyyds/ᲀᛳᲇᲁ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object p0

    .line 46
    :cond_3
    const-string p0, "closed"

    .line 47
    .line 48
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲀᛲᛲ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ(I)Lyyds/ᛴᛴᛱᛴ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᲁᛶᛴᛸ(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(I)Lyyds/ᛴᛴᛱᛴ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛴᛴᲁ(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲀᛳᲇᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᲇᲁᲀᲁ;)Lyyds/ᛴᛴᛱᛴ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lyyds/ᛷᛲᲈᛲ;->ᛱᛸᲁᲇ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
