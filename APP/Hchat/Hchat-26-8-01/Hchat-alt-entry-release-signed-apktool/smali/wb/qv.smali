.class public final Lwb/qv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lwb/jv;

.field public final synthetic h:Z

.field public final synthetic i:Li0/a1;


# direct methods
.method public constructor <init>(Lwb/jv;ZLi0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/qv;->g:Lwb/jv;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/qv;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwb/qv;->i:Li0/a1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwb/qv;->i:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/qv;->g:Lwb/jv;

    .line 10
    .line 11
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Set;

    .line 24
    .line 25
    invoke-static {v1, v2}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-boolean v1, p0, Lwb/qv;->h:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {v2}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/Set;

    .line 44
    .line 45
    invoke-static {v1, v2}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object v0
.end method
