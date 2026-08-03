.class public LYue/ۥۣ۠ۡۧ;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ۟۟۟:C = '\u0001'

.field public static final ۥ۟۟۟۟:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# instance fields
.field public ۥ:Ljava/lang/Object;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟۟:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public final native ۥ()Z
.end method

.method public ۥ۟(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۡۧ;->ۥ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۠ۡۧ;->ۥ:Ljava/lang/Object;

    invoke-static {v1, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;I)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۡۧ;->ۥ()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object p2, p0, LYue/ۥۣ۠ۡۧ;->ۥ:Ljava/lang/Object;

    invoke-static {p2, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    :cond_2
    :goto_0
    return-object v0
.end method

.method public final native ۥ۟۟۟()V
.end method

.method public final native ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
.end method

.method public native ۥ۟۟۟۠(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e1\u06e7\u06e3;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۣ۠ۡۧ;
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠ۡۧ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-virtual {p0, p1, v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LYue/ۥۣ۠ۡۧ;->ۥ:Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/Throwable;

    const/4 p2, 0x0

    invoke-static {p2}, LYue/ۥۣ۠ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public native ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;
.end method

.method public native ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e1\u06e7\u06e3;"
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e1\u06e7\u06e3;"
        }
    .end annotation
.end method
