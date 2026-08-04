.class public Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛶᛸᲀᲁ:I


# instance fields
.field public ᛱᛳᲇ:F

.field public final ᛱᲈᲁ:Landroid/graphics/Rect;

.field public ᛲᛲᲈᲈ:Z

.field public ᛲᛳᛶᲁ:Lyyds/ᛳᛵᲀ;

.field public ᛲᛴᛳᛲ:Z

.field public ᛳᛸᛴᛶ:F

.field public ᛳᲁᲁᲇ:F

.field public ᛵᛶᛲᲀ:Landroid/graphics/Rect;

.field public ᛶᛳᛶᛵ:Ljava/lang/ref/WeakReference;

.field public ᛶᛷᛲᲁ:Z

.field public final ᛶᲈᛴᲈ:[I

.field public ᛷᛲᲈᛱ:Lyyds/ᲁᛲᛱᛳ;

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:Lyyds/ᲈᛲᛵ;

.field public ᲀᛲᛲᲇ:Z

.field public ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public ᲇᛱᛲ:Lyyds/ᲈᲀᲀᛶ;

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲇᲇᛱ:Z

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᲈᲁ:Landroid/graphics/Rect;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᲇᲀ:Z

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛲᲇ:Z

    .line 29
    .line 30
    const/4 p1, 0x4

    .line 31
    new-array p1, p1, [I

    .line 32
    .line 33
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛸᛸᛷ(Landroid/util/AttributeSet;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ:Z

    .line 42
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 43
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲇᲇᛱ:Z

    .line 44
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᲈᲁ:Landroid/graphics/Rect;

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᲇᲀ:Z

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 47
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛲᲇ:Z

    const/4 p1, 0x4

    .line 48
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 49
    invoke-virtual {p0, p2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛸᛸᛷ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private setBackPressedDispatcher(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget-object p1, Lyyds/ᛷᛴᛶᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛴᛶᲇ;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lyyds/ᛷᛴᛳᛶ;->ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛵᲈᛴᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lyyds/ᛷᛴᛶᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᛶᲇ;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lyyds/ᛷᛴᛳᛶ;->ᲈᲀᛲᲀ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lyyds/ᛷᛴᛳᛶ;->ᛶᲈᛴᲈ(Lyyds/ᛲᲈᲁᛱ;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lyyds/ᲈᛵᲇᛴ;

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-interface {p1}, Lyyds/ᲈᛵᲇᛴ;->ᛲᲈᲁ()Landroidx/activity/ᛲᲈᲁ;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lyyds/ᲈᲀᲀᛶ;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1}, Lyyds/ᲈᲀᲀᛶ;-><init>(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;Lyyds/ᲈᛵᲇᛴ;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛱᛲ:Lyyds/ᲈᲀᲀᛶ;

    .line 34
    .line 35
    invoke-virtual {v0, p1, v1}, Landroidx/activity/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᲈᛵᲇᛴ;Lyyds/ᲈᲀᲀᛶ;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛱᛲ:Lyyds/ᲈᲀᲀᛶ;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lyyds/ᛷᛴᛶᲀ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lyyds/ᛱᛴᛷ;

    .line 60
    .line 61
    invoke-interface {p1}, Lyyds/ᛱᛴᛷ;->cancel()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final callOnClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/view/View;->callOnClick()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x4

    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲇᲇᛱ:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᲈᲁ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲈᲈᲁ:Lyyds/ᲈᛲᛵ;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v2}, Lyyds/ᲈᛲᛵ;->ᛱᛳᲇ()V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public getFitSystemBarUtils()Lyyds/ᲁᛲᛱᛳ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛲᲈᛱ:Lyyds/ᲁᛲᛱᛳ;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOnSafeInsetsChangeListener()Lyyds/ᛳᲀᲁᲈ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

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
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 12
    .line 13
    return-object p0
.end method

.method public getRootPaddingBottom()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingLeft()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingRight()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getRootPaddingTop()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲈᛴᲈ:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget p0, p0, v0

    .line 5
    .line 6
    return p0
.end method

.method public getSafeHeight()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 11
    .line 12
    sub-int/2addr v0, p0

    .line 13
    int-to-float p0, v0

    .line 14
    return p0
.end method

.method public getUnsafePlace()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUseAreaHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getRootPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public getUseAreaWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getRootPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackPressedDispatcher(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛳᛶᲁ:Lyyds/ᛳᛵᲀ;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Lyyds/ᛳᛵᲀ;->ᛶᛷᛲᲁ()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 v1, v1, 0x30

    .line 49
    .line 50
    const/16 v2, 0x10

    .line 51
    .line 52
    if-ne v1, v2, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v0, 0x0

    .line 56
    :goto_0
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛲᲇ:Z

    .line 57
    .line 58
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 5
    .line 6
    and-int/lit8 p1, p1, 0x30

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛲᲇ:Z

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    sget p1, Lyyds/ᛷᲁᲇᲇ;->ᛷᲈᲈᲁ:I

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛴᲁᲈ()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛳᛶᲁ:Lyyds/ᛳᛵᲀ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lyyds/ᛳᛵᲀ;->ᲇᲇᲇᛱ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛲᲈᛱ:Lyyds/ᲁᛲᛱᛳ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᲁᛲᛱᛳ;->ᲀᛲᛳᲀ()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲈᛱᲇ;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲈᛱᲇ;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object v1, v0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲈᛱᲇ;

    .line 33
    .line 34
    iput-object v1, v0, Lyyds/ᲁᛲᛱᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛴ;

    .line 35
    .line 36
    iput-object v1, v0, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 37
    .line 38
    iput-object v1, v0, Lyyds/ᲁᛲᛱᛳ;->ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 39
    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackPressedDispatcher(Z)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛲᲈᛱ:Lyyds/ᲁᛲᛱᛳ;

    .line 45
    .line 46
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛲᲈᲈ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/high16 v1, 0x40a00000    # 5.0f

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-float v0, v0

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛳᲇ:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    cmpg-float v1, v1, v0

    .line 50
    .line 51
    if-gtz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲁᲇ:F

    .line 58
    .line 59
    sub-float/2addr v1, v2

    .line 60
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    cmpg-float v0, v1, v0

    .line 65
    .line 66
    if-gtz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->callOnClick()Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛲᲈᲈ:Z

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛳᲇ:F

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲁᲇ:F

    .line 85
    .line 86
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "input_method"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const/4 v2, 0x2

    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 107
    .line 108
    .line 109
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0
.end method

.method public final performClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 8
    .line 9
    .line 10
    :cond_0
    const/16 v0, 0x82

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛳᛶᛵ:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛳᛶᛵ:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eq v0, p0, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛳᛶᛵ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    if-eq v0, p0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᛸᛴᛶ:F

    .line 2
    .line 3
    const/high16 v1, 0x437f0000    # 255.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    float-to-int v0, v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const v0, 0x3c23d70a    # 0.01f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget p1, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 36
    .line 37
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲇᲇᛱ(IIII)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final ᛲᲈᲁ()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v3, v0}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 22
    .line 23
    const/16 v3, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lyyds/ᲈᛲᲁᛳ;->ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v0, v3}, Lyyds/ᲈᛲᲁᛳ;->ᲇᛱᛲ(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget v0, v4, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 36
    .line 37
    if-lez v0, :cond_0

    .line 38
    .line 39
    move v0, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v0, v2

    .line 42
    :goto_0
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛷᛲᲁ:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛳᲀ()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛷᛲᲁ:Z

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᛲᛳᲀ()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    return v2

    .line 65
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    if-ne v0, p0, :cond_5

    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :cond_5
    if-nez v0, :cond_6

    .line 84
    .line 85
    move-object v3, p0

    .line 86
    goto :goto_2

    .line 87
    :cond_6
    move-object v3, v0

    .line 88
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-string v5, "input_method"

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Landroid/view/inputmethod/InputMethodManager;

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/4 v5, 0x2

    .line 107
    invoke-virtual {v4, v3, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 108
    .line 109
    .line 110
    :cond_7
    if-eqz v0, :cond_8

    .line 111
    .line 112
    if-eq v0, p0, :cond_8

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 115
    .line 116
    .line 117
    :cond_8
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 118
    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 122
    .line 123
    .line 124
    :cond_9
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛷᛲᲁ:Z

    .line 125
    .line 126
    return v1
.end method

.method public final ᛵᛸᛸᛷ(Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setForceDarkAllowed(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᲇᲀ:Z

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, Lyyds/ᛱᛷᛳᛶ;->ᛲᲈᲁ:[I

    .line 18
    .line 19
    invoke-virtual {v3, p1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 28
    .line 29
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ:Z

    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iput-boolean v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲇᲇᛱ:Z

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 42
    .line 43
    .line 44
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᲇᲀ:Z

    .line 45
    .line 46
    :cond_0
    iget-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget p1, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 71
    .line 72
    if-eq p1, v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->setDefaultFocusHighlightEnabled(Z)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lyyds/ᛱᛱᛴ;

    .line 87
    .line 88
    const/16 v3, 0x10

    .line 89
    .line 90
    invoke-direct {p1, v3, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lyyds/ᲁᛲᛱᛳ;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-boolean v0, v3, Lyyds/ᲁᛲᛱᛳ;->ᛲᲈᲁ:Z

    .line 99
    .line 100
    iput-object p0, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 101
    .line 102
    iput-object p1, v3, Lyyds/ᲁᛲᛱᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛴ;

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, v3, Lyyds/ᲁᛲᛱᛳ;->ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 109
    .line 110
    new-instance p1, Lyyds/ᲇᲁᲈᛳ;

    .line 111
    .line 112
    iget-object v4, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 113
    .line 114
    sget-object v5, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/view/View;->getPaddingStart()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    iget-object v5, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    iget-object v6, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 127
    .line 128
    invoke-virtual {v6}, Landroid/view/View;->getPaddingEnd()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    iget-object v7, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 133
    .line 134
    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    iput v4, p1, Lyyds/ᲇᲁᲈᛳ;->ᛲᲈᲁ:I

    .line 142
    .line 143
    iput v5, p1, Lyyds/ᲇᲁᲈᛳ;->ᛵᛸᛸᛷ:I

    .line 144
    .line 145
    iput v6, p1, Lyyds/ᲇᲁᲈᛳ;->ᲀᛲᛳᲀ:I

    .line 146
    .line 147
    iput v7, p1, Lyyds/ᲇᲁᲈᛳ;->ᲇᲈᛵᛷ:I

    .line 148
    .line 149
    iget-object v4, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 150
    .line 151
    new-instance v5, Lyyds/ᛳᛴᛶᲁ;

    .line 152
    .line 153
    invoke-direct {v5, v3, v1, p1}, Lyyds/ᛳᛴᛶᲁ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4, v5}, Lyyds/ᲈᛷᲇᛲ;->ᛵᛸᛸᛷ(Landroid/view/View;Lyyds/ᲁᛳᲀᲇ;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 160
    .line 161
    new-instance v4, Lyyds/ᲀᲈᛶᲈ;

    .line 162
    .line 163
    const/16 v5, 0x18

    .line 164
    .line 165
    invoke-direct {v4, v5, v3, p1, v0}, Lyyds/ᲀᲈᛶᲈ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lyyds/ᛵᛳᛵᛶ;

    .line 169
    .line 170
    invoke-direct {v0, v4}, Lyyds/ᛵᛳᛵᛶ;-><init>(Lyyds/ᲀᲈᛶᲈ;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v0}, Landroid/view/View;->setWindowInsetsAnimationCallback(Landroid/view/WindowInsetsAnimation$Callback;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget-object v1, v3, Lyyds/ᲁᛲᛱᛳ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 183
    .line 184
    if-eqz v0, :cond_3

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/view/View;->requestApplyInsets()V

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_3
    new-instance v0, Lyyds/ᛴᛱᛱ;

    .line 191
    .line 192
    invoke-direct {v0, v3, v2, p1}, Lyyds/ᛴᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 196
    .line 197
    .line 198
    :goto_0
    iput-object v3, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛲᲈᛱ:Lyyds/ᲁᛲᛱᛳ;

    .line 199
    .line 200
    :cond_4
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᲈᲁ:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sub-int v2, v0, v2

    .line 23
    .line 24
    int-to-float v3, v0

    .line 25
    const v4, 0x3e19999a    # 0.15f

    .line 26
    .line 27
    .line 28
    mul-float/2addr v3, v4

    .line 29
    float-to-int v3, v3

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 39
    .line 40
    const/high16 v4, 0x42a00000    # 80.0f

    .line 41
    .line 42
    mul-float/2addr p0, v4

    .line 43
    float-to-int p0, p0

    .line 44
    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-lez v0, :cond_1

    .line 49
    .line 50
    if-le v2, p0, :cond_1

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_1
    return v1
.end method

.method public final ᲇᲇᲇᛱ(IIII)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Lyyds/ᛴᛱᛱᛸ;

    .line 18
    .line 19
    const-string v1, "DialogXSafetyArea"

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 28
    .line 29
    if-eqz v0, :cond_e

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v1, v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v1, :cond_c

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->getDialogXSafetyMode()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    and-int/lit8 v3, v1, 0x1

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    move v3, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v3, v2

    .line 55
    :goto_0
    and-int/lit8 v5, v1, 0x2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    move v5, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v5, v2

    .line 62
    :goto_1
    and-int/lit8 v6, v1, 0x4

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    move v6, v4

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v6, v2

    .line 69
    :goto_2
    and-int/lit8 v1, v1, 0x8

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v4, v2

    .line 75
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    if-eqz v5, :cond_5

    .line 79
    .line 80
    move v1, p1

    .line 81
    goto :goto_4

    .line 82
    :cond_5
    move v1, v2

    .line 83
    :goto_4
    if-eqz v3, :cond_6

    .line 84
    .line 85
    move v7, p2

    .line 86
    goto :goto_5

    .line 87
    :cond_6
    move v7, v2

    .line 88
    :goto_5
    if-eqz v4, :cond_7

    .line 89
    .line 90
    move v8, p3

    .line 91
    goto :goto_6

    .line 92
    :cond_7
    move v8, v2

    .line 93
    :goto_6
    if-eqz v6, :cond_8

    .line 94
    .line 95
    move v9, p4

    .line 96
    goto :goto_7

    .line 97
    :cond_8
    move v9, v2

    .line 98
    :goto_7
    invoke-virtual {v0, v1, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 99
    .line 100
    .line 101
    if-eqz v3, :cond_9

    .line 102
    .line 103
    move p2, v2

    .line 104
    :cond_9
    if-eqz v5, :cond_a

    .line 105
    .line 106
    move p1, v2

    .line 107
    :cond_a
    if-eqz v4, :cond_b

    .line 108
    .line 109
    move p3, v2

    .line 110
    :cond_b
    if-eqz v6, :cond_e

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_c
    const v0, 0x66090088

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Landroid/view/ViewGroup;

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lyyds/ᛴᛱᛱᛸ;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    if-eqz v0, :cond_d

    .line 132
    .line 133
    invoke-virtual {v0, v2, v2, v2, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 134
    .line 135
    .line 136
    :cond_d
    :goto_8
    move p4, v2

    .line 137
    :cond_e
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᲈᛵᛷ:Z

    .line 138
    .line 139
    if-eqz v0, :cond_f

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 142
    .line 143
    .line 144
    :cond_f
    return-void
.end method

.method public final ᲇᲈᛵᛷ(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᛸᛴᛶ:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/high16 v0, 0x437f0000    # 255.0f

    .line 18
    .line 19
    mul-float/2addr p1, v0

    .line 20
    float-to-int p1, p1

    .line 21
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
