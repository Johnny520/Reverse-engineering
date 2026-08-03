.class public LYue/ۥۢۦۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦۣۡ;
.implements LYue/ۥۢۦۡ۠;


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

.field public ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧ۟;


# direct methods
.method public constructor <init>(LYue/ۥۢۦۢۤ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    .line 1
    new-instance v0, LYue/ۥۢۦۡ۟;

    invoke-direct {v0}, LYue/ۥۢۦۡ۟;-><init>()V

    invoke-direct {p0, p1, v0}, LYue/ۥۢۦۡۤ;-><init>(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LYue/ۥ۟ۤۦۨ;

    invoke-direct {v0}, LYue/ۥ۟ۤۦۨ;-><init>()V

    iput-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۤ:Z

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۧ:Z

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 6
    iput-object p1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    .line 7
    iput-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۤ:Z

    .line 8
    iput-object p2, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    .line 9
    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result p2

    const/4 v0, 0x7

    if-ne p2, v0, :cond_0

    .line 10
    iget-object p2, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    invoke-interface {p2, p1}, LYue/ۥۢۦۡ;->ۥ(LYue/ۥۢۦۢۤ;)LYue/ۥۢۦ۠ۨ;

    move-result-object p2

    .line 11
    invoke-interface {p1}, LYue/ۥۢۦۢۤ;->next()I

    .line 12
    invoke-virtual {p0, p2}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟(LYue/ۥۢۦ۠ۨ;)V

    :cond_0
    return-void

    .line 13
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "XMLEventAllocator may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "XMLStreamReader may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۥ۟۟۟ۧ([Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "javax.xml.stream.XMLInputFactory"

    const-string v1, "com.bea.xml.stream.MXParserFactory"

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "javax.xml.stream.XMLEventFactory"

    const-string v1, "com.bea.xml.stream.EventFactory"

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥۢۦۡۧ;->ۥ۟۟۠ۤ()LYue/ۥۢۦۡۧ;

    move-result-object v0

    new-instance v1, Ljava/io/FileReader;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v0}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۠()I

    move-result v3

    invoke-static {v3}, LYue/ۥ۠۠ۥۦ;->ۥ۟(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۥ()V

    return-void
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۦۧ۟;->ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۤ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    :cond_1
    :try_start_0
    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v0
    :try_end_0
    .catch LYue/ۥۢۦۢۢ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    iput-boolean v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۤ:Z

    :catch_0
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0
    :try_end_0
    .catch LYue/ۥۢۦۢۢ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public peek()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦ۠ۨ;

    return-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦ۠ۨ;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ۥ۟۟۟(LYue/ۥۢۦ۠ۨ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۤۦۨ;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟۟()LYue/ۥۢۦ۠ۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۢ()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LYue/ۥۣ۟ۤۥ;

    invoke-interface {v1}, LYue/ۥۣ۟ۤۥ;->ۥ۟۟۟ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۢۦۢۢ;

    const-string v1, "Unexpected text"

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-interface {v0}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v0}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۦ()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_3
    return-object v0

    :cond_4
    new-instance v0, LYue/ۥۢۦۢۢ;

    const-string v1, "Unexpected end of Document"

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->peek()LYue/ۥۢۦ۠ۨ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۢ()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LYue/ۥۣ۟ۤۥ;

    invoke-interface {v2}, LYue/ۥۣ۟ۤۥ;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۦ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    goto :goto_0

    :cond_2
    new-instance v0, LYue/ۥۢۦۢۢ;

    const-string v1, "Unexpected Element start"

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, LYue/ۥۢۦۢۢ;

    const-string v1, "Unexpected end of Document"

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, LYue/ۥۢۦۢۢ;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT (got "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۠()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟۟()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۦ۠ۨ;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۨ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Attempt to call nextEvent() on a stream with no more elements"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۟()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۧ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟ۨ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۤۦۨ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    iget-object v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0, v1, p0}, LYue/ۥۢۦۡ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ۠;)V

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->next()I

    :cond_1
    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0}, LYue/ۥۢۦۢۤ;->ۥ۟۟۠()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    iget-object v1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۥ:LYue/ۥۢۦۢۤ;

    invoke-interface {v0, v1, p0}, LYue/ۥۢۦۡ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۢۦۡ۠;)V

    iput-boolean v2, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۧ:Z

    :cond_2
    invoke-virtual {p0}, LYue/ۥۢۦۡۤ;->ۥ۟۟۟ۨ()Z

    move-result v0

    xor-int/2addr v0, v2

    return v0
.end method

.method public ۥ۟۟۠۟(LYue/ۥۢۦۡ;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۦۡ;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "XMLEvent Allocator may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠۠(LYue/ۥ۟ۦۧ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۦۡۤ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧ۟;

    return-void
.end method
