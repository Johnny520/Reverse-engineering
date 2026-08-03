.class public LYue/ۥۣ۟ۧ$ۥ۟۟۟$ۥ;
.super LYue/ۥ۟۟ۢ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧ$ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e2\u06e0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟ۡ۠:LYue/ۥۣ۟ۧ$ۥ۟۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧ$ۥ۟۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡ۠:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    invoke-direct {p0}, LYue/ۥ۟۟ۢ۠;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۧ()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡ۠:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    iget-object v0, v0, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟ۧ$ۥ;

    if-nez v0, :cond_0

    const-string v0, "Completer object has been garbage collected, future will fail soon"

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tag=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
