.class public final synthetic Lwb/cv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;Lfg/a;Lfg/a;Landroid/app/Activity;Li0/a1;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/cv;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/cv;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/cv;->i:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/cv;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/cv;->k:Landroid/app/Activity;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/cv;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/cv;->m:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lwb/cv;->l:Li0/a1;

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
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean v1, p0, Lwb/cv;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lwb/cv;->h:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v4, v3

    .line 42
    check-cast v4, Lwb/jv;

    .line 43
    .line 44
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/util/Set;

    .line 49
    .line 50
    iget-object v4, v4, Lwb/jv;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v0, p0, Lwb/cv;->i:Lfg/a;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v0, p0, Lwb/cv;->j:Lfg/a;

    .line 70
    .line 71
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lo9/g;

    .line 75
    .line 76
    iget-object v2, p0, Lwb/cv;->m:Lfg/l;

    .line 77
    .line 78
    invoke-direct {v0, v2, v1}, Lo9/g;-><init>(Lfg/l;Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lwb/cv;->k:Landroid/app/Activity;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    new-instance v3, Lwb/vu;

    .line 96
    .line 97
    invoke-direct {v3, v1, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object v0
.end method
