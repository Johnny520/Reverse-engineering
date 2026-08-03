.class public LYue/ۥ۠ۡ۟ۥ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ۟ۤ;


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Ljava/lang/String;

.field public ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۟ۡ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟ۥۦ()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LYue/ۥ۠ۡ۟ۡ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    .line 3
    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟ۥۦ()V

    .line 4
    iput-object p1, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 5
    iput-object p2, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۟ۡ;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۥ;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۥ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ":=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥۣ۟۟ۡ()LYue/ۥ۠ۡ۟ۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۟ۡ;

    return-object v0
.end method

.method public ۥۣ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۟ۡ;

    invoke-interface {v0}, LYue/ۥ۠ۡ۟ۡ;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟ۨ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x26

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۥ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x3b

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ۥ۟۟ۥۦ()V
    .locals 1

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۥۧ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟ۥۨ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡ۟ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method
