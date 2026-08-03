.class public final LYue/ۥ۠ۨۤ$ۥ۟۟۟;
.super Landroid/util/LruCache;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۨۤ;->ۥ(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;)Landroid/util/LruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<",
        "TK;TV;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣ۠ۢۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TK;TV;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:LYue/ۥۣ۠ۡ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟:LYue/ۥۣ۠ۢۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "Ljava/lang/Boolean;",
            "TK;TV;TV;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TK;-TV;",
            "Ljava/lang/Integer;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TK;+TV;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "-",
            "Ljava/lang/Boolean;",
            "-TK;-TV;-TV;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ:LYue/ۥۣ۠ۢۢ;

    iput-object p3, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    iput-object p4, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۣ۠ۢۥ;

    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZTK;TV;TV;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥۣ۠ۢۥ;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥۣ۠ۢۥ;->ۥ۟۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;->ۥ:LYue/ۥۣ۠ۢۢ;

    invoke-interface {v0, p1, p2}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method
