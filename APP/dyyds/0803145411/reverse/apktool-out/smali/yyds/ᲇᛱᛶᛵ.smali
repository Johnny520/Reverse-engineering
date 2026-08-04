.class public final Lyyds/ᲇᛱᛶᛵ;
.super Lyyds/ᛱᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛶᛷᛲᲁ:Z


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lyyds/ᲇᛱᛶᛵ;->ᛶᛷᛲᲁ:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 17
    .line 18
    return-void
.end method

.method public final ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
    .locals 2

    .line 1
    iget-boolean p1, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    iget-boolean p1, p0, Lyyds/ᲇᛱᛶᛵ;->ᛶᛷᛲᲁ:Z

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 p1, 0x2000

    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3}, Lyyds/ᛱᛶᲇ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    cmp-long p3, p1, v0

    .line 19
    .line 20
    if-nez p3, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lyyds/ᲇᛱᛶᛵ;->ᛶᛷᛲᲁ:Z

    .line 24
    .line 25
    sget-object p1, Lyyds/ᛷᛸᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛸᛱᛴ;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 28
    .line 29
    .line 30
    return-wide v0

    .line 31
    :cond_1
    return-wide p1

    .line 32
    :cond_2
    const-string p0, "closed"

    .line 33
    .line 34
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 p0, 0x0

    .line 38
    .line 39
    return-wide p0
.end method
