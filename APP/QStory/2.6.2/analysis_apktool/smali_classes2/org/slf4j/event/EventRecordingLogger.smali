.class public Lorg/slf4j/event/EventRecordingLogger;
.super Lorg/slf4j/helpers/LegacyAbstractLogger;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field static final RECORD_ALL_EVENTS:Z = true

.field private static final serialVersionUID:J = -0x27192d5f840672dL


# instance fields
.field eventQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lorg/slf4j/event/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            ">;"
        }
    .end annotation
.end field

.field logger:Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

.field name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;Ljava/util/Queue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/slf4j/helpers/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Ljava/util/Queue<",
            "Lorg/slf4j/event/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/slf4j/helpers/LegacyAbstractLogger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/slf4j/event/EventRecordingLogger;->logger:Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    iget-object p1, p1, Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lorg/slf4j/event/EventRecordingLogger;->name:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lorg/slf4j/event/EventRecordingLogger;->eventQueue:Ljava/util/Queue;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic atDebug()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atDebug()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atError()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atError()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atInfo()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atInfo()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atLevel(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atLevel(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atTrace()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atTrace()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic atWarn()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->atWarn()L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getFullyQualifiedCallerName()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/slf4j/event/EventRecordingLogger;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public handleNormalizedLoggingCall(Lorg/slf4j/event/Level;Lorg/slf4j/Marker;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    new-instance p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iput-object p1, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/slf4j/event/Level;

    .line 10
    .line 11
    iget-object p1, p0, Lorg/slf4j/event/EventRecordingLogger;->logger:Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    iput-object p1, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lorg/slf4j/helpers/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    iget-object p1, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 p5, 0x2

    .line 24
    invoke-direct {p1, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 28
    .line 29
    :cond_0
    iget-object p1, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    iput-object p4, p3, Lorg/slf4j/event/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:[Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p0, p0, Lorg/slf4j/event/EventRecordingLogger;->eventQueue:Ljava/util/Queue;

    .line 44
    .line 45
    invoke-interface {p0, p3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public isDebugEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public bridge synthetic isEnabledForLevel(Lorg/slf4j/event/Level;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->isEnabledForLevel(Lorg/slf4j/event/Level;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public isErrorEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public isInfoEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public isTraceEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public isWarnEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public bridge synthetic makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;->makeLoggingEventBuilder(Lorg/slf4j/event/Level;)L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
