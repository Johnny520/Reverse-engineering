.class public final LYue/ۥۡۦ۠ۤ$ۥ۟;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "LYue/\u06e5\u06e1\u06e6\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۠ۤ;Ljava/lang/Object;)V
    .locals 1
    .param p1    # LYue/ۥۡۦ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "referent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LYue/ۥۡۦ۠ۤ$ۥ۟;->ۥ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦ۠ۤ$ۥ۟;->ۥ:Ljava/lang/Object;

    return-object v0
.end method
