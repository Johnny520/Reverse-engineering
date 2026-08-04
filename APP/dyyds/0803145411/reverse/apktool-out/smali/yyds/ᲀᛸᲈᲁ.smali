.class public Lyyds/ᲀᛸᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Landroid/view/View$AccessibilityDelegate;


# instance fields
.field public final ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛸᲀᛷᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lyyds/ᲀᛸᲈᲁ;->ᲀᛲᛳᲀ:Landroid/view/View$AccessibilityDelegate;

    invoke-direct {p0, v0}, Lyyds/ᲀᛸᲈᲁ;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View$AccessibilityDelegate;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 5
    .line 6
    new-instance p1, Lyyds/ᛸᲀᛷᛲ;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lyyds/ᛸᲀᛷᛲ;-><init>(Lyyds/ᲀᛸᲈᲁ;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᲀᛸᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛸᲀᛷᛲ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public ᛱᲈᲁ(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ᛲᛳᛶᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ᛲᛴᛳᛲ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ᛲᲈᲁ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᛵᛸᛸᛷ(Landroid/view/View;)Lyyds/ᛱᛱᛴ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lyyds/ᛱᛱᛴ;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p1, v0, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public ᛶᛷᛲᲁ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4

    .line 1
    const v0, 0x66090468

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v2, v3, :cond_2

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lyyds/ᛵᛲᛶᲁ;

    .line 27
    .line 28
    iget-object v3, v3, Lyyds/ᛵᛲᛶᲁ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ne v3, p2, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_6

    .line 49
    .line 50
    const v0, 0x66090026

    .line 51
    .line 52
    .line 53
    if-ne p2, v0, :cond_6

    .line 54
    .line 55
    if-eqz p3, :cond_6

    .line 56
    .line 57
    const-string p0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    .line 58
    .line 59
    const/4 p2, -0x1

    .line 60
    invoke-virtual {p3, p0, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const p2, 0x66090469

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Landroid/util/SparseArray;

    .line 72
    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    invoke-virtual {p2, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Landroid/text/style/ClickableSpan;

    .line 88
    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->createAccessibilityNodeInfo()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    instance-of p3, p2, Landroid/text/Spanned;

    .line 100
    .line 101
    if-eqz p3, :cond_3

    .line 102
    .line 103
    move-object p3, p2

    .line 104
    check-cast p3, Landroid/text/Spanned;

    .line 105
    .line 106
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    const-class v0, Landroid/text/style/ClickableSpan;

    .line 111
    .line 112
    invoke-interface {p3, v1, p2, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, [Landroid/text/style/ClickableSpan;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const/4 p2, 0x0

    .line 120
    :goto_2
    move p3, v1

    .line 121
    :goto_3
    if-eqz p2, :cond_5

    .line 122
    .line 123
    array-length v0, p2

    .line 124
    if-ge p3, v0, :cond_5

    .line 125
    .line 126
    aget-object v0, p2, p3

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    const/4 p0, 0x1

    .line 138
    return p0

    .line 139
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    return v1

    .line 143
    :cond_6
    return p0
.end method

.method public ᲀᛲᛳᲀ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ᲇᲇᲇᛱ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᛱᛵᲈᛸ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛸᲈᲁ;->ᛲᲈᲁ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object p2, p2, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
