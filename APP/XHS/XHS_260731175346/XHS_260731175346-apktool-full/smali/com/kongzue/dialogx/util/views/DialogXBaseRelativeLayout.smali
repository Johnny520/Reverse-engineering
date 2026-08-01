.class public Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final synthetic ᛴᲈᛱᛴ:I


# instance fields
.field public ᛱᛱᛲᲇ:Z

.field public ᛳᲁᲇᛸ:Z

.field public ᛳᲈᲈᛲ:Landroid/graphics/Rect;

.field public ᛶᲇᲈᛸ:Z

.field public ᛷᛴᛷᛱ:Z

.field public ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

.field public ᛷᲁᲁ:F

.field public final ᛸᛲᛷᛱ:[I

.field public ᛸᛲᲀᛵ:Lxhss/ᛷᛴᛱᲀ;

.field public ᛸᛴᛶᛳ:Lxhss/ᛱᛱᲇᲁ;

.field public ᛸᛶᛴᲈ:F

.field public ᛸᛶᲈᛶ:F

.field public ᛸᛷᲈᲈ:Z

.field public ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

.field public ᲇᛴᲇᛵ:Z

.field public final ᲇᛶᛴᲀ:Landroid/graphics/Rect;

.field public ᲇᛸᛳᲁ:Lxhss/ᲇᛵᛸᛲ;

.field public ᲈᛳᲀ:Z


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
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ:Z

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛶᛴᲀ:Landroid/graphics/Rect;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛷᲈᲈ:Z

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲇᲈᛸ:Z

    .line 29
    .line 30
    const/4 p1, 0x4

    .line 31
    new-array p1, p1, [I

    .line 32
    .line 33
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᛵᲈ(Landroid/util/AttributeSet;)V

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
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 42
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 43
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ:Z

    .line 44
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛶᛴᲀ:Landroid/graphics/Rect;

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛷᲈᲈ:Z

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 47
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲇᲈᛸ:Z

    const/4 p1, 0x4

    .line 48
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 49
    invoke-virtual {p0, p2}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᛵᲈ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private setBackPressedDispatcher(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance p1, Lxhss/ᲈᛱᛱᲀ;

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛲᛶᲀᛲ;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, v1, p0}, Lxhss/ᛲᛶᲀᛲ;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-direct {p1, p0, v0}, Lxhss/ᲈᛱᛱᲀ;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lxhss/ᲀᲈᲇᛱ;->ᛸᛴᛶᛳ:Lxhss/ᲀᲈᲇᛱ;

    .line 16
    .line 17
    new-instance v1, Lxhss/ᲀᛲᲇᛲ;

    .line 18
    .line 19
    invoke-direct {v1, p1, v0, p0}, Lxhss/ᲀᛲᲇᛲ;-><init>(Ljava/lang/Object;Lxhss/ᲁᛳᲀᛴ;I)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lxhss/ᲀᛲᛲᲇ;

    .line 23
    .line 24
    const/4 p1, 0x6

    .line 25
    invoke-direct {p0, p1}, Lxhss/ᲀᛲᛲᲇ;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Lxhss/ᛶᲇᲇᛲ;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v1, v0, p0}, Lxhss/ᛶᲇᲇᛲ;-><init>(Lxhss/ᲁᛷᛴᲇ;ZLxhss/ᛷᛴᛲᛲ;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Lxhss/ᲀᲀᛳᛱ;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lxhss/ᲀᲀᛳᛱ;-><init>(Lxhss/ᛶᲇᲇᛲ;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lxhss/ᲀᲀᛳᛱ;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/4 v0, 0x0

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lxhss/ᲀᲀᛳᛱ;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    check-cast v0, Lxhss/ᛲᛸᛱᛸ;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛸᛳᲁ:Lxhss/ᲇᛵᛸᛲ;

    .line 55
    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    iget-object p0, p0, Lxhss/ᲇᛵᛸᛲ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lxhss/ᛷᛶᲈᲀ;

    .line 75
    .line 76
    invoke-interface {p1}, Lxhss/ᛷᛶᲈᲀ;->cancel()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_2
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
    .locals 6

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
    if-eqz v0, :cond_b

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
    if-ne v0, v1, :cond_b

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
    if-ne v0, v2, :cond_b

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ:Z

    .line 25
    .line 26
    if-eqz v0, :cond_b

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v3, v0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 48
    .line 49
    const/16 v3, 0x8

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Lxhss/ᛵᛸᛱ;->ᛸᛴᛶᛳ(I)Lxhss/ᲀᲈᲈᛸ;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v0, v3}, Lxhss/ᛵᛸᛱ;->ᛳᲈᲈᛲ(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget v0, v4, Lxhss/ᲀᲈᲈᛸ;->ᲇᛴᲇᛵ:I

    .line 62
    .line 63
    if-lez v0, :cond_0

    .line 64
    .line 65
    move v0, v1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v0, v2

    .line 68
    :goto_0
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_9

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 80
    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_9

    .line 88
    .line 89
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    if-ne v0, p0, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_4
    if-nez v0, :cond_5

    .line 108
    .line 109
    move-object v3, p0

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object v3, v0

    .line 112
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "input_method"

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Landroid/view/inputmethod/InputMethodManager;

    .line 123
    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/4 v5, 0x2

    .line 131
    invoke-virtual {v4, v3, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 132
    .line 133
    .line 134
    :cond_6
    if-eqz v0, :cond_7

    .line 135
    .line 136
    if-eq v0, p0, :cond_7

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 139
    .line 140
    .line 141
    :cond_7
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 146
    .line 147
    .line 148
    :cond_8
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ:Z

    .line 149
    .line 150
    move v2, v1

    .line 151
    :cond_9
    if-eqz v2, :cond_a

    .line 152
    .line 153
    return v1

    .line 154
    :cond_a
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛴᛶᛳ:Lxhss/ᛱᛱᲇᲁ;

    .line 159
    .line 160
    if-eqz v2, :cond_b

    .line 161
    .line 162
    if-eqz v0, :cond_b

    .line 163
    .line 164
    invoke-interface {v2}, Lxhss/ᛱᛱᲇᲁ;->ᲇᛴᲇᛵ()V

    .line 165
    .line 166
    .line 167
    return v1

    .line 168
    :cond_b
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    return p0
.end method

.method public getFitSystemBarUtils()Lxhss/ᛷᛴᛱᲀ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᲀᛵ:Lxhss/ᛷᛴᛱᲀ;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOnSafeInsetsChangeListener()Lxhss/ᲀᲈᲀᲀ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

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
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 12
    .line 13
    return-object p0
.end method

.method public getRootPaddingBottom()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

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
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

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
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

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
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

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
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

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
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

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
    .locals 5

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
    if-nez v1, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget v2, v1, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ:I

    .line 37
    .line 38
    sget-object v3, Lxhss/ᛱᛷᛸᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

    .line 39
    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    iget-object v2, v1, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Lxhss/ᲀᲀ;

    .line 46
    .line 47
    iget-object v4, v2, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 48
    .line 49
    iput-boolean v0, v4, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v2, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v2, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 61
    .line 62
    new-instance v3, Lxhss/ᛴᲈᲀᲇ;

    .line 63
    .line 64
    const/4 v4, 0x7

    .line 65
    invoke-direct {v3, v4, v1}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_0
    iget-object v1, v1, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lxhss/ᲁᛳᛵᛷ;

    .line 75
    .line 76
    iget-object v2, v1, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 77
    .line 78
    iput-boolean v0, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛲᛴᲇᛲ()V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lxhss/ᲁᛲᛸᛴ;

    .line 87
    .line 88
    invoke-direct {v3}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lxhss/ᲁᛲᛸᛴ;->ᛳᲁᲇᛸ()V

    .line 92
    .line 93
    .line 94
    iget-object v3, v2, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 95
    .line 96
    iget-object v4, v2, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 97
    .line 98
    if-nez v4, :cond_1

    .line 99
    .line 100
    new-instance v4, Lxhss/ᛶᲈᛴᛲ;

    .line 101
    .line 102
    invoke-direct {v4, v0, v1}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iput-object v4, v2, Lxhss/ᛱᛴᛳᛴ;->ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 106
    .line 107
    :cond_1
    invoke-virtual {v4, v3}, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_1
    iget-object v1, v1, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Lxhss/ᛲᛵᛶᲁ;

    .line 119
    .line 120
    iget-object v1, v1, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 121
    .line 122
    iput-boolean v0, v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 123
    .line 124
    invoke-virtual {v1, v3}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 125
    .line 126
    .line 127
    new-instance v2, Lxhss/ᲁᛲᛸᛴ;

    .line 128
    .line 129
    invoke-direct {v2}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lxhss/ᲁᛲᛸᛴ;->ᛳᲁᲇᛸ()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛲᛸᲇ()V

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 147
    .line 148
    and-int/lit8 v1, v1, 0x30

    .line 149
    .line 150
    const/16 v2, 0x10

    .line 151
    .line 152
    if-ne v1, v2, :cond_3

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    const/4 v0, 0x0

    .line 156
    :goto_1
    iput-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲇᲈᛸ:Z

    .line 157
    .line 158
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 159
    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 163
    .line 164
    .line 165
    :cond_4
    :goto_2
    return-void

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᲇᲈᛸ:Z

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    sget p1, Lxhss/ᲇᛸᲀᛸ;->ᛸᛴᛶᛳ:I

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛸᛵᲀ()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲀᲇᛳᲁ:Lxhss/ᲀᲈᛵᛸ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v3, v0, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ:I

    .line 8
    .line 9
    sget-object v4, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lxhss/ᲀᲀ;

    .line 17
    .line 18
    iget-object v0, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 19
    .line 20
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛴᲀᛸᛵ()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_0
    iget-object v0, v0, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lxhss/ᲁᛳᛵᛷ;

    .line 27
    .line 28
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 29
    .line 30
    iput-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 31
    .line 32
    new-instance v3, Lxhss/ᲁᛲᛸᛴ;

    .line 33
    .line 34
    invoke-direct {v3}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lxhss/ᲁᛲᛸᛴ;->ᛱᛱᛲᲇ()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v4}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_1
    iget-object v0, v0, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lxhss/ᛲᛵᛶᲁ;

    .line 49
    .line 50
    iget-object v3, v0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 51
    .line 52
    iput-boolean v1, v3, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 53
    .line 54
    new-instance v5, Lxhss/ᲁᛲᛸᛴ;

    .line 55
    .line 56
    invoke-direct {v5}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Lxhss/ᲁᛲᛸᛴ;->ᛱᛱᛲᲇ()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 63
    .line 64
    .line 65
    iput-object v2, v3, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 66
    .line 67
    iput-object v2, v0, Lxhss/ᛲᛵᛶᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛶᲀᛲ;

    .line 68
    .line 69
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 70
    .line 71
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᲀᛵ:Lxhss/ᛷᛴᛱᲀ;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    iget-object v4, v0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 82
    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v4, v0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iput-object v2, v0, Lxhss/ᛷᛴᛱᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᲀᲈᛳ;

    .line 95
    .line 96
    iput-object v2, v0, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 97
    .line 98
    iput-object v2, v0, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 99
    .line 100
    iput-object v2, v0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 101
    .line 102
    :cond_2
    invoke-direct {p0, v1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackPressedDispatcher(Z)V

    .line 103
    .line 104
    .line 105
    iput-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᲀᛵ:Lxhss/ᛷᛴᛱᲀ;

    .line 106
    .line 107
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲈᛳᲀ:Z

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/high16 v1, 0x40a00000    # 5.0f

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(F)I

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
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲁᲁ:F

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
    iget v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛶᲈᛶ:F

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
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲈᛳᲀ:Z

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᲁᲁ:F

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛶᲈᛶ:F

    .line 85
    .line 86
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eq v0, p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛶᛴᲈ:F

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

.method public final ᛱᛱᛲᲇ()Z
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
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛶᛴᲀ:Landroid/graphics/Rect;

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

.method public final ᛳᲁᲇᛸ(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛶᛴᲈ:F

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

.method public final ᛷᛴᛷᛱ(IIII)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Lxhss/ᛵᲇᲀᛳ;

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
    const v0, 0x64080045

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lxhss/ᛵᲇᲀᛳ;

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
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

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

.method public final ᛷᛵᛵᲈ(Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setForceDarkAllowed(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛷᲈᲈ:Z

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lxhss/ᲈᛵᛳ;->ᛷᛵᛵᲈ:[I

    .line 17
    .line 18
    invoke-virtual {v2, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛱᛱᛲᲇ:Z

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iput-boolean v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᲇᛴᲇᛵ:Z

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 42
    .line 43
    .line 44
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛷᲈᲈ:Z

    .line 45
    .line 46
    :cond_0
    iget-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ:Z

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲁᲇᛸ(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget p1, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

    .line 71
    .line 72
    if-eq p1, v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

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
    new-instance p1, Lxhss/ᲇᛵᛲᲁ;

    .line 87
    .line 88
    const/4 v2, 0x5

    .line 89
    invoke-direct {p1, v2, p0}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v2, Lxhss/ᛷᛴᛱᲀ;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-boolean v0, v2, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ:Z

    .line 98
    .line 99
    iput-object p0, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 100
    .line 101
    iput-object p1, v2, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᲇᛵᛲᲁ;

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v2, Lxhss/ᛷᛴᛱᲀ;->ᲇᛴᲇᛵ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 108
    .line 109
    new-instance p1, Lxhss/ᲇᲇᛱ;

    .line 110
    .line 111
    iget-object v3, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 112
    .line 113
    sget v4, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 114
    .line 115
    invoke-virtual {v3}, Landroid/view/View;->getPaddingStart()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    iget-object v4, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 120
    .line 121
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    iget-object v5, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 126
    .line 127
    invoke-virtual {v5}, Landroid/view/View;->getPaddingEnd()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    iget-object v6, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 132
    .line 133
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    iput v3, p1, Lxhss/ᲇᲇᛱ;->ᛷᛵᛵᲈ:I

    .line 141
    .line 142
    iput v4, p1, Lxhss/ᲇᲇᛱ;->ᛱᛱᛲᲇ:I

    .line 143
    .line 144
    iput v5, p1, Lxhss/ᲇᲇᛱ;->ᛳᲁᲇᛸ:I

    .line 145
    .line 146
    iput v6, p1, Lxhss/ᲇᲇᛱ;->ᲇᛴᲇᛵ:I

    .line 147
    .line 148
    iget-object v3, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 149
    .line 150
    new-instance v4, Lxhss/ᛳᛲᲈᛵ;

    .line 151
    .line 152
    invoke-direct {v4, v2, p1}, Lxhss/ᛳᛲᲈᛵ;-><init>(Lxhss/ᛷᛴᛱᲀ;Lxhss/ᲇᲇᛱ;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v3, v4}, Lxhss/ᛵᛳᲇᛷ;->ᛷᛵᛵᲈ(Landroid/view/View;Lxhss/ᛸᛱᛷᛴ;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 159
    .line 160
    new-instance v4, Lxhss/ᛳᛱᛲᲀ;

    .line 161
    .line 162
    const/16 v5, 0x9

    .line 163
    .line 164
    invoke-direct {v4, v2, p1, v5, v0}, Lxhss/ᛳᛱᛲᲀ;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Lxhss/ᛴᛶᲈᛲ;

    .line 168
    .line 169
    invoke-direct {v0, v4}, Lxhss/ᛴᛶᲈᛲ;-><init>(Lxhss/ᛳᛱᛲᲀ;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v0}, Landroid/view/View;->setWindowInsetsAnimationCallback(Landroid/view/WindowInsetsAnimation$Callback;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    iget-object v3, v2, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 182
    .line 183
    if-eqz v0, :cond_3

    .line 184
    .line 185
    invoke-virtual {v3}, Landroid/view/View;->requestApplyInsets()V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_3
    new-instance v0, Lxhss/ᲇᛵᛴᛲ;

    .line 190
    .line 191
    invoke-direct {v0, v1, v2, p1}, Lxhss/ᲇᛵᛴᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 195
    .line 196
    .line 197
    :goto_0
    iput-object v2, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᲀᛵ:Lxhss/ᛷᛴᛱᲀ;

    .line 198
    .line 199
    :cond_4
    return-void
.end method

.method public final ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget p1, p1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛶᲇᲈᛸ:I

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
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getParentDialog()Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛳᲈᲈᛲ:Landroid/graphics/Rect;

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
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛷᛴᛷᛱ(IIII)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
