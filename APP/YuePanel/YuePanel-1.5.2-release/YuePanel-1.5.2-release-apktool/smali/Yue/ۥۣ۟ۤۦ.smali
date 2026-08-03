.class public LYue/ۥۣ۟ۤۦ;
.super LYue/ۥ۟ۢۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۤۥ;


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/String;

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    .line 3
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۦ:Z

    .line 4
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۧ:Z

    .line 5
    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۥۨ()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    .line 8
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۦ:Z

    .line 9
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۧ:Z

    .line 10
    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۥۨ()V

    .line 11
    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 12
    invoke-direct {p0}, LYue/ۥ۟ۢۥۥ;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    .line 14
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۦ:Z

    .line 15
    iput-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۧ:Z

    .line 16
    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۥۨ()V

    .line 17
    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ(Ljava/lang/String;)V

    .line 18
    iput-boolean p2, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۦ:Z

    return v0
.end method

.method public ۥ۟۟۠ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public ۥ۟۟ۤۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۧ:Z

    return v0
.end method

.method public ۥ۟۟ۤۧ(Ljava/io/Writer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    const-string v0, "<![CDATA["

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "]]>"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۤۦ;->getData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_7

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x3e

    const/16 v5, 0x3c

    const/16 v6, 0x26

    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_1

    if-eq v7, v5, :cond_1

    if-eq v7, v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    if-lez v3, :cond_3

    invoke-virtual {p1, v0, v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    :cond_3
    :goto_1
    if-ge v3, v1, :cond_7

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_5

    if-eq v2, v4, :cond_4

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    goto :goto_2

    :cond_4
    const-string v2, "&gt;"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const-string v2, "&lt;"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    const-string v2, "&amp;"

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    :goto_3
    return-void
.end method

.method public ۥ۟۟ۥۦ()[C
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۥۧ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۥۨ()V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۥۥ;->ۥ۟۟ۥۣ(I)V

    return-void
.end method

.method public ۥ۟۟ۦ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method

.method public ۥ۟۟ۦ۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public ۥ۟۟ۦ۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟ۤۦ;->ۥ۟۟۠ۦ:Z

    return-void
.end method
