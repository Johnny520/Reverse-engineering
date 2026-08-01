.class public final Lw91;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw91;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static α(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lx91;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-class p1, Lw91;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    new-instance v0, Lx91;

    .line 18
    .line 19
    if-eqz p0, :cond_3

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq p0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    sget-object p0, Lxn0;->Β:Lxn0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p1, "Unsupported MutableState policy "

    .line 31
    .line 32
    const-string v0, " was restored"

    .line 33
    .line 34
    invoke-static {p1, p0, v0}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_2
    sget-object p0, Lxn0;->Δ:Lxn0;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    sget-object p0, Lxn0;->κ:Lxn0;

    .line 47
    .line 48
    :goto_0
    invoke-direct {v0, p1, p0}, Lx91;-><init>(Ljava/lang/Object;Lxn0;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lw91;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ly42;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0}, Ly42;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance p0, Lhm1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, Lhm1;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    const/4 p0, 0x0

    .line 21
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    sget-object p0, Landroidx/customview/view/α;->ζ:Lλ;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "superState must be null"

    .line 31
    .line 32
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    :goto_0
    return-object p0

    .line 37
    :pswitch_2
    const/4 p0, 0x0

    .line 38
    invoke-static {p1, p0}, Lw91;->α(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lx91;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    iget p0, p0, Lw91;->α:I

    packed-switch p0, :pswitch_data_0

    .line 43
    new-instance p0, Ly42;

    invoke-direct {p0, p1, p2}, Ly42;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 44
    :pswitch_0
    new-instance p0, Lhm1;

    invoke-direct {p0, p1, p2}, Lhm1;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object p0

    .line 45
    :pswitch_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p0

    if-nez p0, :cond_0

    .line 46
    sget-object p0, Landroidx/customview/view/α;->ζ:Lλ;

    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "superState must be null"

    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    return-object p0

    .line 48
    :pswitch_2
    invoke-static {p1, p2}, Lw91;->α(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lx91;

    move-result-object p0

    return-object p0

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
    iget p0, p0, Lw91;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Ly42;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lhm1;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Landroidx/customview/view/α;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lx91;

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
