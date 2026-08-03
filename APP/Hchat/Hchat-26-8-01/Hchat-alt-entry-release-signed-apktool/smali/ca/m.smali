.class public final synthetic Lca/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/e0;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p4, p0, Lca/m;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/m;->h:Lca/e0;

    .line 4
    .line 5
    iput-object p2, p0, Lca/m;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lca/m;->j:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lca/m;->g:I

    .line 2
    .line 3
    check-cast p1, Lp8/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lp8/c;->a()Luf/c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v4, 0x0

    .line 16
    const-string v5, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 17
    .line 18
    iget-object v0, p0, Lca/m;->h:Lca/e0;

    .line 19
    .line 20
    iget-object v1, p0, Lca/m;->i:Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v3, p0, Lca/m;->j:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v5}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lp8/c;->a()Luf/c;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object p1, p0, Lca/m;->j:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lwb/jv;

    .line 63
    .line 64
    iget-object v0, v0, Lwb/jv;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v4, 0x0

    .line 71
    const-string v5, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 72
    .line 73
    iget-object v0, p0, Lca/m;->h:Lca/e0;

    .line 74
    .line 75
    iget-object v1, p0, Lca/m;->i:Landroid/app/Activity;

    .line 76
    .line 77
    invoke-virtual/range {v0 .. v5}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
