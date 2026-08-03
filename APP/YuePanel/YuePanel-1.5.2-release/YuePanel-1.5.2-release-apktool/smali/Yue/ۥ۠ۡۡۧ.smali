.class public LYue/ۥ۠ۡۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦۣۡ;


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

.field public ۥ۟۟۠ۤ:LYue/ۥ۠ۡ۠ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢۦۣۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۦۣۡ;LYue/ۥ۠ۡ۠ۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    .line 5
    iput-object p2, p0, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡ۠ۧ;

    return-void
.end method

.method public static ۥ([Ljava/lang/String;)V
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

    new-instance v1, LYue/ۥۢۢۢۨ;

    invoke-direct {v1}, LYue/ۥۢۢۢۨ;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LYue/ۥۢۢۢۨ;->ۥ۟۟(I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LYue/ۥۢۢۢۨ;->ۥ۟۟(I)V

    new-instance v2, Ljava/io/FileReader;

    const/4 v3, 0x0

    aget-object p0, p0, v3

    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟۠(Ljava/io/Reader;)LYue/ۥۢۦۣۡ;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, LYue/ۥۢۦۡۧ;->ۥ(LYue/ۥۢۦۣۡ;LYue/ۥ۠ۡ۠ۧ;)LYue/ۥۢۦۣۡ;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-interface {p0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->close()V

    return-void
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0, p1}, LYue/ۥۢۦۣۡ;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public hasNext()Z
    .locals 3

    :goto_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v1}, LYue/ۥۢۦۣۡ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡ۠ۧ;

    iget-object v2, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v2}, LYue/ۥۢۦۣۡ;->peek()LYue/ۥۢۦ۠ۨ;

    move-result-object v2

    invoke-interface {v1, v2}, LYue/ۥ۠ۡ۠ۧ;->ۥ۟(LYue/ۥۢۦ۠ۨ;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v1, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v1}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;
    :try_end_0
    .catch LYue/ۥۢۦۢۢ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

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

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->peek()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ۥ۟(LYue/ۥ۠ۡ۠ۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡ۠ۧ;

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
    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۟ۨ()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->peek()LYue/ۥۢۦ۠ۨ;

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
    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

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

    const-string v1, "Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT"

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۡۡۧ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۡۡۧ;->ۥۣ۟۟۠:LYue/ۥۢۦۣۡ;

    invoke-interface {v0}, LYue/ۥۢۦۣۡ;->ۥ۟۟۟ۤ()LYue/ۥۢۦ۠ۨ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
