.class public abstract Lyd/a;
.super Lxd/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:Lyd/b;

.field public l:Ljava/util/List;


# direct methods
.method public constructor <init>(Lxd/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxd/a;-><init>(Lud/n;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object p1, p0, Lyd/a;->l:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final H()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyd/a;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/a;

    .line 18
    .line 19
    invoke-static {v1}, La/a;->c0(Lud/h;)Lud/p;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget v1, v1, Lnd/r;->i:I

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method
