.class public final synthetic Lr0/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;

.field public final synthetic c:Landroid/widget/PopupWindow;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p8, p0, Lr0/K;->a:I

    iput-object p1, p0, Lr0/K;->b:Lr0/d0;

    iput-object p2, p0, Lr0/K;->c:Landroid/widget/PopupWindow;

    iput-object p3, p0, Lr0/K;->d:Landroid/view/View;

    iput-object p4, p0, Lr0/K;->e:Ljava/lang/String;

    iput-object p5, p0, Lr0/K;->f:Ljava/lang/String;

    iput-object p6, p0, Lr0/K;->g:Ljava/lang/String;

    iput-object p7, p0, Lr0/K;->h:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lr0/K;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lr0/K;->g:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "-post80"

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-object v3, p0, Lr0/K;->b:Lr0/d0;

    .line 20
    .line 21
    iget-object v4, p0, Lr0/K;->c:Landroid/widget/PopupWindow;

    .line 22
    .line 23
    iget-object v5, p0, Lr0/K;->d:Landroid/view/View;

    .line 24
    .line 25
    iget-object v6, p0, Lr0/K;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, p0, Lr0/K;->f:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v9, p0, Lr0/K;->h:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual/range {v3 .. v9}, Lr0/d0;->b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lr0/K;->g:Ljava/lang/String;

    .line 41
    .line 42
    const-string v2, "-post16"

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    iget-object v3, p0, Lr0/K;->b:Lr0/d0;

    .line 49
    .line 50
    iget-object v4, p0, Lr0/K;->c:Landroid/widget/PopupWindow;

    .line 51
    .line 52
    iget-object v5, p0, Lr0/K;->d:Landroid/view/View;

    .line 53
    .line 54
    iget-object v6, p0, Lr0/K;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v7, p0, Lr0/K;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v9, p0, Lr0/K;->h:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual/range {v3 .. v9}, Lr0/d0;->b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lr0/K;->g:Ljava/lang/String;

    .line 70
    .line 71
    const-string v2, "-post"

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    iget-object v3, p0, Lr0/K;->b:Lr0/d0;

    .line 78
    .line 79
    iget-object v4, p0, Lr0/K;->c:Landroid/widget/PopupWindow;

    .line 80
    .line 81
    iget-object v5, p0, Lr0/K;->d:Landroid/view/View;

    .line 82
    .line 83
    iget-object v6, p0, Lr0/K;->e:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v7, p0, Lr0/K;->f:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v9, p0, Lr0/K;->h:Landroid/view/View;

    .line 88
    .line 89
    invoke-virtual/range {v3 .. v9}, Lr0/d0;->b1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Z

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
