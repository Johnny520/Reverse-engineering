.class public final Lyyds/ᲈᛸ;
.super Landroid/os/Binder;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᲀᛵᛶ;


# static fields
.field public static final synthetic ᲇᲈᛵᛷ:I


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲈᛸ;->ᲀᛲᛳᲀ:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lyyds/ᛴᲀᛵᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛴᲀᛵᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    if-eq p1, v1, :cond_6

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq p1, v2, :cond_3

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    if-eq p1, v0, :cond_2

    .line 31
    .line 32
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p2, p1}, Lyyds/ᲈᛸ;->ᲀᛲᛳᲀ([Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    sget-object p4, Lyyds/ᛵᲀᛸᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    if-eqz p4, :cond_5

    .line 63
    .line 64
    instance-of v0, p4, Lyyds/ᛵᲀᛸᲀ;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    move-object v0, p4

    .line 69
    check-cast v0, Lyyds/ᛵᲀᛸᲀ;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    new-instance v0, Lyyds/ᲁᛷᲈᛸ;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, Lyyds/ᲁᛷᲈᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 78
    .line 79
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget-object p0, p0, Lyyds/ᲈᛸ;->ᲀᛲᛳᲀ:Landroidx/room/MultiInstanceInvalidationService;

    .line 84
    .line 85
    iget-object p2, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 86
    .line 87
    monitor-enter p2

    .line 88
    :try_start_0
    iget-object p4, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 89
    .line 90
    invoke-virtual {p4, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    monitor-exit p2

    .line 106
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 107
    .line 108
    .line 109
    return v1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    monitor-exit p2

    .line 112
    throw p0

    .line 113
    :cond_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-nez p1, :cond_7

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_7
    sget-object p4, Lyyds/ᛵᲀᛸᲀ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    if-eqz p4, :cond_8

    .line 127
    .line 128
    instance-of v0, p4, Lyyds/ᛵᲀᛸᲀ;

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    move-object v0, p4

    .line 133
    check-cast v0, Lyyds/ᛵᲀᛸᲀ;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    new-instance v0, Lyyds/ᲁᛷᲈᛸ;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object p1, v0, Lyyds/ᲁᛷᲈᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 142
    .line 143
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, v0, p1}, Lyyds/ᲈᛸ;->ᛵᛸᛸᛷ(Lyyds/ᛵᲀᛸᲀ;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p3, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    .line 156
    .line 157
    return v1
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛵᲀᛸᲀ;Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p0, p0, Lyyds/ᲈᛸ;->ᲀᛲᛳᲀ:Landroidx/room/MultiInstanceInvalidationService;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget v2, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    iput v2, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, p1, v4}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move v0, v2

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget p1, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    add-int/lit8 p1, p1, -0x1

    .line 44
    .line 45
    iput p1, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲀᛲᛳᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    :goto_0
    monitor-exit v1

    .line 48
    return v0

    .line 49
    :goto_1
    monitor-exit v1

    .line 50
    throw p0
.end method

.method public final ᲀᛲᛳᲀ([Ljava/lang/String;I)V
    .locals 7

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛸ;->ᲀᛲᛳᲀ:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string p0, "ROOM"

    .line 21
    .line 22
    const-string p1, "Remote invalidation client ID not registered"

    .line 23
    .line 24
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :try_start_1
    iget-object v2, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 34
    .line 35
    .line 36
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_0
    iget-object v4, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 39
    .line 40
    if-ge v3, v2, :cond_3

    .line 41
    .line 42
    :try_start_2
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget-object v6, p0, Landroidx/room/MultiInstanceInvalidationService;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    if-eq p2, v5, :cond_2

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    :try_start_3
    iget-object v4, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 70
    .line 71
    invoke-virtual {v4, v3}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Lyyds/ᛵᲀᛸᲀ;

    .line 76
    .line 77
    invoke-interface {v4, p1}, Lyyds/ᛵᲀᛸᲀ;->ᛲᲈᲁ([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    goto :goto_2

    .line 83
    :catch_0
    move-exception v4

    .line 84
    :try_start_4
    const-string v5, "ROOM"

    .line 85
    .line 86
    const-string v6, "Error invoking a remote callback"

    .line 87
    .line 88
    invoke-static {v5, v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    :try_start_5
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛳᲁ;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_3
    invoke-virtual {v4}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 101
    .line 102
    .line 103
    monitor-exit v0

    .line 104
    return-void

    .line 105
    :goto_3
    monitor-exit v0

    .line 106
    throw p0
.end method
