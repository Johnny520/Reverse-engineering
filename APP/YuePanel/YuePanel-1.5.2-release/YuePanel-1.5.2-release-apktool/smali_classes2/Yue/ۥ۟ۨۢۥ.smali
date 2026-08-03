.class public LYue/ۥ۟ۨۢۥ;
.super LYue/ۥ۠ۧ۟ۥ;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۨۢۥ;->ۥ۟۟ۦ۠()LYue/ۥ۟ۨۢۥ;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۨۢۥ;->ۥ۟۟ۦ۠()LYue/ۥ۟ۨۢۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#data"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۨۢۥ;->ۥ۟۟ۦۡ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    move-result-object p3

    sget-object v0, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    if-ne p3, v0, :cond_2

    const-string p3, "<![CDATA["

    invoke-virtual {p2, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "script"

    invoke-virtual {p0, v0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۨ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p3, "//<![CDATA[\n"

    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "\n//]]>"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    const-string v0, "style"

    invoke-virtual {p0, v0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۨ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p3, "/*<![CDATA[*/\n"

    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "\n/*]]>*/"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "]]>"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۟ۨۢۥ;->ۥ۟۟ۦۡ()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۦ۠()LYue/ۥ۟ۨۢۥ;
    .locals 1

    invoke-super {p0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۨۢۥ;

    return-object v0
.end method

.method public ۥ۟۟ۦۡ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۢ(Ljava/lang/String;)LYue/ۥ۟ۨۢۥ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟ۥۨ(Ljava/lang/String;)V

    return-object p0
.end method
