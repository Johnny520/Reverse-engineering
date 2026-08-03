.class public LYue/ۥ۟ۨ۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/Object;

.field public ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

.field public ۥ۟۟۟:Ljava/lang/String;


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
    iput-object p1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨ۠ۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨ۠ۡ;

    iget-object v1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    if-eqz v1, :cond_3

    return v2

    :cond_2
    iget-object v3, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    if-nez v1, :cond_4

    iget-object v1, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    if-eqz v1, :cond_5

    return v2

    :cond_4
    iget-object v3, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-nez v1, :cond_6

    iget-object v1, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-eqz v1, :cond_7

    return v2

    :cond_6
    iget-object v3, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    invoke-virtual {v1, v3}, LYue/ۥ۟ۨ۠ۦ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object p1, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    if-eqz p1, :cond_9

    return v2

    :cond_8
    iget-object p1, p1, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, LYue/ۥ۟ۨۡ۟;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۟ۨۡ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۨۡ۟;->ۥ(Ljava/io/PrintWriter;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, LYue/ۥ۟ۨۡۦ;

    if-eqz v1, :cond_2

    check-cast v0, LYue/ۥ۟ۨۡۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۨۡۦ;->ۥ(Ljava/io/PrintWriter;)V

    :cond_2
    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, LYue/ۥ۟ۨ۠ۦ;->ۥ(Ljava/io/PrintWriter;)V

    :cond_3
    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, " \""

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public ۥ۟()LYue/ۥ۟ۨ۠ۦ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۟ۨ۠ۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۦ;

    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ:Ljava/lang/String;

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    instance-of v0, p1, LYue/ۥ۟ۨۡ۟;

    if-nez v0, :cond_1

    instance-of v0, p1, LYue/ۥ۟ۨۡۦ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must be String, DTDEnumeration or DTDNotationList"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, LYue/ۥ۟ۨ۠ۡ;->ۥ۟:Ljava/lang/Object;

    return-void
.end method
