.class public final LYue/ۥۡۥۨۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۥ۟ۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۥۨۧ;->ۥ۟۟۟۟(Landroid/util/Range;)LYue/ۥ۟ۥ۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۥۨۧ$ۥ;->ۥۣ۟۟۠:Landroid/util/Range;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    invoke-static {p0}, LYue/ۥ۟ۥ۟ۡ$ۥ;->ۥ۟(LYue/ۥ۟ۥ۟ۡ;)Z

    move-result v0

    return v0
.end method

.method public ۥ(Ljava/lang/Comparable;)Z
    .locals 0
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۥ۟ۡ$ۥ;->ۥ(LYue/ۥ۟ۥ۟ۡ;Ljava/lang/Comparable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟()Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۥۨۧ$ۥ;->ۥۣ۟۟۠:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۥۨۧ$ۥ;->ۥۣ۟۟۠:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    return-object v0
.end method
