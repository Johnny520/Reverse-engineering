.class public abstract Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;
    .locals 2

    .line 1
    const-string v0, "pattern"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget v0, Lorg/apache/commons/lang3/time/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 7
    .line 8
    sget-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lorg/apache/commons/lang3/ObjectUtils$Null;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :goto_0
    sget v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    :goto_1
    new-instance v0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    invoke-direct {v1, p0, p1, p2, p3}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;-><init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/text/Format;

    .line 47
    .line 48
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;
    .locals 4

    .line 1
    sget v0, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    :goto_0
    if-eqz p4, :cond_1

    .line 11
    .line 12
    move-object v0, p4

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_1
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    filled-new-array {p1, p2, v0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v1, v2}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;-><init>([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v3, p2, p1, v0}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;-><init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p3, p4}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
