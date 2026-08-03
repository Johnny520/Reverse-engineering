.class public Landroidx/versionedparcelable/ParcelImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۢۦۤ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/versionedparcelable/ParcelImpl$ۥ;

    invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$ۥ;-><init>()V

    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢۦۤ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->ۥۣ۟۟۠:LYue/ۥۣۢۦۤ;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LYue/ۥۣۢۦۢ;

    invoke-direct {v0, p1}, LYue/ۥۣۢۦۢ;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۤ()LYue/ۥۣۢۦۤ;

    move-result-object p1

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->ۥۣ۟۟۠:LYue/ۥۣۢۦۤ;

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

    new-instance p2, LYue/ۥۣۢۦۢ;

    invoke-direct {p2, p1}, LYue/ۥۣۢۦۢ;-><init>(Landroid/os/Parcel;)V

    iget-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->ۥۣ۟۟۠:LYue/ۥۣۢۦۤ;

    invoke-virtual {p2, p1}, LYue/ۥۣۢۦۡ;->ۥ۟۠۟۟(LYue/ۥۣۢۦۤ;)V

    return-void
.end method

.method public ۥ()LYue/ۥۣۢۦۤ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LYue/\u06e5\u06e2\u06e3\u06e6\u06e4;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/versionedparcelable/ParcelImpl;->ۥۣ۟۟۠:LYue/ۥۣۢۦۤ;

    return-object v0
.end method
