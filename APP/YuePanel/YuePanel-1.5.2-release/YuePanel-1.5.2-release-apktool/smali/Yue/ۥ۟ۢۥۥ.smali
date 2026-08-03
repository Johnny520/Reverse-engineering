.class public abstract LYue/ۥ۟ۢۥۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦ۠ۨ;
.implements LYue/ۥ۠ۧۧۧ;


# instance fields
.field public ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:I

.field public ۥ۟۟۠ۡ:I

.field public ۥ۟۟۠ۢ:I

.field public ۥۣ۟۟۠:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    .line 3
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۠:I

    .line 4
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۡ:I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۢ:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۠:I

    .line 8
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۡ:I

    const/4 v0, 0x0

    .line 9
    iput v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۢ:I

    .line 10
    iput p1, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    return-void
.end method


# virtual methods
.method public isAttribute()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/io/StringWriter;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۡۥ(Ljava/io/Writer;)V
    :try_end_0
    .catch LYue/ۥۢۦۢۢ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "[ERROR: "

    invoke-virtual {v0, v2}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

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

.method public ۥ۟۟۟ۢ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۨ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥ۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    return v0
.end method

.method public ۥ۟۟۠۟()LYue/ۥ۠ۧۧۧ;
    .locals 0

    return-object p0
.end method

.method public ۥ۟۟۠ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۡ:I

    return v0
.end method

.method public ۥ۟۟ۡۡ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۡۥ(Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥۢۦۢۢ;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, LYue/ۥۢۦۢۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۦۢۢ;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۥ۟۟ۢۡ()LYue/ۥۡۥۤۨ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۢۤ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢۨ()LYue/ۥ۠ۡ;
    .locals 1

    move-object v0, p0

    check-cast v0, LYue/ۥ۠ۡ;

    return-object v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۠:I

    return v0
.end method

.method public ۥۣۣ۟۟()LYue/ۥۣ۟ۤۥ;
    .locals 1

    move-object v0, p0

    check-cast v0, LYue/ۥۣ۟ۤۥ;

    return-object v0
.end method

.method public ۥۣ۟۟ۦ()LYue/ۥۢ۟ۨۤ;
    .locals 1

    move-object v0, p0

    check-cast v0, LYue/ۥۢ۟ۨۤ;

    return-object v0
.end method

.method public ۥۣ۟۟ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۢ:I

    return v0
.end method

.method public ۥۣ۟۟ۤ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۤۤ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۤۦ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            LYue/ۥۢۦۢۢ;
        }
    .end annotation
.end method

.method public ۥ۟۟ۤۨ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۥۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۥ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۥ۟()Ljava/lang/String;
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    invoke-static {v0}, LYue/ۥ۠۠ۥۦ;->ۥ۟(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۥ۠()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۥۡ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۢ:I

    return-void
.end method

.method public ۥ۟۟ۥۢ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠ۡ:I

    return-void
.end method

.method public ۥ۟۟ۥۣ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۟:I

    return-void
.end method

.method public ۥ۟۟ۥۤ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۢۥۥ;->ۥ۟۟۠۠:I

    return-void
.end method

.method public ۥ۟۟ۥۥ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢۥۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-void
.end method
