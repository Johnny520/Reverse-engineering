.class public LYue/ۥۣ۟ۨۢ;
.super LYue/ۥ۟ۨۡۡ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۨۡۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥۣ۟ۨۢ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, LYue/ۥ۟ۨۡۡ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۡۡ;->ۥ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "SYSTEM \""

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨۡۡ;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
