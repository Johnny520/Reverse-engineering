.class public final LYue/ۥۡۤ۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:J


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟۠;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "upstream"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۤ۟ۦ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {p1}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    iget-object p1, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    iput-object p1, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    if-eqz p1, :cond_0

    iget p1, p1, LYue/ۥۡۧۨ;->ۥ۟:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۦ:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 8
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    iget-boolean v3, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۧ:Z

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_5

    iget-object v3, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    if-eqz v3, :cond_1

    iget-object v4, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    iget-object v4, v4, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    if-ne v3, v4, :cond_0

    iget v3, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۦ:I

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v4, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Peek source is invalid because upstream source was used"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    return-wide v0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-wide v1, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۨ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-interface {v0, v1, v2}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۤ(J)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_3
    iget-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    if-nez v0, :cond_4

    iget-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    iget-object v0, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    if-eqz v0, :cond_4

    iput-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v0, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    iput v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۦ:I

    :cond_4
    iget-object v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget-wide v2, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۨ:J

    sub-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v2, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    iget-wide v4, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۨ:J

    move-object v3, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡۡ(LYue/ۥۣ۟ۢۨ;JJ)LYue/ۥۣ۟ۢۨ;

    iget-wide v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۨ:J

    add-long/2addr v0, p2

    iput-wide v0, p0, LYue/ۥۡۤ۟ۦ;->ۥ۟۟۠ۨ:J

    return-wide p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
