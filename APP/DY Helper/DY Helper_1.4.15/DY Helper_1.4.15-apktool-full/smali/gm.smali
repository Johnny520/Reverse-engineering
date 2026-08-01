.class public abstract Lgm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Map;

.field public static final β:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sput-object v0, Lgm;->α:Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lgm;->β:Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    return-void
.end method

.method public static α(Landroid/view/View;)V
    .locals 13

    .line 1
    sget-object v1, Lgm;->β:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lgm;->α:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    new-instance v4, Lfm;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isFocusableInTouchMode()Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    invoke-direct/range {v4 .. v12}, Lfm;-><init>(IFZZZZZI)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 90
    .line 91
    .line 92
    const/4 v0, 0x4

    .line 93
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 103
    .line 104
    .line 105
    throw p0
.end method
