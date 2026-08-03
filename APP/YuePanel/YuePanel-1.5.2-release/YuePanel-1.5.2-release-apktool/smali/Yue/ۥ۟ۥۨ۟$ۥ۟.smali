.class public LYue/ۥ۟ۥۨ۟$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۨ۟;->ۥ۟۟۟۠(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۨ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۨ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۥۨ۟;

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
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x68fbc671948fe551L    # 5.190556323774766E197

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x31714c6c0736ae81L    # 1.566498762594607E-70

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x3b48626599a4df4bL    # -1.1152169360569974E23

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x6a5d8999d71aa6baL    # 2.315212539960106E204

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x5ba6462cd0759783L    # 3.1620495935782634E133

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_9
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v0}, LYue/ۥ۟ۥۨ۟$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v0

    invoke-static {v1}, LYue/ۥ۟ۥۨ۟$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, LYue/ۥ۟ۦۡ;->ۥ۟۟۟ۥ(Ljava/lang/Object;)LYue/ۥۡۡۨۡ;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥ۟ۥۨ۟$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ()LYue/ۥ۟ۦۡ$ۥ۟;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const/16 v0, 0x8

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LYue/ۥ۟ۦۡ$ۥ۟;->ۥ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, LYue/ۥ۟ۦۡ$ۥ۟;->ۥ۟۟()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, LYue/ۥ۟ۦۡ$ۥ۟;->ۥ۟()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    :cond_4
    :goto_0
    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x7

    goto :goto_1

    :cond_5
    const/16 v0, 0x3e7

    :goto_1
    new-instance v2, Lcom/yuexin/panel/utils/entity/comment/CommentBean;

    invoke-direct {v2}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;-><init>()V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setCid(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setContent_type(I)V

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setSend_name(Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setAweme_id(Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setText(Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۟ۨ()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setStatus(I)V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setTime(J)V

    invoke-virtual {p1}, LYue/ۥۡۡۨۡ;->ۥ۟۟۠۟()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/yuexin/panel/utils/entity/comment/CommentBean;->setSend_uid(Ljava/lang/String;)V

    invoke-static {v2}, LYue/ۥ۟ۥۨۥ;->ۥ۟۟۟۟(Lcom/yuexin/panel/utils/entity/comment/CommentBean;)V

    goto :goto_3

    :cond_6
    const/4 p1, 0x3

    invoke-static {p1}, LYue/ۥ۟ۥۨ۟$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x4

    invoke-static {v2}, LYue/ۥ۟ۥۨ۟$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :goto_3
    return-void
.end method
