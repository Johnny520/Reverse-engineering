.class public final L۟/c9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/db;
.implements L۟/cb;


# static fields
.field public static final ۥ۟ۥ:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "L\u06df/c9;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public volatile ۥ:Ljava/lang/String;

.field public final ۥ۟:[J

.field public final ۥ۟۟:[D

.field public final ۥ۟۠:[Ljava/lang/String;

.field public final ۥ۟ۡ:[[B

.field public final ۥ۟ۢ:[I

.field public final ۥۣ۟:I

.field public ۥ۟ۤ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, L۟/c9;->ۥ۟ۥ:Ljava/util/TreeMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, L۟/c9;->ۥۣ۟:I

    const/4 v0, 0x1

    new-array v1, v0, [I

    iput-object v1, p0, L۟/c9;->ۥ۟ۢ:[I

    new-array v1, v0, [J

    iput-object v1, p0, L۟/c9;->ۥ۟:[J

    new-array v1, v0, [D

    iput-object v1, p0, L۟/c9;->ۥ۟۟:[D

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, L۟/c9;->ۥ۟۠:[Ljava/lang/String;

    new-array v0, v0, [[B

    iput-object v0, p0, L۟/c9;->ۥ۟ۡ:[[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟(L۟/f8;)V
    .locals 5

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    iget v2, p0, L۟/c9;->ۥ۟ۤ:I

    if-gt v1, v2, :cond_5

    iget-object v2, p0, L۟/c9;->ۥ۟ۢ:[I

    aget v2, v2, v1

    if-eq v2, v0, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, L۟/c9;->ۥ۟ۡ:[[B

    aget-object v2, v2, v1

    invoke-virtual {p1, v1, v2}, L۟/f8;->ۥ۟۟(I[B)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, L۟/c9;->ۥ۟۠:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p1, v1, v2}, L۟/f8;->ۥ۟ۡ(ILjava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, L۟/c9;->ۥ۟۟:[D

    aget-wide v3, v2, v1

    invoke-virtual {p1, v1, v3, v4}, L۟/f8;->ۥ۟ۦ(ID)V

    goto :goto_1

    :cond_3
    iget-object v2, p0, L۟/c9;->ۥ۟:[J

    aget-wide v3, v2, v1

    invoke-virtual {p1, v1, v3, v4}, L۟/f8;->ۥ۠(IJ)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v1}, L۟/f8;->ۥ۟ۥ(I)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ۥ۟ۡ(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, L۟/c9;->ۥ۟ۢ:[I

    const/4 v1, 0x4

    aput v1, v0, p1

    iget-object v0, p0, L۟/c9;->ۥ۟۠:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public final ۥ۟ۥ(I)V
    .locals 2

    iget-object v0, p0, L۟/c9;->ۥ۟ۢ:[I

    const/4 v1, 0x1

    aput v1, v0, p1

    return-void
.end method

.method public final ۥ۟ۦ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, L۟/c9;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۠(IJ)V
    .locals 2

    iget-object v0, p0, L۟/c9;->ۥ۟ۢ:[I

    const/4 v1, 0x2

    aput v1, v0, p1

    iget-object v0, p0, L۟/c9;->ۥ۟:[J

    aput-wide p2, v0, p1

    return-void
.end method

.method public final ۥۣ۠()V
    .locals 4

    .line 1
    sget-object v0, L۟/c9;->ۥ۟ۥ:Ljava/util/TreeMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, L۟/c9;->ۥۣ۟:I

    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1, p0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0xf

    .line 18
    .line 19
    if-le v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0xa

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    add-int/lit8 v3, v1, -0x1

    .line 36
    .line 37
    if-lez v1, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 43
    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw v1
.end method
