.class public final LYue/ۥۣۢۡۧ$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۡۦ;


# annotations
.annotation runtime LYue/ۥ۠ۦۡ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.9"
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥۡ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۧ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    return-void
.end method

.method public static final synthetic ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;
    .locals 1

    new-instance v0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;-><init>(J)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(JJ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۡ(JJ)J

    move-result-wide p0

    sget-object p2, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p2}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۟ۥ(JJ)I

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟۟(JLYue/ۥ۟ۦۡۦ;)I
    .locals 1
    .param p2    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object p0

    invoke-virtual {p0, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۦۡۦ;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۤ(J)J
    .locals 0

    return-wide p0
.end method

.method public static ۥ۟۟۟ۥ(J)J
    .locals 1

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۡۤۨ;->ۥ۟۟۟(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۥ۟۟۟ۦ(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    invoke-virtual {p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۨ()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۠(J)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۧ(J)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۟(J)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۧ(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۥ۟۟۠۠(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۡ(JJ)J
    .locals 1

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥۡۡۤۨ;->ۥ۟۟(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۥۣ۟۟۠(JJ)J
    .locals 1

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-static {p2, p3}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۥ(J)J

    move-result-wide p2

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥۡۡۤۨ;->ۥ۟(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۥ۟۟۠ۤ(JLYue/ۥ۟ۦۡۦ;)J
    .locals 3
    .param p2    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    if-eqz v0, :cond_0

    check-cast p2, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    invoke-virtual {p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۨ()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۡ(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Subtracting or comparing time marks from different time sources is not possible: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۧ(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۥ۟۟۠ۦ(JJ)J
    .locals 1

    sget-object v0, LYue/ۥۡۡۤۨ;->ۥ۟:LYue/ۥۡۡۤۨ;

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥۡۡۤۨ;->ۥ۟(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۥ۟۟۠ۧ(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ValueTimeMark(reading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYue/ۥ۟ۦۡۦ;

    invoke-virtual {p0, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۦۡۦ;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۦ(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠۠(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۧ(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Z
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠۟(J)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic ۥ۟(J)LYue/ۥ۟ۦۡۦ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۢ(J)J

    move-result-wide p1

    invoke-static {p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(J)LYue/ۥۣۢۡۦ;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۢ(J)J

    move-result-wide p1

    invoke-static {p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟(J)LYue/ۥ۟ۦۡۦ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۥ(J)J

    move-result-wide p1

    invoke-static {p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟(J)LYue/ۥۣۢۡۦ;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۥ(J)J

    move-result-wide p1

    invoke-static {p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟۠(J)LYue/ۥۣۢۡۧ$ۥ۟$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠(J)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۦۡۦ;)J
    .locals 2
    .param p1    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1, p1}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۤ(JLYue/ۥ۟ۦۡۦ;)J

    move-result-wide v0

    return-wide v0
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

.method public ۥ۟۟۠ۢ(J)J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public ۥ۟۟۠ۥ(J)J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    invoke-static {v0, v1, p1, p2}, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥ۟۟۠ۦ(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final synthetic ۥ۟۟۠ۨ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۡۧ$ۥ۟$ۥ;->ۥۣ۟۟۠:J

    return-wide v0
.end method
