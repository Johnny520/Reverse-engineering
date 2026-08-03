.class public final LYue/ۥ۠ۨۦۨ$ۥ۟۟۟۟;
.super LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۣ۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8$\u06e5\u06df\u06df\u06df<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "TK;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e0;"
    }
.end annotation


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

    invoke-direct {p0, p1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;-><init>(LYue/ۥ۠ۨۦۨ;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟ۢ(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
