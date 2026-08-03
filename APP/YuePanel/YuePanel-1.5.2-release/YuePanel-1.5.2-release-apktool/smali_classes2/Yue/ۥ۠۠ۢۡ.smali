.class public final LYue/ۥ۠۠ۢۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;
.implements LYue/ۥ۠۠ۢۢ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e0\u06e2\u06e2<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۨۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:I


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;I)V
    .locals 1
    .param p1    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;I)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۢۡ;->ۥ:LYue/ۥۡۨۢ;

    iput p2, p0, LYue/ۥ۠۠ۢۡ;->ۥ۟:I

    if-ltz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "count must be non-negative, but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۠۠ۢۡ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۠۠ۢۡ;->ۥ۟:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۠۠ۢۡ;)LYue/ۥۡۨۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠۠ۢۡ;->ۥ:LYue/ۥۡۨۢ;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠۠ۢۡ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠۠ۢۡ$ۥ;-><init>(LYue/ۥ۠۠ۢۡ;)V

    return-object v0
.end method

.method public ۥ(I)LYue/ۥۡۨۢ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۠۠ۢۡ;->ۥ۟:I

    add-int v1, v0, p1

    if-gez v1, :cond_0

    new-instance v0, LYue/ۥۢ۠ۨۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢ۠ۨۢ;-><init>(LYue/ۥۡۨۢ;I)V

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣۢ۠ۦ;

    iget-object v2, p0, LYue/ۥ۠۠ۢۡ;->ۥ:LYue/ۥۡۨۢ;

    invoke-direct {p1, v2, v0, v1}, LYue/ۥۣۢ۠ۦ;-><init>(LYue/ۥۡۨۢ;II)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public ۥ۟(I)LYue/ۥۡۨۢ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    iget v0, p0, LYue/ۥ۠۠ۢۡ;->ۥ۟:I

    add-int/2addr v0, p1

    if-gez v0, :cond_0

    new-instance v0, LYue/ۥ۠۠ۢۡ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠۠ۢۡ;-><init>(LYue/ۥۡۨۢ;I)V

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥ۠۠ۢۡ;

    iget-object v1, p0, LYue/ۥ۠۠ۢۡ;->ۥ:LYue/ۥۡۨۢ;

    invoke-direct {p1, v1, v0}, LYue/ۥ۠۠ۢۡ;-><init>(LYue/ۥۡۨۢ;I)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method
