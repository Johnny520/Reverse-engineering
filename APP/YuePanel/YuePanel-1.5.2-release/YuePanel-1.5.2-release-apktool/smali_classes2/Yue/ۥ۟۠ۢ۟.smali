.class public final LYue/ۥ۟۠ۢ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢۡۦ;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۢۡۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:J


# direct methods
.method public constructor <init>(LYue/ۥۣۢۡۦ;J)V
    .locals 1

    const-string v0, "mark"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۠ۢ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۡۦ;

    iput-wide p2, p0, LYue/ۥ۟۠ۢ۟;->ۥ۟۟۠ۤ:J

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣۢۡۦ;JLYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۟۠ۢ۟;-><init>(LYue/ۥۣۢۡۦ;J)V

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 1

    invoke-static {p0}, LYue/ۥۣۢۡۦ$ۥ;->ۥ۟(LYue/ۥۣۢۡۦ;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟(J)LYue/ۥۣۢۡۦ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥۣۢۡۦ$ۥ;->ۥ۟۟(LYue/ۥۣۢۡۦ;J)LYue/ۥۣۢۡۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(J)LYue/ۥۣۢۡۦ;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۢ۟;

    iget-object v1, p0, LYue/ۥ۟۠ۢ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۡۦ;

    iget-wide v2, p0, LYue/ۥ۟۠ۢ۟;->ۥ۟۟۠ۤ:J

    invoke-static {v2, v3, p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ۟(JJ)J

    move-result-wide p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, p2, v2}, LYue/ۥ۟۠ۢ۟;-><init>(LYue/ۥۣۢۡۦ;JLYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public ۥ۟۟۟()J
    .locals 4

    iget-object v0, p0, LYue/ۥ۟۠ۢ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۡۦ;

    invoke-interface {v0}, LYue/ۥۣۢۡۦ;->ۥ۟۟۟()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟۠ۢ۟;->ۥ۟۟۠ۤ:J

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    invoke-static {p0}, LYue/ۥۣۢۡۦ$ۥ;->ۥ(LYue/ۥۣۢۡۦ;)Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥ۟۠ۢ۟;->ۥ۟۟۠ۤ:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۣۢۡۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۢ۟;->ۥۣ۟۟۠:LYue/ۥۣۢۡۦ;

    return-object v0
.end method
