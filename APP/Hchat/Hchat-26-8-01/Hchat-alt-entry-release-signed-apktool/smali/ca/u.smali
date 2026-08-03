.class public final synthetic Lca/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lca/e0;

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:J

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/u;->g:Lca/e0;

    .line 5
    .line 6
    iput-object p2, p0, Lca/u;->h:Landroid/app/Activity;

    .line 7
    .line 8
    iput-wide p3, p0, Lca/u;->i:J

    .line 9
    .line 10
    iput p5, p0, Lca/u;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v3, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lwb/jv;

    .line 30
    .line 31
    iget-object v0, v0, Lwb/jv;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lca/u;->g:Lca/e0;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ldb/a;

    .line 43
    .line 44
    const/4 v1, 0x7

    .line 45
    iget-wide v4, p0, Lca/u;->i:J

    .line 46
    .line 47
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {p1, v1, v2}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v1, p0, Lca/u;->h:Landroid/app/Activity;

    .line 59
    .line 60
    iget v4, p0, Lca/u;->j:I

    .line 61
    .line 62
    const-string v5, "\u7fa4\u53d1\u52a9\u624b"

    .line 63
    .line 64
    invoke-virtual/range {v0 .. v5}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1
.end method
