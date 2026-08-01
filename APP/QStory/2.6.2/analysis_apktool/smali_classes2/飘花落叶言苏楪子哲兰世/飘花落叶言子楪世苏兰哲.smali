.class public interface abstract L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public atDebug()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isDebugEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/slf4j/event/Level;->DEBUG:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    invoke-interface {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-object p0
.end method

.method public atError()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isErrorEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/slf4j/event/Level;->ERROR:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    invoke-interface {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-object p0
.end method

.method public atInfo()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isInfoEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/slf4j/event/Level;->INFO:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    invoke-interface {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-object p0
.end method

.method public atLevel(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isEnabledForLevel(Lorg/slf4j/event/Level;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    return-object p0
.end method

.method public atTrace()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isTraceEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/slf4j/event/Level;->TRACE:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    invoke-interface {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-object p0
.end method

.method public atWarn()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isWarnEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/slf4j/event/Level;->WARN:Lorg/slf4j/event/Level;

    .line 8
    .line 9
    invoke-interface {p0, v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    return-object p0
.end method

.method public abstract debug(Ljava/lang/String;)V
.end method

.method public abstract debug(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract error(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract info(Ljava/lang/String;)V
.end method

.method public abstract info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract isDebugEnabled()Z
.end method

.method public abstract isDebugEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public isEnabledForLevel(Lorg/slf4j/event/Level;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lorg/slf4j/event/Level;->toInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/16 v1, 0x1e

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x28

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isErrorEnabled()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    const-string p0, "Level ["

    .line 29
    .line 30
    const-string v0, "] not recognized."

    .line 31
    .line 32
    invoke-static {p1, p0, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_1
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isWarnEnabled()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isInfoEnabled()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_3
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isDebugEnabled()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_4
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isTraceEnabled()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method

.method public abstract isErrorEnabled()Z
.end method

.method public abstract isErrorEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract isInfoEnabled()Z
.end method

.method public abstract isInfoEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract isTraceEnabled()Z
.end method

.method public abstract isTraceEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public abstract isWarnEnabled()Z
.end method

.method public abstract isWarnEnabled(Lorg/slf4j/Marker;)Z
.end method

.method public makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    new-instance p0, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public abstract trace(Ljava/lang/String;)V
.end method

.method public abstract trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract warn(Ljava/lang/String;)V
.end method

.method public abstract warn(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method
