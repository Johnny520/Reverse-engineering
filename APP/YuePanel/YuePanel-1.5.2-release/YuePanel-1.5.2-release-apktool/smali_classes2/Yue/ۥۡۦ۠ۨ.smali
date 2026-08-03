.class public final LYue/ۥۡۦ۠ۨ;
.super LYue/ۥۡۦۧ۟;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:J

.field public final ۥ۟۟۠ۧ:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JLYue/ۥۣۣ۟۠;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥۡۦۧ۟;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    iput-wide p2, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۦ:J

    iput-object p4, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۟۠;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۨ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۦ:J

    return-wide v0
.end method

.method public ۥ۟۟۠()LYue/ۥۡ۠ۥۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, LYue/ۥۡ۠ۥۨ;->ۥ۟۟۟۟:LYue/ۥۡ۠ۥۨ$ۥ;

    invoke-virtual {v1, v0}, LYue/ۥۡ۠ۥۨ$ۥ;->ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۡ۠ۥۨ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۨ;->ۥ۟۟۠ۧ:LYue/ۥۣۣ۟۠;

    return-object v0
.end method
