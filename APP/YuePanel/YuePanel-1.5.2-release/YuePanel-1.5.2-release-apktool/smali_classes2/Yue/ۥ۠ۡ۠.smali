.class public final LYue/ۥ۠ۡ۠;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۡ۟ۧ;
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.8"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Enum<",
        "TT;>;>",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e1\u06df\u06e7<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:[Ljava/lang/Enum;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Enum;)V
    .locals 1
    .param p1    # [Ljava/lang/Enum;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    return-void
.end method

.method private final ۥ۟۟۟۠()Ljava/lang/Object;
    .locals 2

    new-instance v0, LYue/ۥ۠ۡ۠۟;

    iget-object v1, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    invoke-direct {v0, v1}, LYue/ۥ۠ۡ۠۟;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠;->ۥ۟(Ljava/lang/Enum;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠;->ۥ۟۟(I)Ljava/lang/Enum;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠;->ۥ۟۟۟(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠;->ۥ۟۟۟۟(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    array-length v0, v0

    return v0
.end method

.method public ۥ۟(Ljava/lang/Enum;)Z
    .locals 2
    .param p1    # Ljava/lang/Enum;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v0, v1}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۢۦ([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟(I)Ljava/lang/Enum;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    array-length v1, v1

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget-object v0, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/lang/Enum;)I
    .locals 2
    .param p1    # Ljava/lang/Enum;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۠ۡ۠;->ۥ۟۟۠ۤ:[Ljava/lang/Enum;

    invoke-static {v1, v0}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۢۦ([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Enum;

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Enum;)I
    .locals 1
    .param p1    # Ljava/lang/Enum;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡ۠;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
