.class public LYue/ۥۢ۠ۦۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public ۥ۟:LYue/ۥۣۢ۟ۧ;

.field public ۥ۟۟:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    new-instance v0, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۧ;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    return-void
.end method

.method public static ۥ۟۟۟۠([Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p0, LYue/ۥۢ۠ۦۤ;

    invoke-direct {p0}, LYue/ۥۢ۠ۦۤ;-><init>()V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    const-string v0, "x"

    const-string v1, "foo"

    invoke-virtual {p0, v0, v1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "y"

    const-string v3, "bar"

    invoke-virtual {p0, v2, v3}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "1 x:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "1 y:"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    invoke-virtual {p0, v0, v3}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    const-string v1, "barbie"

    invoke-virtual {p0, v0, v1}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟۟ۡ()V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "3 x:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "2 x:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "2 y:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v2}, LYue/ۥۢ۠ۦۤ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢ۠ۦۤ;->ۥ۟()V

    invoke-virtual {v4, p0}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, ""

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۠ۦۣ;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, "\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public ۥ()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->clear()V

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public ۥ۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۦۣ;

    iget v0, v0, LYue/ۥۢ۠ۦۣ;->ۥ۟۟:I

    :goto_0
    iget v1, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۦۣ;

    iget-object v1, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    iget-object v0, v0, LYue/ۥۢ۠ۦۣ;->ۥ:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->pop()Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۣۢ۟ۧ;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۦۣ;

    iget v0, v0, LYue/ۥۢ۠ۦۣ;->ۥ۟۟:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۢ۟ۧ;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LYue/ۥۣۢ۟ۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣۢ۟ۧ;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Set;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    invoke-virtual {v1}, LYue/ۥۣۢ۟ۧ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۠ۦۣ;

    invoke-virtual {v2}, LYue/ۥۢ۠ۦۣ;->ۥ۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, LYue/ۥۢ۠ۦۣ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 1

    iget v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟:LYue/ۥۣۢ۟ۧ;

    new-instance v1, LYue/ۥۢ۠ۦۣ;

    iget v2, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    invoke-direct {v1, p1, p2, v2}, LYue/ۥۢ۠ۦۣ;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۣۢ۟ۧ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۧ;-><init>()V

    invoke-virtual {v0, p2}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    iget-object p2, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۢ۟ۧ;

    invoke-virtual {p1, p2}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget v0, p0, LYue/ۥۢ۠ۦۤ;->ۥ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
