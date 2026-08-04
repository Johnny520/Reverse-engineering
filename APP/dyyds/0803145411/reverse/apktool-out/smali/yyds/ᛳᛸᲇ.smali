.class public final Lyyds/ᛳᛸᲇ;
.super Landroid/os/Binder;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲀᛸᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛸᛳᛴᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᛳᛴᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛳᛸᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛳᛴᛴ;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lyyds/ᛵᲀᛸᲀ;->ᛲᲈᲁ:Ljava/lang/String;

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
    sget-object v0, Lyyds/ᛵᲀᛸᲀ;->ᛲᲈᲁ:Ljava/lang/String;

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
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lyyds/ᛳᛸᲇ;->ᛲᲈᲁ([Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v1
.end method

.method public final ᛲᲈᲁ([Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛸᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛳᛴᛴ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛸᛳᛴᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᛳᲀ;

    .line 4
    .line 5
    new-instance v1, Lyyds/ᛱᲁᛴᛴ;

    .line 6
    .line 7
    const/16 v2, 0x9

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p1, p0, v3, v2}, Lyyds/ᛱᲁᛴᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v1, p0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 15
    .line 16
    .line 17
    return-void
.end method
