.class public final LYue/ۥۣۢ۟ۧ;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣۢ۟ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۧ;-><init>()V

    sput-object v0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:LYue/ۥۣۢ۟ۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object p2, LYue/ۥۢۦۣۤ;->ۥ۟۟۠ۤ:LYue/ۥۢۦۣۤ$ۥ;

    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    check-cast p1, LYue/ۥۢۦۣۤ;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, LYue/ۥۢۦۣۤ;->ۥۣ۟۟۠:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 1
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "limitedParallelism is not supported for Dispatchers.Unconfined"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
