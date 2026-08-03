.class public final LYue/ۥ۠ۤۢ۠;
.super LYue/ۥ۠ۢۧ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۢ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ۟۟۠ۤ:Ljava/security/MessageDigest;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljavax/crypto/Mac;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۢ۠$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۢ۠$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V
    .locals 2
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    :try_start_0
    invoke-static {p3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 9
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۥ۠()[B

    move-result-object p2

    invoke-direct {v1, p2, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 10
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    .line 12
    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۤۢ۠;-><init>(LYue/ۥۣۢ۟ۦ;Ljavax/crypto/Mac;)V

    return-void

    :catch_0
    move-exception p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۦ;Ljava/lang/String;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2

    const-string v0, "getInstance(...)"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۤۢ۠;-><init>(LYue/ۥۣۢ۟ۦ;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۦ;Ljava/security/MessageDigest;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/security/MessageDigest;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    .line 2
    iput-object p2, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۦ;Ljavax/crypto/Mac;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljavax/crypto/Mac;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    .line 6
    iput-object p2, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟۟(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۦ(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟۟۟۠(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۨ(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۠$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۠$ۥ;->ۥ۟۟۟ۡ(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤۢ۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ۟۟۟()LYue/ۥۣ۟ۥۤ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "hash"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_hash"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۟۟()LYue/ۥۣ۟ۥۤ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۣ۟ۥۤ;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "hash"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    :goto_0
    new-instance v1, LYue/ۥۣ۟ۥۤ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object v1
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 7
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

    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۢۧ۟;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide p2

    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    sub-long/2addr v0, p2

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v2

    iget-object v4, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    :goto_0
    cmp-long v5, v2, v0

    if-lez v5, :cond_0

    iget-object v4, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v5, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v6, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    sub-long/2addr v2, v5

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v5

    cmp-long v5, v2, v5

    if-gez v5, :cond_2

    iget v5, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    int-to-long v5, v5

    add-long/2addr v5, v0

    sub-long/2addr v5, v2

    long-to-int v0, v5

    iget-object v1, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    if-eqz v1, :cond_1

    iget-object v5, v4, LYue/ۥۡۧۨ;->ۥ:[B

    iget v6, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    sub-int/2addr v6, v0

    invoke-virtual {v1, v5, v0, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_2

    :cond_1
    iget-object v1, p0, LYue/ۥ۠ۤۢ۠;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v5, v4, LYue/ۥۡۧۨ;->ۥ:[B

    iget v6, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    sub-int/2addr v6, v0

    invoke-virtual {v1, v5, v0, v6}, Ljavax/crypto/Mac;->update([BII)V

    :goto_2
    iget v0, v4, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v1, v4, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v2, v0

    iget-object v4, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    move-wide v0, v2

    goto :goto_1

    :cond_2
    return-wide p2
.end method
