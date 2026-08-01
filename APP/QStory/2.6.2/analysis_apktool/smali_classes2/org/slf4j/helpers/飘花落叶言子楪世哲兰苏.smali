.class public final Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Lorg/slf4j/event/EventRecordingLogger;

.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/Queue;

.field public final 飘花落叶言子楪兰苏哲世:Z

.field public volatile 飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/Queue;

    .line 7
    .line 8
    iput-boolean p3, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final debug(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->debug(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->debug(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    iget-object p0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p1, p1, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    return v1
.end method

.method public final error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->error(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final info(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->info(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->info(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final isDebugEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isDebugEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isDebugEnabled(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isDebugEnabled(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final isEnabledForLevel(Lorg/slf4j/event/Level;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isEnabledForLevel(Lorg/slf4j/event/Level;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isErrorEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isErrorEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isErrorEnabled(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isErrorEnabled(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final isInfoEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isInfoEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isInfoEnabled(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isInfoEnabled(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final isTraceEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isTraceEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isTraceEnabled(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isTraceEnabled(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final isWarnEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isWarnEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isWarnEnabled(Lorg/slf4j/Marker;)Z
    .locals 0

    .line 10
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isWarnEnabled(Lorg/slf4j/Marker;)Z

    move-result p0

    return p0
.end method

.method public final makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final trace(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->trace(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final warn(Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public final warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    const-string p1, "Exception occurred during engine shutdown"

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1, p2}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->warn(Lorg/slf4j/Marker;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "log"

    .line 17
    .line 18
    const-class v2, Lorg/slf4j/event/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iput-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    iput-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

    .line 38
    .line 39
    :goto_0
    iget-object p0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object p0, Lorg/slf4j/helpers/NOPLogger;->NOP_LOGGER:Lorg/slf4j/helpers/NOPLogger;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    iget-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/slf4j/event/EventRecordingLogger;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Lorg/slf4j/event/EventRecordingLogger;

    .line 20
    .line 21
    iget-object v1, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/Queue;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lorg/slf4j/event/EventRecordingLogger;-><init>(Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;Ljava/util/Queue;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/slf4j/event/EventRecordingLogger;

    .line 27
    .line 28
    :cond_2
    iget-object p0, p0, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lorg/slf4j/event/EventRecordingLogger;

    .line 29
    .line 30
    return-object p0
.end method
