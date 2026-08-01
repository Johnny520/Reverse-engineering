.class public final Lja;
.super Lο;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final θ:Ljava/lang/Thread;

.field public final ι:Ltz;


# direct methods
.method public constructor <init>(Lup;Ljava/lang/Thread;Ltz;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lο;-><init>(Lup;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lja;->θ:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lja;->ι:Ltz;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ο(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lja;->θ:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
