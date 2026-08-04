.class public final Lyyds/ᛷᛶᛳᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public declared-synchronized ᛲᲈᲁ(Lyyds/ᲁᛱᛸᛵ;Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-boolean v1, p0, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 11
    .line 12
    invoke-interface {p1}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    iget-object p2, p0, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :goto_1
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method
