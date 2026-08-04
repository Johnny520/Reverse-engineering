.class public final Lyyds/ᛸᛲᛵᛶ;
.super Landroid/os/Binder;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᲈᛳᲀ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛳᲀ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛸᛲᛵᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᲀ;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p1, "io.github.libxposed.service.IXposedScopeCallback"

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
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    const v1, 0xffffff

    .line 5
    .line 6
    .line 7
    if-gt p1, v1, :cond_0

    .line 8
    .line 9
    const-string v1, "io.github.libxposed.service.IXposedScopeCallback"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lyyds/ᛸᛲᛵᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᲀ;

    .line 16
    .line 17
    if-eq p1, v1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq p1, v1, :cond_1

    .line 21
    .line 22
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-wide p1, -0x49b3ce68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    iget-object p1, v2, Lyyds/ᲈᛳᲀ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 43
    .line 44
    iget-object p2, v2, Lyyds/ᲈᛳᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛲᛸᛳ;

    .line 45
    .line 46
    new-instance p3, Lyyds/ᛶᛵ;

    .line 47
    .line 48
    invoke-direct {p3, p1, p2, p0, v1}, Lyyds/ᛶᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lyyds/ᛶᲀᲈᛵ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return v0

    .line 60
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-wide p0, -0x49b33e68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    iget-object p0, v2, Lyyds/ᲈᛳᲀ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 75
    .line 76
    iget-object p1, v2, Lyyds/ᲈᛳᲀ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛲᛸᛳ;

    .line 77
    .line 78
    iget-object p2, v2, Lyyds/ᲈᛳᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᲁᲁ;

    .line 79
    .line 80
    new-instance p3, Lyyds/ᛶᛵ;

    .line 81
    .line 82
    invoke-direct {p3, p0, p1, p2, v1}, Lyyds/ᛶᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lyyds/ᛶᲀᲈᛵ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 89
    .line 90
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return v0
.end method
