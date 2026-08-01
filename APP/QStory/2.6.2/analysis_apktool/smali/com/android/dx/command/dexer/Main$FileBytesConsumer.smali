.class Lcom/android/dx/command/dexer/Main$FileBytesConsumer;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/direct/ClassPathOpener$Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FileBytesConsumer"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;-><init>(Lcom/android/dx/command/dexer/Main;)V

    return-void
.end method


# virtual methods
.method public onException(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/android/dx/command/dexer/Main$StopProcessing;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    instance-of v0, p1, Lcom/android/dx/cf/code/SimException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 16
    .line 17
    const-string v1, "\nEXCEPTION FROM SIMULATION:"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "\n"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 61
    .line 62
    check-cast p1, Lcom/android/dx/cf/code/SimException;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/android/dex/util/ExceptionWithContext;->getContext()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    instance-of v0, p1, Lcom/android/dx/cf/iface/ParseException;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 83
    .line 84
    const-string v1, "\nPARSE ERROR:"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    check-cast p1, Lcom/android/dx/cf/iface/ParseException;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 92
    .line 93
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 98
    .line 99
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 100
    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lcom/android/dex/util/ExceptionWithContext;->printStackTrace(Ljava/io/PrintStream;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lcom/android/dex/util/ExceptionWithContext;->printContext(Ljava/io/PrintStream;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    invoke-static {v1}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 128
    .line 129
    const-string v1, "\nUNEXPECTED TOP-LEVEL EXCEPTION:"

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 135
    .line 136
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v0, v0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 143
    .line 144
    .line 145
    :goto_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 146
    .line 147
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->access$1500(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    check-cast p1, Lcom/android/dx/command/dexer/Main$StopProcessing;

    .line 156
    .line 157
    throw p1
.end method

.method public onProcessArchiveStart(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 12
    .line 13
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->access$1300(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/DxContext;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "processing archive "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, "..."

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public processFileBytes(Ljava/lang/String;J[B)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$FileBytesConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/android/dx/command/dexer/Main;->access$1200(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;J[B)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
