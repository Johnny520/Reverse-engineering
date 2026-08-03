.class public LYue/ۥ۠ۡ۟;
.super LYue/ۥۡۢ۠۠;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ;


# instance fields
.field public ۥ۟۟۠ۥ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢ۠۠;-><init>()V

    .line 2
    invoke-virtual {p0}, LYue/ۥ۠ۡ۟;->ۥ۟۟ۦ()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۤۨ;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LYue/ۥۡۢ۠۠;-><init>(LYue/ۥۡۥۤۨ;)V

    .line 4
    invoke-virtual {p0}, LYue/ۥ۠ۡ۟;->ۥ۟۟ۦ()V

    return-void
.end method


# virtual methods
.method public getNamespaces()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۠۠ۨ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨ;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥۡۢ۠۠;->ۥ۟۟ۥۦ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟;->getNamespaces()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "</"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۢ۠۠;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v1, 0x3a

    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(I)V

    :cond_0
    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x3e

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ۥ۟۟ۥۨ(LYue/ۥۣۡۢ۠;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡ۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۡ۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟ۦ()V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۦ۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method
