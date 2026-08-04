.class public final Lyyds/ᛸᛱᲁᲀ;
.super Lyyds/ᛴᛵᛲᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

.field public final synthetic ᲇᲇᲇᛱ:I


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛵᛲᲇ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lyyds/ᛱᛴᛵᛲ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Lyyds/ᛱᛴᛵᛲ;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;Lyyds/ᲈᛴᛶᛳ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 21
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛵᛲᲇ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 22
    iput-object p3, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lyyds/ᛱᛴᛵᛲ;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lyyds/ᛴᛵᛲᲇ;->ᛲᛴᛳᛲ:Z

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛴᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v1}, Lyyds/ᲈᛴᛶᛳ;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getColumnCount()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᲈᛴᛶᛳ;->getColumnCount()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x15

    .line 10
    .line 11
    const-string p1, "no row"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 19
    .line 20
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lyyds/ᲈᛴᛶᛳ;->getColumnName(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLong(I)J
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x15

    .line 10
    .line 11
    const-string p1, "no row"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 19
    .line 20
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lyyds/ᲈᛴᛶᛳ;->getLong(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isNull(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x15

    .line 10
    .line 11
    const-string p1, "no row"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 19
    .line 20
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lyyds/ᲈᛴᛶᛳ;->isNull(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public reset()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lyyds/ᛴᛵᛲᲇ;->reset()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᲈᛴᛶᛳ;->reset()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛱᲈᲁ(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x15

    .line 10
    .line 11
    const-string p1, "no row"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 19
    .line 20
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lyyds/ᲈᛴᛶᛳ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    check-cast v1, Lyyds/ᛱᛴᛵᛲ;

    .line 12
    .line 13
    invoke-interface {v1}, Lyyds/ᛷᛳᲈᲇ;->ᛲᛴᛳᛲ()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛴᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v1}, Lyyds/ᲈᛴᛶᛳ;->ᛲᛴᛳᛲ()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(I)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    check-cast v1, Lyyds/ᛱᛴᛵᛲ;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lyyds/ᛷᛳᲈᲇ;->ᛵᛸᛸᛷ(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛴᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lyyds/ᲈᛴᛶᛳ;->ᛵᛸᛸᛷ(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᲀᛵᛸ()Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 10
    .line 11
    .line 12
    check-cast v2, Lyyds/ᛱᛴᛵᛲ;

    .line 13
    .line 14
    iget-object p0, v2, Lyyds/ᛱᛴᛵᛲ;->ᲇᲈᛵᛷ:Landroid/database/sqlite/SQLiteStatement;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :pswitch_0
    check-cast v2, Lyyds/ᲈᛴᛶᛳ;

    .line 21
    .line 22
    invoke-virtual {v2}, Lyyds/ᲈᛴᛶᛳ;->ᛵᲀᛵᛸ()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {v2, v1}, Lyyds/ᲈᛴᛶᛳ;->ᛱᲈᲁ(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "wal"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object p0, p0, Lyyds/ᛴᛵᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->disableWriteAheadLogging()V

    .line 49
    .line 50
    .line 51
    :goto_0
    return v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛶᲈᛴᲈ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛶᲈᛴᲈ()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᲈᛴᛶᛳ;

    .line 14
    .line 15
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛶᲈᛴᲈ()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛲᲇ(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    check-cast v1, Lyyds/ᛱᛴᛵᛲ;

    .line 12
    .line 13
    invoke-interface {v1, p1, p2}, Lyyds/ᛷᛳᲈᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛴᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Lyyds/ᲈᛴᛶᛳ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲈᛵᛷ(IJ)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛱᲁᲀ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛱᲁᲀ;->ᛶᛷᛲᲁ:Ljava/lang/AutoCloseable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛵᛲᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    check-cast v1, Lyyds/ᛱᛴᛵᛲ;

    .line 12
    .line 13
    invoke-interface {v1, p1, p2, p3}, Lyyds/ᛷᛳᲈᲇ;->ᲇᲈᛵᛷ(IJ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛴᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2, p3}, Lyyds/ᲈᛴᛶᛳ;->ᲇᲈᛵᛷ(IJ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
