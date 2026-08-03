.class public abstract LYue/ۥۡۡۧۢ;
.super LYue/ۥۡۡۧۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۣۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۡۧۤ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 2
    sget-object v1, LYue/ۥۣ۟ۦۦ;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۡۧۤ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()LYue/ۥ۠ۦۢۡ;
    .locals 1

    invoke-static {p0}, LYue/ۥۡۦۣ;->ۥ۟۟۟ۦ(LYue/ۥۡۡۧۢ;)LYue/ۥ۠ۦۣۧ;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1, p2}, LYue/ۥ۠ۦۤۢ;->ۥ۟۟ۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ()LYue/ۥ۠ۦۤ۟$ۥ۟۟;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۡۧۢ;->ۥ()LYue/ۥ۠ۦۤۢ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥ۠ۦۤۢ$ۥ;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۧ;

    invoke-interface {v0}, LYue/ۥ۠ۦۤۢ;->ۥ()LYue/ۥ۠ۦۤۢ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟()LYue/ۥ۠ۦۣۤ$ۥ;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۡۧۢ;->ۥ۟()LYue/ۥ۠ۦۣۧ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥ۠ۦۣۧ$ۥ;
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۧ;

    invoke-interface {v0}, LYue/ۥ۠ۦۣۧ;->ۥ۟()LYue/ۥ۠ۦۣۧ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۥۣۤ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۦۤ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦۣۧ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۦۤۢ;->ۥۣ۟۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
