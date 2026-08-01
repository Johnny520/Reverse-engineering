.class public abstract Lt0/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Ly/J;


# static fields
.field public static final synthetic g:I


# instance fields
.field public b:Z

.field public c:LM0/l;

.field public d:LM0/l;

.field public e:Lt0/b;

.field public f:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    const-string p2, "context"

    .line 2
    .line 3
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static b(Landroid/view/ViewGroup;)Lt0/c;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    const/4 v1, -0x1

    .line 8
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-static {p0, v0}, Lb1/h;->v(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Lt0/c;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Lt0/c;

    .line 19
    .line 20
    invoke-virtual {v1}, Lt0/c;->c()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static h(Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lt0/c;->b(Landroid/view/ViewGroup;)Lt0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_4

    .line 11
    .line 12
    invoke-static {p0, v2}, Lb1/h;->v(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    instance-of v4, v3, Lt0/c;

    .line 17
    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    if-ne v3, v0, :cond_2

    .line 21
    .line 22
    check-cast v3, Lt0/c;

    .line 23
    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v5, 0x21

    .line 27
    .line 28
    if-lt v4, v5, :cond_3

    .line 29
    .line 30
    iget-object v4, v3, Lt0/c;->e:Lt0/b;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v3}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance v5, Lt0/b;

    .line 43
    .line 44
    invoke-direct {v5, v3}, Lt0/b;-><init>(Lt0/c;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Lt0/a;->b(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4, v5}, Lt0/a;->e(Landroid/window/OnBackInvokedDispatcher;Lt0/b;)V

    .line 52
    .line 53
    .line 54
    iput-object v5, v3, Lt0/c;->e:Lt0/b;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    check-cast v3, Lt0/c;

    .line 58
    .line 59
    invoke-virtual {v3}, Lt0/c;->i()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt0/c;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lt0/c;->i()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "input_method"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    new-instance v1, LA0/m;

    .line 48
    .line 49
    const/16 v2, 0xd

    .line 50
    .line 51
    invoke-direct {v1, p0, v0, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lt0/c;->d:LM0/l;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-interface {v0, p0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    invoke-static {v0}, Lt0/c;->b(Landroid/view/ViewGroup;)Lt0/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-ne v0, p0, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lt0/c;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v0, 0x1

    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lt0/c;->a()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return v0

    .line 27
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public abstract e(Lt0/c;)Landroid/view/View;
.end method

.method public final f(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x4

    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x1

    .line 23
    if-ne p1, p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lt0/c;->d()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lt0/c;->a()V

    .line 33
    .line 34
    .line 35
    return p2

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final g()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt0/c;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/view/Window;->getCurrentFocus()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v3, "keyboardTagView"

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    new-instance v4, Landroid/widget/EditText;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v4, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    check-cast v1, Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {v1, v4, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v1, v4

    .line 55
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v3, "input_method"

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0}, Lt0/c;->j()Z

    .line 85
    .line 86
    .line 87
    const/4 v1, -0x1

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 91
    .line 92
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 97
    .line 98
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 99
    .line 100
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-nez v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0}, Lt0/c;->getRootContainer()Landroid/view/ViewGroup;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    invoke-virtual {v1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lt0/c;->getRootContainer()Landroid/view/ViewGroup;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    invoke-static {v0}, Lt0/c;->h(Landroid/view/ViewGroup;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget-object v0, p0, Lt0/c;->c:LM0/l;

    .line 131
    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    invoke-interface {v0, p0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :cond_8
    const/high16 v0, 0x42c60000    # 99.0f

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Landroid/view/View;->setZ(F)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final getActivity()Landroid/app/Activity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    instance-of v1, v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final getOnDismissListener()LM0/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LM0/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lt0/c;->d:LM0/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnShowListener()LM0/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LM0/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lt0/c;->c:LM0/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRootContainer()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    iput-object v0, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 28
    .line 29
    return-object v0
.end method

.method public final get_rootContainer()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lt0/c;->e:Lt0/b;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-static {v1}, Lt0/a;->b(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-static {v1, v0}, Lt0/a;->d(Landroid/window/OnBackInvokedDispatcher;Lt0/b;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lt0/c;->e:Lt0/b;

    .line 30
    .line 31
    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 12
    .line 13
    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v2, 0x1c

    .line 17
    .line 18
    if-lt v1, v2, :cond_4

    .line 19
    .line 20
    invoke-static {p0, p0}, Ly/L;->g(Lt0/c;Lt0/c;)V

    .line 21
    .line 22
    .line 23
    if-lt v1, v2, :cond_0

    .line 24
    .line 25
    invoke-static {p0, p0}, Ly/E;->a(Landroid/view/View;Ly/J;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const v1, 0x7f0900a3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ne v1, v0, :cond_4

    .line 56
    .line 57
    sget-object v1, Ly/K;->d:Ljava/util/ArrayList;

    .line 58
    .line 59
    monitor-enter v1

    .line 60
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-ne v3, p0, :cond_2

    .line 81
    .line 82
    monitor-exit v1

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    sget-object v2, Ly/K;->d:Ljava/util/ArrayList;

    .line 87
    .line 88
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    monitor-exit v1

    .line 97
    goto :goto_1

    .line 98
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw v0

    .line 100
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lt0/c;->j()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    const/16 v2, 0x2c

    .line 111
    .line 112
    invoke-static {v2}, LB0/a;->b(I)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {p0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    const/4 v1, 0x0

    .line 129
    invoke-virtual {p0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 130
    .line 131
    .line 132
    :goto_2
    iget-boolean v1, p0, Lt0/c;->b:Z

    .line 133
    .line 134
    if-nez v1, :cond_6

    .line 135
    .line 136
    invoke-virtual {p0, p0}, Lt0/c;->e(Lt0/c;)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    iput-boolean v0, p0, Lt0/c;->b:Z

    .line 144
    .line 145
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt0/c;->i()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p0}, Ly/L;->g(Lt0/c;Lt0/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_1

    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lt0/c;->d()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lt0/c;->a()V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public final setOnDismissListener(LM0/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM0/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lt0/c;->d:LM0/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnShowListener(LM0/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM0/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lt0/c;->c:LM0/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setRootContainer(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setViewCreated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt0/c;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final set_rootContainer(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/c;->f:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-void
.end method
