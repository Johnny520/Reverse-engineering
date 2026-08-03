.class public Lcom/alibaba/fastjson2/JSONPath;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/JSONPath$Context;
    }
.end annotation


# static fields
.field static final PARSE_CONTEXT:Lcom/alibaba/fastjson2/JSONReader$Context;

.field static final PREVIOUS:Lcom/alibaba/fastjson2/JSONPath;

.field static final ROOT:Lcom/alibaba/fastjson2/JSONPath;


# instance fields
.field final path:Ljava/lang/String;

.field public final previous:Z

.field readerContext:Lcom/alibaba/fastjson2/JSONReader$Context;

.field final root:Z

.field final segments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/JSONPathSegment;",
            ">;"
        }
    .end annotation
.end field

.field writerContext:Lcom/alibaba/fastjson2/JSONWriter$Context;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "$"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v0, v2, v1, v3, v4}, Lcom/alibaba/fastjson2/JSONPath;-><init>(Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath;->ROOT:Lcom/alibaba/fastjson2/JSONPath;

    .line 16
    .line 17
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "#-1"

    .line 25
    .line 26
    invoke-direct {v0, v2, v1, v4, v3}, Lcom/alibaba/fastjson2/JSONPath;-><init>(Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath;->PREVIOUS:Lcom/alibaba/fastjson2/JSONPath;

    .line 30
    .line 31
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath;->PARSE_CONTEXT:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/JSONPathSegment;",
            ">;ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONPath;->path:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONPath;->segments:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/JSONPath;->root:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/alibaba/fastjson2/JSONPath;->previous:Z

    .line 11
    .line 12
    return-void
.end method

.method public static of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;
    .locals 1

    .line 1
    const-string v0, "#-1"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/alibaba/fastjson2/JSONPath;->PREVIOUS:Lcom/alibaba/fastjson2/JSONPath;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathParser;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONPathParser;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONPathParser;->parse()Lcom/alibaba/fastjson2/JSONPath;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public eval(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONPath;->root:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPath;->segments:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-object p1

    .line 15
    :cond_1
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    move-object v5, v1

    .line 18
    :goto_1
    if-ge v2, v0, :cond_4

    .line 19
    .line 20
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONPath;->segments:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v6, v3

    .line 27
    check-cast v6, Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 28
    .line 29
    add-int/lit8 v10, v2, 0x1

    .line 30
    .line 31
    if-ge v10, v0, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONPath;->segments:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 40
    .line 41
    move-object v7, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move-object v7, v1

    .line 44
    :goto_2
    new-instance v3, Lcom/alibaba/fastjson2/JSONPath$Context;

    .line 45
    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    move-object v4, p0

    .line 49
    invoke-direct/range {v3 .. v9}, Lcom/alibaba/fastjson2/JSONPath$Context;-><init>(Lcom/alibaba/fastjson2/JSONPath;Lcom/alibaba/fastjson2/JSONPath$Context;Lcom/alibaba/fastjson2/JSONPathSegment;Lcom/alibaba/fastjson2/JSONPathSegment;J)V

    .line 50
    .line 51
    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    iput-object p1, v3, Lcom/alibaba/fastjson2/JSONPath$Context;->root:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_3
    invoke-virtual {v6, v3}, Lcom/alibaba/fastjson2/JSONPathSegment;->eval(Lcom/alibaba/fastjson2/JSONPath$Context;)V

    .line 57
    .line 58
    .line 59
    move-object v5, v3

    .line 60
    move v2, v10

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONPath$Context;->value:Ljava/lang/Object;

    .line 63
    .line 64
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONPath;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
