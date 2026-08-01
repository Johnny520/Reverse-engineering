.class public final L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏兰哲;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iput-object p2, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 14
    .line 15
    sget-object p1, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    iput-object p1, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    iput-boolean p3, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-direct {p1, v0}, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "glide-"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "-thread-"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, L飘花落叶言楪世苏子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method
