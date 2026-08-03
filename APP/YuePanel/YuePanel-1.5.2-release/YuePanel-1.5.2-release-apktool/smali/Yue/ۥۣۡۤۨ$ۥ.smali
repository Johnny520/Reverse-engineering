.class public LYue/ۥۣۡۤۨ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۨ;->ۥ۟۟۟ۧ(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۨ;

    iput-object p2, p0, LYue/ۥۣۡۤۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_8

    const/4 v0, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x1b177d59cff57cc5L    # -1.2415291987637095E178

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x5b843039dd1b2c6cL    # 7.16489184295969E132

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x67f0cb33ead021beL    # 4.788783565900188E192

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x28abc3e4cb844767L    # 9.019710436811505E-113

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_9
    return-object p0
.end method

.method public static synthetic ۥ(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p3, 0x1

    invoke-static {p3}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۨ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۨ;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LYue/ۥۣۡۤۨ;->ۥ۟۟(LYue/ۥۣۡۤۨ;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v1, v2, v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_1
    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, LYue/ۥۣۡۤۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LYue/ۥۣۡۤۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    new-instance v5, LYue/ۥۡۤۨۢ;

    invoke-direct {v5, v0, v4, v1}, LYue/ۥۡۤۨۢ;-><init>(Ljava/lang/Object;LYue/ۥ۟ۤۧ۠;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void
.end method
