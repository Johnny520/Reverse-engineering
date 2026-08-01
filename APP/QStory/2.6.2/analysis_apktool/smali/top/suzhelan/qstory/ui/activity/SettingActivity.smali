.class public final Ltop/suzhelan/qstory/ui/activity/SettingActivity;
.super Ltop/sacz/xphelper/activity/BaseComposeActivity;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Landroid/app/Activity;)V

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
    const-wide v0, -0x36a400f5051405a7L    # -2.497349958515445E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-static {p0, p2, p1, v2}, Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;L飘花落叶言苏哲楪兰子世/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 34
    .line 35
    .line 36
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 37
    .line 38
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
    .locals 6

    .line 1
    new-instance v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v1, -0x36a58b7b051405a7L    # -2.3598786045383213E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iput-object v3, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iput-object v4, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 40
    .line 41
    new-instance v1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    invoke-direct {v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 44
    .line 45
    .line 46
    const-wide v4, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-class v4, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    invoke-virtual {v1, v4, v2}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object v0, v1

    .line 67
    :goto_0
    iget-object v0, v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    sget-boolean v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isSponsorDialog:Z

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    sget-object v0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;

    .line 84
    .line 85
    new-instance v0, Lcom/google/gson/飘花落叶言子楪苏世兰哲;

    .line 86
    .line 87
    invoke-direct {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 98
    .line 99
    const/16 v2, 0x13

    .line 100
    .line 101
    invoke-direct {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const-wide v4, -0x36a4025d051405a7L    # -2.496859951907079E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object v2, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iput-object v2, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v2, L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 128
    .line 129
    invoke-direct {v2, v0}, L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-class v1, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-wide v1, -0x36a40231051405a7L    # -2.496919841603657E45

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;

    .line 161
    .line 162
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 163
    .line 164
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 165
    .line 166
    .line 167
    const-wide v1, -0x36a431db051405a7L    # -2.4803113398389798E45

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 177
    .line 178
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏(Z)V

    .line 182
    .line 183
    .line 184
    const-wide v1, -0x36a431c6051405a7L    # -2.4803399235578012E45

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-wide v1, -0x36a4318f051405a7L    # -2.4804147856785238E45

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    new-instance v2, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 206
    .line 207
    const/4 v4, 0x4

    .line 208
    invoke-direct {v2, v4}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 215
    .line 216
    .line 217
    sget-object v1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 218
    .line 219
    new-instance v2, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰哲苏;

    .line 220
    .line 221
    invoke-direct {v2, v0, v3}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;I)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 225
    .line 226
    .line 227
    sput-boolean v3, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isSponsorDialog:Z

    .line 228
    .line 229
    :cond_2
    :goto_1
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
    .locals 5

    .line 1
    invoke-super {p0, p1}, Ltop/sacz/xphelper/activity/BaseComposeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->applyImmersiveSystemBars()V

    .line 5
    .line 6
    .line 7
    new-instance p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    invoke-direct {p1}, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 22
    .line 23
    const-wide v0, -0x36a58b7b051405a7L    # -2.3598786045383213E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    invoke-direct {v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 50
    .line 51
    .line 52
    const-wide v3, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-class v3, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    invoke-virtual {v0, v3, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-object p1, v0

    .line 73
    :goto_0
    iget-object p1, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-ltz p1, :cond_1

    .line 80
    .line 81
    invoke-static {}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->init()V

    .line 82
    .line 83
    .line 84
    new-instance p1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 85
    .line 86
    const/16 v0, 0xa

    .line 87
    .line 88
    invoke-direct {p1, p0, v0}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 92
    .line 93
    const v1, -0x23d79204

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v0, v1, v2, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v0}, Landroidx/activity/compose/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 112
    .line 113
    const/16 v1, 0xe

    .line 114
    .line 115
    invoke-direct {v0, p0, v1}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_1
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    .line 123
    .line 124
    .line 125
    const-wide p0, -0x36a57e5b051405a7L    # -2.3644519995497387E45

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
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
