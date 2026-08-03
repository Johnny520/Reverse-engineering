.class public LYue/ۥ۟ۡۨۦ$ۥ;
.super LYue/ۥ۠ۨۧۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۡۨۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e8\u06e7\u06e1<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۡۨۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-direct {p0}, LYue/ۥ۠ۨۧۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۡۨۦ;->clear()V

    return-void
.end method

.method public ۥ۟(II)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    iget-object p2, p2, LYue/ۥ۟ۡۨۦ;->ۥ۟۟۠ۤ:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public ۥ۟۟()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    iget v0, v0, LYue/ۥ۟ۡۨۦ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۦ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۦ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object p2, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {p2, p1}, LYue/ۥ۟ۡۨۦ;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟ۢ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۦ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۨۦ;->ۥۣ۟۟۟(I)Ljava/lang/Object;

    return-void
.end method

.method public ۥۣ۟۟۟(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
