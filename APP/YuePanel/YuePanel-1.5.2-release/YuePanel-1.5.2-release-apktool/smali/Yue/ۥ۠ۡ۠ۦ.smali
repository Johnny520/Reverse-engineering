.class public LYue/ۥ۠ۡ۠ۦ;
.super LYue/ۥۢۦۡۡ;
.source "SourceFile"


# instance fields
.field public ۥ:LYue/ۥ۠ۧۧۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۦۡۡ;-><init>()V

    return-void
.end method

.method public static ۥ۟۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method


# virtual methods
.method public ۥ(LYue/ۥۡۥۤۨ;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۡ;
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۢ۠;

    invoke-direct {v0, p1, p2}, LYue/ۥۣ۟ۢ۠;-><init>(LYue/ۥۡۥۤۨ;Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۡ;
    .locals 2

    new-instance v0, LYue/ۥۣ۟ۢ۠;

    const-string v1, ""

    invoke-direct {v0, v1, p1, p2}, LYue/ۥۣ۟ۢ۠;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۡ;
    .locals 7

    new-instance v6, LYue/ۥۣ۟ۢ۠;

    const-string v5, "CDATA"

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۢ۠;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;
    .locals 2

    new-instance v0, LYue/ۥۣ۟ۤۦ;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LYue/ۥۣ۟ۤۦ;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۤۦ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۦ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/String;)LYue/ۥ۟ۥۤۥ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۥۦۣ;

    invoke-direct {v0, p1}, LYue/ۥ۟ۥۦۣ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۨ۟ۨ;
    .locals 1

    new-instance v0, LYue/ۥ۟ۨۡ۠;

    invoke-direct {v0, p1}, LYue/ۥ۟ۨۡ۠;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥ۠۠ۨۧ;
    .locals 1

    new-instance v0, LYue/ۥ۠۠ۨۨ;

    invoke-direct {v0}, LYue/ۥ۠۠ۨۨ;-><init>()V

    return-object v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۡۥۤۨ;Ljava/util/Iterator;)LYue/ۥ۠ۡ;
    .locals 1

    new-instance v0, LYue/ۥ۠ۡ۟;

    invoke-direct {v0, p1}, LYue/ۥ۠ۡ۟;-><init>(LYue/ۥۡۥۤۨ;)V

    :goto_0
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡ۟;->ۥ۟۟ۥۨ(LYue/ۥۣۡۢ۠;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۡ;
    .locals 2

    invoke-static {p1}, LYue/ۥ۠ۡ۠ۦ;->ۥ۟۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LYue/ۥ۠ۡ۟;

    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥ۠ۡ۟;-><init>(LYue/ۥۡۥۤۨ;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)LYue/ۥ۠ۡ;
    .locals 2

    invoke-static {p1}, LYue/ۥ۠ۡ۠ۦ;->ۥ۟۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LYue/ۥ۠ۡ۟;

    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥ۠ۡ۟;-><init>(LYue/ۥۡۥۤۨ;)V

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡ۟;->ۥ۟۟ۥۨ(LYue/ۥۣۡۢ۠;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;LYue/ۥ۠ۡ۟ۡ;)LYue/ۥ۠ۡ۟ۤ;
    .locals 1

    new-instance v0, LYue/ۥ۠ۡ۟ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠ۡ۟ۥ;-><init>(Ljava/lang/String;LYue/ۥ۠ۡ۟ۡ;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۧ(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۤۦ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۦ;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ۠(Z)V

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ۟(Z)V

    return-object v0
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/String;)LYue/ۥۣۡۢ۠;
    .locals 1

    new-instance v0, LYue/ۥۡۢ۠ۤ;

    invoke-direct {v0, p1}, LYue/ۥۡۢ۠ۤ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢ۠;
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, LYue/ۥۡۢ۠ۤ;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۢ۠ۤ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "The prefix of a namespace may not be set to null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۥۡ۠;
    .locals 1

    new-instance v0, LYue/ۥۡۥۡۡ;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۥۡۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۤۥ;
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۤۦ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۦ;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۤۦ;->ۥ۟۟ۦ۠(Z)V

    return-object v0
.end method

.method public ۥ۟۟۠ۡ()LYue/ۥۢ۟ۨۢ;
    .locals 1

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۨ;-><init>()V

    return-object v0
.end method

.method public ۥ۟۟۠ۢ(Ljava/lang/String;)LYue/ۥۢ۟ۨۢ;
    .locals 1

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۨ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۢ۟ۨۢ;
    .locals 1

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۨ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۦ۠(Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/String;Ljava/lang/String;Z)LYue/ۥۢ۟ۨۢ;
    .locals 1

    new-instance v0, LYue/ۥۣۢ۟ۨ;

    invoke-direct {v0}, LYue/ۥۣۢ۟ۨ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۦ۠(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, LYue/ۥۣۢ۟ۨ;->ۥ۟۟ۦ۟(Z)V

    return-object v0
.end method

.method public ۥ۟۟۠ۥ(LYue/ۥۡۥۤۨ;Ljava/util/Iterator;Ljava/util/Iterator;)LYue/ۥۢ۟ۨۤ;
    .locals 1

    new-instance v0, LYue/ۥۢ۟ۨۥ;

    invoke-direct {v0, p1}, LYue/ۥۢ۟ۨۥ;-><init>(LYue/ۥۡۥۤۨ;)V

    :goto_0
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۢ۠ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۥۨ(LYue/ۥ۟ۢ۠ۡ;)V

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ(LYue/ۥۣۡۢ۠;)V

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public ۥ۟۟۠ۦ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LYue/ۥۢ۟ۨۤ;
    .locals 2

    new-instance v0, LYue/ۥۢ۟ۨۥ;

    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۨۥ;-><init>(LYue/ۥۡۥۤۨ;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)LYue/ۥۢ۟ۨۤ;
    .locals 2

    invoke-static {p1}, LYue/ۥ۠ۡ۠ۦ;->ۥ۟۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LYue/ۥۢ۟ۨۥ;

    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۨۥ;-><init>(LYue/ۥۡۥۤۨ;)V

    :goto_0
    if-eqz p4, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۢ۠ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۥۨ(LYue/ۥ۟ۢ۠ۡ;)V

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz p5, :cond_1

    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ(LYue/ۥۣۡۢ۠;)V

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;LYue/ۥۡۢ۠ۥ;)LYue/ۥۢ۟ۨۤ;
    .locals 2

    invoke-static {p1}, LYue/ۥ۠ۡ۠ۦ;->ۥ۟۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LYue/ۥۢ۟ۨۥ;

    new-instance v1, LYue/ۥۡۥۤۨ;

    invoke-direct {v1, p2, p3, p1}, LYue/ۥۡۥۤۨ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۨۥ;-><init>(LYue/ۥۡۥۤۨ;)V

    :goto_0
    if-eqz p4, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۢ۠ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۥۨ(LYue/ۥ۟ۢ۠ۡ;)V

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz p5, :cond_1

    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦ(LYue/ۥۣۡۢ۠;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p6}, LYue/ۥۢ۟ۨۥ;->ۥ۟۟ۦۢ(LYue/ۥۡۢ۠ۥ;)V

    return-object v0
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥ۠ۧۧۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡ۠ۦ;->ۥ:LYue/ۥ۠ۧۧۧ;

    return-void
.end method
