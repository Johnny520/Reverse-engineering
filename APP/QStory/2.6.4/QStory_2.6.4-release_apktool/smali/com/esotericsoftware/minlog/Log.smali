.class public Lcom/esotericsoftware/minlog/Log;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/minlog/Log$Logger;
    }
.end annotation


# static fields
.field public static DEBUG:Z = false

.field public static ERROR:Z = false

.field public static INFO:Z = false

.field public static final LEVEL_DEBUG:I = 0x2

.field public static final LEVEL_ERROR:I = 0x5

.field public static final LEVEL_INFO:I = 0x3

.field public static final LEVEL_NONE:I = 0x6

.field public static final LEVEL_TRACE:I = 0x1

.field public static final LEVEL_WARN:I = 0x4

.field public static TRACE:Z = false

.field public static WARN:Z = false

.field private static level:I = 0x3

.field private static logger:Lcom/esotericsoftware/minlog/Log$Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    .line 3
    .line 4
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    .line 5
    .line 6
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 10
    .line 11
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 12
    .line 13
    new-instance v0, Lcom/esotericsoftware/minlog/Log$Logger;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/esotericsoftware/minlog/Log$Logger;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static DEBUG()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static ERROR()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static INFO()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static NONE()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static TRACE()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static WARN()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->set(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static debug(Ljava/lang/String;)V
    .locals 3

    .line 14
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static debug(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static error(Ljava/lang/String;)V
    .locals 3

    .line 14
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static error(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 6
    .line 7
    const/4 v1, 0x5

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static info(Ljava/lang/String;)V
    .locals 3

    .line 14
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static info(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static info(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static info(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static set(I)V
    .locals 3

    .line 1
    sput p0, Lcom/esotericsoftware/minlog/Log;->level:I

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-gt p0, v0, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->ERROR:Z

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-gt p0, v0, :cond_1

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_1
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-gt p0, v0, :cond_2

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move v0, v1

    .line 27
    :goto_2
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->INFO:Z

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    if-gt p0, v0, :cond_3

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    move v0, v1

    .line 35
    :goto_3
    sput-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 36
    .line 37
    if-gt p0, v2, :cond_4

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_4
    sput-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 41
    .line 42
    return-void
.end method

.method public static setLogger(Lcom/esotericsoftware/minlog/Log$Logger;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 2
    .line 3
    return-void
.end method

.method public static trace(Ljava/lang/String;)V
    .locals 3

    .line 14
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static trace(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static trace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static trace(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static warn(Ljava/lang/String;)V
    .locals 3

    .line 14
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static warn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/minlog/Log;->logger:Lcom/esotericsoftware/minlog/Log$Logger;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/esotericsoftware/minlog/Log$Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
