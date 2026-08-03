.class public final LYue/ۥۢۤۥۦ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۤۥۦ;->ۥ۟۟۟۠(Landroid/view/ViewGroup;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۥۦ$ۥ۟۟۟;->ۥ:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۢۢ;

    iget-object v1, p0, LYue/ۥۢۤۥۦ$ۥ۟۟۟;->ۥ:Landroid/view/ViewGroup;

    invoke-static {v1}, LYue/ۥۢۤۥۦ;->ۥ۟۟۟۟(Landroid/view/ViewGroup;)LYue/ۥۡۨۢ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    sget-object v2, LYue/ۥۢۤۥۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۤۥۦ$ۥ۟;

    invoke-direct {v0, v1, v2}, LYue/ۥۢۢۢ;-><init>(Ljava/util/Iterator;LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method
