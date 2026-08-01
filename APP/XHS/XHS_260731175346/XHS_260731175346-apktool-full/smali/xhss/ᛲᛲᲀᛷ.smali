.class public final Lxhss/ᛲᛲᲀᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛸᛴᛶᛳ:Landroid/os/Handler;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛳᛲᛳᛵ;

.field public final ᛳᲁᲇᛸ:Ljava/lang/String;

.field public ᛷᛴᛷᛱ:Z

.field public final ᛷᛵᛵᲈ:Lxhss/ᲈᛱᛷᛵ;

.field public final ᲀᲇᛳᲁ:Lxhss/ᛸᛶᲀᲁ;

.field public ᲇᛴᲇᛵ:Z

.field public final ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲀᲁ;


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
    sput-object v0, Lxhss/ᛲᛲᲀᛷ;->ᛸᛴᛶᛳ:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/ContextWrapper;Lxhss/ᲈᛱᛷᛵ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛸᛶᲀᲁ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lxhss/ᛸᛶᲀᲁ;-><init>(Lxhss/ᛲᛲᲀᛷ;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛲᛲᲀᛷ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲀᲁ;

    .line 11
    .line 12
    new-instance v0, Lxhss/ᛸᛶᲀᲁ;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lxhss/ᛸᛶᲀᲁ;-><init>(Lxhss/ᛲᛲᲀᛷ;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lxhss/ᛲᛲᲀᛷ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛶᲀᲁ;

    .line 19
    .line 20
    iput-object p2, p0, Lxhss/ᛲᛲᲀᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛱᛷᛵ;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lxhss/ᛲᛲᲀᛷ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/view/View;)V
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
.method public final ᛷᛵᛵᲈ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lxhss/ᛲᛲᲀᛷ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lxhss/ᛲᛲᲀᛷ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛶᲀᲁ;

    .line 7
    .line 8
    sget-object v1, Lxhss/ᛲᛲᲀᛷ;->ᛸᛴᛶᛳ:Landroid/os/Handler;

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
    iget-object p0, p0, Lxhss/ᛲᛲᲀᛷ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛶᲀᲁ;

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᛸᛶᲀᲁ;->run()V

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
