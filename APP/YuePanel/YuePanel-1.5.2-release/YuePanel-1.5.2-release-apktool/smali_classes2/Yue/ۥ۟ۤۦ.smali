.class public final LYue/ۥ۟ۤۦ;
.super LYue/ۥ۠ۦۣ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۤۥۨ;


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۦ۟;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۤۦ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠ۦۣ۟;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۦ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦ۟;

    return-void
.end method


# virtual methods
.method public getParent()LYue/ۥ۠ۦ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۦ;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۤۡ(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۤۦ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦ۟;

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۦ۟;->ۥ۟۟۠ۡ(LYue/ۥۣۡۧ۠;)V

    return-void
.end method
