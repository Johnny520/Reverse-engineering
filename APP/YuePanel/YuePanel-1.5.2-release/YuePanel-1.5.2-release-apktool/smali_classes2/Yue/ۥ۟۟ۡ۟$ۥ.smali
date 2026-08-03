.class public final LYue/ۥ۟۟ۡ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۡۦ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:D

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:J


# direct methods
.method public constructor <init>(DLYue/ۥ۟۟ۡ۟;J)V
    .locals 1

    const-string v0, "timeSource"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    iput-object p3, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    iput-wide p4, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    return-void
.end method

.method public synthetic constructor <init>(DLYue/ۥ۟۟ۡ۟;JLYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LYue/ۥ۟۟ۡ۟$ۥ;-><init>(DLYue/ۥ۟۟ۡ۟;J)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYue/ۥ۟ۦۡۦ;

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۦۡۦ;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۟۟ۡ۟$ۥ;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    move-object v1, p1

    check-cast v1, LYue/ۥ۟۟ۡ۟$ۥ;

    iget-object v1, v1, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۦۡۦ;

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۦۡۦ;)J

    move-result-wide v0

    sget-object p1, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۡ(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    iget-object v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {v2}, LYue/ۥ۟۟ۡ۟;->ۥ۟()LYue/ۥۣ۠۠;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥ۠۠ۢۨ;->ۥۣ۟۟ۤ(DLYue/ۥۣ۠۠;)J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ۟(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۢ(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DoubleTimeMark("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {v1}, LYue/ۥ۟۟ۡ۟;->ۥ۟()LYue/ۥۣ۠۠;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۢ(LYue/ۥۣ۠۠;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v1, v2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۡ(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Z
    .locals 1

    invoke-static {p0}, LYue/ۥ۟ۦۡۦ$ۥ;->ۥ۟۟(LYue/ۥ۟ۦۡۦ;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟(J)LYue/ۥ۟ۦۡۦ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۦۡۦ$ۥ;->ۥ۟۟۟(LYue/ۥ۟ۦۡۦ;J)LYue/ۥ۟ۦۡۦ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(J)LYue/ۥۣۢۡۦ;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟(J)LYue/ۥ۟ۦۡۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(J)LYue/ۥ۟ۦۡۦ;
    .locals 8
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    new-instance v7, LYue/ۥ۟۟ۡ۟$ۥ;

    iget-wide v1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    iget-object v3, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    iget-wide v4, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v4, v5, p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ۟(JJ)J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LYue/ۥ۟۟ۡ۟$ۥ;-><init>(DLYue/ۥ۟۟ۡ۟;JLYue/ۥ۟ۨۥۢ;)V

    return-object v7
.end method

.method public bridge synthetic ۥ۟۟(J)LYue/ۥۣۢۡۦ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟(J)LYue/ۥ۟ۦۡۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟()J
    .locals 4

    iget-object v0, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۡ۟;->ۥ۟۟()D

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    sub-double/2addr v0, v2

    iget-object v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {v2}, LYue/ۥ۟۟ۡ۟;->ۥ۟()LYue/ۥۣ۠۠;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥ۠۠ۢۨ;->ۥۣ۟۟ۤ(DLYue/ۥۣ۠۠;)J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    invoke-static {p0}, LYue/ۥ۟ۦۡۦ$ۥ;->ۥ۟(LYue/ۥ۟ۦۡۦ;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۦۡۦ;)J
    .locals 6
    .param p1    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟۟ۡ۟$ۥ;

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    move-object v1, p1

    check-cast v1, LYue/ۥ۟۟ۡ۟$ۥ;

    iget-object v2, v1, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    iget-wide v4, v1, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v2, v3, v4, v5}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۡ(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۦ(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v2, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    iget-wide v4, v1, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۥ:J

    invoke-static {v2, v3, v4, v5}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ(JJ)J

    move-result-wide v2

    iget-wide v4, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    iget-wide v0, v1, LYue/ۥ۟۟ۡ۟$ۥ;->ۥۣ۟۟۠:D

    sub-double/2addr v4, v0

    iget-object p1, p0, LYue/ۥ۟۟ۡ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡ۟;

    invoke-virtual {p1}, LYue/ۥ۟۟ۡ۟;->ۥ۟()LYue/ۥۣ۠۠;

    move-result-object p1

    invoke-static {v4, v5, p1}, LYue/ۥ۠۠ۢۨ;->ۥۣ۟۟ۤ(DLYue/ۥۣ۠۠;)J

    move-result-wide v0

    invoke-static {v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۥ(J)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۡ(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۤ۟(JJ)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Subtracting or comparing time marks from different time sources is not possible: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۟ۦۡۦ;)I
    .locals 0
    .param p1    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۟ۦۡۦ$ۥ;->ۥ(LYue/ۥ۟ۦۡۦ;LYue/ۥ۟ۦۡۦ;)I

    move-result p1

    return p1
.end method
