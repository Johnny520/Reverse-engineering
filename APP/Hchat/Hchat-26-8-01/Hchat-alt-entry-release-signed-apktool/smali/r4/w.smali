.class public final Lr4/w;
.super Lr4/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Lr4/p;)V
    .locals 2

    .line 1
    const-string v0, "field_ids"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {p0, v0, p1, v1}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Lv4/m;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lr4/v;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    const-string p1, "not found"

    .line 22
    .line 23
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    const-string p1, "ref == null"

    .line 29
    .line 30
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0
.end method

.method public final declared-synchronized m(Lv4/m;)Lr4/v;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lr4/v;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lr4/v;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lr4/d0;-><init>(Lv4/w;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 33
    .line 34
    const-string v0, "field == null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method
