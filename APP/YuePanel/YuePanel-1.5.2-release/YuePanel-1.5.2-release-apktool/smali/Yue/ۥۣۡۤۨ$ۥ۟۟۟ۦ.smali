.class public LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۨ;->ۥ۟۟۠۟(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۡۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۨ;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۨ;

    iput-object p2, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x5dff76747c09ca1cL    # -6.62180378266675E-145

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1ec9f450b0e60bfaL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x552b08a3352e5d72L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x140cef49f818ef40L    # -1.0028595102231369E212

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x54f45e041eaec62dL    # 1.7819313248188246E101

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0xe60d6c6ad603f79L    # -2.029123085511073E239

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x1393d31400d0e0a9L    # -1.8970474622131015E214

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ:Ljava/lang/String;

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

.method public static synthetic ۥ(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p3, 0x3

    invoke-static {p3}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

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

.method public static synthetic ۥ۟۟۟۠(Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {}, LYue/ۥۢۤۤۢ;->ۥ۟۟۟ۧ()LYue/ۥۡۡۨ۟;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۡۨ۟;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۥ;->ۥ۟۟(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    iget-object v0, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۨ;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۣۡۤۨ;->ۥ۟۟(LYue/ۥۣۡۤۨ;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v0}, LYue/ۥۣ۠ۡۧ;-><init>()V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v3}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    new-instance v3, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v3}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v3, v0}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    new-instance v4, LYue/ۥۡۥ۟ۥ;

    invoke-direct {v4, v0, v3, p1}, LYue/ۥۡۥ۟ۥ;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-virtual {v1, v2, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ۟۟۟ۦ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LYue/ۥۡۥ۟ۦ;

    invoke-direct {v2}, LYue/ۥۡۥ۟ۦ;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setCancelButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
