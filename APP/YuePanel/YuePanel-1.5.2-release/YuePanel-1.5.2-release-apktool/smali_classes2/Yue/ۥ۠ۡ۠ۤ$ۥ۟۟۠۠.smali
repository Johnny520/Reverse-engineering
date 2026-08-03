.class public abstract LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06e0\u06e0"
.end annotation


# instance fields
.field public final ۥ:I

.field public final ۥ۟:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    .line 2
    iput p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ:I

    .line 3
    iput p2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, ":%s(%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, ":%s(%dn)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, ":%s(%dn%+d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 4

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥ۟۠ۤۤ()LYue/ۥ۠۠ۥۥ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    instance-of v0, v0, LYue/ۥ۠۟ۧۥ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)I

    move-result p1

    iget p2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ:I

    const/4 v0, 0x1

    if-nez p2, :cond_2

    iget p2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    if-ne p1, p2, :cond_1

    move v1, v0

    :cond_1
    return v1

    :cond_2
    iget v2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟۠۠;->ۥ۟:I

    sub-int v3, p1, v2

    mul-int/2addr v3, p2

    if-ltz v3, :cond_3

    sub-int/2addr p1, v2

    rem-int/2addr p1, p2

    if-nez p1, :cond_3

    move v1, v0

    :cond_3
    :goto_0
    return v1
.end method

.method public abstract ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)I
.end method

.method public abstract ۥ۟۟۟ۢ()Ljava/lang/String;
.end method
