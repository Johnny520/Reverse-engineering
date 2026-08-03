.class public LYue/ۥۢ۠۠ۥ;
.super LYue/ۥۡۦ۟ۨ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۠۠:LYue/ۥۣۢ۠۠;


# direct methods
.method public constructor <init>(LYue/ۥۢۦۢۤ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۡۦ۟ۨ;-><init>(LYue/ۥۢۦۢۤ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۦۢۤ;LYue/ۥۣۢ۠۠;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۡۦ۟ۨ;-><init>(LYue/ۥۢۦۢۤ;)V

    .line 3
    invoke-virtual {p0, p2}, LYue/ۥۢ۠۠ۥ;->ۥ۟۟ۤۧ(LYue/ۥۣۢ۠۠;)V

    return-void
.end method

.method public static ۥۣ۟۟ۧ([Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "javax.xml.stream.XMLInputFactory"

    const-string v1, "com.bea.xml.stream.MXParserFactory"

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

    aget-object v4, p0, v3

    invoke-direct {v2, v4}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟ۦ(Ljava/io/Reader;)LYue/ۥۢۦۢۤ;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, LYue/ۥۢۦۡۧ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۣۢ۠۠;)LYue/ۥۢۦۢۤ;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-interface {v1}, LYue/ۥۢۦۢۤ;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-interface {v1}, LYue/ۥۢۦۢۤ;->next()I

    goto :goto_0

    :cond_0
    new-instance v1, LYue/ۥۡۢ۠۟;

    new-instance v2, LYue/ۥۡۥۤۨ;

    const-string v4, "banana"

    const-string v5, "B"

    invoke-direct {v2, v4, v5}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, LYue/ۥۡۢ۠۟;-><init>(LYue/ۥۡۥۤۨ;)V

    new-instance v2, Ljava/io/FileReader;

    aget-object p0, p0, v3

    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LYue/ۥۢۦۡۧ;->ۥ۟۟۟ۦ(Ljava/io/Reader;)LYue/ۥۢۦۢۤ;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, LYue/ۥۢۦۡۧ;->ۥ۟(LYue/ۥۢۦۢۤ;LYue/ۥۣۢ۠۠;)LYue/ۥۢۦۢۤ;

    move-result-object p0

    new-instance v0, LYue/ۥۢۦۢۥ;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    const-string v3, "out.stream"

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, LYue/ۥۢۦۢۥ;-><init>(Ljava/io/Writer;)V

    :goto_1
    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p0}, LYue/ۥۢۦۢۥ;->ۥۣ۟۟ۡ(LYue/ۥۢۦۢۤ;)V

    invoke-interface {p0}, LYue/ۥۢۦۢۤ;->next()I

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LYue/ۥۢۦۢۧ;->flush()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :goto_0
    invoke-super {p0}, LYue/ۥۡۦ۟ۨ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۢ۠۠ۥ;->ۥ۟۟۠۠:LYue/ۥۣۢ۠۠;

    invoke-virtual {p0}, LYue/ۥۡۦ۟ۨ;->ۥ۟۟۠ۧ()LYue/ۥۢۦۢۤ;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥۣۢ۠۠;->ۥ(LYue/ۥۢۦۢۤ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-super {p0}, LYue/ۥۡۦ۟ۨ;->next()I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public next()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢ۠۠ۥ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, LYue/ۥۡۦ۟ۨ;->next()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "next() may not be called  when there are no more  items to return"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۤۧ(LYue/ۥۣۢ۠۠;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۠۠ۥ;->ۥ۟۟۠۠:LYue/ۥۣۢ۠۠;

    return-void
.end method
