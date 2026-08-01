.class public final Le/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final b:Landroid/view/Window$Callback;

.field public c:Z

.field public d:Z

.field public e:Z

.field public final synthetic f:Le/u;


# direct methods
.method public constructor <init>(Le/u;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le/p;->f:Le/u;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "Window callback may not be null"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Le/p;->c:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Le/p;->c:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Le/p;->c:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Lg/m;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/p;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Le/p;->f:Le/u;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Le/u;->s(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_8

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Le/p;->f:Le/u;

    .line 15
    .line 16
    invoke-virtual {v2}, Le/u;->y()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Le/u;->i:Le/E;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    iget-object v3, v3, Le/E;->x:Le/D;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    :cond_0
    move v0, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v3, v3, Le/D;->e:Lh/m;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eq v5, v1, :cond_2

    .line 47
    .line 48
    move v5, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v5, v4

    .line 51
    :goto_0
    invoke-virtual {v3, v5}, Lh/m;->setQwertyMode(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0, p1, v4}, Lh/m;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :goto_1
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :cond_3
    :goto_2
    move p1, v1

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    iget-object v0, v2, Le/u;->G:Le/t;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v2, v0, v3, p1}, Le/u;->C(Le/t;ILandroid/view/KeyEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object p1, v2, Le/u;->G:Le/t;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iput-boolean v1, p1, Le/t;->l:Z

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object v0, v2, Le/u;->G:Le/t;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Le/u;->x(I)Le/t;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v2, v0, p1}, Le/u;->D(Le/t;Landroid/view/KeyEvent;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v2, v0, v3, p1}, Le/u;->C(Le/t;ILandroid/view/KeyEvent;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput-boolean v4, v0, Le/t;->k:Z

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    move p1, v4

    .line 108
    :goto_3
    if-eqz p1, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    return v4

    .line 112
    :cond_8
    :goto_4
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/p;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p2, Lh/m;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Le/p;->b(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Le/p;->f:Le/u;

    .line 8
    .line 9
    if-ne p1, p2, :cond_3

    .line 10
    .line 11
    invoke-virtual {v1}, Le/u;->y()V

    .line 12
    .line 13
    .line 14
    iget-object p1, v1, Le/u;->i:Le/E;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-boolean p2, p1, Le/E;->A:Z

    .line 19
    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-boolean v0, p1, Le/E;->A:Z

    .line 24
    .line 25
    iget-object p1, p1, Le/E;->B:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-gtz p2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/lang/ClassCastException;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    :goto_0
    return v0

    .line 49
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/p;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Le/p;->c(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object v1, p0, Le/p;->f:Le/u;

    .line 18
    .line 19
    if-ne p1, p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Le/u;->y()V

    .line 22
    .line 23
    .line 24
    iget-object p1, v1, Le/u;->i:Le/E;

    .line 25
    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    iget-boolean p2, p1, Le/E;->A:Z

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput-boolean v0, p1, Le/E;->A:Z

    .line 34
    .line 35
    iget-object p1, p1, Le/E;->B:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-gtz p2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p1, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_3
    if-nez p1, :cond_5

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Le/u;->x(I)Le/t;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-boolean p2, p1, Le/t;->m:Z

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1, p1, v0}, Le/u;->q(Le/t;Z)V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_0
    return-void

    .line 71
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lg/n;->a(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .line 1
    instance-of v0, p3, Lh/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lh/m;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    iput-boolean v2, v0, Lh/m;->x:Z

    .line 20
    .line 21
    :cond_2
    iget-object v2, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 22
    .line 23
    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iput-boolean v1, v0, Lh/m;->x:Z

    .line 30
    .line 31
    :cond_3
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Le/p;->f:Le/u;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Le/u;->x(I)Le/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Le/t;->h:Lh/m;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Le/p;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Le/p;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 2
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lg/l;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 96
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 8

    const/4 v0, 0x1

    .line 1
    iget-object v1, p0, Le/p;->f:Le/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Le/p;->b:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2}, Lg/l;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p2, Landroidx/emoji2/text/s;

    iget-object v2, v1, Le/u;->e:Landroid/content/Context;

    invoke-direct {p2, v2, p1}, Landroidx/emoji2/text/s;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 4
    iget-object p1, v1, Le/u;->o:Lg/a;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lg/a;->a()V

    .line 6
    :cond_1
    new-instance p1, LH/a;

    invoke-direct {p1, v1, p2}, LH/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v1}, Le/u;->y()V

    .line 8
    iget-object v2, v1, Le/u;->i:Le/E;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    .line 9
    iget-object v5, v2, Le/E;->x:Le/D;

    if-eqz v5, :cond_2

    .line 10
    invoke-virtual {v5}, Le/D;->a()V

    .line 11
    :cond_2
    iget-object v5, v2, Le/E;->r:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v5, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 12
    iget-object v5, v2, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 13
    new-instance v5, Le/D;

    iget-object v6, v2, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v2, v6, p1}, Le/D;-><init>(Le/E;Landroid/content/Context;LH/a;)V

    .line 14
    iget-object v6, v5, Le/D;->e:Lh/m;

    invoke-virtual {v6}, Lh/m;->w()V

    .line 15
    :try_start_0
    iget-object v7, v5, Le/D;->f:LH/a;

    .line 16
    iget-object v7, v7, LH/a;->b:Ljava/lang/Object;

    check-cast v7, Landroidx/emoji2/text/s;

    invoke-virtual {v7, v5, v6}, Landroidx/emoji2/text/s;->c(Lg/a;Lh/m;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v6}, Lh/m;->v()V

    if-eqz v7, :cond_3

    .line 18
    iput-object v5, v2, Le/E;->x:Le/D;

    .line 19
    invoke-virtual {v5}, Le/D;->i()V

    .line 20
    iget-object v6, v2, Le/E;->u:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lg/a;)V

    .line 21
    invoke-virtual {v2, v0}, Le/E;->Q(Z)V

    goto :goto_0

    :cond_3
    move-object v5, v4

    .line 22
    :goto_0
    iput-object v5, v1, Le/u;->o:Lg/a;

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {v6}, Lh/m;->v()V

    .line 24
    throw p1

    .line 25
    :cond_4
    :goto_1
    iget-object v2, v1, Le/u;->o:Lg/a;

    if-nez v2, :cond_12

    .line 26
    iget-object v2, v1, Le/u;->s:Ly/S;

    if-eqz v2, :cond_5

    .line 27
    invoke-virtual {v2}, Ly/S;->b()V

    .line 28
    :cond_5
    iget-object v2, v1, Le/u;->o:Lg/a;

    if-eqz v2, :cond_6

    .line 29
    invoke-virtual {v2}, Lg/a;->a()V

    .line 30
    :cond_6
    iget-object v2, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-nez v2, :cond_b

    .line 31
    iget-boolean v2, v1, Le/u;->C:Z

    iget-object v5, v1, Le/u;->e:Landroid/content/Context;

    if-eqz v2, :cond_8

    .line 32
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 33
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f040009

    .line 34
    invoke-virtual {v6, v7, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 35
    iget v7, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_7

    .line 36
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    .line 37
    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 38
    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 39
    new-instance v6, Lg/d;

    invoke-direct {v6, v5, v3}, Lg/d;-><init>(Landroid/content/Context;I)V

    .line 40
    invoke-virtual {v6}, Lg/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v5, v6

    .line 41
    :cond_7
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    .line 42
    invoke-direct {v6, v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    iput-object v6, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 44
    new-instance v6, Landroid/widget/PopupWindow;

    const v7, 0x7f040018

    invoke-direct {v6, v5, v4, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v6, v1, Le/u;->q:Landroid/widget/PopupWindow;

    const/4 v7, 0x2

    .line 45
    invoke-static {v6, v7}, LD/p;->d(Landroid/widget/PopupWindow;I)V

    .line 46
    iget-object v6, v1, Le/u;->q:Landroid/widget/PopupWindow;

    iget-object v7, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 47
    iget-object v6, v1, Le/u;->q:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 48
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    const v7, 0x7f040003

    invoke-virtual {v6, v7, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 49
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 50
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    .line 51
    invoke-static {v2, v5}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v2

    .line 52
    iget-object v5, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 53
    iget-object v2, v1, Le/u;->q:Landroid/widget/PopupWindow;

    const/4 v5, -0x2

    invoke-virtual {v2, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 54
    new-instance v2, Le/l;

    invoke-direct {v2, v1, v0}, Le/l;-><init>(Le/u;I)V

    iput-object v2, v1, Le/u;->r:Le/l;

    goto :goto_4

    .line 55
    :cond_8
    iget-object v2, v1, Le/u;->u:Landroid/view/ViewGroup;

    const v6, 0x7f090035

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v2, :cond_b

    .line 56
    invoke-virtual {v1}, Le/u;->y()V

    .line 57
    iget-object v6, v1, Le/u;->i:Le/E;

    if-eqz v6, :cond_9

    .line 58
    invoke-virtual {v6}, Le/E;->R()Landroid/content/Context;

    move-result-object v6

    goto :goto_2

    :cond_9
    move-object v6, v4

    :goto_2
    if-nez v6, :cond_a

    goto :goto_3

    :cond_a
    move-object v5, v6

    .line 59
    :goto_3
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 60
    invoke-virtual {v2}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v2, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 61
    :cond_b
    :goto_4
    iget-object v2, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v2, :cond_11

    .line 62
    iget-object v2, v1, Le/u;->s:Ly/S;

    if-eqz v2, :cond_c

    .line 63
    invoke-virtual {v2}, Ly/S;->b()V

    .line 64
    :cond_c
    iget-object v2, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 65
    new-instance v2, Lg/e;

    iget-object v5, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 66
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object v5, v2, Lg/e;->d:Landroid/content/Context;

    .line 68
    iput-object v6, v2, Lg/e;->e:Landroidx/appcompat/widget/ActionBarContextView;

    .line 69
    iput-object p1, v2, Lg/e;->f:LH/a;

    .line 70
    new-instance v5, Lh/m;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lh/m;-><init>(Landroid/content/Context;)V

    .line 71
    iput v0, v5, Lh/m;->l:I

    .line 72
    iput-object v5, v2, Lg/e;->i:Lh/m;

    .line 73
    iput-object v2, v5, Lh/m;->e:Lh/k;

    .line 74
    iget-object p1, p1, LH/a;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/emoji2/text/s;

    .line 75
    invoke-virtual {p1, v2, v5}, Landroidx/emoji2/text/s;->c(Lg/a;Lh/m;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 76
    invoke-virtual {v2}, Lg/e;->i()V

    .line 77
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lg/a;)V

    .line 78
    iput-object v2, v1, Le/u;->o:Lg/a;

    .line 79
    iget-boolean p1, v1, Le/u;->t:Z

    if-eqz p1, :cond_d

    iget-object p1, v1, Le/u;->u:Landroid/view/ViewGroup;

    if-eqz p1, :cond_d

    sget-object v2, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_d

    move p1, v0

    goto :goto_5

    :cond_d
    move p1, v3

    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_e

    .line 81
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 82
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Ly/L;->a(Landroid/view/View;)Ly/S;

    move-result-object p1

    invoke-virtual {p1, v2}, Ly/S;->a(F)V

    iput-object p1, v1, Le/u;->s:Ly/S;

    .line 83
    new-instance v2, Le/n;

    invoke-direct {v2, v0, v1}, Le/n;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Ly/S;->d(Ly/T;)V

    goto :goto_6

    .line 84
    :cond_e
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 85
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 86
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_f

    .line 87
    iget-object p1, v1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 88
    invoke-static {p1}, Ly/z;->c(Landroid/view/View;)V

    .line 89
    :cond_f
    :goto_6
    iget-object p1, v1, Le/u;->q:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_11

    .line 90
    iget-object p1, v1, Le/u;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, v1, Le/u;->r:Le/l;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_7

    .line 91
    :cond_10
    iput-object v4, v1, Le/u;->o:Lg/a;

    .line 92
    :cond_11
    :goto_7
    iget-object p1, v1, Le/u;->o:Lg/a;

    .line 93
    iput-object p1, v1, Le/u;->o:Lg/a;

    .line 94
    :cond_12
    iget-object p1, v1, Le/u;->o:Lg/a;

    if-eqz p1, :cond_13

    .line 95
    invoke-virtual {p2, p1}, Landroidx/emoji2/text/s;->a(Lg/a;)Lg/f;

    move-result-object p1

    return-object p1

    :cond_13
    return-object v4
.end method
