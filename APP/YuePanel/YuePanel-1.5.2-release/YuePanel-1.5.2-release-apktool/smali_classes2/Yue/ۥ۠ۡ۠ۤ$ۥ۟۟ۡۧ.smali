.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۡۧ;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e1\u06e7"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":matchText"

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 5

    instance-of p1, p2, LYue/ۥۡۥۤ۟;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧۢ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۡ۠ۦ;

    new-instance v1, LYue/ۥۡۥۤ۟;

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۟()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟ۡۧ()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LYue/ۥۣۡۧۥ;->ۥ۟۟۟:LYue/ۥۣۡۧۥ;

    invoke-static {v2, v3, v4}, LYue/ۥۢ۠ۨۡ;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۥ;)LYue/ۥۢ۠ۨۡ;

    move-result-object v2

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۥ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, LYue/ۥۡۥۤ۟;-><init>(LYue/ۥۢ۠ۨۡ;Ljava/lang/String;LYue/ۥ۟ۢ۠ۤ;)V

    invoke-virtual {v0, v1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۤۦ(LYue/ۥۣۡۢۤ;)V

    invoke-virtual {v1, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۥ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠۠ۥۥ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
