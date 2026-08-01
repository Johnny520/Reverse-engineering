.class public final Llin/xposed/hook/view/main/MainSettingActivity;
.super Ltop/sacz/xphelper/activity/BaseActivity;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
        "\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16",
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

.field public static final Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

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
    new-instance v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

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
    .locals 2

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

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
    const-wide v0, -0x36a57c12051405a7L    # -2.3652482602883337E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0
.end method

.method private final initView()V
    .locals 7

    .line 1
    const-wide v0, -0x36a57bc3051405a7L    # -2.3653557895162807E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoManager;->init()V

    .line 11
    .line 12
    .line 13
    const v1, 0x240902ef

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-wide v2, -0x36a57d98051405a7L    # -2.364717419795937E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleLayout(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    const v4, 0x240902f0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v4, Landroid/widget/ImageView;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-wide v5, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    sput-object v4, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const v4, 0x2409018d

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v1, Landroid/widget/ImageView;

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setLeftIcon(Landroid/widget/ImageView;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const v4, 0x2409035c

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast v1, Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setCenterText(Landroid/widget/TextView;)V

    .line 106
    .line 107
    .line 108
    const v1, 0x240903af

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Landroid/widget/TextView;

    .line 116
    .line 117
    new-instance v4, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-wide v5, -0x36a56552051405a7L    # -2.373175478308124E45

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    sget-object v5, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-wide v5, -0x36a57bb3051405a7L    # -2.3653775675877636E45

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getTitleLayout()Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const v4, 0x2409018e

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    check-cast v1, Landroid/widget/ImageView;

    .line 176
    .line 177
    iput-object v1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->searchIcon:Landroid/widget/ImageView;

    .line 178
    .line 179
    invoke-direct {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleBarAttribute()V

    .line 180
    .line 181
    .line 182
    const v1, 0x2412001f

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-wide v2, -0x36a57ba1051405a7L    # -2.365402067918182E45

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleCenterText(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    const-wide v1, -0x36a57b90051405a7L    # -2.3654252071191326E45

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;

    .line 219
    .line 220
    invoke-direct {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V

    .line 221
    .line 222
    .line 223
    const-wide v2, -0x36a57b77051405a7L    # -2.3654592353558247E45

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-nez p0, :cond_0

    .line 236
    .line 237
    new-instance p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 238
    .line 239
    invoke-direct {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 240
    .line 241
    .line 242
    :cond_0
    const-wide v2, -0x36a57b6d051405a7L    # -2.3654728466505015E45

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    const v2, 0x240901a5

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2, p0, v0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(ILandroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const/4 p0, 0x0

    .line 258
    invoke-virtual {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Z)I

    .line 259
    .line 260
    .line 261
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
    sget-boolean v0, Llin/xposed/hook/view/main/MainSettingActivity;->isSponsorDialog:Z

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
    sput-boolean v3, Llin/xposed/hook/view/main/MainSettingActivity;->isSponsorDialog:Z

    .line 228
    .line 229
    :cond_2
    :goto_1
    return-void
.end method

.method public static final setSetting_bar_right(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sput-object p0, Llin/xposed/hook/view/main/MainSettingActivity;->setting_bar_right:Landroid/widget/ImageView;

    .line 18
    .line 19
    return-void
.end method

.method private final setTitleBarAttribute()V
    .locals 4

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

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
    invoke-direct {v1, p0, v3}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-wide v2, -0x36a57b55051405a7L    # -2.365505513757726E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_1
    const-wide v2, -0x36a57c12051405a7L    # -2.3652482602883337E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method

.method private static final setTitleBarAttribute$lambda$0(Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v1, -0x36a57b58051405a7L    # -2.365501430369323E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-wide v1, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const v3, 0x240c0102

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-wide v1, -0x36a57dc4051405a7L    # -2.364657530099359E45

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast p0, Landroid/view/ViewGroup;

    .line 58
    .line 59
    const v1, 0x240903c5

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-wide v2, -0x36a57d98051405a7L    # -2.364717419795937E45

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast v1, Landroid/widget/TextView;

    .line 78
    .line 79
    const v1, 0x240903c4

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v1, Landroid/widget/TextView;

    .line 93
    .line 94
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 95
    .line 96
    const v1, 0x240903c2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast v1, Landroid/widget/TextView;

    .line 110
    .line 111
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 112
    .line 113
    const v1, 0x240903c3

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    check-cast v1, Landroid/widget/TextView;

    .line 127
    .line 128
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

    .line 129
    .line 130
    const v1, 0x240903c1

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v1, Landroid/widget/ImageView;

    .line 144
    .line 145
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Landroid/widget/ImageView;

    .line 146
    .line 147
    const v1, 0x24090148

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v1, Landroid/widget/Button;

    .line 161
    .line 162
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Landroid/widget/Button;

    .line 163
    .line 164
    const v1, 0x240902ad

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    check-cast v1, Landroid/widget/Button;

    .line 178
    .line 179
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Landroid/widget/Button;

    .line 180
    .line 181
    const v1, 0x240903a3

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    check-cast v1, Landroid/widget/TextView;

    .line 195
    .line 196
    iput-object v1, v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/TextView;

    .line 197
    .line 198
    invoke-virtual {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method private static final setTitleBarAttribute$lambda$1(Llin/xposed/hook/view/main/MainSettingActivity;Landroid/view/View;)V
    .locals 12

    .line 1
    sget-object p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x36a50739051405a7L    # -2.4059637260551578E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v7, Landroid/app/Dialog;

    .line 18
    .line 19
    const p1, 0x241302be

    .line 20
    .line 21
    .line 22
    invoke-direct {v7, p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const v0, 0x240c0052

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v7, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 55
    .line 56
    int-to-double v1, v1

    .line 57
    const-wide v3, 0x3feccccccccccccdL    # 0.9

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    mul-double/2addr v1, v3

    .line 63
    double-to-int v1, v1

    .line 64
    const/4 v2, -0x2

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    const/16 v1, 0x11

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    const v1, 0x106000d

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 89
    .line 90
    .line 91
    :cond_2
    const/4 v0, 0x1

    .line 92
    invoke-virtual {v7, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 96
    .line 97
    .line 98
    const v1, 0x24090151

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Landroid/widget/EditText;

    .line 106
    .line 107
    const v2, 0x240901ac

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    move-object v3, v2

    .line 115
    check-cast v3, Landroid/widget/ImageView;

    .line 116
    .line 117
    const v2, 0x240901c6

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v4, v2

    .line 125
    check-cast v4, Landroid/widget/LinearLayout;

    .line 126
    .line 127
    const v2, 0x24090168

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v10, v2

    .line 135
    check-cast v10, Lcom/google/android/flexbox/FlexboxLayout;

    .line 136
    .line 137
    const v2, 0x24090371

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    move-object v11, v2

    .line 145
    check-cast v11, Landroid/widget/TextView;

    .line 146
    .line 147
    const v2, 0x240902c6

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    move-object v5, v2

    .line 155
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 156
    .line 157
    const v2, 0x2409039e

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move-object v6, v2

    .line 165
    check-cast v6, Landroid/widget/TextView;

    .line 166
    .line 167
    const v2, 0x24090398

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, Landroid/widget/TextView;

    .line 175
    .line 176
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v10, v4, v11, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(Lcom/google/android/flexbox/FlexboxLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/EditText;)V

    .line 189
    .line 190
    .line 191
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 192
    .line 193
    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 197
    .line 198
    .line 199
    new-instance v2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;

    .line 200
    .line 201
    move-object v8, p0

    .line 202
    move-object v9, v7

    .line 203
    move-object v7, p1

    .line 204
    invoke-direct/range {v2 .. v9}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰世苏哲;-><init>(Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Llin/xposed/hook/view/main/MainSettingActivity;Landroid/app/Dialog;)V

    .line 205
    .line 206
    .line 207
    move-object v7, v9

    .line 208
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 209
    .line 210
    .line 211
    new-instance p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪哲世苏兰;

    .line 212
    .line 213
    const/4 p1, 0x0

    .line 214
    invoke-direct {p0, v1, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪哲世苏兰;-><init>(Landroid/widget/EditText;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;

    .line 221
    .line 222
    move-object v6, v1

    .line 223
    move-object v3, v10

    .line 224
    move-object v5, v11

    .line 225
    invoke-direct/range {v2 .. v7}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;-><init>(Lcom/google/android/flexbox/FlexboxLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/app/Dialog;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_3

    .line 242
    .line 243
    const/4 p1, 0x5

    .line 244
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 245
    .line 246
    .line 247
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
    .locals 2

    .line 1
    const-wide v0, -0x36a57bd1051405a7L    # -2.365336733703733E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final getCenterText()Landroid/widget/TextView;
    .locals 2

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
    const-wide v0, -0x36a57bf8051405a7L    # -2.3652836496544934E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public final getLeftIcon()Landroid/widget/ImageView;
    .locals 2

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
    const-wide v0, -0x36a57be3051405a7L    # -2.3653122333733148E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public final getTitleLayout()Landroid/view/View;
    .locals 2

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
    const-wide v0, -0x36a57bf4051405a7L    # -2.3652890941723642E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57bd9051405a7L    # -2.3653258446679916E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

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
    new-instance p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    invoke-direct {p1}, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 16
    .line 17
    .line 18
    const-wide v0, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 28
    .line 29
    const-wide v0, -0x36a58b7b051405a7L    # -2.3598786045383213E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iput-object v3, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    invoke-direct {v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 56
    .line 57
    .line 58
    const-wide v3, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-class v3, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    invoke-virtual {v0, v3, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 74
    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    move-object p1, v0

    .line 79
    :goto_0
    iget-object p1, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-ltz p1, :cond_2

    .line 86
    .line 87
    const p1, 0x240902ef

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Landroid/view/ViewGroup;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v1, v0

    .line 101
    check-cast v1, Landroid/app/Activity;

    .line 102
    .line 103
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Landroid/app/Activity;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-wide v3, -0x36a50291051405a7L    # -2.4075861923806368E45

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-wide v4, -0x36a502a3051405a7L    # -2.4075616920502185E45

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-wide v5, -0x36a502a9051405a7L    # -2.4075535252734124E45

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {v1, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-lez v1, :cond_1

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 156
    .line 157
    add-int/2addr v1, v2

    .line 158
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/2addr v1, v2

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->initView()V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_2
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    .line 185
    .line 186
    .line 187
    const-wide p0, -0x36a57e5b051405a7L    # -2.3644519995497387E45

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
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
    const/4 v0, 0x6

    .line 7
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v1, 0x1f4

    .line 20
    .line 21
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setCenterText(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->centerText:Landroid/widget/TextView;

    .line 13
    .line 14
    return-void
.end method

.method public final setLeftIcon(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->leftIcon:Landroid/widget/ImageView;

    .line 13
    .line 14
    return-void
.end method

.method public final setTitleCenterText(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57bd4051405a7L    # -2.36533265031533E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Llin/xposed/hook/view/main/MainSettingActivity;->getCenterText()Landroid/widget/TextView;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTitleLayout(Landroid/view/View;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Llin/xposed/hook/view/main/MainSettingActivity;->titleLayout:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method
