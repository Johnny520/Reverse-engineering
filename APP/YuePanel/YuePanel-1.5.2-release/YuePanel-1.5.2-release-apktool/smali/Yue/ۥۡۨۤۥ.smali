.class public LYue/ۥۡۨۤۥ;
.super Lcom/yuexin/panel/panel/voice/items/base/MainItems;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۨۤۥ$ۥ;
    }
.end annotation


# static fields
.field public static ۥ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    const/16 v0, 0x3da

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥۡۨۤۥ;->ۥ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LYue/ۥۡۨۤۥ;->ۥ:Ljava/util/HashMap;

    const/4 v3, 0x4

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LYue/ۥ۟ۡۥۧ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۡۥۧ;

    invoke-virtual {v3}, LYue/ۥ۟ۡۥۧ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x7

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    invoke-static {v5}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v4, v5, v3}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, LYue/ۥۡۨۤۥ$ۥ;

    invoke-static {v1}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0x9

    invoke-static {v5}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v4, v5, v3}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/16 v2, 0xa

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0xc

    invoke-static {v5}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v1, v2, v6, v3, v5}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/16 v2, 0xd

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0xf

    invoke-static {v5}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v6, v3, v5}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/16 v2, 0x10

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x11

    invoke-static {v3}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x12

    invoke-static {v5}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v6, v3, v5}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/16 v2, 0x13

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    const/16 v2, 0x14

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    const/16 v2, 0x15

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v11

    const/16 v2, 0x16

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    const/4 v9, 0x0

    const/4 v12, 0x0

    const-class v13, Lcom/yuexin/panel/panel/VoicePanel;

    move-object v7, v1

    invoke-direct/range {v7 .. v14}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Class;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LYue/ۥۡۨۤۥ$ۥ;

    const/16 v2, 0x17

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v16

    const/16 v2, 0x18

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v18

    const/16 v2, 0x19

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v19

    const/16 v2, 0x1a

    invoke-static {v2}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v22

    const/16 v17, 0x0

    const/16 v20, 0x1

    const-class v21, Lcom/yuexin/panel/panel/VoicePanel;

    move-object v15, v1

    invoke-direct/range {v15 .. v22}, LYue/ۥۡۨۤۥ$ۥ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Class;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, LYue/ۥۡۨۤۥ;->ۥ:Ljava/util/HashMap;

    invoke-static {v4}, LYue/ۥۡۨۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuexin/panel/panel/voice/items/base/MainItems;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Ljava/lang/Class;Ljava/lang/String;Landroid/widget/Switch;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟(Ljava/lang/String;Landroid/widget/CompoundButton;Z)V
.end method

.method public static native synthetic ۥ۟۟۟(Ljava/lang/String;Landroid/widget/CompoundButton;Z)V
.end method

.method public static native synthetic ۥ۟۟۟۟(Ljava/lang/Class;Ljava/lang/String;Landroid/widget/Switch;Landroid/view/View;)V
.end method


# virtual methods
.method public native buildView(Landroid/content/Context;ILjava/lang/String;)Landroid/view/View;
.end method

.method public native getInitMap()Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end method

.method public native onBuild(Landroid/view/View;Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public native onNextItem(Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public final native ۥ۟۟(Landroid/widget/LinearLayout;Landroid/content/Context;)V
.end method
