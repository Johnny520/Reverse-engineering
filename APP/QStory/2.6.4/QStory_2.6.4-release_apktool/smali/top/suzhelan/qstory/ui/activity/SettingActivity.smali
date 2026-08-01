.class public final Ltop/suzhelan/qstory/ui/activity/SettingActivity;
.super Ltop/sacz/xphelper/activity/BaseComposeActivity;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
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
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(Landroid/app/Activity;)V

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
    new-instance v1, Landroidx/core/view/飘花落叶言子兰楪哲苏世;

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
    invoke-direct {v1, v2, p0}, Landroidx/core/view/飘花落叶言子兰楪哲苏世;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    xor-int/lit8 p0, v0, 0x1

    .line 48
    .line 49
    iget-object v0, v1, Landroidx/core/view/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子兰楪苏哲世;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Landroidx/core/view/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世苏兰哲(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroidx/core/view/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世苏哲兰(Z)V

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
    const/16 v0, 0xbab

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
    invoke-static {p0, p2, p1, v2}, Ltop/suzhelan/qstory/ui/activity/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;L飘花落叶言苏哲世兰楪子/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

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
    .locals 14

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏()L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

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
    sget-object v0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    sget-object v2, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 24
    .line 25
    sget-object v7, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    .line 26
    .line 27
    sget-object v3, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v5, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世:Lcom/google/gson/飘花落叶言子楪世苏兰哲;

    .line 45
    .line 46
    sget-object v11, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏:Lcom/google/gson/ToNumberPolicy;

    .line 47
    .line 48
    sget-object v12, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰:Lcom/google/gson/ToNumberPolicy;

    .line 49
    .line 50
    new-instance v6, Ljava/util/ArrayDeque;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 53
    .line 54
    .line 55
    move-object v8, v6

    .line 56
    sget-object v6, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 57
    .line 58
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    new-instance v10, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    add-int/2addr v13, v9

    .line 72
    add-int/lit8 v13, v13, 0x3

    .line 73
    .line 74
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 78
    .line 79
    .line 80
    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    new-instance v9, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    sget-boolean v9, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 95
    .line 96
    move-object v9, v1

    .line 97
    new-instance v1, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 98
    .line 99
    move-object v13, v4

    .line 100
    new-instance v4, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v4, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 103
    .line 104
    .line 105
    move-object v0, v8

    .line 106
    new-instance v8, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    new-instance v9, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    new-instance v13, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v1 .. v13}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>(Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;Lcom/google/gson/飘花落叶言子楪世苏哲兰;Ljava/util/Map;Lcom/google/gson/飘花落叶言子楪世苏兰哲;Lcom/google/gson/Strictness;Lcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/飘花落叶言子楪哲世苏兰;Lcom/google/gson/飘花落叶言子楪哲世苏兰;Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 125
    .line 126
    const/16 v2, 0x13

    .line 127
    .line 128
    invoke-direct {v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 129
    .line 130
    .line 131
    const/16 v2, 0xb9e

    .line 132
    .line 133
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sget-object v2, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-static {v2}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪哲苏兰;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iput-object v3, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 151
    .line 152
    new-instance v3, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;

    .line 153
    .line 154
    invoke-direct {v3, v1}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const-class v1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const/16 v1, 0xb9f

    .line 175
    .line 176
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 183
    .line 184
    new-instance v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 185
    .line 186
    invoke-direct {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 190
    .line 191
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iput-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 196
    .line 197
    invoke-virtual {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏楪哲(Z)V

    .line 201
    .line 202
    .line 203
    const/16 v1, 0xcb6

    .line 204
    .line 205
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0, v1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/16 v1, 0xcb7

    .line 213
    .line 214
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v3, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 219
    .line 220
    const/4 v4, 0x6

    .line 221
    invoke-direct {v3, v4}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v1, v3}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世兰哲()V

    .line 228
    .line 229
    .line 230
    sget-object v1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 231
    .line 232
    new-instance v3, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪苏世哲兰;

    .line 233
    .line 234
    invoke-direct {v3, v0, v2}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 238
    .line 239
    .line 240
    sput-boolean v2, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->isSponsorDialog:Z

    .line 241
    .line 242
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
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏()L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

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
    const/16 p0, 0x4df

    .line 65
    .line 66
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
