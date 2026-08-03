.class public LYue/ۥ۠ۡ۟ۢ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ۟ۡ;


# instance fields
.field public final ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xf

    invoke-direct {p0, v0}, LYue/ۥ۟ۢۥۥ;-><init>(I)V

    iput-object p1, p0, LYue/ۥ۠ۡ۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥ۠ۡ۟ۢ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/String;

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

.method public ۥۣ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۟ۢ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟ۨ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۤۡ()Ljava/lang/String;
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

    const-string v0, "<!ENTITY "

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۢ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۡ۟ۢ;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "\">"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method
