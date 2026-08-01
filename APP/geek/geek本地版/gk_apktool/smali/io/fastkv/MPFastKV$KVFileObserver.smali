.class Lio/fastkv/MPFastKV$KVFileObserver;
.super Landroid/os/FileObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/MPFastKV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "KVFileObserver"
.end annotation


# instance fields
.field final synthetic this$0:Lio/fastkv/MPFastKV;


# direct methods
.method public constructor <init>(Lio/fastkv/MPFastKV;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fastkv/MPFastKV$KVFileObserver;->this$0:Lio/fastkv/MPFastKV;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onEvent(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lio/fastkv/MPFastKV$KVFileObserver;->this$0:Lio/fastkv/MPFastKV;

    .line 2
    .line 3
    invoke-static {p1}, Lio/fastkv/MPFastKV;->access$300(Lio/fastkv/MPFastKV;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lio/fastkv/MPFastKV$KVFileObserver;->this$0:Lio/fastkv/MPFastKV;

    .line 15
    .line 16
    invoke-static {p1}, Lio/fastkv/MPFastKV;->access$300(Lio/fastkv/MPFastKV;)Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-wide/16 v0, 0x1e

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
