.class public final Ltop/suzhelan/qstory/ui/activity/SettingActivity;
.super Ltop/sacz/xphelper/activity/BaseComposeActivity;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Ltop/suzhelan/qstory/ui/activity/SettingActivity;",
        "Ltop/sacz/xphelper/activity/BaseComposeActivity;",
        "<init>",
        "()V",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "applyImmersiveSystemBars",
        "",
        "isDarkModeEnabled",
        "()Z",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onResume",
        "hasFocus",
        "onWindowFocusChanged",
        "(Z)V",
        "Companion",
        "top/suzhelan/qstory/ui/activity/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲;

.field private static isSponsorDialog:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->Companion:Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/sacz/xphelper/activity/BaseComposeActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final applyImmersiveSystemBars()V
    .locals 3

    .line 1
    invoke-static {p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏哲兰世楪(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Landroidx/core/view/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪苏兰世哲(Landroid/view/Window;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isDarkModeEnabled()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    new-instance v1, Landroidx/core/view/飘花落叶言子兰楪哲世苏;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v1, v2, p0}, Landroidx/core/view/飘花落叶言子兰楪哲世苏;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    xor-int/lit8 p0, v0, 0x1

    .line 48
    .line 49
    iget-object v0, v1, Landroidx/core/view/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子兰楪苏世哲;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Landroidx/core/view/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世苏兰哲(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroidx/core/view/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世苏哲兰(Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final isDarkModeEnabled()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private static final onCreate$lambda$0(Ltop/suzhelan/qstory/ui/activity/SettingActivity;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 4

    .line 1
    const/16 v0, 0xb39

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    and-int/lit8 v0, p2, 0x3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/2addr p2, v3

    .line 17
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-static {p0, p2, p1, v2}, Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;L飘花落叶言苏哲楪世兰子/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 31
    .line 32
    .line 33
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    return-object p0
.end method

.method private static final onCreate$lambda$1(Ltop/suzhelan/qstory/ui/activity/SettingActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->applyImmersiveSystemBars()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onResume$lambda$0()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-boolean v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isSponsorDialog:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    new-instance v0, Lcom/google/gson/飘花落叶言子楪苏世兰哲;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 36
    .line 37
    const/16 v2, 0x13

    .line 38
    .line 39
    invoke-direct {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const/16 v2, 0xb2c

    .line 43
    .line 44
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object v2, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-static {v2}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v3, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    invoke-direct {v3, v0}, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-class v1, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世哲苏兰;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const/16 v1, 0xb2d

    .line 86
    .line 87
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世哲苏兰;

    .line 94
    .line 95
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 96
    .line 97
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 101
    .line 102
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 107
    .line 108
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏(Z)V

    .line 112
    .line 113
    .line 114
    const/16 v1, 0xc44

    .line 115
    .line 116
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/16 v1, 0xc45

    .line 124
    .line 125
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v3, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 130
    .line 131
    const/4 v4, 0x4

    .line 132
    invoke-direct {v3, v4}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1, v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 139
    .line 140
    .line 141
    sget-object v1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 142
    .line 143
    new-instance v3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰哲苏;

    .line 144
    .line 145
    invoke-direct {v3, v0, v2}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 149
    .line 150
    .line 151
    sput-boolean v2, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isSponsorDialog:Z

    .line 152
    .line 153
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲世兰苏()V
    .locals 0

    .line 1
    invoke-static {}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->onResume$lambda$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏世兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->onCreate$lambda$1(Ltop/suzhelan/qstory/ui/activity/SettingActivity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲苏兰世(Ltop/suzhelan/qstory/ui/activity/SettingActivity;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->onCreate$lambda$0(Ltop/suzhelan/qstory/ui/activity/SettingActivity;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ltop/sacz/xphelper/activity/BaseComposeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->applyImmersiveSystemBars()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->init()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    invoke-direct {p1, p0, v0}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 30
    .line 31
    const v1, -0x23d79204

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Landroidx/activity/compose/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 50
    .line 51
    const/16 v1, 0xe

    .line 52
    .line 53
    invoke-direct {v0, p0, v1}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 p0, 0x0

    .line 61
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 62
    .line 63
    .line 64
    const/16 p0, 0x4fb

    .line 65
    .line 66
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->applyImmersiveSystemBars()V

    .line 5
    .line 6
    .line 7
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v1, 0x1f4

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->applyImmersiveSystemBars()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method
