.class public final Lyyds/ᛱᛵᛳᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛱᛵᛳᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛱᛵᛳᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lyyds/ᛳᛴ;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lyyds/ᛳᛴ;

    .line 19
    .line 20
    iget-object v2, v1, Lyyds/ᛳᛴ;->ᛷᛵᲇᲀ:Ljava/io/BufferedWriter;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v1}, Lyyds/ᛳᛴ;->ᲈᛷᲈᛶ()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lyyds/ᛳᛴ;

    .line 34
    .line 35
    invoke-virtual {v1}, Lyyds/ᛳᛴ;->ᛳᛸᛴᛶ()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lyyds/ᛳᛴ;

    .line 44
    .line 45
    invoke-virtual {v1}, Lyyds/ᛳᛴ;->ᛷᛶᛷᲀ()V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lyyds/ᛱᛵᛳᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lyyds/ᛳᛴ;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput v1, p0, Lyyds/ᛳᛴ;->ᛱᛳᲇ:I

    .line 54
    .line 55
    :cond_1
    monitor-exit v0

    .line 56
    :goto_0
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
