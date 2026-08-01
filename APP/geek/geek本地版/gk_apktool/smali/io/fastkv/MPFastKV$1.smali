.class Lio/fastkv/MPFastKV$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/MPFastKV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/fastkv/MPFastKV;


# direct methods
.method public constructor <init>(Lio/fastkv/MPFastKV;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/fastkv/MPFastKV$1;->lambda$handleMessage$0(Lio/fastkv/MPFastKV;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$handleMessage$0(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/fastkv/MPFastKV;->access$200(Lio/fastkv/MPFastKV;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Lio/fastkv/AbsFastKV;->notifyListeners(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object p1, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 24
    .line 25
    invoke-static {p1}, Lio/fastkv/MPFastKV;->access$100(Lio/fastkv/MPFastKV;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget-object p1, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 30
    .line 31
    invoke-virtual {p1}, Lio/fastkv/MPFastKV;->apply()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_3
    iget-object p1, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 36
    .line 37
    invoke-static {p1}, Lio/fastkv/MPFastKV;->access$000(Lio/fastkv/MPFastKV;)Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, Lio/fastkv/MPFastKV$1;->this$0:Lio/fastkv/MPFastKV;

    .line 42
    .line 43
    new-instance v1, Lio/fastkv/c;

    .line 44
    .line 45
    invoke-direct {v1, v0}, Lio/fastkv/c;-><init>(Lio/fastkv/MPFastKV;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
