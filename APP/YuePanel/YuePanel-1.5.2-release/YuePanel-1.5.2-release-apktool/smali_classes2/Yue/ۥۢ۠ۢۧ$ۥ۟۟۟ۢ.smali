.class public final LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۢ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۢۧ;->ۥۣ۟ۧ(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/util/Iterator<",
        "+",
        "Ljava/lang/Character;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۢ;->ۥ۟۟()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/CharSequence;

    invoke-static {v0}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡ۟ۦ(Ljava/lang/CharSequence;)LYue/ۥۣ۟ۤ;

    move-result-object v0

    return-object v0
.end method
