.class public LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨۦۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    iget v2, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v2}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۨۦۨ;I)V

    iput v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠ۨۦۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟()V
    .locals 2

    :goto_0
    iget v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟۟(LYue/ۥ۠ۨۦۨ;)[I

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    aget v0, v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۢ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public final ۥۣ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    return-void
.end method
