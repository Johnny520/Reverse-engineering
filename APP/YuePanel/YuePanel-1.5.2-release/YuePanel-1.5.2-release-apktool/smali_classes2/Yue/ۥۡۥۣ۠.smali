.class public abstract LYue/ۥۡۥۣ۠;
.super LYue/ۥۡۥۣۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۤۡ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۥۣۤ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۡۥۣۤ;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 3
    invoke-direct/range {p0 .. p5}, LYue/ۥۡۥۣۤ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()LYue/ۥ۠ۦۢۡ;
    .locals 1

    invoke-static {p0}, LYue/ۥۡۦۣ;->ۥ۟۟۠ۤ(LYue/ۥۡۥۣ۠;)LYue/ۥ۠ۦۤۡ;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, LYue/ۥ۠ۦۤۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۥۣ۠;->ۥ()LYue/ۥ۠ۦۤۡ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۦۤۡ$ۥ;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۤۡ;

    invoke-interface {v0}, LYue/ۥ۠ۦۤۡ;->ۥ()LYue/ۥ۠ۦۤۡ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۤۡ;

    invoke-interface {v0, p1}, LYue/ۥ۠ۦۤۡ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
