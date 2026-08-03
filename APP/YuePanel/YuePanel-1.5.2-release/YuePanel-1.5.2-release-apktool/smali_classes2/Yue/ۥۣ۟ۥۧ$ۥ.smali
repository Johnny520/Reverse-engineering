.class public final LYue/ۥۣ۟ۥۧ$ۥ;
.super LYue/ۥۡۦۧ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "snapshot"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥۡۦۧ۟;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    iput-object p2, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۟(I)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    new-instance p2, LYue/ۥۣ۟ۥۧ$ۥ$ۥ;

    invoke-direct {p2, p1, p0}, LYue/ۥۣ۟ۥۧ$ۥ$ۥ;-><init>(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۧ$ۥ;)V

    invoke-static {p2}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣۣ۟۠;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۨ()J
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_0

    invoke-static {v0, v1, v2}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤۡ(Ljava/lang/String;J)J

    move-result-wide v1

    :cond_0
    return-wide v1
.end method

.method public ۥ۟۟۠()LYue/ۥۡ۠ۥۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

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

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣۣ۟۠;

    return-object v0
.end method

.method public final ۥ۟۟ۢۧ()LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    return-object v0
.end method
