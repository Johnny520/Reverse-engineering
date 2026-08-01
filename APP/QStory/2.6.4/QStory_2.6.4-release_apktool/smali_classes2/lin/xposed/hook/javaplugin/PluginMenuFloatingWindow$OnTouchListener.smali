.class Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OnTouchListener"
.end annotation


# instance fields
.field x:I

.field y:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    float-to-int v0, v0

    .line 16
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    float-to-int p2, p2

    .line 21
    iget v1, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->x:I

    .line 22
    .line 23
    sub-int v1, v0, v1

    .line 24
    .line 25
    iget v2, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->y:I

    .line 26
    .line 27
    sub-int v2, p2, v2

    .line 28
    .line 29
    iput v0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->x:I

    .line 30
    .line 31
    iput p2, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->y:I

    .line 32
    .line 33
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 42
    .line 43
    add-int/2addr p2, v1

    .line 44
    iput p2, p0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 45
    .line 46
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 55
    .line 56
    add-int/2addr p2, v2

    .line 57
    iput p2, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 58
    .line 59
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏兰世哲()Landroid/view/WindowManager;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-interface {p0, p1, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    float-to-int p1, p1

    .line 76
    iput p1, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->x:I

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    float-to-int p1, p1

    .line 83
    iput p1, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;->y:I

    .line 84
    .line 85
    :goto_0
    const/4 p0, 0x0

    .line 86
    return p0
.end method
