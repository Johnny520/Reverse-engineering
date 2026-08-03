.class public final LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۢۧ;->ۥۣ۟ۦۦ(Ljava/lang/CharSequence;IIZLYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Integer;",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:I

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/CharSequence;",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/CharSequence;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/CharSequence;",
            "+TR;>;)V"
        }
    .end annotation

    iput p1, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    iput-object p2, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    iput-object p3, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TR;"
        }
    .end annotation

    iget v0, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:I

    add-int/2addr v0, p1

    if-ltz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :cond_1
    iget-object v1, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;

    iget-object v2, p0, LYue/ۥۢ۠ۢۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/CharSequence;

    invoke-interface {v2, p1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {v1, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
