.class public LYue/ۥۣ۠ۧۤ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۧۤ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۠ۧۤ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۧۤ;LYue/ۥ۟ۤۧ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۧۤ;

    iput-object p2, p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x48dea36647e2aae6L    # -3.892632379377761E-43

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x218ac57310940279L    # 4.187370401308449E-147

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, 0x5f7cc0e642e78e8L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x6d85203f2f05209bL    # 3.7287510954640666E219

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x20c0c1dc20f69a51L    # -6.39185467677193E150

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x5577a441c16f6334L    # -8.496494039021654E-104

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x35c021115fa0a95L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_7
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static synthetic ۥ(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣ۠ۧۤ$ۥ;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣ۠ۧۤ$ۥ;->ۥ۟۟۟ۡ(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p0, 0x2

    invoke-static {p0}, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟۠۠(I)V

    invoke-static {}, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟۠ۢ()V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۡ(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V
    .locals 5

    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LYue/ۥۣ۠ۧۤ;->ۥ۟()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, LYue/ۥۣ۠ۧۤ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v1, v3, v4, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x6

    invoke-static {p0}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method public static synthetic ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    new-instance p2, Ljava/lang/Thread;

    new-instance p3, LYue/ۥۣۣ۠ۧ;

    invoke-direct {p3, p0, p1}, LYue/ۥۣۣ۠ۧ;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v1, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ:Ljava/lang/Object;

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v0, v1, v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣ۠ۧۤ;->ۥ۟۟(J)J

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LYue/ۥۣ۠ۧۤ;->ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    sget-object v0, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ:Ljava/lang/Object;

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object p1

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۣ۠ۧۡ;

    invoke-direct {v2}, LYue/ۥۣ۠ۧۡ;-><init>()V

    invoke-virtual {p1, v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object p1

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥۣ۠ۧۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۣ۠ۧۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    new-instance v3, LYue/ۥۣ۠ۧۢ;

    invoke-direct {v3, v0, v2}, LYue/ۥۣ۠ۧۢ;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V

    invoke-virtual {p1, v1, v3}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setCancelButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    return-void
.end method
