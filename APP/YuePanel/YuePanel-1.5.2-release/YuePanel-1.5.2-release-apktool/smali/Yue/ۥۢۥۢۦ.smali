.class public final LYue/ۥۢۥۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SoonBlockedPrivateApi"
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "WeightTypeface"

.field public static final ۥ۟:Ljava/lang/String; = "native_instance"

.field public static final ۥ۟۟:Ljava/lang/String; = "nativeCreateFromTypeface"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "nativeCreateWeightAlias"

.field public static final ۥ۟۟۟۟:Ljava/lang/reflect/Field;

.field public static final ۥ۟۟۟۠:Ljava/lang/reflect/Method;

.field public static final ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

.field public static final ۥ۟۟۟ۢ:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:LYue/ۥۣ۠ۨۢ;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sWeightCacheLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e3\u06e2<",
            "Landroid/util/SparseArray<",
            "Landroid/graphics/Typeface;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-class v0, Landroid/graphics/Typeface;

    :try_start_0
    const-string v1, "native_instance"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "nativeCreateFromTypeface"

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v6, "nativeCreateWeightAlias"

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v6, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WeightTypeface"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v1, 0x0

    move-object v0, v1

    move-object v2, v0

    move-object v4, v2

    :goto_1
    sput-object v1, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۟:Ljava/lang/reflect/Field;

    sput-object v2, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    sput-object v4, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    sput-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۢ:Ljava/lang/reflect/Constructor;

    new-instance v0, LYue/ۥۣ۠ۨۢ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۨۢ;-><init>(I)V

    sput-object v0, LYue/ۥۢۥۢۦ;->ۥۣ۟۟۟:LYue/ۥۣ۠ۨۢ;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۤ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(J)Landroid/graphics/Typeface;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۢ:Ljava/lang/reflect/Constructor;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static ۥ۟(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;
    .locals 7
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {}, LYue/ۥۢۥۢۦ;->ۥ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    shl-int/lit8 v0, p1, 0x1

    or-int/2addr v0, p2

    sget-object v1, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۤ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, LYue/ۥۢۥۢۦ;->ۥ۟۟(Landroid/graphics/Typeface;)J

    move-result-wide v2

    sget-object v4, LYue/ۥۢۥۢۦ;->ۥۣ۟۟۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v4, v2, v3}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۤ(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/SparseArray;

    if-nez v5, :cond_1

    new-instance v5, Landroid/util/SparseArray;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Landroid/util/SparseArray;-><init>(I)V

    invoke-virtual {v4, v2, v3, v5}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠۠(JLjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Typeface;

    if-eqz v4, :cond_2

    monitor-exit v1

    return-object v4

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Typeface;->isItalic()Z

    move-result p0

    if-ne p2, p0, :cond_3

    invoke-static {v2, v3, p1}, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۠(JI)J

    move-result-wide p0

    invoke-static {p0, p1}, LYue/ۥۢۥۢۦ;->ۥ(J)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {v2, v3, p1, p2}, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۟(JIZ)J

    move-result-wide p0

    invoke-static {p0, p1}, LYue/ۥۢۥۢۦ;->ۥ(J)Landroid/graphics/Typeface;

    move-result-object p0

    :goto_1
    invoke-virtual {v5, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    monitor-exit v1

    return-object p0

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۥ۟۟(Landroid/graphics/Typeface;)J
    .locals 2
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    :try_start_0
    sget-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۟:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۥ۟۟۟()Z
    .locals 1

    sget-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۟:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static ۥ۟۟۟۟(JIZ)J
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    if-eqz p3, :cond_0

    const/4 p3, 0x2

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    :try_start_0
    sget-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    sget-object p3, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p0, p2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p3, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۥ۟۟۟۠(JI)J
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanUncheckedReflection"
        }
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥۢۥۢۦ;->ۥ۟۟۟ۡ:Ljava/lang/reflect/Method;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
