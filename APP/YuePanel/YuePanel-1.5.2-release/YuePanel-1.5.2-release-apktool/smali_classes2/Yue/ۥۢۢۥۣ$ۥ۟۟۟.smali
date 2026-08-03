.class public final LYue/ۥۢۢۥۣ$ۥ۟۟۟;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢۥۣ;->ۥ۟۟۟([S)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "LYue/\u06e5\u06e2\u06e2\u06e8\u06e4;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:[S


# direct methods
.method public constructor <init>([S)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LYue/ۥۢۢۨۤ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۨۤ;

    invoke-virtual {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟(S)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟(I)S

    move-result p1

    invoke-static {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟(S)LYue/ۥۢۢۨۤ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, LYue/ۥۢۢۨۤ;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۨۤ;

    invoke-virtual {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۟(S)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0}, LYue/ۥۢۢۨۥ;->ۥ۟۟۠۟([S)Z

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, LYue/ۥۢۢۨۤ;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۨۤ;

    invoke-virtual {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۟۟(S)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۧ([S)I

    move-result v0

    return v0
.end method

.method public ۥ۟(S)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0, p1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟۠([SS)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(I)S
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0, p1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۥ([SI)S

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(S)I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0, p1}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۦۨ([SS)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(S)I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟۟۟;->ۥ۟۟۠ۤ:[S

    invoke-static {v0, p1}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۧۦۥ([SS)I

    move-result p1

    return p1
.end method
