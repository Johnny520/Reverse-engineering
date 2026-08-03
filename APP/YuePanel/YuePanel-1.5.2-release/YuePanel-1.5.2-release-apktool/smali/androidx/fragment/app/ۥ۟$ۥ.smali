.class public Landroidx/fragment/app/ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/fragment/app/\u06e5\u06df;",
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

    invoke-virtual {p0, p1}, Landroidx/fragment/app/ۥ۟$ۥ;->ۥ(Landroid/os/Parcel;)Landroidx/fragment/app/ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/ۥ۟$ۥ;->ۥ۟(I)[Landroidx/fragment/app/ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(Landroid/os/Parcel;)Landroidx/fragment/app/ۥ۟;
    .locals 1

    new-instance v0, Landroidx/fragment/app/ۥ۟;

    invoke-direct {v0, p1}, Landroidx/fragment/app/ۥ۟;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public ۥ۟(I)[Landroidx/fragment/app/ۥ۟;
    .locals 0

    new-array p1, p1, [Landroidx/fragment/app/ۥ۟;

    return-object p1
.end method
