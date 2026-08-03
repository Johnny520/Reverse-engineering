.class public final synthetic Lqb/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Lqb/k;

.field public final synthetic i:Lqb/i;

.field public final synthetic j:Z

.field public final synthetic k:Lb/e;

.field public final synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lqb/k;Lqb/i;ZLb/e;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqb/e;->g:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lqb/e;->h:Lqb/k;

    .line 7
    .line 8
    iput-object p3, p0, Lqb/e;->i:Lqb/i;

    .line 9
    .line 10
    iput-boolean p4, p0, Lqb/e;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, Lqb/e;->k:Lb/e;

    .line 13
    .line 14
    iput-object p6, p0, Lqb/e;->l:Ljava/util/List;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lqb/e;->g:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lqb/e;->h:Lqb/k;

    .line 8
    .line 9
    iget-object v3, p0, Lqb/e;->i:Lqb/i;

    .line 10
    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v1, "\u8bed\u97f3\u5408\u5e76\u5931\u8d25"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean v1, p0, Lqb/e;->j:Z

    .line 32
    .line 33
    iget-object v4, p0, Lqb/e;->k:Lb/e;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v1, v3, Lqb/i;->a:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v5, "\u5408\u5e76\u8bed\u97f3\u5df2\u4fdd\u5b58: "

    .line 42
    .line 43
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v2, Lqb/k;->b:Lia/t;

    .line 60
    .line 61
    invoke-virtual {v4, v0}, Lb/e;->r(Lfg/p;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget-object v1, p0, Lqb/e;->l:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lqb/k;->i(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "\u672a\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 84
    .line 85
    invoke-static {v0, v1}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v2, v0, v3, v1}, Lqb/k;->H(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v2, Lqb/k;->b:Lia/t;

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Lb/e;->r(Lfg/p;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :goto_0
    invoke-static {v3}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lqb/k;->i(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method
