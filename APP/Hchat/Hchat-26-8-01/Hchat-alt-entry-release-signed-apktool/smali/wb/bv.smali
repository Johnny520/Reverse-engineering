.class public final synthetic Lwb/bv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Integer;Lfg/a;Landroid/app/Activity;Li0/a1;Li0/a1;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/bv;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lwb/bv;->h:Ljava/lang/Integer;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/bv;->i:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/bv;->j:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/bv;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/bv;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/bv;->m:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lwb/bv;->k:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ln2/s;

    .line 8
    .line 9
    iget-object v0, v0, Ln2/s;->a:Li2/g;

    .line 10
    .line 11
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lwb/bv;->g:I

    .line 18
    .line 19
    iget-object v2, p0, Lwb/bv;->h:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lt v3, v1, :cond_1

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-le v3, v4, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v1, p0, Lwb/bv;->i:Lfg/a;

    .line 43
    .line 44
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    new-instance v1, Lwb/hh;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    iget-object v3, p0, Lwb/bv;->m:Lfg/l;

    .line 51
    .line 52
    invoke-direct {v1, v3, v0, v2}, Lwb/hh;-><init>(Lfg/l;Ljava/lang/Integer;I)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lwb/bv;->j:Landroid/app/Activity;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    new-instance v3, Lwb/vu;

    .line 70
    .line 71
    invoke-direct {v3, v0, v1}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const-string v2, "\u8bf7\u8f93\u5165 "

    .line 85
    .line 86
    const-string v3, "-"

    .line 87
    .line 88
    invoke-static {v1, v2, v3, v0}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const-string v0, "\u8bf7\u8f93\u5165\u4e0d\u5c0f\u4e8e "

    .line 94
    .line 95
    const-string v2, " \u7684\u6574\u6570"

    .line 96
    .line 97
    invoke-static {v1, v0, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_1
    iget-object v1, p0, Lwb/bv;->l:Li0/a1;

    .line 102
    .line 103
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 107
    .line 108
    return-object v0
.end method
