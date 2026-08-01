.class public final synthetic Lz0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/s;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    iput-object p2, p0, Lz0/s;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz0/s;->b:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lz0/u;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-static {p2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lz0/u;->a(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p1, p2}, Lz0/u;->b(Landroid/content/Context;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :goto_1
    new-instance v1, LE0/d;

    .line 35
    .line 36
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_2
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const-string v1, "runtime crash diagnostics fail"

    .line 47
    .line 48
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lz0/s;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 68
    .line 69
    .line 70
    const/16 p1, 0xa

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Ljava/lang/RuntimeException;

    .line 76
    .line 77
    const-string p2, "System.exit returned normally, while it was supposed to halt JVM."

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
