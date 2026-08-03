.class public LYue/ۥۡ۠ۨۧ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡ۠ۨۧ;->ۥ۟۟ۡ۟(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۨۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۥ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, 0x56c1a13882d383cL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۥ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x115bb0d3bc275c26L    # -9.396823598264449E224

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۤ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x774b3616e4648972L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x2e9f31ffcc73c0f5L    # -1.0201859255830092E84

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, 0x59855c61e995f425L    # 1.7650912459680642E123

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0xf16b324ca4ca682L    # -8.044349254874904E235

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, 0x6f608c5d62714706L    # 3.136173711660826E228

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x1bc22cbb108a25daL    # 5.740906594208416E-175

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, -0x7a43b58ea3ce55faL    # -4.870450881713706E-281

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, -0x392b10647fbb2a33L    # -1.6985273926321386E33

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, -0x5334546c57cd5ffdL    # -6.632602788424729E-93

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_a
    return-object p0

    :pswitch_b
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, -0x5afb499990b0584dL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_b
    return-object p0

    :pswitch_c
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_c

    const-wide v0, -0x30a34a84dbbbae54L    # -2.0289701518140493E74

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_c
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const-class v4, Landroid/view/View;

    invoke-static {p1, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const/4 v4, 0x2

    invoke-static {v4}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v3}, LYue/ۥۢ۠ۦ۟;->ۥ۟۟۟(Landroid/view/View;)V

    :cond_0
    invoke-static {v3}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, LYue/ۥۡ۠ۨۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-static {v4, v3}, LYue/ۥۡ۠ۨۧ;->ۥ۟۟۠۟(LYue/ۥۡ۠ۨۧ;Ljava/util/List;)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v0

    move v5, v4

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/4 v8, 0x4

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    if-nez v0, :cond_3

    move-object v0, v6

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v8, 0x5

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8, v0}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move v0, v2

    :cond_3
    const/4 v8, 0x6

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const/4 v8, 0x7

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    move v4, v2

    move v5, v4

    goto :goto_0

    :cond_4
    const/16 v8, 0x8

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    if-nez v4, :cond_6

    check-cast v6, Landroid/widget/FrameLayout;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    new-instance v6, Landroid/widget/TextView;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v7, 0x41300000    # 11.0f

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v7, 0x9

    invoke-static {v7}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7, v6}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v7, 0xa

    invoke-static {v7}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7, v4}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz v1, :cond_5

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_5
    move v4, v2

    goto :goto_0

    :cond_6
    const/16 v8, 0xb

    invoke-static {v8}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    if-nez v5, :cond_7

    const/16 v5, 0xc

    invoke-static {v5}, LYue/ۥۡ۠ۨۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v5, v2

    :cond_7
    :goto_0
    if-eqz v0, :cond_1

    if-eqz v5, :cond_1

    if-eqz v4, :cond_1

    :catchall_0
    :cond_8
    return-void
.end method
