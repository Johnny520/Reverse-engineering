.class public final Lcom/lu/wxmask/ui/WebViewActivity;
.super Lf0/a;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final v:LE0/f;

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Le/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LC/d;

    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LE0/f;

    .line 12
    .line 13
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/lu/wxmask/ui/WebViewActivity;->v:LE0/f;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Le/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/widget/FrameLayout;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Le/i;->setContentView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "url"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "forceHtml"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "title"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const-string v2, "onCreate"

    .line 64
    .line 65
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Li0/a;->c([Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lcom/lu/wxmask/ui/WebViewActivity;->v:LE0/f;

    .line 73
    .line 74
    invoke-virtual {v2}, LE0/f;->a()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ly0/d;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, LE0/f;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Ly0/d;

    .line 88
    .line 89
    iget-object v3, v3, Ly0/d;->b:Landroid/webkit/WebView;

    .line 90
    .line 91
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v5, -0x1

    .line 96
    if-eq v4, v5, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p1, v3, v5, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v2}, LE0/f;->a()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ly0/d;

    .line 107
    .line 108
    new-instance v2, LH/a;

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    invoke-direct {v2, v1, p0, v3}, LH/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0, v2}, Ly0/d;->a(Ljava/lang/String;Ly0/e;)V

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x1

    .line 118
    iput-boolean p1, p0, Lcom/lu/wxmask/ui/WebViewActivity;->w:Z

    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Le/i;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/lu/wxmask/ui/WebViewActivity;->w:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/lu/wxmask/ui/WebViewActivity;->v:LE0/f;

    .line 9
    .line 10
    invoke-virtual {v0}, LE0/f;->a()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ly0/d;

    .line 15
    .line 16
    iget-object v0, v0, Ly0/d;->b:Landroid/webkit/WebView;

    .line 17
    .line 18
    const-string v1, "about:blank"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearMatches()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
