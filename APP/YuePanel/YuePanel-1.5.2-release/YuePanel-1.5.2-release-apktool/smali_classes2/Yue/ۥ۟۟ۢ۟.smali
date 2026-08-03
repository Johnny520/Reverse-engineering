.class public abstract LYue/ۥ۟۟ۢ۟;
.super LYue/ۥۡۥۨۤ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۥۨۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(I)I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-static {v0, p1}, LYue/ۥۡۥۨۥ;->ۥ۟۟۟ۤ(II)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟([B)[B
    .locals 1
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextBytes([B)V

    return-object p1
.end method

.method public ۥ۟۟۟ۢ()D
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟ۥ()F
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۧ(I)I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠()J
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract ۥ۟۟۠ۡ()Ljava/util/Random;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method
