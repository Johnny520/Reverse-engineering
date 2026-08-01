.class public Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String;

.field private static floatingButton:Landroid/widget/ImageView;

.field private static final isShowing:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static layoutParams:Landroid/view/WindowManager$LayoutParams;

.field private static windowManager:Landroid/view/WindowManager;


# instance fields
.field public onChatShowListener:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x247

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->TAG:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->isShowing:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$1;-><init>(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->onChatShowListener:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    return-void
.end method

.method private createIcon(Landroid/content/Context;)Landroid/widget/ImageView;
    .locals 2

    .line 1
    new-instance p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sput-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 7
    .line 8
    const v0, 0x24080168

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 21
    .line 22
    new-instance v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow$OnTouchListener;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 32
    .line 33
    new-instance v0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世哲苏兰;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 42
    .line 43
    return-object p0
.end method

.method private getWindowManagerParams(Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;
    .locals 2

    .line 1
    new-instance p0, Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 7
    .line 8
    const/16 v0, 0x3e8

    .line 9
    .line 10
    iput v0, p0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    iput v0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput v0, p0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 18
    .line 19
    const/high16 v0, 0x41f00000    # 30.0f

    .line 20
    .line 21
    invoke-static {p1, v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, p0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 26
    .line 27
    sget-object p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 28
    .line 29
    invoke-static {p1, v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 34
    .line 35
    new-instance p0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    const/16 p1, 0x247

    .line 38
    .line 39
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string p1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 47
    .line 48
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0, p1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 68
    .line 69
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0, v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 84
    .line 85
    const/16 v1, 0x32

    .line 86
    .line 87
    if-eqz p1, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move p1, v1

    .line 91
    :goto_0
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 92
    .line 93
    if-eqz p0, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move p0, v1

    .line 97
    :goto_1
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 98
    .line 99
    return-object v0
.end method

.method private hasPluginRunning()Z
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->getAllRunningPluginLoader()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private declared-synchronized hidePluginFloatingWindow()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->isShowing:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :try_start_1
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->windowManager:Landroid/view/WindowManager;

    .line 15
    .line 16
    sget-object v1, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->floatingButton:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    const/16 v1, 0x247

    .line 24
    .line 25
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 33
    .line 34
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 39
    .line 40
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 50
    .line 51
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 56
    .line 57
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    :cond_0
    :goto_0
    monitor-exit p0

    .line 73
    return-void

    .line 74
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    throw v0
.end method

.method private static synthetic lambda$createIcon$0(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/javaplugin/PluginCallback;->onClickFloatingWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->showDialog(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private declared-synchronized showPluginFloatingWindow()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->isShowing:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    .line 16
    :try_start_2
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sput-object v1, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->windowManager:Landroid/view/WindowManager;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->createIcon(Landroid/content/Context;)Landroid/widget/ImageView;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->getWindowManagerParams(Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :catch_0
    :goto_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    throw v0
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->lambda$createIcon$0(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏世兰哲(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->hidePluginFloatingWindow()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏世哲兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->hasPluginRunning()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static bridge synthetic 飘花落叶言子楪苏兰世哲()Landroid/view/WindowManager;
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->windowManager:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic 飘花落叶言子楪苏哲世兰(Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->showPluginFloatingWindow()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪苏哲兰世()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->layoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public isLoadedByDefault()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public loadHook(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Llin/xposed/hook/javaplugin/PluginMenuFloatingWindow;->onChatShowListener:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    invoke-static {p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世哲兰;->addOnChatShowListener(L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
