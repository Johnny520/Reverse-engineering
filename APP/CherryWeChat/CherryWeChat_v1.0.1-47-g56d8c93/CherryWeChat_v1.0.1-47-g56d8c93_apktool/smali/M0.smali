.class public final LM0;
.super Ljava/lang/ref/WeakReference;
.source ""


# instance fields
.field public final a:LSm;

.field public final b:Z

.field public c:Lpw;


# direct methods
.method public constructor <init>(LSm;Lmg;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    const-string p3, "Argument must not be null"

    invoke-static {p3, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LM0;->a:LSm;

    iget-boolean p1, p2, Lmg;->a:Z

    const/4 p2, 0x0

    iput-object p2, p0, LM0;->c:Lpw;

    iput-boolean p1, p0, LM0;->b:Z

    return-void
.end method
