.class public final LYue/ۥ۟ۥۣۤ$ۥ;
.super LYue/ۥ۟ۥۣۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۥۣۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e0\u06e1\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, LYue/ۥ۟ۥۣۤ;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method public varargs constructor <init>([LYue/ۥ۠ۡ۠ۤ;)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥ۟ۥۣۤ$ۥ;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۥۣۤ;->ۥ:Ljava/util/ArrayList;

    const-string v1, ""

    invoke-static {v0, v1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۥ(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LYue/ۥ۟ۥۣۤ;->ۥ۟۟:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LYue/ۥ۟ۥۣۤ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v2, p1, p2}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
