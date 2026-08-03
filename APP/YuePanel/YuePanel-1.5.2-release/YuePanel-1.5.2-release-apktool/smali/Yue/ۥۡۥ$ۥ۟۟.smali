.class public LYue/ۥۡۥ$ۥ۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۥ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
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

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۥ;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۥ;

    iput-object p2, p0, LYue/ۥۡۥ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, 0x49156ac992a9fa65L    # 1.1940453579588123E44

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x13cf064f4abbb4bcL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x1b177d59cff57cc5L    # -1.2415291987637095E178

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x2fae863f37329f44L    # 5.148708623537633E-79

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x67f0cb33ead021beL    # 4.788783565900188E192

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x3cb5af772104f488L    # -1.4813796362491632E16

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0xcf10d8e18708fd2L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

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

.method public static synthetic ۥ(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۡۥ$ۥ۟۟;->ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p2, 0x2

    invoke-static {p2}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p3, p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    return p2
.end method

.method public static synthetic ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p0, 0x7

    invoke-static {p0}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_1
    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۡۥ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    new-instance v4, LYue/ۥۡۥ۟۠;

    invoke-direct {v4, v0, v3}, LYue/ۥۡۥ۟۠;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;)V

    invoke-virtual {v1, v2, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, LYue/ۥۡۥ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۡۥ۟ۢ;

    invoke-direct {v2}, LYue/ۥۡۥ۟ۢ;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setCancelButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
