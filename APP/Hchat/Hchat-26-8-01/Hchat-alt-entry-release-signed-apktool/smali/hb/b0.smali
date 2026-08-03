.class public final synthetic Lhb/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic i:Lwb/kv;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lhb/i0;

.field public final synthetic n:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;ZIILhb/i0;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p8, p0, Lhb/b0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/b0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    iput-object p2, p0, Lhb/b0;->i:Lwb/kv;

    .line 6
    .line 7
    iput-boolean p3, p0, Lhb/b0;->j:Z

    .line 8
    .line 9
    iput p4, p0, Lhb/b0;->k:I

    .line 10
    .line 11
    iput p5, p0, Lhb/b0;->l:I

    .line 12
    .line 13
    iput-object p6, p0, Lhb/b0;->m:Lhb/i0;

    .line 14
    .line 15
    iput-object p7, p0, Lhb/b0;->n:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lhb/b0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lhb/b0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lhb/b0;->i:Lwb/kv;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lhb/b0;->j:Z

    .line 20
    .line 21
    iget v1, p0, Lhb/b0;->k:I

    .line 22
    .line 23
    iget v2, p0, Lhb/b0;->l:I

    .line 24
    .line 25
    const-string v3, "/"

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "\u6a21\u5757\u7fa4\u53d1\u5df2\u53d6\u6d88: "

    .line 30
    .line 31
    :goto_0
    invoke-static {v1, v0, v3, v2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    const-string v0, "\u6a21\u5757\u7fa4\u53d1\u5b8c\u6210: "

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const-string v0, "\u6a21\u5757\u7fa4\u53d1\u90e8\u5206\u5931\u8d25: "

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :goto_1
    iget-object v1, p0, Lhb/b0;->m:Lhb/i0;

    .line 45
    .line 46
    iget-object v2, p0, Lhb/b0;->n:Landroid/app/Activity;

    .line 47
    .line 48
    invoke-virtual {v1, v2, v0}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    const/4 v0, 0x1

    .line 53
    iget-object v1, p0, Lhb/b0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lhb/b0;->i:Lwb/kv;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-boolean v0, p0, Lhb/b0;->j:Z

    .line 66
    .line 67
    iget v1, p0, Lhb/b0;->k:I

    .line 68
    .line 69
    iget v2, p0, Lhb/b0;->l:I

    .line 70
    .line 71
    const-string v3, "/"

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    const-string v0, "\u539f\u751f\u7fa4\u53d1\u5df2\u53d6\u6d88: "

    .line 76
    .line 77
    :goto_2
    invoke-static {v1, v0, v3, v2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    if-ne v1, v2, :cond_5

    .line 83
    .line 84
    const-string v0, "\u539f\u751f\u7fa4\u53d1\u5b8c\u6210: "

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const-string v0, "\u539f\u751f\u7fa4\u53d1\u90e8\u5206\u5931\u8d25: "

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :goto_3
    iget-object v1, p0, Lhb/b0;->m:Lhb/i0;

    .line 91
    .line 92
    iget-object v2, p0, Lhb/b0;->n:Landroid/app/Activity;

    .line 93
    .line 94
    invoke-virtual {v1, v2, v0}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
