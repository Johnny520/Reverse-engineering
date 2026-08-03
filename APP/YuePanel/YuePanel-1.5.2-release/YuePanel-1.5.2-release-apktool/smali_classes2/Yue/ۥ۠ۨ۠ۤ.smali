.class public final LYue/ۥ۠ۨ۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1

.field public static final ۥ۟۟:I = 0x2

.field public static final ۥ۟۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "CONDITION_FALSE"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟:Ljava/lang/Object;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "LIST_EMPTY"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟۟:Ljava/lang/Object;

    return-void
.end method

.method public static final ۥ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ۥ۟()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۨ۠ۤ;->ۥ۟۟۟۟:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟۟()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/Object;)LYue/ۥ۠ۨ۠ۥ;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    instance-of v0, p0, LYue/ۥۡۦۤ۟;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥۡۦۤ۟;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LYue/ۥۡۦۤ۟;->ۥ:LYue/ۥ۠ۨ۠ۥ;

    if-nez v0, :cond_2

    :cond_1
    move-object v0, p0

    check-cast v0, LYue/ۥ۠ۨ۠ۥ;

    :cond_2
    return-object v0
.end method
