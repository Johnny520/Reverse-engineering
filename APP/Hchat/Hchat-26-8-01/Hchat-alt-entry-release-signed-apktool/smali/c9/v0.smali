.class public final synthetic Lc9/v0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Lc9/o2;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Lc9/o2;Landroid/app/Activity;Lfg/a;Lfg/a;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p9, p0, Lc9/v0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/v0;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/v0;->i:Lc9/o2;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/v0;->j:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lc9/v0;->k:Lfg/a;

    .line 10
    .line 11
    iput-object p5, p0, Lc9/v0;->l:Lfg/a;

    .line 12
    .line 13
    iput-object p6, p0, Lc9/v0;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lc9/v0;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lc9/v0;->o:Li0/a1;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lc9/v0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v7, p0, Lc9/v0;->h:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v9, v0

    .line 13
    check-cast v9, Ljava/util/Set;

    .line 14
    .line 15
    iget-object v1, p0, Lc9/v0;->i:Lc9/o2;

    .line 16
    .line 17
    iget-object v2, p0, Lc9/v0;->j:Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v3, p0, Lc9/v0;->k:Lfg/a;

    .line 20
    .line 21
    iget-object v4, p0, Lc9/v0;->l:Lfg/a;

    .line 22
    .line 23
    iget-object v5, p0, Lc9/v0;->m:Li0/a1;

    .line 24
    .line 25
    iget-object v6, p0, Lc9/v0;->n:Li0/a1;

    .line 26
    .line 27
    iget-object v8, p0, Lc9/v0;->o:Li0/a1;

    .line 28
    .line 29
    invoke-static/range {v1 .. v9}, Lc9/j1;->m(Lc9/o2;Landroid/app/Activity;Lfg/a;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/Set;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v5, p0, Lc9/v0;->h:Li0/a1;

    .line 36
    .line 37
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/List;

    .line 42
    .line 43
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lc9/a;

    .line 63
    .line 64
    iget-object v1, v1, Lc9/a;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v9, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    iget-object v1, p0, Lc9/v0;->i:Lc9/o2;

    .line 71
    .line 72
    iget-object v2, p0, Lc9/v0;->j:Landroid/app/Activity;

    .line 73
    .line 74
    iget-object v3, p0, Lc9/v0;->k:Lfg/a;

    .line 75
    .line 76
    iget-object v4, p0, Lc9/v0;->l:Lfg/a;

    .line 77
    .line 78
    iget-object v6, p0, Lc9/v0;->m:Li0/a1;

    .line 79
    .line 80
    iget-object v7, p0, Lc9/v0;->n:Li0/a1;

    .line 81
    .line 82
    iget-object v8, p0, Lc9/v0;->o:Li0/a1;

    .line 83
    .line 84
    invoke-static/range {v1 .. v9}, Lc9/j1;->m(Lc9/o2;Landroid/app/Activity;Lfg/a;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/util/Set;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
