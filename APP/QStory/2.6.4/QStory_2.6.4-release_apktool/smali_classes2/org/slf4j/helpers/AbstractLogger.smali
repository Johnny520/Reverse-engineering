.class public abstract Lorg/slf4j/helpers/AbstractLogger;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2319b811d5894e77L


# instance fields
.field protected name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    instance-of v0, p5, Ljava/lang/Throwable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    check-cast p5, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p5}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    filled-new-array {p4, p5}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v3, p3

    .line 24
    invoke-virtual/range {v0 .. v5}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    array-length v0, p4

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, p4

    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    aget-object v0, p4, v0

    .line 11
    .line 12
    instance-of v1, v0, Ljava/lang/Throwable;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    .line 18
    :goto_0
    move-object v6, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_2
    if-eqz v6, :cond_4

    .line 23
    .line 24
    if-eqz p4, :cond_3

    .line 25
    .line 26
    array-length v0, p4

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    array-length v0, p4

    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    new-array v5, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {p4, v1, v5, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    move-object v3, p2

    .line 43
    move-object v4, p3

    .line 44
    invoke-virtual/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    const-string p0, "non-sensical empty or null argument array"

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    move-object v0, p0

    .line 55
    move-object v1, p1

    .line 56
    move-object v2, p2

    .line 57
    move-object v3, p3

    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, p4

    .line 60
    invoke-virtual/range {v0 .. v5}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .line 1
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    const/4 v5, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    invoke-virtual/range {v0 .. v5}, Lorg/slf4j/helpers/AbstractLogger;->handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic atDebug()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atDebug()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atError()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atError()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atInfo()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atInfo()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atLevel(Lorg/slf4j/event/Level;)L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atLevel(Lorg/slf4j/event/Level;)L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atTrace()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atTrace()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atWarn()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->atWarn()L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public debug(Ljava/lang/String;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 18
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p1

    .line 12
    move-object v5, p2

    .line 13
    move-object v6, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs debug(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public debug(Lorg/slf4j/Marker;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 30
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget-object v2, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs debug(Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 18
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p1

    .line 12
    move-object v5, p2

    .line 13
    move-object v6, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs error(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public error(Lorg/slf4j/Marker;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 30
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget-object v2, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs error(Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public abstract getFullyQualifiedCallerName()Ljava/lang/String;
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/slf4j/helpers/AbstractLogger;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
.end method

.method public info(Ljava/lang/String;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 18
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p1

    .line 12
    move-object v5, p2

    .line 13
    move-object v6, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs info(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public info(Lorg/slf4j/Marker;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 30
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget-object v2, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs info(Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public abstract synthetic isDebugEnabled()Z
.end method

.method public abstract synthetic isDebugEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public bridge synthetic isEnabledForLevel(Lorg/slf4j/event/Level;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->isEnabledForLevel(Lorg/slf4j/event/Level;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public abstract synthetic isErrorEnabled()Z
.end method

.method public abstract synthetic isErrorEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract synthetic isInfoEnabled()Z
.end method

.method public abstract synthetic isInfoEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract synthetic isTraceEnabled()Z
.end method

.method public abstract synthetic isTraceEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract synthetic isWarnEnabled()Z
.end method

.method public abstract synthetic isWarnEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public bridge synthetic makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪世哲子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public readResolve()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public trace(Ljava/lang/String;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public trace(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 18
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p1

    .line 12
    move-object v5, p2

    .line 13
    move-object v6, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public trace(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs trace(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public trace(Lorg/slf4j/Marker;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 30
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget-object v2, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs trace(Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public warn(Ljava/lang/String;)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 18
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p1

    .line 12
    move-object v5, p2

    .line 13
    move-object v6, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs warn(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public warn(Lorg/slf4j/Marker;Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_1ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 30
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget-object v2, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/slf4j/helpers/AbstractLogger;->handle2ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 34
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handle_0ArgsCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public varargs warn(Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lorg/slf4j/helpers/AbstractLogger;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/slf4j/helpers/AbstractLogger;->handleArgArrayCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
