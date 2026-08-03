.class public final Lp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp;->a:I

    packed-switch v0, :pswitch_data_0

    .line 14
    new-instance v0, LEE;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LEE;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, LsB;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LsB;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_1
    new-instance v0, LxA;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LxA;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_2
    new-instance v0, Lmy;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lmy;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_3
    new-instance v0, Lyv;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lyv;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 19
    :pswitch_4
    new-instance v0, LEq;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LEq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 20
    :pswitch_5
    new-instance v0, Lgi;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lgi;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 21
    :pswitch_6
    new-instance v0, LVb;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LVb;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 22
    :pswitch_7
    new-instance v0, Li8;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Li8;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 23
    :pswitch_8
    new-instance v0, La6;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La6;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_9
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 25
    sget-object p1, Lq;->b:Lo;

    return-object p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, LEE;

    invoke-direct {v0, p1, p2}, LEE;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, LsB;

    invoke-direct {v0, p1, p2}, LsB;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    new-instance v0, LxA;

    invoke-direct {v0, p1, p2}, LxA;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 4
    :pswitch_2
    new-instance v0, Lmy;

    invoke-direct {v0, p1, p2}, Lmy;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_3
    new-instance v0, Lyv;

    invoke-direct {v0, p1, p2}, Lyv;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_4
    new-instance v0, LEq;

    invoke-direct {v0, p1, p2}, LEq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_5
    new-instance v0, Lgi;

    invoke-direct {v0, p1, p2}, Lgi;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_6
    new-instance v0, LVb;

    invoke-direct {v0, p1, p2}, LVb;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 9
    :pswitch_7
    new-instance v0, Li8;

    invoke-direct {v0, p1, p2}, Li8;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 10
    :pswitch_8
    new-instance v0, La6;

    invoke-direct {v0, p1, p2}, La6;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 11
    :pswitch_9
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 12
    sget-object p1, Lq;->b:Lo;

    return-object p1

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [LEE;

    return-object p1

    :pswitch_0
    new-array p1, p1, [LsB;

    return-object p1

    :pswitch_1
    new-array p1, p1, [LxA;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lmy;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lyv;

    return-object p1

    :pswitch_4
    new-array p1, p1, [LEq;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lgi;

    return-object p1

    :pswitch_6
    new-array p1, p1, [LVb;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Li8;

    return-object p1

    :pswitch_8
    new-array p1, p1, [La6;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lq;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
