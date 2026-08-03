.class public LYue/ۥۢ۟ۨۥ;
.super LYue/ۥۡۢ۠۠;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢ۟ۨۤ;


# instance fields
.field public ۥ۟۟۠ۥ:Ljava/util/List;

.field public ۥ۟۟۠ۦ:Ljava/util/List;

.field public ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢ۠۠;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۤۨ;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۡۢ۠۠;-><init>(LYue/ۥۡۥۤۨ;)V

    .line 3
    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ۟()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢ۟ۨۤ;)V
    .locals 2

    .line 4
    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-direct {p0, v0}, LYue/ۥۡۢ۠۠;-><init>(LYue/ۥۡۥۤۨ;)V

    .line 5
    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ۟()V

    .line 6
    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۡۢ۠۠;->ۥ۟۟ۥۧ(LYue/ۥۡۥۤۨ;)V

    .line 7
    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getAttributes()Ljava/util/Iterator;

    move-result-object v0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۢ۠ۡ;

    invoke-virtual {p0, v1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۥۨ(LYue/ۥ۟ۢ۠ۡ;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getNamespaces()Ljava/util/Iterator;

    .line 11
    invoke-interface {p1}, LYue/ۥۢ۟ۨۤ;->getNamespaces()Ljava/util/Iterator;

    move-result-object p1

    .line 12
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۢ۠;

    invoke-virtual {p0, v0}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ(LYue/ۥۣۡۢ۠;)V

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public getAttributes()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۠۠ۨ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨ;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getNamespaces()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۦ:Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥ۠۠ۨ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨ;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥۡۢ۠۠;->ۥ۟۟ۥۦ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->getAttributes()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, " "

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->getNamespaces()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥۡۢ۠ۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, LYue/ۥۡۢ۠ۥ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۠(LYue/ۥۡۥۤۨ;)LYue/ۥ۟ۢ۠ۡ;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->getAttributes()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۢ۠ۡ;

    invoke-interface {v2}, LYue/ۥ۟ۢ۠ۡ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v3

    invoke-virtual {v3, p1}, LYue/ۥۡۥۤۨ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    const/16 v0, 0x3c

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

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

    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->getNamespaces()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0x20

    if-eqz v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۦ۠ۨ;

    invoke-interface {v1, p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟ۡۥ(Ljava/io/Writer;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢ۟ۨۥ;->getAttributes()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۦ۠ۨ;

    invoke-interface {v1, p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟ۡۥ(Ljava/io/Writer;)V

    goto :goto_1

    :cond_2
    const/16 v0, 0x3e

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ۥ۟۟ۥۨ(LYue/ۥ۟ۢ۠ۡ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟ۦ(LYue/ۥۣۡۢ۠;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۦ:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۦ:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۦ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟ۦ۟()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۦ۠()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۦ:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    iget-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;

    :cond_2
    return-void
.end method

.method public ۥ۟۟ۦۡ(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۥ:Ljava/util/List;

    return-void
.end method

.method public ۥ۟۟ۦۢ(LYue/ۥۡۢ۠ۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۟ۨۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۠ۥ;

    return-void
.end method
