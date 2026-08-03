.class public LYue/ۥ۟ۢۦ۟;
.super LYue/ۥ۠۟ۡۡ;
.source "SourceFile"


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣ۠;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۠۟ۡۡ;-><init>(LYue/ۥۢۥۣ۠;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(LYue/ۥ۟ۨۨۥ;)V
    .locals 1

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    move-object v0, p1

    check-cast v0, LYue/ۥۣۢۦۧ;

    iget-object v0, v0, LYue/ۥۣۢۦۧ;->ۥ۟۟۟ۥ:LYue/ۥ۟ۨۨۥ;

    iget-object p1, p1, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {p1}, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟۠()I

    move-result p1

    iput p1, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    return-void
.end method
