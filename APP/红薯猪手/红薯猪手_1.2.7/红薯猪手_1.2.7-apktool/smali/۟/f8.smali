.class public L۟/f8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/cb;


# instance fields
.field public final synthetic ۥ:I

.field public ۥ۟:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteProgram;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, L۟/f8;->ۥ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, L۟/f8;->ۥ:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    return-void

    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۥ۟۟(I[B)V
    .locals 1

    .line 1
    iget v0, p0, L۟/f8;->ۥ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-virtual {p0, p1, p2}, L۟/f8;->ۥۣ۠(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۥ۟ۡ(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, L۟/f8;->ۥ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-virtual {p0, p1, p2}, L۟/f8;->ۥۣ۠(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۥ۟ۥ(I)V
    .locals 1

    .line 1
    iget v0, p0, L۟/f8;->ۥ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, L۟/f8;->ۥۣ۠(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۥ۟ۦ(ID)V
    .locals 1

    .line 1
    iget v0, p0, L۟/f8;->ۥ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p0, p1, p2}, L۟/f8;->ۥۣ۠(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

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

.method public final ۥ۠(IJ)V
    .locals 1

    .line 1
    iget v0, p0, L۟/f8;->ۥ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p0, p1, p2}, L۟/f8;->ۥۣ۠(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/database/sqlite/SQLiteProgram;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

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

.method public final ۥۣ۠(ILjava/lang/Object;)V
    .locals 3

    add-int/lit8 p1, p1, -0x1

    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-gt v0, p1, :cond_0

    iget-object v1, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, L۟/f8;->ۥ۟:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
