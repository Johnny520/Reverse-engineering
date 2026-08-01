.class public final synthetic Ls0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Li/t;


# direct methods
.method public synthetic constructor <init>(Li/t;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/m;->b:I

    iput-object p1, p0, Ls0/m;->c:Li/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Ls0/m;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/m;->c:Li/t;

    .line 7
    .line 8
    iget-object v0, p1, Li/t;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls0/g;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    const-string p1, "\u6682\u65e0\u53ef\u6e05\u7a7a\u5185\u5bb9"

    .line 24
    .line 25
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 30
    .line 31
    iget-object v2, p1, Li/t;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Landroid/app/Activity;

    .line 34
    .line 35
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "\u6e05\u7a7a\u9690\u85cf\u5185\u5bb9\uff1f"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v2, "\u6e05\u7a7a\u540e\uff0c\u6240\u6709\u5df2\u9690\u85cf\u7684\u81ea\u5df1\u670b\u53cb\u5708\u5185\u5bb9\u90fd\u4f1a\u6062\u590d\u663e\u793a\u3002"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v2, Ls0/y;

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    invoke-direct {v2, v3, p1}, Ls0/y;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-string p1, "\u786e\u5b9a"

    .line 57
    .line 58
    invoke-virtual {v0, p1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "\u53d6\u6d88"

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void

    .line 72
    :cond_1
    const-string p1, "listAdapter"

    .line 73
    .line 74
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :pswitch_0
    iget-object p1, p0, Ls0/m;->c:Li/t;

    .line 79
    .line 80
    iget-object p1, p1, Li/t;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lt0/e;

    .line 83
    .line 84
    invoke-virtual {p1}, Lt0/c;->a()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
