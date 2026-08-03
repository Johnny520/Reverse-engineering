.class public final synthetic Lia/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lia/q;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Lp8/l;


# direct methods
.method public synthetic constructor <init>(Lia/q;Ljava/util/List;ZZLandroid/app/Activity;Lp8/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lia/k;->g:Lia/q;

    .line 5
    .line 6
    iput-object p2, p0, Lia/k;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lia/k;->i:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lia/k;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, Lia/k;->k:Landroid/app/Activity;

    .line 13
    .line 14
    iput-object p6, p0, Lia/k;->l:Lp8/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lia/k;->g:Lia/q;

    .line 8
    .line 9
    iget-object v1, p0, Lia/k;->h:Ljava/util/List;

    .line 10
    .line 11
    iget-boolean v2, p0, Lia/k;->i:Z

    .line 12
    .line 13
    iget-boolean v3, p0, Lia/k;->j:Z

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1, v2, v3}, Lia/q;->d(Ljava/util/List;IZZ)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    move v4, v3

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    move-object v6, v5

    .line 49
    check-cast v6, Lwb/jv;

    .line 50
    .line 51
    iget-object v6, v6, Lwb/jv;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_0

    .line 58
    .line 59
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    check-cast p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lwb/jv;

    .line 85
    .line 86
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    if-eqz v4, :cond_3

    .line 93
    .line 94
    const-string p1, "\u51ed\u7a7a\u751f\u6210\u4f2a\u96c6\u8d5e"

    .line 95
    .line 96
    :goto_2
    move-object v5, p1

    .line 97
    move-object v4, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const-string p1, "\u968f\u673a\u4f2a\u96c6\u8d5e"

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_3
    iget-object v1, p0, Lia/k;->k:Landroid/app/Activity;

    .line 103
    .line 104
    iget-object v2, p0, Lia/k;->l:Lp8/l;

    .line 105
    .line 106
    invoke-virtual/range {v0 .. v5}, Lia/q;->h(Landroid/app/Activity;Lp8/l;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 110
    .line 111
    return-object p1
.end method
