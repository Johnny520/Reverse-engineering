.class public final Lyyds/ᛷᛶᛷᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛷᛶᛷᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    iget p0, p0, Lyyds/ᛷᛶᛷᲀ;->ᛲᲈᲁ:I

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    .line 41
    new-instance p0, Lyyds/ᛴᲁᲈᲈ;

    invoke-direct {p0, p1, v0}, Lyyds/ᛴᲁᲈᲈ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 42
    :pswitch_0
    new-instance p0, Lyyds/ᛱᛳᛶᲁ;

    invoke-direct {p0, p1, v0}, Lyyds/ᛱᛳᛶᲁ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 43
    :pswitch_1
    new-instance p0, Lyyds/ᲇᛴᲇᲈ;

    invoke-direct {p0, p1, v0}, Lyyds/ᲇᛴᲇᲈ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 44
    :pswitch_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p0

    if-nez p0, :cond_0

    .line 45
    sget-object v0, Lyyds/ᛷᲇᛲᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛴᲁᲈ;

    goto :goto_0

    .line 46
    :cond_0
    const-string p0, "superState must be null"

    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛷᛶᛷᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lyyds/ᛴᲁᲈᲈ;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᲁᲈᲈ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    new-instance p0, Lyyds/ᛱᛳᛶᲁ;

    .line 13
    .line 14
    invoke-direct {p0, p1, p2}, Lyyds/ᛱᛳᛶᲁ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, Lyyds/ᲇᛴᲇᲈ;

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Lyyds/ᲇᛴᲇᲈ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_2
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    sget-object p0, Lyyds/ᛷᲇᛲᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛴᲁᲈ;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p0, "superState must be null"

    .line 34
    .line 35
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    :goto_0
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛷᛶᛷᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lyyds/ᛴᲁᲈᲈ;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lyyds/ᛱᛳᛶᲁ;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lyyds/ᲇᛴᲇᲈ;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lyyds/ᛷᲇᛲᛱ;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
