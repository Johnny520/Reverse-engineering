.class public final Lr/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li0/x;

.field public final synthetic b:Lr/z;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lr/z;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/f;->b:Lr/z;

    .line 5
    .line 6
    iput-boolean p2, p0, Lr/f;->c:Z

    .line 7
    .line 8
    new-instance p2, Lr/e;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p2, p1, v0}, Lr/e;-><init>(Lr/z;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lr/f;->a:Li0/x;

    .line 19
    .line 20
    return-void
.end method
