.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:J


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "zoneId"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    const-string v1, "org.joda.time.chrono.GregorianChronology"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "org.joda.time.DateTimeZone"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, "getInstanceUTC"

    .line 24
    .line 25
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iput-object v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 34
    .line 35
    const-string v2, "forID"

    .line 36
    .line 37
    const-class v3, Ljava/lang/String;

    .line 38
    .line 39
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 52
    .line 53
    const-string v2, "getInstance"

    .line 54
    .line 55
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v1, v2, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    return-void

    .line 70
    :catch_0
    move-exception p0

    .line 71
    goto :goto_0

    .line 72
    :catch_1
    move-exception p0

    .line 73
    goto :goto_0

    .line 74
    :catch_2
    move-exception p0

    .line 75
    goto :goto_0

    .line 76
    :catch_3
    move-exception p0

    .line 77
    :goto_0
    const-string p1, "create ChronologyReader error"

    .line 78
    .line 79
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p2, "not support"

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    move-object p3, p2

    .line 6
    move-object p4, p3

    .line 7
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 8
    .line 9
    .line 10
    move-result p5

    .line 11
    if-nez p5, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide v2, 0x726965cd420d58abL    # 1.3548158803004202E243

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p5, v0, v2

    .line 23
    .line 24
    if-nez p5, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-wide p4, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:J

    .line 36
    .line 37
    cmp-long p4, v0, p4

    .line 38
    .line 39
    if-nez p4, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string p3, "not support fieldName "

    .line 49
    .line 50
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_2
    if-nez p3, :cond_4

    .line 73
    .line 74
    const-string p1, "UTC"

    .line 75
    .line 76
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 86
    .line 87
    invoke-interface {p1, p4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 92
    .line 93
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_4
    const-string p0, "not support"

    .line 99
    .line 100
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object p2
.end method
