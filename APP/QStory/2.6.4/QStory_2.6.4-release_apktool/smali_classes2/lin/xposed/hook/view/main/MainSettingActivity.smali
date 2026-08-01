.class public final Llin/xposed/hook/view/main/MainSettingActivity;
.super Ltop/sacz/xphelper/activity/BaseActivity;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\"\u0010\'\u001a\u00020&8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008-\u0010(\u00a8\u00060"
    }
    d2 = {
        "Llin/xposed/hook/view/main/MainSettingActivity;",
        "Ltop/sacz/xphelper/activity/BaseActivity;",
        "<init>",
        "()V",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "initView",
        "setTitleBarAttribute",
        "",
        "text",
        "setTitleCenterText",
        "(Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "newBase",
        "attachBaseContext",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "(Landroid/content/res/Configuration;)V",
        "onResume",
        "Landroid/view/View;",
        "titleLayout",
        "Landroid/view/View;",
        "getTitleLayout",
        "()Landroid/view/View;",
        "setTitleLayout",
        "(Landroid/view/View;)V",
        "Landroid/widget/TextView;",
        "centerText",
        "Landroid/widget/TextView;",
        "getCenterText",
        "()Landroid/widget/TextView;",
        "setCenterText",
        "(Landroid/widget/TextView;)V",
        "Landroid/widget/ImageView;",
        "leftIcon",
        "Landroid/widget/ImageView;",
        "getLeftIcon",
        "()Landroid/widget/ImageView;",
        "setLeftIcon",
        "(Landroid/widget/ImageView;)V",
        "searchIcon",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16",
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

.field public static final Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

.field private static isSponsorDialog:Z = true

.field public static setting_bar_right:Landroid/widget/ImageView;


# instance fields
.field public centerText:Landroid/widget/TextView;

.field public leftIcon:Landroid/widget/ImageView;

.field private searchIcon:Landroid/widget/ImageView;

.field public titleLayout:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/sacz/xphelper/activity/BaseActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getSetting_bar_right()Landroid/widget/ImageView;
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/16 v0, 0x4f6

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    throw v0
.end method

.method private final initView()V
    .locals 5

    .line 1
    const/16 v0, 0x4fb

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->init()V

    .line 8
    .line 9
    .line 10
    const v1, 0x240902ef

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/16 v2, 0x4e4

    .line 18
    .line 19
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleLayout(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 29
    .line 30
    const v3, 0x240902f0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v3, Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v1, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 49
    .line 50
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    sput-object v3, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const v3, 0x2409018d

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v1, Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setLeftIcon(Landroid/widget/ImageView;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const v3, 0x2409035c

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    check-cast v1, Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setCenterText(Landroid/widget/TextView;)V

    .line 97
    .line 98
    .line 99
    const v1, 0x240903af

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Landroid/widget/TextView;

    .line 107
    .line 108
    new-instance v3, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v4, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 114
    .line 115
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    sget-object v4, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const/16 v4, 0x4fc

    .line 128
    .line 129
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const v3, 0x2409018e

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v3, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroid/view/View;II)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Landroid/widget/ImageView;

    .line 155
    .line 156
    iput-object v1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->searchIcon:Landroid/widget/ImageView;

    .line 157
    .line 158
    invoke-direct {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleBarAttribute()V

    .line 159
    .line 160
    .line 161
    const v1, 0x2412001f

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const/16 v2, 0x4fd

    .line 169
    .line 170
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleCenterText(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    const/16 v1, 0x4fe

    .line 184
    .line 185
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;

    .line 192
    .line 193
    invoke-direct {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V

    .line 194
    .line 195
    .line 196
    const/16 v2, 0x4ff

    .line 197
    .line 198
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    if-nez p0, :cond_0

    .line 206
    .line 207
    new-instance p0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;

    .line 208
    .line 209
    invoke-direct {p0}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 210
    .line 211
    .line 212
    :cond_0
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 213
    .line 214
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const v2, 0x240901a5

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2, p0, v0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(ILandroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const/4 p0, 0x0

    .line 225
    invoke-virtual {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Z)I

    .line 226
    .line 227
    .line 228
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
    sget-boolean v0, Llin/xposed/hook/view/main/MainSettingActivity;->isSponsorDialog:Z

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
    sput-boolean v2, Llin/xposed/hook/view/main/MainSettingActivity;->isSponsorDialog:Z

    .line 241
    .line 242
    :cond_1
    :goto_0
    return-void
.end method

.method public static final setSetting_bar_right(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sput-object p0, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 15
    .line 16
    return-void
.end method

.method private final setTitleBarAttribute()V
    .locals 4

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    new-instance v2, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    const/16 v3, 0xa

    .line 14
    .line 15
    invoke-direct {v2, v3}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Llin/xposed/hook/view/main/MainSettingActivity;->searchIcon:Landroid/widget/ImageView;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const/16 v2, 0xd

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/16 p0, 0x500

    .line 37
    .line 38
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    const/16 p0, 0x4f6

    .line 47
    .line 48
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method

.method private static final setTitleBarAttribute$lambda$0(Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v1, 0x501

    .line 8
    .line 9
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    const v3, 0x240c0102

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/16 v1, 0x4e3

    .line 41
    .line 42
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p0, Landroid/view/ViewGroup;

    .line 49
    .line 50
    const v1, 0x240903c5

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/16 v2, 0x4e4

    .line 58
    .line 59
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v1, Landroid/widget/TextView;

    .line 66
    .line 67
    const v1, 0x240903c4

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    check-cast v1, Landroid/widget/TextView;

    .line 81
    .line 82
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 83
    .line 84
    const v1, 0x240903c2

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v1, Landroid/widget/TextView;

    .line 98
    .line 99
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 100
    .line 101
    const v1, 0x240903c3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v1, Landroid/widget/TextView;

    .line 115
    .line 116
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

    .line 117
    .line 118
    const v1, 0x240903c1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast v1, Landroid/widget/ImageView;

    .line 132
    .line 133
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Landroid/widget/ImageView;

    .line 134
    .line 135
    const v1, 0x24090148

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast v1, Landroid/widget/Button;

    .line 149
    .line 150
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 151
    .line 152
    const v1, 0x240902ad

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    check-cast v1, Landroid/widget/Button;

    .line 166
    .line 167
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Landroid/widget/Button;

    .line 168
    .line 169
    const v1, 0x240903a3

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast v1, Landroid/widget/TextView;

    .line 183
    .line 184
    iput-object v1, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/TextView;

    .line 185
    .line 186
    invoke-virtual {v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method private static final setTitleBarAttribute$lambda$1(Llin/xposed/hook/view/main/MainSettingActivity;Landroid/view/View;)V
    .locals 11

    .line 1
    sget-object p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 p1, 0xd

    .line 7
    .line 8
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v5, Landroid/app/Dialog;

    .line 15
    .line 16
    const p1, 0x241302be

    .line 17
    .line 18
    .line 19
    invoke-direct {v5, p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const v0, 0x240c0052

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v5, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 52
    .line 53
    int-to-double v1, v1

    .line 54
    const-wide v3, 0x3feccccccccccccdL    # 0.9

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-double/2addr v1, v3

    .line 60
    double-to-int v1, v1

    .line 61
    const/4 v2, -0x2

    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    const/16 v1, 0x11

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    const v1, 0x106000d

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 86
    .line 87
    .line 88
    :cond_2
    const/4 v0, 0x1

    .line 89
    invoke-virtual {v5, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 93
    .line 94
    .line 95
    const v1, 0x24090151

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v8, v1

    .line 103
    check-cast v8, Landroid/widget/EditText;

    .line 104
    .line 105
    const v1, 0x240901ac

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Landroid/widget/ImageView;

    .line 113
    .line 114
    const v2, 0x240901c6

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Landroid/widget/LinearLayout;

    .line 122
    .line 123
    const v3, 0x24090168

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v9, v3

    .line 131
    check-cast v9, Lcom/google/android/flexbox/FlexboxLayout;

    .line 132
    .line 133
    const v3, 0x24090371

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    move-object v10, v3

    .line 141
    check-cast v10, Landroid/widget/TextView;

    .line 142
    .line 143
    const v3, 0x240902c6

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 151
    .line 152
    const v4, 0x2409039e

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Landroid/widget/TextView;

    .line 160
    .line 161
    const v6, 0x24090398

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Landroid/widget/TextView;

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {v9, v2, v10, v8}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(Lcom/google/android/flexbox/FlexboxLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/EditText;)V

    .line 183
    .line 184
    .line 185
    new-instance v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 186
    .line 187
    invoke-direct {v6, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 191
    .line 192
    .line 193
    new-instance v0, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰世苏哲;

    .line 194
    .line 195
    move-object v6, p0

    .line 196
    move-object v7, v5

    .line 197
    move-object v5, p1

    .line 198
    invoke-direct/range {v0 .. v7}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰世苏哲;-><init>(Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Llin/xposed/hook/view/main/MainSettingActivity;Landroid/app/Dialog;)V

    .line 199
    .line 200
    .line 201
    move-object v5, v7

    .line 202
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 203
    .line 204
    .line 205
    new-instance p0, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏兰世哲;

    .line 206
    .line 207
    const/4 p1, 0x0

    .line 208
    invoke-direct {p0, v8, p1}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏兰世哲;-><init>(Landroid/widget/EditText;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;

    .line 215
    .line 216
    move-object v4, v8

    .line 217
    move-object v1, v9

    .line 218
    move-object v3, v10

    .line 219
    invoke-direct/range {v0 .. v5}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;-><init>(Lcom/google/android/flexbox/FlexboxLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/app/Dialog;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4}, Landroid/view/View;->requestFocus()Z

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-eqz p0, :cond_3

    .line 236
    .line 237
    const/4 p1, 0x5

    .line 238
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 239
    .line 240
    .line 241
    :cond_3
    return-void
.end method

.method public static synthetic 飘花落叶言子楪兰世哲苏(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleBarAttribute$lambda$0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪兰世苏哲()V
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/view/main/MainSettingActivity;->onResume$lambda$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪哲兰苏世(Llin/xposed/hook/view/main/MainSettingActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleBarAttribute$lambda$1(Llin/xposed/hook/view/main/MainSettingActivity;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final getCenterText()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/MainSettingActivity;->centerText:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x4f8

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public final getLeftIcon()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x4f9

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public final getTitleLayout()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/MainSettingActivity;->titleLayout:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x4f7

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const/16 v0, 0x4fa

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Ltop/sacz/xphelper/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x240c00ec

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ltop/sacz/xphelper/activity/BaseActivity;->requestTranslucentStatusBar()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏()L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x0

    .line 24
    if-ltz p1, :cond_1

    .line 25
    .line 26
    const p1, 0x240902ef

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v2, v1

    .line 40
    check-cast v2, Landroid/app/Activity;

    .line 41
    .line 42
    invoke-static {v2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/16 v3, 0x30

    .line 50
    .line 51
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 56
    .line 57
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 62
    .line 63
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-lez v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 86
    .line 87
    add-int/2addr v2, v0

    .line 88
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-int/2addr v2, v0

    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->initView()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_1
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 115
    .line 116
    .line 117
    const/16 p0, 0x4df

    .line 118
    .line 119
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v1, 0x1f4

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setCenterText(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->centerText:Landroid/widget/TextView;

    .line 10
    .line 11
    return-void
.end method

.method public final setLeftIcon(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 10
    .line 11
    return-void
.end method

.method public final setTitleCenterText(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getCenterText()Landroid/widget/TextView;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTitleLayout(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->titleLayout:Landroid/view/View;

    .line 10
    .line 11
    return-void
.end method
