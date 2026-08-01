.class final Lcom/mr/elaris/InAppSettings;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/elaris/InAppSettings$GuardedScrollView;,
        Lcom/mr/elaris/InAppSettings$HostBackHook;,
        Lcom/mr/elaris/InAppSettings$ToggleView;,
        Lcom/mr/elaris/InAppSettings$BackAwareEditText;
    }
.end annotation


# static fields
.field private static final ACTIVITY_BACK_UNHOOKS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation
.end field

.field static BG:I = 0x0

.field static BLUE:I = 0x0

.field static CARD:I = 0x0

.field static CARD_SOFT:I = 0x0

.field static GREEN:I = 0x0

.field private static LINE:I = 0x0

.field static MENU_GLOW_BOTTOM:I = 0x0

.field static MENU_GLOW_MID:I = 0x0

.field static MENU_GLOW_TOP:I = 0x0

.field static NOTE:I = 0x0

.field private static OFF_BG:I = 0x0

.field static STROKE:I = 0x0

.field static SUB:I = 0x0

.field static final TELEGRAM_URL:Ljava/lang/String; = "https://t.me/Elaris_mod"

.field static TEXT:I = 0x0

.field static final THEME_DARK:Ljava/lang/String; = "dark"

.field static final THEME_LIGHT:Ljava/lang/String; = "light"

.field static final THEME_SYSTEM:Ljava/lang/String; = "system"

.field private static volatile activeInstance:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mr/elaris/InAppSettings;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile sActivityBackHookInstalled:Z


# instance fields
.field private active:Z

.field final activity:Landroid/app/Activity;

.field private final backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

.field private content:Landroid/view/ViewGroup;

.field private darkUi:Z

.field private volatile manualClockInRunning:Z

.field private volatile manualKeepFireRunning:Z

.field private final mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

.field private final originalChildren:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private originalContentBackground:Landroid/graphics/drawable/Drawable;

.field private originalDecorBackground:Landroid/graphics/drawable/Drawable;

.field private originalNavigationBarColor:I

.field private originalStatusBarColor:I

.field private originalSystemUiVisibility:I

.field private originalWindowCaptured:Z

.field private originalWindowFlags:I

.field private pageTransitionGeneration:I

.field repeaterModeSummaryView:Landroid/widget/TextView;

.field private secondaryPageVisible:Z

.field private final sp:Landroid/content/SharedPreferences;

