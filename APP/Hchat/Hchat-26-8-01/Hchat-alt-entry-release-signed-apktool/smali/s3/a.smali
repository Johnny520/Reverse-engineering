.class public final Ls3/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lr3/c;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:Z

.field public e:Z

.field public f:Lr3/a;


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls3/a;->f:Lr3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lr3/a;->d:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lr3/a;->b:Lr3/d;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lr3/d;->b:Ltf/k;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ltf/k;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lr3/d;->c:Ltf/k;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ltf/k;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, p0, Ls3/a;->f:Lr3/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lr3/d;->a()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
