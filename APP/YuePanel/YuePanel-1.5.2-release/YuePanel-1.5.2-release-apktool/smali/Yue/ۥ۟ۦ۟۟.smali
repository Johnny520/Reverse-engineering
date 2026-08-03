.class public LYue/ۥ۟ۦ۟۟;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static ۥ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static ۥ۟:Ljava/lang/String;

.field public static ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x27e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ([Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/BottomMenu;Landroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟(Ljava/lang/String;)V
.end method

.method public static native synthetic ۥ۟۟()Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟۟۟۟()Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟۟۟۠(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟۟۟ۡ()Ljava/lang/Class;
.end method

.method public static native synthetic ۥ۟۟۟ۢ([Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/BottomMenu;Landroid/view/View;)Z
.end method

.method public static synthetic ۥۣ۟۟۟(Ljava/lang/String;)V
    .locals 6

    const/16 v0, 0x11

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v0}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kongzue/dialogx/dialogs/WaitDialog;->show(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/WaitDialog;

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    const/16 v0, 0x8

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x12

    invoke-static {v0}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kongzue/dialogx/dialogs/WaitDialog;->show(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/WaitDialog;

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥۡۨ۠ۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;Landroid/widget/ProgressBar;)LYue/ۥۡۨ۠ۥ$ۥ;

    move-result-object v2

    const/16 v3, 0x13

    invoke-static {v3}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kongzue/dialogx/dialogs/WaitDialog;->show(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/WaitDialog;

    invoke-virtual {v2}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ۟()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LYue/ۥۡۨ۠ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroid/widget/ProgressBar;)LYue/ۥۡۨ۠ۥ$ۥ;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_1

    :cond_0
    invoke-static {p0, v0}, LYue/ۥۡۨ۠ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Landroid/widget/ProgressBar;)LYue/ۥۡۨ۠ۥ$ۥ;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۡۨ۠ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۨ۠ۥ$ۥ;-><init>()V

    invoke-virtual {v0, v1}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ۟۟۟(Z)V

    invoke-virtual {v0, p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ۟۟(Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    sget-object v0, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;->ۥ۟۟:Ljava/lang/Object;

    sget-object v2, LYue/ۥ۟ۦ۟۟;->ۥ۟۟:Ljava/lang/String;

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LYue/ۥ۟ۦ۟۟;->ۥ۟:Ljava/lang/String;

    sget-object v3, LYue/ۥ۟ۦ۟۟;->ۥ:Ljava/lang/Class;

    invoke-static {v0, v2, v3}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۢۡ۟;->ۥ۟۟۟(Ljava/lang/String;)J

    move-result-wide v2

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ۟()Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x14

    invoke-static {v4}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v0, v4, v5}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v4, 0x15

    invoke-static {v4}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    invoke-virtual {p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v5, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4, v5}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v4, 0x7530

    cmp-long p0, v2, v4

    if-ltz p0, :cond_2

    const/16 p0, 0x16

    invoke-static {p0}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    goto :goto_2

    :cond_2
    const/16 p0, 0x17

    invoke-static {p0}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x18

    invoke-static {v2}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x19

    invoke-static {v2}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۨ۠ۥ$ۥ;->ۥ۟()Z

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x1a

    invoke-static {v2}, LYue/ۥ۟ۦ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_2
    invoke-static {}, Lcom/kongzue/dialogx/dialogs/WaitDialog;->dismiss()V

    return-void
.end method

.method public static native ۥ۟۟۟ۤ(Ljava/lang/String;)V
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            ">;"
        }
    .end annotation
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end method

.method public native onClick()V
.end method
