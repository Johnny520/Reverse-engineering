.class public Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;
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
    value = Landroidx/fragment/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e8"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/FragmentManager$\u06e5\u06df\u06df\u06df\u06e8;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/String;

.field public ۥ۟۟۠ۤ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ$ۥ;

    invoke-direct {v0}, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ$ۥ;-><init>()V

    sput-object v0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    .line 3
    iput p2, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/FragmentManager$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
