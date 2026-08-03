.class public final LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۦۣۢ;->ۥ۟۟ۡۡ(Ljava/util/Comparator;Ljava/util/Comparator;LYue/ۥۣ۠ۡ۟;)Ljava/util/Comparator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TK;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;Ljava/util/Comparator;LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "-TK;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TK;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Ljava/util/Comparator;

    iput-object p2, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/util/Comparator;

    iput-object p3, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/util/Comparator;

    iget-object v1, p0, LYue/ۥ۟ۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v1, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0
.end method
