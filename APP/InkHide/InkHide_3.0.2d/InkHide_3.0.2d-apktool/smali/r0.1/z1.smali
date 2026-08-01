.class public final synthetic Lr0/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr0/A1;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroid/widget/EditText;

.field public final synthetic d:I

.field public final synthetic e:Landroid/app/Activity;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lr0/A1;Ljava/lang/Object;Landroid/widget/EditText;ILandroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/z1;->a:Lr0/A1;

    iput-object p2, p0, Lr0/z1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr0/z1;->c:Landroid/widget/EditText;

    iput p4, p0, Lr0/z1;->d:I

    iput-object p5, p0, Lr0/z1;->e:Landroid/app/Activity;

    iput-boolean p6, p0, Lr0/z1;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v1, p0, Lr0/z1;->a:Lr0/A1;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, Lr0/z1;->c:Landroid/widget/EditText;

    .line 7
    .line 8
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v2, p0, Lr0/z1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v5, p0, Lr0/z1;->e:Landroid/app/Activity;

    .line 15
    .line 16
    iget-boolean v6, p0, Lr0/z1;->f:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->hasFocus()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    instance-of v0, v2, Landroid/view/View;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    move-object v0, v2

    .line 50
    check-cast v0, Landroid/view/View;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    :goto_0
    if-nez v0, :cond_2

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    :cond_3
    :goto_1
    const/16 v0, 0x8

    .line 76
    .line 77
    iget v4, p0, Lr0/z1;->d:I

    .line 78
    .line 79
    if-ge v4, v0, :cond_5

    .line 80
    .line 81
    invoke-static {v5, v2, v3}, Lr0/A1;->a(Landroid/app/Activity;Ljava/lang/Object;Landroid/widget/EditText;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    iget-object v7, v1, Lr0/A1;->c:Landroid/os/Handler;

    .line 87
    .line 88
    new-instance v0, Lr0/z1;

    .line 89
    .line 90
    invoke-direct/range {v0 .. v6}, Lr0/z1;-><init>(Lr0/A1;Ljava/lang/Object;Landroid/widget/EditText;ILandroid/app/Activity;Z)V

    .line 91
    .line 92
    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    const-wide/16 v1, 0xdc

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const-wide/16 v1, 0x78

    .line 99
    .line 100
    :goto_2
    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    :goto_3
    invoke-virtual {v1, v5, v6}, Lr0/A1;->d(Landroid/app/Activity;Z)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
