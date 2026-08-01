.class Lio/fastkv/StringSetEncoder;
.super Ljava/lang/Object;

# interfaces
.implements Lio/fastkv/interfaces/FastEncoder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fastkv/interfaces/FastEncoder<",
        "Ljava/util/Set<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# static fields
.field static final INSTANCE:Lio/fastkv/StringSetEncoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/fastkv/StringSetEncoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/fastkv/StringSetEncoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/fastkv/StringSetEncoder;->INSTANCE:Lio/fastkv/StringSetEncoder;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic decode([BII)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lio/fastkv/StringSetEncoder;->decode([BII)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public decode([BII)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    if-lez p3, :cond_2

    .line 3
    new-instance v1, Lio/fastkv/FastBuffer;

    invoke-direct {v1, p1, p2}, Lio/fastkv/FastBuffer;-><init>([BI)V

    add-int/2addr p2, p3

    .line 4
    :goto_0
    iget p1, v1, Lio/fastkv/FastBuffer;->position:I

    if-ge p1, p2, :cond_0

    .line 5
    invoke-virtual {v1}, Lio/fastkv/FastBuffer;->getVarint32()I

    move-result p1

    invoke-virtual {v1, p1}, Lio/fastkv/FastBuffer;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-ne p1, p2, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid String set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public bridge synthetic encode(Ljava/lang/Object;)[B
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lio/fastkv/StringSetEncoder;->encode(Ljava/util/Set;)[B

    move-result-object p1

    return-object p1
.end method

.method public encode(Ljava/util/Set;)[B
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    new-array p1, v1, [B

    return-object p1

    .line 4
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    .line 5
    new-array v2, v0, [I

    .line 6
    new-array v3, v0, [Ljava/lang/String;

    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v4, v1

    move v5, v4

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_1

    add-int/lit8 v4, v4, 0x5

    const/4 v6, -0x1

    .line 8
    aput v6, v2, v5

    goto :goto_1

    .line 9
    :cond_1
    invoke-static {v6}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    move-result v7

    .line 10
    aput-object v6, v3, v5

    .line 11
    aput v7, v2, v5

    .line 12
    invoke-static {v7}, Lio/fastkv/FastBuffer;->getVarint32Size(I)I

    move-result v6

    add-int/2addr v6, v7

    add-int/2addr v6, v4

    move v4, v6

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 13
    :cond_2
    new-instance p1, Lio/fastkv/FastBuffer;

    invoke-direct {p1, v4}, Lio/fastkv/FastBuffer;-><init>(I)V

    :goto_2
    if-ge v1, v0, :cond_4

    .line 14
    aget v4, v2, v1

    .line 15
    invoke-virtual {p1, v4}, Lio/fastkv/FastBuffer;->putVarint32(I)V

    if-ltz v4, :cond_3

    .line 16
    aget-object v4, v3, v1

    invoke-virtual {p1, v4}, Lio/fastkv/FastBuffer;->putString(Ljava/lang/String;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 17
    :cond_4
    iget-object p1, p1, Lio/fastkv/FastBuffer;->hb:[B

    return-object p1
.end method

.method public tag()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "StringSet"

    .line 2
    .line 3
    return-object v0
.end method
