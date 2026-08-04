.class public final Lyyds/ᛶᲀᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛶᲀᲈᛵ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lyyds/ᛵᛵᲀᲇ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()J
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/4 v2, 0x5

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 36
    .line 37
    .line 38
    return-wide v2

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final ᛲᲈᲁ()I
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 36
    .line 37
    .line 38
    return p0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/util/List;Lyyds/ᲈᛳᲀ;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    sget-object v0, Lyyds/ᛶᲀᲈᛵ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    new-instance v1, Lyyds/ᛲᲁᛴᛵ;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lyyds/ᛸᛲᛵᛶ;

    .line 15
    .line 16
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :try_start_1
    const-string v1, "io.github.libxposed.service.IXposedService"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    const/4 p2, 0x1

    .line 37
    const/16 v1, 0xc

    .line 38
    .line 39
    invoke-interface {p0, v1, v0, p1, p2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 48
    .line 49
    .line 50
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    :catch_0
    move-exception p0

    .line 52
    new-instance p1, Lyyds/ᛸᛳᛵᛳ;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public final ᲀᛲᛳᲀ()J
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 36
    .line 37
    .line 38
    return-wide v2

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final ᲇᲇᲇᛱ()Ljava/util/ArrayList;
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/16 v2, 0xb

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 45
    .line 46
    .line 47
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᛱᛵᛸ;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :try_start_1
    const-string v2, "io.github.libxposed.service.IXposedService"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-interface {p0, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 44
    .line 45
    .line 46
    throw p0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :catch_0
    move-exception p0

    .line 48
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lyyds/ᛸᛳᛵᛳ;-><init>(Landroid/os/RemoteException;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method
