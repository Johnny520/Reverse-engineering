.class public final LYue/ۥۡۦۥ$ۥ$ۥ۟;
.super LYue/ۥۡۦۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۥ$ۥ;->ۥ(LYue/ۥۣ۟ۥۤ;LYue/ۥۡ۠ۥۨ;)LYue/ۥۡۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟:LYue/ۥۡ۠ۥۨ;

.field public final synthetic ۥ۟۟:LYue/ۥۣ۟ۥۤ;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۥۨ;LYue/ۥۣ۟ۥۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۥ$ۥ$ۥ۟;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    iput-object p2, p0, LYue/ۥۡۦۥ$ۥ$ۥ۟;->ۥ۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-direct {p0}, LYue/ۥۡۦۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()J
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ۟;->ۥ۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public ۥ۟()LYue/ۥۡ۠ۥۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ۟;->ۥ۟:LYue/ۥۡ۠ۥۨ;

    return-object v0
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣۣ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۥ$ۥ$ۥ۟;->ۥ۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-interface {p1, v0}, LYue/ۥۣۣ۟۟;->ۥ۟۟ۦۣ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۣ۟۟;

    return-void
.end method
