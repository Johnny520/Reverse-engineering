.class public abstract LYue/ۥ۟۟ۡۧ;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements LYue/ۥ۠ۦۣۡ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e1;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract add(ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۡۧ;->ۥ۟(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract set(ILjava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۧ;->ۥ()I

    move-result v0

    return v0
.end method

.method public abstract ۥ()I
.end method

.method public abstract ۥ۟(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation
.end method
