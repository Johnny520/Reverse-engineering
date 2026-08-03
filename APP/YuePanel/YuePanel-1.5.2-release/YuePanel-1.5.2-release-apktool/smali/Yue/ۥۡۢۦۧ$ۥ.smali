.class public LYue/ۥۡۢۦۧ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۢۦۧ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/util/List;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۡۢۦۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۢۦۧ;Ljava/util/List;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢۦۧ;

    iput-object p2, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/List;

    iput-object p3, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p4, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    iput-object p5, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x74355995143392aaL    # 6.114386229665914E251

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x4bb14cda29c603e4L    # 4.24199765470045E56

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x509c11d204b3f44fL    # 2.080152887944267E80

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x71b714235362b84cL    # 6.011283782377877E239

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, LYue/ۥۡۢۦۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, LYue/ۥۡۢۦۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_0

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۢۦۧ;->ۥ()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, LYue/ۥۡۢۦۧ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LYue/ۥۡۢۦۧ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object v1, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {v3}, LYue/ۥۡۢۦۧ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    invoke-static {}, LYue/ۥۡۢۦۧ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {}, LYue/ۥۡۢۦۧ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_5

    return-void

    :cond_5
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iget-object v3, p0, LYue/ۥۡۢۦۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Class;

    invoke-static {v1, v3, v0}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    return-void

    :cond_6
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, LYue/ۥۣ۟ۤ;->ۥ(Ljava/lang/Object;)LYue/ۥۡۡۨ۟;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۤۤۢ;->ۥ۟۟ۡۥ(LYue/ۥۡۡۨ۟;)V

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥۡۢۦۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    sput-object p1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟۠:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥۡۢۦۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :cond_7
    :goto_1
    return-void
.end method
