.class public final Lb9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb9;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lb9;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lb9;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lb9;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lgj;

    .line 10
    .line 11
    iget-object v0, p1, Lgj;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 12
    .line 13
    iget-object v1, p1, Lgj;->u:La0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v1, Loa0;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-static {p1}, Laa0;->b(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, Lgj;->u:La0;

    .line 28
    .line 29
    invoke-static {v0, p1}, Lz;->a(Landroid/view/accessibility/AccessibilityManager;La0;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    :pswitch_1
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lb9;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb9;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx40;

    .line 9
    .line 10
    iget-object v1, v0, Lx40;->o:Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lx40;->o:Landroid/view/ViewTreeObserver;

    .line 25
    .line 26
    :cond_0
    iget-object v1, v0, Lx40;->o:Landroid/view/ViewTreeObserver;

    .line 27
    .line 28
    iget-object v0, v0, Lx40;->i:Lk4;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lb9;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lgj;

    .line 40
    .line 41
    iget-object v0, p1, Lgj;->u:La0;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object p1, p1, Lgj;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-static {p1, v0}, Lz;->b(Landroid/view/accessibility/AccessibilityManager;La0;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_1
    iget-object v0, p0, Lb9;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Le9;

    .line 56
    .line 57
    iget-object v1, v0, Le9;->x:Landroid/view/ViewTreeObserver;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, v0, Le9;->x:Landroid/view/ViewTreeObserver;

    .line 72
    .line 73
    :cond_3
    iget-object v1, v0, Le9;->x:Landroid/view/ViewTreeObserver;

    .line 74
    .line 75
    iget-object v0, v0, Le9;->i:Lk4;

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
