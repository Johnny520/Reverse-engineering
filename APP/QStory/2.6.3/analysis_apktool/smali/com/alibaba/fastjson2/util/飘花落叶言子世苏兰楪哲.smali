.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/function/ToIntFunction;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v1, "org.joda.time.chrono.ISOChronology"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v1, "getInstance"

    .line 16
    .line 17
    invoke-virtual {p2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "withUTC"

    .line 26
    .line 27
    invoke-virtual {p2, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 36
    .line 37
    const-string p2, "getYear"

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/util/function/ToIntFunction;

    .line 48
    .line 49
    const-string p2, "getMonthOfYear"

    .line 50
    .line 51
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/function/ToIntFunction;

    .line 60
    .line 61
    const-string p2, "getDayOfMonth"

    .line 62
    .line 63
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {p2}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:Ljava/util/function/ToIntFunction;

    .line 72
    .line 73
    const-string p2, "getChronology"

    .line 74
    .line 75
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    return-void

    .line 86
    :catch_0
    move-exception p0

    .line 87
    goto :goto_0

    .line 88
    :catch_1
    move-exception p0

    .line 89
    goto :goto_0

    .line 90
    :catch_2
    move-exception p0

    .line 91
    goto :goto_0

    .line 92
    :catch_3
    move-exception p0

    .line 93
    goto :goto_0

    .line 94
    :catch_4
    move-exception p0

    .line 95
    :goto_0
    const-string p1, "create LocalDateWriter error"

    .line 96
    .line 97
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 3

    .line 1
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/util/function/ToIntFunction;

    .line 2
    .line 3
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/function/ToIntFunction;

    .line 8
    .line 9
    invoke-interface {v0, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:Ljava/util/function/ToIntFunction;

    .line 14
    .line 15
    invoke-interface {v1, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/util/function/Function;

    .line 20
    .line 21
    invoke-interface {v2, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-eqz p4, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 43
    .line 44
    if-eq v2, p0, :cond_2

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 50
    .line 51
    .line 52
    const-string p0, "year"

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 58
    .line 59
    .line 60
    const-string p0, "month"

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 66
    .line 67
    .line 68
    const-string p0, "day"

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 74
    .line 75
    .line 76
    const-string p0, "chronology"

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    :goto_0
    invoke-static {p3, v0, v1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Ljava/util/function/ToIntFunction;

    .line 2
    .line 3
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    iget-object p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:Ljava/util/function/ToIntFunction;

    .line 8
    .line 9
    invoke-interface {p4, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    iget-object p5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:Ljava/util/function/ToIntFunction;

    .line 14
    .line 15
    invoke-interface {p5, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p5

    .line 19
    iget-object p6, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:Ljava/util/function/Function;

    .line 20
    .line 21
    invoke-interface {p6, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p6, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 26
    .line 27
    if-eq p2, p6, :cond_1

    .line 28
    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 33
    .line 34
    .line 35
    const-string p0, "year"

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 41
    .line 42
    .line 43
    const-string p0, "month"

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 49
    .line 50
    .line 51
    const-string p0, "day"

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 57
    .line 58
    .line 59
    const-string p0, "chronology"

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    :goto_0
    invoke-static {p3, p4, p5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-nez p0, :cond_2

    .line 80
    .line 81
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    :cond_2
    if-nez p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    invoke-virtual {p0, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
