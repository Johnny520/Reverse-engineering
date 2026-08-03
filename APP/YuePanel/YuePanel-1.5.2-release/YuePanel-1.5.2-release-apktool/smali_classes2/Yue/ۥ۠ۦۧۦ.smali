.class public final LYue/ۥ۠ۦۧۦ;
.super Ljava/util/Random;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۦۧۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۥ:LYue/ۥ۠ۦۧۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۦ:J


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۦۧۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۦۧۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۦۧۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦۧۦ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۨۤ;)V
    .locals 1
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "impl"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    return-void
.end method


# virtual methods
.method public next(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۨۤ;->ۥ۟(I)I

    move-result p1

    return p1
.end method

.method public nextBoolean()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۤ;->ۥ۟۟()Z

    move-result v0

    return v0
.end method

.method public nextBytes([B)V
    .locals 1
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟۟([B)[B

    return-void
.end method

.method public nextDouble()D
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۢ()D

    move-result-wide v0

    return-wide v0
.end method

.method public nextFloat()F
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۥ()F

    move-result v0

    return v0
.end method

.method public nextInt()I
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۦ()I

    move-result v0

    return v0
.end method

.method public nextInt(I)I
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۧ(I)I

    move-result p1

    return p1
.end method

.method public nextLong()J
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۠()J

    move-result-wide v0

    return-wide v0
.end method

.method public setSeed(J)V
    .locals 0

    iget-boolean p1, p0, LYue/ۥ۠ۦۧۦ;->ۥ۟۟۠ۤ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠ۦۧۦ;->ۥ۟۟۠ۤ:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Setting seed is not supported."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ()LYue/ۥۡۥۨۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۧۦ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ;

    return-object v0
.end method
