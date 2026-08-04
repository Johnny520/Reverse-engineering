.class public final Lyyds/ᛲᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛸᛳᛴᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᛳᛴᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛸ;->ᛲᲈᲁ:Lyyds/ᛸᛳᛴᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    sget p1, Lyyds/ᲈᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    sget-object p1, Lyyds/ᛴᲀᛵᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    instance-of v0, p1, Lyyds/ᛴᲀᛵᛶ;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lyyds/ᛴᲀᛵᛶ;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lyyds/ᲇᛲᛴᲀ;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p1, Lyyds/ᲇᛲᛴᲀ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 24
    .line 25
    :goto_0
    iget-object p0, p0, Lyyds/ᛲᛸ;->ᛲᲈᲁ:Lyyds/ᛸᛳᛴᛴ;

    .line 26
    .line 27
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᛵᛶ;

    .line 28
    .line 29
    :try_start_0
    iget-object p2, p0, Lyyds/ᛸᛳᛴᛴ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛸᲇ;

    .line 30
    .line 31
    iget-object v0, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1, p2, v0}, Lyyds/ᛴᲀᛵᛶ;->ᛵᛸᛸᛷ(Lyyds/ᛵᲀᛸᲀ;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᲇᲇᲇᛱ:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string p1, "ROOM"

    .line 42
    .line 43
    const-string p2, "Cannot register multi-instance invalidation callback"

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛸ;->ᛲᲈᲁ:Lyyds/ᛸᛳᛴᛴ;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᛵᛶ;

    .line 5
    .line 6
    return-void
.end method
