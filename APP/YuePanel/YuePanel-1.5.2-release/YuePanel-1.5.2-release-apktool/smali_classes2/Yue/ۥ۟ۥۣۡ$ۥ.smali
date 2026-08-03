.class public final LYue/ۥ۟ۥۣۡ$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۣۡ;->ۥ۟۟ۡ(Ljava/util/List;Ljava/lang/Comparable;IILYue/ۥۣ۠ۡ۟;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "TT;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;TK;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/Comparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;Ljava/lang/Comparable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TK;>;TK;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۣۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    iput-object p2, p0, LYue/ۥ۟ۥۣۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Comparable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۥۣۡ$ۥ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۥۣۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Comparable;

    iget-object v0, p0, LYue/ۥ۟ۥۣۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Comparable;

    invoke-static {p1, v0}, LYue/ۥ۟ۦۣۢ;->ۥ۟۟۟ۦ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
