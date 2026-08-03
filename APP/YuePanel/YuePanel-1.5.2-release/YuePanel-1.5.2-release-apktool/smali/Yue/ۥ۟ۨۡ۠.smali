.class public LYue/ۥ۟ۨۡ۠;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨ۟ۨ;


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Ljava/util/List;

.field public ۥ۟۟۠ۦ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۟ۨۡ۠;->ۥ۟۟ۥۨ()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    .line 3
    invoke-virtual {p0}, LYue/ۥ۟ۨۡ۠;->ۥ۟۟ۥۨ()V

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥ۟ۨۡ۠;->ۥ۟۟ۦ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟ۥۦ(LYue/ۥ۟ۨۡ;)LYue/ۥ۠ۡ۟ۡ;
    .locals 2

    new-instance v0, LYue/ۥ۠ۡ۟ۢ;

    invoke-virtual {p0}, LYue/ۥ۟ۨۡ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥ۟ۨۡ;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LYue/ۥ۠ۡ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۥ۟۟ۥۧ(LYue/ۥ۟ۨۡۥ;)LYue/ۥۡۢۥۣ;
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۟ۨۡۥ;->ۥ۟()LYue/ۥ۟ۨۡۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۨۡۡ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    instance-of v2, v0, LYue/ۥ۟ۨۢۡ;

    if-eqz v2, :cond_0

    check-cast v0, LYue/ۥ۟ۨۢۡ;

    invoke-virtual {v0}, LYue/ۥ۟ۨۢۡ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, LYue/ۥۡۢۥۤ;

    invoke-virtual {p0}, LYue/ۥ۟ۨۡۥ;->ۥ۟۟()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0, v1}, LYue/ۥۡۢۥۤ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public ۥ۟۟۠ۡ()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۥ:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۡ۠()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۢۦ()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۦ:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۤ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!DOCTYPE "

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/16 v0, 0x5b

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    iget-object v0, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    :cond_0
    const/16 v0, 0x3e

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ۥ۟۟ۥۨ()V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۦ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟ۦ۟(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۦ:Ljava/util/List;

    return-void
.end method

.method public ۥ۟۟ۦ۠(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨۡ۠;->ۥ۟۟۠ۥ:Ljava/util/List;

    return-void
.end method