.field private final toastHelper:Lcom/mr/elaris/InAppSettingsToast;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0xfa

    .line 2
    .line 3
    const/16 v1, 0xfb

    .line 4
    .line 5
    const/16 v2, 0xfd

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sput v3, Lcom/mr/elaris/InAppSettings;->BG:I

    .line 12
    .line 13
    const/16 v3, 0xff

    .line 14
    .line 15
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    sput v4, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Lcom/mr/elaris/InAppSettings;->CARD_SOFT:I

    .line 26
    .line 27
    const/16 v0, 0x19

    .line 28
    .line 29
    const/16 v1, 0x1d

    .line 30
    .line 31
    const/16 v4, 0x18

    .line 32
    .line 33
    invoke-static {v4, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput v0, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 38
    .line 39
    const/16 v0, 0x6c

    .line 40
    .line 41
    const/16 v1, 0x74

    .line 42
    .line 43
    const/16 v4, 0x69

    .line 44
    .line 45
    invoke-static {v4, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sput v0, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 50
    .line 51
    const/16 v0, 0xed

    .line 52
    .line 53
    const/16 v1, 0xf1

    .line 54
    .line 55
    const/16 v4, 0xeb

    .line 56
    .line 57
    invoke-static {v4, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    sput v0, Lcom/mr/elaris/InAppSettings;->LINE:I

    .line 62
    .line 63
    const/16 v0, 0x34

    .line 64
    .line 65
    const/16 v1, 0x84

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sput v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 72
    .line 73
    const/16 v0, 0xbe

    .line 74
    .line 75
    const/16 v1, 0x8f

    .line 76
    .line 77
    const/16 v4, 0x22

    .line 78
    .line 79
    invoke-static {v4, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sput v0, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 84
    .line 85
    const/16 v0, 0x7e

    .line 86
    .line 87
    const/16 v1, 0x8c

    .line 88
    .line 89
    const/16 v4, 0x76

    .line 90
    .line 91
    invoke-static {v4, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    sput v0, Lcom/mr/elaris/InAppSettings;->NOTE:I

    .line 96
    .line 97
    const/16 v0, 0xe8

    .line 98
    .line 99
    const/16 v1, 0xea

    .line 100
    .line 101
    const/16 v4, 0xee

    .line 102
    .line 103
    invoke-static {v0, v1, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    sput v1, Lcom/mr/elaris/InAppSettings;->OFF_BG:I

    .line 108
    .line 109
    const/16 v1, 0xe4

    .line 110
    .line 111
    invoke-static {v1, v0, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    sput v0, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 116
    .line 117
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sput v0, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_TOP:I

    .line 122
    .line 123
    const/16 v0, 0xfc

    .line 124
    .line 125
    invoke-static {v0, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    sput v1, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_MID:I

    .line 130
    .line 131
    const/16 v1, 0xf7

    .line 132
    .line 133
    const/16 v2, 0xf9

    .line 134
    .line 135
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    sput v0, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_BOTTOM:I

    .line 140
    .line 141
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/mr/elaris/InAppSettings;->activeInstance:Ljava/lang/ref/WeakReference;

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    sput-boolean v0, Lcom/mr/elaris/InAppSettings;->sActivityBackHookInstalled:Z

    .line 151
    .line 152
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 155
    .line 156
    .line 157
    sput-object v0, Lcom/mr/elaris/InAppSettings;->ACTIVITY_BACK_UNHOOKS:Ljava/util/Set;

    .line 158
    .line 159
    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/mr/elaris/InAppSettings;->originalChildren:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->manualClockInRunning:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->manualKeepFireRunning:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->originalWindowCaptured:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->originalContentBackground:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->originalDecorBackground:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iput v0, p0, Lcom/mr/elaris/InAppSettings;->originalSystemUiVisibility:I

    .line 26
    .line 27
    iput v0, p0, Lcom/mr/elaris/InAppSettings;->originalWindowFlags:I

    .line 28
    .line 29
    iput-object p1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 30
    .line 31
    new-instance v1, Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 37
    .line 38
    new-instance v1, Lcom/mr/elaris/InAppSettingsToast;

    .line 39
    .line 40
    invoke-direct {v1, p1}, Lcom/mr/elaris/InAppSettingsToast;-><init>(Landroid/app/Activity;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->toastHelper:Lcom/mr/elaris/InAppSettingsToast;

    .line 44
    .line 45
    new-instance v1, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 51
    .line 52
    const-string v1, "settings"

    .line 53
    .line 54
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->applyThemePalette()V

    .line 61
    .line 62
    .line 63
    sget p1, Lcom/mr/elaris/InAppSettings;->BG:I

    .line 64
    .line 65
    iput p1, p0, Lcom/mr/elaris/InAppSettings;->originalStatusBarColor:I

    .line 66
    .line 67
    iput p1, p0, Lcom/mr/elaris/InAppSettings;->originalNavigationBarColor:I

    .line 68
    .line 69
    return-void
.end method

.method public static bridge synthetic a(Lcom/mr/elaris/InAppSettings;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 2
    .line 3
    return p0
.end method

.method private static activeInstance()Lcom/mr/elaris/InAppSettings;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/InAppSettings;->activeInstance:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/mr/elaris/InAppSettings;

    .line 12
    .line 13
    return-object v0
.end method

.method private activePageBackground()Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->secondaryPageVisible:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->pageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private activePageColor()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageColor(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private adjustSystemVolume(Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    const-string v0, "audio"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/media/AudioManager;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Landroid/media/AudioManager;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, -0x1

    .line 20
    :goto_0
    const/4 v0, 0x5

    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-virtual {p0, v1, p1, v0}, Landroid/media/AudioManager;->adjustStreamVolume(III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :catchall_0
    :cond_1
    return-void
.end method

.method private attach()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    const v1, 0x1020002

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/mr/elaris/InAppSettings;->findTaggedPage(Landroid/view/View;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Lcom/mr/elaris/InAppSettings;->secondaryPageVisible:Z

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->buildHome()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->originalChildren:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ge v1, v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->originalChildren:Ljava/util/List;

    .line 43
    .line 44
    iget-object v3, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->captureOriginalWindowState()V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 66
    .line 67
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sput-object v1, Lcom/mr/elaris/InAppSettings;->activeInstance:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 75
    .line 76
    invoke-static {v1}, Lcom/mr/elaris/InAppSettings;->ensureActivityBackHook(Landroid/app/Activity;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->pageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->registerBackCallback()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->keepElarisPageFocused()V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/mr/elaris/InAppSettingsBackNavigator;->resetForAttach()V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v2, v0}, Lcom/mr/elaris/InAppSettings;->replacePage(Landroid/view/View;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :catchall_0
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->restoreQQ()V

    .line 104
    .line 105
    .line 106
    const-string v0, "Elaris \u9875\u9762\u6253\u5f00\u5931\u8d25"

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static bridge synthetic b(Lcom/mr/elaris/InAppSettings;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/mr/elaris/InAppSettings;->pageTransitionGeneration:I

    .line 2
    .line 3
    return p0
.end method

.method private buildCategory(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsNavigationPage;->buildCategory(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private buildErrorPage(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsNavigationPage;->buildErrorPage(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/Throwable;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private buildHome()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsNavigationPage;->buildHome(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic c(Lcom/mr/elaris/InAppSettings;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->shouldSuppressLegacyBack()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private captureOriginalWindowState()V
    .locals 2

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->originalWindowCaptured:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/mr/elaris/InAppSettings;->originalContentBackground:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getStatusBarColor()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lcom/mr/elaris/InAppSettings;->originalStatusBarColor:I

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, p0, Lcom/mr/elaris/InAppSettings;->originalNavigationBarColor:I

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :goto_0
    iput v1, p0, Lcom/mr/elaris/InAppSettings;->originalWindowFlags:I

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, p0, Lcom/mr/elaris/InAppSettings;->originalDecorBackground:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/mr/elaris/InAppSettings;->originalSystemUiVisibility:I

    .line 69
    .line 70
    :cond_3
    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->originalWindowCaptured:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    :catchall_0
    :goto_1
    return-void
.end method

.method private consumeFocusedInputBack()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsInputHelpers;->consumeFocusedInputBack(Lcom/mr/elaris/InAppSettings;Landroid/view/ViewGroup;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static bridge synthetic d()Lcom/mr/elaris/InAppSettings;
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->activeInstance()Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static bridge synthetic e(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettings;->handleHostBack(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static ensureActivityBackHook(Landroid/app/Activity;)V
    .locals 5

    .line 1
    const-string v0, "settings back hook failed: "

    .line 2
    .line 3
    const-string v1, "Elaris host back hook installed count="

    .line 4
    .line 5
    sget-boolean v2, Lcom/mr/elaris/InAppSettings;->sActivityBackHookInstalled:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-class v2, Lcom/mr/elaris/InAppSettings;

    .line 11
    .line 12
    monitor-enter v2

    .line 13
    :try_start_0
    sget-boolean v3, Lcom/mr/elaris/InAppSettings;->sActivityBackHookInstalled:Z

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :try_start_1
    new-instance v3, Lcom/mr/elaris/InAppSettings$HostBackHook;

    .line 22
    .line 23
    const/16 v4, 0x2710

    .line 24
    .line 25
    invoke-direct {v3, v4}, Lcom/mr/elaris/InAppSettings$HostBackHook;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const-string v4, "onBackPressed"

    .line 29
    .line 30
    invoke-static {p0, v4, v3}, Lcom/mr/elaris/InAppSettings;->hookMostSpecificActivityMethod(Landroid/app/Activity;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "dispatchKeyEvent"

    .line 34
    .line 35
    invoke-static {p0, v4, v3}, Lcom/mr/elaris/InAppSettings;->hookMostSpecificActivityMethod(Landroid/app/Activity;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lcom/mr/elaris/InAppSettings;->ACTIVITY_BACK_UNHOOKS:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    xor-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput-boolean v3, Lcom/mr/elaris/InAppSettings;->sActivityBackHookInstalled:Z

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    monitor-exit v2

    .line 85
    :goto_1
    return-void

    .line 86
    :goto_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    throw p0
.end method

.method public static bridge synthetic f()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->hasActivePage()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static findActivityMethodOwner(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/app/Activity;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    :cond_0
    :goto_0
    if-eqz p0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_1
    if-ge v3, v2, :cond_2

    .line 21
    .line 22
    aget-object v4, v1, v3

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    :cond_2
    if-ne p0, v0, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_4
    :goto_2
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method private findTaggedPage(Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsFocusHelpers;->findTaggedPage(Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private goBack(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsBackNavigator;->goBack(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private handleBackInsideElaris(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->consumeFocusedInputBackOnly(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->goBack(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static handleHostBack(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->activeInstance()Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/mr/elaris/InAppSettings;->hasElarisPage()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettings;->handleBackInsideElaris(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private static hasActivePage()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->activeInstance()Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/mr/elaris/InAppSettings;->hasElarisPage()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method private hasElarisPage()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/mr/elaris/InAppSettings;->findTaggedPage(Landroid/view/View;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static hookMostSpecificActivityMethod(Landroid/app/Activity;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-class p0, Landroid/app/Activity;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettings;->findActivityMethodOwner(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string p2, "settings back hook skipped inherited "

    .line 19
    .line 20
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    sget-object v0, Lcom/mr/elaris/InAppSettings;->ACTIVITY_BACK_UNHOOKS:Ljava/util/Set;

    .line 35
    .line 36
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static lineColor()I
    .locals 1

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->LINE:I

    .line 2
    .line 3
    return v0
.end method

.method private pageBackground()Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->pageBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private registerBackCallback()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->registerBackCallback()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private replacePage(Landroid/view/View;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->keepElarisPageFocused()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/mr/elaris/InAppSettings;->pageTransitionGeneration:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    add-int/2addr v0, v1

    .line 14
    iput v0, p0, Lcom/mr/elaris/InAppSettings;->pageTransitionGeneration:I

    .line 15
    .line 16
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsInputHelpers;->clearFocusedInputForPageTransition(Lcom/mr/elaris/InAppSettings;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "ELARIS_FULL_PAGE"

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->activePageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v1}, Landroid/view/View;->setDefaultFocusHighlightEnabled(Z)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lcom/mr/elaris/InAppSettings$2;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Lcom/mr/elaris/InAppSettings$2;-><init>(Lcom/mr/elaris/InAppSettings;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->activePageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    iget-object p2, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 64
    .line 65
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 66
    .line 67
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    move v4, v1

    .line 81
    :goto_0
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-ge v4, v5, :cond_2

    .line 88
    .line 89
    iget-object v5, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 90
    .line 91
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const/high16 v5, 0x3f800000    # 1.0f

    .line 106
    .line 107
    if-eqz v4, :cond_3

    .line 108
    .line 109
    move v4, v5

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    const v4, 0x3f70a3d7    # 0.94f

    .line 112
    .line 113
    .line 114
    :goto_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x41b00000    # 22.0f

    .line 118
    .line 119
    invoke-virtual {p0, v4}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    mul-int/2addr v4, p2

    .line 124
    int-to-float v4, v4

    .line 125
    invoke-virtual {p1, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 126
    .line 127
    .line 128
    iget-object v4, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 129
    .line 130
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 131
    .line 132
    invoke-direct {v6, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 139
    .line 140
    .line 141
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-ge v1, v2, :cond_4

    .line 146
    .line 147
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Landroid/view/View;

    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    neg-int v4, p2

    .line 165
    const/high16 v6, 0x41000000    # 8.0f

    .line 166
    .line 167
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    mul-int/2addr v4, v6

    .line 172
    int-to-float v4, v4

    .line 173
    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-wide/16 v6, 0xdc

    .line 178
    .line 179
    invoke-virtual {v2, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    .line 184
    .line 185
    const v6, 0x3fb9999a    # 1.45f

    .line 186
    .line 187
    .line 188
    invoke-direct {v4, v6}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v1, v1, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {p2, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    const/4 v1, 0x0

    .line 217
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    const-wide/16 v1, 0x136

    .line 222
    .line 223
    invoke-virtual {p2, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 228
    .line 229
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 230
    .line 231
    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    new-instance v1, Lcom/mr/elaris/InAppSettings$3;

    .line 239
    .line 240
    invoke-direct {v1, p0, v0, v3, p1}, Lcom/mr/elaris/InAppSettings$3;-><init>(Lcom/mr/elaris/InAppSettings;ILjava/util/ArrayList;Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 247
    .line 248
    .line 249
    :goto_3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->refocusElarisPageNow(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    :try_start_0
    new-instance p2, Lcom/mr/elaris/InAppSettings$4;

    .line 253
    .line 254
    invoke-direct {p2, p0, v0}, Lcom/mr/elaris/InAppSettings$4;-><init>(Lcom/mr/elaris/InAppSettings;I)V

    .line 255
    .line 256
    .line 257
    const-wide/16 v0, 0x140

    .line 258
    .line 259
    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    .line 261
    .line 262
    :catchall_0
    :goto_4
    return-void
.end method

.method private restoreQQ()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :goto_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->uninstallActivityBackHook()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_1
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 16
    .line 17
    iget v0, p0, Lcom/mr/elaris/InAppSettings;->pageTransitionGeneration:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/mr/elaris/InAppSettings;->pageTransitionGeneration:I

    .line 22
    .line 23
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->activeInstance()Lcom/mr/elaris/InAppSettings;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-ne v0, p0, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/mr/elaris/InAppSettings;->activeInstance:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_3

    .line 40
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->unregisterBackCallback()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->originalChildren:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroid/view/View;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    instance-of v2, v2, Landroid/view/ViewGroup;

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-object v2, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->restoreWindowState()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_3
    :try_start_2
    const-string v1, "settings"

    .line 94
    .line 95
    const-string v2, "restore-host-page"

    .line 96
    .line 97
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lcom/mr/elaris/InAppSettings;->uninstallActivityBackHook()V

    .line 108
    .line 109
    .line 110
    throw v0
.end method

.method private restoreWindowState()V
    .locals 3

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->originalWindowCaptured:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/mr/elaris/InAppSettings;->originalWindowFlags:I

    .line 14
    .line 15
    not-int v1, v1

    .line 16
    const v2, -0x73fffa00

    .line 17
    .line 18
    .line 19
    and-int/2addr v1, v2

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lcom/mr/elaris/InAppSettings;->originalWindowFlags:I

    .line 24
    .line 25
    and-int/2addr v1, v2

    .line 26
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lcom/mr/elaris/InAppSettings;->originalStatusBarColor:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lcom/mr/elaris/InAppSettings;->originalNavigationBarColor:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget v1, p0, Lcom/mr/elaris/InAppSettings;->originalSystemUiVisibility:I

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->originalDecorBackground:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->originalContentBackground:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :catchall_0
    :cond_1
    return-void
.end method

.method private runClockInNow(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getGroups()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string p1, "\u8bf7\u5148\u9009\u62e9\u7fa4"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-boolean v2, p0, Lcom/mr/elaris/InAppSettings;->manualClockInRunning:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const-string p1, "\u7fa4\u6253\u5361\u6b63\u5728\u8fd0\u884c"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/4 v2, 0x1

    .line 36
    iput-boolean v2, p0, Lcom/mr/elaris/InAppSettings;->manualClockInRunning:Z

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "\u5f00\u59cb\u6253\u5361\uff1a"

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v3, " \u4e2a\u7fa4"

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p0, v2}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Ljava/lang/Thread;

    .line 65
    .line 66
    new-instance v3, Lcom/mr/elaris/InAppSettings$5;

    .line 67
    .line 68
    invoke-direct {v3, p0, v0, v1, p1}, Lcom/mr/elaris/InAppSettings$5;-><init>(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/util/List;Landroid/widget/TextView;)V

    .line 69
    .line 70
    .line 71
    const-string p0, "Elaris-ClockInNow"

    .line 72
    .line 73
    invoke-direct {v2, v3, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static setThemePalette(IIIIIIIIIIIIII)V
    .locals 0

    .line 1
    sput p0, Lcom/mr/elaris/InAppSettings;->BG:I

    .line 2
    .line 3
    sput p1, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 4
    .line 5
    sput p2, Lcom/mr/elaris/InAppSettings;->CARD_SOFT:I

    .line 6
    .line 7
    sput p3, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 8
    .line 9
    sput p4, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 10
    .line 11
    sput p5, Lcom/mr/elaris/InAppSettings;->LINE:I

    .line 12
    .line 13
    sput p6, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 14
    .line 15
    sput p7, Lcom/mr/elaris/InAppSettings;->GREEN:I

    .line 16
    .line 17
    sput p8, Lcom/mr/elaris/InAppSettings;->NOTE:I

    .line 18
    .line 19
    sput p9, Lcom/mr/elaris/InAppSettings;->OFF_BG:I

    .line 20
    .line 21
    sput p10, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 22
    .line 23
    sput p11, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_TOP:I

    .line 24
    .line 25
    sput p12, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_MID:I

    .line 26
    .line 27
    sput p13, Lcom/mr/elaris/InAppSettings;->MENU_GLOW_BOTTOM:I

    .line 28
    .line 29
    return-void
.end method

.method private shouldSuppressLegacyBack()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->wasBackHandledRecently()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static show(Landroid/app/Activity;)V
    .locals 1

    if-eqz p0, :cond_1

    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lcom/mr/elaris/InAppSettings;

    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettings;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0}, Lcom/mr/elaris/InAppSettings;->attach()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lcom/mr/elaris/InAppSettings;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettings;-><init>(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/mr/elaris/InAppSettings;->attach()V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/mr/elaris/InAppSettings;->showCategory(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method private showCategory(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsBackNavigator;->showCategory(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static toggleOffBackgroundColor()I
    .locals 1

    .line 1
    sget v0, Lcom/mr/elaris/InAppSettings;->OFF_BG:I

    .line 2
    .line 3
    return v0
.end method

.method private static declared-synchronized uninstallActivityBackHook()V
    .locals 6

    .line 1
    const-class v0, Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    sget-object v2, Lcom/mr/elaris/InAppSettings;->ACTIVITY_BACK_UNHOOKS:Ljava/util/Set;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    sput-boolean v2, Lcom/mr/elaris/InAppSettings;->sActivityBackHookInstalled:Z

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    if-ge v2, v3, :cond_0

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v3

    .line 34
    :try_start_2
    const-string v4, "settings"

    .line 35
    .line 36
    const-string v5, "unhook-host-back"

    .line 37
    .line 38
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_1
    move-exception v1

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    throw v1
.end method

.method private unregisterBackCallback()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->unregisterBackCallback()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accentOf(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsVisuals;->accentOf(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public accentStrip(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsVisuals;->accentStrip(Lcom/mr/elaris/InAppSettings;I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public actionRow(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsWidgets;->actionRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public addToggleSlot(Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings$ToggleView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsWidgets;->addToggleSlot(Lcom/mr/elaris/InAppSettings;Landroid/widget/LinearLayout;Lcom/mr/elaris/InAppSettings$ToggleView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public applyDialogWindowStyle(Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsDialogStyle;->apply(Lcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public applyThemePalette()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsVisuals;->applyThemePalette(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public backHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->backHeader(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public baseScroll()Landroid/widget/ScrollView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->baseScroll(Lcom/mr/elaris/InAppSettings;)Landroid/widget/ScrollView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bindMottoAudioButton(Landroid/widget/TextView;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->bindButton(Landroid/widget/TextView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public button(Ljava/lang/String;)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets;->button(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public card(Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsWidgets;->card(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;[Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public categoryHeader(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets;->categoryHeader(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public checkCircleDrawable(Z)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets;->checkCircleDrawable(Lcom/mr/elaris/InAppSettings;Z)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public clockInCard()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsClockInPage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public clockInCountText()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getGroups()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "\u4eca\u65e5 "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {}, La7;->D()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v3}, La7;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "/"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public consumeFocusedInputBackOnly(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->consumeFocusedInputBack()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->recordBackHandled()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/mr/elaris/InAppSettings;->findTaggedPage(Landroid/view/View;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return p1
.end method

.method public createGuardedScrollView()Lcom/mr/elaris/InAppSettingsGuardedScrollView;
    .locals 2

    .line 1
    new-instance v0, Lcom/mr/elaris/InAppSettings$GuardedScrollView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/mr/elaris/InAppSettings$GuardedScrollView;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public dialogButton(Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsWidgets;->dialogButton(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public dialogPanel()Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->dialogPanel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public dialogWidth()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->dialogWidth(Lcom/mr/elaris/InAppSettings;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public divider()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsWidgets;->divider(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public dp(F)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->dp(Lcom/mr/elaris/InAppSettings;F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public finishManualClockIn(Ly6;Landroid/widget/TextView;)V
    .locals 3

    .line 1
    const-string v0, "\u7fa4\u6253\u5361\u5b8c\u6210\uff1a"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget v0, p1, Ly6;->b:I

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, "/"

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget p1, p1, Ly6;->a:I

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->clockInCountText()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iput-boolean v1, p0, Lcom/mr/elaris/InAppSettings;->manualClockInRunning:Z

    .line 50
    .line 51
    return-void

    .line 52
    :goto_1
    iput-boolean v1, p0, Lcom/mr/elaris/InAppSettings;->manualClockInRunning:Z

    .line 53
    .line 54
    throw p1
.end method

.method public finishManualKeepFire(Lj8;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    const-string v0, "\u4e0b\u6b21 "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    const-string p1, "\u7eed\u706b\u53d1\u9001\u5931\u8d25"

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object p1, p1, Lj8;->a:Ljava/lang/String;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lcom/mr/elaris/f;->z()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    if-eqz p3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :cond_2
    iput-boolean v1, p0, Lcom/mr/elaris/InAppSettings;->manualKeepFireRunning:Z

    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    iput-boolean v1, p0, Lcom/mr/elaris/InAppSettings;->manualKeepFireRunning:Z

    .line 54
    .line 55
    throw p1
.end method

.method public getBool(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/mr/elaris/Prefs;->defaultBoolean(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/Prefs;->readBoolean(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getGroups()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const-string v1, "clock_in_groups"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/Prefs;->readString(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getKeepFireGroups()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getKeepFireTargets()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getKeepFireTargets()Ljava/lang/String;
    .locals 1

    .line 1
    const-string p0, "keep_fire_groups"

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/mr/elaris/f;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/Prefs;->readString(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public handleBackCallbackInvocation(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettingsBackNavigator;->handleBackCallbackInvocation(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public handleBackInsideElarisFromNavigation(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->hasElarisPage()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->handleBackInsideElaris(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public handlePageBackKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    if-eq p2, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 p1, 0x4

    .line 11
    if-ne p2, p1, :cond_2

    .line 12
    .line 13
    if-eqz p3, :cond_2

    .line 14
    .line 15
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 p2, 0x1

    .line 20
    if-eq p1, p2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p1, "pageKey"

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->handleBackInsideElaris(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return p2

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_3
    :goto_1
    invoke-virtual {p0, p2, p3, p1}, Lcom/mr/elaris/InAppSettings;->handleVolumeKey(ILandroid/view/KeyEvent;Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public handleVolumeKey(ILandroid/view/KeyEvent;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x18

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    if-eq p1, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {p0, p3}, Lcom/mr/elaris/InAppSettings;->releaseFocusedInputForSystemKey(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    const/4 p3, 0x1

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_3

    .line 22
    .line 23
    :cond_1
    if-ne p1, v2, :cond_2

    .line 24
    .line 25
    move v1, p3

    .line 26
    :cond_2
    invoke-direct {p0, v1}, Lcom/mr/elaris/InAppSettings;->adjustSystemVolume(Z)V

    .line 27
    .line 28
    .line 29
    :cond_3
    return p3
.end method

.method public handleVolumeKey(Landroid/view/KeyEvent;Landroid/view/View;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/mr/elaris/InAppSettings;->handleVolumeKey(ILandroid/view/KeyEvent;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public homeTopBar()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsHomePage;->homeTopBar(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public innerBox()Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->innerBox(Lcom/mr/elaris/InAppSettings;)Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public input(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsInputHelpers;->input(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/EditText;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public isBackNavigationEligible()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->hasElarisPage()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public isDarkUi()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/mr/elaris/InAppSettings;->darkUi:Z

    .line 2
    .line 3
    return p0
.end method

.method public keepCategoryBackTarget(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsBackNavigator;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public keepElarisPageFocused()V
    .locals 2

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->active:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const v1, 0xc000600

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 17
    .line 18
    .line 19
    const/high16 v1, -0x80000000

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->activePageColor()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->activePageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->activePageBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    iget-boolean p0, p0, Lcom/mr/elaris/InAppSettings;->darkUi:Z

    .line 55
    .line 56
    if-nez p0, :cond_0

    .line 57
    .line 58
    const/16 p0, 0x2110

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/16 p0, 0x2100

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setSystemUiVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :catchall_0
    :cond_1
    return-void
.end method

.method public keepFireCard()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsKeepFirePage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public keepFireTargetsCompactPreview()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsTargetSummary;->keepFireTargetsCompactPreview(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public menuSoftPanel()Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsVisuals;->menuSoftPanel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public mixForSurface(IF)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->mixForSurface(Lcom/mr/elaris/InAppSettings;IF)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public moduleListCard([Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsWidgets;->moduleListCard(Lcom/mr/elaris/InAppSettings;[Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public moduleListRowBackground(II)Landroid/graphics/drawable/StateListDrawable;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->moduleListRowBackground(Lcom/mr/elaris/InAppSettings;II)Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public moduleRow(Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/mr/elaris/InAppSettingsWidgets;->moduleRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;IILandroid/view/View$OnClickListener;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public openCleanseFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openCleanse(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openClockInGroupPicker(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsTargetPickerBridge;->openClockInGroupPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openExternalLink(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsFeedbackPage;->openExternalLink(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openGroupFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openGroup(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openKeepFireFriendPicker(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsTargetPickerBridge;->openKeepFireFriendPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openKeepFireGroupPicker(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsTargetPickerBridge;->openKeepFireGroupPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openMessageFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openMessage(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openMiscFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openMisc(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openPictureFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openPicture(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public openRepeaterFeatures(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsCategoryNavigator;->openRepeater(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public refocusAfterBackDebounce()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->refocusElarisPageNow(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public refocusElarisPage(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsFocusHelpers;->refocusElarisPage(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public refocusElarisPageNow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/InAppSettingsFocusHelpers;->refocusElarisPageNow(Lcom/mr/elaris/InAppSettings;Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public refreshCurrentPage()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->backNavigator:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->refreshCurrentPage()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public releaseFocusedInputForSystemKey(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/InAppSettingsInputHelpers;->releaseFocusedInputForSystemKey(Lcom/mr/elaris/InAppSettings;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->findTaggedPage(Landroid/view/View;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->refocusElarisPageNow(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public removePreviousPagesAfterTransition(Ljava/util/List;Landroid/view/View;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->content:Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v2, v3, :cond_2

    .line 14
    .line 15
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroid/view/View;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-ne v4, p0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v3, v1}, Landroid/view/View;->setAlpha(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 44
    .line 45
    .line 46
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/view/View;->setTranslationX(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :catchall_0
    return-void
.end method

.method public repeaterIconImageCard()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsRepeaterIconPage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public repeaterModeSummary()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->summary(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public resetAllSettingsToDefaultOff()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/InAppSettingsResetPage;->resetAll(Lcom/mr/elaris/InAppSettings;Landroid/content/SharedPreferences;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public restoreQQFromNavigation()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->restoreQQ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->rootOf(Landroid/widget/ScrollView;)Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public round(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/mr/elaris/InAppSettingsVisuals;->round(II)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mr/elaris/InAppSettingsVisuals;->roundWithStroke(Lcom/mr/elaris/InAppSettings;IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public rowBackground()Landroid/graphics/drawable/StateListDrawable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsVisuals;->rowBackground(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public runManualClockInWorker(Ljava/lang/String;Ljava/util/List;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, La7;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p1, v0}, La7;->x(Ljava/util/ArrayList;Z)Ly6;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "manual clock-in failed: "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Ly6;

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p1, p2, v0}, Ly6;-><init>(II)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p2, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 40
    .line 41
    new-instance v0, Lcom/mr/elaris/InAppSettings$7;

    .line 42
    .line 43
    invoke-direct {v0, p0, p1, p3}, Lcom/mr/elaris/InAppSettings$7;-><init>(Lcom/mr/elaris/InAppSettings;Ly6;Landroid/widget/TextView;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public runManualKeepFireWorker(Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/f;->s()Lj8;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "manual keep-fire failed: "

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ": "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lj8;

    .line 45
    .line 46
    const-string v1, "\u7eed\u706b\u53d1\u9001\u5931\u8d25"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lj8;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v1, p0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 52
    .line 53
    new-instance v2, Lcom/mr/elaris/InAppSettings$6;

    .line 54
    .line 55
    invoke-direct {v2, p0, v0, p1, p2}, Lcom/mr/elaris/InAppSettings$6;-><init>(Lcom/mr/elaris/InAppSettings;Lj8;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public saveBool(Ljava/lang/String;ZZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1, p2}, Lcom/mr/elaris/Prefs;->putBoolean(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    const-string v1, "config_version"

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Lcom/mr/elaris/HookEntry;->setRuntimeBool(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const-string v0, "enable_auto_clock_in"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-static {}, La7;->z()V

    .line 37
    .line 38
    .line 39
    :cond_0
    const-string v1, "keep_fire_enabled"

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 50
    .line 51
    .line 52
    :cond_1
    if-eqz p3, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    invoke-static {}, La7;->t()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string p2, "\u81ea\u52a8\u7fa4\u6253\u5361\u5df2\u5f00\u542f\uff1a"

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string p2, "\u7eed\u706b\u5b9a\u65f6\u6d88\u606f\u5df2\u5f00\u542f\uff1a"

    .line 89
    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    return-void
.end method

.method public saveKeepFireConfig(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)Z
    .locals 7

    .line 1
    const-string v0, "chat_message"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->keepCategoryBackTarget(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->textOf(Landroid/widget/EditText;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->textOf(Landroid/widget/EditText;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->getKeepFireTargets()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v2, v1, v0}, Lcom/mr/elaris/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Li8;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v1, Li8;->a:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v2}, Lcom/mr/elaris/f;->j(Ljava/util/List;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v4, "keep_fire_groups"

    .line 33
    .line 34
    invoke-static {v4, v2}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, Li8;->b:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, "keep_fire_message"

    .line 40
    .line 41
    invoke-static {v4, v2}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v1, Li8;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-string v6, ""

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    move-object v2, v6

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const v2, 0xff1a

    .line 63
    .line 64
    .line 65
    const/16 v5, 0x3a

    .line 66
    .line 67
    invoke-virtual {v0, v2, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v2, v0

    .line 72
    :cond_1
    :goto_0
    const-string v0, "keep_fire_time"

    .line 73
    .line 74
    invoke-static {v0, v2}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Lcom/mr/elaris/f;->c(Li8;Li8;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    const-string v0, "keep_fire_last_sent_day"

    .line 84
    .line 85
    invoke-static {v0, v6}, Lcom/mr/elaris/f;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-static {}, Lcom/mr/elaris/f;->u()V

    .line 89
    .line 90
    .line 91
    if-eqz p3, :cond_3

    .line 92
    .line 93
    invoke-static {}, Lcom/mr/elaris/f;->z()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    if-eqz p4, :cond_4

    .line 101
    .line 102
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    const-string v0, "\u4e0b\u6b21 "

    .line 107
    .line 108
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    if-eqz p5, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->keepFireTargetsCompactPreview()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p5, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    if-eqz p1, :cond_6

    .line 125
    .line 126
    invoke-static {}, Lcom/mr/elaris/f;->A()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    if-eqz p2, :cond_7

    .line 134
    .line 135
    invoke-static {v4, v6}, Lcom/mr/elaris/f;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual {p0, p2, p6}, Lcom/mr/elaris/InAppSettings;->settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p6}, Lcom/mr/elaris/InAppSettings;->refocusElarisPage(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Li8;->a()Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-nez p2, :cond_8

    .line 157
    .line 158
    iget-object p1, p1, Li8;->f:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    return p0

    .line 165
    :cond_8
    invoke-static {}, Lcom/mr/elaris/f;->l()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-string p2, "\u7eed\u706b\u914d\u7f6e\u5df2\u4fdd\u5b58\uff1a"

    .line 170
    .line 171
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 p0, 0x1

    .line 179
    return p0
.end method

.method public saveString(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettings;->sp:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1, p2}, Lcom/mr/elaris/Prefs;->putString(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    const-string v1, "config_version"

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    if-eqz p3, :cond_2

    .line 27
    .line 28
    const-string p2, "pic_summary_text"

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    const-string p1, "\u5df2\u4fdd\u5b58\uff0c\u53d1\u9001\u56fe\u7247\u5c06\u4f7f\u7528\u65b0\u5916\u663e"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toastRestartHint(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const-string p2, "message_repeater_icon_path"

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const-string p1, "\u5df2\u4fdd\u5b58\uff0c\u91cd\u8fdb\u804a\u5929\u540e\u4f7f\u7528\u65b0\u590d\u8bfb\u56fe\u6807"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toastRestartHint(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const-string p1, "\u5df2\u4fdd\u5b58\uff0c\u5efa\u8bae\u91cd\u542f QQ \u751f\u6548"

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toastRestartHint(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public secondaryScroll()Landroid/widget/ScrollView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsLayoutHelpers;->secondaryScroll(Lcom/mr/elaris/InAppSettings;)Landroid/widget/ScrollView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public selectedGroupsPreview()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsTargetSummary;->selectedGroupsPreview(Lcom/mr/elaris/InAppSettings;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public selectedGroupsPreview(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lz6;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 6
    invoke-static {p1, p2}, Lcom/mr/elaris/InAppSettingsTargetSummary;->selectedGroupsPreview(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public selectedTargetsCompactPreview(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk8;",
            ">;",
            "Ljava/util/List<",
            "Lz6;",
            ">;",
            "Ljava/util/List<",
            "Lh5;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2, p3}, Lcom/mr/elaris/InAppSettingsTargetSummary;->selectedTargetsCompactPreview(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public setDarkUi(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mr/elaris/InAppSettings;->darkUi:Z

    .line 2
    .line 3
    return-void
.end method

.method public settingItem(Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mr/elaris/InAppSettingsWidgets;->settingItem(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;ZLcom/mr/elaris/InAppSettingsWidgets$CheckedChangeListener;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public settleTextInput(Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsInputHelpers;->settleTextInput(Lcom/mr/elaris/InAppSettings;Landroid/widget/EditText;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public showCategory(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/mr/elaris/InAppSettings;->showCategory(Ljava/lang/String;Z)V

    return-void
.end method

.method public showCategoryErrorFromNavigation(Ljava/lang/String;Ljava/lang/Throwable;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->secondaryPageVisible:Z

    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lcom/mr/elaris/InAppSettings;->buildErrorPage(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p3}, Lcom/mr/elaris/InAppSettings;->replacePage(Landroid/view/View;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showCategoryFromNavigation(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->secondaryPageVisible:Z

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->buildCategory(Ljava/lang/String;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/mr/elaris/InAppSettings;->replacePage(Landroid/view/View;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showHomeFromNavigation(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettings;->secondaryPageVisible:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettings;->buildHome()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0, p1}, Lcom/mr/elaris/InAppSettings;->replacePage(Landroid/view/View;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showRepeaterModeDialog(Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->showDialog(Lcom/mr/elaris/InAppSettings;Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public startManualClockIn(Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mr/elaris/InAppSettings;->runClockInNow(Landroid/widget/TextView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public startManualKeepFire(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p3, p0, Lcom/mr/elaris/InAppSettings;->manualKeepFireRunning:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p1, "\u7eed\u706b\u53d1\u9001\u6b63\u5728\u8fd0\u884c"

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/mr/elaris/f;->f()Li8;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p3}, Li8;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object p1, p3, Li8;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const/4 p3, 0x1

    .line 28
    iput-boolean p3, p0, Lcom/mr/elaris/InAppSettings;->manualKeepFireRunning:Z

    .line 29
    .line 30
    const-string p3, "\u5f00\u59cb\u7eed\u706b\u53d1\u9001"

    .line 31
    .line 32
    invoke-virtual {p0, p3}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p3, Ljava/lang/Thread;

    .line 36
    .line 37
    new-instance v0, Lcom/mr/elaris/InAppSettings$1;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1, p2}, Lcom/mr/elaris/InAppSettings$1;-><init>(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 40
    .line 41
    .line 42
    const-string p0, "Elaris-KeepFireNow"

    .line 43
    .line 44
    invoke-direct {p3, v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public statPill(Ljava/lang/String;I)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/InAppSettingsWidgets;->statPill(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;I)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public summaryOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsCategoryText;->summaryOf(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public switchRow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsWidgets;->switchRow(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public switchRowCompactDescription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettingsWidgets;->switchRowCompactDescription(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public text(Ljava/lang/String;III)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mr/elaris/InAppSettingsWidgets;->text(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public textOf(Landroid/widget/EditText;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsInputHelpers;->textOf(Landroid/widget/EditText;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public themeCard()Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsThemePage;->create(Lcom/mr/elaris/InAppSettings;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public themeMode()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "ui_theme_mode"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "light"

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "dark"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "system"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0

    .line 33
    :cond_1
    :goto_0
    return-object p0
.end method

.method public titleOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/InAppSettingsCategoryText;->titleOf(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toast(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->toastHelper:Lcom/mr/elaris/InAppSettingsToast;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsToast;->toast(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toastRestartHint(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->toastHelper:Lcom/mr/elaris/InAppSettingsToast;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettingsToast;->toastRestartHint(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toggleMottoAudio()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettings;->mottoAudioPlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->toggle()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toggleSwitchRow(Lcom/mr/elaris/InAppSettings$ToggleView;Ljava/lang/String;Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "message_repeater"

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "single"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const-string v3, "message_repeater_mode"

    .line 20
    .line 21
    invoke-virtual {p0, v3, v0, v2}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2, v1, v1}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->updateRepeaterModeSummaryView()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, p3}, Lcom/mr/elaris/InAppSettings;->showRepeaterModeDialog(Lcom/mr/elaris/InAppSettings$ToggleView;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {p1}, Lcom/mr/elaris/InAppSettingsToggleView;->isChecked()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    xor-int/2addr p3, v1

    .line 42
    invoke-virtual {p1, p3}, Lcom/mr/elaris/InAppSettingsToggleView;->setChecked(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p2, p3, v1}, Lcom/mr/elaris/InAppSettings;->saveBool(Ljava/lang/String;ZZ)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public updateRepeaterModeSummaryView()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsRepeaterModePage;->updateSummaryView(Lcom/mr/elaris/InAppSettings;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
