.class public LYue/ۥ۟ۡۨۡ$ۥ;
.super LYue/ۥ۠ۨۧۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۡۨۡ;->ۥ۟۟۟()LYue/ۥ۠ۨۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e8\u06e7\u06e1<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۡۨۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-direct {p0}, LYue/ۥ۠ۨۧۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->clear()V

    return-void
.end method

.method public ۥ۟(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    iget-object v0, v0, LYue/ۥۢ۟ۡ;->mArray:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public ۥ۟۟()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    return-object v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    iget v0, v0, LYue/ۥۢ۟ۡ;->mSize:I

    return v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->indexOfKey(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->indexOfValue(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۥ۟۟۟ۢ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->removeAt(I)Ljava/lang/Object;

    return-void
.end method

.method public ۥۣ۟۟۟(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ$ۥ;->ۥ۟۟۟:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۟ۡ;->setValueAt(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
