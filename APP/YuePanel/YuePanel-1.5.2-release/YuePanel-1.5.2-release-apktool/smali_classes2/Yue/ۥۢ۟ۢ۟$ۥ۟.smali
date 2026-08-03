.class public final LYue/ۥۢ۟ۢ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۟ۢ۟;->ۥ۟۟(LYue/ۥۡۨۢ;IIZZ)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "Ljava/util/List<",
        "+TT;>;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۨۢ;

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:I

.field public final synthetic ۥ۟۟۟:Z

.field public final synthetic ۥ۟۟۟۟:Z


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;IIZZ)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ:LYue/ۥۡۨۢ;

    iput p2, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟:I

    iput p3, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟:I

    iput-boolean p4, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟۟:Z

    iput-boolean p5, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟۟۟:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/List<",
            "+TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ:LYue/ۥۡۨۢ;

    invoke-interface {v0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟:I

    iget v2, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟:I

    iget-boolean v3, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟۟:Z

    iget-boolean v4, p0, LYue/ۥۢ۟ۢ۟$ۥ۟;->ۥ۟۟۟۟:Z

    invoke-static {v0, v1, v2, v3, v4}, LYue/ۥۢ۟ۢ۟;->ۥ۟(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
