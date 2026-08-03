.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟ۤۢ;
.super LYue/ۥۢۡۧۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥۢۡۧۥ;-><init>(Ljava/lang/String;ILYue/ۥۢۡۧۥ$ۥ۟۟۟ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۧ(LYue/ۥۢۡۧۤ;LYue/ۥۣ۟ۤۤ;)V
    .locals 3

    const-string v0, "]]>"

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡۢ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۦ()Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    new-instance p2, LYue/ۥۢۡۧ۠$ۥ۟;

    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, LYue/ۥۢۡۧ۠$ۥ۟;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۧ(LYue/ۥۢۡۧ۠;)V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥۣ۟۟۠:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    :cond_1
    return-void
.end method
