.class public final Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1;",
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
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ$ۥ;->ۥ(Landroid/os/Parcel;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ$ۥ;->ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ$ۥ;->ۥ۟۟(I)[Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public ۥ۟(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public ۥ۟۟(I)[Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;
    .locals 0

    new-array p1, p1, [Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ;

    return-object p1
.end method
