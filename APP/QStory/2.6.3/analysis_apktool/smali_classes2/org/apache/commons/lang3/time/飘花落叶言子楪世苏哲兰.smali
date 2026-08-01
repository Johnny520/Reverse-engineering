.class public final synthetic Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput-object p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

    iput-object p4, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲苏兰;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

    .line 10
    .line 11
    iput-object p4, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/io/Serializable;

    .line 7
    .line 8
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    check-cast v3, [B

    .line 16
    .line 17
    check-cast v2, Ljava/lang/ClassLoader;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p0, v3, v2}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;[BLjava/lang/ClassLoader;)Ldalvik/system/InMemoryDexClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "[BeanShell] getClassByCode: "

    .line 36
    .line 37
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-object v1

    .line 51
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    check-cast v3, Ljava/util/TimeZone;

    .line 54
    .line 55
    check-cast v2, Ljava/util/Locale;

    .line 56
    .line 57
    check-cast p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 58
    .line 59
    new-instance p1, Lorg/apache/commons/lang3/time/FastDateFormat;

    .line 60
    .line 61
    invoke-direct {p1, p0, v3, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;-><init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    check-cast p0, Ljava/lang/Integer;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/Integer;

    .line 68
    .line 69
    check-cast v2, Ljava/util/Locale;

    .line 70
    .line 71
    check-cast p1, Lorg/apache/commons/lang3/time/飘花落叶言子楪世苏兰哲;

    .line 72
    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0, v2}, Ljava/text/DateFormat;->getTimeInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    if-nez v3, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0, v2}, Ljava/text/DateFormat;->getDateInstance(ILjava/util/Locale;)Ljava/text/DateFormat;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-static {p0, p1, v2}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_1
    check-cast p0, Ljava/text/SimpleDateFormat;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    goto :goto_2

    .line 114
    :catch_1
    const-string p0, "No date time pattern for locale: "

    .line 115
    .line 116
    invoke-static {v2, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_2
    return-object v1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
