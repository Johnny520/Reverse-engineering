.class public LYue/ۥ۟ۦ۟۟$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۦ۟۟;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
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

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟ۦ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۦ۟۟;Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦ۟۟;

    iput-object p2, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p3, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x48dea36647e2aae6L    # -3.892632379377761E-43

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x74bc5cd726c6f630L    # 2.0794251159803066E254

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, 0x68716bd9f6bfb594L    # 1.2717379545797847E195

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x5f7cc0e642e78e8L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, 0x6d85203f2f05209bL    # 3.7287510954640666E219

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x5cf185abd8d9afd4L    # 5.216575342459793E139

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x52e91c4b6d62865dL    # 2.557552235105252E91

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, -0x6fe0629180ced7deL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x477eb59671b7a428L    # 2.5512310609999626E36

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, 0x23cad8605d96ab21L    # 2.8854858380119E-136

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

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

.method public static synthetic ۥ(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۟۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p0, 0x1

    invoke-static {p0}, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟۠۠(I)V

    invoke-static {}, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟۠ۢ()V

    return p0
.end method

.method public static synthetic ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p3, 0x3

    :try_start_0
    invoke-static {p3}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0x9

    invoke-static {p0}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

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

    const/16 p2, 0xa

    invoke-static {p2}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, LYue/ۥ۟ۦ۟ۡ;->ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/ClassLoader;)V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v1, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟:Ljava/lang/Object;

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v1, v1, v0

    sput-object v1, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟:Ljava/lang/Object;

    sget-object v2, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x1

    :try_start_1
    invoke-static {v3}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v4, 0x2

    :try_start_2
    invoke-static {v4}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :goto_0
    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    iget-object v5, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟ۡ()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v5, v6, v3}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟۠(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۦ۟۟;->ۥ۟۟۟ۡ()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v4, v0, v3}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x5

    invoke-static {v3}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/4 v3, 0x6

    invoke-static {v3}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LYue/ۥ۟ۦ;

    invoke-direct {v4}, LYue/ۥ۟ۦ;-><init>()V

    invoke-virtual {v0, v3, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setCancelButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/4 v3, 0x7

    invoke-static {v3}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LYue/ۥ۟ۦ۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    new-instance v5, LYue/ۥ۟ۦ۟;

    invoke-direct {v5, v2, v4, v1}, LYue/ۥ۟ۦ۟;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v5}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8

    invoke-static {v1}, LYue/ۥ۟ۦ۟۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :cond_3
    :goto_3
    return-void
.end method
