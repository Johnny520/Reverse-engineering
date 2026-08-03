.class public final Lqg/c;
.super Lqg/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/lang/Thread;

.field public final k:Lqg/g0;


# direct methods
.method public constructor <init>(Lwf/g;Ljava/lang/Thread;Lqg/g0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lqg/a;-><init>(Lwf/g;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lqg/c;->j:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lqg/c;->k:Lqg/g0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lqg/c;->j:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
