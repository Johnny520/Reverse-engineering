.class public abstract LYue/ۥۡۦۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۧ۟$ۥ;,
        LYue/ۥۡۦۧ۟$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public ۥۣ۟۟۠:Ljava/io/Reader;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۦۧ۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۦۧ۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۠;LYue/ۥۡ۠ۥۨ;J)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "create"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ(LYue/ۥۣۣ۟۠;LYue/ۥۡ۠ۥۨ;J)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۦ(LYue/ۥۣ۟ۥۤ;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "create"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟(LYue/ۥۣ۟ۥۤ;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۨ(LYue/ۥۡ۠ۥۨ;JLYue/ۥۣۣ۟۠;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "content.asResponseBody(contentType, contentLength)"
            imports = {
                "okhttp3.ResponseBody.Companion.asResponseBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1, p2, p3}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟(LYue/ۥۡ۠ۥۨ;JLYue/ۥۣۣ۟۠;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡ(LYue/ۥۡ۠ۥۨ;LYue/ۥۣ۟ۥۤ;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "content.toResponseBody(contentType)"
            imports = {
                "okhttp3.ResponseBody.Companion.toResponseBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟۟(LYue/ۥۡ۠ۥۨ;LYue/ۥۣ۟ۥۤ;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡ۠(LYue/ۥۡ۠ۥۨ;Ljava/lang/String;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "content.toResponseBody(contentType)"
            imports = {
                "okhttp3.ResponseBody.Companion.toResponseBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟۟۟(LYue/ۥۡ۠ۥۨ;Ljava/lang/String;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۡ(LYue/ۥۡ۠ۥۨ;[B)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "content.toResponseBody(contentType)"
            imports = {
                "okhttp3.ResponseBody.Companion.toResponseBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟۟۠(LYue/ۥۡ۠ۥۨ;[B)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۦ(Ljava/lang/String;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "create"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۧ([BLYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;
    .locals 1
    .param p0    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡ۠ۥۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "create"
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۦۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۟$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥۡۦۧ۟$ۥ۟;->ۥ۟۟۟ۢ([BLYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۧ۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    return-void
.end method

.method public final ۥ۟()Ljava/io/InputStream;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟۟()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۥۤ;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۨ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    invoke-static {v2, v4}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v3}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v2

    const-wide/16 v4, -0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_1

    int-to-long v4, v2

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Content-Length ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ") and stream length ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") disagree"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    :goto_0
    return-object v3

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v2, v0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot buffer entire body for content length: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ۥ۟۟۟()[B
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۨ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۡ۟()[B

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    invoke-static {v2, v4}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    array-length v2, v3

    const-wide/16 v4, -0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_1

    int-to-long v4, v2

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Content-Length ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ") and stream length ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") disagree"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    :goto_0
    return-object v3

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v2, v0}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot buffer entire body for content length: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ۥ۟۟۟۟()Ljava/io/Reader;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ۟;->ۥۣ۟۟۠:Ljava/io/Reader;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۡۦۧ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۢ()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYue/ۥۡۦۧ۟$ۥ;-><init>(LYue/ۥۣۣ۟۠;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, LYue/ۥۡۦۧ۟;->ۥۣ۟۟۠:Ljava/io/Reader;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/nio/charset/Charset;
    .locals 2

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۠()LYue/ۥۡ۠ۥۨ;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, LYue/ۥۡ۠ۥۨ;->ۥ۟۟۟۠(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LYue/ۥ۟ۤۤ۠;->ۥ۟:Ljava/nio/charset/Charset;

    :cond_1
    return-object v0
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e3\u06e3\u06e0;",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Integer;",
            ">;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۨ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v2

    const/4 v3, 0x1

    :try_start_0
    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    const/4 v4, 0x0

    invoke-static {v2, v4}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    invoke-interface {p2, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    int-to-long v2, p2

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Content-Length ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ") and stream length ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") disagree"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {v2, p1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot buffer entire body for content length: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۥ۟۟۟ۨ()J
.end method

.method public abstract ۥ۟۟۠()LYue/ۥۡ۠ۥۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method

.method public abstract ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public final ۥ۟۟ۢۥ()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۡۦۧ۟;->ۥ۟۟۟ۢ()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۢۧ(LYue/ۥۣۣ۟۠;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۥ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v0, v2}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method
