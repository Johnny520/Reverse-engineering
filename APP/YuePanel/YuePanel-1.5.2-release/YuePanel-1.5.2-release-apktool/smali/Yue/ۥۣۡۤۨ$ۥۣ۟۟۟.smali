.class public LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۨ;->ۥ۟۟۠(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۨ;Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;

    iput-object p2, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    iput-object p3, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_a

    const/4 v0, 0x1

    if-eq p0, v0, :cond_8

    const/4 v0, 0x2

    if-eq p0, v0, :cond_6

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x5b6f7795e93c7f5aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x744e2dbc9d4dfa0bL    # 1.728567446926605E252

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x420e7f5d3b4c18feL    # -2.5469465833485136E-10

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x32f8d59978c5024dL    # 3.773063546475785E-63

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :cond_a
    sget-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, 0x31c9c3c169393879L    # 7.466130649695785E-69

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_b
    return-object p0
.end method

.method public static synthetic ۥ(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۟(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    const/4 p3, 0x1

    :try_start_0
    invoke-static {p3}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p2, 0x5

    invoke-static {p2}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :goto_0
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

    iget-object v0, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۨ;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۣۡۤۨ;->ۥ۟۟(LYue/ۥۣۡۤۨ;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    iget-object v3, p0, LYue/ۥۣۡۤۨ$ۥۣ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    new-instance v4, LYue/ۥۡۥ۟ۡ;

    invoke-direct {v4, v2, v3, p1}, LYue/ۥۡۥ۟ۡ;-><init>(Ljava/lang/Class;LYue/ۥ۟ۤۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-virtual {v0, v1, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void
.end method
