.class public LYue/ۥۡۦۤۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:LYue/ۥ۟ۤۧ۠;

.field public static ۥ۟:Ljava/lang/Object;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x435

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ()Ljava/lang/Object;
.end method

.method public static native ۥ۟()LYue/ۥ۟ۤۧ۠;
.end method

.method public static ۥ۟۟(Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x3

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {}, LYue/ۥۡۦۤۥ;->ۥ()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, LYue/ۥۡۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LYue/ۥۡۦۤۥ;->ۥ۟()LYue/ۥ۟ۤۧ۠;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۟ۤۧ۠;->ۥ۟()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v5}, [Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v1, v4, v7, v6}, LYue/ۥۢۦۣۣ;->ۥ۟(Ljava/lang/Class;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    const-class v6, Ljava/lang/String;

    filled-new-array {v2, v6, v5}, [Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v4, v0, v2}, LYue/ۥۢۦۣۣ;->ۥ۟(Ljava/lang/Class;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/util/List;

    move-result-object v6

    move v2, v7

    goto :goto_0

    :cond_1
    move v2, v9

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v9}, LYue/ۥۡۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, LYue/ۥۡۦۤۥ;->ۥ()Ljava/lang/Object;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, LYue/ۥۡۦۢۨ;->ۥ۟۟۟(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v9, :cond_3

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {p0, v2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v3, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v7}, LYue/ۥۡۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {p0, v2, v4}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v3, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, LYue/ۥۡۦۤۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public static native ۥ۟۟۟(Ljava/lang/Object;)V
.end method

.method public static native ۥ۟۟۟۟(LYue/ۥ۟ۤۧ۠;)V
.end method
