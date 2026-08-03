.class public LYue/ۥ۠ۡۡ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۦ(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
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

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۡ;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۡ;

    iput-object p2, p0, LYue/ۥ۠ۡۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x217bd0a5da6bb0e9L    # -2.01639675490815E147

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۥ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x321c53a14e435219L    # 2.6267373995207428E-67

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۤ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, 0x6b181c1647c219f8L    # 7.740501543721327E207

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x79469b2f16abb9ecL    # 1.5653568645163988E276

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, 0x739c50091e9b1f4bL    # 7.918388206948002E248

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x30272e131bb6cc0eL    # -4.49056574770077E76

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x7feb71fca79704f7L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0xcf10d8e18708fd2L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, -0xe85011dee8574d2L    # -4.394709407432049E238

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, -0x72cd4efaf558d963L    # -4.277276271117325E-245

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, 0x57810f7a8c4eb97cL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_a
    return-object p0

    :pswitch_b
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_b

    const-wide v0, -0x51c808eb282c62d6L    # -4.818830095906309E-86

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_b
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static synthetic ۥ(LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۡۡ$ۥ;->ۥ۟۟۟(LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۟ۤۧ۠;Lcom/kongzue/dialogx/dialogs/MessageDialog;Landroid/view/View;)Z
    .locals 1

    :try_start_0
    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ()Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p2}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0}, Lde/robv/android/xposed/XposedHelpers;->setAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥ۟ۤۧ۠;->ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v0

    filled-new-array {p2, v0}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p0, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p0, 0xa

    invoke-static {p0}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

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

    const/16 p2, 0xb

    invoke-static {p2}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

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
    .locals 5

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-static {v3}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LYue/ۥۢۤۤۢ;->ۥ۟۟۟ۧ()LYue/ۥۡۡۨ۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡۨ۟;->ۥ۟۟۟ۥ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠;->ۥ۟۟ۡۧ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠;->ۥ۟۟ۡۧ(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v1}, LYue/ۥ۠ۡۡ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-static {v0}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-static {v0}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lde/robv/android/xposed/XposedHelpers;->getAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->removeAdditionalInstanceField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 v0, 0x7

    invoke-static {v0}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->show(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, LYue/ۥ۠ۡۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    new-instance v4, LYue/ۥ۠ۡ۠ۨ;

    invoke-direct {v4, v3}, LYue/ۥ۠ۡ۠ۨ;-><init>(LYue/ۥ۟ۤۧ۠;)V

    invoke-virtual {v0, v1, v4}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->setOkButton(Ljava/lang/CharSequence;Lcom/kongzue/dialogx/interfaces/OnDialogButtonClickListener;)Lcom/kongzue/dialogx/dialogs/MessageDialog;

    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
