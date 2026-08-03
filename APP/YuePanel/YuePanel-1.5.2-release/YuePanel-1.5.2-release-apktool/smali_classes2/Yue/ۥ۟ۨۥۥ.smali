.class public final LYue/ۥ۟ۨۥۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Z

.field public static final ۥ۟:LYue/ۥ۟ۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۟(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, LYue/ۥ۟ۨۥۥ;->ۥ:Z

    invoke-static {}, LYue/ۥ۟ۨۥۥ;->ۥ۟()LYue/ۥ۟ۨۨ;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۨۥۥ;->ۥ۟:LYue/ۥ۟ۨۨ;

    return-void
.end method

.method public static final ۥ()LYue/ۥ۟ۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟ۨۥۥ;->ۥ۟:LYue/ۥ۟ۨۨ;

    return-object v0
.end method

.method public static final ۥ۟()LYue/ۥ۟ۨۨ;
    .locals 2

    sget-boolean v0, LYue/ۥ۟ۨۥۥ;->ۥ:Z

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    return-object v0

    :cond_0
    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۦۣ;->ۥ۟۟۟(LYue/ۥ۠ۨۥۥ;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, LYue/ۥ۟ۨۨ;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, LYue/ۥ۟ۨۨ;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, LYue/ۥ۟ۨۥۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۥۤ;

    :goto_1
    return-object v0
.end method
