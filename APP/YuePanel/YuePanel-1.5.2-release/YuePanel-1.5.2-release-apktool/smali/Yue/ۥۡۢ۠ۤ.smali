.class public LYue/ۥۡۢ۠ۤ;
.super LYue/ۥۣ۟ۢ۠;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۢ۠;


# instance fields
.field public ۥ۟۟۠ۧ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 3
    const-string v0, "xmlns"

    const-string v1, ""

    invoke-direct {p0, v0, v1, p1}, LYue/ۥۣ۟ۢ۠;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۠ۧ:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "xmlns"

    invoke-direct {p0, v0, p1, p2}, LYue/ۥۣ۟ۢ۠;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۠ۧ:Z

    return-void
.end method


# virtual methods
.method public getPrefix()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-super {p0}, LYue/ۥۣ۟ۢ۠;->ۥ۟۟ۢۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAttribute()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۠ۧ:Z

    const-string v1, "\'"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "xmlns=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "xmlns:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۤ;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LYue/ۥۣ۟ۢ۠;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠()I
    .locals 1

    const/16 v0, 0xd

    return v0
.end method

.method public ۥ۟۟ۡۡ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۤ۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۢ۠ۤ;->ۥ۟۟۠ۧ:Z

    return v0
.end method
