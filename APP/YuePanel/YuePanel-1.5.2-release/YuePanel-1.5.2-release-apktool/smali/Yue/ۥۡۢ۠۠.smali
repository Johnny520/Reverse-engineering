.class public abstract LYue/ۥۡۢ۠۠;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۤۨ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    .line 5
    new-instance v0, LYue/ۥۡۥۤۨ;

    invoke-direct {v0, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    .line 7
    new-instance v0, LYue/ۥۡۥۤۨ;

    invoke-direct {v0, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    return-void
.end method


# virtual methods
.method public getName()LYue/ۥۡۥۤۨ;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    return-object v0
.end method

.method public abstract ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public ۥ۟۟ۥۦ()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\']:"

    const-string v3, "[\'"

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    invoke-virtual {v1}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۥۧ(LYue/ۥۡۥۤۨ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۢ۠۠;->ۥ۟۟۠ۤ:LYue/ۥۡۥۤۨ;

    return-void
.end method
