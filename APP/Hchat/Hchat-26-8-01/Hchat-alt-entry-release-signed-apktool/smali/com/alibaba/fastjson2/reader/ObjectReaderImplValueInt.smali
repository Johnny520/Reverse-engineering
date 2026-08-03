.class public Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/alibaba/fastjson2/reader/ObjectReader<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final features:J

.field final function:Ljava/util/function/IntFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/IntFunction<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;JLjava/util/function/IntFunction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;J",
            "Ljava/util/function/IntFunction<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;->features:J

    .line 5
    .line 6
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;->function:Ljava/util/function/IntFunction;

    .line 7
    .line 8
    return-void
.end method

.method public static of(Ljava/lang/Class;JLjava/util/function/IntFunction;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;J",
            "Ljava/util/function/IntFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt<",
            "TT;>;"
        }
    .end annotation

    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;-><init>(Ljava/lang/Class;JLjava/util/function/IntFunction;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Class;Ljava/util/function/IntFunction;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/function/IntFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, v2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;-><init>(Ljava/lang/Class;JLjava/util/function/IntFunction;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :try_start_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValueInt;->function:Ljava/util/function/IntFunction;

    .line 14
    .line 15
    invoke-interface {p3, p2}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p2

    .line 21
    const-string p3, "create object error"

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method
