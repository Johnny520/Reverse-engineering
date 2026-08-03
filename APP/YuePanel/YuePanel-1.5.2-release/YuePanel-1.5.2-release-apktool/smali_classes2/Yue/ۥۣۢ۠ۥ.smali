.class public final LYue/ۥۣۢ۠ۥ;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣۢ۠ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢ۠ۥ;

    invoke-direct {v0}, LYue/ۥۣۢ۠ۥ;-><init>()V

    sput-object v0, LYue/ۥۣۢ۠ۥ;->ۥۣ۟۟۠:LYue/ۥۣۢ۠ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object p1, LYue/ۥ۟ۨۦۥ;->ۥ۟۟ۡ:LYue/ۥ۟ۨۦۥ;

    sget-object v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟ۤ:LYue/ۥۢ۠ۨۨ;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, LYue/ۥۡۧۤۦ;->ۥ۟۟ۧۡ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V

    return-void
.end method

.method public dispatchYield(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    sget-object p1, LYue/ۥ۟ۨۦۥ;->ۥ۟۟ۡ:LYue/ۥ۟ۨۦۥ;

    sget-object v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟ۤ:LYue/ۥۢ۠ۨۨ;

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, LYue/ۥۡۧۤۦ;->ۥ۟۟ۧۡ(Ljava/lang/Runnable;LYue/ۥۢ۠ۨۨ;Z)V

    return-void
.end method
