.class public final Lz7/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/r;


# instance fields
.field public final g:[Ljava/lang/Object;

.field public final h:I

.field public final i:Ljava/util/function/Predicate;

.field public j:I

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;ILjava/util/function/Predicate;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz7/d;->g:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lz7/d;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lz7/d;->i:Ljava/util/function/Predicate;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz7/d;->k:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lz7/d;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    :cond_0
    :goto_0
    iget v1, p0, Lz7/d;->j:I

    .line 10
    .line 11
    iget v2, p0, Lz7/d;->h:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_3

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Lz7/d;->j:I

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v1, p0, Lz7/d;->i:Ljava/util/function/Predicate;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    :cond_2
    iput-object v2, p0, Lz7/d;->k:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lz7/d;->k:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz7/d;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz7/d;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lz7/d;->k:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method
