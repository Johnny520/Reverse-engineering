.class public final synthetic LYue/ۥۣۡۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "okio.Okio"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LYue/ۥۣۡۡ۟;->ۥ:Ljava/util/logging/Logger;

    return-void
.end method

.method public static final synthetic ۥ()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, LYue/ۥۣۡۡ۟;->ۥ:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static final ۥ۟(Ljava/io/File;)LYue/ۥۣۢ۟ۡ;
    .locals 2
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-static {v0}, LYue/ۥۣۡۡ;->ۥ۟۟۠۟(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/lang/ClassLoader;)LYue/ۥ۠ۡۨۤ;
    .locals 7
    .param p0    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۦۡ;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, LYue/ۥۡۦۦۡ;-><init>(Ljava/lang/ClassLoader;ZLYue/ۥ۠ۡۨۤ;ILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;Ljavax/crypto/Cipher;)LYue/ۥ۟ۤۦۡ;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Cipher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipher"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۤۦۡ;

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۤۦۡ;-><init>(LYue/ۥۣۣ۟۟;Ljavax/crypto/Cipher;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;Ljavax/crypto/Cipher;)LYue/ۥ۟ۤۦۢ;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Cipher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipher"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۤۦۢ;

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۤۦۢ;-><init>(LYue/ۥۣۣ۟۠;Ljavax/crypto/Cipher;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣۢ۟ۡ;Ljava/security/MessageDigest;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/security/MessageDigest;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤۢ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۢ۟;-><init>(LYue/ۥۣۢ۟ۡ;Ljava/security/MessageDigest;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣۢ۟ۡ;Ljavax/crypto/Mac;)LYue/ۥ۠ۤۢ۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Mac;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤۢ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۢ۟;-><init>(LYue/ۥۣۢ۟ۡ;Ljavax/crypto/Mac;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣۢ۟ۦ;Ljava/security/MessageDigest;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/security/MessageDigest;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digest"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤۢ۠;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۢ۠;-><init>(LYue/ۥۣۢ۟ۦ;Ljava/security/MessageDigest;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣۢ۟ۦ;Ljavax/crypto/Mac;)LYue/ۥ۠ۤۢ۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljavax/crypto/Mac;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤۢ۠;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۢ۠;-><init>(LYue/ۥۣۢ۟ۦ;Ljavax/crypto/Mac;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۤ(Ljava/lang/AssertionError;)Z
    .locals 4
    .param p0    # Ljava/lang/AssertionError;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-string v3, "getsockname failed"

    invoke-static {p0, v3, v1, v0, v2}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۨ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v1

    :goto_0
    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥ۠ۡۨۤ;LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨۤ;
    .locals 2
    .param p0    # LYue/ۥ۠ۡۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zipPath"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, p0, v0, v1, v0}, LYue/ۥۢۦۣۨ;->ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;LYue/ۥ۠ۡۨۤ;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۢۦۣۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۦ(Ljava/io/File;)LYue/ۥۣۢ۟ۡ;
    .locals 3
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۢ(Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۧ(Ljava/io/File;Z)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-static {v0}, LYue/ۥۣۡۡ;->ۥ۟۟۠۟(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۨ(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;
    .locals 2
    .param p0    # Ljava/io/OutputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۡۥ;

    new-instance v1, LYue/ۥۢۡۤۧ;

    invoke-direct {v1}, LYue/ۥۢۡۤۧ;-><init>()V

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۥ;-><init>(Ljava/io/OutputStream;LYue/ۥۢۡۤۧ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۠(Ljava/net/Socket;)LYue/ۥۣۢ۟ۡ;
    .locals 3
    .param p0    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۢ۟ۢ;

    invoke-direct {v0, p0}, LYue/ۥۣۢ۟ۢ;-><init>(Ljava/net/Socket;)V

    new-instance v1, LYue/ۥۣۡۥ;

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    const-string v2, "getOutputStream(...)"

    invoke-static {p0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, LYue/ۥۣۡۥ;-><init>(Ljava/io/OutputStream;LYue/ۥۢۡۤۧ;)V

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡۢ(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs ۥ۟۟۠۟(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p0    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # [Ljava/nio/file/OpenOption;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/OpenOption;

    invoke-static {p0, p1}, Ljava/nio/file/Files;->newOutputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    move-result-object p0

    const-string p1, "newOutputStream(...)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۠۟(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠۠(Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۣۡۡ;->ۥ۟۟۠(Ljava/io/File;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(Ljava/io/File;)LYue/ۥۣۢ۟ۦ;
    .locals 2
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۥۣ۠;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object p0, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۤۧ;

    invoke-direct {v0, v1, p0}, LYue/ۥ۠ۥۣ۠;-><init>(Ljava/io/InputStream;LYue/ۥۢۡۤۧ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۠ۢ(Ljava/io/InputStream;)LYue/ۥۣۢ۟ۦ;
    .locals 2
    .param p0    # Ljava/io/InputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۥۣ۠;

    new-instance v1, LYue/ۥۢۡۤۧ;

    invoke-direct {v1}, LYue/ۥۢۡۤۧ;-><init>()V

    invoke-direct {v0, p0, v1}, LYue/ۥ۠ۥۣ۠;-><init>(Ljava/io/InputStream;LYue/ۥۢۡۤۧ;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۠(Ljava/net/Socket;)LYue/ۥۣۢ۟ۦ;
    .locals 3
    .param p0    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۢ۟ۢ;

    invoke-direct {v0, p0}, LYue/ۥۣۢ۟ۢ;-><init>(Ljava/net/Socket;)V

    new-instance v1, LYue/ۥ۠ۥۣ۠;

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const-string v2, "getInputStream(...)"

    invoke-static {p0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, LYue/ۥ۠ۥۣ۠;-><init>(Ljava/io/InputStream;LYue/ۥۢۡۤۧ;)V

    invoke-virtual {v0, v1}, LYue/ۥ۟ۢ۟ۤ;->ۥۣ۟۟ۡ(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۢ۟ۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs ۥ۟۟۠ۤ(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p0    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # [Ljava/nio/file/OpenOption;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/nio/file/OpenOption;

    invoke-static {p0, p1}, Ljava/nio/file/Files;->newInputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object p0

    const-string p1, "newInputStream(...)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۤ(Ljava/io/InputStream;)LYue/ۥۣۢ۟ۦ;

    move-result-object p0

    return-object p0
.end method
