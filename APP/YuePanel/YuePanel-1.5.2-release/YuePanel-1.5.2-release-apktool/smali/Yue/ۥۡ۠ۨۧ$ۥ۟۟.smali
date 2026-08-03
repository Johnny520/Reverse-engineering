.class public LYue/ۥۡ۠ۨۧ$ۥ۟۟;
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

.field public static volatile synthetic ۥ۟۟ۡۦ:Ljava/lang/String;


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

    iput-object p1, p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۦ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x1a5fc7e9c30ea063L    # -3.365068183531651E181

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۦ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1bc22cbb108a25daL    # 5.740906594208416E-175

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۥ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۤ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x392b10647fbb2a33L    # -1.6985273926321386E33

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۤ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x56c1a13882d383cL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x2e9f31ffcc73c0f5L    # -1.0201859255830092E84

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x33969ae437a7f78eL    # 3.516788481987412E-60

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x774b3616e4648972L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0xf16b324ca4ca682L    # -8.044349254874904E235

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, 0x6f608c5d62714706L    # 3.136173711660826E228

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, -0x5334546c57cd5ffdL    # -6.632602788424729E-93

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, -0x5afb499990b0584dL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_a
    return-object p0

    :pswitch_b
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, -0x17f60b246111a09bL    # -1.4803110133405302E193

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_b
    return-object p0

    :pswitch_c
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_c

    const-wide v0, 0x25cffdba6fa03b2bL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_c
    return-object p0

    :pswitch_d
    sget-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_d

    const-wide v0, 0x226ee79863482b78L    # 7.919835567915274E-143

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_d
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
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

.method public static synthetic ۥ(LYue/ۥۡ۠ۨۧ$ۥ۟۟;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡۦۤۥ;->ۥ۟۟(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    iget-object v0, p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-static {v0, p1}, LYue/ۥۡ۠ۨۧ;->ۥ۟۟۠۠(LYue/ۥۡ۠ۨۧ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-static {v4}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v0, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    const/4 v6, 0x2

    invoke-static {v6}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    new-array v7, v1, [Ljava/lang/Object;

    invoke-static {v0, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v1

    const/4 v7, 0x3

    :try_start_0
    invoke-static {v7}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v8

    const-class v9, Landroid/view/View;

    invoke-static {p1, v8, v9}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v9, p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-static {v9, v8, v0, v6}, LYue/ۥۡ۠ۨۧ;->ۥ۟۟۠ۡ(LYue/ۥۡ۠ۨۧ;Landroid/view/View;Ljava/lang/Object;Z)V

    const/4 v9, 0x4

    invoke-static {v9}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    new-instance v9, LYue/ۥۡ۠ۨۨ;

    invoke-direct {v9, v0}, LYue/ۥۡ۠ۨۨ;-><init>(Ljava/lang/Object;)V

    invoke-static {v8, v9}, LYue/ۥۢ۠ۦ۟;->ۥ۟۟۟۟(Landroid/view/View;LYue/ۥۢ۠ۦ۟$ۥ۟;)V

    :cond_1
    const/4 v9, 0x5

    invoke-static {v9}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_2

    const/4 v10, 0x6

    invoke-static {v10}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_2
    const/4 v10, 0x7

    invoke-static {v10}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {p1, v10}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    iput v1, v12, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v8}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x8

    invoke-static {v13}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v8, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_4
    if-eqz v6, :cond_5

    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v10, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    :cond_6
    :goto_1
    invoke-static {v9}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {v2, v3}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟۟(J)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/16 v3, 0xa

    invoke-static {v3}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v6, :cond_7

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_2

    :cond_7
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v6, LYue/ۥۡۡ;

    invoke-direct {v6, p0, v0, v3, v1}, LYue/ۥۡۡ;-><init>(LYue/ۥۡ۠ۨۧ$ۥ۟۟;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    const/16 v0, 0xb

    invoke-static {v0}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v0, 0xc

    invoke-static {v0}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    sget-object v0, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟ۥ:Ljava/util/HashMap;

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    const/16 v0, 0xd

    invoke-static {v0}, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-static {v0}, LYue/ۥۡ۠ۨۧ;->ۥ۟۟۠ۢ(LYue/ۥۡ۠ۨۧ;)LYue/ۥۢۥ۠ۨ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۠ۨ;->ۥ(Landroid/view/View;)V

    goto :goto_3

    :cond_9
    if-ne v0, v4, :cond_a

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟;->ۥۣ۟۟ۡ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_3

    :cond_a
    sget v0, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟ۢۥ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_3

    :cond_b
    invoke-virtual {p1, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :catchall_0
    :cond_c
    :goto_3
    return-void
.end method

.method public final synthetic ۥ۟۟۟۠(Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    iget-object p4, p0, LYue/ۥۡ۠ۨۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۨۧ;

    invoke-static {p4, p1, p2, p3}, LYue/ۥۡ۠ۨۧ;->ۥۣ۟۟۠(LYue/ۥۡ۠ۨۧ;Ljava/lang/Object;Landroid/widget/TextView;Ljava/lang/String;)V

    return-void
.end method
