.class public Landroid/support/v4/os/ResultReceiver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/os/ResultReceiver;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 飘花落叶言子楪哲苏兰世:L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/material/internal/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroid/support/v4/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    new-instance p2, L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    invoke-direct {p2}, Landroid/os/Binder;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v0, L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p2, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Landroid/support/v4/os/ResultReceiver;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p1
.end method
