.class public final Lyyds/ᛶᛶᛳᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

.field public final ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᲁᛲᲀᛷ;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Window callback may not be null"

    .line 12
    .line 13
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

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
    if-nez v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ:Lyyds/ᛳᛲᛱᛱ;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    iget-object v2, v2, Lyyds/ᛳᛲᛱᛱ;->ᛲᛳᛶᲁ:Lyyds/ᲁᲀᛸᛴ;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :cond_0
    move v0, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v2, v2, Lyyds/ᲁᲀᛸᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛴᛵᛸ;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v4}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eq v4, v1, :cond_2

    .line 47
    .line 48
    move v4, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v4, v3

    .line 51
    :goto_0
    invoke-virtual {v2, v4}, Lyyds/ᛴᛴᛵᛸ;->setQwertyMode(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0, p1, v3}, Lyyds/ᛴᛴᛵᛸ;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :goto_1
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object v0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛲᲀᛵᛷ:Lyyds/ᛱᛷᲈᛳ;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p0, v0, v2, p1}, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᛵᛸ(Lyyds/ᛱᛷᲈᛳ;ILandroid/view/KeyEvent;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛲᲀᛵᛷ:Lyyds/ᛱᛷᲈᛳ;

    .line 76
    .line 77
    if-eqz p0, :cond_6

    .line 78
    .line 79
    iput-boolean v1, p0, Lyyds/ᛱᛷᲈᛳ;->ᛷᛵᲇᲀ:Z

    .line 80
    .line 81
    return v1

    .line 82
    :cond_4
    iget-object v0, p0, Lyyds/ᲁᛲᲀᛷ;->ᛲᲀᛵᛷ:Lyyds/ᛱᛷᲈᛳ;

    .line 83
    .line 84
    if-nez v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0, v3}, Lyyds/ᲁᛲᲀᛷ;->ᛶᲈᛴᲈ(I)Lyyds/ᛱᛷᲈᛳ;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0, v0, p1}, Lyyds/ᲁᛲᲀᛷ;->ᛲᛳᛴᛸ(Lyyds/ᛱᛷᲈᛳ;Landroid/view/KeyEvent;)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {p0, v0, v2, p1}, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᛵᛸ(Lyyds/ᛱᛷᲈᛳ;ILandroid/view/KeyEvent;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    iput-boolean v3, v0, Lyyds/ᛱᛷᲈᛳ;->ᛷᛲᲈᛱ:Z

    .line 102
    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    return v3

    .line 107
    :cond_6
    :goto_2
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {p0}, Landroid/view/Window$Callback;->onContentChanged()V

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
    instance-of v0, p2, Lyyds/ᛴᛴᛵᛸ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛶᛳᲇ;->ᛵᛸᛸᛷ(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, p2, :cond_2

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ:Lyyds/ᛳᛲᛱᛱ;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-boolean p2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛷᛵᲇᲀ:Z

    .line 21
    .line 22
    if-ne v0, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛷᛵᲇᲀ:Z

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-gtz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 43
    .line 44
    .line 45
    return p0

    .line 46
    :cond_2
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 18
    .line 19
    if-ne p1, p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ()V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ:Lyyds/ᛳᛲᛱᛱ;

    .line 25
    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛲᛲᲈᲈ:Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-boolean p2, p0, Lyyds/ᛳᛲᛱᛱ;->ᛷᛵᲇᲀ:Z

    .line 31
    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput-boolean v0, p0, Lyyds/ᛳᛲᛱᛱ;->ᛷᛵᲇᲀ:Z

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-gtz p0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    if-nez p1, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lyyds/ᲁᛲᲀᛷ;->ᛶᲈᛴᲈ(I)Lyyds/ᛱᛷᲈᛳ;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-boolean p2, p1, Lyyds/ᛱᛷᲈᛳ;->ᛲᛲᲈᲈ:Z

    .line 62
    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0}, Lyyds/ᲁᛲᲀᛷ;->ᛳᲁᲁᲇ(Lyyds/ᛱᛷᲈᛳ;Z)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_0
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lyyds/ᲁᛵᛴᛴ;->ᛲᲈᲁ(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .line 1
    instance-of v0, p3, Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lyyds/ᛴᛴᛵᛸ;

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
    iput-boolean v2, v0, Lyyds/ᛴᛴᛵᛸ;->ᛵᲀᛵᛸ:Z

    .line 20
    .line 21
    :cond_2
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 22
    .line 23
    invoke-interface {p0, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iput-boolean v1, v0, Lyyds/ᛴᛴᛵᛸ;->ᛵᲀᛵᛸ:Z

    .line 30
    .line 31
    :cond_3
    return p0
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lyyds/ᲁᛲᲀᛷ;->ᛶᲈᛴᲈ(I)Lyyds/ᛱᛷᲈᛳ;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lyyds/ᛱᛷᲈᛳ;->ᛱᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 0

    .line 8
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    invoke-interface {p0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result p0

    return p0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lyyds/ᛷᛲᛳᛴ;->ᛲᲈᲁ(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 502
    const/4 p0, 0x0

    return-object p0
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛲᲀᛷ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛲᲈᲈ:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛳᛴᛸ:Z

    .line 6
    .line 7
    if-eqz v2, :cond_14

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    new-instance p0, Lyyds/ᛲᛲᲇᲈ;

    .line 14
    .line 15
    invoke-direct {p0, v1, p1}, Lyyds/ᛲᛲᲇᲈ;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lyyds/ᛲᲁᛲᛸ;->ᛲᲈᲁ()V

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance p1, Lyyds/ᲀᲈᛶᲈ;

    .line 26
    .line 27
    const/4 p2, 0x4

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {p1, p2, v0, p0, v2}, Lyyds/ᲀᲈᛶᲈ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ()V

    .line 33
    .line 34
    .line 35
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ:Lyyds/ᛳᛲᛱᛱ;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    const/4 v4, 0x0

    .line 39
    if-eqz p2, :cond_4

    .line 40
    .line 41
    iget-object v5, p2, Lyyds/ᛳᛲᛱᛱ;->ᛲᛳᛶᲁ:Lyyds/ᲁᲀᛸᛴ;

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    invoke-virtual {v5}, Lyyds/ᲁᲀᛸᛴ;->ᛲᲈᲁ()V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v5, p2, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 49
    .line 50
    invoke-virtual {v5, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v5, p2, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 54
    .line 55
    invoke-virtual {v5}, Landroidx/appcompat/widget/ActionBarContextView;->ᛲᛴᛳᛲ()V

    .line 56
    .line 57
    .line 58
    new-instance v5, Lyyds/ᲁᲀᛸᛴ;

    .line 59
    .line 60
    iget-object v6, p2, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 61
    .line 62
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-direct {v5, p2, v6, p1}, Lyyds/ᲁᲀᛸᛴ;-><init>(Lyyds/ᛳᛲᛱᛱ;Landroid/content/Context;Lyyds/ᲀᲈᛶᲈ;)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v5, Lyyds/ᲁᲀᛸᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛴᛵᛸ;

    .line 70
    .line 71
    invoke-virtual {v6}, Lyyds/ᛴᛴᛵᛸ;->ᛵᲀᲈᛴ()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v7, v5, Lyyds/ᲁᲀᛸᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 75
    .line 76
    iget-object v7, v7, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Lyyds/ᛲᛲᲇᲈ;

    .line 79
    .line 80
    invoke-virtual {v7, v5, v6}, Lyyds/ᛲᛲᲇᲈ;->ᛷᲈᲈᲁ(Lyyds/ᛲᲁᛲᛸ;Lyyds/ᛴᛴᛵᛸ;)Z

    .line 81
    .line 82
    .line 83
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    invoke-virtual {v6}, Lyyds/ᛴᛴᛵᛸ;->ᛶᛸᲀᲁ()V

    .line 85
    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    iput-object v5, p2, Lyyds/ᛳᛲᛱᛱ;->ᛲᛳᛶᲁ:Lyyds/ᲁᲀᛸᛴ;

    .line 90
    .line 91
    invoke-virtual {v5}, Lyyds/ᲁᲀᛸᛴ;->ᛲᛳᛶᲁ()V

    .line 92
    .line 93
    .line 94
    iget-object v6, p2, Lyyds/ᛳᛲᛱᛱ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 95
    .line 96
    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/ActionBarContextView;->ᲀᛲᛳᲀ(Lyyds/ᛲᲁᛲᛸ;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v3}, Lyyds/ᛳᛲᛱᛱ;->ᛲᲈᲁ(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    move-object v5, v4

    .line 104
    :goto_0
    iput-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    invoke-virtual {v6}, Lyyds/ᛴᛴᛵᛸ;->ᛶᛸᲀᲁ()V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_4
    :goto_1
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 113
    .line 114
    if-nez p2, :cond_12

    .line 115
    .line 116
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᛵᛸ:Lyyds/ᛱᛶᛲᛷ;

    .line 117
    .line 118
    if-eqz p2, :cond_5

    .line 119
    .line 120
    invoke-virtual {p2}, Lyyds/ᛱᛶᛲᛷ;->ᛵᛸᛸᛷ()V

    .line 121
    .line 122
    .line 123
    :cond_5
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 124
    .line 125
    if-eqz p2, :cond_6

    .line 126
    .line 127
    invoke-virtual {p2}, Lyyds/ᛲᲁᛲᛸ;->ᛲᲈᲁ()V

    .line 128
    .line 129
    .line 130
    :cond_6
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 131
    .line 132
    if-nez p2, :cond_b

    .line 133
    .line 134
    iget-boolean p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛸᲁᲇ:Z

    .line 135
    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    new-instance p2, Landroid/util/TypedValue;

    .line 139
    .line 140
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const v6, 0x6604000b

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 151
    .line 152
    .line 153
    iget v6, p2, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    if-eqz v6, :cond_7

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 166
    .line 167
    .line 168
    iget v5, p2, Landroid/util/TypedValue;->resourceId:I

    .line 169
    .line 170
    invoke-virtual {v6, v5, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 171
    .line 172
    .line 173
    new-instance v5, Lyyds/ᛳᛵᛳᛳ;

    .line 174
    .line 175
    invoke-direct {v5, v1, v2}, Lyyds/ᛳᛵᛳᛳ;-><init>(Landroid/content/Context;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Lyyds/ᛳᛵᛳᛳ;->getTheme()Landroid/content/res/Resources$Theme;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v1, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 183
    .line 184
    .line 185
    move-object v1, v5

    .line 186
    :cond_7
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    .line 187
    .line 188
    invoke-direct {v5, v1}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    iput-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 192
    .line 193
    new-instance v5, Landroid/widget/PopupWindow;

    .line 194
    .line 195
    const v6, 0x6604001a

    .line 196
    .line 197
    .line 198
    invoke-direct {v5, v1, v4, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 199
    .line 200
    .line 201
    iput-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛶᛱᲈ:Landroid/widget/PopupWindow;

    .line 202
    .line 203
    const/4 v6, 0x2

    .line 204
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 205
    .line 206
    .line 207
    iget-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛶᛱᲈ:Landroid/widget/PopupWindow;

    .line 208
    .line 209
    iget-object v6, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 210
    .line 211
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 212
    .line 213
    .line 214
    iget-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛶᛱᲈ:Landroid/widget/PopupWindow;

    .line 215
    .line 216
    const/4 v6, -0x1

    .line 217
    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    const v6, 0x66040005

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, v6, p2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 228
    .line 229
    .line 230
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 231
    .line 232
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {p2, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    iget-object v1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 245
    .line 246
    invoke-virtual {v1, p2}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 247
    .line 248
    .line 249
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛶᛱᲈ:Landroid/widget/PopupWindow;

    .line 250
    .line 251
    const/4 v1, -0x2

    .line 252
    invoke-virtual {p2, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 253
    .line 254
    .line 255
    new-instance p2, Lyyds/ᛸᛳᲇᛶ;

    .line 256
    .line 257
    invoke-direct {p2, v0, v3}, Lyyds/ᛸᛳᲇᛶ;-><init>(Lyyds/ᲁᛲᲀᛷ;I)V

    .line 258
    .line 259
    .line 260
    iput-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛸᛳᲇᛶ;

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ:Landroid/view/ViewGroup;

    .line 264
    .line 265
    const v5, 0x66090059

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    check-cast p2, Landroidx/appcompat/widget/ViewStubCompat;

    .line 273
    .line 274
    if-eqz p2, :cond_b

    .line 275
    .line 276
    invoke-virtual {v0}, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ()V

    .line 277
    .line 278
    .line 279
    iget-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᲇᛱᛲ:Lyyds/ᛳᛲᛱᛱ;

    .line 280
    .line 281
    if-eqz v5, :cond_9

    .line 282
    .line 283
    invoke-virtual {v5}, Lyyds/ᛳᛲᛱᛱ;->ᛵᛸᛸᛷ()Landroid/content/Context;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    goto :goto_2

    .line 288
    :cond_9
    move-object v5, v4

    .line 289
    :goto_2
    if-nez v5, :cond_a

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_a
    move-object v1, v5

    .line 293
    :goto_3
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {p2, v1}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2}, Landroidx/appcompat/widget/ViewStubCompat;->ᛲᲈᲁ()Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    check-cast p2, Landroidx/appcompat/widget/ActionBarContextView;

    .line 305
    .line 306
    iput-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 307
    .line 308
    :cond_b
    :goto_4
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 309
    .line 310
    if-eqz p2, :cond_11

    .line 311
    .line 312
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᛵᛸ:Lyyds/ᛱᛶᛲᛷ;

    .line 313
    .line 314
    if-eqz p2, :cond_c

    .line 315
    .line 316
    invoke-virtual {p2}, Lyyds/ᛱᛶᛲᛷ;->ᛵᛸᛸᛷ()V

    .line 317
    .line 318
    .line 319
    :cond_c
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 320
    .line 321
    invoke-virtual {p2}, Landroidx/appcompat/widget/ActionBarContextView;->ᛲᛴᛳᛲ()V

    .line 322
    .line 323
    .line 324
    new-instance p2, Lyyds/ᛱᲀᛶᲇ;

    .line 325
    .line 326
    iget-object v1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 327
    .line 328
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iget-object v5, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 333
    .line 334
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 335
    .line 336
    .line 337
    iput-object v1, p2, Lyyds/ᛱᲀᛶᲇ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 338
    .line 339
    iput-object v5, p2, Lyyds/ᛱᲀᛶᲇ;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 340
    .line 341
    iput-object p1, p2, Lyyds/ᛱᲀᛶᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 342
    .line 343
    new-instance v1, Lyyds/ᛴᛴᛵᛸ;

    .line 344
    .line 345
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-direct {v1, v5}, Lyyds/ᛴᛴᛵᛸ;-><init>(Landroid/content/Context;)V

    .line 350
    .line 351
    .line 352
    iput v3, v1, Lyyds/ᛴᛴᛵᛸ;->ᛱᛳᲇ:I

    .line 353
    .line 354
    iput-object v1, p2, Lyyds/ᛱᲀᛶᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛴᛴᛵᛸ;

    .line 355
    .line 356
    iput-object p2, v1, Lyyds/ᛴᛴᛵᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛷᲁᛷᲁ;

    .line 357
    .line 358
    iget-object p1, p1, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast p1, Lyyds/ᛲᛲᲇᲈ;

    .line 361
    .line 362
    invoke-virtual {p1, p2, v1}, Lyyds/ᛲᛲᲇᲈ;->ᛷᲈᲈᲁ(Lyyds/ᛲᲁᛲᛸ;Lyyds/ᛴᛴᛵᛸ;)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_10

    .line 367
    .line 368
    invoke-virtual {p2}, Lyyds/ᛱᲀᛶᲇ;->ᛲᛳᛶᲁ()V

    .line 369
    .line 370
    .line 371
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 372
    .line 373
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionBarContextView;->ᲀᛲᛳᲀ(Lyyds/ᛲᲁᛲᛸ;)V

    .line 374
    .line 375
    .line 376
    iput-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 377
    .line 378
    iget-boolean p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛷᛸᲇᛶ:Z

    .line 379
    .line 380
    if-eqz p1, :cond_d

    .line 381
    .line 382
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ:Landroid/view/ViewGroup;

    .line 383
    .line 384
    if-eqz p1, :cond_d

    .line 385
    .line 386
    sget-object p2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 387
    .line 388
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    if-eqz p1, :cond_d

    .line 393
    .line 394
    move p1, v3

    .line 395
    goto :goto_5

    .line 396
    :cond_d
    move p1, v2

    .line 397
    :goto_5
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 398
    .line 399
    const/high16 v1, 0x3f800000    # 1.0f

    .line 400
    .line 401
    if-eqz p1, :cond_e

    .line 402
    .line 403
    const/4 p1, 0x0

    .line 404
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 405
    .line 406
    .line 407
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 408
    .line 409
    invoke-static {p1}, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᛱᛶᛲᛷ;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p1, v1}, Lyyds/ᛱᛶᛲᛷ;->ᛲᲈᲁ(F)V

    .line 414
    .line 415
    .line 416
    iput-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᛵᛸ:Lyyds/ᛱᛶᛲᛷ;

    .line 417
    .line 418
    new-instance p2, Lyyds/ᛶᲈᲈᛲ;

    .line 419
    .line 420
    invoke-direct {p2, v3, v0}, Lyyds/ᛶᲈᲈᛲ;-><init>(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, p2}, Lyyds/ᛱᛶᛲᛷ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛷᛸᛳ;)V

    .line 424
    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_e
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 428
    .line 429
    .line 430
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 431
    .line 432
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 433
    .line 434
    .line 435
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 436
    .line 437
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    instance-of p1, p1, Landroid/view/View;

    .line 442
    .line 443
    if-eqz p1, :cond_f

    .line 444
    .line 445
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛵᲀᲈᛴ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 446
    .line 447
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    check-cast p1, Landroid/view/View;

    .line 452
    .line 453
    sget-object p2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 454
    .line 455
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 456
    .line 457
    .line 458
    :cond_f
    :goto_6
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛲᛶᛱᲈ:Landroid/widget/PopupWindow;

    .line 459
    .line 460
    if-eqz p1, :cond_11

    .line 461
    .line 462
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᲇ:Landroid/view/Window;

    .line 463
    .line 464
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    iget-object p2, v0, Lyyds/ᲁᛲᲀᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛸᛳᲇᛶ;

    .line 469
    .line 470
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_7

    .line 474
    :cond_10
    iput-object v4, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 475
    .line 476
    :cond_11
    :goto_7
    invoke-virtual {v0}, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ()V

    .line 477
    .line 478
    .line 479
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 480
    .line 481
    iput-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 482
    .line 483
    :cond_12
    invoke-virtual {v0}, Lyyds/ᲁᛲᲀᛷ;->ᛱᛳᛶᛳ()V

    .line 484
    .line 485
    .line 486
    iget-object p1, v0, Lyyds/ᲁᛲᲀᛷ;->ᛶᛸᲀᲁ:Lyyds/ᛲᲁᛲᛸ;

    .line 487
    .line 488
    if-eqz p1, :cond_13

    .line 489
    .line 490
    invoke-virtual {p0, p1}, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ(Lyyds/ᛲᲁᛲᛸ;)Lyyds/ᛷᛷᛴ;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    :cond_13
    return-object v4

    .line 495
    :cond_14
    :goto_8
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 496
    .line 497
    invoke-static {p0, p1, p2}, Lyyds/ᛷᛲᛳᛴ;->ᛵᛸᛸᛷ(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    return-object p0
.end method

.method public final ᛲᲈᲁ(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Lyyds/ᛶᛶᛳᲇ;->ᲇᲈᛵᛷ:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final ᛵᛸᛸᛷ(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲀᛲᛳᲀ(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛶᛳᲇ;->ᲀᛲᛳᲀ:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lyyds/ᛸᛸᛱ;->ᛲᲈᲁ(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
