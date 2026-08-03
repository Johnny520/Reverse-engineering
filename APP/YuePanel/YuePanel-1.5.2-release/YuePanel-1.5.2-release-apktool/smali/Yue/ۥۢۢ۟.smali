.class public final LYue/ۥۢۢ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String; = "Trace"

.field public static ۥ۟:J

.field public static ۥ۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟۠:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;I)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢ۟۠;->ۥ(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۢ۟;->ۥ۟(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟(Ljava/lang/String;I)V
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "asyncTraceBegin"

    :try_start_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    const-class v1, Landroid/os/Trace;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    sget-wide v2, LYue/ۥۢۢ۟;->ۥ۟:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v1, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {v0, p0}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method public static ۥ۟۟(Ljava/lang/String;)V
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۢۢ۟۟;->ۥ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;I)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢ۟۠;->ۥ۟(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۢ۟;->ۥ۟۟۟۟(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;I)V
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "asyncTraceEnd"

    :try_start_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    const-class v1, Landroid/os/Trace;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    sget-wide v2, LYue/ۥۢۢ۟;->ۥ۟:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v1, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {v0, p0}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method public static ۥ۟۟۟۠()V
    .locals 0

    invoke-static {}, LYue/ۥۢۢ۟۟;->ۥ۟()V

    return-void
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Exception;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to call "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " via reflection"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Trace"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static ۥ۟۟۟ۢ()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟;->ۥ۟۟:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥۢۢ;->ۥ()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    invoke-static {}, LYue/ۥۢۢ۟;->ۥۣ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public static ۥۣ۟۟۟()Z
    .locals 6

    const-string v0, "isTagEnabled"

    const-class v1, Landroid/os/Trace;

    :try_start_0
    sget-object v2, LYue/ۥۢۢ۟;->ۥ۟۟:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "TRACE_TAG_APP"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v4

    sput-wide v4, LYue/ۥۢۢ۟;->ۥ۟:J

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥۢۢ۟;->ۥ۟۟:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟:Ljava/lang/reflect/Method;

    sget-wide v4, LYue/ۥۢۢ۟;->ۥ۟:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :goto_1
    invoke-static {v0, v1}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/lang/String;I)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢ۟۠;->ۥ۟۟(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۥ(Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟۟۟ۥ(Ljava/lang/String;I)V
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "traceCounter"

    :try_start_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    const-class v1, Landroid/os/Trace;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYue/ۥۢۢ۟;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    sget-wide v2, LYue/ۥۢۢ۟;->ۥ۟:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v1, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {v0, p0}, LYue/ۥۢۢ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method
