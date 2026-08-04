.class public final Lyyds/ᛱᛱᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲇᛱᛸ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

.field public final ᲇᲈᛵᛷ:J


# direct methods
.method public constructor <init>(Lyyds/ᛶᲇᲈᛱ;Lyyds/ᛵᲇᛱᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 7
    .line 8
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final getColumnCount()I
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->getColumnCount()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->getColumnName(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final getLong(I)J
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final isNull(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->isNull(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final reset()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->reset()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final ᛱᲈᲁ(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛲᛴᛳᛲ()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final ᛵᛸᛸᛷ(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->ᛵᛸᛸᛷ(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final ᛵᲀᛵᛸ()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 28
    .line 29
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    const-string p0, "Statement is recycled"

    .line 34
    .line 35
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public final ᲀᛲᛲᲇ(ILjava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2}, Lyyds/ᛵᲇᛱᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final ᲇᲈᛵᛷ(IJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᲀᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲇᲈᛱ;

    .line 2
    .line 3
    iget-boolean v0, v0, Lyyds/ᛶᲇᲈᛱ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v3, p0, Lyyds/ᛱᛱᲀᲈ;->ᲇᲈᛵᛷ:J

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛲᲇᲁᛳ;->ᲇᲈᛵᛷ()J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    cmp-long v0, v3, v5

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛱᛱᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛱᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2, p3}, Lyyds/ᛵᲇᛱᛸ;->ᲇᲈᛵᛷ(IJ)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Attempted to use statement on a different thread"

    .line 27
    .line 28
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    const-string p0, "Statement is recycled"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method
