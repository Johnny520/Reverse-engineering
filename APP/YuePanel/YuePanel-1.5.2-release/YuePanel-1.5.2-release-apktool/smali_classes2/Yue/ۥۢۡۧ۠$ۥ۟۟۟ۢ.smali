.class public final LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;
.super LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۢۢۡۧ;)V
    .locals 1

    sget-object v0, LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;->ۥ۟۟۠ۤ:LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;

    invoke-direct {p0, v0, p1}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;-><init>(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;LYue/ۥۢۢۡۧ;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/>"

    goto :goto_0

    :cond_0
    const-string v0, ">"

    :goto_0
    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠()Z

    move-result v1

    const-string v2, "<"

    if-eqz v1, :cond_1

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۤ;->size()I

    move-result v1

    if-lez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v2}, LYue/ۥ۟ۢ۠ۤ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ()LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۦ()LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;
    .locals 1

    invoke-super {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۦ()LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    return-object p0
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;LYue/ۥ۟ۢ۠ۤ;)LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;
    .locals 0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-static {p1}, LYue/ۥۣۡۧۥ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-object p0
.end method
