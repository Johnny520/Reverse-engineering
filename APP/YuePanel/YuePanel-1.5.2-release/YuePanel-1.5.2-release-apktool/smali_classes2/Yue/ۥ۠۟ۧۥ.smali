.class public LYue/ۥ۠۟ۧۥ;
.super LYue/ۥ۠۠ۥۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۟ۧۥ$ۥ;,
        LYue/ۥ۠۟ۧۥ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۢ:LYue/ۥ۠ۡ۠ۤ;


# instance fields
.field public ۥۣ۟۟ۡ:LYue/ۥ۟ۦۧۤ;

.field public ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

.field public ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

.field public ۥ۟۟ۡۦ:LYue/ۥ۠۟ۧۥ$ۥ۟;

.field public final ۥ۟۟ۡۧ:Ljava/lang/String;

.field public ۥ۟۟ۡۨ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ;

    const-string v1, "title"

    invoke-direct {v0, v1}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۢ:LYue/ۥ۠ۡ۠ۤ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 7
    const-string v0, "http://www.w3.org/1999/xhtml"

    invoke-direct {p0, v0, p1}, LYue/ۥ۠۟ۧۥ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "#root"

    sget-object v1, LYue/ۥۣۡۧۥ;->ۥ۟۟:LYue/ۥۣۡۧۥ;

    invoke-static {v0, p1, v1}, LYue/ۥۢ۠ۨۡ;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۥ;)LYue/ۥۢ۠ۨۡ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LYue/ۥ۠۠ۥۥ;-><init>(LYue/ۥۢ۠ۨۡ;Ljava/lang/String;)V

    .line 2
    new-instance p1, LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-direct {p1}, LYue/ۥ۠۟ۧۥ$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    .line 3
    sget-object p1, LYue/ۥ۠۟ۧۥ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ۟;

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۦ:LYue/ۥ۠۟ۧۥ$ۥ۟;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۨ:Z

    .line 5
    iput-object p2, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۧ:Ljava/lang/String;

    .line 6
    invoke-static {}, LYue/ۥۣۡۧۦ;->ۥ۟۟۟()LYue/ۥۣۡۧۦ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

    return-void
.end method

