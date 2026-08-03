.class public final LYue/ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "LYue/\u06e5\u06e2\u06e4\u06e6\u06e2$\u06e5\u06df\u06df\u06e0\u06df;",
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

    .line 1
    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ;->ۥ(Landroid/os/Parcel;)LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ;->ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ;->ۥ۟۟(I)[LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ;->ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;
    .locals 1

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    invoke-direct {v0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public ۥ۟۟(I)[LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;
    .locals 0

    new-array p1, p1, [LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    return-object p1
.end method
