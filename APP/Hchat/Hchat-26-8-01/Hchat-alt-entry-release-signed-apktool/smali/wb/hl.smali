.class public final synthetic Lwb/hl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/hl;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lwb/hl;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/hl;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/hl;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/hl;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/hl;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/hl;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/util/List;

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
    iget-boolean v0, p0, Lwb/hl;->h:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lwb/hl;->j:Li0/a1;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lwb/hl;->k:Li0/a1;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    iget-object v0, p0, Lwb/hl;->l:Li0/a1;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-string p1, "\u56de\u590d\u6b65\u9aa4\u5df2\u66f4\u65b0"

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iget-object v1, p0, Lwb/hl;->i:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-boolean v0, p0, Lwb/hl;->h:Z

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lwb/hl;->j:Li0/a1;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget-object v0, p0, Lwb/hl;->k:Li0/a1;

    .line 61
    .line 62
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    const/4 p1, 0x0

    .line 66
    iget-object v0, p0, Lwb/hl;->l:Li0/a1;

    .line 67
    .line 68
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string p1, "\u56de\u590d\u6b65\u9aa4\u5df2\u66f4\u65b0"

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    iget-object v1, p0, Lwb/hl;->i:Landroid/content/Context;

    .line 75
    .line 76
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
