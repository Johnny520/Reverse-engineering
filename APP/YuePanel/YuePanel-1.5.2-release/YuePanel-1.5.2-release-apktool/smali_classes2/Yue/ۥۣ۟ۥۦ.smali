.class public LYue/ۥۣ۟ۥۦ;
.super LYue/ۥۢۡ۠ۦ;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۢۡ۠ۦ;-><init>(Ljava/lang/String;)V

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

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۦ;->ۥ۟۟ۧ۟()LYue/ۥۣ۟ۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۦ;->ۥ۟۟ۧ۟()LYue/ۥۣ۟ۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#cdata"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "<![CDATA["

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "]]>"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public bridge synthetic ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۦ;->ۥ۟۟ۧ۟()LYue/ۥۣ۟ۥۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۧ()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۢ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۧ۟()LYue/ۥۣ۟ۥۦ;
    .locals 1

    invoke-super {p0}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦ۠()LYue/ۥۢۡ۠ۦ;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟ۥۦ;

    return-object v0
.end method
