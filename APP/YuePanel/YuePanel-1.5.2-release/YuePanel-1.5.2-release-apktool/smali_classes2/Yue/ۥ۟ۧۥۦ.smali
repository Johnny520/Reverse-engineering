.class public abstract LYue/ۥ۟ۧۥۦ;
.super LYue/ۥۣ۠۠ۡ;
.source "SourceFile"


# direct methods
.method public constructor <init>(LYue/ۥۣۣۡۢ;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۣ۠۠ۡ;-><init>(LYue/ۥۣۣۡۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۤ()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۡ;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۧۦ;

    const-string v1, "Control frame can\'t have rsv3==true set"

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, LYue/ۥ۠ۥۧۦ;

    const-string v1, "Control frame can\'t have rsv2==true set"

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, LYue/ۥ۠ۥۧۦ;

    const-string v1, "Control frame can\'t have rsv1==true set"

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, LYue/ۥ۠ۥۧۦ;

    const-string v1, "Control frame can\'t have fin==false set"

    invoke-direct {v0, v1}, LYue/ۥ۠ۥۧۦ;-><init>(Ljava/lang/String;)V

    throw v0
.end method
