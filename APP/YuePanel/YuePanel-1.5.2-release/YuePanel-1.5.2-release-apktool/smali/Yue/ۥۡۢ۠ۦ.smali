.class public LYue/ۥۡۢ۠ۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢ۠ۥ;


# instance fields
.field public ۥ:LYue/ۥۢ۠ۦۤ;

.field public ۥ۟:LYue/ۥۢ۠ۦۤ;

.field public ۥ۟۟:LYue/ۥۡۢ۠ۥ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LYue/ۥۢ۠ۦۤ;

    invoke-direct {v0}, LYue/ۥۢ۠ۦۤ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    .line 3
    new-instance v0, LYue/ۥۢ۠ۦۤ;

    invoke-direct {v0}, LYue/ۥۢ۠ۦۤ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    .line 4
    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۢ()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۢ۠ۥ;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, LYue/ۥۢ۠ۦۤ;

    invoke-direct {p1}, LYue/ۥۢ۠ۦۤ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    .line 7
    new-instance p1, LYue/ۥۢ۠ۦۤ;

    invoke-direct {p1}, LYue/ۥۢ۠ۦۤ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟۟:LYue/ۥۡۢ۠ۥ;

    .line 9
    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۢ()V

    return-void
.end method

.method public static ۥۣ۟۟۟([Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p0, LYue/ۥۡۢ۠ۦ;

    invoke-direct {p0}, LYue/ۥۡۢ۠ۦ;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۤ()V

    const-string v0, "a"

    const-string v1, "uri"

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "b"

    invoke-virtual {p0, v2, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "a="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "uri="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v1}, LYue/ۥۡۢ۠ۦ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "1 uri->"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟ۤ()V

    const-string v2, "uri2"

    invoke-virtual {p0, v0, v2}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "2 uri->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟۟()V

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟۟۟()V

    return-void
.end method


# virtual methods
.method public getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟۟:LYue/ۥۡۢ۠ۥ;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, LYue/ۥۡۢ۠ۥ;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public ۥ(Ljava/lang/String;)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0, p2, p1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟۟:LYue/ۥۡۢ۠ۥ;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, LYue/ۥۡۢ۠ۥ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    return-void
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, LYue/ۥۡۢ۠ۦ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟۟()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ()V
    .locals 2

    const-string v0, "xml"

    const-string v1, "http://www.w3.org/XML/1998/namespace"

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "xmlns"

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ۟:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    return-void
.end method

.method public ۥ۟۟۟ۥ()V
    .locals 2

    const-string v0, ""

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۢ۠ۦ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥۡۢ۠ۦ;->ۥ:LYue/ۥۢ۠ۦۤ;

    invoke-virtual {p1, p2, v1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
