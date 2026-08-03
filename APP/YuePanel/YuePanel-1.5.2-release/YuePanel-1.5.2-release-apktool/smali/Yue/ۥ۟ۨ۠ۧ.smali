.class public LYue/ۥ۟ۨ۠ۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/util/Hashtable;

.field public ۥ۟۟:LYue/ۥ۟ۨۡۢ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    .line 5
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨ۠ۧ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨ۠ۧ;

    iget-object v1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    if-eqz v1, :cond_3

    return v2

    :cond_2
    iget-object v3, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    if-nez v1, :cond_4

    iget-object v1, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    if-eqz v1, :cond_5

    return v2

    :cond_4
    iget-object v3, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    invoke-virtual {v1, v3}, Ljava/util/Hashtable;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    if-nez v1, :cond_6

    iget-object p1, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    if-eqz p1, :cond_7

    return v2

    :cond_6
    iget-object p1, p1, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۨۡۢ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!ELEMENT "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۨۡۢ;->ۥ(Ljava/io/PrintWriter;)V

    goto :goto_0

    :cond_0
    const-string v0, "ANY"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :goto_0
    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/PrintWriter;->println()V

    return-void
.end method

.method public ۥ۟(Ljava/lang/String;)LYue/ۥ۟ۨ۠ۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۨ۠ۡ;

    return-object p1
.end method

.method public ۥ۟۟()LYue/ۥ۟ۨۡۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;LYue/ۥ۟ۨ۠ۡ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۟ۨۡۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ۟۟:LYue/ۥ۟ۨۡۢ;

    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۧ;->ۥ:Ljava/lang/String;

    return-void
.end method
