.class Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ClassDefItemConsumer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field futureClazz:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lcom/android/dx/dex/file/ClassDefItem;",
            ">;"
        }
    .end annotation
.end field

.field maxFieldIdsInClass:I

.field maxMethodIdsInClass:I

.field name:Ljava/lang/String;

.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;Ljava/util/concurrent/Future;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Future<",
            "Lcom/android/dx/dex/file/ClassDefItem;",
            ">;II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->futureClazz:Ljava/util/concurrent/Future;

    .line 9
    .line 10
    iput p4, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxMethodIdsInClass:I

    .line 11
    .line 12
    iput p5, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxFieldIdsInClass:I

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;Ljava/util/concurrent/Future;IILcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 15
    invoke-direct/range {p0 .. p5}, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;Ljava/util/concurrent/Future;II)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->futureClazz:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/dex/file/ClassDefItem;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/android/dx/command/dexer/Main;->access$2800(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/ClassDefItem;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lcom/android/dx/command/dexer/Main;->access$2900(Lcom/android/dx/command/dexer/Main;Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_2

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 30
    .line 31
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 40
    .line 41
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    monitor-enter v1

    .line 46
    :try_start_1
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 47
    .line 48
    iget v3, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxMethodIdsInClass:I

    .line 49
    .line 50
    invoke-static {v2, v3}, Lcom/android/dx/command/dexer/Main;->access$1920(Lcom/android/dx/command/dexer/Main;I)I

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 54
    .line 55
    iget v3, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxFieldIdsInClass:I

    .line 56
    .line 57
    invoke-static {v2, v3}, Lcom/android/dx/command/dexer/Main;->access$2020(Lcom/android/dx/command/dexer/Main;I)I

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 61
    .line 62
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 67
    .line 68
    .line 69
    monitor-exit v1

    .line 70
    return-object v0

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    throw p0

    .line 74
    :cond_1
    return-object v0

    .line 75
    :goto_1
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    instance-of v2, v1, Ljava/lang/Exception;

    .line 80
    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    move-object v0, v1

    .line 84
    check-cast v0, Ljava/lang/Exception;

    .line 85
    .line 86
    :cond_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :goto_2
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 88
    .line 89
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-boolean v1, v1, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 94
    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 98
    .line 99
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    monitor-enter v1

    .line 104
    :try_start_3
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 105
    .line 106
    iget v3, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxMethodIdsInClass:I

    .line 107
    .line 108
    invoke-static {v2, v3}, Lcom/android/dx/command/dexer/Main;->access$1920(Lcom/android/dx/command/dexer/Main;I)I

    .line 109
    .line 110
    .line 111
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 112
    .line 113
    iget v3, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->maxFieldIdsInClass:I

    .line 114
    .line 115
    invoke-static {v2, v3}, Lcom/android/dx/command/dexer/Main;->access$2020(Lcom/android/dx/command/dexer/Main;I)I

    .line 116
    .line 117
    .line 118
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 119
    .line 120
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 125
    .line 126
    .line 127
    monitor-exit v1

    .line 128
    goto :goto_3

    .line 129
    :catchall_2
    move-exception p0

    .line 130
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 131
    throw p0

    .line 132
    :cond_3
    :goto_3
    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 133
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;->call()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
