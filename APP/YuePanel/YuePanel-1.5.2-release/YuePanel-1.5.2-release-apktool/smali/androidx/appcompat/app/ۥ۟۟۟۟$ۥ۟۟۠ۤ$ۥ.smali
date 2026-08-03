.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/appcompat/app/\u06e5\u06df\u06df\u06df\u06df$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;

    invoke-direct {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ$ۥ;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;
    .locals 3

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;

    invoke-direct {v0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;-><init>()V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥۣ۟۟۠:I

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۠ۤ:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, v0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۠ۥ:Landroid/os/Bundle;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥۣ۟۟۠:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۠ۤ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۠ۤ:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۠ۥ:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
