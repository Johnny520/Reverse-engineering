.class public final LYue/ۥۢۢ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢ۟ۡ$ۥ;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "TraceCompat"

.field public static ۥ۟:J

.field public static ۥ۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟۠:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-class v0, Ljava/lang/String;

    const-class v1, Landroid/os/Trace;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_0

    :try_start_0
    const-string v2, "TRACE_TAG_APP"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v2

    sput-wide v2, LYue/ۥۢۢ۟ۡ;->ۥ۟:J

    const-string v2, "isTagEnabled"

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, LYue/ۥۢۢ۟ۡ;->ۥ۟۟:Ljava/lang/reflect/Method;

    const-string v2, "asyncTraceBegin"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v0, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    const-string v2, "asyncTraceEnd"

    filled-new-array {v3, v0, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    const-string v2, "traceCounter"

    filled-new-array {v3, v0, v4}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "TraceCompat"

    const-string v2, "Unable to initialize via reflection."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;I)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢ۟ۡ$ۥ;->ۥ(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟:Ljava/lang/reflect/Method;

    sget-wide v1, LYue/ۥۢۢ۟ۡ;->ۥ۟:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "TraceCompat"

    const-string p1, "Unable to invoke asyncTraceBegin() via reflection."

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static ۥ۟(Ljava/lang/String;)V
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟(Ljava/lang/String;I)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢ۟ۡ$ۥ;->ۥ۟(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟۟:Ljava/lang/reflect/Method;

    sget-wide v1, LYue/ۥۢۢ۟ۡ;->ۥ۟:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "TraceCompat"

    const-string p1, "Unable to invoke endAsyncSection() via reflection."

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۟()V
    .locals 0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public static ۥ۟۟۟۟()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {}, LYue/ۥۢۢ۟ۡ$ۥ;->ۥ۟۟()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟ۡ;->ۥ۟۟:Ljava/lang/reflect/Method;

    sget-wide v1, LYue/ۥۢۢ۟ۡ;->ۥ۟:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-string v0, "TraceCompat"

    const-string v1, "Unable to invoke isTagEnabled() via reflection."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0
.end method

.method public static ۥ۟۟۟۠(Ljava/lang/String;I)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, LYue/ۥۢۢ۟ۡ$ۥ;->ۥ۟۟۟(Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    :try_start_0
    sget-object v0, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟۠:Ljava/lang/reflect/Method;

    sget-wide v1, LYue/ۥۢۢ۟ۡ;->ۥ۟:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "TraceCompat"

    const-string p1, "Unable to invoke traceCounter() via reflection."

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
