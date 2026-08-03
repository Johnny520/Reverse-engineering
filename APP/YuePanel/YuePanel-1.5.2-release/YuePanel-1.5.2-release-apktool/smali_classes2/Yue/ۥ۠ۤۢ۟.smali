.class public final LYue/ۥ۠ۤۢ۟;
.super LYue/ۥ۠ۢۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۢ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;
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

    new-instance v0, LYue/ۥ۠ۤۢ۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۢ۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V
    .locals 2
    .param p1    # LYue/ۥۣۢ۟ۡ;
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

    const-string v0, "sink"

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
    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۤۢ۟;-><init>(LYue/ۥۣۢ۟ۡ;Ljavax/crypto/Mac;)V

    return-void

    :catch_0
    move-exception p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۡ;Ljava/lang/String;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "algorithm"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2

    const-string v0, "getInstance(...)"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۤۢ۟;-><init>(LYue/ۥۣۢ۟ۡ;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۡ;Ljava/security/MessageDigest;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/security/MessageDigest;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    .line 2
    iput-object p2, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢ۟ۡ;Ljavax/crypto/Mac;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljavax/crypto/Mac;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    .line 6
    iput-object p2, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    return-void
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
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

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
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

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
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

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟۟(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۟ۥۤ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۦ(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟۟۟۠(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۨ(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۢ۟$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۤۢ۟$ۥ;->ۥ۟۟۟ۡ(LYue/ۥۣۢ۟ۡ;)LYue/ۥ۠ۤۢ۟;

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

    invoke-virtual {p0}, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۟۟()LYue/ۥۣ۟ۥۤ;

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

    iget-object v0, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    :goto_0
    new-instance v1, LYue/ۥۣ۟ۥۤ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, LYue/ۥۣ۟ۥۤ;-><init>([B)V

    return-object v1
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
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

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    iget-object v0, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    const-wide/16 v1, 0x0

    :goto_0
    cmp-long v3, v1, p2

    if-gez v3, :cond_1

    sub-long v3, p2, v1

    iget v5, v0, LYue/ۥۡۧۨ;->ۥ۟۟:I

    iget v6, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v3, v3

    iget-object v4, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۤ:Ljava/security/MessageDigest;

    if-eqz v4, :cond_0

    iget-object v5, v0, LYue/ۥۡۧۨ;->ۥ:[B

    iget v6, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    invoke-virtual {v4, v5, v6, v3}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_1

    :cond_0
    iget-object v4, p0, LYue/ۥ۠ۤۢ۟;->ۥ۟۟۠ۥ:Ljavax/crypto/Mac;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v5, v0, LYue/ۥۡۧۨ;->ۥ:[B

    iget v6, v0, LYue/ۥۡۧۨ;->ۥ۟:I

    invoke-virtual {v4, v5, v6, v3}, Ljavax/crypto/Mac;->update([BII)V

    :goto_1
    int-to-long v3, v3

    add-long/2addr v1, v3

    iget-object v0, v0, LYue/ۥۡۧۨ;->ۥ۟۟۟۠:LYue/ۥۡۧۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۢۧ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    return-void
.end method
