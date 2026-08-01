.class public Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏兰哲;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x132dd72L


# instance fields
.field private final contextValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/apache/commons/lang3/tuple/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method private static lambda$getContextValues$0(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private static lambda$getFirstContextValue$1(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private static lambda$setContextValue$2(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private stream()Ljava/util/stream/Stream;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/stream/Stream<",
            "Lorg/apache/commons/lang3/tuple/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->lambda$getFirstContextValue$1(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->lambda$setContextValue$2(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->lambda$getContextValues$0(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/commons/lang3/tuple/ImmutablePair;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lorg/apache/commons/lang3/tuple/ImmutablePair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public bridge synthetic addContextValue(Ljava/lang/String;Ljava/lang/Object;)L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 12
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    move-result-object p0

    return-object p0
.end method

.method public getContextEntries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/commons/lang3/tuple/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContextLabels()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Ljava/util/stream/Collectors;->toSet()Ljava/util/stream/Collector;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/util/Set;

    .line 24
    .line 25
    return-object p0
.end method

.method public getContextValues(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p1, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 16
    .line 17
    const/16 v0, 0x1d

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/util/List;

    .line 35
    .line 36
    return-object p0
.end method

.method public getFirstContextValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->stream()Ljava/util/stream/Stream;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, p1, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 20
    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/Optional;->map(Ljava/util/function/Function;)Ljava/util/Optional;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public getFormattedExceptionMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    const/16 p1, 0xa

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :cond_1
    const-string p1, "Exception Context:\n"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 p1, 0x0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 55
    .line 56
    const-string v2, "\t["

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    add-int/2addr p1, v2

    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const/16 v3, 0x3a

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v3, "="

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :try_start_0
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception v1

    .line 98
    const-string v3, "Exception thrown on toString(): "

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    new-instance v3, Ljava/io/StringWriter;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v4, Ljava/io/PrintWriter;

    .line 109
    .line 110
    invoke-direct {v4, v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :goto_1
    const-string v1, "]\n"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    const-string p0, "---------------------------------"

    .line 130
    .line 131
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method

.method public setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, p1, v2}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public bridge synthetic setContextValue(Ljava/lang/String;Ljava/lang/Object;)L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    move-result-object p0

    return-object p0
.end method
