.class public final synthetic Lce/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:Lud/p;

.field public final synthetic h:Ljava/util/HashMap;

.field public final synthetic i:Lud/a;

.field public final synthetic j:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Lud/p;Ljava/util/HashMap;Lud/a;Ljava/util/HashSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce/j;->g:Lud/p;

    .line 5
    .line 6
    iput-object p2, p0, Lce/j;->h:Ljava/util/HashMap;

    .line 7
    .line 8
    iput-object p3, p0, Lce/j;->i:Lud/a;

    .line 9
    .line 10
    iput-object p4, p0, Lce/j;->j:Ljava/util/HashSet;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    check-cast p1, Lud/a;

    .line 2
    .line 3
    sget-object v0, Lmd/b;->E:Lmd/b;

    .line 4
    .line 5
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lae/c;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v2, v0, Lae/c;->g:Lae/f;

    .line 18
    .line 19
    iget-object v2, v2, Lae/f;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lce/j;->g:Lud/p;

    .line 32
    .line 33
    invoke-virtual {v4, v1}, Lud/p;->S(I)Lqd/l;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v3, v1}, Lce/l;->l(Ljava/util/List;Lqd/l;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lce/j;->h:Ljava/util/HashMap;

    .line 44
    .line 45
    iget-object v3, p0, Lce/j;->i:Lud/a;

    .line 46
    .line 47
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lce/j;->j:Ljava/util/HashSet;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return v2
.end method
