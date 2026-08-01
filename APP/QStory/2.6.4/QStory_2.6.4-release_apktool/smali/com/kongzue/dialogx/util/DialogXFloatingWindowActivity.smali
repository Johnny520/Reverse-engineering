.class public Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field static dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field fromActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field fromActivityHashCode:I

.field isScreenshot:Z

.field shownDialogXList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->shownDialogXList:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public static getDialogXFloatingWindowActivity()Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 32
    sget-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    :cond_0
    const/4 v0, 0x0

    .line 34
    sput-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    .line 35
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public finish(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->shownDialogXList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->shownDialogXList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    sput-object p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public getFromActivity()Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->fromActivity:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/app/Activity;

    .line 12
    .line 13
    return-object p0
.end method

.method public getFromActivityHashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->fromActivityHashCode:I

    .line 2
    .line 3
    return p0
.end method

.method public isSameFrom(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->fromActivityHashCode:I

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isScreenshot()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->isScreenshot:Z

    .line 2
    .line 3
    return p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->dialogXFloatingWindowActivity:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    const p1, 0x240c0083

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "fromActivityUiStatus"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/16 v0, 0x200

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    or-int/2addr p1, v0

    .line 53
    invoke-virtual {v2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "from"

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->setFromActivityHashCode(I)Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v0, "dialogXKey"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-nez p1, :cond_1

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏兰楪:Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏兰哲;

    .line 90
    .line 91
    :goto_1
    if-nez v0, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->finish()V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    iget-object v1, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->shownDialogXList:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;)V

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;-><init>(Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public setFromActivity(Landroid/app/Activity;)Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->fromActivity:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-object p0
.end method

.method public setFromActivityHashCode(I)Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->fromActivityHashCode:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setScreenshot(Z)Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->isScreenshot:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public showDialogX(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏兰楪:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->shownDialogXList:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method
