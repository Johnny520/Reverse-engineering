.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/appcompat/app/\u06e5\u06df\u06df\u06df\u06df$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;->ۥ(Landroid/os/Parcel;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;->ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;->ۥ۟۟(I)[Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
    .locals 0

    invoke-static {p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(I)[Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
    .locals 0

    new-array p1, p1, [Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    return-object p1
.end method
