.class public final synthetic Ltd2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic α:Ljava/lang/String;

.field public final synthetic β:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltd2;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Ltd2;->β:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 1
    iget-object v0, p0, Ltd2;->α:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean p0, p0, Ltd2;->β:Z

    .line 4
    .line 5
    invoke-static {p1, v0, p0}, Lnx;->σ(Ljava/lang/Runnable;Ljava/lang/String;Z)Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
