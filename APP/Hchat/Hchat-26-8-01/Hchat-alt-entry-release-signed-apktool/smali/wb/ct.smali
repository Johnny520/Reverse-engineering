.class public final synthetic Lwb/ct;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/j1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lwb/yt;

.field public final synthetic n:Li0/j1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Li0/j1;Landroid/content/Context;Li0/j1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ct;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ct;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ct;->i:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ct;->j:Li0/j1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ct;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ct;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ct;->m:Lwb/yt;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ct;->n:Li0/j1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ct;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ct;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ct;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/ct;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/ct;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/ct;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/ct;->u:Li0/a1;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, v0, Lwb/ct;->h:Li0/j1;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lwb/ct;->g:Ljava/lang/Object;

    .line 11
    .line 12
    instance-of v2, v1, Lsf/f;

    .line 13
    .line 14
    iget-object v6, v0, Lwb/ct;->i:Landroid/content/Context;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    move-object/from16 v16, v1

    .line 20
    .line 21
    check-cast v16, Lfb/d1;

    .line 22
    .line 23
    const/16 v17, 0x1

    .line 24
    .line 25
    move v2, v3

    .line 26
    iget-object v3, v0, Lwb/ct;->j:Li0/j1;

    .line 27
    .line 28
    iget-object v4, v0, Lwb/ct;->k:Li0/a1;

    .line 29
    .line 30
    iget-object v5, v0, Lwb/ct;->l:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v7, v0, Lwb/ct;->m:Lwb/yt;

    .line 33
    .line 34
    iget-object v8, v0, Lwb/ct;->n:Li0/j1;

    .line 35
    .line 36
    iget-object v9, v0, Lwb/ct;->o:Li0/a1;

    .line 37
    .line 38
    iget-object v10, v0, Lwb/ct;->p:Li0/a1;

    .line 39
    .line 40
    iget-object v11, v0, Lwb/ct;->q:Li0/a1;

    .line 41
    .line 42
    iget-object v12, v0, Lwb/ct;->r:Li0/a1;

    .line 43
    .line 44
    iget-object v13, v0, Lwb/ct;->s:Li0/a1;

    .line 45
    .line 46
    iget-object v14, v0, Lwb/ct;->t:Li0/a1;

    .line 47
    .line 48
    iget-object v15, v0, Lwb/ct;->u:Li0/a1;

    .line 49
    .line 50
    invoke-static/range {v3 .. v17}, Lwb/y2;->l1(Li0/j1;Li0/a1;Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfb/d1;Z)V

    .line 51
    .line 52
    .line 53
    const-string v3, "\u5df2\u4ece\u6b64\u5904\u521b\u5efa\u5206\u652f"

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v6, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-static {v3, v2, v9}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v2, v3

    .line 74
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    const-string v3, "[Hchat:ScriptAgent] \u521b\u5efa\u4f1a\u8bdd\u5206\u652f\u5931\u8d25"

    .line 81
    .line 82
    invoke-static {v3, v1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    const-string v1, "\u521b\u5efa\u5206\u652f\u5931\u8d25"

    .line 93
    .line 94
    :goto_1
    invoke-static {v6, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
.end method
