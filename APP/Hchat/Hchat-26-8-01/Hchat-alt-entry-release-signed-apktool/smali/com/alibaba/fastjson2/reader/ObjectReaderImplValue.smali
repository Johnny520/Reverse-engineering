.class public Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/alibaba/fastjson2/reader/ObjectReader<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation
.end field

.field final emptyVariantArgs:Ljava/lang/Object;

.field final factoryMethod:Ljava/lang/reflect/Method;

.field final features:J

.field final function:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "TI;TT;>;"
        }
    .end annotation
.end field

.field final valueClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TI;>;"
        }
    .end annotation
.end field

.field valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final valueType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TI;>;J",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/Function<",
            "TI;TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueClass:Ljava/lang/Class;

    .line 7
    .line 8
    iput-wide p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->features:J

    .line 9
    .line 10
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->constructor:Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    iput-object p9, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->factoryMethod:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iput-object p10, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->function:Ljava/util/function/Function;

    .line 15
    .line 16
    if-eqz p9, :cond_0

    .line 17
    .line 18
    invoke-virtual {p9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length p2, p1

    .line 23
    const/4 p3, 0x2

    .line 24
    if-ne p2, p3, :cond_0

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    aget-object p1, p1, p2

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->emptyVariantArgs:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->emptyVariantArgs:Ljava/lang/Object;

    .line 43
    .line 44
    return-void
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TI;>;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue<",
            "TI;TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    const/4 v10, 0x0

    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    move-object v3, p1

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v9, p2

    .line 13
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TI;>;",
            "Ljava/util/function/Function<",
            "TI;TT;>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue<",
            "TI;TT;>;"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move-object v1, p0

    move-object v2, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0
.end method


# virtual methods
.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueType:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->features:J

    .line 16
    .line 17
    or-long v5, p4, v2

    .line 18
    .line 19
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    move-object v4, p3

    .line 22
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_1
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->function:Ljava/util/function/Function;

    .line 31
    .line 32
    const-string p4, "create object error"

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    :try_start_0
    invoke-interface {p3, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-object p1

    .line 41
    :catch_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->constructor:Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p3, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    return-object p1

    .line 65
    :catch_1
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->factoryMethod:Ljava/lang/reflect/Method;

    .line 76
    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    :try_start_2
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->emptyVariantArgs:Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz p5, :cond_4

    .line 82
    .line 83
    filled-new-array {p1, p5}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p3, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :catch_2
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p3, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 103
    return-object p1

    .line 104
    :goto_1
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    invoke-virtual {v2, p4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0
.end method
