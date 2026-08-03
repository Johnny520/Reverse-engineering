.class public LYue/ۥ۠۟ۡۡ;
.super LYue/ۥ۟ۨۨۥ;
.source "SourceFile"


# instance fields
.field public ۥ۟۟۟ۧ:I


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣ۠;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۟ۨۨۥ;-><init>(LYue/ۥۢۥۣ۠;)V

    instance-of p1, p1, LYue/ۥ۠ۤۦۧ;

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥ۟ۨۨۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۨۨۥ$ۥ;

    iput-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    goto :goto_0

    :cond_0
    sget-object p1, LYue/ۥ۟ۨۨۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۨۨۥ$ۥ;

    iput-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    :goto_0
    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(I)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    iput p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟ۨۨ;

    invoke-interface {v0, v0}, LYue/ۥۣ۟ۨۨ;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    goto :goto_0

    :cond_1
    return-void
.end method
