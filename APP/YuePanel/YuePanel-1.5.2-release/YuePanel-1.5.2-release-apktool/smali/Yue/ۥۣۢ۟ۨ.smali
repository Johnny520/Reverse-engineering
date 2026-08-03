.class public LYue/ۥۣۢ۟ۨ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢ۟ۨۢ;


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Ljava/lang/String;

.field public ۥ۟۟۠ۦ:Ljava/lang/String;

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Ljava/lang/String;

.field public ۥ۟۟ۡ:Z

.field public ۥ۟۟ۡ۟:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    const-string v0, "UTF-8"

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    const-string v1, "1.0"

    iput-object v1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ:Z

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۥۧ()V

    return-void
.end method


# virtual methods
.method public getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    return v0
.end method

.method public ۥۣ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    return v0
.end method

.method public ۥ۟۟۠ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ:Z

    return v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<?xml version=\""

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "\" encoding=\'"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    iget-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    if-eqz v0, :cond_1

    const-string v0, " standalone=\'"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    const-string v0, "yes\'"

    goto :goto_0

    :cond_0
    const-string v0, "no\'"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_1
    const-string v0, "?>"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۥۦ()V
    .locals 1

    const-string v0, "UTF-8"

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    const-string v0, "1.0"

    iput-object v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ:Z

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    return-void
.end method

.method public ۥ۟۟ۥۧ()V
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۥۨ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ:Z

    return-void
.end method

.method public ۥ۟۟ۦ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    if-nez p1, :cond_0

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    return-void

    :cond_0
    const-string v1, "yes"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۦ۟(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۡ۟:Z

    iput-boolean p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public ۥ۟۟ۦ۠(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢ۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-void
.end method
