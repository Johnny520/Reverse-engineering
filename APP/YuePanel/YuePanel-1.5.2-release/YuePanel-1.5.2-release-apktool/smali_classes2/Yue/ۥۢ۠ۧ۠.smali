.class public final synthetic LYue/ۥۢ۠ۧ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, LYue/ۥۢ۠ۧ۠;->ۥ:I

    return-void
.end method

.method public static final ۥ()I
    .locals 1

    sget v0, LYue/ۥۢ۠ۧ۠;->ۥ:I

    return v0
.end method

.method public static final ۥ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
