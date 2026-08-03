.class public LYue/ۥ۟ۥۦۣ;
.super LYue/ۥۣ۟ۤۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۥۤۥ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۣ۟ۤۦ;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۟ۥۦۣ;->ۥ۟۟ۥۨ()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥۣ۟ۤۦ;-><init>()V

    .line 3
    invoke-virtual {p0}, LYue/ۥ۟ۥۦۣ;->ۥ۟۟ۥۨ()V

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getText()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->getData()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!--"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۟ۥۦۣ;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    const-string v0, "-->"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۥۨ()V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method
