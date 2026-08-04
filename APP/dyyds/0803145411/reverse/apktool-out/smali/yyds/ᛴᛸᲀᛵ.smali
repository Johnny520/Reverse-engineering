.class public final Lyyds/ᛴᛸᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Landroid/os/Handler;


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Lyyds/ᲈᲁᛶᛸ;

.field public ᛵᛸᛸᛷ:Lyyds/ᛵᛳᛲᛱ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛶᛲ;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛶᛲ;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyyds/ᛴᛸᲀᛵ;->ᛱᲈᲁ:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;Lyyds/ᲈᲁᛶᛸ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛳᲀᛶᛲ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lyyds/ᛳᲀᛶᛲ;-><init>(Lyyds/ᛴᛸᲀᛵ;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛶᛲ;

    .line 11
    .line 12
    new-instance v0, Lyyds/ᛳᲀᛶᛲ;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lyyds/ᛳᲀᛶᛲ;-><init>(Lyyds/ᛴᛸᲀᛵ;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛶᛲ;

    .line 19
    .line 20
    iput-object p2, p0, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ:Lyyds/ᲈᲁᛶᛸ;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lyyds/ᛴᛸᲀᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "accessibility"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v2, Landroid/view/accessibility/AccessibilityEvent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/view/accessibility/AccessibilityEvent;-><init>()V

    .line 23
    .line 24
    .line 25
    const/16 v3, 0x40

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 28
    .line 29
    .line 30
    const-class v3, Landroid/widget/Toast;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛶᛲ;

    .line 7
    .line 8
    sget-object v1, Lyyds/ᛴᛸᲀᛵ;->ᛱᲈᲁ:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object p0, p0, Lyyds/ᛴᛸᲀᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛶᛲ;

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᛳᲀᛶᛲ;->run()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {v1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method
