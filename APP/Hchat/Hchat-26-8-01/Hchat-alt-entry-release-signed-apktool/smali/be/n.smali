.class public final synthetic Lbe/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lpd/k;

.field public final synthetic b:Lud/e;

.field public final synthetic c:Ljava/util/HashMap;

.field public final synthetic d:Lbe/r;


# direct methods
.method public synthetic constructor <init>(Lpd/k;Lud/e;Ljava/util/HashMap;Lbe/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbe/n;->a:Lpd/k;

    .line 5
    .line 6
    iput-object p2, p0, Lbe/n;->b:Lud/e;

    .line 7
    .line 8
    iput-object p3, p0, Lbe/n;->c:Ljava/util/HashMap;

    .line 9
    .line 10
    iput-object p4, p0, Lbe/n;->d:Lbe/r;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lud/p;

    .line 2
    .line 3
    iget-object v0, p1, Lud/p;->k:Lpd/k;

    .line 4
    .line 5
    iget-object v1, p0, Lbe/n;->a:Lpd/k;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    check-cast p1, Lpd/j;

    .line 10
    .line 11
    iget-object p1, p1, Lpd/j;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lod/c;

    .line 14
    .line 15
    iget-object v0, p1, Lod/c;->g:Lod/a;

    .line 16
    .line 17
    iget-object v1, p0, Lbe/n;->b:Lud/e;

    .line 18
    .line 19
    iget-object v2, v1, Lud/e;->m:Lod/a;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lud/e;->l0(Lod/c;)Lud/g;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lbe/n;->d:Lbe/r;

    .line 34
    .line 35
    iget-object v0, v0, Lbe/r;->a:Lud/g;

    .line 36
    .line 37
    new-instance v1, Lae/d;

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lbe/n;->c:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method
