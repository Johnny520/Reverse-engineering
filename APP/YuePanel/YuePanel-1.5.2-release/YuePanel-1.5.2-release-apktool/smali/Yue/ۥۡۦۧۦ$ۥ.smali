.class public LYue/ۥۡۦۧۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۧۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LYue/\u06e5\u06e1\u06e6\u06e7\u06e6;",
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

    invoke-virtual {p0, p1}, LYue/ۥۡۦۧۦ$ۥ;->ۥ(Landroid/os/Parcel;)LYue/ۥۡۦۧۦ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۧۦ$ۥ;->ۥ۟(I)[LYue/ۥۡۦۧۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)LYue/ۥۡۦۧۦ;
    .locals 1

    new-instance v0, LYue/ۥۡۦۧۦ;

    invoke-direct {v0, p1}, LYue/ۥۡۦۧۦ;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public ۥ۟(I)[LYue/ۥۡۦۧۦ;
    .locals 0

    new-array p1, p1, [LYue/ۥۡۦۧۦ;

    return-object p1
.end method
