.class public LYue/ۥۡۥۡۡ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۥۡ۠;


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۥۡۡ;->ۥ۟۟ۥۦ()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۥۡۡ;->ۥ۟۟ۥۦ()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public getTarget()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<?"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    iget-object v0, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_1
    const-string v0, "?>"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۥۦ()V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۥۧ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟ۥۨ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method
