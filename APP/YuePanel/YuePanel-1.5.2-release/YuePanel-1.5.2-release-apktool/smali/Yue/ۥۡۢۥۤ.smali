.class public LYue/ۥۡۢۥۤ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۥۣ;


# instance fields
.field public final ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final ۥ۟۟۠ۥ:Ljava/lang/String;

.field public final ۥ۟۟۠ۦ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xe

    invoke-direct {p0, v0}, LYue/ۥ۟ۢۥۥ;-><init>(I)V

    iput-object p1, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!NOTATION "

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۢۥۤ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    const/16 v1, 0x22

    if-eqz v0, :cond_0

    const-string v0, " PUBLIC \""

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, " SYSTEM"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, " \""

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۢۥۤ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/io/Writer;->write(I)V

    :cond_2
    const/16 v0, 0x3e

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    return-void
.end method
