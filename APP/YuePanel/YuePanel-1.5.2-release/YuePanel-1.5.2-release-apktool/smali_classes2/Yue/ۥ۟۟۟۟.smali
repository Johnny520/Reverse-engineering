.class public final LYue/ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    message = "changed in Okio 2.x"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟۟۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟۟۟۟;

    invoke-direct {v0}, LYue/ۥ۟۟۟۟;-><init>()V

    sput-object v0, LYue/ۥ۟۟۟۟;->ۥ:LYue/ۥ۟۟۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/io/File;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "file.appendingSink()"
            imports = {
                "okio.appendingSink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ(Ljava/io/File;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟()LYue/ۥۣۢ۟ۡ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "blackholeSink()"
            imports = {
                "okio.blackholeSink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {}, LYue/ۥۣۡۡ;->ۥ۟۟()LYue/ۥۣۢ۟ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "sink.buffer()"
            imports = {
                "okio.buffer"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "source.buffer()"
            imports = {
                "okio.buffer"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Ljava/io/File;)LYue/ۥۣۢ۟ۡ;
    .locals 3
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "file.sink()"
            imports = {
                "okio.sink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۢ(Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۠(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # Ljava/io/OutputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "outputStream.sink()"
            imports = {
                "okio.sink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "outputStream"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۠۟(Ljava/io/OutputStream;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۡ(Ljava/net/Socket;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "socket.sink()"
            imports = {
                "okio.sink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "socket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۠۠(Ljava/net/Socket;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ۥ۟۟۟ۢ(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [Ljava/nio/file/OpenOption;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "path.sink(*options)"
            imports = {
                "okio.sink"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/nio/file/OpenOption;

    invoke-static {p1, p2}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۡ(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥۣ۟۟۟(Ljava/io/File;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "file.source()"
            imports = {
                "okio.source"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥۣ۟۟۠(Ljava/io/File;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۤ(Ljava/io/InputStream;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "inputStream.source()"
            imports = {
                "okio.source"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "inputStream"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۤ(Ljava/io/InputStream;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۥ(Ljava/net/Socket;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # Ljava/net/Socket;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "socket.source()"
            imports = {
                "okio.source"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "socket"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۥ(Ljava/net/Socket;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ۥ۟۟۟ۦ(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [Ljava/nio/file/OpenOption;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "path.source(*options)"
            imports = {
                "okio.source"
            }
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/nio/file/OpenOption;

    invoke-static {p1, p2}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۦ(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method
