.class public abstract Lbsh/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:Ljava/util/WeakHashMap;

.field public static final 飘花落叶言子楪世兰苏哲:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子楪世哲兰苏:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/util/WeakHashMap;

.field public static final 飘花落叶言子楪世苏兰哲:[Ljava/lang/Class;

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/Class;

    .line 7
    .line 8
    sput-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Class;

    .line 9
    .line 10
    new-instance v0, Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    const-string v0, "[^\\.]+|bsh\\..*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "package.access"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "null"

    .line 34
    .line 35
    :cond_0
    const-string v1, ","

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    const/4 v2, 0x7

    .line 48
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "(?:"

    .line 56
    .line 57
    const-string v2, ").*"

    .line 58
    .line 59
    const-string v3, "|"

    .line 60
    .line 61
    invoke-static {v3, v1, v2}, Ljava/util/stream/Collectors;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/util/stream/Collector;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/regex/Pattern;

    .line 76
    .line 77
    new-instance v0, Ljava/util/WeakHashMap;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:Ljava/util/WeakHashMap;

    .line 83
    .line 84
    return-void
.end method

.method public static 飘花落叶言子世楪兰哲苏(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Z)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 1

    .line 1
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 2
    .line 3
    if-eq p2, v0, :cond_3

    .line 4
    .line 5
    invoke-static {p4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p1, p3, p2, p5}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lbsh/Interpreter;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lbsh/Interpreter;->getStrictJava()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    if-eqz p4, :cond_0

    .line 26
    .line 27
    iget-object p0, p4, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    if-eq p0, p1, :cond_0

    .line 36
    .line 37
    iget p0, p4, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p4, 0x0

    .line 46
    :cond_0
    if-nez p4, :cond_2

    .line 47
    .line 48
    new-instance p0, Lbsh/ReflectError;

    .line 49
    .line 50
    new-instance p4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    if-eqz p5, :cond_1

    .line 56
    .line 57
    const-string p5, "Static method "

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string p5, "Method "

    .line 61
    .line 62
    :goto_0
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {p3, p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p2, " not found in class\'"

    .line 73
    .line 74
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, "\'"

    .line 85
    .line 86
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p0, p1}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_2
    return-object p4

    .line 98
    :cond_3
    new-instance p0, Lbsh/UtilTargetError;

    .line 99
    .line 100
    new-instance p1, Ljava/lang/NullPointerException;

    .line 101
    .line 102
    const-string p2, "Attempt to invoke method "

    .line 103
    .line 104
    const-string p4, " on null value"

    .line 105
    .line 106
    invoke-static {p2, p3, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, p1}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static 飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 2

    .line 1
    sget-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    iget-object v0, v0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_3

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世兰苏()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance p2, Lbsh/UtilEvalError;

    .line 37
    .line 38
    const-string v0, "Can\'t reach instance field: "

    .line 39
    .line 40
    const-string v1, " from static context: "

    .line 41
    .line 42
    invoke-static {v0, p1, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2

    .line 54
    :cond_2
    :goto_1
    return-object v0

    .line 55
    :cond_3
    new-instance p2, Lbsh/ReflectError;

    .line 56
    .line 57
    const-string v0, "No such field: "

    .line 58
    .line 59
    const-string v1, " for class: "

    .line 60
    .line 61
    invoke-static {v0, p1, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {p2, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p2
.end method

.method public static 飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Ljava/math/BigInteger;

    .line 6
    .line 7
    const-class v2, Ljava/math/BigDecimal;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v3, v1

    .line 14
    :goto_0
    :try_start_0
    invoke-static {v3, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    move-object v5, p2

    .line 19
    move-object v6, p3

    .line 20
    move-object v7, p4

    .line 21
    move-object v8, p5

    .line 22
    move-object/from16 v9, p6

    .line 23
    .line 24
    invoke-static/range {v4 .. v9}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v4, v0, Lbsh/Primitive;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    move-object v4, v0

    .line 33
    check-cast v4, Lbsh/Primitive;

    .line 34
    .line 35
    invoke-virtual {v4}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-ne v4, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p1, v0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, p1}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p0

    .line 50
    :cond_1
    return-object v0

    .line 51
    :catch_0
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v1, v2

    .line 59
    :goto_1
    invoke-static {v1, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    move-object v5, p2

    .line 64
    move-object v6, p3

    .line 65
    move-object v7, p4

    .line 66
    move-object v8, p5

    .line 67
    move-object/from16 v9, p6

    .line 68
    .line 69
    invoke-static/range {v4 .. v9}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    instance-of p2, p0, Lbsh/Primitive;

    .line 74
    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    move-object p2, p0

    .line 78
    check-cast p2, Lbsh/Primitive;

    .line 79
    .line 80
    invoke-virtual {p2}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v1, :cond_3

    .line 85
    .line 86
    invoke-static {p1, p0}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0, p1}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    :cond_3
    return-object p0

    .line 95
    :catch_1
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string p2, "Method found on "

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p2, " but with error"

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, p1}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    throw p0
.end method

.method public static 飘花落叶言子世楪哲苏兰(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;[Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, " with args:"

    .line 16
    .line 17
    filled-new-array {p0, p1, v0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    :goto_0
    array-length p1, p2

    .line 26
    if-ge p0, p1, :cond_1

    .line 27
    .line 28
    aget-object v3, p2, p0

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    const-string p1, "<unknown>"

    .line 37
    .line 38
    :goto_1
    move-object v5, p1

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_1

    .line 45
    :goto_2
    const-string v0, "args["

    .line 46
    .line 47
    const-string v2, "] = "

    .line 48
    .line 49
    const-string v4, " type = "

    .line 50
    .line 51
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 p0, p0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
.end method

.method public static 飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, Lbsh/GeneratedClass;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static 飘花落叶言子世楪苏哲兰(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "invoke static Method"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p4}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    invoke-static/range {v1 .. v6}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰哲苏(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1, v5}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static 飘花落叶言子世苏哲兰楪(Ljava/lang/reflect/InvocationTargetException;Ljava/lang/String;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Lbsh/TargetError;
    .locals 7

    .line 1
    const-string v0, "Method Invocation "

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    instance-of p0, v3, Lbsh/EvalError;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    instance-of p0, v3, Lbsh/TargetError;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    move-object p0, v3

    .line 21
    check-cast p0, Lbsh/TargetError;

    .line 22
    .line 23
    invoke-virtual {p0}, Lbsh/TargetError;->inNativeCode()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :cond_1
    :goto_0
    move v6, p1

    .line 32
    new-instance v1, Lbsh/TargetError;

    .line 33
    .line 34
    move-object v5, p2

    .line 35
    move-object v4, p3

    .line 36
    invoke-direct/range {v1 .. v6}, Lbsh/TargetError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Z)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public static 飘花落叶言子世苏哲楪兰(Ljava/lang/Class;Ljava/lang/String;)Lbsh/BshMethod;
    .locals 2

    .line 1
    sget-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p1, v0}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 47
    .line 48
    :goto_0
    if-eqz p0, :cond_1

    .line 49
    .line 50
    new-instance p1, Lbsh/BshMethod;

    .line 51
    .line 52
    invoke-direct {p1, p0, v1}, Lbsh/BshMethod;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    return-object v1
.end method

.method public static 飘花落叶言子世苏楪兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, Ljava/util/Map$Entry;

    .line 19
    .line 20
    const-string v1, " for type: "

    .line 21
    .line 22
    const-string v2, "No such property setter: "

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {v0, p0}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    new-instance p2, Lbsh/ReflectError;

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {p2, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    check-cast p0, [Ljava/util/Map$Entry;

    .line 87
    .line 88
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/util/Map$Entry;)Ljava/util/Map$Entry;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p0, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_3
    instance-of v3, p0, Ljava/lang/Class;

    .line 102
    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    move-object v0, p0

    .line 106
    check-cast v0, Ljava/lang/Class;

    .line 107
    .line 108
    :cond_4
    sget-object v3, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    invoke-virtual {v3, v0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    :try_start_0
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v3, p0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    return-object p0

    .line 139
    :catch_0
    move-exception p0

    .line 140
    new-instance p1, Lbsh/ReflectError;

    .line 141
    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v0, "Property accessor threw exception: "

    .line 145
    .line 146
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-direct {p1, p2, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_5
    new-instance p0, Lbsh/ReflectError;

    .line 169
    .line 170
    new-instance p2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-static {v0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {p0, p1}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method

.method public static 飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    sget-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "resolved java method: "

    .line 16
    .line 17
    const-string v0, " on class: "

    .line 18
    .line 19
    filled-new-array {p2, p1, v0, p0}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世兰苏()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Lbsh/UtilEvalError;

    .line 38
    .line 39
    iget-object p3, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p3, p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "Cannot reach instance method: "

    .line 56
    .line 57
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, " from static context: "

    .line 64
    .line 65
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p2

    .line 79
    :cond_1
    :goto_0
    return-object p1

    .line 80
    :cond_2
    const-string p0, "null class"

    .line 81
    .line 82
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lbsh/This;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    const-string p1, "Generated class: Error getting This "

    .line 31
    .line 32
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰苏哲([Ljava/lang/Class;[[Ljava/lang/Class;)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x4

    .line 4
    const/4 v3, -0x1

    .line 5
    if-gt v1, v2, :cond_5

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_1
    array-length v5, p1

    .line 10
    if-ge v4, v5, :cond_3

    .line 11
    .line 12
    aget-object v5, p1, v4

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v5, v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    invoke-static {p0, v5, v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲世苏([Ljava/lang/Class;[Ljava/lang/Class;I)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_2

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {p0, v5}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    invoke-static {v5, v2, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲世苏([Ljava/lang/Class;[Ljava/lang/Class;I)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    invoke-static {p0, v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    :cond_1
    move v3, v4

    .line 50
    move-object v2, v5

    .line 51
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    if-eqz v2, :cond_4

    .line 55
    .line 56
    return v3

    .line 57
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    return v3
.end method

.method public static 飘花落叶言子楪世哲兰苏([Ljava/lang/Class;Ljava/util/List;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    const-string v2, "  "

    .line 10
    .line 11
    const-string v3, "="

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 22
    .line 23
    iget-object v3, v3, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move v4, v0

    .line 57
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 68
    .line 69
    invoke-virtual {v5}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    array-length v6, p0

    .line 74
    array-length v7, v5

    .line 75
    if-ne v6, v7, :cond_1

    .line 76
    .line 77
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    new-array v3, v3, [[Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, [[Ljava/lang/Class;

    .line 101
    .line 102
    invoke-static {p0, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲([Ljava/lang/Class;[[Ljava/lang/Class;)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-ltz v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v1, " remap="

    .line 121
    .line 122
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-array v0, v0, [Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    new-instance p1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v0, " match="

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    return p0

    .line 171
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 175
    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    move v3, v0

    .line 182
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_5

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    check-cast v4, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 193
    .line 194
    invoke-virtual {v4}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v4}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏世兰()Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_4

    .line 203
    .line 204
    array-length v6, p0

    .line 205
    array-length v7, v5

    .line 206
    add-int/lit8 v7, v7, -0x1

    .line 207
    .line 208
    if-lt v6, v7, :cond_4

    .line 209
    .line 210
    array-length v6, p0

    .line 211
    new-array v6, v6, [Ljava/lang/Class;

    .line 212
    .line 213
    array-length v7, v5

    .line 214
    add-int/lit8 v7, v7, -0x1

    .line 215
    .line 216
    invoke-static {v5, v0, v6, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 217
    .line 218
    .line 219
    array-length v5, v5

    .line 220
    add-int/lit8 v5, v5, -0x1

    .line 221
    .line 222
    array-length v7, p0

    .line 223
    invoke-virtual {v4}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世兰哲()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-static {v6, v5, v7, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    new-array p1, p1, [[Ljava/lang/Class;

    .line 248
    .line 249
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, [[Ljava/lang/Class;

    .line 254
    .line 255
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲([Ljava/lang/Class;[[Ljava/lang/Class;)I

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-ltz p0, :cond_6

    .line 260
    .line 261
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p0, Ljava/lang/Integer;

    .line 266
    .line 267
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    const-string v1, " remap (varargs) ="

    .line 274
    .line 275
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    new-array v0, v0, [Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    new-instance p1, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    const-string v0, " match (varargs) ="

    .line 305
    .line 306
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return p0
.end method

.method public static 飘花落叶言子楪世哲苏兰([Ljava/lang/Class;Ljava/util/List;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    const-string v2, "  "

    .line 10
    .line 11
    const-string v3, ":"

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lbsh/BshMethod;

    .line 22
    .line 23
    invoke-virtual {v3}, Lbsh/BshMethod;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " "

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lbsh/BshMethod;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move v4, v0

    .line 81
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lbsh/BshMethod;

    .line 92
    .line 93
    invoke-virtual {v5}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    array-length v6, p0

    .line 98
    array-length v7, v5

    .line 99
    if-ne v6, v7, :cond_1

    .line 100
    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    new-array v3, v3, [[Ljava/lang/Class;

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, [[Ljava/lang/Class;

    .line 125
    .line 126
    invoke-static {p0, v3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲([Ljava/lang/Class;[[Ljava/lang/Class;)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-ltz v3, :cond_3

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    new-instance p1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v0, " remap: "

    .line 145
    .line 146
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v0, " match:"

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    return p0

    .line 185
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 189
    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    move v3, v0

    .line 196
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_5

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, Lbsh/BshMethod;

    .line 207
    .line 208
    invoke-virtual {v4}, Lbsh/BshMethod;->getParameterTypes()[Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {v4}, Lbsh/BshMethod;->isVarArgs()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_4

    .line 217
    .line 218
    array-length v4, p0

    .line 219
    array-length v6, v5

    .line 220
    add-int/lit8 v6, v6, -0x1

    .line 221
    .line 222
    if-lt v4, v6, :cond_4

    .line 223
    .line 224
    array-length v4, p0

    .line 225
    new-array v4, v4, [Ljava/lang/Class;

    .line 226
    .line 227
    array-length v6, v5

    .line 228
    add-int/lit8 v6, v6, -0x1

    .line 229
    .line 230
    invoke-static {v5, v0, v4, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    .line 232
    .line 233
    array-length v6, v5

    .line 234
    add-int/lit8 v6, v6, -0x1

    .line 235
    .line 236
    aget-object v6, v5, v6

    .line 237
    .line 238
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    array-length v5, v5

    .line 243
    add-int/lit8 v5, v5, -0x1

    .line 244
    .line 245
    array-length v7, p0

    .line 246
    invoke-static {v4, v5, v7, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    new-array p1, p1, [[Ljava/lang/Class;

    .line 267
    .line 268
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    check-cast p1, [[Ljava/lang/Class;

    .line 273
    .line 274
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲([Ljava/lang/Class;[[Ljava/lang/Class;)I

    .line 275
    .line 276
    .line 277
    move-result p0

    .line 278
    if-ltz p0, :cond_6

    .line 279
    .line 280
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    check-cast p0, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    new-instance p1, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v1, " remap (varargs): "

    .line 293
    .line 294
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-array v0, v0, [Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    new-instance p1, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v0, " match (varargs):"

    .line 324
    .line 325
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_6
    return p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_6

    .line 11
    .line 12
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->isMemberClass()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v1, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 51
    .line 52
    const/16 v2, 0x9

    .line 53
    .line 54
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, [Ljava/lang/Class;

    .line 62
    .line 63
    :cond_1
    const-string v1, "Looking for most specific constructor: "

    .line 64
    .line 65
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v1, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2, v0}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    array-length v2, p2

    .line 91
    invoke-virtual {v1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eq v2, v3, :cond_2

    .line 96
    .line 97
    invoke-virtual {v1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏世兰()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {v1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏兰哲世()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_2

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    :try_start_0
    invoke-virtual {v1, p1, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    return-object p0

    .line 115
    :catch_0
    move-exception p0

    .line 116
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    instance-of p1, p1, Ljava/lang/IllegalAccessException;

    .line 125
    .line 126
    if-eqz p1, :cond_3

    .line 127
    .line 128
    new-instance p1, Lbsh/ReflectError;

    .line 129
    .line 130
    new-instance p2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v0, "We don\'t have permission to create an instance. "

    .line 133
    .line 134
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, " Use setAccessibility(true) to enable access."

    .line 153
    .line 154
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-direct {p1, p2, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_3
    throw p0

    .line 174
    :cond_4
    :goto_0
    array-length p1, v0

    .line 175
    if-nez p1, :cond_5

    .line 176
    .line 177
    new-instance p1, Lbsh/ReflectError;

    .line 178
    .line 179
    const-string p2, "Can\'t find default constructor for: "

    .line 180
    .line 181
    invoke-static {p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-direct {p1, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_5
    new-instance p1, Lbsh/ReflectError;

    .line 190
    .line 191
    new-instance p2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v1, "Can\'t find constructor: "

    .line 194
    .line 195
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v1, v0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v0, " in class: "

    .line 210
    .line 211
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-direct {p1, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_1
    throw p1

    .line 229
    :cond_6
    new-instance p1, Lbsh/ReflectError;

    .line 230
    .line 231
    const-string p2, "Can\'t create instance of an interface: "

    .line 232
    .line 233
    invoke-static {p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-direct {p1, p0}, Lbsh/ReflectError;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p1
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    aget-char v3, v1, v2

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aput-char v3, v1, v2

    .line 21
    .line 22
    new-instance v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static 飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    :try_start_0
    instance-of v2, p0, Ljava/lang/reflect/Proxy;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v1, 0x0

    .line 25
    aget-object p0, p0, v1

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {p0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)Lbsh/This;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_0
    return-object v0
.end method

.method public static 飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;
    .locals 2

    .line 1
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v0, v0, Lbsh/UtilTargetError;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    new-instance v0, Lbsh/InterpreterError;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, v1, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static 飘花落叶言子楪兰哲世苏(Ljava/lang/Class;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x2

    .line 3
    add-int/2addr v0, v1

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p2, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    aput-object p3, v0, v3

    .line 11
    .line 12
    array-length p3, p1

    .line 13
    invoke-static {p1, v2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :try_start_0
    const-string p2, "invoke"

    .line 21
    .line 22
    invoke-static {p1, p0, p2, v0, p4}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏哲兰(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    new-instance p1, Lbsh/UtilEvalError;

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p3, "Error invoking compiled command: "

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :catch_1
    move-exception p0

    .line 49
    new-instance p1, Lbsh/UtilEvalError;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    new-instance p3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string p4, "Error in compiled command: "

    .line 58
    .line 59
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method public static 飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v1, "Error in method invocation: "

    .line 2
    .line 3
    const-string v2, "Attempt to invoke method: "

    .line 4
    .line 5
    instance-of v0, p0, Lbsh/This;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lbsh/This;->isExposedThisMethod(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    check-cast v3, Lbsh/This;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    move-object v4, p1

    .line 20
    move-object v5, p2

    .line 21
    move-object v6, p3

    .line 22
    move-object v7, p4

    .line 23
    move-object v8, p5

    .line 24
    invoke-virtual/range {v3 .. v9}, Lbsh/This;->invokeMethod(Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;Z)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    move-object v4, p1

    .line 30
    move-object v5, p2

    .line 31
    move-object p1, p3

    .line 32
    move-object p2, p4

    .line 33
    move-object p3, p5

    .line 34
    invoke-virtual {p1}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    instance-of p4, p0, Lbsh/Primitive;

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p5
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_b

    .line 44
    if-eqz p4, :cond_3

    .line 45
    .line 46
    :try_start_1
    const-string v0, "equals"

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    check-cast p0, Lbsh/Primitive;

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    aget-object p1, v5, p1

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object p0, v0

    .line 70
    move-object v6, p2

    .line 71
    move-object v7, p3

    .line 72
    goto/16 :goto_b

    .line 73
    .line 74
    :cond_1
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 75
    .line 76
    if-eq p0, v0, :cond_2

    .line 77
    .line 78
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 79
    .line 80
    if-eq p0, v0, :cond_2

    .line 81
    .line 82
    move-object p5, p0

    .line 83
    check-cast p5, Lbsh/Primitive;

    .line 84
    .line 85
    invoke-virtual {p5}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :cond_2
    const-string v0, "getType"

    .line 94
    .line 95
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    const-string v0, "getClass"

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    move-object v9, p0

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    :goto_0
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 113
    .line 114
    if-ne p0, p1, :cond_5

    .line 115
    .line 116
    check-cast p0, Lbsh/Primitive;

    .line 117
    .line 118
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    return-object p0

    .line 123
    :cond_5
    return-object p5

    .line 124
    :goto_1
    const/4 v8, 0x0

    .line 125
    move-object v6, v4

    .line 126
    move-object v7, v5

    .line 127
    move-object v5, v9

    .line 128
    move-object v4, p5

    .line 129
    :try_start_2
    invoke-static/range {v3 .. v8}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰哲苏(Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 130
    .line 131
    .line 132
    move-result-object p0
    :try_end_2
    .catch Lbsh/ReflectError; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 133
    move-object v4, v6

    .line 134
    move-object v5, v7

    .line 135
    :try_start_3
    invoke-static {v9}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    invoke-virtual {v0, p3}, Lbsh/NameSpace;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catch_1
    move-exception v0

    .line 146
    :goto_2
    move-object p0, v0

    .line 147
    goto :goto_5

    .line 148
    :catch_2
    move-exception v0

    .line 149
    :goto_3
    move-object p0, v0

    .line 150
    goto :goto_6

    .line 151
    :cond_6
    :goto_4
    invoke-virtual {p0, v9, v5}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0
    :try_end_3
    .catch Lbsh/ReflectError; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_0

    .line 155
    return-object p0

    .line 156
    :catch_3
    move-exception v0

    .line 157
    move-object v4, v6

    .line 158
    goto :goto_2

    .line 159
    :goto_5
    :try_start_4
    invoke-static {p0, v4, p2, p3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏哲兰楪(Ljava/lang/reflect/InvocationTargetException;Ljava/lang/String;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Lbsh/TargetError;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    throw p0
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 164
    :catch_4
    move-exception v0

    .line 165
    move-object p5, v4

    .line 166
    move-object v9, v5

    .line 167
    move-object v4, v6

    .line 168
    move-object v5, v7

    .line 169
    goto :goto_3

    .line 170
    :goto_6
    :try_start_5
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 171
    .line 172
    if-eq v9, v0, :cond_a

    .line 173
    .line 174
    invoke-virtual {p2}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v5}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, p5, v4, v2}, Lbsh/NameSpace;->getExtensionMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lbsh/BshMethod;

    .line 183
    .line 184
    .line 185
    move-result-object v3
    :try_end_5
    .catch Lbsh/UtilEvalError; {:try_start_5 .. :try_end_5} :catch_b

    .line 186
    if-eqz v3, :cond_7

    .line 187
    .line 188
    const/4 v8, 0x0

    .line 189
    move-object v6, p2

    .line 190
    move-object v7, p3

    .line 191
    move-object v4, v5

    .line 192
    move-object v5, p1

    .line 193
    :try_start_6
    invoke-virtual/range {v3 .. v9}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;ZLjava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :catch_5
    move-exception v0

    .line 199
    :goto_7
    move-object p0, v0

    .line 200
    goto/16 :goto_b

    .line 201
    .line 202
    :cond_7
    move-object v6, p2

    .line 203
    move-object v7, p3

    .line 204
    move-object v2, v9

    .line 205
    if-eqz p4, :cond_9

    .line 206
    .line 207
    invoke-virtual {p1}, Lbsh/Interpreter;->getStrictJava()Z

    .line 208
    .line 209
    .line 210
    move-result p2
    :try_end_6
    .catch Lbsh/UtilEvalError; {:try_start_6 .. :try_end_6} :catch_5

    .line 211
    if-nez p2, :cond_9

    .line 212
    .line 213
    :try_start_7
    invoke-static {v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-nez p2, :cond_8

    .line 218
    .line 219
    move-object v3, v4

    .line 220
    move-object v4, v5

    .line 221
    move-object v5, p1

    .line 222
    invoke-static/range {v2 .. v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0
    :try_end_7
    .catch Lbsh/TargetError; {:try_start_7 .. :try_end_7} :catch_6
    .catch Lbsh/EvalError; {:try_start_7 .. :try_end_7} :catch_a
    .catch Lbsh/UtilEvalError; {:try_start_7 .. :try_end_7} :catch_5

    .line 226
    return-object p0

    .line 227
    :catch_6
    move-exception v0

    .line 228
    :goto_8
    move-object p0, v0

    .line 229
    goto :goto_9

    .line 230
    :cond_8
    move-object v3, p5

    .line 231
    move-object v8, v7

    .line 232
    move-object v7, v6

    .line 233
    move-object v6, p1

    .line 234
    :try_start_8
    invoke-static/range {v2 .. v8}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/飘花落叶言子世兰苏楪哲;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0
    :try_end_8
    .catch Lbsh/TargetError; {:try_start_8 .. :try_end_8} :catch_9
    .catch Lbsh/EvalError; {:try_start_8 .. :try_end_8} :catch_8
    .catch Lbsh/UtilEvalError; {:try_start_8 .. :try_end_8} :catch_7

    .line 238
    return-object p0

    .line 239
    :catch_7
    move-exception v0

    .line 240
    move-object v6, v7

    .line 241
    move-object v7, v8

    .line 242
    goto :goto_7

    .line 243
    :catch_8
    move-object v6, v7

    .line 244
    move-object v7, v8

    .line 245
    goto :goto_a

    .line 246
    :catch_9
    move-exception v0

    .line 247
    move-object v6, v7

    .line 248
    move-object v7, v8

    .line 249
    goto :goto_8

    .line 250
    :goto_9
    :try_start_9
    throw p0

    .line 251
    :catch_a
    :cond_9
    :goto_a
    new-instance p1, Lbsh/EvalError;

    .line 252
    .line 253
    new-instance p2, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p3

    .line 262
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-direct {p1, p2, v7, v6, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    throw p1

    .line 273
    :catch_b
    move-exception v0

    .line 274
    move-object v6, p2

    .line 275
    move-object v7, p3

    .line 276
    goto :goto_7

    .line 277
    :cond_a
    move-object v6, p2

    .line 278
    move-object v7, p3

    .line 279
    new-instance p1, Lbsh/EvalError;

    .line 280
    .line 281
    new-instance p2, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string p3, "() on undefined"

    .line 290
    .line 291
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    invoke-direct {p1, p2, v7, v6, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    throw p1
    :try_end_9
    .catch Lbsh/UtilEvalError; {:try_start_9 .. :try_end_9} :catch_5

    .line 302
    :goto_b
    invoke-virtual {p0, v7, v6}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    throw p0
.end method

.method public static 飘花落叶言子楪兰苏世哲(Lbsh/NameSpace;)[Lbsh/Variable;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-array v1, v0, [Ljava/lang/String;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lbsh/NameSpace;->getVariableNames()[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    const/4 v3, 0x6

    .line 18
    invoke-direct {v2, v3}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 26
    .line 27
    const/16 v3, 0xb

    .line 28
    .line 29
    invoke-direct {v2, v3}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, [Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    if-eqz p0, :cond_2

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {v1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lbsh/飘花落叶言子苏楪哲世兰;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0}, Lbsh/飘花落叶言子苏楪哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance v0, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 67
    .line 68
    const/16 v1, 0xa

    .line 69
    .line 70
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, [Lbsh/Variable;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_2
    :goto_1
    new-array p0, v0, [Lbsh/Variable;

    .line 81
    .line 82
    return-object p0
.end method

.method public static 飘花落叶言子楪兰苏哲世(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    const-class v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const-class v0, Ljava/util/Map$Entry;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 34
    .line 35
    iget-object v2, v2, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, p0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_2
    :goto_0
    return v1
.end method

.method public static 飘花落叶言子楪哲世兰苏(Lbsh/NameSpace;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    return-object v0
.end method

.method public static 飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Lbsh/LHS;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-static {p0, p1, v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    new-instance v2, Lbsh/LHS;

    .line 7
    .line 8
    invoke-direct {v2, v1}, Lbsh/LHS;-><init>(Lbsh/飘花落叶言子世哲苏楪兰;)V
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-object v2

    .line 12
    :catch_0
    move-exception v1

    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v2, Lbsh/NameSpace;->isClass:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2, p1, v0}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-string v3, "private"

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :cond_0
    new-instance p0, Lbsh/LHS;

    .line 50
    .line 51
    invoke-direct {p0, v2, p1}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v0, Lbsh/LHS;

    .line 62
    .line 63
    invoke-direct {v0, p0, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    throw v1
.end method

.method public static 飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/util/Map$Entry;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    check-cast p0, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    check-cast p0, [Ljava/util/Map$Entry;

    .line 58
    .line 59
    invoke-static {p1, p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/util/Map$Entry;)Ljava/util/Map$Entry;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_4
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_5
    instance-of v1, p0, Ljava/lang/Class;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    move-object v0, p0

    .line 78
    check-cast v0, Ljava/lang/Class;

    .line 79
    .line 80
    :cond_6
    sget-object v1, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-nez p1, :cond_7

    .line 97
    .line 98
    const-string p0, "property getter not found"

    .line 99
    .line 100
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_7
    const/4 v0, 0x0

    .line 111
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {p1, p0, v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    return-object p0

    .line 118
    :catch_0
    const-string p0, "Property accessor threw exception"

    .line 119
    .line 120
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 128
    .line 129
    return-object p0
.end method

.method public static 飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map$Entry;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v0, "value"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v0, "val"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v0, "key"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_0
    check-cast p0, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p0, Ljava/util/Map$Entry;

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_3
    :goto_1
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :sswitch_data_0
    .sparse-switch
        0x19e5f -> :sswitch_2
        0x1c721 -> :sswitch_1
        0x6ac9171 -> :sswitch_0
    .end sparse-switch

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static 飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p0, Lbsh/This;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lbsh/This;

    .line 6
    .line 7
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 15
    .line 16
    if-eq p0, v0, :cond_4

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p1, v0, p0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 34
    .line 35
    const-class v2, Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    const-class v2, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    invoke-static {v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v2, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 65
    .line 66
    iget-object v3, v3, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {v2, v1}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    throw v0

    .line 88
    :cond_3
    :goto_0
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_4
    new-instance p0, Lbsh/UtilTargetError;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/NullPointerException;

    .line 96
    .line 97
    const-string v1, "Attempt to access field \'"

    .line 98
    .line 99
    const-string v2, "\' on null value"

    .line 100
    .line 101
    invoke-static {v1, p1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v0}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;)Lbsh/This;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v2, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p1, p0, v0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lbsh/This;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string p1, "Unable to get class static space: "

    .line 29
    .line 30
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Lbsh/Modifiers;
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :try_start_1
    invoke-virtual {v1, v0, v3}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 17
    .line 18
    .line 19
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    :catch_0
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Lbsh/Variable;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lbsh/Modifiers;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :catch_1
    new-instance v0, Lbsh/Modifiers;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-direct {v0, p0}, Lbsh/Modifiers;-><init>(I)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static 飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p1, p0, p3}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v0, p2, v1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :catch_1
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    instance-of p2, p2, Lbsh/InterpreterError;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    instance-of p2, p2, Lbsh/UtilEvalError;

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    new-instance p0, Lbsh/UtilTargetError;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Lbsh/UtilTargetError;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_0
    new-instance p2, Lbsh/ReflectError;

    .line 44
    .line 45
    const-string p3, "Can\'t access field: "

    .line 46
    .line 47
    invoke-static {p3, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p2, p0, p1}, Lbsh/ReflectError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw p2

    .line 59
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lbsh/InterpreterError;

    .line 64
    .line 65
    throw p0

    .line 66
    :goto_1
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    iget-boolean p1, v1, Lbsh/NameSpace;->isClass:Z

    .line 79
    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    const-string p1, "private"

    .line 83
    .line 84
    const/4 v2, 0x1

    .line 85
    if-eqz p3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v1, p0, v2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object p2, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 92
    .line 93
    if-eqz p0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    :cond_2
    invoke-virtual {v1, p0}, Lbsh/NameSpace;->unwrapVariable(Lbsh/Variable;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object p0, p2

    .line 113
    :goto_2
    if-eq p2, p0, :cond_7

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_4
    invoke-static {p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-virtual {p2, p0, v2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    sget-object p3, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 127
    .line 128
    if-eqz p0, :cond_6

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    :cond_5
    invoke-virtual {p2, p0}, Lbsh/NameSpace;->unwrapVariable(Lbsh/Variable;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    move-object p0, p3

    .line 148
    :goto_3
    if-eq p3, p0, :cond_7

    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_7
    throw v0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Lbsh/LHS;
    .locals 4

    .line 1
    instance-of v0, p0, Lbsh/This;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lbsh/LHS;

    .line 7
    .line 8
    check-cast p0, Lbsh/This;

    .line 9
    .line 10
    iget-object p0, p0, Lbsh/This;->namespace:Lbsh/NameSpace;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, v1}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, p1, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Class;Ljava/lang/String;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lbsh/LHS;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lbsh/LHS;-><init>(Ljava/lang/Object;Lbsh/飘花落叶言子世哲苏楪兰;)V
    :try_end_0
    .catch Lbsh/ReflectError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-boolean v2, v1, Lbsh/NameSpace;->isClass:Z

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-virtual {v1, p1, v2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    const-string v3, "private"

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    :cond_1
    new-instance p0, Lbsh/LHS;

    .line 73
    .line 74
    invoke-direct {p0, v1, p1}, Lbsh/LHS;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏哲世(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    new-instance v0, Lbsh/LHS;

    .line 89
    .line 90
    invoke-direct {v0, p0, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_3
    throw v0
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/lang/Class;)[Lbsh/BshMethod;
    .locals 2

    .line 1
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [Lbsh/BshMethod;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    new-array p0, v1, [Lbsh/BshMethod;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-nez p0, :cond_3

    .line 40
    .line 41
    new-array p0, v1, [Lbsh/BshMethod;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_3
    invoke-virtual {p0}, Lbsh/NameSpace;->getMethods()[Lbsh/BshMethod;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/util/Map$Entry;)Ljava/util/Map$Entry;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method
