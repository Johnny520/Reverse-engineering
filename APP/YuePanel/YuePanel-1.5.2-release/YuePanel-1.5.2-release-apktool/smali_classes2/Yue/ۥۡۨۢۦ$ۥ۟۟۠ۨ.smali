.class public final LYue/ۥۡۨۢۦ$ۥ۟۟۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۢۦ;->ۥ۟۠ۦ۟(LYue/ۥۡۨۢ;Ljava/util/Comparator;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۨۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "Ljava/util/Comparator<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۨۢ;

    iput-object p2, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۨۢ;

    invoke-static {v0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۧۧ(LYue/ۥۡۨۢ;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۠ۨ;->ۥ۟:Ljava/util/Comparator;

    invoke-static {v0, v1}, LYue/ۥ۟ۥۡۧ;->ۥ۟۟ۤۤ(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