.method public static ۥ۟۠ۨۦ(Ljava/lang/String;)LYue/ۥ۠۟ۧۥ;
    .locals 2

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    new-instance v0, LYue/ۥ۠۟ۧۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠۟ۧۥ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۥ()LYue/ۥۣۡۧۦ;

    move-result-object p0

    iput-object p0, v0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

    const-string p0, "html"

    invoke-virtual {v0, p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object p0

    const-string v1, "head"

    invoke-virtual {p0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    const-string v1, "body"

    invoke-virtual {p0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۢ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۢ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#document"

    return-object v0
.end method

.method public ۥۣ۟۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۢۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۥ۠()LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۨ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۨۤ()LYue/ۥ۠۠ۥۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۢ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۠ۦۣ()LYue/ۥ۠۠ۥۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۨ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۠ۧ۠(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۠(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    return-object p0
.end method

.method public ۥ۟۠ۨ۟()LYue/ۥ۠۠ۥۥ;
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۠()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object v1

    :goto_0
    const-string v2, "body"

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "frameset"

    invoke-virtual {v1, v2}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1

    :cond_2
    invoke-virtual {v0, v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟۟()Ljava/nio/charset/Charset;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۠ۨۡ(Ljava/nio/charset/Charset;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۠۠(Z)V

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟(Ljava/nio/charset/Charset;)LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨۨ()V

    return-void
.end method

.method public ۥ۟۠ۨۢ()LYue/ۥ۠۟ۧۥ;
    .locals 2

    invoke-super {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۨۤ()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    check-cast v0, LYue/ۥ۠۟ۧۥ;

    iget-object v1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟۠()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    return-object v0
.end method

.method public ۥۣ۟۠ۨ()LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥۣ۟۟ۡ:LYue/ۥ۟ۦۧۤ;

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥ۠ۦ۠ۡ;->ۥ۟۟۟۠()LYue/ۥ۟ۦۧۤ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public ۥ۟۠ۨۤ(LYue/ۥ۟ۦۧۤ;)LYue/ۥ۠۟ۧۥ;
    .locals 0

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥۣ۟۟ۡ:LYue/ۥ۟ۦۧۤ;

    return-object p0
.end method

.method public ۥ۟۠ۨۥ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;
    .locals 3

    new-instance v0, LYue/ۥ۠۠ۥۥ;

    iget-object v1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

    invoke-virtual {v1}, LYue/ۥۣۡۧۦ;->ۥ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LYue/ۥۣۡۧۥ;->ۥ۟۟۟:LYue/ۥۣۡۧۥ;

    invoke-static {p1, v1, v2}, LYue/ۥۢ۠ۨۡ;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/String;LYue/ۥۣۡۧۥ;)LYue/ۥۢ۠ۨۡ;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LYue/ۥ۠۠ۥۥ;-><init>(LYue/ۥۢ۠ۨۡ;Ljava/lang/String;)V

    return-object v0
.end method

.method public ۥ۟۠ۨۧ()LYue/ۥ۠۟ۧۧ;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۡۢۤ;

    instance-of v2, v1, LYue/ۥ۠۟ۧۧ;

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥ۠۟ۧۧ;

    return-object v1

    :cond_1
    instance-of v1, v1, LYue/ۥ۠ۧ۟ۥ;

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۥ۟۠ۨۨ()V
    .locals 7

    iget-boolean v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۨ:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    if-ne v0, v1, :cond_1

    const-string v0, "meta[charset]"

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ۠(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    const-string v1, "charset"

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۧۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    const-string v2, "meta"

    invoke-virtual {v0, v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۧۢ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    :goto_0
    const-string v0, "meta[name=charset]"

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ(Ljava/lang/String;)LYue/ۥ۠۠ۥۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۧ;->ۥ۟۟ۢۨ()LYue/ۥ۠۠ۥۧ;

    goto :goto_1

    :cond_1
    sget-object v1, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۢۤ;

    instance-of v2, v0, LYue/ۥۢۦۣ;

    const-string v3, "1.0"

    const-string v4, "encoding"

    const-string v5, "xml"

    const-string v6, "version"

    if-eqz v2, :cond_3

    check-cast v0, LYue/ۥۢۦۣ;

    invoke-virtual {v0}, LYue/ۥۢۦۣ;->ۥ۟۟ۦۣ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {v0, v6}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۡۨ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v6, v3}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    goto :goto_1

    :cond_2
    new-instance v0, LYue/ۥۢۦۣ;

    invoke-direct {v0, v5, v1}, LYue/ۥۢۦۣ;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v6, v3}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۧ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠۠ۥۥ;

    goto :goto_1

    :cond_3
    new-instance v0, LYue/ۥۢۦۣ;

    invoke-direct {v0, v5, v1}, LYue/ۥۢۦۣ;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v6, v3}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟۠ۨ۠()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۧ(LYue/ۥۣۡۢۤ;)LYue/ۥ۠۠ۥۥ;

    :cond_4
    :goto_1
    return-void
.end method

.method public ۥ۟ۡ(Ljava/lang/String;)LYue/ۥ۠ۢۦۥ;
    .locals 3

    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ(Ljava/lang/String;)LYue/ۥ۠۠ۥۧ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠۠ۥۥ;

    instance-of v2, v1, LYue/ۥ۠ۢۦۥ;

    if-eqz v2, :cond_0

    check-cast v1, LYue/ۥ۠ۢۦۥ;

    return-object v1

    :cond_1
    const-string v0, "No form elements matched the query \'%s\' in the document."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟۟(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟ۡ۟()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e2\u06e6\u06e5;",
            ">;"
        }
    .end annotation

    const-string v0, "form"

    invoke-virtual {p0, v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ(Ljava/lang/String;)LYue/ۥ۠۠ۥۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۧ;->ۥ۟۟۠ۤ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟ۡ۟۟()LYue/ۥ۠۠ۥۥ;
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۠()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object v1

    :goto_0
    const-string v2, "head"

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۥ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟ۡ۟۠()LYue/ۥ۠۠ۥۥ;
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠۟ۨ()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    :goto_0
    const-string v1, "html"

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤ۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟ۡ۟ۡ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۧ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟ۡ۟ۢ()LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    return-object v0
.end method

.method public ۥۣ۟ۡ۟(LYue/ۥ۠۟ۧۥ$ۥ;)LYue/ۥ۠۟ۧۥ;
    .locals 0

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    return-object p0
.end method

.method public ۥ۟ۡ۟ۤ(LYue/ۥۣۡۧۦ;)LYue/ۥ۠۟ۧۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

    return-object p0
.end method

.method public ۥ۟ۡ۟ۥ()LYue/ۥۣۡۧۦ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۥ:LYue/ۥۣۡۧۦ;

    return-object v0
.end method

.method public ۥ۟ۡ۟ۦ()LYue/ۥ۠۟ۧۥ$ۥ۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۦ:LYue/ۥ۠۟ۧۥ$ۥ۟;

    return-object v0
.end method

.method public ۥ۟ۡ۟ۧ(LYue/ۥ۠۟ۧۥ$ۥ۟;)LYue/ۥ۠۟ۧۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۦ:LYue/ۥ۠۟ۧۥ$ۥ۟;

    return-object p0
.end method

.method public ۥ۟ۡ۟ۨ()LYue/ۥ۠۟ۧۥ;
    .locals 3

    new-instance v0, LYue/ۥ۠۟ۧۥ;

    invoke-virtual {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦۧ()LYue/ۥۢ۠ۨۡ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟ۡۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYue/ۥ۠۟ۧۥ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۟ۧ()LYue/ۥ۟ۢ۠ۤ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    :cond_0
    iget-object v1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-virtual {v1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟۠()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object v1

    iput-object v1, v0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۤ:LYue/ۥ۠۟ۧۥ$ۥ;

    return-object v0
.end method

.method public ۥ۟ۡ۠()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۢ:LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ۟(LYue/ۥ۠ۡ۠ۤ;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public ۥ۟ۡ۠۟(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۢ:LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۦ۟(LYue/ۥ۠ۡ۠ۤ;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ;->ۥ۟ۡ۟۟()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦۧ(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۧ۠(Ljava/lang/String;)LYue/ۥ۠۠ۥۥ;

    return-void
.end method

.method public ۥ۟ۡ۠۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۨ:Z

    return-void
.end method

.method public ۥ۟ۡ۠ۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۟ۧۥ;->ۥ۟۟ۡۨ:Z

    return v0
.end method
