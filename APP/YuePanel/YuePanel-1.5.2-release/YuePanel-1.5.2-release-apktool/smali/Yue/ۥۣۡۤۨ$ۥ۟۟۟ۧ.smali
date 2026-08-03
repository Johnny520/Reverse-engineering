.class public LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۨ;->ۥ۟۟۠۠(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
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
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۨ;Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;

    iput-object p2, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p3, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, 0x27a5d30dce99e16eL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x5dff76747c09ca1cL    # -6.62180378266675E-145

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x1ec9f450b0e60bfaL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x5a53f83e370e5ec9L    # -3.235039584603958E-127

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x3d728d3d2531beb6L    # -4.047341574600161E12

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x3c740d2a048db153L    # 1.739183657380669E-17

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, 0x667e76f05846559dL    # 5.1778909065975897E185

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x773e895ab0388ac7L    # 2.461591660364728E266

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, -0x59df7bb1d7e7034aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_a
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static synthetic ۥ(Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠(Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p3, 0x2

    invoke-static {p3}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۠(Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 1

    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LYue/ۥۣۡۤۨ;->ۥ۟۟۟۟()[Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    aget-object p0, p0, p1

    if-eqz p0, :cond_0

    const/16 p2, 0xa

    :try_start_0
    invoke-static {p2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, LYue/ۥۣۡۤۨ;->ۥ۟۟۟۠()[Landroid/view/View;

    move-result-object v0

    aget-object v0, v0, p1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, p2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, LYue/ۥۢۤۤۢ;->ۥ۟۟۟ۧ()LYue/ۥۡۡۨ۟;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۡۨ۟;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۥ;->ۥ۟۟(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥۢۤۤۢ;->ۥ۟۟۟ۧ()LYue/ۥۡۡۨ۟;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۡۨ۟;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۥ;->ۥ۟۟(Ljava/lang/String;)V

    :goto_0
    return p1
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    iget-object v0, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LYue/ۥۣۡۤۨ;->ۥ۟۟(LYue/ۥۣۡۤۨ;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 v3, 0x3

    invoke-static {v3}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;

    iget-object v6, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v5, v4, v6}, LYue/ۥۣۡۤۨ;->ۥ۟۟۟(LYue/ۥۣۡۤۨ;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4, v5, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x5

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, LYue/ۥۡۢ۟ۤ;->ۥ۟۟۟ۢ()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v4}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x9

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {v4}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    new-instance v4, LYue/ۥۡۥ۟ۧ;

    invoke-direct {v4, v0, v3, p1}, LYue/ۥۡۥ۟ۧ;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-virtual {v1, v2, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LYue/ۥۡۥ۟ۨ;

    invoke-direct {v3, v0}, LYue/ۥۡۥ۟ۨ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setCancelButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_5
    :goto_1
    return-void
.end method
