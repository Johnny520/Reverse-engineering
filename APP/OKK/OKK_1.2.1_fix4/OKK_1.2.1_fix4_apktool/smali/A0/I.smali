.class public final LA0/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LA0/I;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LA0/I;->a:I

    packed-switch v0, :pswitch_data_0

    .line 12
    new-instance v0, Ly0/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ly0/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Ls0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ls0/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 14
    :pswitch_1
    new-instance v0, Lr/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lr/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 15
    :pswitch_2
    new-instance v0, Lm0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lm0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_3
    new-instance v0, Ll0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_4
    new-instance v0, Lg/L0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lg/L0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_5
    new-instance v0, LU/K;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LU/K;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_6
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 20
    sget-object p1, LK/b;->b:LK/a;

    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :pswitch_7
    new-instance v0, LA0/J;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LA0/J;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, LA0/I;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Ly0/c;

    invoke-direct {v0, p1, p2}, Ly0/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Ls0/a;

    invoke-direct {v0, p1, p2}, Ls0/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    new-instance v0, Lr/f;

    invoke-direct {v0, p1, p2}, Lr/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 4
    :pswitch_2
    new-instance v0, Lm0/b;

    invoke-direct {v0, p1, p2}, Lm0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_3
    new-instance v0, Ll0/b;

    invoke-direct {v0, p1, p2}, Ll0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_4
    new-instance v0, Lg/L0;

    invoke-direct {v0, p1, p2}, Lg/L0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_5
    new-instance v0, LU/K;

    invoke-direct {v0, p1, p2}, LU/K;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 9
    sget-object p1, LK/b;->b:LK/a;

    return-object p1

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :pswitch_7
    new-instance v0, LA0/J;

    invoke-direct {v0, p1, p2}, LA0/J;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, LA0/I;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ly0/c;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ls0/a;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lr/f;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lm0/b;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ll0/b;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lg/L0;

    return-object p1

    :pswitch_5
    new-array p1, p1, [LU/K;

    return-object p1

    :pswitch_6
    new-array p1, p1, [LK/b;

    return-object p1

    :pswitch_7
    new-array p1, p1, [LA0/J;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
