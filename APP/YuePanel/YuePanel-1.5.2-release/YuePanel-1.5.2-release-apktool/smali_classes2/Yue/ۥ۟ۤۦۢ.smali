.class public final LYue/ۥ۟ۤۦۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:I

.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Z


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۟۠;Ljavax/crypto/Cipher;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljavax/crypto/Cipher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipher"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iput-object p2, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    invoke-virtual {p2}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۥ:I

    new-instance v0, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v0}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    if-lez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Block cipher required "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۨ:Z

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->ۥ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟()V
    .locals 7

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    iget-object v2, v0, LYue/ۥۡۧۨ;->ۥ:[B

    iget v3, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    invoke-virtual {v1, v2, v3}, Ljavax/crypto/Cipher;->doFinal([BI)I

    move-result v1

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    add-int/2addr v2, v1

    iput v2, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget-object v2, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    int-to-long v5, v1

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    iget v1, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v2

    iput-object v2, v1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟()Ljavax/crypto/Cipher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    return-object v0
.end method

.method public final ۥ۟۟۟()V
    .locals 4

    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-boolean v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۧ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۧ:Z

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۢ;->ۥ۟()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۟۟()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۥ۟۟۟۟()V
    .locals 9

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    iget-object v0, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v1, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v2, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v1, v2

    iget-object v2, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    invoke-virtual {v2, v1}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result v2

    :goto_0
    const/16 v3, 0x2000

    if-le v2, v3, :cond_1

    iget v2, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۥ:I

    if-gt v1, v2, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۧ:Z

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    iget-object v1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    iget-object v2, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۡ۟()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    const-string v2, "doFinal(...)"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۥ([B)LYue/ۥۣ۟ۢۨ;

    return-void

    :cond_0
    sub-int/2addr v1, v2

    iget-object v2, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    invoke-virtual {v2, v1}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result v2

    goto :goto_0

    :cond_1
    iget-object v3, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v3, v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۡ(I)LYue/ۥۡۧۨ;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۤ:Ljavax/crypto/Cipher;

    iget-object v4, v0, LYue/ۥۡۧۨ;->ۥ:[B

    iget v5, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    iget-object v7, v2, LYue/ۥۡۧۨ;->ۥ:[B

    iget v8, v2, LYue/ۥۡۧۨ;->ۥ۟:I

    move v6, v1

    invoke-virtual/range {v3 .. v8}, Ljavax/crypto/Cipher;->update([BII[BI)I

    move-result v0

    iget-object v3, p0, LYue/ۥ۟ۤۦۢ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    int-to-long v4, v1

    invoke-interface {v3, v4, v5}, LYue/ۥۣۣ۟۠;->skip(J)V

    iget v1, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    add-int/2addr v1, v0

    iput v1, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget-object v1, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    int-to-long v5, v0

    add-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    iget v0, v2, LYue/ۥۡۧۨ;->ۥ۟:I

    iget v1, v2, LYue/ۥۡۧۨ;->ۥ۟۟:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v2}, LYue/ۥۡۧۨ;->ۥ۟()LYue/ۥۡۧۨ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v2}, LYue/ۥۡۧۨۡ;->ۥ۟۟۟(LYue/ۥۡۧۨ;)V

    :cond_2
    return-void
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 4
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    iget-boolean v3, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۨ:Z

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۟()V

    iget-object v0, p0, LYue/ۥ۟ۤۦۢ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p1

    return-wide p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
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
