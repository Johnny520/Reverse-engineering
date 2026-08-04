.class public final Lyyds/ᛳᛳᛷᲈ;
.super Landroid/widget/EditText;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᲀᛳᛶ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛵᲀᛴ;

.field public ᛶᛷᛲᲁ:Lyyds/ᛴᛶ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lyyds/ᲈᲇᛸᛶ;->ᛲᲈᲁ(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x6604011b

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1, p0}, Lyyds/ᲁᛶᛲᲁ;->ᛲᲈᲁ(Landroid/content/Context;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Lyyds/ᛵᲇᛸᲇ;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lyyds/ᛵᲇᛸᲇ;-><init>(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0}, Lyyds/ᛵᲇᛸᲇ;->ᛷᛲᲈᛱ(Landroid/util/AttributeSet;I)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lyyds/ᛷᛲᛶᲁ;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lyyds/ᛷᛲᛶᲁ;-><init>(Landroid/widget/TextView;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 33
    .line 34
    invoke-virtual {p1, p2, v0}, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ(Landroid/util/AttributeSet;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lyyds/ᛵᲀᛴ;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lyyds/ᛳᛳᛷᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲀᛴ;

    .line 46
    .line 47
    new-instance p1, Lyyds/ᲀᲈᛶᲈ;

    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-direct {p1, p0, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(Landroid/widget/EditText;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 54
    .line 55
    invoke-virtual {p1, p2, v0}, Lyyds/ᲀᲈᛶᲈ;->ᛶᲈᛴᲈ(Landroid/util/AttributeSet;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    instance-of v0, p2, Landroid/text/method/NumberKeyListener;

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {p1, p2}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛳᲇ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, p2, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v2}, Landroid/view/View;->setLongClickable(Z)V

    .line 102
    .line 103
    .line 104
    :cond_1
    :goto_0
    return-void
.end method

.method private getSuperCaller()Lyyds/ᛴᛶ;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛳᛷᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛴᛶ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛴᛶ;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lyyds/ᛴᛶ;-><init>(Lyyds/ᛳᛳᛷᲈ;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛳᛳᛷᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛴᛶ;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛱᲈᲁ()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᛳᛶᲁ()Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ()Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getText()Landroid/text/Editable;
    .locals 0

    .line 6
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᛳᛷᲈ;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛳᛳᛷᲈ;->getSuperCaller()Lyyds/ᛴᛶ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lyyds/ᛴᛶ;->ᛲᲈᲁ:Lyyds/ᛳᛳᛷᲈ;

    .line 6
    .line 7
    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛷᛲᲈᛱ(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v2, 0x1e

    .line 18
    .line 19
    if-gt v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, Lyyds/ᛷᲁᛵᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛳᛷᲈ;)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v1, p1, Landroid/view/inputmethod/EditorInfo;->contentMimeTypes:[Ljava/lang/String;

    .line 28
    .line 29
    new-instance v1, Lyyds/ᛸᲈᛳᛱ;

    .line 30
    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-direct {v1, v2, p0}, Lyyds/ᛸᲈᛳᛱ;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lyyds/ᛶᛲᛴᛸ;

    .line 36
    .line 37
    invoke-direct {v2, v0, v1}, Lyyds/ᛶᛲᛴᛸ;-><init>(Landroid/view/inputmethod/InputConnection;Lyyds/ᛸᲈᛳᛱ;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v2

    .line 41
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛵᲀᲈᛴ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Lyyds/ᲇᲈᛱᛷ;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final onDragEvent(Landroid/view/DragEvent;)Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ge v0, v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛷᲁᛵᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛳᛷᲈ;)[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    instance-of v1, v0, Landroid/app/Activity;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    check-cast v0, Landroid/app/Activity;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_1
    if-nez v0, :cond_3

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "Can\'t handle drop: no activity: view="

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ReceiveContent"

    .line 62
    .line 63
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v2, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v4, 0x3

    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    invoke-static {p1, p0, v0}, Lyyds/ᛵᛴᛲᛷ;->ᛲᲈᲁ(Landroid/view/DragEvent;Landroid/widget/TextView;Landroid/app/Activity;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :cond_5
    :goto_2
    if-eqz v3, :cond_6

    .line 86
    .line 87
    return v2

    .line 88
    :cond_6
    invoke-super {p0, p1}, Landroid/view/View;->onDragEvent(Landroid/view/DragEvent;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0
.end method

.method public final onTextContextMenuItem(I)Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-static {p0}, Lyyds/ᛷᲁᛵᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛳᛷᲈ;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    const v2, 0x1020022

    .line 14
    .line 15
    .line 16
    if-eq p1, v2, :cond_0

    .line 17
    .line 18
    const v3, 0x1020031

    .line 19
    .line 20
    .line 21
    if-eq p1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "clipboard"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/content/ClipboardManager;

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_0
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/content/ClipData;->getItemCount()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-lez v5, :cond_4

    .line 52
    .line 53
    if-lt v0, v1, :cond_2

    .line 54
    .line 55
    new-instance v0, Lyyds/ᛱᛱᛴ;

    .line 56
    .line 57
    invoke-direct {v0, v3, v4}, Lyyds/ᛱᛱᛴ;-><init>(Landroid/content/ClipData;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance v0, Lyyds/ᲈᛶᛸᲇ;

    .line 62
    .line 63
    invoke-direct {v0}, Lyyds/ᲈᛶᛸᲇ;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v3, v0, Lyyds/ᲈᛶᛸᲇ;->ᲇᲈᛵᛷ:Landroid/content/ClipData;

    .line 67
    .line 68
    iput v4, v0, Lyyds/ᲈᛶᛸᲇ;->ᛲᛴᛳᛲ:I

    .line 69
    .line 70
    :goto_1
    if-ne p1, v2, :cond_3

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move p1, v4

    .line 75
    :goto_2
    invoke-interface {v0, p1}, Lyyds/ᛲᛶᛶᛶ;->ᲀᛲᛲᲇ(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lyyds/ᛲᛶᛶᛶ;->build()Lyyds/ᛵᛸᛸᛴ;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p0, p1}, Lyyds/ᛷᲁᛵᲇ;->ᲀᛲᛳᲀ(Landroid/view/View;Lyyds/ᛵᛸᛸᛴ;)Lyyds/ᛵᛸᛸᛴ;

    .line 83
    .line 84
    .line 85
    :cond_4
    return v4

    .line 86
    :cond_5
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᛲᲈᲈ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛱᛳᲇ(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛷᲇᛲᛱ(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛶᲈ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᲀᲈᛶᲈ;->ᛱᛳᲇ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛳᛸᛴᛶ(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛶᲈᛴᲈ(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛶᲁ;->ᛲᛳᛶᲁ(Landroid/graphics/PorterDuff$Mode;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛳᛳᛷᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛳᛳᛷᲈ;->getSuperCaller()Lyyds/ᛴᛶ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lyyds/ᛴᛶ;->ᛲᲈᲁ:Lyyds/ᛳᛳᛷᲈ;

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛵᛸᛸᛴ;)Lyyds/ᛵᛸᛸᛴ;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛳᛳᛷᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲀᛴ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lyyds/ᛵᲀᛴ;->ᛲᲈᲁ(Landroid/view/View;Lyyds/ᛵᛸᛸᛴ;)Lyyds/ᛵᛸᛸᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
