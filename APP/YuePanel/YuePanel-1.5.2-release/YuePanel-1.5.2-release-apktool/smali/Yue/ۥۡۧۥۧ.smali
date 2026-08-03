.class public LYue/ۥۡۧۥۧ;
.super Lcom/yuexin/panel/panel/voice/items/base/MainItems;


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

.field public static ۥ۟:LYue/ۥۡۧۦ۠;

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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x250

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥۡۧۥۧ;->ۥ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, LYue/ۥۡۧۥۧ;->ۥ:Ljava/util/HashMap;

    const/16 v2, 0x13

    invoke-static {v2}, LYue/ۥۡۧۥۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LYue/ۥ۟ۦۨۥ;->ۥ۟۟۟۟:LYue/ۥۡۧۦ۠;

    if-eqz v0, :cond_0

    sput-object v0, LYue/ۥۡۧۥۧ;->ۥ۟:LYue/ۥۡۧۦ۠;

    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuexin/panel/panel/voice/items/base/MainItems;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;)V
.end method

.method public static native synthetic ۥ۟(Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;I)V
.end method

.method public static native synthetic ۥ۟۟(Ljava/util/List;)V
.end method

.method public static native synthetic ۥ۟۟۟(Lcom/kongzue/dialogx/dialogs/BottomMenu;Ljava/lang/CharSequence;I)Z
.end method

.method public static native synthetic ۥ۟۟۟۠(Ljava/util/List;)V
.end method

.method public static native synthetic ۥ۟۟۟ۡ(Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;)V
.end method

.method public static native synthetic ۥ۟۟۟ۢ(Lcom/yuexin/panel/myClass/LinDuo/LinMainItems;I)V
.end method

.method private static native synthetic ۥۣ۟۟۟(Lcom/kongzue/dialogx/dialogs/BottomMenu;Ljava/lang/CharSequence;I)Z
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

.method public native onLast(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;)V
.end method

.method public native onMore(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;)V
.end method

.method public native onNextItem(Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public native onSearch(Ljava/lang/String;Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public native ۥ۟۟۟۟(Landroid/widget/LinearLayout;Landroid/content/Context;)V
.end method
