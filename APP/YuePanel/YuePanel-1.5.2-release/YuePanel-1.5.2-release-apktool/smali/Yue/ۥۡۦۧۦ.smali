.class public LYue/ۥۡۦۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۧۦ$ۥ۟۟;,
        LYue/ۥۡۦۧۦ$ۥ۟;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LYue/\u06e5\u06e1\u06e6\u06e7\u06e6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:Landroid/os/Handler;

.field public ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۦۧۦ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۦۧۦ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۡۦۧۦ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LYue/ۥۡۦۧۦ;->ۥۣ۟۟۠:Z

    .line 3
    iput-object p1, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LYue/ۥۡۦۧۦ;->ۥۣ۟۟۠:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥ۟ۤ$ۥ۟;->ۥ۟۟۟ۡ(Landroid/os/IBinder;)LYue/ۥ۠ۥ۟ۤ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;

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
    .param p1    # Landroid/os/Parcel;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;

    if-nez p2, :cond_0

    new-instance p2, LYue/ۥۡۦۧۦ$ۥ۟;

    invoke-direct {p2, p0}, LYue/ۥۡۦۧۦ$ۥ۟;-><init>(LYue/ۥۡۦۧۦ;)V

    iput-object p2, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p2, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public ۥ۟(ILandroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, LYue/ۥۡۦۧۦ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, LYue/ۥۡۦۧۦ$ۥ۟۟;

    invoke-direct {v1, p0, p1, p2}, LYue/ۥۡۦۧۦ$ۥ۟۟;-><init>(LYue/ۥۡۦۧۦ;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۧۦ;->ۥ(ILandroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, LYue/ۥۡۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۥ۟ۤ;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۥ۟ۤ;->ۥ(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method
