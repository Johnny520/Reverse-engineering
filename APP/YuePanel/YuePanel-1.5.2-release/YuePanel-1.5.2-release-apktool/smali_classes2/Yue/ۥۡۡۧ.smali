.class public abstract LYue/ۥۡۡۧ;
.super LYue/ۥۡۡۧۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۣۥ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۡۧۤ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۡۡۧۤ;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 3
    invoke-direct/range {p0 .. p5}, LYue/ۥۡۡۧۤ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()LYue/ۥ۠ۦۢۡ;
    .locals 1

    invoke-static {p0}, LYue/ۥۡۦۣ;->ۥ۟۟۟ۤ(LYue/ۥۡۡۧ;)LYue/ۥ۠ۦۣۥ;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, LYue/ۥ۠ۦۤ۠;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۡۧ;->ۥ()LYue/ۥ۠ۦۤ۠$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۦۤ۠$ۥ;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۥ;

    invoke-interface {v0}, LYue/ۥ۠ۦۤ۠;->ۥ()LYue/ۥ۠ۦۤ۠$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟()LYue/ۥ۠ۦۣۤ$ۥ;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۡۧ;->ۥ۟()LYue/ۥ۠ۦۣۥ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥ۠ۦۣۥ$ۥ;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۥ;

    invoke-interface {v0}, LYue/ۥ۠ۦۣۥ;->ۥ۟()LYue/ۥ۠ۦۣۥ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣۣ۟۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۥ;

    invoke-interface {v0}, LYue/ۥ۠ۦۤ۠;->ۥۣۣ۟۟()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
