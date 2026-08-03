.class public LYue/ۥ۟ۨۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Z

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

.field public ۥ۟۟۟۟:Ljava/lang/String;

.field public ۥ۟۟۟۠:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    .line 6
    iput-object p2, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۠:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨۡ;

    iget-object v1, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    if-eqz v1, :cond_3

    return v2

    :cond_2
    iget-object v3, p1, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LYue/ۥ۟ۨۡ;->ۥ۟:Z

    iget-boolean v3, p1, LYue/ۥ۟ۨۡ;->ۥ۟:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    if-eqz v1, :cond_6

    return v2

    :cond_5
    iget-object v3, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    if-nez v1, :cond_7

    iget-object v1, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    if-eqz v1, :cond_8

    return v2

    :cond_7
    iget-object v3, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    invoke-virtual {v1, v3}, LYue/ۥ۟ۨۡۡ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    if-nez v1, :cond_9

    iget-object p1, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    if-eqz p1, :cond_a

    return v2

    :cond_9
    iget-object p1, p1, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!ENTITY "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟:Z

    if-eqz v0, :cond_0

    const-string v0, " % "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v1, 0x27

    :cond_1
    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->print(C)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->print(C)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۨۡۡ;->ۥ(Ljava/io/PrintWriter;)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, " NDATA "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_3
    :goto_0
    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟()LYue/ۥ۟ۨۡۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    iget-object v0, v0, LYue/ۥ۟ۨۡۡ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/io/Reader;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, LYue/ۥ۟ۨۡۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {p0, v0}, LYue/ۥ۟ۨۡ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Ljava/io/Reader;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)Ljava/io/Reader;
    .locals 4

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۠:Ljava/lang/Object;

    if-eqz v0, :cond_1

    instance-of v1, v0, Ljava/io/File;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/io/File;

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v1

    :cond_0
    instance-of v0, v0, Ljava/net/URL;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۠:Ljava/lang/Object;

    check-cast v1, Ljava/net/URL;

    invoke-direct {v0, v1, p1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, p1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :try_start_1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p1

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۨۡ;->ۥ۟:Z

    return v0
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۟ۨۡۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟:LYue/ۥ۟ۨۡۡ;

    return-void
.end method

.method public ۥ۟۟۟ۥ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۨۡ;->ۥ۟:Z

    return-void
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method
