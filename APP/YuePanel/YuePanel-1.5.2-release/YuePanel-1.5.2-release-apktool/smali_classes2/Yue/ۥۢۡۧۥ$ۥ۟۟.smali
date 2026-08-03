.class public final enum LYue/ۥۢۡۧۥ$ۥ۟۟;
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
    .locals 2

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥۢۡۧۤ;->ۥۣ۟۟۟(Z)LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۥ:LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۥ()C

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ(C)V

    iget-object v0, p1, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۢ:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۥ()C

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟ۡۤ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ(LYue/ۥۢۡۧۥ;)V

    goto :goto_0

    :cond_0
    const-string p2, "</"

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟۟ۨ(Ljava/lang/String;)V

    sget-object p2, LYue/ۥۢۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥۢۡۧۥ;

    invoke-virtual {p1, p2}, LYue/ۥۢۡۧۤ;->ۥ۟۟ۡ۠(LYue/ۥۢۡۧۥ;)V

    :goto_0
    return-void
.end method
