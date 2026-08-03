.class public final Lze/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final g:Ljava/util/BitSet;

.field public final h:I

.field public final i:Ljava/util/List;

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(Ljava/util/BitSet;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lze/b;->g:Ljava/util/BitSet;

    .line 5
    .line 6
    iput p2, p0, Lze/b;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lze/b;->i:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lze/b;->j:I

    .line 2
    .line 3
    iget v1, p0, Lze/b;->h:I

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

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
    iget-object v0, p0, Lze/b;->g:Ljava/util/BitSet;

    .line 2
    .line 3
    iget v1, p0, Lze/b;->k:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v0, 0x1

    .line 13
    .line 14
    iput v1, p0, Lze/b;->k:I

    .line 15
    .line 16
    iget v1, p0, Lze/b;->j:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iput v1, p0, Lze/b;->j:I

    .line 21
    .line 22
    iget-object v1, p0, Lze/b;->i:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lud/a;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    return-object v0
.end method
